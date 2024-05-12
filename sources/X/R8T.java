package X;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashMap;

/* loaded from: classes12.dex */
public final class R8T<T> implements InterfaceC73518StG {
    public final /* synthetic */ java.util.Map<String, String> LIZ;
    public final /* synthetic */ InterfaceC69056R8i LIZIZ;
    public final /* synthetic */ Integer LIZJ;
    public final /* synthetic */ String LIZLLL;
    public final /* synthetic */ String LJ;
    public final /* synthetic */ int LJFF;
    public final /* synthetic */ String LJI;
    public final /* synthetic */ Fragment LJII;

    public R8T(int i, Fragment fragment, InterfaceC69056R8i interfaceC69056R8i, Integer num, String str, String str2, String str3, java.util.Map map) {
        this.LIZ = map;
        this.LIZIZ = interfaceC69056R8i;
        this.LIZJ = num;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = i;
        this.LJI = str3;
        this.LJII = fragment;
    }

    @Override // X.InterfaceC73518StG
    public final void LIZ(C73516StE c73516StE) {
        R81 r81 = new R81(this.LIZIZ, this.LJI, this.LJFF, this.LJII, c73516StE);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        java.util.Map<String, String> map = this.LIZ;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        RA4.Companion.getClass();
        C69093R9t.LJJIIJ(RA4.ruleStrategies$delegate.getValue(), linkedHashMap);
        this.LIZIZ.bi(r81);
        if (this.LIZJ == null) {
            this.LIZIZ.r9().LIZLLL(this.LIZLLL, this.LJ, this.LJFF, linkedHashMap, r81);
        } else {
            this.LIZIZ.r9().LJIJI(this.LIZLLL, this.LJ, this.LJFF, this.LIZJ.intValue(), linkedHashMap, r81);
        }
    }
}
