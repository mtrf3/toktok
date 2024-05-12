package X;

import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KBG implements Serializable {
    public final String LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    public KBG() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ KBG copy$default(KBG kbg, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kbg.LJLIL;
        }
        return kbg.copy(str);
    }

    public final KBG copy(String str) {
        return new KBG(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof KBG) && o.LJ(this.LJLIL, ((KBG) obj).LJLIL);
    }

    public int hashCode() {
        String str = this.LJLIL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TalentLiveCard(creatorId=");
        return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public final String getCreatorId() {
        return this.LJLIL;
    }

    public KBG(String str) {
        this.LJLIL = str;
    }

    public /* synthetic */ KBG(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
