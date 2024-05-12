package X;

import java.io.Serializable;

/* renamed from: X.2mD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68332mD<T> implements C5H3<T>, Serializable {
    public final T LJLIL;

    @Override // X.C5H3
    public boolean isInitialized() {
        return true;
    }

    public String toString() {
        return String.valueOf(getValue());
    }

    @Override // X.C5H3
    public T getValue() {
        return this.LJLIL;
    }

    public C68332mD(T t) {
        this.LJLIL = t;
    }
}
