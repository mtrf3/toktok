package X;

import defpackage.b0;

/* renamed from: X.3sF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97553sF implements InterfaceC97573sH {
    public final int LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C97553sF) && this.LIZ == ((C97553sF) obj).LIZ;
    }

    public final int hashCode() {
        return this.LIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Visible(textRes=");
        return b0.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }

    public C97553sF(int i) {
        this.LIZ = i;
    }
}
