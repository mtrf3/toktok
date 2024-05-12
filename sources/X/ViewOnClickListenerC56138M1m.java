package X;

import android.view.View;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfg;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem;
import com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideVM;

/* renamed from: X.M1m, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class ViewOnClickListenerC56138M1m implements View.OnClickListener {
    public final /* synthetic */ EcVideoGuideAssem LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ C56140M1o LJLJI;
    public final /* synthetic */ String LJLJJI;

    public ViewOnClickListenerC56138M1m(EcVideoGuideAssem ecVideoGuideAssem, int i, C56140M1o c56140M1o, String str) {
        this.LJLIL = ecVideoGuideAssem;
        this.LJLILLLLZI = i;
        this.LJLJI = c56140M1o;
        this.LJLJJI = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.LJLIL.q4(EnumC56033Lyv.CLICK_BUTTON, this.LJLILLLLZI);
        this.LJLIL.z4(this.LJLJI.LJ, this.LJLJJI);
        EcVideoGuideVM r4 = this.LJLIL.r4();
        ReachCfg reachCfg = this.LJLJI.LJFF;
        int i = this.LJLILLLLZI;
        r4.getClass();
        if (reachCfg != null) {
            C78565UsT.LJJIJIIJI(r4, C78613UtF.LIZJ, new ECJ(reachCfg, r4, i, 2, null));
        }
        java.util.Map<String, Object> map = this.LJLJI.LIZLLL;
        map.put("enter_method", this.LJLJJI);
        b.LJJIJIIJI("tiktokec_mall_entrance_click", map);
    }
}
