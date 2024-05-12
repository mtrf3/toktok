package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AnonymousClass519;
import X.AnonymousClass577;
import X.C122034qd;
import X.C124864vC;
import X.C146535p3;
import X.C157116Ep;
import X.C17N;
import X.C34K;
import X.C47261Igj;
import X.C54P;
import X.C5LU;
import X.C5P3;
import X.C5P4;
import X.C6EC;
import X.C6EF;
import X.C6EJ;
import X.C6ES;
import X.C76800UCe;
import X.C78688UuS;
import X.C78983UzD;
import X.C79057V0z;
import X.C7MY;
import X.H7B;
import X.H7R;
import X.InterfaceC65784Pro;
import X.X1D;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.creative.model.audio.UnavailableReason;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.AdjustVideoIntervalFragment;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.NleClipTimeAdjustData;
import com.ss.android.ugc.gamora.editorpro.bottom.panel.SelectSegmentInfo;
import com.ss.android.vesdk.runtime.VEEditorResManager;
import com.ss.ugc.android.editor.core.EditorProContext;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import defpackage.g0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class AqS66S0201000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            case 3:
                return invoke$3(this);
            case 4:
                return invoke$4(this);
            case 5:
                return invoke$5(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS66S0201000_2 aqS66S0201000_2) {
        C5P3 c5p3 = (C5P3) aqS66S0201000_2.l0;
        boolean z = false;
        c5p3.LIZIZ = false;
        C122034qd LJJI = C17N.LJJI(c5p3.LJ);
        if (LJJI != null) {
            LJJI.LIZ();
            String[] strArr = ((VEEditorResManager) aqS66S0201000_2.l1).mReverseVideoPath;
            if (strArr != null) {
                if (strArr.length != 0 && strArr.length == 1) {
                    C5LU LIZLLL = LJJI.LIZLLL();
                    String str = strArr[0];
                    o.LJIIIIZZ(str, "it[0]");
                    LIZLLL.LJJII(str);
                }
                return C76800UCe.LIZ;
            }
            String[] strArr2 = ((VEEditorResManager) aqS66S0201000_2.l1).mReverseAudioPaths;
            if (strArr2 != null) {
                if (strArr2.length != 0 && strArr2.length == 1) {
                    C5LU LIZLLL2 = LJJI.LIZLLL();
                    String str2 = strArr2[0];
                    o.LJIIIIZZ(str2, "it[0]");
                    LIZLLL2.LJIJJLI(str2);
                }
                return C76800UCe.LIZ;
            }
            LJJI.LIZIZ();
            if (aqS66S0201000_2.i2 == 0) {
                z = true;
            }
            ((C5P3) aqS66S0201000_2.l0).LJI.LJ(Boolean.valueOf(z));
            return C76800UCe.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object invoke$1(AqS66S0201000_2 aqS66S0201000_2) {
        C5P4 c5p4 = (C5P4) aqS66S0201000_2.l0;
        boolean z = false;
        c5p4.LIZIZ = false;
        C122034qd LJJI = C17N.LJJI(c5p4.LJ);
        if (LJJI != null) {
            LJJI.LIZ();
            String[] strArr = ((VEEditorResManager) aqS66S0201000_2.l1).mReverseVideoPath;
            if (strArr != null) {
                if (strArr.length != 0 && strArr.length == 1) {
                    C5LU LIZLLL = LJJI.LIZLLL();
                    String str = strArr[0];
                    o.LJIIIIZZ(str, "it[0]");
                    LIZLLL.LJJII(str);
                }
                return C76800UCe.LIZ;
            }
            String[] strArr2 = ((VEEditorResManager) aqS66S0201000_2.l1).mReverseAudioPaths;
            if (strArr2 != null) {
                if (strArr2.length != 0 && strArr2.length == 1) {
                    C5LU LIZLLL2 = LJJI.LIZLLL();
                    String str2 = strArr2[0];
                    o.LJIIIIZZ(str2, "it[0]");
                    LIZLLL2.LJIJJLI(str2);
                }
                return C76800UCe.LIZ;
            }
            LJJI.LIZIZ();
            if (aqS66S0201000_2.i2 == 0) {
                z = true;
            }
            ((C5P4) aqS66S0201000_2.l0).LJI.LJ(Boolean.valueOf(z));
            return C76800UCe.LIZ;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object invoke$2(AqS66S0201000_2 aqS66S0201000_2) {
        PreCheckResult preCheckResult;
        int i;
        PreCheckResultModel preCheckResultModel;
        C6EJ c6ej;
        int i2;
        ArrayList<UnavailableReason> arrayList;
        Integer num;
        boolean z;
        C6EF c6ef = ((C6EC) aqS66S0201000_2.l0).LJLILLLLZI;
        Map map = (Map) aqS66S0201000_2.l1;
        int i3 = aqS66S0201000_2.i2;
        c6ef.LJ().creativeModel.audioCopyrightDetectModel.setDetectResults(new HashMap<>());
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                PreCheckResult preCheckResult2 = (PreCheckResult) entry.getValue();
                if (preCheckResult2 != null) {
                    preCheckResult2.materialHash = i3;
                }
                Iterator<C6EJ> it = c6ef.LIZLLL().iterator();
                while (true) {
                    preCheckResultModel = null;
                    if (it.hasNext()) {
                        c6ej = it.next();
                        if (c6ej.LIZ() == intValue) {
                            break;
                        }
                    } else {
                        c6ej = null;
                        break;
                    }
                }
                C6EJ c6ej2 = c6ej;
                if (c6ej2 != null) {
                    c6ej2.LIZ = preCheckResult2;
                }
                if (preCheckResult2 != null) {
                    preCheckResultModel = new PreCheckResultModel(preCheckResult2.musicInfos, preCheckResult2.matchDetails, preCheckResult2.matchDetailsV1, preCheckResult2.unavailableReasons, Integer.valueOf(preCheckResult2.unavailableReasonsV1), preCheckResult2.preCheckId, false, false, 192, null);
                    ArrayList<UnavailableReason> arrayList2 = preCheckResultModel.unavailableReasons;
                    if ((arrayList2 != null && !arrayList2.isEmpty()) || (num = preCheckResultModel.unavailableReasonsV1) == null || num.intValue() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    preCheckResultModel.detectPass = z;
                    StringBuilder LJ = C7MY.LJ("BaseEditAudioCopyrightHandler -> updateDetectResult -> scene = ", intValue, ", detectPass = ");
                    LJ.append(preCheckResultModel.detectPass);
                    H7B.LIZ(X1D.LIZIZ(LJ));
                }
                HashMap<Integer, PreCheckResultModel> detectResults = c6ef.LJ().creativeModel.audioCopyrightDetectModel.getDetectResults();
                if (detectResults != null) {
                    detectResults.put(Integer.valueOf(intValue), preCheckResultModel);
                }
                String creationId = c6ef.LJ().getCreationId();
                o.LJIIIIZZ(creationId, "model.creationId");
                String str = c6ef.LJ().mShootWay;
                o.LJIIIIZZ(str, "model.mShootWay");
                String valueOf = String.valueOf(c6ef.LJ().draftId);
                String LJIIIZ = H7R.LJIIIZ(c6ef.LJ());
                String LJIIIIZZ = H7R.LJIIIIZZ(c6ef.LJ());
                String musicId = c6ef.LJ().getMusicId();
                if (preCheckResult2 != null && (((arrayList = preCheckResult2.unavailableReasons) == null || arrayList.isEmpty()) && preCheckResult2 != null && preCheckResult2.unavailableReasonsV1 == 0)) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                C6ES.LJI(creationId, str, valueOf, LJIIIZ, LJIIIIZZ, musicId, intValue, i2, System.currentTimeMillis() - c6ef.LJ().creativeModel.audioCopyrightDetectModel.getDetectStart(), c6ef.LJ().getVideoLength(), C78983UzD.LJJJJJL(c6ef.LJ()) ? 1 : 0);
            }
        }
        C6EJ LIZJ = ((C6EC) aqS66S0201000_2.l0).LJLILLLLZI.LIZJ();
        if (LIZJ != null && (preCheckResult = LIZJ.LIZ) != null) {
            C6EC c6ec = (C6EC) aqS66S0201000_2.l0;
            ArrayList<UnavailableReason> arrayList3 = preCheckResult.unavailableReasons;
            if ((arrayList3 == null || arrayList3.isEmpty()) && preCheckResult.unavailableReasonsV1 == 0) {
                c6ec.LJJZZI().creativeModel.audioCopyrightDetectModel.setOperation(0);
                C6EF c6ef2 = c6ec.LJLILLLLZI;
                VideoPublishEditModel model = c6ec.LJJZZI();
                c6ef2.getClass();
                o.LJIIIZ(model, "model");
                C6EJ LIZJ2 = c6ef2.LIZJ();
                if (LIZJ2 != null && LIZJ2.LIZLLL(model)) {
                    C6EJ LIZJ3 = c6ec.LJLILLLLZI.LIZJ();
                    if (LIZJ3 != null) {
                        i = LIZJ3.LIZ();
                    } else {
                        i = -1;
                    }
                    if (!C146535p3.LIZJ(i)) {
                        C157116Ep.LIZLLL(C78688UuS.LJIJJ(c6ec));
                    }
                }
            } else {
                c6ec.LJJZZI().creativeModel.audioCopyrightDetectModel.setOperation(2);
                c6ec.LLIIIL();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS66S0201000_2 aqS66S0201000_2) {
        ((AdjustVideoIntervalFragment) aqS66S0201000_2.l0).lm();
        NLETrack mainTrack = ((EditorProContext) aqS66S0201000_2.l1).getMainTrack();
        AdjustVideoIntervalFragment adjustVideoIntervalFragment = (AdjustVideoIntervalFragment) aqS66S0201000_2.l0;
        if (mainTrack.LJIIJ()) {
            Iterator<NLETrackSlot> it = mainTrack.LJIILLIIL().iterator();
            int i = 0;
            while (it.hasNext()) {
                NLETrackSlot next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    NLESegmentVideo LJJ = NLESegmentVideo.LJJ(next.LJI());
                    if (LJJ.LJIILIIL() != ((NleClipTimeAdjustData) ListProtector.get(adjustVideoIntervalFragment.LLF, i)).getStartTime()) {
                        LJJ.LJIJJLI(((NleClipTimeAdjustData) ListProtector.get(adjustVideoIntervalFragment.LLF, i)).getStartTime());
                        adjustVideoIntervalFragment.LLI = true;
                    }
                    if (LJJ.LJIIL() != ((NleClipTimeAdjustData) ListProtector.get(adjustVideoIntervalFragment.LLF, i)).getEndTime()) {
                        LJJ.LJIJJ(((NleClipTimeAdjustData) ListProtector.get(adjustVideoIntervalFragment.LLF, i)).getEndTime());
                        adjustVideoIntervalFragment.LLI = true;
                    }
                    i = i2;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
            if (!mainTrack.hasExtra("track_extra_is_adjust_range")) {
                mainTrack.setExtra("track_extra_is_adjust_range", "true");
            }
        }
        C79057V0z.LJJJJL((EditorProContext) aqS66S0201000_2.l1, "IS_ACTIVE_TRACKPANEL", Boolean.TRUE);
        ((EditorProContext) aqS66S0201000_2.l1).getPlayer().J9();
        C124864vC.LJ(C79057V0z.LJJI((EditorProContext) aqS66S0201000_2.l1));
        NLEEditor LJJ2 = C79057V0z.LJJ((EditorProContext) aqS66S0201000_2.l1);
        AdjustVideoIntervalFragment adjustVideoIntervalFragment2 = (AdjustVideoIntervalFragment) aqS66S0201000_2.l0;
        g0.LJIILIIL(LJJ2, adjustVideoIntervalFragment2.LLI, adjustVideoIntervalFragment2.Il(), false, false, 8);
        AdjustVideoIntervalFragment adjustVideoIntervalFragment3 = (AdjustVideoIntervalFragment) aqS66S0201000_2.l0;
        adjustVideoIntervalFragment3.LLFZ = true;
        adjustVideoIntervalFragment3.Hl();
        ((AdjustVideoIntervalFragment) aqS66S0201000_2.l0).pm(aqS66S0201000_2.i2);
        AdjustVideoIntervalFragment adjustVideoIntervalFragment4 = (AdjustVideoIntervalFragment) aqS66S0201000_2.l0;
        int i3 = aqS66S0201000_2.i2;
        final EditorProContext editorProContext = (EditorProContext) aqS66S0201000_2.l1;
        adjustVideoIntervalFragment4.nm(i3, new AnonymousClass519() { // from class: X.4yt
            @Override // X.AnonymousClass519
            public final void LIZ(int i4) {
                C79057V0z.LJJJJLI(EditorProContext.this, "show_preview_placeholder", Boolean.FALSE, true);
            }
        });
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS66S0201000_2 aqS66S0201000_2) {
        Iterator it = ((ArrayList) ((AnonymousClass577) aqS66S0201000_2.l0).LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ((SelectSegmentInfo) it.next()).setSelect(false);
        }
        ((SelectSegmentInfo) ListProtector.get(((AnonymousClass577) aqS66S0201000_2.l0).LJLILLLLZI, aqS66S0201000_2.i2)).setSelect(true);
        AdjustVideoIntervalFragment adjustVideoIntervalFragment = (AdjustVideoIntervalFragment) aqS66S0201000_2.l1;
        C54P c54p = adjustVideoIntervalFragment.LLII;
        if (c54p != null) {
            c54p.LIZJ = (NLETrackSlot) ListProtector.get(adjustVideoIntervalFragment.LL, aqS66S0201000_2.i2);
            C54P c54p2 = ((AdjustVideoIntervalFragment) aqS66S0201000_2.l1).LLII;
            if (c54p2 != null) {
                ((ArrayList) c54p2.LJ).clear();
                FrameCacheViewModel frameCacheViewModel = ((AdjustVideoIntervalFragment) aqS66S0201000_2.l1).LJZI;
                if (frameCacheViewModel != null) {
                    frameCacheViewModel.hv0().LJI(false);
                    ((AnonymousClass577) aqS66S0201000_2.l0).LJLIL.onSelect(aqS66S0201000_2.i2);
                    return C76800UCe.LIZ;
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

    public static final Object invoke$5(AqS66S0201000_2 aqS66S0201000_2) {
        C34K c34k = (C34K) aqS66S0201000_2.l0;
        if (!c34k.element) {
            c34k.element = true;
            ((AnonymousClass519) aqS66S0201000_2.l1).LIZ(aqS66S0201000_2.i2);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S0201000_2(C34K c34k, AnonymousClass519 anonymousClass519, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c34k;
        this.l1 = anonymousClass519;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S0201000_2(AnonymousClass577 anonymousClass577, int i, AdjustVideoIntervalFragment adjustVideoIntervalFragment, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = anonymousClass577;
        this.i2 = i;
        this.l1 = adjustVideoIntervalFragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S0201000_2(C5P3 c5p3, VEEditorResManager vEEditorResManager, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c5p3;
        this.l1 = vEEditorResManager;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S0201000_2(C5P4 c5p4, VEEditorResManager vEEditorResManager, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c5p4;
        this.l1 = vEEditorResManager;
        this.i2 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS66S0201000_2(C6EC c6ec, C6EC c6ec2, Map<Integer, PreCheckResult> map, int i) {
        super(0);
        this.$t = i;
        this.l0 = c6ec;
        this.l1 = c6ec2;
        this.i2 = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS66S0201000_2(AdjustVideoIntervalFragment adjustVideoIntervalFragment, EditorProContext editorProContext, int i, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = adjustVideoIntervalFragment;
        this.l1 = editorProContext;
        this.i2 = i;
    }
}
