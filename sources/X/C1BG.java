package X;

import android.os.Bundle;
import android.os.Messenger;
import androidx.media.MediaBrowserServiceCompat;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1BG, reason: invalid class name */
/* loaded from: classes.dex */
public class C1BG implements C09P {
    public final List<Bundle> LIZ = new ArrayList();
    public C09Q LIZIZ;
    public Messenger LIZJ;
    public final /* synthetic */ MediaBrowserServiceCompat LIZLLL;

    @Override // X.C09P
    public void onCreate() {
        C09Q c09q = new C09Q(this, this.LIZLLL);
        this.LIZIZ = c09q;
        c09q.onCreate();
    }

    public C1BG(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        this.LIZLLL = mediaBrowserServiceCompat;
    }
}
