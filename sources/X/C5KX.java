package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.vesdk.ROTATE_DEGREE;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.o;

/* renamed from: X.5KX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KX extends C5KW {
    @Override // X.C5KW
    public final C133045Ka LJJIJIIJIL() {
        C133045Ka LJJIJIIJIL = super.LJJIJIIJIL();
        ListProtector.add(LJJIJIIJIL.LIZ, 0, new InterfaceC133065Kc() { // from class: X.5Kd
            @Override // X.InterfaceC133065Kc
            public final C5KG LIZIZ(InterfaceC133095Kf params) {
                o.LJIIIZ(params, "params");
                return null;
            }

            @Override // X.InterfaceC133065Kc
            public final C122104qk LIZ(NLEEditor empty, InterfaceC133095Kf params) {
                ROTATE_DEGREE[] rotate_degreeArr;
                ROTATE_DEGREE rotate_degree;
                o.LJIIIZ(empty, "empty");
                o.LJIIIZ(params, "params");
                int[] rotateArray = params.getRotateArray();
                if (rotateArray != null) {
                    int length = rotateArray.length;
                    rotate_degreeArr = new ROTATE_DEGREE[length];
                    for (int i = 0; i < length; i++) {
                        int i2 = (rotateArray[i] + 360) % 360;
                        if (i2 != 90) {
                            if (i2 != 180) {
                                if (i2 != 270) {
                                    rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
                                } else {
                                    rotate_degree = ROTATE_DEGREE.ROTATE_270;
                                }
                            } else {
                                rotate_degree = ROTATE_DEGREE.ROTATE_180;
                            }
                        } else {
                            rotate_degree = ROTATE_DEGREE.ROTATE_90;
                        }
                        rotate_degreeArr[i] = rotate_degree;
                    }
                } else {
                    rotate_degreeArr = null;
                }
                C5KD c5kd = new C5KD(params.getVideoPaths());
                c5kd.LIZ = params.getVTrimIn();
                c5kd.LIZIZ = params.getVTrimOut();
                c5kd.LIZLLL = params.getAudioPaths();
                c5kd.LJI = params.getSpeedArray();
                c5kd.LJII = rotate_degreeArr;
                c5kd.LIZIZ(C5NI.VIDEO_OUT_RATIO_ORIGINAL);
                return C5K8.LIZ(c5kd, empty);
            }
        });
        return LJJIJIIJIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5KX(C135235Sl config, ScheduledExecutorService scheduledExecutorService) {
        super(config);
        o.LJIIIZ(config, "config");
    }
}
