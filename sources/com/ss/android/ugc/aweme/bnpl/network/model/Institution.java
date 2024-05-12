package com.ss.android.ugc.aweme.bnpl.network.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class Institution extends F9E implements Serializable {
    public static final int $stable = 0;

    @InterfaceC65349Pkn("description")
    public final String description;

    @InterfaceC65349Pkn("icon")
    public final InstitutionIcon icon;

    @InterfaceC65349Pkn("institution")
    public final String institution;

    public static /* synthetic */ Institution copy$default(Institution institution, String str, InstitutionIcon institutionIcon, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = institution.institution;
        }
        if ((i & 2) != 0) {
            institutionIcon = institution.icon;
        }
        if ((i & 4) != 0) {
            str2 = institution.description;
        }
        return institution.copy(str, institutionIcon, str2);
    }

    public final Institution copy(String institution, InstitutionIcon icon, String description) {
        o.LJIIIZ(institution, "institution");
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(description, "description");
        return new Institution(institution, icon, description);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.institution, this.icon, this.description};
    }

    public final String getDescription() {
        return this.description;
    }

    public final InstitutionIcon getIcon() {
        return this.icon;
    }

    public final String getInstitution() {
        return this.institution;
    }

    public Institution(String institution, InstitutionIcon icon, String description) {
        o.LJIIIZ(institution, "institution");
        o.LJIIIZ(icon, "icon");
        o.LJIIIZ(description, "description");
        this.institution = institution;
        this.icon = icon;
        this.description = description;
    }
}
