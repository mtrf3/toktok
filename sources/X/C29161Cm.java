package X;

import android.R;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import o3.h0;

/* renamed from: X.1Cm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29161Cm extends C0CI {
    public final C29141Ck LIZ = new InterfaceC17830mx() { // from class: X.1Ck
        @Override // X.InterfaceC17830mx
        public final boolean LIZ(View view) {
            C29161Cm c29161Cm = C29161Cm.this;
            int currentItem = ((C0CM) view).getCurrentItem() + 1;
            C0CM c0cm = c29161Cm.LIZLLL;
            if (c0cm.LJZ) {
                c0cm.LJ(currentItem, true);
            }
            return true;
        }
    };
    public final C29151Cl LIZIZ = new InterfaceC17830mx() { // from class: X.1Cl
        @Override // X.InterfaceC17830mx
        public final boolean LIZ(View view) {
            C29161Cm c29161Cm = C29161Cm.this;
            int currentItem = ((C0CM) view).getCurrentItem() - 1;
            C0CM c0cm = c29161Cm.LIZLLL;
            if (c0cm.LJZ) {
                c0cm.LJ(currentItem, true);
            }
            return true;
        }
    };
    public C40341iA LIZJ;
    public final /* synthetic */ C0CM LIZLLL;

    public final void LIZIZ() {
        int itemCount;
        int i;
        C0CM c0cm = this.LIZLLL;
        int i2 = R.id.accessibilityActionPageLeft;
        h0.LJIILL(R.id.accessibilityActionPageLeft, c0cm);
        h0.LJIIJ(0, c0cm);
        h0.LJIILL(R.id.accessibilityActionPageRight, c0cm);
        h0.LJIIJ(0, c0cm);
        h0.LJIILL(R.id.accessibilityActionPageUp, c0cm);
        h0.LJIIJ(0, c0cm);
        h0.LJIILL(R.id.accessibilityActionPageDown, c0cm);
        h0.LJIIJ(0, c0cm);
        if (this.LIZLLL.getAdapter() == null || (itemCount = this.LIZLLL.getAdapter().getItemCount()) == 0) {
            return;
        }
        C0CM c0cm2 = this.LIZLLL;
        if (!c0cm2.LJZ) {
            return;
        }
        if (c0cm2.getOrientation() == 0) {
            if (LJJJJZI() == 1) {
                i = R.id.accessibilityActionPageLeft;
                i2 = R.id.accessibilityActionPageRight;
            } else {
                i = R.id.accessibilityActionPageRight;
            }
            if (this.LIZLLL.LJLJJI < itemCount - 1) {
                h0.LJIILLIIL(c0cm, new C17720mm(i, (CharSequence) null), null, this.LIZ);
            }
            if (this.LIZLLL.LJLJJI > 0) {
                h0.LJIILLIIL(c0cm, new C17720mm(i2, (CharSequence) null), null, this.LIZIZ);
                return;
            }
            return;
        }
        if (this.LIZLLL.LJLJJI < itemCount - 1) {
            h0.LJIILLIIL(c0cm, new C17720mm(R.id.accessibilityActionPageDown, (CharSequence) null), null, this.LIZ);
        }
        if (this.LIZLLL.LJLJJI <= 0) {
            return;
        }
        h0.LJIILLIIL(c0cm, new C17720mm(R.id.accessibilityActionPageUp, (CharSequence) null), null, this.LIZIZ);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Ck] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.1Cl] */
    public C29161Cm(C0CM c0cm) {
        this.LIZLLL = c0cm;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1iA] */
    public final void LIZ(RecyclerView recyclerView) {
        C16300kU.LJIJ(recyclerView, 2);
        this.LIZJ = new AbstractC29131Cj() { // from class: X.1iA
            @Override // X.AbstractC29131Cj, X.AbstractC029609s
            public final void LIZJ() {
                C29161Cm.this.LIZIZ();
            }

            {
                super(0);
            }
        };
        if (C16300kU.LIZJ(this.LIZLLL) == 0) {
            C16300kU.LJIJ(this.LIZLLL, 1);
        }
    }
}
