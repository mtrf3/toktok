package X;

import com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel;
import com.ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel$loadTrendGifs$1", f = "GifsViewModel.kt", l = {37, 38, 39, 42, 45}, m = "invokeSuspend")
/* renamed from: X.amC, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94760amC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public ProviderEffectModel LJLIL;
    public int LJLILLLLZI;
    public final /* synthetic */ GifsViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94760amC(GifsViewModel gifsViewModel, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = gifsViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94760amC(this.LJLJI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac A[Catch: Exception -> 0x00ce, LOOP:0: B:19:0x00a6->B:21:0x00ac, LOOP_END, TryCatch #0 {Exception -> 0x00ce, blocks: (B:15:0x001c, B:17:0x007c, B:18:0x007f, B:19:0x00a6, B:21:0x00ac, B:23:0x00bd, B:27:0x0055, B:28:0x0058, B:30:0x005d, B:32:0x0069, B:37:0x003a, B:38:0x003d, B:40:0x0043, B:45:0x0026), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[Catch: Exception -> 0x00ce, TryCatch #0 {Exception -> 0x00ce, blocks: (B:15:0x001c, B:17:0x007c, B:18:0x007f, B:19:0x00a6, B:21:0x00ac, B:23:0x00bd, B:27:0x0055, B:28:0x0058, B:30:0x005d, B:32:0x0069, B:37:0x003a, B:38:0x003d, B:40:0x0043, B:45:0x0026), top: B:2:0x000a }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94760amC.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
