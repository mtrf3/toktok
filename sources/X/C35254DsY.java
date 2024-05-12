package X;

import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;

/* renamed from: X.DsY, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35254DsY extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35254DsY LJLIL = new C35254DsY();

    public C35254DsY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        AwemeHostApplication LIZ = FKM.LIZ();
        boolean z = false;
        if (LIZ != null && C35820E4a.LIZ(LIZ, 0, "xjl_main_looper_opt_exp") == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
