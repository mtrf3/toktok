package Y;

import X.C40376Fsy;
import X.C78685UuP;
import X.FW5;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.ss.android.ugc.awemepushapi.IPushApi;

/* loaded from: classes7.dex */
public class ARunnableS6S0210000_6 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$0() {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS6S0210000_6.LIZ$0():void");
    }

    public static final void run$0(ARunnableS6S0210000_6 aRunnableS6S0210000_6) {
        boolean LIZ;
        try {
            IPushApi LJJIII = C78685UuP.LJJIII();
            boolean z = aRunnableS6S0210000_6.z2;
            C40376Fsy c40376Fsy = (C40376Fsy) aRunnableS6S0210000_6.l1;
            LJJIII.notifyOnDeeplink(z, c40376Fsy.LIZ, c40376Fsy.LIZIZ, (Uri) aRunnableS6S0210000_6.l0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS6S0210000_6 aRunnableS6S0210000_6) {
        boolean LIZ;
        try {
            aRunnableS6S0210000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS6S0210000_6 aRunnableS6S0210000_6) {
        boolean LIZ;
        try {
            if (aRunnableS6S0210000_6.z2) {
                FW5.LJIIJ = true;
                ((Handler) aRunnableS6S0210000_6.l0).sendMessageAtFrontOfQueue((Message) aRunnableS6S0210000_6.l1);
            } else {
                ((Handler) aRunnableS6S0210000_6.l0).sendMessage((Message) aRunnableS6S0210000_6.l1);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS6S0210000_6(android.net.Uri r2, X.C40376Fsy r3, boolean r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r3
            r0.l0 = r2
            r0.z2 = r4
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l1 = r3
            r0.z2 = r4
            r0.l0 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS6S0210000_6.<init>(android.net.Uri, X.Fsy, boolean, int):void");
    }

    public ARunnableS6S0210000_6(boolean z, Handler handler, Message message, int i) {
        this.$t = i;
        this.z2 = z;
        this.l0 = handler;
        this.l1 = message;
    }
}
