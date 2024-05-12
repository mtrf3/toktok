package Y;

import X.AbstractC46244ICy;
import X.C164106cI;
import X.C46127I8l;
import X.C46133I8r;
import X.C46193IAz;
import X.C53558L0g;
import X.C68322mC;
import X.C74310TEk;
import X.C74413TIj;
import X.C78764Uvg;
import X.ET3;
import X.HT5;
import X.I0N;
import X.InterfaceC74309TEj;
import X.InterfaceC74393THp;
import X.InterfaceC82129WLd;
import X.ORZ;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.CategoryEffectModelTemplate;
import com.ss.android.ugc.effectmanager.effect.model.template.PanelInfoModelTemplate;
import com.ss.ugc.effectplatform.model.EffectCategoryModel;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class AObserverS67S0300000_7 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                return;
            case 1:
                onChanged$1(this, obj);
                return;
            case 2:
                onChanged$2(this, obj);
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$0(AObserverS67S0300000_7 aObserverS67S0300000_7, Object obj) {
        PanelInfoModelTemplate panelInfoModelTemplate;
        String key;
        C74413TIj c74413TIj = (C74413TIj) obj;
        if (c74413TIj != null && (panelInfoModelTemplate = (PanelInfoModelTemplate) c74413TIj.LIZ) != null) {
            CategoryEffectModel categoryEffectModel = panelInfoModelTemplate.getCategoryEffectModel();
            String str = null;
            if (categoryEffectModel != null) {
                str = categoryEffectModel.getCategoryKey();
            }
            if (str == null || str.length() == 0) {
                EffectCategoryModel effectCategoryModel = (EffectCategoryModel) ORZ.LJLLLL(((InterfaceC74309TEj) aObserverS67S0300000_7.l1).LJ());
                if (effectCategoryModel != null) {
                    key = effectCategoryModel.getKey();
                } else {
                    return;
                }
            } else {
                CategoryEffectModel categoryEffectModel2 = panelInfoModelTemplate.getCategoryEffectModel();
                if (categoryEffectModel2 == null) {
                    return;
                } else {
                    key = categoryEffectModel2.getCategoryKey();
                }
            }
            if (key != null) {
                C74310TEk.LIZIZ((InterfaceC74309TEj) aObserverS67S0300000_7.l1, false, 15).removeObserver(aObserverS67S0300000_7);
                ((AbstractC46244ICy) aObserverS67S0300000_7.l0).LJLLILLLL((InterfaceC74393THp) aObserverS67S0300000_7.l2, (InterfaceC74309TEj) aObserverS67S0300000_7.l1, key);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.ss.ugc.effectplatform.model.Effect, java.lang.Object, com.ss.android.ugc.effectmanager.effect.model.Effect] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static final void onChanged$1(AObserverS67S0300000_7 aObserverS67S0300000_7, Object obj) {
        ?? r2;
        boolean z;
        boolean z2;
        Effect effect = (Effect) obj;
        HT5.LIZLLL = ((C46127I8l) aObserverS67S0300000_7.l0).LJLIL.Xr(effect);
        if (effect == null) {
            Effect effect2 = ((C46127I8l) aObserverS67S0300000_7.l0).LJLJJLL;
            r2 = effect2;
            if (effect2 == null) {
                return;
            }
        } else {
            r2 = effect;
        }
        if (C53558L0g.LIZ() && C53558L0g.LIZIZ().supportHoldEffectOnExit) {
            z = true;
        } else {
            z = false;
        }
        T t = ((C68322mC) aObserverS67S0300000_7.l1).element;
        if (t == 0 || !o.LJ(r2, t) || z) {
            String LIZ = ET3.LIZ(r2, "effect_gif_icon");
            if (!C46133I8r.LIZ() || LIZ == null || LIZ.length() == 0) {
                if (z) {
                    I0N i0n = ((C46127I8l) aObserverS67S0300000_7.l0).LJLIL;
                    if (effect != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    i0n.Sl(z2, false);
                    InterfaceC82129WLd interfaceC82129WLd = (InterfaceC82129WLd) ((C46127I8l) aObserverS67S0300000_7.l0).LJLJJI.LJIIIIZZ(null, InterfaceC82129WLd.class);
                    if (interfaceC82129WLd != null && interfaceC82129WLd.AO() && effect == null) {
                        ((C46127I8l) aObserverS67S0300000_7.l0).LJLJJLL = interfaceC82129WLd.lI();
                    }
                    ((C46127I8l) aObserverS67S0300000_7.l0).LIZ((C164106cI) aObserverS67S0300000_7.l2, r2);
                } else {
                    T t2 = ((C68322mC) aObserverS67S0300000_7.l1).element;
                    if (t2 == 0 || !o.LJ(r2, t2)) {
                        ((C46127I8l) aObserverS67S0300000_7.l0).LIZ((C164106cI) aObserverS67S0300000_7.l2, r2);
                    }
                }
            } else {
                ET3.LIZLLL(2, 0, r2.getEffect_id());
                C78764Uvg.LIZIZ((C164106cI) aObserverS67S0300000_7.l2, LIZ, -1, -1);
            }
        } else if (ET3.LIZIZ(2, 0, r2.getEffect_id())) {
            ET3.LIZJ(2, 0, r2.getId());
            ((C46127I8l) aObserverS67S0300000_7.l0).LIZ((C164106cI) aObserverS67S0300000_7.l2, r2);
        }
        ((C68322mC) aObserverS67S0300000_7.l1).element = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onChanged$2(AObserverS67S0300000_7 aObserverS67S0300000_7, Object obj) {
        CategoryEffectModelTemplate categoryEffectModelTemplate;
        C74413TIj c74413TIj = (C74413TIj) obj;
        if (c74413TIj != null && (categoryEffectModelTemplate = (CategoryEffectModelTemplate) c74413TIj.LIZ) != null) {
            C46193IAz c46193IAz = (C46193IAz) aObserverS67S0300000_7.l0;
            CategoryEffectModel categoryEffectModel = (CategoryEffectModel) aObserverS67S0300000_7.l1;
            InterfaceC74309TEj interfaceC74309TEj = (InterfaceC74309TEj) aObserverS67S0300000_7.l2;
            c46193IAz.LLLI = categoryEffectModel.getCategoryKey();
            C74310TEk.LIZ(interfaceC74309TEj, categoryEffectModel.getCategoryKey(), false, 14).removeObserver(aObserverS67S0300000_7);
            c46193IAz.LLJJIII.LJII(c46193IAz.LLLILZLLLI(categoryEffectModelTemplate.getEffects(), 5));
        }
    }

    public AObserverS67S0300000_7(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
