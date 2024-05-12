package X;

import Y.ARunnableS18S0101000_14;
import Y.IDRunnableS6S0101000;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;

/* loaded from: classes15.dex */
public final class W5F {
    public static final W5F LJJJJ;
    public static final boolean LJJJJI;
    public static final boolean LJJJJIZL;
    public android.net.Uri LIZ;
    public final Object LIZIZ;
    public Context LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJI;
    public Drawable LJIILIIL;
    public EnumC72807Shn LJIILJJIL;
    public Drawable LJIILLIIL;
    public Drawable LJIIZILJ;
    public Drawable LJIJ;
    public Bitmap.Config LJIJI;
    public EnumC72807Shn LJIJJ;
    public S3L LJIJJLI;
    public MHO LJIL;
    public QM9 LJJ;
    public String LJJIFFI;
    public Executor LJJII;
    public InterfaceC85013Vh LJJIIJ;
    public ImageView LJJIIJZLJL;
    public InterfaceC70769Rq1 LJJIIZ;
    public InterfaceC31104CIq LJJIIZI;
    public InterfaceC78660Uu0 LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public C62562cu LJJIJL;
    public W66 LJJIL;
    public SIR LJJIZ;
    public String LJJJ;
    public boolean LJJJI;
    public String LJJJIL;
    public int LJFF = -1;
    public int LJII = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;
    public int LJIIJ = -1;
    public int LJIIJJI = -1;
    public int LJIIL = -1;
    public int LJIILL = -1;
    public KL0 LJJI = KL0.MEDIUM;
    public EnumC62195Ob1 LJJIII = EnumC62195Ob1.DEFAULT;
    public int LJJIJLIJ = -1;

    /* JADX WARN: Removed duplicated region for block: B:67:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.W5E LIZ() {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W5F.LIZ():X.W5E");
    }

    static {
        boolean z;
        W5F w5f = new W5F(new C62562cu(Collections.emptyList()));
        w5f.LIZ = UriProtector.parse("");
        LJJJJ = w5f;
        C81814W9a LJIIJ = C81814W9a.LJIIJ();
        boolean z2 = false;
        if (LJIIJ.LIZIZ.LJJIIZ.LIZ() != null && ((Boolean) LJIIJ.LIZIZ.LJJIIZ.LIZ()).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        LJJJJI = z;
        C81814W9a LJIIJ2 = C81814W9a.LJIIJ();
        if (LJIIJ2.LIZIZ.LJJIIZI.LIZ() != null && ((Boolean) LJIIJ2.LIZIZ.LJJIIZI.LIZ()).booleanValue()) {
            z2 = true;
        }
        LJJJJIZL = z2;
    }

    public final void LIZJ() {
        if (this.LJJIIJ != null || this.LJJIIJZLJL != null) {
            W5U.LIZ(LIZ());
            return;
        }
        throw new IllegalArgumentException("LightenImageRequestBuilderneeds SmartImageView to display, use with(view)");
    }

    public final void LJ() {
        ARunnableS18S0101000_14 aRunnableS18S0101000_14 = new ARunnableS18S0101000_14(3, this, 22);
        if (LJJJJI) {
            aRunnableS18S0101000_14.run();
        } else {
            C38995FSd.LIZLLL().execute(aRunnableS18S0101000_14);
        }
    }

    public final void LJIIJ() {
        IDRunnableS6S0101000 iDRunnableS6S0101000 = new IDRunnableS6S0101000(5, this, 34);
        if (LJJJJI) {
            iDRunnableS6S0101000.run();
        } else {
            C38995FSd.LIZLLL().execute(iDRunnableS6S0101000);
        }
    }

    public final void LJI() {
        W5U.LIZIZ(LIZ());
    }

    public final void LJIIIIZZ() {
        W5U.LJIIJ(LIZ());
    }

    public W5F(String str) {
        this.LIZ = UriProtector.parse(str);
    }

    public final void LIZIZ(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.LJJIFFI = str;
        }
    }

    public final void LIZLLL(InterfaceC70769Rq1 interfaceC70769Rq1) {
        if (this.LJJIIJ != null || this.LJJIIJZLJL != null) {
            this.LJJIIZ = interfaceC70769Rq1;
            W5U.LIZ(LIZ());
            return;
        }
        throw new IllegalArgumentException("LightenImageRequestBuilderneeds SmartImageView to display, use with(view)");
    }

    public final void LJFF(InterfaceC70769Rq1 interfaceC70769Rq1) {
        ARunnableS18S0101000_14 aRunnableS18S0101000_14 = new ARunnableS18S0101000_14(2, this, 23);
        this.LJJIIZ = interfaceC70769Rq1;
        if (LJJJJI) {
            aRunnableS18S0101000_14.run();
        } else {
            C38995FSd.LIZLLL().execute(aRunnableS18S0101000_14);
        }
    }

    public final void LJII(InterfaceC31104CIq interfaceC31104CIq) {
        this.LJJIIZI = interfaceC31104CIq;
        W5U.LIZIZ(LIZ());
    }

    public final void LJIIIZ(InterfaceC78660Uu0 interfaceC78660Uu0) {
        this.LJJIJ = interfaceC78660Uu0;
        W5U.LJIIJ(LIZ());
    }

    public final void LJIIJJI(InterfaceC78660Uu0 interfaceC78660Uu0) {
        this.LJJIJ = interfaceC78660Uu0;
        ARunnableS18S0101000_14 aRunnableS18S0101000_14 = new ARunnableS18S0101000_14(3, this, 21);
        if (LJJJJI) {
            aRunnableS18S0101000_14.run();
        } else {
            C38995FSd.LIZLLL().execute(aRunnableS18S0101000_14);
        }
    }

    public final HW9 LJIIL(InterfaceC78660Uu0 interfaceC78660Uu0) {
        this.LJJIJ = interfaceC78660Uu0;
        if (LJJJJIZL) {
            LJIIJ();
            return new HW9() { // from class: X.W5w
                @Override // X.HW9
                public final void cancel() {
                }
            };
        }
        int i = 1;
        this.LJJJI = true;
        W5E LIZ = LIZ();
        C38995FSd.LIZLLL().submit(new ARunnableS18S0101000_14(2, LIZ, 0));
        HWB hwb = new HWB(LIZ);
        if (LIZ == null) {
            return hwb;
        }
        HWC.LIZ.execute(new RunnableC45421Hs9(i, LIZ, hwb));
        return hwb;
    }

    public final void LJIILIIL(int[] iArr) {
        if (iArr.length == 2) {
            this.LJIIIZ = iArr[0];
            this.LJIIJ = iArr[1];
        } else {
            C79083V1z.LIZIZ(0, "LightenImageRequestBuilder", "resize", "the array size must be 2, first is width, second is height");
            throw new IllegalArgumentException("LightenImageRequestBuilderthe array size must be 2, first is width, second is height");
        }
    }

    public final void LJIILJJIL(int[] iArr) {
        if (iArr.length == 2) {
            this.LJII = iArr[0];
            this.LJIIIIZZ = iArr[1];
        } else {
            C79083V1z.LIZIZ(0, "LightenImageRequestBuilder", "resize", "the array size must be 2, first is width, second is height");
            throw new IllegalArgumentException("LightenImageRequestBuilderthe array size must be 2, first is width, second is height");
        }
    }

    public final void LJIILL(InterfaceC80940Vpg interfaceC80940Vpg) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(interfaceC80940Vpg);
        this.LJJ = new QM9(arrayList);
    }

    public W5F(C62562cu c62562cu) {
        this.LJJIJL = c62562cu;
    }

    public W5F(android.net.Uri uri) {
        this.LIZ = uri;
    }

    public W5F(Object obj) {
        this.LIZIZ = obj;
    }
}
