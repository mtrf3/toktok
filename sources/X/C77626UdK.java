package X;

import com.bytedance.android.livesdk.wallet.Diamond;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UdK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77626UdK extends F9E {
    public final List<Diamond> LJLIL;
    public final DiamondPackageExtra LJLILLLLZI;
    public final long LJLJI;
    public boolean LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    public C77626UdK(DiamondPackageExtra diamondPackageExtra, List diamonds) {
        o.LJIIIZ(diamonds, "diamonds");
        this.LJLIL = diamonds;
        this.LJLILLLLZI = diamondPackageExtra;
        this.LJLJI = System.currentTimeMillis();
    }
}
