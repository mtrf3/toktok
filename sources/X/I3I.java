package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.duetmode.impl.DuetDiscoverServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I3I extends WT3 {
    public final String LJLIL = "discover_fragment";
    public FragmentManager LJLILLLLZI;
    public final /* synthetic */ I3F LJLJI;

    @Override // X.WT3
    public final boolean LLJJI() {
        return true;
    }

    @Override // X.WT3
    public final String getTag() {
        return "RecordDuetMode";
    }

    public final FragmentManager LLJJIJIIJIL() {
        FragmentManager fragmentManager = this.LJLILLLLZI;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        o.LJIJI("fragmentManager");
        throw null;
    }

    @Override // X.WT3
    public final void show() {
        ShortVideoContextViewModel shortVideoContextViewModel = this.LJLJI.LJLLL;
        if (shortVideoContextViewModel != null) {
            String LJI = shortVideoContextViewModel.LJLIL.LJI();
            o.LJIIIIZZ(LJI, "shortVideoContextViewMod…rtVideoContext.creationId");
            Fragment LJJJIL = LLJJIJIIJIL().LJJJIL(this.LJLIL);
            if (LJJJIL == null) {
                AmeBaseFragment LIZJ = DuetDiscoverServiceImpl.LIZLLL().LIZJ(LJI);
                if (LIZJ != null) {
                    C1B3 c1b3 = new C1B3(LLJJIJIIJIL());
                    c1b3.LJIIJ(LIZJ, this.LJLIL, R.id.cav);
                    c1b3.LJIILJJIL();
                    return;
                }
                return;
            }
            if (!LJJJIL.isHidden()) {
                return;
            }
            C1B3 c1b32 = new C1B3(LLJJIJIIJIL());
            c1b32.LJIIL(LJJJIL);
            c1b32.LJIILJJIL();
            return;
        }
        o.LJIJI("shortVideoContextViewModel");
        throw null;
    }

    @Override // X.WT3
    public final void hide() {
        Fragment LJJJIL = LLJJIJIIJIL().LJJJIL(this.LJLIL);
        if (LJJJIL != null && LJJJIL.isVisible()) {
            C1B3 c1b3 = new C1B3(LLJJIJIIJIL());
            c1b3.LJIIIZ(LJJJIL);
            c1b3.LJIILJJIL();
        }
    }

    @Override // X.WM7
    public final void onDestroy() {
        super.onDestroy();
        C45850Hz4 c45850Hz4 = this.LJLJI.LJLLLL;
        if (c45850Hz4 != null) {
            c45850Hz4.LIZLLL().mIsPhotoMvModeMusic = false;
        } else {
            o.LJIJI("tabEnv");
            throw null;
        }
    }

    @Override // X.WT3
    public final I0E LLJJIJI() {
        return I0E.RECORD_DUET_MODE;
    }

    public I3I(I3F i3f) {
        this.LJLJI = i3f;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentManager supportFragmentManager = SceneExtensionsKt.LIZLLL(this).getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "requireFragmentActivity().supportFragmentManager");
        this.LJLILLLLZI = supportFragmentManager;
    }

    @Override // X.WT3, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.anm, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
        View findViewById = viewGroup2.findViewById(R.id.jbm);
        if (o.LJ(DuetDiscoverServiceImpl.LIZLLL().LIZIZ(), "full_screen")) {
            View findViewById2 = findViewById.findViewById(R.id.l_2);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
        } else {
            int LJFF = C81184Vtc.LJFF(this.mActivity);
            findViewById.setPadding(0, LJFF, 0, LJFF);
            View backButton = findViewById.findViewById(R.id.ldq);
            o.LJIIIIZZ(backButton, "backButton");
            C146035oF.LIZJ(backButton, new AqS157S0100000_7(this.LJLJI, 701));
        }
        return viewGroup2;
    }
}
