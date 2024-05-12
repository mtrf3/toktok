package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.e;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;

/* loaded from: classes8.dex */
public final class H0R<T> implements InterfaceC86003Zc {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

    public H0R(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<String> interfaceC73573Su9) {
        UploadImageConfig uploadImageConfig;
        String str = this.LJLIL;
        if (str == null || str.length() == 0) {
            interfaceC73573Su9.tryOnError(new IllegalArgumentException("uploadKey isNullOrEmpty"));
            return;
        }
        UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) GsonProtectorUtils.fromJson(new e().LIZ(), this.LJLIL, UploadAuthKeyConfig.class);
        if (uploadAuthKeyConfig == null || (uploadImageConfig = uploadAuthKeyConfig.frameUploadConfig) == null) {
            interfaceC73573Su9.tryOnError(new IllegalArgumentException("uploadConfig isNull"));
            return;
        }
        if (!C1B8.LIZJ()) {
            interfaceC73573Su9.tryOnError(new IllegalArgumentException("user is unLogin status"));
            return;
        }
        FUX LIZ = H0I.LIZ(uploadImageConfig);
        LIZ.LJIIIZ(new H0S(LIZ, (C73433Srt) interfaceC73573Su9));
        LIZ.LIZIZ.setFilePath(1, new String[]{this.LJLILLLLZI});
        try {
            LIZ.LJIIL();
        } catch (Exception e) {
            LIZ.LIZJ();
            C16880lQ.LLLLIIL(e);
        }
    }
}
