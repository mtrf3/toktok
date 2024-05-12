package X;

/* renamed from: X.Iv4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48150Iv4 {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(int i, String str, long j, String str2, String str3) {
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("duration", C44847Hit.LIZ(j));
        c198517qh.LIZ.put("downloader_scene", str);
        c198517qh.LIZ.put("request_log", str2);
        c198517qh.LIZ.put("error_msg", str3);
        c198517qh.LIZ.put("network_client", "ttnet");
        C09900aA.LJIIJJI("downloader_monitor", i, c198517qh.LJ());
    }

    public static final void LIZIZ(long j, int i, String str, InterfaceC37276Ek4 interfaceC37276Ek4, C64797Pbt c64797Pbt, String str2) {
        Object obj;
        String str3 = null;
        if (interfaceC37276Ek4 != null && c64797Pbt != null && (interfaceC37276Ek4 instanceof InterfaceC37818Eso)) {
            ((InterfaceC37818Eso) interfaceC37276Ek4).doCollect();
            C36910EeA c36910EeA = c64797Pbt.LIZ;
            if (c36910EeA != null) {
                obj = c36910EeA.LJFF;
            } else {
                obj = null;
            }
            if (obj instanceof C64672PZs) {
                str3 = ((C64668PZo) obj).LJIL;
            }
        }
        LIZ(i, str, j, str3, str2);
    }
}
