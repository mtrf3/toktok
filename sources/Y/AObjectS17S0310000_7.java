package Y;

import X.C44226HXi;
import X.C60903NvH;
import X.InterfaceC29911Fj;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.services.audio.IAudioGlitchService;
import com.ss.android.vesdk.VEAudioCapture;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AObjectS17S0310000_7 implements InterfaceC29911Fj {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            default:
                return;
        }
    }

    public static final void onChanged$0(AObjectS17S0310000_7 aObjectS17S0310000_7, Object obj) {
        IAudioGlitchService iAudioGlitchService;
        IAudioGlitchService iAudioGlitchService2 = ((C44226HXi) aObjectS17S0310000_7.l0).LJLLLLLL;
        if (iAudioGlitchService2 != null) {
            iAudioGlitchService2.startDevicesChangedListener();
        }
        IAudioGlitchService iAudioGlitchService3 = ((C44226HXi) aObjectS17S0310000_7.l0).LJLLLLLL;
        if (iAudioGlitchService3 != null) {
            iAudioGlitchService3.enableRecordGlitchInShootScene((VEAudioCapture) aObjectS17S0310000_7.l1, true);
        }
        if ((aObjectS17S0310000_7.z3 || ((C44226HXi) aObjectS17S0310000_7.l0).LJLJJL.LJJIJIL()) && (iAudioGlitchService = ((C44226HXi) aObjectS17S0310000_7.l0).LJLLLLLL) != null) {
            iAudioGlitchService.enablePlayGlitchInShootScene((VERecorder) aObjectS17S0310000_7.l2, true);
        }
        C60903NvH.LJIIJJI().LJIILIIL().updateCurrentScene("tool_recording", true);
    }

    public static final void onChanged$1(AObjectS17S0310000_7 aObjectS17S0310000_7, Object obj) {
        C44226HXi c44226HXi;
        IAudioGlitchService iAudioGlitchService;
        IAudioGlitchService iAudioGlitchService2 = ((C44226HXi) aObjectS17S0310000_7.l0).LJLLLLLL;
        if (iAudioGlitchService2 != null) {
            iAudioGlitchService2.getRecordGlitchAndReportInShootScene((VEAudioCapture) aObjectS17S0310000_7.l1);
        }
        if ((aObjectS17S0310000_7.z3 || ((C44226HXi) aObjectS17S0310000_7.l0).LJLJJL.LJJIJIL()) && (iAudioGlitchService = (c44226HXi = (C44226HXi) aObjectS17S0310000_7.l0).LJLLLLLL) != null) {
            CreativeModel creativeModel = c44226HXi.LJLJJL.creativeModel;
            o.LJIIIIZZ(creativeModel, "shortVideoContext.creativeModel");
            VERecorder vERecorder = (VERecorder) aObjectS17S0310000_7.l2;
            boolean z = aObjectS17S0310000_7.z3;
            String LJI = ((C44226HXi) aObjectS17S0310000_7.l0).LJLJJL.LJI();
            o.LJIIIIZZ(LJI, "shortVideoContext.creationId");
            iAudioGlitchService.getPlayGlitchAndReportInShootScene(creativeModel, vERecorder, z, LJI);
        }
        IAudioGlitchService iAudioGlitchService3 = ((C44226HXi) aObjectS17S0310000_7.l0).LJLLLLLL;
        if (iAudioGlitchService3 != null) {
            iAudioGlitchService3.enableRecordGlitchInShootScene((VEAudioCapture) aObjectS17S0310000_7.l1, false);
        }
        IAudioGlitchService iAudioGlitchService4 = ((C44226HXi) aObjectS17S0310000_7.l0).LJLLLLLL;
        if (iAudioGlitchService4 != null) {
            iAudioGlitchService4.enablePlayGlitchInShootScene((VERecorder) aObjectS17S0310000_7.l2, false);
        }
        IAudioGlitchService iAudioGlitchService5 = ((C44226HXi) aObjectS17S0310000_7.l0).LJLLLLLL;
        if (iAudioGlitchService5 != null) {
            iAudioGlitchService5.stopDevicesChangedListener();
        }
        C60903NvH.LJIIJJI().LJIILIIL().updateCurrentScene("tool_recording", false);
    }

    public AObjectS17S0310000_7(C44226HXi c44226HXi, VEAudioCapture vEAudioCapture, boolean z, VERecorder vERecorder, int i) {
        this.$t = i;
        this.l0 = c44226HXi;
        this.l1 = vEAudioCapture;
        this.z3 = z;
        this.l2 = vERecorder;
    }
}
