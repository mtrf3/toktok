package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public abstract class TQM extends AbstractC75411Tih<InterfaceC74596TPk> {
    public final DataChannel mDataChannel;
    public final Room room;
    public TQ8 userManager;

    public void cancel(String cancelSource) {
        o.LJIIIZ(cancelSource, "cancelSource");
    }

    public abstract void checkPermissionRealTime$liveinteract_impl_release(int i, TWR twr);

    public void exitInteractInNormalWay(String source, boolean z, int i) {
        o.LJIIIZ(source, "source");
    }

    public void exitInteractInNormalWayAfterFeedback(@TQC String disconnectionType, String source, int i) {
        o.LJIIIZ(disconnectionType, "disconnectionType");
        o.LJIIIZ(source, "source");
    }

    public void exitInteractWithConfirm(@TQC String disconnectionType, String source, int i) {
        o.LJIIIZ(disconnectionType, "disconnectionType");
        o.LJIIIZ(source, "source");
    }

    public InterfaceC29205BdB<C28467BFf<MultiLiveGuestInfoList>> fetchUserListData(boolean z) {
        return null;
    }

    public InterfaceC74605TPt getLiveVideoClient() {
        return null;
    }

    public abstract C76800UCe getWaitingList();

    public abstract void onEnterBackground();

    public abstract void onEnterForeground();

    public abstract void setDialogView(TQ7 tq7);

    public TQ8 getUserManager() {
        return this.userManager;
    }

    public final boolean isFromModeratorKickOut(Integer num) {
        if (num == null || num.intValue() != 5 || !LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.INSTANCE.getValue()) {
            return false;
        }
        return true;
    }

    public final boolean isKickOutReasonable(Integer num) {
        if (num == null || num.intValue() != 4) {
            return false;
        }
        return true;
    }

    public void setUserManager(TQ8 tq8) {
        this.userManager = tq8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TQM(Room room, DataChannel mDataChannel, LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        o.LJIIIZ(room, "room");
        o.LJIIIZ(mDataChannel, "mDataChannel");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.room = room;
        this.mDataChannel = mDataChannel;
    }

    public static /* synthetic */ InterfaceC29205BdB fetchUserListData$default(TQM tqm, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            return tqm.fetchUserListData(z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fetchUserListData");
    }

    public static /* synthetic */ void checkPermissionRealTime$liveinteract_impl_release$default(TQM tqm, int i, TWR twr, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                twr = null;
            }
            tqm.checkPermissionRealTime$liveinteract_impl_release(i, twr);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkPermissionRealTime");
    }

    public static /* synthetic */ void exitInteractInNormalWay$default(TQM tqm, String str, boolean z, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            if ((i2 & 4) != 0) {
                i = 0;
            }
            tqm.exitInteractInNormalWay(str, z, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exitInteractInNormalWay");
    }
}
