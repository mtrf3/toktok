package com.ss.android.ugc.aweme.tag.viewmodel;

import X.A2F;
import X.A2G;
import X.C221108m2;
import X.C240199bj;
import X.C242479fP;
import X.C246919mZ;
import X.C247009mi;
import X.C247019mj;
import X.C250859sv;
import X.C33Q;
import X.C47261Igj;
import X.C47704Ins;
import X.C55749LuL;
import X.C61878OQg;
import X.C62822Ol8;
import X.C7DS;
import X.C7FK;
import X.C8HZ;
import X.C91753it;
import X.EF7;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.ORZ;
import X.OSZ;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.model.SugExtraInfo;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS135S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes5.dex */
public final class VideoTagSearchListViewModel extends AssemListViewModel<C240199bj, InterfaceC57784Mm4, Boolean> {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LJFF(this, C7FK.class, null), true);
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C247019mj.LJLIL);
    public final C61878OQg LJLJI;
    public List<? extends InterfaceC57784Mm4> LJLJJI;
    public final C62822Ol8 LJLJJL;
    public String LJLJJLL;
    public int LJLJL;
    public final Set<String> LJLJLJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C240199bj(new OSZ(C61878OQg.INSTANCE, ""), new C8HZ(null, null, 15));
    }

    public final C7FK hv0() {
        C7FK c7fk = (C7FK) this.LJLIL.getValue();
        if (c7fk == null) {
            return new C7FK(null, null, 0, null, null, 31, null);
        }
        return c7fk;
    }

    public VideoTagSearchListViewModel() {
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        this.LJLJI = c61878OQg;
        this.LJLJJI = c61878OQg;
        this.LJLJJL = C221108m2.LIZIZ(C247009mi.LJLIL);
        this.LJLJJLL = "";
        this.LJLJLJ = new LinkedHashSet();
    }

    public static IMUser gv0(SugExtraInfo sugExtraInfo) {
        String str;
        IMUser iMUser = new IMUser();
        iMUser.setUid(sugExtraInfo.getUserId());
        iMUser.setSecUid(sugExtraInfo.getSecUserId());
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(sugExtraInfo.getUserAvatarUri());
        urlModel.setUrlList(C47261Igj.LJJIJIIJI(sugExtraInfo.getUserAvatarUri(), sugExtraInfo.getUserAvatarUri()));
        iMUser.setAvatarThumb(urlModel);
        iMUser.setFollowStatus(sugExtraInfo.getFollowStatus());
        iMUser.setNickName(sugExtraInfo.getUsername());
        iMUser.setUniqueId(sugExtraInfo.getUserNickname());
        if (sugExtraInfo.isVerifiedUser()) {
            str = "verified";
        } else {
            str = "";
        }
        iMUser.setCustomVerify(str);
        iMUser.setSearchIsBusinessAccount(sugExtraInfo.isBusinessAccount());
        return iMUser;
    }

    public final A2G<Boolean> iv0(boolean z) {
        Long l;
        Integer num;
        boolean z2;
        SugExtraInfo sugExtraInfo;
        SugExtraInfo sugExtraInfo2;
        String aid;
        try {
            ISearchUserService iSearchUserService = (ISearchUserService) this.LJLILLLLZI.getValue();
            if (iSearchUserService != null) {
                Aweme aweme = hv0().getAweme();
                if (aweme != null && (aid = aweme.getAid()) != null) {
                    l = Long.valueOf(CastLongProtector.parseLong(aid));
                } else {
                    l = null;
                }
                String str = this.LJLJJLL;
                List LLJI = ORZ.LLJI((HashSet) this.LJLJJL.getValue());
                if (a.LJFF().LJJJJI()) {
                    num = 1;
                } else {
                    num = null;
                }
                SearchUserSugResponse LIZLLL = iSearchUserService.LIZLLL(new C250859sv(4L, l, str, "at_user", 20L, LLJI, num));
                if (LIZLLL != null) {
                    ArrayList arrayList = new ArrayList();
                    List<? extends SearchSugEntity> list = LIZLLL.sugList;
                    if (list != null && (!list.isEmpty())) {
                        if (z) {
                            this.LJLJL = 0;
                        }
                        boolean z3 = false;
                        boolean z4 = false;
                        for (SearchSugEntity searchSugEntity : list) {
                            if (z) {
                                ISearchUserService iSearchUserService2 = (ISearchUserService) this.LJLILLLLZI.getValue();
                                if (iSearchUserService2 != null && iSearchUserService2.LJ()) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    if (!z3 && (sugExtraInfo2 = searchSugEntity.sugExtraInfo) != null && sugExtraInfo2.getHasUserRelation()) {
                                        String string = EF7.LIZIZ().getString(R.string.gjt);
                                        o.LJIIIIZZ(string, "AppContextManager.getApp…string.follow_list_title)");
                                        arrayList.add(new C91753it(string));
                                        z3 = true;
                                    }
                                    if (!z4 && (sugExtraInfo = searchSugEntity.sugExtraInfo) != null && !sugExtraInfo.getHasUserRelation()) {
                                        String string2 = EF7.LIZIZ().getString(R.string.buk);
                                        o.LJIIIIZZ(string2, "AppContextManager.getApp…g.at_friends_all_friends)");
                                        arrayList.add(new C91753it(string2));
                                        z4 = true;
                                    }
                                } else if (!z4) {
                                    String string3 = EF7.LIZIZ().getString(R.string.buk);
                                    o.LJIIIIZZ(string3, "AppContextManager.getApp…g.at_friends_all_friends)");
                                    arrayList.add(new C91753it(string3));
                                    z4 = true;
                                }
                            }
                            SugExtraInfo sugExtraInfo3 = searchSugEntity.sugExtraInfo;
                            o.LJIIIIZZ(sugExtraInfo3, "it.sugExtraInfo");
                            IMUser gv0 = gv0(sugExtraInfo3);
                            C242479fP c242479fP = new C242479fP(gv0, this.LJLJJLL, new C246919mZ(searchSugEntity, LIZLLL.requestId));
                            ((HashSet) this.LJLJJL.getValue()).add(c242479fP.LJLIL.getUid());
                            if (!this.LJLJI.contains(gv0)) {
                                arrayList.add(c242479fP);
                                this.LJLJL++;
                            }
                        }
                        C7DS.LIZIZ("trending_show", new AqS135S0200000_4(LIZLLL, this, 177));
                    }
                    if (LIZLLL.LIZ()) {
                        return A2F.LJ(A2G.LIZ, null, Boolean.TRUE, arrayList, 1);
                    }
                    A2G.LIZ.getClass();
                    return A2F.LIZ(arrayList);
                }
            }
            A2F a2f = A2G.LIZ;
            Exception exc = new Exception();
            a2f.getClass();
            return A2F.LIZJ(exc);
        } catch (Exception e) {
            A2F a2f2 = A2G.LIZ;
            Exception exc2 = new Exception(e);
            a2f2.getClass();
            return A2F.LIZJ(exc2);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS170S0100000_4(newListState, (C8HZ<InterfaceC57784Mm4>) 796));
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<Boolean>> interfaceC67352kd) {
        ((HashSet) this.LJLJJL.getValue()).clear();
        return iv0(true);
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Boolean bool, InterfaceC67352kd<? super A2G<Boolean>> interfaceC67352kd) {
        bool.booleanValue();
        return iv0(false);
    }
}
