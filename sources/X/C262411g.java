package X;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: X.11g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C262411g {
    public final Context LIZ;
    public String LIZIZ;
    public AbstractC262311f LIZJ;
    public boolean LIZLLL;

    public final C262511h LIZ() {
        if (this.LIZJ != null) {
            if (this.LIZ != null) {
                if (!this.LIZLLL || !TextUtils.isEmpty(this.LIZIZ)) {
                    return new C262511h(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
                }
                throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
            }
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }

    public C262411g(Context context) {
        this.LIZ = context;
    }
}
