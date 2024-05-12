package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Tge, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75284Tge implements InterfaceC30594Bza {
    public final /* synthetic */ MultiGuestSharedBgAnchorViewModel LIZ;

    @Override // X.InterfaceC30594Bza
    public final void release() {
    }

    @Override // X.InterfaceC30594Bza
    public final void LIZIZ() {
        C74987Tbr.LIZJ("anchor_shared_bg", "reportLiveEffectUseTime");
    }

    public C75284Tge(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel) {
        this.LIZ = multiGuestSharedBgAnchorViewModel;
    }

    @Override // X.InterfaceC30594Bza
    public final void LIZJ(LiveEffect liveEffect) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reportButtonClickAction liveEffect=");
        if (liveEffect != null) {
            str = liveEffect.getResourceId();
        } else {
            str = null;
        }
        LIZ.append(str);
        C74987Tbr.LIZJ("anchor_shared_bg", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC30594Bza
    public final void LIZLLL(LiveEffect liveEffect) {
        String str;
        o.LJIIIZ(liveEffect, "liveEffect");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reportShareBackgroundClick liveEffect=");
        LIZ.append(liveEffect.getResourceId());
        C74987Tbr.LIZJ("anchor_shared_bg", X1D.LIZIZ(LIZ));
        String resourceId = liveEffect.getResourceId();
        C75236Tfs state = this.LIZ.getState();
        if (state != null) {
            str = state.LJLJJI;
        } else {
            str = null;
        }
        if (o.LJ(resourceId, str)) {
            C75285Tgf.LIZLLL(liveEffect, 1);
        } else {
            C75285Tgf.LIZLLL(liveEffect, 0);
        }
    }

    @Override // X.InterfaceC30594Bza
    public final void LJ(LiveEffect liveEffect) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reportLiveEffectSelected liveEffect=");
        if (liveEffect != null) {
            str = liveEffect.getResourceId();
        } else {
            str = null;
        }
        LIZ.append(str);
        C74987Tbr.LIZJ("anchor_shared_bg", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC30594Bza
    public final void LJFF(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reportEffectPanelDuration liveEffect=");
        LIZ.append(i);
        C74987Tbr.LIZJ("anchor_shared_bg", X1D.LIZIZ(LIZ));
        HashMap hashMap = new HashMap();
        C75285Tgf.LIZJ(hashMap);
        C75285Tgf.LIZIZ(hashMap, null);
        hashMap.put("use_time", String.valueOf(i));
        C75285Tgf.LJFF("livesdk_anchor_shared_background_panel_duration", hashMap);
    }

    @Override // X.InterfaceC30594Bza
    public final void LJI(LiveEffect liveEffect) {
        String str;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reportLiveEffectiveUse liveEffect=");
        if (liveEffect != null) {
            str = liveEffect.getResourceId();
        } else {
            str = null;
        }
        LIZ.append(str);
        C74987Tbr.LIZJ("anchor_shared_bg", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC30594Bza
    public final void LIZ(TreeMap<Integer, C75295Tgp> visibleItems, List<? extends LiveEffect> stickerList) {
        long j;
        String str;
        o.LJIIIZ(visibleItems, "visibleItems");
        o.LJIIIZ(stickerList, "stickerList");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("reportAggregateLiveEffectShow visibleItemCount=");
        LIZ.append(Integer.valueOf(visibleItems.size()));
        LIZ.append(" stickerListSize=");
        LIZ.append(Integer.valueOf(((ArrayList) stickerList).size()));
        C74987Tbr.LIZJ("anchor_shared_bg", X1D.LIZIZ(LIZ));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry<Integer, C75295Tgp> entry : visibleItems.entrySet()) {
            arrayList.add(Integer.valueOf(entry.getValue().LIZ + 1));
            LiveEffect liveEffect = (LiveEffect) ORZ.LJLLLLLL(entry.getValue().LIZ, stickerList);
            if (liveEffect != null) {
                j = liveEffect.effectId;
            } else {
                j = 0;
            }
            arrayList2.add(Long.valueOf(j));
            LiveEffect liveEffect2 = (LiveEffect) ORZ.LJLLLLLL(entry.getValue().LIZ, stickerList);
            if (liveEffect2 == null || (str = liveEffect2.getResourceId()) == null) {
                str = "";
            }
            arrayList3.add(str);
        }
        HashMap hashMap = new HashMap();
        C75285Tgf.LIZJ(hashMap);
        C75285Tgf.LIZIZ(hashMap, null);
        hashMap.put("sticker_position", arrayList.toString());
        hashMap.put("sticker_id_set", arrayList2.toString());
        hashMap.put("resource_id_set", arrayList3.toString());
        C75285Tgf.LJFF("livesdk_anchor_shared_background_panel_show", hashMap);
    }
}
