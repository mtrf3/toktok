package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.live.design.widget.LiveEditText;

/* renamed from: X.Ynf, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88459Ynf extends AbstractC38635FEh {
    public final /* synthetic */ int LJIIJ;

    @Override // X.AbstractC38635FEh
    public final View LJIILJJIL(Context context, AttributeSet attributeSet) {
        switch (this.LJIIJ) {
            case 0:
                return new LiveEditText(context, attributeSet);
            default:
                return new C210118Ml(context, attributeSet);
        }
    }
}
