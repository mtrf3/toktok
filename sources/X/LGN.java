package X;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.protocol.SocialTopTabNode;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LGN extends AbstractC38911fr {
    public final boolean LJLILLLLZI = true;

    @Override // X.AbstractC38911fr
    public final boolean LJIILLIIL() {
        return this.LJLILLLLZI;
    }

    @Override // X.AbstractC38911fr
    public final List<AbstractC53895LDf> LJIILJJIL(Context ctx) {
        List<SocialTopTabNode> p5;
        o.LJIIIZ(ctx, "ctx");
        ISocial2TabProtocolAbility LIZLLL = C53976LGi.LIZLLL(ctx);
        if (LIZLLL == null || (p5 = LIZLLL.p5()) == null) {
            return C61878OQg.INSTANCE;
        }
        return p5;
    }

    @Override // X.AbstractC38911fr
    public final void LJJJ(Context ctx, String tag, Bundle bundle) {
        o.LJIIIZ(ctx, "ctx");
        o.LJIIIZ(tag, "tag");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(ctx);
        if (LJJIFFI == null) {
            return;
        }
        int qv0 = com.bytedance.hox.Hox.LJLLI.LIZ(LJJIFFI).qv0(tag);
        boolean z = bundle.getBoolean("isSmoothScroll", false);
        IFriendsTabLayoutAbility LIZ = C53976LGi.LIZ(ctx);
        if (LIZ != null) {
            LIZ.i10(qv0, z);
        }
    }
}
