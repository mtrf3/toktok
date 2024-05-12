package com.ss.android.ugc.aweme.video;

import X.C0RN;
import X.C10K;
import X.C16880lQ;
import X.C19U;
import X.C36093EEn;
import X.C36922EeM;
import X.C38891fp;
import X.C40328FsC;
import X.C61651OHn;
import X.C88074YhS;
import X.EE1;
import X.EE4;
import X.EF7;
import X.EFK;
import X.EI0;
import X.EKU;
import X.EnumC36092EEm;
import X.EnumC36103EEx;
import X.F7W;
import X.F9J;
import X.FIP;
import X.FIR;
import X.InterfaceC36076EDw;
import X.InterfaceC36167EHj;
import X.X1D;
import Y.ACallableS78S0101000_6;
import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.android.play.core.appupdate.u;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl;
import com.ss.android.ugc.aweme.simkit.model.bitrateselect.RateSettingsResponse;
import com.ss.android.ugc.aweme.video.api.BitRateSettingsApi;
import com.ss.android.ugc.aweme.video.bitrate.RateSettingCombineModel;
import defpackage.e1;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class VideoBitRateABManager implements F7W, InterfaceC36167EHj {
    public static final VideoBitRateABManager LJFF = new VideoBitRateABManager();
    public static final HashSet<String> LJI;
    public RateSettingsResponse LIZ;
    public volatile boolean LIZIZ;
    public Boolean LIZJ;
    public boolean LIZLLL;
    public volatile RateSettingsResponse LJ;

    /* loaded from: classes7.dex */
    public class RequestConfigTask implements EE1, InterfaceC36076EDw {
        @Override // X.InterfaceC36076EDw
        public final /* synthetic */ String[] deps() {
            return null;
        }

        @Override // X.EEY
        public final String key() {
            return "VideoBitRateABManager$RequestConfigTask";
        }

        @Override // X.EEY
        public final /* synthetic */ boolean meetTrigger() {
            return true;
        }

        @Override // X.EEY
        public final /* synthetic */ String prefix() {
            return "task_";
        }

        @Override // X.InterfaceC36076EDw
        public final /* synthetic */ int priority() {
            return 1;
        }

        @Override // X.EE1
        public final /* synthetic */ boolean serialExecute() {
            return false;
        }

        @Override // X.EEY
        public final /* synthetic */ int targetProcess() {
            return C0RN.LIZ();
        }

        @Override // X.EEY
        public final /* synthetic */ List triggerOtherLegoComponents() {
            return null;
        }

        @Override // X.EEY
        public final /* synthetic */ EnumC36103EEx triggerType() {
            return C0RN.LIZIZ(this);
        }

        @Override // X.InterfaceC36076EDw
        public final EE4 threadType() {
            if (((Boolean) C88074YhS.LJ.getValue()).booleanValue()) {
                return EE4.IO;
            }
            return EE4.CPU;
        }

        @Override // X.EEY
        public final EnumC36092EEm scenesType() {
            return EnumC36092EEm.DEFAULT;
        }

        @Override // X.EE1
        public final EFK type() {
            return EFK.BOOT_FINISH;
        }

        public RequestConfigTask() {
        }

        @Override // X.EEY
        public final void run(Context context) {
            C36922EeM.LJ("RequestConfigTask");
            synchronized (VideoBitRateABManager.this) {
                if (VideoBitRateABManager.this.LIZLLL) {
                    return;
                }
                try {
                    VideoBitRateABManager.this.LIZLLL(BitRateSettingsApi.LIZ());
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
    }

    public final synchronized void LJFF() {
        String lowerCase;
        InputStream inputStream;
        if (this.LJ != null) {
            return;
        }
        InputStream inputStream2 = null;
        String str = null;
        String string = F9J.LIZIZ(EF7.LIZIZ(), 0, "bitrate_manager_sp_rate_setting").getString("bitrate_manager_sp_rate_setting", null);
        if (string == null) {
            if (!LJI.contains(C61651OHn.LIZ())) {
                lowerCase = "us";
            } else {
                lowerCase = C61651OHn.LIZ().toLowerCase(Locale.US);
            }
            Context LIZIZ = EF7.LIZIZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("rate_settings/");
            LIZ.append(lowerCase);
            LIZ.append(".json");
            try {
                inputStream = LIZIZ.getAssets().open(X1D.LIZIZ(LIZ));
                try {
                    try {
                        byte[] bArr = new byte[inputStream.available()];
                        inputStream.read(bArr);
                        String str2 = new String(bArr, "UTF-8");
                        C38891fp.LJIIJJI(inputStream);
                        str = str2;
                    } catch (IOException e) {
                        e = e;
                        C16880lQ.LLLLIIL(e);
                        C38891fp.LJIIJJI(inputStream);
                        string = str;
                        this.LJ = (RateSettingsResponse) GsonProtectorUtils.fromJson(new Gson(), string, new EKU().getType());
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    C38891fp.LJIIJJI(inputStream2);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
                C38891fp.LJIIJJI(inputStream2);
                throw th;
            }
            string = str;
        }
        this.LJ = (RateSettingsResponse) GsonProtectorUtils.fromJson(new Gson(), string, new EKU().getType());
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        LJI = hashSet;
        C19U.LJ(hashSet, "DE", "FR", "GB", "BR");
        C19U.LJ(hashSet, "RU", "AE", "SA", "IT");
        C19U.LJ(hashSet, "MX", "ES", "TR", "PL");
        C19U.LJ(hashSet, "BD", "IN", "ID", "JP");
        C19U.LJ(hashSet, "MY", "PH", "TH", "VN");
        hashSet.add("CN");
    }

    public final void LJII() {
        EI0 LIZJ = C40328FsC.LIZJ(C36093EEn.LIZ);
        LIZJ.LIZIZ(new RequestConfigTask(), true);
        LIZJ.LIZJ();
    }

    public VideoBitRateABManager() {
        FIP.LIZIZ.LIZ.put(2, new FIR(System.currentTimeMillis(), this));
        if (u.LJIJJ()) {
            C10K.LIZJ(new ACallableS78S0101000_6(1, this, 9));
            ColdLaunchRequestCombinerImpl.LIZJ().LIZ(this);
        }
    }

    @Override // X.F7W, com.ss.android.ugc.aweme.setting.IAbTestManager
    public final void LIZ() {
        boolean LJIJJ = u.LJIJJ();
        Boolean bool = this.LIZJ;
        if (bool != null && LJIJJ == bool.booleanValue()) {
            if (LJIJJ && !this.LIZLLL) {
                LJI();
                return;
            }
            return;
        }
        this.LIZJ = Boolean.valueOf(LJIJJ);
        if (!LJIJJ) {
            return;
        }
        LJI();
    }

    public final boolean LJ() {
        if (u.LJIJJ() && this.LIZIZ) {
            return true;
        }
        return false;
    }

    public final void LJI() {
        if (ColdLaunchRequestCombinerImpl.LIZJ().LIZIZ()) {
            RateSettingCombineModel rateSettingCombineModel = (RateSettingCombineModel) ColdLaunchRequestCombinerImpl.LIZJ().getResponse("/aweme/v1/rate/settings/");
            if (rateSettingCombineModel != null) {
                if (rateSettingCombineModel.httpCode == 200 && rateSettingCombineModel.getRateSetting().status_code == 0) {
                    if (e1.LIZ(31744, "is_async_setting", true, true)) {
                        C10K.LIZJ(new ACallableS78S0101000_6(1, this, 7));
                        return;
                    } else {
                        LIZLLL(((RateSettingCombineModel) ColdLaunchRequestCombinerImpl.LIZJ().getResponse("/aweme/v1/rate/settings/")).getRateSetting());
                        return;
                    }
                }
                if (rateSettingCombineModel.httpCode == 509) {
                    return;
                }
            }
            LJII();
            return;
        }
        LJII();
    }

    @Override // X.InterfaceC36167EHj
    public final void LIZJ() {
        LJI();
    }

    @Override // X.InterfaceC36167EHj
    public final void LIZIZ(Throwable th) {
        LJII();
    }

    public final void LIZLLL(RateSettingsResponse rateSettingsResponse) {
        if (rateSettingsResponse != null) {
            try {
                if (rateSettingsResponse.isValid()) {
                    LJIIIIZZ(rateSettingsResponse);
                    this.LIZLLL = true;
                    FIP.LIZIZ.LIZ(2, true);
                    return;
                }
            } catch (Exception e) {
                C36922EeM.LIZ(e);
                return;
            }
        }
        FIP.LIZIZ.LIZ(2, false);
    }

    public final void LJIIIIZZ(RateSettingsResponse rateSettingsResponse) {
        if (rateSettingsResponse == null || !rateSettingsResponse.isValid()) {
            return;
        }
        try {
            synchronized (this) {
                this.LIZ = rateSettingsResponse;
                F9J.LIZIZ(EF7.LIZIZ(), 0, "bitrate_manager_sp_rate_setting").edit().putString("bitrate_manager_sp_rate_setting", new Gson().LJIILL(rateSettingsResponse)).apply();
            }
            this.LIZIZ = true;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
