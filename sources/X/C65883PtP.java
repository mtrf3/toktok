package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.o;

/* renamed from: X.PtP, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65883PtP extends AbstractC65440PmG {
    public C65883PtP(C65882PtO c65882PtO) {
        super(c65882PtO);
    }

    @Override // X.AbstractC65440PmG
    public final C65442PmI LIZ(C65441PmH c65441PmH, Request request, C64797Pbt<?> c64797Pbt) {
        C65436PmC c65436PmC = c65441PmH.LIZ;
        if (c65436PmC != null && c65436PmC.LIZ == 8) {
            C38589FCn value = C38589FCn.LIZIZ.getValue();
            value.getClass();
            try {
                if (value.LIZ.compareAndSet(false, true)) {
                    Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                    IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                    if (LJIIIIZZ != null && createIUserServicebyMonsterPlugin != null && createIUserServicebyMonsterPlugin.isLogin()) {
                        C38589FCn.LIZJ(request);
                        C38589FCn.LIZIZ(request);
                        String path = request.getPath();
                        Bundle bundle = new Bundle();
                        if (C78685UuP.LJJJZ(path)) {
                            o.LJI(path);
                            bundle.putString("from_path", path);
                        }
                        Intent intent = new Intent(LJIIIIZZ, (Class<?>) LogoutDialogActivity.class);
                        intent.putExtras(bundle);
                        C16880lQ.LIZJ(LJIIIIZZ, intent);
                    } else {
                        value.LIZ.set(false);
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
            return new C65442PmI(true, false);
        }
        return AbstractC65440PmG.LIZIZ;
    }
}
