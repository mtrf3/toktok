package X;

import Y.ACListenerS21S0100000_1;
import Y.ARunnableS37S0100000_1;
import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.friends.services.FollowService;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMNoticeMsgStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.ImChatTopTipModelKt;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS69S1100000_1;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.3zt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C102293zt extends LinearLayout implements C3WY {
    public final /* synthetic */ C3WQ LJLIL;
    public C99033ud LJLILLLLZI;
    public TuxTextView LJLJI;
    public C119624mk LJLJJI;
    public TuxTextView LJLJJL;
    public SY4 LJLJJLL;
    public TuxIconView LJLJL;
    public TextView LJLJLJ;
    public TuxIconView LJLJLLL;
    public final boolean LJLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C102293zt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void LJ() {
        this.LJLIL.LIZ();
    }

    @Override // X.C3WY
    public final void LLIIJLIL(C3WR l) {
        o.LJIIIZ(l, "l");
        this.LJLIL.LLIIJLIL(l);
    }

    @Override // X.C3WY
    public final void LLJILLL(C3WR c3wr) {
        this.LJLIL.LLJILLL(c3wr);
    }

    private final int getAdvanceLayoutRes() {
        if (this.LJLL) {
            return R.layout.b13;
        }
        return R.layout.b12;
    }

    private final IMUser getFromUser() {
        C98523to c98523to;
        C99033ud c99033ud = this.LJLILLLLZI;
        if (!(c99033ud instanceof C98523to) || (c98523to = (C98523to) c99033ud) == null) {
            return null;
        }
        return c98523to.getFromUser();
    }

    private final int getNormalLayoutRes() {
        if (this.LJLL) {
            return R.layout.b16;
        }
        return R.layout.b15;
    }

    private final String getSecUid() {
        String secUid;
        C99033ud c99033ud = this.LJLILLLLZI;
        if (!(c99033ud instanceof C98523to)) {
            return "";
        }
        o.LJII(c99033ud, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.single.data.SingleSessionInfo");
        IMUser fromUser = ((C98523to) c99033ud).getFromUser();
        if (fromUser == null || (secUid = fromUser.getSecUid()) == null) {
            return "";
        }
        return secUid;
    }

    public final void LIZ() {
        C99033ud c99033ud = this.LJLILLLLZI;
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "eventSender");
        LIZ2.put("enter_from", C3Y4.LIZLLL(c99033ud));
        LIZ2.put("enter_method", "follow_button");
        LIZ.LIZIZ("follow", LIZ2);
        FollowService.createIFollowServicebyMonsterPlugin(false).sendRequest(getUid(), getSecUid(), 1, new AnonymousClass400() { // from class: X.3zv
            @Override // X.AnonymousClass400
            public final void LIZIZ() {
                C93493lh.LIZ(new ARunnableS37S0100000_1(C102293zt.this, 109));
            }

            @Override // X.AnonymousClass400
            public final void LIZ(Exception exc) {
                C38333F2r c38333F2r;
                C38333F2r c38333F2r2;
                String string = C102293zt.this.getContext().getString(R.string.h5q);
                C102293zt.this.getContext();
                if (C2NU.LIZ.LIZIZ()) {
                    Throwable th = null;
                    if (exc instanceof C38333F2r) {
                        c38333F2r = (C38333F2r) exc;
                    } else {
                        c38333F2r = null;
                    }
                    if (c38333F2r != null) {
                        String errorMsg = c38333F2r.getErrorMsg();
                        o.LJIIIIZZ(errorMsg, "it.errorMsg");
                        if (errorMsg.length() > 0) {
                            string = c38333F2r.getErrorMsg();
                            C26045AKb c26045AKb = new C26045AKb(C102293zt.this);
                            c26045AKb.LJIIIZ(string);
                            c26045AKb.LJIIJ();
                        }
                    }
                    if (exc != null) {
                        th = exc.getCause();
                    }
                    if ((th instanceof C38333F2r) && (c38333F2r2 = (C38333F2r) th) != null) {
                        String errorMsg2 = c38333F2r2.getErrorMsg();
                        o.LJIIIIZZ(errorMsg2, "it.errorMsg");
                        if (errorMsg2.length() > 0) {
                            string = c38333F2r2.getErrorMsg();
                        }
                    }
                    C26045AKb c26045AKb2 = new C26045AKb(C102293zt.this);
                    c26045AKb2.LJIIIZ(string);
                    c26045AKb2.LJIIJ();
                }
                string = C102293zt.this.getContext().getString(R.string.img);
                C26045AKb c26045AKb22 = new C26045AKb(C102293zt.this);
                c26045AKb22.LJIIIZ(string);
                c26045AKb22.LJIIJ();
            }
        });
    }

    public final void LJFF() {
        AbstractC73430Srq LIZ;
        SY4 sy4 = this.LJLJJLL;
        if (sy4 != null) {
            sy4.setLoading(true);
        }
        InterfaceC101453yX LJFF = a.LJIILIIL().LJFF();
        if (LJFF != null && (LIZ = LJFF.LIZ(2)) != null) {
            C73542Ste.LJIIIIZZ(LIZ.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()), new AqS167S0100000_1(this, 118), new AqS151S0100000_1(this, 302), null, 4);
        }
    }

    public final String getUid() {
        String uid;
        C99033ud c99033ud = this.LJLILLLLZI;
        if (!(c99033ud instanceof C98523to)) {
            return "";
        }
        o.LJII(c99033ud, "null cannot be cast to non-null type com.ss.android.ugc.aweme.im.sdk.chat.feature.single.data.SingleSessionInfo");
        IMUser fromUser = ((C98523to) c99033ud).getFromUser();
        if (fromUser == null || (uid = fromUser.getUid()) == null) {
            return "";
        }
        return uid;
    }

    public final void LIZIZ() {
        removeAllViews();
        setVisibility(8);
        LJ();
    }

    public final void LJII() {
        removeAllViews();
        C16880lQ.LLLZIIL(getAdvanceLayoutRes(), C16880lQ.LLZIL(getContext()), this);
        this.LJLJLJ = (TextView) findViewById(R.id.ee1);
        this.LJLJLLL = (TuxIconView) findViewById(R.id.ee2);
        String string = getContext().getString(R.string.er3);
        o.LJIIIIZZ(string, "context.getString(R.stri…_push_preview_banner_btn)");
        String string2 = getContext().getString(R.string.er4, string);
        o.LJIIIIZZ(string2, "context.getString(R.stri…_banner_main, buttonText)");
        SpannableString spannableString = new SpannableString(string2);
        spannableString.setSpan(new T5U(42, true), (string2.length() - string.length()) - 1, string2.length(), 18);
        TextView textView = this.LJLJLJ;
        if (textView != null) {
            textView.setText(spannableString);
        }
        TextView textView2 = this.LJLJLJ;
        if (textView2 != null) {
            C16880lQ.LJIJI(textView2, new ACListenerS21S0100000_1(this, 64));
        }
        TuxIconView tuxIconView = this.LJLJLLL;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS21S0100000_1(this, 65));
        }
        C62822Ol8 c62822Ol8 = C102343zy.LIZ;
        java.util.Set<String> stringSet = ((Keva) c62822Ol8.getValue()).getStringSet("key_notice_had_ack", OQY.INSTANCE);
        Keva keva = (Keva) c62822Ol8.getValue();
        stringSet.add("im_push_preview");
        keva.storeStringSet("key_notice_had_ack", stringSet);
        setVisibility(0);
    }

    public static void LIZLLL(int i) {
        C101573yj.LIZLLL(C101573yj.LIZ, "chat_page", "chat_room", i);
    }

    public final void LIZJ(C99033ud sessionInfo) {
        o.LJIIIZ(sessionInfo, "sessionInfo");
        if (sessionInfo.isReportPage()) {
            setVisibility(8);
        } else {
            this.LJLILLLLZI = sessionInfo;
        }
    }

    public final void LJI(IMNoticeMsgStruct noticeData) {
        o.LJIIIZ(noticeData, "noticeData");
        LJIIL("perm_on_reminder_banner");
        setVisibility(0);
        SY4 sy4 = this.LJLJJLL;
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS21S0100000_1(this, 62));
            sy4.setVisibility(0);
            C101573yj.LJIIIIZZ(C101573yj.LIZ, "chat_page", "chat_room");
        }
        TuxIconView tuxIconView = this.LJLJL;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS21S0100000_1(this, 63));
            tuxIconView.setVisibility(0);
        }
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            String tips = ImChatTopTipModelKt.toSystemContent(noticeData).getTips();
            if (tips == null) {
                tips = "";
            }
            tuxTextView.setText(tips);
            tuxTextView.setTuxFont(42);
            tuxTextView.setVisibility(0);
        }
    }

    public final void LJIIJ(SystemContent content) {
        SystemContent.Key key;
        o.LJIIIZ(content, "content");
        LJIIL("");
        C119624mk c119624mk = this.LJLJJI;
        if (c119624mk != null) {
            c119624mk.setVisibility(8);
        }
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
        }
        LJIIJJI(content);
        SystemContent.Key[] template = content.getTemplate();
        if (template != null && (key = (SystemContent.Key) ORY.LJJJ(template)) != null && key.getAction() == 8) {
            C99033ud c99033ud = this.LJLILLLLZI;
            C85323Wm LIZ = C772831o.LIZ();
            C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "onEventV3");
            LIZ2.put("enter_from", C3Y4.LIZLLL(c99033ud));
            LIZ2.put("chat_type", C84643Tw.LIZ(c99033ud, false));
            LIZ.LIZIZ("change_setting_toast_show", LIZ2);
        }
    }

    public final void LJIIJJI(SystemContent systemContent) {
        AnonymousClass472 anonymousClass472 = new AnonymousClass472(R.id.lgh, new C47D(this));
        IMUser fromUser = getFromUser();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C101323yK.LIZIZ(this, null, systemContent, anonymousClass472, fromUser, AnonymousClass636.LJIIIIZZ(R.attr.go, context), 0, true, this.LJLILLLLZI);
    }

    public final void LJIIL(String str) {
        C99033ud c99033ud;
        removeAllViews();
        C16880lQ.LLLZIIL(getNormalLayoutRes(), C16880lQ.LLZIL(getContext()), this);
        this.LJLJI = (TuxTextView) findViewById(R.id.lgh);
        this.LJLJJL = (TuxTextView) findViewById(R.id.lew);
        this.LJLJJLL = (SY4) findViewById(R.id.lg5);
        this.LJLJL = (TuxIconView) findViewById(R.id.lef);
        this.LJLJJI = (C119624mk) findViewById(R.id.le4);
        if (o.LJ(str, "perm_on_reminder_banner")) {
            if (!C89363f2.LIZ() || (c99033ud = this.LJLILLLLZI) == null || c99033ud.isReportPage()) {
                LIZIZ();
                return;
            }
            setVisibility(0);
            SY4 sy4 = this.LJLJJLL;
            if (sy4 != null) {
                C16880lQ.LJJIZ(sy4, new ACListenerS21S0100000_1(this, 66));
                sy4.setVisibility(0);
                C101573yj.LJIIIIZZ(C101573yj.LIZ, "chat_page", "chat_room");
            }
            TuxIconView tuxIconView = this.LJLJL;
            if (tuxIconView == null) {
                return;
            }
            C16880lQ.LJJJ(tuxIconView, new ACListenerS21S0100000_1(this, 67));
            tuxIconView.setVisibility(0);
            return;
        }
        if (o.LJ(str, "perm_on_reminder_banner")) {
            return;
        }
        setVisibility(0);
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView == null) {
            return;
        }
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS21S0100000_1(this, 68));
        tuxTextView.setText(R.string.gix);
        tuxTextView.setTuxFont(62);
    }

    public final C102003zQ LJIIIIZZ(InterfaceC102323zw sendNoticeAckAction, String str) {
        o.LJIIIZ(sendNoticeAckAction, "sendNoticeAckAction");
        removeAllViews();
        EnumC101413yT LJJI = C32151Nz.LJJI(str);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C102003zQ c102003zQ = new C102003zQ(context);
        c102003zQ.setStyle(LJJI);
        c102003zQ.setOnDismissEventListener(new AqS69S1100000_1(sendNoticeAckAction, str, 5));
        addView(c102003zQ);
        int i = C43J.LIZJ().getInt(C43J.LIZ(), 0) + 1;
        C43J.LIZJ().storeInt(C43J.LIZ(), i);
        if (i >= 3) {
            sendNoticeAckAction.LIZ(str);
        }
        setVisibility(0);
        return c102003zQ;
    }

    public final void LJIIIZ(IMNoticeMsgStruct noticeData, IMUser iMUser) {
        o.LJIIIZ(noticeData, "noticeData");
        LJIIL(noticeData.getNoticeCode());
        C119624mk c119624mk = this.LJLJJI;
        if (c119624mk != null) {
            c119624mk.setVisibility(0);
        }
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(0);
        }
        C4AS.LJII(this.LJLJJI, iMUser.getDisplayAvatar(), "chatTopTip", null, null, 0, 0, 504);
        LJIIJJI(ImChatTopTipModelKt.toSystemContent(noticeData));
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJIIZI(C3Y4.LIZLLL(this.LJLILLLLZI));
        c57362MfG.LJJLIIIIJ = EnumC57365MfJ.SHOW;
        User user = new User();
        user.setUid(iMUser.getUid());
        user.setFollowStatus(iMUser.getFollowStatus());
        c57362MfG.LJJJJIZL(user);
        c57362MfG.LJIILIIL();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C102293zt(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r2, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            X.3WQ r0 = new X.3WQ
            r0.<init>()
            r1.LJLIL = r0
            boolean r0 = X.C110594Vr.LIZ()
            r1.LJLL = r0
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C102293zt.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
