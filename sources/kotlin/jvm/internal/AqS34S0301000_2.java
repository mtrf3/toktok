package kotlin.jvm.internal;

import X.AbstractC156986Ec;
import X.AbstractC157016Ef;
import X.AbstractC65781Prl;
import X.C0EH;
import X.C127604zc;
import X.C127764zs;
import X.C13860gY;
import X.C139875eJ;
import X.C140335f3;
import X.C34K;
import X.C58D;
import X.C5BA;
import X.C6ES;
import X.C76800UCe;
import X.C78983UzD;
import X.C79045V0n;
import X.C79057V0z;
import X.EnumC127484zQ;
import X.H7R;
import X.InterfaceC153045zY;
import X.InterfaceC65784Pro;
import X.X1D;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.creative.model.AudioCopyrightDetectModel;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.creative.model.audio.UnavailableReason;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import com.ss.ugc.android.editor.track.PlayPositionState;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class AqS34S0301000_2 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            case 2:
                return invoke$2(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS34S0301000_2 aqS34S0301000_2) {
        int i = 0;
        if (!((C34K) aqS34S0301000_2.l0).element) {
            VEEditorAutoStartStopArbiter LJJLJ = ((C139875eJ) aqS34S0301000_2.l1).LJJLJ();
            if (LJJLJ != null) {
                LJJLJ.LIZJ(true, false);
            }
            InterfaceC153045zY LJLIIL = ((C139875eJ) aqS34S0301000_2.l1).LJLIIL();
            if (LJLIIL != null) {
                LJLIIL.LJJLIIIIJ(aqS34S0301000_2.i3);
            }
            VideoEditContainerScene u = ((C139875eJ) aqS34S0301000_2.l1).u();
            if (u != null) {
                int i2 = aqS34S0301000_2.i3;
                u.LJLLL.setBackgroundColor(i2);
                ViewGroup viewGroup = u.LJLLLL;
                if (viewGroup != null) {
                    viewGroup.setBackgroundColor(i2);
                }
            }
            ((C139875eJ) aqS34S0301000_2.l1).LLLLZIL.setValue(Integer.valueOf(aqS34S0301000_2.i3));
        } else {
            Integer LJI = C79045V0n.LJI(R.attr.d4, ((C139875eJ) aqS34S0301000_2.l1).getActivity());
            if (LJI != null) {
                i = LJI.intValue();
            }
            VideoEditContainerScene u2 = ((C139875eJ) aqS34S0301000_2.l1).u();
            if (u2 != null) {
                u2.LJLLL.setBackgroundColor(i);
                ViewGroup viewGroup2 = u2.LJLLLL;
                if (viewGroup2 != null) {
                    viewGroup2.setBackgroundColor(i);
                }
            }
            ((C139875eJ) aqS34S0301000_2.l1).LLLLZIL.setValue(Integer.valueOf(i));
        }
        ((C140335f3) aqS34S0301000_2.l2).getClass();
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS34S0301000_2 aqS34S0301000_2) {
        long endTime;
        NLETrackSlot nLETrackSlot;
        if (aqS34S0301000_2.i3 == 0) {
            endTime = ((NLETrackSlot) aqS34S0301000_2.l0).getStartTime() + 1000;
        } else {
            endTime = ((NLETrackSlot) aqS34S0301000_2.l0).getEndTime() - 1000;
        }
        ((C58D) aqS34S0301000_2.l1).updatePlayState(new PlayPositionState(endTime, false, false), false);
        long j = endTime / 1000;
        ((C127604zc) aqS34S0301000_2.l2).LJIILL().getPlayer().seek(j);
        C127764zs.LJJIFFI((C127604zc) aqS34S0301000_2.l2, Long.valueOf(j), 2);
        EnumC127484zQ enumC127484zQ = EnumC127484zQ.ENABLE_TRACK_LINKAGE;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) C5BA.LIZ(enumC127484zQ, bool)).booleanValue();
        if (((Boolean) C5BA.LIZ(EnumC127484zQ.ENABLE_BLACK_SLOT_OPERATE, bool)).booleanValue() || (booleanValue && ((nLETrackSlot = (NLETrackSlot) aqS34S0301000_2.l0) == null || !Boolean.parseBoolean(nLETrackSlot.getExtra("is_black_frame"))))) {
            C79057V0z.LJJJJL(((C127604zc) aqS34S0301000_2.l2).LJIILL(), "check_effect_func_event", C76800UCe.LIZ);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS34S0301000_2 aqS34S0301000_2) {
        Map map;
        PreCheckResult preCheckResult;
        int i;
        Map map2;
        int i2;
        PreCheckResult preCheckResult2;
        PreCheckResult preCheckResult3;
        ArrayList<UnavailableReason> arrayList;
        PreCheckResult preCheckResult4;
        Object obj;
        PreCheckResultModel preCheckResultModel;
        Integer num;
        boolean z;
        int i3;
        ArrayList<UnavailableReason> arrayList2;
        ((AbstractC156986Ec) aqS34S0301000_2.l0).LIZIZ().creativeModel.audioCopyrightDetectModel.setDetectResults(new HashMap<>());
        Map map3 = (Map) aqS34S0301000_2.l1;
        if (map3 != null) {
            AbstractC156986Ec abstractC156986Ec = (AbstractC156986Ec) aqS34S0301000_2.l0;
            for (Map.Entry entry : map3.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                PreCheckResult preCheckResult5 = (PreCheckResult) entry.getValue();
                Iterator it = abstractC156986Ec.LIZJ().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((AbstractC157016Ef) obj).LIZ() == intValue) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                AbstractC157016Ef abstractC157016Ef = (AbstractC157016Ef) obj;
                if (abstractC157016Ef != null) {
                    abstractC157016Ef.LJI = preCheckResult5;
                    MutableLiveData<Integer> mutableLiveData = abstractC157016Ef.LJ;
                    if (preCheckResult5 != null && (((arrayList2 = preCheckResult5.unavailableReasons) == null || arrayList2.isEmpty()) && preCheckResult5 != null && preCheckResult5.unavailableReasonsV1 == 0)) {
                        i3 = 100;
                    } else {
                        i3 = 101;
                    }
                    mutableLiveData.setValue(i3);
                }
                if (preCheckResult5 != null) {
                    preCheckResultModel = new PreCheckResultModel(preCheckResult5.musicInfos, preCheckResult5.matchDetails, preCheckResult5.matchDetailsV1, preCheckResult5.unavailableReasons, Integer.valueOf(preCheckResult5.unavailableReasonsV1), preCheckResult5.preCheckId, false, false, 192, null);
                    ArrayList<UnavailableReason> arrayList3 = preCheckResultModel.unavailableReasons;
                    if ((arrayList3 != null && !arrayList3.isEmpty()) || (num = preCheckResultModel.unavailableReasonsV1) == null || num.intValue() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    preCheckResultModel.detectPass = z;
                    StringBuilder LIZ = X1D.LIZ();
                    C0EH.LIZLLL(LIZ, abstractC156986Ec.LIZ, " -> updateDetectResult -> scene = ", intValue, ", detectPass = ");
                    C13860gY.LIZIZ(LIZ, preCheckResultModel.detectPass, LIZ);
                } else {
                    preCheckResultModel = null;
                }
                HashMap<Integer, PreCheckResultModel> detectResults = abstractC156986Ec.LIZIZ().creativeModel.audioCopyrightDetectModel.getDetectResults();
                if (detectResults != null) {
                    detectResults.put(Integer.valueOf(intValue), preCheckResultModel);
                }
            }
        }
        AudioCopyrightDetectModel audioCopyrightDetectModel = ((AbstractC156986Ec) aqS34S0301000_2.l0).LIZIZ().creativeModel.audioCopyrightDetectModel;
        Map map4 = (Map) aqS34S0301000_2.l1;
        if ((map4 == null || (preCheckResult4 = (PreCheckResult) map4.get(Integer.valueOf(aqS34S0301000_2.i3))) == null || preCheckResult4.unavailableReasons == null) && (map = (Map) aqS34S0301000_2.l1) != null && (preCheckResult = (PreCheckResult) map.get(Integer.valueOf(aqS34S0301000_2.i3))) != null && preCheckResult.unavailableReasonsV1 == 0) {
            i = 0;
        } else {
            i = 2;
        }
        audioCopyrightDetectModel.setOperation(i);
        ((AbstractC157016Ef) aqS34S0301000_2.l2).LJI();
        String creationId = ((AbstractC156986Ec) aqS34S0301000_2.l0).LIZIZ().getCreationId();
        o.LJIIIIZZ(creationId, "model.creationId");
        String str = ((AbstractC156986Ec) aqS34S0301000_2.l0).LIZIZ().mShootWay;
        o.LJIIIIZZ(str, "model.mShootWay");
        String valueOf = String.valueOf(((AbstractC156986Ec) aqS34S0301000_2.l0).LIZIZ().draftId);
        String LJIIIZ = H7R.LJIIIZ(((AbstractC156986Ec) aqS34S0301000_2.l0).LIZIZ());
        String LJIIIIZZ = H7R.LJIIIIZZ(((AbstractC156986Ec) aqS34S0301000_2.l0).LIZIZ());
        String musicId = ((AbstractC156986Ec) aqS34S0301000_2.l0).LIZIZ().getMusicId();
        int i4 = aqS34S0301000_2.i3;
        Map map5 = (Map) aqS34S0301000_2.l1;
        if ((map5 == null || (preCheckResult3 = (PreCheckResult) map5.get(Integer.valueOf(i4))) == null || (arrayList = preCheckResult3.unavailableReasons) == null || arrayList.isEmpty()) && ((map2 = (Map) aqS34S0301000_2.l1) == null || (preCheckResult2 = (PreCheckResult) map2.get(Integer.valueOf(aqS34S0301000_2.i3))) == null || preCheckResult2.unavailableReasonsV1 == 0)) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        C6ES.LJI(creationId, str, valueOf, LJIIIZ, LJIIIIZZ, musicId, i4, i2, System.currentTimeMillis() - ((AbstractC156986Ec) aqS34S0301000_2.l0).LIZIZ().creativeModel.audioCopyrightDetectModel.getDetectStart(), ((AbstractC156986Ec) aqS34S0301000_2.l0).LIZIZ().getVideoLength(), C78983UzD.LJJJJJL(((AbstractC156986Ec) aqS34S0301000_2.l0).LIZIZ()) ? 1 : 0);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS34S0301000_2(int i, NLETrackSlot nLETrackSlot, C58D c58d, C127604zc c127604zc, int i2) {
        super(0);
        this.$t = i2;
        this.i3 = i;
        this.l0 = nLETrackSlot;
        this.l1 = c58d;
        this.l2 = c127604zc;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS34S0301000_2(C34K c34k, C139875eJ c139875eJ, int i, C140335f3 c140335f3, int i2) {
        super(0);
        this.$t = i2;
        this.l0 = c34k;
        this.l1 = c139875eJ;
        this.i3 = i;
        this.l2 = c140335f3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AqS34S0301000_2(AbstractC156986Ec abstractC156986Ec, AbstractC156986Ec abstractC156986Ec2, Map<Integer, PreCheckResult> map, int i, AbstractC157016Ef abstractC157016Ef) {
        super(0);
        this.$t = abstractC157016Ef;
        this.l0 = abstractC156986Ec;
        this.l1 = abstractC156986Ec2;
        this.i3 = map;
        this.l2 = i;
    }
}
