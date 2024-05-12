package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.moderator.IModeratorService;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BBA extends AbstractC65781Prl implements InterfaceC65784Pro<Fragment> {
    public static final BBA LJLIL = new BBA();

    public BBA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Fragment invoke() {
        InterfaceC06390Mx LIZ = CN1.LIZ(IModeratorService.class);
        o.LJIIIIZZ(LIZ, "getService(IModeratorService::class.java)");
        return ((IModeratorService) LIZ).FF(null);
    }
}
