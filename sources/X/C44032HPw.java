package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.zhiliaoapp.musically.R;

/* renamed from: X.HPw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44032HPw {
    public DialogC25756A8y LIZ;
    public final Context LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public final int LJI;
    public C62119OZn LJII;

    public C44032HPw(Context context) {
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJ = true;
        this.LJI = 2;
        this.LIZIZ = context;
    }

    public C44032HPw(Context context, Integer num) {
        this.LIZJ = "";
        this.LIZLLL = "";
        this.LJ = true;
        this.LJI = 2;
        this.LIZIZ = context;
        if (num != null) {
            this.LJI = num.intValue();
        }
    }

    public final void LIZ(int i, Integer num, String str, String str2, String str3, boolean z) {
        int i2;
        String str4;
        this.LIZJ = str2;
        this.LIZLLL = str3;
        this.LJFF = z;
        if (num == null) {
            num = 1;
        }
        if (num.intValue() == 2) {
            i2 = 4;
        } else {
            i2 = 1;
        }
        if (!C39579Fg7.LJIILL()) {
            KL2.LIZLLL(R.string.qb6, this.LIZIZ);
            return;
        }
        if (C39579Fg7.LJIILIIL() < 20971520) {
            KL2.LIZLLL(R.string.qb7, this.LIZIZ);
            return;
        }
        EF7.LIZIZ();
        if (C2NU.LIZ.LIZIZ()) {
            if (this.LJ) {
                if (this.LIZ == null) {
                    DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(this.LIZIZ);
                    this.LIZ = dialogC25756A8y;
                    dialogC25756A8y.LIZIZ(R.string.f0g);
                    V1B.LJLJJL(this.LIZ);
                } else {
                    Context context = this.LIZIZ;
                    if ((context instanceof Activity) && !C45804HyK.LJIJJ(context).isFinishing()) {
                        DialogC25756A8y dialogC25756A8y2 = this.LIZ;
                        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/tux/status/loading/TuxLoadingDialogHUD", "show", dialogC25756A8y2, new Object[0], "void", new C65300Pk0(false, "()V", "-6908571447554156641")).LIZ) {
                            dialogC25756A8y2.show();
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(this.LIZJ)) {
                str4 = "mv_reuse";
            } else {
                str4 = this.LIZJ;
            }
            C44031HPv c44031HPv = new C44031HPv(this, str4, str, i2, i);
            if ("mv_page".equals(str4)) {
                AVExternalServiceImpl.LIZ().asyncService(str4, c44031HPv);
                return;
            } else {
                AVExternalServiceImpl.LIZ().asyncServiceWithOutPanel(str4, c44031HPv);
                return;
            }
        }
        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
        if (C173186qw.LIZ > 0) {
            c5s1.LIZJ(R.string.img);
            c5s1.LJ();
        } else {
            c5s1.LIZJ(R.string.ijw);
            c5s1.LJ();
        }
    }
}
