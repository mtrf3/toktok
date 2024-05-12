package X;

import com.bytedance.effectcreatormobile.modelselect.impl.ModelSelectImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.abL, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94087abL implements InterfaceC93663aUV<C94355aff> {
    public final /* synthetic */ ModelSelectImpl LIZ;
    public final /* synthetic */ C68322mC LIZIZ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        ((InterfaceC88472Yns) this.LIZIZ.element).invoke(null);
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(C94355aff c94355aff) {
        C94355aff result = c94355aff;
        o.LJIIIZ(result, "result");
        if (result.LJLIL.isEmpty()) {
            C94034aaU.LIZ("ModelSelectImpl", "false: modelPictureList is Empty");
            ((InterfaceC88472Yns) this.LIZIZ.element).invoke(null);
            return;
        }
        C94256ae4 findCachedModel = this.LIZ.findCachedModel(C93950aZ8.LIZ(), result);
        if (findCachedModel != null) {
            new C93996aZs(this.LIZ).LIZIZ(findCachedModel, false, new IDqS419S0100000_42(this, 9));
            C94034aaU.LIZ("ModelSelectImpl", "true: cached shot");
            return;
        }
        for (Map.Entry<String, List<C94256ae4>> entry : result.LJLIL.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                new C93996aZs(this.LIZ).LIZIZ((C94256ae4) ListProtector.get(entry.getValue(), 0), false, new IDqS419S0100000_42(this, 10));
                C94034aaU.LIZ("ModelSelectImpl", "true: use the first");
                return;
            }
        }
        C94034aaU.LIZ("ModelSelectImpl", "false: no model picture");
        ((InterfaceC88472Yns) this.LIZIZ.element).invoke(null);
    }

    public C94087abL(ModelSelectImpl modelSelectImpl, C68322mC c68322mC) {
        this.LIZ = modelSelectImpl;
        this.LIZIZ = c68322mC;
    }
}
