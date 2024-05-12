package X;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.a1;

/* renamed from: X.7yZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203397yZ extends C203417yb {
    @Override // X.C203417yb
    public C203347yU getFavoriteViewScaleHelper() {
        C203347yU scaleHelper = getScaleHelper();
        if (scaleHelper == null) {
            C203347yU c203347yU = new C203347yU() { // from class: X.7yY
                @Override // X.C203347yU
                public final int LIZIZ() {
                    if (C208088Eq.LIZIZ()) {
                        if (C8D3.LIZIZ()) {
                            return C7MY.LIZIZ(30);
                        }
                        return C7MY.LIZIZ(32);
                    }
                    return C7MY.LIZIZ(24);
                }
            };
            setScaleHelper(c203347yU);
            return c203347yU;
        }
        return scaleHelper;
    }

    @Override // X.C203417yb
    public int getLandscapeDrawableWidth() {
        if (C208088Eq.LIZIZ()) {
            if (C8D3.LIZIZ()) {
                return C7MY.LIZIZ(30);
            }
            return C7MY.LIZIZ(32);
        }
        return C7MY.LIZIZ(24);
    }

    @Override // X.C77869UhF, X.C29701Eo, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C203397yZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 4, 0);
        a1.LJFF(context, "context");
    }
}
