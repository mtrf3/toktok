package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import java.util.List;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.CXi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31486CXi implements InterfaceC32013ChN {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;

    @Override // X.InterfaceC32013ChN
    public final void onFailed() {
        C0NB.LIZIZ("preloadGiftEffect", "onResult# onFailed: asset model download failed");
    }

    public C31486CXi(AqS155S0100000_5 aqS155S0100000_5) {
        this.LIZ = aqS155S0100000_5;
    }

    @Override // X.InterfaceC32013ChN
    public final void onSuccess(List<AssetsModel> assets) {
        o.LJIIIZ(assets, "assets");
        this.LIZ.invoke();
    }
}
