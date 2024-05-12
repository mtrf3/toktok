package Y;

import X.C244659iv;
import X.C245599kR;
import X.C26227ARb;
import X.C26316AUm;
import X.C35936E8m;
import X.C36922EeM;
import X.C86184Xs4;
import X.C86918Y9i;
import X.C86919Y9j;
import X.C9XS;
import X.FMX;
import X.HG3;
import X.InterfaceC88472Yns;
import X.JJ4;
import X.UC0;
import X.X1D;
import android.app.Activity;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerViewModel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class ARunnableS3S1200000_4 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        C26227ARb c26227ARb = new C26227ARb((Activity) this.l1);
        c26227ARb.LJIIIZ = new C244659iv((Activity) this.l1, R.raw.icon_color_tiktok_logo_dark, null, 12, 0);
        c26227ARb.LJFF(((Activity) this.l1).getString(R.string.c8u));
        c26227ARb.LIZIZ(this.s0);
        c26227ARb.LJII = false;
        UC0.LIZJ(c26227ARb, new AqS135S0200000_4((Activity) this.l1, (JJ4) this.l2, 134));
        c26227ARb.LJI().LIZLLL();
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZLLL("enter_from", "log_out");
        FMX.LJIIL("show_verify_email_popup", c35936E8m.LIZ);
    }

    public final void LIZ$1() {
        C245599kR c245599kR = C86918Y9i.LIZJ;
        String curUserId = C86918Y9i.LJ;
        o.LJIIIIZZ(curUserId, "curUserId");
        C9XS LIZIZ = c245599kR.LIZIZ(curUserId, this.s0);
        if (LIZIZ == null) {
            ((InterfaceC88472Yns) this.l1).invoke(null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Map) this.l2).entrySet().iterator();
        while (it.hasNext()) {
            C86919Y9j LIZ = LIZIZ.LIZIZ.LIZ((String) ((Map.Entry) it.next()).getKey());
            if (LIZ != null) {
                arrayList.add(LIZ);
            }
        }
        ((InterfaceC88472Yns) this.l1).invoke(arrayList);
    }

    public final void LIZ$3() {
        int i;
        File file;
        try {
            file = new File(this.s0);
        } catch (Exception e) {
            C36922EeM.LJFF(e);
        }
        if (file.exists() && file.length() > 4194304) {
            C36922EeM.LJ("upload file size: " + file.length());
            i = (((int) (file.length() / 1024)) + 1) * 1024;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(Api.LIZIZ);
            LIZ.append("?uid=");
            LIZ.append(HG3.LJIILL().getCurUserId());
            HG3.LJIILL().uploadAvatar(((C86184Xs4) this.l2).LJII, X1D.LIZIZ(LIZ), i, this.s0, (List) this.l1);
        }
        i = 4194304;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(Api.LIZIZ);
        LIZ2.append("?uid=");
        LIZ2.append(HG3.LJIILL().getCurUserId());
        HG3.LJIILL().uploadAvatar(((C86184Xs4) this.l2).LJII, X1D.LIZIZ(LIZ2), i, this.s0, (List) this.l1);
    }

    public final void LIZ$2() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(Api.LIZJ);
        LIZ.append("?uid=");
        LIZ.append(HG3.LJIILL().getCurUserId());
        HG3.LJIILL().uploadVideoAvatar(((C26316AUm) this.l2).LJII, X1D.LIZIZ(LIZ), 4194304, this.s0, (List) this.l1);
        HG3.LJIILL().getCurUser().setAvatarUpdateReminder(false);
    }

    public static final void run$0(ARunnableS3S1200000_4 aRunnableS3S1200000_4) {
        boolean LIZ;
        try {
            aRunnableS3S1200000_4.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS3S1200000_4 aRunnableS3S1200000_4) {
        boolean LIZ;
        try {
            aRunnableS3S1200000_4.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS3S1200000_4 aRunnableS3S1200000_4) {
        boolean LIZ;
        try {
            ((InteractStickerViewModel) aRunnableS3S1200000_4.l1).iv0(aRunnableS3S1200000_4.l2, aRunnableS3S1200000_4.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS3S1200000_4 aRunnableS3S1200000_4) {
        boolean LIZ;
        try {
            aRunnableS3S1200000_4.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS3S1200000_4 aRunnableS3S1200000_4) {
        boolean LIZ;
        try {
            aRunnableS3S1200000_4.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S1200000_4(Map map, AqS170S0100000_4 aqS170S0100000_4, int i) {
        this.$t = i;
        this.s0 = "general_search";
        this.l1 = aqS170S0100000_4;
        this.l2 = map;
    }

    public ARunnableS3S1200000_4(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
