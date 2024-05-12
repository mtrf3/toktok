package X;

import Y.AObserverS70S0100000_2;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import com.ss.ugc.android.editor.track.viewmodels.MainTrackViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.54e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1289254e {
    public static final int LJIIIZ = C1300758p.LIZJ * 5;
    public final C1297357h LIZ;
    public final MainTrackViewModel LIZIZ;
    public final FrameCacheViewModel LIZJ;
    public final C62822Ol8 LIZLLL;
    public final C54Z LJ;
    public int LJFF;
    public long LJI;
    public final C58G LJII;
    public List<Long> LJIIIIZZ;

    public final EditorProContext LIZIZ() {
        return (EditorProContext) this.LIZLLL.getValue();
    }

    public C1289254e(C1297357h c1297357h) {
        this.LIZ = c1297357h;
        MainTrackViewModel mainTrackViewModel = (MainTrackViewModel) C5G0.LIZ(MainTrackViewModel.class);
        this.LIZIZ = mainTrackViewModel;
        FrameCacheViewModel frameCacheViewModel = (FrameCacheViewModel) C5G0.LIZ(FrameCacheViewModel.class);
        this.LIZJ = frameCacheViewModel;
        this.LIZLLL = C221108m2.LIZIZ(C1285652u.LJLIL);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(C1285752v.LJLIL);
        C54Z c54z = new C54Z(c1297357h);
        this.LJ = c54z;
        this.LJII = C1291054w.LJ();
        this.LJIIIIZZ = C61878OQg.INSTANCE;
        InterfaceC1299057y interfaceC1299057y = new InterfaceC1299057y() { // from class: X.54c
            @Override // X.InterfaceC1299057y
            public final void LIZIZ() {
                C1289254e c1289254e = C1289254e.this;
                C54Z c54z2 = c1289254e.LJ;
                c54z2.LJI = -1;
                c54z2.LJ = 0.0f;
                c54z2.LJFF = -1;
                FrameCacheViewModel.jv0(c1289254e.LIZJ);
                if (C1289254e.this.LIZIZ().getHasInitialized() && C1289254e.this.LIZIZ().getPlayer().isPrepared()) {
                    C1289254e.this.LIZIZ().getNleSession().P8().LJJIII();
                }
                C79057V0z.LJJJJL(C1289254e.this.LIZIZ(), "is_clip_main_track", Boolean.FALSE);
            }

            @Override // X.InterfaceC1299057y
            public final void LIZJ(NLETrackSlot segment, int i) {
                NLETrack nLETrack;
                NLETrackSlot nLETrackSlot;
                long j;
                o.LJIIIZ(segment, "segment");
                C1289254e c1289254e = C1289254e.this;
                c1289254e.LJ.LJI = i;
                FrameCacheViewModel.jv0(c1289254e.LIZJ);
                if (C1289254e.this.LIZIZ().getHasInitialized() && C1289254e.this.LIZIZ().getPlayer().isPrepared()) {
                    C1289254e.this.LIZIZ().getNleSession().P8().LJIILLIIL(segment.getUUID());
                }
                C79057V0z.LJJJJL(C1289254e.this.LIZIZ(), "is_clip_main_track", Boolean.TRUE);
                VecNLETrackSPtr tracks = C79057V0z.LJJI(C1289254e.this.LIZIZ()).getTracks();
                if (tracks != null) {
                    Iterator<NLETrack> it = tracks.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            nLETrack = it.next();
                            NLETrack nLETrack2 = nLETrack;
                            if (C124574uj.LJJIL(nLETrack2) || C124574uj.LJJJ(nLETrack2)) {
                                break;
                            }
                        } else {
                            nLETrack = null;
                            break;
                        }
                    }
                    NLETrack nLETrack3 = nLETrack;
                    if (nLETrack3 != null && (nLETrackSlot = (NLETrackSlot) ORZ.LJLLLL(nLETrack3.LJIILLIIL())) != null && nLETrackSlot.hasExtra("audio_stick_points")) {
                        String extra = nLETrackSlot.getExtra("audio_stick_points");
                        o.LJIIIIZZ(extra, "musicSlot.getExtra(ExtraKeys.AUDIO_STICK_POINTS)");
                        List LIZ = C67502ks.LIZ(extra);
                        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
                        long j2 = 0;
                        if (LIZLLL != null) {
                            j = LIZLLL.LJIILIIL();
                        } else {
                            j = 0;
                        }
                        int LJJIZ = C78926UyI.LJJIZ(j);
                        NLESegmentAudio LIZLLL2 = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
                        if (LIZLLL2 != null) {
                            j2 = LIZLLL2.LJIIL();
                        }
                        int LJJIZ2 = C78926UyI.LJJIZ(j2);
                        int LJJIZ3 = C78926UyI.LJJIZ(nLETrackSlot.getStartTime());
                        NLESegment LJI = nLETrackSlot.LJI();
                        o.LJIIIIZZ(LJI, "musicSlot.mainSegment");
                        float LJJI = C124574uj.LJJI(LJI);
                        C1289254e c1289254e2 = C1289254e.this;
                        ArrayList arrayList = new ArrayList();
                        Iterator it2 = ((ArrayList) LIZ).iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            int intValue = ((Number) next).intValue();
                            if (LJJIZ <= intValue && intValue <= LJJIZ2) {
                                arrayList.add(next);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                        Iterator it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(Long.valueOf(((((Number) it3.next()).intValue() - LJJIZ) / LJJI) + LJJIZ3));
                        }
                        c1289254e2.LJIIIIZZ = arrayList2;
                    }
                }
            }

            @Override // X.InterfaceC1299057y
            public final void LIZLLL(NLETrackSlot slot, int i, long j, long j2, int i2, float f) {
                long LJIILIIL;
                o.LJIIIZ(slot, "slot");
                C54Z c54z2 = C1289254e.this.LJ;
                c54z2.LJI = i2;
                c54z2.LJ = f;
                c54z2.LJFF = i;
                NLESegmentVideo LJJ = NLESegmentVideo.LJJ(slot.LJI());
                if (i == 0) {
                    long j3 = 1000;
                    LJIILIIL = (j - (LJJ.LJIILIIL() / j3)) + (slot.getStartTime() / j3);
                } else {
                    long j4 = 1000;
                    LJIILIIL = (((j + j2) - (LJJ.LJIILIIL() / j4)) + (slot.getStartTime() / j4)) - 1;
                }
                if (C1289254e.this.LIZIZ().getHasInitialized() && C1289254e.this.LIZIZ().getPlayer().isPrepared()) {
                    C1289254e.this.LIZIZ().getPlayer().seek(LJIILIIL);
                }
            }
        };
        InterfaceC1298857w interfaceC1298857w = new InterfaceC1298857w() { // from class: X.54d
            @Override // X.InterfaceC1298857w
            public final List<Long> LIZIZ() {
                return C1289254e.this.LJIIIIZZ;
            }

            @Override // X.InterfaceC1298857w
            public final Bitmap LIZ(int i, String path) {
                o.LJIIIZ(path, "path");
                return C1289254e.this.LIZJ.gv0(i, path);
            }
        };
        frameCacheViewModel.hv0().LIZIZ(c54z);
        c1297357h.LLFFF = interfaceC1299057y;
        c1297357h.LLFII = interfaceC1298857w;
        mainTrackViewModel.LJLJL.observe((LifecycleOwner) LIZIZ.getValue(), new AObserverS70S0100000_2(this, 245));
        mainTrackViewModel.LJLJLJ.observe((LifecycleOwner) LIZIZ.getValue(), new AObserverS70S0100000_2(this, 246));
        mainTrackViewModel.LJLJLLL.observe((LifecycleOwner) LIZIZ.getValue(), new AObserverS70S0100000_2(this, 247));
    }

    public final void LIZ(long j) {
        int i;
        if (!this.LJII.LJJJJLI) {
            return;
        }
        long j2 = 0;
        if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_BLACK_SLOT_OPERATE, Boolean.FALSE)).booleanValue()) {
            C1297357h c1297357h = this.LIZ;
            c1297357h.LJLL = true;
            NLETrackSlot LIZLLL = c1297357h.getBlackSlotContainer().LIZLLL();
            C59L LIZJ = c1297357h.getBlackSlotContainer().LIZJ();
            C65777Prh.LIZ(c1297357h.LJLJJI).remove(LIZLLL);
            C65777Prh.LIZ(c1297357h.LJLILLLLZI).remove(LIZJ);
            if (j == 0) {
                c1297357h.getBlackSlotContainer().LJ();
                C16880lQ.LLFZ(c1297357h.LJLJI, LIZJ);
            } else {
                NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) ORZ.LLFII(c1297357h.LJLJJI);
                if (nLETimeSpaceNode != null) {
                    j2 = nLETimeSpaceNode.getEndTime();
                }
                NLETrackSlot LIZIZ = c1297357h.getBlackSlotContainer().LIZIZ(j2, j);
                if (LIZJ == null) {
                    LIZJ = c1297357h.getBlackSlotContainer().LIZ();
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, C0EH.LIZ(c1297357h.LLFZ, c1297357h.LLIFFJFJJ, 2, C1300758p.LIZLLL));
                View view = (View) ORZ.LLFII(c1297357h.LJLILLLLZI);
                if (view != null) {
                    layoutParams.addRule(17, view.getId());
                }
                layoutParams.setMarginStart((c1297357h.LLI * (-2)) - (c1297357h.LLIFFJFJJ * 2));
                if (LIZJ.getParent() == null) {
                    LIZJ.LJIIL();
                    LIZJ.setItemTrackCallback(c1297357h.LLIIL);
                    LIZJ.setScrollHandler(c1297357h.LLIIJI);
                    c1297357h.LJLJI.addView(LIZJ, layoutParams);
                }
                LIZJ.setLayoutParams(layoutParams);
                InterfaceC1298157p interfaceC1298157p = c1297357h.LJLJJL;
                if (interfaceC1298157p != null) {
                    i = interfaceC1298157p.LJFF();
                } else {
                    i = 0;
                }
                LIZJ.LJIIIZ(LIZIZ, i, 0L, false);
                LIZJ.setIndex(((ArrayList) c1297357h.LJLILLLLZI).size());
                ((ArrayList) c1297357h.LJLJJI).add(LIZIZ);
                ((ArrayList) c1297357h.LJLILLLLZI).add(LIZJ);
                c1297357h.setSelectSlotStyle(c1297357h.LJLLJ);
            }
        } else {
            C1297357h c1297357h2 = this.LIZ;
            c1297357h2.LJLL = false;
            c1297357h2.LJLIL = j / 1000;
            C16880lQ.LLFZ(c1297357h2.LJLJI, c1297357h2.LJLJLJ);
            if (j != 0) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(Math.round(C1300758p.LIZIZ() * ((float) c1297357h2.LJLIL)), C1300758p.LIZLLL);
                if (true ^ ((ArrayList) c1297357h2.LJLILLLLZI).isEmpty()) {
                    layoutParams2.addRule(17, ((View) ORZ.LLFF(c1297357h2.LJLILLLLZI)).getId());
                    layoutParams2.setMarginStart(-(c1297357h2.LLI + c1297357h2.LLIFFJFJJ));
                    layoutParams2.addRule(15);
                }
                c1297357h2.LJLJLJ.setAlpha(0.5f);
                c1297357h2.LJLJLJ.setBackgroundColor(ColorProtector.parseColor("#545454"));
                c1297357h2.LJLJI.addView(c1297357h2.LJLJLJ, 0, layoutParams2);
            }
        }
        this.LJI = j;
    }

    public final void LIZJ(List<? extends NLETrackSlot> slots) {
        o.LJIIIZ(slots, "slots");
        this.LIZ.LIZJ(slots);
        LIZ(this.LJI);
        C54Z c54z = this.LJ;
        c54z.getClass();
        c54z.LIZLLL = slots;
        FrameCacheViewModel.jv0(this.LIZJ);
    }
}
