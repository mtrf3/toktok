package X;

import android.content.Intent;

/* renamed from: X.Fdb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39423Fdb extends Exception {
    public final Intent LJLIL;

    public Intent getIntent() {
        return new Intent(this.LJLIL);
    }

    public C39423Fdb(String str, Intent intent) {
        super(str);
        this.LJLIL = intent;
    }
}
