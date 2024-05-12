package X;

import Y.ACListenerS21S0101000_2;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.usercard.core.ui.SearchMixUserCell;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.JSw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49206JSw extends JNU implements JP7, JQX, JSO {
    public static final /* synthetic */ int LJLLL = 0;
    public boolean LJLJL;
    public boolean LJLJLJ;
    public SearchResultParam LJLJLLL;
    public final SearchMixUserCell LJLL;
    public Integer LJLLI;
    public C49268JVg LJLLILLLL;
    public final C49207JSx LJLLJ;

    @Override // X.JP7
    public final int LIZ() {
        return 2;
    }

    @Override // X.InterfaceC48907JHj
    public final void LJIILL() {
    }

    @Override // X.JP7
    public final int LJLL() {
        return -1;
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

    @Override // X.JSO
    public final boolean LLLLLLL() {
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

    @Override // X.JSO
    public final int q() {
        return 21;
    }

    @Override // X.JP7
    public final View LJIIIIZZ() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.JQX
    public final C49128JPw LJJLJ() {
        Integer num;
        C68322mC c68322mC = new C68322mC();
        JIB LJIIJ = C1DF.LJIIJ(this.itemView);
        if (LJIIJ != null) {
            num = Integer.valueOf(LJIIJ.hashCode());
        } else {
            num = null;
        }
        C2U8.LIZ(new JQ5(2, num, null, new AqS174S0100000_8(c68322mC, (C68322mC<C49128JPw>) 192), null, 20));
        return (C49128JPw) c68322mC.element;
    }

    @Override // X.JP7
    public final int LJLLI() {
        C1BU c1bu;
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if ((layoutParams instanceof C1BU) && (c1bu = (C1BU) layoutParams) != null) {
            return c1bu.LJLIL;
        }
        return -1;
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLJIL() {
        if (C46447IKt.LJLJLJ) {
            return;
        }
        if (this.LJLJLJ) {
            this.LJLJLJ = false;
        } else {
            C2U8.LIZ(new JQ8(1));
        }
    }

    @Override // X.InterfaceC48907JHj
    public final void LLLLLJLJLL() {
        if (C46447IKt.LJLJLJ) {
            return;
        }
        C2U8.LIZ(new JQ8(2));
    }

    @Override // X.JSO
    public final View a() {
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        return itemView;
    }

    @Override // X.InterfaceC48907JHj
    public final void contextPause() {
        if (C46447IKt.LJLJLJ) {
            return;
        }
        C2U8.LIZ(new JQ8(4));
    }

    @Override // X.InterfaceC48907JHj
    public final void g9() {
        if (C46447IKt.LJLJLJ) {
            return;
        }
        C2U8.LIZ(new JQ8(3));
    }

    @Override // X.JNU
    public final View getView() {
        View view;
        SearchMixUserCell searchMixUserCell = this.LJLL;
        if (searchMixUserCell != null && (view = searchMixUserCell.LJLILLLLZI) != null) {
            return view;
        }
        return super.getView();
    }

    @Override // X.JSO
    public final JSL h() {
        return new JSN(new AqS158S0100000_8(this, 563));
    }

    @Override // X.InterfaceC49148JQq
    public final boolean isPlaying() {
        Integer num;
        C34K c34k = new C34K();
        JIB LJIIJ = C1DF.LJIIJ(this.itemView);
        if (LJIIJ != null) {
            num = Integer.valueOf(LJIIJ.hashCode());
        } else {
            num = null;
        }
        C2U8.LIZ(new JQ5(1, num, new AqS174S0100000_8(c34k, 193), null, null, 24));
        return c34k.element;
    }

    @Override // X.InterfaceC48907JHj
    public final View LJJIJIL() {
        return LJIIIIZZ();
    }

    @Override // X.JQX, X.InterfaceC49148JQq
    public final boolean LLIIII() {
        SearchMixUserCell searchMixUserCell;
        C49268JVg c49268JVg;
        if (!JQ2.LIZIZ() || (searchMixUserCell = this.LJLL) == null || (c49268JVg = searchMixUserCell.LJLLJ) == null || !C49421JaT.LIZ(c49268JVg.LIZIZ)) {
            return false;
        }
        return true;
    }

    @Override // X.JP7
    public final int LLJJJ() {
        return getAdapterPosition();
    }

    @Override // X.InterfaceC49148JQq
    public final View LLLLZLLIL() {
        return C48905JHh.LIZ(this);
    }

    @Override // X.JQX
    public final boolean LLZL() {
        return JQ2.LIZIZ();
    }

    @Override // X.InterfaceC49148JQq
    public final View getDetectView() {
        return C48984JKi.LIZIZ(this);
    }

    @Override // X.JP7
    public final boolean LIZLLL() {
        return this.LJLJI;
    }

    @Override // X.JP7
    public final SearchResultParam LJLJLLL() {
        return this.LJLJLLL;
    }

    @Override // X.JP7
    public final Integer LLILLL() {
        return this.LJLLI;
    }

    @Override // X.JP7
    public final boolean LLIZLLLIL() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC49148JQq
    public final void LLLLLIL() {
        JSM.LIZLLL(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C49206JSw(View view) {
        super(view);
        o.LJIIIZ(view, "view");
        this.LJLLJ = new C49207JSx(this);
    }

    @Override // X.JP7
    public final void LJLZ(int i) {
        this.LJLLI = Integer.valueOf(i);
    }

    @Override // X.JP7
    public final void LLLIIL(MotionEvent event) {
        o.LJIIIZ(event, "event");
    }

    @Override // X.JQX
    public final void f(C49128JPw info) {
        Integer num;
        o.LJIIIZ(info, "info");
        JIB LJIIJ = C1DF.LJIIJ(this.itemView);
        if (LJIIJ != null) {
            num = Integer.valueOf(LJIIJ.hashCode());
        } else {
            num = null;
        }
        C2U8.LIZ(new JQ5(3, num, null, null, info, 12));
    }

    @QD3
    public final void onEvent(C50420Jqa event) {
        o.LJIIIZ(event, "event");
        if (!C46447IKt.LJLJLJ && event.LJLIL == 66) {
            this.LJLJLJ = true;
        }
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        super.onViewAttachedToWindow(v);
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.JNU, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        super.onViewDetachedFromWindow(v);
        EventBus.LIZJ().LJIJ(this);
        this.LJLJL = false;
    }

    @Override // X.InterfaceC49148JQq
    public final void x4(C49187JSd c49187JSd) {
        C48984JKi.LIZ(this, c49187JSd);
    }

    @Override // X.InterfaceC49148JQq
    public final void y(long j) {
        JSM.LJ(this, j);
    }

    @Override // X.InterfaceC49148JQq
    public final void z8(C49187JSd c49187JSd) {
        C48984JKi.LIZJ(this, c49187JSd);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C49206JSw(Context context, View view) {
        this(view);
        o.LJIIIZ(view, "view");
        this.LJLL = new SearchMixUserCell(view, context);
    }

    @Override // X.JSO
    public final void LJIJJLI(Aweme aweme, C49196JSm c49196JSm) {
        JSM.LIZIZ(this, aweme, c49196JSm);
    }

    @Override // X.JP7
    public final Aweme LJLLILLLL(int i, String str) {
        Aweme aweme;
        String str2;
        C49268JVg c49268JVg;
        List<SearchUser> list;
        SearchUser searchUser;
        List<Aweme> list2;
        List<SearchUser> list3;
        SearchUser searchUser2;
        List<Aweme> list4;
        C49268JVg c49268JVg2 = this.LJLLILLLL;
        Aweme aweme2 = null;
        if (c49268JVg2 != null && (list3 = c49268JVg2.LIZIZ) != null && (searchUser2 = (SearchUser) ORZ.LJLLLL(list3)) != null && (list4 = searchUser2.awemeCards) != null) {
            aweme = (Aweme) ORZ.LJLLLLLL(i, list4);
        } else {
            aweme = null;
        }
        if (str.length() == 0) {
            return aweme;
        }
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        if (o.LJ(str2, str) || (c49268JVg = this.LJLLILLLL) == null || (list = c49268JVg.LIZIZ) == null || (searchUser = (SearchUser) ORZ.LJLLLL(list)) == null || (list2 = searchUser.awemeCards) == null) {
            return aweme;
        }
        Iterator<Aweme> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Aweme next = it.next();
            if (o.LJ(next.getAid(), str)) {
                aweme2 = next;
                break;
            }
        }
        Aweme aweme3 = aweme2;
        if (aweme3 == null) {
            return aweme;
        }
        return aweme3;
    }

    public final void P(C49268JVg c49268JVg, SearchResultParam searchResultParam, boolean z, boolean z2) {
        String str;
        int i;
        User user;
        int intValue;
        this.LJLJLLL = searchResultParam;
        this.LJLLILLLL = c49268JVg;
        JQA LJLJL = LJLJL();
        SearchGlobalViewModel M = M();
        String str2 = null;
        if (M != null) {
            str = M.jv0();
        } else {
            str = null;
        }
        LJLJL.LIZ(str);
        SearchMixUserCell searchMixUserCell = this.LJLL;
        if (searchMixUserCell != null) {
            searchMixUserCell.LJLLLLLL = this.LJLJJI;
            searchMixUserCell.LJLJJLL = LJLJL;
            searchMixUserCell.LJLLLL = getAdapterPosition();
            searchMixUserCell.LJLLL = this.LJLLJ;
            searchMixUserCell.LJLLJ = c49268JVg;
            if (!C79004UzY.LJJIFFI(c49268JVg.LIZIZ)) {
                searchMixUserCell.LJLLI = searchResultParam;
                C49396Ja4 c49396Ja4 = searchMixUserCell.LJLL;
                c49396Ja4.LJLL = searchMixUserCell.LJLLLLLL;
                c49396Ja4.LJLJI = searchResultParam;
                c49396Ja4.LJLJLJ = searchMixUserCell.LJLJJLL;
                c49396Ja4.LJLLI = searchMixUserCell.LJLLL;
                c49396Ja4.setShowFooter(false);
                View view = searchMixUserCell.LJLJLJ;
                if (searchMixUserCell.LJLLLL == 0) {
                    i = 8;
                } else {
                    i = 0;
                }
                view.setVisibility(i);
                ISearchContextAbility LJJJJJ = C17N.LJJJJJ(searchMixUserCell.LJLILLLLZI);
                if (LJJJJJ != null && (intValue = LJJJJJ.If().LIZJ().LJLL.invoke().intValue()) > 0 && searchMixUserCell.LJLLLL == intValue) {
                    searchMixUserCell.LJLJLJ.setVisibility(8);
                }
                if (!TextUtils.isEmpty(c49268JVg.LIZJ)) {
                    searchMixUserCell.LJLJI.setText(c49268JVg.LIZJ);
                }
                SearchCardInfo searchCardInfo = c49268JVg.LIZLLL;
                if (searchCardInfo != null && TextUtils.equals(searchCardInfo.alasrc, "tt_user")) {
                    searchMixUserCell.LJLLILLLL.setPadding(0, C32151Nz.LJIILLIIL(8), 0, 0);
                } else {
                    searchMixUserCell.LJLLILLLL.setPadding(0, C32151Nz.LJIILLIIL(8), 0, C32151Nz.LJIILLIIL(8));
                }
                if (!z2) {
                    if (C49421JaT.LIZ(c49268JVg.LIZIZ)) {
                        searchMixUserCell.LJLJI.setVisibility(8);
                    } else {
                        searchMixUserCell.LJLJI.setVisibility(0);
                    }
                }
                if (c49268JVg.LIZ) {
                    SearchUser searchUser = (SearchUser) ListProtector.get(c49268JVg.LIZIZ, 0);
                    if (searchUser != null && (user = searchUser.user) != null) {
                        JQA jqa = searchMixUserCell.LJLJJLL;
                        String users = user.getUid();
                        jqa.getClass();
                        o.LJIIIZ(users, "users");
                        jqa.LJIIZILJ = users;
                        JQA jqa2 = searchMixUserCell.LJLJJLL;
                        User user2 = searchUser.user;
                        if (user2 != null) {
                            str2 = C79146V4k.LJJIJIL(user2);
                        }
                        jqa2.LJIJ = str2;
                    }
                    searchMixUserCell.LJLL.setData(Collections.singletonList(searchUser));
                    searchMixUserCell.LJLJJI.setVisibility(8);
                } else {
                    JQA jqa3 = searchMixUserCell.LJLJJLL;
                    List<SearchUser> list = c49268JVg.LIZIZ;
                    jqa3.getClass();
                    StringBuilder sb = new StringBuilder();
                    if (list != null) {
                        int i2 = 0;
                        for (SearchUser searchUser2 : list) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                SearchUser searchUser3 = searchUser2;
                                if (i2 != list.size() - 1) {
                                    sb.append(searchUser3.user.getUid());
                                    sb.append(",");
                                } else {
                                    sb.append(searchUser3.user.getUid());
                                }
                                i2 = i3;
                            } else {
                                C47261Igj.LJJJJJ();
                                throw null;
                            }
                        }
                    }
                    String sb2 = sb.toString();
                    o.LJIIIIZZ(sb2, "str.toString()");
                    jqa3.LJIIZILJ = sb2;
                    searchMixUserCell.LJLL.setData(c49268JVg.LIZIZ);
                    if (!C49421JaT.LIZ(c49268JVg.LIZIZ)) {
                        searchMixUserCell.LIZ(z);
                    } else {
                        searchMixUserCell.LIZ(false);
                        View view2 = searchMixUserCell.LJLJL;
                        if (view2 != null) {
                            C16880lQ.LJIIJ(new ACListenerS21S0101000_2(3, searchMixUserCell, 10), view2);
                        }
                    }
                }
            }
        }
        SearchCardInfo searchCardInfo2 = c49268JVg.LIZLLL;
        if (searchCardInfo2 != null) {
            JN8 LIZIZ = JND.LIZIZ(LJLJL);
            LIZIZ.LJIJ("search_result_id", searchCardInfo2.docId);
            LIZIZ.LJJI(Integer.valueOf(getAdapterPosition()));
            LIZIZ.LJJIIJZLJL("1");
            LIZIZ.LJIIZILJ("token_type", searchCardInfo2.alasrc);
            LIZIZ.LJIILIIL();
        }
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        JSM.LIZJ(itemView, this);
        this.LJLJL = true;
    }
}
