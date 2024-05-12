package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler;
import com.ss.android.vesdk.algorithm.VEFaceDetectCropResult;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.aigc.AIGCPictureHandler$checkValidAndUpload$continueRun$1$tempResult$1", f = "AIGCPictureHandler.kt", l = {263}, m = "invokeSuspend")
/* renamed from: X.SbM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72408SbM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super AIGCPictureHandler.HandleResult>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public final /* synthetic */ AIGCPictureHandler LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ List<String> LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72408SbM(AIGCPictureHandler aIGCPictureHandler, String str, List<String> list, InterfaceC67352kd<? super C72408SbM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = aIGCPictureHandler;
        this.LJLJJLL = str;
        this.LJLJL = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C72408SbM(this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        String str3;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLJJI;
        if (i != 0) {
            if (i == 1) {
                str3 = (String) this.LJLJI;
                str2 = (String) this.LJLILLLLZI;
                str = (String) this.LJLIL;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            if (this.LJLJJL.isFastPath) {
                H90 h90 = AIGCPictureHandler.Companion;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append('/');
                LIZ.append(this.LJLJJLL.hashCode());
                LIZ.append("_bingo.jpeg");
                String LIZIZ = X1D.LIZIZ(LIZ);
                h90.getClass();
                str = H90.LIZ(LIZIZ);
            } else {
                str = null;
            }
            if (this.LJLJJL.isFastPath) {
                H90 h902 = AIGCPictureHandler.Companion;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append('/');
                LIZ2.append(this.LJLJJLL.hashCode());
                LIZ2.append("_smash.jpeg");
                String LIZIZ2 = X1D.LIZIZ(LIZ2);
                h902.getClass();
                str2 = H90.LIZ(LIZIZ2);
            } else {
                str2 = null;
            }
            if (!this.LJLJJL.isFastPath) {
                H90 h903 = AIGCPictureHandler.Companion;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append('/');
                LIZ3.append(this.LJLJJLL.hashCode());
                LIZ3.append("_slow.jpeg");
                String LIZIZ3 = X1D.LIZIZ(LIZ3);
                h903.getClass();
                str3 = H90.LIZ(LIZIZ3);
            } else {
                str3 = null;
            }
            AIGCPictureHandler aIGCPictureHandler = this.LJLJJL;
            String str4 = this.LJLJJLL;
            this.LJLIL = str;
            this.LJLILLLLZI = str2;
            this.LJLJI = str3;
            this.LJLJJI = 1;
            obj = aIGCPictureHandler.cropAndGetInformation(str4, str, str2, str3, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        VEFaceDetectCropResult vEFaceDetectCropResult = (VEFaceDetectCropResult) obj;
        if (vEFaceDetectCropResult != null && vEFaceDetectCropResult.retCode == 0) {
            return new AIGCPictureHandler.HandleResult(vEFaceDetectCropResult, str, str2, str3);
        }
        this.LJLJL.add(this.LJLJJLL);
        return null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super AIGCPictureHandler.HandleResult> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
