package X;

import Y.ARunnableS12S0101000_8;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.result.videosearch.core.ui.SearchFeedFragment;
import com.ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* renamed from: X.Jf6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49708Jf6 extends AbstractC49709Jf7 implements InterfaceC223218pR<Aweme>, JWG<JOO>, InterfaceC51033K1d, InterfaceC51032K1c {
    public int LJLL;
    public KUO LJLLI;
    public final String LJLLILLLL;
    public boolean LJLLJ;
    public int LJLLL;
    public C49719JfH LJLLLL;
    public JQT LJLLLLLL;
    public boolean LJLZ;

    @Override // X.AbstractC49709Jf7
    public final JVQ LJIIIZ() {
        JVQ jvq = this.LJLJJLL;
        if (jvq != null) {
            return jvq;
        }
        return new JVQ(this, this.LJLLILLLL, this.LJLIL, this, this.LJLLL);
    }

    @Override // X.AbstractC51687KQh
    public final void initPanel() {
    }

    @Override // X.InterfaceC51033K1d
    public final void onItemInserted(List list, int i) {
    }

    @Override // X.InterfaceC51033K1d
    public final /* synthetic */ boolean onItemInsertedNew(C2KF c2kf) {
        return false;
    }

    @Override // X.JWG
    public final /* synthetic */ void p(JOO joo) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        if (r2 != 6) goto L19;
     */
    @Override // X.AbstractC49709Jf7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC030309z LJIIJJI() {
        /*
            r7 = this;
            int r1 = r7.LJLLL
            r0 = 9
            if (r1 != r0) goto L5f
            X.JOs r0 = X.C49098JOs.LIZ
            r0.getClass()
            int r0 = X.C49098JOs.LIZ()
            r6 = 2
            r5 = 3
            r4 = 1
            r1 = 5
            if (r0 == r4) goto L5d
            if (r0 == r6) goto L5b
            if (r0 == r1) goto L5b
            r3 = 0
        L1a:
            r0 = 8
            if (r3 > 0) goto L20
            r3 = 8
        L20:
            int r2 = X.C49098JOs.LIZ()
            if (r2 == r4) goto L59
            if (r2 == r6) goto L57
            if (r2 == r5) goto L54
            if (r2 == r1) goto L57
            r1 = 6
            if (r2 == r1) goto L54
        L2f:
            X.JZP r4 = new X.JZP
            android.content.Context r2 = r7.getContext()
            float r1 = (float) r3
            float r1 = X.KL2.LIZJ(r2, r1)
            int r3 = (int) r1
            android.content.Context r1 = r7.getContext()
            float r0 = (float) r0
            float r0 = X.KL2.LIZJ(r1, r0)
            int r2 = (int) r0
            android.content.Context r1 = r7.getContext()
            r0 = 1090519040(0x41000000, float:8.0)
            float r0 = X.KL2.LIZJ(r1, r0)
            int r0 = (int) r0
            r4.<init>(r3, r2, r0)
            return r4
        L54:
            r0 = 12
            goto L2f
        L57:
            r0 = 5
            goto L2f
        L59:
            r0 = 3
            goto L2f
        L5b:
            r3 = 5
            goto L1a
        L5d:
            r3 = 3
            goto L1a
        L5f:
            X.Jg2 r2 = new X.Jg2
            android.content.Context r1 = r7.getContext()
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = X.KL2.LIZJ(r1, r0)
            int r0 = (int) r0
            r2.<init>(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49708Jf6.LJIIJJI():X.09z");
    }

    @Override // X.AbstractC49709Jf7
    public final C0A2 mO() {
        getContext();
        return new WrapGridLayoutManager(LFH.LIZIZ.LIZLLL().LJIIL().LJJIL(), 1, false);
    }

    @Override // X.InterfaceC223218pR
    public final void Iw() {
        if (isViewValid() && !this.LJLLJ) {
            this.LJLLI.setRefreshing(true);
        }
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
        if (!isViewValid()) {
            return;
        }
        if (this.LJLJJLL.getItemCount() == 0) {
            this.LJLLI.setRefreshing(false);
            KUR kur = this.LJLJJI;
            if (kur != null) {
                kur.setVisibility(0);
                this.LJLJJI.LJIIIZ();
                return;
            }
            return;
        }
        this.LJLLI.setRefreshing(true);
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        if (!isViewValid()) {
            return;
        }
        this.LJLLI.setRefreshing(false);
        this.LJLJJI.setVisibility(0);
        this.LJLJJI.LJII();
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        if (!isViewValid()) {
            return;
        }
        this.LJLJJLL.showLoadMoreLoading();
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
        if (!isViewValid()) {
            return;
        }
        this.LJLLI.setRefreshing(false);
        if (!this.LJLLJ) {
            C5S1 c5s1 = new C5S1(this.activity);
            c5s1.LIZJ(R.string.hvc);
            c5s1.LJ();
        }
    }

    @Override // X.InterfaceC51032K1c
    public final void c0(boolean z) {
        this.LJLLJ = z;
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        if (!isViewValid()) {
            return;
        }
        this.LJLLI.setRefreshing(false);
        if (!this.LJLZ) {
            this.LJLJJI.setVisibility(0);
            this.LJLJJI.LJIIIIZZ();
        } else {
            C5S1 c5s1 = new C5S1(this.activity);
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
        }
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        if (!isViewValid()) {
            return;
        }
        this.LJLJJLL.showLoadMoreError();
    }

    @Override // X.AbstractC51688KQi, X.KRB
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        RecyclerView recyclerView = this.LJLJJL;
        if (recyclerView != null) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof WrapGridLayoutManager) {
                ((GridLayoutManager) layoutManager).LLJLIL(LFH.LIZIZ.LIZLLL().LJIIL().LJJIL());
                this.LJLJJL.LJJJJZI();
            }
        }
    }

    @Override // X.InterfaceC51033K1d
    public final void onItemDeleted(int i) {
        if (isViewValid()) {
            this.LJLJJLL.notifyItemRemoved(i);
            if (i != 0) {
                JVQ jvq = this.LJLJJLL;
                Boolean bool = Boolean.FALSE;
                jvq.notifyItemChanged(i, bool);
                this.LJLJJLL.notifyItemChanged(i + 1, bool);
                this.LJLJJLL.notifyItemChanged(i + 2, bool);
            }
        }
    }

    @Override // X.JWG
    public final void vk(JOO joo) {
        if (joo != null) {
            isViewValid();
        }
    }

    public C49708Jf6(InterfaceC48970JJu interfaceC48970JJu, InterfaceC56526MGk interfaceC56526MGk) {
        super(interfaceC48970JJu, interfaceC56526MGk);
        this.LJLLILLLL = "search_result";
        this.LJLLL = 9;
    }

    @Override // X.InterfaceC223218pR
    public final void J5(List<Aweme> list, boolean z) {
        if (!isViewValid()) {
            return;
        }
        this.LJLJJI.LJI();
        this.LJLJJI.setVisibility(8);
        this.LJLLI.setRefreshing(false);
        this.LJLZ = true;
        this.LJLJJLL.setShowFooter(true);
        this.LJLJJLL.setData(list);
        if (z) {
            this.LJLJJLL.resetLoadMoreState();
        } else {
            this.LJLJJLL.showLoadMoreEmpty();
        }
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<Aweme> list, boolean z) {
        if (!isViewValid()) {
            return;
        }
        this.LJLLI.setRefreshing(false);
        this.LJLJJLL.setDataAfterLoadMore(list);
        if (z) {
            this.LJLJJLL.resetLoadMoreState();
        } else {
            this.LJLJJLL.showLoadMoreEmpty();
        }
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<Aweme> list, boolean z) {
        if (!isViewValid()) {
            return;
        }
        if (!z && !this.LJLLJ) {
            if (getUserVisibleHint() && this.activity != null) {
                C5S1 c5s1 = new C5S1(this.activity);
                c5s1.LIZJ(R.string.ect);
                c5s1.LJ();
                this.LJLJJL.post(new ARunnableS12S0101000_8(this, 41));
            }
        } else {
            this.LJLJJLL.setDataAfterLoadLatest(list);
            if (!this.LJLLJ && isActive()) {
                this.LJLJJL.post(new ARunnableS12S0101000_8(this, 41));
            }
        }
        this.LJLLI.setRefreshing(false);
    }

    @Override // X.AbstractC49709Jf7, X.AbstractC51687KQh, X.AbstractC51688KQi, X.KRB
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LJLLI = new KUO((C81335Vw3) view.findViewById(R.id.itq));
    }

    public final void LJIILIIL(C50420Jqa c50420Jqa, Aweme aweme, long j) {
        String str;
        C49719JfH c49719JfH = this.LJLLLL;
        if (c49719JfH != null) {
            str = c49719JfH.getIdentifier();
        } else {
            str = "";
        }
        C48892JGu.LIZIZ(aweme, !c50420Jqa.LJLL, C48880JGi.LIZ(str, aweme.getAid()), j, c50420Jqa.LJLJLLL);
    }

    @Override // X.AbstractC49709Jf7
    public final void LJIIL(C50420Jqa c50420Jqa, int i, Aweme aweme, long j) {
        Taco LIZIZ;
        int i2;
        SearchFeedFragment searchFeedFragment;
        super.LJIIL(c50420Jqa, i + this.LJLL, aweme, j);
        if (this.LJLLLLLL != null) {
            C49719JfH c49719JfH = this.LJLLLL;
            if (c49719JfH != null && (searchFeedFragment = c49719JfH.LIZ) != null) {
                i2 = searchFeedFragment.hashCode();
            } else {
                i2 = 0;
            }
            this.LJLLLLLL.LJJIL(i2, aweme.getAid());
            if (c50420Jqa.LJLJJLL > 0 || C50620Jto.LIZ()) {
                LJIILIIL(c50420Jqa, aweme, j);
                return;
            }
            return;
        }
        Fragment fragment = getFragment();
        if (fragment == null || fragment.isDetached() || (LIZIZ = C49218JTi.LIZIZ(fragment)) == null) {
            return;
        }
        InterfaceC49224JTo interfaceC49224JTo = LIZIZ.LJI().get(19);
        if (!(interfaceC49224JTo instanceof C49229JTt)) {
            return;
        }
        C49229JTt c49229JTt = (C49229JTt) interfaceC49224JTo;
        String aid = aweme.getAid();
        c49229JTt.getClass();
        if (aid != null && aid.length() != 0) {
            ((LiveData) c49229JTt.LJLJI.getValue()).setValue(0);
            RecyclerView recyclerView = c49229JTt.LJLIL;
            if (C16330kX.LIZJ(recyclerView) && !recyclerView.isLayoutRequested()) {
                c49229JTt.LIZIZ(aid, true);
            } else {
                recyclerView.addOnLayoutChangeListener(new JU1(c49229JTt, aid));
            }
        }
        if (c50420Jqa.LJLJJLL <= 0 && !C50620Jto.LIZ()) {
            return;
        }
        LJIILIIL(c50420Jqa, aweme, j);
    }
}
