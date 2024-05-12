package com.ss.android.ugc.aweme.ecommerce.core.strategy;

import X.HH1;
import X.WM7;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BizIdentityMatchRule {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public BizIdentityMatchRule() {
        this("*", "*", "*");
    }

    public final boolean isMatch(BizIdentity inputId) {
        o.LJIIIZ(inputId, "inputId");
        if (!o.LJ(this.LIZ, "*") && !o.LJ(this.LIZ, inputId.LIZ)) {
            return false;
        }
        if (!o.LJ(this.LIZIZ, "*") && !o.LJ(this.LIZIZ, inputId.LIZIZ)) {
            return false;
        }
        if (!o.LJ(this.LIZJ, "*") && !o.LJ(this.LIZJ, inputId.LIZJ)) {
            return false;
        }
        return true;
    }

    public BizIdentityMatchRule(String str, String str2, String str3) {
        HH1.LIZ(str, WM7.SCENE_SERVICE, str2, "bizName", str3, "market");
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
