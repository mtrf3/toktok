package X;

import Y.IDCListenerS156S0100000_2;
import Y.IDCListenerS46S0200000_2;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewScene;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6FT, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6FT implements InterfaceC29911Fj {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ BaseScreenAdaptScene LJLILLLLZI;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.LJLIL) {
            case 0:
                VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) this.LJLILLLLZI;
                videoEditContainerScene.getClass();
                C62905OmT c62905OmT = new C62905OmT(videoEditContainerScene.mActivity);
                C6FS LLLIILIL = videoEditContainerScene.LLLIILIL();
                if (LLLIILIL == null) {
                    return;
                }
                c62905OmT.LIZ(R.string.bzf);
                c62905OmT.LJIIIZ(new IDCListenerS46S0200000_2(LLLIILIL, videoEditContainerScene, 0), videoEditContainerScene.getString(R.string.cg_), false);
                c62905OmT.LJIIL(new IDCListenerS156S0100000_2(LLLIILIL, 6), videoEditContainerScene.getString(R.string.hp2), false);
                new C62906OmU(c62905OmT).LIZLLL();
                return;
            default:
                VideoRecordNewScene videoRecordNewScene = (VideoRecordNewScene) this.LJLILLLLZI;
                videoRecordNewScene.getClass();
                if (((Boolean) obj).booleanValue()) {
                    videoRecordNewScene.LLLLL(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ C6FT(BaseScreenAdaptScene baseScreenAdaptScene, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = baseScreenAdaptScene;
    }
}
