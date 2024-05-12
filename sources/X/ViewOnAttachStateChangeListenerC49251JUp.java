package X;

import Y.AObserverS76S0100000_8;
import Y.ARunnableS44S0100000_8;
import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextLayoutView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.autoplay.core.viewmodel.Taco;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopClickSearchHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.topfeed.TopVideoHolderVM;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.JUp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnAttachStateChangeListenerC49251JUp extends RecyclerView.ViewHolder implements View.OnAttachStateChangeListener, InterfaceC49280JVs, JP7, JW1, JQX, InterfaceC49224JTo {
    public static final float LLJJL = C32151Nz.LJIIZILJ(3);
    public final /* synthetic */ JU7 LJLIL;
    public final Context LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public String LJLJJLL;
    public View LJLJL;
    public C57128MbU LJLJLJ;
    public C53873LCj LJLJLLL;
    public TextView LJLL;
    public TextView LJLLI;
    public TextView LJLLILLLL;
    public JVU LJLLJ;
    public JVU LJLLL;
    public TuxTextLayoutView LJLLLL;
    public ConstraintLayout LJLLLLLL;
    public C164086cG LJLZ;
    public C48887JGp LJZ;
    public TuxTextView LJZI;
    public ProgressBar LJZL;
    public JOM LL;
    public JON LLD;
    public JON LLF;
    public TuxTextView LLFF;
    public TuxTextView LLFFF;
    public TuxTextView LLFII;
    public View LLFZ;
    public View LLI;
    public View LLIFFJFJJ;
    public ViewGroup LLII;
    public ViewGroup LLIIII;
    public ViewGroup LLIIIILZ;
    public ViewStub LLIIIJ;
    public JVE LLIIIL;
    public ViewStub LLIIIZ;
    public TopClickSearchHolder LLIIJI;
    public View LLIIJLIL;
    public JV4 LLIIL;
    public JIB LLIILII;
    public InterfaceC48970JJu LLIILZL;
    public ClickSearchViewModel LLIIZ;
    public final C62822Ol8 LLIL;
    public final C62822Ol8 LLILII;
    public final C62822Ol8 LLILIL;
    public final C62822Ol8 LLILL;
    public final C62822Ol8 LLILLIZIL;
    public final C62822Ol8 LLILLJJLI;
    public Integer LLILLL;
    public JQA LLILZ;
    public LD1 LLILZIL;
    public Aweme LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public final AObserverS76S0100000_8 LLJI;
    public final AObserverS76S0100000_8 LLJIJIL;
    public final AObserverS76S0100000_8 LLJILJIL;
    public final AObserverS76S0100000_8 LLJILJILJ;
    public final AObserverS76S0100000_8 LLJILLL;
    public JV3 LLJJ;
    public final C62822Ol8 LLJJI;
    public final C62822Ol8 LLJJIII;
    public final C49256JUu LLJJIJI;
    public final AObserverS76S0100000_8 LLJJIJIIJIL;
    public final AObserverS76S0100000_8 LLJJIJIL;
    public final C62822Ol8 LLJJJ;
    public final C62822Ol8 LLJJJIL;
    public final C62822Ol8 LLJJJJ;
    public final C62822Ol8 LLJJJJJIL;
    public final AqS190S0100000_8 LLJJJJLIIL;

    @Override // X.JP7
    public final int LIZ() {
        return 1;
    }

    @Override // X.InterfaceC48907JHj
    public final void LJIILL() {
    }

    @Override // X.JQX
    public final C49128JPw LJJLJ() {
        return null;
    }

    @Override // X.JP7
    public final SearchResultParam LJLJLLL() {
        return null;
    }

    @Override // X.JP7
    public final int LJLL() {
        return -1;
    }

    @Override // X.JP7
    public final int LJLLI() {
        return -1;
    }

    @Override // X.JP7
    public final Aweme LJLLILLLL(int i, String str) {
        return null;
    }

    @Override // X.JQX
    public final void LJLLLL() {
    }

    @Override // X.InterfaceC49148JQq
    public final Boolean LLFFF() {
        return null;
    }

    @Override // X.JP7
    public final boolean LLFZ() {
        return false;
    }

    @Override // X.JP7
    public final void LLIIL() {
    }

    @Override // X.JP7
    public final void LLJIJIL() {
    }

    @Override // X.JQX
    public final JP7 LLLLIIL() {
        return this;
    }

    @Override // X.JP7
    public final boolean LLLLILI() {
        return false;
    }

    @Override // X.JQX
    public final boolean LLZL() {
        return true;
    }

    @Override // X.InterfaceC48907JHj
    public final void g9() {
    }

    @Override // X.JQX
    public final InterfaceC48907JHj getPlayerView() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC46334IGk getPreload() {
        return null;
    }

    @Override // X.InterfaceC49148JQq
    public final InterfaceC49137JQf getPriority() {
        return null;
    }

    @Override // X.InterfaceC48907JHj
    public final void pause() {
    }

    @Override // X.InterfaceC48907JHj
    public final void play() {
    }

    @Override // X.JP7
    public final View LJIIIIZZ() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        ConstraintLayout constraintLayout = this.LJLLLLLL;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        o.LJIJI("videoMediaGroup");
        throw null;
    }

    @Override // X.InterfaceC49280JVs
    public final JQA LJLJL() {
        JQA jqa = this.LLILZ;
        if (jqa == null) {
            return new JQA();
        }
        return jqa;
    }

    @Override // X.JQX, X.InterfaceC49148JQq
    public final boolean LLIIII() {
        if (!C46446IKs.LJLJLJ) {
            return true;
        }
        return !this.LLJ;
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLJIL() {
        Aweme aweme;
        String desc;
        String LIZIZ;
        Aweme aweme2 = this.LLILZLL;
        if ((aweme2 == null || (desc = aweme2.getDesc()) == null || (LIZIZ = C51102K3u.LIZIZ(0, 20, desc)) == null || LIZIZ.length() <= 0) && (aweme = this.LLILZLL) != null) {
            aweme.getDesc();
        }
        C48887JGp c48887JGp = this.LJZ;
        if (c48887JGp != null) {
            JGI core = c48887JGp.getCore();
            if (core != null) {
                JIC.LIZ(core);
                return;
            }
            return;
        }
        o.LJIJI("videoView");
        throw null;
    }

    @Override // X.InterfaceC49224JTo
    public final void LLLLLILLIL() {
        this.LJLIL.LJLIL = null;
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        Aweme aweme;
        String desc;
        String LIZIZ;
        Aweme aweme2 = this.LLILZLL;
        if ((aweme2 == null || (desc = aweme2.getDesc()) == null || (LIZIZ = C51102K3u.LIZIZ(0, 20, desc)) == null || LIZIZ.length() <= 0) && (aweme = this.LLILZLL) != null) {
            aweme.getDesc();
        }
        C48887JGp c48887JGp = this.LJZ;
        if (c48887JGp != null) {
            JGI core = c48887JGp.getCore();
            if (core != null) {
                core.LLLLLJLJLL();
                return;
            }
            return;
        }
        o.LJIJI("videoView");
        throw null;
    }

    public final void M() {
        User author;
        String str;
        User author2;
        C35719E0d value;
        Integer num;
        Integer num2;
        int i;
        Integer valueOf;
        Aweme aweme = this.LLILZLL;
        if (aweme == null || (author = aweme.getAuthor()) == null) {
            return;
        }
        Context context = this.LJLILLLLZI;
        o.LJIIIIZZ(context, "context");
        new C61996OUu(context).LIZ(1);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("relation_tag", String.valueOf(C45804HyK.LJJIIJ(author)));
        String uid = author.getUid();
        o.LJIIIIZZ(uid, "user.uid");
        linkedHashMap.put("author_id", uid);
        JQA LJLJL = LJLJL();
        C220488l2 c220488l2 = C220488l2.LIZIZ;
        C188577af c188577af = new C188577af();
        c188577af.LIZLLL = LJLJL.LJFF;
        Aweme aweme2 = this.LLILZLL;
        if (aweme2 != null) {
            str = aweme2.getAid();
        } else {
            str = null;
        }
        c188577af.LJJLIIIJILLIZJL = str;
        c188577af.LJJLIIIJ = author.getUid();
        c188577af.LJJIL = LJLJL.LJII;
        c188577af.LIZ(linkedHashMap);
        Object LJII = c220488l2.LJII(this.LLILZLL, c188577af);
        C222578oP.LIZJ(LJII, this.LLILZLL, null, null, 14);
        ((JHM) LJII).LJIILIIL();
        JV3 jv3 = this.LLJJ;
        if (jv3 != null) {
            jv3.LJJIIZ();
        }
        TopVideoHolderVM Q = Q();
        Aweme aweme3 = Q.LJLZ;
        if (aweme3 == null || (author2 = aweme3.getAuthor()) == null || (value = Q.LJLJI.getValue()) == null || (num = value.LIZIZ) == null) {
            return;
        }
        if (num.intValue() == 1) {
            num2 = 1;
            i = 2;
            valueOf = Integer.valueOf(R.string.gkd);
        } else {
            if (num.intValue() != 3) {
                return;
            }
            num2 = 2;
            i = 4;
            valueOf = Integer.valueOf(R.string.exk);
        }
        if (num2 == null || i == null || valueOf == null) {
            return;
        }
        author2.setFollowStatus(num2.intValue());
        Q.LJLJI.postValue(new C35719E0d(valueOf, i, false));
        SearchGlobalViewModel searchGlobalViewModel = Q.LJLLLLLL;
        if (searchGlobalViewModel != null) {
            String uid2 = author2.getUid();
            o.LJIIIIZZ(uid2, "user.uid");
            searchGlobalViewModel.pv0(num2.intValue(), uid2);
            XKX.LIZLLL(ViewModelKt.getViewModelScope(Q), C78613UtF.LIZJ, null, new C67752lH(author2, Q, null), 2);
            return;
        }
        o.LJIJI("searchGlobalVM");
        throw null;
    }

    public final SearchGlobalViewModel P() {
        return (SearchGlobalViewModel) this.LLIL.getValue();
    }

    public final TopVideoHolderVM Q() {
        return (TopVideoHolderVM) this.LLILII.getValue();
    }

    public final int T() {
        return ((Number) this.LJLJJL.getValue()).intValue();
    }

    public final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJLJI.getValue();
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        C48887JGp c48887JGp = this.LJZ;
        if (c48887JGp != null) {
            JGI core = c48887JGp.getCore();
            if (core == null || !core.isPlaying()) {
                return false;
            }
            return true;
        }
        o.LJIJI("videoView");
        throw null;
    }

    @Override // X.JP7
    public final int LLJJJ() {
        return getBindingAdapterPosition();
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return C48984JKi.LIZIZ(this);
    }

    @Override // X.JP7
    public final boolean LIZLLL() {
        return this.LLIZLLLIL;
    }

    @Override // X.JP7
    public final Integer LLILLL() {
        return this.LLILLL;
    }

    @Override // X.JP7
    public final boolean LLIZLLLIL() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        C48905JHh.LIZIZ(this);
    }

    @Override // X.InterfaceC48907JHj
    public final void contextPause() {
        LLLLLJLJLL();
    }

    @Override // X.JP7
    public final Aweme getCurrentAweme() {
        return this.LLILZLL;
    }

    public ViewOnAttachStateChangeListenerC49251JUp(View view) {
        super(view);
        this.LJLIL = new JU7();
        this.LJLILLLLZI = view.getContext();
        this.LJLJI = C221108m2.LIZIZ(new AqS158S0100000_8(view, 615));
        this.LJLJJI = C221108m2.LIZIZ(new AqS158S0100000_8(this, 620));
        this.LJLJJL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 619));
        this.LLIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 617));
        this.LLILII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 618));
        this.LLILIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 623));
        this.LLILL = C221108m2.LIZIZ(C49259JUx.INSTANCE);
        this.LLILLIZIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 614));
        this.LLILLJJLI = C221108m2.LIZIZ(C49278JVq.LJLIL);
        this.LLJI = new AObserverS76S0100000_8(this, 117);
        this.LLJIJIL = new AObserverS76S0100000_8(this, 114);
        this.LLJILJIL = new AObserverS76S0100000_8(this, 113);
        this.LLJILJILJ = new AObserverS76S0100000_8(this, 116);
        this.LLJILLL = new AObserverS76S0100000_8(this, 118);
        this.LLJJI = C221108m2.LIZIZ(C49261JUz.LJLIL);
        this.LLJJIII = C221108m2.LIZIZ(new AqS158S0100000_8(this, 621));
        this.LLJJIJI = new C49256JUu(this);
        this.LLJJIJIIJIL = new AObserverS76S0100000_8(this, 115);
        this.LLJJIJIL = new AObserverS76S0100000_8(this, 112);
        this.LLJJJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 624));
        this.LLJJJIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 625));
        this.LLJJJJ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 622));
        this.LLJJJJJIL = C221108m2.LIZIZ(new AqS158S0100000_8(this, 616));
        this.LLJJJJLIIL = new AqS190S0100000_8(this, 66);
    }

    @Override // X.JP7
    public final void LJLZ(int i) {
        this.LLILLL = Integer.valueOf(i);
    }

    @Override // X.JW1
    public final void LJZ(String str) {
        this.LJLJJLL = str;
    }

    @Override // X.InterfaceC49224JTo
    public final void LLIIJI(JU3 eventDispatcher) {
        o.LJIIIZ(eventDispatcher, "eventDispatcher");
        JU7 ju7 = this.LJLIL;
        ju7.getClass();
        ju7.LJLIL = eventDispatcher;
    }

    @Override // X.JP7
    public final void LLLIIL(MotionEvent event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.InterfaceC49280JVs
    public final void LLLLIIIILLL(JQA jqa) {
        String str;
        C49258JUw provider = C49258JUw.LJLIL;
        o.LJIIIZ(provider, "provider");
        jqa.LJJIIZ = provider;
        Aweme aweme = this.LLILZLL;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        jqa.LJIILJJIL = str;
        this.LLILZ = jqa;
        C48887JGp c48887JGp = this.LJZ;
        if (c48887JGp != null) {
            C48881JGj dataProvider = c48887JGp.getDataProvider();
            if (dataProvider == null) {
                return;
            }
            dataProvider.LJIJJLI = jqa;
            return;
        }
        o.LJIJI("videoView");
        throw null;
    }

    public final void V(J1M j1m) {
        JON jon;
        JYH jyh = JYH.LIZIZ;
        if (jyh.LJIIJ()) {
            J1C.LIZ = false;
            jyh.LIZLLL("general_search", j1m, J1O.STYLE_NO_BUTTON);
        }
        J1C.LIZJ(!J1C.LIZIZ() ? 1 : 0);
        JII.LIZ(J1C.LIZIZ(), LJLJL(), null);
        C48887JGp c48887JGp = this.LJZ;
        if (c48887JGp != null) {
            JGI core = c48887JGp.getCore();
            if (core != null) {
                core.setMute(J1C.LIZ(C46314IFq.LIZIZ() ? 1 : 0, 0, this.LLILZLL));
            }
            JHK jhk = EnumC48916JHs.Companion;
            J1C.LJ();
            int i = J1C.LIZIZ;
            jhk.getClass();
            EnumC48916JHs LIZ = JHK.LIZ(i);
            if (LIZ != null && (jon = this.LLD) != null) {
                jon.LIZ(LIZ, false);
                return;
            }
            return;
        }
        o.LJIJI("videoView");
        throw null;
    }

    public final void X(JOK jok) {
        JV4 jv4;
        int i = JOI.LIZ[jok.ordinal()];
        if (i != 1) {
            if (i == 2 && (jv4 = this.LLIIL) != null) {
                jv4.LIZ(this);
            }
        } else {
            JV4 jv42 = this.LLIIL;
            if (jv42 != null) {
                jv42.LIZIZ(this);
            }
        }
        JOM jom = this.LL;
        if (jom != null) {
            jom.setState(jok);
        } else {
            o.LJIJI("playerStateIcon");
            throw null;
        }
    }

    public final void Y(JOG jog) {
        EnumC48916JHs enumC48916JHs;
        String string;
        String string2;
        String string3;
        C49255JUt c49255JUt = jog.LJLJJI;
        if (c49255JUt.LIZIZ) {
            enumC48916JHs = EnumC48916JHs.ON;
        } else {
            enumC48916JHs = EnumC48916JHs.OFF;
        }
        JON jon = this.LLF;
        if (jon != null) {
            jon.LIZ(enumC48916JHs, jog.LJLJJLL);
            TuxTextView tuxTextView = this.LLFF;
            if (tuxTextView != null) {
                Long valueOf = Long.valueOf(c49255JUt.LIZ);
                if (valueOf.longValue() <= 0 || (string = C77123UOp.LJJIIJ(valueOf.longValue())) == null) {
                    string = this.LJLILLLLZI.getString(R.string.a63);
                }
                tuxTextView.setText(string);
                TuxTextView tuxTextView2 = this.LLFFF;
                if (tuxTextView2 != null) {
                    Long valueOf2 = Long.valueOf(c49255JUt.LIZJ);
                    if (valueOf2.longValue() <= 0 || (string2 = C77123UOp.LJJIIJ(valueOf2.longValue())) == null) {
                        string2 = this.LJLILLLLZI.getString(R.string.dib);
                    }
                    tuxTextView2.setText(string2);
                    TuxTextView tuxTextView3 = this.LLFII;
                    if (tuxTextView3 != null) {
                        Long valueOf3 = Long.valueOf(c49255JUt.LIZLLL);
                        if (valueOf3.longValue() <= 0 || (string3 = C77123UOp.LJJIIJ(valueOf3.longValue())) == null) {
                            string3 = this.LJLILLLLZI.getString(R.string.r2s);
                        }
                        tuxTextView3.setText(string3);
                        return;
                    }
                    o.LJIJI("shareCountText");
                    throw null;
                }
                o.LJIJI("commentCountText");
                throw null;
            }
            o.LJIJI("likeCountText");
            throw null;
        }
        o.LJIJI("likeIcon");
        throw null;
    }

    @Override // X.JQX
    public final void f(C49128JPw info) {
        o.LJIIIZ(info, "info");
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onFavoriteVideoEvent(C193087hw event) {
        String str;
        o.LJIIIZ(event, "event");
        String str2 = event.LJLIL;
        Aweme aweme = this.LLILZLL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(str2, str) && event.LJLILLLLZI == 1) {
            C26045AKb c26045AKb = new C26045AKb(getActivity());
            c26045AKb.LJIIIIZZ(R.string.bgf);
            c26045AKb.LJIIJ();
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onShareToDmEvent(C107794Kx event) {
        String str;
        IMContact iMContact;
        String string;
        o.LJIIIZ(event, "event");
        String str2 = event.LJLJL;
        Aweme aweme = this.LLILZLL;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (!o.LJ(str2, str)) {
            return;
        }
        List<IMContact> list = event.LJLILLLLZI;
        if (list == null || (iMContact = (IMContact) ORZ.LJLLLL(list)) == null) {
            iMContact = event.LJLIL;
        }
        if (event.LJLJI) {
            string = getActivity().getString(R.string.h0o, iMContact.getDisplayName());
        } else if (event.LJLJLJ) {
            string = getActivity().getString(R.string.gvm);
        } else {
            string = getActivity().getString(R.string.h0n, iMContact.getDisplayName());
        }
        o.LJIIIIZZ(string, "when {\n            event…ct.displayName)\n        }");
        C26045AKb c26045AKb = new C26045AKb(getActivity());
        c26045AKb.LJIIIZ(string);
        c26045AKb.LJIIJ();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        C34X c34x;
        o.LJIIIZ(v, "v");
        this.LLIZLLLIL = true;
        this.LLJ = false;
        boolean z = C46446IKs.LJLJLJ;
        if (!z) {
            JLU.LJII(this);
        }
        C1JD.LJJJIL(EventBus.LIZJ(), this);
        JV3 jv3 = this.LLJJ;
        if (jv3 != null) {
            jv3.LJIILIIL();
        }
        if (z) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            Taco LIZ = C49218JTi.LIZ(itemView, false);
            if (LIZ != null) {
                Taco.LIZIZ(LIZ, this);
            }
        }
        InterfaceC36571c5 activity = getActivity();
        if ((activity instanceof C34X) && (c34x = (C34X) activity) != null) {
            c34x.registerActivityOnKeyDownListener(this.LLJJIJI);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        C34X c34x;
        o.LJIIIZ(v, "v");
        this.LLIZ = false;
        this.LLJ = false;
        boolean z = C46446IKs.LJLJLJ;
        if (!z) {
            JLU.LJIIIIZZ(this);
        }
        C1JD.LJJJJ(EventBus.LIZJ(), this);
        LLLLLJLJLL();
        JV3 jv3 = this.LLJJ;
        if (jv3 != null) {
            jv3.LJIIIZ();
        }
        if (z) {
            View itemView = this.itemView;
            o.LJIIIIZZ(itemView, "itemView");
            Taco LIZ = C49218JTi.LIZ(itemView, false);
            if (LIZ != null) {
                int hashCode = hashCode();
                InterfaceC49224JTo interfaceC49224JTo = LIZ.LJI().get(hashCode);
                if (interfaceC49224JTo != null) {
                    interfaceC49224JTo.LLLLLILLIL();
                }
                LIZ.LJI().remove(hashCode);
            }
        }
        InterfaceC36571c5 activity = getActivity();
        if ((activity instanceof C34X) && (c34x = (C34X) activity) != null) {
            c34x.unRegisterActivityOnKeyDownListener(this.LLJJIJI);
        }
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd c49187JSd) {
        C48984JKi.LIZ(this, c49187JSd);
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        C48905JHh.LIZJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd c49187JSd) {
        C48984JKi.LIZJ(this, c49187JSd);
    }

    public static void U(ViewOnAttachStateChangeListenerC49251JUp viewOnAttachStateChangeListenerC49251JUp, InterfaceC65784Pro interfaceC65784Pro) {
        ((Handler) viewOnAttachStateChangeListenerC49251JUp.LLILL.getValue()).removeCallbacksAndMessages(null);
        ((Handler) viewOnAttachStateChangeListenerC49251JUp.LLILL.getValue()).postDelayed(new ARunnableS44S0100000_8(interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) 159), 100L);
    }

    public final void N(User user, String str) {
        String str2;
        if (user != null) {
            String uid = user.getUid();
            o.LJIIIIZZ(uid, "it.uid");
            if (uid.length() > 0 && C78857UxB.LJJJIL(user.getSecUid())) {
                String str3 = null;
                if (1 != 0) {
                    JQA LJLJL = LJLJL();
                    C50654JuM c50654JuM = C50653JuL.LJLILLLLZI;
                    OSZ[] oszArr = new OSZ[2];
                    String uid2 = user.getUid();
                    if (uid2 == null) {
                        uid2 = "";
                    }
                    oszArr[0] = new OSZ("search_result_id", uid2);
                    oszArr[1] = new OSZ("search_id", LJLJL.LJII);
                    java.util.Map LJJL = C113554cx.LJJL(oszArr);
                    c50654JuM.getClass();
                    C50654JuM.LIZJ(LJJL, false);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("enter_position", "video_card");
                    String uuid = UUID.randomUUID().toString();
                    o.LJIIIIZZ(uuid, "randomUUID().toString()");
                    linkedHashMap.put("process_id", uuid);
                    C220488l2 c220488l2 = C220488l2.LIZIZ;
                    C7ZV c7zv = new C7ZV();
                    String str4 = LJLJL.LJII;
                    c7zv.LJJIIJZLJL = str4;
                    c7zv.LIZLLL = LJLJL.LJFF;
                    c7zv.LJJLI = str;
                    c7zv.LJJL = LJLJL.LJ;
                    c7zv.LJJIL = str4;
                    Aweme aweme = this.LLILZLL;
                    if (aweme != null) {
                        str2 = aweme.getAid();
                    } else {
                        str2 = null;
                    }
                    c7zv.LJJIFFI = str2;
                    String rank = String.valueOf(getBindingAdapterPosition());
                    o.LJIIIZ(rank, "rank");
                    c7zv.LJIIIZ = rank;
                    c7zv.LJLILLLLZI = C45804HyK.LJJIIJ(user);
                    c7zv.LJJLIIIJJIZ = user.getUid();
                    c7zv.LJLJJI = C79146V4k.LJJIJIL(user);
                    c7zv.LJJLIIIIJ = 0;
                    c7zv.LIZ(linkedHashMap);
                    Object LJII = c220488l2.LJII(this.LLILZLL, c7zv);
                    C222578oP.LIZJ(LJII, this.LLILZLL, null, null, 14);
                    ((JHM) LJII).LJIILIIL();
                    TopVideoHolderVM Q = Q();
                    Context context = this.LJLILLLLZI;
                    o.LJIIIIZZ(context, "context");
                    Aweme aweme2 = this.LLILZLL;
                    if (aweme2 != null) {
                        str3 = aweme2.getAid();
                    }
                    Q.getClass();
                    TopVideoHolderVM.hv0(context, user, str3);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0322  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed r28, boolean r29, boolean r30) {
        /*
            Method dump skipped, instructions count: 1078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnAttachStateChangeListenerC49251JUp.L(com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed, boolean, boolean):void");
    }
}
