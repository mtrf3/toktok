package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import kotlin.jvm.internal.o;

/* renamed from: X.Vss, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81138Vss extends AbstractC38635FEh {
    public final /* synthetic */ int LJIIJ;

    public /* synthetic */ C81138Vss(int i) {
        this.LJIIJ = i;
    }

    @Override // X.AbstractC38635FEh
    public final boolean LJIIJJI(Context context) {
        switch (this.LJIIJ) {
            case 1:
                return AbstractC38635FEh.LJIILLIIL(context);
            default:
                o.LJIIJ(context, "context");
                return true;
        }
    }

    @Override // X.AbstractC38635FEh
    public final View LJIILJJIL(Context context, AttributeSet attributeSet) {
        switch (this.LJIIJ) {
            case 0:
                return new LinearLayoutCompat(context, attributeSet);
            default:
                return new RelationButton(context, attributeSet);
        }
    }
}
