package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JU1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ C49229JTt LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI = true;

    public JU1(C49229JTt c49229JTt, String str) {
        this.LJLIL = c49229JTt;
        this.LJLILLLLZI = str;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(this);
        this.LJLIL.LIZIZ(this.LJLILLLLZI, this.LJLJI);
    }
}
