package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.JIz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48949JIz implements R47 {
    public final /* synthetic */ C48948JIy LIZ;
    public final /* synthetic */ Aweme LIZIZ;
    public final /* synthetic */ View LIZJ;

    public C48949JIz(C48948JIy c48948JIy, Aweme aweme, View view) {
        this.LIZ = c48948JIy;
        this.LIZIZ = aweme;
        this.LIZJ = view;
    }

    @Override // X.R47
    public final void onResult(int i, int i2, Object obj) {
        if (i == 1 && i2 == 1) {
            this.LIZ.P(this.LIZJ, this.LIZIZ);
        }
    }
}
