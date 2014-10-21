package org.traccar.protocol;

import org.traccar.helper.TestDataManager;
import org.jboss.netty.buffer.ChannelBuffers;
import static org.traccar.helper.DecoderVerifier.verify;
import org.junit.Test;
import org.traccar.helper.ChannelBufferTools;

public class RuptelaProtocolDecoderTest {

    @Test
    public void testDecode() throws Exception {

        RuptelaProtocolDecoder decoder = new RuptelaProtocolDecoder(new TestDataManager(), null, null);

        int[] buf1 = {0x00,0x79,0x00,0x00,0x0b,0x1a,0x2a,0x55,0x85,0xc3,0x01,0x00,0x02,0x4e,0x9c,0x03,0x69,0x00,0x00,0x0f,0x10,0x17,0x33,0x20,0x8f,0xf4,0x5e,0x07,0xb3,0x1b,0x57,0x0a,0x00,0x10,0x09,0x09,0x06,0x05,0x01,0x1b,0x1a,0x02,0x00,0x03,0x00,0x1c,0x01,0xad,0x01,0x02,0x1d,0x33,0x8e,0x16,0x00,0x00,0x02,0x96,0x00,0x00,0x60,0x1a,0x41,0x01,0x4b,0xc1,0x6d,0x00,0x4e,0x9c,0x03,0x84,0x00,0x00,0x0f,0x10,0x4f,0xdf,0x20,0x90,0x0d,0x20,0x07,0x51,0x03,0xb0,0x0a,0x00,0x13                ,0x08,0x09,0x06,0x05,0x01,0x1b,0x1a,0x02,0x00,0x03,0x00,0x1c,0x01,0xad,0x01,0x02,0x1d,0x33,0xb1,0x16,0x00,0x00,0x02,0x96,0x00,0x00,0x60,0x1a,0x41,0x01,0x4b,0xc1,0xea,0x00,0x28,0xf9};
        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(buf1))));
        
        int[] buf2 = {0x00,0x92,0x00,0x00,0x0c,0x07,0xa6,0xba,0xcd,0x47,0x01,0x00,0x05,0x52,0xdb,0x5c,0xc2,0x00,0x00,0x18,0x7b,0x8b,0x25,0x1a,0xce,0x47,0x8e,0x08,0x7c,0x04,0x4c,0x0a,0x00,0x00,0x09,0x07,0x00,0x00,0x00,0x00,0x52,0xdb,0x5c,0xfe,0x00,0x00,0x18,0x7b,0x8a,0xb0,0x1a,0xce,0x47,0x19,0x08,0x79,0x04,0x4c,0x09,0x00,0x00,0x0b,0x07,0x00,0x00,0x00,0x00,0x52,0xdb,0x5d,0x3a,0x00,0x00,0x18,0x7b,0x8b,0x25,0x1a,0xce,0x47,0x4b,0x08,0x9d,0x04,0x4c,0x09,0x00,0x00,0x09,0x07,0x00,0x00,0x00,0x00,0x52,0xdb,0x5d,0x76,0x00,0x00,0x18,0x7b,0x8b,0x9a,0x1a,0xce,0x47,0x5c,0x08,0xcd,0x04,0x4c,0x08,0x00,0x00,0x09,0x07,0x00,0x00,0x00,0x00,0x52,0xdb,0x5d,0xb2,0x00,0x00,0x18,0x7b,0x8b,0x14,0x1a,0xce,0x46,0xe7,0x08,0xb3,0x04,0x4c,0x08,0x00,0x00,0x09,0x07,0x00,0x00,0x00,0x00,0x41,0xcb};
        verify(decoder.decode(null, null, ChannelBuffers.wrappedBuffer(ChannelBufferTools.convertArray(buf2))));
        
    }

}
