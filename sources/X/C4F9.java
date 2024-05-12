package X;

import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.notification.helper.IMOutAppNotificationManager$clearNotifications$1", f = "IMOutAppNotificationManager.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.4F9, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4F9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C99513vP LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4F9(C99513vP c99513vP, InterfaceC67352kd<? super C4F9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c99513vP;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C4F9(this.LJLIL, interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [X.4F7] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            Object LJ = C04330Ez.LJ(this.LJLIL.LIZ, NotificationManager.class);
            o.LJII(LJ, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) LJ;
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            if (activeNotifications != null) {
                C99513vP c99513vP = this.LJLIL;
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    if (TextUtils.equals(c99513vP.LIZIZ.getConversationId(), statusBarNotification.getNotification().extras.getString("conversation_id", ""))) {
                        notificationManager.cancel(statusBarNotification.getTag(), statusBarNotification.getId());
                        C4F7.LIZ(new Object() { // from class: X.4F7
                            public static void LIZ(C4F7 c4f7, C99033ud sessionInfo) {
                                C85323Wm onEventV3 = C772831o.LIZ();
                                o.LJIIIZ(sessionInfo, "sessionInfo");
                                o.LJIIIZ(onEventV3, "onEventV3");
                                onEventV3.LIZIZ("cancel_dm_notification", C113554cx.LJJL(new OSZ("enter_from", sessionInfo.getEnterFromForMob()), new OSZ("chat_type", C98583tu.LIZIZ(sessionInfo.getChatType()))));
                            }
                        }, c99513vP.LIZIZ);
                    }
                }
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IMOutAppNotificationManager.clearNotifications() error: ");
            LIZ.append(e);
            C34B.LIZJ("IMOutAppNotificationManager", X1D.LIZIZ(LIZ));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
