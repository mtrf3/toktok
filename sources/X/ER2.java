package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.effectlogic.AnnotationEffectExportLogic$saveIcon$2", f = "AnnotationEffectExportLogic.kt", l = {129, 141}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ER2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public C68322mC LJLIL;
    public C68322mC LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ Effect LJLJJI;
    public final /* synthetic */ ER5 LJLJJL;
    public final /* synthetic */ Bitmap LJLJJLL;
    public final /* synthetic */ UploadableMobileEffect2 LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ER2(Effect effect, ER5 er5, Bitmap bitmap, UploadableMobileEffect2 uploadableMobileEffect2, InterfaceC67352kd<? super ER2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = effect;
        this.LJLJJL = er5;
        this.LJLJJLL = bitmap;
        this.LJLJL = uploadableMobileEffect2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new ER2(this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a5  */
    /* JADX WARN: Type inference failed for: r0v25, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r0v48, types: [T, android.graphics.Bitmap] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ER2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
