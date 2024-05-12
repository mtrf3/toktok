package Y;

import X.C2U8;
import X.C57412Mg4;
import X.InterfaceC116954iR;
import X.InterfaceC45930I0w;
import X.InterfaceC92693kP;
import X.MIV;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.protection.digitalwellbeing.api.AppOpenedTimesData;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.userservice.UserService;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class IDxS308S0100000_9 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;

    public static final void onComplete$0(IDxS308S0100000_9 iDxS308S0100000_9) {
    }

    public static final void onComplete$1(IDxS308S0100000_9 iDxS308S0100000_9) {
    }

    public static final void onComplete$2(IDxS308S0100000_9 iDxS308S0100000_9) {
    }

    public static final void onError$0(IDxS308S0100000_9 iDxS308S0100000_9, Throwable th) {
    }

    public static final void onError$1(IDxS308S0100000_9 iDxS308S0100000_9, Throwable th) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                return;
            case 1:
                onComplete$1(this);
                return;
            case 2:
                onComplete$2(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                return;
            case 1:
                onError$1(this, th);
                return;
            case 2:
                onError$2(this, th);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                return;
            case 1:
                onNext$1(this, obj);
                return;
            case 2:
                onNext$2(this, obj);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC92693kP);
                return;
            case 1:
                onSubscribe$1(this, interfaceC92693kP);
                return;
            case 2:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            default:
                return;
        }
    }

    public IDxS308S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$2(IDxS308S0100000_9 iDxS308S0100000_9, Throwable e) {
        o.LJIIIZ(e, "e");
        int i = C57412Mg4.LIZ;
        if (i > 0) {
            C57412Mg4.LIZ = i - 1;
            C57412Mg4.LIZ((AppOpenedTimesData) iDxS308S0100000_9.l0);
        }
    }

    public static final void onNext$0(IDxS308S0100000_9 iDxS308S0100000_9, Object obj) {
        ((MIV) iDxS308S0100000_9.l0).LJLJJLL = (InterfaceC45930I0w) obj;
        AVExternalServiceImpl.LIZ().getCurrentUserData().postValue(((MIV) iDxS308S0100000_9.l0).LJLJJLL);
    }

    public static final void onNext$1(IDxS308S0100000_9 iDxS308S0100000_9, Object obj) {
        FollowStatus followStatus = (FollowStatus) obj;
        C2U8.LIZ(new FollowStatusEvent(followStatus));
        UserService.LIZ().LJFF().postValue(followStatus);
    }

    public static final void onNext$2(IDxS308S0100000_9 iDxS308S0100000_9, Object obj) {
        BaseResponse t = (BaseResponse) obj;
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
        C57412Mg4.LIZ((AppOpenedTimesData) iDxS308S0100000_9.l0);
    }

    public static final void onSubscribe$0(IDxS308S0100000_9 iDxS308S0100000_9, InterfaceC92693kP interfaceC92693kP) {
        ((MIV) iDxS308S0100000_9.l0).LJLJJL.LIZ(interfaceC92693kP);
    }

    public static final void onSubscribe$1(IDxS308S0100000_9 iDxS308S0100000_9, InterfaceC92693kP interfaceC92693kP) {
        ((MIV) iDxS308S0100000_9.l0).LJLJJL.LIZ(interfaceC92693kP);
    }
}
