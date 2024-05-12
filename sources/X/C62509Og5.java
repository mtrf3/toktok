package X;

import Y.ACallableS87S0200000_10;
import Y.AfS49S0300000_10;
import android.content.Context;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Og5, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62509Og5 extends C46181IAn {
    public final Aweme LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final boolean LJLJJL;
    public final int LJLJJLL;
    public final Cert LJLJL;

    @Override // X.C46181IAn, X.InterfaceC62486Ofi
    public final boolean enable() {
        return this.LJLILLLLZI.getAwemeControl().canShare();
    }

    @Override // X.C46181IAn, X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        Aweme aweme;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (!C17N.LJIIIZ(this, context, this.LJLILLLLZI, this.LJLJI) || !this.LJLILLLLZI.getAwemeControl().canShare()) {
            return;
        }
        if ((this.LJLILLLLZI.getAwemeType() == 13 && !C227738wj.LIZ(context, this.LJLILLLLZI)) || (aweme = this.LJLILLLLZI) == null || aweme.getShareInfo() == null) {
            return;
        }
        DialogC25756A8y dialogC25756A8y = new DialogC25756A8y(context);
        dialogC25756A8y.LIZIZ(R.string.f0g);
        V1B.LJLJJL(dialogC25756A8y);
        AbstractC73745Swv.LIZLLL(new ACallableS87S0200000_10(this, sharePackage, 7)).LJIILJJIL(T16.LIZ()).LJII(C73969T1h.LIZIZ()).LJIIIZ(new AfS49S0300000_10(dialogC25756A8y, this, context, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62509Og5(Aweme aweme, String shareTitle, C78862UxG c78862UxG) {
        super("", false);
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(shareTitle, "shareTitle");
        this.LJLILLLLZI = aweme;
        this.LJLJI = "";
        this.LJLJJI = shareTitle;
        this.LJLJJL = true;
        this.LJLJJLL = R.string.dwb;
        this.LJLJL = c78862UxG;
    }
}
