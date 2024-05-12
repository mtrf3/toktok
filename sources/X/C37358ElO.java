package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* renamed from: X.ElO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37358ElO<T> implements BQ6 {
    public final /* synthetic */ CompletionBlock<EX9> LIZ;

    public C37358ElO(C37356ElM c37356ElM) {
        this.LIZ = c37356ElM;
    }

    @Override // X.BQ6
    public final void accept(Object obj) {
        java.util.Map<String, ? extends Object> map;
        Object obj2 = ((java.util.Map) obj).get("result");
        if (!(obj2 instanceof java.util.Map) || (map = (java.util.Map) obj2) == null) {
            C31626Cb8.LIZ(this.LIZ, -5, "The result is null", 4);
            return;
        }
        CompletionBlock<EX9> completionBlock = this.LIZ;
        XBaseModel LIZJ = ED5.LIZJ(EX9.class, null);
        ((EX9) LIZJ).setResult(map);
        completionBlock.onSuccess((XBaseResultModel) LIZJ, "");
    }
}
