package com.ss.android.ugc.profile.platform.base.data;

import X.C221018lt;
import X.C237259Sv;
import X.EF7;
import X.InterfaceC65349Pkn;
import X.KMP;
import X.X1D;
import android.content.Context;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public class Describe implements Serializable {

    @InterfaceC65349Pkn("starling_key")
    public String localText;

    @InterfaceC65349Pkn("text")
    public String remoteText;

    public final String getText() {
        boolean z;
        String str = this.remoteText;
        boolean z2 = true;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = this.remoteText;
            o.LJII(str2, "null cannot be cast to non-null type kotlin.String");
            return str2;
        }
        String str3 = this.localText;
        if (str3 != null && str3.length() != 0) {
            z2 = false;
        }
        if (!z2) {
            try {
                Context LIZIZ = EF7.LIZIZ();
                int identifier = LIZIZ.getResources().getIdentifier(this.localText, "string", LIZIZ.getPackageName());
                if (identifier == 0) {
                    C237259Sv.LJI("resource id is 0", this.localText);
                    return null;
                }
                return LIZIZ.getResources().getString(identifier);
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                C237259Sv.LJI(KMP.LJFF(LIZ, "get resource exception: ", e, LIZ), this.localText);
                C221018lt.LJ(e);
                return null;
            }
        }
        C237259Sv.LJI("remote and local text are empty", this.localText);
        return null;
    }

    public final String getLocalText() {
        return this.localText;
    }

    public final String getRemoteText() {
        return this.remoteText;
    }

    public final void setLocalText(String str) {
        this.localText = str;
    }

    public final void setRemoteText(String str) {
        this.remoteText = str;
    }
}
