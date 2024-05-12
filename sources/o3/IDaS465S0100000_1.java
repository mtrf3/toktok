package o3;

import X.AbstractViewOnClickListenerC105754Db;
import X.C108994Pn;
import X.C113864dS;
import X.C16120kC;
import X.C17720mm;
import X.C17760mq;
import X.EF7;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.activity.FriendChatDetailActivity;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public class IDaS465S0100000_1 extends C16120kC {
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
            case 5:
                onInitializeAccessibilityNodeInfo$5(this, view, c17760mq);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(view, c17760mq);
                return;
        }
    }

    public IDaS465S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onInitializeAccessibilityNodeInfo$0(IDaS465S0100000_1 iDaS465S0100000_1, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LIZIZ(new C17720mm(16, ((FriendChatDetailActivity) iDaS465S0100000_1.l0).getString(R.string.ab6)));
        info.LJIILJJIL(Switch.class.getName());
        info.LJIJ(((FriendChatDetailActivity) iDaS465S0100000_1.l0).LLILLL().getText());
    }

    public static final void onInitializeAccessibilityNodeInfo$1(IDaS465S0100000_1 iDaS465S0100000_1, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        host.setContentDescription(((IMContact) iDaS465S0100000_1.l0).getDisplayName());
        info.LJIILJJIL(TextView.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$2(IDaS465S0100000_1 iDaS465S0100000_1, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIJ(((C113864dS) iDaS465S0100000_1.l0).LJLILLLLZI.getText());
        info.LJIILJJIL(Button.class.getName());
    }

    public static final void onInitializeAccessibilityNodeInfo$3(IDaS465S0100000_1 iDaS465S0100000_1, View host, C17760mq info) {
        int i;
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LIZIZ(new C17720mm(16, ((AbstractViewOnClickListenerC105754Db) iDaS465S0100000_1.l0).getString(R.string.ab6)));
        info.LJIILJJIL(Switch.class.getName());
        info.LJIJ(((AbstractViewOnClickListenerC105754Db) iDaS465S0100000_1.l0).LLIIIILZ().getText());
        AbstractViewOnClickListenerC105754Db abstractViewOnClickListenerC105754Db = (AbstractViewOnClickListenerC105754Db) iDaS465S0100000_1.l0;
        if (abstractViewOnClickListenerC105754Db.LLII().isChecked()) {
            i = R.string.j9u;
        } else {
            i = R.string.j8d;
        }
        info.LJJIII(abstractViewOnClickListenerC105754Db.getString(i));
    }

    public static final void onInitializeAccessibilityNodeInfo$4(IDaS465S0100000_1 iDaS465S0100000_1, View host, C17760mq info) {
        int i;
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LIZIZ(new C17720mm(16, ((AbstractViewOnClickListenerC105754Db) iDaS465S0100000_1.l0).getString(R.string.ab6)));
        info.LJIILJJIL(Switch.class.getName());
        Object value = ((AbstractViewOnClickListenerC105754Db) iDaS465S0100000_1.l0).LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-stickTopText>(...)");
        info.LJIJ(((TextView) value).getText());
        AbstractViewOnClickListenerC105754Db abstractViewOnClickListenerC105754Db = (AbstractViewOnClickListenerC105754Db) iDaS465S0100000_1.l0;
        if (abstractViewOnClickListenerC105754Db.LLIIIJ().isChecked()) {
            i = R.string.j9u;
        } else {
            i = R.string.j8d;
        }
        info.LJJIII(abstractViewOnClickListenerC105754Db.getString(i));
    }

    public static final void onInitializeAccessibilityNodeInfo$5(IDaS465S0100000_1 iDaS465S0100000_1, View host, C17760mq info) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(host, info);
        info.LJIILJJIL(Button.class.getName());
        info.LJIILL(true);
        if (((C108994Pn) iDaS465S0100000_1.l0).LJLLILLLL.LJLJLLL) {
            info.LJJIII(EF7.LIZIZ().getString(R.string.aow));
        }
        if (((C108994Pn) iDaS465S0100000_1.l0).LJLJJLL.isSelected()) {
            info.LIZ.setSelected(((C108994Pn) iDaS465S0100000_1.l0).LJLJJLL.isSelected());
        }
        info.LIZIZ(C17720mm.LJI);
    }
}
