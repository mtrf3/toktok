package X;

import com.bytedance.android.live.liveinteract.multilive.model.ListByTypeResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.TdC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75070TdC extends F9E {
    public final ListByTypeResponse.ReservedUser LJLIL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C75070TdC(ListByTypeResponse.ReservedUser playerInfo) {
        o.LJIIIZ(playerInfo, "playerInfo");
        this.LJLIL = playerInfo;
    }
}
