package Y;

import X.C35532Dx2;
import X.C38413F5t;
import X.C38523F9z;
import X.C44694HgQ;
import X.C45498HtO;
import X.C45501HtR;
import X.C45623HvP;
import X.C84763XOl;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.util.ArrayList;
import java.util.LinkedList;

/* loaded from: classes8.dex */
public class IDBReceiverS7S0100000_7 extends BroadcastReceiver {
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
            default:
                super.onReceive(context, intent);
                return;
        }
    }

    public final void LIZ$0(Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            ((VEEditorAutoStartStopArbiter) this.l0).getClass();
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = (VEEditorAutoStartStopArbiter) this.l0;
            if (!vEEditorAutoStartStopArbiter.LJLJJL) {
                vEEditorAutoStartStopArbiter.LJLLJ = vEEditorAutoStartStopArbiter.LJLJI.getState();
                ((VEEditorAutoStartStopArbiter) this.l0).LIZIZ();
            }
        }
    }

    public final void LIZ$1(Intent intent) {
        ArrayList<String> stringArrayListExtra;
        if (intent != null && (stringArrayListExtra = intent.getStringArrayListExtra("key-auto-test-select-media")) != null) {
            C45498HtO c45498HtO = ((C45501HtR) this.l0).LJLJI;
            c45498HtO.getClass();
            if (C45623HvP.LIZ()) {
                ((LinkedList) c45498HtO.LLIIJI).addAll(stringArrayListExtra);
                for (String str : c45498HtO.LLIIJI) {
                    int i = 0;
                    while (true) {
                        if (i < c45498HtO.LJZI.size()) {
                            MyMediaModel myMediaModel = (MyMediaModel) ListProtector.get(c45498HtO.LJZI, i);
                            if (C44694HgQ.LJIIL(myMediaModel).endsWith(str)) {
                                c45498HtO.LLF(myMediaModel, -1, true);
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    public IDBReceiverS7S0100000_7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onReceive$0(IDBReceiverS7S0100000_7 iDBReceiverS7S0100000_7, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS7S0100000_7.LIZ$0(intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS7S0100000_7.LIZ$0(intent);
        }
    }

    public static final void onReceive$1(IDBReceiverS7S0100000_7 iDBReceiverS7S0100000_7, Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            iDBReceiverS7S0100000_7.LIZ$1(intent);
        } else {
            C38523F9z.LIZ();
            iDBReceiverS7S0100000_7.LIZ$1(intent);
        }
    }
}
