package X;

import android.app.Activity;
import android.content.Intent;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class M5X extends F9E {
    public final Activity LJLIL;
    public android.net.Uri LJLILLLLZI;
    public final Intent LJLJI;
    public android.net.Uri LJLJJI;
    public final HashMap<String, Object> LJLJJL;
    public final C40372Fsu LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public M5X(Activity activity, android.net.Uri uri, Intent appendedIntent, android.net.Uri uri2) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(appendedIntent, "appendedIntent");
        this.LJLIL = activity;
        this.LJLILLLLZI = uri;
        this.LJLJI = appendedIntent;
        this.LJLJJI = uri2;
        new HashMap();
        this.LJLJJL = new HashMap<>();
        this.LJLJJLL = new C40372Fsu();
    }
}
