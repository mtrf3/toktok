package X;

import Y.ARunnableS27S0200000_8;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.JFk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48856JFk extends BroadcastReceiver {
    public static boolean LIZLLL;
    public final QMH LIZ;
    public boolean LIZIZ = true;
    public final EnumC48006Isk LIZJ;

    public C48856JFk(Context context, QMH qmh) {
        this.LIZJ = C48005Isj.LIZIZ(context);
        this.LIZ = qmh;
    }

    public final void LIZ(Context context, Intent intent) {
        if (context == null || intent == null || this.LIZ == null || TextUtils.isEmpty(intent.getAction()) || !"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        if (this.LIZIZ) {
            this.LIZIZ = false;
            if (C48005Isj.LIZIZ(context) == this.LIZJ) {
                return;
            }
        }
        RunnableC39007FSp.LIZIZ(new ARunnableS27S0200000_8(this, context, 60));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!C84763XOl.LJIIJJI && intent != null) {
            if (!((ArrayList) C38413F5t.LIZ).contains(intent.getAction()) && C38413F5t.LIZ("onBroadcastReceiverReceive")) {
                C35532Dx2.LIZIZ();
            }
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            LIZ(context, intent);
        } else {
            C38523F9z.LIZ();
            LIZ(context, intent);
        }
    }
}
