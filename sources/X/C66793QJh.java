package X;

import Y.ARunnableS30S0200000_11;
import Y.ARunnableS47S0100000_11;
import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.QJh, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66793QJh implements InterfaceC66764QIe {
    public static final AtomicBoolean LJI = new AtomicBoolean(false);
    public volatile QIF LIZ;
    public volatile C66792QJg LIZIZ;
    public volatile QKW LIZJ;
    public volatile C66811QJz LIZLLL;
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final InterfaceC66835QKx LJFF;

    @Override // X.InterfaceC66764QIe
    public final void LJIIIIZZ(C66799QJn c66799QJn) {
    }

    @Override // X.InterfaceC66764QIe
    public final boolean LIZIZ() {
        if (this.LIZIZ == null || this.LIZ == null) {
            return false;
        }
        JFV.LIZLLL(new ARunnableS47S0100000_11(this, 95), this.LIZ.LIZ());
        return true;
    }

    @Override // X.InterfaceC66764QIe
    public final C48852JFg LIZLLL() {
        if (this.LIZJ == null) {
            return null;
        }
        return this.LIZJ.LIZLLL;
    }

    @Override // X.InterfaceC66764QIe
    public final C66799QJn LJ() {
        if (this.LIZJ == null) {
            return null;
        }
        return this.LIZJ.LIZJ();
    }

    public final void LJIIL() {
        if (!C48847JFb.LIZ(this.LIZ.LIZJ, this.LIZ).getBoolean("_install_started_v2", false)) {
            C48847JFb.LIZ(this.LIZ.LIZJ, this.LIZ).edit().putBoolean("_install_started_v2", true).apply();
        }
    }

    @Override // X.InterfaceC66764QIe
    public final String getDid() {
        if (this.LIZJ == null) {
            return null;
        }
        QKW qkw = this.LIZJ;
        qkw.LJFF.getClass();
        QKU qku = (QKU) JFZ.LIZ(QKU.class, qkw.LJFF.LIZ());
        if (qku != null) {
            return qku.getDeviceId();
        }
        return qkw.LJIIIZ.LIZIZ("", "");
    }

    @Override // X.InterfaceC66764QIe
    public final void start() {
        if (this.LIZIZ != null && this.LIZ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("install#start aid : ");
            LIZ.append(this.LIZ.LIZ);
            X1D.LIZIZ(LIZ);
            JFV.LIZLLL(new ARunnableS47S0100000_11(this, 94), this.LIZ.LIZ());
            LJIIL();
            return;
        }
        throw new RuntimeException("please init first");
    }

    public C66793QJh(C66765QIf c66765QIf) {
        this.LJFF = c66765QIf;
    }

    @Override // X.InterfaceC66764QIe
    public final void LIZ(Account account) {
        if (this.LIZ == null) {
            return;
        }
        JFV.LIZLLL(new ARunnableS30S0200000_11(this, account, 37), this.LIZ.LIZ());
    }

    @Override // X.InterfaceC66764QIe
    public final void LJII(java.util.Map map) {
        boolean z;
        if (this.LIZJ != null) {
            loop0: while (true) {
                z = false;
                for (Map.Entry entry : ((HashMap) map).entrySet()) {
                    String str = (String) entry.getKey();
                    if (this.LIZJ.LJII(entry.getValue(), str) || z) {
                        z = true;
                    }
                }
            }
            if (z && this.LIZLLL != null) {
                this.LIZLLL.LIZ(new QJT(this.LIZJ.LJIIIIZZ));
            }
        }
    }

    @Override // X.InterfaceC66764QIe
    public final boolean LJIIIZ(JSONObject jSONObject) {
        JSONObject jSONObject2;
        if (this.LIZJ != null) {
            QKW qkw = this.LIZJ;
            if (qkw.LJIIJ && (jSONObject2 = qkw.LJIIIIZZ) != null) {
                C36860EdM.LIZJ(jSONObject, jSONObject2);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC66764QIe
    public final void LJIIJ(C48852JFg c48852JFg) {
        if (this.LIZIZ != null && this.LIZ != null && this.LIZJ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("clearInstallInfoWhenSwitchChildMode ");
            LIZ.append(c48852JFg);
            X1D.LIZIZ(LIZ);
            JFV.LIZLLL(new ARunnableS30S0200000_11(this, c48852JFg, 36), this.LIZ.LIZ());
            return;
        }
        new RuntimeException("not init yet");
    }

    public final void LJIIJJI(boolean z) {
        if (this.LIZIZ != null && this.LIZ != null) {
            if (this.LJ.getAndSet(true)) {
                return;
            }
            QJI qji = (QJI) JFZ.LIZ(QJI.class, this.LIZ.LIZ());
            if (qji != null) {
                qji.start();
            }
            QKW qkw = this.LIZJ;
            if (!qkw.LJIIJJI.getAndSet(true)) {
                JFY.LIZ(qkw.LJ, qkw.LIZLLL, qkw.LJFF);
            }
            C66792QJg c66792QJg = this.LIZIZ;
            c66792QJg.LIZLLL(c66792QJg.LJLJJL, z);
            if (c66792QJg.LJLIL.LJIILL) {
                ARunnableS47S0100000_11 aRunnableS47S0100000_11 = new ARunnableS47S0100000_11(c66792QJg, 93);
                QK3 qk3 = (QK3) c66792QJg.LJLJJI;
                qk3.LJLJJI = new QKV(c66792QJg, aRunnableS47S0100000_11);
                if (qk3.LJLJI) {
                    aRunnableS47S0100000_11.run();
                }
            }
            C66797QJl c66797QJl = new C66797QJl(this.LIZ.LIZJ);
            QIF qif = this.LIZ;
            c66797QJl.LIZIZ = qif;
            if (qif == null) {
                return;
            }
            C66765QIf.LJFF(String.valueOf(qif.LIZ)).LIZ(true, c66797QJl);
            return;
        }
        throw new RuntimeException("please init first");
    }

    @Override // X.InterfaceC66764QIe
    public final void LIZJ(QIF qif, C48852JFg c48852JFg) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("main process install#init：aid: ");
        LIZ.append(qif.LIZ);
        X1D.LIZIZ(LIZ);
        synchronized (this) {
            if (this.LIZIZ == null) {
                this.LIZ = qif;
                if (TextUtils.equals(qif.LJI, "local_test")) {
                    try {
                        JFZ.LIZIZ(QJI.class, String.valueOf(qif.LIZ), (QJI) Class.forName("com.bytedance.bdinstall.nu.NUModeServiceImpl").getConstructor(QIF.class).newInstance(qif));
                    } catch (Throwable unused) {
                    }
                }
                this.LIZJ = new QKW(qif.LIZJ, c48852JFg, qif);
                this.LIZJ.LJIIL = this.LIZLLL;
                this.LIZIZ = new C66792QJg(c48852JFg, qif, this.LIZJ);
                this.LIZIZ.LJLL = this.LIZLLL;
                JFZ.LIZIZ(JGH.class, String.valueOf(qif.LIZ), new JGE(qif, c48852JFg));
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("init ：");
        LIZ2.append(System.currentTimeMillis() - currentTimeMillis);
        X1D.LIZIZ(LIZ2);
    }

    @Override // X.InterfaceC66764QIe
    public final void LJFF(Context context, java.util.Map map, boolean z) {
        C66792QJg c66792QJg;
        C66790QJe c66790QJe;
        SharedPreferences.Editor edit = C48847JFb.LIZ(context, this.LIZ).edit();
        if (this.LIZJ != null) {
            boolean z2 = false;
            for (Map.Entry entry : ((HashMap) map).entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (this.LIZJ.LJII(str2, str) || z2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (edit != null) {
                    edit.putString(str, str2);
                }
            }
            if (edit != null) {
                edit.apply();
            }
            if (z2) {
                if (z && this.LIZIZ != null && (c66790QJe = (c66792QJg = this.LIZIZ).LJLJL) != null) {
                    c66792QJg.LJ(c66790QJe, true);
                }
                if (this.LIZLLL != null) {
                    this.LIZLLL.LIZ(new QJT(this.LIZJ.LJIIIIZZ));
                }
            }
        }
    }

    @Override // X.InterfaceC66764QIe
    public final void LJI(C48852JFg c48852JFg, long j, InterfaceC66818QKg interfaceC66818QKg) {
        if (this.LIZIZ != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("resetInstallInfoWhenSwitchChildMode ");
            LIZ.append(c48852JFg);
            X1D.LIZIZ(LIZ);
            C66810QJy c66810QJy = new C66810QJy(j, interfaceC66818QKg, this.LIZ);
            ((C66765QIf) this.LJFF).LIZ(false, c66810QJy);
            c66810QJy.LIZJ.postDelayed(new ARunnableS47S0100000_11(c66810QJy, 133), c66810QJy.LIZ);
            if (this.LIZ != null) {
                JFV.LIZLLL(new ARunnableS30S0200000_11(this, c48852JFg, 38), this.LIZ.LIZ());
                return;
            }
            return;
        }
        new RuntimeException("not init yet");
    }
}
