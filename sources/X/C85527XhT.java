package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.account.settings.SaveLoginInfoPopupFrequencyModel;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: X.XhT, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85527XhT extends AbstractC68941R3x {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;

    @Override // X.AbstractC67055QTj
    public final void onSuccess(R4V r4v) {
        long j;
        JSONObject jSONObject;
        R4V r4v2 = r4v;
        if (r4v2 == null) {
            this.LIZ.invoke();
            C85528XhU.LIZ = false;
            return;
        }
        QTX qtx = r4v2.LJIIIZ;
        if (qtx != null && (jSONObject = qtx.LJIIL) != null) {
            int optInt = jSONObject.optInt("user_create_time", -1);
            if (optInt > 0) {
                j = TimeUnit.SECONDS.toDays(optInt);
            } else {
                j = optInt;
            }
        } else {
            j = -1;
        }
        long days = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis());
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        SaveLoginInfoPopupFrequencyModel saveLoginInfoPopupFrequencyModel = C84533XFp.LIZ;
        SaveLoginInfoPopupFrequencyModel saveLoginInfoPopupFrequencyModel2 = (SaveLoginInfoPopupFrequencyModel) LIZLLL.LJIIIIZZ("save_login_info_popup_frequency", SaveLoginInfoPopupFrequencyModel.class, saveLoginInfoPopupFrequencyModel);
        if (saveLoginInfoPopupFrequencyModel2 != null) {
            saveLoginInfoPopupFrequencyModel = saveLoginInfoPopupFrequencyModel2;
        }
        if (j < 0) {
            this.LIZ.invoke();
            C85528XhU.LIZ = false;
            return;
        }
        QTX qtx2 = r4v2.LJIIIZ;
        if (qtx2 != null) {
            C36244EKi.LIZIZ(qtx2.LJIILIIL.toString());
        }
        if (days - j <= saveLoginInfoPopupFrequencyModel.new_user_exemption) {
            this.LIZ.invoke();
            C85528XhU.LIZ = false;
        } else {
            C85528XhU.LIZJ(this.LIZIZ, this.LIZJ, this.LIZ);
        }
    }

    @Override // X.AbstractC67055QTj
    public final void onError(R4V r4v, int i) {
        this.LIZ.invoke();
        C85528XhU.LIZ = false;
    }

    public C85527XhT(String str, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2) {
        this.LIZ = interfaceC65784Pro;
        this.LIZIZ = str;
        this.LIZJ = interfaceC65784Pro2;
    }
}
