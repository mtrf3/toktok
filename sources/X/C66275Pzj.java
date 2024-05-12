package X;

import java.util.LinkedHashMap;

/* renamed from: X.Pzj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66275Pzj implements InterfaceC39518Ff8 {
    @Override // X.InterfaceC39518Ff8
    public final C39519Ff9 preInvoke(int i, String str, String str2, Object obj, Object[] objArr, String str3, C65300Pk0 c65300Pk0) {
        boolean LIZ;
        C66282Pzq c66282Pzq = (C66282Pzq) ((LinkedHashMap) C66277Pzl.LIZIZ).get(Integer.valueOf(i));
        if (c66282Pzq != null) {
            InterfaceC66285Pzt interfaceC66285Pzt = c66282Pzq.LIZLLL;
            if (interfaceC66285Pzt != null && !interfaceC66285Pzt.LIZ(objArr)) {
                LIZ = true;
            } else {
                LIZ = c66282Pzq.LIZ.LIZ(c66282Pzq.LIZIZ, c66282Pzq.LIZJ.LIZ(str, str2, objArr), i, str, str2, str3, c65300Pk0);
            }
            if (LIZ) {
                c65300Pk0.LIZ(Boolean.FALSE, "api_cached");
                return new C39519Ff9(null, false);
            }
            c65300Pk0.LIZ(Boolean.TRUE, "api_cached");
            return new C39519Ff9(c66282Pzq.LIZIZ.get(c66282Pzq.LIZJ.LIZ(str, str2, objArr)), true);
        }
        return new C39519Ff9(null, false);
    }

    @Override // X.InterfaceC39518Ff8
    public final void postInvoke(int i, String str, String str2, Object obj, Object[] objArr, Object obj2, C65300Pk0 c65300Pk0, boolean z) {
        C66282Pzq c66282Pzq = (C66282Pzq) ((LinkedHashMap) C66277Pzl.LIZIZ).get(Integer.valueOf(i));
        if (c66282Pzq != null) {
            InterfaceC66285Pzt interfaceC66285Pzt = c66282Pzq.LIZLLL;
            if (interfaceC66285Pzt != null && !interfaceC66285Pzt.LIZ(objArr)) {
                return;
            }
            String LIZ = c66282Pzq.LIZJ.LIZ(str, str2, objArr);
            if (!z) {
                return;
            }
            c66282Pzq.LIZIZ.LIZIZ(LIZ, obj2);
        }
    }
}
