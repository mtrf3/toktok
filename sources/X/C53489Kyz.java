package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Kyz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53489Kyz extends F9E {
    public final L69 LJLIL;
    public final View LJLILLLLZI;
    public final View LJLJI;
    public final Context LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI};
    }

    public C53489Kyz(L69 avatarComponentView, View view, View view2, Context context) {
        o.LJIIIZ(avatarComponentView, "avatarComponentView");
        o.LJIIIZ(view, "view");
        this.LJLIL = avatarComponentView;
        this.LJLILLLLZI = view;
        this.LJLJI = view2;
        this.LJLJJI = context;
    }
}
