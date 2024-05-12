package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import kotlin.jvm.internal.o;

/* renamed from: X.YTi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87438YTi extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC87439YTj, BaseFragment, C76800UCe> {
    public final /* synthetic */ FragmentManager LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ Bundle LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C87438YTi(Bundle bundle, View view, FragmentManager fragmentManager) {
        super(2);
        this.LJLIL = fragmentManager;
        this.LJLILLLLZI = view;
        this.LJLJI = bundle;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC87439YTj interfaceC87439YTj, BaseFragment baseFragment) {
        InterfaceC87439YTj checkAndExecute = interfaceC87439YTj;
        BaseFragment baseFragment2 = baseFragment;
        o.LJIIIZ(checkAndExecute, "$this$checkAndExecute");
        o.LJIIIZ(baseFragment2, "baseFragment");
        checkAndExecute.LJFF(this.LJLIL, baseFragment2, this.LJLILLLLZI, this.LJLJI);
        return C76800UCe.LIZ;
    }
}
