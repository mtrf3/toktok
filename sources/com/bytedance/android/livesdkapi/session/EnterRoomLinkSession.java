package com.bytedance.android.livesdkapi.session;

import X.B57;
import X.B73;
import X.C0H1;
import X.C0K2;
import X.C0NB;
import X.C10640bM;
import X.C32777Cth;
import X.CN1;
import X.X1D;
import Y.ARunnableS3S0202000_9;
import Y.IDCreatorS49S0000000_5;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveMonitorSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.DisableEnterRoomLinkOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class EnterRoomLinkSession implements ILinkSession {
    public List<Event> mBuilders;
    public JSONObject mCommonExtraParams;
    public EnterRoomConfig mEnterRoomConfig;
    public final String mSessionId;
    public List<String> mUniqueKeys;
    public static List<Integer> mExcludeEnterRoomCodes = new ArrayList();
    public static final boolean disableEnterRoomLink = DisableEnterRoomLinkOptSetting.INSTANCE.getDisable();
    public static final Parcelable.Creator<EnterRoomLinkSession> CREATOR = new IDCreatorS49S0000000_5(4);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final JSONObject LIZLLL() {
        LJII("event_session_id", this.mSessionId, this.mCommonExtraParams);
        EnterRoomConfig enterRoomConfig = this.mEnterRoomConfig;
        if (enterRoomConfig != null) {
            LJII("enter_from", enterRoomConfig.mRoomsData.enterFromMerge, this.mCommonExtraParams);
            JSONObject jSONObject = this.mCommonExtraParams;
            StringBuilder LIZ = X1D.LIZ();
            LJII("room_id", C0H1.LIZJ(LIZ, this.mEnterRoomConfig.mRoomsData.roomId, "", LIZ), jSONObject);
            JSONObject jSONObject2 = this.mCommonExtraParams;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(this.mEnterRoomConfig.mRoomsData.userId);
            LIZ2.append("");
            LJII("user_id", X1D.LIZIZ(LIZ2), jSONObject2);
            JSONObject jSONObject3 = this.mCommonExtraParams;
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(this.mEnterRoomConfig.mLogData.anchorId);
            LIZ3.append("");
            LJII("anchor_id", X1D.LIZIZ(LIZ3), jSONObject3);
            LJII("enter_method", this.mEnterRoomConfig.mRoomsData.enterMethod, this.mCommonExtraParams);
            LJII("action_type", this.mEnterRoomConfig.mRoomsData.enterType, this.mCommonExtraParams);
            LJII("live_window_mode", this.mEnterRoomConfig.mRoomsData.windowMode, this.mCommonExtraParams);
            LJII("from_auto_jump", String.valueOf(this.mEnterRoomConfig.mRoomsData.fromAutoJump ? 1 : 0), this.mCommonExtraParams);
        }
        for (Event event : this.mBuilders) {
            Iterator<String> keys = event.params.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!this.mCommonExtraParams.has(next) && (!this.mUniqueKeys.contains(next))) {
                    LJII(next, event.params.optString(next), this.mCommonExtraParams);
                }
            }
        }
        if (this.mBuilders.size() > 0) {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < this.mBuilders.size(); i++) {
                LJII("event_session_id", this.mSessionId, ((Event) ListProtector.get(this.mBuilders, i)).params);
                try {
                    jSONArray.put(i, ((Event) ListProtector.get(this.mBuilders, i)).params);
                } catch (JSONException e) {
                    C0NB.LJ("EnterRoomLinkSession", e.getMessage());
                }
            }
            try {
                this.mCommonExtraParams.put("event_list", jSONArray);
            } catch (JSONException e2) {
                C0NB.LJ("EnterRoomLinkSession", e2.getMessage());
            }
        }
        return this.mCommonExtraParams;
    }

    public final String LJ() {
        return this.mSessionId;
    }

    public EnterRoomLinkSession(Parcel parcel) {
        this.mBuilders = new CopyOnWriteArrayList();
        this.mCommonExtraParams = new JSONObject();
        this.mUniqueKeys = Arrays.asList("service", "timestamp", "event_module", "event_type", "status_code", "status_msg", "extra", "parent_id");
        this.mSessionId = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.mBuilders = arrayList;
        parcel.readList(arrayList, Event.class.getClassLoader());
        this.mEnterRoomConfig = (EnterRoomConfig) parcel.readParcelable(EnterRoomConfig.class.getClassLoader());
        try {
            this.mCommonExtraParams = new JSONObject(parcel.readString());
        } catch (Throwable unused) {
            this.mCommonExtraParams = new JSONObject();
        }
        this.mUniqueKeys = parcel.createStringArrayList();
    }

    public static EnterRoomLinkSession LJI(EnterRoomConfig enterRoomConfig) {
        EnterRoomLinkSession enterRoomLinkSession = new EnterRoomLinkSession(enterRoomConfig);
        B57.LIZ.LIZJ(enterRoomLinkSession);
        return enterRoomLinkSession;
    }

    public static void LJIIIIZZ(List<Integer> list) {
        if (list != null && list.size() > 0) {
            mExcludeEnterRoomCodes = list;
        }
    }

    public final void LIZIZ(Event event) {
        if (disableEnterRoomLink) {
            return;
        }
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline()) {
            this.mBuilders.add(event);
            C0NB.LIZIZ("ttlive_room_enter_link_monitor", event.params.toString());
        }
        int intValue = CastIntegerProtector.valueOf(event.params.optString("status_code")).intValue();
        if (intValue <= 32768 || !C32777Cth.LIZ(0.1f, "ttlive_room_enter_link_monitor") || !LiveMonitorSampleSetting.INSTANCE.isReportDolphin("ttlive_room_enter_link_monitor", 0.01d)) {
            return;
        }
        this.mBuilders.add(event);
        EnterRoomLinkSession LIZ = B57.LIZ.LIZ();
        if (LIZ != null) {
            C10640bM.LIZIZ(B73.LIZ(), new ARunnableS3S0202000_9(intValue, 0, this, LIZ, 1), null, 0L);
        }
    }

    public EnterRoomLinkSession(EnterRoomConfig enterRoomConfig) {
        this.mBuilders = new CopyOnWriteArrayList();
        this.mCommonExtraParams = new JSONObject();
        this.mUniqueKeys = Arrays.asList("service", "timestamp", "event_module", "event_type", "status_code", "status_msg", "extra", "parent_id");
        String str = enterRoomConfig.mLogData.livePlaySessionId;
        if (TextUtils.isEmpty(str)) {
            this.mSessionId = UUID.randomUUID().toString();
        } else {
            this.mSessionId = str;
            enterRoomConfig.mLogData.livePlaySessionId = "";
        }
        this.mEnterRoomConfig = enterRoomConfig;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mSessionId);
        parcel.writeList(this.mBuilders);
        parcel.writeParcelable(this.mEnterRoomConfig, i);
        try {
            parcel.writeString(this.mCommonExtraParams.toString());
        } catch (Exception e) {
            C0NB.LJI("EnterRoomLinkSession", e);
        }
        parcel.writeStringList(this.mUniqueKeys);
    }

    public static void LIZ(EnterRoomLinkSession enterRoomLinkSession, EnterRoomLinkSession enterRoomLinkSession2, int i) {
        boolean z;
        String str;
        enterRoomLinkSession.getClass();
        JSONObject LIZLLL = enterRoomLinkSession2.LIZLLL();
        if (LIZLLL == null) {
            LIZLLL = new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        LJII("status", String.valueOf(i), jSONObject);
        List<Integer> list = mExcludeEnterRoomCodes;
        if (list != null) {
            z = list.contains(Integer.valueOf(i));
        } else {
            z = false;
        }
        if (!z) {
            str = "ttlive_room_enter_link_monitor";
        } else {
            str = "ttlive_room_enter_link_monitor_error";
        }
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline()) {
            C0NB.LIZIZ("ttlive_room_enter_link_monitor", LIZLLL.toString());
        }
        C0K2.LIZLLL(str, jSONObject, null, LIZLLL);
    }

    public static void LJII(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            C0NB.LJ("EnterRoomLinkSession", e.getMessage());
        }
    }
}
