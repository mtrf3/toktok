package X;

import android.content.Context;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.log.AdWebEventLoger;
import com.ss.android.ugc.aweme.log.AdWebLogModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS15S1101000_10;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS4S0101100_10;
import kotlin.jvm.internal.AqS63S1100000_10;
import kotlin.jvm.internal.AqS98S0101000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class N1V implements NK2 {
    public AdWebLogModel LIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public boolean LJIIJJI;
    public int LJIILIIL;
    public C36994EfW LJIILJJIL;
    public boolean LJIILL;
    public int LJIIZILJ;
    public int LJIJ;
    public boolean LJIJI;
    public long LJIJJLI;
    public boolean LJIL;
    public int LIZIZ = 1;
    public long LJI = System.currentTimeMillis();
    public String LJII = "";
    public long LJIIIIZZ = System.currentTimeMillis();
    public long LJIIIZ = System.currentTimeMillis();
    public long LJIIJ = System.currentTimeMillis();
    public final ArrayList<Integer> LJIIL = new ArrayList<>();
    public int LJIILLIIL = -1;
    public long LJIJJ = System.currentTimeMillis();

    @Override // X.NK2
    public final void LJIIIIZZ() {
        this.LJIIZILJ = 1;
        this.LJFF = (System.currentTimeMillis() - this.LJI) + this.LJFF;
        this.LJIJJLI = (System.currentTimeMillis() - this.LJI) + this.LJIJJLI;
    }

    @Override // X.NK2
    public final void LIZIZ() {
        this.LJI = System.currentTimeMillis();
    }

    @Override // X.NK2
    public final int LJFF() {
        return this.LIZIZ;
    }

    @Override // X.NK2
    public final void LIZ(int i) {
        AdWebLogModel adWebLogModel;
        String cid;
        if (this.LJIJI || !this.LJIL || (adWebLogModel = this.LIZ) == null || (cid = adWebLogModel.getCid()) == null || cid.length() == 0) {
            return;
        }
        AdWebEventLoger adWebEventLoger = new AdWebEventLoger(adWebLogModel);
        C58685N1l.LIZ.getClass();
        C58653N0f c58653N0f = C58685N1l.LJJJJ;
        String cid2 = adWebLogModel.getCid();
        if (cid2 == null) {
            cid2 = "";
        }
        adWebEventLoger.LIZJ(c58653N0f, cid2, adWebLogModel.getLogExtra(), null, new AqS98S0101000_10(this, i, 2));
        this.LJIJJ = System.currentTimeMillis();
        this.LJIJJLI = 0L;
        this.LJIJI = true;
    }

    @Override // X.NK2
    public final void LJIIIZ(C58653N0f event) {
        String cid;
        o.LJIIIZ(event, "event");
        AdWebLogModel adWebLogModel = this.LIZ;
        if (adWebLogModel == null || (cid = adWebLogModel.getCid()) == null || cid.length() == 0) {
            return;
        }
        AdWebEventLoger adWebEventLoger = new AdWebEventLoger(adWebLogModel);
        String cid2 = adWebLogModel.getCid();
        if (cid2 == null) {
            cid2 = "";
        }
        adWebEventLoger.LIZJ(event, cid2, adWebLogModel.getLogExtra(), null, new AqS176S0100000_10(this, 204));
    }

    @Override // X.NK2
    public final void LJIIL(String str) {
        String cid;
        AdWebLogModel adWebLogModel = this.LIZ;
        if (adWebLogModel == null || (cid = adWebLogModel.getCid()) == null || cid.length() == 0) {
            return;
        }
        AdWebEventLoger adWebEventLoger = new AdWebEventLoger(adWebLogModel);
        C58685N1l.LIZ.getClass();
        C58653N0f c58653N0f = C58685N1l.LJJJJZ;
        String cid2 = adWebLogModel.getCid();
        if (cid2 == null) {
            cid2 = "";
        }
        adWebEventLoger.LIZJ(c58653N0f, cid2, adWebLogModel.getLogExtra(), null, new AqS63S1100000_10(this, str, 8));
    }

    public final void LJIILL(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.setId(R.id.uw);
        C59989NgX c59989NgX = C59989NgX.LIZLLL;
        Context context = webView.getContext();
        o.LJIIIIZZ(context, "it.context");
        c59989NgX.LIZJ(context, webView, null, new NBY(EnumC58698N1y.USE_HALF, false, false, 28), new N1X(this));
    }

    public final void LJIJ(int i) {
        String cid;
        long currentTimeMillis;
        AdWebLogModel adWebLogModel = this.LIZ;
        if (adWebLogModel == null || (cid = adWebLogModel.getCid()) == null || cid.length() == 0) {
            return;
        }
        if (this.LJIIIZ > this.LJIIJ) {
            currentTimeMillis = 0;
        } else {
            currentTimeMillis = System.currentTimeMillis() - this.LJIIJ;
        }
        AdWebEventLoger adWebEventLoger = new AdWebEventLoger(adWebLogModel);
        C58685N1l.LIZ.getClass();
        C58653N0f c58653N0f = C58685N1l.LJIIIZ;
        String cid2 = adWebLogModel.getCid();
        if (cid2 == null) {
            cid2 = "";
        }
        adWebEventLoger.LIZJ(c58653N0f, cid2, adWebLogModel.getLogExtra(), null, new AqS4S0101100_10(this, i, currentTimeMillis, 2));
    }

    @Override // X.NK2
    public final void LIZJ(String url, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        Boolean bool;
        String cid;
        int i;
        long j;
        String cid2;
        o.LJIIIZ(url, "url");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPageStarted ---  is Ad ");
        AdWebLogModel adWebLogModel = this.LIZ;
        if (adWebLogModel != null && (cid2 = adWebLogModel.getCid()) != null) {
            bool = Boolean.valueOf(C78685UuP.LJJJZ(cid2));
        } else {
            bool = null;
        }
        LIZ.append(bool);
        LIZ.append(" currentUrl ");
        LIZ.append(this.LJII);
        LIZ.append(" isFirstPage ");
        LIZ.append(this.LIZIZ);
        LIZ.append(" nextUrl ");
        LIZ.append(url);
        LIZ.append(" preloadStatus ");
        LIZ.append(this.LJIILLIIL);
        X1D.LIZIZ(LIZ);
        this.LJIJ = 1;
        AdWebLogModel adWebLogModel2 = this.LIZ;
        if (adWebLogModel2 == null || (cid = adWebLogModel2.getCid()) == null || cid.length() == 0) {
            return;
        }
        this.LJIILIIL++;
        this.LJIIL.clear();
        if (this.LJIILIIL > 1) {
            i = 0;
        } else {
            i = 1;
        }
        this.LIZIZ = i;
        this.LJIIJJI = false;
        this.LJII = url;
        long currentTimeMillis = System.currentTimeMillis();
        this.LJIIJ = currentTimeMillis;
        if (this.LIZIZ == 1) {
            j = currentTimeMillis - this.LJIIIIZZ;
        } else {
            j = this.LJ;
        }
        this.LJ = j;
        interfaceC88472Yns.invoke(Integer.valueOf(this.LJIILLIIL));
    }

    @Override // X.NK2
    public final void LJ(String str, boolean z) {
        String cid;
        AdWebLogModel adWebLogModel = this.LIZ;
        if (adWebLogModel == null || (cid = adWebLogModel.getCid()) == null || cid.length() == 0) {
            return;
        }
        AdWebEventLoger adWebEventLoger = new AdWebEventLoger(adWebLogModel);
        C58685N1l.LIZ.getClass();
        C58653N0f c58653N0f = C58685N1l.LJJJJZI;
        String cid2 = adWebLogModel.getCid();
        if (cid2 == null) {
            cid2 = "";
        }
        adWebEventLoger.LIZJ(c58653N0f, cid2, adWebLogModel.getLogExtra(), null, new N1R(z, str, this));
    }

    @Override // X.NK2
    public final void LJIIJ(AdWebLogModel adWebLogModel, String currentUrl) {
        IAdLandPagePreloadService LJJI;
        o.LJIIIZ(currentUrl, "currentUrl");
        this.LIZIZ = 1;
        this.LIZJ = 0L;
        this.LIZLLL = 0L;
        this.LJ = 0L;
        this.LJFF = 0L;
        this.LJI = System.currentTimeMillis();
        String str = "";
        this.LJII = "";
        this.LJIIIIZZ = System.currentTimeMillis();
        this.LJIIIZ = System.currentTimeMillis();
        this.LJIIJ = System.currentTimeMillis();
        this.LJIIJJI = false;
        this.LJIIL.clear();
        this.LJIILIIL = 0;
        this.LJIILL = false;
        this.LJIILLIIL = -1;
        this.LIZ = adWebLogModel;
        String cid = adWebLogModel.getCid();
        if (cid == null || cid.length() == 0) {
            return;
        }
        this.LJII = currentUrl;
        this.LJIIIIZZ = System.currentTimeMillis();
        this.LIZJ = System.currentTimeMillis() - adWebLogModel.getInitTime();
        AdWebEventLoger adWebEventLoger = new AdWebEventLoger(adWebLogModel);
        C58685N1l.LIZ.getClass();
        C58653N0f c58653N0f = C58685N1l.LJI;
        String cid2 = adWebLogModel.getCid();
        if (cid2 != null) {
            str = cid2;
        }
        adWebEventLoger.LIZJ(c58653N0f, str, adWebLogModel.getLogExtra(), null, new AqS63S1100000_10(this, currentUrl, 9));
        this.LJIILL = true;
        if (!adWebLogModel.isPreRender()) {
            this.LJIL = false;
        }
        this.LJIJI = false;
        if (this.LJIILLIIL != -1) {
            return;
        }
        if (adWebLogModel.getPreloadWeb() == 7) {
            this.LJIILLIIL = 5;
        } else if (adWebLogModel.isWebUrl() == 1 && ((adWebLogModel.getPreloadWeb() == 4 || adWebLogModel.getPreloadWebSecondPage() == 1) && (LJJI = AdLandPagePreloadServiceImpl.LJJI()) != null)) {
            LJJI.LJI();
            this.LJIILLIIL = NHG.LIZIZ(adWebLogModel.getPreloadChannel(), adWebLogModel.getPreloadScene());
        }
        if (this.LJIILLIIL == -1 && ((Boolean) C52816Ko8.LIZ.getValue()).booleanValue()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("abnormal preload status -1, preload web ");
            LIZ.append(adWebLogModel.getPreloadWeb());
            LIZ.append(", preloadWebSecondPage ");
            LIZ.append(adWebLogModel.getPreloadWebSecondPage());
            LIZ.append(", is web url ");
            LIZ.append(adWebLogModel.isWebUrl());
            LIZ.append(", cid ");
            LIZ.append(adWebLogModel.getCid());
            C78983UzD.LJIILL(X1D.LIZIZ(LIZ));
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("upload preload status, isWeburl ");
        LIZ2.append(adWebLogModel.isWebUrl());
        LIZ2.append(", preloadWeb ");
        LIZ2.append(adWebLogModel.getPreloadWebSecondPage());
        LIZ2.append(", preloadChannel ");
        LIZ2.append(adWebLogModel.getPreloadChannel());
        LIZ2.append(" preloadScene ");
        LIZ2.append(adWebLogModel.getPreloadScene());
        X1D.LIZIZ(LIZ2);
    }

    public final void LJIILLIIL(WebView webView, int i) {
        String cid;
        AdWebLogModel adWebLogModel = this.LIZ;
        if (adWebLogModel == null || (cid = adWebLogModel.getCid()) == null || cid.length() == 0 || this.LJIIJJI) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - adWebLogModel.getInitTime();
        long currentTimeMillis2 = System.currentTimeMillis() - this.LJIIJ;
        AdWebEventLoger adWebEventLoger = new AdWebEventLoger(adWebLogModel);
        C58685N1l.LIZ.getClass();
        C58653N0f c58653N0f = C58685N1l.LJIIJJI;
        String cid2 = adWebLogModel.getCid();
        if (cid2 == null) {
            cid2 = "";
        }
        adWebEventLoger.LIZJ(c58653N0f, cid2, adWebLogModel.getLogExtra(), null, new N1U(this, currentTimeMillis, currentTimeMillis2, i, adWebLogModel));
        if (this.LIZIZ == 1 && i != 1) {
            LJIILL(webView);
            this.LJIL = true;
        }
        N1O.LIZ = adWebLogModel;
        N1O.LIZIZ = this.LIZIZ;
        N1O.LIZJ = 0;
        N1O.LIZLLL = this.LJII;
        N1O.LJ = Integer.valueOf(this.LJIILLIIL);
        if (i != 1 || !adWebLogModel.isPreRender()) {
            this.LJIIJJI = true;
        }
        this.LJIJ = 0;
    }

    public final void LJIIZILJ(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, WebView webView) {
        String cid;
        String str;
        AdWebLogModel adWebLogModel = this.LIZ;
        if (adWebLogModel == null || (cid = adWebLogModel.getCid()) == null || cid.length() == 0 || this.LJIIJJI) {
            return;
        }
        String str2 = this.LJII;
        C36994EfW c36994EfW = this.LJIILJJIL;
        if (c36994EfW != null) {
            str = c36994EfW.LIZ;
        } else {
            str = null;
        }
        if (o.LJ(str2, str) && this.LJIILJJIL != null) {
            this.LJIILJJIL = null;
            this.LJIIJJI = true;
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - adWebLogModel.getInitTime();
        long currentTimeMillis2 = System.currentTimeMillis() - this.LJIIJ;
        if (this.LIZIZ == 1) {
            this.LIZLLL = System.currentTimeMillis() - this.LJIIIIZZ;
        }
        AdWebEventLoger adWebEventLoger = new AdWebEventLoger(adWebLogModel);
        C58685N1l.LIZ.getClass();
        C58653N0f c58653N0f = C58685N1l.LJIIIIZZ;
        String cid2 = adWebLogModel.getCid();
        if (cid2 == null) {
            cid2 = "";
        }
        adWebEventLoger.LIZJ(c58653N0f, cid2, adWebLogModel.getLogExtra(), null, new N1S(this, currentTimeMillis, currentTimeMillis2, adWebLogModel));
        if (this.LIZIZ == 1) {
            LJIILL(webView);
            this.LJIL = true;
        }
        interfaceC65784Pro.invoke();
        N1O.LIZ = adWebLogModel;
        N1O.LIZIZ = this.LIZIZ;
        N1O.LIZJ = 1;
        N1O.LIZLLL = this.LJII;
        N1O.LJ = Integer.valueOf(this.LJIILLIIL);
        this.LJIIJJI = true;
        this.LJIJ = 0;
    }

    @Override // X.NK2
    public final void LJI(String url, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, WebView webView) {
        String cid;
        String cid2;
        o.LJIIIZ(url, "url");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onPageFinished --- is Ad ");
        AdWebLogModel adWebLogModel = this.LIZ;
        Boolean bool = null;
        if (adWebLogModel != null && (cid2 = adWebLogModel.getCid()) != null) {
            bool = Boolean.valueOf(C78685UuP.LJJJZ(cid2));
        }
        LIZ.append(bool);
        LIZ.append(" hadLog ");
        LIZ.append(this.LJIIJJI);
        LIZ.append(" currentUrl ");
        LIZ.append(this.LJII);
        LIZ.append(" isFirstPage ");
        LIZ.append(this.LIZIZ);
        LIZ.append(" nextUrl ");
        LIZ.append(url);
        LIZ.append(" preloadStatus ");
        LIZ.append(this.LJIILLIIL);
        X1D.LIZIZ(LIZ);
        AdWebLogModel adWebLogModel2 = this.LIZ;
        if (adWebLogModel2 == null || (cid = adWebLogModel2.getCid()) == null || cid.length() == 0 || !o.LJ(this.LJII, url)) {
            return;
        }
        LJIIZILJ(interfaceC65784Pro, webView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v33, types: [T, java.lang.String] */
    @Override // X.NK2
    public final void LJIIJJI(WebBackForwardList webBackForwardList, String str, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String cid;
        int i;
        String cid2;
        AdWebLogModel adWebLogModel = this.LIZ;
        if (adWebLogModel == null || (cid = adWebLogModel.getCid()) == null || cid.length() == 0) {
            return;
        }
        C72242sW c72242sW = new C72242sW();
        c72242sW.element = (System.currentTimeMillis() - this.LJIIIIZZ) - this.LJFF;
        C72242sW c72242sW2 = new C72242sW();
        long j = c72242sW.element - this.LIZLLL;
        c72242sW2.element = j;
        if (j < 0) {
            c72242sW2.element = 0L;
        }
        if (c72242sW.element < 0) {
            c72242sW.element = 0L;
        }
        if (!this.LJIL) {
            c72242sW.element = 0L;
            c72242sW2.element = 0L;
        }
        if (webBackForwardList != null) {
            i = webBackForwardList.getCurrentIndex();
        } else {
            i = -1;
        }
        C68322mC c68322mC = new C68322mC();
        String str2 = "";
        c68322mC.element = "";
        C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = "";
        if (webBackForwardList != null) {
            if (i > 0) {
                int i2 = 0;
                do {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append((String) c68322mC.element);
                    LIZ.append(webBackForwardList.getItemAtIndex(i2).getUrl());
                    LIZ.append(',');
                    c68322mC.element = X1D.LIZIZ(LIZ);
                    i2++;
                } while (i2 < i);
            }
            if (i < webBackForwardList.getSize() - 1) {
                int size = webBackForwardList.getSize();
                for (int i3 = i + 1; i3 < size; i3++) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append((String) c68322mC2.element);
                    LIZ2.append(webBackForwardList.getItemAtIndex(i3).getUrl());
                    LIZ2.append(',');
                    c68322mC2.element = X1D.LIZIZ(LIZ2);
                }
            }
        }
        if (!this.LJIIJJI) {
            LJIILLIIL(null, 1);
            interfaceC65784Pro.invoke();
        }
        AdWebLogModel adWebLogModel2 = this.LIZ;
        if (adWebLogModel2 != null && (cid2 = adWebLogModel2.getCid()) != null && cid2.length() != 0 && this.LJIJI) {
            AdWebEventLoger adWebEventLoger = new AdWebEventLoger(adWebLogModel2);
            C58685N1l.LIZ.getClass();
            C58653N0f c58653N0f = C58685N1l.LJJJJI;
            String cid3 = adWebLogModel2.getCid();
            if (cid3 == null) {
                cid3 = "";
            }
            adWebEventLoger.LIZJ(c58653N0f, cid3, adWebLogModel2.getLogExtra(), null, new AqS176S0100000_10(this, 205));
        }
        this.LJIJI = false;
        if (!adWebLogModel.isPreRender()) {
            this.LJIL = false;
        }
        this.LJIJJ = System.currentTimeMillis();
        if (!this.LJIILL) {
            return;
        }
        AdWebEventLoger adWebEventLoger2 = new AdWebEventLoger(adWebLogModel);
        C58685N1l.LIZ.getClass();
        C58653N0f c58653N0f2 = C58685N1l.LJIIL;
        String cid4 = adWebLogModel.getCid();
        if (cid4 != null) {
            str2 = cid4;
        }
        adWebEventLoger2.LIZJ(c58653N0f2, str2, adWebLogModel.getLogExtra(), null, new N1W(this, c72242sW2, c72242sW, webBackForwardList, c68322mC, c68322mC2, str));
    }

    @Override // X.NK2
    public final void LIZLLL(String str, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, WebView webView) {
        AdWebLogModel adWebLogModel;
        String cid;
        if (str != null && str.length() != 0 && (adWebLogModel = this.LIZ) != null && (cid = adWebLogModel.getCid()) != null && cid.length() != 0 && o.LJ(this.LJII, str) && i > 10) {
            if (!this.LJIIL.contains(10)) {
                this.LJIIL.add(10);
                LJIJ(10);
            }
            if (i > 30) {
                if (!this.LJIIL.contains(30)) {
                    this.LJIIL.add(30);
                    LJIJ(30);
                }
                if (i > 50) {
                    if (!this.LJIIL.contains(50)) {
                        this.LJIIL.add(50);
                        LJIJ(50);
                    }
                    if (i > 75) {
                        if (!this.LJIIL.contains(75)) {
                            this.LJIIL.add(75);
                            LJIJ(75);
                        }
                        if (i == 100 && !this.LJIIL.contains(100)) {
                            this.LJIIL.add(100);
                            LJIJ(100);
                            if (C34174Db8.LIZ()) {
                                LJIIZILJ(interfaceC65784Pro, webView);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.NK2
    public final void LJIILIIL(String str, boolean z, boolean z2, boolean z3) {
        String cid;
        C58653N0f c58653N0f;
        AdWebLogModel adWebLogModel = this.LIZ;
        if (adWebLogModel == null || (cid = adWebLogModel.getCid()) == null || cid.length() == 0) {
            return;
        }
        AdWebEventLoger adWebEventLoger = new AdWebEventLoger(adWebLogModel);
        C58685N1l.LIZ.getClass();
        if (z) {
            c58653N0f = C58685N1l.LJJJLIIL;
        } else {
            c58653N0f = C58685N1l.LJJJLL;
        }
        String cid2 = adWebLogModel.getCid();
        if (cid2 == null) {
            cid2 = "";
        }
        adWebEventLoger.LIZJ(c58653N0f, cid2, adWebLogModel.getLogExtra(), null, new N1Q(z2, str, this, z, z3));
    }

    @Override // X.NK2
    public final void LJIILJJIL(String url, String str, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String cid;
        o.LJIIIZ(url, "url");
        AdWebLogModel adWebLogModel = this.LIZ;
        if (adWebLogModel == null || (cid = adWebLogModel.getCid()) == null || cid.length() == 0) {
            return;
        }
        if (!o.LJ(url, this.LJII)) {
            this.LJIIJJI = false;
        }
        if (this.LJIIJJI) {
            return;
        }
        this.LJIILJJIL = new C36994EfW(url);
        long currentTimeMillis = System.currentTimeMillis() - adWebLogModel.getInitTime();
        long currentTimeMillis2 = System.currentTimeMillis() - this.LJIIJ;
        AdWebEventLoger adWebEventLoger = new AdWebEventLoger(adWebLogModel);
        C58685N1l.LIZ.getClass();
        C58653N0f c58653N0f = C58685N1l.LJIIJ;
        String cid2 = adWebLogModel.getCid();
        if (cid2 == null) {
            cid2 = "";
        }
        adWebEventLoger.LIZJ(c58653N0f, cid2, adWebLogModel.getLogExtra(), null, new N1T(this, currentTimeMillis, currentTimeMillis2, str, i, adWebLogModel, interfaceC65784Pro, adWebLogModel));
        this.LJIIJJI = true;
        this.LJIJ = 0;
    }

    @Override // X.NK2
    public final void LJII(String url, boolean z, int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, WebView webView) {
        String cid;
        o.LJIIIZ(url, "url");
        AdWebLogModel adWebLogModel = this.LIZ;
        if (adWebLogModel == null || (cid = adWebLogModel.getCid()) == null || cid.length() == 0 || z) {
            return;
        }
        if (!o.LJ(this.LJII, url) && !this.LJIIJJI) {
            LJIILLIIL(webView, 0);
            interfaceC65784Pro.invoke();
        }
        this.LJIIIZ = System.currentTimeMillis();
        AdWebEventLoger adWebEventLoger = new AdWebEventLoger(adWebLogModel);
        C58685N1l.LIZ.getClass();
        C58653N0f c58653N0f = C58685N1l.LJII;
        String cid2 = adWebLogModel.getCid();
        if (cid2 == null) {
            cid2 = "";
        }
        adWebEventLoger.LIZJ(c58653N0f, cid2, adWebLogModel.getLogExtra(), null, new AqS15S1101000_10(this, url, i, 1));
        this.LJII = url;
    }
}
