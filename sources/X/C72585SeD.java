package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.SeD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72585SeD implements InterfaceC72580Se8 {
    public static final /* synthetic */ int LJIIJJI = 0;
    public final String LIZ;
    public final String LIZIZ;
    public final EnumC46494IMo LIZJ;
    public final String LIZLLL;
    public final boolean LJ;
    public final ArrayList<InterfaceC72696Sg0> LJFF;
    public HashMap<String, C72588SeG> LJI;
    public C72549Sdd LJII;
    public C72583SeB LJIIIIZZ;
    public final HashMap<String, C72587SeF> LJIIIZ;
    public String LJIIJ;

    static {
        C16880lQ.LJLLJ(C72584SeC.class);
    }

    @Override // X.InterfaceC72580Se8
    public final ArrayList<InterfaceC72696Sg0> LIZ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC72580Se8
    public final C72549Sdd LIZIZ() {
        return this.LJII;
    }

    @Override // X.InterfaceC72580Se8
    public final HashMap<String, C72588SeG> LIZJ() {
        return this.LJI;
    }

    @Override // X.InterfaceC72580Se8
    public final C72583SeB LIZLLL() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC72580Se8
    public final HashMap<String, C72587SeF> LJ() {
        return this.LJIIIZ;
    }

    @Override // X.InterfaceC72580Se8
    public final boolean LJI() {
        return this.LJ;
    }

    @Override // X.InterfaceC72580Se8
    public final String getGroupId() {
        return this.LJIIJ;
    }

    @Override // X.InterfaceC72580Se8
    public final String getKey() {
        return this.LIZ;
    }

    @Override // X.InterfaceC72580Se8
    public final String getName() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC72580Se8
    public final EnumC46494IMo getType() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC72580Se8
    public final void LJFF(HashMap<String, C72588SeG> hashMap) {
        o.LJIIIZ(hashMap, "<set-?>");
        this.LJI = hashMap;
    }

    public C72585SeD(String str, String str2, EnumC46494IMo type, String str3, boolean z) {
        o.LJIIIZ(type, "type");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = type;
        this.LIZLLL = str3;
        this.LJ = z;
        this.LJFF = new ArrayList<>();
        this.LJI = new LinkedHashMap();
        this.LJIIIZ = new LinkedHashMap();
    }
}
