package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IDY extends IDX {
    public long LIZJ = -1;
    public volatile boolean LIZLLL;

    @Override // X.IDX
    public final void LIZJ() {
        this.LIZJ = -1L;
        this.LIZLLL = false;
    }

    @Override // X.IDX
    public final long LIZ() {
        return this.LIZJ;
    }

    @Override // X.IDX
    public final boolean LIZIZ(Aweme aweme) {
        if (C46252IDg.LIZ(aweme) && this.LIZJ >= 0 && this.LIZLLL) {
            return true;
        }
        return false;
    }

    @Override // X.IDX
    public final void LJ(boolean z) {
        this.LIZLLL = z;
    }

    @Override // X.IDX
    public final void LIZLLL(Aweme aweme, boolean z) {
        String aid;
        String str;
        long currentPosition;
        if (!C46252IDg.LIZ(aweme)) {
            return;
        }
        String str2 = null;
        if (aweme == null || (aid = aweme.getAid()) == null || aid.length() == 0) {
            return;
        }
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        VideoUrlModel LJJJJLI = IWF.LJJLIIIIJ().LJJJJLI();
        if (LJJJJLI != null) {
            str2 = LJJJJLI.getSourceId();
        }
        if (!o.LJ(str, str2)) {
            return;
        }
        if (z) {
            currentPosition = 0;
        } else {
            currentPosition = IWF.LJJLIIIIJ().getCurrentPosition();
        }
        this.LIZJ = currentPosition;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("savePausePosition, mPausePositon:");
        LIZ.append(this.LIZJ);
        String msg = X1D.LIZIZ(LIZ);
        o.LJIIIZ(msg, "msg");
    }

    @Override // X.IDX
    public final boolean LJFF(int i, Aweme aweme) {
        boolean z;
        if (!C46252IDg.LIZ(aweme)) {
            return false;
        }
        InterfaceC46330IGg LJJLIIIIJ = IWF.LJJLIIIIJ();
        if (aweme == null || LJJLIIIIJ.LJJJJLI() == null || i > 0) {
            return false;
        }
        boolean z2 = !TextUtils.equals(aweme.getAid(), LJJLIIIIJ.LJJJJLI().getSourceId());
        if ((IDX.LIZ || IDX.LIZIZ) && TextUtils.equals(aweme.getAid(), LJJLIIIIJ.LJJJJLI().getSourceId())) {
            z = true;
        } else {
            z = false;
        }
        if (!z2 && !z) {
            return false;
        }
        return true;
    }
}
