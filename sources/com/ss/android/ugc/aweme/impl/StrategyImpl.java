package com.ss.android.ugc.aweme.impl;

import X.C221108m2;
import X.C34281Dcr;
import X.C35274Dss;
import X.C35810E3q;
import X.C35818E3y;
import X.C36152EGu;
import X.C36154EGw;
import X.C36233EJx;
import X.C38686FGg;
import X.C38868FNg;
import X.C46981IcD;
import X.C47497IkX;
import X.C48591J5f;
import X.C54502LaE;
import X.C55068LjM;
import X.C56672Kh;
import X.C57022Lq;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C76800UCe;
import X.C85990Xow;
import X.DPP;
import X.E41;
import X.EEZ;
import X.EF7;
import X.FAK;
import X.FCD;
import X.FDW;
import X.FIQ;
import X.FKM;
import X.FMW;
import X.FW5;
import X.IWB;
import X.InterfaceC38870FNi;
import X.InterfaceC65784Pro;
import X.LFH;
import X.OKG;
import Y.ARunnableS42S0100000_6;
import android.content.Context;
import android.os.Handler;
import com.ss.android.ugc.aweme.IMandatoryLoginService;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import com.ss.android.ugc.aweme.comment.service.CommentServiceImpl;
import com.ss.android.ugc.aweme.ml.api.SmartFeedPreloadService;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import com.ss.android.ugc.aweme.utils.OHRPredictResultParams;
import defpackage.s1;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS106S0101000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class StrategyImpl implements IStrategyApi {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C36154EGw.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(E41.LJLIL);

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIJI() {
        IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIMandatoryLoginServicebyMonsterPlugin, "get().getService(IMandat…LoginService::class.java)");
        return createIMandatoryLoginServicebyMonsterPlugin.shouldShowForcedLogin(false);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIJJ() {
        return !C36152EGu.LIZIZ(C38868FNg.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final int LJIJJLI() {
        int i = 0;
        while (i < 2) {
            float f = 1.0f / 2;
            float f2 = i * f;
            int i2 = i + 1;
            float f3 = f * i2;
            float nextFloat = ((Random) C36152EGu.LIZLLL.getValue()).nextFloat();
            if (nextFloat < f3 && nextFloat > f2) {
                return i;
            }
            i = i2;
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIIJ() {
        return C36152EGu.LIZIZ(FDW.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIIZ() {
        return C36152EGu.LIZIZ(FIQ.LJLIL);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIJIIJIL() {
        IMandatoryLoginService createIMandatoryLoginServicebyMonsterPlugin = MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false);
        o.LJIIIIZZ(createIMandatoryLoginServicebyMonsterPlugin, "get().getService(IMandat…LoginService::class.java)");
        return createIMandatoryLoginServicebyMonsterPlugin.enableForcedLogin(false);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIL() {
        return C36152EGu.LIZIZ(C36233EJx.LJLIL);
    }

    public static IStrategyApi LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IStrategyApi.class, false);
        if (LIZ != null) {
            return (IStrategyApi) LIZ;
        }
        if (C58096Mr6.q1 == null) {
            synchronized (IStrategyApi.class) {
                if (C58096Mr6.q1 == null) {
                    C58096Mr6.q1 = new StrategyImpl();
                }
            }
        }
        return C58096Mr6.q1;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LIZ() {
        return s1.LIZLLL("isFirstInstallAndFirstLaunch()");
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LIZJ() {
        return ((Boolean) this.LIZIZ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJ() {
        return ((Boolean) C55068LjM.LJII.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final int LJFF() {
        SmartFeedPreloadService.Companion.getClass();
        return IWB.LIZ.obtainAiFastSlowPredict();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIIJJI() {
        return ((Boolean) C55068LjM.LJFF.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIILIIL() {
        if (((Number) this.LIZ.getValue()).intValue() == 3) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIILJJIL() {
        return ((Boolean) DPP.LIZJ.getValue()).booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIJ() {
        if (((Number) this.LIZ.getValue()).intValue() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final Handler LJJIIZI() {
        return C57022Lq.LIZ.LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final OHRPredictResultParams LJJIJL() {
        InterfaceC38870FNi lastPredictResult = C48591J5f.LIZ.getLastPredictResult();
        if (lastPredictResult != null) {
            return new OHRPredictResultParams(lastPredictResult.LIZJ(), lastPredictResult.LIZ(), lastPredictResult.LIZLLL(), lastPredictResult.LIZIZ());
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIJLIJ() {
        return C54502LaE.LJ("homepage_follow");
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean isNewUser() {
        if (((Number) this.LIZ.getValue()).intValue() != 2) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJI() {
        return C36152EGu.LJ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final int LJIIJ() {
        return C46981IcD.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIILL() {
        return C35810E3q.LJIIIIZZ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIIZILJ() {
        return CommentServiceImpl.LJJL().LJIIJJI();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIL() {
        return C35818E3y.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJ() {
        return FCD.LJII();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final int LJJII() {
        return C46981IcD.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final String LJJIII() {
        String LIZ = C85990Xow.LIZ();
        Locale locale = Locale.US;
        return OKG.LIZJ(locale, "US", LIZ, locale, "this as java.lang.String).toUpperCase(locale)");
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIJIL() {
        if (!C35810E3q.LJIIIIZZ()) {
            C34281Dcr.LIZ().LJIIJJI();
        } else if (!isNewUser()) {
            return ((Boolean) C35274Dss.LJJIFFI.getValue()).booleanValue();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final AwemeHostApplication getApplication() {
        return FKM.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final Context getApplicationContext() {
        return EF7.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final int getAverageSpeedInKBps() {
        return C47497IkX.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final long getUpdateVersionCode() {
        return EF7.LJFF();
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJI() {
        return FW5.LJII;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIIJZLJL() {
        return EEZ.LIZJ;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJJIJ() {
        return C38686FGg.LJI;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final int getAppId() {
        return EF7.LJIIIZ;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final void LIZLLL(long j) {
        FAK LIZ = C56672Kh.LIZ();
        LIZ.getClass();
        if (!LIZ.LJJIFFI || !((ConcurrentHashMap) LIZ.LIZJ).containsKey("AllBootfinishCost")) {
            return;
        }
        if (((ConcurrentHashMap) LIZ.LIZJ).get("AllBootfinishCost") == null) {
            ((ConcurrentHashMap) LIZ.LJIIIIZZ).put("AllBootfinishCost", 0L);
        } else {
            if (((ConcurrentHashMap) LIZ.LJIIIIZZ).get("AllBootfinishCost") != null) {
                return;
            }
            ((ConcurrentHashMap) LIZ.LJIIIIZZ).put("AllBootfinishCost", Long.valueOf(j));
        }
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final int LJII(int i) {
        return LFH.LIZIZ.LIZLLL().LJIIJ().LJIIJ(i);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIIIIZZ(long j) {
        return C36152EGu.LIZLLL(j);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIIL(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        if (C36152EGu.LJFF() && C38686FGg.LJI && interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final boolean LJIILLIIL(InterfaceC65784Pro<Boolean> interfaceC65784Pro) {
        return C36152EGu.LIZIZ(interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final int LJJIFFI(int i) {
        return LFH.LIZIZ.LIZLLL().LJIIJ().LJ(i);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final void LJIIIZ(String className, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(className, "className");
        FMW.LIZIZ(className, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.strategy.api.IStrategyApi
    public final void LJJIJIIJI(ARunnableS42S0100000_6 aRunnableS42S0100000_6, AqS106S0101000_6 aqS106S0101000_6) {
        try {
            aqS106S0101000_6.invoke();
        } catch (Exception e) {
            aRunnableS42S0100000_6.run();
            FMW.LIZLLL("executeMethodSafely", "ActivityDrawablePreload", "executeMethodSafely", "", e);
        }
    }
}
