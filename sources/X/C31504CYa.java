package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import kotlin.jvm.internal.o;

/* renamed from: X.CYa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31504CYa extends C08Z {
    public final /* synthetic */ CYY LIZ;

    public C31504CYa(CYY cyy) {
        this.LIZ = cyy;
    }

    @Override // X.C08Z
    public final void onFragmentDestroyed(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentDestroyed(fm, f);
        if (o.LJ(this.LIZ.LJLIL, f)) {
            CYY cyy = this.LIZ;
            IMessageManager iMessageManager = cyy.LJLJLJ;
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(EnumC31509CYf.RANK_UPDATE_MESSAGE.getIntType(), cyy);
            }
            IMessageManager iMessageManager2 = cyy.LJLJLJ;
            if (iMessageManager2 != null) {
                iMessageManager2.removeMessageListener(EnumC31509CYf.HOURLY_RANK_REWARD_MESSAGE.getIntType(), cyy);
            }
            IMessageManager iMessageManager3 = cyy.LJLJLJ;
            if (iMessageManager3 != null) {
                iMessageManager3.removeMessageListener(EnumC31509CYf.MARQUEE_ANNOUNCEMENT_MESSAGE.getIntType(), cyy);
            }
            IMessageManager iMessageManager4 = cyy.LJLJLJ;
            if (iMessageManager4 != null) {
                iMessageManager4.removeMessageListener(EnumC31509CYf.WEEKLY_RANK_REWARD_MESSAGE.getIntType(), cyy);
            }
            IMessageManager iMessageManager5 = cyy.LJLJLJ;
            if (iMessageManager5 != null) {
                iMessageManager5.removeMessageListener(EnumC31509CYf.ROOM_VERIFY.getIntType(), cyy);
            }
            C72818Shy.LJII("liveLastGiftRankOpen", cyy.LJLLILLLL);
            C72818Shy.LJII("ttlive_anchor_ranking_open_event", cyy.LJLLILLLL);
            DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
            dataChannelGlobal.getClass();
            dataChannelGlobal.jv0(cyy);
            this.LIZ.LJLIL.requireFragmentManager().LJLJJLL(this);
        }
    }
}
