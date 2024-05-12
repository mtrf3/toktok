package X;

import com.bytedance.android.livesdk.livesetting.gift.MsgStair;
import java.util.List;

/* renamed from: X.Uks, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78094Uks extends AbstractC65781Prl implements InterfaceC88472Yns<Boolean, List<? extends MsgStair>> {
    public static final C78094Uks LJLIL = new C78094Uks();

    public C78094Uks() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final List<? extends MsgStair> invoke(Boolean bool) {
        if (bool.booleanValue()) {
            return C78084Uki.LIZLLL()._selfQueueStairs;
        }
        return C78084Uki.LIZLLL()._otherQueueStairs;
    }
}
