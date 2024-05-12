package X;

import Y.ARunnableS27S0200000_8;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.QJg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66792QJg implements Handler.Callback {
    public static final JFT LJLLI = new JFT();
    public final QIF LJLIL;
    public final C66791QJf LJLILLLLZI;
    public final Handler LJLJI;
    public final InterfaceC66823QKl LJLJJI;
    public C48852JFg LJLJJL;
    public final AtomicBoolean LJLJJLL;
    public C66790QJe LJLJL;
    public C66787QJb LJLJLJ;
    public long LJLJLLL;
    public C66811QJz LJLL;

    public final void LIZ(C66787QJb c66787QJb) {
        this.LJLJJLL.set(true);
        C66787QJb c66787QJb2 = this.LJLJLJ;
        if (c66787QJb2 != null) {
            c66787QJb2.LJFF = true;
            this.LJLJI.removeMessages(1235, c66787QJb2);
        }
        this.LJLJLJ = c66787QJb;
        LJ(c66787QJb, false);
    }

    public final boolean LIZIZ(C48852JFg c48852JFg) {
        if (this.LJLJJL.equals(c48852JFg)) {
            return false;
        }
        this.LJLJJL = c48852JFg;
        C66791QJf c66791QJf = this.LJLILLLLZI;
        c66791QJf.LIZLLL = c48852JFg;
        c66791QJf.LJIIIZ = c66791QJf.LIZ(c66791QJf.LJ, c48852JFg);
        JFY.LIZ(c66791QJf.LJ, c48852JFg, c66791QJf.LJFF);
        synchronized (c66791QJf.LIZ) {
            c66791QJf.LIZ.put(QK0.class, new QK0(c66791QJf.LJFF, c48852JFg));
            c66791QJf.LIZ.put(C66806QJu.class, new C66806QJu(c48852JFg, c66791QJf.LJFF));
            c66791QJf.LIZ.put(C66786QJa.class, new C66786QJa(c66791QJf.LJ, c48852JFg, c66791QJf.LJFF));
            c66791QJf.LIZ.put(QK4.class, new QK4(c66791QJf.LJFF));
        }
        SharedPreferences LIZ = c48852JFg.LIZ(c66791QJf.LJFF);
        if (LIZ != null) {
            LIZ.edit().putLong("register_time", 0L).apply();
            return true;
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 1234) {
            if (i == 1235) {
                AbstractC48869JFx abstractC48869JFx = (AbstractC48869JFx) message.obj;
                if (this.LJLIL.LJJII && !((QK3) this.LJLJJI).LJLILLLLZI) {
                    Handler handler = this.LJLJI;
                    Message obtainMessage = handler.obtainMessage(1235, abstractC48869JFx);
                    abstractC48869JFx.getClass();
                    handler.sendMessageDelayed(obtainMessage, 60000L);
                } else if (!abstractC48869JFx.LJFF) {
                    JFV.LJ(new ARunnableS27S0200000_8(this, abstractC48869JFx, 54), String.valueOf(this.LJLIL.LIZ));
                }
            }
        } else {
            LIZLLL(this.LJLJJL, ((Boolean) message.obj).booleanValue());
        }
        return false;
    }

    public static void LIZJ(C48868JFw c48868JFw, AbstractC48869JFx abstractC48869JFx) {
        if (abstractC48869JFx != null) {
            if (c48868JFw.LIZ) {
                abstractC48869JFx.LJIIIIZZ(c48868JFw.LIZLLL);
                abstractC48869JFx.LJII(c48868JFw.LIZ);
                abstractC48869JFx.LIZ();
            } else {
                if (c48868JFw.LIZIZ != 4) {
                    return;
                }
                abstractC48869JFx.LJIIIIZZ(c48868JFw.LIZLLL);
                abstractC48869JFx.LJII(c48868JFw.LIZ);
                abstractC48869JFx.LIZ();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a8, code lost:
    
        if ((!android.text.TextUtils.equals(X.C48847JFb.LIZ(r5.LJ, r5.LJFF).getString("dr_aid", null), java.lang.String.valueOf(r5.LJFF.LIZ))) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C48852JFg r10, boolean r11) {
        /*
            r9 = this;
            X.QIF r0 = r9.LJLIL
            int r0 = r0.LIZ
            java.lang.String r2 = java.lang.String.valueOf(r0)
            Y.ARunnableS47S0100000_11 r1 = new Y.ARunnableS47S0100000_11
            r0 = 92
            r1.<init>(r9, r0)
            X.JFV.LJ(r1, r2)
            X.QJf r0 = r9.LJLILLLLZI
            boolean r0 = r0.LJ()
            if (r0 == 0) goto Lab
            X.QJe r4 = new X.QJe
            X.QIF r2 = r9.LJLIL
            X.QJf r1 = r9.LJLILLLLZI
            X.QKl r0 = r9.LJLJJI
            r4.<init>(r10, r2, r0, r1)
            X.QJz r2 = r9.LJLL
            if (r2 == 0) goto L35
            X.QJT r1 = new X.QJT
            X.QJf r0 = r9.LJLILLLLZI
            org.json.JSONObject r0 = r0.LJIIIIZZ
            r1.<init>(r0)
            r2.LIZ(r1)
        L35:
            r1 = 0
            if (r11 != 0) goto L56
            X.QJf r5 = r9.LJLILLLLZI
            android.content.Context r3 = r5.LJ
            X.QIF r0 = r5.LJFF
            android.content.SharedPreferences r3 = X.C48847JFb.LIZ(r3, r0)
            java.lang.String r0 = "dr_install_vc"
            long r7 = r3.getLong(r0, r1)
            org.json.JSONObject r3 = r5.LJIIIIZZ
            java.lang.String r0 = "version_code"
            long r5 = r3.optLong(r0, r1)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 == 0) goto L6d
        L56:
            r4.LIZLLL = r1
        L58:
            X.QIF r0 = r9.LJLIL
            int r0 = r0.LIZ
            java.lang.String r2 = java.lang.String.valueOf(r0)
            Y.ARunnableS27S0200000_8 r1 = new Y.ARunnableS27S0200000_8
            r0 = 54
            r1.<init>(r9, r4, r0)
            X.JFV.LJ(r1, r2)
            r9.LJLJL = r4
        L6c:
            return
        L6d:
            X.QJf r5 = r9.LJLILLLLZI
            android.content.Context r3 = r5.LJ
            X.QIF r0 = r5.LJFF
            android.content.SharedPreferences r3 = X.C48847JFb.LIZ(r3, r0)
            java.lang.String r0 = "dr_channel"
            r6 = 0
            java.lang.String r3 = r3.getString(r0, r6)
            X.QIF r0 = r5.LJFF
            java.lang.String r0 = r0.LJI
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L56
            X.QJf r5 = r9.LJLILLLLZI
            android.content.Context r3 = r5.LJ
            X.QIF r0 = r5.LJFF
            android.content.SharedPreferences r3 = X.C48847JFb.LIZ(r3, r0)
            java.lang.String r0 = "dr_aid"
            java.lang.String r3 = r3.getString(r0, r6)
            X.QIF r0 = r5.LJFF
            int r0 = r0.LIZ
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L58
            goto L56
        Lab:
            android.os.Handler r0 = r9.LJLJI
            r1 = 1234(0x4d2, float:1.729E-42)
            r0.removeMessages(r1)
            android.os.Handler r3 = r9.LJLJI
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            android.os.Message r2 = r3.obtainMessage(r1, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.sendMessageDelayed(r2, r0)
            goto L6c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66792QJg.LIZLLL(X.JFg, boolean):void");
    }

    public final void LJ(AbstractC48869JFx abstractC48869JFx, boolean z) {
        Handler handler = this.LJLJI;
        if (handler != null) {
            handler.removeMessages(1235, abstractC48869JFx);
            Handler handler2 = this.LJLJI;
            abstractC48869JFx.LIZLLL = 0L;
            Message obtainMessage = handler2.obtainMessage(1235, abstractC48869JFx);
            if (z && Looper.myLooper() == this.LJLJI.getLooper()) {
                handleMessage(obtainMessage);
            } else {
                this.LJLJI.sendMessage(obtainMessage);
            }
        }
    }

    public C66792QJg(C48852JFg c48852JFg, QIF qif, C66791QJf c66791QJf) {
        QK3 qk3 = C66795QJj.LIZ;
        this.LJLJJLL = new AtomicBoolean(false);
        this.LJLIL = qif;
        this.LJLILLLLZI = c66791QJf;
        this.LJLJJI = qk3;
        this.LJLJI = new Handler(JFV.LIZJ(qif.LIZ()), this);
        this.LJLJJL = c48852JFg;
    }
}
