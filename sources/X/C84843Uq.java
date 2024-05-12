package X;

import com.ss.android.ugc.aweme.im.sdk.chat.data.model.BaseContent;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMServiceProvider;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3Uq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84843Uq implements C48M {
    @Override // X.C48M
    public final long LJI() {
        return ((Number) C84823Uo.LIZ.getValue()).longValue();
    }

    @Override // X.C48M
    public final long getCurrentUid() {
        return C36L.LIZIZ();
    }

    @Override // X.C48M
    public final C63120Opw LIZ(String str) {
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        return C4WC.LIZIZ.LIZ(str);
    }

    @Override // X.C48M
    public final String LIZIZ(String str) {
        return String.valueOf(IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusAnalytics().LIZIZ(str));
    }

    @Override // X.C48M
    public final BaseContent LJ(C109544Rq message) {
        o.LJIIIZ(message, "message");
        EnumC110124Tw.Companion.getClass();
        return C110134Tx.LIZJ(message);
    }

    @Override // X.C48M
    public final String LJFF(String str) {
        return C79004UzY.LJIILIIL(str);
    }

    @Override // X.C48M
    public final int LJIIIIZZ(C109544Rq message) {
        o.LJIIIZ(message, "message");
        C3Q9.LIZ.getClass();
        C75782yE.LIZ();
        return C84283Sm.LJIIIIZZ(C4WC.LIZIZ.LIZ(message.getConversationId())) ? 1 : 0;
    }

    @Override // X.C48M
    public final boolean LJIIIZ(C109544Rq message) {
        o.LJIIIZ(message, "message");
        return message.isSelf();
    }

    @Override // X.C48M
    public final long LJIIJ(String str) {
        return C81273Gx.LIZLLL(str);
    }

    @Override // X.C48M
    public final IMUser LIZJ(String uid, String str) {
        o.LJIIIZ(uid, "uid");
        return C80533Eb.LJFF(uid, str);
    }

    @Override // X.C48M
    public final C3V3 LIZLLL(C109544Rq message, BaseContent baseContent) {
        o.LJIIIZ(message, "message");
        return C106674Gp.LJI(message, baseContent);
    }

    @Override // X.C48M
    public final Object LJII(String str, String str2, C48J c48j) {
        return IMServiceProvider.INSTANCE.getFamiliarService().LIZ(str, C79004UzY.LJIILIIL(str2), null, c48j);
    }
}
