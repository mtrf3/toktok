package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TR0 extends AbstractC65781Prl implements InterfaceC88472Yns<LinkUser, Boolean> {
    public static final TR0 LJLIL = new TR0();

    public TR0() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(LinkUser linkUser) {
        boolean z;
        LinkUser it = linkUser;
        o.LJIIIZ(it, "it");
        Long userId = it.getUserId();
        long LIZ = C025908h.LIZ();
        if (userId == null || userId.longValue() != LIZ) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
