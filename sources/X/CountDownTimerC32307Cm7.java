package X;

import android.os.CountDownTimer;

/* renamed from: X.Cm7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class CountDownTimerC32307Cm7 extends CountDownTimer {
    public final /* synthetic */ T4Y LIZ;
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZLLL;

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
    }

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        C29306Beo.LJI(this.LIZ);
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LIZIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(this.LIZJ));
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_gift_panel_bottom_faq_button_show");
        LIZ.LJI();
        LIZ.LJJIIJZLJL();
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZLLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CountDownTimerC32307Cm7(long j, T4Y t4y, InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(j, j);
        this.LIZ = t4y;
        this.LIZIZ = interfaceC88472Yns;
        this.LIZJ = z;
        this.LIZLLL = interfaceC65784Pro;
    }
}
