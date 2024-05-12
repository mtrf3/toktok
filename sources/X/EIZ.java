package X;

import com.bytedance.common.utility.collection.WeakHandler;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import java.util.concurrent.Callable;

/* loaded from: classes7.dex */
public final /* synthetic */ class EIZ implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ WeakHandler.IHandler LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object lambda$continueWithScrollSwitchStateManager$13;
        String str;
        switch (this.LJLIL) {
            case 0:
                lambda$continueWithScrollSwitchStateManager$13 = ((BaseListFragmentPanel) this.LJLILLLLZI).lambda$continueWithScrollSwitchStateManager$13((InterfaceC64592gB) this.LJLJI);
                return lambda$continueWithScrollSwitchStateManager$13;
            default:
                AbstractC36700Eam abstractC36700Eam = (AbstractC36700Eam) this.LJLILLLLZI;
                j jVar = (j) this.LJLJI;
                abstractC36700Eam.getClass();
                if (jVar != null && (jVar instanceof m)) {
                    abstractC36700Eam.LIZIZ((m) jVar, true);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("creator_fund_investigate action = creator_fund_setting_finished, success = true, is_combine = false, is_v3 = ");
                    FH5.LIZIZ().getClass();
                    LIZ.append(true);
                    LIZ.append(", is_v3_api = false");
                    C36922EeM.LJ(X1D.LIZIZ(LIZ));
                    try {
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                    if (((m) jVar).LJJIJ("creator_fund_setting_entry_schema") != null) {
                        str = ((m) jVar).LJJIJ("creator_fund_setting_entry_schema").LJJIFFI();
                        C36922EeM.LJ("creator_fund_investigate action = creator_fund_setting_success, content = " + str);
                        return null;
                    }
                    str = "";
                    C36922EeM.LJ("creator_fund_investigate action = creator_fund_setting_success, content = " + str);
                    return null;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("creator_fund_investigate action = creator_fund_setting_finished, success = false, is_combine = false, is_v3 = ");
                FH5.LIZIZ().getClass();
                LIZ2.append(true);
                LIZ2.append(", is_v3_api = false");
                C36922EeM.LJ(X1D.LIZIZ(LIZ2));
                return null;
        }
    }

    public /* synthetic */ EIZ(WeakHandler.IHandler iHandler, Object obj, int i) {
        this.LJLIL = i;
        this.LJLILLLLZI = iHandler;
        this.LJLJI = obj;
    }
}
