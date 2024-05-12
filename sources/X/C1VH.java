package X;

import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1VH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VH implements InterfaceC08070Tj<LiveEffect> {
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C22Q.LJLIL);
    public final List<LiveEffect> LIZ;
    public final List<InterfaceC08060Ti> LIZIZ;
    public final List<InterfaceC08050Th<LiveEffect>> LIZJ;
    public final java.util.Map<String, Double> LIZLLL;
    public final EffectManager LJ;
    public final C42681lw LJFF;
    public final String LJI;
    public final ComposerFilterViewModel LJII;

    @Override // X.InterfaceC08070Tj
    public final void release() {
    }

    public final boolean LJIIIIZZ() {
        List<LiveEffect> list = this.LIZ;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<LiveEffect> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isNew) {
                return true;
            }
        }
        return false;
    }

    public final void LJIIJJI() {
        String str;
        String str2;
        List<LiveEffect> list = this.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            LiveEffect liveEffect = (LiveEffect) next;
            if (liveEffect.isNew && liveEffect.getEffect() != null) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            LiveEffect liveEffect2 = (LiveEffect) it2.next();
            liveEffect2.isNew = false;
            Effect effect = liveEffect2.getEffect();
            if (effect != null) {
                str = effect.getId();
            } else {
                str = null;
            }
            Effect effect2 = liveEffect2.getEffect();
            if (effect2 != null) {
                str2 = effect2.getTagsUpdatedAt();
            } else {
                str2 = null;
            }
            EffectManager effectManager = this.LJ;
            if (effectManager != null) {
                effectManager.updateTag(str, str2, null);
            }
        }
    }

    public C1VH() {
        C48459J0d<Integer> c48459J0d = InterfaceC30442Bx8.LJIJI;
        Integer LIZJ = c48459J0d.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_FILTER_INDEX.value");
        if (LIZJ.intValue() < 0) {
            c48459J0d.LIZ(0);
        }
        ComposerFilterViewModel composerFilterViewModel = (ComposerFilterViewModel) new ViewModelProvider(C30686C2o.LJLIL, new C1VM(new C1VF(), new C43361n2())).get(ComposerFilterViewModel.class);
        this.LJII = composerFilterViewModel;
        XKX.LIZLLL(ViewModelKt.getViewModelScope(composerFilterViewModel), null, null, new C2F9(this, null), 3);
        this.LIZ = new ArrayList();
        this.LIZIZ = new ArrayList();
        this.LIZJ = new ArrayList();
        this.LIZLLL = new LinkedHashMap();
        this.LJFF = C12880ey.LIZ();
        this.LJI = C0TY.LIZ();
        this.LJ = ((IHostCreativeTool) CN1.LIZ(IHostCreativeTool.class)).LJLJJLL();
        java.util.Map<String, Double> LIZJ2 = InterfaceC30442Bx8.LLLZZ.LIZJ();
        o.LJIIIIZZ(LIZJ2, "LIVE_FILTER_LEVEL_MAP.value");
        this.LIZLLL = LIZJ2;
    }

    @Override // X.InterfaceC08070Tj
    public final List<LiveEffect> LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC08070Tj
    public final void LIZIZ(InterfaceC08060Ti listener) {
        o.LJIIIZ(listener, "listener");
        if (!((ArrayList) this.LIZIZ).contains(listener)) {
            ((ArrayList) this.LIZIZ).add(listener);
        }
    }

    @Override // X.InterfaceC08070Tj
    public final void LIZJ(InterfaceC08050Th<? super LiveEffect> filterChangeListener) {
        o.LJIIIZ(filterChangeListener, "filterChangeListener");
        if (!((ArrayList) this.LIZJ).contains(filterChangeListener)) {
            ((ArrayList) this.LIZJ).add(filterChangeListener);
        }
    }

    @Override // X.InterfaceC08070Tj
    public final void LIZLLL(InterfaceC08060Ti listener) {
        o.LJIIIZ(listener, "listener");
        if (((ArrayList) this.LIZIZ).contains(listener)) {
            ((ArrayList) this.LIZIZ).remove(listener);
        }
    }

    @Override // X.InterfaceC08070Tj
    public final void LJ(InterfaceC08050Th<? super LiveEffect> filterChangeListener) {
        o.LJIIIZ(filterChangeListener, "filterChangeListener");
        if (((ArrayList) this.LIZJ).contains(filterChangeListener)) {
            ((ArrayList) this.LIZJ).remove(filterChangeListener);
        }
    }

    @Override // X.InterfaceC08070Tj
    public final void LJFF(int i) {
        C15760jc.LIZIZ(i, this.LIZ);
    }

    @Override // X.InterfaceC08070Tj
    public final float LJI(int i) {
        LiveEffect liveEffect;
        if (i < ((ArrayList) this.LIZ).size() && i >= 0) {
            liveEffect = (LiveEffect) ListProtector.get(this.LIZ, i);
        } else {
            liveEffect = null;
        }
        return LJII(liveEffect);
    }

    public final float LJII(LiveEffect liveEffect) {
        String str;
        double d;
        if (liveEffect == null) {
            return 1.0f;
        }
        if (this.LIZLLL.containsKey(liveEffect.getFilterId())) {
            java.util.Map<String, Double> map = this.LIZLLL;
            String resourceId = liveEffect.getResourceId();
            Double d2 = this.LIZLLL.get(liveEffect.getFilterId());
            if (d2 != null) {
                d = d2.doubleValue();
            } else {
                d = 1.0d;
            }
            map.put(resourceId, Double.valueOf(d));
            Double d3 = this.LIZLLL.get(liveEffect.getFilterId());
            o.LJI(d3);
            return (float) d3.doubleValue();
        }
        if (this.LIZLLL.containsKey(liveEffect.getResourceId())) {
            Double d4 = this.LIZLLL.get(liveEffect.getResourceId());
            o.LJI(d4);
            return (float) d4.doubleValue();
        }
        C42681lw c42681lw = this.LJFF;
        String resourceId2 = liveEffect.getResourceId();
        LiveEffect.ComposerConfig smallItemConfig = liveEffect.getSmallItemConfig();
        if (smallItemConfig == null || (str = smallItemConfig.tag) == null) {
            str = "";
        }
        Float LJFF = c42681lw.LJFF(resourceId2, str);
        if (LJFF != null) {
            return LJFF.floatValue();
        }
        LiveEffect.ComposerConfig smallItemConfig2 = liveEffect.getSmallItemConfig();
        if (smallItemConfig2 == null) {
            return 1.0f;
        }
        return C12920f2.LJFF(smallItemConfig2.maxValue, smallItemConfig2.minValue, smallItemConfig2.defaultValue);
    }

    public final boolean LJIIIZ(LiveEffect liveEffect) {
        if (liveEffect == null) {
            return false;
        }
        if (liveEffect.isNone()) {
            return true;
        }
        return this.LJII.iv0(liveEffect);
    }

    public final void LJIIJ(boolean z) {
        if (((ArrayList) this.LIZIZ).isEmpty()) {
            return;
        }
        Iterator<InterfaceC08060Ti> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(z);
        }
    }
}
