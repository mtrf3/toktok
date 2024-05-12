package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.IAe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46172IAe implements IAE {
    public final InterfaceC82086WJm LIZ;
    public final ShortVideoContext LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        if (r0.enableMic() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r8.LIZIZ.cameraComponentModel.isMuted == false) goto L6;
     */
    @Override // X.IAE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            X.IAf r4 = new X.IAf
            X.WJm r0 = r8.LIZ
            r4.<init>(r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r8.LIZIZ
            boolean r7 = X.V16.LJJLIIIJILLIZJL(r0)
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r8.LIZIZ
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.MicDataModel r0 = r0.micDataModel
            boolean r6 = r0.recordOriginalSoundWithBGM
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            boolean r5 = X.C78605Ut7.LJFF(r0)
            boolean r3 = X.C46125I8j.LIZIZ()
            r2 = 1
            r1 = 0
            if (r7 == 0) goto Lab
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r8.LIZIZ
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r0.cameraComponentModel
            boolean r0 = r0.isMuted
            if (r0 != 0) goto Ld0
        L2b:
            if (r5 != 0) goto La9
            if (r3 == 0) goto La9
        L2f:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r8.LIZIZ
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            com.ss.android.ugc.aweme.creative.model.AudioAlgorithmModel r0 = r0.audioAlgorithmModel
            r0.isMicEnabled = r1
            X.WJm r0 = r8.LIZ
            X.Wrs r0 = r0.e8()
            r0.enableAudio(r1)
            if (r1 == 0) goto L77
            java.lang.String r0 = "AudioCaptureControlStrategy initAudio() called"
            X.H7B.LIZ(r0)
            boolean r0 = X.C44832Hie.LIZ()
            if (r0 == 0) goto L58
            java.lang.Object r0 = r4.LIZ
            X.WJm r0 = (X.InterfaceC82086WJm) r0
            X.Wrv r0 = r0.Bc()
            r0.LIZJ()
        L58:
            java.lang.Object r0 = r4.LIZ
            X.WJm r0 = (X.InterfaceC82086WJm) r0
            X.Wrv r3 = r0.Bc()
            X.WtY r2 = X.C83728WtY.LIZIZ
            X.WtZ r1 = X.EnumC83729WtZ.AUDIO_START_RECORD_INIT
            r0 = 0
            X.UxG r2 = r2.LIZIZ(r1, r0)
            r3.getClass()
            X.IAg r1 = new X.IAg
            r1.<init>(r0)
            java.lang.String r0 = "action_name_start_audio_capture"
            X.C83627Wrv.LIZIZ(r3, r0, r2, r1)
        L76:
            return
        L77:
            java.lang.String r0 = "AudioCaptureControlStrategy releaseAudio() called"
            X.H7B.LIZ(r0)
            java.lang.Object r0 = r4.LIZ
            X.WJm r0 = (X.InterfaceC82086WJm) r0
            X.Wrv r1 = r0.Bc()
            X.WtY r3 = X.C83728WtY.LIZIZ
            X.Wta r0 = X.EnumC83730Wta.STOP_AUDIO_BEFORE_CAPTURE_STOP_CAPTURE
            X.6Le r2 = X.EnumC158826Le.USER_OPERATION
            X.UxG r0 = r3.LIZJ(r0, r2)
            r1.LJFF(r0)
            boolean r0 = X.C44832Hie.LIZ()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r4.LIZ
            X.WJm r0 = (X.InterfaceC82086WJm) r0
            X.Wrv r1 = r0.Bc()
            X.Wta r0 = X.EnumC83730Wta.STOP_AUDIO_BEFORE_CAPTURE
            X.UxG r0 = r3.LIZJ(r0, r2)
            r1.LIZLLL(r0)
            goto L76
        La9:
            r1 = r2
            goto L2f
        Lab:
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r8.LIZIZ
            boolean r0 = r0.LJJIJIL()
            if (r0 == 0) goto Lbf
            if (r6 != 0) goto Lbf
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r0 = r8.LIZIZ
            com.ss.android.ugc.aweme.shortvideo.CameraComponentModel r0 = r0.cameraComponentModel
            boolean r0 = r0.LJIIIZ()
            if (r0 == 0) goto Ld0
        Lbf:
            X.I28 r0 = com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LJLJLJ
            r0.getClass()
            com.ss.android.ugc.aweme.shortvideo.sticker.AudioGraph r0 = com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler.LJLJJI
            if (r0 == 0) goto L2b
            boolean r0 = r0.enableMic()
            if (r0 == 0) goto Ld0
            goto L2b
        Ld0:
            r2 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46172IAe.run():void");
    }

    public C46172IAe(InterfaceC82086WJm cameraApiComponent, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(cameraApiComponent, "cameraApiComponent");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LIZ = cameraApiComponent;
        this.LIZIZ = shortVideoContext;
    }
}
