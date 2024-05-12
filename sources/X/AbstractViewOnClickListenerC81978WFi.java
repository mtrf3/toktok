package X;

import Y.ARunnableS50S0100000_14;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.WFi, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractViewOnClickListenerC81978WFi implements View.OnClickListener {
    public static boolean LJLJJL = true;
    public final int LJLIL;
    public final boolean LJLILLLLZI;
    public boolean LJLJI;
    public final ARunnableS50S0100000_14 LJLJJI;

    public AbstractViewOnClickListenerC81978WFi() {
        this(0, 3);
    }

    public abstract void LIZ(View view);

    @Override // android.view.View.OnClickListener
    public final void onClick(View v) {
        boolean z;
        o.LJIIIZ(v, "v");
        boolean z2 = this.LJLILLLLZI;
        if (z2) {
            z = LJLJJL;
        } else {
            z = this.LJLJI;
        }
        if (z) {
            if (z2) {
                LJLJJL = false;
            } else {
                this.LJLJI = false;
            }
            v.postDelayed(this.LJLJJI, this.LJLIL);
            LIZ(v);
        }
    }

    public AbstractViewOnClickListenerC81978WFi(int i, boolean z) {
        this.LJLJI = true;
        this.LJLJJI = new ARunnableS50S0100000_14(this, 108);
        this.LJLIL = i;
        this.LJLILLLLZI = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AbstractViewOnClickListenerC81978WFi(int r2, int r3) {
        /*
            r1 = this;
            r0 = r3 & 1
            if (r0 == 0) goto L6
            r2 = 300(0x12c, float:4.2E-43)
        L6:
            r0 = r3 & 2
            if (r0 == 0) goto Lf
            r0 = 1
        Lb:
            r1.<init>(r2, r0)
            return
        Lf:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractViewOnClickListenerC81978WFi.<init>(int, int):void");
    }
}
