package X;

import com.bytedance.android.live.base.model.roomcomponents.OnlineRankConfig;
import com.bytedance.android.live.base.model.roomcomponents.OnlineRankListResponse;
import com.bytedance.android.live.base.model.roomcomponents.RoomComponentsResponse;
import com.bytedance.android.live.broadcast.api.OnlineRankConfigChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.rank.api.model.Rank;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.s1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import webcast.api.room.GetOnlineRoomPCUResponse;

/* renamed from: X.CXz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31503CXz implements B7J {
    public final /* synthetic */ C31502CXy LIZ;

    public C31503CXz(C31502CXy c31502CXy) {
        this.LIZ = c31502CXy;
    }

    @Override // X.B7J
    public final void LIZ(C32201Oe c32201Oe) {
        Throwable th;
        String message;
        Long l;
        RoomComponentsResponse roomComponentsResponse;
        Long l2;
        OnlineRankListResponse onlineRankListResponse;
        GetOnlineRoomPCUResponse.ResponseData responseData;
        int i;
        long j;
        long j2;
        long j3;
        long j4;
        Long l3;
        RoomComponentsResponse roomComponentsResponse2;
        if (c32201Oe == null || c32201Oe.LJLILLLLZI != null || (roomComponentsResponse = c32201Oe.LJLIL) == null || roomComponentsResponse.onlineAudienceData == null || roomComponentsResponse == null || (l2 = roomComponentsResponse.onlineAudienceStatus) == null || l2.longValue() != 1 || ((c32201Oe.LJLILLLLZI != null || (roomComponentsResponse2 = c32201Oe.LJLIL) == null || roomComponentsResponse2.roomPcu == null || roomComponentsResponse2 == null || roomComponentsResponse2.roomPcuStatus != 1) && this.LIZ.LJZI)) {
            DataChannel dataChannel = this.LIZ.LJLIL;
            if (c32201Oe != null) {
                th = c32201Oe.LJLILLLLZI;
            } else {
                th = null;
            }
            long j5 = 0;
            if (CY0.LJI == 0) {
                CY0.LJI = System.currentTimeMillis();
                HashMap LIZJ = C03660Ck.LIZJ("data_source", "components");
                LIZJ.put("duration", Long.valueOf(CY0.LJI - CY0.LJFF));
                LIZJ.put("is_error", Boolean.TRUE);
                if (dataChannel != null && (l = (Long) dataChannel.kv0(C28394BCk.class)) != null) {
                    j5 = l.longValue();
                }
                LIZJ.put("room_duration", Long.valueOf(CY0.LJI - j5));
                String str = "";
                if (th instanceof C29401Dk) {
                    LIZJ.put("error_type", "api_error");
                    C29401Dk c29401Dk = (C29401Dk) th;
                    LIZJ.put("error_code", Integer.valueOf(c29401Dk.getErrorCode()));
                    String errorMsg = c29401Dk.getErrorMsg();
                    if (errorMsg != null) {
                        str = errorMsg;
                    }
                    LIZJ.put("error_msg", str);
                } else if (th instanceof C0TL) {
                    LIZJ.put("error_type", "net_error");
                    C0TL c0tl = (C0TL) th;
                    LIZJ.put("error_code", Integer.valueOf(c0tl.getCronetError()));
                    String message2 = c0tl.getMessage();
                    if (message2 != null) {
                        str = message2;
                    }
                    LIZJ.put("error_msg", str);
                } else {
                    LIZJ.put("error_type", "un_know");
                    LIZJ.put("error_code", -1);
                    if (th != null && (message = th.getMessage()) != null) {
                        str = message;
                    }
                    LIZJ.put("error_msg", str);
                }
                CY0.LIZ(dataChannel, LIZJ);
                C0K2.LJIIL(CY0.LJI - CY0.LJFF, 1, "ttlive_audience_rank_entrance_error", LIZJ);
                if (C32777Cth.LIZ(0.1f, "ttlive_audience_rank_entrance_show_all") && LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_audience_rank_entrance_show_all", 0.1d)) {
                    C0K2.LJIIL(CY0.LJI - CY0.LJFF, 1, "ttlive_audience_rank_entrance_show_all", LIZJ);
                }
            }
            this.LIZ.LIZLLL();
            return;
        }
        RoomComponentsResponse roomComponentsResponse3 = c32201Oe.LJLIL;
        if (roomComponentsResponse3 == null || (onlineRankListResponse = roomComponentsResponse3.onlineAudienceData) == null) {
            return;
        }
        C31502CXy c31502CXy = this.LIZ;
        DataChannel dataChannel2 = c31502CXy.LJLIL;
        if (CY0.LJI == 0 && C32777Cth.LIZ(0.1f, "ttlive_audience_rank_entrance_show_all") && LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_audience_rank_entrance_show_all", 0.1d)) {
            CY0.LJI = System.currentTimeMillis();
            HashMap LIZJ2 = C03660Ck.LIZJ("data_source", "components");
            LIZJ2.put("duration", Long.valueOf(CY0.LJI - CY0.LJFF));
            LIZJ2.put("is_error", Boolean.FALSE);
            if (dataChannel2 != null && (l3 = (Long) dataChannel2.kv0(C28394BCk.class)) != null) {
                j4 = l3.longValue();
            } else {
                j4 = 0;
            }
            LIZJ2.put("room_duration", Long.valueOf(CY0.LJI - j4));
            CY0.LIZ(dataChannel2, LIZJ2);
            C0K2.LJIIL(CY0.LJI - CY0.LJFF, 0, "ttlive_audience_rank_entrance_show_all", LIZJ2);
        }
        RoomComponentsResponse roomComponentsResponse4 = c32201Oe.LJLIL;
        if (roomComponentsResponse4 != null) {
            responseData = roomComponentsResponse4.roomPcu;
        } else {
            responseData = null;
        }
        if (c31502CXy.LJZI) {
            if (responseData != null) {
                j3 = responseData.totalUserCount;
            } else {
                j3 = 0;
            }
            i = (int) j3;
        } else {
            i = onlineRankListResponse.total;
        }
        C28652BMi.LIZJ(i);
        Rank rank = onlineRankListResponse.selfInfo;
        if (rank != null) {
            j = rank.rank;
        } else {
            j = 0;
        }
        C28652BMi.LIZLLL = j;
        if (rank != null) {
            j2 = rank.score;
        } else {
            j2 = 0;
        }
        C28652BMi.LJ = j2;
        c31502CXy.LJLLI = true;
        OnlineRankConfig onlineRankConfig = onlineRankListResponse.config;
        if (onlineRankConfig != null) {
            c31502CXy.LJLL = onlineRankConfig;
            c31502CXy.LJLIL.rv0(OnlineRankConfigChannel.class, onlineRankConfig);
        }
        ((ArrayList) c31502CXy.LJLJLLL).clear();
        List<Rank> list = onlineRankListResponse.ranks;
        ArrayList LIZIZ = s1.LIZIZ(list, "response.ranks");
        for (Rank rank2 : list) {
            if (rank2.user != null) {
                LIZIZ.add(rank2);
            }
        }
        List<Rank> LLILLL = ORZ.LLILLL(LIZIZ, c31502CXy.LJLL.avatarNumber);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LLILLL, 10));
        for (Rank item : LLILLL) {
            o.LJIIIIZZ(item, "item");
            arrayList.add(C77119UOl.LJIIIIZZ(item, C29306Beo.LJIIJ(c31502CXy.LJLIL)));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ArrayList) c31502CXy.LJLJLLL).add(it.next());
        }
        if (i > 0) {
            c31502CXy.LJI(i);
        }
        c31502CXy.LIZIZ();
    }
}
