package X;

import android.content.Context;
import android.view.ViewGroup;
import java.util.LinkedHashMap;

/* renamed from: X.Ukp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78091Ukp extends C78093Ukr {
    @Override // X.AbstractC78073UkX
    public final void LJI() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78091Ukp(Context context) {
        super(context);
        new LinkedHashMap();
    }

    @Override // X.C78093Ukr, X.AbstractC78073UkX
    public final EnumC78089Ukn LIZLLL(boolean z) {
        return EnumC78089Ukn.EXTENDED;
    }

    @Override // X.AbstractC78073UkX
    public final void LJII(int i) {
        int i2;
        int i3;
        if (getMIndex() == 0) {
            ViewGroup mContainerView = getMContainerView();
            if (mContainerView != null) {
                i3 = mContainerView.getWidth();
            } else {
                i3 = 0;
            }
            int LIZ = C15380j0.LIZ(64.0f);
            setX(-i3);
            setY(LIZ);
        }
        if (getMIndex() == 1) {
            ViewGroup mContainerView2 = getMContainerView();
            if (mContainerView2 != null) {
                i2 = mContainerView2.getWidth();
            } else {
                i2 = 0;
            }
            setX(-i2);
            setY(0);
        }
    }
}
