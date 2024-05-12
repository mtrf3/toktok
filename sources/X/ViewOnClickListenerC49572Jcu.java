package X;

import android.view.View;
import com.ss.android.ugc.aweme.discover.model.SearchOperation;
import com.ss.android.ugc.aweme.services.MainServiceImpl;

/* renamed from: X.Jcu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC49572Jcu implements View.OnClickListener {
    public final /* synthetic */ C49571Jct LJLIL;
    public final /* synthetic */ SearchOperation LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI = false;

    public ViewOnClickListenerC49572Jcu(C49571Jct c49571Jct, SearchOperation searchOperation) {
        this.LJLIL = c49571Jct;
        this.LJLILLLLZI = searchOperation;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).startAdsAppActivity(this.LJLIL.getContext(), this.LJLILLLLZI.getLink(), null);
        C49573Jcv c49573Jcv = new C49573Jcv();
        c49573Jcv.LJIIZILJ("log_pb", this.LJLIL.LJLJL().LJIIIIZZ);
        c49573Jcv.LJIIZILJ("card_id", this.LJLILLLLZI.getCardId());
        c49573Jcv.LJIJI(this.LJLIL.LJLJL().LJFF);
        c49573Jcv.LJIIZILJ("search_keyword", this.LJLIL.LJLJL().LJ);
        c49573Jcv.LJIILIIL();
        this.LJLIL.Q("search_result_click");
        if (this.LJLJI) {
            C49571Jct c49571Jct = this.LJLIL;
            c49571Jct.getClass();
            new JNH(c49571Jct.LJLJL()).LJIILIIL();
        }
    }
}
