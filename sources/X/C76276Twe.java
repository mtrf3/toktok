package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import kotlin.jvm.internal.o;

/* renamed from: X.Twe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76276Twe extends AbstractC65781Prl implements InterfaceC88472Yns<LinkUser, CharSequence> {
    public static final C76276Twe LJLIL = new C76276Twe();

    public C76276Twe() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(LinkUser linkUser) {
        LinkUser it = linkUser;
        o.LJIIIZ(it, "it");
        return String.valueOf(it.getUserId());
    }
}
