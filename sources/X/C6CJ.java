package X;

import Y.IDObjectS175S0100000_2;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6CJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6CJ extends AbstractC156316Bn<User> {
    public boolean LJLLLL;
    public C6CL LJLLLLLL;
    public final C157316Fj LJLZ;
    public final C157286Fg LJZ;

    @Override // X.AbstractC156316Bn
    public final AbstractC156406Bw<User> LIZIZ() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C6CI c6ci = new C6CI(context);
        C6C5 mEditTextView = c6ci.getMEditTextView();
        Typeface customTypeface = getCustomTypeface();
        if (customTypeface != null) {
            mEditTextView.setTypeface(customTypeface);
        }
        mEditTextView.setFilters(new InputFilter[]{this.LJLZ, this.LJZ});
        mEditTextView.addTextChangedListener(new IDObjectS175S0100000_2(this, 5));
        return c6ci;
    }

    @Override // X.AbstractC156316Bn
    public final Animator LIZJ() {
        C6CL c6cl = this.LJLLLLLL;
        if (c6cl != null) {
            return c6cl.LIZLLL();
        }
        return null;
    }

    @Override // X.AbstractC156316Bn
    public final void LJ() {
        User user;
        C6C5 mEditTextView;
        AbstractC156406Bw<User> mInputView = getMInputView();
        Editable editable = null;
        if (mInputView != null) {
            user = mInputView.getCurModel();
        } else {
            user = null;
        }
        C6CL c6cl = this.LJLLLLLL;
        if (c6cl != null) {
            c6cl.LIZJ(user);
        }
        AbstractC156406Bw<User> mInputView2 = getMInputView();
        if (mInputView2 != null && (mEditTextView = mInputView2.getMEditTextView()) != null) {
            editable = mEditTextView.getText();
        }
        LJII(String.valueOf(editable));
    }

    @Override // X.AbstractC156316Bn
    public final void LJI(ViewGroup viewGroup) {
        HQ7 accountService = C60903NvH.LJIIJJI().getAccountService();
        C6CL LIZLLL = C8WN.LIZIZ.LIZLLL();
        this.LJLLLLLL = LIZLLL;
        if (LIZLLL != null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            LIZLLL.LJFF(viewGroup, context, accountService.isLogin(), new C6CK(this));
        }
    }

    @Override // X.AbstractC156316Bn
    public final void LJII(String str) {
        C6CL c6cl = this.LJLLLLLL;
        if (c6cl != null) {
            c6cl.LIZ(str);
        }
    }

    public final void setRtlState(boolean z) {
        this.LJLLLL = z;
    }

    @Override // X.AbstractC156316Bn
    public void setSearchListMarginBottom(int i) {
        C6CL c6cl = this.LJLLLLLL;
        if (c6cl != null) {
            c6cl.LIZIZ(i);
        }
    }

    @Override // X.AbstractC156316Bn
    public void setSearchListViewVisibility(int i) {
        C6CL c6cl = this.LJLLLLLL;
        if (c6cl != null) {
            c6cl.LJ(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.6Fg] */
    public C6CJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLLLL = C173636rf.LIZIZ(getContext());
        this.LJLZ = C157316Fj.LJLIL;
        this.LJZ = new InputFilter() { // from class: X.6Fg
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                o.LJI(spanned);
                int length = 50 - (spanned.length() - (i4 - i3));
                int i5 = i2 - i;
                if (length < i5) {
                    C5S1 c5s1 = new C5S1(C6CJ.this.getContext());
                    c5s1.LIZJ(R.string.e78);
                    c5s1.LJ();
                }
                if (length <= 0) {
                    return "";
                }
                if (length >= i5) {
                    return null;
                }
                int i6 = length + i;
                o.LJI(charSequence);
                int i7 = i6 - 1;
                if (Character.isHighSurrogate(charSequence.charAt(i7))) {
                    if (i7 == i) {
                        return "";
                    }
                    i6 = i7;
                }
                return charSequence.subSequence(i, i6);
            }
        };
    }
}
