package X;

import com.bytedance.android.live.slot.IBcToggleService;
import com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipApiOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BzL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30579BzL implements C00 {
    public Boolean LIZIZ;
    public boolean LJFF;
    public boolean LJI;
    public C73411SrX LJII;
    public GameLivePartnershipRetrofitApi LJIIIIZZ;
    public final HashMap<String, java.util.Map<String, C30583BzP>> LIZ = new HashMap<>();
    public String LIZJ = CardStruct.IStatusCode.DEFAULT;
    public boolean LIZLLL = true;
    public final java.util.Map<String, C30582BzO> LJ = new LinkedHashMap();

    public final void LIZJ() {
        this.LIZ.clear();
        ((LinkedHashMap) this.LJ).clear();
        this.LIZIZ = null;
        this.LIZLLL = true;
        this.LJFF = false;
        this.LJII = null;
        this.LIZJ = CardStruct.IStatusCode.DEFAULT;
    }

    @Override // X.C00
    public final void LIZ(LiveMode... liveModeArr) {
        this.LJFF = true;
        if (ORY.LJJIJIIJIL(LiveMode.VIDEO, liveModeArr)) {
            this.LJI = true;
        }
    }

    public final void LIZLLL(LiveMode liveMode) {
        Collection<C30583BzP> values;
        Boolean bool = this.LIZIZ;
        if (bool != null) {
            LJFF(liveMode, bool.booleanValue());
            return;
        }
        Collection<java.util.Map<String, C30583BzP>> values2 = this.LIZ.values();
        o.LJIIIIZZ(values2, "joinedDateInfos.values");
        boolean z = true;
        if (!values2.isEmpty()) {
            Iterator<java.util.Map<String, C30583BzP>> it = values2.iterator();
            while (it.hasNext()) {
                Collection<C30583BzP> values3 = it.next().values();
                if (!(values3 instanceof Collection) || !values3.isEmpty()) {
                    for (C30583BzP c30583BzP : values3) {
                        if (!c30583BzP.LJLILLLLZI && c30583BzP.LJLIL) {
                            LJFF(liveMode, true);
                            return;
                        }
                    }
                }
            }
        }
        if (this.LIZJ.length() == 0 || o.LJ(this.LIZJ, CardStruct.IStatusCode.DEFAULT)) {
            LJFF(liveMode, false);
            return;
        }
        java.util.Map<String, C30583BzP> map = this.LIZ.get(this.LIZJ);
        if (map != null && (values = map.values()) != null && !values.isEmpty()) {
            Iterator<C30583BzP> it2 = values.iterator();
            while (it2.hasNext()) {
                if (it2.next().LJLIL) {
                    break;
                }
            }
        }
        z = false;
        LJFF(liveMode, z);
    }

    public final void LJII(LiveMode liveMode) {
        o.LJIIIZ(liveMode, "liveMode");
        LIZIZ(liveMode, "live_mode_change");
    }

    public static void LJFF(LiveMode liveMode, boolean z) {
        int i;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("not video live ,setGameBcToggleState ");
        LIZ.append(z);
        C0NB.LIZIZ("GameBcToggleHandler", X1D.LIZIZ(LIZ));
        IBcToggleService LIZ2 = BHT.LIZ();
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        LIZ2.os0(i, 2, liveMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    @Override // X.C00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(com.bytedance.android.livesdkapi.depend.model.live.LiveMode r7, java.lang.String r8) {
        /*
            r6 = this;
            boolean r0 = r6.LJFF
            if (r0 != 0) goto L5
            return
        L5:
            com.bytedance.android.livesdkapi.depend.model.live.LiveMode r4 = com.bytedance.android.livesdkapi.depend.model.live.LiveMode.VIDEO
            r5 = 2
            if (r4 != r7) goto L17
            boolean r0 = r6.LJI
            if (r0 != 0) goto L17
            com.bytedance.android.live.slot.IBcToggleService r1 = X.BHT.LIZ()
            r0 = 3
            r1.os0(r0, r5, r4)
            return
        L17:
            com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipApiOptSetting r0 = com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipApiOptSetting.INSTANCE
            com.bytedance.android.livesdk.livesetting.game.partnership.PartnershipRefactoringSwitchAnchorGuide r0 = r0.getAnchorGuide()
            boolean r0 = r0.brandedContentToggle
            if (r0 != 0) goto L22
            return
        L22:
            java.lang.String r1 = "refresh toggle status form server... source = "
            java.lang.String r0 = "GameBcToggleHandler"
            X.C279017q.LJ(r1, r8, r0)
            X.SrX r0 = r6.LJII
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L3e
            boolean r0 = r0.isDisposed()
            r0 = r0 ^ 1
            if (r0 != r2) goto L3e
            X.SrX r0 = r6.LJII
            if (r0 == 0) goto L3e
            r0.dispose()
        L3e:
            if (r7 != 0) goto L7d
        L40:
            r3 = 1
        L41:
            com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi r2 = r6.LJIIIIZZ
            if (r2 != 0) goto L4f
            java.lang.Class<com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi> r0 = com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi.class
            java.lang.Object r2 = X.Q7L.LIZIZ(r0)
            com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi r2 = (com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi) r2
            r6.LJIIIIZZ = r2
        L4f:
            kotlin.jvm.internal.o.LJI(r2)
            if (r7 != r4) goto L70
        L54:
            r0 = 0
        L56:
            X.Svk r0 = r2.requestAnchorToggleInfo(r0, r3)
            X.Svk r2 = X.C1EW.LIZ(r0)
            Y.AfS54S0200000_5 r1 = new Y.AfS54S0200000_5
            r0 = 62
            r1.<init>(r6, r7, r0)
            X.BzM<T> r0 = X.C30580BzM.LJLIL
            X.3kP r0 = r2.LJJJLIIL(r1, r0)
            X.SrX r0 = (X.C73411SrX) r0
            r6.LJII = r0
            return
        L70:
            java.lang.String r0 = r6.LIZJ
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r0)
            if (r0 == 0) goto L54
            long r0 = r0.longValue()
            goto L56
        L7d:
            int[] r1 = X.C30581BzN.LIZ
            int r0 = r7.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L41
            if (r0 == r5) goto L8a
            goto L40
        L8a:
            r3 = 4
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30579BzL.LIZIZ(com.bytedance.android.livesdkapi.depend.model.live.LiveMode, java.lang.String):void");
    }

    public final void LJ(LiveMode liveMode, boolean z) {
        this.LIZIZ = Boolean.valueOf(z);
        LIZLLL(liveMode);
    }

    public final void LJIIIIZZ(LiveMode liveMode, String str) {
        if (o.LJ(this.LIZJ, str)) {
            return;
        }
        this.LIZJ = str;
        if (GameLivePartnershipApiOptSetting.INSTANCE.getAnchorGuide().brandedContentToggle) {
            LIZIZ(liveMode, "game_tag");
        } else {
            LIZLLL(liveMode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void LJIIIZ(InterfaceC88472Yns interfaceC88472Yns, List list) {
        boolean z;
        if (GameLivePartnershipApiOptSetting.INSTANCE.getAnchorGuide().brandedContentToggle) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30582BzO c30582BzO = (C30582BzO) it.next();
            this.LJ.put(c30582BzO.LJLIL, c30582BzO);
        }
        ?? r3 = 0;
        r3 = 0;
        if (interfaceC88472Yns != null) {
            Collection values = ((LinkedHashMap) this.LJ).values();
            if (!(values instanceof Collection) || !values.isEmpty()) {
                Iterator it2 = values.iterator();
                while (it2.hasNext()) {
                    if (((C30582BzO) it2.next()).LJLJI) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            interfaceC88472Yns.invoke(Boolean.valueOf(z));
        }
        Collection values2 = ((LinkedHashMap) this.LJ).values();
        if (!(values2 instanceof Collection) || !values2.isEmpty()) {
            Iterator it3 = values2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                C30582BzO c30582BzO2 = (C30582BzO) it3.next();
                if (c30582BzO2.LJLJI && c30582BzO2.LJLJJL) {
                    r3 = 1;
                    break;
                }
            }
        }
        if (GameLivePartnershipApiOptSetting.INSTANCE.getAnchorGuide().brandedContentToggle) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("video live game bc toggle ");
        LIZ.append((boolean) r3);
        C0NB.LIZIZ("GameBcToggleHandler", X1D.LIZIZ(LIZ));
        BHT.LIZ().os0(r3, 2, LiveMode.VIDEO);
    }

    public final void LJI(List<C30582BzO> list, String str, LiveMode liveMode) {
        LiveMode liveMode2;
        if (GameLivePartnershipApiOptSetting.INSTANCE.getAnchorGuide().brandedContentToggle) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateGameBcToggle size = ");
        LIZ.append(list.size());
        LIZ.append(", business = ");
        LIZ.append(str);
        C0NB.LIZIZ("GameBcToggleHandler", X1D.LIZIZ(LIZ));
        if (list.isEmpty() && !this.LIZLLL) {
            return;
        }
        this.LIZLLL = false;
        for (C30582BzO c30582BzO : list) {
            if (this.LIZ.containsKey(c30582BzO.LJLILLLLZI)) {
                java.util.Map<String, C30583BzP> map = this.LIZ.get(c30582BzO.LJLILLLLZI);
                if (map != null) {
                    map.put(c30582BzO.LJLIL, new C30583BzP(c30582BzO.LJLJI, c30582BzO.LJLJJI));
                }
            } else {
                this.LIZ.put(c30582BzO.LJLILLLLZI, C113554cx.LJJLIIIIJ(new OSZ(c30582BzO.LJLIL, new C30583BzP(c30582BzO.LJLJI, c30582BzO.LJLJJI))));
            }
            Collection<java.util.Map<String, C30583BzP>> values = this.LIZ.values();
            o.LJIIIIZZ(values, "joinedDateInfos.values");
            ArrayList arrayList = new ArrayList();
            for (java.util.Map<String, C30583BzP> map2 : values) {
                if (map2.keySet().contains(c30582BzO.LJLIL)) {
                    arrayList.add(map2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(ORZ.LJLLILLLL(((java.util.Map) it.next()).values()));
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((C30583BzP) it2.next()).LJLIL = c30582BzO.LJLJI;
            }
        }
        if (liveMode == LiveMode.VIDEO) {
            liveMode2 = LiveMode.SCREEN_RECORD;
        } else {
            liveMode2 = null;
        }
        LIZLLL(liveMode2);
    }
}
