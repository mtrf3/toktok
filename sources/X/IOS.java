package X;

import Y.ARunnableS27S0200000_8;
import Y.ARunnableS44S0100000_8;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IOS implements InterfaceC32013ChN {
    public final /* synthetic */ InterfaceC88472Yns<List<AssetsModel>, C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZIZ;

    @Override // X.InterfaceC32013ChN
    public final void onFailed() {
        C15610jN.LIZ().post(new ARunnableS44S0100000_8(this.LIZIZ, (InterfaceC65784Pro<C76800UCe>) 11));
    }

    @Override // X.InterfaceC32013ChN
    public final void onSuccess(List<AssetsModel> assets) {
        o.LJIIIZ(assets, "assets");
        C15610jN.LIZ().post(new ARunnableS27S0200000_8(assets, this.LIZ, 11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IOS(InterfaceC88472Yns<? super List<AssetsModel>, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = interfaceC65784Pro;
    }
}
