package X;

import android.view.View;
import com.ss.android.ugc.aweme.model.ManagementPagePaidVideo;
import kotlin.jvm.internal.o;

/* renamed from: X.A0v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25545A0v extends F9E {
    public final ManagementPagePaidVideo LJLIL;
    public final View LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI)};
    }

    public C25545A0v(int i, int i2, View anchor, ManagementPagePaidVideo video) {
        o.LJIIIZ(video, "video");
        o.LJIIIZ(anchor, "anchor");
        this.LJLIL = video;
        this.LJLILLLLZI = anchor;
        this.LJLJI = i;
        this.LJLJJI = i2;
    }
}
