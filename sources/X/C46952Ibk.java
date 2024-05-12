package X;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Ibk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46952Ibk extends C46946Ibe {
    public final InterfaceC46926IbK LJFF;
    public final java.util.Map<Integer, InterfaceC46926IbK> LJI;

    public static int LJI(IY3 iy3) {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        if (iy3 == null) {
            return -1;
        }
        Double valueOf = Double.valueOf(iy3.LIZ());
        Double valueOf2 = Double.valueOf(iy3.LJ());
        Double valueOf3 = Double.valueOf(iy3.LIZIZ());
        Double valueOf4 = Double.valueOf(iy3.LIZLLL());
        Double valueOf5 = Double.valueOf(iy3.LIZJ());
        int i = 0;
        if (valueOf == null) {
            hashCode = 0;
        } else {
            hashCode = valueOf.hashCode();
        }
        if (valueOf2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = valueOf2.hashCode();
        }
        if (valueOf3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = valueOf3.hashCode();
        }
        if (valueOf4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = valueOf4.hashCode();
        }
        if (valueOf5 != null) {
            i = valueOf5.hashCode();
        }
        return ((((((((hashCode + 31) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
    }

    public C46952Ibk(InterfaceC46949Ibh interfaceC46949Ibh, InterfaceC46926IbK interfaceC46926IbK) {
        super(interfaceC46949Ibh);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.LJI = concurrentHashMap;
        this.LJFF = interfaceC46926IbK;
        concurrentHashMap.put(Integer.valueOf(LJI(this.LIZLLL)), interfaceC46926IbK);
    }

    @Override // X.C46946Ibe, X.InterfaceC46926IbK
    public final IYO LIZIZ(List<? extends IYN> list, java.util.Map<String, Object> map) {
        Object obj = map.get("KEY_AUTO_BITRATE_SET");
        if (obj instanceof IY3) {
            IY3 iy3 = (IY3) obj;
            InterfaceC46926IbK interfaceC46926IbK = (InterfaceC46926IbK) ((ConcurrentHashMap) this.LJI).get(Integer.valueOf(LJI(iy3)));
            if (interfaceC46926IbK == null) {
                C46953Ibl c46953Ibl = new C46953Ibl(this.LIZ);
                c46953Ibl.LIZLLL = iy3;
                c46953Ibl.LIZJ = this.LIZJ;
                c46953Ibl.LIZIZ = this.LIZIZ;
                interfaceC46926IbK = c46953Ibl.LIZ();
                ((ConcurrentHashMap) this.LJI).put(Integer.valueOf(LJI(iy3)), interfaceC46926IbK);
            }
            return interfaceC46926IbK.LIZIZ(list, map);
        }
        return this.LJFF.LIZIZ(list, map);
    }
}
