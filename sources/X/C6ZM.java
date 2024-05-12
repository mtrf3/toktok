package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEUtils;
import fjb.a;
import java.io.File;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.wavepublish.nows.savelocal.NowsSaveLocalHelper$saveLocal$1$1$4", f = "NowsSaveLocalHelper.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6ZM, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6ZM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ VideoPublishEditModel LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C68322mC<String> LJLJI;
    public final /* synthetic */ C6ZK LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6ZM(VideoPublishEditModel videoPublishEditModel, boolean z, C68322mC<String> c68322mC, C6ZK c6zk, InterfaceC67352kd<? super C6ZM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = videoPublishEditModel;
        this.LJLILLLLZI = z;
        this.LJLJI = c68322mC;
        this.LJLJJI = c6zk;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C6ZM(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.String] */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        VideoPublishEditModel videoPublishEditModel = this.LJLIL;
        videoPublishEditModel.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType = C152165y8.LIZLLL(videoPublishEditModel);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowsSaveLocalHelper -> save to local -> aigcType = ");
        LIZ.append(this.LJLIL.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        if (this.LJLILLLLZI) {
            C43134GwM.LIZJ(this.LJLIL.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType, this.LJLJI.element);
        } else {
            ?? filePath = this.LJLJJI.getFilePath();
            int i = this.LJLIL.creativeModel.privacySettingModel.aigcInfo.AIGCLabelType;
            String str = this.LJLJI.element;
            if (str != null && str.length() != 0 && filePath != 0 && filePath.length() != 0 && VEUtils.setMetaData(str, filePath, C51029K0z.LJJIIZI(new OSZ("aigc_info", new JSONObject().put("aigc_label_type", i).toString()))) > 0) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("AIGCManager -> setMetadata() -> aigcInfo = ");
                LIZ2.append(new JSONObject().put("aigc_label_type", i));
                H78.LIZ(X1D.LIZIZ(LIZ2));
                C16880lQ.LLLZZIL(new File(str));
            }
            this.LJLJI.element = filePath;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
