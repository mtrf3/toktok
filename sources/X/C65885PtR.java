package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.login.ui.LogoutDialogActivity;
import com.ss.android.ugc.aweme.services.BaseUserService;
import kotlin.jvm.internal.o;

/* renamed from: X.PtR, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65885PtR implements InterfaceC65888PtU {
    @Override // X.InterfaceC65888PtU
    public final void LIZLLL(C65886PtS c65886PtS) {
        IUserService createIUserServicebyMonsterPlugin;
        if (c65886PtS.LIZ == 2 && !TextUtils.isEmpty(c65886PtS.LIZIZ)) {
            C38589FCn value = C38589FCn.LIZIZ.getValue();
            String message = c65886PtS.LIZIZ;
            value.getClass();
            o.LJIIIZ(message, "message");
            try {
                if (value.LIZ.compareAndSet(false, true)) {
                    Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                    if (LJIIIIZZ != null && (createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false)) != null && createIUserServicebyMonsterPlugin.isLogin()) {
                        Bundle bundle = new Bundle();
                        bundle.putString("message", message);
                        Intent intent = new Intent(LJIIIIZZ, (Class<?>) LogoutDialogActivity.class);
                        intent.putExtras(bundle);
                        C16880lQ.LIZJ(LJIIIIZZ, intent);
                    } else {
                        value.LIZ.set(false);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
