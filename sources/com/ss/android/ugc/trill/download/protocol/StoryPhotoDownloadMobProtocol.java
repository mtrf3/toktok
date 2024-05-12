package com.ss.android.ugc.trill.download.protocol;

import X.AbstractC45395Hrj;
import X.C09900aA;
import X.C188727au;
import X.C193657ir;
import X.C198517qh;
import X.C1GE;
import X.C221108m2;
import X.C225308so;
import X.C268513p;
import X.C2NU;
import X.C2S6;
import X.C36922EeM;
import X.C42398GkU;
import X.C44938HkM;
import X.C44952Hka;
import X.C45347Hqx;
import X.C45350Hr0;
import X.C45373HrN;
import X.C45441HsT;
import X.C62411OeV;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72972SkS;
import X.C8BR;
import X.EF7;
import X.FMX;
import X.X1D;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol;
import java.io.File;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class StoryPhotoDownloadMobProtocol extends DownloadMobProtocol<C44952Hka> {
    public Context LJLIL;
    public String LJLJI;
    public String LJLJJI;
    public JSONObject LJLJJL;
    public long LJLJJLL;
    public int LJLLILLLL;
    public Aweme LJLLLL;
    public UrlModel LJLLLLLL;
    public long LJLILLLLZI = -1;
    public String LJLJL = "";
    public String LJLJLJ = "";
    public String LJLJLLL = "";
    public String LJLL = "";
    public int LJLLI = -1;
    public Bundle LJLLJ = new Bundle();
    public String LJLLL = "";
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(C45350Hr0.LJLIL);
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 420));
    public final C65776Prg LJZI = C65352Pkq.LIZ(C44952Hka.class);

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LIZJ() {
        String str;
        LJJI("chain", "cancel");
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", C44938HkM.LJI);
        c188727au.LJIIIZ("download_method", C44938HkM.LJII);
        Aweme aweme = C44938HkM.LJFF;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("group_id", str);
        c188727au.LJIIIZ("detail_tab_name", C44938HkM.LJIILIIL);
        c188727au.LIZLLL(C44938HkM.LIZIZ() ? 1 : 0, "is_downloading");
        FMX.LJIIL("download_cancel", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LIZLLL() {
        LJJI("chain", "fail");
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJ() {
        LJJI("chain", "start");
        Aweme aweme = this.LJLLLL;
        if (aweme != null) {
            C193657ir.LIZJ(aweme, this.LJLJL, this.LJLJLJ, this.LJLJLLL, C2S6.LIZ(this.LJLIL).getFromGroupId(), C2S6.LIZ(this.LJLIL).getNewsId(), this.LJLLJ, Integer.valueOf(this.LJLLILLLL), C2S6.LIZ(this.LJLIL).getInboxLogExtra(), false);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJFF() {
        LJJI("chain", "sccuess");
        if (o.LJ(this.LJLJL, "long_press_download")) {
            C45441HsT.LIZIZ(this.LJLLLL, "mask", this.LJLLL, 0);
        } else {
            C45441HsT.LIZIZ(this.LJLLLL, this.LJLL, this.LJLLL, 0);
        }
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJI() {
        LJJI("download", "cancel");
        LJJ().LIZ(System.currentTimeMillis(), 0L, 0, "", false, this.LJLJL, -1, this.LJLLILLLL);
        RuntimeBehaviorServiceImpl.LJ().LIZ("download_cancel");
    }

    public final C225308so LJJ() {
        return (C225308so) this.LJZ.getValue();
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final C65776Prg LJIILIIL() {
        return this.LJZI;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final boolean LIZ(AbstractC45395Hrj entryData) {
        C44952Hka c44952Hka;
        o.LJIIIZ(entryData, "entryData");
        if (!(entryData instanceof C44952Hka) || (c44952Hka = (C44952Hka) entryData) == null) {
            return false;
        }
        this.LJLIL = c44952Hka.LIZIZ;
        this.LJLLLL = c44952Hka.LJFF;
        this.LJLJL = c44952Hka.LJI;
        this.LJLJLJ = c44952Hka.LJII;
        this.LJLJLLL = c44952Hka.LJIIL;
        this.LJLL = c44952Hka.LJIIJJI;
        this.LJLLI = c44952Hka.LJIIJ;
        this.LJLLILLLL = c44952Hka.LJIILIIL;
        this.LJLLJ = c44952Hka.LJIIIIZZ;
        this.LJLLLLLL = (UrlModel) c44952Hka.LJIIZILJ.getValue();
        return true;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIIJ(String url) {
        o.LJIIIZ(url, "url");
        LJJI("download", "start");
        this.LJLLL = url;
        LJJ().LIZ = url;
        LJJ().LIZJ(System.currentTimeMillis(), this.LJLJL);
        RuntimeBehaviorServiceImpl.LJ().LIZ("download_start");
        this.LJLILLLLZI = System.currentTimeMillis();
        this.LJLJI = "download_time";
        this.LJLJJI = "download";
        this.LJLJJL = null;
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJIIJJI(String filePath, String url) {
        String str;
        boolean z;
        o.LJIIIZ(filePath, "filePath");
        o.LJIIIZ(url, "url");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("success: [");
        LIZ.append(filePath);
        LIZ.append(']');
        LJJI("download", X1D.LIZIZ(LIZ));
        this.LJLLL = url;
        Aweme aweme = this.LJLLLL;
        Integer num = null;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        Aweme aweme2 = this.LJLLLL;
        if (aweme2 != null) {
            num = Integer.valueOf(aweme2.getAwemeType());
        }
        C62411OeV.LIZ(str, num, (C8BR) this.LJLZ.getValue(), C193657ir.LJFF(this.LJLLI));
        if (filePath.length() == 0) {
            return;
        }
        File file = new File(filePath);
        if (LJJ().LIZIZ != 0) {
            this.LJLJJLL = System.currentTimeMillis() - LJJ().LIZIZ;
            file.length();
            RuntimeBehaviorServiceImpl.LJ().LIZ("download_success");
            LJJ().LIZIZ(this.LJLLILLLL, filePath, this.LJLJL);
            long length = file.length();
            Long valueOf = Long.valueOf(this.LJLJJLL);
            UrlModel urlModel = this.LJLLLLLL;
            Aweme aweme3 = this.LJLLLL;
            if (aweme3 != null) {
                z = aweme3.isPrivate();
            } else {
                z = false;
            }
            C45373HrN.LIZ(length, urlModel, null, -1, valueOf, filePath, url, "success", false, z);
            Aweme aweme4 = this.LJLLLL;
            if (aweme4 != null) {
                C45373HrN.LIZIZ(aweme4, this.LJLJL, this.LJLL, "short", C45373HrN.LIZLLL(this.LJLLLLLL), 0, -1);
            }
        }
        MobClick obtain = MobClick.obtain();
        obtain.setEventName(this.LJLJI);
        obtain.setLabelName(this.LJLJJI);
        obtain.setValue(String.valueOf(System.currentTimeMillis() - this.LJLILLLLZI));
        obtain.setJsonObject(this.LJLJJL);
        FMX.onEvent(obtain);
    }

    public final void LJJI(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[Download]-");
        LIZ.append(str);
        C36922EeM.LIZLLL(4, X1D.LIZIZ(LIZ), str2);
    }

    @Override // com.ss.android.ugc.aweme.share.base.download.configuration.protocol.DownloadMobProtocol
    public final void LJII(int i, String errorMsg, String url) {
        boolean z;
        Aweme aweme;
        o.LJIIIZ(errorMsg, "errorMsg");
        o.LJIIIZ(url, "url");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fail: [");
        LIZ.append(i);
        LIZ.append(": ");
        LIZ.append(errorMsg);
        LIZ.append(']');
        LJJI("download", X1D.LIZIZ(LIZ));
        this.LJLLL = url;
        BaseException baseException = new BaseException(i, errorMsg);
        C45347Hqx.LIZ(this.LJLLLL, baseException, url);
        Long valueOf = Long.valueOf(System.currentTimeMillis() - LJJ().LIZIZ);
        Integer valueOf2 = Integer.valueOf(i);
        String errorMessage = baseException.getErrorMessage();
        UrlModel urlModel = this.LJLLLLLL;
        Aweme aweme2 = this.LJLLLL;
        if (aweme2 != null) {
            z = aweme2.isPrivate();
        } else {
            z = false;
        }
        C45373HrN.LIZ(-1L, urlModel, null, valueOf2, valueOf, null, url, errorMessage, false, z);
        EF7.LIZIZ();
        try {
            if (C2NU.LIZ.LIZIZ()) {
                C198517qh c198517qh = new C198517qh();
                c198517qh.LIZ.put("errorCode", Integer.valueOf(i));
                c198517qh.LIZ.put("errorDes", baseException.getErrorMessage());
                JSONObject LJ = c198517qh.LJ();
                if (i == 1052) {
                    try {
                        LJ.putOpt("availableStorageSize", Long.valueOf(C268513p.LIZJ(EF7.LIZIZ())));
                        LJ.putOpt("totalStorageSize", Long.valueOf(C268513p.LJ(EF7.LIZIZ())));
                    } catch (Exception unused) {
                    }
                }
                C09900aA.LJIIJJI("aweme_download_error_rate", 1, LJ);
            }
        } catch (Exception unused2) {
        }
        String LIZLLL = C72972SkS.LIZLLL(i, "");
        if (i > 0 && (aweme = this.LJLLLL) != null && aweme.isPrivate()) {
            LIZLLL = C42398GkU.LIZIZ(LIZLLL, 'P');
        }
        RuntimeBehaviorServiceImpl.LJ().event("download_error", LIZLLL);
        C1GE.LJIILL("aweme_movie_download_log", "", baseException.getErrorMessage(), url);
        LJJ().LIZ(System.currentTimeMillis(), -1L, i, baseException.getErrorMessage(), true, this.LJLJL, 0, this.LJLLILLLL);
    }
}
