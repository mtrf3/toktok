package X;

import Y.AfS55S0100000_3;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.comment.gift.model.GiftStruct;
import com.ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.6z0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C178186z0 extends RecyclerView.ViewHolder {
    public final View LJLIL;
    public final Fragment LJLILLLLZI;
    public final ActivityC45651qj LJLJI;
    public final String LJLJJI;
    public final GiftViewModel LJLJJL;
    public final int LJLJJLL;
    public final C188487aW LJLJL;
    public final boolean LJLJLJ;
    public GiftStruct LJLJLLL;
    public long LJLL;
    public int LJLLI;
    public InterfaceC82683Wch LJLLILLLL;

    public final C177336xd M() {
        InterfaceC55251LmJ LIZLLL = C55247LmF.LIZLLL(C55230Lly.LIZJ(this.LJLILLLLZI, null), C177336xd.class, "source_default_key");
        if (LIZLLL == null) {
            return null;
        }
        return (C177336xd) LIZLLL.getSource();
    }

    public final String L() {
        Aweme aweme;
        String aid;
        C177336xd M = M();
        if (M == null || (aweme = M.LJLLI) == null || (aid = aweme.getAid()) == null) {
            return "";
        }
        return aid;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C178186z0(View view, Fragment fragment, ActivityC45651qj context, String tabName, GiftViewModel giftViewModel, int i, C188487aW giftRechargeDialogUtil, boolean z) {
        super(view);
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(tabName, "tabName");
        o.LJIIIZ(giftViewModel, "giftViewModel");
        o.LJIIIZ(giftRechargeDialogUtil, "giftRechargeDialogUtil");
        this.LJLIL = view;
        this.LJLILLLLZI = fragment;
        this.LJLJI = context;
        this.LJLJJI = tabName;
        this.LJLJJL = giftViewModel;
        this.LJLJJLL = i;
        this.LJLJL = giftRechargeDialogUtil;
        this.LJLJLJ = z;
        this.LJLL = -1L;
        this.LJLLI = -1;
        new C116974iT(view).LJJLIIIJILLIZJL(1L, TimeUnit.SECONDS).LJJJJZI(new AfS55S0100000_3(this, 76));
    }
}
