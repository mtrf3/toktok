package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.guest.MultiLiveGuestUserInfoDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TXL {
    public static /* synthetic */ MultiLiveGuestUserInfoDialog LIZIZ(DataChannel dataChannel, C74814TXu c74814TXu, WeakReference weakReference, TXF txf, TWR twr, int i) {
        return LIZ(dataChannel, c74814TXu, weakReference, txf, twr, "invite", i);
    }

    public static MultiLiveGuestUserInfoDialog LIZ(DataChannel dataChannel, C74814TXu c74814TXu, WeakReference weakReference, TXF txf, TWR twr, String source, int i) {
        o.LJIIIZ(source, "source");
        MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog = new MultiLiveGuestUserInfoDialog();
        multiLiveGuestUserInfoDialog.dataChannel = dataChannel;
        multiLiveGuestUserInfoDialog.LJLILLLLZI = c74814TXu;
        multiLiveGuestUserInfoDialog.LJLJI = weakReference;
        multiLiveGuestUserInfoDialog.LJLJJI = txf;
        multiLiveGuestUserInfoDialog.LJLJJL = twr;
        multiLiveGuestUserInfoDialog.LJLL = source;
        multiLiveGuestUserInfoDialog.LJLJLLL = i;
        return multiLiveGuestUserInfoDialog;
    }
}
