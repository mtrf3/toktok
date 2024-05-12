package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.ScreenTimeDailyUsage;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Mg5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57413Mg5 implements InterfaceC116954iR<BaseResponse> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ List<ScreenTimeDailyUsage> LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

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
        int i = C57412Mg4.LIZ;
        if (i > 0) {
            C57412Mg4.LIZ = i - 1;
            C57412Mg4.LIZIZ(this.LJLJI, this.LJLILLLLZI, this.LJLIL);
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(BaseResponse baseResponse) {
        BaseResponse t = baseResponse;
        o.LJIIIZ(t, "t");
        if (t.status_code == 0) {
            C57412Mg4.LIZ = 3;
            return;
        }
        int i = C57412Mg4.LIZ;
        if (i <= 0) {
            return;
        }
        C57412Mg4.LIZ = i - 1;
        C57412Mg4.LIZIZ(this.LJLJI, this.LJLILLLLZI, this.LJLIL);
    }

    public C57413Mg5(long j, List<ScreenTimeDailyUsage> list, int i) {
        this.LJLIL = j;
        this.LJLILLLLZI = list;
        this.LJLJI = i;
    }
}
