package com.ss.android.ugc.aweme.experiment;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class AddScenesForAuthPopConfig extends F9E {

    @InterfaceC65349Pkn("add_contact_pop_fb_login")
    public final boolean addContactPopWhenFBLogin;

    @InterfaceC65349Pkn("add_ffp_to_necessary_scene")
    public final boolean addFFPToNecessaryScene;

    @InterfaceC65349Pkn("add_ffp_to_social_event")
    public final boolean addFFPToSocialEvent;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AddScenesForAuthPopConfig() {
        /*
            r6 = this;
            r1 = 0
            r4 = 7
            r5 = 0
            r0 = r6
            r2 = r1
            r3 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiment.AddScenesForAuthPopConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.addContactPopWhenFBLogin), Boolean.valueOf(this.addFFPToSocialEvent), Boolean.valueOf(this.addFFPToNecessaryScene)};
    }

    public AddScenesForAuthPopConfig(boolean z, boolean z2, boolean z3) {
        this.addContactPopWhenFBLogin = z;
        this.addFFPToSocialEvent = z2;
        this.addFFPToNecessaryScene = z3;
    }

    public /* synthetic */ AddScenesForAuthPopConfig(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }
}
