package X;

import Y.AObserverS38S0110000_1;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentTransition;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.listener.IMonitorService;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.5oS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C146165oS implements IMonitorService {
    public static int LIZ = -1;
    public static String LIZIZ;
    public static String LIZJ;
    public static String LIZLLL;
    public static String LJ;
    public static String LJFF;
    public static int LJI;
    public static int LJII;
    public static String LJIIIIZZ;

    public static String LJFF() {
        HashMap hashMap = new HashMap();
        hashMap.put("app_id", Integer.valueOf(LIZ));
        hashMap.put("app_name", LIZIZ);
        hashMap.put("screen_width", Integer.valueOf(LJI));
        hashMap.put("screen_height", Integer.valueOf(LJII));
        String str = LJ;
        if (str != null && !str.isEmpty()) {
            hashMap.put("did", LJ);
        }
        String str2 = LIZLLL;
        if (str2 != null && !str2.isEmpty()) {
            hashMap.put("app_version", LIZLLL);
        }
        return new JSONObject(hashMap).toString();
    }

    public static final MediatorLiveData LIZIZ(MutableLiveData mutableLiveData) {
        o.LJIIIZ(mutableLiveData, "<this>");
        MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(mutableLiveData, new AObserverS38S0110000_1(mediatorLiveData, 0));
        return mediatorLiveData;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
    
        if (r2 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot r9, com.bytedance.ies.nle.editor_jni.NLETrackSlot r10) {
        /*
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r9.LJI()
            com.bytedance.ies.nle.editor_jni.NLESegmentVideo r6 = com.bytedance.ies.nle.editor_jni.NLESegmentVideo.LJJ(r0)
            r8 = 1
            if (r6 != 0) goto Lc
            return r8
        Lc:
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r10.LJI()
            com.bytedance.ies.nle.editor_jni.NLESegmentVideo r5 = com.bytedance.ies.nle.editor_jni.NLESegmentVideo.LJJ(r0)
            if (r5 != 0) goto L17
            return r8
        L17:
            long r3 = r6.LJIILIIL()
            long r1 = r5.LJIILIIL()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2f
            long r3 = r6.LJIIL()
            long r1 = r5.LJIIL()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L30
        L2f:
            return r8
        L30:
            long r3 = r9.getStartTime()
            long r1 = r10.getStartTime()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L2f
            long r3 = r9.getEndTime()
            long r1 = r10.getEndTime()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L49
            goto L2f
        L49:
            float r1 = r6.getSpeed()
            float r0 = r5.getSpeed()
            r7 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto Led
            double r3 = r6.LJFF()
            double r1 = r5.LJFF()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto Lec
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r6 = r6.LIZIZ()
            if (r6 == 0) goto L89
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r5 = r5.LIZIZ()
            if (r5 == 0) goto L89
            long r3 = r6.getDuration()
            long r1 = r5.getDuration()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L88
            java.lang.String r1 = r6.LIZJ()
            java.lang.String r0 = r5.LIZJ()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L89
        L88:
            return r8
        L89:
            com.bytedance.ies.nle.editor_jni.NLESegmentTransition r3 = r9.LIZLLL()
            com.bytedance.ies.nle.editor_jni.NLESegmentTransition r2 = r10.LIZLLL()
            if (r3 != 0) goto La4
            if (r2 != 0) goto La6
        L95:
            com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr r1 = r9.LJIIJ()
            com.bytedance.ies.nle.editor_jni.VecNLEVideoEffectSPtr r0 = r10.LJIIJ()
            boolean r0 = LIZLLL(r1, r0)
            if (r0 == 0) goto Lbe
            return r8
        La4:
            if (r2 != 0) goto La7
        La6:
            return r8
        La7:
            boolean r1 = r3.LJ()
            boolean r0 = r2.LJ()
            if (r1 != r0) goto Lbd
            long r3 = r3.LJFF()
            long r1 = r2.LJFF()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L95
        Lbd:
            return r8
        Lbe:
            com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr r1 = r9.LJ()
            com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr r0 = r10.LJ()
            boolean r0 = LIZLLL(r1, r0)
            if (r0 == 0) goto Lcd
            return r8
        Lcd:
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r1 = r9.LJIIIIZZ()
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r0 = r10.LJIIIIZZ()
            if (r1 != 0) goto Lda
            if (r0 != 0) goto Ldc
        Ld9:
            return r7
        Lda:
            if (r0 != 0) goto Ldd
        Ldc:
            return r8
        Ldd:
            java.lang.String r1 = r1.getStringId()
            java.lang.String r0 = r0.getStringId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto Ld9
            return r8
        Lec:
            return r8
        Led:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146165oS.LIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLETrackSlot):boolean");
    }

    public static boolean LIZLLL(List list, List list2) {
        if (list.size() != list2.size()) {
            return true;
        }
        int i = 0;
        for (Object obj : list2) {
            int i2 = i + 1;
            if (i >= 0) {
                if (!o.LJ(((NLENode) obj).getStringId(), ((NLENode) ListProtector.get(list, i)).getStringId())) {
                    return true;
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        return false;
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public void monitorCommonLog(String str, JSONObject jSONObject) {
        C60903NvH.LJIIJJI().LJJIIZI().LJIJ(str, jSONObject);
    }

    public static final void LIZJ(int i, VecNLETrackSlotSPtr vecNLETrackSlotSPtr, long[] jArr) {
        long j;
        NLETrackSlot nLETrackSlot;
        NLESegmentTransition LIZLLL2;
        NLETrackSlot nLETrackSlot2 = (NLETrackSlot) ORZ.LJLLLLLL(i, vecNLETrackSlotSPtr);
        long j2 = 0;
        if (nLETrackSlot2 == null) {
            jArr[0] = 0;
            jArr[1] = 0;
            return;
        }
        long startTime = nLETrackSlot2.getStartTime();
        long endTime = nLETrackSlot2.getEndTime();
        NLESegmentTransition LIZLLL3 = nLETrackSlot2.LIZLLL();
        if (LIZLLL3 != null && LIZLLL3.LJ()) {
            j = LIZLLL3.LJFF() / 2;
        } else {
            j = 0;
        }
        if (i > 0 && i < vecNLETrackSlotSPtr.size() && (LIZLLL2 = (nLETrackSlot = (NLETrackSlot) ListProtector.get(vecNLETrackSlotSPtr, i - 1)).LIZLLL()) != null && LIZLLL2.LJ()) {
            NLESegmentTransition LIZLLL4 = nLETrackSlot.LIZLLL();
            if (LIZLLL4 != null) {
                j2 = LIZLLL4.LJFF();
            }
            j2 /= 2;
        }
        jArr[0] = startTime + j2;
        jArr[1] = endTime - j;
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public void monitorCommonLog(String str, String str2, JSONObject jSONObject) {
        C60903NvH.LJIIJJI().LJJIIZI().LJIILLIIL(str, str2, jSONObject);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public void monitorDirectOnTimer(String str, String str2, float f) {
        C60903NvH.LJIIJJI().LJJIIZI().LJIILL(str, str2, f);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public void monitorOnTimer(String str, String str2, float f) {
        C60903NvH.LJIIJJI().LJJIIZI().LJIILL(str, str2, f);
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public void monitorStatusRate(String str, int i, JSONObject jSONObject) {
        C60903NvH.LJIIJJI().LJJIIZI().LJI(str, i, jSONObject, Boolean.TRUE);
    }

    public static void LJ(List list, InterfaceC65503PnH interfaceC65503PnH, int i, int i2) {
        int size = list.size();
        while (true) {
            size--;
            if (size <= i2) {
                break;
            } else if (interfaceC65503PnH.apply(ListProtector.get(list, size))) {
                ListProtector.remove(list, size);
            }
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                ListProtector.remove(list, i2);
            } else {
                return;
            }
        }
    }

    @Override // com.ss.android.ugc.effectmanager.common.listener.IMonitorService
    public void monitorStatusAndDuration(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        C60903NvH.LJIIJJI().LJJIIZI().LIZLLL(str, i, jSONObject, jSONObject2);
    }
}
