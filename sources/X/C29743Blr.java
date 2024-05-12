package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.usercard.profilev3.LiveProfileAudienceOperationCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Blr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29743Blr extends C16120kC {
    public final /* synthetic */ C2A7 LIZ;
    public final /* synthetic */ LiveProfileAudienceOperationCell LIZIZ;

    public C29743Blr(C2A7 c2a7, LiveProfileAudienceOperationCell liveProfileAudienceOperationCell) {
        this.LIZ = c2a7;
        this.LIZIZ = liveProfileAudienceOperationCell;
    }

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIILJJIL(Button.class.getName());
        Resources resources = this.LIZ.getContext().getResources();
        Object[] objArr = new Object[1];
        User user = this.LIZIZ.LJLLL;
        if (user != null) {
            objArr[0] = C05170If.LIZ(user);
            info.LJIJ(resources.getString(R.string.k43, objArr));
        } else {
            o.LJIJI("targetUser");
            throw null;
        }
    }
}
