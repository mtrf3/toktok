package X;

import android.content.res.Resources;
import android.os.Build;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.ControlMessage;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BWQ extends CQO<ControlMessage> {
    @Override // X.InterfaceC31078CHq, X.CXK
    public final User getUser() {
        return null;
    }

    @Override // X.CQL
    public final CharSequence LJJZZIII() {
        ControlMessage controlMessage = (ControlMessage) this.LJIJJLI;
        if (controlMessage == null) {
            return "";
        }
        Resources resources = C15380j0.LIZLLL().getResources();
        int i = controlMessage.action;
        if (i != 1) {
            if (i != 2) {
                return "";
            }
            if (Build.VERSION.SDK_INT >= 24) {
                return C15380j0.LJIILJJIL(R.string.sx1);
            }
            return resources.getString(R.string.sx1);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return C15380j0.LJIILJJIL(R.string.sv9);
        }
        return resources.getString(R.string.sv9);
    }

    public BWQ(ControlMessage controlMessage) {
        super(controlMessage);
    }
}
