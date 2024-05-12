package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.ss.android.vesdk.VEUtils;

/* loaded from: classes8.dex */
public final class HN1 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ IAVProcessService.IProcessCallback<Integer> LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HN1(String str, String str2, IAVProcessService.IProcessCallback iProcessCallback) {
        super(0);
        this.LJLIL = iProcessCallback;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        IAVProcessService.IProcessCallback<Integer> iProcessCallback = this.LJLIL;
        if (iProcessCallback != null) {
            iProcessCallback.finish(Integer.valueOf(VEUtils.extractVideo(this.LJLILLLLZI, this.LJLJI)));
        }
        return C76800UCe.LIZ;
    }
}
