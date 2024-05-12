package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ElM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37356ElM implements CompletionBlock<XBaseResultModel> {
    public final /* synthetic */ AbstractC37594EpC LIZ;
    public final /* synthetic */ EX0 LIZIZ;

    @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
    public final void onRawSuccess(XBaseResultModel xBaseResultModel) {
        java.util.Map<String, ? extends Object> linkedHashMap;
        if (xBaseResultModel == null || (linkedHashMap = xBaseResultModel.convert()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        this.LIZIZ.LIZ(linkedHashMap);
    }

    public C37356ElM(AbstractC37594EpC abstractC37594EpC, EX0 ex0) {
        this.LIZ = abstractC37594EpC;
        this.LIZIZ = ex0;
    }

    @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
    public final void onSuccess(XBaseResultModel result, String msg) {
        o.LJIIJ(result, "result");
        o.LJIIJ(msg, "msg");
        java.util.Map<String, ? extends Object> convert = result.convert();
        if (convert == null) {
            convert = new LinkedHashMap<>();
        }
        AbstractC37594EpC abstractC37594EpC = this.LIZ;
        EX0 callback = this.LIZIZ;
        abstractC37594EpC.getClass();
        o.LJIIJ(callback, "callback");
        if (abstractC37594EpC.LJFF()) {
            if (convert.get("originalResult") != null && (convert.get("originalResult") instanceof java.util.Map)) {
                Object obj = convert.get("originalResult");
                if (obj != null) {
                    callback.LIZ((java.util.Map) obj);
                    return;
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            }
            callback.LIZ(convert);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", 1);
        linkedHashMap.put("msg", msg);
        linkedHashMap.put("data", convert);
        callback.LIZ(linkedHashMap);
    }

    @Override // com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock
    public final void onFailure(int i, String msg, XBaseResultModel xBaseResultModel) {
        java.util.Map<String, ? extends Object> linkedHashMap;
        o.LJIIJ(msg, "msg");
        if (xBaseResultModel == null || (linkedHashMap = xBaseResultModel.convert()) == null) {
            linkedHashMap = new LinkedHashMap<>();
        }
        AbstractC37594EpC abstractC37594EpC = this.LIZ;
        EX0 callback = this.LIZIZ;
        abstractC37594EpC.getClass();
        o.LJIIJ(callback, "callback");
        if (abstractC37594EpC.LJFF()) {
            if (linkedHashMap.get("originalResult") != null && (linkedHashMap.get("originalResult") instanceof java.util.Map)) {
                Object obj = linkedHashMap.get("originalResult");
                if (obj != null) {
                    callback.LIZ((java.util.Map) obj);
                    return;
                }
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            }
            callback.LIZ(linkedHashMap);
            return;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("code", Integer.valueOf(i));
        linkedHashMap2.put("msg", msg);
        linkedHashMap2.put("data", linkedHashMap);
        callback.LIZ(linkedHashMap2);
    }
}
