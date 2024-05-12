package X;

import Y.ACallableS83S0200000_6;
import com.ss.android.ugc.aweme.legoImp.task.InitServiceSettingTask;
import defpackage.e1;
import org.json.JSONObject;

/* renamed from: X.ETy, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36494ETy implements InterfaceC36298EMk {
    public final /* synthetic */ InitServiceSettingTask LIZ;

    @Override // X.InterfaceC36298EMk
    public final void onFailed(Throwable th) {
    }

    public C36494ETy(InitServiceSettingTask initServiceSettingTask) {
        this.LIZ = initServiceSettingTask;
    }

    @Override // X.InterfaceC36298EMk
    public final void LIZIZ(JSONObject jSONObject) {
        C36322ENi c36322ENi;
        if (e1.LIZ(31744, "is_async_setting", true, true)) {
            C10K.LIZIZ(new ACallableS83S0200000_6(jSONObject, this.LIZ, 1), C38995FSd.LIZLLL(), null);
            return;
        }
        if (!EU2.LIZJ() && (c36322ENi = C36322ENi.LIZIZ) != null) {
            c36322ENi.LIZ(jSONObject);
        }
        this.LIZ.getClass();
        InitServiceSettingTask.LIZLLL(jSONObject);
    }
}
