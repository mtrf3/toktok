package X;

import com.ss.android.ugc.aweme.services.audio.OnSpeechToSongPrepareListener;
import com.ss.android.ugc.aweme.services.audio.StsAssetModel;
import com.ss.android.ugc.aweme.services.audio.StsResponseModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XZB implements OnSpeechToSongPrepareListener {
    public final String LIZ;
    public final /* synthetic */ VerticalMusicView LIZIZ;

    public XZB(VerticalMusicView verticalMusicView) {
        this.LIZIZ = verticalMusicView;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C86V.LJFF(R.string.pc7));
        LIZ.append("... ");
        this.LIZ = X1D.LIZIZ(LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.audio.OnSpeechToSongPrepareListener
    public final void onStart(String taskId, boolean z) {
        o.LJIIIZ(taskId, "taskId");
        if (z) {
            MusicModel musicModel = this.LIZIZ.LLIZLLLIL.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZ);
            LIZ.append("0%");
            musicModel.setName(X1D.LIZIZ(LIZ));
            this.LIZIZ.LLIZLLLIL.LJIIL.setMusicStatus(12);
        }
        XZG xzg = this.LIZIZ.LLIZLLLIL;
        xzg.getClass();
        xzg.LJIIJJI = taskId;
        this.LIZIZ.LJJIJL();
        XZC xzc = this.LIZIZ.LLJILJILJ;
        if (xzc != null) {
            xzc.LJZ(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0019, code lost:
    
        if (r1 == true) goto L6;
     */
    @Override // com.ss.android.ugc.aweme.services.audio.OnSpeechToSongPrepareListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onFailed(java.lang.String r5, com.ss.android.ugc.aweme.services.audio.StsError r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "taskId"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "error"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView r3 = r4.LIZIZ
            X.XZG r0 = r3.LLIZLLLIL
            com.ss.android.ugc.aweme.services.audio.StsAssetModel r2 = r0.LJIILIIL
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r3.LLJJI
            if (r0 == 0) goto L3b
            boolean r1 = r0.isSpeechToSong()
            r0 = 1
            if (r1 != r0) goto L3b
        L1b:
            r3.LJJIJIIJI(r2, r0)
            com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView r0 = r4.LIZIZ
            X.XZI r2 = r0.LJLILLLLZI
            X.XZE r0 = r0.LJLJI
            if (r0 == 0) goto L3d
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "thisView.context"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            int r0 = r6.getErrorCode()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.U9(r1, r0)
            return
        L3b:
            r0 = 0
            goto L1b
        L3d:
            java.lang.String r0 = "thisView"
            kotlin.jvm.internal.o.LJIJI(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XZB.onFailed(java.lang.String, com.ss.android.ugc.aweme.services.audio.StsError, boolean):void");
    }

    @Override // com.ss.android.ugc.aweme.services.audio.OnSpeechToSongPrepareListener
    public final void onPreparing(String taskId, int i, boolean z) {
        o.LJIIIZ(taskId, "taskId");
        if (this.LIZIZ.LLIZLLLIL.LJIIL.getMusicStatus() == 12) {
            MusicModel musicModel = this.LIZIZ.LLIZLLLIL.LJIIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(this.LIZ);
            LIZ.append(i);
            LIZ.append('%');
            musicModel.setName(X1D.LIZIZ(LIZ));
            XZC xzc = this.LIZIZ.LLJILJILJ;
            if (xzc != null) {
                xzc.notifyItemChanged(0, C47261Igj.LJJIJ(0));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.audio.OnSpeechToSongPrepareListener
    public final void onSuccess(String taskId, StsResponseModel responseModel, boolean z) {
        o.LJIIIZ(taskId, "taskId");
        o.LJIIIZ(responseModel, "responseModel");
        StsAssetModel stsAssetModel = (StsAssetModel) ORZ.LJLLLL(responseModel.getResults());
        if (stsAssetModel != null) {
            this.LIZIZ.LJJIJIIJI(stsAssetModel, true);
        }
    }
}
