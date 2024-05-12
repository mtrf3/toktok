package com.ss.android.ugc.aweme.profile;

import X.OS8;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MiniUser implements Parcelable {
    public static final Parcelable.Creator<MiniUser> CREATOR = new OS8();
    public final String bioSecureUrl;
    public final String bioUrl;
    public final int followStatus;
    public final String id;
    public final boolean isLive;
    public final String nickname;
    public final String secId;
    public final String shopRouter;
    public final int tabType;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.id);
        out.writeString(this.secId);
        out.writeString(this.nickname);
        out.writeInt(this.followStatus);
        out.writeInt(this.tabType);
        out.writeString(this.shopRouter);
        out.writeInt(this.isLive ? 1 : 0);
        out.writeString(this.bioUrl);
        out.writeString(this.bioSecureUrl);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MiniUser(com.ss.android.ugc.aweme.profile.model.User r11) {
        /*
            r10 = this;
            java.lang.String r0 = "user"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            java.lang.String r2 = r11.getUid()
            java.lang.String r9 = ""
            if (r2 != 0) goto Le
            r2 = r9
        Le:
            java.lang.String r4 = r11.getSecUid()
            if (r4 != 0) goto L15
            r4 = r9
        L15:
            java.lang.String r6 = r11.getNickname()
            if (r6 != 0) goto L1c
            r6 = r9
        L1c:
            int r3 = r11.getFollowStatus()
            int r5 = r11.getTabType()
            com.ss.android.ugc.aweme.profile.model.TabSetting r0 = r11.getTabSetting()
            if (r0 == 0) goto L32
            com.ss.android.ugc.aweme.profile.model.ShopTab r0 = r0.shopTab
            if (r0 == 0) goto L32
            java.lang.String r7 = r0.shopSchemaV2
            if (r7 != 0) goto L33
        L32:
            r7 = r9
        L33:
            boolean r1 = r11.isLive()
            java.lang.String r8 = r11.getBioUrl()
            if (r8 != 0) goto L3e
            r8 = r9
        L3e:
            java.lang.String r0 = r11.getBioSecureUrl()
            if (r0 != 0) goto L49
        L44:
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        L49:
            r9 = r0
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.MiniUser.<init>(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public MiniUser(boolean z, String id, int i, String secId, int i2, String nickname, String shopRouter, String bioUrl, String bioSecureUrl) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(secId, "secId");
        o.LJIIIZ(nickname, "nickname");
        o.LJIIIZ(shopRouter, "shopRouter");
        o.LJIIIZ(bioUrl, "bioUrl");
        o.LJIIIZ(bioSecureUrl, "bioSecureUrl");
        this.id = id;
        this.secId = secId;
        this.nickname = nickname;
        this.followStatus = i;
        this.tabType = i2;
        this.shopRouter = shopRouter;
        this.isLive = z;
        this.bioUrl = bioUrl;
        this.bioSecureUrl = bioSecureUrl;
    }
}
