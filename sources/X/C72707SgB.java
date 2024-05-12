package X;

import Y.AObserverS80S0100000_12;
import Y.AfS61S0200000_12;
import Y.AfS64S0100000_12;
import Y.IDuS322S0100000_12;
import Y.IDuS81S0200000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.shortvideo.NaviContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.navi.core.EffectDependencyLoader;
import com.ss.android.ugc.gamora.recorder.navi.core.EntryPointStickerLifecycleListener;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviFeature;
import com.ss.android.ugc.gamora.recorder.navi.model.ProfileNaviFeatureInfo;
import com.ss.android.ugc.gamora.recorder.navi.view.NaviAvatarListViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS36S0001000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SgB, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72707SgB {
    public final ActivityC45651qj LIZ;
    public final InterfaceC83624Wrs LIZIZ;
    public final InterfaceC84497XEf LIZJ;
    public final ShortVideoContext LIZLLL;
    public final InterfaceC65784Pro<C76800UCe> LJ;
    public final LifecycleOwner LJFF;
    public final NaviAvatarListViewModel LJI;
    public C72708SgC LJII;
    public InterfaceC92693kP LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public final C62822Ol8 LJIILIIL;
    public C36400EQi LJIILJJIL;

    public final void LIZIZ(List<RTP> list) {
        if (this.LJIIIZ) {
            int i = 0;
            if (list == null || list.isEmpty()) {
                return;
            }
            Integer selectedIndex = this.LJI.Hv0(this.LJFF).getSelectedIndex();
            if (selectedIndex != null) {
                i = selectedIndex.intValue();
            }
            int avatarCountSelf = this.LJI.Hv0(this.LJFF).getAvatarCountSelf();
            this.LJIIL = avatarCountSelf;
            if (this.LJIIJJI < 0) {
                this.LJIIJJI = avatarCountSelf;
            }
            LIZ(i, (RTP) ListProtector.get(list, i));
        }
    }

    public final void LIZ(int i, RTP rtp) {
        long j;
        boolean z;
        NaviContext naviContext = this.LIZLLL.naviContext;
        String str = rtp.LIZ;
        if (str != null || (str = rtp.LIZIZ) != null) {
            j = CastLongProtector.parseLong(str);
        } else {
            j = -1;
        }
        naviContext.avatarId = Long.valueOf(j);
        if (i <= (this.LJIIL - this.LJIIJJI) - 1) {
            z = true;
        } else {
            z = false;
        }
        naviContext.avatarIsNew = Boolean.valueOf(z);
        NaviAvatarListViewModel naviAvatarListViewModel = this.LJI;
        naviAvatarListViewModel.getClass();
        naviAvatarListViewModel.setState(new AqS36S0001000_12(i, 17));
        NaviAvatarListViewModel naviAvatarListViewModel2 = this.LJI;
        Integer valueOf = Integer.valueOf(i);
        naviAvatarListViewModel2.getClass();
        naviAvatarListViewModel2.setState(new AqS178S0100000_12(valueOf, 738));
        C72708SgC c72708SgC = this.LJII;
        if (c72708SgC != null && !c72708SgC.LJI) {
            Iterator it = ((ArrayList) c72708SgC.LJII).iterator();
            while (it.hasNext()) {
                OSZ osz = (OSZ) it.next();
                c72708SgC.LIZIZ.LJJIJL(((Number) osz.getFirst()).intValue(), 0L, 0L, (String) osz.getSecond());
            }
            ((ArrayList) c72708SgC.LJII).clear();
            if (!c72708SgC.LJI) {
                C73411SrX c73411SrX = c72708SgC.LJIIIZ;
                if (c73411SrX != null) {
                    c73411SrX.dispose();
                }
                c72708SgC.LJIIIZ = null;
                EffectDependencyLoader effectDependencyLoader = c72708SgC.LJFF;
                if (effectDependencyLoader != null) {
                    effectDependencyLoader.LJLJJL = true;
                    MessageCenter.removeListener(effectDependencyLoader);
                    ((LinkedHashMap) effectDependencyLoader.LJLJJI).clear();
                    effectDependencyLoader.LJLJI.clear();
                }
                c72708SgC.LJI = true;
            }
        }
        C72708SgC c72708SgC2 = new C72708SgC(this.LIZ, this.LIZIZ, this.LIZJ);
        this.LJII = c72708SgC2;
        c72708SgC2.LJIIIIZZ = new AqS162S0100000_12(this, 1261);
        C72708SgC c72708SgC3 = this.LJII;
        o.LJI(c72708SgC3);
        boolean z2 = !this.LJIIJ;
        if (c72708SgC3.LJ == null) {
            if (c72708SgC3.LJI) {
                return;
            }
            c72708SgC3.LJ = rtp;
            List<ProfileNaviFeature> list = rtp.LIZJ;
            if (list == null || list.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<ProfileNaviFeature> it2 = list.iterator();
            while (it2.hasNext()) {
                Object fromJson = GsonProtectorUtils.fromJson(c72708SgC3.LIZLLL, it2.next().getInfo(), (Class<Object>) ProfileNaviFeatureInfo.class);
                if (fromJson != null) {
                    arrayList.add(fromJson);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String effectId = ((ProfileNaviFeatureInfo) it3.next()).getEffectId();
                if (effectId != null) {
                    arrayList2.add(effectId);
                }
            }
            if (z2) {
                c72708SgC3.LJIIIZ = (C73411SrX) AbstractC73672Svk.LJJLL(AbstractC73672Svk.LJIIJ(new IDuS322S0100000_12(c72708SgC3, 3)), AbstractC73672Svk.LJIIJ(new IDuS81S0200000_12(c72708SgC3, arrayList2, 5)), SFS.LJLJI).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0200000_12(c72708SgC3, arrayList, 16), new AfS64S0100000_12(c72708SgC3, 141));
                return;
            } else {
                c72708SgC3.LJIIIZ = (C73411SrX) AbstractC73672Svk.LJIIJ(new IDuS81S0200000_12(c72708SgC3, arrayList2, 5)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0200000_12(c72708SgC3, arrayList, 17), new AfS64S0100000_12(c72708SgC3, 142));
                return;
            }
        }
        throw new C72711SgF("NaviEffectLoader load() method can only be called once. Developer should always create a new instance of NaviEffectLoader for each new load.");
    }

    public C72707SgB(C29S activity, InterfaceC83624Wrs cameraView, InterfaceC84497XEf interfaceC84497XEf, ShortVideoContext shortVideoContext, AqS157S0100000_7 aqS157S0100000_7, LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(cameraView, "cameraView");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LIZ = activity;
        this.LIZIZ = cameraView;
        this.LIZJ = interfaceC84497XEf;
        this.LIZLLL = shortVideoContext;
        this.LJ = aqS157S0100000_7;
        this.LJFF = lifecycleOwner;
        JediViewModel LIZ = C163726bg.LIZ(activity, cameraView.getViewFunction().getView()).LIZ(NaviAvatarListViewModel.class);
        o.LJIIIIZZ(LIZ, "of(cameraView.getViewFun…istViewModel::class.java)");
        this.LJI = (NaviAvatarListViewModel) LIZ;
        this.LJIIJ = true;
        this.LJIIJJI = -1;
        this.LJIIL = -1;
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(L66.LJLIL);
        this.LJIILIIL = LIZIZ;
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        EntryPointStickerLifecycleListener entryPointStickerLifecycleListener = new EntryPointStickerLifecycleListener(lifecycle, new AqS178S0100000_12(this, 733));
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            lifecycle.addObserver(entryPointStickerLifecycleListener);
            MessageCenter.removeListener(entryPointStickerLifecycleListener);
            MessageCenter.addListener(entryPointStickerLifecycleListener);
        }
        ((LiveData) LIZIZ.getValue()).observe(lifecycleOwner, new AObserverS80S0100000_12(this, 163));
    }
}
