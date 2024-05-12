package X;

import android.text.TextUtils;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.setting.model.MLModel;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Ikl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47511Ikl implements InterfaceC47509Ikj {
    public final MLModel LIZ = J7I.LJI();

    @Override // X.InterfaceC47509Ikj
    public final boolean enable() {
        if (this.LIZ != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC47509Ikj
    public final String getModelDirName() {
        if (TextUtils.isEmpty(this.LIZ.scene)) {
            return "default";
        }
        return this.LIZ.scene;
    }

    @Override // X.InterfaceC47509Ikj
    public final String getModelType() {
        MLModel mLModel = this.LIZ;
        if (mLModel == null) {
            return "";
        }
        int i = mLModel.type;
        if (i == 2 || i != 3) {
            return "tflite";
        }
        return "bytenn";
    }

    @Override // X.InterfaceC47509Ikj
    public final String modelUrl() {
        MLModel mLModel = this.LIZ;
        if (mLModel == null) {
            return "";
        }
        return mLModel.packageUrl;
    }

    @Override // X.InterfaceC47509Ikj
    public final String LIZIZ() {
        return C16880lQ.LLIIJLIL(EF7.LIZIZ()).getAbsolutePath();
    }

    @Override // X.InterfaceC47509Ikj
    public final String getCountry() {
        return C85990Xow.LJ();
    }

    @Override // X.InterfaceC47509Ikj
    public final ExecutorService getIOExecutor() {
        return C38995FSd.LIZLLL();
    }

    @Override // X.InterfaceC47509Ikj
    public final String getNetworkType() {
        return C16880lQ.LLJILLL(EF7.LIZIZ());
    }

    @Override // X.InterfaceC47509Ikj
    public final int getPhoneSignal() {
        return C47950Irq.LIZ(EF7.LIZIZ()).LIZIZ(EF7.LIZIZ());
    }

    @Override // X.InterfaceC47509Ikj
    public final boolean LIZ(String str, String str2, String str3) {
        try {
            return NetworkUtils.downloadFile(-1, str, str2, null, str3, null, null, null, null, null, null);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }
}
