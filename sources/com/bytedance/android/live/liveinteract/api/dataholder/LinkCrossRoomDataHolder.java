package com.bytedance.android.live.liveinteract.api.dataholder;

import X.B83;
import X.BM1;
import X.C05630Jz;
import X.C0K2;
import X.C16880lQ;
import X.C28272B7s;
import X.C28509BGv;
import X.C29044Baa;
import X.C29306Beo;
import X.C29374Bfu;
import X.C32041Chp;
import X.C37;
import X.C38;
import X.C61878OQg;
import X.C75648TmW;
import X.C75755ToF;
import X.EnumC75524TkW;
import X.EnumC75614Tly;
import X.EnumC75617Tm1;
import X.EnumC75636TmK;
import X.EnumC75672Tmu;
import X.InterfaceC29405BgP;
import X.InterfaceC75560Tl6;
import X.TVG;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.LinkConnectionTypeChangedEvent;
import com.bytedance.android.live.liveinteract.api.LinkGuestUserIdUpdateEvent;
import com.bytedance.android.live.liveinteract.api.LinkerStateChannel;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdk.chatroom.interact.model.RivalsListsData;
import com.bytedance.android.livesdk.dataChannel.InteractModeChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostNeedWaitRtcJoinChannelSucceed;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

@InterfaceC75560Tl6(name = "LINK_CROSS_DATA_HOLDER")
/* loaded from: classes14.dex */
public final class LinkCrossRoomDataHolder extends TVG {
    public static LinkCrossRoomDataHolder LJLILLLLZI;
    public static final Map<String, Object> LJLJI = new ConcurrentHashMap();
    public static long LJLJJI;
    public final long LIZ;
    public DataChannel LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public long LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIL;
    public int LJIILJJIL;
    public C28272B7s LJIILL;
    public long LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public String LJJI;
    public String LJJIFFI;
    public Room LJJII;
    public RivalExtraInfo LJJIII;
    public Room LJJIIJ;
    public RivalExtraInfo LJJIIJZLJL;
    public RivalsListsData.TopHostInfo LJJIIZ;
    public long LJJIIZI;
    public long LJJIJ;
    public String LJJIJIIJI;
    public String LJJIJIIJIL;
    public int LJJIJIL;
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public User LJJIL;
    public long LJJIZ;
    public C75648TmW LJJJ;
    public C75755ToF LJJJI;
    public String LJJJIL;
    public int LJJJJ;
    public String LJJJJI;
    public final Map<Long, SurfaceView> LJJJJIZL;
    public boolean LJJJJJ;
    public long LJJJJJL;
    public String LJJJJL;
    public boolean LJJJJLI;
    public boolean LJJJJLL;
    public boolean LJJJJZ;
    public Map<String, String> LJJJJZI;
    public EnumC75672Tmu LJJJLIIL;
    public EnumC75672Tmu LJJJLL;
    public String LJJJLZIJ;
    public final List<Object> LJJJZ;
    public String LJJL;
    public String LJJLI;
    public String LJJLIIIIJ;
    public String LJJLIIIJ;
    public boolean LJJLIIIJILLIZJL;
    public Integer LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public long LJJLIIIJL;
    public long LJJLIIIJLJLI;
    public long LJJLIIIJLLLLLLLZ;
    public long LJJLIIJ;
    public long LJJLIL;
    public String LJJLJ;
    public boolean LJJLJLI;
    public boolean LJJLL;
    public boolean LJJZ;
    public int LJJZZI;
    public final Map<Long, Long> LJJZZIII;
    public List<Long> LJL;
    public String LJLI;
    public boolean LJLIIIL;
    public Long LJLIIL;
    public String LJLIL;
    public EnumC75614Tly LJIIJ = EnumC75614Tly.NONE;
    public EnumC75617Tm1 LJIIJJI = EnumC75617Tm1.NONE;
    public String LJIILIIL = "";
    public final ConcurrentHashMap<Long, EnumC75524TkW> LJIILLIIL = new ConcurrentHashMap<>();

    public final EnumC75636TmK LIZJ() {
        EnumC75636TmK enumC75636TmK;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel == null || (enumC75636TmK = (EnumC75636TmK) dataChannel.kv0(LinkerStateChannel.class)) == null) {
            return EnumC75636TmK.DISABLED;
        }
        return enumC75636TmK;
    }

    public final C32041Chp LIZLLL() {
        C32041Chp c32041Chp = new C32041Chp();
        c32041Chp.LIZ = this.LJFF;
        c32041Chp.LIZIZ = this.LJI;
        c32041Chp.LIZJ = 0;
        c32041Chp.LIZLLL = "anchor";
        c32041Chp.LJ = this.LJIILIIL;
        c32041Chp.LJFF = CardStruct.IStatusCode.DEFAULT;
        return c32041Chp;
    }

    public final int LJ() {
        Integer num;
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel == null || (num = (Integer) dataChannel.kv0(InteractModeChannel.class)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public final boolean LJI() {
        long j = this.LJFF;
        if (j <= 0 || this.LJIILLIIL.get(Long.valueOf(j)) != EnumC75524TkW.ROOM_ENTER) {
            return false;
        }
        return true;
    }

    public final boolean LIZ(EnumC75636TmK targetState) {
        o.LJIIIZ(targetState, "targetState");
        EnumC75636TmK LIZJ = LIZJ();
        o.LJI(LIZJ);
        if (LIZJ.compareTo(targetState) >= 0) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(Map<Long, BattleUserInfo> map) {
        if (map == null) {
            return;
        }
        long currentUserId = ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
        long j = 0;
        for (Map.Entry<Long, BattleUserInfo> entry : map.entrySet()) {
            if (entry.getKey().longValue() > 0 && entry.getKey().longValue() != currentUserId) {
                j = entry.getKey().longValue();
            }
        }
        if (j > 0 && this.LJI <= 0) {
            this.LJI = j;
            DataChannel dataChannel = this.LIZIZ;
            if (dataChannel != null) {
                dataChannel.qv0(LinkGuestUserIdUpdateEvent.class, Long.valueOf(j));
            }
        }
    }

    public final void LJII(String str) {
        String str2;
        long j;
        String str3;
        String str4;
        String str5;
        long j2;
        long j3;
        String str6;
        int i;
        LiveMode streamType;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LJLJJI;
        Room room = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        String str7 = CardStruct.IStatusCode.DEFAULT;
        if (room != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("event_id", "data_reset");
            } catch (JSONException unused) {
            }
            try {
                jSONObject.put("reset_source", str);
            } catch (JSONException unused2) {
            }
            Long value = Long.valueOf(this.LJFF);
            o.LJIIIZ(value, "value");
            try {
                jSONObject.put("channel_id", value);
            } catch (JSONException unused3) {
            }
            if (Room.isValid(room)) {
                str2 = room.getIdStr();
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            o.LJIIIIZZ(str2, "if (Room.isValid(room)) room.idStr else \"0\"");
            try {
                jSONObject.put("room_id", str2);
            } catch (JSONException unused4) {
            }
            LiveMode streamType2 = room.getStreamType();
            o.LJIIIIZZ(streamType2, "room.streamType");
            try {
                jSONObject.put("live_type", C28509BGv.LIZ(streamType2));
            } catch (JSONException unused5) {
            }
            long ownerUserId = room.getOwnerUserId();
            InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
            if (LIZIZ != null) {
                j = ((C29374Bfu) LIZIZ).getCurrentUserId();
            } else {
                j = 0;
            }
            Long value2 = Long.valueOf(ownerUserId);
            o.LJIIIZ(value2, "value");
            try {
                jSONObject.put("anchor_id", value2);
            } catch (JSONException unused6) {
            }
            Long value3 = Long.valueOf(this.LJI);
            o.LJIIIZ(value3, "value");
            try {
                jSONObject.put("guest_anchor_id", value3);
            } catch (JSONException unused7) {
            }
            Long value4 = Long.valueOf(j);
            o.LJIIIZ(value4, "value");
            try {
                jSONObject.put("current_user_id", value4);
            } catch (JSONException unused8) {
            }
            String str8 = this.LJJIJIIJI;
            if (str8 == null) {
                str8 = "";
            }
            try {
                jSONObject.put("link_mic_id", str8);
            } catch (JSONException unused9) {
            }
            o.LJIIIZ(0L, "value");
            try {
                jSONObject.put("rtc_join_channel_advance", (Object) 0L);
            } catch (JSONException unused10) {
            }
            Boolean value5 = Boolean.TRUE;
            o.LJIIIZ(value5, "value");
            try {
                jSONObject.put("server_auto_joinchannel", value5);
            } catch (JSONException unused11) {
            }
            EnumC75636TmK LIZJ = LIZJ();
            if (LIZJ == null || (str3 = LIZJ.name()) == null) {
                str3 = "";
            }
            try {
                jSONObject.put("link_state", str3);
            } catch (JSONException unused12) {
            }
            Float value6 = Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue());
            o.LJIIIZ(value6, "value");
            try {
                jSONObject.put("device_score", value6);
            } catch (JSONException unused13) {
            }
            Long value7 = Long.valueOf(TTNetInit.getEffectiveConnectionType());
            o.LJIIIZ(value7, "value");
            try {
                jSONObject.put("network_type", value7);
            } catch (JSONException unused14) {
            }
            EnumC75614Tly value8 = this.LJIIJ;
            o.LJIIIZ(value8, "value");
            try {
                jSONObject.put("invite_type", value8);
            } catch (JSONException unused15) {
            }
            if (CoHostNeedWaitRtcJoinChannelSucceed.INSTANCE.getValue()) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            try {
                jSONObject.put("need_wait_rtc_joinchannel_succeed", str4);
            } catch (JSONException unused16) {
            }
            if (ownerUserId == j) {
                str5 = "ttlive_client_anchor_link_mic_monitor";
            } else {
                str5 = "ttlive_client_audience_link_mic_monitor";
            }
            C0K2.LJIIIIZZ(str5, 1, jSONObject);
        }
        this.LJJJI = null;
        Room room2 = (Room) dataChannelGlobal.mv0(C29044Baa.class);
        if (room2 != null) {
            j2 = room2.getOwnerUserId();
        } else {
            j2 = 0;
        }
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        if (LIZIZ2 != null) {
            j3 = ((C29374Bfu) LIZIZ2).getCurrentUserId();
        } else {
            j3 = 0;
        }
        if (j2 != j3) {
            if (LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_client_co_host_identify", 0.2d)) {
                JSONObject jSONObject2 = new JSONObject();
                EnumC75524TkW enumC75524TkW = this.LJIILLIIL.get(Long.valueOf(this.LJFF));
                if (enumC75524TkW != null) {
                    C05630Jz.LJFF(jSONObject2, "channel_id", this.LJFF);
                    if (Room.isValid(room2)) {
                        o.LJI(room2);
                        str7 = room2.getIdStr();
                    }
                    C05630Jz.LJI(jSONObject2, "room_id", str7);
                    if (room2 != null && (streamType = room2.getStreamType()) != null) {
                        str6 = C28509BGv.LIZ(streamType);
                    } else {
                        str6 = null;
                    }
                    C05630Jz.LJI(jSONObject2, "live_type", str6);
                    C05630Jz.LJFF(jSONObject2, "anchor_id", j2);
                    C05630Jz.LJFF(jSONObject2, "current_user_id", j3);
                    C05630Jz.LJI(jSONObject2, "identify_status", enumC75524TkW.getValue());
                    long j4 = this.LJIJ;
                    if (j4 > 0) {
                        long j5 = this.LJIJI;
                        if (j5 > 0) {
                            C05630Jz.LJFF(jSONObject2, "enter_room_time", j5 - j4);
                        }
                    }
                    C05630Jz.LJFF(jSONObject2, "time", System.currentTimeMillis() - this.LJIIZILJ);
                    if (enumC75524TkW == EnumC75524TkW.SUCCESS) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    C0K2.LJIIIIZZ("ttlive_client_co_host_identify", i, jSONObject2);
                }
            }
            this.LJIILLIIL.remove(Long.valueOf(this.LJFF));
        }
        this.LJIILLIIL.clear();
        this.LJIIZILJ = 0L;
        this.LJIJ = 0L;
        this.LJIJI = 0L;
        long j6 = this.LJJIIZI;
        if (j6 > 0) {
            this.LJJIJ = j6;
        }
        this.LJJIIZI = 0L;
        this.LJFF = 0L;
        this.LJI = 0L;
        this.LJII = 0L;
        this.LJIIIIZZ = 0L;
        this.LJIIL = false;
        LJIIIIZZ(false);
        this.LIZLLL = false;
        this.LJIILIIL = "";
        this.LJJIJIIJI = null;
        this.LJJIJIIJIL = null;
        LJIIJ("");
        this.LJIILJJIL = 0;
        this.LJJJJJL = 0L;
        this.LJJJJL = null;
        this.LJJIFFI = null;
        this.LJ = false;
        this.LJJJJ = 1;
        this.LJJIJLIJ = false;
        this.LJJIJL = false;
        this.LJJIL = null;
        LJIIIZ(EnumC75614Tly.NONE);
        EnumC75617Tm1 value9 = EnumC75617Tm1.NONE;
        o.LJIIIZ(value9, "value");
        this.LJIIJJI = value9;
        ((HashMap) this.LJJJJIZL).clear();
        if (!TextUtils.isEmpty(null)) {
            this.LJJJJI = null;
        }
        this.LJIIIZ = false;
        this.LJJJJJ = false;
        this.LJJII = null;
        this.LJJIII = null;
        this.LJJIIJ = null;
        this.LJJIIJZLJL = null;
        RivalsListsData.TopHostInfo EMPTY = RivalsListsData.TopHostInfo.LIZ;
        o.LJIIIIZZ(EMPTY, "EMPTY");
        this.LJJIIZ = EMPTY;
        this.LJIILL = null;
        this.LJJJJZI = null;
        this.LJJL = "";
        LIZJ();
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.rv0(LinkerStateChannel.class, EnumC75636TmK.DISABLED);
        }
        this.LJJJJLI = false;
        EnumC75672Tmu enumC75672Tmu = this.LJJJLIIL;
        EnumC75672Tmu enumC75672Tmu2 = EnumC75672Tmu.IDLE;
        if (enumC75672Tmu != enumC75672Tmu2) {
            this.LJJJLZIJ = enumC75672Tmu.getLabel();
        }
        String anchorType = enumC75672Tmu2.getLabel();
        o.LJIIIZ(anchorType, "anchorType");
        BM1.LJIILJJIL = anchorType;
        this.LJJJLIIL = enumC75672Tmu2;
        this.LJJJLL = enumC75672Tmu2;
        this.LJJLIIIJJIZ = "";
        this.LJJLIIIJJI = 0;
        this.LJJLIIIJLLLLLLLZ = 0L;
        this.LJJLIIJ = 0L;
        this.LJJLIL = 0L;
        this.LJJLJ = "";
        this.LJJLJLI = false;
        this.LJJLL = false;
        this.LJJZ = false;
        this.LJJZZI = 0;
        this.LJLIL = "";
    }

    public final void LJIIIIZZ(boolean z) {
        DataChannel dataChannel;
        this.LIZJ = z;
        if (C29306Beo.LJIIL(this.LIZIZ) && (dataChannel = this.LIZIZ) != null) {
            dataChannel.pv0(LinkConnectionTypeChangedEvent.class);
        }
        C38.LIZ(z, C37.CO_HOST);
    }

    public final void LJIIIZ(EnumC75614Tly value) {
        o.LJIIIZ(value, "value");
        this.LJIIJ = value;
    }

    public final void LJIIJ(String str) {
        this.LJJI = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("live_rtc_engine_config")) {
                try {
                    JSONObject optJSONObject = jSONObject.optJSONObject("live_rtc_engine_config");
                    if (optJSONObject.has("rtc_vendor")) {
                        int optInt = optJSONObject.optInt("rtc_vendor");
                        if (optInt > 0) {
                            this.LJIILJJIL = optInt;
                        }
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public final void LJIIJJI(EnumC75672Tmu newAnchorType) {
        o.LJIIIZ(newAnchorType, "newAnchorType");
        EnumC75672Tmu enumC75672Tmu = EnumC75672Tmu.IDLE;
        this.LJJJLZIJ = enumC75672Tmu.getLabel();
        this.LJJJLL = newAnchorType;
        if (this.LJJJLIIL != enumC75672Tmu) {
            return;
        }
        String anchorType = newAnchorType.getLabel();
        o.LJIIIZ(anchorType, "anchorType");
        BM1.LJIILJJIL = anchorType;
        this.LJJJLIIL = newAnchorType;
    }

    public final void LJIILIIL(EnumC75636TmK targetState) {
        DataChannel dataChannel;
        DataChannel dataChannel2;
        o.LJIIIZ(targetState, "targetState");
        EnumC75636TmK LIZJ = LIZJ();
        if (LIZJ == null) {
            LIZJ = EnumC75636TmK.DISABLED;
        }
        if (targetState.ordinal() - LIZJ.ordinal() > 1) {
            EnumC75636TmK enumC75636TmK = EnumC75636TmK.CONNECTION_START;
            if (LIZJ.compareTo(enumC75636TmK) < 0 && targetState == EnumC75636TmK.CONNECTION_SUCCEED) {
                DataChannel dataChannel3 = this.LIZIZ;
                if (dataChannel3 != null) {
                    dataChannel3.rv0(LinkerStateChannel.class, enumC75636TmK);
                }
            } else {
                EnumC75636TmK enumC75636TmK2 = EnumC75636TmK.CONNECTION_FINISH;
                if (LIZJ.compareTo(enumC75636TmK2) < 0 && targetState.equals(EnumC75636TmK.CONNECTION_FINISH_SUCCEED) && (dataChannel2 = this.LIZIZ) != null) {
                    dataChannel2.rv0(LinkerStateChannel.class, enumC75636TmK2);
                }
            }
        }
        if (targetState.compareTo(LIZJ) > 0 && (dataChannel = this.LIZIZ) != null) {
            dataChannel.rv0(LinkerStateChannel.class, targetState);
        }
    }

    public final void LJIILJJIL(int i) {
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.rv0(InteractModeChannel.class, Integer.valueOf(i));
        }
    }

    public LinkCrossRoomDataHolder(long j, DataChannel dataChannel) {
        this.LIZ = j;
        this.LIZIZ = dataChannel;
        RivalsListsData.TopHostInfo EMPTY = RivalsListsData.TopHostInfo.LIZ;
        o.LJIIIIZZ(EMPTY, "EMPTY");
        this.LJJIIZ = EMPTY;
        this.LJJIJIL = -1;
        this.LJJJIL = "";
        this.LJJJJ = 1;
        this.LJJJJIZL = new HashMap();
        EnumC75672Tmu enumC75672Tmu = EnumC75672Tmu.IDLE;
        this.LJJJLIIL = enumC75672Tmu;
        this.LJJJLL = enumC75672Tmu;
        this.LJJJLZIJ = enumC75672Tmu.getLabel();
        this.LJJJZ = new ArrayList();
        this.LJJL = "";
        this.LJJLIIIJ = "";
        this.LJJLIIIJJI = 0;
        this.LJJLJ = "";
        this.LJJZZIII = new HashMap();
        this.LJL = C61878OQg.INSTANCE;
        this.LJLIL = "";
    }

    public final void LJIIL(long j, EnumC75524TkW newStatus) {
        long j2;
        String str;
        String str2;
        LiveMode streamType;
        o.LJIIIZ(newStatus, "newStatus");
        long j3 = 0;
        if (j <= 0) {
            return;
        }
        if (newStatus == EnumC75524TkW.ROOM_ENTER) {
            this.LJIJI = System.currentTimeMillis();
        }
        if (this.LJIILLIIL.get(Long.valueOf(j)) == null) {
            this.LJIILLIIL.put(Long.valueOf(j), newStatus);
        } else {
            this.LJIILLIIL.put(Long.valueOf(j), EnumC75524TkW.SUCCESS);
        }
        this.LJIIZILJ = System.currentTimeMillis();
        Room room = (Room) DataChannelGlobal.LJLJJI.mv0(C29044Baa.class);
        if (room != null) {
            j2 = room.getOwnerUserId();
        } else {
            j2 = 0;
        }
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            j3 = LIZIZ.getCurrentUserId();
        }
        if (j2 == j3) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C05630Jz.LJFF(jSONObject, "channel_id", this.LJFF);
        if (Room.isValid(room)) {
            o.LJI(room);
            str = room.getIdStr();
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C05630Jz.LJI(jSONObject, "room_id", str);
        C05630Jz.LJFF(jSONObject, "anchor_id", j2);
        C05630Jz.LJFF(jSONObject, "current_user_id", j3);
        C05630Jz.LJI(jSONObject, "event_id", newStatus.getValue());
        if (room != null && (streamType = room.getStreamType()) != null) {
            str2 = C28509BGv.LIZ(streamType);
        } else {
            str2 = null;
        }
        C05630Jz.LJI(jSONObject, "live_type", str2);
        C0K2.LJIIIIZZ("ttlive_client_co_host_identify_event", 0, jSONObject);
    }
}
