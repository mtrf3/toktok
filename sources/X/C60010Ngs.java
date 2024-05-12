package X;

/* renamed from: X.Ngs, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60010Ngs implements InterfaceC60012Ngu {
    public final /* synthetic */ InterfaceC60012Ngu LIZ;

    public C60010Ngs(InterfaceC60012Ngu interfaceC60012Ngu) {
        this.LIZ = interfaceC60012Ngu;
    }

    @Override // X.InterfaceC60012Ngu
    public final C60595NqJ LIZ(C60595NqJ c60595NqJ) {
        java.util.Map map;
        C60595NqJ LIZ;
        InterfaceC60012Ngu interfaceC60012Ngu = this.LIZ;
        if (interfaceC60012Ngu != null && (LIZ = interfaceC60012Ngu.LIZ(c60595NqJ)) != null) {
            c60595NqJ = LIZ;
        }
        java.util.Map map2 = (java.util.Map) c60595NqJ.LJLJI;
        if (map2 != null) {
            map = C113554cx.LJJLIL(map2);
            if (map != null) {
                map.put("referer", "https://www.tiktok.com");
                map.put("x-has-set-referer", "1");
            }
        } else {
            map = null;
        }
        c60595NqJ.LJLJI = map;
        return c60595NqJ;
    }
}
