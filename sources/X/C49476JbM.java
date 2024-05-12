package X;

import Y.IDCListenerS255S0100000_8;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.JbM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49476JbM implements C0A3 {
    public final HashMap<View, InterfaceC49482JbS> LJLIL = new HashMap<>();
    public final /* synthetic */ C49475JbL LJLILLLLZI;

    public C49476JbM(C49475JbL c49475JbL) {
        this.LJLILLLLZI = c49475JbL;
    }

    @Override // X.C0A3
    public final void LJIILIIL(View view) {
        o.LJIIIZ(view, "view");
        InterfaceC49482JbS interfaceC49482JbS = this.LJLIL.get(view);
        if (interfaceC49482JbS != null) {
            this.LJLILLLLZI.LIZ().remove(interfaceC49482JbS);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0A3
    public final void LJJIFFI(View view) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility2;
        o.LJIIIZ(view, "view");
        RecyclerView.ViewHolder LJJJJJL = this.LJLILLLLZI.LIZ.LJJJJJL(view);
        if ((LJJJJJL instanceof InterfaceC55100Ljs) && (searchServiceCenter$AutoPlayAbility = (SearchServiceCenter$AutoPlayAbility) C55096Ljo.LIZ(C55096Ljo.LJIJ((InterfaceC55100Ljs) LJJJJJL), SearchServiceCenter$AutoPlayAbility.class, null)) != null) {
            C49475JbL c49475JbL = this.LJLILLLLZI;
            C49478JbO c49478JbO = new C49478JbO(LJJJJJL.getBindingAdapterPosition(), searchServiceCenter$AutoPlayAbility.getDetectView());
            this.LJLIL.put(view, c49478JbO);
            c49475JbL.LIZ().put(c49478JbO, searchServiceCenter$AutoPlayAbility);
            if (c49475JbL.LJFF && c49475JbL.LJ == null) {
                RecyclerView recyclerView = c49475JbL.LIZ;
                if (C16330kX.LIZJ(recyclerView) && !recyclerView.isLayoutRequested()) {
                    if (c49475JbL.LJFF && c49475JbL.LJ == null) {
                        InterfaceC49479JbP interfaceC49479JbP = c49475JbL.LIZJ;
                        RecyclerView recyclerView2 = c49475JbL.LIZ;
                        java.util.Set<InterfaceC49482JbS> keySet = c49475JbL.LIZ().keySet();
                        o.LJIIIIZZ(keySet, "attachedChildAbilityMap.keys");
                        InterfaceC49482JbS LIZIZ = interfaceC49479JbP.LIZIZ(recyclerView2, 0, keySet);
                        if (LIZIZ != null && (searchServiceCenter$AutoPlayAbility2 = c49475JbL.LIZ().get(LIZIZ)) != null) {
                            c49475JbL.LIZIZ(searchServiceCenter$AutoPlayAbility2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                recyclerView.addOnLayoutChangeListener(new IDCListenerS255S0100000_8(c49475JbL, 5));
            }
        }
    }
}
