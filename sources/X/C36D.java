package X;

import android.app.Activity;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.36D, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C36D extends AbstractC785136h {
    public final String LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final int LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;

    @Override // X.AbstractC785136h
    public final void LIZ() {
        Activity LJIJJ;
        Object obj;
        String LIZIZ;
        IMUser iMUser = (IMUser) this.LJLJLJ.getValue();
        if (iMUser == null || (LJIJJ = C45804HyK.LJIJJ(this.LJLIL)) == null) {
            return;
        }
        boolean isBlock = iMUser.isBlock();
        String uid = iMUser.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        int LJIIIIZZ = this.LJLJI.LJIIIIZZ();
        int i = this.LJLJI.LJLLLLLL;
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "onEventV3");
        if (isBlock) {
            obj = "unblock";
        } else {
            obj = "block";
        }
        LIZ2.put("target", obj);
        if (i == 25) {
            LIZIZ = "tcm";
        } else {
            LIZIZ = C3Y4.LIZIZ(LJIIIIZZ);
        }
        LIZ2.put("chat_type", LIZIZ);
        LIZ.LIZIZ("chat_list_feedback", LIZ2);
        if (isBlock) {
            C772831o.LIZ().LIZIZ("unblock", HXX.LIZJ("enter_from", "chat_list_page", "to_user_id", uid));
        } else {
            C772831o.LIZ().LIZIZ("block", HXX.LIZJ("enter_from", "chat_list_page", "to_user_id", uid));
        }
        new C784636c(LJIJJ, iMUser, "chat_list_page", null, null, null, null, LiveTryModeCountDownThresholdSetting.DEFAULT).LJI();
    }

    @Override // X.AbstractC785136h
    public final int LIZIZ() {
        return ((Number) this.LJLLI.getValue()).intValue();
    }

    @Override // X.AbstractC785136h
    public final int LIZJ() {
        return ((Number) this.LJLL.getValue()).intValue();
    }

    @Override // X.AbstractC785136h
    public final boolean LJ() {
        C63120Opw c63120Opw = this.LJLJJI;
        if (c63120Opw == null || !c63120Opw.isSingleChat() || this.LJLJLJ.getValue() == null) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC785136h
    public final int LIZLLL() {
        return this.LJLJLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36D(Activity activity, AbstractC90763hI conversationModel, C3L4 session) {
        super(activity, conversationModel, session);
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(conversationModel, "conversationModel");
        o.LJIIIZ(session, "session");
        this.LJLJL = "BlockAction";
        this.LJLJLJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1071));
        this.LJLJLLL = 1;
        this.LJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1070));
        this.LJLLI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 1069));
    }
}
