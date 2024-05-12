package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
import com.ss.android.ugc.aweme.discover.model.SearchUser;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.keyword.SearchKeywordPresenter;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KGR extends FrameLayout implements InterfaceC223218pR<SearchUser> {
    public SearchKeywordPresenter LJLIL;
    public KGV LJLILLLLZI;
    public KGT LJLJI;
    public LifecycleOwner LJLJJI;
    public boolean LJLJJL;
    public final java.util.Map<Integer, View> LJLJJLL = new LinkedHashMap();

    @Override // X.InterfaceC223218pR
    public final void Iw() {
    }

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJLL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC223218pR
    public final void Qw(Exception exc) {
    }

    @Override // X.InterfaceC223218pR
    public final void jh(List<SearchUser> list, boolean z) {
    }

    public final void LIZJ() {
        if (!this.LJLJJL) {
            return;
        }
        KGV kgv = this.LJLILLLLZI;
        if (kgv != null) {
            Object[] objArr = new Object[3];
            objArr[0] = 1;
            SearchKeywordPresenter searchKeywordPresenter = this.LJLIL;
            if (searchKeywordPresenter != null) {
                objArr[1] = searchKeywordPresenter.getKeyword().LJLIL;
                objArr[2] = 1;
                kgv.LJIILL(objArr);
                return;
            }
            o.LJIJI("keywordPresenter");
            throw null;
        }
        o.LJIJI("searchUserPresenter");
        throw null;
    }

    @Override // X.InterfaceC223218pR
    public final void LJII() {
        LifecycleOwner lifecycleOwner = this.LJLJJI;
        if (lifecycleOwner != null) {
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            o.LJIIIIZZ(lifecycle, "host.lifecycle");
            if (LIZIZ(lifecycle)) {
                return;
            }
            ((C73305Spp) LIZ(R.id.jhm)).setVisibility(0);
            ((C73305Spp) LIZ(R.id.jhm)).LJFF();
            return;
        }
        o.LJIJI("host");
        throw null;
    }

    @Override // X.InterfaceC223218pR
    public final void Ne() {
        LifecycleOwner lifecycleOwner = this.LJLJJI;
        if (lifecycleOwner != null) {
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            o.LJIIIIZZ(lifecycle, "host.lifecycle");
            if (LIZIZ(lifecycle)) {
                return;
            }
            ((C73305Spp) LIZ(R.id.jhm)).setVisibility(0);
            C73305Spp c73305Spp = (C73305Spp) LIZ(R.id.jhm);
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJIIIZ(c73306Spq);
            c73305Spp.setStatus(c73306Spq);
            return;
        }
        o.LJIJI("host");
        throw null;
    }

    @Override // X.InterfaceC223218pR
    public final void showLoadMoreLoading() {
        LifecycleOwner lifecycleOwner = this.LJLJJI;
        if (lifecycleOwner != null) {
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            o.LJIIIIZZ(lifecycle, "host.lifecycle");
            if (LIZIZ(lifecycle)) {
                return;
            }
            KGT kgt = this.LJLJI;
            if (kgt != null) {
                kgt.showLoadMoreLoading();
                return;
            } else {
                o.LJIJI("searchUserAdapter");
                throw null;
            }
        }
        o.LJIJI("host");
        throw null;
    }

    public KGR(Context context) {
        super(context, null, 0);
        C16880lQ.LLLZIIL(R.layout.aye, C16880lQ.LLZIL(context), this);
    }

    public static boolean LIZIZ(Lifecycle lifecycle) {
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC223218pR
    public final void cb0(Exception exc) {
        LifecycleOwner lifecycleOwner = this.LJLJJI;
        if (lifecycleOwner != null) {
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            o.LJIIIIZZ(lifecycle, "host.lifecycle");
            if (LIZIZ(lifecycle)) {
                return;
            }
            ((C73305Spp) LIZ(R.id.jhm)).setVisibility(0);
            LIZ(R.id.jgc).setVisibility(8);
            C73305Spp c73305Spp = (C73305Spp) LIZ(R.id.jhm);
            C73306Spq c73306Spq = new C73306Spq();
            C73312Spw.LJI(c73306Spq, new AqS158S0100000_8(this, 652));
            c73305Spp.setStatus(c73306Spq);
            return;
        }
        o.LJIJI("host");
        throw null;
    }

    @Override // X.InterfaceC223218pR
    public final void nc(Exception exc) {
        LifecycleOwner lifecycleOwner = this.LJLJJI;
        if (lifecycleOwner != null) {
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            o.LJIIIIZZ(lifecycle, "host.lifecycle");
            if (LIZIZ(lifecycle)) {
                return;
            }
            KGT kgt = this.LJLJI;
            if (kgt != null) {
                kgt.showLoadMoreError();
                return;
            } else {
                o.LJIJI("searchUserAdapter");
                throw null;
            }
        }
        o.LJIJI("host");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC223218pR
    public final void J5(List<SearchUser> list, boolean z) {
        int i;
        String str;
        SearchUser searchUser;
        LogPbBean logPbBean;
        LifecycleOwner lifecycleOwner = this.LJLJJI;
        if (lifecycleOwner != null) {
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            o.LJIIIIZZ(lifecycle, "host.lifecycle");
            if (LIZIZ(lifecycle)) {
                return;
            }
            LIZ(R.id.jgc).setVisibility(0);
            SearchKeywordPresenter searchKeywordPresenter = this.LJLIL;
            if (searchKeywordPresenter != null) {
                if (TextUtils.isEmpty(searchKeywordPresenter.getKeyword().LJLIL)) {
                    return;
                }
                LifecycleOwner lifecycleOwner2 = this.LJLJJI;
                if (lifecycleOwner2 != null) {
                    InterfaceC50157JmL LIZIZ = K0M.LIZIZ(lifecycleOwner2.hashCode());
                    InterfaceC50157JmL interfaceC50157JmL = LIZIZ;
                    if (LIZIZ == null) {
                        C50145Jm9 c50145Jm9 = new C50145Jm9();
                        LifecycleOwner lifecycleOwner3 = this.LJLJJI;
                        if (lifecycleOwner3 != null) {
                            K0M.LIZLLL(lifecycleOwner3.hashCode(), c50145Jm9);
                            interfaceC50157JmL = c50145Jm9;
                        } else {
                            o.LJIJI("host");
                            throw null;
                        }
                    }
                    C50160JmO c50160JmO = new C50160JmO();
                    if (list != null) {
                        i = list.size();
                    } else {
                        i = 0;
                    }
                    String str2 = "";
                    if (i > 0) {
                        if (list == null || (searchUser = (SearchUser) ListProtector.get(list, 0)) == null || (logPbBean = searchUser.logPb) == null || (str = logPbBean.getImprId()) == null) {
                            str = "";
                        }
                        c50160JmO.LIZ = str;
                    }
                    SearchKeywordPresenter searchKeywordPresenter2 = this.LJLIL;
                    if (searchKeywordPresenter2 != null) {
                        String str3 = searchKeywordPresenter2.getKeyword().LJLIL;
                        o.LJIIIZ(str3, "<set-?>");
                        c50160JmO.LIZIZ = str3;
                        interfaceC50157JmL.LJFF(0, c50160JmO);
                        C50651JuJ c50651JuJ = C50652JuK.Companion;
                        LifecycleOwner lifecycleOwner4 = this.LJLJJI;
                        if (lifecycleOwner4 != null) {
                            c50651JuJ.getClass();
                            if (C50651JuJ.LJIIJ(lifecycleOwner4) == null) {
                                LifecycleOwner lifecycleOwner5 = this.LJLJJI;
                                if (lifecycleOwner5 != null) {
                                    C1DH.LIZ(lifecycleOwner5, new C50652JuK(null, null, 3, null), C50652JuK.class);
                                } else {
                                    o.LJIJI("host");
                                    throw null;
                                }
                            }
                            C68322mC c68322mC = new C68322mC();
                            c68322mC.element = "";
                            if (list != null) {
                                T t = str2;
                                if (list.size() > 0) {
                                    if (list != null) {
                                        SearchUser searchUser2 = (SearchUser) ListProtector.get(list, 0);
                                        t = str2;
                                        if (searchUser2 != null) {
                                            LogPbBean logPbBean2 = searchUser2.logPb;
                                            t = str2;
                                            if (logPbBean2 != null) {
                                                String imprId = logPbBean2.getImprId();
                                                t = str2;
                                                if (imprId != null) {
                                                    t = imprId;
                                                }
                                            }
                                        }
                                    }
                                    c68322mC.element = t;
                                }
                            }
                            LifecycleOwner lifecycleOwner6 = this.LJLJJI;
                            if (lifecycleOwner6 != null) {
                                C85855Xml.LIZJ(lifecycleOwner6, C50652JuK.class, new AqS174S0100000_8(new AqS139S0200000_8(c68322mC, (C68322mC<String>) this, (KGR) 44), (InterfaceC88472Yns<? super C50652JuK, C50652JuK>) 159));
                                ISearchContextAbility LJJJJJ = C17N.LJJJJJ(this);
                                if (LJJJJJ != null) {
                                    SearchKeywordPresenter searchKeywordPresenter3 = this.LJLIL;
                                    if (searchKeywordPresenter3 != null) {
                                        LJJJJJ.j4(new C50323Jp1(searchKeywordPresenter3.getKeyword().LJLIL, (String) c68322mC.element));
                                    } else {
                                        o.LJIJI("keywordPresenter");
                                        throw null;
                                    }
                                }
                                KGT kgt = this.LJLJI;
                                if (kgt != null) {
                                    kgt.setShowFooter(true);
                                    if (!z) {
                                        KGT kgt2 = this.LJLJI;
                                        if (kgt2 != null) {
                                            kgt2.showLoadMoreEmpty();
                                        } else {
                                            o.LJIJI("searchUserAdapter");
                                            throw null;
                                        }
                                    } else {
                                        KGT kgt3 = this.LJLJI;
                                        if (kgt3 != null) {
                                            kgt3.resetLoadMoreState();
                                        } else {
                                            o.LJIJI("searchUserAdapter");
                                            throw null;
                                        }
                                    }
                                    ((C73305Spp) LIZ(R.id.jhm)).setVisibility(8);
                                    KGT kgt4 = this.LJLJI;
                                    if (kgt4 != null) {
                                        kgt4.setData(list);
                                        KGV kgv = this.LJLILLLLZI;
                                        if (kgv != null) {
                                            K data = kgv.LIZLLL().getData();
                                            o.LJII(data, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.SearchApiResult");
                                            SearchApiResult searchApiResult = (SearchApiResult) data;
                                            C188727au c188727au = new C188727au();
                                            c188727au.LJIIIZ("enter_from", "find_friends");
                                            SearchKeywordPresenter searchKeywordPresenter4 = this.LJLIL;
                                            if (searchKeywordPresenter4 != null) {
                                                c188727au.LJIIIZ("search_keyword", searchKeywordPresenter4.getKeyword().LJLIL);
                                                c188727au.LJIIIZ("log_pb", GsonProtectorUtils.toJson(new Gson(), searchApiResult.logPb));
                                                FMX.LJIILJJIL("search_user", C227768wm.LJJIIZI(c188727au.LIZ));
                                                return;
                                            }
                                            o.LJIJI("keywordPresenter");
                                            throw null;
                                        }
                                        o.LJIJI("searchUserPresenter");
                                        throw null;
                                    }
                                    o.LJIJI("searchUserAdapter");
                                    throw null;
                                }
                                o.LJIJI("searchUserAdapter");
                                throw null;
                            }
                            o.LJIJI("host");
                            throw null;
                        }
                        o.LJIJI("host");
                        throw null;
                    }
                    o.LJIJI("keywordPresenter");
                    throw null;
                }
                o.LJIJI("host");
                throw null;
            }
            o.LJIJI("keywordPresenter");
            throw null;
        }
        o.LJIJI("host");
        throw null;
    }

    @Override // X.InterfaceC223218pR
    public final void j0(List<SearchUser> list, boolean z) {
        LifecycleOwner lifecycleOwner = this.LJLJJI;
        if (lifecycleOwner != null) {
            Lifecycle lifecycle = lifecycleOwner.getLifecycle();
            o.LJIIIIZZ(lifecycle, "host.lifecycle");
            if (LIZIZ(lifecycle)) {
                return;
            }
            KGV kgv = this.LJLILLLLZI;
            if (kgv != null) {
                if (!kgv.LJIILLIIL()) {
                    KGT kgt = this.LJLJI;
                    if (kgt != null) {
                        kgt.showLoadMoreEmpty();
                    } else {
                        o.LJIJI("searchUserAdapter");
                        throw null;
                    }
                } else {
                    KGT kgt2 = this.LJLJI;
                    if (kgt2 != null) {
                        kgt2.resetLoadMoreState();
                    } else {
                        o.LJIJI("searchUserAdapter");
                        throw null;
                    }
                }
                KGT kgt3 = this.LJLJI;
                if (kgt3 != null) {
                    kgt3.setDataAfterLoadMore(list);
                    return;
                } else {
                    o.LJIJI("searchUserAdapter");
                    throw null;
                }
            }
            o.LJIJI("searchUserPresenter");
            throw null;
        }
        o.LJIJI("host");
        throw null;
    }
}
