package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.leaf.cpc.CPCState;
import com.bytedance.android.livesdk.gift.model.CpcPromptResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.T6f, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74097T6f extends AbstractC65781Prl implements InterfaceC88471Ynr<CPCState, AbstractC26082ALm<? extends CpcPromptResponse>, CPCState> {
    public static final C74097T6f LJLIL = new C74097T6f();

    public C74097T6f() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final CPCState invoke(CPCState cPCState, AbstractC26082ALm<? extends CpcPromptResponse> abstractC26082ALm) {
        CPCState execute = cPCState;
        AbstractC26082ALm<? extends CpcPromptResponse> it = abstractC26082ALm;
        o.LJIIIZ(execute, "$this$execute");
        o.LJIIIZ(it, "it");
        return execute.copy(it);
    }
}
