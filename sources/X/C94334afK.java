package X;

import com.bytedance.effectcreatormobile.ckeapi.api.store.IStore;
import com.bytedance.ugc.effectcreator.main.MainFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.afK, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94334afK implements InterfaceC93663aUV<String> {
    public final /* synthetic */ MainFragment LIZ;

    @Override // X.InterfaceC93663aUV
    public final void onFail() {
    }

    public C94334afK(MainFragment mainFragment) {
        this.LIZ = mainFragment;
    }

    @Override // X.InterfaceC93663aUV
    public final void onSuccess(String str) {
        String result = str;
        o.LJIIIZ(result, "result");
        IStore iStore = this.LIZ.LJZ;
        if (iStore != null) {
            iStore.updateDraftTime();
        }
        IStore iStore2 = this.LIZ.LJZ;
        if (iStore2 != null) {
            iStore2.updateSDKVersion4MainDraft();
        }
        IStore iStore3 = this.LIZ.LJZ;
        if (iStore3 != null) {
            iStore3.saveMainDraft(result);
        }
    }
}
