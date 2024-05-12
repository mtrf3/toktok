package X;

import Y.AfS10S0310000_12;
import Y.AfS64S0100000_12;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TJZ extends AbstractC73313Spx implements TJX {
    public final C74439TJj<FetchFavoriteListResponse> LJLILLLLZI;
    public final MutableLiveData<C74437TJh> LJLJI;
    public final MutableLiveData<C74413TIj<FetchFavoriteListResponse>> LJLJJI;
    public final MutableLiveData<Boolean> LJLJJL;
    public final InterfaceC68907R2p<C76800UCe, C74438TJi, C74438TJi, List<String>> LJLJJLL;
    public final AbstractC73941T0f<C58232MtI, FetchFavoriteListResponse> LJLJL;
    public final InterfaceC84497XEf LJLJLJ;

    @Override // X.InterfaceC74443TJn
    public final TJZ LJJJJ() {
        return this;
    }

    @Override // X.TJX
    public final void dispose() {
        release();
    }

    @Override // X.InterfaceC74443TJn
    public final void LJIILIIL(boolean z) {
        this.LJLJJL.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC74443TJn
    public final boolean LJJIL(Effect effect) {
        String str;
        FetchFavoriteListResponse LIZIZ;
        List<Effect> effects;
        if (effect != null) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        if (ID0.LJIILJJIL(effect)) {
            if (effect != null) {
                str = effect.getEffect_source_id();
            } else {
                str = null;
            }
        }
        if (str == null || (LIZIZ = this.LJLILLLLZI.LIZIZ(C76800UCe.LIZ)) == null || (effects = LIZIZ.getEffects()) == null) {
            return false;
        }
        for (Effect effect2 : effects) {
            if (o.LJ(effect2.getEffectId(), str)) {
                if (effect2 == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC74443TJn
    public final boolean LJJJLL(String str) {
        FetchFavoriteListResponse LIZIZ;
        List<Effect> effects;
        if (str == null || (LIZIZ = this.LJLILLLLZI.LIZIZ(C76800UCe.LIZ)) == null || (effects = LIZIZ.getEffects()) == null) {
            return false;
        }
        for (Effect effect : effects) {
            if (o.LJ(effect.getEffectId(), str)) {
                if (effect == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC74443TJn
    public final C73641SvF LJJIZ(boolean z, C58232MtI c58232MtI) {
        C73985T1x LJJIIJZLJL;
        InterfaceC68907R2p LIZ;
        if (z) {
            LIZ = this.LJLJL;
        } else {
            LJJIIJZLJL = C77117UOj.LJJIIJZLJL(this.LJLJL, this.LJLILLLLZI, C77118UOk.LJLIL);
            LIZ = LJJIIJZLJL.LIZ(C74436TJg.LJLIL);
        }
        return AbstractC73638SvC.LJIIZILJ(LIZ.LIZ(c58232MtI)).LJIILIIL(new AfS64S0100000_12(this, 143)).LJIIJ(new AfS64S0100000_12(this, 144));
    }

    public final void LLLLZIL(FetchFavoriteListResponse fetchFavoriteListResponse, List<? extends Effect> list) {
        fetchFavoriteListResponse.setEffects(list);
        this.LJLILLLLZI.put(C76800UCe.LIZ, fetchFavoriteListResponse);
        this.LJLJJI.setValue(C74413TIj.LIZLLL(EnumC74323TEx.SUCCESS, fetchFavoriteListResponse));
    }

    public TJZ(C74430TJa c74430TJa, C74433TJd c74433TJd, InterfaceC84497XEf effectPlatform) {
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LJLJJLL = c74430TJa;
        this.LJLJL = c74433TJd;
        this.LJLJLJ = effectPlatform;
        C74439TJj<FetchFavoriteListResponse> c74439TJj = new C74439TJj<>();
        this.LJLILLLLZI = c74439TJj;
        this.LJLJI = new MutableLiveData<>();
        this.LJLJJI = new MutableLiveData<>();
        this.LJLJJL = new MutableLiveData<>();
        QXX.LLJLILLLLZIIL(this, c74433TJd, c74439TJj);
    }

    @Override // X.InterfaceC74443TJn
    public final C73641SvF LJIIIIZZ(EnumC74442TJm from, Effect favorite, boolean z) {
        o.LJIIIZ(favorite, "favorite");
        o.LJIIIZ(from, "from");
        return AbstractC73638SvC.LJIIZILJ(this.LJLJJLL.LIZ(new C74438TJi(favorite, !z))).LJIIL(new AfS10S0310000_12(this, z, favorite, from, 0)).LJIIJ(new AfS10S0310000_12(this, z, favorite, from, 1));
    }

    public final void LLLLZ(EnumC74442TJm enumC74442TJm, Effect effect, boolean z) {
        Object obj;
        String effect_source_id;
        String effect_source_id2;
        this.LJLJI.setValue(new C74437TJh(enumC74442TJm, effect, z));
        FetchFavoriteListResponse LIZIZ = this.LJLILLLLZI.LIZIZ(C76800UCe.LIZ);
        if (LIZIZ != null) {
            List<? extends Effect> LLJILJILJ = ORZ.LLJILJILJ(LIZIZ.getEffects());
            if (z) {
                if (ID0.LJIILJJIL(effect) && (effect_source_id2 = effect.getEffect_source_id()) != null && (!ujb.o.LJJJJJL(effect_source_id2))) {
                    InterfaceC84497XEf interfaceC84497XEf = this.LJLJLJ;
                    String effect_source_id3 = effect.getEffect_source_id();
                    o.LJI(effect_source_id3);
                    interfaceC84497XEf.LIZ(C47261Igj.LJJIJ(effect_source_id3), null, new C74435TJf(LLJILJILJ, this, effect, LIZIZ));
                    return;
                }
                ListProtector.add(LLJILJILJ, 0, effect);
                LLLLZIL(LIZIZ, LLJILJILJ);
                return;
            }
            ArrayList arrayList = (ArrayList) LLJILJILJ;
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (o.LJ(((EffectTemplate) obj).getEffectId(), effect.getEffectId())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Effect effect2 = (Effect) obj;
            if (effect2 == null) {
                effect2 = effect;
            }
            if (ID0.LJIILJJIL(effect) && (effect_source_id = effect.getEffect_source_id()) != null && (!ujb.o.LJJJJJL(effect_source_id))) {
                InterfaceC84497XEf interfaceC84497XEf2 = this.LJLJLJ;
                String effect_source_id4 = effect.getEffect_source_id();
                o.LJI(effect_source_id4);
                interfaceC84497XEf2.LIZ(C47261Igj.LJJIJ(effect_source_id4), null, new C74431TJb(LLJILJILJ, effect2, this, LIZIZ));
                return;
            }
            arrayList.remove(effect2);
            LLLLZIL(LIZIZ, LLJILJILJ);
        }
    }
}
