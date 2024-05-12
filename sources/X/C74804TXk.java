package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TXk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74804TXk extends F9E {
    public final List<LinkPlayerInfo> LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, Boolean.valueOf(this.LJLILLLLZI)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C74804TXk(List<? extends LinkPlayerInfo> playerList, boolean z) {
        o.LJIIIZ(playerList, "playerList");
        this.LJLIL = playerList;
        this.LJLILLLLZI = z;
    }
}
