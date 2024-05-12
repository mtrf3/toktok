package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.OMn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewOnClickListenerC61781OMn implements View.OnClickListener {
    public final /* synthetic */ Aweme LJLIL;
    public final /* synthetic */ C80796VnM LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ C68322mC<C26231ARf> LJLJJLL;

    public ViewOnClickListenerC61781OMn(Aweme aweme, C80796VnM c80796VnM, int i, int i2, int i3, C68322mC<C26231ARf> c68322mC) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = c80796VnM;
        this.LJLJI = i;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
        this.LJLJJLL = c68322mC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C61780OMm.LIZ(this.LJLIL, EnumC61773OMf.CANCEL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL);
        C26231ARf c26231ARf = this.LJLJJLL.element;
        if (c26231ARf != null) {
            c26231ARf.LIZIZ(null);
        }
    }
}
