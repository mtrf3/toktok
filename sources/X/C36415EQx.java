package X;

import Y.ARunnableS15S0301000_15;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect2;
import fjb.a;
import kotlin.jvm.internal.AqS172S0100000_6;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.newexport.exportutils.AnnotationExportUtils$Companion$saveSticker$result$1", f = "AnnotationExportUtils.kt", l = {27}, m = "invokeSuspend")
/* renamed from: X.EQx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36415EQx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ XN6 LJLILLLLZI;
    public final /* synthetic */ UploadableMobileEffect2 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36415EQx(XN6 xn6, UploadableMobileEffect2 uploadableMobileEffect2, InterfaceC67352kd<? super C36415EQx> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = xn6;
        this.LJLJI = uploadableMobileEffect2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36415EQx(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
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
            XN6 xn6 = this.LJLILLLLZI;
            UploadableMobileEffect2 uploadableMobileEffect2 = this.LJLJI;
            this.LJLIL = 1;
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            String str = uploadableMobileEffect2.zipFilePath;
            if (xn6 == null) {
                Boolean bool = Boolean.FALSE;
                C3C5.m7constructorimpl(bool);
                c84654XKg.resumeWith(bool);
            } else {
                C38995FSd.LIZJ().execute(new ARunnableS15S0301000_15(0, xn6, str, new C36451ESh(new AqS172S0100000_6(c84654XKg, 127)), 2));
            }
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
