package X;

import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel$fetchSubCategoryData$1", f = "LiveSmallItemBeautyViewModel.kt", l = {64, 67, 71, 74}, m = "invokeSuspend")
/* renamed from: X.2Gn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55692Gn extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55692Gn(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, String str, String str2, InterfaceC67352kd<? super C55692Gn> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = liveSmallItemBeautyViewModel;
        this.LJLJJL = str;
        this.LJLJJLL = str2;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55692Gn(this.LJLJJI, this.LJLJJL, this.LJLJJLL, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00e5: MOVE (r2 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:16777445), block:B:70:0x00e5 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[Catch: Exception -> 0x00e4, TryCatch #1 {Exception -> 0x00e4, blocks: (B:15:0x001d, B:20:0x005e, B:22:0x0064, B:26:0x007d, B:27:0x0083, B:29:0x0089, B:32:0x0098, B:34:0x009c, B:36:0x00a2, B:37:0x00a8, B:39:0x00ae, B:42:0x00bf, B:44:0x00cb, B:45:0x00cd, B:52:0x00a0, B:62:0x002e, B:64:0x003d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[Catch: Exception -> 0x00e4, TryCatch #1 {Exception -> 0x00e4, blocks: (B:15:0x001d, B:20:0x005e, B:22:0x0064, B:26:0x007d, B:27:0x0083, B:29:0x0089, B:32:0x0098, B:34:0x009c, B:36:0x00a2, B:37:0x00a8, B:39:0x00ae, B:42:0x00bf, B:44:0x00cb, B:45:0x00cd, B:52:0x00a0, B:62:0x002e, B:64:0x003d), top: B:2:0x0009 }] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.List] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55692Gn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
