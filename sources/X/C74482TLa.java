package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* renamed from: X.TLa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74482TLa implements TPQ {
    public final /* synthetic */ ViewGroup LIZ;

    public final void LIZIZ() {
        View findViewById = this.LIZ.findViewById(R.id.kkd);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    public C74482TLa(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    @Override // X.TPQ
    public final void LIZ(View.OnClickListener onClickListener) {
        View findViewById = this.LIZ.findViewById(R.id.kkd);
        if (findViewById != null) {
            C16880lQ.LJIIJ(onClickListener, findViewById);
        }
    }
}
