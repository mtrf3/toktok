package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchStickerList$1", f = "StickerEffectViewModel.kt", l = {172, 174, 177}, m = "invokeSuspend")
/* renamed from: X.2Hg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55882Hg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ StickerEffectViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55882Hg(String str, StickerEffectViewModel stickerEffectViewModel, InterfaceC67352kd<? super C55882Hg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = stickerEffectViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55882Hg(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x004f -> B:14:0x0012). Please report as a decompilation issue!!! */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
        } catch (Exception unused) {
            XLL xll = this.LJLJI.LJLJI;
            C37041cq c37041cq = new C37041cq(true, "fetchCategoryList failed");
            this.LJLIL = 3;
            if (xll.emit(c37041cq, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (i != 0) {
            if (i != 1 && i != 2) {
                if (i == 3) {
                    C141335gf.LIZJ(obj);
                    return C76800UCe.LIZ;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C141335gf.LIZJ(obj);
        } else {
            C141335gf.LIZJ(obj);
            if (o.LJ(this.LJLILLLLZI, "livereward")) {
                StickerEffectViewModel stickerEffectViewModel = this.LJLJI;
                this.LJLIL = 1;
                if (stickerEffectViewModel.rv0(this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            } else {
                StickerEffectViewModel stickerEffectViewModel2 = this.LJLJI;
                String str = this.LJLILLLLZI;
                this.LJLIL = 2;
                if (stickerEffectViewModel2.qv0(str, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
