package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes9.dex */
public final class JGM implements N54 {
    public final /* synthetic */ JGI LIZ;

    @Override // X.N54
    public final Context LIZ() {
        return this.LIZ.getContext();
    }

    @Override // X.N54
    public final Aweme getAweme() {
        return this.LIZ.getMAweme();
    }

    @Override // X.N54
    public final long getCurrentPosition() {
        return this.LIZ.getMPlayVideoHelper().LIZLLL();
    }

    @Override // X.N54
    public final boolean isPlaying() {
        return this.LIZ.isPlaying();
    }

    @Override // X.N54
    public final boolean isMute() {
        return J1C.LIZIZ();
    }

    public JGM(JGI jgi) {
        this.LIZ = jgi;
    }
}
