package X;

import Y.ACListenerS21S0201000_3;
import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.76T, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C76T extends ConstraintLayout {
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public InterfaceC65784Pro<C76800UCe> LJLJL;
    public InterfaceC88472Yns<? super String, C76800UCe> LJLJLJ;

    private final C224748ru getDelegateEditText() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-delegateEditText>(...)");
        return (C224748ru) value;
    }

    private final SmartAvatarImageView getIvAvatar() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-ivAvatar>(...)");
        return (SmartAvatarImageView) value;
    }

    private final LinearLayout getLlEmojiContainer() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-llEmojiContainer>(...)");
        return (LinearLayout) value;
    }

    private final TuxTextView getTvFakeEditText() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-tvFakeEditText>(...)");
        return (TuxTextView) value;
    }

    private final View getVBackground() {
        Object value = this.LJLILLLLZI.getValue();
        o.LJIIIIZZ(value, "<get-vBackground>(...)");
        return (View) value;
    }

    private final View getVTouchArea() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-vTouchArea>(...)");
        return (View) value;
    }

    public final void LJJLL() {
        SpannableString spannableString;
        Editable text = getDelegateEditText().getText();
        if (text != null) {
            spannableString = SpannableString.valueOf(text);
            o.LJIIIIZZ(spannableString, "SpannableString.valueOf(this)");
        } else {
            spannableString = null;
        }
        LJJLJLI(spannableString);
    }

    public final void LJJZ() {
        Editable text = getDelegateEditText().getText();
        if (text == null || text.length() == 0) {
            getTvFakeEditText().setText(getDelegateEditText().getHint());
        }
    }

    public final C224748ru getEditText() {
        return getDelegateEditText();
    }

    public final int getEmojiCount() {
        return getLlEmojiContainer().getChildCount();
    }

    public /* synthetic */ C76T(Context context) {
        this(context, null, 0);
    }

    public final void LJJLJLI(CharSequence charSequence) {
        CharSequence string;
        if (charSequence == null || charSequence.length() == 0) {
            string = getContext().getString(R.string.dix);
            o.LJIIIIZZ(string, "{\n            context.ge…ea_placeholder)\n        }");
        } else {
            string = charSequence;
        }
        if (C79488VHo.LIZIZ() && o.LJ(getTvFakeEditText().getText(), string)) {
            return;
        }
        if (charSequence == null || charSequence.length() == 0) {
            C023107f.LIZIZ(getTvFakeEditText(), 10, 15, 1, 1);
            getTvFakeEditText().setTextColorRes(R.attr.dm);
        } else {
            C023107f.LIZJ(getTvFakeEditText(), 0);
            getTvFakeEditText().setTuxFont(41);
            getTvFakeEditText().setTextColorRes(R.attr.dj);
        }
        getTvFakeEditText().setText(string);
    }

    public final void setEditStatus(boolean z) {
        if (z) {
            LJJLJLI(getContext().getString(R.string.dkl));
        } else {
            LJJLJLI(null);
            getDelegateEditText().setText("");
        }
        setEditable(!z);
    }

    public final void setEditable(boolean z) {
        setClickable(true);
        setEnabled(z);
    }

    public final void setOnClickEmoji(InterfaceC88472Yns<? super String, C76800UCe> onClickEmoji) {
        o.LJIIIZ(onClickEmoji, "onClickEmoji");
        this.LJLJLJ = onClickEmoji;
    }

    public final void setOnEdit(InterfaceC65784Pro<C76800UCe> onEdit) {
        o.LJIIIZ(onEdit, "onEdit");
        this.LJLJL = onEdit;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76T(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        C79488VHo.LIZIZ();
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLIL = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1661));
        this.LJLILLLLZI = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1664));
        this.LJLJI = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1663));
        this.LJLJJI = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1662));
        this.LJLJJL = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1665));
        this.LJLJJLL = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1660));
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.re, this, true);
        W5F LJII = W5U.LJII(C78939UyV.LJ(((RBX) HG3.LJIILL()).getCurUser().getAvatarThumb()));
        LJII.LJJIIJ = getIvAvatar();
        C16880lQ.LLJJJ(LJII);
        View vBackground = getVBackground();
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.db);
        c110614Vt.LIZJ = C61328O5c.LIZJ(22);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        vBackground.setBackground(c110614Vt.LIZ(context2));
        LJJLJLI(null);
        C16880lQ.LJIIJ(new ACListenerS23S0100000_3(this, BuildConfig.VERSION_CODE), getVTouchArea());
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "context");
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        boolean z = C32151Nz.LJJIJIIJI(context3, (float) C63081OpJ.LJJJJL(context4)) <= 360;
        CommentService.LIZ.getClass();
        List<String> LJIIIZ = CommentServiceImpl.LJJL().LJIIIZ(z);
        if (getLlEmojiContainer().getChildCount() > 0) {
            getLlEmojiContainer().removeAllViews();
        }
        int size = LJIIIZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            Context context5 = getContext();
            o.LJIIIIZZ(context5, "context");
            TuxTextView tuxTextView = new TuxTextView(context5, null, 6, 0);
            tuxTextView.setTuxFont(21);
            tuxTextView.setGravity(17);
            tuxTextView.setText((CharSequence) ListProtector.get(LJIIIZ, i2));
            C88463da.LIZJ(C88463da.LIZ, tuxTextView, EnumC1796673i.BUTTON, 0.0f, 12);
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS21S0201000_3(i2, this, LJIIIZ, 3));
            getLlEmojiContainer().addView(tuxTextView, new LinearLayout.LayoutParams(C7MY.LIZIZ(40), C7MY.LIZIZ(40)));
        }
    }
}
