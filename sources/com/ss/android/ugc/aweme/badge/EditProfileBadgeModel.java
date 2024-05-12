package com.ss.android.ugc.aweme.badge;

import X.AbstractC72737Sgf;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class EditProfileBadgeModel extends AbstractC72737Sgf implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("id")
    public final Long id;

    @InterfaceC65349Pkn("name")
    public final String name;

    @InterfaceC65349Pkn("should_show")
    public final Boolean shouldShow;

    @InterfaceC65349Pkn("url")
    public final String url;

    public static /* synthetic */ EditProfileBadgeModel copy$default(EditProfileBadgeModel editProfileBadgeModel, Long l, String str, String str2, String str3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            l = editProfileBadgeModel.getId();
        }
        if ((i & 2) != 0) {
            str = editProfileBadgeModel.getName();
        }
        if ((i & 4) != 0) {
            str2 = editProfileBadgeModel.getDescription();
        }
        if ((i & 8) != 0) {
            str3 = editProfileBadgeModel.getUrl();
        }
        if ((i & 16) != 0) {
            bool = editProfileBadgeModel.getShouldShow();
        }
        return editProfileBadgeModel.copy(l, str, str2, str3, bool);
    }

    public final Long component1() {
        return getId();
    }

    public final String component2() {
        return getName();
    }

    public final String component3() {
        return getDescription();
    }

    public final String component4() {
        return getUrl();
    }

    public final Boolean component5() {
        return getShouldShow();
    }

    public final EditProfileBadgeModel copy(Long l, String str, String str2, String str3, Boolean bool) {
        return new EditProfileBadgeModel(l, str, str2, str3, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditProfileBadgeModel)) {
            return false;
        }
        AbstractC72737Sgf abstractC72737Sgf = (AbstractC72737Sgf) obj;
        return o.LJ(getId(), abstractC72737Sgf.getId()) && o.LJ(getName(), abstractC72737Sgf.getName()) && o.LJ(getDescription(), abstractC72737Sgf.getDescription()) && o.LJ(getUrl(), abstractC72737Sgf.getUrl()) && o.LJ(getShouldShow(), abstractC72737Sgf.getShouldShow());
    }

    public int hashCode() {
        return ((((((((getId() == null ? 0 : getId().hashCode()) * 31) + (getName() == null ? 0 : getName().hashCode())) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31) + (getUrl() == null ? 0 : getUrl().hashCode())) * 31) + (getShouldShow() != null ? getShouldShow().hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditProfileBadgeModel(id=");
        LIZ.append(getId());
        LIZ.append(", name=");
        LIZ.append(getName());
        LIZ.append(", description=");
        LIZ.append(getDescription());
        LIZ.append(", url=");
        LIZ.append(getUrl());
        LIZ.append(", shouldShow=");
        LIZ.append(getShouldShow());
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC72737Sgf
    public String getDescription() {
        return this.description;
    }

    @Override // X.AbstractC72737Sgf
    public Long getId() {
        return this.id;
    }

    @Override // X.AbstractC72737Sgf
    public String getName() {
        return this.name;
    }

    @Override // X.AbstractC72737Sgf
    public Boolean getShouldShow() {
        return this.shouldShow;
    }

    @Override // X.AbstractC72737Sgf
    public String getUrl() {
        return this.url;
    }

    public EditProfileBadgeModel(Long l, String str, String str2, String str3, Boolean bool) {
        this.id = l;
        this.name = str;
        this.description = str2;
        this.url = str3;
        this.shouldShow = bool;
    }
}
