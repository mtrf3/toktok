package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.android.livesdk.feed.tab.api.FeedTabApi;
import com.bytedance.android.livesdk.model.ItemTab;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class BOX {
    public static volatile BOX LJ;
    public FeedTabApi LIZ;
    public final C79081V1x LIZIZ = new C79081V1x();
    public List<ItemTab> LIZJ;
    public List<ItemTab> LIZLLL;

    public final synchronized void LIZ() {
        if (!LJII(this.LIZJ)) {
            List<ItemTab> list = (List) LJIIIIZZ(new BOZ(), "ttlive_tabs_cache");
            this.LIZJ = list;
            if (!LJII(list)) {
                this.LIZJ = LIZIZ();
            }
        }
    }

    public static List LIZIZ() {
        ArrayList arrayList = new ArrayList(1);
        ItemTab itemTab = new ItemTab();
        itemTab.setId(1L);
        itemTab.setEvent("live");
        itemTab.setName("Top LIVEs");
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline() || ((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLiveInhouse()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("https://");
            C65124PhA.LIZLLL().getClass();
            LIZ.append(C65124PhA.LIZJ());
            LIZ.append("/webcast/feed/?content_type=0&style=2&channel_id=21&debug=true");
            itemTab.setUrl(X1D.LIZIZ(LIZ));
        } else {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("https://");
            C65124PhA.LIZLLL().getClass();
            LIZ2.append(C65124PhA.LIZJ());
            LIZ2.append("/webcast/feed/?content_type=0&style=2&channel_id=21");
            itemTab.setUrl(X1D.LIZIZ(LIZ2));
        }
        itemTab.setShowdefault(1);
        itemTab.setStyle(2);
        itemTab.setType(1);
        itemTab.setSource(1001);
        itemTab.setDislike(0);
        arrayList.add(itemTab);
        return arrayList;
    }

    public static BOX LJFF() {
        if (LJ == null) {
            synchronized (BOX.class) {
                if (LJ == null) {
                    LJ = new BOX();
                }
            }
        }
        return LJ;
    }

    public final List<ItemTab> LJ() {
        if (!LJII(this.LIZLLL)) {
            this.LIZLLL = (List) LJIIIIZZ(new BOY(), "ttlive_tabs_cache_fyp");
        }
        if (!LJII(this.LIZLLL)) {
            return null;
        }
        return new ArrayList(this.LIZLLL);
    }

    public final C73805Sxt LJIIIZ() {
        if (this.LIZ == null) {
            this.LIZ = (FeedTabApi) Q7L.LIZIZ(FeedTabApi.class);
        }
        return this.LIZ.queryTab(2).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJIJL(new C79061V1d()).LJJIJL(new C72107SRr(0, this));
    }

    public final List<ItemTab> LIZJ() {
        if (TextUtils.equals("homepage_hot", C28594BKc.LIZJ().LIZLLL())) {
            return LJ();
        }
        LIZ();
        return new ArrayList(this.LIZJ);
    }

    public static boolean LJI(List<ItemTab> list) {
        if (!LJII(list)) {
            return false;
        }
        for (ItemTab itemTab : list) {
            if (itemTab == null || !itemTab.isItemValid()) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJII(List<ItemTab> list) {
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    public final ItemTab LIZLLL(long j) {
        LIZ();
        if (C32151Nz.LJJIIJZLJL(this.LIZJ)) {
            return null;
        }
        for (ItemTab itemTab : this.LIZJ) {
            if (itemTab != null && itemTab.getId() == j) {
                return itemTab;
            }
        }
        return null;
    }

    public static Object LJIIIIZZ(TypeToken typeToken, String str) {
        Object obj = null;
        if (C15380j0.LIZLLL() == null) {
            return null;
        }
        String string = F9J.LIZIZ(C15380j0.LIZLLL(), 0, str).getString("tabs", "");
        if (C38354F3m.LJ(string)) {
            return null;
        }
        try {
            Type type = typeToken.getType();
            if (string == null) {
                return null;
            }
            try {
                obj = C09650Zl.LIZIZ.LJII(string, type);
                return obj;
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return obj;
            }
        } catch (n e2) {
            C0NB.LJII(e2);
            return obj;
        }
    }

    public static void LJIIJ(String str, List list) {
        try {
            String json = GsonProtectorUtils.toJson(C09650Zl.LIZIZ, list);
            if (C15380j0.LIZLLL() == null) {
                return;
            }
            SharedPreferences.Editor edit = F9J.LIZIZ(C15380j0.LIZLLL(), 0, str).edit();
            edit.putString("tabs", json);
            WX6.LIZ(edit);
        } catch (k e) {
            C0NB.LJFF("BaseLocalFeedTabDataSource", "writeToSP: ", e);
        }
    }
}
