package X;

import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.bgeffect.BgEffectViewModel$fetchCategoryList$1", f = "BgEffectViewModel.kt", l = {82, 88, 92, 95, 96, 97, 102, 104, 107}, m = "invokeSuspend")
/* renamed from: X.2AD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2AD extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ BgEffectViewModel LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2AD(BgEffectViewModel bgEffectViewModel, String str, InterfaceC67352kd<? super C2AD> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = bgEffectViewModel;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2AD(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0007. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0137 A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:8:0x010e, B:9:0x0111, B:10:0x0131, B:12:0x0137, B:14:0x013d, B:19:0x0156, B:21:0x015e, B:25:0x00ef, B:26:0x00f2, B:28:0x00fa, B:32:0x00d8, B:33:0x00db, B:37:0x0120, B:38:0x0123, B:40:0x0094, B:41:0x0097, B:42:0x00a5, B:44:0x00ab, B:47:0x00bf, B:51:0x005e, B:53:0x0080, B:59:0x0178), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015e A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:8:0x010e, B:9:0x0111, B:10:0x0131, B:12:0x0137, B:14:0x013d, B:19:0x0156, B:21:0x015e, B:25:0x00ef, B:26:0x00f2, B:28:0x00fa, B:32:0x00d8, B:33:0x00db, B:37:0x0120, B:38:0x0123, B:40:0x0094, B:41:0x0097, B:42:0x00a5, B:44:0x00ab, B:47:0x00bf, B:51:0x005e, B:53:0x0080, B:59:0x0178), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fa A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:8:0x010e, B:9:0x0111, B:10:0x0131, B:12:0x0137, B:14:0x013d, B:19:0x0156, B:21:0x015e, B:25:0x00ef, B:26:0x00f2, B:28:0x00fa, B:32:0x00d8, B:33:0x00db, B:37:0x0120, B:38:0x0123, B:40:0x0094, B:41:0x0097, B:42:0x00a5, B:44:0x00ab, B:47:0x00bf, B:51:0x005e, B:53:0x0080, B:59:0x0178), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ab A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:8:0x010e, B:9:0x0111, B:10:0x0131, B:12:0x0137, B:14:0x013d, B:19:0x0156, B:21:0x015e, B:25:0x00ef, B:26:0x00f2, B:28:0x00fa, B:32:0x00d8, B:33:0x00db, B:37:0x0120, B:38:0x0123, B:40:0x0094, B:41:0x0097, B:42:0x00a5, B:44:0x00ab, B:47:0x00bf, B:51:0x005e, B:53:0x0080, B:59:0x0178), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:8:0x010e, B:9:0x0111, B:10:0x0131, B:12:0x0137, B:14:0x013d, B:19:0x0156, B:21:0x015e, B:25:0x00ef, B:26:0x00f2, B:28:0x00fa, B:32:0x00d8, B:33:0x00db, B:37:0x0120, B:38:0x0123, B:40:0x0094, B:41:0x0097, B:42:0x00a5, B:44:0x00ab, B:47:0x00bf, B:51:0x005e, B:53:0x0080, B:59:0x0178), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0080 A[Catch: Exception -> 0x017c, TryCatch #0 {Exception -> 0x017c, blocks: (B:8:0x010e, B:9:0x0111, B:10:0x0131, B:12:0x0137, B:14:0x013d, B:19:0x0156, B:21:0x015e, B:25:0x00ef, B:26:0x00f2, B:28:0x00fa, B:32:0x00d8, B:33:0x00db, B:37:0x0120, B:38:0x0123, B:40:0x0094, B:41:0x0097, B:42:0x00a5, B:44:0x00ab, B:47:0x00bf, B:51:0x005e, B:53:0x0080, B:59:0x0178), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2AD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
