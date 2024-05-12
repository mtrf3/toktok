package X;

import com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.MultiGuestStickerViewModel$fetchStickersNew$1$broadcastEffectList$1", f = "MultiGuestStickerViewModel.kt", l = {76, 81, 82, 84, 86}, m = "invokeSuspend")
/* renamed from: X.2HS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HS extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<LiveEffect>>, Object> {
    public MultiGuestStickerViewModel LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ MultiGuestStickerViewModel LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2HS(MultiGuestStickerViewModel multiGuestStickerViewModel, InterfaceC67352kd<? super C2HS> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = multiGuestStickerViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2HS(this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ee A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:12:0x00cd, B:13:0x00d0, B:14:0x00d8, B:15:0x00e7, B:17:0x00ee, B:23:0x00ff, B:19:0x00f9, B:28:0x00a7, B:29:0x00aa, B:31:0x00b5, B:33:0x00b9, B:38:0x00d3, B:39:0x00d6, B:41:0x007a, B:42:0x007d, B:44:0x0085, B:47:0x0096, B:51:0x0041, B:52:0x0044, B:54:0x004f, B:56:0x0053, B:60:0x0109, B:64:0x0032), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ff A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:12:0x00cd, B:13:0x00d0, B:14:0x00d8, B:15:0x00e7, B:17:0x00ee, B:23:0x00ff, B:19:0x00f9, B:28:0x00a7, B:29:0x00aa, B:31:0x00b5, B:33:0x00b9, B:38:0x00d3, B:39:0x00d6, B:41:0x007a, B:42:0x007d, B:44:0x0085, B:47:0x0096, B:51:0x0041, B:52:0x0044, B:54:0x004f, B:56:0x0053, B:60:0x0109, B:64:0x0032), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9 A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:12:0x00cd, B:13:0x00d0, B:14:0x00d8, B:15:0x00e7, B:17:0x00ee, B:23:0x00ff, B:19:0x00f9, B:28:0x00a7, B:29:0x00aa, B:31:0x00b5, B:33:0x00b9, B:38:0x00d3, B:39:0x00d6, B:41:0x007a, B:42:0x007d, B:44:0x0085, B:47:0x0096, B:51:0x0041, B:52:0x0044, B:54:0x004f, B:56:0x0053, B:60:0x0109, B:64:0x0032), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0085 A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:12:0x00cd, B:13:0x00d0, B:14:0x00d8, B:15:0x00e7, B:17:0x00ee, B:23:0x00ff, B:19:0x00f9, B:28:0x00a7, B:29:0x00aa, B:31:0x00b5, B:33:0x00b9, B:38:0x00d3, B:39:0x00d6, B:41:0x007a, B:42:0x007d, B:44:0x0085, B:47:0x0096, B:51:0x0041, B:52:0x0044, B:54:0x004f, B:56:0x0053, B:60:0x0109, B:64:0x0032), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0096 A[Catch: Exception -> 0x010f, TryCatch #0 {Exception -> 0x010f, blocks: (B:12:0x00cd, B:13:0x00d0, B:14:0x00d8, B:15:0x00e7, B:17:0x00ee, B:23:0x00ff, B:19:0x00f9, B:28:0x00a7, B:29:0x00aa, B:31:0x00b5, B:33:0x00b9, B:38:0x00d3, B:39:0x00d6, B:41:0x007a, B:42:0x007d, B:44:0x0085, B:47:0x0096, B:51:0x0041, B:52:0x0044, B:54:0x004f, B:56:0x0053, B:60:0x0109, B:64:0x0032), top: B:2:0x000a }] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2HS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<LiveEffect>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
