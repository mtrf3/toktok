package X;

import android.view.View;
import com.bytedance.android.live.liveinteract.multimatch.widget.MultiMatchAnchorWidget;
import com.bytedance.android.livesdk.comp.api.linkcore.model.AbnormalDisconnectReason;
import com.bytedance.android.livesdk.comp.api.linkcore.model.CustomLinkMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Tv7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC76181Tv7 extends AbstractC76473Tzp<MultiMatchAnchorWidget> {
    public C2A7 LLI;
    public C76624U5k LLIFFJFJJ;

    public abstract void LJJLJ(List<LinkUser> list, List<LinkUser> list2, CustomLinkMessage customLinkMessage);

    public abstract void LJJLJLI(int i, int i2, AbnormalDisconnectReason abnormalDisconnectReason);

    public abstract void LJJLL(int i);

    public abstract void LJJZ();

    public abstract void LJJZZI(LinkMicBattleMessage linkMicBattleMessage);

    public abstract void LJJZZIII(C30049Bqn c30049Bqn);

    public abstract void LJL(long j, String str);

    public final C2A7 LJJLIIJ() {
        C2A7 c2a7 = this.LLI;
        if (c2a7 != null) {
            return c2a7;
        }
        o.LJIJI("btnReMatch");
        throw null;
    }

    public final C76624U5k LJJLIL() {
        C76624U5k c76624U5k = this.LLIFFJFJJ;
        if (c76624U5k != null) {
            return c76624U5k;
        }
        o.LJIJI("btnReMatchDraw");
        throw null;
    }

    @Override // X.AbstractC76473Tzp
    public void LJJJJL() {
        int i;
        int i2;
        super.LJJJJL();
        WIDGET widget = this.LJLIL;
        if (widget != 0) {
            LiveMatchReDesignAnchorSetting liveMatchReDesignAnchorSetting = LiveMatchReDesignAnchorSetting.INSTANCE;
            if (liveMatchReDesignAnchorSetting.isEnabled()) {
                i = R.id.av4;
            } else {
                i = R.id.av0;
            }
            View findViewById = widget.findViewById(i);
            o.LJIIIIZZ(findViewById, "findViewById(if (LiveMat… R.id.btn_battle_rematch)");
            this.LLI = (C2A7) findViewById;
            if (liveMatchReDesignAnchorSetting.isEnabled()) {
                i2 = R.id.av3;
            } else {
                i2 = R.id.av2;
            }
            View findViewById2 = widget.findViewById(i2);
            o.LJIIIIZZ(findViewById2, "findViewById(if (LiveMat….btn_battle_rematch_draw)");
            this.LLIFFJFJJ = (C76624U5k) findViewById2;
        }
    }
}
