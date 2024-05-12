package X;

import Y.ACListenerS21S0100000_1;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.top.BottomNoticeViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3sl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97873sl extends FrameLayout implements GenericLifecycleObserver, C3WZ {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final /* synthetic */ C85373Wr LJLIL;
    public boolean LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C97873sl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    @Override // X.C3WZ
    public final void LJIILIIL() {
        this.LJLIL.LJIILIIL();
    }

    @Override // X.C3WY
    public final void LLIIJLIL(C3WR l) {
        o.LJIIIZ(l, "l");
        this.LJLIL.LLIIJLIL(l);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    private final TuxTextView getBodyTv() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-bodyTv>(...)");
        return (TuxTextView) value;
    }

    private final View getCloseButton() {
        return (View) this.LJLJLJ.getValue();
    }

    private final TuxTextView getMarkSafeButton() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-markSafeButton>(...)");
        return (TuxTextView) value;
    }

    private final View getReportButton() {
        return (View) this.LJLJJLL.getValue();
    }

    private final TuxTextView getTitleTv() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-titleTv>(...)");
        return (TuxTextView) value;
    }

    public final BottomNoticeViewModel getViewModel() {
        return (BottomNoticeViewModel) this.LJLJI.getValue();
    }

    public final void LIZ(boolean z) {
        String str;
        String str2;
        if (getVisibility() != 8) {
            if (z) {
                BottomNoticeViewModel viewModel = getViewModel();
                C99033ud c99033ud = viewModel.LLFF;
                if (c99033ud instanceof C98563ts) {
                    str = "group_chat";
                } else {
                    str = "dm_chat";
                }
                String str3 = viewModel.LLFFF;
                if (c99033ud != null) {
                    str2 = c99033ud.getConversationId();
                } else {
                    str2 = null;
                }
                viewModel.ov0(1, str3, str, str2);
            }
            this.LJLIL.LIZIZ(this);
        }
    }

    @Override // X.C3WY
    public final void LLJILLL(C3WR c3wr) {
        this.LJLIL.LJLIL.LLJILLL(c3wr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C97873sl(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r4 = 0
        L5:
            java.lang.String r0 = "context"
            defpackage.a1.LJFF(r3, r0)
            r0 = 0
            r2.<init>(r3, r4, r0)
            X.3Wr r0 = new X.3Wr
            r0.<init>()
            r2.LJLIL = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 301(0x12d, float:4.22E-43)
            r1.<init>(r3, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJI = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 300(0x12c, float:4.2E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJJI = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 296(0x128, float:4.15E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJJL = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 299(0x12b, float:4.19E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJJLL = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 298(0x12a, float:4.18E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJL = r0
            kotlin.jvm.internal.AqS151S0100000_1 r1 = new kotlin.jvm.internal.AqS151S0100000_1
            r0 = 297(0x129, float:4.16E-43)
            r1.<init>(r2, r0)
            X.Ol8 r0 = X.C221108m2.LIZIZ(r1)
            r2.LJLJLJ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97873sl.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void LIZIZ(C99033ud c99033ud, String str, String conversationId) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        String str2;
        String str3;
        o.LJIIIZ(conversationId, "conversationId");
        BottomNoticeViewModel viewModel = getViewModel();
        viewModel.LLFF = c99033ud;
        viewModel.LLFFF = str;
        if (this.LJLILLLLZI) {
            setVisibility(0);
            LJIILIIL();
        } else {
            this.LJLILLLLZI = true;
            View.inflate(getContext(), R.layout.b_k, this);
            View findViewById = findViewById(R.id.c_f);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            View findViewById2 = findViewById(R.id.c_3);
            if (findViewById2 != null) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.cl);
                c110614Vt.LIZJ = C61328O5c.LIZJ(8);
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                findViewById2.setBackground(c110614Vt.LIZ(context));
                findViewById2.setPadding(0, 0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
                ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    Context context2 = findViewById2.getContext();
                    o.LJIIIIZZ(context2, "it.context");
                    C26338AVi.LJII(marginLayoutParams, context2, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 0, AnonymousClass391.LIZJ(12), AnonymousClass391.LIZJ(12), 32);
                    findViewById2.setLayoutParams(marginLayoutParams);
                }
            }
            C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 186), getReportButton());
            C16880lQ.LJJJJI(getMarkSafeButton(), new ACListenerS21S0100000_1(this, 187));
            C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 188), getCloseButton());
            if (getViewModel().LLFF instanceof C98563ts) {
                getTitleTv().setText(R.string.etw);
                getBodyTv().setText(R.string.etv);
            } else if (((Boolean) C33694DKg.LIZIZ.getValue()).booleanValue() && C47261Igj.LJJIJIIJI("high_risk_predator_report_notice", "high_risk_report_notice", "predator_report_notice").contains(str)) {
                getTitleTv().setText(R.string.eqh);
                getBodyTv().setText(getContext().getString(R.string.eqg));
                getMarkSafeButton().setText(R.string.eqi);
            }
            BottomNoticeViewModel viewModel2 = getViewModel();
            viewModel2.pv0(1, viewModel2.LLFFF, false);
            setVisibility(0);
            LJIILIIL();
        }
        boolean z = getViewModel().LLFF instanceof C98563ts;
        C85323Wm eventSender = C772831o.LIZ();
        o.LJIIIZ(eventSender, "eventSender");
        C1HQ c1hq = new C1HQ();
        c1hq.put("enter_from", "chat");
        int hashCode = str.hashCode();
        if (hashCode != -2140634290) {
            if (hashCode != -1495853829) {
                if (hashCode == -318810992 && str.equals("high_risk_report_notice")) {
                    str2 = "high_risk_model";
                }
                str2 = "new chat";
            } else {
                if (str.equals("predator_report_notice")) {
                    str2 = "predator_model";
                }
                str2 = "new chat";
            }
        } else {
            if (str.equals("high_risk_predator_report_notice")) {
                str2 = "high_risk_model,predator_model";
            }
            str2 = "new chat";
        }
        c1hq.put("safety_flag_source", str2);
        c1hq.put("conversation_id", conversationId);
        if (z) {
            str3 = "report_group_notice_show";
        } else {
            str3 = "report_notice_show";
        }
        eventSender.LIZIZ(str3, c1hq);
    }
}
