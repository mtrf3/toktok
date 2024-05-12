package X;

import com.ss.android.ugc.aweme.ml.api.SmartHARService;

/* loaded from: classes9.dex */
public final class IOY implements InterfaceC79472VGy {
    @Override // X.InterfaceC79472VGy
    public final String key() {
        return "har_type";
    }

    @Override // X.InterfaceC79472VGy
    public final String LIZ(String str) {
        if (SmartHARService.instance().enable()) {
            return String.valueOf(SmartHARService.instance().getLastStatus());
        }
        return "-1";
    }
}
