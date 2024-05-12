package X;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: X.1Pr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32591Pr implements InterfaceC10670bP {
    public final LocaleList LIZ;

    @Override // X.InterfaceC10670bP
    public final Locale get() {
        return this.LIZ.get(0);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        return this.LIZ.toString();
    }

    @Override // X.InterfaceC10670bP
    public final Object LIZ() {
        return this.LIZ;
    }

    public C32591Pr(Object obj) {
        this.LIZ = (LocaleList) obj;
    }

    public final boolean equals(Object obj) {
        return this.LIZ.equals(((InterfaceC10670bP) obj).LIZ());
    }
}
