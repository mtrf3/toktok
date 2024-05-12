package Y;

import X.C276516r;
import X.C29306Beo;
import X.C29401Dk;
import X.C74824TYe;
import X.CH1;
import X.U7U;
import X.U9F;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestPermissionInfo;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.model.MultiGuestAnchorPermissionResponse;

/* loaded from: classes14.dex */
public class ARunnableS3S0100200_13 implements Runnable {
    public final int $t;
    public long j1;
    public long j2;
    public Object l0;

    public final void LIZ$0() {
        int i;
        String str;
        long j = this.j1 - this.j2;
        Throwable th = (Throwable) this.l0;
        if (th instanceof C29401Dk) {
            i = ((C276516r) th).getErrorCode();
        } else {
            i = 1;
        }
        Throwable th2 = (Throwable) this.l0;
        if (th2 instanceof CH1) {
            str = ((CH1) th2).getxTtLogId();
        } else {
            str = null;
        }
        C74824TYe.LJJLIIIJLJLI("anchor_host_permission_request", 0, 0, null, Integer.valueOf(i), Long.valueOf(j), str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ$1() {
        Boolean bool;
        Long l;
        Boolean bool2;
        int i;
        MultiGuestAnchorPermissionResponse multiGuestAnchorPermissionResponse;
        boolean z;
        MultiGuestAnchorPermissionResponse multiGuestAnchorPermissionResponse2;
        MultiGuestPermissionInfo multiGuestPermissionInfo;
        MultiGuestAnchorPermissionResponse multiGuestAnchorPermissionResponse3;
        boolean z2;
        BaseResponse baseResponse = (BaseResponse) this.l0;
        String str = null;
        if (baseResponse != null && (multiGuestAnchorPermissionResponse3 = (MultiGuestAnchorPermissionResponse) baseResponse.data) != null) {
            MultiGuestPermissionInfo multiGuestPermissionInfo2 = multiGuestAnchorPermissionResponse3.permissionInfo;
            if (multiGuestPermissionInfo2 != null && multiGuestPermissionInfo2.flag) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        boolean LJJIFFI = C29306Beo.LJJIFFI(bool);
        BaseResponse baseResponse2 = (BaseResponse) this.l0;
        if (baseResponse2 != null && (multiGuestAnchorPermissionResponse2 = (MultiGuestAnchorPermissionResponse) baseResponse2.data) != null && (multiGuestPermissionInfo = multiGuestAnchorPermissionResponse2.permissionInfo) != null) {
            l = Long.valueOf(multiGuestPermissionInfo.errCode);
        } else {
            l = null;
        }
        BaseResponse baseResponse3 = (BaseResponse) this.l0;
        if (baseResponse3 != null && (multiGuestAnchorPermissionResponse = (MultiGuestAnchorPermissionResponse) baseResponse3.data) != null) {
            MultiGuestPermissionInfo multiGuestPermissionInfo3 = multiGuestAnchorPermissionResponse.permissionInfo;
            if (multiGuestPermissionInfo3 != null && multiGuestPermissionInfo3.flag) {
                z = true;
            } else {
                z = false;
            }
            bool2 = Boolean.valueOf(z);
        } else {
            bool2 = null;
        }
        if (C29306Beo.LJJIFFI(bool2)) {
            if (l == null || l.longValue() != 4003036) {
                i = 1;
            } else {
                i = 2;
            }
        } else {
            i = 0;
        }
        Long valueOf = Long.valueOf(this.j1 - this.j2);
        BaseResponse baseResponse4 = (BaseResponse) this.l0;
        if (baseResponse4 != null) {
            str = baseResponse4.LIZIZ;
        }
        C74824TYe.LJJLIIIJLJLI("anchor_host_permission_request", LJJIFFI ? 1 : 0, i, l, 0, valueOf, str);
    }

    public static final void run$0(ARunnableS3S0100200_13 aRunnableS3S0100200_13) {
        boolean LIZ;
        try {
            aRunnableS3S0100200_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S0100200_13 aRunnableS3S0100200_13) {
        boolean LIZ;
        try {
            aRunnableS3S0100200_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS3S0100200_13 aRunnableS3S0100200_13) {
        boolean LIZ;
        try {
            U9F u9f = ((U7U) aRunnableS3S0100200_13.l0).LJFF;
            if (u9f != null) {
                u9f.LJIIL(aRunnableS3S0100200_13.j1, aRunnableS3S0100200_13.j2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S0100200_13(long j, long j2, Object obj, int i) {
        this.$t = i;
        this.j1 = j;
        this.j2 = j2;
        this.l0 = obj;
    }
}
