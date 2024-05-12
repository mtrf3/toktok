package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.utils.Au2S20S0100000_12;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Rna, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70618Rna implements InterfaceC70778RqA {
    public final boolean LJLIL;
    public View LJLILLLLZI;
    public C90503gs LJLJI;
    public int LJLJJI;
    public List<C45809HyP> LJLJJL;
    public C1294256c LJLJJLL;

    @Override // X.InterfaceC70778RqA
    public final void LIZIZ() {
        ViewGroup viewGroup;
        View view = this.LJLILLLLZI;
        ViewParent viewParent = null;
        if (view != null) {
            viewParent = view.getParent();
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
            C16880lQ.LJLLL(this.LJLILLLLZI, viewGroup);
        }
    }

    public C70618Rna(boolean z) {
        this.LJLIL = z;
    }

    @Override // X.InterfaceC70778RqA
    public final void LJFF(int i) {
        ArrayList arrayList;
        this.LJLJJI = i;
        View view = this.LJLILLLLZI;
        if (view != null) {
            view.setVisibility(0);
        }
        C90503gs c90503gs = this.LJLJI;
        ArrayList arrayList2 = null;
        if (c90503gs != null) {
            List<C45809HyP> list = this.LJLJJL;
            if (list != null) {
                arrayList = new ArrayList(C32I.LJJL(list, 10));
                Iterator<C45809HyP> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().LJLIL);
                }
            } else {
                arrayList = null;
            }
            c90503gs.setTitles(arrayList);
        }
        C90503gs c90503gs2 = this.LJLJI;
        if (c90503gs2 != null) {
            List<C45809HyP> list2 = this.LJLJJL;
            if (list2 != null) {
                arrayList2 = new ArrayList(C32I.LJJL(list2, 10));
                Iterator<C45809HyP> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Integer.valueOf(it2.next().LJLJI));
                }
            }
            c90503gs2.setTabPositionList(arrayList2);
        }
        if (this.LJLIL) {
            i--;
        }
        C1294256c c1294256c = this.LJLJJLL;
        if (c1294256c != null) {
            c1294256c.setRealSize(i);
        }
    }

    @Override // X.InterfaceC70778RqA
    public final void onPageSelected(int i) {
        C90503gs c90503gs = this.LJLJI;
        if (c90503gs != null) {
            c90503gs.setTabPosition(i);
        }
        C1294256c c1294256c = this.LJLJJLL;
        if (c1294256c != null) {
            int i2 = 0;
            if (this.LJLIL && i >= this.LJLJJI - 1) {
                i2 = 8;
            }
            c1294256c.setVisibility(i2);
        }
        C1294256c c1294256c2 = this.LJLJJLL;
        if (c1294256c2 != null) {
            c1294256c2.LJJJIL(i);
        }
    }

    @Override // X.InterfaceC70778RqA
    public final void setAlpha(float f) {
        View view = this.LJLILLLLZI;
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    @Override // X.InterfaceC70778RqA
    public final void LJI(FrameLayout parent, DialogC70776Rq8 dialog) {
        C90503gs c90503gs;
        int i;
        View findViewById;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(dialog, "dialog");
        C1294256c c1294256c = null;
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.a2k, C16880lQ.LLZIL(parent.getContext()), null);
        this.LJLILLLLZI = LLLZIIL;
        if (LLLZIIL != null && (findViewById = LLLZIIL.findViewById(R.id.eb1)) != null) {
            C16880lQ.LJIIJ(new Au2S20S0100000_12(dialog, 52, 42), findViewById);
        }
        View view = this.LJLILLLLZI;
        if (view != null) {
            c90503gs = (C90503gs) view.findViewById(R.id.kxw);
        } else {
            c90503gs = null;
        }
        this.LJLJI = c90503gs;
        List<C45809HyP> list = this.LJLJJL;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        if (!this.LJLIL && i < 2) {
            C90503gs c90503gs2 = this.LJLJI;
            if (c90503gs2 != null) {
                c90503gs2.setVisibility(8);
            }
            this.LJLJI = null;
        }
        View view2 = this.LJLILLLLZI;
        if (view2 != null) {
            c1294256c = (C1294256c) view2.findViewById(R.id.h9_);
        }
        this.LJLJJLL = c1294256c;
        C90503gs c90503gs3 = this.LJLJI;
        if (c90503gs3 != null) {
            c90503gs3.setBackgroundResource(R.drawable.abf);
        }
        C90503gs c90503gs4 = this.LJLJI;
        if (c90503gs4 != null) {
            c90503gs4.setClickStrategy(new AqS143S0200000_12(this, dialog, 96));
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        parent.addView(this.LJLILLLLZI, layoutParams);
        View view3 = this.LJLILLLLZI;
        if (view3 != null) {
            view3.setPadding(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(52)), 0, 0);
        }
    }
}
