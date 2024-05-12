package X;

import android.content.Context;
import android.view.SurfaceView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.vesdk.ROTATE_DEGREE;
import dmt.av.video.VEPreviewParams;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS62S0400000_2;
import kotlin.jvm.internal.AqS91S0300000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5KW, reason: invalid class name */
/* loaded from: classes3.dex */
public class C5KW extends C5MG {
    public final C62822Ol8 LJJIJIIJI;

    public C133045Ka LJJIJIIJIL() {
        C133045Ka c133045Ka = new C133045Ka();
        ((ArrayList) c133045Ka.LIZ).add(new InterfaceC133065Kc() { // from class: X.5Ke
            @Override // X.InterfaceC133065Kc
            public final C5KG LIZIZ(InterfaceC133095Kf params) {
                ROTATE_DEGREE rotate_degree;
                o.LJIIIZ(params, "params");
                ROTATE_DEGREE[] rotate_degreeArr = null;
                if (params.getVTrimIn() == null || params.getVTrimOut() == null) {
                    return null;
                }
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
                }
                C5KD c5kd = new C5KD(params.getVideoPaths());
                c5kd.LIZ = params.getVTrimIn();
                c5kd.LIZIZ = params.getVTrimOut();
                c5kd.LIZLLL = params.getAudioPaths();
                c5kd.LJI = params.getSpeedArray();
                c5kd.LJII = rotate_degreeArr;
                c5kd.LIZIZ(C5NI.VIDEO_OUT_RATIO_ORIGINAL);
                return c5kd;
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
        return c133045Ka;
    }

    public C5KW(C135235Sl c135235Sl) {
        super(c135235Sl);
        this.LJJIJIIJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 54));
    }

    @Override // X.C5MG
    public NLEEditor LJII(VEPreviewParams params) {
        o.LJIIIZ(params, "params");
        NLEEditor LIZ = C122974s9.LIZ();
        C78841Uwv.LJJIIJ(this, new AqS91S0300000_2(this, LIZ, params, 1));
        return LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, X.4qk] */
    public final C122104qk LJJIJIIJI(NLEEditor empty, InterfaceC133095Kf params) {
        o.LJIIIZ(empty, "empty");
        o.LJIIIZ(params, "params");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new C122104qk();
        C78841Uwv.LJJIIJ(this, new AqS62S0400000_2(this, c68322mC, empty, params, 0));
        return (C122104qk) c68322mC.element;
    }

    @Override // X.C5MG
    public final int LJJII(Context context, InterfaceC133095Kf params, SurfaceView surfaceView, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(params, "params");
        super.LJJII(context, params, surfaceView, lifecycleOwner);
        return 0;
    }
}
