package X;

import Y.IDRunnableS85S0100000;
import android.os.Bundle;
import android.os.IBinder;
import androidx.media.MediaBrowserServiceCompat;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.09O, reason: invalid class name */
/* loaded from: classes.dex */
public class C09O implements IBinder.DeathRecipient {
    public final String LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final C09U LJLJJI;
    public final HashMap<String, List<C15070iV<IBinder, Bundle>>> LJLJJL = new HashMap<>();
    public final /* synthetic */ MediaBrowserServiceCompat LJLJJLL;

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        post(new IDRunnableS85S0100000(this, 23));
    }

    public C09O(MediaBrowserServiceCompat mediaBrowserServiceCompat, String str, int i, int i2, C09U c09u) {
        this.LJLJJLL = mediaBrowserServiceCompat;
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        new C12210dt(str, i, i2);
        this.LJLJJI = c09u;
    }
}
