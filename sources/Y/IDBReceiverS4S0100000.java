package Y;

import X.AbstractC009301x;
import X.ActivityC45651qj;
import X.C12F;
import X.C16880lQ;
import X.C1V6;
import X.C22970vF;
import X.C265012g;
import X.C35532Dx2;
import X.C37661dq;
import X.C37691dt;
import X.C38413F5t;
import X.C38523F9z;
import X.C78857UxB;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public class IDBReceiverS4S0100000 extends BroadcastReceiver {
    public final int $t;
    public Object l0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.$t) {
            case 0:
                onReceive$0(this, context, intent);
                return;
            case 1:
                onReceive$1(this, context, intent);
                return;
            case 2:
                onReceive$2(this, context, intent);
                return;
            case 3:
                onReceive$3(this, context, intent);
                return;
            case 4:
                onReceive$4(this, context, intent);
                return;
            default:
                super.onReceive(context, intent);
                return;
        }
    }

    public final void LIZ$1(Intent intent) {
        String action = intent.getAction();
        if (((C37691dt) this.l0).LJLJI == null) {
            return;
        }
        if ("android.intent.action.SCREEN_ON".equals(action)) {
            C37691dt c37691dt = (C37691dt) this.l0;
            if (!c37691dt.LJLJL) {
                c37691dt.LJLJI.LJIIJJI(C78857UxB.LJJIIJ(1476788233, "bpea-367"));
                return;
            }
        }
        if (!"android.intent.action.SCREEN_OFF".equals(action)) {
            return;
        }
        ((C37691dt) this.l0).LJLJI.LIZJ(C78857UxB.LJJIIJ(1476788484, "bpea-388"));
    }

    public IDBReceiverS4S0100000(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public final void LIZ$0(Context context, Intent intent) {
        boolean z;
        Window window;
        View decorView;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        if (!TextUtils.equals(intent.getAction(), "android.intent.action.CONFIGURATION_CHANGED")) {
            return;
        }
        int LIZIZ = C22970vF.LIZIZ();
        int LIZ = C22970vF.LIZ();
        Object LLILL = C16880lQ.LLILL(C16880lQ.LLLLL(context), "window");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.WindowManager");
        WindowManager windowManager = (WindowManager) LLILL;
        Point point = new Point();
        try {
            windowManager.getDefaultDisplay().getSize(point);
            LIZIZ = point.x;
            LIZ = point.y;
            z = true;
        } catch (Exception unused) {
        }
        if (windowManager.getDefaultDisplay().getRotation() == 1) {
            if (LIZIZ <= LIZ && z && Build.VERSION.SDK_INT >= 28) {
                C37661dq c37661dq = (C37661dq) this.l0;
                ActivityC45651qj activityC45651qj = c37661dq.LJFF;
                if (activityC45651qj != null && (window = activityC45651qj.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    decorView.post(new IDRunnableS29S0200000(decorView, c37661dq, 46));
                    return;
                }
                return;
            }
            C37661dq c37661dq2 = (C37661dq) this.l0;
            c37661dq2.getClass();
            C12F c12f = C12F.CMD_ORIENTATION_CHANGED;
            c12f.setParam(new C265012g(false, 0));
            c37661dq2.LJIJ(c12f);
        }
        z = false;
        if (LIZIZ <= LIZ) {
        }
        C37661dq c37661dq22 = (C37661dq) this.l0;
        c37661dq22.getClass();
        C12F c12f2 = C12F.CMD_ORIENTATION_CHANGED;
        c12f2.setParam(new C265012g(false, 0));
        c37661dq22.LJIJ(c12f2);
    }

    public static final void onReceive$0(IDBReceiverS4S0100000 iDBReceiverS4S0100000, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            ((AbstractC009301x) iDBReceiverS4S0100000.l0).LIZLLL();
        } else {
            C38523F9z.LIZ();
            ((AbstractC009301x) iDBReceiverS4S0100000.l0).LIZLLL();
        }
    }

    public static final void onReceive$1(IDBReceiverS4S0100000 iDBReceiverS4S0100000, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        try {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                ((IntentSender) iDBReceiverS4S0100000.l0).sendIntent(context, 0, null, null, null);
            } else {
                C38523F9z.LIZ();
                ((IntentSender) iDBReceiverS4S0100000.l0).sendIntent(context, 0, null, null, null);
            }
        } catch (IntentSender.SendIntentException unused) {
        }
    }

    public static final void onReceive$2(IDBReceiverS4S0100000 iDBReceiverS4S0100000, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            ((C1V6) iDBReceiverS4S0100000.l0).LJI(intent);
        } else {
            C38523F9z.LIZ();
            ((C1V6) iDBReceiverS4S0100000.l0).LJI(intent);
        }
    }

    public static final void onReceive$3(IDBReceiverS4S0100000 iDBReceiverS4S0100000, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS4S0100000.LIZ$0(context, intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS4S0100000.LIZ$0(context, intent);
        }
    }

    public static final void onReceive$4(IDBReceiverS4S0100000 iDBReceiverS4S0100000, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS4S0100000.LIZ$1(intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS4S0100000.LIZ$1(intent);
        }
    }
}
