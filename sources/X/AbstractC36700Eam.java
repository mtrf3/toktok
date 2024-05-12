package X;

import Y.IDRunnableS6S0101000;
import android.os.Handler;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.internal.p;
import com.google.gson.m;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.setting.api.SettingApi;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Eam, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC36700Eam implements WeakHandler.IHandler {
    public static final C36826Eco LJLJJL = new C36826Eco();
    public SettingApi LJLIL;
    public final List<FUL> LJLJJI;
    public String LJLJI = "{}";
    public final WeakHandler LJLILLLLZI = new WeakHandler(C16880lQ.LLJJJJ(), this);

    public abstract void LIZ(Object obj);

    public AbstractC36700Eam() {
        if (!C33949DUb.LIZJ()) {
            this.LJLIL = (SettingApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(SettingApi.class);
        }
        this.LJLJJI = new ArrayList();
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        LIZ(message.obj);
    }

    public final void LIZIZ(m mVar, boolean z) {
        String stringWriter;
        long currentTimeMillis = System.currentTimeMillis();
        C62822Ol8 c62822Ol8 = C34656Diu.LIZJ;
        if (((Boolean) c62822Ol8.getValue()).booleanValue()) {
            try {
                StringWriter stringWriter2 = new StringWriter(668220);
                C65403Plf c65403Plf = new C65403Plf(stringWriter2);
                c65403Plf.LJLJJLL = true;
                p.LIZIZ(mVar, c65403Plf);
                stringWriter = stringWriter2.toString();
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        } else {
            stringWriter = mVar.toString();
        }
        this.LJLJI = stringWriter;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("optOpen:");
        LIZ.append(((Boolean) c62822Ol8.getValue()).booleanValue());
        LIZ.append("cost:");
        LIZ.append(System.currentTimeMillis() - currentTimeMillis);
        X1D.LIZIZ(LIZ);
        if (z) {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            LIZLLL.getClass();
            FH8.LJIIIIZZ(mVar);
            FHC.LIZIZ().LIZ();
            new Handler(C16880lQ.LLJJJJ()).post(new IDRunnableS6S0101000(4, LIZLLL, 34));
            return;
        }
        SettingsManager.LIZLLL().getClass();
        FHC.LIZIZ().LIZ();
        SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
        LIZLLL2.getClass();
        new Handler(C16880lQ.LLJJJJ()).post(new IDRunnableS6S0101000(4, LIZLLL2, 34));
    }
}
