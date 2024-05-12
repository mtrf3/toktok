package X;

import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel$handleSongUserAction$2", f = "KaraokeViewModel.kt", l = {781, 795, 805, 833, 848, 858, 865, 871}, m = "invokeSuspend")
/* renamed from: X.2By, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54502By extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ C31271Kp LJLJI;
    public final /* synthetic */ KaraokeViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54502By(KaraokeViewModel karaokeViewModel, C31271Kp c31271Kp, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = c31271Kp;
        this.LJLJJI = karaokeViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C54502By c54502By = new C54502By(this.LJLJJI, this.LJLJI, interfaceC67352kd);
        c54502By.LJLILLLLZI = obj;
        return c54502By;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:12:0x002f. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0221 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0161 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01d4 A[Catch: all -> 0x0244, TryCatch #2 {all -> 0x0244, blocks: (B:7:0x0017, B:11:0x0023, B:12:0x002f, B:15:0x0200, B:18:0x0215, B:22:0x0034, B:25:0x0059, B:28:0x0065, B:30:0x006d, B:33:0x009e, B:34:0x00a6, B:37:0x0127, B:42:0x016d, B:74:0x01a7, B:68:0x0223, B:69:0x0243, B:44:0x00d9, B:47:0x00fa, B:48:0x0102, B:51:0x01cc, B:53:0x01d4, B:55:0x01ee, B:57:0x01f6, B:58:0x0062, B:59:0x009b, B:60:0x00f7, B:62:0x0124, B:65:0x01c9, B:38:0x0156, B:41:0x0167, B:73:0x018e, B:64:0x0164), top: B:2:0x000c, inners: #0 }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54502By.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
