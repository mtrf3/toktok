package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListFragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.R3t, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68937R3t extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ LoginMethodListFragment LJLILLLLZI;
    public final /* synthetic */ R6R LJLJI;
    public final /* synthetic */ BaseLoginMethod LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68937R3t(String str, LoginMethodListFragment loginMethodListFragment, R6R r6r, BaseLoginMethod baseLoginMethod) {
        super(0);
        this.LJLIL = str;
        this.LJLILLLLZI = loginMethodListFragment;
        this.LJLJI = r6r;
        this.LJLJJI = baseLoginMethod;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        QTX qtx;
        String str = this.LJLIL;
        LoginMethodListFragment loginMethodListFragment = this.LJLILLLLZI;
        R6R r6r = this.LJLJI;
        if (r6r != null) {
            qtx = r6r.LJIIIZ;
        } else {
            qtx = null;
        }
        boolean z = false;
        C68972R5c.LJIIIZ(false, str, loginMethodListFragment, qtx, loginMethodListFragment.q9());
        C68987R5r.LJFF(0, 0, "");
        R6R r6r2 = this.LJLJI;
        o.LJI(r6r2);
        R41.LJIILIIL(r6r2.LJIIIZ);
        Bundle arguments = this.LJLILLLLZI.getArguments();
        o.LJI(arguments);
        this.LJLILLLLZI.mo49getActivity();
        C39326Fc2.LIZIZ(arguments, new AqS177S0100000_11(this.LJLILLLLZI, 10));
        if (o.LJ(this.LJLJJI.isFromReInstallNet(), Boolean.TRUE)) {
            C68517Qun c68517Qun = C68517Qun.LIZ;
            String secUid = this.LJLJJI.getUid();
            String uid = String.valueOf(this.LJLJI.LJIIIZ.LIZ);
            synchronized (c68517Qun) {
                o.LJIIIZ(secUid, "secUid");
                o.LJIIIZ(uid, "uid");
                Iterator it = ((ArrayList) C68517Qun.LIZJ).iterator();
                while (it.hasNext()) {
                    BaseLoginMethod baseLoginMethod = (BaseLoginMethod) it.next();
                    if (o.LJ(baseLoginMethod.getUid(), secUid)) {
                        baseLoginMethod.setUid(uid);
                        baseLoginMethod.setLoginTime(Long.valueOf(System.currentTimeMillis()));
                        baseLoginMethod.setTransToNormal(Boolean.TRUE);
                        z = true;
                    }
                }
                if (z) {
                    C68517Qun.LIZIZ.LIZJ(C68517Qun.LIZJ, null);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
