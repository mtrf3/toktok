package X;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QI3 implements InterfaceC66747QHn {
    public static final List<QI3> LJJJI = new CopyOnWriteArrayList();
    public static final AtomicInteger LJJJIL = new AtomicInteger(0);
    public final C66748QHo LIZJ;
    public volatile QH9 LJIIJJI;
    public volatile QI6 LJIIL;
    public volatile QI4 LJIILIIL;
    public final QIO LJIILJJIL;
    public volatile boolean LJIILL;
    public volatile InterfaceC66756QHw LJIILLIIL;
    public volatile AbstractC66736QHc LJIIZILJ;
    public C66769QIj LJIJ;
    public final C66760QIa LJIJJ;
    public volatile Long LJJIJIIJI;
    public volatile InterfaceC66739QHf LJJIJIIJIL;
    public volatile EnumC66752QHs LJJIJLIJ;
    public volatile InterfaceC66757QHx LJJIL;
    public final C66767QIh LIZ = new C66767QIh();
    public final QIY LIZIZ = new QIY();
    public int LJIIIIZZ = 0;
    public String LJIIIZ = "";
    public volatile Application LJIIJ = null;
    public volatile boolean LJIJI = true;
    public volatile boolean LJIJJLI = true;
    public volatile boolean LJIL = false;
    public volatile boolean LJJ = false;
    public volatile boolean LJJI = false;
    public volatile boolean LJJIFFI = false;
    public volatile boolean LJJII = false;
    public volatile int LJJIII = 5;
    public volatile int LJJIIJ = 200;
    public volatile boolean LJJIIJZLJL = false;
    public volatile boolean LJJIIZ = true;
    public volatile boolean LJJIIZI = false;
    public volatile int LJJIJ = 8;
    public volatile boolean LJJIJL = false;
    public volatile boolean LJJJ = false;
    public final int LJII = LJJJIL.getAndIncrement();
    public final QIX LJJIZ = new QIX();
    public final QH8 LJFF = new QH8(this);
    public final QIB LIZLLL = new QIB(this);
    public final C66762QIc LJJIJIL = new C66762QIc(this);
    public final C24550xn LJ = new C24550xn(this);
    public final PA3 LJI = new PA3(this);

    public final String LIZIZ() {
        if (this.LJIILIIL == null) {
            return null;
        }
        String.valueOf(this.LJIILIIL.LJLLI.LIZ);
        if (this.LJIIL == null) {
            return null;
        }
        return this.LJIIL.LIZJ.LIZJ.getString("ab_sdk_version", "");
    }

    public final String LIZJ() {
        C66799QJn LIZIZ;
        C66760QIa c66760QIa = this.LJIJJ;
        if (c66760QIa == null) {
            return "";
        }
        C66765QIf c66765QIf = (C66765QIf) c66760QIa.LIZ();
        if (c66765QIf.LIZ == null || c66765QIf.LIZ.LIZJ == null) {
            Context LIZLLL = c66765QIf.LIZLLL();
            if (LIZLLL == null || (LIZIZ = c66765QIf.LJII.LIZIZ(LIZLLL)) == null) {
                return null;
            }
            return LIZIZ.LJLIL;
        }
        return c66765QIf.LIZLLL.LIZIZ(c66765QIf.LIZ.LIZJ).getDid();
    }

    public final JSONObject LIZLLL() {
        if (this.LJIIL == null) {
            this.LJJIZ.LJIIJJI("Init first please to get header", new Object[0]);
            return null;
        }
        return this.LJIIL.LIZ();
    }

    public final QIN LJ() {
        if (this.LJIIJJI != null) {
            return this.LJIIJJI.LIZIZ;
        }
        return null;
    }

    public final PA0 LJFF() {
        PA0 pa0 = this.LJIIJJI.LIZIZ.LJIJ;
        if (pa0 != null) {
            return pa0;
        }
        return this.LJI;
    }

    public final String LJI() {
        if (this.LJIIL == null) {
            return "";
        }
        QI6 qi6 = this.LJIIL;
        if (qi6.LIZIZ) {
            return qi6.LIZLLL.optString("user_unique_id", "");
        }
        QH9 qh9 = qi6.LIZJ;
        if (qh9 == null) {
            return "";
        }
        return qh9.LIZJ.getString("user_unique_id", null);
    }

    public QI3() {
        ((CopyOnWriteArrayList) LJJJI).add(this);
        this.LIZJ = new C66748QHo(this);
        this.LJIJJ = new C66760QIa(this);
        this.LJIILJJIL = new QIO(this);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AppLogInstance{id:");
        LIZ.append(this.LJII);
        LIZ.append(";appId:");
        LIZ.append(this.LJIIIZ);
        LIZ.append("}@");
        LIZ.append(hashCode());
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC66747QHn
    public final String getAppId() {
        return this.LJIIIZ;
    }

    public final void LJIIJJI(QI2 qi2) {
        qi2.LJLLJ = this.LJIIIZ;
        if (!this.LIZIZ.LIZ(1)) {
            try {
                if (qi2 instanceof QIA) {
                    QIA qia = (QIA) qi2;
                    this.LIZIZ.LIZIZ(1, qia.LL, qia.LLFFF, qia.LLD, qia.LLF, qia.LLFII, qia.LLFF);
                } else {
                    JSONObject jSONObject = null;
                    if (qi2 instanceof QIC) {
                        QIC qic = (QIC) qi2;
                        QIY qiy = this.LIZIZ;
                        String str = qic.LLF;
                        if (qic.LL != null) {
                            jSONObject = new JSONObject(qic.LL);
                        }
                        qiy.LIZJ(1, str, jSONObject);
                    } else if (qi2 instanceof QIG) {
                        QIG qig = (QIG) qi2;
                        QIY qiy2 = this.LIZIZ;
                        String str2 = qig.LLD;
                        if (qig.LL != null) {
                            jSONObject = new JSONObject(qig.LL);
                        }
                        qiy2.LIZLLL(1, str2, jSONObject);
                    }
                }
            } catch (Throwable th) {
                this.LJJIZ.LIZJ(4, "notify event observer before receive failed", th, new Object[0]);
            }
        }
        if (this.LJIILIIL == null) {
            C66748QHo c66748QHo = this.LIZJ;
            synchronized (c66748QHo.LIZ) {
                if (c66748QHo.LIZ.size() > 1000) {
                    QI2 poll = c66748QHo.LIZ.poll();
                    c66748QHo.LIZJ.LIZLLL.LJFF(poll, QIK.f_cache);
                    c66748QHo.LIZJ.LIZLLL.LJIIIIZZ(QIQ.f_cache_event, QIB.LIZ(poll));
                    c66748QHo.LIZJ.LJJIZ.LJIIIIZZ(0, C66748QHo.LIZLLL, "AppLogCache overflow remove data: {}", poll);
                }
                c66748QHo.LIZ.add(qi2);
            }
        } else {
            this.LJIILIIL.LJIIIZ(qi2);
        }
        QI0.LIZJ(qi2, "event_receive");
    }

    public final void LJIILIIL(long j) {
        if (this.LJIILIIL != null && this.LJIILIIL.LJLLI != null) {
            if (this.LJIILIIL.LJLLI.LIZ != j) {
                this.LJIILIIL.LJLLI.LIZ = j;
                return;
            }
            return;
        }
        this.LJJIJIIJI = Long.valueOf(j);
    }

    @Override // X.InterfaceC66747QHn
    public void onEvent(String str) {
        QIB qib = this.LIZLLL;
        QIQ qiq = QIQ.event;
        qib.LJ(qiq, QIK.init);
        if (TextUtils.isEmpty("event_v1") || TextUtils.isEmpty(str)) {
            this.LJJIZ.LJIIJJI("category or tag is empty", new Object[0]);
            this.LIZLLL.LJ(qiq, QIK.f_block);
        } else {
            LJIIJJI(new QIA(0L, 0L, this.LJIIIZ, "event_v1", str, null, LJIILJJIL(str, null)));
        }
    }

    @Override // X.InterfaceC66747QHn
    public void onEventV3(String str) {
        this.LIZLLL.LJ(QIQ.event_v3, QIK.init);
        LJIIIZ(str, null);
    }

    public final void LJII(Context context, QIN qin) {
        boolean z;
        synchronized (QI3.class) {
            if (!TextUtils.isEmpty(qin.LIZ)) {
                if (!C66745QHl.LIZJ(qin.LIZ)) {
                    QIX qix = this.LJJIZ;
                    String str = qin.LIZ;
                    qix.LIZ = str;
                    ((ConcurrentHashMap) AbstractC68877R1l.LIZJ).put(str, qix);
                    qix.LJIIL("Current logger bind to appId {}", str);
                    this.LJIIIZ = qin.LIZ;
                    this.LJIIJ = (Application) C16880lQ.LLLLL(context);
                    if (this.LJIIJ != null) {
                        try {
                            if ((this.LJIIJ.getApplicationInfo().flags & 2) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            this.LJJJ = z;
                        } catch (Throwable unused) {
                        }
                    }
                    if (qin.LJJIII) {
                        ((ConcurrentHashMap) C68882R1q.LIZIZ).put(this.LJIIIZ, new C68881R1p(this));
                    }
                    this.LJJIZ.LJIIIZ(0, null, "App:{} init begin...", this.LJIIIZ);
                    if (TextUtils.isEmpty(qin.LJJ)) {
                        String LIZIZ = C66745QHl.LIZIZ(this, "applog_stats");
                        if (!TextUtils.isEmpty(LIZIZ)) {
                            qin.LJJ = LIZIZ;
                        }
                    }
                    QI0.LIZIZ("init_begin", new QII(this, qin));
                    if (this.LJJIIZ && qin.LJJII) {
                        this.LIZLLL.LIZLLL(context, this.LJIIIZ);
                    }
                    this.LJIIJJI = new QH9(this, this.LJIIJ, qin);
                    if (this.LJJIJIIJIL == null) {
                        this.LJJIJIIJIL = new QHG(this, this.LJIIJJI);
                    }
                    this.LJIIL = new QI6(this, this.LJIIJJI, this.LJIJJ);
                    this.LJIILIIL = new QI4(this, this.LJIIJJI, this.LJIIL, this.LJIJJ, this.LIZJ);
                    this.LJIIIIZZ = 1;
                    this.LJIILL = qin.LIZIZ;
                    if (this.LJJIJIIJI != null) {
                        LJIILIIL(this.LJJIJIIJI.longValue());
                        this.LJJIJIIJI = null;
                    }
                    String str2 = this.LJIIIZ;
                    if (!(!QI0.LIZ.booleanValue())) {
                        ((J2T) J2T.LJLJJI.LIZLLL(new Object[0])).LIZLLL(str2, QI0.LIZLLL("init_end"));
                    }
                    this.LJJIZ.LJIIIZ(0, null, "App:{} init end.", this.LJIIIZ);
                    QH9 qh9 = this.LJIIJJI;
                    qh9.getClass();
                    QI0.LIZIZ("remote_settings", new QHU(qh9));
                } else {
                    throw new IllegalStateException("The app id is init already!");
                }
            } else {
                throw new IllegalStateException("App id must not be empty!");
            }
        }
    }

    public final void LJIIIIZZ(String str, Bundle bundle) {
        JSONObject jSONObject;
        this.LIZLLL.LJ(QIQ.event_v3, QIK.init);
        JSONObject jSONObject2 = null;
        if (bundle != null) {
            try {
                if (!bundle.isEmpty()) {
                    jSONObject = new JSONObject();
                    try {
                        for (String str2 : bundle.keySet()) {
                            jSONObject.put(str2, C16880lQ.LLJJIII(bundle, str2));
                        }
                        jSONObject2 = jSONObject;
                    } catch (Throwable th) {
                        th = th;
                        this.LIZLLL.LJ(QIQ.event_v3, QIK.f_block);
                        this.LJJIZ.LJIILL(null, "parse bundle params failed", th, new Object[0]);
                        LJIIIZ(str, jSONObject);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                jSONObject = null;
            }
        }
        jSONObject = jSONObject2;
        LJIIIZ(str, jSONObject);
    }

    public final void LJIIIZ(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            this.LIZLLL.LJ(QIQ.event_v3, QIK.f_block);
            this.LJJIZ.LJIIJJI("event name is empty", new Object[0]);
        } else {
            LJIIJJI(new QIC(this.LJIIIZ, str, LJIILJJIL(str, jSONObject)));
        }
    }

    public final void LJIIJ(String str, String str2) {
        QIB qib = this.LIZLLL;
        QIQ qiq = QIQ.event_v3;
        qib.LJ(qiq, QIK.init);
        if (TextUtils.isEmpty(str)) {
            this.LIZLLL.LJ(qiq, QIK.f_block);
            this.LJJIZ.LJIIJJI("event name is empty", new Object[0]);
        } else {
            LJIIJJI(new QIC(this.LJIIIZ, str, str2));
        }
    }

    public final void LJIIL(Object obj, String str) {
        if (!TextUtils.isEmpty(this.LJIIIZ)) {
            QI0.LIZIZ("update_config", new PPL(this, str, obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final String LJIILJJIL(String str, JSONObject jSONObject) {
        boolean z;
        ?? r4 = 0;
        String str2 = null;
        r4 = 0;
        if (jSONObject == null) {
            return null;
        }
        try {
            return jSONObject.toString();
        } catch (Throwable th) {
            this.LJJIZ.LJIILL(null, C0ON.LIZJ("event toString failed ", str, ", label: ", null), th, new Object[0]);
            JSONObject LIZLLL = C66735QHb.LIZLLL(jSONObject);
            if (LIZLLL == null) {
                return null;
            }
            QIN LJ = LJ();
            if (LJ != null && "local_test".equalsIgnoreCase(LJ.LIZJ)) {
                z = true;
            } else {
                z = false;
            }
            try {
                try {
                    r4 = LIZLLL.toString();
                    return r4;
                } catch (Throwable th2) {
                    throw new RuntimeException(C0ON.LIZJ("event params exception tag: ", str, ", label: ", str2), th2);
                }
            } catch (OutOfMemoryError e) {
                if (!z) {
                    this.LJJIZ.LJIILL(r4, C0ON.LIZJ("event toString OOM tag: ", str, ", label: ", r4), e, new Object[0]);
                    return r4;
                }
                throw new RuntimeException(C0ON.LIZJ("event toString OOM tag: ", str, ", label: ", r4), e);
            } catch (StackOverflowError e2) {
                if (!z) {
                    this.LJJIZ.LJIILL(r4, C0ON.LIZJ("event toString stack overflow tag: ", str, ", label: ", r4), e2, new Object[0]);
                    return r4;
                }
                throw new RuntimeException(C0ON.LIZJ("event toString stack overflow tag: ", str, ", label: ", r4), e2);
            } catch (ConcurrentModificationException unused) {
                str2 = LIZLLL.toString();
                return str2;
            }
        }
    }

    public final String LIZ(Context context, String str, QKO qko) {
        StringBuilder sb = new StringBuilder(str);
        C66765QIf c66765QIf = (C66765QIf) this.LJIJJ.LIZ();
        if (c66765QIf.LIZIZ()) {
            return c66765QIf.LJ.LIZ(context, sb, qko);
        }
        return null;
    }
}
