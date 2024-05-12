package X;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.UserResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.APo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC26188APo extends Handler {
    public final Activity LIZ;
    public final InterfaceC26189APp LIZIZ;

    public final void LIZIZ(String str) {
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        C5S1 c5s1 = new C5S1(this.LIZ);
        c5s1.LIZLLL(str);
        c5s1.LJ();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        o.LJIIIZ(msg, "msg");
        Object obj = msg.obj;
        if (obj instanceof Exception) {
            o.LJII(obj, "null cannot be cast to non-null type java.lang.Exception{ kotlin.TypeAliasesKt.Exception }");
            Exception exc = (Exception) obj;
            int i = msg.what;
            if (i == 112) {
                this.LIZIZ.Xa(exc, i);
                return;
            }
            return;
        }
        if (obj instanceof User) {
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.model.User");
            LIZ((User) obj, msg.what);
            return;
        }
        if (obj instanceof UserResponse) {
            o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.UserResponse");
            UserResponse userResponse = (UserResponse) obj;
            if (userResponse.getAction() == 1) {
                LIZIZ(userResponse.status_msg);
                int i2 = msg.what;
                if (i2 != 112) {
                    return;
                }
                this.LIZIZ.Xa(null, i2);
                return;
            }
            if (userResponse.getAction() == 2) {
                LIZIZ(userResponse.status_msg);
                int i3 = msg.what;
                if (i3 != 112) {
                    return;
                }
                this.LIZIZ.Xa(null, i3);
                return;
            }
            LIZ(userResponse.getUser(), msg.what);
            return;
        }
        if (!(obj instanceof BaseResponse)) {
            return;
        }
        o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.BaseResponse");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (baseResponse.status_code != 0) {
            LIZIZ(baseResponse.status_msg);
            int i4 = msg.what;
            if (i4 != 112) {
                return;
            }
            this.LIZIZ.Xa(null, i4);
            return;
        }
        LIZ(null, msg.what);
    }

    public HandlerC26188APo(Activity activity, C244339iP c244339iP) {
        super(C16880lQ.LLJJJJ());
        this.LIZ = activity;
        this.LIZIZ = c244339iP;
    }

    public final void LIZ(User user, int i) {
        UrlModel avatarVideoUri;
        if (user == null) {
            if (i != 128) {
                this.LIZIZ.Xa(null, i);
            }
        } else if (i == 112) {
            if (user != null && (avatarVideoUri = user.getAvatarVideoUri()) != null && avatarVideoUri.getUrlList() != null && avatarVideoUri.getUrlList().size() > 0) {
                HG3.LJIILL().getCurUser().setAvatarUpdateReminder(false);
            }
            HG3.LJIILL().updateCurUser(user);
            this.LIZIZ.Pp0(user, i);
        }
    }
}
