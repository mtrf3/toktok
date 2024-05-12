package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS56S1100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6DJ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6DJ extends AbstractC82681Wcf<C6DJ> {
    public List<? extends C6DM> LIZJ;
    public int LIZLLL;
    public final int LJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.widget.LinearLayout, android.view.View, X.6DK] */
    @Override // X.AbstractC82681Wcf
    public final InterfaceC82683Wch LIZJ() {
        LJIIJ(null, true);
        final Activity activity = this.LIZIZ;
        ?? r1 = new LinearLayout(activity) { // from class: X.6DK
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(activity, null, R.attr.kw);
                int parseColor;
                a1.LJFF(activity, "context");
                setOrientation(1);
                Integer LJII = C79045V0n.LJII(activity, new int[]{R.attr.tf, R.attr.tg, R.attr.th, R.attr.ti, R.attr.tj, R.attr.tk, R.attr.tl, R.attr.tm, R.attr.tn, R.attr.to}, 1);
                if (LJII != null) {
                    parseColor = LJII.intValue();
                } else {
                    parseColor = ColorProtector.parseColor("#33FFFFFF");
                }
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LJI = AnonymousClass391.LIZ(0.5d);
                c110614Vt.LIZ = Integer.valueOf(parseColor);
                setDividerDrawable(c110614Vt.LIZ(activity));
                setDividerPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
                setShowDividers(2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [X.6DP, android.view.View] */
            /* JADX WARN: Type inference failed for: r1v1, types: [X.6DN, android.view.View] */
            public final void setActions(List<? extends C6DM> list) {
                o.LJIIIZ(list, "list");
                removeAllViews();
                for (Object obj : list) {
                    if (obj instanceof View) {
                        o.LJII(obj, "null cannot be cast to non-null type android.view.View");
                        addView((View) obj);
                    } else if (obj instanceof C6DQ) {
                        final Context context = getContext();
                        o.LJIIIIZZ(context, "context");
                        ?? r12 = new FrameLayout(context) { // from class: X.6DP
                            public final View LJLIL;
                            public C6DQ LJLILLLLZI;

                            public final C6DQ getAction() {
                                return this.LJLILLLLZI;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(context, null, R.attr.kw);
                                new LinkedHashMap();
                                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.co, this, true);
                                this.LJLIL = LLLLIILL;
                                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.tf, R.attr.tg, R.attr.th, R.attr.ti, R.attr.tj, R.attr.tk, R.attr.tl, R.attr.tm, R.attr.tn, R.attr.to}, R.attr.kw, 0);
                                o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…Tooltip, defStyleAttr, 0)");
                                try {
                                    TuxTextView tuxTextView = (TuxTextView) LLLLIILL.findViewById(R.id.text);
                                    C1E4.LJI(obtainStyledAttributes, 3);
                                    int color = obtainStyledAttributes.getColor(3, 0);
                                    C1E4.LJI(obtainStyledAttributes, 2);
                                    int i = obtainStyledAttributes.getInt(2, 0);
                                    tuxTextView.setTextColor(color);
                                    tuxTextView.setTuxFont(i);
                                    int resourceId = obtainStyledAttributes.getResourceId(4, 0);
                                    TuxIconView tuxIconView = (TuxIconView) LLLLIILL.findViewById(R.id.a7w);
                                    C2068389v c2068389v = new C2068389v();
                                    c2068389v.LIZ = resourceId;
                                    c2068389v.LIZLLL = Integer.valueOf(color);
                                    tuxIconView.setTuxIcon(c2068389v);
                                } catch (IllegalArgumentException unused) {
                                }
                                obtainStyledAttributes.recycle();
                            }

                            public final void setAction(C6DQ c6dq) {
                                this.LJLILLLLZI = c6dq;
                                if (c6dq != null) {
                                    AqS56S1100000_2 aqS56S1100000_2 = c6dq.LIZ;
                                    if (aqS56S1100000_2 != null) {
                                        View findViewById = this.LJLIL.findViewById(R.id.egd);
                                        o.LJIIIIZZ(findViewById, "view.image");
                                        aqS56S1100000_2.invoke(findViewById);
                                        ((ImageView) this.LJLIL.findViewById(R.id.egd)).setVisibility(0);
                                    } else {
                                        ((ImageView) this.LJLIL.findViewById(R.id.egd)).setVisibility(8);
                                    }
                                    if (c6dq.LIZIZ != 0) {
                                        ((TextView) this.LJLIL.findViewById(R.id.text)).setText(getResources().getString(c6dq.LIZIZ));
                                    } else {
                                        ((TextView) this.LJLIL.findViewById(R.id.text)).setText(c6dq.LIZJ);
                                    }
                                    View view = this.LJLIL;
                                    o.LJIIIIZZ(view, "view");
                                    C78897Uxp.LJJJJJL(view, C32151Nz.LJIIZILJ(8));
                                    C16880lQ.LJIIJ(c6dq.LIZLLL, this.LJLIL);
                                }
                            }
                        };
                        r12.setAction((C6DQ) obj);
                        addView(r12);
                    } else if (obj instanceof C6DO) {
                        final Context context2 = getContext();
                        o.LJIIIIZZ(context2, "context");
                        ?? r13 = new FrameLayout(context2) { // from class: X.6DN
                            public final View LJLIL;
                            public C6DO LJLILLLLZI;

                            public final C6DO getAction() {
                                return this.LJLILLLLZI;
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(context2, null, R.attr.kw);
                                new LinkedHashMap();
                                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context2), R.layout.cp, this, true);
                                this.LJLIL = LLLLIILL;
                                TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(null, new int[]{R.attr.tf, R.attr.tg, R.attr.th, R.attr.ti, R.attr.tj, R.attr.tk, R.attr.tl, R.attr.tm, R.attr.tn, R.attr.to}, R.attr.kw, 0);
                                o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…Tooltip, defStyleAttr, 0)");
                                try {
                                    TuxTextView tuxTextView = (TuxTextView) LLLLIILL.findViewById(R.id.text);
                                    C1E4.LJI(obtainStyledAttributes, 2);
                                    tuxTextView.setTuxFont(obtainStyledAttributes.getInt(2, 0));
                                    TextView textView = (TextView) LLLLIILL.findViewById(R.id.text);
                                    C1E4.LJI(obtainStyledAttributes, 3);
                                    textView.setTextColor(obtainStyledAttributes.getColor(3, 0));
                                } catch (IllegalArgumentException unused) {
                                }
                                obtainStyledAttributes.recycle();
                            }

                            public final void setAction(C6DO c6do) {
                                this.LJLILLLLZI = c6do;
                                if (c6do != null) {
                                    if (c6do.LIZ != 0) {
                                        ((ImageView) this.LJLIL.findViewById(R.id.e_q)).setVisibility(0);
                                        ImageView imageView = (ImageView) this.LJLIL.findViewById(R.id.e_q);
                                        C2068389v c2068389v = new C2068389v();
                                        c2068389v.LIZ = c6do.LIZ;
                                        c2068389v.LJ = Integer.valueOf(c6do.LIZIZ);
                                        c2068389v.LIZIZ = C7MY.LIZIZ(16);
                                        c2068389v.LIZJ = C7MY.LIZIZ(16);
                                        Context context3 = getContext();
                                        o.LJIIIIZZ(context3, "context");
                                        imageView.setImageDrawable(c2068389v.LIZ(context3));
                                    } else {
                                        ((ImageView) this.LJLIL.findViewById(R.id.e_q)).setVisibility(8);
                                    }
                                    if (c6do.LIZJ != 0) {
                                        ((TextView) this.LJLIL.findViewById(R.id.text)).setText(getResources().getString(c6do.LIZJ));
                                    } else {
                                        ((TextView) this.LJLIL.findViewById(R.id.text)).setText(c6do.LIZLLL);
                                    }
                                    if (c6do.LJ != -1) {
                                        ((TuxTextView) this.LJLIL.findViewById(R.id.text)).setTextColorRes(c6do.LJ);
                                    }
                                    View view = this.LJLIL;
                                    o.LJIIIIZZ(view, "view");
                                    C78897Uxp.LJJJJJL(view, C32151Nz.LJIIZILJ(8));
                                    C16880lQ.LJIIJ(c6do.LJFF, this.LJLIL);
                                }
                            }
                        };
                        r13.setAction((C6DO) obj);
                        addView(r13);
                    }
                }
            }
        };
        r1.setActions(this.LIZJ);
        int i = this.LIZLLL;
        if (i >= 0) {
            r1.setMinimumWidth(i);
        }
        int i2 = this.LJ;
        if (i2 >= 0) {
            r1.setDividerPadding(i2);
        }
        LIZLLL(r1);
        return super.LIZJ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6DJ(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
        this.LIZJ = C61878OQg.INSTANCE;
        this.LIZLLL = -1;
        this.LJ = -1;
        Integer LJII = C79045V0n.LJII(context, new int[]{R.attr.tf, R.attr.tg, R.attr.th, R.attr.ti, R.attr.tj, R.attr.tk, R.attr.tl, R.attr.tm, R.attr.tn, R.attr.to}, 0);
        if (LJII != null) {
            LJIIIIZZ(LJII.intValue());
        }
    }

    public final void LJIIJJI(InterfaceC88472Yns interfaceC88472Yns) {
        C6DL c6dl = new C6DL(this.LIZIZ);
        interfaceC88472Yns.invoke(c6dl);
        this.LIZJ = c6dl.LIZIZ;
    }
}
