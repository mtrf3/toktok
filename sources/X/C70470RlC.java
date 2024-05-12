package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.RlC, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70470RlC extends LinearLayout {
    public final int LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLILLLLZI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final void setSkuCouponsButtonStyle(boolean z) {
        ((C2WL) LIZ(R.id.avf)).setNeedCustomColor(z);
        ((SY4) LIZ(R.id.avf)).setButtonVariant(z ? 1 : 0);
        if (z) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = C61328O5c.LIZJ(2);
            c110614Vt.LIZLLL = AnonymousClass391.LIZJ(1);
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            c110614Vt.LJ = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.eb, context));
            View LIZ = LIZ(R.id.avf);
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            LIZ.setBackground(c110614Vt.LIZ(context2));
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            ((TextView) LIZ(R.id.avf)).setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context3));
            return;
        }
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "context");
        ((TextView) LIZ(R.id.avf)).setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context4));
    }

    public final void setAuthorIcon(Image image) {
        W5F LJ = C70759Rpr.LJ(image);
        LJ.LJIIJJI = R.drawable.dds;
        LJ.LJJIIJ = (SmartImageView) LIZ(R.id.k15);
        C16880lQ.LLJJJ(LJ);
    }

    public final void setAuthorIconStatus(int i) {
        if (i == EnumC46479ILz.INPROGRESS.ordinal()) {
            ((ImageView) LIZ(R.id.lb7)).setVisibility(0);
            ((ImageView) LIZ(R.id.lb8)).setVisibility(8);
        } else if (i == EnumC46479ILz.WAITTOFINISH.ordinal() || i == EnumC46479ILz.FINISHED.ordinal()) {
            ((ImageView) LIZ(R.id.lb7)).setVisibility(8);
            ((ImageView) LIZ(R.id.lb8)).setVisibility(0);
        } else {
            setFollowContainerVisible(8);
            ((ImageView) LIZ(R.id.lb7)).setVisibility(8);
            ((ImageView) LIZ(R.id.lb8)).setVisibility(8);
        }
    }

    public final void setBackground(int i) {
        LIZ(R.id.bxa).setBackgroundResource(i);
    }

    public final void setCouponsTags(List<View> mutableList) {
        o.LJIIIZ(mutableList, "mutableList");
        LIZ(R.id.bxd).setVisibility(0);
        ViewGroup viewGroup = (ViewGroup) LIZ(R.id.bxd);
        for (View view : mutableList) {
            ViewGroup.MarginLayoutParams LJFF = C27570Aru.LJFF(view);
            if (LJFF != null) {
                LJFF.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            }
            viewGroup.addView(view);
        }
    }

    public final void setDiscountTextOld(String text) {
        o.LJIIIZ(text, "text");
        ((TextView) LIZ(R.id.cat)).setText(text);
        TextView textView = (TextView) LIZ(R.id.cat);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context));
        ((TuxTextView) LIZ(R.id.cat)).setTuxFont(62);
    }

    public final void setDiscountTime(String time) {
        o.LJIIIZ(time, "time");
        ((TextView) LIZ(R.id.ks9)).setText(time);
    }

    public final void setFollowContainerVisible(int i) {
        LIZ(R.id.de_).setVisibility(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C70470RlC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
        C16880lQ.LLLZIIL(R.layout.ao5, C16880lQ.LLZIL(context), this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a85, R.attr.a86, R.attr.b1k});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…eable.TuxCouponsItemView)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int i = obtainStyledAttributes.getInt(1, 0);
        int i2 = obtainStyledAttributes.getInt(2, 0);
        LIZ(R.id.bxa).setBackgroundResource(resourceId);
        this.LJLIL = i;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            LIZ(R.id.bxa).getLayoutParams().height = C7MY.LIZIZ(48);
                        }
                    } else {
                        LIZ(R.id.bxa).getLayoutParams().height = C7MY.LIZIZ(60);
                    }
                    if (LIZ(R.id.bxa).getLayoutParams().height == C7MY.LIZIZ(48)) {
                        View btn_claim_or_use = LIZ(R.id.avf);
                        o.LJIIIIZZ(btn_claim_or_use, "btn_claim_or_use");
                        ViewGroup.MarginLayoutParams LJFF = C27570Aru.LJFF(btn_claim_or_use);
                        if (LJFF != null) {
                            LJFF.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                        }
                        View tags_discount_threshold_layout = LIZ(R.id.l0t);
                        o.LJIIIIZZ(tags_discount_threshold_layout, "tags_discount_threshold_layout");
                        ViewGroup.MarginLayoutParams LJFF2 = C27570Aru.LJFF(tags_discount_threshold_layout);
                        if (LJFF2 != null) {
                            LJFF2.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                        }
                        View tags_discount_threshold_layout2 = LIZ(R.id.l0t);
                        o.LJIIIIZZ(tags_discount_threshold_layout2, "tags_discount_threshold_layout");
                        ViewGroup.MarginLayoutParams LJFF3 = C27570Aru.LJFF(tags_discount_threshold_layout2);
                        if (LJFF3 != null) {
                            LJFF3.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                        }
                    }
                }
            } else {
                LIZ(R.id.bxa).getLayoutParams().height = C7MY.LIZIZ(48);
                LIZ(R.id.cat).getLayoutParams().height = C7MY.LIZIZ(17);
                LIZ(R.id.ks9).getLayoutParams().height = C7MY.LIZIZ(13);
                ((TuxTextView) LIZ(R.id.cat)).setTuxFont(62);
                LIZ(R.id.avf).getLayoutParams().width = C7MY.LIZIZ(48);
                LIZ(R.id.avf).getLayoutParams().height = C7MY.LIZIZ(18);
                View btn_claim_or_use2 = LIZ(R.id.avf);
                o.LJIIIIZZ(btn_claim_or_use2, "btn_claim_or_use");
                ViewGroup.MarginLayoutParams LJFF4 = C27570Aru.LJFF(btn_claim_or_use2);
                if (LJFF4 != null) {
                    LJFF4.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                }
                View tags_discount_threshold_layout3 = LIZ(R.id.l0t);
                o.LJIIIIZZ(tags_discount_threshold_layout3, "tags_discount_threshold_layout");
                ViewGroup.MarginLayoutParams LJFF5 = C27570Aru.LJFF(tags_discount_threshold_layout3);
                if (LJFF5 != null) {
                    LJFF5.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                }
                View tags_discount_threshold_layout4 = LIZ(R.id.l0t);
                o.LJIIIIZZ(tags_discount_threshold_layout4, "tags_discount_threshold_layout");
                ViewGroup.MarginLayoutParams LJFF6 = C27570Aru.LJFF(tags_discount_threshold_layout4);
                if (LJFF6 != null) {
                    LJFF6.setMarginEnd(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)));
                }
            }
        } else {
            LIZ(R.id.bxa).getLayoutParams().width = -1;
            LIZ(R.id.bxa).getLayoutParams().height = C7MY.LIZIZ(60);
            View threshold_text = LIZ(R.id.l6y);
            o.LJIIIIZZ(threshold_text, "threshold_text");
            ViewGroup.MarginLayoutParams LJFF7 = C27570Aru.LJFF(threshold_text);
            if (LJFF7 != null) {
                LJFF7.setMarginStart(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)));
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        if (this.LJLIL == 2) {
            if (C7MY.LIZIZ(300) < getMeasuredWidth()) {
                measuredWidth = C7MY.LIZIZ(300);
            } else if (C7MY.LIZIZ(240) > getMeasuredWidth()) {
                measuredWidth = C7MY.LIZIZ(240);
            }
        }
        setMeasuredDimension(measuredWidth, getMeasuredHeight());
    }

    public final void LIZIZ(EnumC70476RlI state, String str, EnumC70482RlO enumC70482RlO) {
        o.LJIIIZ(state, "state");
        int i = C70473RlF.LIZIZ[state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                LIZ(R.id.m2c).setVisibility(0);
                LIZ(R.id.avf).setVisibility(8);
                ((TextView) LIZ(R.id.m2c)).setText(str);
                if (enumC70482RlO == EnumC70482RlO.BLUE) {
                    Context context = getContext();
                    o.LJIIIIZZ(context, "context");
                    ((TextView) LIZ(R.id.m2c)).setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eg, context));
                    return;
                }
                if (enumC70482RlO != EnumC70482RlO.RED) {
                    return;
                }
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                ((TextView) LIZ(R.id.m2c)).setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context2));
                return;
            }
            ((TextView) LIZ(R.id.avf)).setText(str);
            if (enumC70482RlO == EnumC70482RlO.BLUE) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZJ = C61328O5c.LIZJ(2);
                c110614Vt.LIZLLL = 1;
                Context context3 = getContext();
                o.LJIIIIZZ(context3, "context");
                c110614Vt.LJ = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.eg, context3));
                Context context4 = getContext();
                o.LJIIIIZZ(context4, "context");
                c110614Vt.LIZ = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.dj, context4));
                View LIZ = LIZ(R.id.avf);
                Context context5 = getContext();
                o.LJIIIIZZ(context5, "context");
                LIZ.setBackground(c110614Vt.LIZ(context5));
                Context context6 = getContext();
                o.LJIIIIZZ(context6, "context");
                ((TextView) LIZ(R.id.avf)).setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eg, context6));
                return;
            }
            ((C2WL) LIZ(R.id.avf)).setNeedCustomColor(true);
            ((SY4) LIZ(R.id.avf)).setButtonVariant(1);
            C110614Vt c110614Vt2 = new C110614Vt();
            c110614Vt2.LIZJ = C61328O5c.LIZJ(2);
            c110614Vt2.LIZLLL = C1FJ.LIZIZ(1);
            Context context7 = getContext();
            o.LJIIIIZZ(context7, "context");
            c110614Vt2.LJ = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.eb, context7));
            Context context8 = getContext();
            o.LJIIIIZZ(context8, "context");
            c110614Vt2.LIZ = Integer.valueOf(AnonymousClass636.LJIIIIZZ(R.attr.dj, context8));
            View LIZ2 = LIZ(R.id.avf);
            Context context9 = getContext();
            o.LJIIIIZZ(context9, "context");
            LIZ2.setBackground(c110614Vt2.LIZ(context9));
            Context context10 = getContext();
            o.LJIIIIZZ(context10, "context");
            ((TextView) LIZ(R.id.avf)).setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.eb, context10));
            return;
        }
        ((TextView) LIZ(R.id.avf)).setText(str);
        if (enumC70482RlO == EnumC70482RlO.BLUE) {
            View LIZ3 = LIZ(R.id.avf);
            Context context11 = getContext();
            o.LJIIIIZZ(context11, "context");
            LIZ3.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.eg, context11));
        } else {
            ((C2WL) LIZ(R.id.avf)).setNeedCustomColor(true);
            ((SY4) LIZ(R.id.avf)).setButtonVariant(0);
        }
        TextView textView = (TextView) LIZ(R.id.avf);
        Context context12 = getContext();
        o.LJIIIIZZ(context12, "context");
        textView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.dj, context12));
    }
}
