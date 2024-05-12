package X;

import java.util.LinkedHashMap;

/* renamed from: X.NqH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60593NqH implements InterfaceC60012Ngu {
    public final /* synthetic */ boolean LIZ;

    public C60593NqH(boolean z) {
        this.LIZ = z;
    }

    @Override // X.InterfaceC60012Ngu
    public final C60595NqJ LIZ(C60595NqJ c60595NqJ) {
        String str;
        C60595NqJ c60595NqJ2 = new C60595NqJ((String) c60595NqJ.LJLILLLLZI, (java.util.Map) c60595NqJ.LJLJI);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (this.LIZ) {
            str = "dark";
        } else {
            str = "light";
        }
        try {
            linkedHashMap.put("mode", str);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        java.util.Map map = (java.util.Map) c60595NqJ.LJLJI;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        c60595NqJ2.LJLJI = linkedHashMap;
        return c60595NqJ2;
    }
}
