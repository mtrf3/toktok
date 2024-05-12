package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WnT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83351WnT extends AbstractC83369Wnl {
    public final String LIZJ;
    public final List<EnumC83408WoO> LIZLLL;
    public final String LJ;
    public final String LJFF;
    public List<? extends AbstractC83320Wmy> LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public final boolean LJIIJ;
    public final EnumC83359Wnb LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;

    public C83351WnT() {
        throw null;
    }

    public final String LIZIZ() {
        if (!this.LIZLLL.isEmpty()) {
            return ORZ.LLD(this.LIZLLL, ",", null, null, C83368Wnk.LJLIL, 30);
        }
        return EnumC83408WoO.NON_CREATION.getValue();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("type: ");
        LIZ.append(EnumC83358Wna.BOT);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC83369Wnl
    public final EnumC83358Wna LIZ() {
        return EnumC83358Wna.BOT;
    }

    public C83351WnT(String text, List creationType, String str, String str2, List list, boolean z, EnumC83359Wnb botMessageType, int i) {
        int i2;
        boolean z2;
        creationType = (i & 2) != 0 ? C61878OQg.INSTANCE : creationType;
        str = (i & 4) != 0 ? null : str;
        str2 = (i & 8) != 0 ? null : str2;
        list = (i & 16) != 0 ? null : list;
        if ((i & 32) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 64) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = (i & 128) == 0 ? 0 : -1;
        z = (i & 256) != 0 ? false : z;
        botMessageType = (i & 512) != 0 ? EnumC83359Wnb.NORMAL : botMessageType;
        o.LJIIIZ(text, "text");
        o.LJIIIZ(creationType, "creationType");
        o.LJIIIZ(botMessageType, "botMessageType");
        this.LIZJ = text;
        this.LIZLLL = creationType;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = list;
        this.LJII = i2;
        this.LJIIIIZZ = z2;
        this.LJIIIZ = i3;
        this.LJIIJ = z;
        this.LJIIJJI = botMessageType;
        this.LJIIL = false;
    }
}
