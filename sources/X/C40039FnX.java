package X;

import android.os.Build;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.bytedance.android.monitorV2.net.MonitorNetApi;
import com.google.gson.m;
import java.util.ArrayList;

/* renamed from: X.FnX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40039FnX extends AbstractC66646QDq {
    /* JADX WARN: Finally extract failed */
    @Override // X.AbstractC66646QDq
    public final VMZ LIZ() {
        Object LJI;
        InterfaceC37276Ek4<String> interfaceC37276Ek4;
        try {
            m LIZLLL = LIZLLL();
            String str = this.LIZIZ.LIZIZ;
            synchronized (C65083PgV.class) {
                LJI = C65083PgV.LJI(C65083PgV.LJIIJJI(str), MonitorNetApi.class);
            }
            try {
                interfaceC37276Ek4 = ((MonitorNetApi) LJI).doPost(new ArrayList(), LIZLLL);
                try {
                    VMZ LIZJ = LIZJ(interfaceC37276Ek4.execute().LIZIZ);
                    interfaceC37276Ek4.cancel();
                    return LIZJ;
                } catch (Throwable th) {
                    th = th;
                    try {
                        C77117UOj.LJIIZILJ(th);
                        if (interfaceC37276Ek4 != null) {
                            interfaceC37276Ek4.cancel();
                        }
                        return null;
                    } catch (Throwable th2) {
                        if (interfaceC37276Ek4 != null) {
                            interfaceC37276Ek4.cancel();
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                interfaceC37276Ek4 = null;
            }
        } catch (Throwable th4) {
            C77117UOj.LJIIZILJ(th4);
        }
    }

    public final m LIZLLL() {
        String str = this.LIZIZ.LIZ;
        m mVar = new m();
        String str2 = this.LIZIZ.LIZ;
        if (str2 != null) {
            mVar.LJJIIZ("aid", str2);
        }
        String str3 = this.LIZIZ.LIZJ;
        if (str3 != null) {
            mVar.LJJIIZ("os", str3);
        }
        String str4 = this.LIZIZ.LIZLLL;
        if (str4 != null) {
            mVar.LJJIIZ("os_version", str4);
        }
        this.LIZIZ.getClass();
        String str5 = this.LIZIZ.LJ;
        if (str5 != null) {
            mVar.LJJIIZ("device_id", str5);
        }
        String str6 = this.LIZIZ.LJFF;
        if (str6 != null) {
            mVar.LJJIIZ("channel", str6);
        }
        String str7 = this.LIZIZ.LJI;
        if (str7 != null) {
            mVar.LJJIIZ("version_code", str7);
        }
        String str8 = this.LIZIZ.LJII;
        if (str8 != null) {
            mVar.LJJIIZ("update_version_code", str8);
        }
        String str9 = this.LIZIZ.LJIIIIZZ;
        if (str9 != null) {
            mVar.LJJIIZ("region", str9);
        }
        String str10 = this.LIZIZ.LJIIIZ;
        if (str10 != null) {
            mVar.LJJIIZ("language", str10);
        }
        mVar.LJJIIZ("device_model", Build.MODEL);
        mVar.LJJIIZ("sdk_version", "1.5.14-rc.16-oversea");
        mVar.LJJIIZ("device_brand", Build.BRAND);
        return mVar;
    }

    public C40039FnX(HybridSettingInitConfig hybridSettingInitConfig) {
        super(hybridSettingInitConfig);
    }
}
