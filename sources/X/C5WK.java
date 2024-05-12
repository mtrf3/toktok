package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel;
import com.vega.nletodraft.model.ZipInputExtra;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutViewModel$processDataAsync$1", f = "EditCapCutViewModel.kt", l = {215}, m = "invokeSuspend")
/* renamed from: X.5WK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5WK extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ NLEModel LJLILLLLZI;
    public final /* synthetic */ EditCapCutViewModel LJLJI;
    public final /* synthetic */ VideoPublishEditModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5WK(NLEModel nLEModel, EditCapCutViewModel editCapCutViewModel, VideoPublishEditModel videoPublishEditModel, InterfaceC67352kd<? super C5WK> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = nLEModel;
        this.LJLJI = editCapCutViewModel;
        this.LJLJJI = videoPublishEditModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5WK(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        NLEModel nLEModel;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        boolean z = true;
        try {
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EditCapCut; throwable : ");
            LIZ.append(android.util.Log.getStackTraceString(th));
            C5Z2.LIZIZ(X1D.LIZIZ(LIZ));
            z = false;
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj2);
        } else {
            C141335gf.LIZJ(obj2);
            ((Keva) C5WN.LIZ.getValue()).storeLong("key_last_process_data_time", System.currentTimeMillis());
            nLEModel = this.LJLILLLLZI;
            if (nLEModel == null) {
                XIF xif = EXV.LIZ;
                C5L4 c5l4 = new C5L4(this.LJLJJI, null);
                this.LJLIL = 1;
                obj2 = XKX.LJI(xif, c5l4, this);
                if (obj2 == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            C78688UuS.LJFF();
            EditCapCutViewModel editCapCutViewModel = this.LJLJI;
            VideoPublishEditModel videoPublishEditModel = this.LJLJJI;
            editCapCutViewModel.getClass();
            String creationId = videoPublishEditModel.getCreationId();
            o.LJIIIIZZ(creationId, "editModel.creationId");
            String str = editCapCutViewModel.LJLL;
            String packageName = C60903NvH.LJ.getPackageName();
            o.LJIIIIZZ(packageName, "getApplication().packageName");
            FFL.LJIIIZ().getClass();
            ZipInputExtra zipInputExtra = new ZipInputExtra(creationId, str, packageName, z, 0, null, FFL.LJIILIIL(31744, -1L, "studio_capcut_vid"), 48, 0 == true ? 1 : 0);
            EditCapCutViewModel editCapCutViewModel2 = this.LJLJI;
            VideoPublishEditModel videoPublishEditModel2 = this.LJLJJI;
            editCapCutViewModel2.getClass();
            EditCapCutViewModel.Kv0(videoPublishEditModel2);
            PTW.LIZJ(new C5WL(nLEModel, zipInputExtra));
            return Boolean.valueOf(z);
        }
        nLEModel = (NLEModel) obj2;
        C78688UuS.LJFF();
        EditCapCutViewModel editCapCutViewModel3 = this.LJLJI;
        VideoPublishEditModel videoPublishEditModel3 = this.LJLJJI;
        editCapCutViewModel3.getClass();
        String creationId2 = videoPublishEditModel3.getCreationId();
        o.LJIIIIZZ(creationId2, "editModel.creationId");
        String str2 = editCapCutViewModel3.LJLL;
        String packageName2 = C60903NvH.LJ.getPackageName();
        o.LJIIIIZZ(packageName2, "getApplication().packageName");
        FFL.LJIIIZ().getClass();
        ZipInputExtra zipInputExtra2 = new ZipInputExtra(creationId2, str2, packageName2, z, 0, null, FFL.LJIILIIL(31744, -1L, "studio_capcut_vid"), 48, 0 == true ? 1 : 0);
        EditCapCutViewModel editCapCutViewModel22 = this.LJLJI;
        VideoPublishEditModel videoPublishEditModel22 = this.LJLJJI;
        editCapCutViewModel22.getClass();
        EditCapCutViewModel.Kv0(videoPublishEditModel22);
        PTW.LIZJ(new C5WL(nLEModel, zipInputExtra2));
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
