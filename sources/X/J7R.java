package X;

import com.ss.android.ugc.aweme.kids.common.response.KidsSettings;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J7R implements InterfaceC116954iR<KidsSettings> {
    public final /* synthetic */ J7S LJLIL;
    public final /* synthetic */ J7Q LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ long LJLJJI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        J7S j7s = this.LJLIL;
        if (j7s != null) {
            j7s.onError();
        }
        int i = J7M.LIZLLL;
        if (i > 0) {
            J7M.LIZLLL = i - 1;
            this.LJLILLLLZI.LIZ(this.LJLIL, 3);
        }
        AFJ.LIZ(this.LJLJI, -1, this.LJLJJI, "kids_api_compliance_settings");
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(KidsSettings kidsSettings) {
        KidsSettings setting = kidsSettings;
        o.LJIIIZ(setting, "setting");
        if (setting.status_code == 0) {
            J7S j7s = this.LJLIL;
            if (j7s != null) {
                j7s.LIZIZ(setting);
            }
            J7M.LIZLLL = 3;
        } else {
            J7S j7s2 = this.LJLIL;
            if (j7s2 != null) {
                j7s2.onError();
            }
            int i = J7M.LIZLLL;
            if (i > 0) {
                J7M.LIZLLL = i - 1;
                this.LJLILLLLZI.LIZ(this.LJLIL, 2);
            }
        }
        AFJ.LIZ(this.LJLJI, 0, this.LJLJJI, "kids_api_compliance_settings");
    }

    public J7R(J7S j7s, J7Q j7q, int i, long j) {
        this.LJLIL = j7s;
        this.LJLILLLLZI = j7q;
        this.LJLJI = i;
        this.LJLJJI = j;
    }
}
