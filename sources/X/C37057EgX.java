package X;

import Y.ARunnableS1S1101000_6;
import android.os.Handler;
import android.webkit.WebView;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.EgX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37057EgX extends AbstractC37058EgY {
    public final WebView LIZ;
    public String LIZIZ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public InterfaceC37063Egd LJI;
    public boolean LIZJ = true;
    public final Handler LJII = new Handler(C16880lQ.LLJJJJ());
    public final C37062Egc LJIIIIZZ = new C37062Egc(this);

    public final void LJII() {
        this.LIZJ = true;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
    }

    @Override // X.InterfaceC37077Egr
    public final boolean LIZ() {
        if (!AbstractC37058EgY.LIZLLL(this.LIZ, false)) {
            return false;
        }
        this.LIZ.goBackOrForward(-2);
        this.LJFF = null;
        return true;
    }

    @Override // X.InterfaceC37077Egr
    public final boolean canGoBack() {
        return AbstractC37058EgY.LIZLLL(this.LIZ, true);
    }

    @Override // X.InterfaceC37077Egr
    public final void LIZIZ(String str) {
        int i;
        C1JX.LJIIIIZZ("handleOverrideUrlLoading :", str);
        try {
            LJIIIIZZ(str);
            if (!C37054EgU.LIZIZ(this.LJFF, str)) {
                if (C37054EgU.LIZIZ(this.LIZLLL, str)) {
                    i = 1;
                } else if (this.LIZJ) {
                    this.LIZJ = false;
                    i = 2;
                } else {
                    i = 3;
                }
                LJFF(i, str, false);
            }
        } catch (Exception unused) {
        }
    }

    @Override // X.InterfaceC37077Egr
    public final boolean LIZJ(String str) {
        int i;
        try {
            LJIIIIZZ(str);
            if (!C37054EgU.LIZIZ(this.LJFF, str)) {
                if (C37054EgU.LIZIZ(this.LIZLLL, str)) {
                    i = 1;
                } else if (this.LIZJ) {
                    this.LIZJ = false;
                    i = 2;
                } else {
                    i = 3;
                }
                return LJFF(i, str, true);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final String LJI(String str) {
        this.LIZLLL = str;
        this.LJFF = str;
        if (AbstractC37058EgY.LJ(str)) {
            str = C37054EgU.LIZ(-1, str, this.LIZIZ);
            C1JX.LJIIIIZZ("handleLoadUrl : first force check :", str);
        }
        this.LIZJ = true;
        return str;
    }

    public final void LJIIIIZZ(String str) {
        if (C37054EgU.LIZIZ(this.LJFF, str) && C37054EgU.LIZIZ(this.LIZLLL, str)) {
            C37021Efx c37021Efx = new C37021Efx();
            c37021Efx.LIZJ = false;
            c37021Efx.LIZIZ = 0;
            ((ConcurrentHashMap) C37056EgW.LIZ().LIZ).put(str, new C37061Egb(c37021Efx));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleLoadUrl save first check in cache :");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
        }
        if (C37054EgU.LIZLLL(str)) {
            this.LJ = str;
        }
    }

    public C37057EgX(WebView webView, String str) {
        this.LIZ = webView;
        this.LIZIZ = str;
    }

    public final boolean LJFF(int i, String str, boolean z) {
        C37021Efx c37021Efx;
        C37021Efx LIZIZ = C37056EgW.LIZ().LIZIZ(str);
        if (LIZIZ == null) {
            if (AbstractC37058EgY.LJ(str)) {
                if (z) {
                    String str2 = this.LIZIZ;
                    C37059EgZ c37059EgZ = new C37059EgZ();
                    c37059EgZ.LIZ = C73040SlY.LJLJJI.LIZ;
                    c37059EgZ.LIZJ = str;
                    c37059EgZ.LIZIZ = str2;
                    c37059EgZ.LJFF = i;
                    c37059EgZ.LIZLLL = true;
                    C37060Ega LIZ = c37059EgZ.LIZ();
                    C36849EdB.LIZ().getClass();
                    if (C36849EdB.LIZIZ == null) {
                        C36849EdB.LIZIZ = PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("CheckUrlSecManager"));
                    }
                    try {
                        c37021Efx = (C37021Efx) C36849EdB.LIZIZ.submit(new CallableC36848EdA(LIZ)).get(C73040SlY.LJLJJI.LJ, TimeUnit.MILLISECONDS);
                        InterfaceC37063Egd interfaceC37063Egd = this.LJI;
                        if (interfaceC37063Egd != null && c37021Efx != null) {
                            c37021Efx.LJ = str;
                            interfaceC37063Egd.LIZ(c37021Efx);
                        }
                    } catch (Exception unused) {
                    }
                    if (c37021Efx.LIZ && c37021Efx.LIZJ) {
                        C16880lQ.LLZZ(this.LIZ, C37054EgU.LIZ(c37021Efx.LIZIZ, str, this.LIZIZ));
                        this.LJFF = str;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("onSuccess url : ");
                        LIZ2.append(str);
                        LIZ2.append(", response : ");
                        LIZ2.append(c37021Efx);
                        X1D.LIZIZ(LIZ2);
                        return true;
                    }
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("onFail url : ");
                    LIZ3.append(str);
                    X1D.LIZIZ(LIZ3);
                    return false;
                }
                this.LJII.postDelayed(new ARunnableS1S1101000_6(this, str, i, 1), 100L);
                return false;
            }
        } else {
            InterfaceC37063Egd interfaceC37063Egd2 = this.LJI;
            if (interfaceC37063Egd2 != null) {
                LIZIZ.LJ = str;
                interfaceC37063Egd2.LIZ(LIZIZ);
            }
            if (LIZIZ.LIZJ) {
                C1JX.LJIIIIZZ("checkUrlSafely : jump seclink page directly : ", str);
                C16880lQ.LLZZ(this.LIZ, C37054EgU.LIZ(-1, str, this.LIZIZ));
                return true;
            }
            C1JX.LJIIIIZZ("checkUrlSafely : safe url : ", str);
        }
        return false;
    }
}
