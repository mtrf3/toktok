package com.google.android.gms.flags.impl;

import X.AbstractBinderC90819Zkd;
import X.BinderC68153Qov;
import X.C90491ZfL;
import X.C90543ZgB;
import X.CallableC90486ZfG;
import X.CallableC90487ZfH;
import X.CallableC90488ZfI;
import X.CallableC90489ZfJ;
import X.InterfaceC68163Qp5;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;

/* loaded from: classes29.dex */
public class FlagProviderImpl extends AbstractBinderC90819Zkd {
    public boolean LJLIL;
    public SharedPreferences LJLILLLLZI;

    @Override // X.InterfaceC90465Zev
    public void init(InterfaceC68163Qp5 interfaceC68163Qp5) {
        Context context = (Context) BinderC68153Qov.LLJJIII(interfaceC68163Qp5);
        if (this.LJLIL) {
            return;
        }
        try {
            this.LJLILLLLZI = C90491ZfL.LIZ(context.createPackageContext("com.google.android.gms", 0));
            this.LJLIL = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf);
            }
        }
    }

    @Override // X.InterfaceC90465Zev
    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.LJLIL) {
            return z;
        }
        SharedPreferences sharedPreferences = this.LJLILLLLZI;
        Boolean valueOf = Boolean.valueOf(z);
        try {
            valueOf = (Boolean) C90543ZgB.LIZ(new CallableC90486ZfG(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf2);
            }
        }
        return valueOf.booleanValue();
    }

    @Override // X.InterfaceC90465Zev
    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.LJLIL) {
            return i;
        }
        SharedPreferences sharedPreferences = this.LJLILLLLZI;
        Integer valueOf = Integer.valueOf(i);
        try {
            valueOf = (Integer) C90543ZgB.LIZ(new CallableC90487ZfH(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf2);
            }
        }
        return valueOf.intValue();
    }

    @Override // X.InterfaceC90465Zev
    public long getLongFlagValue(String str, long j, int i) {
        if (!this.LJLIL) {
            return j;
        }
        SharedPreferences sharedPreferences = this.LJLILLLLZI;
        Long valueOf = Long.valueOf(j);
        try {
            valueOf = (Long) C90543ZgB.LIZ(new CallableC90488ZfI(sharedPreferences, str, valueOf));
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf2);
            }
        }
        return valueOf.longValue();
    }

    @Override // X.InterfaceC90465Zev
    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.LJLIL) {
            return str2;
        }
        try {
            str2 = (String) C90543ZgB.LIZ(new CallableC90489ZfJ(this.LJLILLLLZI, str, str2));
            return str2;
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf);
                return str2;
            }
            return str2;
        }
    }
}
