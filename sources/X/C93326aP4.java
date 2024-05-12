package X;

import com.bytedance.pitaya.thirdcomponent.featureevent.FeatureEventCallback;

/* renamed from: X.aP4, reason: case insensitive filesystem */
/* loaded from: classes30.dex */
public final class C93326aP4 implements InterfaceC66829QKr {
    public final /* synthetic */ FeatureEventCallback LIZ;

    public C93326aP4(FeatureEventCallback featureEventCallback) {
        this.LIZ = featureEventCallback;
    }

    @Override // X.InterfaceC66829QKr
    public final void onEvent(String str, String str2) {
        if (str != null) {
            this.LIZ.onEvent(str, str2);
        }
    }
}
