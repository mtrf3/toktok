package X;

import Y.ALAdapterS10S0100000_13;
import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.MatchItemAssem;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.model.ItemInfo4FE;
import kotlin.jvm.internal.AqS17S0500000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Tzc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76460Tzc implements Runnable {
    public final /* synthetic */ MatchItemAssem LJLIL;
    public final /* synthetic */ C68322mC<String> LJLILLLLZI;
    public final /* synthetic */ ItemInfo4FE LJLJI;
    public final /* synthetic */ C72242sW LJLJJI;
    public final /* synthetic */ ImageModel LJLJJL;
    public final /* synthetic */ Bitmap LJLJJLL;
    public final /* synthetic */ Bitmap LJLJL;

    public RunnableC76460Tzc(MatchItemAssem matchItemAssem, C68322mC<String> c68322mC, ItemInfo4FE itemInfo4FE, C72242sW c72242sW, ImageModel imageModel, Bitmap bitmap, Bitmap bitmap2) {
        this.LJLIL = matchItemAssem;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = itemInfo4FE;
        this.LJLJJI = c72242sW;
        this.LJLJJL = imageModel;
        this.LJLJJLL = bitmap;
        this.LJLJL = bitmap2;
    }

    public final void LIZ() {
        C29701Eo c29701Eo;
        if (this.LJLIL.LJLLL == null) {
            return;
        }
        C0NB.LJIIIZ("MatchItemAssem", "show Self Use Card Animation first step ");
        C29701Eo c29701Eo2 = this.LJLIL.LJLLL;
        if (c29701Eo2 != null && c29701Eo2.getVisibility() == 8 && (c29701Eo = this.LJLIL.LJLLL) != null) {
            c29701Eo.setVisibility(0);
        }
        C29701Eo c29701Eo3 = this.LJLIL.LJLLL;
        String LIZ = CFX.LIZ("tiktok_live_lottie_resource", "tiktok_live_interaction_demand_3");
        String str = this.LJLILLLLZI.element;
        ItemInfo4FE itemInfo4FE = this.LJLJI;
        MatchItemAssem matchItemAssem = this.LJLIL;
        C15490jB.LJIIIZ(c29701Eo3, LIZ, str, "images", true, new C76459Tzb(itemInfo4FE, matchItemAssem, this.LJLJJI), new AqS17S0500000_13(this.LJLJJL, itemInfo4FE, matchItemAssem, this.LJLJJLL, this.LJLJL, 0));
        C29701Eo c29701Eo4 = this.LJLIL.LJLLL;
        if (c29701Eo4 != null) {
            c29701Eo4.removeAllAnimatorListeners();
        }
        MatchItemAssem matchItemAssem2 = this.LJLIL;
        C29701Eo c29701Eo5 = matchItemAssem2.LJLLL;
        if (c29701Eo5 != null) {
            ItemInfo4FE itemInfo4FE2 = this.LJLJI;
            o.LJIIIIZZ(itemInfo4FE2, "itemInfo4FE");
            c29701Eo5.addAnimatorListener(new ALAdapterS10S0100000_13(matchItemAssem2, 44));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
