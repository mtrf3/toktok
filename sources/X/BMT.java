package X;

import fjb.a;
import java.util.ArrayList;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.live.listprovider.DrawRoomListProvider$preCheckDNSStatus$1", f = "DrawRoomListProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BMT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ArrayList<String> LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BMT(ArrayList<String> arrayList, InterfaceC67352kd<? super BMT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = arrayList;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new BMT(this.LJLIL, interfaceC67352kd);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v26, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v35, types: [T, java.lang.String] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BMT.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
