package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.effect.api.OnFilterSelectedEvent;
import com.bytedance.android.live.effect.filter.composerfilter.ComposerFilterViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.BeautyPanelMemoryOptSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1VK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1VK implements InterfaceC24270xL<LiveEffect> {
    public final ComposerFilterViewModel LIZ;
    public final DataChannel LIZIZ;
    public Fragment LIZJ;
    public final C76923UGx LIZLLL;
    public final InterfaceC65784Pro<String> LJ;
    public final List<LiveEffect> LJFF;
    public LiveEffect LJI;

    @Override // X.InterfaceC24270xL
    public final void release() {
        C1VH LIZ = C17250m1.LIZ();
        LIZ.getClass();
        InterfaceC30442Bx8.LLLZZ.LIZ(LIZ.LIZLLL);
        AnonymousClass030.LJFF(InterfaceC30442Bx8.LLLZLZ);
    }

    @Override // X.InterfaceC24270xL
    public final void LIZIZ() {
        LIZJ(this.LJI);
    }

    public final void LIZLLL() {
        if (((ArrayList) this.LJFF).size() != ((ArrayList) C17250m1.LIZ().LIZ).size()) {
            ((ArrayList) this.LJFF).clear();
            ((ArrayList) this.LJFF).addAll(C17250m1.LIZ().LIZ);
            List<LiveEffect> list = this.LJFF;
            Integer LIZJ = InterfaceC30442Bx8.LJIJI.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_FILTER_INDEX.value");
            this.LJI = (LiveEffect) ORZ.LJLLLLLL(LIZJ.intValue(), list);
        }
    }

    @Override // X.InterfaceC24270xL
    public final void LIZ(int i) {
        String filterId;
        String str;
        C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LLZZLLIL;
        if (C29306Beo.LJIILLIIL(c48459J0d.LIZJ())) {
            c48459J0d.LIZ(Boolean.TRUE);
        }
        LiveEffect liveEffect = this.LJI;
        if (liveEffect != null) {
            if (liveEffect.getSmallItemConfig() != null || liveEffect.getSmallItemConfig() == null) {
                LiveEffect.ComposerConfig smallItemConfig = liveEffect.getSmallItemConfig();
                o.LJI(smallItemConfig);
                int i2 = smallItemConfig.maxValue;
                LiveEffect.ComposerConfig smallItemConfig2 = liveEffect.getSmallItemConfig();
                o.LJI(smallItemConfig2);
                float LJFF = C12920f2.LJFF(i2, smallItemConfig2.minValue, i);
                C1VH LIZ = C17250m1.LIZ();
                Float valueOf = Float.valueOf(LJFF);
                LIZ.getClass();
                if (valueOf == null || Float.isNaN(valueOf.floatValue()) || Float.isInfinite(valueOf.floatValue()) || (filterId = liveEffect.getFilterId()) == null || (str = liveEffect.effectPanelKey) == null) {
                    return;
                }
                String resourceId = liveEffect.getResourceId();
                LIZ.LIZLLL.put(filterId, Double.valueOf(valueOf.floatValue()));
                LIZ.LIZLLL.put(resourceId, Double.valueOf(valueOf.floatValue()));
                LIZ.LJFF.LJIIJJI(C12920f2.LIZIZ(liveEffect, valueOf.floatValue()), liveEffect, str);
            }
        }
    }

    public final void LIZJ(LiveEffect liveEffect) {
        if (!o.LJ(this.LJ.invoke(), C0TY.LJFF)) {
            return;
        }
        if (liveEffect == null) {
            C29306Beo.LJI(this.LIZLLL);
            return;
        }
        if (liveEffect.isNone()) {
            C29306Beo.LJI(this.LIZLLL);
            return;
        }
        if (liveEffect.getSmallItemConfig() != null) {
            C29306Beo.LJJLJLI(this.LIZLLL);
            C76923UGx c76923UGx = this.LIZLLL;
            LiveEffect.ComposerConfig smallItemConfig = liveEffect.getSmallItemConfig();
            o.LJI(smallItemConfig);
            int i = smallItemConfig.maxValue;
            LiveEffect.ComposerConfig smallItemConfig2 = liveEffect.getSmallItemConfig();
            o.LJI(smallItemConfig2);
            c76923UGx.setPercent(C12920f2.LJ(C17250m1.LIZ().LJII(liveEffect), i, smallItemConfig2.minValue));
            C76923UGx c76923UGx2 = this.LIZLLL;
            LiveEffect.ComposerConfig smallItemConfig3 = liveEffect.getSmallItemConfig();
            o.LJI(smallItemConfig3);
            c76923UGx2.LIZJ(100, 0, smallItemConfig3.defaultValue, true);
            return;
        }
        C29306Beo.LJI(this.LIZLLL);
    }

    public C1VK(ComposerFilterViewModel filterViewModel, DataChannel dataChannel, Fragment fragment, C76923UGx c76923UGx, InterfaceC65784Pro<String> interfaceC65784Pro) {
        LifecycleCoroutineScope lifecycleScope;
        o.LJIIIZ(filterViewModel, "filterViewModel");
        this.LIZ = filterViewModel;
        this.LIZIZ = dataChannel;
        this.LIZJ = fragment;
        this.LIZLLL = c76923UGx;
        this.LJ = interfaceC65784Pro;
        this.LJFF = new ArrayList();
        if (!BeautyPanelMemoryOptSetting.INSTANCE.enable()) {
            Fragment fragment2 = this.LIZJ;
            if (fragment2 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(fragment2)) != null) {
                XKX.LIZLLL(lifecycleScope, null, null, new C2FA(this, null), 3);
            }
            if (dataChannel != null) {
                dataChannel.lv0(this.LIZJ, OnFilterSelectedEvent.class, new IDqS416S0100000(this, 253));
            }
            LIZLLL();
        }
    }
}
