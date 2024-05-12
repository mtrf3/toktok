package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.TakoForFeedContent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.47z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1044347z extends AnonymousClass460<TakoForFeedContent> {
    public final EnumC110124Tw LLIIIL;
    public final View LLIIIZ;
    public final ImageView LLIIJI;
    public final TuxTextView LLIIJLIL;
    public final TuxTextView LLIIL;
    public final View LLIILII;
    public TakoForFeedContent LLIILZL;
    public final AppCompatImageView LLIIZ;

    @Override // X.AbstractC1041546x
    public final View a0() {
        EnumC110124Tw enumC110124Tw = this.LLIIIL;
        if (enumC110124Tw == EnumC110124Tw.TEXT_BIG_EMOJI_SEND || enumC110124Tw == EnumC110124Tw.TEXT_BIG_EMOJI_RECEIVE) {
            return super.a0();
        }
        return this.LLIIIZ;
    }

    @Override // X.AbstractC1041546x
    public final void LJJJJIZL() {
        super.LJJJJIZL();
        C78555UsJ.LJJJJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1044347z(View itemView, EnumC110124Tw messageType) {
        super(itemView, messageType);
        Drawable background;
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(messageType, "messageType");
        this.LLIIIL = messageType;
        C221108m2.LIZIZ(new AqS151S0100000_1(this, 812));
        this.LLIIIZ = itemView.findViewById(R.id.bun);
        this.LLIIJLIL = (TuxTextView) itemView.findViewById(R.id.gnu);
        this.LLIILII = itemView.findViewById(R.id.bst);
        this.LLIIJI = (ImageView) itemView.findViewById(R.id.acf);
        this.LLIIL = (TuxTextView) itemView.findViewById(R.id.ow);
        this.LLIIZ = (AppCompatImageView) itemView.findViewById(R.id.gnq);
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null && (background = anonymousClass470.LIZ.getBackground()) != null) {
            background.setAutoMirrored(true);
        }
    }

    public final void s0(C109544Rq c109544Rq, TakoForFeedContent takoForFeedContent) {
        int i;
        if (c109544Rq == null || takoForFeedContent == null) {
            return;
        }
        if (!takoForFeedContent.getWith_action()) {
            TuxTextView tuxTextView = this.LLIIL;
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setVisibility(8);
            return;
        }
        Integer LIZIZ = C19N.LIZIZ(this.itemView, "itemView.context", R.attr.eb);
        if (LIZIZ != null) {
            i = LIZIZ.intValue();
        } else {
            i = 0;
        }
        C78555UsJ.LJJJJ();
        C78555UsJ.LJJJJ();
        TuxTextView tuxTextView2 = this.LLIIL;
        if (tuxTextView2 != null) {
            tuxTextView2.setText((CharSequence) null);
        }
        TuxTextView tuxTextView3 = this.LLIIL;
        if (tuxTextView3 != null) {
            tuxTextView3.setTextColor(i);
        }
        TuxTextView tuxTextView4 = this.LLIIL;
        if (tuxTextView4 != null) {
            tuxTextView4.setVisibility(0);
        }
        TuxTextView tuxTextView5 = this.LLIIL;
        if (tuxTextView5 == null) {
            return;
        }
        C16880lQ.LJJJJI(tuxTextView5, null);
    }

    @Override // X.AbstractC1041546x
    public final void N(C49V c49v, C109544Rq msg, C109544Rq c109544Rq, C109544Rq c109544Rq2) {
        boolean z;
        View view;
        View view2;
        View view3;
        o.LJIIIZ(msg, "msg");
        boolean LJJIJIIJIL = C78939UyV.LJJIJIIJIL(msg, c109544Rq);
        boolean LJJIJIL = C78939UyV.LJJIJIL(msg, c109544Rq2);
        boolean z2 = true;
        if (msg.getReferenceInfo() != null) {
            z = true;
        } else {
            z = false;
        }
        Context context = this.itemView.getContext();
        o.LJIIIIZZ(context, "itemView.context");
        if (!LJJIJIIJIL || z) {
            z2 = false;
        }
        C49V LJIILIIL = C77413UZt.LJIILIIL(context, z2, LJJIJIL, C90193gN.LIZ());
        AnonymousClass470 anonymousClass470 = this.LJLJJI;
        if (anonymousClass470 != null && (view3 = anonymousClass470.LIZ) != null) {
            view3.setPadding(0, C7MY.LIZIZ(12), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        }
        AnonymousClass470 anonymousClass4702 = this.LJLJJI;
        if (anonymousClass4702 != null && (view2 = anonymousClass4702.LIZ) != null) {
            view2.setTranslationX(0.0f);
        }
        AnonymousClass470 anonymousClass4703 = this.LJLJJI;
        if (anonymousClass4703 != null && (view = anonymousClass4703.LIZ) != null) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            C77413UZt.LJFF(gradientDrawable, LJIILIIL);
            view.setBackground(gradientDrawable);
        }
        AppCompatImageView appCompatImageView = this.LLIIZ;
        if (appCompatImageView != null) {
            if (LJJIJIL) {
                appCompatImageView.setVisibility(0);
                C48E c48e = LJIILIIL.LIZJ;
                if (c48e != null) {
                    this.LLIIZ.setColorFilter(c48e.LJLIL);
                    return;
                }
                return;
            }
            appCompatImageView.setVisibility(8);
        }
    }

    @Override // X.AnonymousClass460
    public final void p0(C109544Rq msg, C109544Rq c109544Rq, TakoForFeedContent takoForFeedContent, int i) {
        String text;
        TakoForFeedContent takoForFeedContent2 = takoForFeedContent;
        o.LJIIIZ(msg, "msg");
        if (takoForFeedContent2 == null || takoForFeedContent2.getText() == null) {
            return;
        }
        this.LLIILZL = takoForFeedContent2;
        if (!takoForFeedContent2.getWith_action()) {
            TuxTextView tuxTextView = this.LLIIJLIL;
            if (tuxTextView != null) {
                tuxTextView.setText(takoForFeedContent2.getText());
            }
        } else {
            SpannableString spannableString = new SpannableString(takoForFeedContent2.getText());
            C78555UsJ.LJJJJ();
            if (C78857UxB.LJJJIL(null) && (text = takoForFeedContent2.getText()) != null && s.LJJJLZIJ(text, null, false)) {
                new StyleSpan(1);
                s.LJJLIIIJL(takoForFeedContent2.getText(), null, 0, false, 6);
                s.LJJLIIIJL(takoForFeedContent2.getText(), null, 0, false, 6);
                throw null;
            }
            TuxTextView tuxTextView2 = this.LLIIJLIL;
            if (tuxTextView2 != null) {
                tuxTextView2.setText(spannableString);
            }
        }
        s0(msg, takoForFeedContent2);
        C97223ri LJIIIZ = C96963rI.LJIIIZ();
        ImageView imageView = this.LLIIJI;
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        LJIIIZ.getClass();
        C97223ri.LIZ(imageView, msg, itemView);
        C78555UsJ.LJJJJ();
    }
}
