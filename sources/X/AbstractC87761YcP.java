package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol;
import kotlin.jvm.internal.o;

/* renamed from: X.YcP, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public abstract class AbstractC87761YcP implements OBL {
    public C87762YcQ LIZ;
    public YXU LIZIZ;
    public InterfaceC87758YcM LIZJ;
    public YXQ LIZLLL;
    public String LJ;
    public DownloadMobProtocol<AbstractC45395Hrj> LJFF;
    public final AbstractC45395Hrj LJI;

    public abstract String LJFF();

    public abstract void LJII();

    public final YXU LJ() {
        YXU yxu = this.LIZIZ;
        if (yxu != null) {
            return yxu;
        }
        o.LJIJI("resultData");
        throw null;
    }

    public final InterfaceC87758YcM LJI() {
        InterfaceC87758YcM interfaceC87758YcM = this.LIZJ;
        if (interfaceC87758YcM != null) {
            return interfaceC87758YcM;
        }
        o.LJIJI("uiProvider");
        throw null;
    }

    public AbstractC87761YcP(AbstractC44957Hkf abstractC44957Hkf) {
        this.LJI = abstractC44957Hkf;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(abstractC44957Hkf.LIZIZ());
        LIZ.append(abstractC44957Hkf.LIZ);
        LIZ.append(abstractC44957Hkf.LIZJ);
        this.LJ = X1D.LIZIZ(LIZ);
    }

    public final void LIZ(String outPutPath) {
        DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol;
        o.LJIIIZ(outPutPath, "outPutPath");
        String LJFF = LJFF();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("cancel!!! [outPutPath: ");
        LIZ.append(outPutPath);
        LIZ.append(']');
        C62737Ojl.LIZIZ(LJFF, X1D.LIZIZ(LIZ));
        YXU yxu = this.LIZIZ;
        if (yxu != null) {
            yxu.LJLILLLLZI = true;
            if (this instanceof C87752YcG) {
                DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol2 = this.LJFF;
                if (downloadMobProtocol2 != null) {
                    downloadMobProtocol2.LJI();
                }
            } else if (this instanceof C87764YcS) {
                DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol3 = this.LJFF;
                if (downloadMobProtocol3 != null) {
                    downloadMobProtocol3.LJIJI();
                }
            } else if ((this instanceof C87763YcR) && (downloadMobProtocol = this.LJFF) != null) {
                downloadMobProtocol.LJIILJJIL();
            }
            if (!TextUtils.equals(this.LJ, outPutPath)) {
                P8N.LIZIZ(this.LJ);
            }
            C87762YcQ c87762YcQ = this.LIZ;
            if (c87762YcQ != null) {
                YXU yxu2 = this.LIZIZ;
                if (yxu2 != null) {
                    InterfaceC87758YcM interfaceC87758YcM = this.LIZJ;
                    if (interfaceC87758YcM != null) {
                        c87762YcQ.LIZJ(outPutPath, yxu2, interfaceC87758YcM, this.LJFF, c87762YcQ);
                        return;
                    } else {
                        o.LJIJI("uiProvider");
                        throw null;
                    }
                }
                o.LJIJI("resultData");
                throw null;
            }
            o.LJIJI("chain");
            throw null;
        }
        o.LJIJI("resultData");
        throw null;
    }

    public final void LIZJ(String outPutPath, String url) {
        DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol;
        o.LJIIIZ(outPutPath, "outPutPath");
        o.LJIIIZ(url, "url");
        String LJFF = LJFF();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("success!!! [outPutPath: ");
        LIZ.append(outPutPath);
        LIZ.append(']');
        C62737Ojl.LIZJ(LJFF, X1D.LIZIZ(LIZ));
        if (this instanceof C87752YcG) {
            DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol2 = this.LJFF;
            if (downloadMobProtocol2 != null) {
                downloadMobProtocol2.LJIIJJI(outPutPath, url);
            }
        } else if (this instanceof C87764YcS) {
            DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol3 = this.LJFF;
            if (downloadMobProtocol3 != null) {
                downloadMobProtocol3.LJIL();
            }
        } else if ((this instanceof C87763YcR) && (downloadMobProtocol = this.LJFF) != null) {
            downloadMobProtocol.LJIJ();
        }
        if (!TextUtils.equals(this.LJ, outPutPath)) {
            P8N.LIZIZ(this.LJ);
        }
        C87762YcQ c87762YcQ = this.LIZ;
        if (c87762YcQ != null) {
            YXU yxu = this.LIZIZ;
            if (yxu != null) {
                InterfaceC87758YcM interfaceC87758YcM = this.LIZJ;
                if (interfaceC87758YcM != null) {
                    c87762YcQ.LIZIZ(outPutPath, yxu, interfaceC87758YcM, this.LJFF, c87762YcQ);
                    return;
                } else {
                    o.LJIJI("uiProvider");
                    throw null;
                }
            }
            o.LJIJI("resultData");
            throw null;
        }
        o.LJIJI("chain");
        throw null;
    }

    public final void LIZIZ(int i, String str, String str2, String str3) {
        DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol;
        HH1.LIZ(str, "outPutPath", str2, "errorMsg", str3, "url");
        String LJFF = LJFF();
        StringBuilder LIZ = C06830Op.LIZ("failure!!! [", i, " : ", str2, "] [outPutPath: ");
        LIZ.append(str);
        LIZ.append(']');
        C62737Ojl.LIZIZ(LJFF, X1D.LIZIZ(LIZ));
        YXU yxu = this.LIZIZ;
        if (yxu != null) {
            yxu.LJLIL = false;
            if (this instanceof C87752YcG) {
                DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol2 = this.LJFF;
                if (downloadMobProtocol2 != null) {
                    downloadMobProtocol2.LJII(i, str2, str3);
                }
            } else if (this instanceof C87764YcS) {
                DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol3 = this.LJFF;
                if (downloadMobProtocol3 != null) {
                    downloadMobProtocol3.LJIJJ(i, this.LJ, str);
                }
            } else if ((this instanceof C87763YcR) && (downloadMobProtocol = this.LJFF) != null) {
                downloadMobProtocol.LJIILLIIL(i, str);
            }
            if (!TextUtils.equals(this.LJ, str)) {
                P8N.LIZIZ(this.LJ);
            }
            C87762YcQ c87762YcQ = this.LIZ;
            if (c87762YcQ != null) {
                YXU yxu2 = this.LIZIZ;
                if (yxu2 != null) {
                    InterfaceC87758YcM interfaceC87758YcM = this.LIZJ;
                    if (interfaceC87758YcM != null) {
                        c87762YcQ.LIZJ(str, yxu2, interfaceC87758YcM, this.LJFF, c87762YcQ);
                        return;
                    } else {
                        o.LJIJI("uiProvider");
                        throw null;
                    }
                }
                o.LJIJI("resultData");
                throw null;
            }
            o.LJIJI("chain");
            throw null;
        }
        o.LJIJI("resultData");
        throw null;
    }

    public final void LIZLLL(String inputPath, YXU resultData, InterfaceC87758YcM uiProvider, YXQ loadingProgressWrapper, DownloadMobProtocol<AbstractC45395Hrj> downloadMobProtocol, C87762YcQ chain) {
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(resultData, "resultData");
        o.LJIIIZ(uiProvider, "uiProvider");
        o.LJIIIZ(loadingProgressWrapper, "loadingProgressWrapper");
        o.LJIIIZ(chain, "chain");
        String LJFF = LJFF();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("handle!!! [inputPath: ");
        LIZ.append(inputPath);
        LIZ.append(']');
        C62737Ojl.LIZJ(LJFF, X1D.LIZIZ(LIZ));
        this.LJ = inputPath;
        this.LIZIZ = resultData;
        this.LIZJ = uiProvider;
        this.LIZLLL = loadingProgressWrapper;
        this.LJFF = downloadMobProtocol;
        this.LIZ = chain;
        LJII();
    }
}
