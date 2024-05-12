package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MfX, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57379MfX extends AbstractC57378MfW {
    public final EnumC58046MqI LJLILLLLZI;

    public final EnumC58046MqI getPlatform() {
        return this.LJLILLLLZI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57379MfX(EnumC58046MqI platform) {
        super("AuthMatch", null);
        o.LJIIIZ(platform, "platform");
        this.LJLILLLLZI = platform;
    }
}
