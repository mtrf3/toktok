package X;

import android.os.Bundle;

/* renamed from: X.VAt, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79311VAt implements Comparable {
    public final Long LJLIL;
    public final Bundle LJLILLLLZI;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C79311VAt c79311VAt = (C79311VAt) obj;
        if (this.LJLIL.longValue() > c79311VAt.LJLIL.longValue()) {
            return 1;
        }
        if (this.LJLIL.longValue() < c79311VAt.LJLIL.longValue()) {
            return -1;
        }
        return 0;
    }

    public C79311VAt(Long l, Bundle bundle) {
        this.LJLIL = l;
        this.LJLILLLLZI = bundle;
        bundle.getInt("mpd_update_count", 0);
    }
}
