package com.ss.android.ugc.aweme.badge;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EditProfileBadgeCampaignModel implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("name")
    public final String name;

    public static /* synthetic */ EditProfileBadgeCampaignModel copy$default(EditProfileBadgeCampaignModel editProfileBadgeCampaignModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = editProfileBadgeCampaignModel.name;
        }
        if ((i & 2) != 0) {
            str2 = editProfileBadgeCampaignModel.description;
        }
        return editProfileBadgeCampaignModel.copy(str, str2);
    }

    public final EditProfileBadgeCampaignModel copy(String str, String str2) {
        return new EditProfileBadgeCampaignModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditProfileBadgeCampaignModel)) {
            return false;
        }
        EditProfileBadgeCampaignModel editProfileBadgeCampaignModel = (EditProfileBadgeCampaignModel) obj;
        return o.LJ(this.name, editProfileBadgeCampaignModel.name) && o.LJ(this.description, editProfileBadgeCampaignModel.description);
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditProfileBadgeCampaignModel(name=");
        LIZ.append(this.name);
        LIZ.append(", description=");
        return q.LIZIZ(LIZ, this.description, ')', LIZ);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getName() {
        return this.name;
    }

    public EditProfileBadgeCampaignModel(String str, String str2) {
        this.name = str;
        this.description = str2;
    }
}
