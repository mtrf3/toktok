package com.ss.android.ugc.aweme.creative.model.duet;

import X.C41561GSv;
import X.F9E;
import X.InterfaceC65349Pkn;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DuetUser extends F9E implements Parcelable {
    public static final Parcelable.Creator<DuetUser> CREATOR = new C41561GSv();

    @InterfaceC65349Pkn("nickname")
    public final String nickname;

    @InterfaceC65349Pkn("duet_sec_uid")
    public final String secUid;

    @InterfaceC65349Pkn("short_id")
    public final String shortId;

    @InterfaceC65349Pkn("duet_uid")
    public final String uid;

    @InterfaceC65349Pkn("unique_id")
    public final String uniqueId;

    /* JADX WARN: Multi-variable type inference failed */
    public DuetUser() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.uid, this.secUid, this.nickname, this.uniqueId, this.shortId};
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.uid);
        out.writeString(this.secUid);
        out.writeString(this.nickname);
        out.writeString(this.uniqueId);
        out.writeString(this.shortId);
    }

    public DuetUser(String uid, String secUid, String nickname, String uniqueId, String shortId) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(secUid, "secUid");
        o.LJIIIZ(nickname, "nickname");
        o.LJIIIZ(uniqueId, "uniqueId");
        o.LJIIIZ(shortId, "shortId");
        this.uid = uid;
        this.secUid = secUid;
        this.nickname = nickname;
        this.uniqueId = uniqueId;
        this.shortId = shortId;
    }

    public /* synthetic */ DuetUser(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "");
    }
}
