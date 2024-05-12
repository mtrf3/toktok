package X;

import android.os.Handler;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Jbj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49499Jbj extends AbstractC49496Jbg {
    public final /* synthetic */ C49491Jbb LIZLLL;

    @Override // X.AbstractC49496Jbg
    public final RecyclerView.ViewHolder LIZ() {
        InterfaceC49498Jbi interfaceC49498Jbi;
        C49491Jbb c49491Jbb = this.LIZLLL;
        ViewGroup viewGroup = c49491Jbb.LIZ;
        if (viewGroup == null || (interfaceC49498Jbi = c49491Jbb.LIZIZ) == null) {
            return null;
        }
        return interfaceC49498Jbi.createFooterViewHolder(viewGroup);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49499Jbj(C49491Jbb c49491Jbb, Handler handler) {
        super(handler);
        this.LIZLLL = c49491Jbb;
    }
}
