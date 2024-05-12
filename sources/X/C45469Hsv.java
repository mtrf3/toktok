package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hsv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45469Hsv implements InterfaceC45637Hvd {
    public final /* synthetic */ MvChoosePhotoScene LIZ;
    public final /* synthetic */ MyMediaModel LIZIZ;
    public final /* synthetic */ MyMediaModel LIZJ;

    @Override // X.InterfaceC45637Hvd
    public final int LIZ() {
        return 3;
    }

    @Override // X.InterfaceC45637Hvd
    public final boolean LIZIZ() {
        List<MyMediaModel> LJI;
        C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        int i = mvChoosePhotoScene.LJLLJ;
        boolean z = mvChoosePhotoScene.LLZLLIL;
        c43117Gw5.getClass();
        if (C43117Gw5.LJ(i, z)) {
            InterfaceC45480Ht6 interfaceC45480Ht6 = this.LIZ.LLLLIILLL;
            if (interfaceC45480Ht6 != null && (LJI = interfaceC45480Ht6.LJI()) != null && (!LJI.isEmpty())) {
                if (LJI.size() >= this.LIZ.LLILZIL) {
                    return true;
                }
            }
        } else {
            MvChoosePhotoScene mvChoosePhotoScene2 = this.LIZ;
            if (mvChoosePhotoScene2.LLLJL >= mvChoosePhotoScene2.LLILZIL) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC45637Hvd
    public final int LIZJ() {
        ArrayList<MyMediaModel> LJIIJ;
        if (this.LIZ.LLLLZLLIL() || this.LIZ.LLLLZLLLI() || this.LIZ.LLLLLLJ()) {
            InterfaceC45480Ht6 interfaceC45480Ht6 = this.LIZ.LLLLIILLL;
            if (interfaceC45480Ht6 != null && (LJIIJ = interfaceC45480Ht6.LJIIJ()) != null) {
                return LJIIJ.indexOf(this.LIZJ);
            }
            return 0;
        }
        return this.LIZIZ.selectIndex - 1;
    }

    @Override // X.InterfaceC45637Hvd
    public final boolean LIZLLL() {
        return this.LIZ.LLZIL.LIZIZ;
    }

    @Override // X.InterfaceC45637Hvd
    public final int LJ() {
        return this.LIZ.LLILZ;
    }

    @Override // X.InterfaceC45637Hvd
    public final List<MyMediaModel> LJI() {
        List<MyMediaModel> LJI;
        InterfaceC45480Ht6 interfaceC45480Ht6 = this.LIZ.LLLLIILLL;
        if (interfaceC45480Ht6 == null || (LJI = interfaceC45480Ht6.LJI()) == null) {
            return C61878OQg.INSTANCE;
        }
        return LJI;
    }

    @Override // X.InterfaceC45637Hvd
    public final void LJII() {
        String LIZIZ;
        if (this.LIZ.LLLLLLL() || this.LIZ.LLLLZLL()) {
            String string = this.LIZ.getString(R.string.e8n);
            o.LJIIIIZZ(string, "getString(R.string.creation_upload_limit)");
            LIZIZ = Q8U.LIZIZ(new Object[]{Integer.valueOf(this.LIZ.LLILZIL)}, 1, string, "format(format, *args)");
            C5S1 c5s1 = new C5S1(this.LIZ.requireSceneContext());
            c5s1.LIZLLL(LIZIZ);
            c5s1.LJ();
        } else if (this.LIZ.LLLLZLLIL()) {
            String string2 = this.LIZ.getString(R.string.rh6);
            o.LJIIIIZZ(string2, "getString(R.string.soundsync_toast)");
            LIZIZ = Q8U.LIZIZ(new Object[]{Integer.valueOf(this.LIZ.LLILZIL)}, 1, string2, "format(format, *args)");
        } else {
            LIZIZ = "";
        }
        C5S1 c5s12 = new C5S1(this.LIZ.requireSceneContext());
        c5s12.LIZLLL(LIZIZ);
        c5s12.LJ();
    }

    @Override // X.InterfaceC45637Hvd
    public final boolean LJIIIZ() {
        if (!this.LIZ.LLLLLLL() && !this.LIZ.LLLLZLLIL() && !this.LIZ.LLLLLLJ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC45637Hvd
    public final View LJFF(MyMediaModel myMediaModel) {
        if (this.LIZ.LLLLZLLIL() || this.LIZ.LLLLZLLLI() || this.LIZ.LLLLLLJ()) {
            int i = 0;
            if (myMediaModel != null) {
                InterfaceC45480Ht6 interfaceC45480Ht6 = this.LIZ.LLLLIILLL;
                if (interfaceC45480Ht6 == null) {
                    return null;
                }
                ArrayList<MyMediaModel> LJIIIZ = interfaceC45480Ht6.LJIIIZ();
                if (LJIIIZ != null) {
                    i = LJIIIZ.indexOf(myMediaModel);
                }
                return interfaceC45480Ht6.LJIILJJIL(i);
            }
            InterfaceC45480Ht6 interfaceC45480Ht62 = this.LIZ.LLLLIILLL;
            if (interfaceC45480Ht62 == null) {
                return null;
            }
            ArrayList<MyMediaModel> LJIIIZ2 = interfaceC45480Ht62.LJIIIZ();
            if (LJIIIZ2 != null) {
                i = LJIIIZ2.indexOf(this.LIZJ);
            }
            return interfaceC45480Ht62.LJIILJJIL(i);
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        InterfaceC45480Ht6 interfaceC45480Ht63 = mvChoosePhotoScene.LLLLIILLL;
        if (interfaceC45480Ht63 == null) {
            return null;
        }
        return interfaceC45480Ht63.LJIILJJIL(mvChoosePhotoScene.LLLLIIIILLL);
    }

    @Override // X.InterfaceC45637Hvd
    public final boolean LJIIIIZZ(MyMediaModel myMediaModel) {
        Context requireSceneContext = this.LIZ.requireSceneContext();
        o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
        if (C6KC.LIZJ(requireSceneContext, C44694HgQ.LJIIL(this.LIZIZ), "video_upload", false, 24)) {
            return false;
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        InterfaceC45496HtM interfaceC45496HtM = mvChoosePhotoScene.LLLLLILLIL;
        if (interfaceC45496HtM != null) {
            return interfaceC45496HtM.LIZLLL(mvChoosePhotoScene.getApplicationContext(), this.LIZ.LLLLIILLL, this.LIZIZ);
        }
        return true;
    }

    public C45469Hsv(MvChoosePhotoScene mvChoosePhotoScene, MyMediaModel myMediaModel, MyMediaModel myMediaModel2) {
        this.LIZ = mvChoosePhotoScene;
        this.LIZIZ = myMediaModel;
        this.LIZJ = myMediaModel2;
    }
}
