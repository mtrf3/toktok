package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WnX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83355WnX extends AbstractC83369Wnl {
    public final EnumC83354WnW LIZJ;
    public final String LIZLLL;
    public List<String> LJ;
    public boolean LJFF;
    public final String LJI;
    public boolean LJII;

    public C83355WnX() {
        throw null;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("type: ");
        LIZ.append(EnumC83358Wna.SYSTEM);
        LIZ.append(" \nsystemMessageType: ");
        LIZ.append(this.LIZJ);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC83369Wnl
    public final EnumC83358Wna LIZ() {
        return EnumC83358Wna.SYSTEM;
    }

    public C83355WnX(EnumC83354WnW systemMessageType, String str, List list, int i) {
        boolean z;
        str = (i & 2) != 0 ? null : str;
        list = (i & 4) != 0 ? null : list;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = (i & 32) != 0;
        o.LJIIIZ(systemMessageType, "systemMessageType");
        this.LIZJ = systemMessageType;
        this.LIZLLL = str;
        this.LJ = list;
        this.LJFF = z;
        this.LJI = null;
        this.LJII = z2;
    }
}
