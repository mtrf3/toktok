package X;

import android.graphics.Bitmap;
import android.widget.TextView;
import com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment;
import com.bytedance.effectcreatormobile.camera.face.FaceDistortionNameViewModel;
import com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel;
import com.bytedance.effectcreatormobile.camera.impl.CameraRenderImpl;
import com.bytedance.effectcreatormobile.ckeapi.api.main.IAutoChangeModel;
import com.bytedance.ies.effectcreator.swig.Feature;
import com.ss.android.vesdk.VERecorder;
import fjb.a;
import java.io.File;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.camera.face.FaceDistortionFragment$onSaveClicked$1", f = "FaceDistortionFragment.kt", l = {270, 273}, m = "invokeSuspend")
/* renamed from: X.aoO, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94896aoO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ FaceDistortionFragment LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94896aoO(FaceDistortionFragment faceDistortionFragment, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = faceDistortionFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94896aoO(this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String filePath;
        C3BJ<C76800UCe> saveFaceFeatureEvent;
        FaceDistortionFragment faceDistortionFragment;
        Feature feature;
        IAutoChangeModel LIZ;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLILLLLZI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C141335gf.LIZJ(obj);
                    this.LJLJI.vl(false);
                    faceDistortionFragment = this.LJLJI;
                    if (faceDistortionFragment.LJLILLLLZI != null && (feature = faceDistortionFragment.Al().LJLLLLLL) != null && (LIZ = C93722aVS.LIZ()) != null) {
                        LIZ.autoChangeModelWhenAddNew(C93825aX7.LIZ(feature), null);
                    }
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            filePath = (String) this.LJLIL;
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            FaceDistortionFragment faceDistortionFragment2 = this.LJLJI;
            faceDistortionFragment2.LJLLLL = true;
            C94314af0 c94314af0 = faceDistortionFragment2.LJLIL;
            o.LJI(c94314af0);
            TextView textView = c94314af0.LJLJJL;
            o.LJIIIIZZ(textView, "binding.btnSave");
            textView.setEnabled(false);
            String str = C93965aZN.LIZ;
            if (str != null) {
                filePath = new File(str, "face_distortion.jpg").getAbsolutePath();
                int LIZJ = C93742aVm.LIZJ(32.0f);
                int i2 = (LIZJ * 16) / 9;
                C93886aY6 xl = this.LJLJI.xl();
                o.LJIIIIZZ(filePath, "filePath");
                this.LJLIL = filePath;
                this.LJLILLLLZI = 1;
                xl.getClass();
                XKS xks = new XKS(1, C78555UsJ.LJJII(this));
                xks.LJIIL();
                VERecorder vERecorder = xl.LIZLLL;
                if (vERecorder == null) {
                    xks.LJJIJIL(null);
                } else {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    C94306aes c94306aes = new C94306aes(xks);
                    C63856P4i.LIZ(1L, "ve_use_camera");
                    vERecorder.LIZIZ.shotScreen(filePath, LIZJ, i2, false, true, compressFormat, new P8U(LIZJ, i2, System.currentTimeMillis(), c94306aes), false);
                }
                if (xks.LJIIJJI() == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                o.LJIJI("IMAGE_CACHE_PATH");
                throw null;
            }
        }
        FaceDistortionViewModel Al = this.LJLJI.Al();
        o.LJIIIIZZ(filePath, "filePath");
        Al.getClass();
        Feature feature2 = Al.LJLLLLLL;
        if (feature2 != null) {
            feature2.setIconPath(filePath);
        }
        C16880lQ.LLLZZIL(new File(filePath));
        ((FaceDistortionNameViewModel) this.LJLJI.LJLJLJ.getValue()).LJLIL++;
        CameraRenderImpl LIZ2 = C93899aYJ.LIZ();
        if (LIZ2 != null && (saveFaceFeatureEvent = LIZ2.getSaveFaceFeatureEvent()) != null) {
            C76800UCe c76800UCe = C76800UCe.LIZ;
            this.LJLIL = null;
            this.LJLILLLLZI = 2;
            if (saveFaceFeatureEvent.emit(c76800UCe, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLJI.vl(false);
        faceDistortionFragment = this.LJLJI;
        if (faceDistortionFragment.LJLILLLLZI != null) {
            LIZ.autoChangeModelWhenAddNew(C93825aX7.LIZ(feature), null);
        }
        return C76800UCe.LIZ;
    }
}
