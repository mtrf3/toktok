package X;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9Hx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C234419Hx {
    public int LIZ;
    public C9HK LIZIZ;
    public EnumC234309Hm LIZJ;
    public Integer LIZLLL;
    public String LJ;
    public InterfaceC65784Pro<C76800UCe> LJFF;
    public final int LJI;
    public boolean LJII;
    public C234409Hw LJIIIIZZ;
    public final java.util.Map<Integer, Float> LJIIIZ;
    public List<C252659vp> LJIIJ;

    public C234419Hx() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C234419Hx)) {
            return false;
        }
        C234419Hx c234419Hx = (C234419Hx) obj;
        return this.LIZ == c234419Hx.LIZ && this.LIZIZ == c234419Hx.LIZIZ && this.LIZJ == c234419Hx.LIZJ && o.LJ(this.LIZLLL, c234419Hx.LIZLLL) && o.LJ(this.LJ, c234419Hx.LJ) && o.LJ(this.LJFF, c234419Hx.LJFF) && this.LJI == c234419Hx.LJI && this.LJII == c234419Hx.LJII && o.LJ(this.LJIIIIZZ, c234419Hx.LJIIIIZZ) && o.LJ(this.LJIIIZ, c234419Hx.LJIIIZ) && o.LJ(this.LJIIJ, c234419Hx.LJIIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int i = this.LIZ * 31;
        C9HK c9hk = this.LIZIZ;
        int hashCode = (i + (c9hk == null ? 0 : c9hk.hashCode())) * 31;
        EnumC234309Hm enumC234309Hm = this.LIZJ;
        int hashCode2 = (hashCode + (enumC234309Hm == null ? 0 : enumC234309Hm.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.LJ;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJFF;
        int hashCode5 = (((hashCode4 + (interfaceC65784Pro == null ? 0 : interfaceC65784Pro.hashCode())) * 31) + this.LJI) * 31;
        boolean z = this.LJII;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode5 + i2) * 31;
        C234409Hw c234409Hw = this.LJIIIIZZ;
        int hashCode6 = (i3 + (c234409Hw == null ? 0 : c234409Hw.hashCode())) * 31;
        java.util.Map<Integer, Float> map = this.LJIIIZ;
        int hashCode7 = (hashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        List<C252659vp> list = this.LJIIJ;
        return hashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "ProfileCTASingleFeatureInfo(order=" + this.LIZ + ", curStyle=" + this.LIZIZ + ", maxStyle=" + this.LIZJ + ", iconRes=" + this.LIZLLL + ", text=" + this.LJ + ", clickFunc=" + this.LJFF + ", textSize=" + this.LJI + ", hasAlertBadge=" + this.LJII + ", view=" + this.LJIIIIZZ + ", viewWidth=" + this.LJIIIZ + ", actionList=" + this.LJIIJ + ')';
    }

    public C234419Hx(Object obj) {
        C9HK c9hk = C9HK.SHEET;
        EnumC234309Hm enumC234309Hm = EnumC234309Hm.SHEET;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = -1;
        this.LIZIZ = c9hk;
        this.LIZJ = enumC234309Hm;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = 15;
        this.LJII = false;
        this.LJIIIIZZ = null;
        this.LJIIIZ = linkedHashMap;
        this.LJIIJ = null;
    }
}
