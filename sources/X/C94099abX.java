package X;

import com.bytedance.effectcreatormobile.resource.ep.impl.BehaviourResProviderImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.abX, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94099abX implements InterfaceC93663aUV<List<? extends C94384ag8>> {
    public final /* synthetic */ C34K LIZ;
    public final /* synthetic */ XJL LIZIZ;
    public final /* synthetic */ BehaviourResProviderImpl LIZJ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        this.LIZJ.actionCache = null;
        if (this.LIZ.element) {
            return;
        }
        XJL xjl = this.LIZIZ;
        C94381ag5 c94381ag5 = new C94381ag5(false, C61878OQg.INSTANCE);
        C3C5.m7constructorimpl(c94381ag5);
        xjl.resumeWith(c94381ag5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC93663aUV
    public final void onSuccess(List<? extends C94384ag8> list) {
        List<? extends C94384ag8> result = list;
        o.LJIIIZ(result, "result");
        this.LIZJ.actionCache = result;
        if (this.LIZ.element) {
            return;
        }
        XJL xjl = this.LIZIZ;
        C94381ag5 c94381ag5 = new C94381ag5(true, result);
        C3C5.m7constructorimpl(c94381ag5);
        xjl.resumeWith(c94381ag5);
    }

    public C94099abX(C34K c34k, XKS xks, BehaviourResProviderImpl behaviourResProviderImpl) {
        this.LIZ = c34k;
        this.LIZIZ = xks;
        this.LIZJ = behaviourResProviderImpl;
    }
}
