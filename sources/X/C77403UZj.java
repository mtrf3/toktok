package X;

import Y.ACallableS116S0100000_13;
import Y.AgS114S0200000_13;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import defpackage.i0;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UZj, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77403UZj {
    public String LJ;
    public C77404UZk LJFF;
    public boolean LJI;
    public boolean LJIIIIZZ;
    public String LIZ = "";
    public List<String> LIZIZ = C61878OQg.INSTANCE;
    public String LIZJ = "";
    public final Keva LIZLLL = Keva.getRepo("pendant_lottie_keva");
    public final List<InterfaceC77407UZn> LJII = new ArrayList();
    public final Object LJIIIZ = new Object();

    public final void LIZ() {
        if (this.LJ == null) {
            this.LJ = this.LIZLLL.getString("previous_activity_id", "");
        }
        String str = this.LJ;
        o.LJI(str);
        String filePath = new C77404UZk(str, this.LIZIZ, this.LIZJ).LIZ();
        C37247Ejb.LIZIZ.getClass();
        o.LJIIIZ(filePath, "filePath");
        C36871EdX.LJ(filePath);
    }

    public final void LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        if (this.LJI) {
            if (this.LJIIIIZZ) {
                return;
            }
            this.LJIIIIZZ = true;
            C10K.LIZJ(new ACallableS116S0100000_13(this, 3)).LJ(new AgS114S0200000_13(this, context, 1), C10K.LJIIIIZZ, null);
            return;
        }
        throw new Throwable("HAS NOT inited");
    }

    public final InputStream LIZLLL(int i) {
        if (this.LJI) {
            C77404UZk c77404UZk = this.LJFF;
            if (c77404UZk == null) {
                return null;
            }
            String str = "new_year_normal_button";
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            str = "coin2";
                        }
                    } else {
                        str = "campagin_reward_lottie";
                    }
                } else {
                    str = "new_year_normal_button_collapsed";
                }
            }
            String LJFF = i0.LJFF(str, ".json");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c77404UZk.LIZLLL());
            try {
                return new FileInputStream(new File(JBR.LJFF(LIZ, File.separator, LJFF, LIZ)));
            } catch (Throwable unused) {
                return null;
            }
        }
        throw new Throwable("HAS NOT inited");
    }

    public final void LIZIZ(String activityId, String str, List list) {
        String str2;
        o.LJIIIZ(activityId, "activityId");
        if (this.LJI) {
            return;
        }
        if (TextUtils.isEmpty(activityId)) {
            str2 = "default_activity";
        } else {
            str2 = activityId;
        }
        this.LIZ = str2;
        this.LIZIZ = list;
        this.LIZJ = str;
        this.LJI = true;
        this.LIZLLL.storeString("previous_activity_id", str2);
        this.LJFF = new C77404UZk(this.LIZ, list, str);
        String string = this.LIZLLL.getString("previous_activity_id", "");
        this.LJ = string;
        if (!TextUtils.isEmpty(string) && !TextUtils.equals(activityId, this.LJ)) {
            LIZ();
        }
    }
}
