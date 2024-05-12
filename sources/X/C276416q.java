package X;

import Y.IDRunnableS2S0300000;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.16q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C276416q {
    public final C36251bZ LIZIZ;
    public final AnonymousClass141 LIZJ;
    public int LIZLLL;
    public long LJ;
    public final C39321gW LJFF = new AnonymousClass141() { // from class: X.1gW
        @Override // X.AnonymousClass141
        public final void LIZ(C36681cG c36681cG) {
            if (c36681cG.LJII != C0E3.INIT) {
                C276416q c276416q = C276416q.this;
                c276416q.LIZ(c276416q.LIZIZ, c36681cG);
                C276416q.this.LIZJ.LIZ(c36681cG);
            } else {
                C276416q c276416q2 = C276416q.this;
                if (c276416q2.LIZLLL <= 10) {
                    c276416q2.LIZ.sendEmptyMessageDelayed(1, 500L);
                } else {
                    c276416q2.LIZ(c276416q2.LIZIZ, c36681cG);
                    C276416q.this.LIZJ.LIZ(new C36681cG(0));
                }
            }
        }
    };
    public final HandlerC276316p LIZ = new Handler(this) { // from class: X.16p
        public final C276416q LIZ;

        {
            super(C16880lQ.LLJJJJ());
            this.LIZ = this;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                C276416q c276416q = this.LIZ;
                c276416q.LIZLLL++;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("start the ");
                LIZ.append(c276416q.LIZLLL);
                LIZ.append(" time query");
                X1D.LIZIZ(LIZ);
                C276216o c276216o = C276216o.LJIIL;
                if (c276216o.LIZJ == null) {
                    synchronized (c276216o) {
                        if (c276216o.LIZJ == null) {
                            c276216o.LIZJ = new C0RG();
                        }
                    }
                }
                C0RG c0rg = c276216o.LIZJ;
                C36251bZ c36251bZ = c276416q.LIZIZ;
                C39321gW c39321gW = c276416q.LJFF;
                c0rg.getClass();
                if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                    RunnableC39007FSp.LIZIZ(new IDRunnableS2S0300000(c36251bZ, c39321gW, c0rg, 9));
                } else {
                    C0RG.LIZIZ(c36251bZ, c39321gW);
                }
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1gW] */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.16p] */
    public C276416q(C36251bZ c36251bZ, SA6 sa6) {
        this.LIZIZ = c36251bZ;
        this.LIZJ = sa6;
    }

    public final void LIZ(C36251bZ c36251bZ, C36681cG c36681cG) {
        long currentTimeMillis = System.currentTimeMillis();
        C1DJ LIZIZ = C276216o.LJIIL.LIZIZ();
        c36251bZ.getClass();
        String str = c36251bZ.LJIIIIZZ;
        C0E3 c0e3 = c36681cG.LJII;
        String str2 = c36681cG.LJFF;
        String str3 = c36681cG.LJI;
        int i = this.LIZLLL;
        long j = currentTimeMillis - this.LJ;
        String c36681cG2 = c36681cG.toString();
        LIZIZ.getClass();
        JSONObject LIZLLL = C1DJ.LIZLLL();
        try {
            LIZLLL.put("merchant_order_id", (Object) null);
            LIZLLL.put("param_payment_reference", str);
            LIZLLL.put("order_status", c0e3.getStatus());
            LIZLLL.put("error_code", str2);
            LIZLLL.put("error_message", str3);
            LIZLLL.put("try_times", i);
            LIZLLL.put("param_duration", j);
            LIZLLL.put("param_response_str", c36681cG2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        LIZIZ.onEventV3("ecommerce_query", LIZLLL);
    }
}
