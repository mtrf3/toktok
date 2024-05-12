package X;

import com.bytedance.vcloud.networkpredictor.ISpeedPredictorListener;
import com.bytedance.vcloud.networkpredictor.ISpeedPredictorMLConfig;

/* renamed from: X.Iki, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47508Iki implements ISpeedPredictorMLConfig, ISpeedPredictorListener {
    public final InterfaceC47509Ikj LIZ;

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorMLConfig
    public final boolean enable() {
        return this.LIZ.enable();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorListener
    public final String getCountry() {
        return this.LIZ.getCountry();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorListener
    public final String getFilesCachePath() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorListener
    public final Object getIOExecutor() {
        return this.LIZ.getIOExecutor();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorMLConfig
    public final String getModelDirName() {
        return this.LIZ.getModelDirName();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorMLConfig
    public final String getModelType() {
        return this.LIZ.getModelType();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorListener
    public final String getNetworkType() {
        return this.LIZ.getNetworkType();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorListener
    public final int getPhoneSignal() {
        return this.LIZ.getPhoneSignal();
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorMLConfig
    public final String modelUrl() {
        return this.LIZ.modelUrl();
    }

    public C47508Iki(InterfaceC47509Ikj interfaceC47509Ikj) {
        this.LIZ = interfaceC47509Ikj;
        if (interfaceC47509Ikj == null) {
            this.LIZ = new C47507Ikh();
        }
    }

    @Override // com.bytedance.vcloud.networkpredictor.ISpeedPredictorListener
    public final boolean getDownFileState(String str, String str2, String str3) {
        return this.LIZ.LIZ(str, str2, str3);
    }
}
