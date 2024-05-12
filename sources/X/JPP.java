package X;

import Y.ACListenerS28S0100000_8;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdMainService;
import com.bytedance.ies.ugc.aweme.commercialize.search.setting.CommerceSearchAdConfigSetting;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.commercialize.measurement.MeasurementServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.precisead.core.model.SearchPreciseAd;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS155S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS68S0400000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JPP extends JPO implements JQX, JP7, JSO {
    public static final /* synthetic */ int LJZI = 0;
    public final ViewGroup LJLJLLL;
    public Integer LJLL;
    public boolean LJLLI;
    public final JPS LJLLILLLL;
    public InterfaceC55057LjB LJLLJ;
    public final NIW LJLLL;
    public final NIP LJLLLL;
    public IVK LJLLLLLL;
    public JPL LJLZ;
    public final C62822Ol8 LJZ;

    @Override // X.JP7
    public final int LIZ() {
        return 555;
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
    public final Aweme LJLLILLLL(int i, String str) {
        return null;
    }

    @Override // X.JQX
    public final void LJLLLL() {
    }

    @Override // X.JP7
    public final boolean LLFZ() {
        return false;
    }

    @Override // X.InterfaceC49148JQq
    public final boolean LLIIII() {
        return true;
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

    @Override // X.JSO
    public final boolean LLLLLLL() {
        return true;
    }

    @Override // X.JQX
    public final boolean LLZL() {
        return true;
    }

    @Override // X.JP7
    public final Aweme getCurrentAweme() {
        return null;
    }

    @Override // X.JQX
    public final InterfaceC48907JHj getPlayerView() {
        return null;
    }

    @Override // X.JSO
    public final int q() {
        return 22;
    }

    @Override // X.JP7
    public final int LJLLI() {
        if (this.itemView.getLayoutParams() instanceof C1BU) {
            ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
            return ((C1BU) layoutParams).LJLIL;
        }
        return -1;
    }

    public final JPH T() {
        return (JPH) this.LJZ.getValue();
    }

    @Override // X.JSO
    public final View a() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    @Override // X.JSO
    public final JSL h() {
        return new C49149JQr();
    }

    @Override // X.JP7
    public final int LJLL() {
        return getAdapterPosition();
    }

    @Override // X.JP7
    public final int LLJJJ() {
        return getAdapterPosition();
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return C48984JKi.LIZIZ(this);
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        return T().isPlaying();
    }

    @Override // X.JP7
    public final boolean LIZLLL() {
        return this.LJLJI;
    }

    @Override // X.JP7
    public final View LJIIIIZZ() {
        return this.LJLJLLL;
    }

    @Override // X.JP7
    public final Integer LLILLL() {
        return this.LJLL;
    }

    @Override // X.JP7
    public final boolean LLIZLLLIL() {
        return this.LJLLI;
    }

    @Override // X.JPO, X.InterfaceC49148JQq
    public final void LLLLLIL() {
        JSM.LIZLLL(this);
    }

    @Override // X.JP7
    public final void LJLZ(int i) {
        this.LJLL = Integer.valueOf(i);
    }

    @Override // X.JP7
    public final void LLLIIL(MotionEvent event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.JQX
    public final void f(C49128JPw info) {
        o.LJIIIZ(info, "info");
    }

    @Override // X.JPO, X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        super.onViewAttachedToWindow(v);
        if (C46278IEg.LIZ()) {
            JPL jpl = this.LJLZ;
            if (jpl != null) {
                jpl.onViewAttachedToWindow();
                return;
            }
            return;
        }
        List<? extends Aweme> list = T().LJLJLJ;
        Aweme aweme = null;
        if (list == null || !(!list.isEmpty())) {
            list = null;
        }
        List<? extends Aweme> list2 = T().LJLJLJ;
        if (list2 != null) {
            aweme = (Aweme) ORZ.LJLLLLLL(0, list2);
        }
        if (list != null && aweme != null) {
            if (!JHI.LIZ().LJIIJ || !this.LJLLLL.LJIJJ(aweme)) {
                this.LJLLL.LJIJJLI(aweme.getAwemeRawAd(), LJLJL().LJFF, C59406NTe.LJI(aweme));
            } else {
                JHI.LIZ().LJIIJ = false;
            }
            if (this.itemView != null && C46279IEh.LIZ()) {
                Context context = getContext();
                View view = this.itemView;
                if (view != null) {
                    IVK ivk = this.LJLLLLLL;
                    if (ivk != null) {
                        ivk.LJIJ(context, aweme);
                    }
                    IVK ivk2 = this.LJLLLLLL;
                    if (ivk2 != null) {
                        ivk2.LJFF(context, view, aweme);
                    }
                }
            }
        }
        if (!CommerceSearchAdConfigSetting.LIZ().disableFpsMonitorForSearchAd) {
            if (this.LJLLJ == null) {
                try {
                    this.LJLLJ = C40443Fu3.LIZ("search_precise_ad");
                } catch (Exception unused) {
                }
            }
            InterfaceC55057LjB interfaceC55057LjB = this.LJLLJ;
            if (interfaceC55057LjB != null) {
                interfaceC55057LjB.start();
            }
        }
    }

    @Override // X.JPO, X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        Aweme aweme;
        IVK ivk;
        o.LJIIIZ(v, "v");
        super.onViewDetachedFromWindow(v);
        this.LJLLI = false;
        if (C46278IEg.LIZ()) {
            JPL jpl = this.LJLZ;
            if (jpl != null) {
                jpl.onViewDetachedFromWindow();
                return;
            }
            return;
        }
        List<? extends Aweme> list = T().LJLJLJ;
        if (list == null || (aweme = (Aweme) ORZ.LJLLLLLL(0, list)) == null) {
            return;
        }
        if (this.itemView != null && C46279IEh.LIZ()) {
            Context context = getContext();
            if (this.itemView != null && (ivk = this.LJLLLLLL) != null) {
                ivk.LIZLLL(context, aweme);
            }
        }
        InterfaceC55057LjB interfaceC55057LjB = this.LJLLJ;
        if (interfaceC55057LjB != null) {
            interfaceC55057LjB.stop();
        }
        NIW niw = this.LJLLL;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        int i = JHI.LIZ().LJ + 1;
        Long l = JHI.LIZ().LJIIL;
        o.LJIIIIZZ(l, "inst().breakDuration");
        niw.LJJIIZ(awemeRawAd, i, l.longValue(), aweme.getVideo().getDuration(), C59406NTe.LJI(aweme));
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd c49187JSd) {
        C48984JKi.LIZ(this, c49187JSd);
    }

    @Override // X.JPO, X.InterfaceC49148JQq
    public final void y(long j) {
        JSM.LJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd c49187JSd) {
        C48984JKi.LIZJ(this, c49187JSd);
    }

    @Override // X.JSO
    public final void LJIJJLI(Aweme aweme, C49196JSm c49196JSm) {
        JSM.LIZIZ(this, aweme, c49196JSm);
    }

    public final void Q(JQA jqa, SearchMixFeed searchMixFeed) {
        List<Aweme> awemeCards;
        Aweme aweme;
        String nickname;
        Aweme aweme2;
        N6C n6c;
        SearchPreciseAd preciseAd = searchMixFeed.preciseAd;
        JPS jps = this.LJLLILLLL;
        jps.getClass();
        SearchPreciseAd searchPreciseAd = searchMixFeed.preciseAd;
        if (searchPreciseAd != null && (awemeCards = searchPreciseAd.getAwemeCards()) != null && (aweme = (Aweme) ListProtector.get(awemeCards, 0)) != null) {
            User author = aweme.getAuthor();
            if (author != null) {
                Object value = jps.LIZLLL.getValue();
                o.LJIIIIZZ(value, "<get-authorName>(...)");
                TextView textView = (TextView) value;
                if (AV1.LJIJJLI(author)) {
                    nickname = author.getUniqueId();
                } else {
                    nickname = author.getNickname();
                }
                textView.setText(nickname);
                if (C78857UxB.LJJJIL(author.getCustomVerify())) {
                    Object value2 = jps.LJ.getValue();
                    o.LJIIIIZZ(value2, "<get-authorVerifiedBadge>(...)");
                    ((ImageView) value2).setVisibility(0);
                } else {
                    Object value3 = jps.LJ.getValue();
                    o.LJIIIIZZ(value3, "<get-authorVerifiedBadge>(...)");
                    ((ImageView) value3).setVisibility(8);
                }
                W5F LJI = C1JX.LJI(author);
                LJI.LJIILIIL(J7H.LIZ(100));
                LJI.LIZIZ("AbsCellViewHolder");
                Object value4 = jps.LIZJ.getValue();
                o.LJIIIIZZ(value4, "<get-authorAvatar>(...)");
                LJI.LJJIIJ = (SmartImageView) value4;
                LJI.LJ();
            }
            C16880lQ.LJIIJ(new ACListenerS28S0100000_8(jps, 65), jps.LIZIZ);
        }
        IVK ivk = null;
        if (C46278IEg.LIZ()) {
            InterfaceC49504Jbo LIZIZ = C58784N5g.LIZIZ.LIZIZ();
            if (LIZIZ != null) {
                n6c = LIZIZ.LIZ(new JPR(this, preciseAd));
            } else {
                n6c = null;
            }
            this.LJLZ = n6c;
        }
        JPH T = T();
        o.LJIIIIZZ(preciseAd, "preciseAd");
        JPL jpl = this.LJLZ;
        T.getClass();
        List<Aweme> awemeCards2 = preciseAd.getAwemeCards();
        if (awemeCards2 == null) {
            awemeCards2 = C61878OQg.INSTANCE;
        }
        T.LJIILJJIL(awemeCards2);
        List<? extends Aweme> list = T.LJLJLJ;
        o.LJI(list);
        T.LJII(list, T.LJIILLIIL());
        JK5 LJIILLIIL = T.LJIILLIIL();
        LJIILLIIL.getClass();
        LJIILLIIL.LJLL = jqa;
        T.LJIILLIIL().getClass();
        JK5 LJIILLIIL2 = T.LJIILLIIL();
        List<? extends Aweme> list2 = T.LJLJLJ;
        o.LJI(list2);
        LJIILLIIL2.getClass();
        LJIILLIIL2.LJLLJ = list2;
        LJIILLIIL2.notifyDataSetChanged();
        JLZ<Aweme> jlz = LJIILLIIL2.LJLLILLLL;
        C49106JPa awemeGeter = C49106JPa.LJLIL;
        jlz.getClass();
        o.LJIIIZ(awemeGeter, "awemeGeter");
        ((LinkedHashMap) jlz.LIZIZ).clear();
        int i = 0;
        for (Aweme aweme3 : list2) {
            int i2 = i + 1;
            if (i >= 0) {
                Aweme aweme4 = aweme3;
                if (aweme4 != null) {
                    java.util.Map<String, OSZ<Integer, Aweme>> map = jlz.LIZIZ;
                    String aid = aweme4.getAid();
                    o.LJIIIIZZ(aid, "it.aid");
                    map.put(aid, new OSZ<>(Integer.valueOf(i), aweme4));
                    Object value5 = jlz.LIZJ.getValue();
                    o.LJIIIIZZ(value5, "<get-mAwemeManager>(...)");
                    ((IAwemeService) value5).R1(aweme4);
                }
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        T.LJIILLIIL().LJLLI = jpl;
        this.LJLLI = true;
        List<? extends Aweme> list3 = T().LJLJLJ;
        if (list3 != null) {
            aweme2 = (Aweme) ORZ.LJLLLLLL(0, list3);
        } else {
            aweme2 = null;
        }
        if (C46279IEh.LIZ()) {
            getContext();
            if (aweme2 != null) {
                NIT LIZ = MeasurementServiceImpl.LJ().LIZ();
                if ((LIZ instanceof IVK) && (ivk = (IVK) LIZ) != null) {
                    ivk.LJIILJJIL();
                    ivk.LJIJI(IWD.LJLIL);
                    ivk.setTracker(C59080NGq.LJLIL);
                    View view = this.itemView;
                    if (view != null) {
                        ivk.LJIIIZ(view, aweme2);
                    }
                }
            }
            this.LJLLLLLL = ivk;
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        JSM.LIZJ(itemView, this);
        JVD.LIZ(itemView, new AqS155S0200000_8(itemView, this, 36));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JPP(View itemView, JIB containerStatusProvider, JGU jgu) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(containerStatusProvider, "containerStatusProvider");
        View findViewById = itemView.findViewById(R.id.je8);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.…rch_aweme_card_container)");
        this.LJLJLLL = (ViewGroup) findViewById;
        View findViewById2 = itemView.findViewById(R.id.e4j);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.header_stub)");
        this.LJLLILLLL = new JPS((ViewStub) findViewById2, new AqS158S0100000_8(this, 569));
        this.LJLLL = SearchAdMainService.LJIIJJI().LJII();
        this.LJLLLL = SearchAdMainService.LJIIJJI().LJIIIIZZ();
        this.LJZ = C221108m2.LIZIZ(new AqS68S0400000_8(this, itemView, containerStatusProvider, jgu, 2));
    }
}
