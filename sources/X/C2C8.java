package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$tryNextDownload$1", f = "KaraokeViewModel.kt", l = {1189}, m = "invokeSuspend")
/* renamed from: X.2C8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2C8 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ KaraokeViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2C8(KaraokeViewModel karaokeViewModel, InterfaceC67352kd<? super C2C8> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = karaokeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C2C8 c2c8 = new C2C8(this.LJLJI, interfaceC67352kd);
        c2c8.LJLILLLLZI = obj;
        return c2c8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C84661XKn c84661XKn;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        Object obj2 = this.LJLILLLLZI;
                        C141335gf.LIZJ(obj);
                        c84661XKn = obj2;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C141335gf.LIZJ(obj);
                    c84661XKn = XKX.LIZIZ((InterfaceC70422pa) this.LJLILLLLZI, null, XKY.LAZY, new C2C7(this.LJLJI, null), 1);
                    this.LJLJI.LJLLLLLL.add(c84661XKn);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("download task list = ");
                    LIZ.append(this.LJLJI.LJLLLLLL.size());
                    C0NB.LIZIZ("KDownloader", X1D.LIZIZ(LIZ));
                    try {
                        this.LJLILLLLZI = c84661XKn;
                        this.LJLIL = 1;
                        Object LJJIJ = c84661XKn.LJJIJ(this);
                        c84661XKn = c84661XKn;
                        if (LJJIJ == enumC58928NAu) {
                            return enumC58928NAu;
                        }
                    } catch (Throwable th) {
                        th = th;
                        this.LJLJI.LJLLLLLL.remove(c84661XKn);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("download task list = ");
                        LIZ2.append(this.LJLJI.LJLLLLLL.size());
                        C0NB.LIZIZ("KDownloader", X1D.LIZIZ(LIZ2));
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused) {
            C0NB.LIZIZ("KDownloader", "download canceled try next download");
        }
        this.LJLJI.LJLLLLLL.remove(c84661XKn);
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("download task list = ");
        LIZ3.append(this.LJLJI.LJLLLLLL.size());
        C0NB.LIZIZ("KDownloader", X1D.LIZIZ(LIZ3));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
