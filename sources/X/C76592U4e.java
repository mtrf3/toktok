package X;

import android.app.Activity;

/* renamed from: X.U4e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76592U4e implements UDJ {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ OSZ<Boolean, String> LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZLLL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJ;

    @Override // X.UDJ
    public final void cancel() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        TWL.LIZ.LJIILJJIL("cancel", new String[]{this.LIZIZ.getSecond()}, this.LIZJ);
    }

    @Override // X.UDJ
    public final void execute() {
        OHI ohi = OHI.LIZ;
        Activity activity = this.LIZ;
        String second = this.LIZIZ.getSecond();
        ohi.getClass();
        OHI.LJIIIIZZ(activity, second);
        TWL.LIZ.LJIILJJIL("set", new String[]{this.LIZIZ.getSecond()}, this.LIZJ);
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZLLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public C76592U4e(Activity activity, OSZ<Boolean, String> osz, boolean z, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        this.LIZ = activity;
        this.LIZIZ = osz;
        this.LIZJ = z;
        this.LIZLLL = interfaceC65784Pro;
        this.LJ = interfaceC65784Pro2;
    }
}
