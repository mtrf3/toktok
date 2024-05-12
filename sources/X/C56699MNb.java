package X;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MNb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56699MNb extends MUZ {
    public final View.OnClickListener LJLJJLL;
    public final List<MVV> LJLJL;

    @Override // X.MUZ, X.InterfaceC56810MRi
    public final void onItemLongClick(int i) {
    }

    @Override // X.MUZ, X.InterfaceC56810MRi
    public final void onItemClick(int i) {
        this.LJLJJLL.onClick(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56699MNb(View.OnClickListener clickListener, MNX mnx) {
        super(mnx, false);
        o.LJIIIZ(clickListener, "clickListener");
        this.LJLJJLL = clickListener;
        this.LJLJL = new ArrayList();
        this.LJLJI = C56625MKf.LIZLLL();
    }
}
