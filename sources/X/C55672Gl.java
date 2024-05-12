package X;

import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel$fetchCategoryData$1", f = "LiveSmallItemBeautyViewModel.kt", l = {LiveAnchorEnableInnerBeautyMaxValue.DEFAULT, 88, 91, 94}, m = "invokeSuspend")
/* renamed from: X.2Gl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55672Gl extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LJLJJI;
    public final /* synthetic */ String LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55672Gl(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, String str, InterfaceC67352kd<? super C55672Gl> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = liveSmallItemBeautyViewModel;
        this.LJLJJL = str;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55672Gl(this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00bf: MOVE (r2 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:16777407), block:B:57:0x00bf */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:15:0x001d, B:20:0x005d, B:22:0x0064, B:26:0x007e, B:27:0x0084, B:29:0x008a, B:32:0x0099, B:34:0x009d, B:36:0x00a3, B:39:0x00a1, B:49:0x002e, B:51:0x003d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[Catch: Exception -> 0x00be, TryCatch #0 {Exception -> 0x00be, blocks: (B:15:0x001d, B:20:0x005d, B:22:0x0064, B:26:0x007e, B:27:0x0084, B:29:0x008a, B:32:0x0099, B:34:0x009d, B:36:0x00a3, B:39:0x00a1, B:49:0x002e, B:51:0x003d), top: B:2:0x0009 }] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55672Gl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
