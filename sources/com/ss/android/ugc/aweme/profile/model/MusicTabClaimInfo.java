package com.ss.android.ugc.aweme.profile.model;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class MusicTabClaimInfo extends F9E implements Serializable {

    @InterfaceC65349Pkn("desc")
    public String desc;

    @InterfaceC65349Pkn("desc_key")
    public String descKey;

    @InterfaceC65349Pkn("status")
    public int status;

    @InterfaceC65349Pkn("title")
    public String title;

    @InterfaceC65349Pkn("title_key")
    public String titleKey;

    /* JADX WARN: Multi-variable type inference failed */
    public MusicTabClaimInfo() {
        this(0, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ MusicTabClaimInfo copy$default(MusicTabClaimInfo musicTabClaimInfo, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = musicTabClaimInfo.status;
        }
        if ((i2 & 2) != 0) {
            str = musicTabClaimInfo.titleKey;
        }
        if ((i2 & 4) != 0) {
            str2 = musicTabClaimInfo.title;
        }
        if ((i2 & 8) != 0) {
            str3 = musicTabClaimInfo.descKey;
        }
        if ((i2 & 16) != 0) {
            str4 = musicTabClaimInfo.desc;
        }
        return musicTabClaimInfo.copy(i, str, str2, str3, str4);
    }

    public final MusicTabClaimInfo copy(int i, String titleKey, String title, String descKey, String desc) {
        o.LJIIIZ(titleKey, "titleKey");
        o.LJIIIZ(title, "title");
        o.LJIIIZ(descKey, "descKey");
        o.LJIIIZ(desc, "desc");
        return new MusicTabClaimInfo(i, titleKey, title, descKey, desc);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.status), this.titleKey, this.title, this.descKey, this.desc};
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getDescKey() {
        return this.descKey;
    }

    public final int getStatus() {
        return this.status;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleKey() {
        return this.titleKey;
    }

    public final void setDesc(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.desc = str;
    }

    public final void setDescKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.descKey = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setTitle(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.title = str;
    }

    public final void setTitleKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.titleKey = str;
    }

    public MusicTabClaimInfo(int i, String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "titleKey", str2, "title", str3, "descKey", str4, "desc");
        this.status = i;
        this.titleKey = str;
        this.title = str2;
        this.descKey = str3;
        this.desc = str4;
    }

    public /* synthetic */ MusicTabClaimInfo(int i, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) == 0 ? str4 : "");
    }
}
