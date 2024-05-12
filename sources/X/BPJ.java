package X;

/* loaded from: classes6.dex */
public final class BPJ implements InterfaceC29937Boz {
    public final /* synthetic */ InterfaceC92693kP LIZ;
    public final /* synthetic */ BIK LIZIZ;
    public final /* synthetic */ BZA LIZJ;
    public final /* synthetic */ InterfaceC67352kd<Boolean> LIZLLL;

    public BPJ(InterfaceC92693kP interfaceC92693kP, BIK bik, BZA bza, C84654XKg c84654XKg) {
        this.LIZ = interfaceC92693kP;
        this.LIZIZ = bik;
        this.LIZJ = bza;
        this.LIZLLL = c84654XKg;
    }

    @Override // X.InterfaceC29937Boz
    public final void run() {
        String str;
        InterfaceC92693kP interfaceC92693kP = this.LIZ;
        if (interfaceC92693kP != null) {
            interfaceC92693kP.dispose();
        }
        boolean LJ = C40210FqI.LJ(this.LIZIZ.LIZ);
        BZA bza = this.LIZJ;
        bza.getClass();
        if (LJ) {
            str = "setting_success";
        } else {
            str = "cancel_setting";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_overlay_permission_banner_left");
        C06510Nj.LIZ((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id");
        LIZ.LJIJJ(bza.LIZ, "enter_from");
        C78895Uxn.LIZIZ(LIZ, str, "action_type", LJ ? 1 : 0, "is_success");
        LIZ.LJIJJ("before_live", "scene_type");
        LIZ.LJJIIJZLJL();
        InterfaceC67352kd<Boolean> interfaceC67352kd = this.LIZLLL;
        Boolean bool = Boolean.FALSE;
        C3C5.m7constructorimpl(bool);
        interfaceC67352kd.resumeWith(bool);
    }
}
