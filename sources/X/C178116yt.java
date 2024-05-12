package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomInputPriorityComponent;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.assem.AbstractBottomPriorityComponent;
import com.ss.android.ugc.aweme.comment.detailpage.bottombarv2.protocol.BottomBarViewAbility;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS14S0202000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS54S0201000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.6yt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178116yt implements InterfaceC177046xA {
    public final Activity LJLIL;
    public final InterfaceC178496zV LJLILLLLZI;
    public final C178236z5 LJLJI;
    public final InterfaceC55235Lm3 LJLJJI;
    public final View LJLJJL;
    public final String LJLJJLL;
    public final InterfaceC178126yu LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ Comment getCommentInputReplyComment() {
        return null;
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ String getEnterMethod() {
        return "";
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ String getFromPage() {
        return "";
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ boolean isLandscapeMode() {
        return false;
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onClickCloseUpvotePanel() {
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputClick() {
    }

    @Override // X.InterfaceC177046xA
    public void onEvent(C174266sg c174266sg) {
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onImageUploadProgress(String str, int i) {
    }

    @Override // X.InterfaceC177046xA
    public final /* synthetic */ void onUpvotePublishProcessChanged(boolean z) {
    }

    public final Aweme LIZJ() {
        InterfaceC178496zV interfaceC178496zV = this.LJLILLLLZI;
        if (interfaceC178496zV != null) {
            return interfaceC178496zV.getCommentInputAweme();
        }
        return null;
    }

    public final BottomBarViewAbility LIZLLL() {
        return (BottomBarViewAbility) this.LJLJLJ.getValue();
    }

    @Override // X.InterfaceC177046xA
    public final String getEventType() {
        String eventType;
        InterfaceC178496zV interfaceC178496zV = this.LJLILLLLZI;
        if (interfaceC178496zV == null || (eventType = interfaceC178496zV.getEventType()) == null) {
            return "";
        }
        return eventType;
    }

    @Override // X.InterfaceC177046xA
    public final boolean hasUpvoteOption() {
        return C7HV.LIZIZ.LJIL().LJII(LIZJ());
    }

    public final String LIZIZ() {
        String aid;
        Aweme LIZJ = LIZJ();
        if (LIZJ == null || (aid = LIZJ.getAid()) == null) {
            return "";
        }
        return aid;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0144  */
    @Override // X.InterfaceC177046xA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean checkCommentInputable() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178116yt.checkCommentInputable():boolean");
    }

    @Override // X.InterfaceC177046xA
    public final Aweme getCommentInputAweme() {
        return LIZJ();
    }

    @Override // X.InterfaceC177046xA
    public final int getCommentInputViewType() {
        C176996x5 L1;
        BottomBarViewAbility LIZLLL = LIZLLL();
        if (LIZLLL == null || (L1 = LIZLLL.L1()) == null || !L1.LJI()) {
            return 1;
        }
        return 10;
    }

    @Override // X.InterfaceC177046xA
    public final boolean upvoteWhenComment() {
        if (hasUpvoteOption() && C7HV.LIZIZ.LJIL().LJFF()) {
            return true;
        }
        return false;
    }

    @QD3
    public final void onCommentEvent(C174046sK event) {
        C176996x5 L1;
        o.LJIIIZ(event, "event");
        if (event.LJLIL == 8) {
            Object obj = event.LJLILLLLZI;
            o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
            if (LIZJ() != null && o.LJ(LIZIZ(), obj)) {
                BottomBarViewAbility LIZLLL = LIZLLL();
                if (LIZLLL != null && (L1 = LIZLLL.L1()) != null) {
                    L1.LJJJLL();
                }
                AbstractBottomPriorityComponent LIZIZ = this.LJLJI.LIZIZ();
                if (LIZIZ != null) {
                    LIZ(LIZIZ, C177186xO.LJLIL);
                }
            }
        }
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishOnlyGiftSuccess(Comment comment) {
        BottomBarViewAbility LIZLLL = LIZLLL();
        if (LIZLLL != null) {
            LIZLLL.X5();
        }
        AbstractBottomPriorityComponent LIZIZ = this.LJLJI.LIZIZ();
        if (LIZIZ != null) {
            LIZ(LIZIZ, new AqS169S0100000_3(comment, 869));
        }
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishStart(Comment comment) {
        if (comment == null) {
            return;
        }
        if (!V0N.LJJII(comment.getGiftEffectPath()) && comment.getFakeGiftId() != 0) {
            BottomBarViewAbility LIZLLL = LIZLLL();
            if (LIZLLL != null) {
                LIZLLL.Ls(comment);
                return;
            }
            return;
        }
        AbstractBottomPriorityComponent LIZIZ = this.LJLJI.LIZIZ();
        if (LIZIZ == null) {
            return;
        }
        LIZ(LIZIZ, new AqS169S0100000_3(comment, 870));
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishSuccess(Comment comment) {
        BottomBarViewAbility LIZLLL = LIZLLL();
        if ((LIZLLL != null && !LIZLLL.isViewValid()) || this.LJLIL == null) {
            return;
        }
        if (comment == null || comment.getPublishScenario() != 1) {
            C26045AKb c26045AKb = new C26045AKb(this.LJLIL);
            c26045AKb.LJIIIIZZ(R.string.dl4);
            c26045AKb.LJIIJ();
        }
        BottomBarViewAbility LIZLLL2 = LIZLLL();
        if (LIZLLL2 != null) {
            LIZLLL2.X5();
        }
        AbstractBottomPriorityComponent LIZIZ = this.LJLJI.LIZIZ();
        if (LIZIZ != null) {
            LIZ(LIZIZ, new AqS169S0100000_3(comment, 871));
        }
    }

    @QD3
    public final void onDislikeAwemeEvent(C55274Lmg event) {
        float f;
        o.LJIIIZ(event, "event");
        Activity activity = this.LJLIL;
        if (activity == null || event.LJLJJL != activity.hashCode() || event.LJLILLLLZI != 2) {
            return;
        }
        if (event.LJLIL) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        BottomBarViewAbility LIZLLL = LIZLLL();
        if (LIZLLL == null) {
            return;
        }
        LIZLLL.f40(f);
    }

    @Override // X.InterfaceC177046xA
    public final void onEmojiToKeyboard(String str) {
        String str2;
        String str3 = this.LJLJJLL;
        String LIZIZ = LIZIZ();
        Aweme LIZJ = LIZJ();
        if (LIZJ == null || (str2 = LIZJ.getAuthorUid()) == null) {
            str2 = "";
        }
        C1793872g.LJFF(str, str3, LIZIZ, str2);
    }

    public static void LIZ(AbstractBottomPriorityComponent abstractBottomPriorityComponent, InterfaceC88472Yns action) {
        o.LJIIIZ(action, "action");
        if (abstractBottomPriorityComponent instanceof AbstractBottomInputPriorityComponent) {
            action.invoke(abstractBottomPriorityComponent);
        }
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputKeyboardDismiss(boolean z, C177156xL c177156xL) {
        View view = this.LJLJJL;
        if (view != null) {
            view.setVisibility(0);
        }
        InterfaceC178496zV interfaceC178496zV = this.LJLILLLLZI;
        if (interfaceC178496zV != null) {
            C50420Jqa c50420Jqa = new C50420Jqa(9, (Object) null);
            c50420Jqa.LJLJI = null;
            interfaceC178496zV.onInternalEvent(c50420Jqa);
        }
        InterfaceC178126yu interfaceC178126yu = this.LJLJL;
        if (interfaceC178126yu != null) {
            interfaceC178126yu.LIZIZ();
        }
        AbstractBottomPriorityComponent LIZIZ = this.LJLJI.LIZIZ();
        if (LIZIZ != null) {
            LIZ(LIZIZ, C177196xP.LJLIL);
        }
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputKeyboardShow(boolean z, String str, C177156xL c177156xL) {
        View view = this.LJLJJL;
        if (view != null) {
            view.setVisibility(4);
        }
        InterfaceC178126yu interfaceC178126yu = this.LJLJL;
        if (interfaceC178126yu != null) {
            interfaceC178126yu.LIZ();
        }
        AbstractBottomPriorityComponent LIZIZ = this.LJLJI.LIZIZ();
        if (LIZIZ != null) {
            LIZ(LIZIZ, C177206xQ.LJLIL);
        }
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishFailed(Exception e, int i, Comment comment) {
        AbstractBottomPriorityComponent LIZIZ;
        o.LJIIIZ(e, "e");
        o.LJIIIZ(comment, "comment");
        if (this.LJLIL != null && (LIZIZ = this.LJLJI.LIZIZ()) != null) {
            LIZ(LIZIZ, new AqS54S0201000_3(e, i, comment, 9));
        }
    }

    @Override // X.InterfaceC177046xA
    public final void onEmojiClick(String str, int i, int i2) {
        String str2;
        String str3 = this.LJLJJLL;
        String LIZIZ = LIZIZ();
        Aweme LIZJ = LIZJ();
        if (LIZJ == null || (str2 = LIZJ.getAuthorUid()) == null) {
            str2 = "";
        }
        C1793872g.LJ(str, str3, i, i2, LIZIZ, false, str2);
    }

    public C178116yt(ActivityC45651qj activityC45651qj, InterfaceC178496zV interfaceC178496zV, C178236z5 protocolManager, InterfaceC55235Lm3 interfaceC55235Lm3, View view, String str, InterfaceC178126yu interfaceC178126yu) {
        o.LJIIIZ(protocolManager, "protocolManager");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = interfaceC178496zV;
        this.LJLJI = protocolManager;
        this.LJLJJI = interfaceC55235Lm3;
        this.LJLJJL = view;
        this.LJLJJLL = str;
        this.LJLJL = interfaceC178126yu;
        EventBus.LIZJ().LJIILJJIL(this);
        this.LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1613));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1614));
    }

    @Override // X.InterfaceC177046xA
    public final void onCommentInputPublishClick(int i, int i2, CharSequence content, String str, String str2, boolean z, C177156xL c177156xL) {
        o.LJIIIZ(content, "content");
        InterfaceC178496zV interfaceC178496zV = this.LJLILLLLZI;
        if (interfaceC178496zV != null) {
            interfaceC178496zV.h5(i2);
        }
        c177156xL.LIZLLL = upvoteWhenComment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_recommendation", upvoteWhenComment());
        if (TextUtils.equals(str, "button_send")) {
            InterfaceC178496zV interfaceC178496zV2 = this.LJLILLLLZI;
            if (interfaceC178496zV2 != null) {
                C50420Jqa c50420Jqa = new C50420Jqa(57, content.toString());
                c50420Jqa.LJLJI = bundle;
                interfaceC178496zV2.onInternalEvent(c50420Jqa);
            }
        } else {
            InterfaceC178496zV interfaceC178496zV3 = this.LJLILLLLZI;
            if (interfaceC178496zV3 != null) {
                C50420Jqa c50420Jqa2 = new C50420Jqa(11, content.toString());
                c50420Jqa2.LJLJI = bundle;
                interfaceC178496zV3.onInternalEvent(c50420Jqa2);
            }
        }
        AbstractBottomPriorityComponent LIZIZ = this.LJLJI.LIZIZ();
        if (LIZIZ != null) {
            LIZ(LIZIZ, new AqS14S0202000_3(i, i2, content, c177156xL, 0));
        }
    }
}
