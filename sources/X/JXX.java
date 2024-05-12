package X;

import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JXX implements InterfaceC49318JXe<BlockStatus> {
    public final /* synthetic */ JXW LIZ;

    @Override // X.InterfaceC49318JXe
    public final Class<BlockStatus> LIZ() {
        return BlockStatus.class;
    }

    public JXX(JXW jxw) {
        this.LIZ = jxw;
    }

    @Override // X.InterfaceC49318JXe
    public final void LIZIZ(BlockStatus blockStatus) {
        BlockStatus event = blockStatus;
        o.LJIIIZ(event, "event");
        this.LIZ.onChanged(event);
    }
}
