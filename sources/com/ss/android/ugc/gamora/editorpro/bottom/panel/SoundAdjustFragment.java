package com.ss.android.ugc.gamora.editorpro.bottom.panel;

import X.AnonymousClass511;
import X.AnonymousClass519;
import X.AnonymousClass543;
import X.AnonymousClass546;
import X.C124574uj;
import X.C124864vC;
import X.C1280450u;
import X.C131175Cv;
import X.C131235Db;
import X.C134845Qy;
import X.C139795eB;
import X.C171096nZ;
import X.C221108m2;
import X.C2ND;
import X.C52T;
import X.C54D;
import X.C54F;
import X.C54J;
import X.C54L;
import X.C5G0;
import X.C5J0;
import X.C62822Ol8;
import X.C6YK;
import X.C78613UtF;
import X.C78926UyI;
import X.C79057V0z;
import X.EnumC126814yL;
import X.H7C;
import X.ORZ;
import X.OSZ;
import X.XKX;
import Y.ALAdapterS1S0100000_2;
import Y.ARunnableS0S0100001_2;
import Y.AUListenerS91S0100000_2;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.ViewModel;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.SoundAdjustFragment;
import com.ss.ugc.android.editor.base.viewmodel.CutViewModel;
import com.ss.ugc.android.editor.components.base.api.IConsoleBarService;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS35S0100100_2;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public final class SoundAdjustFragment extends TTResourcePanelFragment<CutViewModel> {
    public static final /* synthetic */ int LLIIIZ = 0;
    public volatile long LLD;
    public boolean LLF;
    public FrameCacheViewModel LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public long LLII;
    public boolean LLIIIILZ;
    public final Map<Integer, View> LLIIIL = new LinkedHashMap();
    public final int LJLZ = C134845Qy.LIZ(34.0f);
    public final int LJZ = C134845Qy.LIZ(42.0f);
    public final float LJZI = C134845Qy.LIZ(34.0f) / 1000.0f;
    public final float LJZL = C134845Qy.LIZ(15.0f);
    public float LL = C134845Qy.LIZ(15.0f);
    public final ArrayList<String> LLFF = new ArrayList<>();
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(AnonymousClass511.LJLIL);
    public final AnonymousClass543 LLFII = new C5J0() { // from class: X.543
        @Override // X.C5J0
        public final void LIZ(int i, long j) {
            if (i != 0) {
                return;
            }
            C2ND.LIZIZ(new AqS35S0100100_2(SoundAdjustFragment.this, j, 1), 0L);
        }
    };
    public String LLIIII = "";
    public long LLIIIJ = System.currentTimeMillis();

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Kl() {
        return "sound_adjust_panel";
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Wl() {
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LLIIIL).clear();
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.TTResourcePanelFragment, com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LLIIIL;
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
        return R.layout.asu;
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final String Il() {
        return C6YK.LIZ(new C139795eB(EnumC126814yL.SOUND_ADJUST.getNameId(), null, null, null, null, 30));
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void Sl() {
        if (this.LLIFFJFJJ) {
            return;
        }
        this.LLIFFJFJJ = true;
        this.LLI = true;
        EditorProContext Jl = Jl();
        Jl.getPlayer().pause();
        Jl.getPlayer().T9(this.LLFII);
        Jl.getPlayer().K9().removeObservers(this);
        C79057V0z.LJJJJL(Jl, "show_preview_placeholder", Boolean.TRUE);
        C2ND.LIZIZ(new AqS149S0200000_2(this, Jl, 49), 16L);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final void V3() {
        if (this.LLIFFJFJJ) {
            return;
        }
        this.LLIFFJFJJ = true;
        EditorProContext Jl = Jl();
        Jl.getPlayer().pause();
        Jl.getPlayer().T9(this.LLFII);
        Jl.getPlayer().K9().removeObservers(this);
        C79057V0z.LJJJJL(Jl, "show_preview_placeholder", Boolean.TRUE);
        C2ND.LIZIZ(new AqS149S0200000_2(this, Jl, 50), 16L);
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment
    public final ViewModel Xl() {
        return C5G0.LIZ(CutViewModel.class);
    }

    public final C52T om() {
        IConsoleBarService iConsoleBarService = (IConsoleBarService) C171096nZ.LIZ(IConsoleBarService.class);
        if (iConsoleBarService != null) {
            return iConsoleBarService.getConsoleBar();
        }
        return null;
    }

    public final void mm() {
        boolean z;
        EditorProContext Jl = Jl();
        boolean LJFF = Jl.getEditor().s9().LJFF();
        if (Jl.getEditor().s9().LJ().getTracks().size() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!LJFF || z) {
            String data = this.LLIIII;
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

    public final NLETrackSlot nm() {
        NLETrack nLETrack;
        VecNLETrackSPtr tracks = C79057V0z.LJJI(Jl()).getTracks();
        o.LJIIIIZZ(tracks, "editorContext.getNLEModel().tracks");
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
        if (nLETrack3 == null) {
            return null;
        }
        return (NLETrackSlot) ORZ.LJLLLL(nLETrack3.LJIILL());
    }

    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C54J c54j;
        C131235Db c131235Db;
        super.onDestroy();
        if (C1280450u.LIZ()) {
            if (!this.LLI) {
                EditorProContext Jl = Jl();
                Jl.getPlayer().T9(this.LLFII);
                Jl.getPlayer().K9().removeObservers(this);
                C79057V0z.LJJJJL(Jl(), "IS_ACTIVE_TRACKPANEL", Boolean.TRUE);
                Jl().getPlayer().J9();
                mm();
                C79057V0z.LJIIL(Jl);
            }
            this.LLI = false;
            this.LLIFFJFJJ = false;
            C54F c54f = (C54F) _$_findCachedViewById(R.id.k7c);
            if (c54f != null && (c54j = c54f.LJLJJLL) != null && (c131235Db = c54j.LJLJJI) != null) {
                C54L request = c54j.LJLILLLLZI;
                o.LJIIIZ(request, "request");
                XKX.LIZLLL(c131235Db, C78613UtF.LIZ, null, new C131175Cv(c131235Db, request, null), 2);
            }
        }
    }

    public final void sm() {
        if (Jl().getPlayer().isPlaying()) {
            Jl().getPlayer().pause();
        }
    }

    public final void lm(boolean z) {
        NLESegmentAudio LIZLLL;
        long j;
        long j2;
        long j3;
        NLETrackSlot nm = nm();
        if (nm != null && (LIZLLL = NLESegmentAudio.LIZLLL(nm.LJI())) != null) {
            C54F c54f = (C54F) _$_findCachedViewById(R.id.k7c);
            long j4 = 0;
            if (c54f != null) {
                j = c54f.getVideoSelectFrameStartTime();
            } else {
                j = 0;
            }
            C54F c54f2 = (C54F) _$_findCachedViewById(R.id.k7c);
            if (c54f2 != null) {
                j2 = c54f2.getVideoSelectFrameEndTime();
            } else {
                j2 = 0;
            }
            C54D c54d = (C54D) _$_findCachedViewById(R.id.k7b);
            if (c54d != null) {
                j3 = c54d.getAudioSelectFrameStartTime();
            } else {
                j3 = 0;
            }
            C54D c54d2 = (C54D) _$_findCachedViewById(R.id.k7b);
            if (c54d2 != null) {
                j4 = c54d2.getAudioSelectFrameEndTime();
            }
            float absSpeed = LIZLLL.getAbsSpeed() * ((float) j3);
            float absSpeed2 = LIZLLL.getAbsSpeed();
            nm.setStartTime(j);
            nm.setEndTime(j2);
            LIZLLL.LJIJJLI(absSpeed);
            LIZLLL.LJIJJ(absSpeed2 * ((float) j4));
            if (z) {
                this.LLF = true;
                C79057V0z.LJIIL(Jl());
            }
        }
    }

    public final void pm(NLETrackSlot nLETrackSlot) {
        float f;
        float f2;
        View LIZ;
        float f3;
        int i;
        float f4;
        OSZ<Float, Float> audioSelectFramePosition;
        OSZ<Float, Float> audioSelectFramePosition2;
        C54J videoFrameTrack$tools_camera_edit_release;
        NLESegmentAudio LIZLLL = NLESegmentAudio.LIZLLL(nLETrackSlot.LJI());
        if (LIZLLL != null) {
            C54F c54f = (C54F) _$_findCachedViewById(R.id.k7c);
            float f5 = 0.0f;
            if (c54f != null && (videoFrameTrack$tools_camera_edit_release = c54f.getVideoFrameTrack$tools_camera_edit_release()) != null) {
                f = videoFrameTrack$tools_camera_edit_release.getVideoFrameScale();
            } else {
                f = 0.0f;
            }
            float LJIILIIL = (((float) LIZLLL.LJIILIIL()) / LIZLLL.getAbsSpeed()) / 1000;
            if (Ql()) {
                C54D c54d = (C54D) _$_findCachedViewById(R.id.k7b);
                if (c54d != null) {
                    f3 = c54d.LIZIZ(f);
                } else {
                    f3 = 0.0f;
                }
                C54D c54d2 = (C54D) _$_findCachedViewById(R.id.k7b);
                if (c54d2 != null) {
                    i = c54d2.getAudioTrackTotalPadding();
                } else {
                    i = 0;
                }
                float f6 = f3 - i;
                C54D c54d3 = (C54D) _$_findCachedViewById(R.id.k7b);
                if (c54d3 != null && (audioSelectFramePosition2 = c54d3.getAudioSelectFramePosition()) != null) {
                    f4 = audioSelectFramePosition2.getFirst().floatValue();
                } else {
                    f4 = 0.0f;
                }
                C54D c54d4 = (C54D) _$_findCachedViewById(R.id.k7b);
                if (c54d4 != null && (audioSelectFramePosition = c54d4.getAudioSelectFramePosition()) != null) {
                    f5 = audioSelectFramePosition.getSecond().floatValue();
                }
                f2 = ((f6 + f4) - f5) - (LJIILIIL * f);
            } else {
                f2 = LJIILIIL * f;
            }
            C54D c54d5 = (C54D) _$_findCachedViewById(R.id.k7b);
            if (c54d5 != null && (LIZ = c54d5.LIZ(R.id.a_e)) != null) {
                LIZ.post(new ARunnableS0S0100001_2(this, f2, 2));
            }
        }
    }

    public final void qm(NLETrackSlot nLETrackSlot) {
        long LJIIJJI = Jl().getMainTrack().LJIIJJI();
        long j = LJIIJJI - 8000;
        long j2 = LJIIJJI + 8000;
        long duration = nLETrackSlot.getDuration();
        boolean z = false;
        if (j <= duration && duration <= j2) {
            z = true;
        }
        if (z) {
            C54F c54f = (C54F) _$_findCachedViewById(R.id.k7c);
            if (c54f != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                ofFloat.setDuration(150L);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.addUpdateListener(new AUListenerS91S0100000_2(c54f, 41));
                ofFloat.addListener(new ALAdapterS1S0100000_2(c54f, 28));
                ofFloat.start();
                return;
            }
            return;
        }
        C54F c54f2 = (C54F) _$_findCachedViewById(R.id.k7c);
        if (c54f2 == null) {
            return;
        }
        c54f2.LJFF();
    }

    public final void vm(boolean z) {
        NLETrackSlot nm = nm();
        if (nm != null) {
            Jl().getPlayer().Q9(nm.getStartTime(), nm.getEndTime(), z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0282  */
    @Override // com.ss.android.ugc.gamora.editorpro.bottom.panel.DTResourcePanelFragment, com.ss.ugc.android.editor.components.base.panel.BasePanelFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editorpro.bottom.panel.SoundAdjustFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.519, X.546] */
    public static void xm(SoundAdjustFragment soundAdjustFragment, long j, final AnonymousClass519 anonymousClass519, int i) {
        boolean z;
        boolean z2 = true;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) == 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            anonymousClass519 = new AnonymousClass519() { // from class: X.548
                @Override // X.AnonymousClass519
                public final void LIZ(int i2) {
                }
            };
        }
        if (z2) {
            C52T om = soundAdjustFragment.om();
            if (om != null) {
                om.LLLLLLLLL(C78926UyI.LJJIZ(j));
            }
        } else {
            soundAdjustFragment.getClass();
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ?? r3 = new AnonymousClass519() { // from class: X.546
            @Override // X.AnonymousClass519
            public final void LIZ(int i2) {
                if (!atomicBoolean.get()) {
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    AnonymousClass519 anonymousClass5192 = anonymousClass519;
                    synchronized (atomicBoolean2) {
                        if (!atomicBoolean2.get()) {
                            atomicBoolean2.set(true);
                            anonymousClass5192.LIZ(i2);
                        }
                    }
                }
            }
        };
        if (z) {
            soundAdjustFragment.Jl().getPlayer().fa(j, r3);
        } else {
            soundAdjustFragment.Jl().getPlayer().A3(C124574uj.LJJLIIIJL(j), r3);
        }
        C2ND.LIZ(new AqS152S0100000_2((AnonymousClass546) r3, 948), 600L);
    }
}
