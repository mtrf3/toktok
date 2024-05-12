package X;

import com.bytedance.android.livesdkapi.depend.model.live.AnchorLevelPermission;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BZX extends AbstractC65781Prl implements InterfaceC88472Yns<AnchorLevelPermission, EnumC12540eQ> {
    public static final BZX LJLIL = new BZX();

    public BZX() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final EnumC12540eQ invoke(AnchorLevelPermission anchorLevelPermission) {
        AnchorLevelPermission anchorLevelPermission2 = anchorLevelPermission;
        o.LJIIIZ(anchorLevelPermission2, "anchorLevelPermission");
        C12530eP c12530eP = EnumC12540eQ.Companion;
        int i = anchorLevelPermission2.voiceEffect;
        c12530eP.getClass();
        return C12530eP.LIZ(i);
    }
}
