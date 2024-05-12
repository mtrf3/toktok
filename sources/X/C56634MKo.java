package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiAdapterWidget;
import com.ss.android.ugc.aweme.inbox.widget.multi.NoticeAndDMCombineWidget;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MKo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56634MKo extends AbstractC030309z {
    public final List<? extends InboxAdapterWidget> LJLIL;
    public final boolean LJLILLLLZI = true;
    public final Paint LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final float LJLJL;
    public final float LJLJLJ;

    public final int LJII() {
        Iterator<? extends InboxAdapterWidget> it = this.LJLIL.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().LJIIJ().getItemCount();
        }
        InboxAdapterWidget inboxAdapterWidget = (InboxAdapterWidget) ORZ.LLFII(this.LJLIL);
        if (inboxAdapterWidget == null || (inboxAdapterWidget instanceof MultiAdapterWidget) || (inboxAdapterWidget instanceof NoticeAndDMCombineWidget) || inboxAdapterWidget.LJIIJ().getItemCount() == 0 || o.LJ(inboxAdapterWidget.LJIILJJIL().getValue(), Boolean.TRUE)) {
            return i;
        }
        return i - 1;
    }

    public final boolean LJIIIIZZ() {
        if (IRI.LIZ()) {
            List<? extends InboxAdapterWidget> list = this.LJLIL;
            ArrayList arrayList = new ArrayList();
            for (InboxAdapterWidget inboxAdapterWidget : list) {
                if (inboxAdapterWidget instanceof NoticeAndDMCombineWidget) {
                    arrayList.add(inboxAdapterWidget);
                }
            }
            Iterator it = arrayList.iterator();
            if (!it.hasNext()) {
                return false;
            }
            ((NoticeAndDMCombineWidget) it.next()).LLF.LJIILLIIL().getClass();
            return C53357Kwr.LIZIZ();
        }
        List<? extends InboxAdapterWidget> list2 = this.LJLIL;
        ArrayList arrayList2 = new ArrayList();
        for (InboxAdapterWidget inboxAdapterWidget2 : list2) {
            if (inboxAdapterWidget2 instanceof MultiAdapterWidget) {
                arrayList2.add(inboxAdapterWidget2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (!it2.hasNext()) {
            return false;
        }
        ((MultiAdapterWidget) it2.next()).LJIILLIIL().getClass();
        return C53357Kwr.LIZIZ();
    }

    public final boolean LJIIIZ() {
        if (IRI.LIZ()) {
            List<? extends InboxAdapterWidget> list = this.LJLIL;
            ArrayList arrayList = new ArrayList();
            for (InboxAdapterWidget inboxAdapterWidget : list) {
                if (inboxAdapterWidget instanceof NoticeAndDMCombineWidget) {
                    arrayList.add(inboxAdapterWidget);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext() && ((NoticeAndDMCombineWidget) it.next()).LLF.LJIILLIIL().LJLLL != null) {
                return true;
            }
            return false;
        }
        List<? extends InboxAdapterWidget> list2 = this.LJLIL;
        ArrayList arrayList2 = new ArrayList();
        for (InboxAdapterWidget inboxAdapterWidget2 : list2) {
            if (inboxAdapterWidget2 instanceof MultiAdapterWidget) {
                arrayList2.add(inboxAdapterWidget2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext() && ((MultiAdapterWidget) it2.next()).LJIILLIIL().LJLLL != null) {
            return true;
        }
        return false;
    }

    public final boolean LJIIJ() {
        if (IRI.LIZ()) {
            if ((!this.LJLIL.isEmpty()) && !(ListProtector.get(this.LJLIL, 0) instanceof NoticeAndDMCombineWidget) && ((InboxAdapterWidget) ListProtector.get(this.LJLIL, 0)).LJIIJ().getItemCount() > 0) {
                return true;
            }
            return false;
        }
        if ((!this.LJLIL.isEmpty()) && !(ListProtector.get(this.LJLIL, 0) instanceof MultiAdapterWidget) && ((InboxAdapterWidget) ListProtector.get(this.LJLIL, 0)).LJIIJ().getItemCount() > 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC030309z
    public final void LJI(Canvas c, RecyclerView parent, C0AC state) {
        InterfaceC56635MKp interfaceC56635MKp;
        o.LJIIIZ(c, "c");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        if (this.LJLJJL == 1) {
            int measuredWidth = parent.getMeasuredWidth();
            int childCount = parent.getChildCount();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("childCount = ");
            LIZ.append(childCount);
            C221018lt.LIZ("InboxDividerItemDecoration", X1D.LIZIZ(LIZ));
            for (int i = 0; i < childCount; i++) {
                View child = parent.getChildAt(i);
                int LJJJJIZL = RecyclerView.LJJJJIZL(child);
                if (!LJIIJ() || LJJJJIZL != 0) {
                    o.LJIIIIZZ(child, "child");
                    if (parent.LJJJJJL(child) instanceof C111974aP) {
                        continue;
                    } else {
                        C53330KwQ.LIZ.getClass();
                        if ((!C53330KwQ.LIZIZ() || !(child instanceof MKT) || child.getHeight() != 0) && ((!LJIIIIZZ() || !(parent.LJJIZ(LJJJJIZL) instanceof C56721MNx) || !(parent.LJJIZ(LJJJJIZL + 1) instanceof MMK)) && !(parent.LJJJJJL(child) instanceof MMK))) {
                            if (C53432Ky4.LIZLLL()) {
                                Object LJJJJJL = parent.LJJJJJL(child);
                                if ((LJJJJJL instanceof InterfaceC56635MKp) && (interfaceC56635MKp = (InterfaceC56635MKp) LJJJJJL) != null && interfaceC56635MKp.LJJIIZI() && !(parent.LJJJJJL(child) instanceof InterfaceC56632MKm)) {
                                }
                            }
                            boolean z = child instanceof MKT;
                            if (!z || !C53339KwZ.LIZLLL() || child.getHeight() <= 0) {
                                if (LA9.LIZ(true)) {
                                    RecyclerView.ViewHolder LJJJJJL2 = parent.LJJJJJL(child);
                                    if (LJJJJJL2 instanceof InterfaceC56632MKm) {
                                        continue;
                                    } else if (LJJJJJL2 instanceof MM2) {
                                        continue;
                                    } else if (LJJJJJL2 instanceof C56674MMc) {
                                        continue;
                                    }
                                }
                                if (LJJJJIZL >= LJII()) {
                                    return;
                                }
                                if (!(parent.LJJIZ(LJJJJIZL) instanceof C56671MLz) && !(parent.LJJIZ(LJJJJIZL + 1) instanceof C56671MLz)) {
                                    int bottom = child.getBottom();
                                    int i2 = bottom - this.LJLJJI;
                                    if (this.LJLILLLLZI) {
                                        c.drawRect(((LJIIIZ() && (!LJIIJ() ? LJJJJIZL == 1 : LJJJJIZL == 2)) || (z && child.getHeight() > 0)) ? 0 : 0 + this.LJLJL, i2, measuredWidth - this.LJLJLJ, bottom, this.LJLJI);
                                    } else {
                                        float f = i2;
                                        float f2 = bottom;
                                        c.drawRect(0.0f, f, this.LJLJL, f2, this.LJLJI);
                                        float f3 = measuredWidth;
                                        c.drawRect(f3 - this.LJLJLJ, f, f3, f2, this.LJLJI);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return;
        }
        int measuredHeight = parent.getMeasuredHeight();
        int childCount2 = parent.getChildCount();
        for (int i3 = 0; i3 < childCount2; i3++) {
            View childAt = parent.getChildAt(i3);
            if (RecyclerView.LJJJJIZL(childAt) < LJII()) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                int left = childAt.getLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                int i4 = left - this.LJLJJI;
                if (this.LJLILLLLZI) {
                    c.drawRect(i4, 0 + this.LJLJL, left, measuredHeight - this.LJLJLJ, this.LJLJI);
                } else {
                    float f4 = i4;
                    float f5 = this.LJLJL;
                    float f6 = left;
                    c.drawRect(f4, 0 + f5, f6, f5, this.LJLJI);
                    float f7 = measuredHeight;
                    c.drawRect(f4, f7 - this.LJLJLJ, f6, f7, this.LJLJI);
                }
            } else {
                return;
            }
        }
    }

    public C56634MKo(List list, int i, int i2, float f) {
        this.LJLIL = list;
        Paint paint = new Paint(1);
        this.LJLJI = paint;
        this.LJLJJI = i2;
        this.LJLJJL = 1;
        this.LJLJJLL = -1;
        this.LJLJL = f;
        this.LJLJLJ = 0.0f;
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r3 == 3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        r0 = X.C7MY.LIZIZ(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        if (X.C53330KwQ.LIZIZ() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r3 == 1) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0047, code lost:
    
        if (r3 == 2) goto L15;
     */
    @Override // X.AbstractC030309z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(android.graphics.Rect r14, android.view.View r15, androidx.recyclerview.widget.RecyclerView r16, X.C0AC r17) {
        /*
            r13 = this;
            java.lang.String r5 = "outRect"
            java.lang.String r7 = "view"
            java.lang.String r9 = "parent"
            java.lang.String r11 = "state"
            r6 = r15
            r4 = r14
            r10 = r17
            r8 = r16
            r12 = r6
            int r3 = X.C1JX.LIZJ(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            int r0 = r13.LJLJJL
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L5b
            boolean r0 = r13.LJIIIIZZ()
            if (r0 == 0) goto L24
        L1f:
            r0 = 0
        L20:
            r4.set(r1, r0, r1, r1)
        L23:
            return
        L24:
            boolean r0 = r13.LJIIJ()
            if (r0 == 0) goto L3a
            boolean r0 = r13.LJIIIZ()
            if (r0 == 0) goto L3a
            r0 = 3
            if (r3 != r0) goto L1f
        L33:
            r0 = 8
            int r0 = X.C7MY.LIZIZ(r0)
            goto L20
        L3a:
            boolean r0 = r13.LJIIJ()
            if (r0 != 0) goto L46
            boolean r0 = r13.LJIIIZ()
            if (r0 == 0) goto L4a
        L46:
            r0 = 2
            if (r3 != r0) goto L1f
            goto L33
        L4a:
            if (r3 != r2) goto L58
            X.KwQ r0 = X.C53330KwQ.LIZ
            r0.getClass()
            boolean r0 = X.C53330KwQ.LIZIZ()
            if (r0 == 0) goto L33
            goto L1f
        L58:
            if (r3 != r2) goto L1f
            goto L33
        L5b:
            int r0 = r13.LJLJJLL
            if (r3 != r0) goto L64
            r0 = 0
        L60:
            r4.set(r1, r1, r0, r1)
            goto L23
        L64:
            int r0 = r13.LJLJJI
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56634MKo.LJ(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, X.0AC):void");
    }
}
