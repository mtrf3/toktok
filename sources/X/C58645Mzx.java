package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.Mzx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58645Mzx extends AbstractC65781Prl implements InterfaceC88472Yns<M95, String> {
    public static final C58645Mzx LJLIL = new C58645Mzx();

    public C58645Mzx() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final String invoke(M95 m95) {
        M95 $receiver = m95;
        o.LJIIIZ($receiver, "$this$$receiver");
        Object LIZ = $receiver.LIZ(C58646Mzy.class);
        if (LIZ != null) {
            if (((C58646Mzy) LIZ).LIZ == EnumC123104sM.IS_DIRECT_LIVE) {
                return "1";
            }
            return CardStruct.IStatusCode.DEFAULT;
        }
        throw new C58623Mzb(C58646Mzy.class);
    }
}
