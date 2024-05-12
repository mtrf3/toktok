package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.live.rank.impl.list.controller.RankListController;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.controller.RankRootController;
import com.bytedance.android.live.rank.impl.list.fragment.list.RankListFragment;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.Uie, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77956Uie implements InterfaceC72822Si2 {
    public final /* synthetic */ RankListFragment LJLIL;

    public C77956Uie(RankListFragment rankListFragment) {
        this.LJLIL = rankListFragment;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        RankPageController rankPageController;
        int i;
        int i2;
        C31526CYw c31526CYw;
        RankTypeV2 rankTypeV2;
        int i3;
        String str;
        InterfaceC78502UrS interfaceC78502UrS;
        int i4;
        int i5;
        int i6;
        Object obj;
        RankListV2Response.RankInfo rankInfo;
        RankPageController rankPageController2;
        RankRootController rankRootController;
        boolean z;
        boolean z2;
        Object obj2;
        String LJJIJIL;
        RankListFragment rankListFragment = this.LJLIL;
        rankListFragment.getClass();
        if (!o.LJ(c199097rd.LJLIL, "ttlive_anchor_ranking_click_cell_event") || rankListFragment.LJLJJLL == null || (rankPageController = rankListFragment.LJLJL) == null || rankPageController.LJLJJL == null || !rankListFragment.vl()) {
            return;
        }
        InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns != null) {
            i = u.LJJIJIIJI(interfaceC78280Uns, "rank_type", -1);
        } else {
            i = -1;
        }
        InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns2 != null) {
            i2 = u.LJJIJIIJI(interfaceC78280Uns2, "related_rank_type", -1);
        } else {
            i2 = -1;
        }
        RankListController rankListController = rankListFragment.LJLJJLL;
        if (rankListController == null || (c31526CYw = rankListController.LJLJI) == null || (rankTypeV2 = c31526CYw.LIZIZ) == null || i2 != rankTypeV2.type) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (Math.abs(uptimeMillis - C31512CYi.LIZ) < 1200) {
            return;
        }
        C31512CYi.LIZ = uptimeMillis;
        InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns3 != null) {
            i3 = u.LJJIJIIJI(interfaceC78280Uns3, "rank_period", 0);
        } else {
            i3 = 0;
        }
        InterfaceC78280Uns interfaceC78280Uns4 = c199097rd.LJLILLLLZI;
        String str2 = "";
        if (interfaceC78280Uns4 == null || (str = u.LJJIJIL(interfaceC78280Uns4, "rank_info", "")) == null) {
            str = "";
        }
        InterfaceC78280Uns interfaceC78280Uns5 = c199097rd.LJLILLLLZI;
        Object obj3 = null;
        if (interfaceC78280Uns5 != null) {
            interfaceC78502UrS = u.LJJIIZ(interfaceC78280Uns5, "room_ids", null);
        } else {
            interfaceC78502UrS = null;
        }
        InterfaceC78280Uns interfaceC78280Uns6 = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns6 != null) {
            i4 = u.LJJIJIIJI(interfaceC78280Uns6, "anchor_rank", 0);
        } else {
            i4 = 0;
        }
        InterfaceC78280Uns interfaceC78280Uns7 = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns7 != null) {
            i5 = u.LJJIJIIJI(interfaceC78280Uns7, "list_type", 0);
        } else {
            i5 = 0;
        }
        InterfaceC78280Uns interfaceC78280Uns8 = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns8 != null && (LJJIJIL = u.LJJIJIL(interfaceC78280Uns8, "current_user_id", "")) != null) {
            str2 = LJJIJIL;
        }
        long LJJII = C1E4.LJJII(str2);
        if (interfaceC78502UrS != null) {
            i6 = interfaceC78502UrS.size();
        } else {
            i6 = 0;
        }
        long[] jArr = new long[i6];
        try {
            if (!TextUtils.isEmpty(str)) {
                obj2 = C09650Zl.LIZJ.LJI(str, RankListV2Response.RankInfo.class);
            } else {
                obj2 = null;
            }
            if (interfaceC78502UrS != null) {
                try {
                    int size = interfaceC78502UrS.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        jArr[i7] = C1E4.LJJII(interfaceC78502UrS.getString(i7));
                    }
                    obj3 = C76800UCe.LIZ;
                } catch (Throwable th) {
                    th = th;
                    obj3 = obj2;
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                    obj = obj3;
                    rankInfo = (RankListV2Response.RankInfo) obj;
                    if (rankInfo != null) {
                        return;
                    } else {
                        return;
                    }
                }
            }
            C3C5.m7constructorimpl(obj3);
            obj = obj2;
        } catch (Throwable th2) {
            th = th2;
        }
        rankInfo = (RankListV2Response.RankInfo) obj;
        if (rankInfo != null || (rankPageController2 = rankListFragment.LJLJL) == null || (rankRootController = rankPageController2.LJLJJL) == null) {
            return;
        }
        EnumC31514CYk enumC31514CYk = rankListFragment.LJLJJI.LIZ;
        if (i3 == -1) {
            z = true;
        } else {
            z = false;
        }
        C31526CYw c31526CYw2 = new C31526CYw(enumC31514CYk, i, i2, i2, z);
        long j = i4;
        if (i5 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        rankRootController.LJ(rankInfo, new C77935UiJ(c31526CYw2, null, jArr, null, LJJII, j, z2, true));
    }
}
