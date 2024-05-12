package com.bytedance.android.livesdkapi.session;

import X.C0NB;
import X.EnumC28203B5b;
import Y.IDCreatorS49S0000000_5;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import defpackage.i0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class Event implements Parcelable {
    public static final Parcelable.Creator<Event> CREATOR = new IDCreatorS49S0000000_5(5);
    public JSONObject params;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Event(Parcel parcel) {
        this.params = new JSONObject();
        try {
            this.params = new JSONObject(parcel.readString());
        } catch (JSONException unused) {
            this.params = new JSONObject();
        }
    }

    public final void LIZIZ(String str) {
        LIZ("status_msg", str, this.params);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.params.toString());
    }

    public Event(String str, int i, EnumC28203B5b enumC28203B5b) {
        this.params = new JSONObject();
        LIZ("service", str.startsWith("ttlive_") ? str : i0.LJFF("ttlive_", str), this.params);
        LIZ("timestamp", String.valueOf(SystemClock.elapsedRealtime()), this.params);
        LIZ("event_module", "enter_room", this.params);
        LIZ("status_code", String.valueOf(i), this.params);
        LIZ("event_type", enumC28203B5b.getType(), this.params);
    }

    public static void LIZ(String str, String str2, JSONObject jSONObject) {
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            C0NB.LJ("Event", e.getMessage());
        }
    }
}
