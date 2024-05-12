package X;

import android.app.Dialog;
import android.view.View;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.InfoStickerViewModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS173S0100000_7;

/* loaded from: classes8.dex */
public final /* synthetic */ class G7C implements C66G, G69 {
    public final /* synthetic */ Object LIZ;

    public /* synthetic */ G7C(Object obj) {
        this.LIZ = obj;
    }

    @Override // X.G69
    public final boolean LIZ(View view) {
        String str;
        VideoPublishContainerScene videoPublishContainerScene = (VideoPublishContainerScene) this.LIZ;
        if (((C40990G6w) videoPublishContainerScene.LLILLJJLI.LIZ).LIZ.getSaveUploadType() == 1) {
            ((C40990G6w) videoPublishContainerScene.LLILLJJLI.LIZ).LIZ.LJI(false);
        } else if (!H7R.LJJJJL(videoPublishContainerScene.LLILZLL)) {
            C40991G6x c40991G6x = new C40991G6x(videoPublishContainerScene);
            C44423Hc3 currentUser = C44172HVg.LJIJ.getCurrentUser();
            if (currentUser != null) {
                str = currentUser.getUid();
            } else {
                str = "";
            }
            G7D g7d = new G7D();
            ActivityC45651qj LLII = videoPublishContainerScene.LLII();
            if (LLII != null) {
                C26227ARb c26227ARb = new C26227ARb(LLII);
                c26227ARb.LIZIZ(LLII.getString(R.string.tmi));
                UC0.LIZJ(c26227ARb, new AqS173S0100000_7(g7d, 310));
                c26227ARb.LJII = false;
                Dialog LJ = c26227ARb.LJI().LJ();
                if (LJ != null) {
                    g7d.LIZ = new G7E(LJ, c40991G6x, str);
                    C16880lQ.LIZ(LJ);
                }
            }
        } else {
            G6F g6f = videoPublishContainerScene.LLILLJJLI;
            if (g6f != null) {
                ((C40990G6w) g6f.LIZ).LIZ.LJI(true);
            }
        }
        return false;
    }

    @Override // X.C66G
    public final void LIZJ(C153075zb c153075zb) {
        C66Y c66y = (C66Y) this.LIZ;
        InfoStickerViewModel infoStickerViewModel = c66y.LJZL;
        if (infoStickerViewModel != null) {
            infoStickerViewModel.LJLJJI.setValue(Boolean.TRUE);
        }
        if (SceneExtensionsKt.LIZ(c66y.LJLILLLLZI)) {
            return;
        }
        c66y.LJIIJ(true, c153075zb, false);
    }
}
