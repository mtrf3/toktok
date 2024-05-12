package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.ActivityC45651qj;
import X.AnonymousClass519;
import X.AnonymousClass577;
import X.C0A8;
import X.C10A;
import X.C124574uj;
import X.C124614un;
import X.C124864vC;
import X.C127594zb;
import X.C1280450u;
import X.C131175Cv;
import X.C131235Db;
import X.C139795eB;
import X.C141335gf;
import X.C165706es;
import X.C29S;
import X.C2ND;
import X.C3C5;
import X.C47261Igj;
import X.C53O;
import X.C53S;
import X.C53T;
import X.C53W;
import X.C53X;
import X.C53Y;
import X.C54P;
import X.C57V;
import X.C57Y;
import X.C5G0;
import X.C5J0;
import X.C61878OQg;
import X.C6YK;
import X.C76800UCe;
import X.C78613UtF;
import X.C79057V0z;
import X.C90903hW;
import X.EnumC123864ta;
import X.EnumC126814yL;
import X.H7C;
import X.InterfaceC125004vQ;
import X.InterfaceC127784zu;
import X.OSZ;
import X.X1D;
import X.XKX;
import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.vctrace.BuildConfig;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.AdjustVideoIntervalFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.NleClipTimeAdjustData;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS35S0100100_2;
import kotlin.jvm.internal.AqS66S0201000_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class AdjustVideoIntervalFragment extends TTResourcePanelFragment<AdjustVideoIntervalViewModel> {
    public static final /* synthetic */ int LLIILZL = 0;
    public C57V LJLZ;
    public RecyclerView LJZ;
    public FrameCacheViewModel LJZI;
    public NLETrack LLFF;
    public NLETrack LLFFF;
    public int LLFII;
    public boolean LLFZ;
    public boolean LLI;
    public C54P LLII;
    public int LLIIII;
    public int LLIIIILZ;
    public long LLIIIJ;
    public int LLIIIL;
    public boolean LLIIIZ;
    public final C53O LLIIJLIL;
    public final AnonymousClass577 LLIIL;
    public final Map<Integer, View> LLIILII = new LinkedHashMap();
    public final ArrayList<C53S> LJZL = new ArrayList<>();
    public final List<NLETrackSlot> LL = new ArrayList();
    public final List<NLETrackSlot> LLD = new ArrayList();
    public final List<NleClipTimeAdjustData> LLF = new ArrayList();
    public String LLIFFJFJJ = "";
    public final C53T LLIIJI = new C5J0() { // from class: X.53T
        @Override // X.C5J0
        public final void LIZ(int i, long j) {
            if (i != 0) {
                return;
            }
            C2ND.LIZIZ(new AqS35S0100100_2(j, AdjustVideoIntervalFragment.this, 0), 0L);
        }
    };

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Kl() {
        return "adjust_range_panel";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Tl() {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Wl() {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIILII).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIILII;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final int xl() {
        return R.layout.as7;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.53T] */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.53O] */
    public AdjustVideoIntervalFragment() {
        ?? r1 = new C53W() { // from class: X.53O
            @Override // X.C53W
            public final void LIZIZ(C54S c54s) {
                C54P c54p = AdjustVideoIntervalFragment.this.LLII;
                if (c54p != null) {
                    ((ArrayList) c54p.LJ).add(c54s);
                } else {
                    o.LJIJI("frameRequest");
                    throw null;
                }
            }

            @Override // X.C53W
            public final void onSelect(int i) {
                NLETrack nLETrack;
                AdjustVideoIntervalFragment adjustVideoIntervalFragment = AdjustVideoIntervalFragment.this;
                if (adjustVideoIntervalFragment.LLFII != i) {
                    adjustVideoIntervalFragment.LLFII = i;
                    C57V mm = adjustVideoIntervalFragment.mm();
                    AdjustVideoIntervalFragment adjustVideoIntervalFragment2 = AdjustVideoIntervalFragment.this;
                    Object obj = ListProtector.get(adjustVideoIntervalFragment2.LJZL, adjustVideoIntervalFragment2.LLFII);
                    o.LJIIIIZZ(obj, "segmentInfoList[curSelectedIndex]");
                    AdjustVideoIntervalFragment adjustVideoIntervalFragment3 = AdjustVideoIntervalFragment.this;
                    long startTime = ((NleClipTimeAdjustData) ListProtector.get(adjustVideoIntervalFragment3.LLF, adjustVideoIntervalFragment3.LLFII)).getStartTime();
                    AdjustVideoIntervalFragment adjustVideoIntervalFragment4 = AdjustVideoIntervalFragment.this;
                    ((NleClipTimeAdjustData) ListProtector.get(adjustVideoIntervalFragment4.LLF, adjustVideoIntervalFragment4.LLFII)).getEndTime();
                    mm.LJJZ((C53S) obj, startTime);
                    NLETrack nLETrack2 = AdjustVideoIntervalFragment.this.LLFF;
                    if (nLETrack2 != null) {
                        nLETrack2.LJ();
                    }
                    AdjustVideoIntervalFragment adjustVideoIntervalFragment5 = AdjustVideoIntervalFragment.this;
                    NLETrack nLETrack3 = adjustVideoIntervalFragment5.LLFF;
                    if (nLETrack3 != null) {
                        nLETrack3.LIZIZ((NLETrackSlot) ListProtector.get(adjustVideoIntervalFragment5.LL, adjustVideoIntervalFragment5.LLFII));
                    }
                    AdjustVideoIntervalFragment adjustVideoIntervalFragment6 = AdjustVideoIntervalFragment.this;
                    NLETrack nLETrack4 = adjustVideoIntervalFragment6.LLFF;
                    if (nLETrack4 != null) {
                        nLETrack4.setDuration(((NLETimeSpaceNode) ListProtector.get(adjustVideoIntervalFragment6.LL, adjustVideoIntervalFragment6.LLFII)).getDuration());
                    }
                    NLETrack nLETrack5 = AdjustVideoIntervalFragment.this.LLFFF;
                    if (nLETrack5 != null) {
                        nLETrack5.LJ();
                    }
                    AdjustVideoIntervalFragment adjustVideoIntervalFragment7 = AdjustVideoIntervalFragment.this;
                    NLETrackSlot nLETrackSlot = (NLETrackSlot) ListProtector.get(adjustVideoIntervalFragment7.LLD, adjustVideoIntervalFragment7.LLFII);
                    if (nLETrackSlot != null && (nLETrack = AdjustVideoIntervalFragment.this.LLFFF) != null) {
                        nLETrack.LIZIZ(nLETrackSlot);
                    }
                    final EditorProContext Jl = AdjustVideoIntervalFragment.this.Jl();
                    AdjustVideoIntervalFragment adjustVideoIntervalFragment8 = AdjustVideoIntervalFragment.this;
                    C124864vC.LJ(C79057V0z.LJJI(Jl));
                    g0.LJIIJJI(Jl.getEditor().s9(), false, false, 2);
                    adjustVideoIntervalFragment8.om(((NleClipTimeAdjustData) ListProtector.get(adjustVideoIntervalFragment8.LLF, adjustVideoIntervalFragment8.LLFII)).getStartTime(), new AnonymousClass519() { // from class: X.53V
                        @Override // X.AnonymousClass519
                        public final void LIZ(int i2) {
                            EditorProContext.this.getPlayer().play();
                        }
                    });
                    C2ND.LIZIZ(new AqS152S0100000_2(adjustVideoIntervalFragment8, 568), 0L);
                }
            }

            @Override // X.C53W
            public final Bitmap LIZ(long j, String path) {
                o.LJIIIZ(path, "path");
                FrameCacheViewModel frameCacheViewModel = AdjustVideoIntervalFragment.this.LJZI;
                if (frameCacheViewModel != null) {
                    return frameCacheViewModel.gv0((int) j, path);
                }
                o.LJIJI("frameCacheViewModel");
                throw null;
            }
        };
        this.LLIIJLIL = r1;
        this.LLIIL = new AnonymousClass577(this, r1);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Il() {
        return C6YK.LIZ(new C139795eB(EnumC126814yL.ADJUST_CLIPS.getNameId(), null, null, null, null, 30));
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Sl() {
        if (this.LLIIIZ) {
            return;
        }
        this.LLIIIZ = true;
        w6().LJLJJI();
        mm().LJLJLJ = false;
        this.LLFZ = true;
        EditorProContext Jl = Jl();
        Jl.getPlayer().pause();
        Jl.getPlayer().T9(this.LLIIJI);
        Jl.getPlayer().K9().removeObservers(this);
        C79057V0z.LJJJJL(Jl, "show_preview_placeholder", Boolean.TRUE);
        C2ND.LIZIZ(new AqS149S0200000_2(this, Jl, 48), 16L);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void V3() {
        if (this.LLIIIZ) {
            return;
        }
        this.LLIIIZ = true;
        int i = this.LLFII;
        w6().LJLJJI();
        mm().LJLJLJ = false;
        EditorProContext Jl = Jl();
        Jl.getPlayer().pause();
        Jl.getPlayer().T9(this.LLIIJI);
        Jl.getPlayer().K9().removeObservers(this);
        C79057V0z.LJJJJL(Jl, "show_preview_placeholder", Boolean.TRUE);
        C2ND.LIZIZ(new AqS66S0201000_2(this, Jl, i, 3), 16L);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final ViewModel Xl() {
        C53Y c53y = AdjustVideoIntervalViewModel.Companion;
        o.LJIIIIZZ(requireActivity(), "requireActivity()");
        c53y.getClass();
        return C5G0.LIZ(AdjustVideoIntervalViewModel.class);
    }

    public final C57V mm() {
        C57V c57v = this.LJLZ;
        if (c57v != null) {
            return c57v;
        }
        o.LJIJI("rangeView");
        throw null;
    }

    public final RecyclerView w6() {
        RecyclerView recyclerView = this.LJZ;
        if (recyclerView != null) {
            return recyclerView;
        }
        o.LJIJI("recyclerView");
        throw null;
    }

    public final void lm() {
        boolean z;
        EditorProContext Jl = Jl();
        boolean LJFF = Jl.getEditor().s9().LJFF();
        if (Jl.getEditor().s9().LJ().getTracks().size() == 0) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("confirmClick isReset:");
        LIZ.append(LJFF);
        LIZ.append(" tracks:");
        LIZ.append(z);
        H7C.LJI(3, "music", "adjustVideoInterval", X1D.LIZIZ(LIZ));
        if (!LJFF || z) {
            String data = this.LLIFFJFJJ;
            o.LJIIIZ(data, "data");
            NLEError LJI = C79057V0z.LJJ(Jl).LJI(data);
            o.LJIIIIZZ(LJI, "getNLEEditor().restore(data)");
            if (LJI.swigValue() != NLEError.SUCCESS.swigValue()) {
                H7C.LJI(3, "music", "adjustVideoInterval", "restore failed ");
            } else {
                H7C.LJI(3, "music", "adjustVideoInterval", "restore success ");
            }
        }
        ((LinkedHashMap) C124864vC.LJFF.LIZ).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (C1280450u.LIZ()) {
            FrameCacheViewModel frameCacheViewModel = this.LJZI;
            if (frameCacheViewModel != null) {
                frameCacheViewModel.hv0().LIZJ();
                C54P c54p = this.LLII;
                if (c54p != null) {
                    ((ArrayList) c54p.LJ).clear();
                    FrameCacheViewModel frameCacheViewModel2 = this.LJZI;
                    if (frameCacheViewModel2 != null) {
                        C54P c54p2 = this.LLII;
                        if (c54p2 != null) {
                            C131235Db hv0 = frameCacheViewModel2.hv0();
                            hv0.getClass();
                            XKX.LIZLLL(hv0, C78613UtF.LIZ, null, new C131175Cv(hv0, c54p2, null), 2);
                            int i = this.LLFII;
                            ((ArrayList) this.LL).clear();
                            this.LJZL.clear();
                            if (!this.LLFZ) {
                                EditorProContext Jl = Jl();
                                Jl.getPlayer().T9(this.LLIIJI);
                                Jl.getPlayer().K9().removeObservers(this);
                                C79057V0z.LJJJJL(Jl(), "IS_ACTIVE_TRACKPANEL", Boolean.TRUE);
                                lm();
                                nm(i, new AnonymousClass519() { // from class: X.53Z
                                    @Override // X.AnonymousClass519
                                    public final void LIZ(int i2) {
                                    }
                                });
                                C124864vC.LJ(C79057V0z.LJJI(Jl));
                                C79057V0z.LJIIL(Jl);
                            }
                            this.LLFZ = false;
                            this.LLIIIZ = false;
                            return;
                        }
                        o.LJIJI("frameRequest");
                        throw null;
                    }
                    o.LJIJI("frameCacheViewModel");
                    throw null;
                }
                o.LJIJI("frameRequest");
                throw null;
            }
            o.LJIJI("frameCacheViewModel");
            throw null;
        }
    }

    public final void pm(int i) {
        EditorProContext Jl = Jl();
        C79057V0z.LJJJJL(Jl, "is_bottom_panel_showing", Boolean.FALSE);
        C79057V0z.LJJJJL(Jl, "select_slot_event", new C127594zb(Jl.getMainTrack().LJIILIIL(i), null, 14));
    }

    public final void nm(int i, AnonymousClass519 anonymousClass519) {
        NLETrack mainTrack = Jl().getMainTrack();
        long j = 0;
        if (mainTrack != null) {
            VecNLETrackSlotSPtr LJIILLIIL = mainTrack.LJIILLIIL();
            if (i >= 0 && i < LJIILLIIL.size()) {
                j = LJIILLIIL.get(i).getStartTime() + 1000;
            }
        }
        om(j, anonymousClass519);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.53X, X.519] */
    public final void om(long j, final AnonymousClass519 anonymousClass519) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r1 = new AnonymousClass519() { // from class: X.53X
            @Override // X.AnonymousClass519
            public final void LIZ(int i) {
                if (!atomicBoolean.get()) {
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    AnonymousClass519 anonymousClass5192 = anonymousClass519;
                    synchronized (atomicBoolean2) {
                        if (!atomicBoolean2.get()) {
                            atomicBoolean2.set(true);
                            anonymousClass5192.LIZ(i);
                        }
                    }
                }
            }
        };
        InterfaceC127784zu player = Jl().getPlayer();
        if (player != 0) {
            player.fa(j, r1);
        }
        C2ND.LIZ(new AqS152S0100000_2((C53X) r1, 949), 600L);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        String str;
        List list;
        MutableLiveData K9;
        NLEModel r9;
        boolean z;
        String realResourceFile;
        NLEResourceAV LJ;
        long duration;
        float f;
        NLEResourceAV LJ2;
        float f2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        if (C1280450u.LIZ()) {
            Throwable th = null;
            FrameCacheViewModel frameCacheViewModel = (FrameCacheViewModel) C165706es.LJII(view, null, 6).get(FrameCacheViewModel.class);
            this.LJZI = frameCacheViewModel;
            if (frameCacheViewModel != null) {
                C54P c54p = this.LLII;
                if (c54p != null) {
                    frameCacheViewModel.hv0().LIZIZ(c54p);
                    this.LLIIIJ = Jl().getPlayer().H9();
                    EditorProContext Jl = Jl();
                    this.LLIIIL = Jl.getMainTrack().LJIILJJIL(Jl.getSelectedTrackSlot());
                    km();
                    Nl();
                    String string = getString(R.string.fnx);
                    o.LJIIIIZZ(string, "getString(R.string.editor_pro_soundsync_adjust)");
                    Yl(string);
                    EditorProContext Jl2 = Jl();
                    o.LJIIIZ(Jl2, "<this>");
                    String LJIIIIZZ = C79057V0z.LJJ(Jl2).LJIIIIZZ();
                    o.LJIIIIZZ(LJIIIIZZ, "getNLEEditor().store()");
                    this.LLIFFJFJJ = LJIIIIZZ;
                    InterfaceC127784zu player = Jl().getPlayer();
                    if (player != null) {
                        j = player.H9();
                    } else {
                        j = 0;
                    }
                    long j2 = j * 1000;
                    NLETrack mainTrack = Jl().getMainTrack();
                    int i = -1;
                    if (mainTrack == null) {
                        str = "";
                    } else {
                        Iterator<NLETrackSlot> it = mainTrack.LJIILLIIL().iterator();
                        str = "";
                        int i2 = 0;
                        while (it.hasNext()) {
                            NLETrackSlot next = it.next();
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                NLETrackSlot nLETrackSlot = next;
                                long measuredStartTime = nLETrackSlot.getMeasuredStartTime();
                                if (j2 <= nLETrackSlot.getMeasuredEndTime() && measuredStartTime <= j2) {
                                    str = nLETrackSlot.getUUID();
                                    o.LJIIIIZZ(str, "slot.uuid");
                                    i = i2;
                                }
                                i2 = i3;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                    }
                    Object second = new OSZ(Integer.valueOf(i), str).getSecond();
                    VecNLETrackSlotSPtr LJIILLIIL = Jl().getMainTrack().LJIILLIIL();
                    ArrayList arrayList = new ArrayList();
                    Iterator<NLETrackSlot> it2 = LJIILLIIL.iterator();
                    while (it2.hasNext()) {
                        NLETrackSlot next2 = it2.next();
                        NLETrackSlot it3 = next2;
                        o.LJIIIIZZ(it3, "it");
                        if (C124574uj.LJJIJIIJI(it3)) {
                            arrayList.add(next2);
                        }
                    }
                    NLETrack LIZIZ = C141335gf.LIZIZ(C79057V0z.LJJI(Jl()));
                    if (LIZIZ == null || (list = LIZIZ.LJIILLIIL()) == null) {
                        list = C61878OQg.INSTANCE;
                    }
                    this.LJZL.clear();
                    ((ArrayList) this.LLF).clear();
                    ((ArrayList) this.LL).clear();
                    NLETrack mainTrack2 = Jl().getMainTrack();
                    if (mainTrack2 != null) {
                        Iterator<NLETrackSlot> it4 = mainTrack2.LJIILLIIL().iterator();
                        int i4 = 0;
                        while (it4.hasNext()) {
                            NLETrackSlot next3 = it4.next();
                            int i5 = i4 + 1;
                            if (i4 >= 0) {
                                NLETrackSlot nLETrackSlot2 = next3;
                                if (o.LJ(nLETrackSlot2.getUUID(), second)) {
                                    this.LLFII = i4;
                                }
                                NLESegmentVideo LJJ = NLESegmentVideo.LJJ(nLETrackSlot2.LJI());
                                if (C124614un.LJIILIIL(nLETrackSlot2)) {
                                    NLEResourceAV LJIIIIZZ2 = C124614un.LJIIIIZZ(nLETrackSlot2);
                                    if (LJIIIIZZ2 == null || (realResourceFile = LJIIIIZZ2.LIZJ()) == null) {
                                        realResourceFile = "";
                                    }
                                } else {
                                    realResourceFile = LJJ.LJIIJ().LIZJ();
                                }
                                if (C124614un.LJIILIIL(nLETrackSlot2)) {
                                    NLEResourceAV LJIIIIZZ3 = C124614un.LJIIIIZZ(nLETrackSlot2);
                                    if (LJIIIIZZ3 != null) {
                                        duration = LJIIIIZZ3.getDuration();
                                    } else {
                                        duration = 0;
                                    }
                                } else {
                                    if (nLETrackSlot2.getRewind()) {
                                        LJ = LJJ.LJIIJJI();
                                    } else {
                                        LJ = LJJ.LJ();
                                    }
                                    duration = LJ.getDuration();
                                }
                                String stringId = nLETrackSlot2.getStringId();
                                o.LJIIIIZZ(stringId, "it.stringId");
                                o.LJIIIIZZ(realResourceFile, "realResourceFile");
                                long LJIILIIL = LJJ.LJIILIIL();
                                long LJIIL = LJJ.LJIIL();
                                if (nLETrackSlot2.getRewind()) {
                                    f = -1.0f;
                                } else {
                                    f = 1.0f;
                                }
                                this.LJZL.add(new C53S(stringId, realResourceFile, LJIILIIL, LJIIL, duration, f, (int) LJJ.LIZIZ().LJI(), (int) LJJ.LIZIZ().LIZIZ()));
                                String stringId2 = nLETrackSlot2.getStringId();
                                o.LJIIIIZZ(stringId2, "it.stringId");
                                ((ArrayList) this.LLF).add(new NleClipTimeAdjustData(stringId2, LJJ.LJIILIIL(), LJJ.LJIIL(), 1.0f, LJJ.LJIIL() - LJJ.LJIILIIL()));
                                List<NLETrackSlot> list2 = this.LL;
                                NLETrackSlot LIZ = NLETrackSlot.LIZ(nLETrackSlot2.deepClone(true));
                                NLESegmentVideo segment = NLESegmentVideo.LJJ(LIZ.LJI().deepClone(true));
                                long j3 = 0;
                                LIZ.setStartTime(0L);
                                if (C124614un.LJIILIIL(LIZ)) {
                                    NLEResourceAV LJIIIIZZ4 = C124614un.LJIIIIZZ(LIZ);
                                    if (LJIIIIZZ4 != null) {
                                        j3 = LJIIIIZZ4.getDuration();
                                    }
                                } else {
                                    if (segment.getRewind()) {
                                        LJ2 = LJJ.LJIIJJI();
                                    } else {
                                        LJ2 = segment.LJ();
                                    }
                                    j3 = LJ2.getDuration();
                                }
                                o.LJIIIIZZ(segment, "segment");
                                C124574uj.LJJLIIIIJ(segment);
                                segment.LJJIIJZLJL(true);
                                LIZ.setEndTime(LIZ.getStartTime() + j3);
                                segment.LJIJJLI(0L);
                                if (segment.getRewind()) {
                                    f2 = -1.0f;
                                } else {
                                    f2 = 1.0f;
                                }
                                segment.setSpeed(f2);
                                segment.LJIJJ(segment.LJIILIIL() + j3);
                                LIZ.LJIIL(segment);
                                ((ArrayList) list2).add(LIZ);
                                if (list.size() == arrayList.size() && arrayList.contains(nLETrackSlot2)) {
                                    List<NLETrackSlot> list3 = this.LLD;
                                    Object obj = ListProtector.get(list, arrayList.indexOf(nLETrackSlot2));
                                    NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) obj;
                                    nLETimeSpaceNode.setStartTime(0L);
                                    nLETimeSpaceNode.setEndTime(-2L);
                                    ((ArrayList) list3).add(obj);
                                    th = null;
                                } else {
                                    th = null;
                                    ((ArrayList) this.LLD).add(null);
                                }
                                i4 = i5;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw th;
                            }
                        }
                    }
                    C57V mm = mm();
                    Object obj2 = ListProtector.get(this.LJZL, this.LLFII);
                    o.LJIIIIZZ(obj2, "segmentInfoList[curSelectedIndex]");
                    long startTime = ((NleClipTimeAdjustData) ListProtector.get(this.LLF, this.LLFII)).getStartTime();
                    ((NleClipTimeAdjustData) ListProtector.get(this.LLF, this.LLFII)).getEndTime();
                    mm.LJJZ((C53S) obj2, startTime);
                    C54P c54p2 = this.LLII;
                    if (c54p2 != null) {
                        List<NLETrackSlot> list4 = this.LL;
                        c54p2.LIZIZ = list4;
                        c54p2.LIZJ = (NLETrackSlot) ListProtector.get(list4, this.LLFII);
                        FrameCacheViewModel frameCacheViewModel2 = this.LJZI;
                        if (frameCacheViewModel2 != null) {
                            frameCacheViewModel2.hv0().LJI(false);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<C53S> it5 = this.LJZL.iterator();
                            int i6 = 0;
                            while (it5.hasNext()) {
                                int i7 = i6 + 1;
                                C53S next4 = it5.next();
                                String str2 = next4.LIZ;
                                String str3 = next4.LIZIZ;
                                long j4 = next4.LIZJ;
                                long j5 = next4.LIZLLL;
                                long j6 = next4.LJ;
                                float f3 = next4.LJFF;
                                int i8 = next4.LJI;
                                int i9 = next4.LJII;
                                if (i6 == this.LLFII) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                arrayList2.add(new SelectSegmentInfo(str2, str3, j4, j5, j6, f3, i8, i9, z, i6));
                                i6 = i7;
                            }
                            C79057V0z.LJJJJL(Jl(), "IS_ACTIVE_TRACKPANEL", Boolean.FALSE);
                            AnonymousClass577 anonymousClass577 = this.LLIIL;
                            anonymousClass577.getClass();
                            ((ArrayList) anonymousClass577.LJLILLLLZI).clear();
                            ((ArrayList) anonymousClass577.LJLILLLLZI).addAll(arrayList2);
                            anonymousClass577.notifyDataSetChanged();
                            RecyclerView w6 = w6();
                            requireActivity();
                            w6.setLayoutManager(new LinearLayoutManager(0, false));
                            w6().setAdapter(this.LLIIL);
                            InterfaceC125004vQ editor = Jl().getEditor();
                            if (editor != null && (r9 = editor.r9()) != null) {
                                r9.clearTrack();
                            }
                            NLETrack nLETrack = new NLETrack();
                            nLETrack.LJJ(true);
                            this.LLFF = nLETrack;
                            nLETrack.LIZIZ((NLETrackSlot) ListProtector.get(this.LL, this.LLFII));
                            NLETrack nLETrack2 = this.LLFF;
                            if (nLETrack2 != null) {
                                nLETrack2.setDuration(((NLETimeSpaceNode) ListProtector.get(this.LL, this.LLFII)).getDuration());
                            }
                            C79057V0z.LJJI(Jl()).addTrack(this.LLFF);
                            NLETrack nLETrack3 = new NLETrack();
                            nLETrack3.LJJ(false);
                            C124574uj.LJJLIIIJILLIZJL(nLETrack3, "audio");
                            nLETrack3.LJIL(EnumC123864ta.AUDIO);
                            nLETrack3.setLayer(0);
                            nLETrack3.setExtra("AudioTrackType", "ORIGIN");
                            this.LLFFF = nLETrack3;
                            NLETrackSlot nLETrackSlot3 = (NLETrackSlot) ListProtector.get(this.LLD, this.LLFII);
                            if (nLETrackSlot3 != null) {
                                NLETrack nLETrack4 = this.LLFFF;
                                if (nLETrack4 != null) {
                                    nLETrack4.LIZIZ(nLETrackSlot3);
                                }
                                NLETrack nLETrack5 = this.LLFFF;
                                if (nLETrack5 != null) {
                                    nLETrack5.setDuration(nLETrackSlot3.getDuration());
                                }
                            }
                            final EditorProContext Jl3 = Jl();
                            C79057V0z.LJJI(Jl3).addTrack(this.LLFFF);
                            C124864vC.LJ(C79057V0z.LJJI(Jl3));
                            g0.LJIIJJI(Jl3.getEditor().s9(), false, false, 2);
                            om(((NleClipTimeAdjustData) ListProtector.get(this.LLF, this.LLFII)).getStartTime(), new AnonymousClass519() { // from class: X.4yv
                                @Override // X.AnonymousClass519
                                public final void LIZ(int i10) {
                                    C79057V0z.LJJJJLI(EditorProContext.this, "show_preview_placeholder", Boolean.FALSE, true);
                                }
                            });
                            mm().getCurStartTimeEvent().LIZLLL(this, new AObjectS84S0100000_2(this, 281));
                            mm().getRangeSeekEvent().LIZLLL(this, new AObjectS84S0100000_2(this, 282));
                            InterfaceC127784zu player2 = Jl().getPlayer();
                            if (player2 != null) {
                                player2.N9(this.LLIIJI);
                            }
                            InterfaceC127784zu player3 = Jl().getPlayer();
                            if (player3 != null && (K9 = player3.K9()) != null) {
                                K9.observe(this, new AObserverS70S0100000_2(this, BuildConfig.VERSION_CODE));
                            }
                            mm().setCursorTouchListener(new C57Y() { // from class: X.53U
                                @Override // X.C57Y
                                public final void LIZIZ() {
                                }

                                @Override // X.C57Y
                                public final void LIZ() {
                                    InterfaceC127784zu player4 = AdjustVideoIntervalFragment.this.Jl().getPlayer();
                                    if (player4 != null) {
                                        player4.pause();
                                    }
                                }
                            });
                            mm().setOnScrollerChange(new AqS168S0100000_2(this, 585));
                            return;
                        }
                        o.LJIJI("frameCacheViewModel");
                        throw null;
                    }
                    o.LJIJI("frameRequest");
                    throw null;
                }
                o.LJIJI("frameRequest");
                throw null;
            }
            o.LJIJI("frameCacheViewModel");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        if (onCreateView != null) {
            View findViewById = onCreateView.findViewById(R.id.y7);
            o.LJIIIIZZ(findViewById, "rootView.findViewById(R.…dvanced_video_range_view)");
            this.LJLZ = (C57V) findViewById;
            mm().setFrameCacheCallBack(this.LLIIJLIL);
            this.LLII = new C54P(mm().getCallBack());
            View findViewById2 = onCreateView.findViewById(R.id.isn);
            o.LJIIIIZZ(findViewById2, "rootView.findViewById(R.id.recycler_view)");
            this.LJZ = (RecyclerView) findViewById2;
            RecyclerView frameRecycler = mm().getFrameRecycler();
            C0A8 c0a8 = new C0A8() { // from class: X.53P
                @Override // X.C0A8
                public final void LIZ(RecyclerView.ViewHolder holder) {
                    C1292155h c1292155h;
                    o.LJIIIZ(holder, "holder");
                    if ((holder instanceof C1292155h) && (c1292155h = (C1292155h) holder) != null) {
                        AdjustVideoIntervalFragment adjustVideoIntervalFragment = AdjustVideoIntervalFragment.this;
                        C57K c57k = c1292155h.LJLILLLLZI;
                        if (c57k != null) {
                            C54P c54p = adjustVideoIntervalFragment.LLII;
                            if (c54p != null) {
                                ((ArrayList) c54p.LJ).remove(c57k);
                            } else {
                                o.LJIJI("frameRequest");
                                throw null;
                            }
                        }
                    }
                }
            };
            frameRecycler.getClass();
            ((ArrayList) frameRecycler.LJLLLL).add(c0a8);
        }
        C29S c29s = null;
        if (!(onCreateView instanceof View)) {
            onCreateView = null;
        }
        if (onCreateView != null) {
            try {
                ViewTreeLifecycleOwner.set(onCreateView, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(onCreateView, this);
                C10A.LIZIZ(onCreateView, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return onCreateView;
    }
}
