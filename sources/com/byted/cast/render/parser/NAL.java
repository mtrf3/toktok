package com.byted.cast.render.parser;

import com.byted.cast.mediacommon.render.parameters.CodecId;

/* loaded from: classes29.dex */
public class NAL {
    public byte[] buf;
    public long frameIndex;
    public int length;
    public int type;
    public CodecId vCodecId;

    public static int detectNALType(NAL nal) {
        int i;
        CodecId codecId;
        CodecId codecId2 = nal.vCodecId;
        CodecId codecId3 = CodecId.H264;
        if (codecId2 == codecId3) {
            i = nal.buf[4] & 31;
        } else {
            i = (nal.buf[4] >> 1) & 63;
        }
        if ((codecId2 == codecId3 && i == 7) || (codecId2 == (codecId = CodecId.H265) && i == 32)) {
            nal.type = 7;
        } else if ((codecId2 == codecId3 && i == 5) || (codecId2 == codecId && i == 19)) {
            nal.type = 5;
        } else if ((codecId2 == codecId3 && i == 6) || (codecId2 == codecId && i == 39)) {
            nal.type = 6;
        } else {
            nal.type = 1;
        }
        return nal.type;
    }

    public NAL(byte[] bArr, int i, CodecId codecId) {
        this.buf = bArr;
        this.length = i;
        this.vCodecId = codecId;
    }
}
