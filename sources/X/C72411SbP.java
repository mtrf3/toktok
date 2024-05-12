package X;

import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import com.ss.android.vesdk.algorithm.VEFaceDetectCropResult;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler$cropAndGetInformation$2", f = "AIGCPictureHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.SbP, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72411SbP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super VEFaceDetectCropResult>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ AIGCPictureHandler LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72411SbP(String str, AIGCPictureHandler aIGCPictureHandler, String str2, String str3, String str4, InterfaceC67352kd<? super C72411SbP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = aIGCPictureHandler;
        this.LJLJI = str2;
        this.LJLJJI = str3;
        this.LJLJJL = str4;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72411SbP(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C72415SbT c72415SbT = new C72415SbT();
        String str = this.LJLIL;
        AIGCPictureHandler aIGCPictureHandler = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        String str3 = this.LJLJJI;
        String str4 = this.LJLJJL;
        c72415SbT.LIZ = str;
        c72415SbT.LIZIZ = aIGCPictureHandler.isFastPath;
        if (str2 != null) {
            c72415SbT.LIZJ = str2;
        }
        if (str3 != null) {
            c72415SbT.LIZLLL = str3;
        }
        if (str4 != null) {
            c72415SbT.LJ = str4;
        }
        return TEVideoUtils.scanPicture(c72415SbT);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super VEFaceDetectCropResult> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
