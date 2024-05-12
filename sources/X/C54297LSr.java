package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.LSr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54297LSr extends AbstractC54298LSs<CommonPageFragment> {
    public List<C54296LSq> LJLJL;
    public HashMap<String, C54296LSq> LJLJLJ;
    public List<C54296LSq> LJLJLLL;
    public InterfaceC54281LSb LJLL;
    public QZP LJLLI;

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIIZ(int i, ViewGroup viewGroup, Object obj) {
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int LJIIL(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void LJIIJJI(ViewGroup viewGroup) {
        C1B3 c1b3 = this.LJLJI;
        if (c1b3 != null) {
            try {
                c1b3.LJI();
                this.LJLJI = null;
                this.LJLILLLLZI.LJJIL();
            } catch (IllegalStateException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final CharSequence LJIILIIL(int i) {
        return LJJIIJ(i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final float LJIILJJIL(int i) {
        C54296LSq c54296LSq;
        if (i >= 0 && i < ((ArrayList) this.LJLJLLL).size() && (c54296LSq = (C54296LSq) ListProtector.get(this.LJLJLLL, i)) != null) {
            float f = c54296LSq.LIZLLL;
            if (f > 0.0f) {
                return f;
            }
        }
        return 1.0f;
    }

    public final CommonPageFragment LJJIII(String str) {
        Fragment fragment;
        List<C54296LSq> list = this.LJLJLLL;
        int i = 0;
        if (list != null) {
            int size = ((ArrayList) list).size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (TextUtils.equals(str, ((C54296LSq) ListProtector.get(this.LJLJLLL, i2)).LIZIZ)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        HashMap<Integer, T> hashMap = this.LJLJJLL;
        if (hashMap == 0 || hashMap.isEmpty()) {
            fragment = null;
        } else {
            fragment = (Fragment) this.LJLJJLL.get(Integer.valueOf(i));
        }
        return (CommonPageFragment) fragment;
    }

    public final String LJJIIJ(int i) {
        if (i < 0 || i >= ((ArrayList) this.LJLJLLL).size()) {
            return "";
        }
        return ((C54296LSq) ListProtector.get(this.LJLJLLL, i)).LIZIZ;
    }

    public C54297LSr(FragmentManager fragmentManager, int i) {
        super(fragmentManager, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    @Override // androidx.viewpager.widget.PagerAdapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(int r6, android.view.ViewGroup r7) {
        /*
            r5 = this;
            r7.getId()
            X.1B3 r0 = r5.LJLJI
            if (r0 != 0) goto Lf
            androidx.fragment.app.FragmentManager r0 = r5.LJLILLLLZI
            X.1B3 r0 = X.C1B6.LIZ(r0, r0)
            r5.LJLJI = r0
        Lf:
            java.util.List<X.LSq> r0 = r5.LJLJLLL
            if (r0 == 0) goto L17
            java.util.List<X.LSq> r1 = r5.LJLJL
            if (r1 != 0) goto La7
        L17:
            int r2 = r7.getId()
            java.lang.String r1 = "android:switcher:"
            java.lang.String r0 = ":"
            java.lang.StringBuilder r2 = X.C7MY.LJ(r1, r2, r0)
            java.util.List<X.LSq> r0 = r5.LJLJLLL
            if (r0 == 0) goto L2b
            java.util.List<X.LSq> r1 = r5.LJLJL
            if (r1 != 0) goto L9d
        L2b:
            long r0 = (long) r6
        L2c:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.append(r0)
            java.lang.String r4 = X.X1D.LIZIZ(r2)
            androidx.fragment.app.FragmentManager r0 = r5.LJLILLLLZI
            androidx.fragment.app.Fragment r3 = r0.LJJJIL(r4)
            if (r3 == 0) goto L6f
            X.1B3 r0 = r5.LJLJI
            r0.LJFF(r3)
        L44:
            androidx.fragment.app.Fragment r0 = r5.LJLJJI
            if (r3 == r0) goto L4f
            r0 = 0
            r3.setMenuVisibility(r0)
            r3.setUserVisibleHint(r0)
        L4f:
            X.QZP r0 = r5.LJLLI
            if (r0 == 0) goto L5c
            com.ss.android.ugc.aweme.detail.platform.IDetailPageAbility r0 = X.KQ1.LIZ(r3)
            if (r0 == 0) goto L5c
            r0.P90()
        L5c:
            java.util.HashMap<java.lang.Integer, T extends androidx.fragment.app.Fragment> r1 = r5.LJLJJLL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1.put(r0, r3)
            java.util.HashMap<java.lang.Integer, T extends androidx.fragment.app.Fragment> r1 = r5.LJLJJLL
            X.LSb r0 = r5.LJLL
            if (r0 == 0) goto L6e
            r0.LIZIZ(r1)
        L6e:
            return r3
        L6f:
            java.util.List<X.LSq> r0 = r5.LJLJLLL
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            X.LSq r1 = (X.C54296LSq) r1
            if (r1 == 0) goto L8f
            java.lang.Class<? extends com.ss.android.ugc.aweme.base.ui.CommonPageFragment> r0 = r1.LIZ     // Catch: java.lang.Exception -> L8b
            java.lang.Object r3 = r0.newInstance()     // Catch: java.lang.Exception -> L8b
            com.ss.android.ugc.aweme.base.ui.CommonPageFragment r3 = (com.ss.android.ugc.aweme.base.ui.CommonPageFragment) r3     // Catch: java.lang.Exception -> L8b
            android.os.Bundle r0 = r1.LIZJ     // Catch: java.lang.Exception -> L8b
            if (r0 == 0) goto L90
            if (r3 == 0) goto L90
            r3.setArguments(r0)     // Catch: java.lang.Exception -> L8b
            goto L90
        L8b:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L8f:
            r3 = 0
        L90:
            if (r3 == 0) goto Lb0
            X.1B3 r2 = r5.LJLJI
            int r1 = r7.getId()
            r0 = 1
            r2.LJIIIIZZ(r1, r0, r3, r4)
            goto L44
        L9d:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            int r0 = r1.indexOf(r0)
            long r0 = (long) r0
            goto L2c
        La7:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r6)
            r1.indexOf(r0)
            goto L17
        Lb0:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "createFragment(position="
            java.lang.String r0 = " does not return a Fragment),check the code to be sure that method createFragment has override all position"
            java.lang.String r0 = X.C0NY.LIZIZ(r1, r6, r0)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54297LSr.LJIILLIIL(int, android.view.ViewGroup):java.lang.Object");
    }
}
