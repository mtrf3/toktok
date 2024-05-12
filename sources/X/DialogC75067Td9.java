package X;

import Y.ACListenerS33S0100000_13;
import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Td9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class DialogC75067Td9 extends AbstractDialogC29234Bde {
    public String LJLJI;

    @Override // X.AbstractDialogC29234Bde
    public final int LJJIIJ() {
        return R.layout.czh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC75067Td9(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
    }

    @Override // X.AbstractDialogC29234Bde, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        TextView textView = (TextView) findViewById(R.id.gcj);
        if (textView != null && (str = this.LJLJI) != null) {
            textView.setText(str);
        }
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.awx);
        if (liveIconView != null) {
            C16880lQ.LJJII(liveIconView, new ACListenerS33S0100000_13(this, 126));
        }
    }
}
