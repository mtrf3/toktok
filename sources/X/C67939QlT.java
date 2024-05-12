package X;

import android.content.Context;
import android.content.IntentFilter;
import androidx.lifecycle.MutableLiveData;

/* renamed from: X.QlT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67939QlT {
    public final Context LIZ;
    public C67738QiE LIZIZ;
    public final C62062OXi LIZJ;
    public final MutableLiveData<String> LIZLLL = new MutableLiveData<>();
    public boolean LJ;
    public int LJFF;
    public final boolean LJI;

    public final void LIZIZ() {
        if (!this.LJI) {
            return;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new C67738QiE(this.LIZ, this.LIZLLL);
        }
        C67738QiE c67738QiE = this.LIZIZ;
        c67738QiE.getClass();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        try {
            C16880lQ.LJJLIIIJILLIZJL(c67738QiE, c67738QiE.LIZ, intentFilter);
        } catch (Exception unused) {
        }
    }

    public final void LIZJ() {
        if (!this.LJI) {
            LIZ(this.LJFF, "Feature cannot be used", this.LJ);
        } else {
            C62062OXi c62062OXi = this.LIZJ;
            c62062OXi.getClass();
            c62062OXi.LIZLLL(1, new C67971Qlz()).LIZIZ(new InterfaceC67661Qgz() { // from class: X.QlU
                @Override // X.InterfaceC67661Qgz
                public final void onComplete(AbstractC67638Qgc abstractC67638Qgc) {
                    String str;
                    C67939QlT c67939QlT = C67939QlT.this;
                    c67939QlT.getClass();
                    if (abstractC67638Qgc.LJIILIIL()) {
                        return;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Failed to start SMS Retriever, exception: ");
                    if (abstractC67638Qgc.LJIIIIZZ() != null) {
                        str = C249159qB.LIZ(abstractC67638Qgc.LJIIIIZZ());
                    } else {
                        str = "";
                    }
                    LIZ.append(str);
                    C67939QlT.LIZ(c67939QlT.LJFF, X1D.LIZIZ(LIZ), c67939QlT.LJ);
                }
            });
        }
    }

    public C67939QlT(Context context) {
        boolean z;
        this.LIZ = context;
        this.LIZJ = new C62062OXi(context);
        this.LJFF = C78555UsJ.LJIJI(context);
        boolean LIZ = C48479J0x.LIZ(context);
        this.LJ = LIZ;
        if (LIZ && this.LJFF == 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJI = z;
    }

    public static void LIZ(int i, String str, boolean z) {
        C40467FuR.LIZLLL(i, str, false, z);
        C67737QiD.LIZ(i, str, false, z);
    }
}
