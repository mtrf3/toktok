package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.model.LiveSubscribeLynxMap;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSubscribeLynxUrl;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.C6x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30799C6x {
    public final Context LIZ;
    public final DataChannel LIZIZ;
    public final C75 LIZJ;
    public DialogC31813Ce9 LJ;
    public long LJII;
    public final LiveSubscribeLynxMap LIZLLL = LiveSubscribeLynxUrl.INSTANCE.getValue();
    public final C7I[] LJFF = {new C7G(), new C7F(), new C7E(), new C7D()};
    public String LJI = "live_take_page";

    public C30799C6x(Context context, DataChannel dataChannel, C75 c75) {
        this.LIZ = context;
        this.LIZIZ = dataChannel;
        this.LIZJ = c75;
    }

    public final void LIZ(String str, String str2, boolean z) {
        String str3;
        if (this.LJII <= 0) {
            return;
        }
        if (z) {
            str3 = "livesdk_subscription_invitation_live_take_duration";
        } else {
            str3 = "livesdk_subscription_invitation_live_take_failed";
        }
        BZI LIZ = C28787BRn.LIZ(str3);
        C06540Nm.LJFF((C29374Bfu) B83.LIZ().LIZIZ(), LIZ, "anchor_id", str, "entrance");
        LIZ.LJIJJ("live_take_page", "event_page");
        if (str2 == null) {
            str2 = "";
        }
        LIZ.LJIJJ(str2, "to_page");
        C28289B8j.LIZJ(System.currentTimeMillis(), this.LJII, LIZ, "duration");
    }
}
