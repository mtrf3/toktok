package com.bytedance.pitaya.bdcomponentimpl.network;

import X.C39427Fdf;
import X.C39745Fin;
import X.C48153Iv7;
import X.C62848OlY;
import X.C64797Pbt;
import X.C64799Pbv;
import X.C64802Pby;
import X.C65019PfT;
import X.C65083PgV;
import X.C93269aO9;
import X.C93311aOp;
import X.C93328aP6;
import X.C93334aPC;
import X.EnumC93298aOc;
import X.ExecutorC93235aNb;
import X.F9J;
import X.InterfaceC37216Ej6;
import X.InterfaceC93314aOs;
import X.PVC;
import X.PVJ;
import X.PVP;
import X.RunnableC93270aOA;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.pitaya.api.PTYSettingsCallback;
import com.bytedance.pitaya.log.PitayaLogger;
import com.bytedance.pitaya.thirdcomponent.net.PTYHttpClient;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.InputStream;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes30.dex */
public final class TTNetHttpClientImpl implements PTYHttpClient {
    public static final C93269aO9 Companion = new C93269aO9();
    public final InterfaceC37216Ej6 addHeaderInter;
    public boolean isNewUser;

    public TTNetHttpClientImpl() {
        Context context = C93311aOp.LIZ.get();
        if (context != null) {
            SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "pty_user_types");
            if (LIZIZ.getInt("has_set_user", 0) == 0) {
                this.isNewUser = true;
            }
            LIZIZ.edit().putInt("has_set_user", 1).apply();
        }
        this.addHeaderInter = new C93328aP6(this);
    }

    public final boolean isNewUser() {
        return this.isNewUser;
    }

    public final void setNewUser(boolean z) {
        this.isNewUser = z;
    }

    @Override // com.bytedance.pitaya.thirdcomponent.net.PTYHttpClient
    public void inject(String aid, PTYSettingsCallback pTYSettingsCallback) {
        JSONObject settings;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        o.LJIIJ(aid, "aid");
        if (pTYSettingsCallback == null || (settings = pTYSettingsCallback.getSettings("pitaya_general_settings")) == null || (optJSONObject = settings.optJSONObject("content")) == null || (optJSONObject2 = optJSONObject.optJSONObject("rs_map")) == null || optJSONObject2.length() != 0) {
            C65083PgV.LIZIZ(new C93334aPC(aid, pTYSettingsCallback));
        }
    }

    @Override // com.bytedance.pitaya.thirdcomponent.net.PTYHttpClient
    public void get(String url, InterfaceC93314aOs callback, EnumC93298aOc dataType) {
        o.LJIIJ(url, "url");
        o.LJIIJ(callback, "callback");
        o.LJIIJ(dataType, "dataType");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("An operation is not implemented: ");
        LIZ.append("Not yet implemented");
        throw new C39427Fdf(X1D.LIZIZ(LIZ));
    }

    @Override // com.bytedance.pitaya.thirdcomponent.net.PTYHttpClient
    public void post(String url, byte[] bArr, InterfaceC93314aOs callback, EnumC93298aOc dataType) {
        o.LJIIJ(url, "url");
        o.LJIIJ(callback, "callback");
        o.LJIIJ(dataType, "dataType");
        ExecutorC93235aNb.LJLJL.execute(new RunnableC93270aOA(this, url, bArr, callback, dataType));
    }

    public final void postInWorkThread(String str, byte[] bArr, InterfaceC93314aOs interfaceC93314aOs, EnumC93298aOc enumC93298aOc) {
        PVJ pvj;
        int i;
        C65019PfT LJIIL = C65083PgV.LJIIL(str);
        if (LJIIL == null) {
            interfaceC93314aOs.onFailure(1100, "url is empty");
            return;
        }
        if (!LJIIL.LJIIIIZZ.contains(this.addHeaderInter)) {
            LJIIL.LJIIIIZZ.add(this.addHeaderInter);
        }
        C48153Iv7 c48153Iv7 = new C48153Iv7();
        c48153Iv7.LIZJ = LivePlayEnforceIntervalSetting.DEFAULT;
        c48153Iv7.LIZLLL = LivePlayEnforceIntervalSetting.DEFAULT;
        c48153Iv7.LJ = LivePlayEnforceIntervalSetting.DEFAULT;
        c48153Iv7.LJIIIZ = true;
        CommonPostService commonPostService = (CommonPostService) LJIIL.LIZ(CommonPostService.class);
        if (bArr != null) {
            if (enumC93298aOc == EnumC93298aOc.PB) {
                pvj = PVP.LIZLLL(C39745Fin.LIZJ("application/x-protobuf; charset=utf-8"), bArr);
            } else {
                pvj = PVP.LIZLLL(C39745Fin.LIZJ("application/json; charset=utf-8"), bArr);
            }
        } else {
            pvj = null;
        }
        try {
            C64797Pbt<TypedInput> execute = commonPostService.request(str, pvj, c48153Iv7).execute();
            int i2 = execute.LIZ.LIZIZ;
            if (!execute.LIZIZ()) {
                InputStream in = execute.LIZJ.in();
                o.LJFF(in, "rawResponse.errorBody().`in`()");
                interfaceC93314aOs.onFailure(i2, new String(C62848OlY.LJFF(in), PVC.LIZ));
            } else {
                InputStream in2 = execute.LIZIZ.in();
                o.LJFF(in2, "rawResponse.body().`in`()");
                interfaceC93314aOs.LIZ(C62848OlY.LJFF(in2));
            }
        } catch (Exception e) {
            PitayaLogger.LJFF("TTNetHttpClientImpl", "", "", e);
            if (e instanceof C64799Pbv) {
                i = ((C64799Pbv) e).getStatusCode();
            } else if (e instanceof C64802Pby) {
                i = ((C64802Pby) e).getStatusCode();
            } else {
                i = 1099;
            }
            interfaceC93314aOs.onFailure(i, e.toString());
        }
    }
}
