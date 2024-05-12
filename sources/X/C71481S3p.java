package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.internal.o;

/* renamed from: X.S3p, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71481S3p implements InterfaceC71443S2d {
    public final InterfaceC71480S3o LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public C71482S3q LIZLLL;
    public boolean LJ;

    public C71481S3p(InterfaceC71480S3o style) {
        o.LJIIIZ(style, "style");
        this.LIZ = style;
        this.LJ = true;
    }

    @Override // X.InterfaceC71443S2d
    public final void LJIIJ(TuxTextView tuxTextView, String str) {
        if (this.LIZ.LJ() != EnumC53624L2u.NONE) {
            if (this.LIZ.LJ() != EnumC53624L2u.COLOR_BG_WITHOUT_BRACKETS) {
                str = C78920UyC.LIZ('(', str, ')');
            }
            tuxTextView.setText(str);
            return;
        }
        tuxTextView.setVisibility(8);
    }

    @Override // X.InterfaceC71443S2d
    public final boolean LJIIL(TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        if (this.LIZ.LJIIIZ() == EnumC53627L2x.V2 || this.LIZ.LJIIIZ() == EnumC53627L2x.V3 || this.LIZ.LJIIIZ() == EnumC53627L2x.V5) {
            if ((C71461S2v.LIZ(tuxTextView) || C71461S2v.LIZ(tuxTextView2)) && !this.LIZIZ) {
                this.LIZIZ = true;
                if (tuxTextView != null) {
                    tuxTextView.LJJJ(10.0f);
                }
                if (tuxTextView2 != null) {
                    tuxTextView2.LJJJ(10.0f);
                }
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC71443S2d
    public final boolean LJIILJJIL(TuxTextView tuxTextView, TuxTextView tuxTextView2) {
        if (!this.LIZIZ) {
            return false;
        }
        this.LIZIZ = false;
        if (tuxTextView != null) {
            tuxTextView.setTuxFont(this.LIZ.LJI());
        }
        Integer LJFF = this.LIZ.LJFF();
        if (LJFF != null) {
            int intValue = LJFF.intValue();
            if (tuxTextView2 != null) {
                tuxTextView2.setTuxFont(intValue);
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC71443S2d
    public final void LJIIIZ(Context context, TuxTextView tuxTextView, boolean z) {
        o.LJIIIZ(context, "context");
        if (this.LJ == z) {
            return;
        }
        this.LJ = z;
        if (this.LIZ.LJIL()) {
            if (z) {
                C71482S3q c71482S3q = this.LIZLLL;
                if (c71482S3q == null || tuxTextView == null) {
                    return;
                }
                c71482S3q.LIZ = this.LIZ.LJJ();
                tuxTextView.setText(c71482S3q.LIZIZ(context));
                return;
            }
            C71482S3q c71482S3q2 = this.LIZLLL;
            if (c71482S3q2 == null || tuxTextView == null) {
                return;
            }
            c71482S3q2.LIZ = this.LIZ.LJIIJ();
            tuxTextView.setText(c71482S3q2.LIZIZ(context));
            return;
        }
        if (z) {
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setTextColorRes(this.LIZ.LJJ());
        } else {
            if (tuxTextView == null) {
                return;
            }
            tuxTextView.setTextColorRes(this.LIZ.LJIIJ());
        }
    }

    @Override // X.InterfaceC71443S2d
    public final void LIZ(TuxTextView tuxTextView, String str, String price, S32 s32, Context context) {
        o.LJIIIZ(price, "price");
        this.LIZJ = false;
        if (this.LIZ.LJIL()) {
            C71482S3q c71482S3q = new C71482S3q();
            LJIILL(c71482S3q, str, price, s32, null, null);
            this.LIZLLL = c71482S3q;
            tuxTextView.setText(c71482S3q.LIZIZ(context));
            if (C90193gN.LIZ()) {
                tuxTextView.setEllipsize(TextUtils.TruncateAt.START);
                return;
            } else {
                tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                return;
            }
        }
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        tuxTextView.setTuxFont(this.LIZ.LJIIZILJ());
        tuxTextView.setText(price);
    }

    @Override // X.InterfaceC71443S2d
    public final boolean LIZJ(Context context, TuxTextView tuxTextView, String str, String price, S32 s32, int i) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(price, "price");
        if (i <= 0) {
            return false;
        }
        C71482S3q c71482S3q = new C71482S3q();
        LJIILL(c71482S3q, str, price, s32, Integer.valueOf(C79081V1x.LJII(14)), Integer.valueOf(C79081V1x.LJII(16)));
        CharSequence LIZIZ = c71482S3q.LIZIZ(context);
        StaticLayout LJJIIJ = C1A7.LJJIIJ(tuxTextView, LIZIZ, new T5S(), i, null);
        if (LJJIIJ.getLineCount() > 1 || LJJIIJ.getLineEnd(LJJIIJ.getLineCount() - 1) != ((SpannableStringBuilder) LIZIZ).length()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC71443S2d
    public final boolean LIZLLL(Context context, TuxTextView tuxTextView, String str, String price, S32 s32, int i) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(price, "price");
        if (tuxTextView.getMeasuredWidth() <= 0 || i <= 0) {
            return false;
        }
        C71482S3q c71482S3q = new C71482S3q();
        LJIILL(c71482S3q, str, price, s32, null, null);
        CharSequence LIZIZ = c71482S3q.LIZIZ(context);
        StaticLayout LJJIIJ = C1A7.LJJIIJ(tuxTextView, LIZIZ, new T5S(), i, null);
        if (LJJIIJ.getLineCount() > 1 || LJJIIJ.getLineEnd(LJJIIJ.getLineCount() - 1) != ((SpannableStringBuilder) LIZIZ).length()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC71443S2d
    public final void LJIIIIZZ(Context context, TuxTextView tuxTextView, String str, String price, S32 s32, boolean z) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(price, "price");
        if (this.LIZJ == z) {
            return;
        }
        this.LIZJ = z;
        if (this.LIZ.LJIL()) {
            if (z) {
                C71482S3q c71482S3q = new C71482S3q(this.LIZLLL, false);
                LJIILL(c71482S3q, str, price, s32, Integer.valueOf(C79081V1x.LJII(14)), Integer.valueOf(C79081V1x.LJII(16)));
                this.LIZLLL = c71482S3q;
                tuxTextView.setText(c71482S3q.LIZIZ(context));
                return;
            }
            C71482S3q c71482S3q2 = new C71482S3q(this.LIZLLL, false);
            LJIILL(c71482S3q2, str, price, s32, null, null);
            this.LIZLLL = c71482S3q2;
            tuxTextView.setText(c71482S3q2.LIZIZ(context));
            return;
        }
        if (z) {
            tuxTextView.LJJJ(16.0f);
        } else {
            tuxTextView.setTuxFont(this.LIZ.LJIIZILJ());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILL(C71482S3q c71482S3q, String str, String str2, S32 s32, Integer num, Integer num2) {
        C71483S3r LIZJ;
        C68322mC c68322mC = new C68322mC();
        T t = 0;
        if (C78857UxB.LJJJIL(str) && str != null) {
            C71483S3r LIZJ2 = C71482S3q.LIZJ(this.LIZ.LJIILLIIL(), this.LIZ.LJIIJJI(), this.LIZ.LJIJJLI(), str);
            if (LIZJ2 != null) {
                LIZJ2.LJFF = num;
                t = LIZJ2;
            }
            c68322mC.element = t;
        }
        if (this.LIZ.LJIILJJIL() && s32 != null) {
            if (s32.LIZIZ != null) {
                StringBuilder LIZ = X1D.LIZ();
                String str3 = s32.LIZ;
                if (str3 == null) {
                    str3 = "";
                }
                LIZ.append(str3);
                LIZ.append(s32.LIZIZ);
                C71483S3r LIZJ3 = C71482S3q.LIZJ(this.LIZ.LJIIZILJ(), this.LIZ.LJJ(), 0, X1D.LIZIZ(LIZ));
                if (LIZJ3 != null) {
                    LIZJ3.LJFF = num2;
                    c71482S3q.LIZ(LIZJ3);
                }
            }
            String str4 = s32.LIZJ;
            if (str4 != null && (LIZJ = C71482S3q.LIZJ(this.LIZ.LJIILL(), this.LIZ.LJJ(), 0, str4)) != null) {
                c71482S3q.LIZ(LIZJ);
            }
        } else {
            C71483S3r LIZJ4 = C71482S3q.LIZJ(this.LIZ.LJIIZILJ(), this.LIZ.LJJ(), 0, str2);
            if (LIZJ4 != null) {
                LIZJ4.LJFF = num2;
                c71482S3q.LIZ(LIZJ4);
            }
        }
        if (C90193gN.LIZ()) {
            C71483S3r c71483S3r = (C71483S3r) c68322mC.element;
            if (c71483S3r != null) {
                C71483S3r LIZJ5 = C71482S3q.LIZJ(this.LIZ.LJIILLIIL(), this.LIZ.LJIIJJI(), 0, " ");
                if (LIZJ5 != null) {
                    c71482S3q.LIZ(LIZJ5);
                }
                c71482S3q.LIZ(c71483S3r);
                return;
            }
            return;
        }
        T t2 = c68322mC.element;
        if (t2 == 0) {
            return;
        }
        C71483S3r LIZJ6 = C71482S3q.LIZJ(this.LIZ.LJIILLIIL(), this.LIZ.LJIIJJI(), 0, " ");
        if (LIZJ6 != null) {
            ListProtector.add(c71482S3q.LIZIZ, 0, LIZJ6);
        }
        ListProtector.add(c71482S3q.LIZIZ, 0, t2);
    }
}
