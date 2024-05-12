package X;

import X.AbstractC20690rZ;

/* renamed from: X.0ra, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20700ra<T extends AbstractC20690rZ> {
    public final T LIZ;
    public C20700ra<T> LIZIZ;

    public C20700ra(T t) {
        this.LIZ = t;
    }

    public final void LIZ(InterfaceC88472Yns<? super C20700ra<T>, Boolean> interfaceC88472Yns) {
        boolean booleanValue = interfaceC88472Yns.invoke(this).booleanValue();
        C20700ra<T> c20700ra = this;
        while (true) {
            c20700ra = c20700ra.LIZIZ;
            if (c20700ra == null || booleanValue) {
                return;
            } else {
                booleanValue = interfaceC88472Yns.invoke(c20700ra).booleanValue();
            }
        }
    }
}
