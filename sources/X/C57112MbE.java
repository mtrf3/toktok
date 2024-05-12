package X;

/* renamed from: X.MbE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57112MbE<T> implements InterfaceC64592gB {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public C57112MbE(int i, int i2, boolean z) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        String str;
        String str2;
        String str3;
        int i = this.LJLIL;
        if (i != 81) {
            if (i != 82) {
                str = "other";
            } else {
                str = "business_account";
            }
        } else {
            str = "promote_assistant";
        }
        C188727au c188727au = new C188727au();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setting_type_label_");
        LIZ.append(this.LJLILLLLZI);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (this.LJLJI) {
            str2 = "subscribed";
        } else {
            str2 = "unsubscribed";
        }
        c188727au.LJIIIZ(LIZIZ, str2);
        if (this.LJLJI) {
            str3 = "on";
        } else {
            str3 = "off";
        }
        c188727au.LJIIIZ("to_status", str3);
        c188727au.LJIIIZ("channel_type", str);
        FMX.LJIIL("click_inbox_notification_setting", c188727au.LIZ);
    }
}
