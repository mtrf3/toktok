package com.google.android.play.core.assetpacks;

import X.C13T;
import X.C16880lQ;
import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes7.dex */
public final class v1 {
    public static final C13T LIZJ = new C13T("PackageStateCache");
    public final Context LIZ;
    public int LIZIZ = -1;

    public v1(Context context) {
        this.LIZ = context;
    }

    public final synchronized int LIZ() {
        if (this.LIZIZ == -1) {
            try {
                this.LIZIZ = C16880lQ.LLLLLLZ(this.LIZ.getPackageManager(), this.LIZ.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                LIZJ.LIZJ("The current version of the app could not be retrieved", 6, new Object[0]);
            }
        }
        return this.LIZIZ;
    }
}
