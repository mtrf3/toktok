package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import kotlin.jvm.internal.o;

/* renamed from: X.Twd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76275Twd extends AbstractC65781Prl implements InterfaceC88472Yns<LinkUser, CharSequence> {
    public static final C76275Twd LJLIL = new C76275Twd();

    public C76275Twd() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(LinkUser linkUser) {
        LinkUser it = linkUser;
        o.LJIIIZ(it, "it");
        return String.valueOf(it.getUserId());
    }
}
