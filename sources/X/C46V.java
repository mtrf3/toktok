package X;

import Y.ACListenerS36S0200000_1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.experiment.SuggestedReplyExperiment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.SuggestedReplyViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedreply.data.SuggestedReply;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.46V, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C46V {
    public final View LIZ;
    public final InterfaceC1039746f LIZIZ;
    public final AnonymousClass472<TuxTextView> LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C62822Ol8 LJ;
    public C109544Rq LJFF;
    public final C62822Ol8 LJI;

    public final C119774mz LIZJ() {
        return (C119774mz) this.LJI.getValue();
    }

    public final SuggestedReplyViewModel LIZLLL() {
        return (SuggestedReplyViewModel) this.LIZLLL.getValue();
    }

    public final String LIZIZ() {
        int measuredHeight = LIZJ().getMeasuredHeight();
        int i = 0;
        View childAt = LIZJ().getChildAt(0);
        if (childAt != null) {
            i = childAt.getMeasuredHeight();
        }
        if (measuredHeight > i * 2) {
            return "two_row";
        }
        return "one_row";
    }

    public final void LIZ(C109544Rq msg) {
        List<SuggestedReply> jv0;
        int i;
        int i2;
        TextView textView;
        o.LJIIIZ(msg, "msg");
        this.LJFF = msg;
        int i3 = 8;
        if (SuggestedReplyExperiment.LIZJ()) {
            SuggestedReplyViewModel LIZLLL = LIZLLL();
            int i4 = 0;
            if (LIZLLL != null && SuggestedReplyViewModel.gv0(LIZLLL, msg)) {
                SuggestedReplyViewModel LIZLLL2 = LIZLLL();
                if (LIZLLL2 == null || (jv0 = LIZLLL2.jv0(msg)) == null) {
                    LIZJ().setVisibility(8);
                    InterfaceC1039746f interfaceC1039746f = this.LIZIZ;
                    if (interfaceC1039746f != null) {
                        interfaceC1039746f.LIZLLL(true);
                        return;
                    }
                    return;
                }
                if (!SuggestedReplyExperiment.LIZJ() || !SuggestedReplyExperiment.LIZJ()) {
                    return;
                }
                LIZJ().setVisibility(0);
                String str = msg.getLocalExt().get("SUG_REPLY_SHOW_TIME");
                if (str == null || str.length() == 0) {
                    java.util.Map<String, String> localExt = msg.getLocalExt();
                    o.LJIIIIZZ(localExt, "localExt");
                    localExt.put("SUG_REPLY_SHOW_TIME", String.valueOf(System.currentTimeMillis()));
                    C106674Gp.LJIILJJIL(msg);
                }
                InterfaceC1039746f interfaceC1039746f2 = this.LIZIZ;
                if (interfaceC1039746f2 != null) {
                    interfaceC1039746f2.LIZLLL(false);
                }
                int i5 = 0;
                for (SuggestedReply suggestedReply : jv0) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        SuggestedReply suggestedReply2 = suggestedReply;
                        if (i5 < LIZJ().getChildCount()) {
                            View childAt = LIZJ().getChildAt((LIZJ().getChildCount() - jv0.size()) + i5);
                            if (!(childAt instanceof TuxTextView) || (textView = (TextView) childAt) == null) {
                                LIZJ().setVisibility(i3);
                                return;
                            } else {
                                textView.setText(C78880UxY.LJJJJI(suggestedReply2));
                                textView.setTag(suggestedReply2);
                            }
                        } else {
                            C119774mz LIZJ = LIZJ();
                            Context context = this.LIZ.getContext();
                            o.LJIIIIZZ(context, "itemView.context");
                            TuxTextView tuxTextView = new TuxTextView(context, null, 6, i4);
                            tuxTextView.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                            C26338AVi.LJI(tuxTextView, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), C1FJ.LIZIZ(8), false, 19);
                            boolean booleanValue = ((Boolean) SuggestedReplyExperiment.LJI.getValue()).booleanValue();
                            Double valueOf = Double.valueOf(0.5d);
                            Integer valueOf2 = Integer.valueOf(R.attr.ds);
                            Integer valueOf3 = Integer.valueOf(R.attr.cf);
                            if (booleanValue) {
                                C110614Vt c110614Vt = new C110614Vt();
                                c110614Vt.LIZJ = C61328O5c.LIZJ(16);
                                c110614Vt.LIZIZ = valueOf3;
                                c110614Vt.LJFF = valueOf2;
                                c110614Vt.LIZLLL = Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf)));
                                Context context2 = this.LIZ.getContext();
                                o.LJIIIIZZ(context2, "itemView.context");
                                tuxTextView.setBackground(c110614Vt.LIZ(context2));
                                tuxTextView.setHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(55)));
                                tuxTextView.setWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(55)));
                                tuxTextView.setTextSize(1, 28.0f);
                            } else {
                                tuxTextView.setHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(32)));
                                C110614Vt c110614Vt2 = new C110614Vt();
                                if (SuggestedReplyExperiment.LIZJ()) {
                                    i2 = 8;
                                } else {
                                    i2 = 20;
                                }
                                c110614Vt2.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(i2));
                                c110614Vt2.LIZIZ = valueOf3;
                                c110614Vt2.LJFF = valueOf2;
                                c110614Vt2.LIZLLL = Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(valueOf)));
                                Context context3 = this.LIZ.getContext();
                                o.LJIIIIZZ(context3, "itemView.context");
                                tuxTextView.setBackground(c110614Vt2.LIZ(context3));
                                tuxTextView.setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(257)));
                                C26338AVi.LJIIIZ(tuxTextView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(11))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(11))), null, 26);
                                tuxTextView.setTuxFont(51);
                                tuxTextView.setTextColorRes(R.attr.go);
                            }
                            tuxTextView.setGravity(17);
                            tuxTextView.setOnTouchListener(new ViewOnTouchListenerC86418Xvq(tuxTextView.getContext(), true));
                            C16880lQ.LJJJJI(tuxTextView, new ACListenerS36S0200000_1(tuxTextView, this, 34));
                            tuxTextView.setText(C78880UxY.LJJJJI(suggestedReply2));
                            tuxTextView.setTag(suggestedReply2);
                            LIZJ.addView(tuxTextView);
                        }
                        i3 = 8;
                        i4 = 0;
                        i5 = i6;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                if (SuggestedReplyExperiment.LIZJ() && LIZJ().getChildCount() == jv0.size()) {
                    C119774mz LIZJ2 = LIZJ();
                    Context context4 = this.LIZ.getContext();
                    o.LJIIIIZZ(context4, "itemView.context");
                    TuxTextView tuxTextView2 = new TuxTextView(context4, null, 6, 0);
                    tuxTextView2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
                    C26338AVi.LJI(tuxTextView2, null, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), C1FJ.LIZIZ(8), false, 19);
                    tuxTextView2.setTuxFont(61);
                    tuxTextView2.setTextSize(1, 13.0f);
                    tuxTextView2.setTextColorRes(R.attr.gv);
                    C1DG.LJI(this.LIZ, R.string.euj, tuxTextView2);
                    i = 0;
                    LIZJ2.addView(tuxTextView2, 0);
                } else {
                    i = 0;
                }
                LIZJ().measure(View.MeasureSpec.makeMeasureSpec(O6R.LJJIIZ(C32151Nz.LJIIZILJ(257)), 1073741824), View.MeasureSpec.makeMeasureSpec(i, i));
                SuggestedReplyViewModel LIZLLL3 = LIZLLL();
                if (LIZLLL3 != null) {
                    LIZLLL3.mv0(msg, LIZIZ());
                }
                C46W.LJ("private", msg, "under_video", C46U.LJIIJJI(jv0), LIZIZ());
                return;
            }
        }
        LIZJ().setVisibility(8);
        InterfaceC1039746f interfaceC1039746f3 = this.LIZIZ;
        if (interfaceC1039746f3 != null) {
            interfaceC1039746f3.LIZLLL(true);
        }
    }

    public C46V(View itemView, InterfaceC1039746f interfaceC1039746f, AnonymousClass472<TuxTextView> noticeTv) {
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(noticeTv, "noticeTv");
        this.LIZ = itemView;
        this.LIZIZ = interfaceC1039746f;
        this.LIZJ = noticeTv;
        this.LIZLLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 850));
        this.LJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 848));
        this.LJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 849));
    }
}
