package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class R5E extends AbstractC65781Prl implements InterfaceC88472Yns<ARN, C76800UCe> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ C85531XhX LJLILLLLZI;
    public final /* synthetic */ BaseLoginMethod LJLJI;
    public final /* synthetic */ Context LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R5E(int i, C85531XhX c85531XhX, BaseLoginMethod baseLoginMethod, Context context) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = c85531XhX;
        this.LJLJI = baseLoginMethod;
        this.LJLJJI = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ARN it) {
        Activity LJIJJ;
        Bundle bundle;
        o.LJIIIZ(it, "it");
        if (this.LJLIL < 0) {
            return;
        }
        this.LJLILLLLZI.LJLIL.remove(this.LJLJI);
        C68517Qun.LIZ.LJIILLIIL(this.LJLJI.getUid());
        C85531XhX c85531XhX = this.LJLILLLLZI;
        BaseLoginMethod baseLoginMethod = this.LJLJI;
        c85531XhX.getClass();
        long time = baseLoginMethod.getExpires().getTime() - 2592000000L;
        Long lastActiveTime = baseLoginMethod.getLastActiveTime();
        if (lastActiveTime != null) {
            long longValue = lastActiveTime.longValue();
            if (longValue < 0) {
                time = longValue;
            }
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("user_id", baseLoginMethod.getUid());
        c188727au.LJIIIZ("last_active", R3P.LIZ(time));
        c188727au.LJIIIZ("platform", R5D.LIZIZ(baseLoginMethod));
        c188727au.LIZLLL(c85531XhX.LJLIL.size(), "user_cnt");
        FMX.LJIIL("login_notify_remove_account_confirm", c188727au.LIZ);
        if (C53262KvK.LIZIZ()) {
            this.LJLILLLLZI.LJLLLLLL();
            if (this.LJLILLLLZI.LJLIL.size() == 0 && (LJIJJ = C45804HyK.LJIJJ(this.LJLJJI)) != null) {
                C85531XhX c85531XhX2 = this.LJLILLLLZI;
                LJIJJ.finish();
                Intent intent = LJIJJ.getIntent();
                if (intent == null || (bundle = C16880lQ.LJJLIIIIJ(intent, "origin_bundle")) == null) {
                    bundle = new Bundle();
                }
                if (c85531XhX2.LJLJJL.hv0() && !c85531XhX2.LJLJJL.gv0()) {
                    C68971R5b.LIZJ(LJIJJ, bundle, true, true, false);
                    return;
                }
                return;
            }
            return;
        }
        this.LJLILLLLZI.notifyItemRemoved(this.LJLIL);
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(ARN arn) {
        invoke2(arn);
        return C76800UCe.LIZ;
    }
}
