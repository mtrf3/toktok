package X;

import kotlin.jvm.internal.o;

/* renamed from: X.KLz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51575KLz extends AbstractC65781Prl implements InterfaceC88471Ynr<String, C188727au, C76800UCe> {
    public static final C51575KLz LJLIL = new C51575KLz();

    public C51575KLz() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(String str, C188727au c188727au) {
        String eventName = str;
        C188727au eventMapBuilder = c188727au;
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(eventMapBuilder, "eventMapBuilder");
        eventMapBuilder.LJI("search_id", C17N.LJJJJLL().If().LIZJ().LJLJI);
        FMX.LJIIL(eventName, eventMapBuilder.LIZ);
        return C76800UCe.LIZ;
    }
}
