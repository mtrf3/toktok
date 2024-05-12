package X;

import Y.ACListenerS16S0301000_1;
import Y.IDCListenerS294S0100000_1;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.message.template.card.InfoCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.infocard.InfoCardButtonComponent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4A0, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4A0 extends AnonymousClass461<InfoCardTemplate> {
    public final LinearLayout LLIIIJ;
    public final TuxTextView LLIIIL;

    @Override // X.AbstractC1041546x
    public final View a0() {
        return null;
    }

    public final TuxTextView o0(String str) {
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(str);
        tuxTextView.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        tuxTextView.setTuxFont(32);
        Context context2 = this.itemView.getContext();
        if (context2 != null) {
            tuxTextView.setTextColor(C04330Ez.LIZJ(R.color.m0, context2));
        }
        tuxTextView.setOnLongClickListener(new IDCListenerS294S0100000_1(this, 4));
        return tuxTextView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4A0(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        this.LLIIIJ = (LinearLayout) itemView.findViewById(R.id.l3r);
        this.LLIIIL = (TuxTextView) itemView.findViewById(R.id.lao);
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null) {
            anonymousClass470.LIZIZ(50331648, 102);
        }
    }

    public void n0(C109544Rq msg, InfoCardTemplate infoCardTemplate) {
        o.LJIIIZ(msg, "msg");
        LinearLayout linearLayout = this.LLIIIJ;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        List<InfoCardButtonComponent> list = infoCardTemplate.infoCardButtons;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<InfoCardButtonComponent> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().cardText.text);
        }
        char[] LIZ = C769730j.LIZ(msg);
        if (LIZ == null) {
            int size = arrayList.size();
            LIZ = new char[size];
            for (int i = 0; i < size; i++) {
                LIZ[i] = '0';
            }
        }
        Iterator it2 = arrayList.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                String displayText = (String) next;
                if (LIZ[i2] == '1') {
                    LinearLayout linearLayout2 = this.LLIIIJ;
                    if (linearLayout2 != null) {
                        o.LJIIIZ(displayText, "displayText");
                        TuxTextView o0 = o0(displayText);
                        o0.setAlpha(0.34f);
                        linearLayout2.addView(o0);
                    }
                } else {
                    ACListenerS16S0301000_1 aCListenerS16S0301000_1 = new ACListenerS16S0301000_1(i2, msg, infoCardTemplate, LIZ, 2);
                    TuxTextView o02 = o0(displayText);
                    o02.setClickable(true);
                    C16880lQ.LJJJJI(o02, aCListenerS16S0301000_1);
                    LinearLayout linearLayout3 = this.LLIIIJ;
                    if (linearLayout3 != null) {
                        linearLayout3.addView(o02);
                    }
                }
                i2 = i3;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
    }

    @Override // X.AbstractC1041546x
    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        View view;
        o.LJIIIZ(msg, "msg");
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        C49V c49v2 = new C49V(C49W.LIZ(msg.isSelf(), true, C90193gN.LIZ()), C49R.LIZ.LJIIJJI, new C48E(AnonymousClass636.LJIIIIZZ(R.attr.cr, context)));
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 == null || (view = anonymousClass470.LIZ) == null) {
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        C77413UZt.LJFF(gradientDrawable, c49v2);
        view.setBackground(gradientDrawable);
    }

    @Override // X.AnonymousClass461
    public final void m0(C109544Rq msg, C109544Rq c109544Rq, InfoCardTemplate infoCardTemplate, int i) {
        InfoCardTemplate infoCardTemplate2 = infoCardTemplate;
        o.LJIIIZ(msg, "msg");
        TuxTextView tuxTextView = this.LLIIIL;
        if (tuxTextView != null) {
            String str = infoCardTemplate2.cardTitle.title.text;
            if (str.length() == 0) {
                str = C88913eJ.LIZ(this.itemView, R.string.ev4, "itemView.context.getStri…t_card_unavailable_title)");
            }
            tuxTextView.setText(str);
        }
        n0(msg, infoCardTemplate2);
    }
}
