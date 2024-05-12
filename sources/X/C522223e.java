package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.23e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C522223e extends AbstractC65781Prl implements InterfaceC88472Yns<C0Q4<Float>, C76800UCe> {
    public static final C522223e LJLIL = new C522223e();

    public C522223e() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C0Q4<Float> c0q4) {
        C0Q4<Float> keyframes = c0q4;
        o.LJIIIZ(keyframes, "$this$keyframes");
        keyframes.LIZ = 1000;
        Float valueOf = Float.valueOf(1.0f);
        keyframes.LIZ(0, valueOf);
        keyframes.LIZ(499, valueOf);
        Float valueOf2 = Float.valueOf(0.0f);
        keyframes.LIZ(LiveMaxRetainAlogMessageSizeSetting.DEFAULT, valueOf2);
        keyframes.LIZ(999, valueOf2);
        return C76800UCe.LIZ;
    }
}
