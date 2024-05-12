package Y;

import X.AbstractC030109x;
import X.AbstractC28931Bp;
import X.C10I;
import X.C10K;
import X.C38700FGu;
import X.C38816FLg;
import X.C38891fp;
import X.C40534FvW;
import X.C58704N2e;
import X.C61017Nx7;
import X.C62011OVj;
import X.C62155OaN;
import X.C67401Qcn;
import X.C76800UCe;
import X.C82544WaS;
import X.C84763XOl;
import X.DialogC25756A8y;
import X.InterfaceC59293NOv;
import X.InterfaceC59429NUb;
import X.InterfaceC62164OaW;
import X.InterfaceC78716Uuu;
import X.N2X;
import X.NW6;
import X.ORZ;
import X.OU4;
import X.OU6;
import X.OUA;
import X.OUC;
import X.OUG;
import X.OUJ;
import X.OUM;
import X.OUN;
import X.OW6;
import X.OX6;
import X.OX7;
import X.OXB;
import X.ScaleGestureDetectorOnScaleGestureListenerC62135Oa3;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.fe.method.ImageChooseActivity;
import com.ss.android.ugc.aweme.fe.method.upload.ImageChooseUploadActivity;
import com.ss.android.ugc.aweme.feed.spi.CommonFeedServiceImpl;
import com.ss.android.ugc.aweme.qrcode.model.QRCodeInfo;
import com.ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class AgS127S0100000_10 implements C10I {
    public final int $t;
    public Object l0;

    @Override // X.C10I
    public final Object then(C10K c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            case 5:
                return then$5(this, c10k);
            case 6:
                return then$6(this, c10k);
            case 7:
                return then$7(this, c10k);
            case 8:
                return then$8(this, c10k);
            case 9:
                return then$9(this, c10k);
            case 10:
                return then$10(this, c10k);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return then$11(this, c10k);
            case 12:
                return then$12(this, c10k);
            default:
                return null;
        }
    }

    public AgS127S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(AgS127S0100000_10 agS127S0100000_10, C10K c10k) {
        boolean z;
        InterfaceC59293NOv interfaceC59293NOv = (InterfaceC59293NOv) agS127S0100000_10.l0;
        if (NW6.LIZ().isAppBackground() || System.currentTimeMillis() - NW6.LIZ().LJJI() < 5000) {
            z = true;
        } else {
            z = false;
        }
        C67401Qcn c67401Qcn = (C67401Qcn) interfaceC59293NOv;
        Long l = (Long) c67401Qcn.LJLIL;
        String str = (String) c67401Qcn.LJLILLLLZI;
        if (z) {
            C58704N2e.LJ("splash_ad", "deeplink_success", l.toString(), str, null).LJI();
        } else {
            C58704N2e.LJ("splash_ad", "deeplink_failed", l.toString(), str, null).LJI();
        }
        return null;
    }

    public static final Object then$1(AgS127S0100000_10 agS127S0100000_10, C10K c10k) {
        C62155OaN c62155OaN = (C62155OaN) agS127S0100000_10.l0;
        c62155OaN.getClass();
        if (c10k.LJIIJJI() != null) {
            c62155OaN.LJLILLLLZI.getHierarchy().LJIILLIIL(0);
            c62155OaN.LJLILLLLZI.getHierarchy().LJIJJ((Drawable) c10k.LJIIJJI(), InterfaceC78716Uuu.LJJLIIIJILLIZJL);
            c62155OaN.LJLJJL = true;
            return null;
        }
        return null;
    }

    public static final Object then$10(AgS127S0100000_10 agS127S0100000_10, C10K c10k) {
        AbstractC030109x abstractC030109x;
        AbstractC28931Bp abstractC28931Bp;
        if (C38891fp.LJJI((Collection) c10k.LJIIJJI())) {
            DialogC25756A8y dialogC25756A8y = ((ImageChooseUploadActivity) agS127S0100000_10.l0).LJLILLLLZI;
            if (dialogC25756A8y != null) {
                dialogC25756A8y.dismiss();
            }
            TextView textView = ((ImageChooseUploadActivity) agS127S0100000_10.l0).LJLJJL;
            if (textView != null) {
                textView.setVisibility(0);
            }
            ImageChooseUploadActivity imageChooseUploadActivity = (ImageChooseUploadActivity) agS127S0100000_10.l0;
            TextView textView2 = imageChooseUploadActivity.LJLJJL;
            if (textView2 != null) {
                textView2.setText(imageChooseUploadActivity.getResources().getString(R.string.iqs));
            }
        } else {
            TextView textView3 = ((ImageChooseUploadActivity) agS127S0100000_10.l0).LJLJJL;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            DialogC25756A8y dialogC25756A8y2 = ((ImageChooseUploadActivity) agS127S0100000_10.l0).LJLILLLLZI;
            if (dialogC25756A8y2 != null) {
                dialogC25756A8y2.dismiss();
            }
            OXB oxb = ((ImageChooseUploadActivity) agS127S0100000_10.l0).LJLJJLL;
            if (oxb != null) {
                Object LJIIJJI = c10k.LJIIJJI();
                o.LJIIIIZZ(LJIIJJI, "it.result");
                oxb.LJLZ((Collection) LJIIJJI);
            }
            ImageChooseUploadActivity imageChooseUploadActivity2 = (ImageChooseUploadActivity) agS127S0100000_10.l0;
            RecyclerView recyclerView = imageChooseUploadActivity2.LJLJI;
            if (recyclerView != null) {
                recyclerView.setAdapter(imageChooseUploadActivity2.LJLJJLL);
            }
            RecyclerView recyclerView2 = ((ImageChooseUploadActivity) agS127S0100000_10.l0).LJLJI;
            if (recyclerView2 != null) {
                abstractC030109x = recyclerView2.getItemAnimator();
            } else {
                abstractC030109x = null;
            }
            if ((abstractC030109x instanceof AbstractC28931Bp) && (abstractC28931Bp = (AbstractC28931Bp) abstractC030109x) != null) {
                abstractC28931Bp.LJI = false;
            }
            ImageChooseUploadActivity imageChooseUploadActivity3 = (ImageChooseUploadActivity) agS127S0100000_10.l0;
            OXB oxb2 = imageChooseUploadActivity3.LJLJJLL;
            if (oxb2 != null) {
                oxb2.LJLLILLLL = imageChooseUploadActivity3.LJLLILLLL;
                oxb2.LJLLJ = imageChooseUploadActivity3.LJLLJ;
            }
        }
        return null;
    }

    public static final Object then$11(AgS127S0100000_10 agS127S0100000_10, C10K c10k) {
        final Bundle bundle = (Bundle) agS127S0100000_10.l0;
        ArrayList arrayList = new ArrayList();
        if (C40534FvW.LIZ()) {
            arrayList.add(new OU6(bundle));
        }
        arrayList.add(new OUA(bundle));
        if (C38700FGu.LIZ()) {
            arrayList.add(new OUC(bundle));
        }
        arrayList.add(new OUM() { // from class: X.OUH
            @Override // X.OUM
            public final void LIZ(Bundle bundle2) {
                Bundle bundle3 = bundle;
                if (bundle2 == null) {
                    bundle2 = bundle3;
                }
                IRecommendUsersServiceImpl.LJIIIZ().LJIIIIZZ("switch");
                CommonFeedServiceImpl.LJJIJLIJ().LJIIIIZZ();
                OUG.LIZ(bundle2);
            }
        });
        arrayList.add(new OU4(bundle));
        OUJ.LIZIZ = ORZ.LLJILJILJ(arrayList);
        Iterator<OUN> it = OUJ.LIZ.iterator();
        while (it.hasNext()) {
            it.next().onStart();
        }
        OUG.LIZ(bundle);
        return c10k.LJIIJJI();
    }

    public static final Object then$12(AgS127S0100000_10 agS127S0100000_10, C10K c10k) {
        Exception exc = null;
        QRCodeInfo qRCodeInfo = null;
        if (C82544WaS.LJ(c10k)) {
            InterfaceC62164OaW interfaceC62164OaW = (InterfaceC62164OaW) agS127S0100000_10.l0;
            if (c10k != null) {
                qRCodeInfo = (QRCodeInfo) c10k.LJIIJJI();
            }
            interfaceC62164OaW.LIZ(qRCodeInfo);
        } else {
            InterfaceC62164OaW interfaceC62164OaW2 = (InterfaceC62164OaW) agS127S0100000_10.l0;
            if (c10k != null) {
                exc = c10k.LJIIJ();
            }
            interfaceC62164OaW2.onFailure(exc);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$2(AgS127S0100000_10 agS127S0100000_10, C10K c10k) {
        boolean z;
        N2X n2x = (N2X) agS127S0100000_10.l0;
        if (C61017Nx7.LIZ().LIZ.LIZIZ || System.currentTimeMillis() - C61017Nx7.LIZ().LIZ.LIZJ < 5000) {
            z = true;
        } else {
            z = false;
        }
        n2x.LIZ(z);
        return null;
    }

    public static final Object then$3(AgS127S0100000_10 agS127S0100000_10, C10K c10k) {
        ((N2X) agS127S0100000_10.l0).LIZ(C61017Nx7.LIZ().LIZ.LIZIZ);
        return null;
    }

    public static final Object then$4(AgS127S0100000_10 agS127S0100000_10, C10K c10k) {
        boolean z;
        if (C84763XOl.LJIIJJI || System.currentTimeMillis() - C84763XOl.LJIILJJIL < 5000) {
            z = true;
        } else {
            z = false;
        }
        ((InterfaceC59429NUb) agS127S0100000_10.l0).LIZ(z);
        return null;
    }

    public static final Object then$5(AgS127S0100000_10 agS127S0100000_10, C10K c10k) {
        ((InterfaceC59429NUb) agS127S0100000_10.l0).LIZ(C84763XOl.LJIIJJI);
        return null;
    }

    public static final Object then$6(AgS127S0100000_10 agS127S0100000_10, C10K c10k) {
        AbstractC030109x abstractC030109x;
        AbstractC28931Bp abstractC28931Bp;
        if (C38891fp.LJJI((Collection) c10k.LJIIJJI())) {
            DialogC25756A8y dialogC25756A8y = ((ImageChooseActivity) agS127S0100000_10.l0).LJLILLLLZI;
            if (dialogC25756A8y != null) {
                dialogC25756A8y.dismiss();
            }
            TextView textView = ((ImageChooseActivity) agS127S0100000_10.l0).LJLJJL;
            if (textView != null) {
                textView.setVisibility(0);
            }
            ImageChooseActivity imageChooseActivity = (ImageChooseActivity) agS127S0100000_10.l0;
            TextView textView2 = imageChooseActivity.LJLJJL;
            if (textView2 != null) {
                textView2.setText(imageChooseActivity.getResources().getString(R.string.iqs));
            }
        } else {
            TextView textView3 = ((ImageChooseActivity) agS127S0100000_10.l0).LJLJJL;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            DialogC25756A8y dialogC25756A8y2 = ((ImageChooseActivity) agS127S0100000_10.l0).LJLILLLLZI;
            if (dialogC25756A8y2 != null) {
                dialogC25756A8y2.dismiss();
            }
            OXB oxb = ((ImageChooseActivity) agS127S0100000_10.l0).LJLJJLL;
            if (oxb != null) {
                Object LJIIJJI = c10k.LJIIJJI();
                o.LJIIIIZZ(LJIIJJI, "it.result");
                oxb.LJLZ((Collection) LJIIJJI);
            }
            ImageChooseActivity imageChooseActivity2 = (ImageChooseActivity) agS127S0100000_10.l0;
            RecyclerView recyclerView = imageChooseActivity2.LJLJI;
            if (recyclerView != null) {
                recyclerView.setAdapter(imageChooseActivity2.LJLJJLL);
            }
            RecyclerView recyclerView2 = ((ImageChooseActivity) agS127S0100000_10.l0).LJLJI;
            if (recyclerView2 != null) {
                abstractC030109x = recyclerView2.getItemAnimator();
            } else {
                abstractC030109x = null;
            }
            if ((abstractC030109x instanceof AbstractC28931Bp) && (abstractC28931Bp = (AbstractC28931Bp) abstractC030109x) != null) {
                abstractC28931Bp.LJI = false;
            }
            ImageChooseActivity imageChooseActivity3 = (ImageChooseActivity) agS127S0100000_10.l0;
            OXB oxb2 = imageChooseActivity3.LJLJJLL;
            if (oxb2 != null) {
                oxb2.LJLLILLLL = imageChooseActivity3.LJLLILLLL;
                oxb2.LJLLJ = imageChooseActivity3.LJLLJ;
            }
        }
        return null;
    }

    public static final Object then$7(AgS127S0100000_10 agS127S0100000_10, C10K c10k) {
        ((ScanQRCodeActivityV2) agS127S0100000_10.l0).LLF = new GestureDetector((ScanQRCodeActivityV2) agS127S0100000_10.l0, new OX7((ScanQRCodeActivityV2) agS127S0100000_10.l0));
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) agS127S0100000_10.l0;
        ScanQRCodeActivityV2 scanQRCodeActivityV22 = (ScanQRCodeActivityV2) agS127S0100000_10.l0;
        scanQRCodeActivityV2.LLFF = new ScaleGestureDetector(scanQRCodeActivityV22, new ScaleGestureDetectorOnScaleGestureListenerC62135Oa3(scanQRCodeActivityV22));
        ScanQRCodeActivityV2 scanQRCodeActivityV23 = (ScanQRCodeActivityV2) agS127S0100000_10.l0;
        ScanQRCodeActivityV2 scanQRCodeActivityV24 = (ScanQRCodeActivityV2) agS127S0100000_10.l0;
        scanQRCodeActivityV23.LLFFF = new GestureDetector(scanQRCodeActivityV24, new OX6(scanQRCodeActivityV24));
        return null;
    }

    public static final Object then$8(AgS127S0100000_10 agS127S0100000_10, C10K c10k) {
        synchronized (((ScanQRCodeActivityV2) agS127S0100000_10.l0)) {
            ScanQRCodeActivityV2 scanQRCodeActivityV2 = (ScanQRCodeActivityV2) agS127S0100000_10.l0;
            IQRCodeScanner iQRCodeScanner = scanQRCodeActivityV2.LJLJLLL;
            if (iQRCodeScanner != null && !scanQRCodeActivityV2.LJLLL) {
                iQRCodeScanner.stop();
            }
        }
        return null;
    }

    public static final Object then$9(AgS127S0100000_10 agS127S0100000_10, C10K c10k) {
        if (c10k == null || !((Boolean) c10k.LJIIJJI()).booleanValue()) {
            OW6 ow6 = (OW6) agS127S0100000_10.l0;
            ow6.getClass();
            C38816FLg.LIZJ(new ARunnableS46S0100000_10(ow6, 103));
            C62011OVj.LJII(1, "copy video thumbnail fail");
            return null;
        }
        return null;
    }
}
