package X;

import Y.ACListenerS32S0100000_12;
import Y.ARunnableS11S0210000_12;
import Y.IDObjectS332S0100000_12;
import Y.IDObjectS5S0101000_12;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.message.template.component.ActionLinkComponent;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS143S0200000_12;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS61S0201000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SFn, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71791SFn extends LinearLayout {
    public InterfaceC71794SFq LJLIL;
    public final C119774mz LJLILLLLZI;
    public List<ActionLinkComponent> LJLJI;
    public final C62822Ol8 LJLJJI;

    private final int getMaxMoreLinkWidth() {
        return ((Number) this.LJLJJI.getValue()).intValue();
    }

    public final int getMaxMoreLinkItemWidth() {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        c2068389v.LIZ = R.raw.icon_chevron_down_small_fill;
        c2068389v.LJ = Integer.valueOf(R.attr.gx);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C8FR LIZIZ = c2068389v.LIZIZ(2, context);
        N3B n3b = N3B.MORE;
        String string = getContext().getString(R.string.s3g);
        o.LJIIIIZZ(string, "context.getString(R.stri…dow_bingAnswerLinks_btn1)");
        String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{100}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        C71792SFo LIZLLL = LIZLLL(n3b, LIZJ(LLLZ, LIZIZ), C71793SFp.LJLIL);
        if (LIZLLL != null) {
            return LIZLLL.LJLILLLLZI;
        }
        return C7MY.LIZIZ(70);
    }

    public final InterfaceC71794SFq getItemAction() {
        return this.LJLIL;
    }

    public final View LJI(int i) {
        C119774mz c119774mz = this.LJLILLLLZI;
        if (c119774mz != null) {
            Iterator it = new IDObjectS332S0100000_12(c119774mz, 10).iterator();
            int i2 = 0;
            while (true) {
                IDObjectS5S0101000_12 iDObjectS5S0101000_12 = (IDObjectS5S0101000_12) it;
                if (!iDObjectS5S0101000_12.hasNext()) {
                    break;
                }
                Object next = iDObjectS5S0101000_12.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    View view = (View) next;
                    if (i2 == i && o.LJ(view.getTag(), "NORMAL")) {
                        return view;
                    }
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
        return null;
    }

    public final void setItemAction(InterfaceC71794SFq interfaceC71794SFq) {
        this.LJLIL = interfaceC71794SFq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71791SFn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJJI = C221108m2.LIZIZ(new AqS162S0100000_12(this, 1140));
        setOrientation(1);
        C119774mz c119774mz = new C119774mz(context, null, 6);
        c119774mz.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        c119774mz.setGravity(-1);
        this.LJLILLLLZI = c119774mz;
        addView(c119774mz);
    }

    public static CharSequence LIZJ(String str, C8FR c8fr) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str);
        spannableStringBuilder.append((CharSequence) "x");
        spannableStringBuilder.setSpan(c8fr, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 17);
        return spannableStringBuilder;
    }

    public final void LIZ(List<ActionLinkComponent> list, boolean z) {
        int i;
        this.LJLJI = list;
        C119774mz c119774mz = this.LJLILLLLZI;
        if (c119774mz != null) {
            if (C1GE.LJIILIIL(list)) {
                i = 0;
            } else {
                i = 8;
            }
            c119774mz.setVisibility(i);
        }
        C119774mz c119774mz2 = this.LJLILLLLZI;
        if (c119774mz2 != null) {
            c119774mz2.post(new ARunnableS11S0210000_12((Object) this, (C71791SFn) z, (boolean) list, (List<ActionLinkComponent>) 2));
        }
    }

    public final void LIZIZ(int i, List list) {
        if (C1GE.LJIILIIL(list) && list != null) {
            int i2 = 0;
            int i3 = i;
            for (Object obj : list) {
                int i4 = i2 + 1;
                if (i2 >= 0) {
                    C71792SFo LJFF = LJFF(i2, (ActionLinkComponent) obj);
                    if (LJFF != null) {
                        i3 -= LJFF.LJLILLLLZI;
                        if (i2 == 0) {
                            C119774mz c119774mz = this.LJLILLLLZI;
                            if (c119774mz != null) {
                                c119774mz.addView(LJFF.LJLIL);
                            }
                            if (list.size() > 1 && i3 <= getMaxMoreLinkWidth()) {
                                LJFF.LJLIL.setWidth(i - getMaxMoreLinkWidth());
                                C71792SFo LJ = LJ(list.size() - 1, list);
                                if (LJ != null) {
                                    C119774mz c119774mz2 = this.LJLILLLLZI;
                                    if (c119774mz2 != null) {
                                        c119774mz2.addView(LJ.LJLIL);
                                        return;
                                    }
                                    return;
                                }
                            }
                        } else if ((i2 == list.size() - 1 && i3 > 0) || i3 > getMaxMoreLinkWidth()) {
                            C119774mz c119774mz3 = this.LJLILLLLZI;
                            if (c119774mz3 != null) {
                                c119774mz3.addView(LJFF.LJLIL);
                            }
                        } else {
                            C71792SFo LJ2 = LJ(list.size() - i2, list);
                            if (LJ2 != null) {
                                C119774mz c119774mz4 = this.LJLILLLLZI;
                                if (c119774mz4 == null) {
                                    return;
                                }
                                c119774mz4.addView(LJ2.LJLIL);
                                return;
                            }
                        }
                    }
                    i2 = i4;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    public final C71792SFo LJ(int i, List list) {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZIZ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        c2068389v.LIZJ = O6R.LJJIIZ(C32151Nz.LJIIZILJ(16));
        c2068389v.LIZ = R.raw.icon_chevron_down_small_fill;
        c2068389v.LJ = Integer.valueOf(R.attr.gx);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        C8FR LIZIZ = c2068389v.LIZIZ(2, context);
        N3B n3b = N3B.MORE;
        String string = getContext().getString(R.string.s3g);
        o.LJIIIIZZ(string, "context.getString(R.stri…dow_bingAnswerLinks_btn1)");
        String LLLZ = C16880lQ.LLLZ(string, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        return LIZLLL(n3b, LIZJ(LLLZ, LIZIZ), new AqS143S0200000_12(this, (C71791SFn) list, (List<ActionLinkComponent>) 123));
    }

    public final C71792SFo LJFF(int i, ActionLinkComponent actionLinkComponent) {
        SpannableStringBuilder spannableStringBuilder;
        N3B n3b = N3B.NORMAL;
        String str = actionLinkComponent.displayName;
        if (C26338AVi.LIZLLL(this)) {
            spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((CharSequence) " .");
            spannableStringBuilder.append((CharSequence) String.valueOf(i + 1));
        } else {
            spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) String.valueOf(i + 1));
            spannableStringBuilder.append((CharSequence) ". ");
            spannableStringBuilder.append((CharSequence) str);
        }
        return LIZLLL(n3b, spannableStringBuilder, new AqS61S0201000_12(actionLinkComponent, this, i, 7));
    }

    public final C71792SFo LIZLLL(N3B n3b, CharSequence charSequence, InterfaceC88472Yns<? super View, C76800UCe> interfaceC88472Yns) {
        int i;
        int i2;
        Context context = getContext();
        if (context == null) {
            return null;
        }
        int i3 = 0;
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTag(n3b.name());
        tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, C7MY.LIZIZ(26)));
        tuxTextView.setTextColorRes(R.attr.gx);
        Integer LJI = C79045V0n.LJI(R.attr.w5, context);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        tuxTextView.setBackgroundColor(i);
        tuxTextView.setGravity(17);
        tuxTextView.setMaxLines(1);
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        C54840Lfg.LJLIIL(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6)), tuxTextView);
        C26338AVi.LJI(tuxTextView, null, null, AnonymousClass391.LIZJ(6), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6))), false, 19);
        OUP.LJJJJLI(tuxTextView, Float.valueOf(C32151Nz.LJIIZILJ(5)), null, null, 30);
        C78897Uxp.LJJJJJL(tuxTextView, 0.0f);
        tuxTextView.setTuxFont(62);
        tuxTextView.setText(charSequence);
        C16880lQ.LJJJJI(tuxTextView, new ACListenerS32S0100000_12(interfaceC88472Yns, 62));
        float measureText = tuxTextView.getPaint().measureText(charSequence.toString()) + tuxTextView.getPaddingLeft() + tuxTextView.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            i2 = C16530kr.LIZJ((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            i2 = 0;
        }
        float f = measureText + i2;
        ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            i3 = C16530kr.LIZIZ((ViewGroup.MarginLayoutParams) layoutParams2);
        }
        return new C71792SFo((int) (f + i3 + C7MY.LIZIZ(4)), tuxTextView);
    }
}
