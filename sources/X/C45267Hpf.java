package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.ArrayList;

/* renamed from: X.Hpf, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45267Hpf implements InterfaceC45535Htz {
    public final /* synthetic */ MvChoosePhotoScene LIZ;

    @Override // X.InterfaceC45535Htz
    public final void LIZ() {
        Workspace workspace;
        CreativeModel creativeModel;
        MusicBuzModel musicBuzModel;
        ShortVideoContext shortVideoContext = this.LIZ.LLJLLIL;
        if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null && (musicBuzModel = creativeModel.musicBuzModel) != null) {
            MusicBeanUtilKt.updateAVMusic(musicBuzModel, null);
        }
        ShortVideoContext shortVideoContext2 = this.LIZ.LLJLLIL;
        if (shortVideoContext2 != null && (workspace = shortVideoContext2.cameraComponentModel.mWorkspace) != null) {
            workspace.v();
        }
    }

    public C45267Hpf(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LIZ = mvChoosePhotoScene;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0096, code lost:
    
        if (r1 != null) goto L42;
     */
    @Override // X.InterfaceC45535Htz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.util.ArrayList<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel> r27) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45267Hpf.LIZIZ(java.util.ArrayList):void");
    }

    @Override // X.InterfaceC45535Htz
    public final void LIZJ(boolean z, ArrayList<MyMediaModel> arrayList) {
        if (z) {
            this.LIZ.LLJILJIL.clear();
            if (arrayList != null) {
                this.LIZ.LLJILJIL.addAll(arrayList);
            }
            if (this.LIZ.LLZLL.length() == 0) {
                MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
                ShortVideoContext shortVideoContext = mvChoosePhotoScene.LLJLLIL;
                if (shortVideoContext != null) {
                    shortVideoContext.albumPreviewNextMethod = "normal";
                }
                mvChoosePhotoScene.LLZLL = "normal";
            }
            this.LIZ.LLLZZ();
            C45087Hml.LIZJ();
        }
    }
}
