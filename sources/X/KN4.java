package X;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCardViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.recommendationcard.view.EffectRecommendationCardViewModel$1", f = "EffectRecommendationCardViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes9.dex */
public final class KN4 extends AbstractC65782Prm implements InterfaceC88471Ynr<KN6, InterfaceC67352kd<? super C76800UCe>, Object> {
    public /* synthetic */ Object LJLIL;
    public final /* synthetic */ EffectRecommendationCardViewModel LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KN4(EffectRecommendationCardViewModel effectRecommendationCardViewModel, InterfaceC67352kd<? super KN4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = effectRecommendationCardViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        KN4 kn4 = new KN4(this.LJLILLLLZI, interfaceC67352kd);
        kn4.LJLIL = obj;
        return kn4;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        KN3 kn3;
        Integer num;
        C141335gf.LIZJ(obj);
        KN6 kn6 = (KN6) this.LJLIL;
        EffectRecommendationCardViewModel effectRecommendationCardViewModel = this.LJLILLLLZI;
        effectRecommendationCardViewModel.getClass();
        KN3 kn32 = null;
        Integer num2 = null;
        if (kn6 instanceof KNI) {
            XKX.LIZLLL(ViewModelKt.getViewModelScope(effectRecommendationCardViewModel), null, null, new KN2(((KNI) kn6).LIZ, effectRecommendationCardViewModel, null), 3);
        } else if (kn6 instanceof KNG) {
            KNG kng = (KNG) kn6;
            String str = kng.LIZIZ;
            if (str != null) {
                C59895Nf1.LIZLLL(kng.LIZJ, "//stickers/detail", "id", str);
                Integer num3 = kng.LIZ;
                if (num3 != null) {
                    num2 = C77339UWx.LIZIZ(num3, 1);
                }
                C78880UxY.LJJLIIIJL("click_recommend_card", K3S.LIZ(num2, str, "prop_three_card"));
                KN3 value = effectRecommendationCardViewModel.LJLJL.getValue();
                if (value != null) {
                    Object value2 = effectRecommendationCardViewModel.LJLILLLLZI.getValue();
                    String str2 = value.LJFF;
                    value2.getClass();
                    KNW.LIZJ(str2);
                }
            }
        } else if (kn6 instanceof KN8) {
            KN8 kn8 = (KN8) kn6;
            String str3 = kn8.LIZIZ;
            if (str3 != null) {
                PropReuseServiceImpl.LJIIJ().LJFF(kn8.LIZJ, C47261Igj.LJJIJ(str3), new C74181T9l(null, "prop_recommend_card", null, null, false, null, null, "homepage_hot", "click_prop_publish", null, null, null, null, false, null, null, null, null, null, false, null, null, null, 16776829), AVExternalServiceImpl.LIZ().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera());
                Integer num4 = kn8.LIZ;
                if (num4 != null) {
                    num = C77339UWx.LIZIZ(num4, 1);
                } else {
                    num = null;
                }
                C78880UxY.LJJLIIIJL("commerce_prop_click", K3S.LIZ(num, str3, "prop_three_card"));
                KN3 value3 = effectRecommendationCardViewModel.LJLJL.getValue();
                if (value3 != null) {
                    Object value4 = effectRecommendationCardViewModel.LJLILLLLZI.getValue();
                    String str4 = value3.LJFF;
                    value4.getClass();
                    KNW.LIZJ(str4);
                }
            }
        } else if (kn6 instanceof KNK) {
            if (C48203Ivv.LJ(((KNK) kn6).LIZ)) {
                effectRecommendationCardViewModel.jv0();
                MutableLiveData<KN3> mutableLiveData = effectRecommendationCardViewModel.LJLJL;
                KN3 value5 = mutableLiveData.getValue();
                if (value5 != null) {
                    kn32 = KN3.LIZ(value5, null, null, null, null, null, null, false, 63);
                }
                mutableLiveData.setValue(kn32);
            }
        } else if (kn6 instanceof KN7) {
            effectRecommendationCardViewModel.LJLJJI = true;
            KN7 kn7 = (KN7) kn6;
            if (C48203Ivv.LJ(kn7.LIZ)) {
                effectRecommendationCardViewModel.jv0();
                effectRecommendationCardViewModel.iv0();
            } else {
                MutableLiveData<KN3> mutableLiveData2 = effectRecommendationCardViewModel.LJLJL;
                KN3 value6 = mutableLiveData2.getValue();
                if (value6 != null) {
                    kn3 = KN3.LIZ(value6, null, null, null, null, null, null, true, 63);
                } else {
                    kn3 = null;
                }
                mutableLiveData2.setValue(kn3);
            }
            effectRecommendationCardViewModel.kv0(kn7.LIZIZ, kn7.LIZJ, C123194sV.LJLIL);
        } else if (kn6 instanceof KNH) {
            effectRecommendationCardViewModel.LJLJJI = false;
            effectRecommendationCardViewModel.LJLJJL = false;
            effectRecommendationCardViewModel.hv0().pause();
            effectRecommendationCardViewModel.kv0(((KNH) kn6).LIZ, null, C2307693w.LJLIL);
        } else if (kn6 instanceof KNS) {
            effectRecommendationCardViewModel.hv0().stop();
        } else if (kn6 instanceof KNJ) {
            effectRecommendationCardViewModel.hv0().resume();
            effectRecommendationCardViewModel.kv0(((KNJ) kn6).LIZ, null, C123204sW.LJLIL);
        } else if (kn6 instanceof KNR) {
            effectRecommendationCardViewModel.iv0();
            effectRecommendationCardViewModel.jv0();
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(KN6 kn6, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(kn6, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
