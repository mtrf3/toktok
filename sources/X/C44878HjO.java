package X;

import android.view.ViewGroup;
import com.bytedance.bpea.basics.PrivacyCert;
import com.ss.android.ugc.aweme.creative.compileConfig.VEVideoEncodeConfigParams;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.HjO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C44878HjO {
    public static LinkedHashMap LIZIZ(ViewGroup viewGroup, String str) {
        o.LJIIIZ(viewGroup, str);
        return new LinkedHashMap();
    }

    public static void LIZJ(String str, long j, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(j);
        C0NB.LJIIIZ(str2, X1D.LIZIZ(LIZ));
    }

    public static PrivacyCert.Builder LIZ(PrivacyCert.Builder.Companion companion, String str, String str2, String str3) {
        PrivacyCert.Builder with = companion.with(str);
        with.usage(str2);
        with.tag(str3);
        return with;
    }

    public static void LIZLLL(StringBuilder sb, String str, VEVideoEncodeConfigParams vEVideoEncodeConfigParams, char c, char c2) {
        sb.append(str);
        sb.append(vEVideoEncodeConfigParams.getCurStage());
        sb.append(c);
        sb.append(vEVideoEncodeConfigParams.getCurStrategyName());
        sb.append(c2);
        sb.append(vEVideoEncodeConfigParams.getCurPriority());
    }
}
