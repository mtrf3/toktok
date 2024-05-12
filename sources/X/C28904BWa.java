package X;

import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import kotlin.jvm.internal.o;

/* renamed from: X.BWa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28904BWa extends AbstractC65781Prl implements InterfaceC88472Yns<AnchorLevelPermission, EnumC12540eQ> {
    public static final C28904BWa LJLIL = new C28904BWa();

    public C28904BWa() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final EnumC12540eQ invoke(AnchorLevelPermission anchorLevelPermission) {
        AnchorLevelPermission anchorLevelPermission2 = anchorLevelPermission;
        o.LJIIIZ(anchorLevelPermission2, "anchorLevelPermission");
        C12530eP c12530eP = EnumC12540eQ.Companion;
        int i = anchorLevelPermission2.pin;
        c12530eP.getClass();
        return C12530eP.LIZ(i);
    }
}
