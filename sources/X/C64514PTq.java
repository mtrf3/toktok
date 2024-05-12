package X;

import kotlin.jvm.internal.o;

/* renamed from: X.PTq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64514PTq implements InterfaceC64517PTt<String> {
    public static C64512PTo LJLIL;
    public static C64511PTn LJLILLLLZI;

    @Override // X.InterfaceC64517PTt
    public final InterfaceC64510PTm<String> LIZIZ(C32420Cnw request, C32287Cln config) {
        o.LJIIIZ(request, "request");
        o.LJIIIZ(config, "config");
        if (!request.LJFF) {
            C64511PTn c64511PTn = LJLILLLLZI;
            if (c64511PTn != null) {
                return c64511PTn;
            }
            InterfaceC32418Cnu interfaceC32418Cnu = config.LIZ;
            o.LJIIIIZZ(interfaceC32418Cnu, "config.fileCacheFactory");
            C64511PTn c64511PTn2 = new C64511PTn(new C64519PTv(interfaceC32418Cnu));
            c64511PTn2.LIZJ = new AnonymousClass636();
            LJLILLLLZI = c64511PTn2;
            return c64511PTn2;
        }
        C64512PTo c64512PTo = LJLIL;
        if (c64512PTo != null) {
            return c64512PTo;
        }
        InterfaceC32418Cnu interfaceC32418Cnu2 = config.LIZ;
        o.LJIIIIZZ(interfaceC32418Cnu2, "config.fileCacheFactory");
        C64511PTn c64511PTn3 = new C64511PTn(new C64519PTv(interfaceC32418Cnu2));
        c64511PTn3.LIZJ = new AnonymousClass636();
        C64512PTo c64512PTo2 = new C64512PTo(c64511PTn3);
        c64512PTo2.LIZJ = new C64515PTr();
        LJLIL = c64512PTo2;
        return c64512PTo2;
    }
}
