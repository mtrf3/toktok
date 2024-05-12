package com.ss.android.ugc.aweme.homepage.ui.experiment;

import X.C43588H8u;
import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SpecialTopicEntry extends F9E {

    @InterfaceC65349Pkn("child_viewable")
    public final boolean childViewable;

    @InterfaceC65349Pkn("enable")
    public final boolean enable;

    @InterfaceC65349Pkn("event_name")
    public final String eventName;

    @InterfaceC65349Pkn("icon_url")
    public final String iconUrl;

    @InterfaceC65349Pkn("landing_route")
    public final String landingRoute;

    @InterfaceC65349Pkn("landing_type")
    public final String landingType;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SpecialTopicEntry() {
        /*
            r9 = this;
            r1 = 0
            r3 = 0
            r7 = 63
            r0 = r9
            r2 = r1
            r4 = r3
            r5 = r3
            r6 = r3
            r8 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.homepage.ui.experiment.SpecialTopicEntry.<init>():void");
    }

    public static /* synthetic */ SpecialTopicEntry copy$default(SpecialTopicEntry specialTopicEntry, boolean z, boolean z2, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = specialTopicEntry.enable;
        }
        if ((i & 2) != 0) {
            z2 = specialTopicEntry.childViewable;
        }
        if ((i & 4) != 0) {
            str = specialTopicEntry.eventName;
        }
        if ((i & 8) != 0) {
            str2 = specialTopicEntry.iconUrl;
        }
        if ((i & 16) != 0) {
            str3 = specialTopicEntry.landingType;
        }
        if ((i & 32) != 0) {
            str4 = specialTopicEntry.landingRoute;
        }
        return specialTopicEntry.copy(z, z2, str, str2, str3, str4);
    }

    public final SpecialTopicEntry copy(boolean z, boolean z2, String eventName, String iconUrl, String landingType, String landingRoute) {
        o.LJIIIZ(eventName, "eventName");
        o.LJIIIZ(iconUrl, "iconUrl");
        o.LJIIIZ(landingType, "landingType");
        o.LJIIIZ(landingRoute, "landingRoute");
        return new SpecialTopicEntry(z, z2, eventName, iconUrl, landingType, landingRoute);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enable), Boolean.valueOf(this.childViewable), this.eventName, this.iconUrl, this.landingType, this.landingRoute};
    }

    public final boolean getChildViewable() {
        return this.childViewable;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final String getLandingRoute() {
        return this.landingRoute;
    }

    public final String getLandingType() {
        return this.landingType;
    }

    public SpecialTopicEntry(boolean z, boolean z2, String str, String str2, String str3, String str4) {
        C43588H8u.LIZLLL(str, "eventName", str2, "iconUrl", str3, "landingType", str4, "landingRoute");
        this.enable = z;
        this.childViewable = z2;
        this.eventName = str;
        this.iconUrl = str2;
        this.landingType = str3;
        this.landingRoute = str4;
    }

    public /* synthetic */ SpecialTopicEntry(boolean z, boolean z2, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) == 0 ? z2 : false, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) == 0 ? str4 : "");
    }
}
