package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.live.Live;

/* renamed from: X.OWo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62042OWo implements InterfaceC61118Nyk {
    public final /* synthetic */ Activity LIZ;
    public final /* synthetic */ String LIZIZ;

    public C62042OWo(Activity activity, String str) {
        this.LIZ = activity;
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC61118Nyk
    public final void LIZ(int[] iArr, String[] strArr) {
        for (int i : iArr) {
            if (i != 0) {
                return;
            }
        }
        Live.jumpToLive(this.LIZ, this.LIZIZ);
    }
}
