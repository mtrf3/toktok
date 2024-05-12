package X;

import android.view.View;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.JbK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnLayoutChangeListenerC49474JbK implements View.OnLayoutChangeListener {
    public final /* synthetic */ C49475JbL LJLIL;
    public final /* synthetic */ C49288JWa LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro LJLJI;

    public ViewOnLayoutChangeListenerC49474JbK(C49475JbL c49475JbL, C49288JWa c49288JWa, InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = c49475JbL;
        this.LJLILLLLZI = c49288JWa;
        this.LJLJI = interfaceC65784Pro;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        InterfaceC55100Ljs interfaceC55100Ljs;
        InterfaceC55235Lm3 LJIJ;
        o.LJIIIZ(view, "view");
        view.removeOnLayoutChangeListener(this);
        Object LJJIZ = this.LJLIL.LIZ.LJJIZ(this.LJLILLLLZI.LIZ);
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = null;
        if (LJJIZ != null && (LJJIZ instanceof InterfaceC55100Ljs) && (interfaceC55100Ljs = (InterfaceC55100Ljs) LJJIZ) != null && (LJIJ = C55096Ljo.LJIJ(interfaceC55100Ljs)) != null) {
            searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) C55096Ljo.LIZ(LJIJ, SearchServiceCenter$AutoPlayAbility.class, null);
        }
        this.LJLIL.LJ = searchServiceCenter$AutoPlayAbility;
        if (searchServiceCenter$AutoPlayAbility == null) {
            return;
        }
        C49288JWa c49288JWa = this.LJLILLLLZI.LIZIZ;
        if (c49288JWa != null) {
            searchServiceCenter$AutoPlayAbility.tO(c49288JWa, this.LJLJI);
        } else {
            this.LJLJI.invoke();
        }
    }
}
