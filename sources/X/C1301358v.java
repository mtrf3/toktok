package X;

import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.58v, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1301358v extends AbstractC1301158t {
    public final C29S LJIIJ;
    public final String LJIIJJI;
    public final FrameCacheViewModel LJIIL;
    public final C59D LJIILIIL;
    public C5A5 LJIILJJIL;
    public final AnonymousClass590 LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;

    @Override // X.AbstractC1301158t, X.InterfaceC1304259y
    public final int LJIIJ() {
        return 6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0074, code lost:
    
        if (r0.intValue() != 1) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    @Override // X.AbstractC1301158t, X.InterfaceC1304259y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScrollChanged() {
        /*
            r5 = this;
            boolean r0 = r5.LJFF
            if (r0 == 0) goto L5
            return
        L5:
            int r0 = X.AnonymousClass594.LJLJL
            float r4 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 / r1
            int r0 = X.AnonymousClass594.LJLJJLL
            float r3 = (float) r0
            float r3 = r3 / r1
            boolean r0 = X.AnonymousClass504.LIZJ
            if (r0 == 0) goto L77
            com.ss.ugc.android.editor.core.utils.LiveDataBus r2 = com.ss.ugc.android.editor.core.utils.LiveDataBus.getInstance()
            java.lang.String r1 = "key_mainViewModel"
            java.lang.Class r0 = java.lang.Integer.TYPE
            androidx.lifecycle.MutableLiveData r0 = r2.with(r1, r0)
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r2 = 1
            if (r0 != 0) goto L70
        L28:
            int r1 = r5.LJIILLIIL
            X.59u r0 = r5.LIZ
            int r0 = r0.getScrollX()
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            float r0 = (float) r0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L4c
            X.59u r0 = r5.LIZ
            int r0 = r0.getScrollX()
            r5.LJIILLIIL = r0
            com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel r0 = r5.LJIIL
            X.5Db r0 = r0.hv0()
            r0.LJI(r2)
        L4b:
            return
        L4c:
            int r1 = r5.LJIIZILJ
            X.59u r0 = r5.LIZ
            int r0 = r0.getScrollY()
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            float r0 = (float) r0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L4b
            X.59u r0 = r5.LIZ
            int r0 = r0.getScrollY()
            r5.LJIIZILJ = r0
            com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel r0 = r5.LJIIL
            X.5Db r0 = r0.hv0()
            r0.LJI(r2)
            goto L4b
        L70:
            int r0 = r0.intValue()
            if (r0 == r2) goto L77
            goto L28
        L77:
            r2 = 0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1301358v.onScrollChanged():void");
    }

    @Override // X.AbstractC1301158t, X.InterfaceC1304259y
    public final long LJI() {
        return C59L.LLJILJILJ;
    }

    @Override // X.AbstractC1301158t, X.InterfaceC1304259y
    public final int getItemHeight() {
        return AnonymousClass594.LJLJJLL;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.592] */
    @Override // X.InterfaceC1304259y
    public final C5A5 LIZJ(int i, C1303859u parent) {
        o.LJIIIZ(parent, "parent");
        return new AnonymousClass594(this.LJIIJ, new AnonymousClass597() { // from class: X.592
            @Override // X.AnonymousClass597
            public final void LIZIZ() {
                FrameCacheViewModel.jv0(C1301358v.this.LJIIL);
            }

            @Override // X.AnonymousClass597
            public final Bitmap LIZ(int i2, String path) {
                o.LJIIIZ(path, "path");
                return C1301358v.this.LJIIL.gv0(i2, path);
            }
        });
    }

    @Override // X.AbstractC1301158t, X.InterfaceC1304259y
    public final void LJFF(OSZ<? extends NLETrackSlot, C1301058s> osz, boolean z) {
        C5B4 c5b4;
        C5A6 c5a6;
        C5B4 c5b42;
        C5A6 c5a62;
        C1301058s second;
        super.LJFF(osz, z);
        if (!z) {
            LJIILL(osz);
        }
        C5A5 c5a5 = null;
        if (osz != null && (second = osz.getSecond()) != null) {
            c5a5 = second.LJLILLLLZI;
        }
        if (!o.LJ(this.LJIILJJIL, c5a5)) {
            C5A5 c5a52 = this.LJIILJJIL;
            if ((c5a52 instanceof AnonymousClass594) && (c5b42 = (C5B4) c5a52) != null && (c5a62 = (C5A6) c5b42.LIZ()) != null) {
                c5a62.LJIIJ(AnonymousClass590.NONE);
            }
            if ((c5a5 instanceof AnonymousClass594) && (c5b4 = (C5B4) c5a5) != null && (c5a6 = (C5A6) c5b4.LIZ()) != null) {
                c5a6.LJIIJ(this.LJIILL);
            }
        }
        this.LJIILJJIL = c5a5;
    }

    @Override // X.InterfaceC1304259y
    public final void LIZ(long j, NLETrackSlot nLETrackSlot, long j2, long j3) {
        String str = this.LJIIJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onClip  ");
        LIZ.append(nLETrackSlot);
        LIZ.append(' ');
        LIZ.append(j);
        LIZ.append(' ');
        LIZ.append(j2);
        LIZ.append(' ');
        LIZ.append(j3);
        C131935Ft.LIZIZ(str, X1D.LIZIZ(LIZ));
        C59B trackGroupActionListener = this.LIZ.getTrackGroupActionListener();
        if (trackGroupActionListener != null) {
            trackGroupActionListener.LIZ(j, nLETrackSlot, j2, j3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1301358v(C29S activity, C1303859u c1303859u, C1303959v c1303959v, C1299358b c1299358b, C58R c58r) {
        super(c1303859u, c1303959v, c1299358b, c58r);
        o.LJIIIZ(activity, "activity");
        this.LJIIJ = activity;
        this.LJIIJJI = "MuxerTrackAdapter";
        FrameCacheViewModel frameCacheViewModel = (FrameCacheViewModel) C5G0.LIZ(FrameCacheViewModel.class);
        this.LJIIL = frameCacheViewModel;
        C59D c59d = new C59D(c1303859u, AnonymousClass594.LJLJJLL, AbstractC1301158t.LJIIIZ);
        frameCacheViewModel.hv0().LIZIZ(c59d);
        this.LJIILIIL = c59d;
        this.LJIILL = AnonymousClass590.NONE;
    }

    @Override // X.InterfaceC1304259y
    public final void onMove(int i, int i2, NLETrackSlot nLETrackSlot, long j, long j2, long j3, boolean z) {
        C131935Ft.LIZIZ(this.LJIIJJI, "onMove ");
    }
}
