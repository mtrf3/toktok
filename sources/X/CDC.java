package X;

import com.bytedance.android.livesdk.chatroom.api.SpotlightItem;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CDC extends AbstractC65781Prl implements InterfaceC88472Yns<SpotlightItem, Boolean> {
    public static final CDC LJLIL = new CDC();

    public CDC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(SpotlightItem spotlightItem) {
        SpotlightItem it = spotlightItem;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(it.isPinned);
    }
}
