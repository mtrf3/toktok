package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.editpost.EditDiffMessage;
import com.ss.android.ugc.aweme.editpost.EditPostPermission;
import com.ss.android.ugc.aweme.editpost.EditPostResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.GLv, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41379GLv {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C41381GLx.LJLIL);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C41380GLw.LJLIL);

    public static final void LIZ(Activity activity, Intent data) {
        EditPostResponse editPostResponse;
        EditDiffMessage editDiffMessage;
        o.LJIIIZ(data, "data");
        Serializable serializableExtra = data.getSerializableExtra("edit_post_response");
        if ((serializableExtra instanceof EditPostResponse) && (editPostResponse = (EditPostResponse) serializableExtra) != null && editPostResponse.getStatusCode() == 0) {
            String errorMsg = editPostResponse.getErrorMsg();
            if (errorMsg == null) {
                errorMsg = "";
            }
            if (errorMsg.length() > 0 || (editDiffMessage = editPostResponse.getEditDiffMessage()) == null) {
                return;
            }
            LIZIZ(editDiffMessage.getAid(), editDiffMessage.getPermission());
            if (activity == null) {
                return;
            }
            C26045AKb c26045AKb = new C26045AKb(activity);
            c26045AKb.LJFF(R.raw.icon_tick_fill_small);
            c26045AKb.LJII(R.attr.e8);
            c26045AKb.LJIIIZ(activity.getString(R.string.fqt));
            c26045AKb.LJIIJ();
        }
    }

    public static final void LIZIZ(String aid, EditPostPermission editPostPermission) {
        o.LJIIIZ(aid, "aid");
        if (aid.length() == 0) {
            return;
        }
        C62822Ol8 c62822Ol8 = LIZ;
        Aweme i6 = ((IAwemeService) c62822Ol8.getValue()).i6(aid);
        if (i6 == null) {
            return;
        }
        i6.setEditPostPermission(editPostPermission);
        ((IAwemeService) c62822Ol8.getValue()).R1(i6);
        C2U8.LIZ(new C50420Jqa(70, i6));
    }
}
