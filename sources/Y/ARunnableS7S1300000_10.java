package Y;

import X.C227898wz;
import X.C242549fW;
import X.C52995Kr1;
import X.C61739OKx;
import X.C76800UCe;
import X.EnumC61741OKz;
import X.ExecutorC142245i8;
import X.NC7;
import X.O6R;
import X.OBC;
import X.OL1;
import X.OL2;
import X.OL3;
import X.OL5;
import X.OLH;
import X.OSZ;
import X.X1D;
import android.content.Context;
import android.graphics.Bitmap;
import com.lynx.tasm.LynxTemplateRender;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentRelationModel;
import com.ss.android.ugc.aweme.ecommerce.mall.MallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IMallServiceManager;
import com.ss.android.ugc.aweme.ecommerce.mall.service.IShopIconService;
import com.ss.android.ugc.aweme.ecommerce.ug.vsa.repository.bean.VSAProductCardsResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.notice.api.services.INoticeCountTabBadgePresentService;
import com.ss.android.ugc.aweme.notification.service.NoticeCountTabBadgePresentServiceImpl;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* loaded from: classes11.dex */
public class ARunnableS7S1300000_10 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    public final void LIZ$0() {
        String str;
        try {
            if (OL1.LJIIIIZZ((Aweme) this.l1)) {
                if (((Context) this.l2) == null) {
                    OL3.LJ("context null");
                    return;
                }
                if (!OL3.LIZJ(this.s0)) {
                    OL3.LJ("not recommend");
                    return;
                }
                Aweme aweme = OL1.LIZIZ;
                String str2 = null;
                if (aweme == null) {
                    Aweme aweme2 = OL1.LIZJ;
                    if (aweme2 != null) {
                        str = aweme2.getAid();
                    } else {
                        str = null;
                    }
                    Aweme aweme3 = (Aweme) this.l1;
                    if (aweme3 != null) {
                        str2 = aweme3.getAid();
                    }
                    if (!o.LJ(str, str2)) {
                        OL3.LJ("active aweme null");
                        return;
                    } else {
                        OLH.LJ(EnumC61741OKz.UNEXPECTED.getValue(), false, 0, "show after unselected", null, null, null, 116);
                        return;
                    }
                }
                String aid = aweme.getAid();
                Aweme aweme4 = (Aweme) this.l1;
                if (aweme4 != null) {
                    str2 = aweme4.getAid();
                }
                if (!o.LJ(aid, str2)) {
                    OL3.LJ("aid different");
                    return;
                }
                OSZ LIZ = OL2.LIZ((Context) this.l2, aweme);
                boolean booleanValue = ((Boolean) LIZ.getFirst()).booleanValue();
                int intValue = ((Number) LIZ.getSecond()).intValue();
                if (!booleanValue) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("can not show ");
                    LIZ2.append(intValue);
                    OL3.LJ(X1D.LIZIZ(LIZ2));
                    return;
                }
                OL5 LIZIZ = OL1.LIZIZ(OL1.LIZIZ);
                if (LIZIZ != null) {
                    VSAProductCardsResponse.ProductCard productCard = LIZIZ.LJFF;
                    Bitmap bitmap = LIZIZ.LJII;
                    if (productCard == null) {
                        OL3.LJ("no product data");
                        return;
                    }
                    LIZIZ.LJIIIZ = (DataCenter) this.l3;
                    try {
                        ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS4S0500000_10(LIZIZ, aweme, (Context) this.l2, productCard, bitmap, 1));
                    } catch (Throwable unused) {
                    }
                    OLH.LJ(EnumC61741OKz.SHOW.getValue(), true, 0, null, null, LIZIZ.LJFF, LIZIZ.LJI, 28);
                    if (C76800UCe.LIZ != null) {
                        return;
                    }
                }
                OL3.LJ("no cache");
            }
        } catch (Throwable unused2) {
        }
    }

    public final void LIZ$1() {
        Aweme aweme;
        IShopIconService LIZ;
        Aweme aweme2;
        if (OL3.LIZJ(this.s0)) {
            OL3.LIZIZ = true;
            boolean LJI = OL1.LJI((Aweme) this.l1);
            if (OL1.LJII((Aweme) this.l1) || LJI) {
                if (!LJI) {
                    Aweme aweme3 = (Aweme) this.l1;
                    if (aweme3 == null) {
                        aweme2 = OL1.LIZIZ;
                    } else {
                        aweme2 = null;
                    }
                    OL1.LIZJ = aweme2;
                    OL1.LIZIZ = aweme3;
                } else {
                    OL5 LIZIZ = OL1.LIZIZ((Aweme) this.l1);
                    if (LIZIZ != null) {
                        Aweme aweme4 = LIZIZ.LIZ.get();
                        if (aweme4 != null) {
                            AwemeRawAd awemeRawAd = aweme4.getAwemeRawAd();
                            if (awemeRawAd != null) {
                                awemeRawAd.setEcUgVSAData(LIZIZ.LIZLLL);
                                awemeRawAd.setOpenUrl(LIZIZ.LIZLLL.getOpenUrl());
                            }
                            aweme = null;
                        } else {
                            aweme = OL1.LIZIZ;
                        }
                        OL1.LIZJ = aweme;
                        OL1.LIZIZ = aweme4;
                    }
                }
                OL5 LIZIZ2 = OL1.LIZIZ(OL1.LIZIZ);
                if (LIZIZ2 != null) {
                    OL3.LJFF(LIZIZ2);
                    OL3.LJII((Context) this.l3);
                    try {
                        IMallServiceManager LIZIZ3 = MallServiceManager.LIZIZ();
                        if (LIZIZ3 != null && (LIZ = LIZIZ3.LIZ()) != null) {
                            LIZ.LIZJ();
                        }
                    } catch (Throwable unused) {
                    }
                    OLH.LJ(EnumC61741OKz.SELECTED.getValue(), false, 0, null, null, LIZIZ2.LJFF, LIZIZ2.LJI, 30);
                }
                try {
                    INoticeCountTabBadgePresentService LJI2 = NoticeCountTabBadgePresentServiceImpl.LJI();
                    if (LJI2 != null && LJI2.isShowing()) {
                        OLH.LJ(EnumC61741OKz.INBOX_POPUP.getValue(), false, 0, "inbox showing", null, null, null, 116);
                    }
                } catch (Throwable unused2) {
                }
                C61739OKx c61739OKx = (C61739OKx) this.l2;
                if (c61739OKx == null) {
                    return;
                }
                try {
                    EventBus LIZJ = EventBus.LIZJ();
                    if (LIZJ.LJI(c61739OKx)) {
                        return;
                    }
                    LIZJ.LJIILJJIL(c61739OKx);
                    return;
                } catch (Throwable unused3) {
                    return;
                }
            }
            OL3.LJIIIZ((Context) this.l3, (C61739OKx) this.l2);
            return;
        }
        OL3.LIZIZ = false;
    }

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
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$2() {
        if (OL3.LIZJ(this.s0)) {
            OL3.LIZIZ = true;
            if (OL1.LJIIIZ((Aweme) this.l1) || OL1.LJIIIIZZ((Aweme) this.l1)) {
                try {
                    ScheduledFuture<?> scheduledFuture = OL3.LJI;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                } catch (Throwable unused) {
                }
                if (true ^ ((Boolean) C52995Kr1.LIZ.getValue()).booleanValue()) {
                    try {
                        ExecutorC142245i8.LJLILLLLZI.execute(new ARunnableS17S0000000_10(12));
                    } catch (Throwable unused2) {
                    }
                }
                OL3.LJIIIZ((Context) this.l2, (C61739OKx) this.l3);
                return;
            }
            return;
        }
        OL3.LIZIZ = false;
    }

    public static final void run$0(ARunnableS7S1300000_10 aRunnableS7S1300000_10) {
        boolean LIZ;
        try {
            ((LynxTemplateRender) aRunnableS7S1300000_10.l3).LJIJ((byte[]) aRunnableS7S1300000_10.l1, aRunnableS7S1300000_10.s0, (Map) aRunnableS7S1300000_10.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS7S1300000_10 aRunnableS7S1300000_10) {
        boolean LIZ;
        try {
            if (((OBC) aRunnableS7S1300000_10.l3).LIZ() != null) {
                ((OBC) aRunnableS7S1300000_10.l3).LIZIZ().openMiniApp((Context) aRunnableS7S1300000_10.l1, aRunnableS7S1300000_10.s0, (C227898wz) aRunnableS7S1300000_10.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS7S1300000_10 aRunnableS7S1300000_10) {
        boolean LIZ;
        try {
            aRunnableS7S1300000_10.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS7S1300000_10 aRunnableS7S1300000_10) {
        boolean LIZ;
        try {
            if (OL3.LIZJ(aRunnableS7S1300000_10.s0) && OL1.LJIIIZ((Aweme) aRunnableS7S1300000_10.l1)) {
                OL3.LJIIIZ((Context) aRunnableS7S1300000_10.l2, (C61739OKx) aRunnableS7S1300000_10.l3);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS7S1300000_10 aRunnableS7S1300000_10) {
        boolean LIZ;
        try {
            aRunnableS7S1300000_10.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS7S1300000_10 aRunnableS7S1300000_10) {
        boolean LIZ;
        try {
            aRunnableS7S1300000_10.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS7S1300000_10 aRunnableS7S1300000_10) {
        boolean LIZ;
        try {
            if (!O6R.LJIJJ((NC7) aRunnableS7S1300000_10.l1, aRunnableS7S1300000_10.s0, (AnoleComponentAppearModel) aRunnableS7S1300000_10.l2, (AnoleComponentRelationModel) aRunnableS7S1300000_10.l3)) {
                C242549fW.LIZ("checkShowComponentPreconditions = false");
            } else {
                O6R.LJJIJIL((NC7) aRunnableS7S1300000_10.l1, aRunnableS7S1300000_10.s0, (AnoleComponentAppearModel) aRunnableS7S1300000_10.l2);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS7S1300000_10(android.content.Context r2, X.C61739OKx r3, com.ss.android.ugc.aweme.feed.model.Aweme r4, java.lang.String r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 3: goto L12;
                case 4: goto L5;
                case 5: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r5
            r0.l1 = r4
            r0.l2 = r3
            r0.l3 = r2
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.s0 = r5
            r0.l1 = r4
            r0.l2 = r2
            r0.l3 = r3
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS7S1300000_10.<init>(android.content.Context, X.OKx, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, int):void");
    }

    public ARunnableS7S1300000_10(Object obj, Object obj2, Object obj3, String str, int i) {
        this.$t = i;
        this.l1 = obj3;
        this.l2 = obj;
        this.s0 = str;
        this.l3 = obj2;
    }
}
