package X;

import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.bgeffect.BgEffectViewModel$fetchLatestMultiEffect$1", f = "BgEffectViewModel.kt", l = {LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48, 52, 54, 55, 59, 61, 63, 66}, m = "invokeSuspend")
/* renamed from: X.2Dm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54902Dm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ BgEffectViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54902Dm(BgEffectViewModel bgEffectViewModel, InterfaceC67352kd<? super C54902Dm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = bgEffectViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C54902Dm(this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0009. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ef A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:8:0x00c5, B:9:0x00c8, B:10:0x00e7, B:12:0x00ef, B:17:0x0106, B:19:0x010e, B:22:0x0125, B:26:0x00a8, B:27:0x00ab, B:29:0x00b3, B:33:0x00d8, B:34:0x00db, B:36:0x006f, B:37:0x0072, B:38:0x007e, B:40:0x0084, B:43:0x0096, B:47:0x003e, B:49:0x005e, B:52:0x013c), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0106 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:8:0x00c5, B:9:0x00c8, B:10:0x00e7, B:12:0x00ef, B:17:0x0106, B:19:0x010e, B:22:0x0125, B:26:0x00a8, B:27:0x00ab, B:29:0x00b3, B:33:0x00d8, B:34:0x00db, B:36:0x006f, B:37:0x0072, B:38:0x007e, B:40:0x0084, B:43:0x0096, B:47:0x003e, B:49:0x005e, B:52:0x013c), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:8:0x00c5, B:9:0x00c8, B:10:0x00e7, B:12:0x00ef, B:17:0x0106, B:19:0x010e, B:22:0x0125, B:26:0x00a8, B:27:0x00ab, B:29:0x00b3, B:33:0x00d8, B:34:0x00db, B:36:0x006f, B:37:0x0072, B:38:0x007e, B:40:0x0084, B:43:0x0096, B:47:0x003e, B:49:0x005e, B:52:0x013c), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0084 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:8:0x00c5, B:9:0x00c8, B:10:0x00e7, B:12:0x00ef, B:17:0x0106, B:19:0x010e, B:22:0x0125, B:26:0x00a8, B:27:0x00ab, B:29:0x00b3, B:33:0x00d8, B:34:0x00db, B:36:0x006f, B:37:0x0072, B:38:0x007e, B:40:0x0084, B:43:0x0096, B:47:0x003e, B:49:0x005e, B:52:0x013c), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096 A[Catch: Exception -> 0x0140, TryCatch #0 {Exception -> 0x0140, blocks: (B:8:0x00c5, B:9:0x00c8, B:10:0x00e7, B:12:0x00ef, B:17:0x0106, B:19:0x010e, B:22:0x0125, B:26:0x00a8, B:27:0x00ab, B:29:0x00b3, B:33:0x00d8, B:34:0x00db, B:36:0x006f, B:37:0x0072, B:38:0x007e, B:40:0x0084, B:43:0x0096, B:47:0x003e, B:49:0x005e, B:52:0x013c), top: B:2:0x0009 }] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54902Dm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
