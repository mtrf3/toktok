package X;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailability;
import kotlin.jvm.internal.AqS127S0300000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.OXf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62059OXf {
    public final Context LIZ;
    public final boolean LIZIZ;
    public final C62062OXi LIZJ;
    public C62061OXh LIZLLL;
    public AqS127S0300000_10 LJ;

    public C62059OXf(Context context) {
        int i;
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        try {
            i = C16880lQ.LLLLLZIL(GoogleApiAvailability.getInstance(), context);
        } catch (Exception unused) {
            i = 1;
        }
        this.LIZIZ = C48479J0x.LIZ(this.LIZ) && i == 0;
        this.LIZJ = new C62062OXi(context);
    }
}
