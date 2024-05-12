package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.58H, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C58H extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C58D LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58H(C58D c58d, float f, boolean z) {
        super(0);
        this.LJLIL = c58d;
        this.LJLILLLLZI = f;
        this.LJLJI = z;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        float f = C1291054w.LJ().LJJJJI;
        float f2 = C1291054w.LJ().LJJJJIZL;
        C58D c58d = this.LJLIL;
        c58d.scale = c58d.getScale() * this.LJLILLLLZI;
        if (this.LJLJI) {
            double d = f;
            if (this.LJLIL.getScale() <= d) {
                this.LJLIL.scale = d;
            }
            double d2 = f2;
            if (this.LJLIL.getScale() >= d2) {
                this.LJLIL.scale = d2;
            }
        }
        C1300758p.LIZ = (int) (1000 / this.LJLIL.getScale());
        C58Q innerListener = this.LJLIL.getInnerListener();
        if (innerListener != null) {
            innerListener.LJ(this.LJLIL.getScale());
        }
        C58E c58e = this.LJLIL.dropTrack;
        if (c58e != null) {
            c58e.requestLayout();
            c58e.LJLILLLLZI.invalidate();
        }
        this.LJLIL.updateLineTrackScale();
        this.LJLIL._$_findCachedViewById(R.id.l7n).requestLayout();
        C58D c58d2 = this.LJLIL;
        c58d2.tryRefreshLimitBg(((C1300858q) c58d2._$_findCachedViewById(R.id.l7n)).getDurationTime());
        ((C1303959v) this.LJLIL._$_findCachedViewById(R.id.jca)).setTimelineScale(C1300758p.LIZIZ());
        C58D c58d3 = this.LJLIL;
        long j = c58d3.timestamp;
        if (c58d3.isRTL()) {
            float f3 = (float) j;
            if (this.LJLIL._$_findCachedViewById(R.id.jca).getScrollX() != (-((int) (C1300758p.LIZIZ() * f3)))) {
                ((C1303959v) this.LJLIL._$_findCachedViewById(R.id.jca)).LJJLL(-((int) (C1300758p.LIZIZ() * f3)));
            }
        } else {
            float f4 = (float) j;
            if (this.LJLIL._$_findCachedViewById(R.id.jca).getScrollX() != ((int) (C1300758p.LIZIZ() * f4))) {
                ((C1303959v) this.LJLIL._$_findCachedViewById(R.id.jca)).LJJLL((int) (C1300758p.LIZIZ() * f4));
            }
        }
        C58Q innerListener2 = this.LJLIL.getInnerListener();
        if (innerListener2 != null) {
            C58Y.LIZ(innerListener2, this.LJLIL._$_findCachedViewById(R.id.dmw).getScrollX(), false, true, 2);
        }
        return C76800UCe.LIZ;
    }
}
