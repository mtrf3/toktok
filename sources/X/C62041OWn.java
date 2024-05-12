package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.live.Live;

/* renamed from: X.OWn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62041OWn implements InterfaceC61107NyZ {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.InterfaceC61107NyZ
    public final void LIZ() {
    }

    @Override // X.InterfaceC61107NyZ
    public final void LIZIZ(C164906da... c164906daArr) {
        for (C164906da c164906da : c164906daArr) {
            if (!c164906da.LIZ()) {
                return;
            }
        }
        Live.jumpToLive(this.LIZ, this.LIZIZ);
    }

    public C62041OWn(Activity activity, String str) {
        this.LIZ = activity;
        this.LIZIZ = str;
    }
}
