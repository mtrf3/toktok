package djb;

import X.AnonymousClass315;
import X.C16880lQ;
import X.C34B;
import X.C36922EeM;
import X.C36L;
import X.C37R;
import X.C63337OtR;
import X.C78983UzD;
import X.H78;
import X.MB6;
import X.MBA;
import X.X1D;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes2.dex */
public class IDaS20S0000000_1 extends MB6 implements CoroutineExceptionHandler {
    public final int $t;

    public static final void handleException$12(IDaS20S0000000_1 iDaS20S0000000_1, MBA mba, Throwable th) {
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(MBA mba, Throwable th) {
        switch (this.$t) {
            case 0:
                C34B.LJFF(th);
                return;
            case 1:
                C34B.LJ("UnboundedViewPool", th);
                return;
            case 2:
                C34B.LIZLLL("MAFSource-startup", "Error refreshing MAF user", th);
                return;
            case 3:
                handleException$3(this, mba, th);
                return;
            case 4:
                C34B.LJ("ActionBarResourceManager", th);
                return;
            case 5:
                C34B.LJFF(th);
                return;
            case 6:
                C34B.LJ("SnackBarUtils", th);
                return;
            case 7:
                C34B.LJ("GroupShareViewModel", th);
                return;
            case 8:
                C34B.LJFF(th);
                return;
            case 9:
                handleException$9(this, mba, th);
                return;
            case 10:
                C34B.LJFF(th);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                C63337OtR.LJ("IMUseCaseClient", th);
                return;
            case 12:
                handleException$12(this, mba, th);
                return;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                C34B.LIZLLL("MAFLoader", "Error refreshing MAF user", th);
                return;
            case 14:
                C34B.LIZLLL("RecentSharedSortLoader", "Error insert contact", th);
                return;
            case 15:
                C34B.LIZLLL("RecentSharedSortLoader", "Error occurred while inserting contact", th);
                return;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                handleException$16(this, mba, th);
                return;
            case 17:
                C34B.LIZLLL("MAFSource-startup", "Error refreshing MAF user", th);
                return;
            case 18:
                C34B.LJ("ActionBarComponent", th);
                return;
            case 19:
                handleException$19(this, mba, th);
                return;
            case 20:
                C34B.LIZLLL("SessionListManagerV2", "coroutine error", th);
                return;
            case 21:
                C78983UzD.LJIJ(th, "processing quick share items exception");
                return;
            case 22:
                handleException$22(this, mba, th);
                return;
            case 23:
                handleException$23(this, mba, th);
                return;
            case 24:
                handleException$24(this, mba, th);
                return;
            case 25:
                C34B.LIZLLL("TopNoticeViewModel", "fetchTopNoticeService onError called", th);
                return;
            case 26:
                C34B.LIZLLL("TopNoticeViewModel", "sendNoticeAckService onError called", th);
                return;
            case 27:
                handleException$27(this, mba, th);
                return;
            case 28:
                C34B.LIZLLL("ChatNoticeViewModel", "fetchChatNotice onError called", th);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDaS20S0000000_1(AnonymousClass315 anonymousClass315, int i) {
        super(anonymousClass315);
        this.$t = i;
    }

    public static final void handleException$16(IDaS20S0000000_1 iDaS20S0000000_1, MBA mba, Throwable t) {
        if (!(t instanceof CancellationException)) {
            o.LJIIIZ(t, "t");
            if (C36922EeM.LIZ) {
                C36922EeM.LJFF(t);
            }
        }
    }

    public static final void handleException$19(IDaS20S0000000_1 iDaS20S0000000_1, MBA mba, Throwable th) {
        if (!(th instanceof CancellationException)) {
            C34B.LJFF(th);
        }
    }

    public static final void handleException$22(IDaS20S0000000_1 iDaS20S0000000_1, MBA mba, Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Thread[");
        LIZ.append(C16880lQ.LLLLIIIILLL().getName());
        LIZ.append("], exception: ");
        LIZ.append(Log.getStackTraceString(th));
        H78.LIZIZ("SharedAR", X1D.LIZIZ(LIZ));
    }

    public static final void handleException$23(IDaS20S0000000_1 iDaS20S0000000_1, MBA mba, Throwable throwable) {
        o.LJIIIZ(throwable, "throwable");
        C34B.LJ("SessionRefactor-SessionDataMediator", throwable);
    }

    public static final void handleException$24(IDaS20S0000000_1 iDaS20S0000000_1, MBA mba, Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchUserInfo error: ");
        LIZ.append(th);
        C34B.LIZJ("GroupMemberLoader", X1D.LIZIZ(LIZ));
    }

    public static final void handleException$27(IDaS20S0000000_1 iDaS20S0000000_1, MBA mba, Throwable th) {
        String TAG = C37R.LIZIZ;
        o.LJIIIIZZ(TAG, "TAG");
        C34B.LIZLLL(TAG, "coroutine error", th);
    }

    public static final void handleException$3(IDaS20S0000000_1 iDaS20S0000000_1, MBA mba, Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("load friend list failed, reason: ");
        LIZ.append(Log.getStackTraceString(th));
        H78.LIZIZ("SharedAR", X1D.LIZIZ(LIZ));
    }

    public static final void handleException$9(IDaS20S0000000_1 iDaS20S0000000_1, MBA mba, Throwable th) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", "report error");
        hashMap.put("error_desc", th);
        C36L.LJ("send_msg_error", hashMap);
        C36922EeM.LIZ(new RuntimeException(th));
    }
}
