package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.android.livesdk.livesetting.game.GameLiveMemoryLeakOptSetting;
import com.bytedance.android.livesdk.util.GlobalContext;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class C9O extends BroadcastReceiver {
    public WeakReference<Context> LIZ;
    public EnumC48190Ivi LIZIZ = EnumC48190Ivi.NONE;
    public final List<WeakReference<C9W>> LIZJ = new ArrayList();
    public final java.util.Map<String, C9W> LIZLLL = new ConcurrentHashMap();

    public final void LIZLLL() {
        WeakReference<Context> weakReference = this.LIZ;
        if (weakReference != null && weakReference.get() != null) {
            try {
                C16880lQ.LJJLIIIJL(this.LIZ.get(), this);
            } catch (Exception unused) {
            }
        }
    }

    public final void LIZ(Context context) {
        this.LIZ = new WeakReference<>(context);
        if (context != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            C16880lQ.LJJLIIIJILLIZJL(this, context, intentFilter);
        }
        if (!GameLiveMemoryLeakOptSetting.INSTANCE.getValue()) {
            this.LIZIZ = C48189Ivh.LJ(context);
        } else {
            this.LIZIZ = C48189Ivh.LJ(GlobalContext.getApplicationContext());
        }
    }

    public final void LIZJ(C9W c9w) {
        Iterator it = ((ArrayList) this.LIZJ).iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            if (reference != null && reference.get() == c9w) {
                ((ArrayList) this.LIZJ).remove(reference);
                return;
            }
        }
    }

    public final void LIZIZ(Context context, Intent intent) {
        C9W c9w;
        if (intent != null && intent.getAction() != null && intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            EnumC48190Ivi enumC48190Ivi = this.LIZIZ;
            if (!GameLiveMemoryLeakOptSetting.INSTANCE.getValue()) {
                this.LIZIZ = C48189Ivh.LJ(context);
            } else {
                this.LIZIZ = C48189Ivh.LJ(GlobalContext.getApplicationContext());
            }
            if (enumC48190Ivi != this.LIZIZ) {
                List<WeakReference<C9W>> list = this.LIZJ;
                if (list != null) {
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        Reference reference = (Reference) it.next();
                        if (reference != null && (c9w = (C9W) reference.get()) != null) {
                            c9w.LIZ(this.LIZIZ);
                        }
                    }
                }
                Iterator it2 = ((ConcurrentHashMap) this.LIZLLL).entrySet().iterator();
                while (it2.hasNext()) {
                    ((C9W) ((Map.Entry) it2.next()).getValue()).LIZ(this.LIZIZ);
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZIZ(context, intent);
        }
    }
}
