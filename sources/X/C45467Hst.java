package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Hst, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45467Hst implements InterfaceC45637Hvd {
    public final /* synthetic */ MvChoosePhotoScene LIZ;
    public final /* synthetic */ InterfaceC65784Pro<MyMediaModel> LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<Integer> LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LIZLLL;

    @Override // X.InterfaceC45637Hvd
    public final int LIZ() {
        return this.LIZJ.invoke().intValue();
    }

    @Override // X.InterfaceC45637Hvd
    public final boolean LIZIZ() {
        return this.LIZLLL.invoke().booleanValue();
    }

    @Override // X.InterfaceC45637Hvd
    public final int LIZJ() {
        return this.LIZIZ.invoke().mediaIndex;
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
        if (!this.LIZ.LLLLLLL() && !this.LIZ.LLLLZLLIL() && !this.LIZ.LLLLZLLLI() && !this.LIZ.LLLLLLJ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC45637Hvd
    public final View LJFF(MyMediaModel myMediaModel) {
        C0A2 layoutManager;
        C0A2 layoutManager2;
        WMH wmh;
        TM0 tm0 = this.LIZ.LLIIII;
        boolean z = false;
        if (tm0 != null && (wmh = (WMH) tm0.mParentScene) != null && wmh.isShowing(tm0)) {
            z = true;
        }
        if (z) {
            MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
            TM0 tm02 = mvChoosePhotoScene.LLIIII;
            if (tm02 == null) {
                return null;
            }
            int i = mvChoosePhotoScene.LLLLII;
            C45800HyG c45800HyG = tm02.LLFII;
            if (c45800HyG == null || (layoutManager2 = c45800HyG.LJLJJI.LJIIL().getLayoutManager()) == null) {
                return null;
            }
            return layoutManager2.LJJIJIL(i);
        }
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LIZ;
        ViewPager viewPager = mvChoosePhotoScene2.LLILLL;
        if (viewPager == null) {
            return null;
        }
        AbstractC45488HtE LLLFF = mvChoosePhotoScene2.LLLFF(viewPager.getCurrentItem());
        o.LJII(LLLFF, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AVMediaChooseBaseFragment");
        int i2 = this.LIZ.LLLLII;
        RecyclerView recyclerView = LLLFF.LJLJJI;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return null;
        }
        return layoutManager.LJJIJIL(i2);
    }

    @Override // X.InterfaceC45637Hvd
    public final boolean LJIIIIZZ(MyMediaModel myMediaModel) {
        if (!C6KD.LIZ()) {
            Context requireSceneContext = this.LIZ.requireSceneContext();
            o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
            if (C6KC.LIZJ(requireSceneContext, C44694HgQ.LJIIL(myMediaModel), "video_upload", false, 24)) {
                return false;
            }
        }
        MvChoosePhotoScene mvChoosePhotoScene = this.LIZ;
        InterfaceC45496HtM interfaceC45496HtM = mvChoosePhotoScene.LLLLLILLIL;
        if (interfaceC45496HtM != null) {
            return interfaceC45496HtM.LIZLLL(mvChoosePhotoScene.getApplicationContext(), this.LIZ.LLLLIILLL, myMediaModel);
        }
        return true;
    }

    public C45467Hst(MvChoosePhotoScene mvChoosePhotoScene, InterfaceC65784Pro<MyMediaModel> interfaceC65784Pro, InterfaceC65784Pro<Integer> interfaceC65784Pro2, InterfaceC65784Pro<Boolean> interfaceC65784Pro3) {
        this.LIZ = mvChoosePhotoScene;
        this.LIZIZ = interfaceC65784Pro;
        this.LIZJ = interfaceC65784Pro2;
        this.LIZLLL = interfaceC65784Pro3;
    }
}
