package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.EffectParseOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IRewardEffectsListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.QueryRewardEffectsResponse;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchRewardEffects$1$1", f = "StickerEffectViewModel.kt", l = {342}, m = "invokeSuspend")
/* renamed from: X.2He, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55862He extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C31941Ne>, Object> {
    public int LJLIL;
    public final /* synthetic */ StickerEffectViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55862He(StickerEffectViewModel stickerEffectViewModel, InterfaceC67352kd<? super C55862He> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = stickerEffectViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55862He(this.LJLILLLLZI, interfaceC67352kd);
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
            C39011g1 c39011g1 = this.LJLILLLLZI.LJLJJI;
            this.LJLIL = 1;
            c39011g1.getClass();
            if (EffectParseOptSetting.enableOpt()) {
                obj = c39011g1.LJIILJJIL(this);
            } else {
                final C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
                c39011g1.LJLILLLLZI.fetchRewardEffects(c39011g1.LJLIL, 100, 0, null, new IRewardEffectsListener() { // from class: X.1pL
                    @Override // com.ss.android.ugc.effectmanager.effect.listener.IRewardEffectsListener
                    public final void onFailed(ExceptionResult exceptionResult) {
                        InterfaceC67352kd<C31941Ne> interfaceC67352kd = c84654XKg;
                        C3C5.m7constructorimpl(null);
                        interfaceC67352kd.resumeWith(null);
                    }

                    @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                    public final void onSuccess(QueryRewardEffectsResponse queryRewardEffectsResponse) {
                        List<Effect> rewardEffects;
                        QueryRewardEffectsResponse queryRewardEffectsResponse2 = queryRewardEffectsResponse;
                        if (queryRewardEffectsResponse2 != null && (rewardEffects = queryRewardEffectsResponse2.getRewardEffects()) != null) {
                            ArrayList arrayList = new ArrayList(C32I.LJJL(rewardEffects, 10));
                            Iterator<Effect> it = rewardEffects.iterator();
                            while (it.hasNext()) {
                                LiveEffect LIZIZ = C0LT.LIZIZ(it.next());
                                LIZIZ.effectPanelName = C0TY.LJIIIZ;
                                LIZIZ.effectPanelKey = "livereward";
                                C77412UZs.LJIIL(LIZIZ, 1);
                                arrayList.add(LIZIZ);
                            }
                            if (!arrayList.isEmpty()) {
                                List LJJIIJ = C78880UxY.LJJIIJ(C78880UxY.LJJIII(C79004UzY.LJIIJ(arrayList)));
                                InterfaceC67352kd<C31941Ne> interfaceC67352kd = c84654XKg;
                                C31941Ne c31941Ne = new C31941Ne(LJJIIJ, "livereward", 12);
                                C3C5.m7constructorimpl(c31941Ne);
                                interfaceC67352kd.resumeWith(c31941Ne);
                                return;
                            }
                        }
                        InterfaceC67352kd<C31941Ne> interfaceC67352kd2 = c84654XKg;
                        C3C5.m7constructorimpl(null);
                        interfaceC67352kd2.resumeWith(null);
                    }
                });
                obj = c84654XKg.LIZ();
            }
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C31941Ne> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
