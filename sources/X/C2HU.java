package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.INothingListener;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$updateRecentEffect$1", f = "StickerEffectViewModel.kt", l = {93}, m = "invokeSuspend")
/* renamed from: X.2HU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2HU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ StickerEffectViewModel LJLILLLLZI;
    public final /* synthetic */ LiveEffect LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2HU(StickerEffectViewModel stickerEffectViewModel, LiveEffect liveEffect, InterfaceC67352kd<? super C2HU> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = stickerEffectViewModel;
        this.LJLJI = liveEffect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2HU(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            final C39011g1 c39011g1 = this.LJLILLLLZI.LJLJJI;
            final LiveEffect liveEffect = this.LJLJI;
            this.LJLIL = 1;
            c39011g1.getClass();
            final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            c39011g1.LJIJJ(liveEffect, true);
            c39011g1.LJLILLLLZI.updateUsedEffect(c39011g1.LJLIL, C47261Igj.LJJIJIL(String.valueOf(liveEffect.effectId)), true, 0L, null, new INothingListener() { // from class: X.1pN
                @Override // com.ss.android.ugc.effectmanager.effect.listener.INothingListener
                public final void onFail(ExceptionResult e) {
                    o.LJIIIZ(e, "e");
                    C39011g1.this.LJIJJ(liveEffect, false);
                    InterfaceC67352kd interfaceC67352kd = c84654XKg;
                    C1QC c1qc = C39011g1.this.LJLJLLL;
                    C3C5.m7constructorimpl(c1qc);
                    interfaceC67352kd.resumeWith(c1qc);
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Object response) {
                    o.LJIIIZ(response, "response");
                    InterfaceC67352kd interfaceC67352kd = c84654XKg;
                    C1QC c1qc = C39011g1.this.LJLJLLL;
                    C3C5.m7constructorimpl(c1qc);
                    interfaceC67352kd.resumeWith(c1qc);
                }
            });
            if (c84654XKg.LIZ() == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
