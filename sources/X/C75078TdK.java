package X;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveReqParams;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TdK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75078TdK {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(Context context, Room room, C73318Sq2 c73318Sq2, U4B u4b) {
        C47071t1 c47071t1 = new C47071t1(context);
        c47071t1.LIZJ = C15380j0.LJIILJJIL(R.string.khs);
        c47071t1.LJII(C15380j0.LJIILJJIL(R.string.khr));
        c47071t1.LJIIL(R.string.khq, new TYG(room, c73318Sq2, u4b));
        c47071t1.LJIIIZ(R.string.kjv, C78963Uyt.LJLJI);
        LiveDialog LIZ2 = c47071t1.LIZ();
        if (new C03880Dg(2).LIZJ(300000, "com/bytedance/android/live/design/app/LiveDialog", "show", LIZ2, new Object[0], "void", new C65300Pk0(false, "()V", "2004185585222374240")).LIZ) {
            return;
        }
        LIZ2.show();
    }

    public static void LIZ(int i, boolean z, Room room, C73318Sq2 subscriptions, U4B callback) {
        long j;
        User owner;
        o.LJIIIZ(subscriptions, "subscriptions");
        o.LJIIIZ(callback, "callback");
        MultiGuestReserveReqParams multiGuestReserveReqParams = new MultiGuestReserveReqParams();
        multiGuestReserveReqParams.scene = 2;
        multiGuestReserveReqParams.appId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).appId();
        multiGuestReserveReqParams.liveId = ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId();
        multiGuestReserveReqParams.fromUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        long j2 = 0;
        if (room != null && (owner = room.getOwner()) != null) {
            j = owner.getId();
        } else {
            j = 0;
        }
        multiGuestReserveReqParams.toUserId = j;
        if (room != null) {
            j2 = room.getId();
        }
        multiGuestReserveReqParams.roomId = j2;
        multiGuestReserveReqParams.type = i;
        multiGuestReserveReqParams.autoFollow = z;
        C78999UzT.LJFF(U4A.LIZIZ(multiGuestReserveReqParams, callback), subscriptions);
    }
}
