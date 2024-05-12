package X;

/* renamed from: X.PTp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64513PTp implements InterfaceC64517PTt<String> {
    public static C64512PTo LJLILLLLZI;
    public static C64511PTn LJLJI;
    public final C63928P7c LJLIL = new C63928P7c();

    @Override // X.InterfaceC64517PTt
    public final InterfaceC64510PTm<String> LIZIZ(C32420Cnw c32420Cnw, C32287Cln c32287Cln) {
        if (!c32420Cnw.LJFF) {
            C64511PTn c64511PTn = LJLJI;
            if (c64511PTn != null) {
                return c64511PTn;
            }
            C64511PTn c64511PTn2 = new C64511PTn(new C64507PTj(this.LJLIL, c32287Cln.LIZ));
            LJLJI = c64511PTn2;
            return c64511PTn2;
        }
        C64512PTo c64512PTo = LJLILLLLZI;
        if (c64512PTo != null) {
            return c64512PTo;
        }
        C64512PTo c64512PTo2 = new C64512PTo(new C64511PTn(new C64507PTj(this.LJLIL, c32287Cln.LIZ)));
        LJLILLLLZI = c64512PTo2;
        return c64512PTo2;
    }
}
