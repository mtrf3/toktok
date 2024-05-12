package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.9eW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C241929eW extends AbstractC65781Prl implements InterfaceC88473Ynt<C241959eZ, C240719cZ, List<? extends Object>, C241959eZ> {
    public static final C241929eW LJLIL = new C241929eW();

    public C241929eW() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C241959eZ invoke(C241959eZ assemViewModel, C240719cZ c240719cZ, List<? extends Object> list) {
        C240719cZ item = c240719cZ;
        o.LJIIIZ(assemViewModel, "$this$assemViewModel");
        o.LJIIIZ(item, "item");
        EnumC240989d0 pinnedVideoStatus = C44384HbQ.LLILLJJLI(item.LJLIL.getPinnedVideoStatus());
        o.LJIIIZ(pinnedVideoStatus, "pinnedVideoStatus");
        return new C241959eZ(pinnedVideoStatus);
    }
}
