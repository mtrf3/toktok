package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.library.LibraryMaterialInfo;
import com.ss.android.ugc.aweme.library.viewmodel.LibraryVideosViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* renamed from: X.MFu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56510MFu extends AbstractC225718tT {
    public static final C56511MFv Companion = new C56511MFv();
    public LibraryMaterialInfo LJLIL;
    public WeakReference<ActivityC45651qj> LJLILLLLZI;
    public Aweme LJLJI;

    @Override // X.AbstractC225718tT, X.MGV
    public boolean sendCustomRequest(C51031K1b<? extends AbstractC51036K1g<?, ?>> c51031K1b, int i) {
        return false;
    }

    public final WeakReference<ActivityC45651qj> getActivity() {
        return this.LJLILLLLZI;
    }

    public final LibraryMaterialInfo getLibraryMaterialInfo() {
        return this.LJLIL;
    }

    public final Aweme getToJumpAweme() {
        return this.LJLJI;
    }

    public C56510MFu(LibraryMaterialInfo libraryMaterialInfo) {
        this.LJLIL = libraryMaterialInfo;
    }

    @Override // X.AbstractC225718tT, X.MGV
    public void onJumpToDetail(String aid) {
        o.LJIIIZ(aid, "aid");
        super.onJumpToDetail(aid);
    }

    public final void setActivity(WeakReference<ActivityC45651qj> weakReference) {
        this.LJLILLLLZI = weakReference;
    }

    public final void setLibraryMaterialInfo(LibraryMaterialInfo libraryMaterialInfo) {
        this.LJLIL = libraryMaterialInfo;
    }

    public final void setToJumpAweme(Aweme aweme) {
        this.LJLJI = aweme;
    }

    @Override // X.AbstractC225718tT
    public int getDetailAwemeViewType(int i, Aweme aweme) {
        if (aweme != null && aweme.getNewLiveRoomData() != null) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC225718tT, X.MGV
    public MGX getJumpToVideoParam(MGX param, Aweme aweme) {
        o.LJIIIZ(param, "param");
        o.LJIIIZ(aweme, "aweme");
        this.LJLJI = aweme;
        param.LIZ = "library_detail_page";
        param.LIZIZ = "library_material_id";
        return param;
    }

    @Override // X.AbstractC225718tT, X.MGV
    public C51031K1b<? extends AbstractC51036K1g<?, ?>> getPresenter(int i, ActivityC45651qj activityC45651qj) {
        C56554MHm c56554MHm = new C56554MHm();
        if (activityC45651qj != null) {
            LibraryVideosViewModel libraryVideosViewModel = (LibraryVideosViewModel) ViewModelProviders.of(activityC45651qj).get(LibraryVideosViewModel.class);
            libraryVideosViewModel.getClass();
            libraryVideosViewModel.LJLILLLLZI.setValue(new OSZ<>(Integer.valueOf(i), c56554MHm));
        }
        c56554MHm.LJLIL.LIZLLL = this.LJLIL;
        C55519Lqd c55519Lqd = new C55519Lqd();
        c55519Lqd.LJJ(c56554MHm);
        return c55519Lqd;
    }

    @Override // X.AbstractC225718tT
    public AbstractC208678Gx onCreateDetailAwemeViewHolder(ViewGroup parent, int i, final String str, final MH9 mh9) {
        o.LJIIIZ(parent, "parent");
        final View LIZ = C28289B8j.LIZ(parent, R.layout.ako, parent, false);
        return new C220538l7(LIZ, str, mh9) { // from class: X.8l8
            @Override // X.C220538l7
            public final void a0(Aweme aweme, int i2, boolean z, Bundle bundle) {
                super.a0(aweme, i2, z, bundle);
                if (aweme.getStatistics() != null) {
                    this.LJZI.setVisibility(8);
                    this.LJZL.setVisibility(0);
                    this.LL.setVisibility(0);
                    this.LJZL.setText(C77123UOp.LJJIIJ(aweme.getStatistics().getPlayCount()));
                    this.LJZL.setContentDescription("");
                }
            }
        };
    }
}
