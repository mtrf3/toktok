package X;

import android.view.View;
import com.ss.android.ugc.aweme.delegate.NearbyBottomTabProtocolDelegate$registerNearbyHomePageParamWhenViewPost$1;

/* renamed from: X.LIw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54042LIw extends C54044LIy {
    @Override // X.C54044LIy
    public final void LIZ(View view) {
        if (!LQA.LIZIZ.LJI()) {
            super.LIZ(view);
        }
    }

    @Override // X.C54044LIy
    public final void LIZIZ(View view) {
        if (!LQA.LIZIZ.LJI()) {
            super.LIZIZ(view);
        }
    }

    public final void LIZJ(View view) {
        if (!LQA.LIZIZ.LJI()) {
            view.post(new NearbyBottomTabProtocolDelegate$registerNearbyHomePageParamWhenViewPost$1(view, this));
        }
    }
}
