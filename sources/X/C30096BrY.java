package X;

import com.bytedance.android.livesdk.rank.api.IRankService;
import kotlin.jvm.internal.o;

/* renamed from: X.BrY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30096BrY extends AbstractC65781Prl implements InterfaceC65784Pro<B5D> {
    public static final C30096BrY LJLIL = new C30096BrY();

    public C30096BrY() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final B5D invoke() {
        Object value = C7N.LJJI.getValue();
        o.LJIIIIZZ(value, "<get-rankService>(...)");
        return ((IRankService) value).fp0();
    }
}
