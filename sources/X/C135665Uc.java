package X;

import androidx.lifecycle.Observer;

/* renamed from: X.5Uc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135665Uc<T> implements Observer<T> {
    public static final boolean LJLIL = C82891Wg3.LIZIZ();

    @Override // androidx.lifecycle.Observer
    public final void onChanged(T t) {
        String obj;
        if (LJLIL) {
            if (t == null) {
                return;
            }
            t.toString();
        } else {
            if (t == null) {
                obj = "null";
            } else {
                obj = t.toString();
            }
            C82891Wg3.LIZLLL().d(obj);
        }
    }
}
