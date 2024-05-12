package com.byted.cast.sdk.render.video;

import com.byted.cast.sdk.RTCSetting;

/* loaded from: classes29.dex */
public class NAL {
    public byte[] buf;
    public long frameIndex;
    public int length;
    public int type;
    public RTCSetting.VCODEC_ID vCodecId;

    public static int detectNALType(NAL nal) {
        int i;
        RTCSetting.VCODEC_ID vcodec_id;
        RTCSetting.VCODEC_ID vcodec_id2 = nal.vCodecId;
        RTCSetting.VCODEC_ID vcodec_id3 = RTCSetting.VCODEC_ID.H264;
        if (vcodec_id2 == vcodec_id3) {
            i = nal.buf[4] & 31;
        } else {
            i = (nal.buf[4] >> 1) & 63;
        }
        if ((vcodec_id2 == vcodec_id3 && i == 7) || (vcodec_id2 == (vcodec_id = RTCSetting.VCODEC_ID.H265) && i == 32)) {
            nal.type = 7;
        } else if ((vcodec_id2 == vcodec_id3 && i == 5) || (vcodec_id2 == vcodec_id && i == 19)) {
            nal.type = 5;
        } else if ((vcodec_id2 == vcodec_id3 && i == 6) || (vcodec_id2 == vcodec_id && i == 39)) {
            nal.type = 6;
        } else {
            nal.type = 1;
        }
        return nal.type;
    }

    public NAL(byte[] bArr, int i, RTCSetting.VCODEC_ID vcodec_id) {
        this.buf = bArr;
        this.length = i;
        this.vCodecId = vcodec_id;
    }
}
