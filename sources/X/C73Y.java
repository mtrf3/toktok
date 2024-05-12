package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.73Y, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C73Y extends RecyclerView.ViewHolder {
    public final FrameLayout LJLIL;
    public final C119244m8 LJLILLLLZI;
    public final C223338pd LJLJI;
    public final View LJLJJI;
    public final C73305Spp LJLJJL;
    public final LinearLayout LJLJJLL;
    public final C73305Spp LJLJL;
    public final SY4 LJLJLJ;
    public final ViewGroup LJLJLLL;
    public String LJLL;

    public final void L() {
        FrameLayout frameLayout;
        ViewGroup viewGroup;
        FrameLayout frameLayout2;
        ViewGroup viewGroup2 = this.LJLJLLL;
        if (viewGroup2 != null && viewGroup2.getVisibility() == 0 && (frameLayout2 = this.LJLIL) != null && frameLayout2.getVisibility() == 0) {
            ViewGroup viewGroup3 = this.LJLJLLL;
            if (viewGroup3 != null) {
                C45804HyK.LJJLIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), viewGroup3);
                return;
            }
            return;
        }
        ViewGroup viewGroup4 = this.LJLJLLL;
        if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && (frameLayout = this.LJLIL) != null && frameLayout.getVisibility() == 8 && (viewGroup = this.LJLJLLL) != null) {
            C45804HyK.LJJLIIIJ(O6R.LJJIIZ(C32151Nz.LJIIZILJ(24)), viewGroup);
        }
    }

    public final void LJII() {
        FrameLayout frameLayout = this.LJLIL;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        C119244m8 c119244m8 = this.LJLILLLLZI;
        if (c119244m8 != null) {
            c119244m8.setVisibility(8);
        }
        C223338pd c223338pd = this.LJLJI;
        if (c223338pd != null) {
            c223338pd.setVisibility(0);
        }
        C223338pd c223338pd2 = this.LJLJI;
        if (c223338pd2 != null) {
            c223338pd2.LIZIZ();
        }
    }

    public final void M() {
        C223338pd c223338pd = this.LJLJI;
        if (c223338pd != null && c223338pd.LJLJLJ) {
            c223338pd.LIZJ();
        }
        FrameLayout frameLayout = this.LJLIL;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        View view = this.LJLJJI;
        if (view != null) {
            C26338AVi.LJI(view, null, AnonymousClass391.LIZJ(8), null, AnonymousClass391.LIZJ(8), false, 21);
        }
    }

    public final void N(long j) {
        FrameLayout frameLayout = this.LJLIL;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        C119244m8 c119244m8 = this.LJLILLLLZI;
        if (c119244m8 != null) {
            c119244m8.setVisibility(0);
        }
        C223338pd c223338pd = this.LJLJI;
        if (c223338pd != null) {
            c223338pd.setVisibility(8);
        }
        int LJIIJ = C7HV.LIZIZ.LJIIJ(R.plurals.rf, R.plurals.s7);
        C119244m8 c119244m82 = this.LJLILLLLZI;
        if (c119244m82 == null) {
            return;
        }
        int i = (int) j;
        c119244m82.setText(this.itemView.getResources().getQuantityString(LJIIJ, i, Integer.valueOf(i)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0065, code lost:
    
        if (X.C26338AVi.LIZJ(r0) == true) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C73Y(android.view.View r6, X.InterfaceC1797373p r7) {
        /*
            r5 = this;
            java.lang.String r0 = "itemView"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            java.lang.String r0 = "listener"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r5.<init>(r6)
            java.lang.String r0 = ""
            r5.LJLL = r0
            r0 = 2131367103(0x7f0a14bf, float:1.8354118E38)
            android.view.View r4 = r6.findViewById(r0)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r5.LJLIL = r4
            r0 = 2131379863(0x7f0a4697, float:1.8379999E38)
            android.view.View r3 = r6.findViewById(r0)
            X.4m8 r3 = (X.C119244m8) r3
            r5.LJLILLLLZI = r3
            X.89v r2 = new X.89v
            r2.<init>()
            r0 = 2131755469(0x7f1001cd, float:1.9141818E38)
            r2.LIZ = r0
            r0 = 2130968766(0x7f0400be, float:1.7546195E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LJ = r0
            r0 = 16
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r1)
            int r0 = X.O6R.LJJIIZ(r0)
            r2.LIZIZ = r0
            float r0 = X.C32151Nz.LJIIZILJ(r1)
            int r0 = X.O6R.LJJIIZ(r0)
            r2.LIZJ = r0
            java.lang.String r0 = "itemView.context"
            X.SY9 r2 = X.C025908h.LIZJ(r6, r0, r2)
            android.content.Context r0 = r6.getContext()
            if (r0 == 0) goto Ld7
            boolean r0 = X.C26338AVi.LIZJ(r0)
            r1 = 1
            if (r0 != r1) goto Ld7
        L67:
            r0 = 0
            if (r1 == 0) goto Ld1
            if (r3 == 0) goto L6f
            r3.setCompoundDrawablesWithIntrinsicBounds(r2, r0, r0, r0)
        L6f:
            r0 = 2131365279(0x7f0a0d9f, float:1.8350419E38)
            android.view.View r0 = r6.findViewById(r0)
            X.8pd r0 = (X.C223338pd) r0
            r5.LJLJI = r0
            r0 = 2131380296(0x7f0a4848, float:1.8380877E38)
            android.view.View r0 = r6.findViewById(r0)
            r5.LJLJJI = r0
            if (r4 == 0) goto L8f
            Y.ACListenerS38S0200000_3 r1 = new Y.ACListenerS38S0200000_3
            r0 = 21
            r1.<init>(r5, r7, r0)
            X.C16880lQ.LJIILJJIL(r4, r1)
        L8f:
            X.3da r3 = X.C88463da.LIZ
            X.73i r2 = X.EnumC1796673i.BUTTON
            r1 = 0
            r0 = 12
            X.C88463da.LIZJ(r3, r4, r2, r1, r0)
            r0 = 2131378335(0x7f0a409f, float:1.83769E38)
            android.view.View r0 = r6.findViewById(r0)
            X.Spp r0 = (X.C73305Spp) r0
            r5.LJLJJL = r0
            r0 = 2131370753(0x7f0a2301, float:1.8361521E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r5.LJLJJLL = r0
            r0 = 2131378333(0x7f0a409d, float:1.8376895E38)
            android.view.View r0 = r6.findViewById(r0)
            X.Spp r0 = (X.C73305Spp) r0
            r5.LJLJL = r0
            r0 = 2131374643(0x7f0a3233, float:1.8369411E38)
            android.view.View r0 = r6.findViewById(r0)
            X.SY4 r0 = (X.SY4) r0
            r5.LJLJLJ = r0
            r0 = 2131374644(0x7f0a3234, float:1.8369413E38)
            android.view.View r0 = r6.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r5.LJLJLLL = r0
            return
        Ld1:
            if (r3 == 0) goto L6f
            r3.setCompoundDrawablesWithIntrinsicBounds(r0, r0, r2, r0)
            goto L6f
        Ld7:
            r1 = 0
            goto L67
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C73Y.<init>(android.view.View, X.73p):void");
    }
}
