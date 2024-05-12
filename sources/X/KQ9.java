package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KQ9 implements KQA {
    public final KQA LJLIL;
    public final /* synthetic */ KQ7 LJLILLLLZI;

    @Override // X.InterfaceC223218pR
    public final void Iw() {
        this.LJLIL.Iw();
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<Aweme> list, boolean z) {
        this.LJLIL.J5(list, z);
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
        this.LJLIL.LJII();
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        this.LJLIL.Ne();
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
        this.LJLIL.Qw(exc);
    }

    @Override // X.InterfaceC224378rJ
    public final /* synthetic */ void VC() {
    }

    @Override // X.InterfaceC50666JuY
    public final void Yv(Exception exc) {
        this.LJLIL.Yv(exc);
    }

    @Override // X.InterfaceC224378rJ
    public final void ZF(OSZ<Integer, ? extends Aweme> osz) {
        this.LJLIL.ZF(osz);
    }

    @Override // X.InterfaceC51032K1c
    public final void c0(boolean z) {
        this.LJLIL.c0(z);
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        this.LJLIL.cb0(exc);
    }

    @Override // X.InterfaceC224378rJ
    public final void fC(Exception exc) {
        this.LJLIL.fC(exc);
    }

    @Override // X.KQA
    public final Fragment getFragment() {
        return this.LJLIL.getFragment();
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<Aweme> list, boolean z) {
        this.LJLIL.jh(list, z);
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        this.LJLIL.nc(exc);
    }

    @Override // X.InterfaceC51033K1d
    public final void onItemDeleted(int i) {
        this.LJLIL.onItemDeleted(i);
    }

    @Override // X.InterfaceC51033K1d
    public final void onItemInserted(List<Aweme> list, int i) {
        this.LJLIL.onItemInserted(list, i);
    }

    @Override // X.InterfaceC51033K1d
    public final /* synthetic */ boolean onItemInsertedNew(C2KF<Aweme> c2kf) {
        return false;
    }

    @Override // X.KQA
    public final void px() {
        this.LJLIL.px();
    }

    @Override // X.InterfaceC50666JuY
    public final void s00(List<Aweme> list) {
        this.LJLIL.s00(list);
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        this.LJLIL.showLoadMoreLoading();
    }

    public KQ9(KQ7 kq7, KQA target) {
        o.LJIIIZ(target, "target");
        this.LJLILLLLZI = kq7;
        this.LJLIL = target;
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<Aweme> list, boolean z) {
        boolean z2;
        KQ7 kq7 = this.LJLILLLLZI;
        kq7.LJLJLJ = list;
        if (list != null) {
            for (Aweme aweme : list) {
                aweme.mixFlowParam = kq7.LJLILLLLZI;
                aweme.setSearchFeedType("SearchMixFeed");
            }
        }
        KQ7 kq72 = this.LJLILLLLZI;
        kq72.LJLJLLL = z;
        KQA kqa = this.LJLIL;
        List<Aweme> LIZ = kq72.LIZ();
        KQ7 kq73 = this.LJLILLLLZI;
        if (kq73.LJLL || kq73.LJLJLLL) {
            z2 = true;
        } else {
            z2 = false;
        }
        kqa.j0(LIZ, z2);
    }
}
