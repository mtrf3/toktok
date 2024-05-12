package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ld8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54682Ld8 extends AbstractC65781Prl implements InterfaceC88472Yns<java.util.Map<String, String>, C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54682Ld8(String str, int i, long j) {
        super(1);
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(java.util.Map<String, String> map) {
        java.util.Map<String, String> onEventV3 = map;
        o.LJIIIZ(onEventV3, "$this$onEventV3");
        onEventV3.put("enter_from", "homepage_nearby");
        C54652Lce.LJ("action_type", onEventV3, this.LJLIL);
        C54652Lce.LJ("watch_num", onEventV3, Integer.valueOf(this.LJLILLLLZI));
        C54652Lce.LJ("stay_time", onEventV3, Long.valueOf(this.LJLJI));
        return C76800UCe.LIZ;
    }
}
