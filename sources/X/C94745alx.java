package X;

import com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel$searchGifs$1", f = "GifsViewModel.kt", l = {81, 82, 83, 86, 89}, m = "invokeSuspend")
/* renamed from: X.alx, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94745alx extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public ProviderEffectModel LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ GifsViewModel LJLJI;
    public final /* synthetic */ String LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94745alx(GifsViewModel gifsViewModel, String str, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = gifsViewModel;
        this.LJLJJI = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94745alx(this.LJLJI, this.LJLJJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad A[Catch: Exception -> 0x00cf, LOOP:0: B:19:0x00a7->B:21:0x00ad, LOOP_END, TryCatch #0 {Exception -> 0x00cf, blocks: (B:15:0x001c, B:17:0x007d, B:18:0x0080, B:19:0x00a7, B:21:0x00ad, B:23:0x00be, B:27:0x0057, B:28:0x005a, B:30:0x005f, B:32:0x006b, B:37:0x003a, B:38:0x003d, B:40:0x0043, B:45:0x0026), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f A[Catch: Exception -> 0x00cf, TryCatch #0 {Exception -> 0x00cf, blocks: (B:15:0x001c, B:17:0x007d, B:18:0x0080, B:19:0x00a7, B:21:0x00ad, B:23:0x00be, B:27:0x0057, B:28:0x005a, B:30:0x005f, B:32:0x006b, B:37:0x003a, B:38:0x003d, B:40:0x0043, B:45:0x0026), top: B:2:0x000a }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94745alx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
