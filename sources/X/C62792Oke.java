package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Oke, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62792Oke implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final EMX LJLILLLLZI;
    public final boolean LJLJI;
    public final P1U LJLJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62792Oke)) {
            return false;
        }
        C62792Oke c62792Oke = (C62792Oke) obj;
        return o.LJ(this.LJLIL, c62792Oke.LJLIL) && o.LJ(this.LJLILLLLZI, c62792Oke.LJLILLLLZI) && this.LJLJI == c62792Oke.LJLJI && o.LJ(this.LJLJJI, c62792Oke.LJLJJI);
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = (this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31;
        boolean z = this.LJLJI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return this.LJLJJI.hashCode() + ((hashCode + i) * 31);
    }

    public final String toString() {
        return this.LJLILLLLZI.getContactName();
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 other) {
        C62792Oke c62792Oke;
        EMX emx;
        o.LJIIIZ(other, "other");
        String phoneNumber = this.LJLILLLLZI.getPhoneNumber();
        String str = null;
        if ((other instanceof C62792Oke) && (c62792Oke = (C62792Oke) other) != null && (emx = c62792Oke.LJLILLLLZI) != null) {
            str = emx.getPhoneNumber();
        }
        return o.LJ(phoneNumber, str);
    }

    public C62792Oke(String str, EMX emx, boolean z, P1U config) {
        o.LJIIIZ(config, "config");
        this.LJLIL = str;
        this.LJLILLLLZI = emx;
        this.LJLJI = z;
        this.LJLJJI = config;
    }
}
