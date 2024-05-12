package X;

import android.graphics.Rect;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.lynx.react.bridge.JavaOnlyMap;

/* loaded from: classes15.dex */
public class VOD {
    public Rect LIZ;
    public Rect LIZIZ;
    public Rect LIZJ;
    public float LIZLLL;
    public String LJ;

    public final JavaOnlyMap LIZIZ() {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putMap("relativeRect", LIZ(this.LIZ));
        javaOnlyMap.putMap("boundingClientRect", LIZ(this.LIZIZ));
        javaOnlyMap.putMap("intersectionRect", LIZ(this.LIZJ));
        javaOnlyMap.putDouble("intersectionRatio", this.LIZLLL);
        javaOnlyMap.putDouble("time", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        javaOnlyMap.putString("observerId", this.LJ);
        return javaOnlyMap;
    }

    public static JavaOnlyMap LIZ(Rect rect) {
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (rect != null) {
            javaOnlyMap.putDouble("left", Math.round(rect.left));
            javaOnlyMap.putDouble("right", Math.round(rect.right));
            javaOnlyMap.putDouble("top", Math.round(rect.top));
            javaOnlyMap.putDouble("bottom", Math.round(rect.bottom));
        } else {
            javaOnlyMap.putDouble("left", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            javaOnlyMap.putDouble("right", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            javaOnlyMap.putDouble("top", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            javaOnlyMap.putDouble("bottom", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        }
        return javaOnlyMap;
    }
}
