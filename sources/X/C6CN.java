package X;

import Y.IDObjectS175S0100000_2;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6CN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6CN extends AbstractC156316Bn<C42802Gr0> {
    public boolean LJLLLL;
    public C42797Gqv LJLLLLLL;
    public final C157306Fi LJLZ;
    public final C157276Ff LJZ;

    @Override // X.AbstractC156316Bn
    public final AbstractC156406Bw<C42802Gr0> LIZIZ() {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C6CH c6ch = new C6CH(context);
        C6C5 mEditTextView = c6ch.getMEditTextView();
        mEditTextView.setTypeface(getCustomTypeface());
        mEditTextView.setFilters(new InputFilter[]{this.LJLZ, this.LJZ});
        mEditTextView.addTextChangedListener(new IDObjectS175S0100000_2(this, 4));
        return c6ch;
    }

    @Override // X.AbstractC156316Bn
    public final Animator LIZJ() {
        C42797Gqv c42797Gqv = this.LJLLLLLL;
        if (c42797Gqv != null) {
            return ObjectAnimator.ofFloat(c42797Gqv, "alpha", 1.0f, 0.0f);
        }
        o.LJIJI("mHashTagSearchListView");
        throw null;
    }

    @Override // X.AbstractC156316Bn
    public final void LJI(ViewGroup viewGroup) {
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C42797Gqv c42797Gqv = new C42797Gqv(context);
        this.LJLLLLLL = c42797Gqv;
        c42797Gqv.setOnHashTagItemClickListener(new InterfaceC156456Cb<C42802Gr0>() { // from class: X.6CM
            @Override // X.InterfaceC156456Cb
            public final void LIZ(C42802Gr0 c42802Gr0) {
                AbstractC156406Bw<C42802Gr0> mInputView = C6CN.this.getMInputView();
                if (mInputView != null) {
                    mInputView.setCurModel(c42802Gr0);
                }
                AbstractC156406Bw<C42802Gr0> mInputView2 = C6CN.this.getMInputView();
                if (mInputView2 != null) {
                    mInputView2.LJIIJ();
                }
                C6CN.this.LJFF();
            }
        });
        if (viewGroup != null) {
            C42797Gqv c42797Gqv2 = this.LJLLLLLL;
            if (c42797Gqv2 != null) {
                viewGroup.addView(c42797Gqv2, new FrameLayout.LayoutParams(-1, -2, 80));
            } else {
                o.LJIJI("mHashTagSearchListView");
                throw null;
            }
        }
    }

    @Override // X.AbstractC156316Bn
    public final void LJII(String str) {
        C42797Gqv c42797Gqv = this.LJLLLLLL;
        if (c42797Gqv != null) {
            if (!c42797Gqv.LJLJJL || c42797Gqv.LJLJJI == null) {
                return;
            }
            c42797Gqv.LLIIZ();
            if (str == null || str.length() == 0) {
                C6CO c6co = c42797Gqv.LJLL;
                if (c6co != null) {
                    GHY ghy = c42797Gqv.LJLJJI;
                    if (ghy != null) {
                        c6co.LIZ.gv0(ghy);
                        return;
                    } else {
                        o.LJIJI("mSearchParams");
                        throw null;
                    }
                }
                o.LJIJI("recommendHashTagViewModel");
                throw null;
            }
            C161566Vs c161566Vs = c42797Gqv.LJLLI;
            if (c161566Vs != null) {
                ((C8BR) c161566Vs.LIZ).LJIILL(str, "challenge_create");
                return;
            } else {
                o.LJIJI("mChallengeSearchPresenter");
                throw null;
            }
        }
        o.LJIJI("mHashTagSearchListView");
        throw null;
    }

    public final void setModel(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        C42797Gqv c42797Gqv = this.LJLLLLLL;
        if (c42797Gqv != null) {
            c42797Gqv.LJLJJI = GHX.LIZ(model);
        } else {
            o.LJIJI("mHashTagSearchListView");
            throw null;
        }
    }

    public final void setRtlState(boolean z) {
        this.LJLLLL = z;
    }

    @Override // X.AbstractC156316Bn
    public void setSearchListMarginBottom(int i) {
        C42797Gqv c42797Gqv = this.LJLLLLLL;
        if (c42797Gqv != null) {
            ViewGroup.LayoutParams layoutParams = c42797Gqv.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            ((FrameLayout.LayoutParams) layoutParams).bottomMargin = i;
            C42797Gqv c42797Gqv2 = this.LJLLLLLL;
            if (c42797Gqv2 != null) {
                c42797Gqv2.requestLayout();
                return;
            } else {
                o.LJIJI("mHashTagSearchListView");
                throw null;
            }
        }
        o.LJIJI("mHashTagSearchListView");
        throw null;
    }

    @Override // X.AbstractC156316Bn
    public void setSearchListViewVisibility(int i) {
        C42797Gqv c42797Gqv = this.LJLLLLLL;
        if (c42797Gqv != null) {
            c42797Gqv.setVisibility(i);
            if (i == 0) {
                C42797Gqv c42797Gqv2 = this.LJLLLLLL;
                if (c42797Gqv2 != null) {
                    c42797Gqv2.setAlpha(1.0f);
                    return;
                } else {
                    o.LJIJI("mHashTagSearchListView");
                    throw null;
                }
            }
            return;
        }
        o.LJIJI("mHashTagSearchListView");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.6Ff] */
    public C6CN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLLLL = C173636rf.LIZIZ(getContext());
        this.LJLZ = C157306Fi.LJLIL;
        this.LJZ = new InputFilter() { // from class: X.6Ff
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                o.LJI(spanned);
                int length = 50 - (spanned.length() - (i4 - i3));
                int i5 = i2 - i;
                if (length < i5) {
                    C5S1 c5s1 = new C5S1(C6CN.this.getContext());
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
