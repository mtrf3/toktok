package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public abstract class N6Q<T extends View> implements JK9 {
    public final C58809N6f LJLIL;
    public final Aweme LJLILLLLZI;
    public final AwemeSearchAdModel LJLJI;
    public final Context LJLJJI;
    public final ActivityC45651qj LJLJJL;

    public abstract T LIZ();

    public void LIZIZ(C58798N5u c58798N5u) {
    }

    public boolean LIZJ(C58809N6f param) {
        o.LJIIIZ(param, "param");
        return true;
    }

    @Override // X.JK9
    public void LLLLZI() {
    }

    @Override // X.JK9
    public void onViewAttachedToWindow() {
    }

    @Override // X.JK9
    public void onViewDetachedFromWindow() {
    }

    public N6Q(C58809N6f param) {
        AwemeSearchAdModel awemeSearchAdModel;
        Context context;
        AwemeRawAd awemeRawAd;
        o.LJIIIZ(param, "param");
        this.LJLIL = param;
        Aweme aweme = param.LJI.getAweme();
        this.LJLILLLLZI = aweme;
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            awemeSearchAdModel = awemeRawAd.getSearchAdInfo();
        } else {
            awemeSearchAdModel = null;
        }
        this.LJLJI = awemeSearchAdModel;
        ViewGroup viewGroup = param.LIZ;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        this.LJLJJI = context;
        Context context2 = param.LJI.getContext();
        this.LJLJJL = context2 != null ? C45804HyK.LJJIFFI(context2) : null;
    }
}
