package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;
import java.io.File;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.editSticker.effectPlatform.EffectExtKt$isUnzipEffectResExistAsync$2", f = "EffectExt.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6Fe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157266Fe extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ Effect LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C157266Fe(Effect effect, InterfaceC67352kd<? super C157266Fe> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = effect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C157266Fe(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        File[] listFiles;
        String str;
        C141335gf.LIZJ(obj);
        try {
            File file = new File(this.LJLIL.getUnzipPath());
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2 != null) {
                        str = file2.getName();
                    } else {
                        str = null;
                    }
                    if (o.LJ(str, "config.json")) {
                        return Boolean.TRUE;
                    }
                }
            }
            return Boolean.FALSE;
        } catch (Exception e) {
            InterfaceC1554368d LIZJ = C6PB.LIZJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("EffectExt isUnzipEffectResExistAsync, effect id : ");
            LIZ.append(this.LJLIL.getEffectId());
            LIZ.append(" , exception : ");
            LIZ.append(android.util.Log.getStackTraceString(e));
            LIZJ.LIZ(X1D.LIZIZ(LIZ));
            return Boolean.FALSE;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
