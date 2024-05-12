package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.track.PlayPositionState;
import com.ss.ugc.android.editor.track.TrackPanelActionListener;
import com.ss.ugc.android.editor.track.TrackState;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import com.ss.ugc.android.editor.track.viewmodels.TrackPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.52i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1284452i extends AnonymousClass503 implements InterfaceC70422pa {
    public final C58D LJLIL;
    public final TrackPanelViewModel LJLILLLLZI;
    public final String LJLJI = "MultiTrackController";
    public boolean LJLJJI = true;
    public final MBA LJLJJL = C36636EZk.LIZ.plus(T2R.LJIIJJI());
    public final FrameCacheViewModel LJLJJLL = (FrameCacheViewModel) C5G0.LIZ(FrameCacheViewModel.class);
    public final EditorProContext LJLJL;
    public final C1289254e LJLJLJ;
    public boolean LJLJLLL;
    public TrackPanelActionListener LJLL;
    public InterfaceC1278550b LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public C54M LJLLLL;
    public final C55O LJLLLLLL;
    public InterfaceC65784Pro<Boolean> LJLZ;
    public final C62822Ol8 LJZ;
    public boolean LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final boolean LLD;
    public final C1284952n LLF;
    public final C1284552j LLFF;
    public final C1284852m LLFFF;
    public final C1284752l LLFII;
    public final C1284352h LLFZ;
    public final C62822Ol8 LLI;

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onHide() {
    }

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onShow() {
    }

    public final LifecycleOwner LJIILL() {
        return (LifecycleOwner) this.LL.getValue();
    }

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onDestroy() {
        C54M c54m = this.LJLLLL;
        if (c54m != null) {
            ((ArrayList) c54m.LIZJ).clear();
            FrameCacheViewModel frameCacheViewModel = this.LJLJJLL;
            frameCacheViewModel.getClass();
            C131235Db hv0 = frameCacheViewModel.hv0();
            hv0.getClass();
            XKX.LIZLLL(hv0, C78613UtF.LIZ, null, new C131175Cv(hv0, c54m, null), 2);
        }
        C131235Db hv02 = this.LJLJJLL.hv0();
        hv02.LIZJ();
        C79146V4k.LJIJ(hv02.LJLJI, null);
        C79146V4k.LJIJ(this.LJLJJL, null);
    }

    @Override // X.InterfaceC70422pa
    public final MBA getCoroutineContext() {
        return this.LJLJJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILJJIL(EnumC127354zD enumC127354zD) {
        C1279550l c1279550l = (C1279550l) this.LJLILLLLZI.LLIILZL.getValue();
        if (c1279550l == null) {
            return;
        }
        this.LJLILLLLZI.qv0(C1279550l.LIZ(c1279550l, enumC127354zD, EnumC1280050q.NORMAL, 463), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIZILJ(NLETrack track) {
        o.LJIIIZ(track, "track");
        boolean z = false;
        this.LJLILLLLZI.qv0(new C1279550l(true, track, null, -1, EnumC127354zD.NONE, null == true ? 1 : 0, z, z, z, 480), false);
    }

    public final void LJIJJ(boolean z) {
        ((C1303859u) this.LJLIL._$_findCachedViewById(R.id.kn7)).setEnableDrag$editor_trackpanel_release(z);
    }

    public final void LJIJJLI(TrackState state) {
        o.LJIIIZ(state, "state");
        this.LJLILLLLZI.rv0(state);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.52n] */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.52j] */
    /* JADX WARN: Type inference failed for: r0v19, types: [X.52m] */
    /* JADX WARN: Type inference failed for: r0v20, types: [X.52l] */
    /* JADX WARN: Type inference failed for: r0v21, types: [X.52h] */
    public C1284452i(C58D c58d, TrackPanelViewModel trackPanelViewModel) {
        this.LJLIL = c58d;
        this.LJLILLLLZI = trackPanelViewModel;
        EditorProContext.Companion.getClass();
        EditorProContext LIZ = C124994vP.LIZ();
        this.LJLJL = LIZ;
        C1297357h c1297357h = (C1297357h) c58d._$_findCachedViewById(R.id.gp3);
        o.LJIIIIZZ(c1297357h, "trackPanel.multiTrack");
        this.LJLJLJ = new C1289254e(c1297357h);
        this.LJLJLLL = true;
        this.LJLLILLLL = true;
        this.LJLLJ = true;
        this.LJLLLLLL = new C55O(LIZ, this);
        this.LJZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 801));
        C221108m2.LIZIZ(C1285352r.LJLIL);
        this.LJZL = C221108m2.LIZIZ(C1285252q.LJLIL);
        this.LL = C221108m2.LIZIZ(C1285452s.LJLIL);
        this.LLD = true;
        this.LLF = new InterfaceC1300258k() { // from class: X.52n
            @Override // X.InterfaceC1300258k
            public final void LIZIZ(C1300158j c1300158j) {
                C54M c54m = C1284452i.this.LJLLLL;
                if (c54m != null) {
                    ((ArrayList) c54m.LIZJ).add(c1300158j);
                }
            }

            @Override // X.InterfaceC1300258k
            public final Bitmap LIZ(int i, String path) {
                o.LJIIIZ(path, "path");
                return C1284452i.this.LJLJJLL.gv0(i, path);
            }
        };
        this.LLFF = new C58Q() { // from class: X.52j
            @Override // X.C58Q
            public final void LIZ() {
                C1284452i.LJIL(C1284452i.this, false, 3);
            }

            @Override // X.C58Q
            public final void LIZLLL() {
                TrackPanelViewModel trackPanelViewModel2 = C1284452i.this.LJLILLLLZI;
                trackPanelViewModel2.LJLL.setValue(Boolean.TRUE);
                trackPanelViewModel2.LJZL.setValue(trackPanelViewModel2.mv0());
                InterfaceC1278550b interfaceC1278550b = C1284452i.this.LJLLI;
                if (interfaceC1278550b != null) {
                    interfaceC1278550b.LIZLLL();
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:62:0x00cf, code lost:
            
                if (r10 < 0) goto L77;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:65:0x00d7  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x011f  */
            /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
            @Override // X.C58Q
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(long r19) {
                /*
                    Method dump skipped, instructions count: 536
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1284552j.LIZIZ(long):void");
            }

            @Override // X.C58Q
            public final void LJ(double d) {
                C1289254e c1289254e = C1284452i.this.LJLJLJ;
                c1289254e.LIZ.setScaleSize(d);
                C1297357h c1297357h2 = c1289254e.LIZ;
                if (!c1297357h2.LJLL) {
                    float LIZIZ = C1300758p.LIZIZ() * ((float) c1297357h2.LJLIL);
                    ViewGroup.LayoutParams layoutParams = c1297357h2.LJLJLJ.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.width = Math.round(LIZIZ);
                        c1297357h2.LJLJLJ.setLayoutParams(layoutParams);
                    }
                }
                FrameCacheViewModel.jv0(c1289254e.LIZJ);
                c1289254e.LIZ.requestLayout();
            }

            @Override // X.C58Q
            public final void LIZJ(int i, boolean z, boolean z2) {
                C1289254e c1289254e = C1284452i.this.LJLJLJ;
                C1297357h c1297357h2 = c1289254e.LIZ;
                c1297357h2.LJZI = i;
                Iterator it = ((ArrayList) c1297357h2.LJLILLLLZI).iterator();
                while (it.hasNext()) {
                    ((C59L) it.next()).LJIJ(i);
                }
                List<C59L> list = c1297357h2.LJLILLLLZI;
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((ArrayList) list).iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (((C59L) next).getStyle() != EnumC127354zD.NONE) {
                        arrayList.add(next);
                    }
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C59L c59l = (C59L) it3.next();
                    if (c59l.LJLJJI != EnumC127354zD.NONE) {
                        c59l.LLIIJI.LIZIZ();
                    }
                }
                if (Math.abs(i - c1289254e.LJFF) >= C1289254e.LJIIIZ || z2) {
                    c1289254e.LIZJ.hv0().LJI(z);
                    c1289254e.LJFF = i;
                }
            }
        };
        this.LLFFF = new InterfaceC86942YAg() { // from class: X.52m
            @Override // X.InterfaceC86942YAg
            public final void LIZ(View view, C86941YAf detector) {
                o.LJIIIZ(view, "view");
                o.LJIIIZ(detector, "detector");
                Iterator it = ((ArrayList) ((C1297357h) C1284452i.this.LJLIL._$_findCachedViewById(R.id.gp3)).LJLILLLLZI).iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                TrackPanelActionListener trackPanelActionListener = C1284452i.this.LJLL;
                if (trackPanelActionListener != null) {
                    trackPanelActionListener.onScaleEnd();
                }
            }

            @Override // X.InterfaceC86942YAg
            public final boolean LIZIZ(View view, C86941YAf detector) {
                boolean z;
                o.LJIIIZ(view, "view");
                o.LJIIIZ(detector, "detector");
                if (C1284452i.this.LJLIL.getScale() == 0.1d) {
                    z = true;
                } else {
                    z = false;
                }
                if ((z && detector.LIZIZ() < 1.0f) || (C1284452i.this.LJLIL.getScale() == 10.0d && detector.LIZIZ() > 1.0f)) {
                    return true;
                }
                C1284452i c1284452i = C1284452i.this;
                C58D.updateScale$default(c1284452i.LJLIL, detector.LIZIZ(), false, 2, null);
                TrackPanelActionListener trackPanelActionListener = c1284452i.LJLL;
                if (trackPanelActionListener != null) {
                    trackPanelActionListener.onScale(detector.LIZIZ());
                }
                return true;
            }

            @Override // X.InterfaceC86942YAg
            public final void LIZJ(View view, C86941YAf detector) {
                o.LJIIIZ(view, "view");
                o.LJIIIZ(detector, "detector");
                Iterator it = ((ArrayList) ((C1297357h) C1284452i.this.LJLIL._$_findCachedViewById(R.id.gp3)).LJLILLLLZI).iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                TrackPanelActionListener trackPanelActionListener = C1284452i.this.LJLL;
                if (trackPanelActionListener != null) {
                    trackPanelActionListener.onScaleBegin();
                }
            }
        };
        this.LLFII = new InterfaceC1298157p() { // from class: X.52l
            @Override // X.InterfaceC1298157p
            public final boolean LIZ() {
                return true;
            }

            @Override // X.C59H
            public final void LJJIIZI(int i) {
            }

            @Override // X.InterfaceC1298157p
            public final int LJFF() {
                return C1284452i.this.LJLIL._$_findCachedViewById(R.id.dmw).getScrollX();
            }

            @Override // X.InterfaceC1298157p
            public final NLETrackSlot LJIIIIZZ() {
                TrackPanelActionListener trackPanelActionListener = C1284452i.this.LJLL;
                if (trackPanelActionListener != null) {
                    return trackPanelActionListener.getSelectedKeyframe();
                }
                return null;
            }

            @Override // X.InterfaceC1298157p
            public final InterfaceC1289354f LJIJJ() {
                return (InterfaceC1289354f) C1284452i.this.LJZ.getValue();
            }

            @Override // X.InterfaceC1298157p
            public final void LJJJJL() {
                TrackPanelActionListener trackPanelActionListener = C1284452i.this.LJLL;
                if (trackPanelActionListener != null) {
                    trackPanelActionListener.onKeyframeSelected(null);
                }
            }

            @Override // X.InterfaceC1298157p
            public final void onClipMainToMinDuration() {
                TrackPanelActionListener trackPanelActionListener = C1284452i.this.LJLL;
                if (trackPanelActionListener != null) {
                    trackPanelActionListener.onClipMainToMinDuration();
                }
            }

            @Override // X.InterfaceC1298157p
            public final void LJJIZ(NLETrackSlot nLETrackSlot) {
                C1284452i.this.LJLIL.setDragState(true);
                TrackPanelActionListener trackPanelActionListener = C1284452i.this.LJLL;
                if (trackPanelActionListener != null) {
                    trackPanelActionListener.onMainTrackDragBegin();
                }
            }

            @Override // X.InterfaceC1298157p
            public final void LJJJ(NLETrackSlot nLETrackSlot) {
                TrackPanelActionListener trackPanelActionListener = C1284452i.this.LJLL;
                if (trackPanelActionListener != null) {
                    trackPanelActionListener.onKeyframeSelected(nLETrackSlot);
                }
            }

            @Override // X.InterfaceC1298157p
            public final void LJJJIL(long j) {
                C1284452i.this.LJLIL.updatePlayState(new PlayPositionState(j * 1000, false, false), true);
            }

            @Override // X.InterfaceC1298157p
            public final void onUnableToSetTransition(int i) {
                TrackPanelActionListener trackPanelActionListener = C1284452i.this.LJLL;
                if (trackPanelActionListener != null) {
                    trackPanelActionListener.onUnableToSetTransition(i);
                }
            }

            @Override // X.InterfaceC1298157p
            public final void LJIIL(NLETrackSlot nLETrackSlot, int i) {
                C1284452i.this.LJIILLIIL(nLETrackSlot, Integer.valueOf(i), true);
            }

            @Override // X.C59H
            public final void LJJJJJ(int i, boolean z) {
                ((C1303959v) C1284452i.this.LJLIL._$_findCachedViewById(R.id.jca)).LJJJJJ(i, true);
            }

            @Override // X.InterfaceC1298157p
            public final void onTransitionClick(NLETrackSlot slot, NLETrackSlot nextSlot) {
                o.LJIIIZ(slot, "slot");
                o.LJIIIZ(nextSlot, "nextSlot");
                TrackPanelActionListener trackPanelActionListener = C1284452i.this.LJLL;
                if (trackPanelActionListener != null) {
                    trackPanelActionListener.onTransitionClick(slot, nextSlot);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC1298157p
            public final void LJJJLZIJ(NLETrackSlot slot, int i, int i2) {
                List<? extends NLETrackSlot> list;
                TrackPanelActionListener trackPanelActionListener;
                o.LJIIIZ(slot, "slot");
                C1284452i.this.LJLIL.setDragState(false);
                if (i != i2 && (trackPanelActionListener = C1284452i.this.LJLL) != null) {
                    trackPanelActionListener.onMainTrackMoveSlot(slot, i, i2);
                }
                C1284452i c1284452i = C1284452i.this;
                C1289254e c1289254e = c1284452i.LJLJLJ;
                NLETrack nLETrack = (NLETrack) c1284452i.LJLILLLLZI.LLIIIZ.getValue();
                if (nLETrack == null || (list = nLETrack.LJIILLIIL()) == null) {
                    list = C61878OQg.INSTANCE;
                }
                c1289254e.LIZJ(list);
                TrackPanelActionListener trackPanelActionListener2 = C1284452i.this.LJLL;
                if (trackPanelActionListener2 != null) {
                    trackPanelActionListener2.onMainTrackDragEnd(i, i2);
                }
            }

            @Override // X.InterfaceC1298157p
            public final void onStartAndDuration(NLETrackSlot slot, long j, long j2, int i) {
                o.LJIIIZ(slot, "slot");
                TrackPanelActionListener trackPanelActionListener = C1284452i.this.LJLL;
                if (trackPanelActionListener != null) {
                    trackPanelActionListener.onStartAndDuration(slot, j, j2, i);
                }
            }

            @Override // X.C59H
            public final void LIZLLL(boolean z, boolean z2, int i, int i2, boolean z3) {
                ((C1303959v) C1284452i.this.LJLIL._$_findCachedViewById(R.id.jca)).LIZLLL(z, z2, i, i2, z3);
            }
        };
        this.LLFZ = new C59B() { // from class: X.52h
            @Override // X.C59B
            public final void onClip(long j, long j2) {
                TrackPanelActionListener trackPanelActionListener = C1284452i.this.LJLL;
                if (trackPanelActionListener != null) {
                    trackPanelActionListener.onClip(j, j2);
                }
            }

            @Override // X.C59B
            public final void LIZIZ(C5AE state, NLETrackSlot nLETrackSlot, int i) {
                o.LJIIIZ(state, "state");
                TrackPanelActionListener trackPanelActionListener = C1284452i.this.LJLL;
                if (trackPanelActionListener != null) {
                    trackPanelActionListener.mobSubTrackClipEvent(state, nLETrackSlot, i);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C59B
            public final void LIZ(long j, NLETrackSlot nLETrackSlot, long j2, long j3) {
                NLETrack nLETrack;
                NLEModel nLEModel = (NLEModel) C1284452i.this.LJLILLLLZI.LLIIJI.getValue();
                EnumC123864ta enumC123864ta = null;
                if (nLEModel != null) {
                    nLETrack = nLEModel.getTrackBySlot(nLETrackSlot);
                    if (nLETrack != null) {
                        enumC123864ta = C79057V0z.LJJIJIL(nLETrack);
                    }
                } else {
                    nLETrack = null;
                }
                if (enumC123864ta == EnumC123864ta.AUDIO && o.LJ(nLETrack.getExtra("AudioTrackType"), "BGM") && (j2 != 0 || j3 != nLETrackSlot.getDuration() / 1000)) {
                    nLETrack.setExtra("AudioTrackType", "EDITOR_MUSIC");
                }
                TrackPanelActionListener trackPanelActionListener = C1284452i.this.LJLL;
                if (trackPanelActionListener != null) {
                    long j4 = 1000;
                    trackPanelActionListener.onClipEnd(nLETrackSlot, j * j4, j3 * j4);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.C59B
            public final void LIZJ(NLETrackSlot nLETrackSlot, EnumC127354zD style, boolean z, boolean z2) {
                o.LJIIIZ(style, "style");
                if (nLETrackSlot == null) {
                    C1279550l c1279550l = (C1279550l) C1284452i.this.LJLILLLLZI.LLIILZL.getValue();
                    if (c1279550l != null && c1279550l.LIZJ != null) {
                        C1284452i.LJIL(C1284452i.this, z2, 1);
                        return;
                    }
                    return;
                }
                if (z) {
                    C1284452i.this.LJIILLIIL(nLETrackSlot, null, false);
                } else {
                    C1284452i.LJIJ(C1284452i.this, nLETrackSlot, style, false, 28);
                }
            }
        };
        this.LLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 802));
    }

    public final void LJIJI(boolean z, boolean z2) {
        this.LJLJJI = z;
        this.LJLIL.setActive(z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIL(C1284452i c1284452i, boolean z, int i) {
        NLETrack nLETrack = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        boolean z2 = false;
        if ((i & 2) != 0) {
            z = false;
        }
        c1284452i.LJLILLLLZI.qv0(new C1279550l(true, nLETrack, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0, z2, z2, z, 252), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIILLIIL(NLETrackSlot nLETrackSlot, Integer num, boolean z) {
        NLETrack nLETrack;
        int LJIIL;
        String str;
        NLEModel nLEModel = (NLEModel) this.LJLILLLLZI.LLIIJI.getValue();
        NLETrack nLETrack2 = null;
        if (nLEModel != null) {
            nLETrack = nLEModel.getTrackBySlot(nLETrackSlot);
        } else {
            nLETrack = null;
        }
        boolean z2 = false;
        if (C124574uj.LJJJLIIL(nLETrack)) {
            if (nLEModel != null) {
                LJIIL = C124574uj.LJJIII(nLEModel);
            }
            LJIIL = 0;
        } else {
            if (C124574uj.LJJJIL(nLETrack) && nLEModel != null) {
                LJIIL = C124574uj.LJIIL(nLEModel);
            }
            LJIIL = 0;
        }
        if (((Boolean) this.LJZL.getValue()).booleanValue() && !z && this.LJLILLLLZI.ov0() && LJIIL > 1) {
            InterfaceC1278550b interfaceC1278550b = this.LJLLI;
            if (interfaceC1278550b != null) {
                interfaceC1278550b.LIZJ(nLETrackSlot);
                return;
            }
            return;
        }
        C1279550l c1279550l = (C1279550l) this.LJLILLLLZI.LLIILZL.getValue();
        EnumC127354zD enumC127354zD = EnumC127354zD.CLIP;
        if (c1279550l != null) {
            String name = nLETrackSlot.getName();
            NLETrackSlot nLETrackSlot2 = c1279550l.LIZJ;
            if (nLETrackSlot2 != null) {
                str = nLETrackSlot2.getName();
            } else {
                str = null;
            }
            if (o.LJ(name, str) && c1279550l.LJ == enumC127354zD) {
                enumC127354zD = EnumC127354zD.LINE;
            }
        }
        if (z) {
            this.LJLILLLLZI.qv0(new C1279550l(true, (NLETrack) this.LJLILLLLZI.LLIIIZ.getValue(), nLETrackSlot, num, enumC127354zD, EnumC1280050q.USER_CLICK, z2, z2, z2, 448), false);
        } else {
            NLEModel nLEModel2 = (NLEModel) this.LJLILLLLZI.LLIIJI.getValue();
            if (nLEModel2 != null) {
                nLETrack2 = C124574uj.LJJIIJZLJL(nLEModel2, nLETrackSlot.getUUID());
            }
            this.LJLILLLLZI.qv0(new C1279550l(z2, nLETrack2, nLETrackSlot, null, enumC127354zD, EnumC1280050q.USER_CLICK, z2, z2, z2, 456), false);
        }
    }

    public static void LJIJ(C1284452i c1284452i, NLETrackSlot nleSlot, EnumC127354zD enumC127354zD, boolean z, int i) {
        boolean z2;
        NLETrack trackBySlot;
        boolean z3;
        TrackState trackState;
        C1280250s value;
        EnumC127354zD style = enumC127354zD;
        boolean z4 = z;
        if ((i & 2) != 0) {
            style = EnumC127354zD.CLIP;
        }
        EnumC1280050q selectType = null;
        if ((i & 4) != 0) {
            selectType = EnumC1280050q.NORMAL;
        }
        boolean z5 = false;
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z4 = false;
        }
        c1284452i.getClass();
        o.LJIIIZ(nleSlot, "nleSlot");
        o.LJIIIZ(style, "style");
        o.LJIIIZ(selectType, "selectType");
        NLEModel nLEModel = c1284452i.LJLILLLLZI.LJLILLLLZI;
        if (nLEModel == null || (trackBySlot = nLEModel.getTrackBySlot(nleSlot)) == null) {
            return;
        }
        if (!trackBySlot.LJIIJ()) {
            c1284452i.LJLILLLLZI.getClass();
            EnumC123864ta LJJIJIL = C79057V0z.LJJIJIL(trackBySlot);
            if (LJJIJIL == EnumC123864ta.AUDIO) {
                trackState = TrackState.AUDIO;
            } else if (LJJIJIL == EnumC123864ta.VIDEO && !trackBySlot.LJIIJ()) {
                trackState = TrackState.PIP;
            } else if (LJJIJIL == EnumC123864ta.STICKER && trackBySlot.LJIIL() == EnumC123874tb.TEXT_STICKER) {
                trackState = TrackState.TEXT;
            } else if (LJJIJIL == EnumC123864ta.EFFECT) {
                trackState = TrackState.VIDEOEFFECT;
            }
            if (trackState != null && ((value = c1284452i.LJLILLLLZI.LLILL.getValue()) == null || trackState != value.LJLIL)) {
                c1284452i.LJIJJLI(trackState);
            }
        }
        if (trackBySlot.LJIIJ() && !C124574uj.LJJJI(nleSlot)) {
            z3 = true;
        } else {
            z3 = false;
        }
        c1284452i.LJLILLLLZI.qv0(new C1279550l(z3, trackBySlot, nleSlot, Integer.valueOf(trackBySlot.LJIILJJIL(nleSlot)), style, selectType, z2, z4, z5, 256), false);
    }
}
