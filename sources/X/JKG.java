package X;

import Y.ARunnableS12S0400000_8;
import Y.ARunnableS19S0300000_8;
import Y.IDCListenerS245S0100000_8;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS112S0300000_8;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JKG extends AbstractC48958JJi implements View.OnAttachStateChangeListener, InterfaceC49148JQq {
    public static final /* synthetic */ int LLIILII = 0;
    public final C49153JQv LJLJLJ;
    public final View LJLJLLL;
    public final int LJLL;
    public final String LJLLI;
    public JLF LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public final C62822Ol8 LLFII;
    public final C62822Ol8 LLFZ;
    public final C62822Ol8 LLI;
    public final float LLIFFJFJJ;
    public Aweme LLII;
    public final C48943JIt LLIIII;
    public boolean LLIIIILZ;
    public int LLIIIJ;
    public C48909JHl LLIIIL;
    public final SearchGlobalViewModel LLIIIZ;
    public volatile boolean LLIIJI;
    public JQA LLIIJLIL;
    public final C48957JJh LLIIL;

    @Override // X.AbstractC48958JJi, X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C49133JQb.LIZ("com.ss.android.ugc.aweme.xsearch.SearchLiveWithVideoItemViewHolder", new Object[0]);
        c0().getLiveCore().LJFF();
    }

    @Override // X.AbstractC48958JJi
    public final C48887JGp Q() {
        return null;
    }

    public final boolean T() {
        ITopLiveProductViewProvider iTopLiveProductViewProvider = (ITopLiveProductViewProvider) this.LLI.getValue();
        if (iTopLiveProductViewProvider != null) {
            return iTopLiveProductViewProvider.shouldShow(w0());
        }
        return false;
    }

    public final String U() {
        String anchorInfo;
        ITopLiveProductViewProvider iTopLiveProductViewProvider = (ITopLiveProductViewProvider) this.LLI.getValue();
        if (iTopLiveProductViewProvider == null || (anchorInfo = iTopLiveProductViewProvider.getAnchorInfo(w0())) == null) {
            return "";
        }
        return anchorInfo;
    }

    @Override // X.AbstractC48958JJi
    /* renamed from: V, reason: merged with bridge method [inline-methods] */
    public final SmartImageView N() {
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.etr);
        o.LJIIIIZZ(smartImageView, "itemView.item_cover");
        return smartImageView;
    }

    public final View Y() {
        Object value = this.LJLLL.getValue();
        o.LJIIIIZZ(value, "<get-liveTagContainer>(...)");
        return (View) value;
    }

    public final C72434Sbm a0() {
        return (C72434Sbm) this.LJLZ.getValue();
    }

    public final C48936JIm c0() {
        return (C48936JIm) this.LJLLJ.getValue();
    }

    public final TextView f0() {
        return (TextView) this.LJLLLLLL.getValue();
    }

    public final TextView g0() {
        return (TextView) this.LJZ.getValue();
    }

    public final float h0() {
        return ((Number) this.LLFF.getValue()).floatValue();
    }

    public final float i0() {
        return ((Number) this.LLFII.getValue()).floatValue();
    }

    public final LinearLayout m0() {
        return (LinearLayout) this.itemView.findViewById(R.id.i60);
    }

    public final View o0() {
        Object value = this.LJZI.getValue();
        o.LJIIIIZZ(value, "<get-userCountContainer>(...)");
        return (View) value;
    }

    public final C71898SJq p0() {
        C71898SJq c71898SJq = (C71898SJq) this.itemView.findViewById(R.id.g09);
        o.LJIIIIZZ(c71898SJq, "itemView.live_video_holder_tux_mask");
        return c71898SJq;
    }

    public final ConstraintLayout s0() {
        ConstraintLayout constraintLayout = (ConstraintLayout) this.itemView.findViewById(R.id.j73);
        o.LJIIIIZZ(constraintLayout, "itemView.root_aladdin_item_video");
        return constraintLayout;
    }

    public final boolean w0() {
        if (C49129JPx.LIZ(this.LJLL, this.LJLLI) || C34470Dfu.LIZ(this.LJLL)) {
            return true;
        }
        return false;
    }

    public final ITopLiveProductView l0() {
        View view;
        LinearLayout m0 = m0();
        if (m0 != null) {
            view = m0.getChildAt(0);
        } else {
            view = null;
        }
        if (!(view instanceof ITopLiveProductView)) {
            return null;
        }
        return (ITopLiveProductView) view;
    }

    public final JON n0() {
        if (C46314IFq.LIZIZ()) {
            return (JON) this.itemView.findViewById(R.id.k7p);
        }
        return null;
    }

    @Override // X.AbstractC48958JJi, X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return this.itemView;
    }

    @Override // X.AbstractC48958JJi
    public final InterfaceC48945JIv P() {
        return this.LLIIII;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        JLU.LJII(c0().getLiveCore());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        JLU.LJIIIIZZ(c0().getLiveCore());
    }

    public final void v0(J1M j1m) {
        JON n0;
        JYH jyh = JYH.LIZIZ;
        if (jyh.LJIIJ()) {
            J1C.LIZ = false;
            jyh.LIZLLL("general_search", j1m, J1O.STYLE_NO_BUTTON);
        }
        J1C.LIZJ(!J1C.LIZIZ() ? 1 : 0);
        JQA jqa = this.LLIIJLIL;
        if (jqa != null) {
            JII.LIZ(J1C.LIZIZ(), jqa, null);
            c0().getLiveCore().setMute(J1C.LIZ(C46314IFq.LIZIZ() ? 1 : 0, w0() ? 1 : 0, null));
            JHK jhk = EnumC48916JHs.Companion;
            J1C.LJ();
            int i = J1C.LIZIZ;
            jhk.getClass();
            EnumC48916JHs LIZ = JHK.LIZ(i);
            if (LIZ != null && (n0 = n0()) != null) {
                n0.LIZ(LIZ, false);
                return;
            }
            return;
        }
        o.LJIJI("itemMobParamWrapper");
        throw null;
    }

    @Override // X.AbstractC48958JJi, X.InterfaceC49148JQq
    public final void y(long j) {
        c0().getLiveCore().LLLJIL();
    }

    public final JYG X(Aweme aweme, JL9 jl9) {
        String str;
        JQA jqa;
        JQA jqa2;
        JQA jqa3;
        String str2 = null;
        JYG jyg = new JYG(this.LJLJL, null, null, null, null, null, null, 126, null);
        jyg.setImgCover(aweme.getAuthor().roomCover);
        jyg.setTitle(aweme.getAuthor().getRoomTitle());
        String title = jyg.getTitle();
        if (title == null || title.length() == 0) {
            jyg.setTitle(this.itemView.getContext().getResources().getString(R.string.mx3));
        }
        jyg.setMultipleChoices(C51757KSz.LIZLLL(jyg.getFeedbackType()));
        if (jl9 == null || (jqa3 = jl9.LIZIZ) == null || (str = jqa3.LJIJJLI) == null) {
            str = "";
        }
        OSZ[] oszArr = new OSZ[8];
        oszArr[0] = new OSZ("enter_from", "general_search");
        Integer num = null;
        if (jl9 != null && (jqa2 = jl9.LIZIZ) != null) {
            str2 = jqa2.LJIILJJIL;
        }
        oszArr[1] = new OSZ("search_result_id", String.valueOf(str2));
        oszArr[2] = new OSZ("token_type", str);
        oszArr[3] = new OSZ("is_aladdin", "1");
        if (jl9 != null && (jqa = jl9.LIZIZ) != null) {
            num = Integer.valueOf(jqa.LJIIL);
        }
        oszArr[4] = new OSZ("rank", String.valueOf(num));
        oszArr[5] = new OSZ("list_result_type", "live");
        User author = aweme.getAuthor();
        o.LJIIIIZZ(author, "aweme.author");
        oszArr[6] = new OSZ("list_item_id", String.valueOf(C78934UyQ.LJIILJJIL(author)));
        oszArr[7] = new OSZ("aladdin_rank", String.valueOf(getLayoutPosition()));
        jyg.setLogParams(C113554cx.LJJLIIIIJ(oszArr));
        return jyg;
    }

    public final void t0(String str, Aweme aweme, JQA jqa) {
        String str2;
        String str3;
        String str4;
        if (jqa == null) {
            return;
        }
        User author = aweme.getAuthor();
        SearchGlobalViewModel searchGlobalViewModel = this.LLIIIZ;
        Long l = null;
        if (searchGlobalViewModel != null) {
            str2 = searchGlobalViewModel.jv0();
        } else {
            str2 = null;
        }
        jqa.LIZ(str2);
        if (TextUtils.equals(str, "search_result_show")) {
            C49618Jde.LIZ(this.itemView, new ARunnableS12S0400000_8(jqa, author, this, aweme, 1));
            return;
        }
        if (TextUtils.equals(str, "search_result_click")) {
            JNB LIZ = JND.LIZ(jqa);
            LIZ.LJIJ("search_result_id", jqa.LJIILJJIL);
            LIZ.LJIIZILJ("token_type", jqa.LJIJJLI);
            if (author != null) {
                str3 = author.getRoomTitle();
            } else {
                str3 = null;
            }
            LIZ.LIZLLL("aladdin_words", str3);
            LIZ.LJJIII(Integer.valueOf(getLayoutPosition()));
            LIZ.LJIIZILJ("list_result_type", "live");
            if (author != null) {
                l = Long.valueOf(C78934UyQ.LJIILJJIL(author));
            }
            LIZ.LJIIZILJ("list_item_id", String.valueOf(l));
            if (this.LLIIIILZ) {
                str4 = U();
            } else {
                str4 = "";
            }
            LIZ.LJIIZILJ("anchor_info", str4);
            LIZ.LJIIZILJ("realtime_watch_user", String.valueOf(this.LLIIIJ));
            LIZ.LJIIZILJ("aladdin_button_type", "click_live");
            LIZ.LJJIIZ(aweme);
            LIZ.LJJIIZI(aweme);
            LIZ.LJIILIIL();
            return;
        }
        if (!TextUtils.equals(str, "livesdk_live_show")) {
            return;
        }
        C49618Jde.LIZ(this.itemView, new ARunnableS19S0300000_8(author, jqa, this, 4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JKG(View view, JIB jib, C49153JQv c49153JQv, JGU mPlayVideoObserver, View parent, int i, String str) {
        super(view, jib, c49153JQv, mPlayVideoObserver);
        C48935JIl dataProvider;
        o.LJIIIZ(mPlayVideoObserver, "mPlayVideoObserver");
        o.LJIIIZ(parent, "parent");
        this.LJLJLJ = c49153JQv;
        this.LJLJLLL = parent;
        this.LJLL = i;
        this.LJLLI = str;
        this.LJLLJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 509));
        this.LJLLL = C221108m2.LIZIZ(new AqS158S0100000_8(view, 507));
        this.LJLLLL = C221108m2.LIZIZ(new AqS158S0100000_8(view, 510));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS158S0100000_8(view, 511));
        this.LJLZ = C221108m2.LIZIZ(new AqS158S0100000_8(view, 508));
        this.LJZ = C221108m2.LIZIZ(new AqS158S0100000_8(view, 513));
        this.LJZI = C221108m2.LIZIZ(new AqS158S0100000_8(view, 514));
        this.LJZL = C221108m2.LIZIZ(new AqS158S0100000_8(view, 512));
        this.LL = C221108m2.LIZIZ(new AqS158S0100000_8(view, 515));
        this.LLD = C221108m2.LIZIZ(new AqS158S0100000_8(view, 516));
        this.LLF = C221108m2.LIZIZ(JJB.LJLIL);
        this.LLFF = C221108m2.LIZIZ(JJA.LJLIL);
        this.LLFFF = C221108m2.LIZIZ(new AqS155S0200000_8(view, this, 26));
        this.LLFII = C221108m2.LIZIZ(JJE.LJLIL);
        this.LLFZ = C221108m2.LIZIZ(new AqS155S0200000_8(view, this, 27));
        this.LLI = C221108m2.LIZIZ(JLA.LJLIL);
        this.LLIFFJFJJ = 1.78f;
        this.LLIIII = new C48943JIt(c0().getLiveCore());
        this.LLIIL = new C48957JJh(this);
        new AqS112S0300000_8(this, jib, mPlayVideoObserver, 4).invoke(new C48942JIs());
        c0().setMCoverView(N());
        view.addOnAttachStateChangeListener(new IDCListenerS245S0100000_8(this, 13));
        C48936JIm c0 = c0();
        if (c0 != null && (dataProvider = c0.getDataProvider()) != null) {
            dataProvider.LJIIJJI = new JKH(this);
        }
        ActivityC45651qj LIZ = C48966JJq.LIZ(view);
        this.LLIIIZ = LIZ != null ? (SearchGlobalViewModel) ViewModelProviders.of(LIZ).get(SearchGlobalViewModel.class) : null;
    }
}
