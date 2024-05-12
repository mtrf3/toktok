package X;

import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.publish.model.STSAuthConfig;
import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import com.ss.bduploader.BDObjectUploader;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectUploader$createEffectWithError$2$deferredZip$1", f = "MobileEffectUploader.kt", l = {71}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ESG extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super String>, Object> {
    public int LJLIL;
    public final /* synthetic */ C36370EPe LJLILLLLZI;
    public final /* synthetic */ UploadImageConfig LJLJI;
    public final /* synthetic */ UploadableMobileEffect LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ESG(C36370EPe c36370EPe, UploadImageConfig uploadImageConfig, UploadableMobileEffect uploadableMobileEffect, InterfaceC67352kd<? super ESG> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c36370EPe;
        this.LJLJI = uploadImageConfig;
        this.LJLJJI = uploadableMobileEffect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ESG(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C36370EPe c36370EPe = this.LJLILLLLZI;
            UploadImageConfig uploadImageConfig = this.LJLJI;
            UploadableMobileEffect uploadableMobileEffect = this.LJLJJI;
            this.LJLIL = 1;
            c36370EPe.getClass();
            String LIZLLL = C36370EPe.LIZLLL(uploadableMobileEffect.zipFilePath);
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("uploading zip, zipPath=");
            LIZ.append(LIZLLL);
            C15280iq.LJ("DiyProp", X1D.LIZIZ(LIZ));
            BDObjectUploader bDObjectUploader = new BDObjectUploader();
            bDObjectUploader.setFilePath(1, new String[]{LIZLLL});
            STSAuthConfig sTSAuthConfig = uploadImageConfig.authorizationV2;
            String str4 = null;
            if (sTSAuthConfig != null) {
                str = sTSAuthConfig.accessKeyId;
            } else {
                str = null;
            }
            bDObjectUploader.setTopAccessKey(str);
            STSAuthConfig sTSAuthConfig2 = uploadImageConfig.authorizationV2;
            if (sTSAuthConfig2 != null) {
                str2 = sTSAuthConfig2.secretAccessKey;
            } else {
                str2 = null;
            }
            bDObjectUploader.setTopSecretKey(str2);
            STSAuthConfig sTSAuthConfig3 = uploadImageConfig.authorizationV2;
            if (sTSAuthConfig3 != null) {
                str3 = sTSAuthConfig3.sessionToken;
            } else {
                str3 = null;
            }
            bDObjectUploader.setTopSessionToken(str3);
            STSAuthConfig sTSAuthConfig4 = uploadImageConfig.authorizationV2;
            if (sTSAuthConfig4 != null) {
                str4 = sTSAuthConfig4.spaceName;
            }
            bDObjectUploader.setSpaceName(str4);
            bDObjectUploader.setUploadDomain(uploadImageConfig.imageHostName);
            bDObjectUploader.setSliceSize(uploadImageConfig.sliceSize);
            bDObjectUploader.setSocketNum(1);
            bDObjectUploader.setSliceRetryCount(1);
            bDObjectUploader.setFileRetryCount(1);
            bDObjectUploader.setNetworkType(403, ESI.LIZ());
            bDObjectUploader.setNetworkType(404, ESI.LIZ());
            bDObjectUploader.setEnableCommitUpload(true);
            bDObjectUploader.setListener(new ESH(bDObjectUploader, c84654XKg));
            bDObjectUploader.start();
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super String> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
