package X;

import android.content.SharedPreferences;

/* renamed from: X.PjT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65267PjT<T> {
    public final InterfaceC65285Pjl LIZ;
    public final InterfaceC65274Pja<T> LIZIZ;
    public final String LIZJ;

    public final void LIZ(T t) {
        C65270PjW c65270PjW = (C65270PjW) this.LIZ;
        SharedPreferences.Editor putString = c65270PjW.LIZ.edit().putString(this.LIZJ, this.LIZIZ.LIZ(t));
        c65270PjW.getClass();
        putString.apply();
    }

    public C65267PjT(InterfaceC65285Pjl interfaceC65285Pjl, InterfaceC65274Pja<T> interfaceC65274Pja, String str) {
        this.LIZ = interfaceC65285Pjl;
        this.LIZIZ = interfaceC65274Pja;
        this.LIZJ = str;
    }
}
