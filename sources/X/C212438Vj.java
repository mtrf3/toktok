package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.AssemContainerBridge;

/* renamed from: X.8Vj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212438Vj extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ LifecycleOwner LJLILLLLZI;
    public final /* synthetic */ AssemContainerBridge LJLJI;
    public final /* synthetic */ Intent LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ Bundle LJLJJLL;
    public final /* synthetic */ InterfaceC88473Ynt<Integer, Integer, Intent, C76800UCe> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C212438Vj(ActivityC45651qj activityC45651qj, LifecycleOwner lifecycleOwner, AssemContainerBridge assemContainerBridge, Intent intent, int i, Bundle bundle, InterfaceC88473Ynt<? super Integer, ? super Integer, ? super Intent, C76800UCe> interfaceC88473Ynt) {
        super(0);
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = lifecycleOwner;
        this.LJLJI = assemContainerBridge;
        this.LJLJJI = intent;
        this.LJLJJL = i;
        this.LJLJJLL = bundle;
        this.LJLJL = interfaceC88473Ynt;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (C78880UxY.LJJLIIIJILLIZJL(this.LJLIL, this.LJLILLLLZI)) {
            this.LJLJI.vl(this.LJLILLLLZI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL);
        }
        return C76800UCe.LIZ;
    }
}
