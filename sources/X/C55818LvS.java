package X;

import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.LvS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C55818LvS extends TBS implements InterfaceC88472Yns<java.util.Map<String, ? extends String>, C76800UCe> {
    public C55818LvS(C56045Lz7 c56045Lz7) {
        super(1, c56045Lz7, C56045Lz7.class, "sendCartEntryClickEvent", "sendCartEntryClickEvent(Ljava/util/Map;)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(java.util.Map<String, ? extends String> map) {
        java.util.Map<String, ? extends String> p0 = map;
        o.LJIIIZ(p0, "p0");
        this.receiver.getClass();
        C76542zS.LIZJ("tiktokec_cart_entrance_click", new AqS174S0100000_8(p0, (java.util.Map<String, String>) 198));
        return C76800UCe.LIZ;
    }
}
