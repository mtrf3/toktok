package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.NHm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59102NHm implements NS7 {
    public final ViewGroup LIZ;
    public final Aweme LIZIZ;

    @Override // X.NS7
    public final Aweme getAweme() {
        return this.LIZIZ;
    }

    @Override // X.NSG
    public final ViewGroup getContainer() {
        return this.LIZ;
    }

    public C59102NHm(ViewGroup viewGroup, Aweme aweme) {
        this.LIZ = viewGroup;
        this.LIZIZ = aweme;
    }
}
