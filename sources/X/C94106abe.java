package X;

import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectHint;
import com.bytedance.effectcreatormobile.resource.ep.impl.EffectHintGuideResProviderImpl;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.abe, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94106abe implements InterfaceC93663aUV<LinkedHashMap<String, EffectHint>> {
    public final /* synthetic */ C34K LIZ;
    public final /* synthetic */ XJL LIZIZ;
    public final /* synthetic */ EffectHintGuideResProviderImpl LIZJ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        this.LIZJ.effectHintCache = null;
        if (this.LIZ.element) {
            return;
        }
        XJL xjl = this.LIZIZ;
        C94382ag6 c94382ag6 = new C94382ag6(false, new LinkedHashMap());
        C3C5.m7constructorimpl(c94382ag6);
        xjl.resumeWith(c94382ag6);
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(LinkedHashMap<String, EffectHint> linkedHashMap) {
        LinkedHashMap<String, EffectHint> result = linkedHashMap;
        o.LJIIIZ(result, "result");
        this.LIZJ.effectHintCache = result;
        if (this.LIZ.element) {
            return;
        }
        XJL xjl = this.LIZIZ;
        C94382ag6 c94382ag6 = new C94382ag6(true, result);
        C3C5.m7constructorimpl(c94382ag6);
        xjl.resumeWith(c94382ag6);
    }

    public C94106abe(C34K c34k, XKS xks, EffectHintGuideResProviderImpl effectHintGuideResProviderImpl) {
        this.LIZ = c34k;
        this.LIZIZ = xks;
        this.LIZJ = effectHintGuideResProviderImpl;
    }
}
