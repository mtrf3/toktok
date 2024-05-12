package X;

import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V27 extends AbstractC16010k1 implements InterfaceC24390xX {
    public final Drawable LJLJJLL;
    public final ParcelableSnapshotMutableState LJLJLJ;
    public final ParcelableSnapshotMutableState LJLJL = C78966Uyw.LJJJIL(0);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(new AqS163S0100000_13(this, 316));

    @Override // X.InterfaceC24390xX
    public final void LIZJ() {
        this.LJLJJLL.setCallback((Drawable.Callback) this.LJLJLLL.getValue());
        this.LJLJJLL.setVisible(true, true);
        Object obj = this.LJLJJLL;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // X.InterfaceC24390xX
    public final void LIZLLL() {
        Object obj = this.LJLJJLL;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.LJLJJLL.setVisible(false, false);
        this.LJLJJLL.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC16010k1
    public final long LJI() {
        return ((C10430b1) this.LJLJLJ.getValue()).LIZ;
    }

    @Override // X.InterfaceC24390xX
    public final void LIZIZ() {
        LIZLLL();
    }

    public V27(Drawable drawable) {
        this.LJLJJLL = drawable;
        this.LJLJLJ = C78966Uyw.LJJJIL(new C10430b1(V23.LIZ(drawable)));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override // X.AbstractC16010k1
    public final boolean LIZ(float f) {
        this.LJLJJLL.setAlpha(C78842Uww.LJIIL(O6R.LJJIIZ(f * 255), 0, 255));
        return true;
    }

    @Override // X.AbstractC16010k1
    public final boolean LJ(C11890dN c11890dN) {
        ColorFilter colorFilter;
        Drawable drawable = this.LJLJJLL;
        if (c11890dN != null) {
            colorFilter = c11890dN.LIZ;
        } else {
            colorFilter = null;
        }
        drawable.setColorFilter(colorFilter);
        return true;
    }

    @Override // X.AbstractC16010k1
    public final void LJFF(EnumC23500w6 layoutDirection) {
        o.LJIIIZ(layoutDirection, "layoutDirection");
        if (Build.VERSION.SDK_INT >= 23) {
            Drawable drawable = this.LJLJJLL;
            int i = V26.LIZ[layoutDirection.ordinal()];
            int i2 = 1;
            if (i != 1) {
                if (i != 2) {
                    throw new C162476Zf();
                }
            } else {
                i2 = 0;
            }
            drawable.setLayoutDirection(i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC16010k1
    public final void LJII(InterfaceC33691Tx interfaceC33691Tx) {
        o.LJIIIZ(interfaceC33691Tx, "<this>");
        InterfaceC11750d9 LIZ = interfaceC33691Tx.LJJIII().LIZ();
        ((Number) this.LJLJL.getValue()).intValue();
        this.LJLJJLL.setBounds(0, 0, O6R.LJJIIZ(C10430b1.LIZLLL(interfaceC33691Tx.LIZIZ())), O6R.LJJIIZ(C10430b1.LIZIZ(interfaceC33691Tx.LIZIZ())));
        try {
            LIZ.LJIIL();
            this.LJLJJLL.draw(((C1QR) LIZ).LIZ);
        } finally {
            LIZ.LJIIJ();
        }
    }
}
