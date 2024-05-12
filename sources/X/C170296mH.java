package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.6mH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C170296mH extends FrameLayout {
    public W5G LJLIL;
    public C170466mY LJLILLLLZI;
    public View LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    public final int getSelectColor() {
        return this.LJLJJI;
    }

    public final int getUnSelectColor() {
        return this.LJLJJL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C170296mH(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        this.LJLJJI = -1;
        this.LJLJJL = -1;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.bbd, this, true);
        View findViewById = LLLLIILL.findViewById(R.id.kyo);
        o.LJIIIIZZ(findViewById, "rootView.findViewById(R.id.tab_item_img)");
        this.LJLIL = (W5G) findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.kyq);
        o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.tab_item_text)");
        this.LJLILLLLZI = (C170466mY) findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.kyn);
        o.LJIIIIZZ(findViewById3, "rootView.findViewById(R.id.tab_item_dot)");
        this.LJLJI = findViewById3;
        int LJIIIIZZ = AnonymousClass636.LJIIIIZZ(R.attr.e2, context);
        View view = this.LJLJI;
        if (view != null) {
            view.setBackground(C78127UlP.LIZ(LJIIIIZZ, LJIIIIZZ, 0));
            C170466mY c170466mY = this.LJLILLLLZI;
            if (c170466mY != null) {
                c170466mY.setTextSize(15.0f);
                if (C82852WfQ.LIZ().LIZIZ) {
                    C170466mY c170466mY2 = this.LJLILLLLZI;
                    if (c170466mY2 != null) {
                        c170466mY2.LJJIJLIJ();
                    } else {
                        o.LJIJI("textView");
                        throw null;
                    }
                } else {
                    C170466mY c170466mY3 = this.LJLILLLLZI;
                    if (c170466mY3 != null) {
                        c170466mY3.setTypeface(Typeface.defaultFromStyle(0));
                    } else {
                        o.LJIJI("textView");
                        throw null;
                    }
                }
                C170466mY c170466mY4 = this.LJLILLLLZI;
                if (c170466mY4 != null) {
                    c170466mY4.setSingleLine();
                    setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
                    int i = C78885Uxd.LIZIZ;
                    this.LJLJJI = i;
                    this.LJLJJL = C78885Uxd.LIZJ(i);
                    return;
                }
                o.LJIJI("textView");
                throw null;
            }
            o.LJIJI("textView");
            throw null;
        }
        o.LJIJI("dotView");
        throw null;
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (z) {
            i = this.LJLJJI;
        } else {
            i = this.LJLJJL;
        }
        C170466mY c170466mY = this.LJLILLLLZI;
        if (c170466mY != null) {
            c170466mY.setTextColor(i);
            W5G w5g = this.LJLIL;
            if (w5g != null) {
                w5g.setImageAlpha(Color.alpha(i));
                if (C82852WfQ.LIZ().LIZJ) {
                    if (z) {
                        C170466mY c170466mY2 = this.LJLILLLLZI;
                        if (c170466mY2 != null) {
                            c170466mY2.LJJIJLIJ();
                            C170466mY c170466mY3 = this.LJLILLLLZI;
                            if (c170466mY3 != null) {
                                c170466mY3.setTypeface(Typeface.defaultFromStyle(1));
                                return;
                            } else {
                                o.LJIJI("textView");
                                throw null;
                            }
                        }
                        o.LJIJI("textView");
                        throw null;
                    }
                    C170466mY c170466mY4 = this.LJLILLLLZI;
                    if (c170466mY4 != null) {
                        c170466mY4.setTypeface(Typeface.defaultFromStyle(0));
                        return;
                    } else {
                        o.LJIJI("textView");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("iconImgView");
            throw null;
        }
        o.LJIJI("textView");
        throw null;
    }

    public final void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            C170466mY c170466mY = this.LJLILLLLZI;
            if (c170466mY != null) {
                c170466mY.setVisibility(0);
                W5G w5g = this.LJLIL;
                if (w5g != null) {
                    w5g.setVisibility(8);
                    C170466mY c170466mY2 = this.LJLILLLLZI;
                    if (c170466mY2 != null) {
                        c170466mY2.setText(str);
                        return;
                    } else {
                        o.LJIJI("textView");
                        throw null;
                    }
                }
                o.LJIJI("iconImgView");
                throw null;
            }
            o.LJIJI("textView");
            throw null;
        }
    }

    public final void setTextPaddingLR(float f) {
        int LIZJ = (int) KL2.LIZJ(getContext(), f);
        C170466mY c170466mY = this.LJLILLLLZI;
        if (c170466mY != null) {
            c170466mY.setPadding(LIZJ, c170466mY.getPaddingTop(), LIZJ, c170466mY.getPaddingBottom());
        } else {
            o.LJIJI("textView");
            throw null;
        }
    }

    public final void setText(int i) {
        String string = getContext().getResources().getString(i);
        o.LJIIIIZZ(string, "context.resources.getString(stringRes)");
        setText(string);
    }

    public final void LIZ(int i, int i2) {
        if (!C82852WfQ.LIZ().LIZLLL) {
            setLayoutParams(new FrameLayout.LayoutParams((int) (KL2.LJIIJJI(getContext()) / 4.5f), -2));
        } else if (i == 0) {
            setPadding((int) KL2.LIZJ(getContext(), 6.0f), 0, 0, 0);
        } else {
            if (i != i2 - 1) {
                return;
            }
            setPadding(0, 0, (int) KL2.LIZJ(getContext(), 6.0f), 0);
        }
    }
}
