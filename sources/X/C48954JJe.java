package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.s0;
import kotlin.jvm.internal.IDqS37S0300000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JJe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48954JJe {
    public final Aweme LIZ;
    public final java.util.Map<String, String> LIZIZ;
    public final InterfaceC88473Ynt<View, Aweme, Integer, C76800UCe> LIZJ;
    public final Integer LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48954JJe)) {
            return false;
        }
        C48954JJe c48954JJe = (C48954JJe) obj;
        return o.LJ(this.LIZ, c48954JJe.LIZ) && o.LJ(this.LIZIZ, c48954JJe.LIZIZ) && o.LJ(this.LIZJ, c48954JJe.LIZJ) && o.LJ(this.LIZLLL, c48954JJe.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        int LIZ = C12400eC.LIZ(this.LIZIZ, this.LIZ.hashCode() * 31, 31);
        InterfaceC88473Ynt<View, Aweme, Integer, C76800UCe> interfaceC88473Ynt = this.LIZJ;
        int i = 0;
        if (interfaceC88473Ynt == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC88473Ynt.hashCode();
        }
        int i2 = (LIZ + hashCode) * 31;
        Integer num = this.LIZLLL;
        if (num != null) {
            i = num.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BotVideoItem(aweme=");
        LIZ.append(this.LIZ);
        LIZ.append(", params=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", clickListener=");
        LIZ.append(this.LIZJ);
        LIZ.append(", videoCount=");
        return s0.LIZJ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C48954JJe(Aweme aweme, java.util.Map map, IDqS37S0300000_8 iDqS37S0300000_8, Integer num) {
        o.LJIIIZ(aweme, "aweme");
        this.LIZ = aweme;
        this.LIZIZ = map;
        this.LIZJ = iDqS37S0300000_8;
        this.LIZLLL = num;
    }
}
