package com.ss.android.ugc.aweme.mention.viewmodel;

import X.A2F;
import X.A2G;
import X.A2H;
import X.A2V;
import X.AbstractC73672Svk;
import X.C10I;
import X.C10K;
import X.C1794472m;
import X.C212808Wu;
import X.C217268fq;
import X.C217678gV;
import X.C217698gX;
import X.C217738gb;
import X.C217808gi;
import X.C217818gj;
import X.C217868go;
import X.C221108m2;
import X.C250859sv;
import X.C32I;
import X.C36922EeM;
import X.C3C5;
import X.C62822Ol8;
import X.C70I;
import X.C70R;
import X.C73969T1h;
import X.C8WO;
import X.C8WS;
import X.C8WT;
import X.EnumC217688gW;
import X.EnumC217758gd;
import X.HG3;
import X.InterfaceC67352kd;
import X.RBX;
import X.T16;
import X.X1D;
import X.Y9G;
import Y.IDxS24S0300000_3;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.mention.api.MentionNetworkApi;
import com.ss.android.ugc.aweme.mention.viewmodel.CommentMentionViewModel;
import com.ss.android.ugc.aweme.search.model.SearchUserSugResponse;
import com.ss.android.ugc.aweme.search.service.ISearchUserService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;
import yq4.a;

/* loaded from: classes4.dex */
public final class CommentMentionViewModel extends ViewModel {
    public static final /* synthetic */ int LJLJLLL = 0;
    public C217268fq LJLIL;
    public C217808gi LJLILLLLZI;
    public C70R LJLJJLL;
    public C1794472m LJLJL;
    public final String LJLJI = ((RBX) HG3.LJIILL()).getCurUserId();
    public String LJLJJI = "";
    public final Set<String> LJLJJL = new LinkedHashSet();
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(new AqS153S0100000_3(this, 487));

    public final boolean iv0() {
        C70I c70i;
        C70R c70r = this.LJLJJLL;
        if (c70r != null) {
            c70i = c70r.LJLILLLLZI;
        } else {
            c70i = null;
        }
        if (c70i == C70I.NOW_COMMENT_MENTION) {
            return true;
        }
        return false;
    }

    public final void jv0(C217808gi c217808gi, InterfaceC67352kd<? super A2G<Boolean>> interfaceC67352kd) {
        C217268fq c217268fq = this.LJLIL;
        if (c217268fq != null) {
            c217268fq.LIZIZ(true);
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentMentionItem in onFetchedCache() mobParams = ");
        LIZ.append(this.LJLJL);
        C36922EeM.LIZLLL(3, "CommentLog", X1D.LIZIZ(LIZ));
        List<Y9G> list = c217808gi.LJLILLLLZI;
        ArrayList arrayList = new ArrayList(C32I.LJJL(list, 10));
        Iterator<Y9G> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C217868go(it.next(), this.LJLJJI, this.LJLJL));
        }
        C8WS.LIZIZ.LIZLLL = System.currentTimeMillis();
        if (c217808gi.LJLIL.LIZJ) {
            A2F a2f = A2G.LIZ;
            Boolean bool = Boolean.TRUE;
            a2f.getClass();
            A2V LIZLLL = A2F.LIZLLL(bool, bool, arrayList);
            C3C5.m7constructorimpl(LIZLLL);
            interfaceC67352kd.resumeWith(LIZLLL);
        } else {
            A2G.LIZ.getClass();
            A2H LIZ2 = A2F.LIZ(arrayList);
            C3C5.m7constructorimpl(LIZ2);
            interfaceC67352kd.resumeWith(LIZ2);
        }
        this.LJLILLLLZI = c217808gi;
    }

    public final void hv0(final String str, final EnumC217688gW enumC217688gW, final InterfaceC67352kd<? super A2G<Boolean>> interfaceC67352kd) {
        ArrayList arrayList;
        String str2;
        Integer num;
        List<Y9G> list;
        String selfUid = this.LJLJI;
        o.LJIIIIZZ(selfUid, "selfUid");
        C217808gi LIZJ = C217738gb.LIZJ(selfUid, str);
        if (LIZJ != null && (list = LIZJ.LJLILLLLZI) != null) {
            arrayList = new ArrayList(C32I.LJJL(list, 10));
            Iterator<Y9G> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().LIZ);
            }
        } else {
            arrayList = null;
        }
        if (iv0()) {
            str2 = "now_comment_user";
        } else {
            str2 = "comment_user";
        }
        if (a.LJFF().LJJJJI()) {
            num = 1;
        } else {
            num = null;
        }
        ((ISearchUserService) C217698gX.LIZ.getValue()).LIZIZ(new C250859sv(3L, null, str, str2, 10L, arrayList, num)).LJ(new C10I() { // from class: X.8gU
            @Override // X.C10I
            public final Object then(C10K c10k) {
                C217268fq c217268fq;
                ArrayList arrayList2;
                C217268fq c217268fq2;
                C212808Wu mentionSearchLayout;
                List<Y9G> list2;
                if (C82544WaS.LJ(c10k)) {
                    String str3 = str;
                    Object LJIIJJI = c10k.LJIIJJI();
                    o.LJIIIIZZ(LJIIJJI, "task.result");
                    C217808gi LIZIZ = C217958gx.LIZIZ((SearchUserSugResponse) LJIIJJI, str3);
                    CommentMentionViewModel commentMentionViewModel = this;
                    InterfaceC67352kd<A2G<Boolean>> interfaceC67352kd2 = interfaceC67352kd;
                    EnumC217688gW enumC217688gW2 = enumC217688gW;
                    commentMentionViewModel.getClass();
                    String selfUid2 = commentMentionViewModel.LJLJI;
                    o.LJIIIIZZ(selfUid2, "selfUid");
                    C217738gb.LJFF(selfUid2, LIZIZ, EnumC217758gd.COMMENT, false);
                    C217268fq c217268fq3 = commentMentionViewModel.LJLIL;
                    if (c217268fq3 != null) {
                        String searchKey = LIZIZ.LJLIL.LIZLLL;
                        o.LJIIIZ(searchKey, "searchKey");
                        if (c217268fq3.LIZJ.invoke(searchKey).booleanValue()) {
                            C217268fq c217268fq4 = commentMentionViewModel.LJLIL;
                            if (c217268fq4 != null) {
                                c217268fq4.LIZIZ(true);
                            }
                            String selfUid3 = commentMentionViewModel.LJLJI;
                            o.LJIIIIZZ(selfUid3, "selfUid");
                            C217808gi LIZJ2 = C217738gb.LIZJ(selfUid3, LIZIZ.LJLIL.LIZLLL);
                            if (LIZJ2 != null) {
                                commentMentionViewModel.LJLILLLLZI = LIZJ2;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("CommentMentionItem in onFetchedSearchData() mobParams = ");
                                LIZ.append(commentMentionViewModel.LJLJL);
                                C36922EeM.LIZLLL(3, "CommentLog", X1D.LIZIZ(LIZ));
                                if (enumC217688gW2 == EnumC217688gW.REFRESH) {
                                    List<Y9G> list3 = LIZJ2.LJLILLLLZI;
                                    arrayList2 = new ArrayList(C32I.LJJL(list3, 10));
                                    Iterator<Y9G> it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        arrayList2.add(new C217868go(it2.next(), commentMentionViewModel.LJLJJI, commentMentionViewModel.LJLJL));
                                    }
                                } else {
                                    List<Y9G> list4 = LIZIZ.LJLILLLLZI;
                                    arrayList2 = new ArrayList(C32I.LJJL(list4, 10));
                                    Iterator<Y9G> it3 = list4.iterator();
                                    while (it3.hasNext()) {
                                        arrayList2.add(new C217868go(it3.next(), commentMentionViewModel.LJLJJI, commentMentionViewModel.LJLJL));
                                    }
                                }
                                C8WS.LIZIZ.LIZLLL = System.currentTimeMillis();
                                if (LIZIZ.LJLIL.LIZJ) {
                                    A2F a2f = A2G.LIZ;
                                    Boolean bool = Boolean.TRUE;
                                    a2f.getClass();
                                    A2V LIZLLL = A2F.LIZLLL(bool, bool, arrayList2);
                                    C3C5.m7constructorimpl(LIZLLL);
                                    interfaceC67352kd2.resumeWith(LIZLLL);
                                } else {
                                    A2G.LIZ.getClass();
                                    A2H LIZ2 = A2F.LIZ(arrayList2);
                                    C3C5.m7constructorimpl(LIZ2);
                                    interfaceC67352kd2.resumeWith(LIZ2);
                                }
                                C217808gi c217808gi = commentMentionViewModel.LJLILLLLZI;
                                if ((c217808gi == null || (list2 = c217808gi.LJLILLLLZI) == null || list2.isEmpty()) && (c217268fq2 = commentMentionViewModel.LJLIL) != null) {
                                    C8WO c8wo = c217268fq2.LIZ;
                                    c8wo.LIZJ = false;
                                    C8WT c8wt = c8wo.LIZIZ;
                                    if (c8wt != null && (mentionSearchLayout = c8wt.getMentionSearchLayout()) != null) {
                                        mentionSearchLayout.LIZ();
                                    }
                                }
                                C7DS.LIZ("trending_show", new AqS134S0200000_3(LIZIZ, LIZJ2, 273));
                            }
                        }
                    }
                } else {
                    C217268fq c217268fq5 = this.LJLIL;
                    if (c217268fq5 != null) {
                        c217268fq5.LIZIZ(true);
                    }
                    InterfaceC67352kd<A2G<Boolean>> interfaceC67352kd3 = interfaceC67352kd;
                    A2F a2f2 = A2G.LIZ;
                    Exception exc = new Exception();
                    a2f2.getClass();
                    A2I LIZJ3 = A2F.LIZJ(exc);
                    C3C5.m7constructorimpl(LIZJ3);
                    interfaceC67352kd3.resumeWith(LIZJ3);
                    if (enumC217688gW == EnumC217688gW.REFRESH && (c217268fq = this.LJLIL) != null) {
                        c217268fq.LIZ();
                    }
                }
                return C76800UCe.LIZ;
            }
        }, C10K.LJIIIIZZ, null);
    }

    public final void kv0(C217808gi c217808gi, InterfaceC67352kd<? super A2G<Boolean>> interfaceC67352kd, EnumC217688gW enumC217688gW) {
        C212808Wu mentionSearchLayout;
        ArrayList arrayList;
        C217268fq c217268fq;
        C212808Wu mentionSearchLayout2;
        List<Y9G> list;
        String selfUid = this.LJLJI;
        o.LJIIIIZZ(selfUid, "selfUid");
        C217738gb.LJFF(selfUid, c217808gi, EnumC217758gd.COMMENT, iv0());
        C217268fq c217268fq2 = this.LJLIL;
        if (c217268fq2 != null && c217268fq2.LIZJ.invoke("").booleanValue()) {
            C217268fq c217268fq3 = this.LJLIL;
            if (c217268fq3 != null) {
                c217268fq3.LIZIZ(true);
            }
            String selfUid2 = this.LJLJI;
            o.LJIIIIZZ(selfUid2, "selfUid");
            C217808gi LIZIZ = C217738gb.LIZIZ(selfUid2);
            if (LIZIZ != null) {
                this.LJLILLLLZI = LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("CommentMentionItem in onFetchedRecommendData() mobParams = ");
                LIZ.append(this.LJLJL);
                C36922EeM.LIZLLL(3, "CommentLog", X1D.LIZIZ(LIZ));
                if (enumC217688gW == EnumC217688gW.REFRESH) {
                    List<Y9G> list2 = LIZIZ.LJLILLLLZI;
                    arrayList = new ArrayList(C32I.LJJL(list2, 10));
                    Iterator<Y9G> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new C217868go(it.next(), this.LJLJJI, this.LJLJL));
                    }
                } else {
                    List<Y9G> list3 = c217808gi.LJLILLLLZI;
                    arrayList = new ArrayList(C32I.LJJL(list3, 10));
                    Iterator<Y9G> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new C217868go(it2.next(), this.LJLJJI, this.LJLJL));
                    }
                }
                C8WS.LIZIZ.LIZLLL = System.currentTimeMillis();
                if (c217808gi.LJLIL.LIZJ) {
                    A2F a2f = A2G.LIZ;
                    Boolean bool = Boolean.TRUE;
                    a2f.getClass();
                    A2V LIZLLL = A2F.LIZLLL(bool, bool, arrayList);
                    C3C5.m7constructorimpl(LIZLLL);
                    interfaceC67352kd.resumeWith(LIZLLL);
                } else {
                    A2G.LIZ.getClass();
                    A2H LIZ2 = A2F.LIZ(arrayList);
                    C3C5.m7constructorimpl(LIZ2);
                    interfaceC67352kd.resumeWith(LIZ2);
                }
                C217808gi c217808gi2 = this.LJLILLLLZI;
                if ((c217808gi2 == null || (list = c217808gi2.LJLILLLLZI) == null || list.isEmpty()) && (c217268fq = this.LJLIL) != null) {
                    C8WO c8wo = c217268fq.LIZ;
                    c8wo.LIZJ = false;
                    C8WT c8wt = c8wo.LIZIZ;
                    if (c8wt != null && (mentionSearchLayout2 = c8wt.getMentionSearchLayout()) != null) {
                        mentionSearchLayout2.LIZ();
                        return;
                    }
                    return;
                }
                return;
            }
            C217268fq c217268fq4 = this.LJLIL;
            if (c217268fq4 != null) {
                C8WO c8wo2 = c217268fq4.LIZ;
                c8wo2.LIZJ = false;
                C8WT c8wt2 = c8wo2.LIZIZ;
                if (c8wt2 != null && (mentionSearchLayout = c8wt2.getMentionSearchLayout()) != null) {
                    mentionSearchLayout.LIZ();
                }
            }
        }
    }

    public static void gv0(CommentMentionViewModel commentMentionViewModel, int i, EnumC217688gW enumC217688gW, InterfaceC67352kd interfaceC67352kd) {
        int i2;
        long j;
        if (commentMentionViewModel.iv0()) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        if (commentMentionViewModel.iv0()) {
            j = 7;
        } else {
            j = 3;
        }
        int i3 = C217678gV.LIZ[enumC217688gW.ordinal()];
        if (i3 != 1) {
            if (i3 != 2) {
                return;
            }
            MentionNetworkApi.LIZIZ.queryFollowFriends(20, i, Integer.valueOf(i2)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS24S0300000_3(commentMentionViewModel, interfaceC67352kd, enumC217688gW, 3));
        } else {
            MentionNetworkApi mentionNetworkApi = MentionNetworkApi.LIZIZ;
            AbstractC73672Svk.LJJLL(mentionNetworkApi.queryRecentFriends(j), mentionNetworkApi.queryFollowFriends(20, i, Integer.valueOf(i2)), C217818gj.LJLJI).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new IDxS24S0300000_3(commentMentionViewModel, interfaceC67352kd, enumC217688gW, 2));
        }
    }
}
