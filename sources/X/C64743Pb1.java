package X;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.ttnet.TTNetInit;

/* renamed from: X.Pb1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64743Pb1 extends RunnableC39007FSp {
    public final /* synthetic */ java.util.Map LJLJJL;
    public final /* synthetic */ C64734Pas LJLJJLL;

    public final void LIZJ() {
        TTNetInit.getTTNetDepend().LJ(this.LJLJJLL.LJLJJL, this.LJLJJL);
        Intent intent = new Intent("com.bytedance.ttnet.config.appconfig.SYNC_MAIN_PROCESS_CONFIG");
        if (!TextUtils.isEmpty(C64734Pas.LLII)) {
            intent.setPackage(C64734Pas.LLII);
        }
        this.LJLJJLL.LJLJJL.sendBroadcast(intent);
    }

    @Override // X.RunnableC39007FSp, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C64743Pb1(C64734Pas c64734Pas, java.util.Map map) {
        super((Object) null);
        this.LJLJJLL = c64734Pas;
        this.LJLJJL = map;
    }
}
