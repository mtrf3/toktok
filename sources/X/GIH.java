package X;

import android.view.View;
import com.ss.android.ugc.aweme.compliance.business.antibullying.base.BaseAntiBullyingFragment;

/* loaded from: classes8.dex */
public final class GIH implements View.OnScrollChangeListener {
    public final /* synthetic */ BaseAntiBullyingFragment LIZ;

    public GIH(BaseAntiBullyingFragment baseAntiBullyingFragment) {
        this.LIZ = baseAntiBullyingFragment;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
        this.LIZ.Al(i2);
    }
}
