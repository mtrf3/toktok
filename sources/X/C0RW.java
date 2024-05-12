package X;

import com.bytedance.android.live.effect.model.EffectDataRestoreSucc;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.0RW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0RW {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(List liveEffectPanelList, InterfaceC31981Ni composerManagerB, DataChannel dataChannel) {
        C1QC c1qc;
        List<Object> list;
        LiveEffect liveEffect;
        o.LJIIIZ(liveEffectPanelList, "liveEffectPanelList");
        o.LJIIIZ(composerManagerB, "composerManagerB");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("restoreNewBeauty, liveEffectPanelList#size=");
        LIZ2.append(liveEffectPanelList.size());
        C0NB.LJIIIZ("MultiGuestEffectStoreManager", X1D.LIZIZ(LIZ2));
        ArrayList arrayList = new ArrayList();
        Iterator it = liveEffectPanelList.iterator();
        while (it.hasNext()) {
            C1QC c1qc2 = (C1QC) it.next();
            arrayList.addAll(c1qc2.LJLILLLLZI);
            Iterator<Object> it2 = c1qc2.LJLILLLLZI.iterator();
            while (it2.hasNext()) {
                Collection collection = ((LiveEffect) it2.next()).subStickers;
                if (collection == null) {
                    collection = C61878OQg.INSTANCE;
                }
                arrayList.addAll(collection);
            }
        }
        composerManagerB.LJIL("liveguestbeauty", arrayList);
        List<LiveEffect> LJIIIIZZ = composerManagerB.LJIIIIZZ("liveguestbeauty");
        if (LJIIIIZZ.isEmpty() && (c1qc = (C1QC) ORZ.LJLLLL(liveEffectPanelList)) != null && (list = c1qc.LJLILLLLZI) != null && (liveEffect = (LiveEffect) ORZ.LJLLLL(list)) != null) {
            composerManagerB.LIZIZ(liveEffect, "liveguestbeauty");
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = liveEffectPanelList.iterator();
        while (it3.hasNext()) {
            ORS.LJJLIIIJILLIZJL(((C1QC) it3.next()).LJLILLLLZI, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (true ^ LJIIIIZZ.contains(next)) {
                arrayList3.add(next);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            LiveEffect liveEffect2 = (LiveEffect) next2;
            if (!C78880UxY.LJJJJLI(liveEffect2) && !liveEffect2.isNone() && !liveEffect2.isExclusive) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it6 = arrayList4.iterator();
        while (it6.hasNext()) {
            Object next3 = it6.next();
            boolean z = false;
            for (LiveEffect.ComposerConfig composerConfig : ((LiveEffect) next3).composerConfigList) {
                composerConfig.LIZ = composerConfig.LIZIZ;
                if (composerConfig.defaultValue != 0) {
                    z = true;
                }
            }
            if (z) {
                arrayList5.add(next3);
            }
        }
        Iterator it7 = arrayList5.iterator();
        while (it7.hasNext()) {
            composerManagerB.LIZIZ((LiveEffect) it7.next(), "liveguestbeauty");
        }
        if (dataChannel != null) {
            dataChannel.pv0(EffectDataRestoreSucc.class);
        }
    }
}
