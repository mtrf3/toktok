package X;

import Y.ARunnableS14S0101000_10;
import android.content.Context;
import android.os.Handler;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ad.feed.photomode.AdPhotoModeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselInfoStruct;
import com.ss.android.ugc.aweme.commercialize.model.PhotoCarouselProductStruct;
import com.ss.android.ugc.aweme.commercialize.service.IAdPhotoModeService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.NHg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59096NHg implements AnonymousClass818 {
    public final InterfaceC59098NHi LJLIL;
    public boolean LJLJJI;
    public InterfaceC59097NHh LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;
    public NGM LJLJLJ;
    public Runnable LJLL;
    public final List<InterfaceC59097NHh> LJLILLLLZI = new ArrayList();
    public final C59062NFy[] LJLJI = new C59062NFy[3];
    public final Handler LJLJLLL = new Handler(C16880lQ.LLJJJJ());

    @Override // X.AnonymousClass818
    public final void LLIILZL() {
        Runnable runnable = this.LJLL;
        if (runnable != null) {
            this.LJLJLLL.removeCallbacks(runnable);
        }
        this.LJLL = null;
        this.LJLJJLL = false;
        this.LJLJL = false;
        this.LJLJLJ = null;
        InterfaceC59097NHh interfaceC59097NHh = this.LJLJJL;
        if (interfaceC59097NHh != null) {
            interfaceC59097NHh.onHide();
        }
        this.LJLJJL = null;
        this.LJLJJI = false;
    }

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoCarouselProductStruct> productList;
        ((ArrayList) this.LJLILLLLZI).clear();
        C39289FbR.LIZJ.LIZIZ();
        Context context = this.LJLIL.getContext();
        int i = 0;
        if (context != null) {
            int length = this.LJLJI.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.LJLJI[i2] = new C59062NFy(context, this.LJLIL.getAweme(), i2);
            }
        }
        AwemeRawAd awemeRawAd = this.LJLIL.getAweme().getAwemeRawAd();
        if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null && (productList = photoCarouselInfo.getProductList()) != null) {
            for (PhotoCarouselProductStruct photoCarouselProductStruct : productList) {
                int i3 = i + 1;
                if (i >= 0) {
                    ((ArrayList) this.LJLILLLLZI).add(new C59093NHd(new C59095NHf(this, i, photoCarouselProductStruct)));
                    i = i3;
                } else {
                    C47261Igj.LJJJJJ();
                    throw null;
                }
            }
        }
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ InterfaceC59098NHi L9() {
        return this.LJLIL;
    }

    public C59096NHg(AnonymousClass813 anonymousClass813) {
        this.LJLIL = anonymousClass813;
    }

    public final void LIZ(int i) {
        String str;
        int i2;
        int i3;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoModeImageUrlModel> imageList;
        InterfaceC59094NHe L9;
        PhotoCarouselProductStruct LIZ;
        Object obj;
        NGM ngm;
        int i4;
        boolean z;
        if (!this.LJLJL) {
            C59062NFy[] c59062NFyArr = this.LJLJI;
            ArrayList arrayList = new ArrayList(c59062NFyArr.length);
            int length = c59062NFyArr.length;
            int i5 = 0;
            while (true) {
                obj = null;
                if (i5 >= length) {
                    break;
                }
                C59062NFy c59062NFy = c59062NFyArr[i5];
                if (c59062NFy != null) {
                    C39289FbR c39289FbR = C39289FbR.LIZJ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("product_label");
                    LIZ2.append(c59062NFy.LJLIL);
                    String LIZIZ = X1D.LIZIZ(LIZ2);
                    c39289FbR.getClass();
                    if (C39289FbR.LIZ(LIZIZ) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!c59062NFy.LJLILLLLZI) {
                        obj = NGM.DATA_LOAD_FAIL;
                    } else if (!z) {
                        obj = NGM.LOAD_TIME_OUT;
                    } else {
                        obj = NGM.RENDER_SUCCESS;
                    }
                }
                arrayList.add(obj);
                i5++;
            }
            Iterator it = arrayList.iterator();
            int i6 = 0;
            while (it.hasNext()) {
                if (it.next() == NGM.RENDER_SUCCESS) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                i6 += i4;
            }
            C58655N0h LIZLLL = C58704N2e.LIZLLL("draw_ad", "othershow_error", this.LJLIL.getAweme().getAwemeRawAd());
            LIZLLL.LIZJ("carousel_label", "refer");
            C0JU.LIZJ(i6, LIZLLL, "is_under_guide");
            NGM ngm2 = NGM.RENDER_SUCCESS;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                NGM ngm3 = (NGM) it2.next();
                if (ngm3 != null) {
                    int i7 = NGO.LIZ[ngm3.ordinal()];
                    if (i7 != 1) {
                        if (i7 != 2) {
                            if (i7 == 3) {
                                ngm = NGM.RENDER_SUCCESS;
                                if (ngm2 == ngm) {
                                    ngm2 = ngm;
                                }
                            }
                        } else {
                            ngm = NGM.DATA_LOAD_FAIL;
                            if (ngm2 == ngm) {
                                ngm2 = ngm;
                            } else {
                                ngm2 = NGM.LOAD_TIME_OUT;
                            }
                        }
                    } else {
                        ngm2 = NGM.DATA_LOAD_FAIL;
                    }
                }
                ngm2 = NGM.DATA_LOAD_FAIL;
            }
            this.LJLJLJ = ngm2;
            this.LJLJL = true;
            if (ngm2 == NGM.RENDER_SUCCESS) {
                C58655N0h LIZLLL2 = C58704N2e.LIZLLL("draw_ad", "othershow", this.LJLIL.getAweme().getAwemeRawAd());
                LIZLLL2.LIZJ("carousel_label", "refer");
                LIZLLL2.LJI();
            } else {
                C58655N0h LIZLLL3 = C58704N2e.LIZLLL("draw_ad", "othershow_fail", this.LJLIL.getAweme().getAwemeRawAd());
                LIZLLL3.LIZJ("carousel_label", "refer");
                NGM ngm4 = this.LJLJLJ;
                if (ngm4 != null) {
                    obj = ngm4.getValue();
                }
                LIZLLL3.LIZIZ(obj, "fail_reason");
                LIZLLL3.LJI();
            }
        }
        if (this.LJLJLJ != NGM.RENDER_SUCCESS) {
            return;
        }
        InterfaceC59097NHh interfaceC59097NHh = this.LJLJJL;
        InterfaceC59097NHh interfaceC59097NHh2 = (InterfaceC59097NHh) ORZ.LJLLLLLL(i, this.LJLILLLLZI);
        this.LJLJJL = interfaceC59097NHh2;
        if (!o.LJ(interfaceC59097NHh, interfaceC59097NHh2)) {
            InterfaceC59097NHh interfaceC59097NHh3 = this.LJLJJL;
            if (interfaceC59097NHh3 == null || (L9 = interfaceC59097NHh3.L9()) == null || (LIZ = L9.LIZ()) == null || (str = LIZ.getProductId()) == null) {
                str = "";
            }
            if (this.LJLJJI) {
                IAdPhotoModeService LIZ3 = AdPhotoModeServiceImpl.LIZ();
                int e1 = LIZ3.e1() + 1;
                PhotoModeImageInfo photoModeImageInfo = this.LJLIL.getAweme().getPhotoModeImageInfo();
                if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
                    i2 = imageList.size();
                } else {
                    i2 = 0;
                }
                AwemeRawAd awemeRawAd = this.LJLIL.getAweme().getAwemeRawAd();
                if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null) {
                    i3 = photoCarouselInfo.getProductCount();
                } else {
                    i3 = 0;
                }
                LIZ3.x1(e1, i2, str, i3, LIZ3.getEnterMethod(), this.LJLIL.getAweme().getAwemeRawAd());
                return;
            }
            if (interfaceC59097NHh != null) {
                interfaceC59097NHh.onHide();
            }
            InterfaceC59097NHh interfaceC59097NHh4 = this.LJLJJL;
            if (interfaceC59097NHh4 != null) {
                interfaceC59097NHh4.onShow();
            }
            LIZIZ(str);
        }
    }

    public final void LIZIZ(String str) {
        int i;
        int i2;
        PhotoCarouselInfoStruct photoCarouselInfo;
        List<PhotoModeImageUrlModel> imageList;
        IAdPhotoModeService LIZ = AdPhotoModeServiceImpl.LIZ();
        int e1 = LIZ.e1() + 1;
        PhotoModeImageInfo photoModeImageInfo = this.LJLIL.getAweme().getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            i = imageList.size();
        } else {
            i = 0;
        }
        AwemeRawAd awemeRawAd = this.LJLIL.getAweme().getAwemeRawAd();
        if (awemeRawAd != null && (photoCarouselInfo = awemeRawAd.getPhotoCarouselInfo()) != null) {
            i2 = photoCarouselInfo.getProductCount();
        } else {
            i2 = 0;
        }
        LIZ.b1(e1, i, str, i2, LIZ.getEnterMethod(), this.LJLIL.getAweme().getAwemeRawAd());
    }

    @Override // X.AnonymousClass818
    public final void LW(int i) {
        this.LJLJJLL = true;
        this.LJLJJI = false;
        ARunnableS14S0101000_10 aRunnableS14S0101000_10 = new ARunnableS14S0101000_10(i, this, 5);
        this.LJLJLLL.postDelayed(aRunnableS14S0101000_10, 1000L);
        this.LJLL = aRunnableS14S0101000_10;
    }

    @Override // X.AnonymousClass818
    public final void QS(boolean z) {
        String str;
        InterfaceC59094NHe L9;
        PhotoCarouselProductStruct LIZ;
        this.LJLJJI = z;
        if (z) {
            InterfaceC59097NHh interfaceC59097NHh = this.LJLJJL;
            if (interfaceC59097NHh != null) {
                interfaceC59097NHh.onHide();
                return;
            }
            return;
        }
        InterfaceC59097NHh interfaceC59097NHh2 = this.LJLJJL;
        if (interfaceC59097NHh2 == null || (L9 = interfaceC59097NHh2.L9()) == null || (LIZ = L9.LIZ()) == null || (str = LIZ.getProductId()) == null) {
            str = "";
        }
        LIZIZ(str);
        InterfaceC59097NHh interfaceC59097NHh3 = this.LJLJJL;
        if (interfaceC59097NHh3 == null) {
            return;
        }
        interfaceC59097NHh3.onShow();
    }

    @Override // X.AnonymousClass818
    public final void pr(int i) {
        InterfaceC59097NHh interfaceC59097NHh = (InterfaceC59097NHh) ORZ.LJLLLLLL(i, this.LJLILLLLZI);
        if (interfaceC59097NHh != null) {
            interfaceC59097NHh.F1();
        }
    }

    @Override // X.AnonymousClass818
    public final void Jt(int i, boolean z) {
        if (!this.LJLJJLL) {
            return;
        }
        Runnable runnable = this.LJLL;
        if (runnable != null) {
            this.LJLJLLL.removeCallbacks(runnable);
        }
        ARunnableS14S0101000_10 aRunnableS14S0101000_10 = new ARunnableS14S0101000_10(i, this, 6);
        if (z) {
            this.LJLJLLL.post(aRunnableS14S0101000_10);
        } else {
            this.LJLJLLL.postDelayed(aRunnableS14S0101000_10, 200L);
        }
        this.LJLL = aRunnableS14S0101000_10;
    }

    @Override // X.AnonymousClass818
    public final void z70(int i, FrameLayout frameLayout) {
        InterfaceC59097NHh interfaceC59097NHh = (InterfaceC59097NHh) ORZ.LJLLLLLL(i, this.LJLILLLLZI);
        if (interfaceC59097NHh != null) {
            interfaceC59097NHh.Oc(frameLayout);
        }
    }
}
