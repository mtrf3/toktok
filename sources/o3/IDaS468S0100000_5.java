package o3;

import X.C16120kC;
import X.C17760mq;
import X.C29867Bnr;
import X.C2A8;
import X.C31685Cc5;
import X.X1D;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.livesdk.broadcast.preview.widget.PreviewBaseSlotWidget;
import com.bytedance.android.livesdk.userinfowidget.LiveRoomUserInfoWidget;
import com.google.gson.internal.b;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDaS468S0100000_5 extends C16120kC {
    public final int $t;
    public Object l0;

    @Override // X.C16120kC
    public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
        switch (this.$t) {
            case 0:
                onInitializeAccessibilityNodeInfo$0(this, view, c17760mq);
                return;
            case 1:
                onInitializeAccessibilityNodeInfo$1(this, view, c17760mq);
                return;
            case 2:
                onInitializeAccessibilityNodeInfo$2(this, view, c17760mq);
                return;
            case 3:
                onInitializeAccessibilityNodeInfo$3(this, view, c17760mq);
                return;
            case 4:
                onInitializeAccessibilityNodeInfo$4(this, view, c17760mq);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(view, c17760mq);
                return;
        }
    }

    public IDaS468S0100000_5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(IDaS468S0100000_5 iDaS468S0100000_5, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIJ(((AppCompatTextView) ((View) iDaS468S0100000_5.l0).findViewById(R.id.nj3)).getText());
        info.LJIILJJIL(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$1(IDaS468S0100000_5 iDaS468S0100000_5, View host, C17760mq info) {
        CharSequence charSequence;
        TextView textView;
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        C31685Cc5 c31685Cc5 = ((PreviewBaseSlotWidget) iDaS468S0100000_5.l0).LJLJJI;
        if (c31685Cc5 != null && (textView = c31685Cc5.getTextView()) != null) {
            charSequence = textView.getText();
        } else {
            charSequence = null;
        }
        info.LJIJ(charSequence);
        info.LJIILJJIL(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$2(IDaS468S0100000_5 iDaS468S0100000_5, View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        c17760mq.LJIILJJIL(Button.class.getName());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append((Object) ((LiveRoomUserInfoWidget) iDaS468S0100000_5.l0).LJLJLLL.getText());
        LIZ.append(",");
        LIZ.append((Object) ((LiveRoomUserInfoWidget) iDaS468S0100000_5.l0).LJLLILLLL.getText());
        c17760mq.LJIJ(X1D.LIZIZ(LIZ));
    }

    public static final void onInitializeAccessibilityNodeInfo$3(IDaS468S0100000_5 iDaS468S0100000_5, View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        c17760mq.LJIILJJIL(Button.class.getName());
        c17760mq.LJIJ(((LiveRoomUserInfoWidget) iDaS468S0100000_5.l0).context.getResources().getString(R.string.k3y, ((LiveRoomUserInfoWidget) iDaS468S0100000_5.l0).LJLJLLL.getText()));
    }

    public static final void onInitializeAccessibilityNodeInfo$4(IDaS468S0100000_5 iDaS468S0100000_5, View view, C17760mq c17760mq) {
        super.onInitializeAccessibilityNodeInfo(view, c17760mq);
        c17760mq.LJIILJJIL(Button.class.getName());
        C29867Bnr c29867Bnr = (C29867Bnr) iDaS468S0100000_5.l0;
        if (c29867Bnr.LLF > 0) {
            Resources resources = c29867Bnr.LJLL.getResources();
            int i = ((C29867Bnr) iDaS468S0100000_5.l0).LLF;
            c17760mq.LJIJ(resources.getQuantityString(R.plurals.k9, i, b.LJIJ(i)));
        } else {
            C2A8 c2a8 = c29867Bnr.LJZL;
            if (c2a8 != null) {
                c17760mq.LJIJ(c2a8.getText());
            } else {
                c17760mq.LJIJ("");
            }
        }
    }
}
