package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import defpackage.a1;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vr4, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81026Vr4 extends AbstractC81023Vr1 {
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public int LJLLILLLL;

    @Override // X.AbstractC81023Vr1
    public View getLabelEnd() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-labelEnd>(...)");
        return (View) value;
    }

    @Override // X.AbstractC81023Vr1
    public View getLabelStart() {
        Object value = this.LJLLI.getValue();
        o.LJIIIIZZ(value, "<get-labelStart>(...)");
        return (View) value;
    }

    @Override // X.AbstractC81023Vr1
    public View getName() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-name>(...)");
        return (View) value;
    }

    @Override // X.AbstractC81023Vr1
    public int getGap() {
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC81023Vr1
    public void setGap(int i) {
        this.LJLLILLLL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81026Vr4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 315));
        this.LJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 313));
        this.LJLLI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 314));
        this.LJLLILLLL = C15380j0.LIZ(2.0f);
    }
}
