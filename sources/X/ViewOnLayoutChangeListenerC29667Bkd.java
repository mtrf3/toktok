package X;

import android.view.View;
import com.bytedance.android.livesdk.model.StickerCheckResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.Bkd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC29667Bkd implements View.OnLayoutChangeListener {
    public final /* synthetic */ AbstractC29665Bkb<T> LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public ViewOnLayoutChangeListenerC29667Bkd(AbstractC29665Bkb<T> abstractC29665Bkb, boolean z) {
        this.LJLIL = abstractC29665Bkb;
        this.LJLILLLLZI = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        int measuredHeight;
        java.util.Map<Long, Boolean> map;
        o.LJIIIZ(v, "v");
        View view = this.LJLIL.LJLJLLL;
        if (view != null) {
            view.removeOnLayoutChangeListener(this);
            AbstractC29665Bkb<T> abstractC29665Bkb = this.LJLIL;
            int[] iArr = abstractC29665Bkb.LJLLI;
            View view2 = abstractC29665Bkb.LJLJLLL;
            if (view2 != null) {
                iArr[1] = view2.getTop();
                if (this.LJLILLLLZI) {
                    AbstractC29665Bkb<T> abstractC29665Bkb2 = this.LJLIL;
                    abstractC29665Bkb2.LLFII = abstractC29665Bkb2.LJJZZIII();
                    AbstractC29665Bkb<T> abstractC29665Bkb3 = this.LJLIL;
                    View view3 = abstractC29665Bkb3.LLFII;
                    if (view3 != null) {
                        abstractC29665Bkb3.addView(view3);
                        AbstractC29665Bkb<T> abstractC29665Bkb4 = this.LJLIL;
                        View view4 = abstractC29665Bkb4.LLFII;
                        o.LJI(view4);
                        abstractC29665Bkb4.LJL(view4);
                        return;
                    }
                    return;
                }
                AbstractC29665Bkb<T> abstractC29665Bkb5 = this.LJLIL;
                View view5 = abstractC29665Bkb5.LLFII;
                if (view5 == null) {
                    return;
                }
                if (view5.getX() < abstractC29665Bkb5.LJLLI[2]) {
                    View view6 = abstractC29665Bkb5.LLFII;
                    o.LJI(view6);
                    view6.setX(abstractC29665Bkb5.LJLLI[2]);
                } else {
                    View view7 = abstractC29665Bkb5.LLFII;
                    o.LJI(view7);
                    float x = view7.getX();
                    o.LJI(abstractC29665Bkb5.LLFII);
                    if (x + r0.getMeasuredWidth() > abstractC29665Bkb5.LJLLI[3]) {
                        View view8 = abstractC29665Bkb5.LLFII;
                        o.LJI(view8);
                        int i9 = abstractC29665Bkb5.LJLLI[3];
                        o.LJI(abstractC29665Bkb5.LLFII);
                        view8.setX(i9 - r0.getMeasuredWidth());
                    }
                }
                StickerCheckResponse stickerCheckResponse = C29536BiW.LIZLLL;
                if (stickerCheckResponse != null && (map = stickerCheckResponse.stickerCheckMap) != null) {
                    z = o.LJ(map.get(Long.valueOf(abstractC29665Bkb5.LJLIL.id)), Boolean.TRUE);
                } else {
                    z = false;
                }
                if ((abstractC29665Bkb5 instanceof C29656BkS) && abstractC29665Bkb5.LJLIL.type == 4 && z) {
                    measuredHeight = ((C29656BkS) abstractC29665Bkb5).getDecorationTextHeight();
                } else {
                    View view9 = abstractC29665Bkb5.LLFII;
                    o.LJI(view9);
                    measuredHeight = view9.getMeasuredHeight();
                }
                View view10 = abstractC29665Bkb5.LLFII;
                o.LJI(view10);
                if (view10.getY() < abstractC29665Bkb5.LJLLI[0]) {
                    View view11 = abstractC29665Bkb5.LLFII;
                    o.LJI(view11);
                    view11.setY(abstractC29665Bkb5.LJLLI[0]);
                    return;
                }
                View view12 = abstractC29665Bkb5.LLFII;
                o.LJI(view12);
                if (view12.getY() + measuredHeight <= abstractC29665Bkb5.LJLLI[1]) {
                    return;
                }
                View view13 = abstractC29665Bkb5.LLFII;
                o.LJI(view13);
                view13.setY(abstractC29665Bkb5.LJLLI[1] - measuredHeight);
                return;
            }
            o.LJIJI("bottomRegionV");
            throw null;
        }
        o.LJIJI("bottomRegionV");
        throw null;
    }
}
