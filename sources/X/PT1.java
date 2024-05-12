package X;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes12.dex */
public final class PT1 extends C64497PSz {
    public final Context LIZJ;
    public final String LIZLLL;

    @Override // X.C64497PSz, X.InterfaceC66858QLu
    public final SharedPreferences.Editor edit() {
        return new PT0(this, this.LIZJ, super.edit());
    }

    public PT1(Context context, String str) {
        super(context, str);
        this.LIZLLL = str;
        this.LIZJ = context;
    }
}
