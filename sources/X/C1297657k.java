package X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.57k, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1297657k implements C59O {
    public final /* synthetic */ C1297757l LIZ;

    @Override // X.C59O
    public final void LJII() {
    }

    @Override // X.C59O
    public final void onClipMainToMinDuration() {
    }

    @Override // X.C59O
    public final void onUnableToSetTransition(int i) {
    }

    @Override // X.C59O
    public final void LIZIZ() {
        InterfaceC1299057y interfaceC1299057y;
        C1297757l c1297757l = this.LIZ;
        if (c1297757l.LJLLJ && (interfaceC1299057y = c1297757l.LJZI) != null) {
            interfaceC1299057y.LIZIZ();
        }
    }

    @Override // X.C59O
    public final Bitmap LIZLLL() {
        Bitmap thumbnailMaskBitmap = this.LIZ.getThumbnailMaskBitmap();
        o.LJIIIIZZ(thumbnailMaskBitmap, "thumbnailMaskBitmap");
        return thumbnailMaskBitmap;
    }

    public C1297657k(C1297757l c1297757l) {
        this.LIZ = c1297757l;
    }

    @Override // X.C59O
    public final boolean LIZJ(int i) {
        int i2;
        boolean z;
        long j;
        int i3;
        C1297757l c1297757l = this.LIZ;
        if (!c1297757l.LJLLJ || i == 0 || ((ArrayList) c1297757l.LJLJI).isEmpty()) {
            return false;
        }
        int i4 = i - 1;
        if (i4 >= 0) {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) ListProtector.get(this.LIZ.LJLJI, i4);
            if (nLETrackSlot.LIZLLL() != null) {
                NLESegmentTransition LIZLLL = nLETrackSlot.LIZLLL();
                o.LJI(LIZLLL);
                if (!TextUtils.isEmpty(LIZLLL.LIZLLL().LIZJ())) {
                    return true;
                }
            }
        }
        int i5 = i - 2;
        if (i5 >= 0) {
            NLETrackSlot nLETrackSlot2 = (NLETrackSlot) ListProtector.get(this.LIZ.LJLJI, i5);
            if (nLETrackSlot2.LIZLLL() != null) {
                NLESegmentTransition LIZLLL2 = nLETrackSlot2.LIZLLL();
                o.LJI(LIZLLL2);
                if (!TextUtils.isEmpty(LIZLLL2.LIZLLL().LIZJ())) {
                    z = true;
                    NLESegmentTransition LIZLLL3 = nLETrackSlot2.LIZLLL();
                    if (LIZLLL3 != null) {
                        i3 = (int) LIZLLL3.LJFF();
                    } else {
                        i3 = 0;
                    }
                    i2 = i3 / 1000;
                }
            }
            z = false;
            i2 = 0;
        } else {
            i2 = 0;
            z = false;
        }
        if (z) {
            j = i2 + 200;
        } else {
            j = 200;
        }
        long j2 = 1000;
        if (((NLETimeSpaceNode) ListProtector.get(this.LIZ.LJLJI, i)).getDuration() / j2 < 200 || ((NLETimeSpaceNode) ListProtector.get(this.LIZ.LJLJI, i4)).getDuration() / j2 < j) {
            return false;
        }
        return true;
    }

    @Override // X.C59O
    public final void LJFF(int i) {
        C1297757l c1297757l;
        InterfaceC1299057y interfaceC1299057y;
        C1297757l c1297757l2 = this.LIZ;
        if (c1297757l2.LJLLJ && c1297757l2.LIZJ(i) && (interfaceC1299057y = (c1297757l = this.LIZ).LJZI) != null) {
            interfaceC1299057y.LIZJ((NLETrackSlot) ListProtector.get(c1297757l.LJLJI, i), i);
        }
    }

    @Override // X.C59O
    public final void LJIIJ(int i) {
        int i2;
        C1297757l c1297757l = this.LIZ;
        if (!c1297757l.LJLLJ || (i2 = c1297757l.LJLJLLL) == i) {
            return;
        }
        if (c1297757l.LIZJ(i2)) {
            C1297757l c1297757l2 = this.LIZ;
            C59L c59l = (C59L) ListProtector.get(c1297757l2.LJLIL, c1297757l2.LJLJLLL);
            ImageView imageView = c59l.LLIIJLIL;
            if (imageView != null) {
                imageView.setSelected(false);
            }
            c59l.LJIILJJIL(false);
        }
        C1297757l c1297757l3 = this.LIZ;
        c1297757l3.LJLJLLL = i;
        InterfaceC1298157p interfaceC1298157p = c1297757l3.LJLJJI;
        if (interfaceC1298157p != null) {
            interfaceC1298157p.onTransitionClick((NLETrackSlot) ListProtector.get(c1297757l3.LJLJI, i - 1), (NLETrackSlot) ListProtector.get(this.LIZ.LJLJI, i));
        }
    }

    @Override // X.C59O
    public final void onItemClick(int i) {
        InterfaceC1298157p interfaceC1298157p;
        C1297757l c1297757l = this.LIZ;
        if (!c1297757l.LJLLJ || !c1297757l.LIZJ(i)) {
            return;
        }
        if (i == this.LIZ.getSelectIndex()) {
            C1297757l c1297757l2 = this.LIZ;
            if (c1297757l2.LJLLI != EnumC127354zD.CLIP) {
                C1297757l.LJ(c1297757l2, i);
                return;
            } else {
                c1297757l2.setLineType(i);
                return;
            }
        }
        C1297757l c1297757l3 = this.LIZ;
        c1297757l3.setNormalType(Integer.valueOf(c1297757l3.getSelectIndex()));
        C1297757l.LJ(this.LIZ, i);
        C1297757l c1297757l4 = this.LIZ;
        c1297757l4.LJLL = i;
        NLETrackSlot nLETrackSlot = (NLETrackSlot) ORZ.LJLLLLLL(i, c1297757l4.LJLJI);
        if (nLETrackSlot != null && (interfaceC1298157p = this.LIZ.LJLJJI) != null) {
            interfaceC1298157p.LJIIL(nLETrackSlot, i);
        }
    }

    @Override // X.C59O
    public final Bitmap LIZ(int i, String path) {
        o.LJIIIZ(path, "path");
        InterfaceC1298857w interfaceC1298857w = this.LIZ.LJZL;
        if (interfaceC1298857w != null) {
            return interfaceC1298857w.LIZ(i, path);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    @Override // X.C59O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float LJI(int r11, long r12, X.C5AE r14) {
        /*
            r10 = this;
            java.lang.String r0 = "clipOrientation"
            kotlin.jvm.internal.o.LJIIIZ(r14, r0)
            X.57l r0 = r10.LIZ
            java.util.List<com.bytedance.ies.nle.editor_jni.NLETrackSlot> r0 = r0.LJLJI
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r11)
            com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode r0 = (com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode) r0
            long r3 = r0.getStartTime()
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r3 = r3 / r0
            long r3 = r3 + r12
            X.57l r0 = r10.LIZ
            X.57w r0 = r0.LJZL
            if (r0 == 0) goto L24
            java.util.List r7 = r0.LIZIZ()
            if (r7 != 0) goto L26
        L24:
            X.OQg r7 = X.C61878OQg.INSTANCE
        L26:
            r0 = 1097859072(0x41700000, float:15.0)
            int r0 = X.C134845Qy.LIZ(r0)
            float r6 = (float) r0
            float r0 = X.C1300758p.LIZIZ()
            float r6 = r6 / r0
            X.5AE r0 = X.C5AE.START
            if (r14 != r0) goto L75
            int r0 = r7.size()
            r8 = -1
            int r5 = r0 + (-1)
        L3d:
            if (r8 >= r5) goto La5
            float r9 = (float) r3
            float r9 = r9 - r6
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r5)
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            float r0 = (float) r1
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 > 0) goto L72
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r5)
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L72
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r5)
            java.lang.Long r0 = (java.lang.Long) r0
        L64:
            if (r0 == 0) goto La5
            long r5 = r0.longValue()
            long r5 = r5 - r3
            float r1 = (float) r5
            float r0 = X.C1300758p.LIZIZ()
            float r0 = r0 * r1
        L71:
            return r0
        L72:
            int r5 = r5 + (-1)
            goto L3d
        L75:
            int r8 = r7.size()
            r5 = 0
        L7a:
            if (r5 >= r8) goto La5
            float r9 = (float) r3
            float r9 = r9 + r6
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r5)
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            float r0 = (float) r1
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 < 0) goto La2
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r5)
            java.lang.Number r0 = (java.lang.Number) r0
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto La2
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r7, r5)
            java.lang.Long r0 = (java.lang.Long) r0
            goto L64
        La2:
            int r5 = r5 + 1
            goto L7a
        La5:
            r0 = 0
            goto L71
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1297657k.LJI(int, long, X.5AE):float");
    }

    @Override // X.C59O
    public final void LJ(float f, int i, int i2, int i3) {
        if (!this.LIZ.LJLLJ || i3 != 0) {
            return;
        }
        for (int i4 = 0; i4 < i; i4++) {
            View view = (View) ListProtector.get(this.LIZ.LJLIL, i4);
            view.setTranslationX(view.getTranslationX() + i2);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("this is index is ");
            LIZ.append(i4);
            LIZ.append(" move is ");
            LIZ.append(f);
            C131935Ft.LJ("MultiCustomTrackLayout", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.C59O
    public final void LJIIIIZZ(float f, int i, int i2, int i3) {
        NLESegmentVideo videoSeg = NLESegmentVideo.LJJ(((NLETrackSlot) ListProtector.get(this.LIZ.LJLJI, i)).LJI());
        float abs = Math.abs(i2) / C1300758p.LIZIZ();
        o.LJIIIIZZ(videoSeg, "videoSeg");
        long LIZ = C124574uj.LIZ(videoSeg) * abs;
        long LJJIJ = O6R.LJJIJ(C124574uj.LIZ(videoSeg) * (f / C1300758p.LIZIZ()));
        if (LIZ + LJJIJ > ((NLETrackSlot) ListProtector.get(this.LIZ.LJLJI, i)).LJI().LIZIZ().getDuration() / 1000) {
            LJJIJ = (((int) ((NLETrackSlot) ListProtector.get(this.LIZ.LJLJI, i)).LJI().LIZIZ().getDuration()) / 1000) - LIZ;
        }
        C1297757l c1297757l = this.LIZ;
        InterfaceC1298157p interfaceC1298157p = c1297757l.LJLJJI;
        if (interfaceC1298157p != null) {
            interfaceC1298157p.onStartAndDuration((NLETrackSlot) ListProtector.get(c1297757l.LJLJI, i), LIZ, LJJIJ, i3);
        }
        StringBuilder LIZJ = V10.LIZJ("start is ", LIZ, " duration is ");
        LIZJ.append(LJJIJ);
        C131935Ft.LIZIZ("MultiCustomTrackLayout", X1D.LIZIZ(LIZJ));
    }

    @Override // X.C59O
    public final void LJIIIZ(float f, int i, int i2, long j, long j2) {
        InterfaceC1299057y interfaceC1299057y;
        C1297757l c1297757l = this.LIZ;
        if (c1297757l.LJLLJ && c1297757l.LIZJ(i2) && (!((ArrayList) this.LIZ.LJLJI).isEmpty())) {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) ListProtector.get(this.LIZ.LJLJI, i2);
            if (i != 0) {
                if (i == 1 && (interfaceC1299057y = this.LIZ.LJZI) != null) {
                    interfaceC1299057y.LIZLLL(nLETrackSlot, i, j, j2, i2, f);
                }
            } else {
                InterfaceC1299057y interfaceC1299057y2 = this.LIZ.LJZI;
                if (interfaceC1299057y2 != null) {
                    interfaceC1299057y2.LIZLLL(nLETrackSlot, i, j, j2, i2, -f);
                }
            }
            List<C59L> list = this.LIZ.LJLIL;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((C59L) next).getIndex() != i2) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C59L c59l = (C59L) it2.next();
                if (i == 0) {
                    if (c59l.getIndex() < i2) {
                        c59l.LJIIZILJ();
                    }
                } else if (i == 1 && c59l.getIndex() > i2) {
                    c59l.LJIIZILJ();
                }
            }
        }
    }
}
