package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$searchSong$2", f = "KaraokeViewModel.kt", l = {722, 731, 735, 737, 741, 743, 748, 754}, m = "invokeSuspend")
/* renamed from: X.2C6, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2C6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C0EY LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ KaraokeViewModel LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2C6(String str, KaraokeViewModel karaokeViewModel, boolean z, InterfaceC67352kd<? super C2C6> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = str;
        this.LJLJJL = karaokeViewModel;
        this.LJLJJLL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2C6(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0008. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7 A[Catch: all -> 0x014b, TryCatch #0 {all -> 0x014b, blocks: (B:8:0x00bb, B:9:0x00be, B:12:0x00d3, B:13:0x00d6, B:16:0x00e4, B:19:0x00f7, B:21:0x00ff, B:24:0x0112, B:26:0x0132, B:32:0x009a, B:33:0x009d, B:36:0x00a3, B:38:0x00a7, B:47:0x0058, B:52:0x0075, B:54:0x0085, B:66:0x00d0, B:67:0x0147), top: B:2:0x0008 }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2C6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
