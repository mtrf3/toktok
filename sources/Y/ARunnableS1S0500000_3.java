package Y;

import X.AnonymousClass064;
import X.C188627ak;
import X.C191327f6;
import X.C191337f7;
import X.C191387fC;
import X.C191427fG;
import X.C1DG;
import X.C36922EeM;
import X.C38995FSd;
import X.C40511Fv9;
import X.C52296Kfk;
import X.C62562cu;
import X.C68322mC;
import X.C76732zl;
import X.C76800UCe;
import X.C86M;
import X.C8DU;
import X.C8NR;
import X.InterfaceC31104CIq;
import X.InterfaceC65784Pro;
import X.KL0;
import X.ORZ;
import X.W5F;
import X.W5U;
import X.X1D;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.friends.model.MutualStruct;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS49S0400000_3;

/* loaded from: classes4.dex */
public class ARunnableS1S0500000_3 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        ConstraintLayout constraintLayout;
        Float f = (Float) this.l0;
        if (f != null) {
            View view = (View) this.l1;
            TextView textView = (TextView) this.l2;
            TextView textView2 = (TextView) this.l3;
            View view2 = (View) this.l4;
            float floatValue = f.floatValue();
            if (floatValue > view.getWidth() * 0.7d) {
                if (textView == null) {
                    return;
                }
                textView.setMaxWidth((int) (view.getWidth() * 0.3d));
                return;
            }
            int i = (int) floatValue;
            textView2.setMinWidth(i);
            AnonymousClass064 anonymousClass064 = new AnonymousClass064();
            if (!(view2 instanceof ConstraintLayout) || (constraintLayout = (ConstraintLayout) view2) == null) {
                return;
            }
            anonymousClass064.LJII(constraintLayout);
            anonymousClass064.LJIILL(R.id.ht0).LIZLLL.LJJJJLI = i;
            anonymousClass064.LIZIZ(constraintLayout);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0131, code lost:
    
        if (java.lang.Math.abs(r10) < (r0 - 2)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS1S0500000_3.LIZ$1():void");
    }

    public final void LIZ$2() {
        new C191387fC();
        Context context = ((C191327f6) this.l0).getContext();
        C191427fG c191427fG = new C191427fG(((C191337f7) this.l1).getPoiLat(), ((C191337f7) this.l1).getPoiLng());
        double maxLat = ((C191337f7) this.l1).getMaxLat();
        double minLat = ((C191337f7) this.l1).getMinLat();
        double maxLng = ((C191337f7) this.l1).getMaxLng();
        double minLng = ((C191337f7) this.l1).getMinLng();
        C191387fC.LIZ(context, (C8DU) this.l2, c191427fG, Double.valueOf(maxLat), Double.valueOf(minLat), Double.valueOf(maxLng), Double.valueOf(minLng), Double.valueOf(((C191337f7) this.l1).getDefaultZoomLevel()), ((C191337f7) this.l1).getPoiMarkers(), new AqS49S0400000_3((InterfaceC65784Pro) this.l3, (InterfaceC65784Pro<C76800UCe>) this.l0, (C191327f6) this.l2, (C8DU) this.l1, (C191337f7) 14), new AqS153S0100000_3((InterfaceC65784Pro) this.l4, (InterfaceC65784Pro<C76800UCe>) 1646));
        ((C8DU) this.l2).LJJIL(new AqS153S0100000_3((C191327f6) this.l0, 1647));
    }

    public final void LIZ$3() {
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        List<String> list;
        int LIZJ = C1DG.LIZ().LIZJ();
        C40511Fv9 c40511Fv9 = (C40511Fv9) this.l0;
        int i = c40511Fv9.LJLIL;
        int i2 = c40511Fv9.LJLILLLLZI;
        int i3 = c40511Fv9.LJLJI;
        if (i3 > 0) {
            if (i > i2) {
                return;
            }
        } else if (i3 >= 0 || i2 > i) {
            return;
        }
        while (true) {
            PhotoModeImageInfo photoModeImageInfo = ((Aweme) this.l1).getPhotoModeImageInfo();
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) ORZ.LJLLLLLL(i, imageList)) != null) {
                final C8NR c8nr = (C8NR) this.l2;
                Context context = (Context) this.l3;
                KL0 kl0 = (KL0) this.l4;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("start preload photo ");
                LIZ.append(i);
                C36922EeM.LIZLLL(3, "BasePreloadHelper", X1D.LIZIZ(LIZ));
                if (((Boolean) C52296Kfk.LIZ.getValue()).booleanValue() && photoModeImageUrlModel.needSupportMultiRateSelect()) {
                    photoModeImageUrlModel = C86M.LIZ(photoModeImageUrlModel, Integer.valueOf(LIZJ));
                }
                c8nr.getClass();
                final UrlModel targetMultiRateImageUrl = photoModeImageUrlModel.getTargetMultiRateImageUrl();
                if (targetMultiRateImageUrl == null) {
                    targetMultiRateImageUrl = photoModeImageUrlModel.getDisplayImageNoWatermark();
                }
                if (targetMultiRateImageUrl != null) {
                    list = targetMultiRateImageUrl.getUrlList();
                } else {
                    list = null;
                }
                W5F LJIIIZ = W5U.LJIIIZ(new C62562cu(list));
                LJIIIZ.LJJII = C38995FSd.LIZLLL();
                LJIIIZ.LIZJ = context;
                LJIIIZ.LJJI = kl0;
                final long elapsedRealtime = SystemClock.elapsedRealtime();
                LJIIIZ.LJII(new InterfaceC31104CIq() { // from class: X.8NQ
                    @Override // X.InterfaceC31104CIq
                    public final void LJI(File file) {
                        String str;
                        List<String> urlList;
                        C36922EeM.LIZLLL(3, "BasePreloadHelper", "download success");
                        C8NR c8nr2 = C8NR.this;
                        UrlModel urlModel = targetMultiRateImageUrl;
                        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) ORZ.LJLLLL(urlList)) == null) {
                            str = "";
                        }
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        c8nr2.getClass();
                        C8NR.LJI(1, null, str, elapsedRealtime2);
                    }

                    @Override // X.InterfaceC31104CIq
                    public final void onFailed(Throwable th) {
                        String str;
                        List<String> urlList;
                        C36922EeM.LIZLLL(3, "BasePreloadHelper", "download fail");
                        C8NR c8nr2 = C8NR.this;
                        UrlModel urlModel = targetMultiRateImageUrl;
                        if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str = (String) ORZ.LJLLLL(urlList)) == null) {
                            str = "";
                        }
                        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                        c8nr2.getClass();
                        C8NR.LJI(0, th, str, elapsedRealtime2);
                    }
                });
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public static final void run$0(ARunnableS1S0500000_3 aRunnableS1S0500000_3) {
        boolean LIZ;
        try {
            aRunnableS1S0500000_3.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S0500000_3 aRunnableS1S0500000_3) {
        boolean LIZ;
        try {
            aRunnableS1S0500000_3.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS1S0500000_3 aRunnableS1S0500000_3) {
        boolean LIZ;
        try {
            aRunnableS1S0500000_3.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS1S0500000_3 aRunnableS1S0500000_3) {
        boolean LIZ;
        try {
            aRunnableS1S0500000_3.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS1S0500000_3(Object obj, C188627ak c188627ak, C68322mC<StringBuilder> c68322mC, C76732zl c76732zl, MutualStruct mutualStruct, C68322mC<String> c68322mC2) {
        this.$t = c68322mC2;
        this.l0 = obj;
        this.l1 = c188627ak;
        this.l2 = c68322mC;
        this.l3 = c76732zl;
        this.l4 = mutualStruct;
    }
}
