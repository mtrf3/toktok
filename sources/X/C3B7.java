package X;

import Y.AfS53S0100000_1;
import Y.IDhS65S0200000_1;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.data.api.ActivityStatusAPI;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3B7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3B7 {
    public final ActivityStatusAPI LIZ;
    public final C3B6 LIZIZ;
    public final PO8 LIZJ;

    public C3B7(ActivityStatusAPI api) {
        o.LJIIIZ(api, "api");
        this.LIZ = api;
        this.LIZIZ = C3B6.LJLIL;
        this.LIZJ = new PO8("ActivityStatusRemoteImpl");
    }

    public final void LIZIZ(ActivityStatusAPI.Result result) {
        o.LJIIIZ(result, "<this>");
        int i = result.status_code;
        if (i == ActivityStatusAPI.StatusCode.SERVER_ERROR.ordinal()) {
            PO8 po8 = this.LIZJ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("server error: ");
            LIZ.append(result.status_code);
            po8.LIZ(X1D.LIZIZ(LIZ));
            return;
        }
        if (i != ActivityStatusAPI.StatusCode.INVALID_PARAM.ordinal()) {
            return;
        }
        PO8 po82 = this.LIZJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("invalid param: ");
        LIZ2.append(result.status_code);
        po82.LIZ(X1D.LIZIZ(LIZ2));
    }

    public final C73634Sv8 LIZ(String str, List friendList) {
        o.LJIIIZ(friendList, "friendList");
        ActivityStatusAPI activityStatusAPI = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append('[');
        LIZ.append(ORZ.LLD(friendList, ",", null, null, null, 62));
        LIZ.append(']');
        return activityStatusAPI.getStatuses(X1D.LIZIZ(LIZ), str).LJIIIIZZ(new AfS53S0100000_1(this, 4)).LJIJI(new IDhS65S0200000_1(this, friendList, 0));
    }

    public final C73671Svj LIZJ(String scene, boolean z) {
        int type;
        o.LJIIIZ(scene, "scene");
        ActivityStatusAPI activityStatusAPI = this.LIZ;
        if (z) {
            type = C3B8.ACTIVE.getType();
        } else {
            type = C3B8.INACTIVE.getType();
        }
        return new C73671Svj(activityStatusAPI.reportStatus(scene, Integer.valueOf(type)).LJIIIIZZ(new AfS53S0100000_1(this, 5)));
    }
}
