package X;

import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.List;

/* renamed from: X.HtA, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45484HtA {
    public final /* synthetic */ MvChoosePhotoScene LIZ;

    public C45484HtA(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LIZ = mvChoosePhotoScene;
    }

    public final void LIZ(boolean z) {
        int size;
        C45499HtP c45499HtP;
        List<MyMediaModel> LJI;
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        if (!mvChoosePhotoScene.o) {
            return;
        }
        InterfaceC45480Ht6 interfaceC45480Ht6 = mvChoosePhotoScene.LLLLIILLL;
        if (interfaceC45480Ht6 != null && (LJI = interfaceC45480Ht6.LJI()) != null) {
            size = LJI.size();
        } else {
            size = this.LIZ.LLJILJIL.size();
        }
        if (z && size == 0 && HRV.LIZJ()) {
            RelativeLayout relativeLayout = this.LIZ.LLIL;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            if (this.LIZ.o && C45810HyQ.LIZ() && this.LIZ.LJLL.LIZ.getBoolean("select_multiple", true) && (c45499HtP = this.LIZ.LLIIIZ) != null) {
                c45499HtP.LLJLIL(true);
                return;
            }
            return;
        }
        RelativeLayout relativeLayout2 = this.LIZ.LLIL;
        if (relativeLayout2 == null) {
            return;
        }
        relativeLayout2.setVisibility(8);
    }
}
