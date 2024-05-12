package com.ss.android.ugc.aweme.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class Js2XssConfig extends F9E {

    @InterfaceC65349Pkn("xss_callback_id_switch")
    public final boolean xssCallBackEnable;

    @InterfaceC65349Pkn("xss_url_change_switch")
    public final boolean xssUrlChangedEnable;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Js2XssConfig() {
        /*
            r3 = this;
            r2 = 3
            r1 = 0
            r0 = 0
            r3.<init>(r0, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.settings.Js2XssConfig.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.xssCallBackEnable), Boolean.valueOf(this.xssUrlChangedEnable)};
    }

    public Js2XssConfig(boolean z, boolean z2) {
        this.xssCallBackEnable = z;
        this.xssUrlChangedEnable = z2;
    }

    public /* synthetic */ Js2XssConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
