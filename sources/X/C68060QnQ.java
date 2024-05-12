package X;

import android.content.Context;

/* renamed from: X.QnQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68060QnQ extends AbstractC68062QnS {
    public final Context LIZ;
    public final InterfaceC62818Ol4 LIZIZ;

    @Override // X.AbstractC68062QnS
    public final Context LIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC68062QnS
    public final InterfaceC62818Ol4 LIZIZ() {
        return this.LIZIZ;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.LIZ.hashCode() ^ 1000003) * 1000003;
        InterfaceC62818Ol4 interfaceC62818Ol4 = this.LIZIZ;
        if (interfaceC62818Ol4 == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC62818Ol4.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return "FlagsContext{context=" + this.LIZ.toString() + ", hermeticFileOverrides=" + String.valueOf(this.LIZIZ) + "}";
    }

    public final boolean equals(Object obj) {
        InterfaceC62818Ol4 interfaceC62818Ol4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC68062QnS) {
            AbstractC68062QnS abstractC68062QnS = (AbstractC68062QnS) obj;
            if (this.LIZ.equals(abstractC68062QnS.LIZ()) && ((interfaceC62818Ol4 = this.LIZIZ) != null ? interfaceC62818Ol4.equals(abstractC68062QnS.LIZIZ()) : abstractC68062QnS.LIZIZ() == null)) {
                return true;
            }
        }
        return false;
    }

    public C68060QnQ(Context context, InterfaceC62818Ol4 interfaceC62818Ol4) {
        this.LIZ = context;
        this.LIZIZ = interfaceC62818Ol4;
    }
}
