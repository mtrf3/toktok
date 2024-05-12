package Y;

import X.C0NE;
import X.C28733BPl;
import X.C29044Baa;
import X.C73098SmU;
import X.C74824TYe;
import X.C78726Uv4;
import X.C81810W8w;
import X.TR8;
import X.W5P;
import X.W8E;
import X.W92;
import X.X1D;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import java.util.HashMap;

/* loaded from: classes14.dex */
public class ARunnableS17S1000000_13 implements Runnable {
    public final int $t;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$1() {
        W5P LIZLLL = W5P.LIZLLL(UriProtector.parse(C78726Uv4.LIZ(this.s0)));
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
        imageDecodeOptionsBuilder.getClass();
        LIZLLL.LJ = new C81810W8w(imageDecodeOptionsBuilder);
        LIZLLL.LJIIIZ = W92.HIGH;
        W8E.LJII().LJI().LJIIL(LIZLLL.LIZ(), null);
    }

    public final void LIZ$0() {
        long j;
        User owner;
        FollowInfo followInfo;
        boolean LIZIZ = TR8.LIZIZ();
        C28733BPl LJIILIIL = C28733BPl.LJIILIIL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onVideoEnableChange, source=");
        LIZ.append(this.s0);
        LIZ.append(", isVideoMute=");
        LIZ.append(LIZIZ);
        LIZ.append(", isAudienceOnline=");
        LIZ.append(TR8.LIZ);
        LIZ.append(", startCameraTimeMills=");
        LIZ.append(TR8.LIZJ);
        String LIZIZ2 = X1D.LIZIZ(LIZ);
        LJIILIIL.getClass();
        C0NE.LJII("MultiGuestCameraOnDurationLogHelper", LIZIZ2);
        if (!LIZIZ) {
            if (TR8.LIZ && TR8.LIZJ == 0) {
                HashMap LIZLLL = C73098SmU.LIZLLL();
                Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
                if (room != null && (owner = room.getOwner()) != null && (followInfo = owner.getFollowInfo()) != null) {
                    j = followInfo.getFollowStatus();
                } else {
                    j = 0;
                }
                LIZLLL.put("follow_status", String.valueOf(j));
                LIZLLL.put("guest_invite_type", C74824TYe.LJFF());
                C74824TYe.LJLL("livesdk_guest_onstage_camera_on_start", LIZLLL);
                TR8.LIZJ = System.currentTimeMillis();
                C28733BPl LJIILIIL2 = C28733BPl.LJIILIIL();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("logCameraOnStart, startCameraTimeMills=");
                LIZ2.append(TR8.LIZJ);
                String LIZIZ3 = X1D.LIZIZ(LIZ2);
                LJIILIIL2.getClass();
                C0NE.LJII("MultiGuestCameraOnDurationLogHelper", LIZIZ3);
                return;
            }
            return;
        }
        if (TR8.LIZJ <= 0) {
            return;
        }
        TR8.LIZJ();
    }

    public static final void run$0(ARunnableS17S1000000_13 aRunnableS17S1000000_13) {
        boolean LIZ;
        try {
            aRunnableS17S1000000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS17S1000000_13 aRunnableS17S1000000_13) {
        boolean LIZ;
        try {
            aRunnableS17S1000000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS17S1000000_13(String str, int i) {
        this.$t = i;
        this.s0 = str;
    }
}
