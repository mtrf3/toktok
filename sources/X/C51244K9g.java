package X;

import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.K9g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51244K9g implements Serializable {
    public final KBE LJLIL;
    public final String LJLILLLLZI;
    public final KBG LJLJI;
    public final C51222K8k LJLJJI;
    public final String LJLJJL;

    /* JADX WARN: Multi-variable type inference failed */
    public C51244K9g() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C51244K9g copy$default(C51244K9g c51244K9g, KBE kbe, String str, KBG kbg, C51222K8k c51222K8k, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            kbe = c51244K9g.LJLIL;
        }
        if ((i & 2) != 0) {
            str = c51244K9g.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            kbg = c51244K9g.LJLJI;
        }
        if ((i & 8) != 0) {
            c51222K8k = c51244K9g.LJLJJI;
        }
        if ((i & 16) != 0) {
            str2 = c51244K9g.LJLJJL;
        }
        return c51244K9g.copy(kbe, str, kbg, c51222K8k, str2);
    }

    public final C51244K9g copy(KBE kbe, String str, KBG kbg, C51222K8k c51222K8k, String str2) {
        return new C51244K9g(kbe, str, kbg, c51222K8k, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C51244K9g)) {
            return false;
        }
        C51244K9g c51244K9g = (C51244K9g) obj;
        return this.LJLIL == c51244K9g.LJLIL && o.LJ(this.LJLILLLLZI, c51244K9g.LJLILLLLZI) && o.LJ(this.LJLJI, c51244K9g.LJLJI) && o.LJ(this.LJLJJI, c51244K9g.LJLJJI) && o.LJ(this.LJLJJL, c51244K9g.LJLJJL);
    }

    public int hashCode() {
        KBE kbe = this.LJLIL;
        int hashCode = (kbe == null ? 0 : kbe.hashCode()) * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        KBG kbg = this.LJLJI;
        int hashCode3 = (hashCode2 + (kbg == null ? 0 : kbg.hashCode())) * 31;
        C51222K8k c51222K8k = this.LJLJJI;
        int hashCode4 = (hashCode3 + (c51222K8k == null ? 0 : c51222K8k.hashCode())) * 31;
        String str2 = this.LJLJJL;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ResultAttachCard(cardType=");
        LIZ.append(this.LJLIL);
        LIZ.append(", attachProductCardValue=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", attachTalentLiveCardValue=");
        LIZ.append(this.LJLJI);
        LIZ.append(", attachStoreCardValue=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", scene=");
        return q.LIZIZ(LIZ, this.LJLJJL, ')', LIZ);
    }

    public final String getAttachProductCardValue() {
        return this.LJLILLLLZI;
    }

    public final C51222K8k getAttachStoreCardValue() {
        return this.LJLJJI;
    }

    public final KBG getAttachTalentLiveCardValue() {
        return this.LJLJI;
    }

    public final KBE getCardType() {
        return this.LJLIL;
    }

    public final String getScene() {
        return this.LJLJJL;
    }

    public C51244K9g(KBE kbe, String str, KBG kbg, C51222K8k c51222K8k, String str2) {
        this.LJLIL = kbe;
        this.LJLILLLLZI = str;
        this.LJLJI = kbg;
        this.LJLJJI = c51222K8k;
        this.LJLJJL = str2;
    }

    public /* synthetic */ C51244K9g(KBE kbe, String str, KBG kbg, C51222K8k c51222K8k, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : kbe, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : kbg, (i & 8) != 0 ? null : c51222K8k, (i & 16) == 0 ? str2 : null);
    }
}
