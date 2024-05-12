package X;

import com.bytedance.android.live.liveinteract.api.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multihost.biz.event.CoHostResumeEvent;
import com.bytedance.android.live.liveinteract.multihost.core.adapter.MultiHostCrossAdapterImpl;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.comp.api.linkcore.model.RechargeResult;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.MultiCohostAreaExpandSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchReDesignAnchorSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import tikcast.linkmic.common.GroupChannelAllUser;
import tikcast.linkmic.common.GroupChannelUser;

/* renamed from: X.TqX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75897TqX implements InterfaceC75414Tik<RechargeResult> {
    public final /* synthetic */ MultiHostCrossAdapterImpl LJLIL;
    public final /* synthetic */ InterfaceC75441TjB LJLILLLLZI;

    @Override // X.InterfaceC75414Tik
    public final void onSuccess(RechargeResult rechargeResult) {
        long j;
        U8H LJJZZI;
        String cohostLayoutId;
        List<GroupChannelUser> list;
        RechargeResult value = rechargeResult;
        o.LJIIIZ(value, "value");
        GroupChannelAllUser groupChannelAllUser = value.getGroupChannelAllUser();
        int i = 0;
        if (groupChannelAllUser != null && (list = groupChannelAllUser.user) != null) {
            ArrayList arrayList = new ArrayList();
            for (GroupChannelUser groupChannelUser : list) {
                if (groupChannelUser.status == 3) {
                    arrayList.add(groupChannelUser);
                }
            }
            i = arrayList.size();
        }
        if (C76117Tu5.LIZIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("resume linked list size: ");
            LIZ.append(i);
            C30868C9o.LJI(X1D.LIZIZ(LIZ));
        }
        if (i < 2) {
            this.LJLIL.LLJLILLLLZIIL("resume cohost failed, RTC kicked out", true);
            return;
        }
        this.LJLIL.LJZ = true;
        InterfaceC75441TjB interfaceC75441TjB = this.LJLILLLLZI;
        if (interfaceC75441TjB != null && (LJJZZI = interfaceC75441TjB.LJJZZI()) != null) {
            if (LiveMatchReDesignAnchorSetting.INSTANCE.isEnabled() && i == 2) {
                cohostLayoutId = "2003";
            } else {
                cohostLayoutId = MultiCohostAreaExpandSetting.INSTANCE.getCohostLayoutId();
            }
            LJJZZI.A1(cohostLayoutId, true);
        }
        DataChannel dataChannel = this.LJLIL.LJLJLJ;
        if (dataChannel != null) {
            dataChannel.pv0(CoHostResumeEvent.class);
        }
        C76271TwZ.LIZ.LJLIIL();
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJLIL.LJLJLLL;
        if (linkCrossRoomDataHolder == null) {
            return;
        }
        GroupChannelAllUser groupChannelAllUser2 = value.getGroupChannelAllUser();
        if (groupChannelAllUser2 != null) {
            j = groupChannelAllUser2.groupChannelId;
        } else {
            j = 0;
        }
        linkCrossRoomDataHolder.LJFF = j;
    }

    public C75897TqX(MultiHostCrossAdapterImpl multiHostCrossAdapterImpl, InterfaceC75441TjB interfaceC75441TjB) {
        this.LJLIL = multiHostCrossAdapterImpl;
        this.LJLILLLLZI = interfaceC75441TjB;
    }

    @Override // X.InterfaceC75414Tik
    public final void LJ(LinkCoreError error, Throwable th) {
        o.LJIIIZ(error, "error");
        this.LJLIL.LLJLILLLLZIIL("update user list failed in resume", true);
    }
}
