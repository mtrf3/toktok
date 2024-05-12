package X;

import android.os.Build;
import android.os.Process;
import com.bytedance.ies.nle.editor_jni.NLEAudioBeatTracking;
import com.bytedance.ies.nle.editor_jni.NLEBeatTrackingInfo;
import com.bytedance.ies.nle.editor_jni.NLEBeatTrackingParam;
import com.bytedance.ies.nle.editor_jni.NLEMediaJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEMediaPublicJniJNI;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.VecNLEBeatTrackingInfo;
import com.ss.android.ugc.gamora.editorpro.audio.BeatInfo;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.audio.MusicBeatGenerate$generateBeatsFromLocalAlg$2", f = "MusicBeatGenerate.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5hb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141915hb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends BeatInfo>>, Object> {
    public final /* synthetic */ NLESegmentAudio LJLIL;
    public final /* synthetic */ C141945he LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C141915hb(NLESegmentAudio nLESegmentAudio, C141945he c141945he, String str, InterfaceC67352kd<? super C141915hb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = nLESegmentAudio;
        this.LJLILLLLZI = c141945he;
        this.LJLJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C141915hb(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        long j;
        boolean z;
        NLEAudioBeatTracking nLEAudioBeatTracking;
        Integer num;
        C141335gf.LIZJ(obj);
        NLEResourceNode LIZIZ = this.LJLIL.LIZIZ();
        if (LIZIZ != null) {
            str = LIZIZ.LIZJ();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        NLEResourceNode LIZIZ2 = this.LJLIL.LIZIZ();
        if (LIZIZ2 != null) {
            j = LIZIZ2.getDuration();
        } else {
            j = 0;
        }
        this.LJLILLLLZI.getClass();
        if (Build.VERSION.SDK_INT >= 23) {
            z = Process.is64Bit();
        } else {
            z = false;
        }
        StringBuilder LIZJ = C06490Nh.LIZJ("generateBeatsFromLocalAlg: ", str, "  ", j);
        LIZJ.append("  ");
        LIZJ.append(z);
        H7C.LJI(3, "music", null, X1D.LIZIZ(LIZJ));
        if (!z && j > 60000) {
            return C61878OQg.INSTANCE;
        }
        VecNLEBeatTrackingInfo vecNLEBeatTrackingInfo = new VecNLEBeatTrackingInfo();
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C141945he c141945he = this.LJLILLLLZI;
            long NLEMediaUtil_createAudioBeatTracking = NLEMediaPublicJniJNI.NLEMediaUtil_createAudioBeatTracking();
            if (NLEMediaUtil_createAudioBeatTracking == 0) {
                nLEAudioBeatTracking = null;
            } else {
                nLEAudioBeatTracking = new NLEAudioBeatTracking(NLEMediaUtil_createAudioBeatTracking);
            }
            c141945he.LJFF = nLEAudioBeatTracking;
            NLEAudioBeatTracking nLEAudioBeatTracking2 = this.LJLILLLLZI.LJFF;
            if (nLEAudioBeatTracking2 != null) {
                NLEBeatTrackingParam nLEBeatTrackingParam = new NLEBeatTrackingParam();
                String str2 = this.LJLJI;
                NLEMediaJniJNI.NLEBeatTrackingParam_filePath_set(nLEBeatTrackingParam.LIZ, nLEBeatTrackingParam, str);
                NLEMediaJniJNI.NLEBeatTrackingParam_modelPath_set(nLEBeatTrackingParam.LIZ, nLEBeatTrackingParam, str2);
                NLEMediaJniJNI.NLEBeatTrackingParam_trimIn_set(nLEBeatTrackingParam.LIZ, nLEBeatTrackingParam, 0L);
                NLEMediaJniJNI.NLEBeatTrackingParam_trimOut_set(nLEBeatTrackingParam.LIZ, nLEBeatTrackingParam, j);
                NLEMediaJniJNI.NLEBeatTrackingParam_slice_set(nLEBeatTrackingParam.LIZ, nLEBeatTrackingParam, 0L);
                num = new Integer(NLEMediaPublicJniJNI.NLEAudioBeatTracking_process(nLEAudioBeatTracking2.LIZ, nLEAudioBeatTracking2, nLEBeatTrackingParam.LIZ, nLEBeatTrackingParam, vecNLEBeatTrackingInfo.LJLIL, vecNLEBeatTrackingInfo));
            } else {
                num = null;
            }
            this.LJLILLLLZI.LJFF = null;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("audioBeatsTrackingProgress cost:");
            LIZ.append(System.currentTimeMillis() - currentTimeMillis);
            LIZ.append("  result:");
            LIZ.append(num);
            H7C.LJI(3, "music", null, X1D.LIZIZ(LIZ));
            Iterator<NLEBeatTrackingInfo> it = vecNLEBeatTrackingInfo.iterator();
            while (it.hasNext()) {
                NLEBeatTrackingInfo next = it.next();
                arrayList.add(new BeatInfo(C78926UyI.LJJIZ(NLEMediaJniJNI.NLEBeatTrackingInfo_offset_get(next.LIZ, next)), NLEMediaJniJNI.NLEBeatTrackingInfo_beat_get(next.LIZ, next)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return C61878OQg.INSTANCE;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends BeatInfo>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
