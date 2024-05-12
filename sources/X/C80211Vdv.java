package X;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* renamed from: X.Vdv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80211Vdv implements InterfaceC17830mx {
    public final /* synthetic */ C45621qg LIZ;
    public final /* synthetic */ C80217Ve1 LIZIZ;
    public final /* synthetic */ View LIZJ;
    public final /* synthetic */ int LIZLLL;
    public final /* synthetic */ AppBarLayout$BaseBehavior LJ;

    @Override // X.InterfaceC17830mx
    public final boolean LIZ(View view) {
        this.LJ.onNestedPreScroll(this.LIZ, (C45621qg) this.LIZIZ, this.LIZJ, 0, this.LIZLLL, new int[]{0, 0}, 1);
        return true;
    }

    public C80211Vdv(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, C45621qg c45621qg, C80217Ve1 c80217Ve1, View view, int i) {
        this.LJ = appBarLayout$BaseBehavior;
        this.LIZ = c45621qg;
        this.LIZIZ = c80217Ve1;
        this.LIZJ = view;
        this.LIZLLL = i;
    }
}
