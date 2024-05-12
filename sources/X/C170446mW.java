package X;

import Y.ARunnableS38S0100000_2;
import android.view.MotionEvent;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.effect.EffectModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6mW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170446mW implements C0A5 {
    public final LifecycleOwner LJLIL;
    public final RecyclerView LJLILLLLZI;
    public final boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public final long LJLL;
    public final long LJLLI;
    public final int LJLLILLLL;
    public boolean LJLLJ;
    public float LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public long LJZ;
    public final C62822Ol8 LJZI;
    public RecyclerView.ViewHolder LJZL;
    public int LL;
    public final ARunnableS38S0100000_2 LLD;
    public final ARunnableS38S0100000_2 LLF;

    @Override // X.C0A5
    public final void LIZ(RecyclerView rv, MotionEvent e) {
        o.LJIIIZ(rv, "rv");
        o.LJIIIZ(e, "e");
    }

    @Override // X.C0A5
    public final void LIZIZ(boolean z) {
    }

    public final void LIZLLL(boolean z) {
        RecyclerView.ViewHolder viewHolder;
        InterfaceC170486ma interfaceC170486ma;
        int LIZ;
        EffectModel effectModel;
        boolean z2 = this.LJLJLLL;
        if ((!z2 && !this.LJLJJI && !this.LJLJJLL) || (viewHolder = this.LJZL) == null || !(viewHolder instanceof C170406mS)) {
            return;
        }
        if (this.LJLJJLL && this.LJLJJL) {
            this.LJLJJL = false;
            C170406mS c170406mS = (C170406mS) viewHolder;
            if (!c170406mS.LJLJI || (interfaceC170486ma = c170406mS.LJLJJLL) == null || -1 == (LIZ = interfaceC170486ma.LIZ(c170406mS.getAbsoluteAdapterPosition())) || (effectModel = c170406mS.LJLJL) == null) {
                return;
            }
            c170406mS.Q(1.2f);
            InterfaceC170486ma interfaceC170486ma2 = c170406mS.LJLJJLL;
            if (interfaceC170486ma2 == null) {
                return;
            }
            interfaceC170486ma2.LJFF(0, LIZ, effectModel);
            return;
        }
        if (z2) {
            if (System.currentTimeMillis() - this.LJZ < 1000) {
                ((C170406mS) viewHolder).N();
                return;
            } else {
                ((C170406mS) viewHolder).P(this.LL, z);
                return;
            }
        }
        if (this.LJLJJI && z) {
            ((C170406mS) viewHolder).N();
        } else {
            if (!this.LJLJL) {
                return;
            }
            ((C170406mS) viewHolder).P(this.LL, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r2 != 3) goto L9;
     */
    @Override // X.C0A5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ(androidx.recyclerview.widget.RecyclerView r7, android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170446mW.LIZJ(androidx.recyclerview.widget.RecyclerView, android.view.MotionEvent):boolean");
    }

    public C170446mW(WM7 lifecycleOwner, RecyclerView recyclerView, boolean z) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = recyclerView;
        this.LJLJI = z;
        this.LJLL = 100L;
        this.LJLLI = 600L;
        this.LJLLILLLL = 20;
        this.LJZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 885));
        this.LL = -1;
        this.LLD = new ARunnableS38S0100000_2(this, 171);
        this.LLF = new ARunnableS38S0100000_2(this, 170);
    }
}
