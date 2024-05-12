package X;

import android.os.Bundle;
import com.bytedance.ugc.effectcreator.main.recovery.RecoveryImpl;
import com.ugc.effectcreator.effectcore.sdk.CKEffectEditorContext;
import fjb.a;
import java.lang.reflect.Type;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.ugc.effectcreator.main.recovery.RecoveryImpl$onRestore$1", f = "RecoveryImpl.kt", l = {118}, m = "invokeSuspend")
/* renamed from: X.ami, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94792ami extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ RecoveryImpl LJLILLLLZI;
    public final /* synthetic */ Bundle LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94792ami(RecoveryImpl recoveryImpl, Bundle bundle, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = recoveryImpl;
        this.LJLJI = bundle;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94792ami(this.LJLILLLLZI, this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC93936aYu enumC93936aYu;
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
            C3BJ<EnumC93946aZ4> c3bj = this.LJLILLLLZI.recoveryEvent;
            EnumC93946aZ4 enumC93946aZ4 = EnumC93946aZ4.StartRecovery;
            this.LJLIL = 1;
            if (c3bj.emit(enumC93946aZ4, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        this.LJLILLLLZI.restoring = true;
        int i2 = this.LJLJI.getInt("cke:recovery:edit_mode", 0);
        RecoveryImpl recoveryImpl = this.LJLILLLLZI;
        EnumC93936aYu[] values = EnumC93936aYu.values();
        int LJIIL = C78842Uww.LJIIL(i2, 0, values.length - 1);
        if (values.length == 0) {
            enumC93936aYu = EnumC93936aYu.Canvas;
        } else {
            enumC93936aYu = values[LJIIL];
        }
        recoveryImpl.restoredEditMode = enumC93936aYu;
        RecoveryImpl recoveryImpl2 = this.LJLILLLLZI;
        String it = this.LJLJI.getString("cke:recovery:template_info", "");
        C93907aYR.LIZ();
        o.LJIIIIZZ(it, "it");
        Type type = new C94117abp().getType();
        o.LJIIIIZZ(type, "genericType<T>()");
        C94273aeL c94273aeL = (C94273aeL) C93908aYS.LIZ(it, type);
        if (c94273aeL == null) {
            c94273aeL = new C94273aeL("", "", "");
        }
        recoveryImpl2.restoredTemplateInfo = c94273aeL;
        this.LJLILLLLZI.restoredCreateFrom = this.LJLJI.getInt("cke:recovery:project", 0);
        RecoveryImpl recoveryImpl3 = this.LJLILLLLZI;
        String string = this.LJLJI.getString("cke:recovery:project", "");
        o.LJIIIIZZ(string, "bundle.getString(RECOVERY_PROJECT_KEY, \"\")");
        recoveryImpl3.restoredDraftPath = string;
        RecoveryImpl recoveryImpl4 = this.LJLILLLLZI;
        String string2 = this.LJLJI.getString("cke:recovery:model_picture", "");
        o.LJIIIIZZ(string2, "bundle.getString(RECOVERY_MODEL_PICTURE_KEY, \"\")");
        recoveryImpl4.restoredModelPictureId = string2;
        CKEffectEditorContext.LIZLLL(new IDqS423S0100000_42(this, 60));
        return C76800UCe.LIZ;
    }
}
