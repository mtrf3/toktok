package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.actionai.sdk.ActionAISDKAgent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WnO, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83346WnO implements InterfaceC83334WnC {
    public final /* synthetic */ C83343WnL LIZ;

    public C83346WnO(C83343WnL c83343WnL) {
        this.LIZ = c83343WnL;
    }

    @Override // X.InterfaceC83334WnC
    public final void LIZ(EnumC83339WnH clickType, int i) {
        C83351WnT c83351WnT;
        C83351WnT c83351WnT2;
        List<? extends AbstractC83320Wmy> list;
        o.LJIIIZ(clickType, "clickType");
        String str = "creation";
        switch (C83340WnI.LIZ[clickType.ordinal()]) {
            case 1:
                AbstractC83369Wnl abstractC83369Wnl = (AbstractC83369Wnl) ListProtector.get(this.LIZ.LJLJJI, i);
                if (!(abstractC83369Wnl instanceof C83351WnT)) {
                    return;
                }
                ((C83351WnT) abstractC83369Wnl).LJIILIIL = true;
                VideoPublishEditModel model = this.LIZ.LJLIL;
                String str2 = abstractC83369Wnl.LIZIZ;
                String messageId = abstractC83369Wnl.LIZ;
                C83351WnT c83351WnT3 = (C83351WnT) abstractC83369Wnl;
                String str3 = c83351WnT3.LJ;
                if (!(!c83351WnT3.LIZLLL.isEmpty())) {
                    str = "text";
                }
                String creationMessageType = c83351WnT3.LIZIZ();
                o.LJIIIZ(model, "model");
                o.LJIIIZ(messageId, "messageId");
                o.LJIIIZ(creationMessageType, "creationMessageType");
                C188727au c188727au = new C188727au();
                C83348WnQ.LIZLLL(model, c188727au);
                c188727au.LJIIIZ("enter_from", "video_edit_page_tikbot");
                c188727au.LJIIIZ("enter_method", "click_icon");
                c188727au.LJIIIZ("process_id", str2);
                c188727au.LJIIIZ("message_id", messageId);
                c188727au.LJIIIZ("server_message_id", str3);
                c188727au.LJIIIZ("message_type", str);
                c188727au.LJI("creation_message_type", creationMessageType);
                FMX.LJIIL("like_message", c188727au.LIZ);
                this.LIZ.LJZ();
                return;
            case 2:
                AbstractC83369Wnl abstractC83369Wnl2 = (AbstractC83369Wnl) ListProtector.get(this.LIZ.LJLJJI, i);
                if (!(abstractC83369Wnl2 instanceof C83351WnT)) {
                    return;
                }
                ((C83351WnT) abstractC83369Wnl2).LJIILJJIL = true;
                VideoPublishEditModel model2 = this.LIZ.LJLIL;
                String str4 = abstractC83369Wnl2.LIZIZ;
                String messageId2 = abstractC83369Wnl2.LIZ;
                C83351WnT c83351WnT4 = (C83351WnT) abstractC83369Wnl2;
                String str5 = c83351WnT4.LJ;
                if (!(!c83351WnT4.LIZLLL.isEmpty())) {
                    str = "text";
                }
                String creationMessageType2 = c83351WnT4.LIZIZ();
                o.LJIIIZ(model2, "model");
                o.LJIIIZ(messageId2, "messageId");
                o.LJIIIZ(creationMessageType2, "creationMessageType");
                C188727au c188727au2 = new C188727au();
                C83348WnQ.LIZLLL(model2, c188727au2);
                c188727au2.LJIIIZ("enter_from", "video_edit_page_tikbot");
                c188727au2.LJIIIZ("enter_method", "click_icon");
                c188727au2.LJIIIZ("process_id", str4);
                c188727au2.LJIIIZ("message_id", messageId2);
                c188727au2.LJIIIZ("server_message_id", str5);
                c188727au2.LJIIIZ("message_type", str);
                c188727au2.LJI("creation_message_type", creationMessageType2);
                FMX.LJIIL("dislike_message", c188727au2.LIZ);
                this.LIZ.LJZ();
                return;
            case 3:
                ORS.LJJLL(this.LIZ.LJLJJI);
                C83348WnQ.LJIIIZ(this.LIZ.LJLIL, ActionAISDKAgent.LJLJJLL, "cancel");
                this.LIZ.LJZ();
                this.LIZ.LJLJI.invoke(new C83355WnX(EnumC83354WnW.CANCEL_BY_USER, null, null, 62));
                return;
            case 4:
                AbstractC83369Wnl abstractC83369Wnl3 = (AbstractC83369Wnl) ORZ.LLFII(this.LIZ.LJLJJI);
                if (!(abstractC83369Wnl3 instanceof C83351WnT) || (list = (c83351WnT2 = (C83351WnT) abstractC83369Wnl3).LJI) == null || list.isEmpty()) {
                    return;
                }
                if (i == c83351WnT2.LJII) {
                    c83351WnT2.LJII = -1;
                    this.LIZ.LJLJI.invoke(new C83356WnY(c83351WnT2, i, true, false, 8));
                } else {
                    C83343WnL c83343WnL = this.LIZ;
                    c83343WnL.LJLJJLL = i;
                    c83343WnL.LJLJJL = true;
                    c83343WnL.LJLJI.invoke(new C83356WnY(c83351WnT2, i, false, false, 12));
                    C83348WnQ.LIZJ(this.LIZ.LJLIL, abstractC83369Wnl3, i, false);
                }
                this.LIZ.LJZ();
                return;
            case 5:
                Object LLFII = ORZ.LLFII(this.LIZ.LJLJJI);
                if (!(LLFII instanceof C83351WnT) || (c83351WnT = (C83351WnT) LLFII) == null) {
                    return;
                }
                this.LIZ.LJLJI.invoke(new C83356WnY(c83351WnT, i, false, true, 4));
                return;
            case 6:
                AbstractC83369Wnl abstractC83369Wnl4 = (AbstractC83369Wnl) ORZ.LLFII(this.LIZ.LJLJJI);
                if (abstractC83369Wnl4 == null || !(abstractC83369Wnl4 instanceof C83355WnX)) {
                    return;
                }
                EnumC83354WnW enumC83354WnW = ((C83355WnX) abstractC83369Wnl4).LIZJ;
                if (enumC83354WnW != EnumC83354WnW.NO_NETWORK && enumC83354WnW != EnumC83354WnW.REQUEST_ERROR && enumC83354WnW != EnumC83354WnW.CANCEL_WITH_QUIT) {
                    return;
                }
                ORS.LJJLL(this.LIZ.LJLJJI);
                this.LIZ.LJLJI.invoke(new C83355WnX(EnumC83354WnW.USER_RETRY_FROM_BOT, null, null, 62));
                AbstractC83369Wnl abstractC83369Wnl5 = (AbstractC83369Wnl) ORZ.LLFII(this.LIZ.LJLJJI);
                if (abstractC83369Wnl5 == null) {
                    return;
                }
                if (abstractC83369Wnl5 instanceof C83357WnZ) {
                    InterfaceC88472Yns<AbstractC83369Wnl, C76800UCe> interfaceC88472Yns = this.LIZ.LJLJI;
                    EnumC82847WfL enumC82847WfL = EnumC82847WfL.RETRY;
                    o.LJIIIZ(enumC82847WfL, "<set-?>");
                    ((C83357WnZ) abstractC83369Wnl5).LIZLLL = enumC82847WfL;
                    interfaceC88472Yns.invoke(abstractC83369Wnl5);
                }
                C83348WnQ.LJIIIZ(this.LIZ.LJLIL, abstractC83369Wnl5.LIZIZ, "bot_retry");
                this.LIZ.LJZ();
                return;
            default:
                return;
        }
    }
}
