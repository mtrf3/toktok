package com.bytedance.android.live.liveinteract.multiguestv3.main.common;

import X.AbstractC73672Svk;
import X.C012403c;
import X.C0NB;
import X.C221108m2;
import X.C62822Ol8;
import X.C73969T1h;
import X.C74740TUy;
import X.C74754TVm;
import X.C74755TVn;
import X.C74756TVo;
import X.C74757TVp;
import X.C74838TYs;
import X.C74839TYt;
import X.EnumC74778TWk;
import X.InterfaceC74605TPt;
import X.InterfaceC75560Tl6;
import X.TRK;
import X.TVG;
import Y.AfS65S0100000_13;
import android.util.ArrayMap;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiliveGuestLinkmicRouteApplySetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiliveGuestLinkmicRouteReplySetting;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

@InterfaceC75560Tl6(name = "MULTI_GUEST_DATA_HOLDER")
/* loaded from: classes14.dex */
public final class MultiGuestDataHolder extends TVG {
    public static final /* synthetic */ int LJJJJJL = 0;
    public long LIZ = System.currentTimeMillis();
    public long LIZIZ = System.currentTimeMillis();
    public String LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public volatile MultiLiveAnchorPanelSettings LJIIJ;
    public final Map<Integer, String> LJIIJJI;
    public final Set<Long> LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public final Map<String, Boolean> LJIILL;
    public final Map<String, Integer> LJIILLIIL;
    public final Map<Long, Long> LJIIZILJ;
    public final C62822Ol8 LJIJ;
    public final Map<String, Integer> LJIJI;
    public final Map<String, Integer> LJIJJ;
    public final Map<String, Integer> LJIJJLI;
    public boolean LJIL;
    public final Map<String, Integer> LJJ;
    public final Map<String, Integer> LJJI;
    public List<LinkPlayerInfo> LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public EnumC74778TWk LJJIIJ;
    public EnumC74778TWk LJJIIJZLJL;
    public EnumC74778TWk LJJIIZ;
    public int LJJIIZI;
    public int LJJIJ;
    public boolean LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public InterfaceC74605TPt LJJIJIL;
    public int LJJIJL;
    public int LJJIJLIJ;
    public String LJJIL;
    public long LJJIZ;
    public Long LJJJ;
    public String LJJJI;
    public int LJJJIL;
    public ViewGroup.LayoutParams LJJJJ;
    public String LJJJJI;
    public final C62822Ol8 LJJJJIZL;
    public final C62822Ol8 LJJJJJ;

    public final void LIZ() {
        this.LJJIJL = 2;
        this.LJJIJLIJ = 2;
        this.LJJJIL = 2;
        C74740TUy.LIZLLL().LJIIJJI = 2;
        this.LJ = false;
    }

    public final String LJII() {
        if (this.LJJIIZI == -1) {
            return "panel_Golive";
        }
        return "panel_plus";
    }

    public final String LJIIIIZZ() {
        int i = this.LJJJIL;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return "no_permission";
                }
            } else {
                return "audio";
            }
        }
        return "video";
    }

    public final void LJIIJJI() {
        C0NB.LIZIZ("MultiGuestDataHolder", "onLinkMicDisconnect");
        this.LIZLLL = true;
        ((ConcurrentHashMap) this.LJIILL).clear();
        ((Map) this.LJIJ.getValue()).clear();
        ((ConcurrentHashMap) this.LJIJI).clear();
        this.LJJII = 0;
        this.LJJIJIIJI = false;
        this.LJJIJIIJIL = false;
        this.LJJIJIL = null;
        this.LJJJJ = null;
    }

    public MultiGuestDataHolder() {
        new C74839TYt();
        this.LIZLLL = true;
        this.LJ = true;
        this.LJFF = true;
        this.LJI = true;
        this.LJIIJJI = new ConcurrentHashMap();
        this.LJIIL = new HashSet();
        this.LJIILL = new ConcurrentHashMap();
        this.LJIILLIIL = new ConcurrentHashMap();
        this.LJIIZILJ = new ArrayMap();
        this.LJIJ = C221108m2.LIZIZ(C74754TVm.LJLIL);
        C221108m2.LIZIZ(C74756TVo.LJLIL);
        this.LJIJI = new ConcurrentHashMap();
        this.LJIJJ = new ConcurrentHashMap();
        this.LJIJJLI = new ConcurrentHashMap();
        this.LJIL = true;
        this.LJJ = new ConcurrentHashMap();
        this.LJJI = new ConcurrentHashMap();
        EnumC74778TWk enumC74778TWk = EnumC74778TWk.NORMAL;
        this.LJJIIJ = enumC74778TWk;
        this.LJJIIJZLJL = enumC74778TWk;
        this.LJJIIZ = enumC74778TWk;
        this.LJJIIZI = -1;
        this.LJJIJLIJ = -1;
        this.LJJJIL = -1;
        this.LJJJJIZL = C221108m2.LIZIZ(C74757TVp.LJLIL);
        this.LJJJJJ = C221108m2.LIZIZ(C74755TVn.LJLIL);
    }

    public final int LIZIZ(String str) {
        Integer num;
        if (str == null || (num = (Integer) ((ConcurrentHashMap) this.LJJI).get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final Boolean LIZJ(String str) {
        if (str == null) {
            return Boolean.FALSE;
        }
        Boolean bool = (Boolean) ((Map) this.LJIJ.getValue()).get(str);
        if (bool == null) {
            return Boolean.FALSE;
        }
        return bool;
    }

    public final int LIZLLL(String str) {
        Integer num;
        if (str == null || (num = (Integer) ((ConcurrentHashMap) this.LJJ).get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final int LJ(String str) {
        boolean z;
        LJIJI(str);
        C74740TUy LIZLLL = C74740TUy.LIZLLL();
        int i = this.LJJIJL;
        LIZLLL.LJIIJJI = i;
        if (i != 2) {
            z = true;
        } else {
            z = false;
        }
        this.LJ = z;
        return C74740TUy.LIZLLL().LJIIJJI;
    }

    public final int LJFF(String str) {
        Integer num;
        if (str == null || (num = (Integer) ((ConcurrentHashMap) this.LJIJJ).get(str)) == null) {
            return -1;
        }
        return num.intValue();
    }

    public final int LJI(String str) {
        Integer num;
        if (str == null || (num = (Integer) ((ConcurrentHashMap) this.LJIJI).get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final int LJIIIZ(String key) {
        o.LJIIIZ(key, "key");
        Integer num = (Integer) ((ConcurrentHashMap) this.LJIILLIIL).get(key);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final Boolean LJIIJ(String str) {
        if (str == null) {
            return Boolean.FALSE;
        }
        return (Boolean) ((ConcurrentHashMap) this.LJIILL).get(str);
    }

    public final void LJIILL(String str) {
        this.LIZJ = null;
        ((HashSet) this.LJIIL).clear();
        LJIJ(0);
        LJIILLIIL(EnumC74778TWk.NORMAL);
        C74838TYs.LJ().LJJII = 2;
        this.LJII = 0;
        this.LJJIJIIJI = false;
        this.LJJIJIIJIL = false;
        this.LJJIJIL = null;
        this.LJJJJ = null;
        this.LJIILJJIL = false;
        this.LJJJJI = null;
        if (!o.LJ("destroy_channel", "destroy_channel")) {
            ((Map) this.LJJJJIZL.getValue()).clear();
            ((Map) this.LJJJJJ.getValue()).clear();
        }
        this.LJJIL = null;
        ((ArrayMap) this.LJIIZILJ).clear();
    }

    public final void LJIILLIIL(EnumC74778TWk value) {
        o.LJIIIZ(value, "value");
        this.LJJIIJZLJL = this.LJJIIZ;
        this.LJJIIZ = value;
        C74838TYs.LJ().LJJIZ = value.getStrVal();
        AbstractC73672Svk.LJJIJIL(1).LJIIL(2L, TimeUnit.SECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS65S0100000_13(this, 26));
    }

    public final void LJIIZILJ(long j) {
        int LIZIZ = TRK.LIZIZ(j);
        this.LJJIJLIJ = LIZIZ;
        this.LJJIZ = j;
        if (LIZIZ != -1 && LIZIZ != 0) {
            this.LJJJIL = LIZIZ;
        }
    }

    public final void LJIJ(int i) {
        this.LJIILIIL = i;
        C012403c.LJ("update linkedGuestNum:", i, "MultiGuestDataHolder");
    }

    public final void LJIJI(String str) {
        if (this.LJJIJL != 0) {
            return;
        }
        if (o.LJ(str, "apply")) {
            int value = MultiliveGuestLinkmicRouteApplySetting.INSTANCE.getValue();
            if (value != 1) {
                if (value == 2) {
                    this.LJJIJL = 2;
                }
            } else {
                this.LJJIJL = 1;
            }
        } else if (o.LJ(str, "reply")) {
            int value2 = MultiliveGuestLinkmicRouteReplySetting.INSTANCE.getValue();
            if (value2 != 1) {
                if (value2 == 2) {
                    this.LJJIJL = 2;
                }
            } else {
                this.LJJIJL = 1;
            }
        }
        this.LJJIJL = 2;
    }

    public final void LJIIL(String key, boolean z) {
        o.LJIIIZ(key, "key");
        ((Map) this.LJIJ.getValue()).put(key, Boolean.valueOf(z));
    }

    public final void LJIILIIL(int i, String key) {
        o.LJIIIZ(key, "key");
        ((ConcurrentHashMap) this.LJIILLIIL).put(key, Integer.valueOf(i));
    }

    public final void LJIILJJIL(String key, boolean z) {
        o.LJIIIZ(key, "key");
        ((ConcurrentHashMap) this.LJIILL).put(key, Boolean.valueOf(z));
    }
}
