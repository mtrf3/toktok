package X;

import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8q5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223618q5 extends AbstractC224038ql {
    public final Long LJLLI;
    public final Long LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C221808nA LJLLL;

    @Override // X.AbstractC224038ql
    public final void LJIJJ() {
    }

    @Override // X.Y1I
    public final void LJJII() {
    }

    @Override // X.Y1I
    public final void LJJIIZ() {
    }

    @Override // X.AbstractC224038ql
    public final View LJIILLIIL() {
        return new View(this.LJLILLLLZI);
    }

    @Override // X.AbstractC224038ql
    public final void LJIJI() {
        C223778qL c223778qL;
        C245649kW c245649kW = this.LJLJJI;
        if (c245649kW != null && (c223778qL = c245649kW.LJIIZILJ) != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", c223778qL.LIZ);
            c188727au.LJIIIZ("group_id", c223778qL.LIZJ);
            c188727au.LJIIIZ("author_id", c223778qL.LIZIZ);
            c188727au.LJFF(this.LJLLILLLL, "question_id");
            c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
            c188727au.LJIIIZ("sticker_type", "question");
            c188727au.LJFF(this.LJLLI, "question_user_id");
            c188727au.LJIIIZ("options_show", "both_for_q");
            FMX.LJIIL("sticker_click", c188727au.LIZ);
        }
    }

    public final void LJJIFFI() {
        String str;
        String str2;
        String str3;
        C245649kW c245649kW = this.LJLJJI;
        if (c245649kW != null) {
            SmartRoute buildRoute = SmartRouter.buildRoute(this.LJLILLLLZI, "aweme://qna/detail/");
            Long l = this.LJLLILLLL;
            String str4 = null;
            if (l != null) {
                str = l.toString();
            } else {
                str = null;
            }
            buildRoute.withParam("id", str);
            C223778qL c223778qL = c245649kW.LJIIZILJ;
            if (c223778qL != null) {
                str2 = c223778qL.LIZ;
            } else {
                str2 = null;
            }
            buildRoute.withParam("extra_question_from", str2);
            buildRoute.withParam("aweme_id", c245649kW.LIZLLL);
            Long l2 = this.LJLLILLLL;
            if (l2 != null) {
                str3 = l2.toString();
            } else {
                str3 = null;
            }
            buildRoute.withParam("qid", str3);
            C223778qL c223778qL2 = c245649kW.LJIIZILJ;
            if (c223778qL2 != null) {
                str4 = c223778qL2.LIZ;
            }
            buildRoute.withParam("enter_from", str4);
            buildRoute.withParam("process_id", UUID.randomUUID().toString());
            buildRoute.withParam("enter_method", "click_sticker");
            buildRoute.withParam("question_type", "video");
            buildRoute.open();
        }
    }

    @Override // X.Y1E
    public final int getStickerType() {
        InteractStickerStruct interactStickerStruct = this.LJLJLLL;
        if (interactStickerStruct != null) {
            return interactStickerStruct.getType();
        }
        return 0;
    }

    public final boolean LJJ() {
        InteractStickerStruct interactStickerStruct;
        QaStruct qaStruct;
        Long valueOf;
        if (!AVExternalServiceImpl.LIZ().configService().avsettingsConfig().enableQaSticker() || (interactStickerStruct = this.LJLJLLL) == null || (qaStruct = interactStickerStruct.getQaStruct()) == null || (valueOf = Long.valueOf(qaStruct.getQuestionId())) == null || valueOf.longValue() == 0) {
            return false;
        }
        return true;
    }

    @Override // X.Y1I
    public final View LIZ(int i) {
        return (View) this.LJLLJ.getValue();
    }

    @Override // X.AbstractC224038ql, X.Y1P
    public final void LJII(C245649kW interactStickerParams) {
        o.LJIIIZ(interactStickerParams, "interactStickerParams");
        this.LJLJJI = interactStickerParams;
        C221808nA c221808nA = this.LJLLL;
        c221808nA.getClass();
        c221808nA.LJLJJI = interactStickerParams;
    }

    @Override // X.AbstractC224038ql
    public final int LJIIZILJ(C6DL c6dl) {
        int i;
        o.LJIIIZ(c6dl, "<this>");
        if (!LJJ()) {
            C5S1 c5s1 = new C5S1(c6dl.LIZ);
            c5s1.LIZJ(R.string.pqk);
            c5s1.LJ();
            return 0;
        }
        C6DO c6do = new C6DO();
        String string = c6dl.LIZ.getString(R.string.pnf);
        o.LJIIIIZZ(string, "context.getString(R.stri…_sticker_button_viewmore)");
        c6do.LIZLLL = string;
        if (TextUtils.equals(C85999Xp5.LIZIZ(), "ar")) {
            i = R.drawable.b61;
        } else {
            i = R.drawable.b60;
        }
        c6do.LIZ = i;
        c6do.LJFF = new ACListenerS23S0100000_3(this, 8);
        C6DO c6do2 = new C6DO();
        String string2 = c6dl.LIZ.getString(R.string.qz);
        o.LJIIIIZZ(string2, "context.getString(R.string.QA_comment_answer)");
        c6do2.LIZLLL = string2;
        c6do2.LIZ = R.drawable.b5y;
        c6do2.LJFF = new ACListenerS23S0100000_3(this, 7);
        ((ArrayList) c6dl.LIZIZ).add(c6do);
        ((ArrayList) c6dl.LIZIZ).add(c6do2);
        return 2;
    }

    public final void LJJI(String str) {
        C223778qL c223778qL;
        C245649kW c245649kW = this.LJLJJI;
        if (c245649kW != null && (c223778qL = c245649kW.LJIIZILJ) != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", c223778qL.LIZ);
            c188727au.LJIIIZ("group_id", c223778qL.LIZJ);
            c188727au.LJIIIZ("author_id", c223778qL.LIZIZ);
            c188727au.LJFF(this.LJLLILLLL, "question_id");
            c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
            c188727au.LJFF(this.LJLLI, "question_user_id");
            c188727au.LJIIIZ("target", str);
            FMX.LJIIL("click_question_bubble", c188727au.LIZ);
        }
    }

    @Override // X.Y1P
    public final boolean LJIIJJI(long j, float f, float f2, int i) {
        return this.LJLLL.LJIIJJI(j, f, f2, i);
    }

    @Override // X.Y1P
    public final boolean LJIILIIL(long j, int i, float f, float f2, InterfaceC221818nB popListener) {
        o.LJIIIZ(popListener, "popListener");
        LJIJI();
        return this.LJLLL.LJIILIIL(j, i, f, f2, popListener);
    }

    public C223618q5(int i, Context context, C224048qm c224048qm, InteractStickerStruct interactStickerStruct, C245649kW c245649kW, Aweme aweme) {
        super(i, context, c224048qm, interactStickerStruct, c245649kW);
        Long l;
        QaStruct qaStruct;
        QaStruct qaStruct2;
        InteractStickerStruct interactStickerStruct2 = this.LJLJLLL;
        Long l2 = null;
        if (interactStickerStruct2 != null && (qaStruct2 = interactStickerStruct2.getQaStruct()) != null) {
            l = Long.valueOf(qaStruct2.getUserId());
        } else {
            l = null;
        }
        this.LJLLI = l;
        InteractStickerStruct interactStickerStruct3 = this.LJLJLLL;
        if (interactStickerStruct3 != null && (qaStruct = interactStickerStruct3.getQaStruct()) != null) {
            l2 = Long.valueOf(qaStruct.getQuestionId());
        }
        this.LJLLILLLL = l2;
        this.LJLLJ = C221108m2.LIZIZ(new AqS153S0100000_3(context, 11));
        this.LJLLL = new C221808nA(context, this, interactStickerStruct, c245649kW, aweme);
    }
}
