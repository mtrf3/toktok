package X;

/* loaded from: classes8.dex */
public final class H86 extends AbstractC65781Prl implements InterfaceC88476Ynw<String, String, Long, String, String, String, C76800UCe> {
    public final /* synthetic */ InterfaceC67352kd<C08600Vk<String, String, String, String>> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H86(C84654XKg c84654XKg) {
        super(6);
        this.LJLIL = c84654XKg;
    }

    @Override // X.InterfaceC88476Ynw
    public final C76800UCe invoke(String str, String str2, Long l, String str3, String str4, String str5) {
        l.longValue();
        InterfaceC67352kd<C08600Vk<String, String, String, String>> interfaceC67352kd = this.LJLIL;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        C08600Vk c08600Vk = new C08600Vk(str, str2, "", "");
        C3C5.m7constructorimpl(c08600Vk);
        interfaceC67352kd.resumeWith(c08600Vk);
        return C76800UCe.LIZ;
    }
}
