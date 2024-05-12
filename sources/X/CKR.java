package X;

import Y.ARunnableS0S1102000_5;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.ttlivestreamer.livestreamv2.ILiveStream;
import defpackage.i0;

/* loaded from: classes6.dex */
public final class CKR implements ILiveStream.ILiveStreamInfoListener {
    public int LJLIL = -1;
    public final /* synthetic */ CKO LJLILLLLZI;

    public CKR(CKO cko) {
        this.LJLILLLLZI = cko;
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamInfoListener
    public final void onInfo(int i, int i2, int i3) {
        String LJFF;
        CKO cko = this.LJLILLLLZI;
        cko.LJIIL.post(new CKQ(i, cko, i2, i3, this));
        CKO cko2 = this.LJLILLLLZI;
        InterfaceC15340iw interfaceC15340iw = cko2.LIZ.LJIJJ;
        cko2.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("INFO (");
        LIZ.append(i);
        LIZ.append(',');
        LIZ.append(i2);
        LIZ.append(',');
        LIZ.append(i3);
        LIZ.append(") ");
        String LIZIZ = X1D.LIZIZ(LIZ);
        switch (i) {
            case 1:
                LJFF = i0.LJFF(LIZIZ, "starting_publish");
                break;
            case 2:
                LJFF = i0.LJFF(LIZIZ, "started_publish");
                break;
            case 3:
                LJFF = i0.LJFF(LIZIZ, "stoped_publish");
                break;
            case 4:
                LJFF = i0.LJFF(LIZIZ, "video_starting_capture");
                break;
            case 5:
                LJFF = i0.LJFF(LIZIZ, "video_started_capture");
                break;
            case 6:
                LJFF = i0.LJFF(LIZIZ, "video_stoped_capture");
                break;
            case 7:
                LJFF = i0.LJFF(LIZIZ, "audio_starting_capture");
                break;
            case 8:
                LJFF = i0.LJFF(LIZIZ, "audio_started_capture");
                break;
            case 9:
                LJFF = i0.LJFF(LIZIZ, "audio_stoped_capture");
                break;
            case 10:
                LJFF = i0.LJFF(LIZIZ, "rtmp_connecting");
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                LJFF = i0.LJFF(LIZIZ, "rtmp_connected");
                break;
            case 12:
                LJFF = i0.LJFF(LIZIZ, "rtmp_connect_fail");
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                LJFF = i0.LJFF(LIZIZ, "network too weak");
                break;
            case 14:
                LJFF = i0.LJFF(LIZIZ, "rtmp_disconnected");
                break;
            case 15:
                LJFF = i0.LJFF(LIZIZ, "rtmp_reconnecting");
                break;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                LJFF = i0.LJFF(LIZIZ, "video_encoder_format_changed");
                break;
            default:
                LJFF = i0.LJFF(LIZIZ, "UNKONW???");
                break;
        }
        interfaceC15340iw.i(LJFF);
        ILiveStream.ILiveStreamInfoListener iLiveStreamInfoListener = this.LJLILLLLZI.LIZLLL;
        if (iLiveStreamInfoListener != null) {
            iLiveStreamInfoListener.onInfo(i, i2, i3);
        }
    }

    @Override // com.ss.ttlivestreamer.livestreamv2.ILiveStream.ILiveStreamInfoListener
    public final void onInfo(int i, int i2, String str) {
        CKO cko = this.LJLILLLLZI;
        cko.LJIIL.post(new ARunnableS0S1102000_5(i, i2, str, cko, 0));
    }
}
