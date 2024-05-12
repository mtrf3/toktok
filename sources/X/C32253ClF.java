package X;

import com.bytedance.android.livesdk.livesetting.gift.LynxUrlStorage;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;

/* renamed from: X.ClF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32253ClF extends AbstractC65781Prl implements InterfaceC88472Yns<String, android.net.Uri> {
    public static final C32253ClF LJLIL = new C32253ClF();

    public C32253ClF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final android.net.Uri invoke(String it) {
        o.LJIIIZ(it, "it");
        android.net.Uri parse = UriProtector.parse(LynxUrlStorage.INSTANCE.getValue().get(it));
        o.LJIIIIZZ(parse, "parse(LynxUrlStorage.getValue()[it])");
        return parse;
    }
}
