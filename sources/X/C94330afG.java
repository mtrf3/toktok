package X;

import com.bytedance.effectcreatormobile.ckeapi.api.store.IStore;
import kotlin.jvm.internal.o;

/* renamed from: X.afG, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94330afG implements InterfaceC93663aUV<String> {
    public final /* synthetic */ XJL LIZ;
    public final /* synthetic */ C93930aYo LIZIZ;
    public final /* synthetic */ boolean LIZJ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
        XJL xjl = this.LIZ;
        C3C5.m7constructorimpl("");
        xjl.resumeWith("");
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(String str) {
        String result = str;
        o.LJIIIZ(result, "result");
        if (this.LIZJ) {
            IStore iStore = this.LIZIZ.LIZ;
            if (iStore != null) {
                iStore.updateDraftTime();
            }
            IStore iStore2 = this.LIZIZ.LIZ;
            if (iStore2 != null) {
                iStore2.updateSDKVersion4MainDraft();
            }
            IStore iStore3 = this.LIZIZ.LIZ;
            if (iStore3 != null) {
                iStore3.saveMainDraft(result);
            }
        }
        XJL xjl = this.LIZ;
        C3C5.m7constructorimpl(result);
        xjl.resumeWith(result);
    }

    public C94330afG(XKS xks, C93930aYo c93930aYo, boolean z) {
        this.LIZ = xks;
        this.LIZIZ = c93930aYo;
        this.LIZJ = z;
    }
}
