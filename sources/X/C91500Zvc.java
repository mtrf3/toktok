package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Zvc, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91500Zvc extends AbstractC51547KKx {
    public final InterfaceC91174ZqM LJLJJLL;
    public final String LJLJL;
    public final String LJLJLJ;
    public final long LJLJLLL;
    public final ActivityC45651qj LJLL;
    public final List<InterfaceC91177ZqP> LJLLI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return ((ArrayList) this.LJLLI).size();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        return ((InterfaceC91177ZqP) ListProtector.get(this.LJLLI, i)).LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fa A[SYNTHETIC] */
    @Override // X.AbstractC51547KKx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.fragment.app.Fragment LJJIII(int r8) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91500Zvc.LJJIII(int):androidx.fragment.app.Fragment");
    }

    @Override // X.AbstractC51547KKx, androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup container, Object item) {
        o.LJIIIZ(container, "container");
        o.LJIIIZ(item, "item");
        super.LJIIIZ(i, container, item);
        if (item instanceof Fragment) {
            try {
                C1B3 c1b3 = this.LJLJI;
                if (c1b3 != null) {
                    c1b3.LJJI((Fragment) item);
                }
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("destroyItem remove fragment exception: ");
                LIZ.append(e);
                X1D.LIZIZ(LIZ);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C91500Zvc(androidx.fragment.app.Fragment r3, X.InterfaceC91174ZqM r4, java.lang.String r5, java.lang.String r6, long r7) {
        /*
            r2 = this;
            java.lang.String r0 = "mainFragment"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "dspPage"
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            androidx.fragment.app.FragmentManager r1 = r3.getChildFragmentManager()
            java.lang.String r0 = "mainFragment.childFragmentManager"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            r2.<init>(r1)
            r2.LJLJJLL = r4
            r2.LJLJL = r5
            r2.LJLJLJ = r6
            r2.LJLJLLL = r7
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L55
            X.1qj r0 = X.C45804HyK.LJJIFFI(r0)
        L28:
            kotlin.jvm.internal.o.LJI(r0)
            r2.LJLL = r0
            X.1qj r1 = r3.mo49getActivity()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            kotlin.jvm.internal.o.LJII(r1, r0)
            com.ss.android.ugc.aweme.dsp.v2.TTDspViewModelV2 r0 = X.C91136Zpk.LIZ(r1)
            java.util.List<X.ZqP> r0 = r0.LJLILLLLZI
            r2.LJLLI = r0
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            X.Ecj r0 = r0.getShowTimeLineTab()
            java.lang.Object r1 = r0.LIZ()
            java.lang.String r0 = "inst().showTimeLineTab.cache"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.booleanValue()
            return
        L55:
            r0 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91500Zvc.<init>(androidx.fragment.app.Fragment, X.ZqM, java.lang.String, java.lang.String, long):void");
    }
}
