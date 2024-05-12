package X;

import android.content.Context;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.UserSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.Oc7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62263Oc7 implements InterfaceC62382Oe2 {
    @Override // X.InterfaceC62382Oe2
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        UserSharePackage userSharePackage;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        User user = null;
        if (baseSharePackage instanceof UserSharePackage) {
            userSharePackage = (UserSharePackage) baseSharePackage;
            if (userSharePackage != null) {
                user = userSharePackage.LJIILL();
            }
        } else {
            userSharePackage = null;
        }
        if (z && userSharePackage != null && user != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("platform", channel.key());
            String string = baseSharePackage.extras.getString("related_gid");
            String str = "";
            if (string == null) {
                string = "";
            }
            c188727au.LJIIIZ("from_gid", string);
            String string2 = userSharePackage.extras.getString("enter_method");
            if (string2 == null) {
                string2 = "";
            }
            c188727au.LJIIIZ("enter_method", string2);
            String string3 = userSharePackage.extras.getString("enter_from");
            if (string3 != null) {
                str = string3;
            }
            c188727au.LJIIIZ("enter_from", str);
            c188727au.LJIIIZ("author_id", user.getUid());
            String string4 = baseSharePackage.extras.getString("share_form");
            if (string4 == null) {
                string4 = "url_form";
            }
            c188727au.LJIIIZ("share_form", string4);
            c188727au.LJIIIZ("panel_source", "screenshot_popup");
            FMX.LJIIL("share_person", c188727au.LIZ);
        }
    }
}
