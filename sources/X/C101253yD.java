package X;

import Y.ACListenerS21S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Message;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SystemContent;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.ImApi;
import com.ss.android.ugc.aweme.im.sdk.common.data.model.BlockResponse;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS105S0300000_1;
import kotlin.jvm.internal.AqS132S0200000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3yD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C101253yD extends ClickableSpan implements WeakHandler.IHandler {
    public final int LJLIL;
    public final String LJLILLLLZI;
    public final C99033ud LJLJI;
    public CharSequence LJLJJI;
    public String LJLJJL;
    public SystemContent.Key LJLJJLL;
    public IMUser LJLJL;
    public WeakHandler LJLJLJ;

    public static void LIZ(Object obj) {
        Context LIZIZ = EF7.LIZIZ();
        if (obj instanceof C38333F2r) {
            KL2.LJ(LIZIZ, 0, ((C38333F2r) obj).getErrorMsg());
            return;
        }
        if (obj instanceof Exception) {
            KL2.LJ(LIZIZ, 0, LIZIZ.getString(R.string.h5q));
            return;
        }
        if (!(obj instanceof BlockResponse)) {
            return;
        }
        BlockResponse blockResponse = (BlockResponse) obj;
        if (blockResponse.getBlockStaus() == 1) {
            KL2.LJ(LIZIZ, 0, LIZIZ.getString(R.string.h4h));
        } else {
            if (blockResponse.getBlockStaus() != 0) {
                return;
            }
            KL2.LJ(LIZIZ, 0, LIZIZ.getString(R.string.h_b));
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message msg) {
        o.LJIIIZ(msg, "msg");
        int i = msg.what;
        if (i == 1) {
            Object obj = msg.obj;
            o.LJIIIIZZ(obj, "msg.obj");
            LIZ(obj);
        } else {
            if (i != 0) {
                return;
            }
            Object obj2 = msg.obj;
            o.LJIIIIZZ(obj2, "msg.obj");
            LIZ(obj2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [com.ss.android.ugc.aweme.im.service.model.IMUser, T] */
    /* JADX WARN: Type inference failed for: r0v22, types: [com.ss.android.ugc.aweme.im.service.model.IMUser, T] */
    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        boolean z;
        boolean z2;
        String str;
        SystemContent.Key key;
        boolean z3;
        boolean z4;
        FragmentManager supportFragmentManager;
        Activity LJIJJ;
        int i;
        BaseTemplate baseTemplate;
        SystemContent LIZ;
        SystemContent.Key[] template;
        String str2;
        String str3;
        SystemContent.Key key2;
        java.util.Map<String, String> extra;
        String name;
        String str4;
        o.LJIIIZ(widget, "widget");
        if (this.LJLJLJ == null) {
            this.LJLJLJ = new WeakHandler(C16880lQ.LLJJJJ(), this);
        }
        Activity LIZ2 = FT5.LIZ(widget, "widget.context");
        SystemContent.Key key3 = this.LJLJJLL;
        if (key3 != null && 1 == key3.getAction()) {
            if (LIZ2 == null) {
                return;
            }
            C793739p.LIZ(LIZ2, this.LJLJL, 1, this.LJLILLLLZI);
            return;
        }
        SystemContent.Key key4 = this.LJLJJLL;
        if (key4 != null && 2 == key4.getAction()) {
            if (LIZ2 == null) {
                return;
            }
            C793739p.LIZ(LIZ2, this.LJLJL, 0, this.LJLILLLLZI);
            return;
        }
        SystemContent.Key key5 = this.LJLJJLL;
        if (key5 != null && 3 == key5.getAction()) {
            z = true;
        } else {
            z = false;
        }
        String str5 = null;
        String str6 = "";
        if (z) {
            if (widget.getTag() != null && (widget.getTag() instanceof Bundle)) {
                Object tag = widget.getTag();
                o.LJII(tag, "null cannot be cast to non-null type android.os.Bundle");
                C109544Rq c109544Rq = (C109544Rq) ((Bundle) tag).getSerializable("msg");
                if (c109544Rq != null && c109544Rq.getSender() > 0) {
                    C91453iP c91453iP = new C91453iP(c109544Rq, null, 6);
                    Activity LIZ3 = FT5.LIZ(widget, "widget.context");
                    if (LIZ3 != null) {
                        C98793uF.LIZLLL(c91453iP, LIZ3, "3", c109544Rq, 16);
                        Object tag2 = widget.getTag();
                        o.LJII(tag2, "null cannot be cast to non-null type android.os.Bundle");
                        String string = ((BaseBundle) tag2).getString("uid");
                        Resources resources = LIZ3.getResources();
                        o.LJIIIIZZ(resources, "context.resources");
                        C85323Wm LIZ4 = C772831o.LIZ();
                        C1HQ LIZ5 = C77800Ug8.LIZ(LIZ4, "onEventV3");
                        LIZ5.put("warning_type", resources.getString(R.string.qif));
                        LIZ5.put("from_user_id", string);
                        LIZ5.put("button_type", "report");
                        LIZ4.LIZIZ("im_warning_click", LIZ5);
                        if (c109544Rq != null) {
                            if (c109544Rq.getConversationType() == AbstractC63505Ow9.LIZIZ) {
                                C90643h6 c90643h6 = C90643h6.LIZ;
                                StringBuilder LIZ6 = X1D.LIZ();
                                LIZ6.append((Object) this.LJLJJI);
                                LIZ6.append("");
                                c90643h6.LIZLLL("group_chat_risk", X1D.LIZIZ(LIZ6), "im");
                                return;
                            }
                            str5 = c109544Rq.getConversationId();
                        }
                        C85323Wm LIZ7 = C772831o.LIZ();
                        C1HQ LIZ8 = C111074Xn.LIZ(LIZ7, "onEventV3", "enter_from", "chat", "enter_method", "click_notice");
                        LIZ8.put("process_id", C3Y4.LIZJ);
                        LIZ8.put("conversation_id", str5);
                        LIZ7.LIZIZ("click_report", LIZ8);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        SystemContent.Key key6 = this.LJLJJLL;
        if (key6 != null && 4 == key6.getAction()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || ((key = this.LJLJJLL) != null && 6 == key.getAction())) {
            if (SystemContent.LinkTypeExtra.isSafeWarningLink(this.LJLJJLL)) {
                C775932t.LIZ("click");
            }
            Context context = widget.getContext();
            SystemContent.Key key7 = this.LJLJJLL;
            if (key7 != null) {
                str = key7.getLink();
            } else {
                str = null;
            }
            C4AD.LIZ(context, str);
            return;
        }
        SystemContent.Key key8 = this.LJLJJLL;
        if (key8 != null && 8 == key8.getAction()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            Context context2 = widget.getContext();
            SystemContent.Key key9 = this.LJLJJLL;
            if (key9 != null) {
                str4 = key9.getLink();
            } else {
                str4 = null;
            }
            SmartRouter.buildRoute(context2, str4).open();
            C99033ud c99033ud = C3Y4.LIZLLL;
            C85323Wm LIZ9 = C772831o.LIZ();
            C1HQ LIZ10 = C77800Ug8.LIZ(LIZ9, "onEventV3");
            LIZ10.put("enter_from", C3Y4.LIZLLL(c99033ud));
            LIZ10.put("action", "change_setting");
            LIZ10.put("chat_type", C84643Tw.LIZ(c99033ud, false));
            LIZ9.LIZIZ("change_setting_toast_response", LIZ10);
            return;
        }
        SystemContent.Key key10 = this.LJLJJLL;
        if (key10 != null && 5 == key10.getAction()) {
            Context context3 = widget.getContext();
            SystemContent.Key key11 = this.LJLJJLL;
            if (key11 != null && (name = key11.getName()) != null) {
                str6 = name;
            }
            Intent intent = new Intent();
            intent.setAction("android.intent.action.DIAL");
            StringBuilder LIZ11 = X1D.LIZ();
            LIZ11.append("tel:");
            LIZ11.append(str6);
            intent.setData(UriProtector.parse(X1D.LIZIZ(LIZ11)));
            intent.addFlags(268435456);
            if (context3 != null) {
                try {
                    C16880lQ.LIZJ(context3, intent);
                    return;
                } catch (Exception unused) {
                    C26045AKb c26045AKb = new C26045AKb(widget);
                    c26045AKb.LIZ(true);
                    c26045AKb.LJIIIIZZ(R.string.h_1);
                    c26045AKb.LJIIJ();
                    return;
                }
            }
            return;
        }
        SystemContent.Key key12 = this.LJLJJLL;
        if (key12 != null && 9 == key12.getAction()) {
            C96093pt.LIZIZ(String.valueOf(this.LJLJJI), this.LJLJJL);
            return;
        }
        SystemContent.Key key13 = this.LJLJJLL;
        if (key13 != null && 7 == key13.getAction()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            C85323Wm onEventV3 = C772831o.LIZ();
            o.LJIIIZ(onEventV3, "onEventV3");
            C1HQ c1hq = new C1HQ();
            c1hq.put("enter_from", "chat");
            c1hq.put("process_id", C3Y4.LIZJ);
            onEventV3.LIZIZ("click_feedback", c1hq);
            if (widget.getTag() != null && (widget.getTag() instanceof Bundle)) {
                Object tag3 = widget.getTag();
                o.LJII(tag3, "null cannot be cast to non-null type android.os.Bundle");
                C109544Rq c109544Rq2 = (C109544Rq) ((Bundle) tag3).getSerializable("msg");
                if (c109544Rq2 == null) {
                    return;
                }
                String localExtValue = c109544Rq2.getLocalExtValue("key_feedback_sent_state");
                if (C78685UuP.LJJJZ(localExtValue) && (o.LJ(localExtValue, EnumC101263yE.SENT.getState()) || o.LJ(localExtValue, EnumC101263yE.SENDING.getState()))) {
                    AnonymousClass030.LJ(widget, R.string.eie);
                    return;
                }
                try {
                    if (C93793mB.LJIILL(c109544Rq2)) {
                        Object LJIIL = C1DJ.LJIIL(c109544Rq2);
                        if (LJIIL instanceof BaseTemplate) {
                            baseTemplate = (BaseTemplate) LJIIL;
                            LIZ = C44K.LIZ(c109544Rq2, baseTemplate);
                            if (LIZ == null && (template = LIZ.getTemplate()) != null && template.length != 0 && template[0].getExtra() != null) {
                                c109544Rq2.addLocalExt("key_feedback_sent_state", EnumC101263yE.SENDING.getState());
                                C106674Gp.LJIILJJIL(c109544Rq2);
                                String valueOf = String.valueOf(c109544Rq2.getMsgType());
                                String conversationId = c109544Rq2.getConversationId();
                                Long valueOf2 = Long.valueOf(c109544Rq2.getConversationShortId());
                                SystemContent.Key[] template2 = LIZ.getTemplate();
                                if (template2 != null && (key2 = (SystemContent.Key) ORY.LJJJJI(0, template2)) != null && (extra = key2.getExtra()) != null) {
                                    str2 = extra.get(WM7.SCENE_SERVICE);
                                } else {
                                    str2 = null;
                                }
                                String content = c109544Rq2.getContent();
                                Long valueOf3 = Long.valueOf(C81273Gx.LIZLLL(c109544Rq2.getConversationId()));
                                String uuid = c109544Rq2.getUuid();
                                Long valueOf4 = Long.valueOf(c109544Rq2.getMsgId());
                                C64537PUn contentPB = c109544Rq2.getContentPB();
                                String scene = c109544Rq2.getScene();
                                ImApi imApi = C793739p.LIZIZ;
                                if (contentPB != null) {
                                    str3 = contentPB.base64();
                                } else {
                                    str3 = null;
                                }
                                C73542Ste.LIZLLL(AbstractC73638SvC.LJIIZILJ(imApi.feedBackMsg(valueOf, conversationId, valueOf2, str2, content, valueOf3, uuid, valueOf4, str3, scene)).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()), new AqS167S0100000_1(c109544Rq2, 282), new AqS132S0200000_1(widget, c109544Rq2, 62));
                                return;
                            }
                            return;
                        }
                    }
                    LIZ = C44K.LIZ(c109544Rq2, baseTemplate);
                    if (LIZ == null) {
                        return;
                    } else {
                        return;
                    }
                } catch (Exception e) {
                    C34B.LIZLLL("MessageNoticeHelper", "getSystemNotice json error:", e);
                    return;
                }
                baseTemplate = null;
            }
        } else {
            SystemContent.Key key14 = this.LJLJJLL;
            if (key14 != null && 13 == key14.getAction()) {
                Object tag4 = widget.getTag();
                o.LJII(tag4, "null cannot be cast to non-null type android.os.Bundle");
                C109544Rq c109544Rq3 = (C109544Rq) ((Bundle) tag4).getSerializable("msg");
                if (c109544Rq3 == null) {
                    return;
                }
                Context context4 = widget.getContext();
                o.LJIIIIZZ(context4, "widget.context");
                C99033ud c99033ud2 = this.LJLJI;
                if (c99033ud2 == null) {
                    return;
                }
                ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context4);
                if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null && (LJIJJ = C45804HyK.LJIJJ(context4)) != null) {
                    C68322mC c68322mC = new C68322mC();
                    ?? singleChatFromUser = c99033ud2.getSingleChatFromUser();
                    if (singleChatFromUser != 0) {
                        c68322mC.element = singleChatFromUser;
                        ?? LJFF = C80533Eb.LJFF(singleChatFromUser.getUid(), ((IMUser) c68322mC.element).getSecUid());
                        if (LJFF != 0) {
                            c68322mC.element = LJFF;
                            C245319jz c245319jz = new C245319jz();
                            C252669vq[] c252669vqArr = new C252669vq[3];
                            C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.h8l);
                            LIZIZ.LIZJ = 1;
                            LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS105S0300000_1(c109544Rq3, LJIJJ, c99033ud2, 5), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                            c252669vqArr[0] = LIZIZ;
                            C252669vq LIZIZ2 = C06530Nl.LIZIZ(R.string.h4e);
                            LIZIZ2.LIZJ = 1;
                            LIZIZ2.LJ = new ACListenerS21S0100000_1(new AqS105S0300000_1(LJIJJ, (Activity) c68322mC, (C68322mC<IMUser>) c99033ud2, (C99033ud) 6), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                            c252669vqArr[1] = LIZIZ2;
                            C252669vq c252669vq = new C252669vq();
                            if (!C78897Uxp.LJJIJIIJIL()) {
                                i = R.string.eq4;
                            } else {
                                i = R.string.eq3;
                            }
                            c252669vq.LIZ(i);
                            c252669vq.LJ = new ACListenerS21S0100000_1(new AqS167S0100000_1(context4, 217), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
                            c252669vqArr[2] = c252669vq;
                            c245319jz.LIZIZ(c252669vqArr);
                            c245319jz.LIZJ().show(supportFragmentManager, "DMMediaNudeFilterHelper#showMenuSheet");
                        }
                    }
                }
                C772831o.LIZ().LIZIZ("click_inline_dm_option", C113554cx.LJJL(new OSZ("enter_from", "chat"), new OSZ("chat_type", C98583tu.LIZIZ(this.LJLJI.getChatType())), new OSZ("platform", "internal"), new OSZ("action", "click"), new OSZ(WM7.SCENE_SERVICE, "sensitive_content_nude_filter")));
            }
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setColor(this.LJLIL);
        ds.setUnderlineText(false);
    }

    public C101253yD(int i, IMUser iMUser, String blockOrigin, C99033ud c99033ud) {
        String str;
        o.LJIIIZ(blockOrigin, "blockOrigin");
        this.LJLIL = i;
        this.LJLILLLLZI = blockOrigin;
        this.LJLJI = c99033ud;
        this.LJLJL = iMUser;
        if (iMUser != null) {
            str = iMUser.getUid();
        } else {
            str = null;
        }
        this.LJLJJI = str;
        if (str == null) {
            this.LJLJJI = CardStruct.IStatusCode.DEFAULT;
        }
        String secUid = iMUser != null ? iMUser.getSecUid() : null;
        this.LJLJJL = secUid;
        if (secUid == null) {
            this.LJLJJL = "";
        }
        if (this.LJLJLJ == null) {
            this.LJLJLJ = new WeakHandler(C16880lQ.LLJJJJ(), this);
        }
    }
}
