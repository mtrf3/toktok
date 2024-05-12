package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.VideoTagContainer;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import com.ss.android.ugc.feed.platform.componentmanager.data.GlobalComponentData;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.8Pl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210898Pl extends AbstractC65781Prl implements InterfaceC65784Pro<java.util.Map<String, ? extends java.util.Set<? extends String>>> {
    public final /* synthetic */ VideoTagContainer LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C210898Pl(VideoTagContainer videoTagContainer) {
        super(0);
        this.LJLIL = videoTagContainer;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.Map<java.lang.String, ? extends java.util.Set<? extends java.lang.String>>, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final java.util.Map<String, ? extends java.util.Set<? extends String>> invoke() {
        List<GlobalComponentData> list;
        if (this.LJLIL.E4()) {
            String LIZLLL = C210888Pk.LIZLLL(this.LJLIL.a1());
            String str = this.LJLIL.rp0().eventType;
            String from = this.LJLIL.rp0().param.getFrom();
            LinkedHashMap LJJJZ = C113554cx.LJJJZ(new OSZ("low_tag", new LinkedHashSet()), new OSZ("high_tag", new LinkedHashSet()));
            FeedComponentPriorityData LIZ = C8QN.LIZ(LIZLLL, str);
            if (LIZ == null || (list = LIZ.globalComponentList) == null) {
                C8QG.LIZ(str, from, LIZLLL, 1, "main_tag", null, 32);
            } else {
                for (GlobalComponentData globalComponentData : list) {
                    String str2 = globalComponentData.matchedContainerKey;
                    if (o.LJ(str2, "high_tag") || o.LJ(str2, "low_tag")) {
                        HashSet hashSet = (HashSet) LJJJZ.get(str2);
                        if (hashSet != null) {
                            String str3 = globalComponentData.componentKey;
                            if (str3 == null) {
                                str3 = "";
                            }
                            hashSet.add(str3);
                        }
                    }
                }
            }
            if (!LJJJZ.isEmpty()) {
                ArrayList arrayList = new ArrayList(LJJJZ.size());
                Iterator it = LJJJZ.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(((Map.Entry) it.next()).getValue());
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (!((java.util.Set) it2.next()).isEmpty()) {
                            return LJJJZ;
                        }
                    }
                }
            }
            SettingsManager.LIZLLL().LJIIIIZZ("feed_left_tag_priority_settings", java.util.Map.class, C8QD.LIZ);
            return LJJJZ;
        }
        SettingsManager LIZLLL2 = SettingsManager.LIZLLL();
        java.util.Map<String, java.util.Set<String>> map = C8QD.LIZ;
        ?? LJIIIIZZ = LIZLLL2.LJIIIIZZ("feed_left_tag_priority_settings", java.util.Map.class, map);
        if (LJIIIIZZ == 0) {
            return map;
        }
        return LJIIIIZZ;
    }
}
