package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.account.share.data.model.AccountShareInfo;

/* loaded from: classes12.dex */
public final class QMC implements QMD {
    public final /* synthetic */ InterfaceC73573Su9<AccountShareInfo> LIZ;

    public QMC(C73433Srt c73433Srt) {
        this.LIZ = c73433Srt;
    }

    @Override // X.QMD
    public final void LIZ(QM8 qm8) {
        if (qm8.LIZIZ) {
            Object fromJson = GsonProtectorUtils.fromJson(new Gson(), qm8.LJFF, (Class<Object>) AccountShareInfo.class);
            if (fromJson != null) {
                this.LIZ.onNext(fromJson);
                this.LIZ.onComplete();
                return;
            } else {
                this.LIZ.onError(new Exception("convert to AccountShareInfo failed"));
                return;
            }
        }
        this.LIZ.onError(new Exception(qm8.LIZJ));
    }
}
