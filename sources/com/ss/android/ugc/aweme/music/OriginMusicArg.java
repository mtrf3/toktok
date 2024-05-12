package com.ss.android.ugc.aweme.music;

import X.A6V;
import X.InterfaceC87283bg;
import X.X1D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class OriginMusicArg implements IRouteArg, InterfaceC87283bg {
    public static final Parcelable.Creator<OriginMusicArg> CREATOR = new A6V();
    public final int bottomBarHeight;
    public final boolean isMe;
    public final String previousPage;
    public final String secUserID;
    public final User user;
    public final String userId;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OriginMusicArg() {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            r7 = 63
            r0 = r9
            r3 = r1
            r4 = r1
            r5 = r2
            r6 = r1
            r8 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.OriginMusicArg.<init>():void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public OriginMusicArg(com.ss.android.ugc.aweme.profile.model.User r10) {
        /*
            r9 = this;
            r2 = 0
            r3 = 0
            r7 = 62
            r0 = r9
            r1 = r10
            r4 = r3
            r5 = r2
            r6 = r3
            r8 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.OriginMusicArg.<init>(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OriginMusicArg(User user, boolean z) {
        this(user, z, null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 60, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OriginMusicArg(User user, boolean z, String str) {
        this(user, z, str, null, 0, 0 == true ? 1 : 0, 56, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OriginMusicArg(User user, boolean z, String str, String str2) {
        this(user, z, str, str2, 0, null, 48, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OriginMusicArg(User user, boolean z, String str, String str2, int i) {
        this(user, z, str, str2, i, null, 32, 0 == true ? 1 : 0);
    }

    public static OriginMusicArg __fromBundle(Bundle bundle) {
        int i;
        User user;
        Boolean bool;
        String str;
        String str2;
        Integer num;
        String str3 = null;
        if (bundle == null) {
            return null;
        }
        if (bundle.containsKey("user")) {
            user = (User) RouteParser.INSTANCE.parse(bundle.get("user"), User.class);
            i = 0;
        } else {
            i = 1;
            user = null;
        }
        if (bundle.containsKey("is_me")) {
            bool = (Boolean) RouteParser.INSTANCE.parse(bundle.get("is_me"), Boolean.class);
            if (bool == null) {
                i += 2;
            }
        } else {
            i += 2;
            bool = null;
        }
        if (bundle.containsKey("user_id")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("user_id"), String.class);
        } else {
            i += 4;
            str = null;
        }
        if (bundle.containsKey("sec_user_id")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("sec_user_id"), String.class);
        } else {
            i += 8;
            str2 = null;
        }
        if (bundle.containsKey("bottom_bar_height")) {
            num = (Integer) RouteParser.INSTANCE.parse(bundle.get("bottom_bar_height"), Integer.class);
            if (num == null) {
                i += 16;
            }
        } else {
            i += 16;
            num = null;
        }
        if (bundle.containsKey("previous_page")) {
            str3 = (String) RouteParser.INSTANCE.parse(bundle.get("previous_page"), String.class);
        } else {
            i += 32;
        }
        return new OriginMusicArg(user, bool != null ? bool.booleanValue() : false, str, str2, num != null ? num.intValue() : 0, str3, i, null);
    }

    public static /* synthetic */ OriginMusicArg copy$default(OriginMusicArg originMusicArg, User user, boolean z, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            user = originMusicArg.user;
        }
        if ((i2 & 2) != 0) {
            z = originMusicArg.isMe;
        }
        if ((i2 & 4) != 0) {
            str = originMusicArg.userId;
        }
        if ((i2 & 8) != 0) {
            str2 = originMusicArg.secUserID;
        }
        if ((i2 & 16) != 0) {
            i = originMusicArg.bottomBarHeight;
        }
        if ((i2 & 32) != 0) {
            str3 = originMusicArg.previousPage;
        }
        return originMusicArg.copy(user, z, str, str2, i, str3);
    }

    public final OriginMusicArg copy(User user, boolean z, String str, String str2, int i, String str3) {
        return new OriginMusicArg(user, z, str, str2, i, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriginMusicArg)) {
            return false;
        }
        OriginMusicArg originMusicArg = (OriginMusicArg) obj;
        return o.LJ(this.user, originMusicArg.user) && this.isMe == originMusicArg.isMe && o.LJ(this.userId, originMusicArg.userId) && o.LJ(this.secUserID, originMusicArg.secUserID) && this.bottomBarHeight == originMusicArg.bottomBarHeight && o.LJ(this.previousPage, originMusicArg.previousPage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        User user = this.user;
        int hashCode = (user == null ? 0 : user.hashCode()) * 31;
        boolean z = this.isMe;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.userId;
        int hashCode2 = (i2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.secUserID;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.bottomBarHeight) * 31;
        String str3 = this.previousPage;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeSerializable(this.user);
        out.writeInt(this.isMe ? 1 : 0);
        out.writeString(this.userId);
        out.writeString(this.secUserID);
        out.writeInt(this.bottomBarHeight);
        out.writeString(this.previousPage);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OriginMusicArg(user=");
        LIZ.append(this.user);
        LIZ.append(", isMe=");
        LIZ.append(this.isMe);
        LIZ.append(", userId=");
        LIZ.append(this.userId);
        LIZ.append(", secUserID=");
        LIZ.append(this.secUserID);
        LIZ.append(", bottomBarHeight=");
        LIZ.append(this.bottomBarHeight);
        LIZ.append(", previousPage=");
        return q.LIZIZ(LIZ, this.previousPage, ')', LIZ);
    }

    public final int getBottomBarHeight() {
        return this.bottomBarHeight;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getSecUserID() {
        return this.secUserID;
    }

    public final User getUser() {
        return this.user;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final boolean isMe() {
        return this.isMe;
    }

    public OriginMusicArg(User user, boolean z, String str, String str2, int i, String str3) {
        this.user = user;
        this.isMe = z;
        this.userId = str;
        this.secUserID = str2;
        this.bottomBarHeight = i;
        this.previousPage = str3;
    }

    public /* synthetic */ OriginMusicArg(User user, boolean z, String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : user, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? null : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? -1 : i, (i2 & 32) == 0 ? str3 : null);
    }
}
