package X;

import defpackage.a1;
import java.util.Arrays;

/* renamed from: X.Qbb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67327Qbb extends AbstractC67328Qbc {
    public final String LJLIL;

    public C67327Qbb(String str) {
        this.LJLIL = str;
    }

    @Override // X.AbstractC67328Qbc
    public final void LIZJ() {
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{3, this.LJLIL});
    }

    public final String toString() {
        return a1.LJ("\"", this.LJLIL, "\"");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AbstractC67328Qbc abstractC67328Qbc = (AbstractC67328Qbc) obj;
        abstractC67328Qbc.LIZJ();
        String str = this.LJLIL;
        int length = str.length();
        String str2 = ((C67327Qbb) abstractC67328Qbc).LJLIL;
        if (length != str2.length()) {
            return str.length() - str2.length();
        }
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C67327Qbb.class != obj.getClass()) {
            return false;
        }
        return this.LJLIL.equals(((C67327Qbb) obj).LJLIL);
    }
}
