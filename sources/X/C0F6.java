package X;

import android.text.Editable;

/* renamed from: X.0F6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0F6 extends Editable.Factory {
    public static final Object LIZ = new Object();
    public static volatile C0F6 LIZIZ;
    public static Class<?> LIZJ;

    public C0F6() {
        try {
            LIZJ = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0F6.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = LIZJ;
        if (cls != null) {
            return new C08P(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
