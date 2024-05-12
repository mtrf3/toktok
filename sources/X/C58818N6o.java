package X;

import Y.ARunnableS46S0100000_10;
import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.aweme.commercialize.search.ISearchAdEventLogger;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS192S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.N6o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58818N6o extends N6Q<RelationButton> {
    public final int LJLJJLL;
    public final int LJLJL;
    public InterfaceC58799N5v LJLJLJ;
    public IVideoPlayTaskManager LJLJLLL;
    public boolean LJLL;
    public long LJLLI;

    @Override // X.N6Q, X.JK9
    public final void onViewAttachedToWindow() {
    }

    @Override // X.N6Q, X.JK9
    public final void onViewDetachedFromWindow() {
        LJFF(false);
        this.LJLL = false;
    }

    public final void LIZLLL() {
        Context context = this.LJLJJI;
        if (context != null) {
            C58854N7y.LIZIZ(LIZ(), C79045V0n.LJI(R.attr.gp, context), C79045V0n.LJI(R.attr.eb, context));
            this.LJLIL.LJFF.LJLILLLLZI = 3;
        }
    }

    @Override // X.N6Q
    /* renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final RelationButton LIZ() {
        ViewGroup viewGroup = this.LJLIL.LIZ;
        if (viewGroup != null) {
            return (RelationButton) viewGroup.findViewById(R.id.jdt);
        }
        return null;
    }

    public final void LJI() {
        IVideoPlayTaskManager iVideoPlayTaskManager = this.LJLJLLL;
        if (iVideoPlayTaskManager != null) {
            N68 n68 = new N68("transformBtnChangeColor");
            n68.LIZIZ(this.LJLLI);
            n68.LIZJ = this.LJLJL;
            n68.LIZLLL = new ARunnableS46S0100000_10(this, 219);
            n68.LJ = false;
            iVideoPlayTaskManager.LJLJLJ(n68.LIZ());
        }
    }

    public final void LJII() {
        IVideoPlayTaskManager iVideoPlayTaskManager = this.LJLJLLL;
        if (iVideoPlayTaskManager != null) {
            N68 n68 = new N68("transformBtnShow");
            n68.LIZIZ(this.LJLLI);
            n68.LIZJ = this.LJLJJLL;
            n68.LIZLLL = new ARunnableS46S0100000_10(this, 220);
            n68.LJ = false;
            iVideoPlayTaskManager.LJLJLJ(n68.LIZ());
        }
    }

    @Override // X.N6Q, X.JK9
    public final void LLLLZI() {
        User user;
        C226668v0 c226668v0 = new C226668v0();
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            user = aweme.getAuthor();
        } else {
            user = null;
        }
        c226668v0.LIZ = user;
        c226668v0.LIZJ(EnumC57853MnB.TUX_SEMI_TRANSPARENT);
        C226678v1 LIZ = c226668v0.LIZ();
        RelationButton LIZ2 = LIZ();
        if (LIZ2 != null) {
            LIZ2.setVisibility(0);
            OUP.LJJJJLI(LIZ2, Float.valueOf(C32151Nz.LJIIZILJ(2)), null, null, 30);
            LIZ2.setFollowClickListener(new AqS192S0100000_10(this, 63));
            LIZ2.LLIIIJ.LJJJJJL(LIZ);
            LIZ2.setButtonVariant(2);
            C78897Uxp.LJJJJJL(LIZ2, 0.0f);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("bind SearchAdFollowBtnComponent componentView = ");
        LIZ3.append(LIZ());
        N8M.LIZ(X1D.LIZIZ(LIZ3));
        N6K n6k = this.LJLIL.LIZLLL;
        if (n6k != null) {
            n6k.LIZLLL(N6F.MASK_FOLLOW_CLICK, new AqS160S0100000_10(this, 623));
        }
        N6K n6k2 = this.LJLIL.LIZLLL;
        if (n6k2 != null) {
            n6k2.LIZLLL(N6F.ENTER_DETAIL, new AqS160S0100000_10(this, 624));
        }
        N6K n6k3 = this.LJLIL.LIZLLL;
        if (n6k3 != null) {
            n6k3.LIZLLL(N6F.RETURN_FROM_DETAIL, new AqS160S0100000_10(this, 625));
        }
    }

    public final void LJIIIIZZ() {
        Boolean bool;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("showFollowButton , hasFollowed = ");
        Aweme aweme = this.LJLILLLLZI;
        if (aweme != null) {
            bool = Boolean.valueOf(C63081OpJ.LJLJLJ(aweme));
        } else {
            bool = null;
        }
        LIZ.append(bool);
        N8M.LIZ(X1D.LIZIZ(LIZ));
        Aweme aweme2 = this.LJLILLLLZI;
        if (aweme2 != null && C63081OpJ.LJLJLJ(aweme2)) {
            return;
        }
        C58854N7y.LIZJ(LIZ(), 22, true);
        C58809N6f c58809N6f = this.LJLIL;
        c58809N6f.LJFF.LJLILLLLZI = 2;
        if (!this.LJLL) {
            ISearchAdEventLogger iSearchAdEventLogger = c58809N6f.LJ;
            C58777N4z.LIZ.getClass();
            iSearchAdEventLogger.LJIILIIL(C58777N4z.LIZLLL);
            this.LJLL = true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58818N6o(C58809N6f param) {
        super(param);
        float f;
        o.LJIIIZ(param, "param");
        AwemeSearchAdModel awemeSearchAdModel = this.LJLJI;
        if (awemeSearchAdModel != null) {
            f = awemeSearchAdModel.getShowButtonSeconds();
        } else {
            f = 0.0f;
        }
        this.LJLJJLL = (int) (f * 1000.0f);
        AwemeSearchAdModel awemeSearchAdModel2 = this.LJLJI;
        this.LJLJL = (int) ((awemeSearchAdModel2 != null ? awemeSearchAdModel2.getButtonColorShowSeconds() : 0.0f) * 1000.0f);
        this.LJLLI = -1L;
    }

    @Override // X.N6Q
    public final void LIZIZ(C58798N5u c58798N5u) {
        this.LJLJLJ = c58798N5u;
        N6J.LIZIZ(c58798N5u, this.LJLJJL, C51029K0z.LJJIIZI(new OSZ(N65.LIZ, new AqS157S0200000_10(this, c58798N5u, 53))));
    }

    @Override // X.N6Q
    public final boolean LIZJ(C58809N6f param) {
        o.LJIIIZ(param, "param");
        return O5Y.LJIILL(this.LJLILLLLZI);
    }

    public final void LJFF(boolean z) {
        ViewGroup.LayoutParams layoutParams;
        if (z) {
            C58854N7y.LIZ.postDelayed(new ARunnableS46S0100000_10(this, 218), 300L);
            return;
        }
        RelationButton LIZ = LIZ();
        if (LIZ != null) {
            layoutParams = LIZ.getLayoutParams();
        } else {
            layoutParams = null;
        }
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = -200;
        LIZ.setLayoutParams(marginLayoutParams);
        RelationButton LIZ2 = LIZ();
        if (LIZ2 == null) {
            return;
        }
        LIZ2.setButtonVariant(2);
    }
}
