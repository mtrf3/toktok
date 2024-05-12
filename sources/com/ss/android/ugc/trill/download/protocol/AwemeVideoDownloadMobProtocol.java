package com.ss.android.ugc.trill.download.protocol;

import X.AbstractC45355Hr5;
import X.AbstractC45395Hrj;
import X.C09900aA;
import X.C10K;
import X.C193657ir;
import X.C198517qh;
import X.C1GE;
import X.C221108m2;
import X.C268513p;
import X.C2NU;
import X.C2S6;
import X.C36922EeM;
import X.C42398GkU;
import X.C44496HdE;
import X.C44938HkM;
import X.C44956Hke;
import X.C45339Hqp;
import X.C45347Hqx;
import X.C45349Hqz;
import X.C45373HrN;
import X.C45403Hrr;
import X.C45441HsT;
import X.C55247LmF;
import X.C62411OeV;
import X.C62822Ol8;
import X.C62841OlR;
import X.C62842OlS;
import X.C62844OlU;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72972SkS;
import X.C8BR;
import X.CallableC45371HrL;
import X.EF7;
import X.FMX;
import X.InterfaceC45358Hr8;
import X.V16;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import com.bytedance.provider.impl.GScope;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.ACLCommonShare;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol;
import com.ss.android.ugc.aweme.share.downloadv2.event.newet.DownloadCancelEvent;
import com.ss.android.ugc.aweme.share.downloadv2.event.newet.DownloadEvent;
import com.ss.android.ugc.aweme.share.downloadv2.event.newet.DownloadFinishEvent;
import java.io.File;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class AwemeVideoDownloadMobProtocol extends DownloadMobProtocol<C44956Hke> {
    public Context LJLIL;
    public String LJLJI;
    public String LJLJJI;
    public JSONObject LJLJJL;
    public long LJLJJLL;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public int LJLLLL;
    public ACLCommonShare LJLZ;
    public long LJZI;
    public Integer LJZL;
    public String LL;
    public Aweme LLF;
    public C45339Hqp LLFF;
    public long LJLILLLLZI = -1;
    public String LJLL = "";
    public String LJLLI = "";
    public String LJLLILLLL = "";
    public String LJLLJ = "";
    public int LJLLL = -1;
    public Bundle LJLLLLLL = new Bundle();
    public String LJZ = "";
    public int LLD = 100;
    public final C62822Ol8 LLFFF = C221108m2.LIZIZ(C45349Hqz.LJLIL);
    public final C62822Ol8 LLFII = C221108m2.LIZIZ(new AqS157S0100000_7(this, 419));
    public final C62822Ol8 LLFZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 418));
    public final C65776Prg LLI = C65352Pkq.LIZ(C44956Hke.class);

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LIZJ() {
        LJJIFFI("chain", "cancel");
        if (C45403Hrr.LIZ()) {
            V16.LJJLIIIIJ(DownloadCancelEvent.class);
            return;
        }
        String str = this.LJLL;
        String str2 = this.LJLLI;
        Aweme aweme = this.LLF;
        if (aweme != null) {
            String aid = aweme.getAid();
            boolean LIZIZ = C44938HkM.LIZIZ();
            C193657ir.LJ(LIZIZ ? 1 : 0, this.LJLLLLLL, str, str2, aid);
            return;
        }
        o.LJIJI("aweme");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LIZLLL() {
        LJJIFFI("chain", "fail");
        GScope gScope = GScope.LJLIL;
        long currentTimeMillis = System.currentTimeMillis() - this.LJZI;
        int i = this.LLD;
        V16.LJJZ(gScope, Long.valueOf(currentTimeMillis), 0, this.LJZL, this.LL, Integer.valueOf(i));
        V16.LJJLIIIIJ(DownloadFinishEvent.class);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJ() {
        LJJIFFI("chain", "start");
        this.LJZI = System.currentTimeMillis();
        if (C45403Hrr.LIZ()) {
            V16.LJJLIIIIJ(DownloadEvent.class);
            return;
        }
        Aweme aweme = this.LLF;
        if (aweme != null) {
            C193657ir.LIZJ(aweme, this.LJLL, this.LJLLI, this.LJLLILLLL, C2S6.LIZ(this.LJLIL).getFromGroupId(), C2S6.LIZ(this.LJLIL).getNewsId(), this.LJLLLLLL, Integer.valueOf(this.LJLLLL), C2S6.LIZ(this.LJLIL).getInboxLogExtra(), this.LJLJLLL);
        } else {
            o.LJIJI("aweme");
            throw null;
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJFF() {
        LJJIFFI("chain", "sccuess");
        if (o.LJ(this.LJLL, "long_press_download")) {
            Aweme aweme = this.LLF;
            if (aweme != null) {
                C45441HsT.LIZIZ(aweme, "mask", this.LJZ, 0);
            } else {
                o.LJIJI("aweme");
                throw null;
            }
        } else {
            Aweme aweme2 = this.LLF;
            if (aweme2 != null) {
                C45441HsT.LIZIZ(aweme2, this.LJLLJ, this.LJZ, 0);
            } else {
                o.LJIJI("aweme");
                throw null;
            }
        }
        V16.LJJZ(GScope.LJLIL, Long.valueOf(System.currentTimeMillis() - this.LJZI), 1, null, null, 0);
        V16.LJJLIIIIJ(DownloadFinishEvent.class);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJI() {
        LJJIFFI("download", "cancel");
        LJJI().LIZ(System.currentTimeMillis(), 0L, 0, "", false, this.LJLL, -1, this.LJLLLL);
        RuntimeBehaviorServiceImpl.LJ().LIZ("download_cancel");
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIILJJIL() {
        LJJIFFI("mute_audio", "cancel");
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIIZILJ() {
        LJJIFFI("mute_audio", "start");
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIJ() {
        LJJIFFI("mute_audio", "success");
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIJI() {
        LJJIFFI("water_mark", "cancel");
        RuntimeBehaviorServiceImpl.LJ().LIZ("water_mark_cancel");
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIJJLI() {
        int i;
        LJJIFFI("water_mark", "start");
        GScope gScope = GScope.LJLIL;
        C45339Hqp c45339Hqp = this.LLFF;
        if (c45339Hqp != null) {
            String str = c45339Hqp.LIZIZ;
            if (str == null) {
                str = "";
            }
            C55247LmF.LIZIZ(gScope, new C62844OlU(str, this.LJLJL, this.LJLJLJ), C62844OlU.class, "Download");
            V16.LJL(gScope, Long.valueOf(System.currentTimeMillis()), null, null, 6);
            ((InterfaceC45358Hr8) this.LLFZ.getValue()).LIZIZ();
            RuntimeBehaviorServiceImpl.LJ().LIZ("water_mark_start");
            this.LJLILLLLZI = System.currentTimeMillis();
            this.LJLJI = "download_time";
            this.LJLJJI = "add_watermark";
            this.LJLJJL = null;
            if (this.LJLJLJ && C44496HdE.LIZ()) {
                i = 2;
            } else {
                i = 1;
            }
            Aweme aweme = this.LLF;
            if (aweme == null) {
                o.LJIJI("aweme");
                throw null;
            }
            C45373HrN.LIZIZ(aweme, this.LJLL, this.LJLLJ, "short", null, i, -1);
            return;
        }
        o.LJIJI("downloadInfoHelper");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIL() {
        LJJIFFI("water_mark", "success");
        V16.LJL(GScope.LJLIL, null, Long.valueOf(System.currentTimeMillis()), 1, 1);
        ((InterfaceC45358Hr8) this.LLFZ.getValue()).LIZ(1);
        RuntimeBehaviorServiceImpl.LJ().LIZ("water_mark_success");
        LJJ();
    }

    public final AbstractC45355Hr5 LJJI() {
        return (AbstractC45355Hr5) this.LLFII.getValue();
    }

    public final void LJJ() {
        MobClick obtain = MobClick.obtain();
        obtain.setEventName(this.LJLJI);
        obtain.setLabelName(this.LJLJJI);
        obtain.setValue(String.valueOf(System.currentTimeMillis() - this.LJLILLLLZI));
        obtain.setJsonObject(this.LJLJJL);
        FMX.onEvent(obtain);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final C65776Prg LJIILIIL() {
        return this.LLI;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final boolean LIZ(AbstractC45395Hrj entryData) {
        C44956Hke c44956Hke;
        o.LJIIIZ(entryData, "entryData");
        if (!(entryData instanceof C44956Hke) || (c44956Hke = (C44956Hke) entryData) == null) {
            return false;
        }
        Context context = c44956Hke.LIZIZ;
        this.LJLIL = context;
        this.LLF = c44956Hke.LJFF;
        this.LJLZ = c44956Hke.LJIILIIL;
        this.LLFF = c44956Hke.LJIILL;
        this.LJLJL = c44956Hke.LJIIZILJ;
        this.LJLJLJ = c44956Hke.LJIILLIIL;
        this.LJLJLLL = c44956Hke.LJIILJJIL;
        this.LJLL = c44956Hke.LJI;
        this.LJLLI = c44956Hke.LJII;
        this.LJLLILLLL = c44956Hke.LJIIJJI;
        this.LJLLJ = c44956Hke.LJIIJ;
        this.LJLLL = c44956Hke.LJIIIZ;
        this.LJLLLL = c44956Hke.LJIIL;
        this.LJLLLLLL = c44956Hke.LJIIIIZZ;
        GScope gScope = GScope.LJLIL;
        String fromGroupId = C2S6.LIZ(context).getFromGroupId();
        String str = "";
        if (fromGroupId == null) {
            fromGroupId = "";
        }
        String newsId = C2S6.LIZ(this.LJLIL).getNewsId();
        if (newsId != null) {
            str = newsId;
        }
        C55247LmF.LIZIZ(gScope, new C62842OlS(fromGroupId, str, C2S6.LIZ(this.LJLIL).getInboxLogExtra(), this.LJLLILLLL, this.LJLJLLL), C62842OlS.class, "Download");
        return true;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIIJ(String url) {
        o.LJIIIZ(url, "url");
        LJJIFFI("download", "start");
        GScope gScope = GScope.LJLIL;
        ACLCommonShare aCLCommonShare = this.LJLZ;
        int i = 0;
        if (aCLCommonShare != null && aCLCommonShare.getTranscode() == 3) {
            i = 1;
        }
        C55247LmF.LIZIZ(gScope, new C62841OlR(i, url), C62841OlR.class, "Download");
        this.LJZ = url;
        LJJI().LIZ = url;
        LJJI().LIZJ(System.currentTimeMillis(), this.LJLL);
        RuntimeBehaviorServiceImpl.LJ().LIZ("download_start");
        this.LJLILLLLZI = System.currentTimeMillis();
        this.LJLJI = "download_time";
        this.LJLJJI = "download";
        this.LJLJJL = null;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIIIIZZ(int i, String str) {
        LJJI().LIZ(System.currentTimeMillis(), -1L, i, str, false, this.LJLL, 0, this.LJLLLL);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIIJJI(String filePath, String url) {
        Boolean bool;
        o.LJIIIZ(filePath, "filePath");
        o.LJIIIZ(url, "url");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("success: [");
        LIZ.append(filePath);
        LIZ.append(']');
        LJJIFFI("download", X1D.LIZIZ(LIZ));
        this.LJZ = url;
        LJJI().LIZ = url;
        Aweme aweme = this.LLF;
        if (aweme != null) {
            String aid = aweme.getAid();
            Aweme aweme2 = this.LLF;
            if (aweme2 != null) {
                C62411OeV.LIZ(aid, Integer.valueOf(aweme2.getAwemeType()), (C8BR) this.LLFFF.getValue(), C193657ir.LJFF(this.LJLLL));
                if (filePath.length() == 0) {
                    return;
                }
                File file = new File(filePath);
                if (LJJI().LIZIZ != 0) {
                    C45339Hqp c45339Hqp = this.LLFF;
                    if (c45339Hqp != null) {
                        UrlModel urlModel = c45339Hqp.LIZ;
                        this.LJLJJLL = System.currentTimeMillis() - LJJI().LIZIZ;
                        file.length();
                        RuntimeBehaviorServiceImpl.LJ().LIZ("download_success");
                        LJJI().LIZIZ(this.LJLLLL, filePath, this.LJLL);
                        if (!this.LJLJL && !this.LJLJLJ) {
                            long length = file.length();
                            Long valueOf = Long.valueOf(this.LJLJJLL);
                            ACLCommonShare aCLCommonShare = this.LJLZ;
                            if (aCLCommonShare != null) {
                                bool = Boolean.valueOf(aCLCommonShare.getMute());
                            } else {
                                bool = null;
                            }
                            Aweme aweme3 = this.LLF;
                            if (aweme3 != null) {
                                C45373HrN.LIZ(length, urlModel, bool, -1, valueOf, filePath, url, "success", false, aweme3.isPrivate());
                                Aweme aweme4 = this.LLF;
                                if (aweme4 == null) {
                                    o.LJIJI("aweme");
                                    throw null;
                                }
                                C45373HrN.LIZIZ(aweme4, this.LJLL, this.LJLLJ, "short", C45373HrN.LIZLLL(urlModel), 0, -1);
                            } else {
                                o.LJIJI("aweme");
                                throw null;
                            }
                        }
                    } else {
                        o.LJIJI("downloadInfoHelper");
                        throw null;
                    }
                }
                LJJ();
                return;
            }
            o.LJIJI("aweme");
            throw null;
        }
        o.LJIJI("aweme");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIILLIIL(int i, String filePath) {
        boolean z;
        o.LJIIIZ(filePath, "filePath");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fail [");
        LIZ.append(i);
        LIZ.append(']');
        LJJIFFI("mute_audio", X1D.LIZIZ(LIZ));
        this.LLD = 7;
        this.LJZL = Integer.valueOf(i);
        this.LL = "mute_audio";
        Long valueOf = Long.valueOf(this.LJLJJLL);
        String str = this.LJZ;
        if (this.LJLJL || this.LJLJLJ) {
            z = true;
        } else {
            z = false;
        }
        C10K.LIZJ(new CallableC45371HrL(Integer.valueOf(i), valueOf, filePath, str, z));
    }

    public final void LJJIFFI(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Download]-Video-");
        LIZ.append(str);
        C36922EeM.LIZLLL(4, X1D.LIZIZ(LIZ), str2);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJII(int i, String errorMsg, String url) {
        boolean z;
        Boolean bool;
        o.LJIIIZ(errorMsg, "errorMsg");
        o.LJIIIZ(url, "url");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fail: [");
        LIZ.append(i);
        LIZ.append(": ");
        LIZ.append(errorMsg);
        LIZ.append(']');
        LJJIFFI("download", X1D.LIZIZ(LIZ));
        this.LJZ = url;
        LJJI().LIZ = url;
        BaseException baseException = new BaseException(i, errorMsg);
        Aweme aweme = this.LLF;
        if (aweme != null) {
            C45347Hqx.LIZ(aweme, baseException, url);
            Long valueOf = Long.valueOf(System.currentTimeMillis() - LJJI().LIZIZ);
            boolean z2 = false;
            if (this.LJLJL || this.LJLJLJ) {
                z = true;
            } else {
                z = false;
            }
            Integer valueOf2 = Integer.valueOf(i);
            String errorMessage = baseException.getErrorMessage();
            ACLCommonShare aCLCommonShare = this.LJLZ;
            if (aCLCommonShare != null) {
                bool = Boolean.valueOf(aCLCommonShare.getMute());
            } else {
                bool = null;
            }
            C45339Hqp c45339Hqp = this.LLFF;
            if (c45339Hqp != null) {
                UrlModel urlModel = c45339Hqp.LIZ;
                Aweme aweme2 = this.LLF;
                if (aweme2 != null) {
                    C45373HrN.LIZ(-1L, urlModel, bool, valueOf2, valueOf, null, url, errorMessage, z, aweme2.isPrivate());
                    EF7.LIZIZ();
                    try {
                        z2 = C2NU.LIZ.LIZIZ();
                    } catch (Exception unused) {
                    }
                    if (z2) {
                        C198517qh c198517qh = new C198517qh();
                        c198517qh.LIZ.put("errorCode", Integer.valueOf(i));
                        c198517qh.LIZ.put("errorDes", baseException.getErrorMessage());
                        JSONObject LJ = c198517qh.LJ();
                        if (i == 1052) {
                            try {
                                LJ.putOpt("availableStorageSize", Long.valueOf(C268513p.LIZJ(EF7.LIZIZ())));
                                LJ.putOpt("totalStorageSize", Long.valueOf(C268513p.LJ(EF7.LIZIZ())));
                            } catch (Exception unused2) {
                            }
                        }
                        C09900aA.LJIIJJI("aweme_download_error_rate", 1, LJ);
                    }
                    String LIZLLL = C72972SkS.LIZLLL(i, "");
                    if (i > 0) {
                        Aweme aweme3 = this.LLF;
                        if (aweme3 != null) {
                            if (aweme3.isPrivate()) {
                                LIZLLL = C42398GkU.LIZIZ(LIZLLL, 'P');
                            }
                        } else {
                            o.LJIJI("aweme");
                            throw null;
                        }
                    }
                    RuntimeBehaviorServiceImpl.LJ().event("download_error", LIZLLL);
                    C1GE.LJIILL("aweme_movie_download_log", "", baseException.getErrorMessage(), url);
                    LJJI().LIZ(System.currentTimeMillis(), -1L, i, baseException.getErrorMessage(), true, this.LJLL, 0, this.LJLLLL);
                    this.LLD = 1;
                    this.LJZL = Integer.valueOf(i);
                    this.LL = errorMsg;
                    return;
                }
                o.LJIJI("aweme");
                throw null;
            }
            o.LJIJI("downloadInfoHelper");
            throw null;
        }
        o.LJIJI("aweme");
        throw null;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIJJ(int i, String inputPath, String outPutPath) {
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outPutPath, "outPutPath");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fail [");
        LIZ.append(i);
        LIZ.append(']');
        LJJIFFI("water_mark", X1D.LIZIZ(LIZ));
        V16.LJL(GScope.LJLIL, null, Long.valueOf(System.currentTimeMillis()), 0, 1);
        ((InterfaceC45358Hr8) this.LLFZ.getValue()).LIZ(0);
        RuntimeBehaviorServiceImpl.LJ().LIZ("water_mark_error");
        Aweme aweme = this.LLF;
        if (aweme != null) {
            C45347Hqx.LIZJ(inputPath, aweme, outPutPath);
            this.LLD = 2;
            this.LJZL = Integer.valueOf(i);
            this.LL = "water_mark";
            return;
        }
        o.LJIJI("aweme");
        throw null;
    }
}
