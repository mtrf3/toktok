package X;

import com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.effectcreatormobile.objectselect.gif.GifsViewModel$loadMoreGifs$1", f = "GifsViewModel.kt", l = {56, 58, 60, 66, 67, 70}, m = "invokeSuspend")
/* renamed from: X.alw, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94744alw extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ GifsViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94744alw(GifsViewModel gifsViewModel, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = gifsViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new C94744alw(this.LJLILLLLZI, completion);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0005. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035 A[Catch: Exception -> 0x00fb, TryCatch #0 {Exception -> 0x00fb, blocks: (B:8:0x0013, B:11:0x0027, B:13:0x0035, B:15:0x003b, B:18:0x0052, B:20:0x0076, B:22:0x0092, B:24:0x0096, B:26:0x009c, B:27:0x00b3, B:29:0x00b9, B:31:0x00cf, B:34:0x00e6, B:37:0x00ca, B:42:0x0055, B:44:0x005b, B:47:0x0070, B:48:0x0024, B:49:0x004f, B:50:0x006d, B:51:0x00e3, B:52:0x00f7), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[Catch: Exception -> 0x00fb, TryCatch #0 {Exception -> 0x00fb, blocks: (B:8:0x0013, B:11:0x0027, B:13:0x0035, B:15:0x003b, B:18:0x0052, B:20:0x0076, B:22:0x0092, B:24:0x0096, B:26:0x009c, B:27:0x00b3, B:29:0x00b9, B:31:0x00cf, B:34:0x00e6, B:37:0x00ca, B:42:0x0055, B:44:0x005b, B:47:0x0070, B:48:0x0024, B:49:0x004f, B:50:0x006d, B:51:0x00e3, B:52:0x00f7), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0055 A[Catch: Exception -> 0x00fb, TryCatch #0 {Exception -> 0x00fb, blocks: (B:8:0x0013, B:11:0x0027, B:13:0x0035, B:15:0x003b, B:18:0x0052, B:20:0x0076, B:22:0x0092, B:24:0x0096, B:26:0x009c, B:27:0x00b3, B:29:0x00b9, B:31:0x00cf, B:34:0x00e6, B:37:0x00ca, B:42:0x0055, B:44:0x005b, B:47:0x0070, B:48:0x0024, B:49:0x004f, B:50:0x006d, B:51:0x00e3, B:52:0x00f7), top: B:2:0x0005 }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94744alw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
