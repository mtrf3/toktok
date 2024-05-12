package com.ss.android.ugc.aweme.comment.likelist.viewmodel;

import X.AnonymousClass798;
import X.AnonymousClass799;
import X.C175046tw;
import X.C176616wT;
import X.C1810278o;
import X.C1810378p;
import X.C1811378z;
import X.C1A8;
import X.C221018lt;
import X.C221108m2;
import X.C36922EeM;
import X.C38891fp;
import X.C42625Go9;
import X.C62822Ol8;
import X.C71Y;
import X.C73318Sq2;
import X.C73433Srt;
import X.C73969T1h;
import X.C78999UzT;
import X.C79B;
import X.C79C;
import X.C79D;
import X.C79E;
import X.C79F;
import X.C79G;
import X.C79H;
import X.C79I;
import X.C79J;
import X.C79K;
import X.C79N;
import X.EnumC1810178n;
import X.HG3;
import X.OSZ;
import X.QD3;
import X.RBX;
import X.T16;
import X.X1D;
import Y.AfS21S1300000_3;
import Y.AfS6S1110000_3;
import android.util.LruCache;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.comment.commentpage.model.PaginationCursor;
import com.ss.android.ugc.aweme.comment.likelist.api.LikeApi;
import com.ss.android.ugc.aweme.comment.likelist.model.LikeListResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.profile.model.User;
import defpackage.i0;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes4.dex */
public final class LikeListVM extends ViewModel {
    public static final /* synthetic */ int LJLLLL = 0;
    public BubbleBridge LJLIL;
    public String LJLILLLLZI = "";
    public final C62822Ol8 LJLJI = C221108m2.LIZIZ(C79E.LJLIL);
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C79C.LJLIL);
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(C79D.LJLIL);
    public final C62822Ol8 LJLJJLL = C221108m2.LIZIZ(C79F.LJLIL);
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(C79B.LJLIL);
    public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C79K.LJLIL);
    public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C79I.LJLIL);
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(C79G.LJLIL);
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(C79J.LJLIL);
    public final C176616wT LJLLILLLL = new C176616wT();
    public String LJLLJ = "";
    public final C62822Ol8 LJLLL = C221108m2.LIZIZ(C79H.LJLIL);

    public final LruCache<String, LikeListResponse> gv0() {
        return (LruCache) this.LJLJJI.getValue();
    }

    public final Map<String, Long> hv0() {
        return (Map) this.LJLJJL.getValue();
    }

    public final NextLiveData<Boolean> kv0() {
        return (NextLiveData) this.LJLL.getValue();
    }

    public LikeListVM() {
        C42625Go9.LIZIZ(this);
    }

    public final LikeListResponse jv0() {
        return gv0().get(this.LJLILLLLZI);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        ((C73318Sq2) this.LJLJLJ.getValue()).LIZLLL();
        C42625Go9.LIZJ(this);
    }

    public final long iv0(Aweme aweme) {
        Long valueOf;
        if (aweme == null) {
            return 0L;
        }
        Long l = hv0().get(aweme.getAid());
        if (l != null) {
            return l.longValue();
        }
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics == null || (valueOf = Long.valueOf(statistics.getDiggCount())) == null) {
            return 0L;
        }
        return valueOf.longValue();
    }

    public final void mv0(String str) {
        this.LJLLILLLL.LJ();
        C176616wT c176616wT = this.LJLLILLLL;
        c176616wT.getClass();
        c176616wT.LIZLLL = "ttk_aweme_like_list_api_monitor";
        this.LJLLILLLL.LIZJ(str, "gid");
        if (this.LJLLJ.length() > 0) {
            this.LJLLILLLL.LIZIZ(this.LJLLJ, "enter_from");
        }
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onBlockUserEvent(C175046tw c175046tw) {
        User user;
        String uid;
        LikeListResponse jv0;
        List<User> likeList;
        Long l;
        if (c175046tw == null || (user = c175046tw.LJLIL) == null || (uid = user.getUid()) == null || (jv0 = jv0()) == null || (likeList = jv0.getLikeList()) == null) {
            return;
        }
        ListIterator<User> listIterator = likeList.listIterator();
        boolean z = false;
        while (listIterator.hasNext()) {
            if (o.LJ(listIterator.next().getUid(), uid)) {
                listIterator.remove();
                z = true;
            }
        }
        if (z && (l = hv0().get(this.LJLILLLLZI)) != null && l.longValue() > 0) {
            hv0().put(this.LJLILLLLZI, Long.valueOf(l.longValue() - 1));
            C1811378z.LIZIZ(this.LJLILLLLZI, l.longValue() - 1, null);
        }
        ((LiveData) this.LJLJJLL.getValue()).setValue(c175046tw.LJLIL);
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onSyncDiggStateEvent(AnonymousClass799 anonymousClass799) {
        List<User> list;
        C79N c79n;
        LikeListResponse jv0 = jv0();
        User user = null;
        if (jv0 != null) {
            list = jv0.getLikeList();
        } else {
            list = null;
        }
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        if (anonymousClass799 != null) {
            c79n = anonymousClass799.LJLJJI;
        } else {
            c79n = null;
        }
        if (c79n == C79N.ICON && o.LJ(anonymousClass799.LJLIL, this.LJLILLLLZI) && list != null && curUser != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onSyncDiggStateEvent, receive event=");
            LIZ.append(anonymousClass799);
            C221018lt.LJFF("LikeListVM", X1D.LIZIZ(LIZ));
            hv0().put(this.LJLILLLLZI, Long.valueOf(anonymousClass799.LJLILLLLZI));
            int i = 0;
            if (anonymousClass799.LJLJI == 1) {
                Iterator<User> it = list.iterator();
                while (it.hasNext()) {
                    if (o.LJ(it.next().getUid(), curUser.getUid())) {
                    }
                }
                ListProtector.add(list, 0, curUser);
                user = curUser;
                ((LiveData) this.LJLJL.getValue()).setValue(new OSZ(anonymousClass799, user));
            }
            if (anonymousClass799.LJLJI == 0) {
                Iterator<User> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (o.LJ(it2.next().getUid(), curUser.getUid())) {
                        if (i >= 0) {
                            ListProtector.remove(list, i);
                        }
                    } else {
                        i++;
                    }
                }
            }
            ((LiveData) this.LJLJL.getValue()).setValue(new OSZ(anonymousClass799, user));
        }
    }

    /* loaded from: classes4.dex */
    public static final class BubbleBridge extends ILikedListViewModel {
        public final LikeListVM LJLJL;
        public final C62822Ol8 LJLJLJ = C221108m2.LIZIZ(C1810278o.LJLIL);
        public final C62822Ol8 LJLJLLL = C221108m2.LIZIZ(C1810378p.LJLIL);

        public BubbleBridge(LikeListVM likeListVM, LifecycleOwner lifecycleOwner) {
            this.LJLJL = likeListVM;
            this.LJLJI = lifecycleOwner;
        }

        public final void lv0(String aid, PaginationCursor paginationCursor) {
            o.LJIIIZ(aid, "aid");
            o.LJIIIZ(paginationCursor, "paginationCursor");
            boolean z = false;
            if (aid.length() == 0) {
                if (C36922EeM.LIZ) {
                    C36922EeM.LIZLLL(5, "LikeListVM", "fetchLikeList aid is empty");
                }
            } else {
                if (paginationCursor.getCursor() == 0 && paginationCursor.getOffset() == 0) {
                    z = true;
                    ((Set) this.LJLJLLL.getValue()).clear();
                }
                this.LJLJL.mv0(aid);
                C78999UzT.LJFF(((LikeApi.Api) LikeApi.LIZIZ.getValue()).fetchLikeList(aid, paginationCursor.getCursor(), paginationCursor.getOffset(), 20, null, EnumC1810178n.BULLET.getValue()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS6S1110000_3(this, aid, z, 0), new AfS6S1110000_3(this, aid, z, 1)), (C73318Sq2) this.LJLJL.LJLJLJ.getValue());
            }
        }
    }

    public final void lv0(AnonymousClass798 anonymousClass798, C73433Srt c73433Srt) {
        long j;
        long j2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request start, req:");
        LIZ.append(anonymousClass798);
        C71Y.LIZLLL("LikeListVM", X1D.LIZIZ(LIZ));
        String str = anonymousClass798.LIZ;
        if (str.length() != 0) {
            Object obj = ((LruCache) this.LJLJI.getValue()).get(str);
            Boolean bool = Boolean.TRUE;
            if (!o.LJ(obj, bool)) {
                ((LruCache) this.LJLJI.getValue()).put(str, bool);
                if (!anonymousClass798.LIZIZ) {
                    LikeListResponse likeListResponse = gv0().get(str);
                    if (likeListResponse != null) {
                        j2 = likeListResponse.getCursor();
                    } else {
                        j2 = 0;
                    }
                    LikeListResponse likeListResponse2 = gv0().get(str);
                    if (likeListResponse2 != null) {
                        j = likeListResponse2.getOffset();
                    } else {
                        j = 0;
                    }
                    if (j2 <= 0) {
                        C71Y.LIZIZ("LikeListVM", "request, cursor invalid");
                    }
                } else {
                    ((Set) this.LJLLL.getValue()).clear();
                    j = 0;
                    j2 = 0;
                }
                mv0(str);
                C78999UzT.LJFF(((LikeApi.Api) LikeApi.LIZIZ.getValue()).fetchLikeList(str, j2, j, anonymousClass798.LIZLLL, anonymousClass798.LJ, anonymousClass798.LIZJ.getValue()).LJJL(T16.LIZ()).LJJIJL(C1A8.LJLIL).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS21S1300000_3(anonymousClass798, this, c73433Srt, str, 1), new AfS21S1300000_3(anonymousClass798, this, c73433Srt, str, 2)), (C73318Sq2) this.LJLJLJ.getValue());
                return;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("request invalid, aid:");
        LIZ2.append(str);
        C71Y.LIZIZ("LikeListVM", X1D.LIZIZ(LIZ2));
        C38891fp.LJJIIZI(c73433Srt, new IllegalStateException(i0.LJFF("request invalid, aid:", str)));
    }
}
