package Y;

import X.C141335gf;
import X.C221018lt;
import X.C3C5;
import X.C56045Lz7;
import X.C57105Mb7;
import X.C57362MfG;
import X.C57381MfZ;
import X.C57600Mj6;
import X.C6ZT;
import X.C72242sW;
import X.C76800UCe;
import X.C77123UOp;
import X.C78983UzD;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.InterfaceC65784Pro;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.cell.ToolEntryCellNew;
import com.ss.android.ugc.aweme.ecommerce.mall.common.customdot.Notice;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class ACListenerS31S0400000_9 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS31S0400000_9 aCListenerS31S0400000_9, View view) {
        if (C6ZT.LIZIZ((C57381MfZ) aCListenerS31S0400000_9.l0, 500L)) {
            C221018lt.LIZ("TTRecUserBigCardView", "[smartImageView] doubleClickCheck");
            return;
        }
        C221018lt.LIZ("TTRecUserBigCardCoverView", "[updateNegativeActionTimes] isNegative = false");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = ((C57381MfZ) aCListenerS31S0400000_9.l0).LJLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        C57600Mj6.LIZLLL(false);
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJIIZI(((C57381MfZ) aCListenerS31S0400000_9.l0).LJLJLJ);
        EnumC57366MfK enumC57366MfK = EnumC57366MfK.CARD;
        c57362MfG.LJJLI = enumC57366MfK;
        c57362MfG.LJJJJI();
        c57362MfG.LJJLIIIIJ = EnumC57365MfJ.CLICK_COVER;
        RecUser recUser = ((C57381MfZ) aCListenerS31S0400000_9.l0).LJLJLLL;
        if (recUser != null) {
            String uid = recUser.getUid();
            if (uid == null) {
                uid = "";
            }
            c57362MfG.LJJLIIIJJIZ = uid;
            RecUser recUser2 = ((C57381MfZ) aCListenerS31S0400000_9.l0).LJLJLLL;
            if (recUser2 != null) {
                c57362MfG.LJJJJIZL(recUser2);
                c57362MfG.LJLI = true;
                c57362MfG.LJIILIIL();
                SmartRoute buildRoute = SmartRouter.buildRoute(((C57381MfZ) aCListenerS31S0400000_9.l0).getContext(), "//aweme/detail");
                buildRoute.withParam("enter_from", ((C57381MfZ) aCListenerS31S0400000_9.l0).LJLJLJ);
                buildRoute.withParam("video_from", "[UserCard]_DETAIL");
                buildRoute.withParam("id", ((Aweme) aCListenerS31S0400000_9.l1).getAid());
                RecUser recUser3 = ((C57381MfZ) aCListenerS31S0400000_9.l0).LJLJLLL;
                if (recUser3 != null) {
                    buildRoute.withParam("userid", recUser3.getUid());
                    RecUser recUser4 = ((C57381MfZ) aCListenerS31S0400000_9.l0).LJLJLLL;
                    if (recUser4 != null) {
                        buildRoute.withParam("sec_userid", recUser4.getSecUid());
                        buildRoute.withParam("is_show_follow_btn_on_bottom", true);
                        buildRoute.withParam("refer", "others_homepage");
                        buildRoute.withParam("previous_page", ((C57381MfZ) aCListenerS31S0400000_9.l0).LJLJLJ);
                        RecUser recUser5 = ((C57381MfZ) aCListenerS31S0400000_9.l0).LJLJLLL;
                        if (recUser5 != null) {
                            buildRoute.withParam("matched_friend_strcut", recUser5.getMatchedFriendStruct());
                            buildRoute.withParam("is_card", true);
                            buildRoute.withParam("is_big_card", true);
                            buildRoute.withParam("follow_recommned_enter_from", ((C57381MfZ) aCListenerS31S0400000_9.l0).LJLJLJ);
                            buildRoute.withParam("scene_type", enumC57366MfK.getType());
                            buildRoute.open();
                            C72242sW c72242sW = (C72242sW) aCListenerS31S0400000_9.l2;
                            long j = c72242sW.element + 1;
                            c72242sW.element = j;
                            ((TuxTextView) aCListenerS31S0400000_9.l3).setText(C77123UOp.LJJIIJ(j));
                            return;
                        }
                        o.LJIJI("recUser");
                        throw null;
                    }
                    o.LJIJI("recUser");
                    throw null;
                }
                o.LJIJI("recUser");
                throw null;
            }
            o.LJIJI("recUser");
            throw null;
        }
        o.LJIJI("recUser");
        throw null;
    }

    public static final void onClick$1(ACListenerS31S0400000_9 aCListenerS31S0400000_9, View view) {
        String schemaUrl = ((Notice) aCListenerS31S0400000_9.l0).getSchemaUrl();
        if (schemaUrl != null) {
            Notice notice = (Notice) aCListenerS31S0400000_9.l1;
            ToolEntryCellNew toolEntryCellNew = (ToolEntryCellNew) aCListenerS31S0400000_9.l2;
            View view2 = (View) aCListenerS31S0400000_9.l3;
            try {
                C56045Lz7 c56045Lz7 = C56045Lz7.LIZ;
                String templateId = notice.getTemplateId();
                if (templateId == null) {
                    templateId = "";
                }
                String createTime = notice.getCreateTime();
                toolEntryCellNew.getClass();
                long L = ToolEntryCellNew.L(createTime);
                String id = notice.getId();
                if (id == null) {
                    id = "";
                }
                String LJ = C57105Mb7.LJ(ToolEntryCellNew.L(notice.getCreateTime()) * 1000, view2.getContext());
                o.LJIIIIZZ(LJ, "formatCreateTimeDescForN…                        )");
                c56045Lz7.getClass();
                C56045Lz7.LJIILL(L, "click", templateId, id, LJ);
                SmartRouter.buildRoute(view2.getContext(), schemaUrl).open();
                C3C5.m7constructorimpl(C76800UCe.LIZ);
            } catch (CancellationException e) {
                throw e;
            } catch (Throwable th) {
                C78983UzD.LJIIZILJ(th);
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
    }

    public ACListenerS31S0400000_9(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
