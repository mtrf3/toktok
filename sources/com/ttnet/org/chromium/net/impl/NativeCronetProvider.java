package com.ttnet.org.chromium.net.impl;

import X.PP5;
import X.PP6;
import X.QE5;
import android.content.Context;
import java.util.Arrays;

/* loaded from: classes12.dex */
public class NativeCronetProvider extends PP5 {
    @Override // X.PP5
    public final void LIZJ() {
    }

    @Override // X.PP5
    public final void LIZLLL() {
    }

    @Override // X.PP5
    public final void LJ() {
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.LIZ});
    }

    @Override // X.PP5
    public final PP6 LIZIZ() {
        return new PP6(new QE5(this.LIZ));
    }

    public NativeCronetProvider(Context context) {
        super(context);
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof NativeCronetProvider) && this.LIZ.equals(((PP5) obj).LIZ))) {
            return true;
        }
        return false;
    }
}
