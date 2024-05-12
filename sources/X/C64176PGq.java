package X;

import android.os.Handler;
import android.os.Message;
import android.os.MessageQueue;
import android.os.Process;
import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PGq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64176PGq extends PEL {
    public final C64183PGx LJ;
    public int LJFF;
    public volatile int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public C64178PGs LJIIIZ;
    public long LJIIJ;
    public long LJIIJJI;
    public int LJIIL;
    public long LJIILIIL;
    public String LJIILJJIL;
    public String LJIILL;
    public C64175PGp LJIILLIIL;
    public volatile boolean LJIIZILJ;
    public boolean LJIJ;
    public final PF4 LJIJI;
    public volatile boolean LJIJJ;
    public final RunnableC46412IJk LJIJJLI;

    public static final JSONArray LJ() {
        return null;
    }

    @Override // X.PEL
    public final void LIZLLL(int i) {
    }

    @Override // X.PEL
    public final Pair<String, ?> LIZ() {
        return new Pair<>(this.LIZ, LJFF());
    }

    @Override // X.PEL
    public final void LIZJ() {
        super.LIZJ();
        if (this.LJIIZILJ) {
            return;
        }
        this.LJIIZILJ = true;
        int i = this.LIZJ;
        if (i != 0 && i != 1) {
            if (i == 2 || i == 3) {
                this.LJII = 300;
                this.LJIIIIZZ = 200;
            }
        } else {
            this.LJII = 100;
            this.LJIIIIZZ = 300;
        }
        this.LJIIIZ = new C64178PGs(this.LJII);
        this.LJIILLIIL = new C64175PGp(this);
        if (C64102PDu.LIZ(128)) {
            PF6.LJFF(this.LJIILLIIL);
        }
        C36515EUt.LIZIZ(C36515EUt.LIZ());
    }

    public final JSONObject LJFF() {
        long uptimeMillis = SystemClock.uptimeMillis();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        int i = 0;
        try {
            Iterator it = ((ArrayList) this.LJIIIZ.LIZ()).iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C64177PGr c64177PGr = (C64177PGr) it.next();
                if (c64177PGr != null) {
                    i2++;
                    jSONArray.put(c64177PGr.LIZIZ().put("id", i2));
                }
            }
        } catch (Throwable unused) {
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("message", this.LJIILL);
            jSONObject2.put("currentMessageCost", uptimeMillis - this.LJIIJJI);
            jSONObject2.put("currentMessageCpu", PEJ.LJFF(this.LJIIL) - this.LJIILIIL);
            jSONObject2.put("messageCount", this.LJFF);
            jSONObject2.put("start", this.LJIIJJI);
            jSONObject2.put("end", uptimeMillis);
        } catch (Throwable unused2) {
        }
        MessageQueue LIZ = C36515EUt.LIZ();
        JSONArray jSONArray2 = new JSONArray();
        if (LIZ != null) {
            try {
                synchronized (LIZ) {
                    Message LIZIZ = C36515EUt.LIZIZ(LIZ);
                    if (LIZIZ != null) {
                        int i3 = 0;
                        while (LIZIZ != null && i < 100) {
                            i++;
                            i3++;
                            JSONObject LJIIIIZZ = LJIIIIZZ(LIZIZ, uptimeMillis);
                            try {
                                LJIIIIZZ.put("id", i3);
                            } catch (JSONException unused3) {
                            }
                            jSONArray2.put(LJIIIIZZ);
                            Field field = C36515EUt.LIZJ;
                            if (field == null) {
                                try {
                                    Field declaredField = Class.forName("android.os.Message").getDeclaredField("next");
                                    C36515EUt.LIZJ = declaredField;
                                    declaredField.setAccessible(true);
                                    LIZIZ = (Message) C36515EUt.LIZJ.get(LIZIZ);
                                } catch (Exception unused4) {
                                    LIZIZ = null;
                                }
                            } else {
                                LIZIZ = (Message) field.get(LIZIZ);
                            }
                        }
                    }
                }
            } catch (Throwable unused5) {
            }
        }
        jSONObject.put("history_message", jSONArray);
        jSONObject.put("current_message", jSONObject2);
        jSONObject.put("pending_messages", jSONArray2);
        jSONObject.put("check_time_info", LJ());
        return jSONObject;
    }

    public C64176PGq(int i) {
        super(i, "block_looper_info");
        this.LJII = 100;
        this.LJIIIIZZ = 200;
        this.LJIIJ = -1L;
        this.LJIIJJI = -1L;
        this.LJIIL = -1;
        this.LJIILIIL = -1L;
        this.LJIJJLI = new RunnableC46412IJk(this);
        C39763Fj5 c39763Fj5 = C39763Fj5.LJLILLLLZI;
        try {
            Handler handler = (Handler) C36591EXr.LIZLLL();
            Field LIZ = C36508EUm.LIZ(Handler.class, "mCallback");
            c39763Fj5.LJLIL = (Handler.Callback) LIZ.get(handler);
            LIZ.set(handler, c39763Fj5);
        } catch (Throwable unused) {
        }
        this.LJ = new C64183PGx(this);
        this.LJIJI = null;
    }

    public static JSONObject LJIIIIZZ(Message message, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("when", message.getWhen() - j);
            if (message.getCallback() != null) {
                jSONObject.put("callback", String.valueOf(message.getCallback()));
            }
            jSONObject.put("what", message.what);
            if (message.getTarget() != null) {
                jSONObject.put("target", String.valueOf(message.getTarget()));
            } else {
                jSONObject.put("barrier", message.arg1);
            }
            jSONObject.put("arg1", message.arg1);
            jSONObject.put("arg2", message.arg2);
            Object obj = message.obj;
            if (obj != null) {
                jSONObject.put("obj", obj);
            }
            jSONObject.put("start", message.getWhen());
            jSONObject.put("end", -1);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    @Override // X.PEL
    public final Pair<String, ?> LIZIZ(long j, long j2) {
        try {
            return new Pair<>(this.LIZ, LJFF());
        } catch (Exception unused) {
            return null;
        }
    }

    public final void LJI(long j, boolean z) {
        int i = this.LJI + 1;
        this.LJI = i;
        this.LJI = i & 65535;
        this.LJIJ = false;
        if (this.LJIIJ < 0) {
            this.LJIIJ = j;
        }
        if (this.LJIIJJI < 0) {
            this.LJIIJJI = j;
        }
        if (this.LJIIL < 0) {
            this.LJIIL = Process.myTid();
            this.LJIILIIL = SystemClock.currentThreadTimeMillis();
        }
        C39762Fj4 c39762Fj4 = C39763Fj5.LJLJI;
        C39763Fj5.LJLJI = null;
        long j2 = j - this.LJIIJ;
        long j3 = this.LJIIIIZZ;
        if (j2 > j3 || c39762Fj4 != null) {
            long j4 = this.LJIIJJI;
            if (j - j4 > j3 || c39762Fj4 != null) {
                if (z) {
                    if (this.LJFF == 0) {
                        LJII(1, j, "no message running", true, null);
                    } else {
                        LJII(9, j4, this.LJIILJJIL, true, null);
                        LJII(1, j, "no message running", false, null);
                    }
                } else if (this.LJFF == 0) {
                    LJII(8, j, this.LJIILL, true, c39762Fj4);
                } else {
                    LJII(9, j4, this.LJIILJJIL, false, null);
                    LJII(8, j, this.LJIILL, true, c39762Fj4);
                }
            } else {
                LJII(9, j, this.LJIILL, true, null);
            }
        }
        this.LJIIJJI = j;
    }

    public final void LJII(int i, long j, String str, boolean z, C39762Fj4 c39762Fj4) {
        this.LJIJ = true;
        C64178PGs c64178PGs = this.LJIIIZ;
        C64177PGr c64177PGr = c64178PGs.LIZJ;
        if (c64177PGr != null) {
            c64177PGr.LIZLLL = i;
            c64178PGs.LIZJ = null;
        } else {
            c64177PGr = new C64177PGr();
            c64177PGr.LIZLLL = i;
        }
        c64177PGr.LJFF = j - this.LJIIJ;
        if (z) {
            long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            c64177PGr.LJI = currentThreadTimeMillis - this.LJIILIIL;
            this.LJIILIIL = currentThreadTimeMillis;
        } else {
            c64177PGr.LJI = -1L;
        }
        c64177PGr.LJ = this.LJFF;
        c64177PGr.LJIIIIZZ = str;
        c64177PGr.LJIIIZ = this.LJIILJJIL;
        c64177PGr.LIZ = this.LJIIJ;
        c64177PGr.LIZIZ = j;
        c64177PGr.LIZJ = this.LJIIJJI;
        if (c39762Fj4 != null) {
            c64177PGr.LJII = c39762Fj4;
        }
        C64178PGs c64178PGs2 = this.LJIIIZ;
        int size = ((ArrayList) c64178PGs2.LIZLLL).size();
        int i2 = c64178PGs2.LIZ;
        if (size < i2) {
            ((ArrayList) c64178PGs2.LIZLLL).add(c64177PGr);
            c64178PGs2.LIZIZ = ((ArrayList) c64178PGs2.LIZLLL).size();
        } else {
            int i3 = c64178PGs2.LIZIZ % i2;
            c64178PGs2.LIZIZ = i3;
            C64177PGr c64177PGr2 = (C64177PGr) ListProtector.set(c64178PGs2.LIZLLL, i3, c64177PGr);
            c64177PGr2.LIZLLL = -1;
            c64177PGr2.LJ = -1;
            c64177PGr2.LJFF = -1L;
            c64177PGr2.LJIIIIZZ = null;
            c64177PGr2.LJIIJ = null;
            c64177PGr2.LJIIJJI = null;
            c64177PGr2.LJIIL = null;
            c64177PGr2.LJIILIIL = null;
            c64177PGr2.LJIILJJIL = null;
            c64177PGr2.LJII = null;
            c64177PGr2.LJIIIZ = null;
            c64178PGs2.LIZJ = c64177PGr2;
            c64178PGs2.LIZIZ++;
        }
        this.LJFF = 0;
        this.LJIIJ = j;
    }
}
