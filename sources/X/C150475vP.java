package X;

import com.ss.android.ugc.aweme.creative.model.EditCapCutReuseModel;
import com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutTTCreativeData;
import fjb.a;
import java.io.File;
import java.io.FileReader;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.edit.capcut.EditCapCutModelKt$getTTCreativeInfo$2", f = "EditCapCutModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5vP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150475vP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super EditCapCutTTCreativeData>, Object> {
    public final /* synthetic */ EditCapCutReuseModel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C150475vP(EditCapCutReuseModel editCapCutReuseModel, InterfaceC67352kd<? super C150475vP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = editCapCutReuseModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C150475vP(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        File LJJJIL = C78688UuS.LJJJIL();
        if (!LJJJIL.exists()) {
            C5Z2.LIZIZ("EditCapCut, e : jsonPath is not exists");
            return null;
        }
        try {
            EditCapCutTTCreativeData editCapCutTTCreativeData = (EditCapCutTTCreativeData) C60903NvH.LJIIJJI().LIZ().LJ(new FileReader(LJJJIL), EditCapCutTTCreativeData.class);
            if (!o.LJ(editCapCutTTCreativeData.creationId, this.LJLIL.creationId)) {
                return null;
            }
            return editCapCutTTCreativeData;
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EditCapCut, e : ");
            LIZ.append(android.util.Log.getStackTraceString(th));
            C5Z2.LIZIZ(X1D.LIZIZ(LIZ));
            return null;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super EditCapCutTTCreativeData> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
