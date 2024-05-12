package X;

import X.InterfaceC31180CLo;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.o;

/* renamed from: X.CLn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31179CLn<INPUT extends XBaseParamModel, OUTPUT extends InterfaceC31180CLo> extends AbstractC37594EpC<INPUT, OUTPUT> {
    public static void LJII(AbstractC31179CLn abstractC31179CLn, CompletionBlock completionBlock, EnumC37844EtE type) {
        abstractC31179CLn.getClass();
        o.LJIIIZ(completionBlock, "<this>");
        o.LJIIIZ(type, "type");
        if (type == EnumC37844EtE.WEB) {
            completionBlock.onRawSuccess(null);
        } else {
            completionBlock.onFailure(0, "", null);
        }
    }
}
