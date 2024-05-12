package Y;

import X.InterfaceC29937Boz;
import X.InterfaceC65784Pro;
import com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService;

/* loaded from: classes2.dex */
public class IDaS212S0100000_1 implements InterfaceC29937Boz {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC29937Boz
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public static final void run$0(IDaS212S0100000_1 iDaS212S0100000_1) {
        ((InterfaceC65784Pro) iDaS212S0100000_1.l0).invoke();
    }

    public static final void run$1(IDaS212S0100000_1 iDaS212S0100000_1) {
        ((IPrivacyService) iDaS212S0100000_1.l0).LJ();
    }

    public IDaS212S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
