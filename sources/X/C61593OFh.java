package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AqS173S0200000_10;
import kotlin.jvm.internal.o;
import q03.IDaS203S0200000_10;

/* renamed from: X.OFh, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61593OFh implements OM7 {
    public final LinkedList<C59091NHb> LIZ;
    public AqS173S0200000_10 LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    @Override // X.OM7
    public final boolean LIZ() {
        LinkedList<C59091NHb> linkedList = this.LIZ;
        if ((linkedList instanceof Collection) && linkedList.isEmpty()) {
            return true;
        }
        Iterator<C59091NHb> it = linkedList.iterator();
        while (it.hasNext()) {
            if (it.next().LIZ != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C61593OFh() {
        /*
            r4 = this;
            r4.<init>()
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r4.LIZ = r1
            boolean r0 = r1 instanceof java.util.Collection
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L4f
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L4f
        L16:
            java.util.LinkedList<X.NHb> r0 = r4.LIZ
            int r0 = r0.size()
            if (r0 > r3) goto L64
            r0 = 1
        L1f:
            r4.LIZJ = r0
            java.util.LinkedList<X.NHb> r1 = r4.LIZ
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L3a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L3a
        L2d:
            java.util.LinkedList<X.NHb> r0 = r4.LIZ
            int r1 = r0.size()
            r0 = 2
            if (r1 > r0) goto L37
            r2 = 1
        L37:
            r4.LIZLLL = r2
            return
        L3a:
            java.util.Iterator r1 = r1.iterator()
        L3e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r1.next()
            X.NHb r0 = (X.C59091NHb) r0
            int r0 = r0.LIZ
            if (r0 != r3) goto L37
            goto L3e
        L4f:
            java.util.Iterator r1 = r1.iterator()
        L53:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            X.NHb r0 = (X.C59091NHb) r0
            int r0 = r0.LIZ
            if (r0 != 0) goto L64
            goto L53
        L64:
            r0 = 0
            goto L1f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61593OFh.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bytedance.tux.input.TuxTextView, android.widget.TextView, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v4, types: [android.widget.TextView, X.SY4, android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.widget.LinearLayout, android.view.View, android.view.ViewGroup] */
    @Override // X.OM7
    public final View LIZIZ(Context context) {
        Number valueOf;
        ?? tuxTextView;
        int paddingEnd;
        if (this.LIZLLL || this.LIZJ) {
            ?? linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            linearLayout.setOrientation(0);
            int i = 17;
            linearLayout.setGravity(17);
            Paint paint = new Paint();
            paint.setTextSize(C32151Nz.LJIIZILJ(12));
            if (this.LIZ.size() == 1) {
                valueOf = -2;
            } else {
                Iterator<C59091NHb> it = this.LIZ.iterator();
                if (it.hasNext()) {
                    float measureText = paint.measureText(it.next().LIZIZ.toString());
                    while (it.hasNext()) {
                        measureText = Math.max(measureText, paint.measureText(it.next().LIZIZ.toString()));
                    }
                    valueOf = Float.valueOf(Math.min(C32151Nz.LJIIZILJ(Float.valueOf(measureText)), C32151Nz.LJIIZILJ(68) - C32151Nz.LJIIZILJ(20)));
                } else {
                    throw new NoSuchElementException();
                }
            }
            Iterator<C59091NHb> it2 = this.LIZ.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                C59091NHb next = it2.next();
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    C59091NHb c59091NHb = next;
                    c59091NHb.LJ = valueOf.intValue();
                    int i4 = c59091NHb.LIZ;
                    if (i4 != 0) {
                        if (i4 == 1) {
                            tuxTextView = new SY4(context, null, 6, 0);
                            InterfaceC88472Yns interfaceC88472Yns = c59091NHb.LIZJ;
                            if (interfaceC88472Yns != null) {
                                interfaceC88472Yns.invoke(tuxTextView);
                            }
                            tuxTextView.setButtonSize(0);
                            tuxTextView.setGravity(i);
                            tuxTextView.setButtonVariant(2);
                            C110614Vt c110614Vt = new C110614Vt();
                            c110614Vt.LIZJ = C61328O5c.LIZJ(24);
                            c110614Vt.LIZIZ = Integer.valueOf(R.attr.d1);
                            Context context2 = tuxTextView.getContext();
                            o.LJIIIIZZ(context2, "context");
                            tuxTextView.setBackground(c110614Vt.LIZ(context2));
                            tuxTextView.LJJJIL(true);
                            tuxTextView.setPadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(10)), 0);
                            int i5 = c59091NHb.LJ;
                            if (i5 == -2) {
                                paddingEnd = -2;
                            } else {
                                paddingEnd = tuxTextView.getPaddingEnd() + tuxTextView.getPaddingStart() + i5;
                            }
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(paddingEnd, C7MY.LIZIZ(24));
                            if (i2 == 1) {
                                if (C251659uD.LIZ()) {
                                    layoutParams.setMargins(0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), 0);
                                } else {
                                    layoutParams.setMargins(O6R.LJJIIZ(C32151Nz.LJIIZILJ(4)), 0, 0, 0);
                                }
                            }
                            tuxTextView.setLayoutParams(layoutParams);
                            tuxTextView.setText(c59091NHb.LIZIZ);
                            C16880lQ.LJIIJ(new IDaS203S0200000_10(this, c59091NHb, 3), tuxTextView);
                            i = 17;
                        } else {
                            throw new IllegalArgumentException("invalid button type");
                        }
                    } else {
                        tuxTextView = new TuxTextView(context, null, 6, 0);
                        InterfaceC88472Yns interfaceC88472Yns2 = c59091NHb.LIZJ;
                        if (interfaceC88472Yns2 != null) {
                            interfaceC88472Yns2.invoke(tuxTextView);
                        }
                        tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                        tuxTextView.setTuxFont(62);
                        tuxTextView.setTextColorRes(R.attr.dj);
                        tuxTextView.setMaxLines(1);
                        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                        i = 17;
                        tuxTextView.setGravity(17);
                        tuxTextView.setText(c59091NHb.LIZIZ);
                        C16880lQ.LJIIJ(new IDaS203S0200000_10(this, c59091NHb, 4), tuxTextView);
                    }
                    linearLayout.addView(tuxTextView);
                    i2 = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            return linearLayout;
        }
        throw new IllegalArgumentException("layout should contains only one type instead of mixed type, and it support maximum two buttons");
    }

    public static void LIZJ(C61593OFh c61593OFh, CharSequence text, InterfaceC88472Yns interfaceC88472Yns) {
        c61593OFh.getClass();
        o.LJIIIZ(text, "text");
        c61593OFh.LIZ.add(new C59091NHb(text, null, interfaceC88472Yns));
    }
}
