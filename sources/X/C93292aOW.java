package X;

import com.bytedance.pitaya.jniwrapper.PitayaNativeInstance;
import com.bytedance.pitaya.log.PitayaLogger;
import kotlin.jvm.internal.o;

/* renamed from: X.aOW, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93292aOW {
    public static void LIZ(String str, String content) {
        o.LJIIJ(content, "content");
        try {
            PitayaNativeInstance.nativeSocketLog(str, content);
        } catch (UnsatisfiedLinkError e) {
            PitayaLogger.LJ(e, null, 6);
        }
    }
}
