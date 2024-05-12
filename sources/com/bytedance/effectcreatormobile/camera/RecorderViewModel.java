package com.bytedance.effectcreatormobile.camera;

import X.C16880lQ;
import X.C63942P7q;
import X.C84133X0f;
import X.C87278YNe;
import X.C93881aY1;
import X.C93886aY6;
import X.C93901aYL;
import X.C94305aer;
import X.C94473ahZ;
import X.P6F;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.ss.android.vesdk.VEAudioEncodeSettings;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEPreviewSettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import com.ss.android.vesdk.runtime.VEEffectConfig;
import com.ss.android.vesdk.runtime.VERuntime;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public final class RecorderViewModel extends ViewModel {
    public final C93886aY6 LJLIL;

    public RecorderViewModel() {
        C93886aY6 c93886aY6 = new C93886aY6();
        this.LJLIL = c93886aY6;
        Context context = C93901aYL.LIZ;
        o.LJI(context);
        File file = new File(C16880lQ.LLIIIZ(context), "workspace");
        if (!file.exists()) {
            file.mkdir();
        }
        C63942P7q.LJFF(C16880lQ.LLLLL(context), file.getAbsolutePath());
        c93886aY6.LIZ = context;
        VERuntime.getInstance().enableRefactorRecorder(true);
        P6F p6f = c93886aY6.LJ;
        if (p6f != null) {
            p6f.LJJ();
        }
        c93886aY6.LJ = new P6F();
        c93886aY6.LIZLLL = new VERecorder(file.getAbsolutePath(), context);
        P6F p6f2 = c93886aY6.LJ;
        if (p6f2 != null) {
            VECameraSettings LIZ = C93881aY1.LIZ(c93886aY6.LJFF);
            p6f2.LJLJI = LIZ;
            p6f2.LJLJJI = LIZ.getPreviewSize();
            p6f2.LJLJJL = Math.min(p6f2.LJLJI.getFps(), 60);
        }
        VERecorder vERecorder = c93886aY6.LIZLLL;
        if (vERecorder != null) {
            vERecorder.LIZIZ.addRecorderStateListener(new C94473ahZ(c93886aY6));
        }
        VERecorder vERecorder2 = c93886aY6.LIZLLL;
        if (vERecorder2 != null) {
            C87278YNe c87278YNe = new C87278YNe(1);
            VEVideoEncodeSettings.ENCODE_STANDARD encode_standard = VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_H264;
            c87278YNe.LIZIZ.encodeStandard = encode_standard.ordinal();
            c87278YNe.LIZIZ.isSupportHWEncoder = true;
            VEVideoEncodeSettings LIZ2 = c87278YNe.LIZ();
            o.LJIIIIZZ(LIZ2, "VEVideoEncodeSettings.Bu…rue)\n            .build()");
            VEAudioEncodeSettings.Builder builder = new VEAudioEncodeSettings.Builder();
            builder.setChannelCount(2);
            builder.setSampleRate(44100);
            builder.setCodec(VEAudioEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_AAC);
            VEAudioEncodeSettings Build = builder.Build();
            o.LJIIIIZZ(Build, "VEAudioEncodeSettings.Bu…AAC)\n            .Build()");
            VESize vESize = c93886aY6.LJI;
            VEPreviewSettings.Builder builder2 = new VEPreviewSettings.Builder();
            o.LJI(vESize);
            builder2.setRenderSize(vESize);
            builder2.enableCheckStatusWhenStopPreview(true);
            builder2.enableDestroyEffectInStopPreview(false);
            VEPreviewSettings build = builder2.build();
            o.LJIIIIZZ(build, "VEPreviewSettings.Builde…lse)\n            .build()");
            vERecorder2.LIZLLL(LIZ2, Build, build, false);
        }
        VERecorder vERecorder3 = c93886aY6.LIZLLL;
        if (vERecorder3 != null) {
            vERecorder3.LIZIZ.enableEffect(true);
        }
        VERecorder vERecorder4 = c93886aY6.LIZLLL;
        if (vERecorder4 != null) {
            vERecorder4.LIZIZ.setComposerMode(1, 0);
        }
        VEEffectConfig.setABConfigValue("enable_amazing_scene_part_manager", Boolean.TRUE, 0);
        VERecorder LJ = c93886aY6.LJ();
        LJ.LIZIZ.regEffectAlgorithmCallback(C94305aer.LIZ);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C93886aY6 c93886aY6 = this.LJLIL;
        P6F p6f = c93886aY6.LJ;
        if (p6f != null) {
            p6f.LJJ();
        }
        C84133X0f c84133X0f = c93886aY6.LIZJ;
        if (c84133X0f != null) {
            C93886aY6.LIZJ(c84133X0f);
        }
        MutableLiveData<Boolean> mutableLiveData = c93886aY6.LJII;
        Boolean bool = Boolean.FALSE;
        mutableLiveData.setValue(bool);
        VERecorder vERecorder = c93886aY6.LIZLLL;
        if (vERecorder != null) {
            vERecorder.LIZIZ.stopPreview();
        }
        VERecorder vERecorder2 = c93886aY6.LIZLLL;
        if (vERecorder2 != null) {
            vERecorder2.LJ();
        }
        VEEffectConfig.setABConfigValue("enable_amazing_scene_part_manager", bool, 0);
    }
}
