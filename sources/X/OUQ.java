package X;

import Y.ARunnableS46S0100000_10;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OUQ implements View.OnLayoutChangeListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ XJL<C76800UCe> LJLJI;

    public OUQ(View view, boolean z, XKS xks) {
        this.LJLIL = view;
        this.LJLILLLLZI = z;
        this.LJLJI = xks;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(v, "v");
        this.LJLIL.removeOnLayoutChangeListener(this);
        if (this.LJLILLLLZI) {
            this.LJLIL.post(new ARunnableS46S0100000_10(this.LJLJI, 49));
            return;
        }
        XJL<C76800UCe> xjl = this.LJLJI;
        C76800UCe c76800UCe = C76800UCe.LIZ;
        C3C5.m7constructorimpl(c76800UCe);
        xjl.resumeWith(c76800UCe);
    }
}
