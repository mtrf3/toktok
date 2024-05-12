package X;

import android.app.backup.BackupManager;
import android.os.Handler;
import com.ss.android.ugc.aweme.AutobackupService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EKW<T> implements InterfaceC64592gB {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ Boolean LJLILLLLZI;
    public final /* synthetic */ PolicyNoticeServiceImpl LJLJI;

    public EKW(boolean z, Boolean bool, PolicyNoticeServiceImpl policyNoticeServiceImpl) {
        this.LJLIL = z;
        this.LJLILLLLZI = bool;
        this.LJLJI = policyNoticeServiceImpl;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        BaseResponse baseResponse = (BaseResponse) obj;
        if (this.LJLIL) {
            AutobackupService.LIZJ().LIZIZ().edit().putLong("last_acceptance_time", baseResponse.extra.now).apply();
            BackupManager.dataChanged(FKM.LIZ().getPackageName());
        }
        if (o.LJ(this.LJLILLLLZI, Boolean.TRUE)) {
            this.LJLJI.getClass();
            new Handler(C16880lQ.LLJJJJ()).postDelayed(RunnableC39349FcP.LJLIL, 500L);
        }
    }
}
