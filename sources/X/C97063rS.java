package X;

import Y.ACListenerS21S0100000_1;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.message.template.card.InteractiveNoticeTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.3rS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97063rS extends AnonymousClass461<InteractiveNoticeTemplate> {
    public final TextView LLIIIJ;
    public final TextView LLIIIL;
    public final View LLIIIZ;
    public InteractiveNoticeTemplate LLIIJI;
    public final C62822Ol8 LLIIJLIL;

    @Override // X.AbstractC1041546x
    public final boolean V(C109544Rq msg) {
        o.LJIIIZ(msg, "msg");
        return C93793mB.LJIIL(msg);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C97063rS(View itemView, EnumC110124Tw type) {
        super(itemView, type);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(type, "type");
        this.LLIIJLIL = C221108m2.LIZIZ(new AqS148S0200000_1(itemView, this, 45));
        this.LLIIIJ = (TextView) itemView.findViewById(R.id.hra);
        TextView textView = (TextView) itemView.findViewById(R.id.eq8);
        this.LLIIIL = textView;
        this.LLIIIZ = itemView.findViewById(R.id.eq7);
        if (textView != null) {
            C16880lQ.LJIJI(textView, new ACListenerS21S0100000_1(this, 228));
        }
    }

    @Override // X.AnonymousClass461
    public final void m0(C109544Rq msg, C109544Rq c109544Rq, InteractiveNoticeTemplate interactiveNoticeTemplate, int i) {
        String str;
        int i2;
        int i3;
        InteractiveNoticeTemplate interactiveNoticeTemplate2 = interactiveNoticeTemplate;
        o.LJIIIZ(msg, "msg");
        this.LLIIJI = interactiveNoticeTemplate2;
        C99033ud c99033ud = this.LJLLL;
        int i4 = 0;
        if (c99033ud != null && c99033ud.isTakoChat$im_base_release()) {
            View view = this.itemView;
            C96963rI.LJIIIZ().getClass();
            Integer valueOf = Integer.valueOf(C97223ri.LIZJ());
            C96963rI.LJIIIZ().getClass();
            C97343ru.LIZJ(view, valueOf, Integer.valueOf(C97223ri.LIZJ()), 5);
        }
        TextComponent textComponent = interactiveNoticeTemplate2.plainNotice;
        String str2 = null;
        if (textComponent != null) {
            str = textComponent.text;
        } else {
            str = null;
        }
        TextComponent textComponent2 = interactiveNoticeTemplate2.interactiveNotice;
        if (textComponent2 != null) {
            str2 = textComponent2.text;
        }
        TextView textView = this.LLIIIJ;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.LLIIIL;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        TextView textView3 = this.LLIIIJ;
        if (textView3 != null) {
            if (C1GE.LJIIL(str)) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            textView3.setVisibility(i2);
        }
        TextView textView4 = this.LLIIIL;
        if (textView4 != null) {
            if (C1GE.LJIIL(str2)) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            textView4.setVisibility(i3);
        }
        View view2 = this.LLIIIZ;
        if (view2 == null) {
            return;
        }
        if (!C1GE.LJIIL(str) && !C1GE.LJIIL(str2)) {
            i4 = 8;
        }
        view2.setVisibility(i4);
    }
}
