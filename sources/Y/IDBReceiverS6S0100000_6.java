package Y;

import X.AbstractActivityC60886Nv0;
import X.C09970aH;
import X.C16880lQ;
import X.C1PH;
import X.C2NU;
import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C48189Ivh;
import X.C78598Ut0;
import X.C84763XOl;
import X.F7B;
import X.F9U;
import X.IDP;
import X.InterfaceC65784Pro;
import X.QQP;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.CustomTabActivity;
import com.facebook.CustomTabMainActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class IDBReceiverS6S0100000_6 extends BroadcastReceiver {
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
            case 5:
                onReceive$5(this, context, intent);
                return;
            case 6:
                onReceive$6(this, context, intent);
                return;
            case 7:
                onReceive$7(this, context, intent);
                return;
            default:
                super.onReceive(context, intent);
                return;
        }
    }

    public final void LIZ$2(Intent intent) {
        if (intent != null) {
            try {
                String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "PROCESS_NAME");
                String LJIILIIL = C1PH.LJIILIIL();
                C09970aH.LJII();
                if (!TextUtils.isEmpty(LLJJIJIIJIL) && !TextUtils.isEmpty(LJIILIIL) && !LLJJIJIIJIL.equals(LJIILIIL)) {
                    F9U.LIZ.LIZJ(new ARunnableS42S0100000_6(this, 162));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public IDBReceiverS6S0100000_6(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public final void LIZ$0(Context context, Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        try {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || !C2NU.LIZ.LIZIZ()) {
                return;
            }
            QQP qqp = (QQP) this.l0;
            if (!qqp.LJLIL) {
                return;
            }
            qqp.LJLJJI.sendEmptyMessage(0);
        } catch (Throwable unused) {
        }
    }

    public final void LIZ$1(Context context, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        Intent intent2 = new Intent((CustomTabMainActivity) this.l0, (Class<?>) CustomTabMainActivity.class);
        intent2.setAction(CustomTabMainActivity.LJLJLJ);
        String str = CustomTabMainActivity.LJLJJLL;
        intent2.putExtra(str, C16880lQ.LLJJIJIIJIL(intent, str));
        intent2.addFlags(603979776);
        CustomTabMainActivity customTabMainActivity = (CustomTabMainActivity) this.l0;
        C78598Ut0.LJIJJ(intent2, customTabMainActivity);
        customTabMainActivity.startActivity(intent2);
    }

    public static final void onReceive$0(IDBReceiverS6S0100000_6 iDBReceiverS6S0100000_6, Context context, Intent intent) {
        IDP idp;
        Aweme aweme;
        IDP idp2;
        Aweme aweme2;
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (!"android.intent.action.USER_PRESENT".equals(intent.getAction()) || (aweme2 = (idp2 = (IDP) iDBReceiverS6S0100000_6.l0).LLJILJILJ) == null || !idp2.LLJILLL) {
                return;
            }
            idp2.LJLLLL(0, aweme2);
            return;
        }
        C38523F9z.LIZ();
        if (!"android.intent.action.USER_PRESENT".equals(intent.getAction()) || (aweme = (idp = (IDP) iDBReceiverS6S0100000_6.l0).LLJILJILJ) == null || !idp.LLJILLL) {
            return;
        }
        idp.LJLLLL(0, aweme);
    }

    public static final void onReceive$1(IDBReceiverS6S0100000_6 iDBReceiverS6S0100000_6, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS6S0100000_6.LIZ$0(context, intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS6S0100000_6.LIZ$0(context, intent);
        }
    }

    public static final void onReceive$2(IDBReceiverS6S0100000_6 iDBReceiverS6S0100000_6, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (!((AbstractActivityC60886Nv0) iDBReceiverS6S0100000_6.l0).isFinishing()) {
                ((AbstractActivityC60886Nv0) iDBReceiverS6S0100000_6.l0).finish();
            }
        } else {
            C38523F9z.LIZ();
            if (((AbstractActivityC60886Nv0) iDBReceiverS6S0100000_6.l0).isFinishing()) {
                return;
            }
            ((AbstractActivityC60886Nv0) iDBReceiverS6S0100000_6.l0).finish();
        }
    }

    public static final void onReceive$3(IDBReceiverS6S0100000_6 iDBReceiverS6S0100000_6, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            o.LJIIIZ(context, "context");
            ((CustomTabActivity) iDBReceiverS6S0100000_6.l0).finish();
        } else {
            C38523F9z.LIZ();
            o.LJIIIZ(context, "context");
            ((CustomTabActivity) iDBReceiverS6S0100000_6.l0).finish();
        }
    }

    public static final void onReceive$4(IDBReceiverS6S0100000_6 iDBReceiverS6S0100000_6, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS6S0100000_6.LIZ$1(context, intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS6S0100000_6.LIZ$1(context, intent);
        }
    }

    public static final void onReceive$5(IDBReceiverS6S0100000_6 iDBReceiverS6S0100000_6, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (o.LJ(intent.getAction(), "android.media.AUDIO_BECOMING_NOISY")) {
                ((InterfaceC65784Pro) iDBReceiverS6S0100000_6.l0).invoke();
            }
        } else {
            C38523F9z.LIZ();
            if (!o.LJ(intent.getAction(), "android.media.AUDIO_BECOMING_NOISY")) {
                return;
            }
            ((InterfaceC65784Pro) iDBReceiverS6S0100000_6.l0).invoke();
        }
    }

    public static final void onReceive$6(IDBReceiverS6S0100000_6 iDBReceiverS6S0100000_6, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        try {
            if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    F7B f7b = (F7B) iDBReceiverS6S0100000_6.l0;
                    f7b.LIZJ = C48189Ivh.LJ(f7b.LIZ);
                }
            } else {
                C38523F9z.LIZ();
                if (intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    F7B f7b2 = (F7B) iDBReceiverS6S0100000_6.l0;
                    f7b2.LIZJ = C48189Ivh.LJ(f7b2.LIZ);
                }
            }
        } catch (Exception unused) {
        }
    }

    public static final void onReceive$7(IDBReceiverS6S0100000_6 iDBReceiverS6S0100000_6, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS6S0100000_6.LIZ$2(intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS6S0100000_6.LIZ$2(intent);
        }
    }
}
