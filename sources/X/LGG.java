package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility;
import com.ss.android.ugc.aweme.friendstab.model.ToolBarIconModel;
import com.ss.android.ugc.aweme.friendstab.tab.FriendsFeedProtocol;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LGG implements LGQ {
    public final /* synthetic */ FriendsFeedProtocol LIZ;

    public LGG(FriendsFeedProtocol friendsFeedProtocol) {
        this.LIZ = friendsFeedProtocol;
    }

    @Override // X.LGQ
    public final void LIZ(List<? extends LGH> iconList) {
        ISocial2TabProtocolAbility LIZLLL;
        ToolBarIconModel toolBarIconModel;
        o.LJIIIZ(iconList, "iconList");
        Context context = this.LIZ.LJLJJI;
        if (context != null && (LIZLLL = C53976LGi.LIZLLL(context)) != null && LIZLLL.v60()) {
            LGH lgh = (LGH) ListProtector.get(iconList, 0);
            if (C53219Kud.LIZIZ) {
                FriendsFeedProtocol friendsFeedProtocol = this.LIZ;
                friendsFeedProtocol.getClass();
                toolBarIconModel = new ToolBarIconModel(false, R.raw.icon_scan, R.attr.dj, null, new AqS153S0100000_3(friendsFeedProtocol, 1521), 8, null);
            } else if (C53219Kud.LIZJ) {
                toolBarIconModel = this.LIZ.LJLJI;
            } else {
                this.LIZ.getClass();
                toolBarIconModel = new ToolBarIconModel(false, R.raw.icon_info_circle, R.attr.dj, null, C234259Hh.LJLIL, 8, null);
            }
            lgh.setIconModel(toolBarIconModel);
            return;
        }
        ((LGH) ListProtector.get(iconList, 0)).setIconModel(this.LIZ.LJLJI);
    }

    @Override // X.LGQ
    public final void LIZIZ(List<? extends LGH> iconList) {
        o.LJIIIZ(iconList, "iconList");
        ((LGH) ListProtector.get(iconList, 0)).setIconModel(this.LIZ.LJLILLLLZI);
    }
}
