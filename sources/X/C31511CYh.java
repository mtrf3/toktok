package X;

import android.os.SystemClock;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.rank.impl.list.RankListDialog;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.google.android.play.core.appupdate.u;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;

/* renamed from: X.CYh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31511CYh implements InterfaceC72822Si2 {
    public final /* synthetic */ CYY LJLIL;

    public C31511CYh(CYY cyy) {
        this.LJLIL = cyy;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        int i;
        int i2;
        int i3;
        boolean z;
        long j;
        FragmentManager fragmentManager;
        String str;
        int i4;
        long j2;
        FragmentManager fragmentManager2;
        RankListDialog LIZ;
        CYY cyy = this.LJLIL;
        cyy.getClass();
        String str2 = c199097rd.LJLIL;
        long j3 = 0;
        int i5 = -1;
        String str3 = "RankHistoryDialog";
        if (o.LJ(str2, "liveLastGiftRankOpen")) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                i5 = u.LJJIJIIJI(interfaceC78280Uns, "rank_type", -1);
            }
            InterfaceC78280Uns interfaceC78280Uns2 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns2 != null) {
                i4 = u.LJJIJIIJI(interfaceC78280Uns2, "rank_stage", 0);
            } else {
                i4 = 0;
            }
            InterfaceC78280Uns interfaceC78280Uns3 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns3 != null) {
                j2 = u.LJJIJIIJI(interfaceC78280Uns3, "list_lynx_type", 0);
            } else {
                j2 = 0;
            }
            RankTabInfo rankTabInfo = new RankTabInfo();
            rankTabInfo.rankType = i5;
            rankTabInfo.LJLIL = C15380j0.LJIILJJIL(R.string.m7w);
            rankTabInfo.LJLILLLLZI = i4;
            rankTabInfo.listLynxType = j2;
            List LJJIJ = C47261Igj.LJJIJ(rankTabInfo);
            Iterator it = LJJIJ.iterator();
            while (it.hasNext()) {
                if ((EnumC31059CGx.RANK_DIALOG.getScene() & ((RankTabInfo) it.next()).listLynxType) != 0) {
                    C73340SqO.LJJIJIIJI(cyy.LJLIL.getContext(), cyy.LJLILLLLZI, LJJIJ);
                    return;
                }
            }
            Room room = cyy.LJLJLLL;
            if (room == null || i5 != RankTypeV2.LIZIZ.type) {
                return;
            }
            User owner = room.getOwner();
            if (owner != null) {
                j3 = owner.getId();
            }
            C77934UiI c77934UiI = new C77934UiI(j3, room.getId(), LJJIJ, cyy.LJLL, BPN.LIZ(i5, 0), BPN.LIZ(i5, 0), EnumC31514CYk.GIFT_RANK);
            DataChannel dataChannel = cyy.LJLILLLLZI;
            if (dataChannel == null || (fragmentManager2 = (FragmentManager) dataChannel.kv0(C29494Bhq.class)) == null || (LIZ = C77933UiH.LIZ(c77934UiI, cyy.LJLIL, true, false)) == null) {
                return;
            }
            LIZ.show(fragmentManager2, "RankHistoryDialog");
            return;
        }
        if (!o.LJ(str2, "ttlive_anchor_ranking_open_event")) {
            return;
        }
        InterfaceC78280Uns interfaceC78280Uns4 = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns4 != null) {
            i = u.LJJIJIIJI(interfaceC78280Uns4, "rank_group_type", -1);
        } else {
            i = -1;
        }
        InterfaceC78280Uns interfaceC78280Uns5 = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns5 != null) {
            i2 = u.LJJIJIIJI(interfaceC78280Uns5, "select_rank_type", -1);
        } else {
            i2 = -1;
        }
        InterfaceC78280Uns interfaceC78280Uns6 = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns6 != null) {
            i3 = u.LJJIJIIJI(interfaceC78280Uns6, "select_sub_rank_type", -1);
        } else {
            i3 = -1;
        }
        InterfaceC78280Uns interfaceC78280Uns7 = c199097rd.LJLILLLLZI;
        if (interfaceC78280Uns7 != null && u.LJJIJIIJI(interfaceC78280Uns7, "rank_period", 0) != 0) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        try {
            InterfaceC78280Uns interfaceC78280Uns8 = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns8 == null || (str = u.LJJIJIL(interfaceC78280Uns8, "tab_infos", "")) == null) {
                str = "";
            }
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            int i6 = 0;
            while (i6 < length) {
                int optInt = JSONArrayProtectorUtils.getJSONObject(jSONArray, i6).optInt("rank_type", i5);
                String optString = JSONArrayProtectorUtils.getJSONObject(jSONArray, i6).optString("title", "");
                int optInt2 = JSONArrayProtectorUtils.getJSONObject(jSONArray, i6).optInt("rank_stage", 0);
                long optLong = JSONArrayProtectorUtils.getJSONObject(jSONArray, i6).optLong("list_lynx_type", 0L);
                RankTabInfo rankTabInfo2 = new RankTabInfo();
                rankTabInfo2.rankType = optInt;
                rankTabInfo2.LJLIL = optString;
                rankTabInfo2.LJLILLLLZI = optInt2;
                rankTabInfo2.listLynxType = optLong;
                arrayList.add(rankTabInfo2);
                i6++;
                i5 = -1;
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if ((EnumC31059CGx.RANK_DIALOG.getScene() & ((RankTabInfo) it2.next()).listLynxType) != 0) {
                C73340SqO.LJJIJIIJI(cyy.LJLIL.getContext(), cyy.LJLILLLLZI, arrayList);
                return;
            }
        }
        Room room2 = cyy.LJLJLLL;
        if (room2 == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (Math.abs(uptimeMillis - C31512CYi.LIZ) < 1200) {
            return;
        }
        C31512CYi.LIZ = uptimeMillis;
        User owner2 = room2.getOwner();
        if (owner2 != null) {
            j = owner2.getId();
        } else {
            j = 0;
        }
        long id = room2.getId();
        boolean z2 = cyy.LJLL;
        RankTypeV2 LIZ2 = BPN.LIZ(i2, 0);
        RankTypeV2 LIZ3 = BPN.LIZ(i3, 0);
        EnumC31514CYk.Companion.getClass();
        C77934UiI c77934UiI2 = new C77934UiI(j, id, arrayList, z2, LIZ2, LIZ3, C31513CYj.LIZ(i));
        DataChannel dataChannel2 = cyy.LJLILLLLZI;
        if (dataChannel2 == null || (fragmentManager = (FragmentManager) dataChannel2.kv0(C29494Bhq.class)) == null) {
            return;
        }
        if (!z) {
            str3 = C16880lQ.LJLLJ(RankListDialog.class);
        }
        RankListDialog LIZ4 = C77933UiH.LIZ(c77934UiI2, cyy.LJLIL, z, false);
        if (LIZ4 == null) {
            return;
        }
        LIZ4.show(fragmentManager, str3);
    }
}
