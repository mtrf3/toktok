package X;

import Y.AUListenerS78S0300000_2;
import Y.IDAListenerS71S0100000_2;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.tools.utils.KeyboardUtils;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6T3, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6T3 extends FrameLayout implements InterfaceC83564Wqu {
    public final long LJLIL;
    public final C83547Wqd LJLILLLLZI;
    public C6T6 LJLJI;

    public abstract void LIZIZ();

    public abstract void LIZJ(int i);

    public abstract void LIZLLL();

    public void LJ() {
    }

    public abstract void LJFF(int i);

    public abstract View getAlphaView();

    public abstract float getStickerContainerTranslationX();

    public abstract float getStickerContainerTranslationY();

    public abstract float getStickerInitTranslationY();

    @Override // X.InterfaceC83564Wqu
    public final void keyBoardModify(int i) {
    }

    public long getAnimDuration() {
        return this.LJLIL;
    }

    public final C83547Wqd getSoftKeyBoardListener() {
        return this.LJLILLLLZI;
    }

    public final C6T6 getState() {
        return this.LJLJI;
    }

    public void LIZ(EditText editText) {
        o.LJIIIZ(editText, "editText");
        KeyboardUtils.LIZ(getContext(), editText);
    }

    public void LJI(EditText editText) {
        boolean z;
        o.LJIIIZ(editText, "editText");
        this.LJLILLLLZI.LIZIZ(this);
        editText.getVisibility();
        editText.requestFocus();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" openKeyboard request focus visible ");
        if (editText.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(" focused ");
        LIZ.append(editText.isFocused());
        X1D.LIZIZ(LIZ);
        InputMethodManager inputMethodManager = (InputMethodManager) C16880lQ.LLILL(getContext(), "input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 2);
        }
    }

    public void keyBoardHide(int i) {
        this.LJLILLLLZI.LIZ();
        LIZJ(0);
        LJFF(i);
    }

    public void keyBoardShow(int i) {
        LIZJ(i);
    }

    public final void setState(C6T6 c6t6) {
        o.LJIIIZ(c6t6, "<set-?>");
        this.LJLJI = c6t6;
    }

    public final void LJII(View view, BaseStickerModel baseStickerModel) {
        o.LJIIIZ(baseStickerModel, "baseStickerModel");
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", getStickerContainerTranslationX(), baseStickerModel.getTranslateX());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new AUListenerS78S0300000_2(this, view, baseStickerModel, 0));
        animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, "scaleX", 1.0f, baseStickerModel.getScale()), ObjectAnimator.ofFloat(view, "scaleY", 1.0f, baseStickerModel.getScale()), ObjectAnimator.ofFloat(view, "rotation", 0.0f, baseStickerModel.getRotation()), ObjectAnimator.ofFloat(getAlphaView(), "alpha", 1.0f, 0.0f));
        animatorSet.setDuration(getAnimDuration());
        animatorSet.addListener(new IDAListenerS71S0100000_2(this, 0));
        animatorSet.start();
    }

    public final void LJIIIIZZ(View view, BaseStickerModel baseStickerModel) {
        o.LJIIIZ(baseStickerModel, "baseStickerModel");
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationX", baseStickerModel.getTranslateX(), getStickerContainerTranslationX());
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new AUListenerS78S0300000_2(this, view, baseStickerModel, 1));
        animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, "scaleX", baseStickerModel.getScale(), 1.0f), ObjectAnimator.ofFloat(view, "scaleY", baseStickerModel.getScale(), 1.0f), ObjectAnimator.ofFloat(view, "rotation", baseStickerModel.getRotation(), 0.0f), ObjectAnimator.ofFloat(getAlphaView(), "alpha", 0.0f, 1.0f));
        animatorSet.setDuration(getAnimDuration());
        animatorSet.addListener(new IDAListenerS71S0100000_2(this, 1));
        animatorSet.start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6T3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = 300L;
        C83547Wqd c83547Wqd = new C83547Wqd(C105574Cj.LIZ(context), null);
        c83547Wqd.LIZIZ(this);
        this.LJLILLLLZI = c83547Wqd;
        this.LJLJI = C6T6.RESUME;
    }
}
