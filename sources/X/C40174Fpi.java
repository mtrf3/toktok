package X;

import android.content.MutableContextWrapper;
import com.bytedance.hybrid.spark.SparkContext;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommerce.lynx.spark.SparkPreload$deferred$1", f = "SparkPreload.kt", l = {44}, m = "invokeSuspend")
/* renamed from: X.Fpi, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40174Fpi extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS>, Object> {
    public int LJLIL;
    public final /* synthetic */ SparkContext LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40174Fpi(SparkContext sparkContext, InterfaceC67352kd<? super C40174Fpi> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = sparkContext;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C40174Fpi(this.LJLILLLLZI, interfaceC67352kd);
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
            this.LJLIL = 1;
            if (XJ9.LIZ(this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        SparkContext sparkContext = this.LJLILLLLZI;
        sparkContext.usePreload = true;
        sparkContext.LJJIIJ("enable_pending_js_task", "1");
        sparkContext.LJJIIZ("1", "usePreload");
        C39836FkG.LJII.getClass();
        MutableContextWrapper mutableContextWrapper = new MutableContextWrapper(C38262Ezy.LIZ().LIZIZ());
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext sparkContext2 = this.LJLILLLLZI;
        c40342FsQ.getClass();
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ = C40343FsR.LIZ(C40342FsQ.LIZ(mutableContextWrapper, sparkContext2));
        LIZ.LIZIZ();
        return LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
