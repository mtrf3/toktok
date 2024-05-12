package com.ss.android.ugc.aweme.friendstab.model;

import X.C53996LHc;
import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class SocialFeedRedDotResponse {
    public static final C53996LHc Companion = new C53996LHc();

    @InterfaceC65349Pkn("new_content_map")
    public final ArrayList<UserNewContent> avatarList;

    @InterfaceC65349Pkn("new_content_count")
    public int redDotCount;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMessage = "";

    @InterfaceC65349Pkn("new_content_gids")
    public ArrayList<String> redDotList = new ArrayList<>();

    public final boolean checkResponseValid() {
        if (this.statusCode == 0) {
            return true;
        }
        return false;
    }

    public final ArrayList<UserNewContent> getAvatarList() {
        return this.avatarList;
    }

    public final int getRedDotCount() {
        return this.redDotCount;
    }

    public final ArrayList<String> getRedDotList() {
        return this.redDotList;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getStatusMessage() {
        return this.statusMessage;
    }

    public final void setRedDotCount(int i) {
        this.redDotCount = i;
    }

    public final void setRedDotList(ArrayList<String> arrayList) {
        o.LJIIIZ(arrayList, "<set-?>");
        this.redDotList = arrayList;
    }
}
