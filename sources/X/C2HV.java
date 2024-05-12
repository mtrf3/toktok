package X;

import com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel$fetchStickersNew$1", f = "MultiGuestStickerViewModel.kt", l = {106, 108}, m = "invokeSuspend")
/* renamed from: X.2HV, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public long LJLJJI;
    public int LJLJJL;
    public /* synthetic */ Object LJLJJLL;
    public final /* synthetic */ MultiGuestStickerViewModel LJLJL;
    public final /* synthetic */ int LJLJLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2HV(MultiGuestStickerViewModel multiGuestStickerViewModel, int i, InterfaceC67352kd<? super C2HV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJL = multiGuestStickerViewModel;
        this.LJLJLJ = i;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2HV c2hv = new C2HV(this.LJLJL, this.LJLJLJ, interfaceC67352kd);
        c2hv.LJLJJLL = obj;
        return c2hv;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005d  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2HV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
