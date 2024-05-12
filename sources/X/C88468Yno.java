package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.aweme.story.feed.immersive.ImmersiveGestureMonitor;

/* renamed from: X.Yno, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88468Yno extends AbstractC38635FEh {
    public final /* synthetic */ int LJIIJ;

    public /* synthetic */ C88468Yno(int i) {
        this.LJIIJ = i;
    }

    @Override // X.AbstractC38635FEh
    public final View LJIILJJIL(Context context, AttributeSet attributeSet) {
        switch (this.LJIIJ) {
            case 0:
                return new C2A7(context, attributeSet);
            default:
                return new ImmersiveGestureMonitor(context, attributeSet);
        }
    }
}
