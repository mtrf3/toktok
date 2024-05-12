package X;

import android.os.CountDownTimer;

/* loaded from: classes9.dex */
public final class J1P extends CountDownTimer {
    public final /* synthetic */ InterfaceC46330IGg LIZ;

    @Override // android.os.CountDownTimer
    public final void onFinish() {
        this.LIZ.LJJIIJZLJL(1.0f, 1.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J1P(InterfaceC46330IGg interfaceC46330IGg) {
        super(2000L, 40L);
        this.LIZ = interfaceC46330IGg;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        float f = 1.0f - ((((float) j) * 1.0f) / ((float) 2000));
        this.LIZ.LJJIIJZLJL(f, f);
    }
}
