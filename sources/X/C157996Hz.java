package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;
import java.io.File;
import java.io.IOException;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.editSticker.effectPlatform.EffectExtKt$unzipEffectRes$2", f = "EffectExt.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6Hz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157996Hz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Effect LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C157996Hz(Effect effect, InterfaceC67352kd<? super C157996Hz> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = effect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C157996Hz(this.LJLIL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C76800UCe c76800UCe;
        C141335gf.LIZJ(obj);
        try {
            File file = new File(this.LJLIL.getZipPath());
            try {
                try {
                    FileUtils fileUtils = FileUtils.INSTANCE;
                    fileUtils.removeDir(this.LJLIL.getUnzipPath());
                    fileUtils.unZip(this.LJLIL.getZipPath(), this.LJLIL.getUnzipPath());
                    c76800UCe = C76800UCe.LIZ;
                } catch (IOException e) {
                    C6PB.LIZJ().LIZ(android.util.Log.getStackTraceString(e));
                    c76800UCe = C76800UCe.LIZ;
                }
                C16880lQ.LLLZZIL(file);
                return c76800UCe;
            } catch (Throwable th) {
                C16880lQ.LLLZZIL(file);
                throw th;
            }
        } catch (Exception e2) {
            InterfaceC1554368d LIZJ = C6PB.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EffectExt unzipEffectRes, effect id : ");
            LIZ.append(this.LJLIL.getEffectId());
            LIZ.append(" , exception : ");
            LIZ.append(android.util.Log.getStackTraceString(e2));
            LIZJ.LIZ(X1D.LIZIZ(LIZ));
            return C76800UCe.LIZ;
        }
    }
}
