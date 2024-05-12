package X;

/* loaded from: classes8.dex */
public final class HJB extends AbstractC65781Prl implements InterfaceC88476Ynw<String, String, Long, String, String, String, C76800UCe> {
    public final /* synthetic */ InterfaceC88476Ynw<String, String, Long, String, String, String, C76800UCe> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HJB(InterfaceC88476Ynw<? super String, ? super String, ? super Long, ? super String, ? super String, ? super String, C76800UCe> interfaceC88476Ynw) {
        super(6);
        this.LJLIL = interfaceC88476Ynw;
    }

    @Override // X.InterfaceC88476Ynw
    public final C76800UCe invoke(String str, String str2, Long l, String str3, String str4, String str5) {
        this.LJLIL.invoke(str, str2, Long.valueOf(l.longValue()), str3, str4, str5);
        return C76800UCe.LIZ;
    }
}
