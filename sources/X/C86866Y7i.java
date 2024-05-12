package X;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import java.util.List;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.AqS197S0100000_15;
import kotlin.jvm.internal.o;

/* renamed from: X.Y7i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86866Y7i implements InterfaceC32013ChN {
    public InterfaceC88471Ynr<? super Boolean, ? super Integer, C76800UCe> LIZ;

    @Override // X.InterfaceC32013ChN
    public final void onFailed() {
        if (this.LIZ != null) {
            C32257ClJ.LJIIIIZZ(new AqS165S0100000_15(this, 898));
        }
    }

    public C86866Y7i(AqS197S0100000_15 aqS197S0100000_15) {
        this.LIZ = aqS197S0100000_15;
    }

    @Override // X.InterfaceC32013ChN
    public final void onSuccess(List<AssetsModel> assets) {
        o.LJIIIZ(assets, "assets");
        if (this.LIZ != null) {
            C32257ClJ.LJIIIIZZ(new AqS165S0100000_15(this, 899));
        }
    }
}
