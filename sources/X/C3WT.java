package X;

import Y.ACListenerS10S1101000_1;
import Y.ACListenerS21S0100000_1;
import Y.ARunnableS12S0300000_1;
import Y.AfS41S0300000_1;
import Y.AfS53S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.net.ui.INetworkStandardUIService;
import com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.3WT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3WT extends LinearLayout implements C3WY {
    public final /* synthetic */ C3WQ LJLIL;
    public C81403Hk LJLILLLLZI;
    public C98523to LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final java.util.Map<Integer, View> LJLJJLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3WT(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void LIZJ() {
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

    public final void LIZIZ() {
        String str;
        int i;
        int i2;
        int i3;
        IMUser fromUser;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.LJLJJI || getVisibility() == 8) {
            return;
        }
        this.LJLJJI = true;
        setOrientation(1);
        C16880lQ.LLLZIIL(R.layout.b_b, C16880lQ.LLZIL(getContext()), this);
        Boolean bool = null;
        if (C99W.LIZ) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                C26338AVi.LJII(marginLayoutParams, context, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 0, AnonymousClass391.LIZJ(12), AnonymousClass391.LIZJ(12), 32);
                setLayoutParams(marginLayoutParams);
            }
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
            c110614Vt.LIZJ = C61328O5c.LIZJ(8);
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            setBackground(c110614Vt.LIZ(context2));
        } else {
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            Integer LJI = C79045V0n.LJI(R.attr.cl, context3);
            if (LJI != null) {
                setBackgroundColor(LJI.intValue());
            }
        }
        View LIZ = LIZ(R.id.cdi);
        if (LIZ != null) {
            LIZ.setVisibility(8);
        }
        C16880lQ.LJJJJI((TuxTextView) LIZ(R.id.avs), new ACListenerS21S0100000_1(this, 81));
        C16880lQ.LJJJJI((TuxTextView) LIZ(R.id.ayi), new ACListenerS21S0100000_1(this, 82));
        ((TuxTextView) LIZ(R.id.avs)).setTuxFont(42);
        TextView textView = (TextView) LIZ(R.id.avs);
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context4));
        LIZ(R.id.ayi).setVisibility(0);
        C98523to c98523to = this.LJLJI;
        if (c98523to == null || (fromUser = c98523to.getFromUser()) == null || (str = fromUser.getDisplayName()) == null) {
            str = "";
        }
        TextView textView2 = (TextView) LIZ(R.id.lao);
        C116724i4 c116724i4 = new C116724i4();
        Resources resources = getContext().getResources();
        o.LJIIIIZZ(resources, "context.resources");
        c116724i4.LIZ(resources, R.string.i3l, str);
        textView2.setText(c116724i4.LIZ);
        C98523to c98523to2 = this.LJLJI;
        if (c98523to2 != null && c98523to2.isFiltered()) {
            i = 2;
        } else {
            i = 1;
        }
        C16880lQ.LJJJJI((TuxTextView) LIZ(R.id.auo), new ACListenerS10S1101000_1(this, str, i, 2));
        C98523to c98523to3 = this.LJLJI;
        if (c98523to3 != null) {
            bool = Boolean.valueOf(c98523to3.isTCM());
        }
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2)) {
            Context context5 = getContext();
            if (o.LJ(bool, bool2)) {
                i2 = R.string.euy;
            } else {
                i2 = R.string.epm;
            }
            String string = context5.getString(i2);
            o.LJIIIIZZ(string, "context.getString(if (is…m_message_request_report)");
            Context context6 = getContext();
            if (o.LJ(bool, bool2)) {
                i3 = R.string.eux;
            } else {
                i3 = R.string.epl;
            }
            String string2 = context6.getString(i3, string);
            o.LJIIIIZZ(string2, "context.getString(\n     …portString,\n            )");
            T5R t5r = new T5R(string2);
            t5r.LIZ(41);
            int LJJLIIIJL = s.LJJLIIIJL(string2, string, 0, false, 6);
            Context context7 = getContext();
            o.LJIIIIZZ(context7, "context");
            final int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.go, context7);
            t5r.setSpan(new ClickableSpan() { // from class: X.3i5
                @Override // android.text.style.ClickableSpan
                public final void onClick(View widget) {
                    o.LJIIIZ(widget, "widget");
                    C3WT.this.LJ();
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint ds) {
                    o.LJIIIZ(ds, "ds");
                    ds.setColor(LJIIIIZZ);
                    ds.setUnderlineText(false);
                }
            }, LJJLIIIJL, string.length() + LJJLIIIJL, 34);
            t5r.setSpan(new T5U(42, true), LJJLIIIJL, string.length() + LJJLIIIJL, 34);
            ((TextView) LIZ(R.id.kp_)).setMovementMethod(LinkMovementMethod.getInstance());
            ((TextView) LIZ(R.id.kp_)).setHighlightColor(0);
            ((TextView) LIZ(R.id.kp_)).setText(t5r);
            return;
        }
        C98523to c98523to4 = this.LJLJI;
        if (c98523to4 != null && c98523to4.isFiltered()) {
            ((TextView) LIZ(R.id.kp_)).setText(getContext().getString(R.string.i3k));
        } else {
            ((TextView) LIZ(R.id.kp_)).setText(getContext().getString(R.string.i3n));
        }
    }

    public final void LJ() {
        C98523to c98523to = this.LJLJI;
        if (c98523to != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
            if (LJJLIIIJ != null) {
                C98793uF.LIZLLL(new C91463iQ(c98523to, null, null, null, 14), LJJLIIIJ, "4", null, 24);
            }
            C1042547h.LJI(c98523to.getFromUser(), "chat", 8);
            C84643Tw.LJ(c98523to, "report", null, 12);
        }
    }

    public final void LJFF() {
        if (!C4VT.LIZIZ()) {
            return;
        }
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (C73340SqO.LJJIJ(LJIJJ)) {
            C34B.LIZIZ("StrangerChatRiskHint", "activity available");
            INetworkStandardUIService createINetworkStandardUIServicebyMonsterPlugin = NetworkStandardUIServiceImpl.createINetworkStandardUIServicebyMonsterPlugin(false);
            o.LJIIIIZZ(createINetworkStandardUIServicebyMonsterPlugin, "get().getService(INetwor…ardUIService::class.java)");
            InterfaceC84463Te networkStateForSharePanel = createINetworkStandardUIServicebyMonsterPlugin.getNetworkStateForSharePanel();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("networkState: ");
            LIZ.append(networkStateForSharePanel);
            C34B.LIZIZ("StrangerChatRiskHint", X1D.LIZIZ(LIZ));
            if (LJIJJ == null) {
                return;
            }
            new Handler(C16880lQ.LLJJJJ()).post(new ARunnableS12S0300000_1(networkStateForSharePanel, createINetworkStandardUIServicebyMonsterPlugin, LJIJJ, 3));
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        LIZIZ();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3WT(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = "context"
            java.util.LinkedHashMap r0 = X.C62850Ola.LJFF(r2, r0)
            r1.LJLJJLL = r0
            r0 = 0
            r1.<init>(r2, r3, r0)
            X.3WQ r0 = new X.3WQ
            r0.<init>()
            r1.LJLIL = r0
            r1.LIZIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3WT.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void LIZLLL(C98523to c98523to, int i, EnumC96103pu enumC96103pu) {
        String str;
        C73428Sro LJJL;
        String secUid;
        if (this.LJLJJL) {
            return;
        }
        this.LJLJJL = true;
        IMUser fromUser = c98523to.getFromUser();
        Integer num = null;
        if (fromUser != null) {
            str = fromUser.getUid();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        IMUser fromUser2 = c98523to.getFromUser();
        if (fromUser2 != null && (secUid = fromUser2.getSecUid()) != null) {
            str2 = secUid;
        }
        String conversationId = c98523to.getConversationId();
        if (enumC96103pu != null) {
            num = Integer.valueOf(enumC96103pu.getValue());
        }
        o.LJIIIZ(conversationId, "conversationId");
        AbstractC73672Svk<BaseResponse> postChatStrangeUnLimit = C30U.LIZ().postChatStrangeUnLimit(str, str2, conversationId, i, num);
        if (postChatStrangeUnLimit == null || (LJJL = postChatStrangeUnLimit.LJJL(T16.LIZ())) == null || LJJL.LJJJLIIL(new AfS41S0300000_1(this, c98523to, enumC96103pu, 0), new AfS53S0100000_1(this, 28)) == null) {
            this.LJLJJL = false;
        }
        C84643Tw.LJ(c98523to, "accept", enumC96103pu, 8);
    }
}
