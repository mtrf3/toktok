package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.effectcreatormobile.ckeapi.api.draft.EffectPackageData;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.effectcreator.services.TiktokEffectCreatePipelineImpl;

/* renamed from: X.ac7, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94135ac7 implements OnActivityResultCallback {
    public final /* synthetic */ TiktokEffectCreatePipelineImpl LJLIL;
    public final /* synthetic */ Activity LJLILLLLZI;
    public final /* synthetic */ EffectPackageData LJLJI;
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C94135ac7(TiktokEffectCreatePipelineImpl tiktokEffectCreatePipelineImpl, Activity activity, EffectPackageData effectPackageData, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        this.LJLIL = tiktokEffectCreatePipelineImpl;
        this.LJLILLLLZI = activity;
        this.LJLJI = effectPackageData;
        this.LJLJJI = interfaceC88472Yns;
    }

    @Override // com.bytedance.router.OnActivityResultCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "save_draft_id");
            this.LJLIL.onDraftOrEffectSavedSuccess(this.LJLILLLLZI, this.LJLJI, C16880lQ.LLJJIJIIJIL(intent, "published_effect_id"), LLJJIJIIJIL);
            return;
        }
        this.LJLJJI.invoke(Integer.valueOf(i2));
    }
}
