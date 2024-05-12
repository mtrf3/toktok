package X;

import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.JpI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C50340JpI {
    public static final /* synthetic */ int LIZIZ = 0;
    public final InterfaceC60761Nsz LIZ;

    public C50340JpI(InterfaceC60761Nsz lynxKitView) {
        o.LJIIIZ(lynxKitView, "lynxKitView");
        this.LIZ = lynxKitView;
    }

    public void LIZIZ(TemplateData data) {
        o.LJIIIZ(data, "data");
        Object obj = this.LIZ;
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
        ((VNS) obj).updateData(data);
    }

    public void LIZJ(DynamicPatch dynamicPatch) {
        Object obj = this.LIZ;
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
        ((VNS) obj).updateData(dynamicPatch.getRawData());
    }

    public void LIZLLL(String raw) {
        o.LJIIIZ(raw, "raw");
        Object obj = this.LIZ;
        o.LJII(obj, "null cannot be cast to non-null type com.bytedance.lynx.hybrid.LynxKitView");
        ((VNS) obj).updateData(raw);
    }

    public void LIZ(String str, JSONObject params) {
        o.LJIIIZ(params, "params");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        Iterator<String> keys = params.keys();
        o.LJIIIIZZ(keys, "params.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            javaOnlyMap2.put(next, params.opt(next));
        }
        javaOnlyMap.put("data", javaOnlyMap2);
        this.LIZ.LJIIJ(str, C47261Igj.LJJIJ(javaOnlyMap));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendEventToFe by spark:");
        LIZ.append(str);
        LIZ.append(" and params");
        LIZ.append(params);
        LIZ.append(" and final data： ");
        LIZ.append(javaOnlyMap);
        C15280iq.LIZIZ("SparkInfo", X1D.LIZIZ(LIZ));
    }
}
