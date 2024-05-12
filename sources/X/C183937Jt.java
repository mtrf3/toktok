package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Arrays;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7Jt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183937Jt extends ConstraintLayout {
    public static final /* synthetic */ int LJLZ = 0;
    public final C5H3 LJLIL;
    public final C5H3 LJLILLLLZI;
    public final C5H3 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C5H3 LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C5H3 LJLL;
    public final C5H3 LJLLI;
    public final C5H3 LJLLILLLL;
    public final C5H3 LJLLJ;
    public final C5H3 LJLLL;
    public final int LJLLLL;
    public int LJLLLLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C183937Jt(Context context) {
        this(context, null, 6, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C183937Jt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    public static /* synthetic */ void getBubbleStyle$annotations() {
    }

    private final C119624mk getAvatarEnd() {
        Object value = this.LJLJLLL.getValue();
        o.LJIIIIZZ(value, "<get-avatarEnd>(...)");
        return (C119624mk) value;
    }

    private final C119624mk getAvatarMiddle() {
        Object value = this.LJLJLJ.getValue();
        o.LJIIIIZZ(value, "<get-avatarMiddle>(...)");
        return (C119624mk) value;
    }

    private final C119624mk getAvatarStart() {
        Object value = this.LJLJL.getValue();
        o.LJIIIIZZ(value, "<get-avatarStart>(...)");
        return (C119624mk) value;
    }

    private final Drawable getBubbleBG() {
        return (Drawable) this.LJLLI.getValue();
    }

    private final Drawable getButtonBG() {
        return (Drawable) this.LJLLL.getValue();
    }

    private final TuxTextView getNumTV() {
        Object value = this.LJLL.getValue();
        o.LJIIIIZZ(value, "<get-numTV>(...)");
        return (TuxTextView) value;
    }

    public final FrameLayout getAvatarLL() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-avatarLL>(...)");
        return (FrameLayout) value;
    }

    public final Drawable getNewBubbleBG() {
        return (Drawable) this.LJLLILLLL.getValue();
    }

    public final Drawable getNumTvBG() {
        return (Drawable) this.LJLLJ.getValue();
    }

    public final FrameLayout getNumTvFrame() {
        Object value = this.LJLJJLL.getValue();
        o.LJIIIIZZ(value, "<get-numTvFrame>(...)");
        return (FrameLayout) value;
    }

    public final View getTouchArea() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-touchArea>(...)");
        return (View) value;
    }

    public final TuxIconView getUpvoteCornerMark() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-upvoteCornerMark>(...)");
        return (TuxIconView) value;
    }

    public final TuxTextView getUpvoteTV() {
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-upvoteTV>(...)");
        return (TuxTextView) value;
    }

    public final View getUpvoteTVContainer() {
        return (View) this.LJLILLLLZI.getValue();
    }

    public final int getBubbleStyle() {
        return this.LJLLLLLL;
    }

    public final void setAvatar(InterfaceC88473Ynt<? super C119624mk, ? super C119624mk, ? super C119624mk, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        FrameLayout avatarLL = getAvatarLL();
        if (avatarLL.getLayoutParams().width != -2) {
            ViewGroup.LayoutParams layoutParams = avatarLL.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
                avatarLL.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        block.invoke(getAvatarStart(), getAvatarMiddle(), getAvatarEnd());
    }

    public final void setAvatarEndText(long j) {
        if (j <= 3) {
            getNumTvFrame().setVisibility(8);
            return;
        }
        getAvatarEnd().setVisibility(4);
        TuxTextView numTV = getNumTV();
        Object[] objArr = new Object[1];
        long j2 = j - 2;
        if (j2 > 99) {
            j2 = 99;
        }
        objArr[0] = Long.valueOf(j2);
        String LLLZ = C16880lQ.LLLZ("+%d", Arrays.copyOf(objArr, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        numTV.setText(LLLZ);
        getNumTvFrame().setAlpha(1.0f);
        getNumTvFrame().setVisibility(0);
    }

    public final void setButton(int i) {
        boolean z;
        if (i == this.LJLLLLLL) {
            return;
        }
        if (i != 1) {
            if (i == 2) {
                getUpvoteTV().setText(getContext().getString(R.string.q3z));
                View upvoteTVContainer = getUpvoteTVContainer();
                if (upvoteTVContainer != null) {
                    upvoteTVContainer.setBackground(getNewBubbleBG());
                }
                LJJZ(R.raw.icon_plus_small, O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
                getUpvoteTV().setTuxFont(42);
                View upvoteTVContainer2 = getUpvoteTVContainer();
                if (upvoteTVContainer2 != null) {
                    C26338AVi.LJIIIZ(upvoteTVContainer2, AnonymousClass391.LIZJ(12), AnonymousClass391.LIZJ(7), AnonymousClass391.LIZJ(12), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(7))), 16);
                }
                View upvoteTVContainer3 = getUpvoteTVContainer();
                if (upvoteTVContainer3 != null) {
                    C26338AVi.LJI(upvoteTVContainer3, AnonymousClass391.LIZJ(4), null, null, null, false, 30);
                }
                C26338AVi.LJI(getUpvoteTV(), null, AnonymousClass391.LIZJ(0), null, AnonymousClass391.LIZJ(0), false, 21);
            }
        } else {
            getUpvoteTV().setText(getContext().getString(C7HV.LIZIZ.LJIIJ(R.string.ptm, R.string.q47)));
            View upvoteTVContainer4 = getUpvoteTVContainer();
            if (upvoteTVContainer4 != null) {
                upvoteTVContainer4.setBackground(getButtonBG());
            }
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = R.raw.icon_color_repost;
            c2068389v.LIZJ = C7MY.LIZIZ(22);
            c2068389v.LIZIZ = C7MY.LIZIZ(22);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            SY9 LIZ = c2068389v.LIZ(context);
            LIZ.setBounds(0, 0, LIZ.LIZIZ(), LIZ.LIZ());
            int LJJIIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(4));
            Context context2 = getContext();
            if (context2 != null && C26338AVi.LIZJ(context2)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                getUpvoteTV().setCompoundDrawables(null, null, LIZ, null);
            } else {
                getUpvoteTV().setCompoundDrawables(LIZ, null, null, null);
            }
            getUpvoteTV().setCompoundDrawablePadding(LJJIIZ);
            TuxTextView upvoteTV = getUpvoteTV();
            C72062SPy c72062SPy = new C72062SPy();
            c72062SPy.LIZLLL(getUpvoteTV().getText().toString());
            c72062SPy.LIZ = true;
            c72062SPy.LJ(4);
            c72062SPy.LIZIZ(62);
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            upvoteTV.setText(c72062SPy.LIZ(context3));
            getUpvoteTV().setTuxFont(42);
            View upvoteTVContainer5 = getUpvoteTVContainer();
            if (upvoteTVContainer5 != null) {
                int LIZIZ = C7MY.LIZIZ(4);
                int LIZIZ2 = C7MY.LIZIZ(12);
                C26338AVi.LJIIIZ(upvoteTVContainer5, Integer.valueOf(LIZIZ), Integer.valueOf(C7MY.LIZIZ(0)), Integer.valueOf(LIZIZ2), Integer.valueOf(C7MY.LIZIZ(0)), 16);
            }
            View upvoteTVContainer6 = getUpvoteTVContainer();
            if (upvoteTVContainer6 != null) {
                C26338AVi.LJI(upvoteTVContainer6, AnonymousClass391.LIZJ(0), null, null, null, false, 30);
            }
            C26338AVi.LJI(getUpvoteTV(), null, AnonymousClass391.LIZJ(4), null, AnonymousClass391.LIZJ(4), false, 21);
        }
        getUpvoteTV().setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        this.LJLLLLLL = i;
    }

    public final String LJJLJLI(String str, String str2) {
        StaticLayout staticLayout;
        String str3 = str2;
        if (str3 == null) {
            if (str != null) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    if (ORY.LJJIJIIJIL(Character.valueOf(str.charAt(i)), new Character[]{'\n', '\r'})) {
                        if (i <= 0) {
                            return str;
                        }
                        String substring = str.substring(0, i);
                        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        return substring;
                    }
                }
                return str;
            }
            return null;
        }
        if (str == null) {
            return str;
        }
        String LIZIZ = Q8U.LIZIZ(new Object[]{str3}, 1, str, "format(this, *args)");
        float measureText = getUpvoteTV().getPaint().measureText(LIZIZ);
        float LIZ = C47135Ieh.LIZ(8, C47135Ieh.LIZ(32, C47135Ieh.LIZ(32, getMaxWidth())));
        if (measureText < LIZ) {
            return LIZIZ;
        }
        TextPaint paint = getUpvoteTV().getPaint();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("...");
        LIZ2.append(str);
        int ceil = (int) (LIZ - ((float) Math.ceil(paint.measureText(X1D.LIZIZ(LIZ2)) + C7MY.LIZIZ(10))));
        if (ceil >= 0 && ceil < getUpvoteTV().getPaint().measureText(str3)) {
            if (Build.VERSION.SDK_INT >= 23) {
                staticLayout = StaticLayout.Builder.obtain(str3, 0, str3.length(), getUpvoteTV().getPaint(), ceil).build();
            } else {
                staticLayout = new StaticLayout(str3, getUpvoteTV().getPaint(), ceil, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            o.LJIIIIZZ(staticLayout, "if (Build.VERSION.SDK_IN…e\n            )\n        }");
            str3 = str3.substring(0, staticLayout.getLineEnd(0));
            o.LJIIIIZZ(str3, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(C90193gN.LIZJ(str3));
        LIZ3.append("...");
        return Q8U.LIZIZ(new Object[]{X1D.LIZIZ(LIZ3)}, 1, str, "format(this, *args)");
    }

    public final void LJJZ(int i, int i2) {
        SY9 LIZ;
        if (i == 0) {
            LIZ = null;
        } else {
            C2068389v c2068389v = new C2068389v();
            c2068389v.LIZ = i;
            c2068389v.LJ = Integer.valueOf(R.attr.dj);
            c2068389v.LIZJ = C7MY.LIZIZ(16);
            c2068389v.LIZIZ = C7MY.LIZIZ(16);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            LIZ = c2068389v.LIZ(context);
            LIZ.setBounds(0, 0, LIZ.LIZIZ(), LIZ.LIZ());
        }
        Context context2 = getContext();
        if (context2 != null && C26338AVi.LIZJ(context2)) {
            getUpvoteTV().setCompoundDrawables(null, null, LIZ, null);
        } else {
            getUpvoteTV().setCompoundDrawables(LIZ, null, null, null);
        }
        getUpvoteTV().setCompoundDrawablePadding(i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C183937Jt(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        EnumC221088m0 enumC221088m0 = EnumC221088m0.NONE;
        this.LJLIL = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1214));
        this.LJLILLLLZI = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1215));
        this.LJLJI = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1203));
        this.LJLJJI = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1213));
        this.LJLJJL = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1212));
        this.LJLJJLL = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1211));
        this.LJLJL = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1205));
        this.LJLJLJ = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1204));
        this.LJLJLLL = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1202));
        this.LJLL = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1209));
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.drg, this, true);
        setMaxWidth(C47135Ieh.LIZ(95, C63081OpJ.LJJJJL(context)) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
        this.LJLLI = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(this, 1206));
        this.LJLLILLLL = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(context, 1208));
        this.LJLLJ = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(context, 1210));
        this.LJLLL = C221108m2.LIZ(enumC221088m0, new AqS153S0100000_3(context, 1207));
        this.LJLLLL = C04330Ez.LIZIZ(context, R.color.ku);
    }

    public final void LJJLL(String str, String str2, boolean z) {
        if (z) {
            if (this.LJLLLLLL != 4) {
                View upvoteTVContainer = getUpvoteTVContainer();
                if (upvoteTVContainer != null) {
                    upvoteTVContainer.setBackground(getBubbleBG());
                }
                getUpvoteTV().setTuxFont(41);
                View upvoteTVContainer2 = getUpvoteTVContainer();
                if (upvoteTVContainer2 != null) {
                    C26338AVi.LJIIIZ(upvoteTVContainer2, AnonymousClass391.LIZJ(12), AnonymousClass391.LIZJ(7), AnonymousClass391.LIZJ(12), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(7))), 16);
                }
                C26338AVi.LJI(getUpvoteTV(), null, C1FJ.LIZIZ(0), null, C1FJ.LIZIZ(0), false, 21);
                View upvoteTVContainer3 = getUpvoteTVContainer();
                if (upvoteTVContainer3 != null) {
                    C26338AVi.LJI(upvoteTVContainer3, AnonymousClass391.LIZJ(4), null, null, null, false, 30);
                }
                getUpvoteTV().setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
            getUpvoteTV().setText(LJJLJLI(str, str2));
            this.LJLLLLLL = 4;
        } else {
            if (this.LJLLLLLL != 3) {
                View upvoteTVContainer4 = getUpvoteTVContainer();
                if (upvoteTVContainer4 != null) {
                    upvoteTVContainer4.setBackground(null);
                }
                View upvoteTVContainer5 = getUpvoteTVContainer();
                if (upvoteTVContainer5 != null) {
                    C26338AVi.LJIIIZ(upvoteTVContainer5, 0, 0, 0, 0, 16);
                }
                View upvoteTVContainer6 = getUpvoteTVContainer();
                if (upvoteTVContainer6 != null) {
                    C26338AVi.LJI(upvoteTVContainer6, AnonymousClass391.LIZJ(8), null, C1FJ.LIZIZ(0), null, false, 26);
                }
                C26338AVi.LJI(getUpvoteTV(), null, C1FJ.LIZIZ(0), null, C1FJ.LIZIZ(0), false, 21);
                getUpvoteTV().setShadowLayer(1.0f, 0.0f, 1.0f, this.LJLLLL);
            }
            TuxTextView upvoteTV = getUpvoteTV();
            C72062SPy c72062SPy = new C72062SPy();
            String LJJLJLI = LJJLJLI(str, str2);
            if (LJJLJLI == null) {
                LJJLJLI = "";
            }
            c72062SPy.LIZIZ = LJJLJLI;
            c72062SPy.LIZ = true;
            c72062SPy.LJ(4);
            c72062SPy.LIZIZ(42);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            upvoteTV.setText(c72062SPy.LIZ(context));
            this.LJLLLLLL = 3;
        }
        LJJZ(0, 0);
    }

    public /* synthetic */ C183937Jt(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
