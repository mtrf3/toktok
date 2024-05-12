package X;

import Y.ARunnableS12S0300000_1;
import Y.ARunnableS37S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.4I8, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4I8 implements LV9 {
    public static final C4I8 LIZ = new C4I8();
    public static InterfaceC82683Wch LIZIZ;

    @Override // X.LV9
    public final void LIZ() {
        InterfaceC82683Wch interfaceC82683Wch = LIZIZ;
        if (interfaceC82683Wch != null && interfaceC82683Wch.isShowing()) {
            interfaceC82683Wch.dismiss();
        }
    }

    @Override // X.LV9
    public final boolean LIZJ() {
        return C92333jp.LIZIZ();
    }

    @Override // X.LV9
    public final void LIZIZ(Activity activity, String str) {
        final String curUserId;
        o.LJIIIZ(activity, "activity");
        final C4IB c4ib = new C4IB(activity, str);
        if (!C92333jp.LIZIZ() || AV1.LJIIJJI()) {
            new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS37S0100000_1(c4ib, 141), 1000L);
            return;
        }
        RBY LJFF = AccountService.LJIJ().LJFF();
        if (LJFF == null) {
            curUserId = "-1";
        } else {
            curUserId = LJFF.getCurUserId();
        }
        curUserId.toString();
        C4IE c4ie = C4IE.LIZ;
        C4IH c4ih = new C4IH() { // from class: X.4I9
            @Override // X.C4IH
            public final void LIZ() {
                C4IE c4ie2 = C4IE.LIZ;
                String uid = curUserId;
                c4ie2.getClass();
                o.LJIIIZ(uid, "uid");
                CopyOnWriteArrayList<C4IH> copyOnWriteArrayList = C4IE.LIZLLL.get(uid);
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.remove(this);
                }
                if (!C78966Uyw.LJJIJ().LIZIZ()) {
                    Bundle bundle = new Bundle();
                    bundle.putString("im_group_invite_id", c4ib.LIZIZ);
                    bundle.putString("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
                    C98823uI.LIZ(IMService.createIIMServicebyMonsterPlugin(false).getImChatService(), c4ib.LIZ, bundle, false, 67108864, 4);
                    return;
                }
                C4IB c4ib2 = c4ib;
                c4ib2.getClass();
                new Handler(C16880lQ.LLJJJJ()).postDelayed(new ARunnableS37S0100000_1(c4ib2, 141), 1000L);
            }
        };
        c4ie.getClass();
        C4IE.LIZ(curUserId, c4ih);
    }

    @Override // X.LV9
    public final void LIZLLL(Context context, TuxIconView tuxIconView) {
        Keva repo = Keva.getRepo("im_session_group_repo");
        if (repo.getBoolean("im_key_guide_show", false)) {
            return;
        }
        tuxIconView.post(new ARunnableS12S0300000_1(context, tuxIconView, repo, 16));
    }
}
