package X;

import com.bytedance.ttnet.diagnosis.IDiagnosisCallback;
import com.bytedance.ttnet.diagnosis.IDiagnosisRequest;
import java.util.List;

/* renamed from: X.QFe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66686QFe implements IDiagnosisRequest {
    public IDiagnosisCallback LIZ;
    public final int LIZIZ;
    public final List<String> LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public String LJIIIIZZ;
    public InterfaceC66688QFg LJIIJ;
    public final C66687QFf LJIIIZ = new C66687QFf(this);
    public boolean LJI = false;
    public boolean LJII = false;

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public final void cancel() {
        synchronized (this) {
            if (!this.LJI || this.LJII) {
                return;
            }
            this.LJIIJ.cancel();
            this.LJII = true;
        }
    }

    static {
        C16880lQ.LJLLJ(C66686QFe.class);
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public final void setUserExtraInfo(String str) {
        synchronized (this) {
            this.LJIIIIZZ = str;
            doExtraCommand("extra_info", str);
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public final void start(IDiagnosisCallback iDiagnosisCallback) {
        synchronized (this) {
            if (this.LJI) {
                return;
            }
            this.LIZ = iDiagnosisCallback;
            this.LJIIJ.start();
            this.LJI = true;
            String str = this.LJIIIIZZ;
            if (str != null && !str.isEmpty()) {
                doExtraCommand("extra_info", this.LJIIIIZZ);
            }
        }
    }

    @Override // com.bytedance.ttnet.diagnosis.IDiagnosisRequest
    public final void doExtraCommand(String str, String str2) {
        synchronized (this) {
            if (!this.LJI) {
                return;
            }
            this.LJIIJ.doExtraCommand(str, str2);
        }
    }

    public C66686QFe(int i, List<String> list, int i2, int i3, int i4) {
        this.LIZIZ = i;
        this.LIZJ = list;
        this.LIZLLL = i2;
        this.LJ = i3;
        this.LJFF = i4;
        if (this.LJIIJ == null) {
            try {
                Class<?> cls = Class.forName("org.chromium.diagnosis.CronetDiagnosisRequestImpl");
                if (cls != null) {
                    Class<?> cls2 = Integer.TYPE;
                    Object newInstance = cls.getDeclaredConstructor(QFX.class, cls2, List.class, cls2, cls2, cls2).newInstance(this.LJIIIZ, Integer.valueOf(this.LIZIZ), this.LIZJ, Integer.valueOf(this.LIZLLL), Integer.valueOf(this.LJ), Integer.valueOf(this.LJFF));
                    if (newInstance instanceof InterfaceC66688QFg) {
                        this.LJIIJ = (InterfaceC66688QFg) newInstance;
                        return;
                    }
                    return;
                }
            } catch (Throwable unused) {
            }
            throw new ClassNotFoundException("org.chromium.diagnosis.CronetDiagnosisRequestImpl class not found");
        }
    }
}
