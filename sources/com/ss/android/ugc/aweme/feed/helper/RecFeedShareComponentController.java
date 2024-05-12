package com.ss.android.ugc.aweme.feed.helper;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C221018lt;
import X.C2KB;
import X.C2MA;
import X.C40883G2t;
import X.C47261Igj;
import X.C48841JEv;
import X.C50420Jqa;
import X.C53282Kve;
import X.C55758LuU;
import X.C55761LuX;
import X.C55773Luj;
import X.C57135Mbb;
import X.C61878OQg;
import X.C73318Sq2;
import X.C73969T1h;
import X.C76302z4;
import X.C77266UUc;
import X.C78999UzT;
import X.C88293dJ;
import X.DVO;
import X.EXV;
import X.EnumC57171McB;
import X.FW5;
import X.InterfaceC55031Lil;
import X.InterfaceC55062LjG;
import X.InterfaceC55219Lln;
import X.InterfaceC55759LuV;
import X.LJK;
import X.ORZ;
import X.QD3;
import X.T16;
import X.X1D;
import X.XKX;
import Y.AObserverS65S0200000_1;
import Y.AfS18S1200000_9;
import Y.AfS61S0100000_9;
import Y.IDaS219S0100000_9;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.adapter.VideoBaseCell;
import com.ss.android.ugc.aweme.feed.assem.sharer.VideoExposeSharerInformationVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ExposeSharerData;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.api.InviteFriendsApiService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import ujb.s;

/* loaded from: classes10.dex */
public final class RecFeedShareComponentController implements LifecycleEventObserver {
    public static boolean LJLLL;
    public final BaseListFragmentPanel LJLIL;
    public boolean LJLILLLLZI;
    public ExposeSharerData LJLJI;
    public final C73318Sq2 LJLJJI;
    public boolean LJLJJL;
    public String LJLJJLL;
    public InterfaceC55031Lil LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public Aweme LJLL;
    public final List<Aweme> LJLLI;
    public List<Aweme> LJLLILLLL;
    public InterfaceC55759LuV LJLLJ;

    public final void onDestroy() {
        this.LJLJLLL = false;
        this.LJLIL.getFragment().getLifecycle().removeObserver(this);
        EventBus.LIZJ().LJIJ(this);
        C221018lt.LIZ("@LinkRelation_OldLogic", "share component destroy");
    }

    public final void LIZIZ() {
        if (this.LJLJLJ) {
            return;
        }
        this.LJLJLJ = true;
        if (LJLLL) {
            this.LJLIL.onInternalEvent(new C50420Jqa(44));
        }
        Aweme aweme = this.LJLL;
        if (aweme != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("insert the cache aweme: ");
            LIZ.append(aweme.getAid());
            C221018lt.LJFF("@LinkRelation_OldLogic", X1D.LIZIZ(LIZ));
            LIZLLL(aweme);
            this.LJLL = null;
        }
    }

    public final void LJIIIIZZ() {
        if (this.LJLJLLL) {
            return;
        }
        EventBus.LIZJ().LJIILJJIL(this);
        this.LJLIL.getFragment().getLifecycle().addObserver(this);
        ActivityC45651qj requireActivity = this.LJLIL.getFragment().requireActivity();
        o.LJIIIIZZ(requireActivity, "panel.fragment.requireActivity()");
        C77266UUc.LIZIZ.getRelationService().LJFF().observe(requireActivity, new AObserverS65S0200000_1(requireActivity, this, 6));
        this.LJLJLLL = true;
    }

    public RecFeedShareComponentController(BaseListFragmentPanel panel) {
        o.LJIIIZ(panel, "panel");
        this.LJLIL = panel;
        this.LJLJJI = new C73318Sq2();
        this.LJLLI = new ArrayList();
        this.LJLLILLLL = new ArrayList();
    }

    public static final boolean LJ(ActivityC45651qj activityC45651qj) {
        Intent intent;
        boolean z;
        boolean z2;
        boolean z3;
        String LLJJIJIIJIL;
        String LLJJIJIIJIL2;
        if (activityC45651qj == null || (intent = activityC45651qj.getIntent()) == null) {
            return false;
        }
        boolean booleanExtra = intent.getBooleanExtra("from_notification", false);
        Intent intent2 = activityC45651qj.getIntent();
        if (intent2 == null) {
            return false;
        }
        boolean booleanExtra2 = intent2.getBooleanExtra("share_expose_sharer", false);
        Intent intent3 = activityC45651qj.getIntent();
        if (intent3 != null && (LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(intent3, "gids")) != null && LLJJIJIIJIL2.length() > 0 && !s.LJJJLZIJ(LLJJIJIIJIL2, ",", false)) {
            z = true;
        } else {
            z = false;
        }
        Intent intent4 = activityC45651qj.getIntent();
        if (intent4 != null && (LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent4, "share_url")) != null && LLJJIJIIJIL.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean booleanValue = ((Boolean) C53282Kve.LIZ.getValue()).booleanValue();
        if (booleanExtra || !booleanExtra2 || !z3 || !booleanValue || ((Boolean) DVO.LIZIZ.getValue()).booleanValue()) {
            C221018lt.LJFF("@LinkRelation_OldLogic", "not intercept shared logic. ");
            return false;
        }
        C221018lt.LJFF("@LinkRelation_OldLogic", "intercept shared logic. ");
        Intent intent5 = activityC45651qj.getIntent();
        if (intent5 != null) {
            intent5.removeExtra("from_notification");
        }
        return true;
    }

    public static void LJI(C2MA c2ma) {
        VideoBaseCell videoBaseCell;
        if (c2ma instanceof InterfaceC55219Lln) {
            ((InterfaceC55219Lln) c2ma).LLI().jv0(Boolean.TRUE, "show_expose_sharer_info_view");
            if ((c2ma instanceof VideoBaseCell) && (videoBaseCell = (VideoBaseCell) c2ma) != null && videoBaseCell.LJLJJLL() == 2) {
                VideoExposeSharerInformationVM LIZIZ = C88293dJ.LIZIZ(c2ma);
                if (LIZIZ != null) {
                    LIZIZ.setState(new AqS8S0010000_3(32));
                }
                C221018lt.LJFF("@LinkRelation", "refresh the vh!");
            }
        }
    }

    public final boolean LIZ(C2MA c2ma) {
        if (c2ma != null && c2ma.getAweme() != null && LJFF(c2ma.getAweme())) {
            LIZJ(c2ma.getAweme());
            LJI(c2ma);
            return true;
        }
        return false;
    }

    public final boolean LIZJ(Aweme aweme) {
        User user;
        ExposeSharerData exposeSharerData = this.LJLJI;
        if (exposeSharerData != null) {
            user = exposeSharerData.sharer;
        } else {
            user = null;
        }
        if (LJFF(aweme) && user != null) {
            C221018lt.LJFF("@LinkRelation_OldLogic", "online logic, set sharer to aweme!");
            o.LJI(aweme);
            aweme.setSharer(user);
            this.LJLJJL = true;
            return true;
        }
        return false;
    }

    public final void LIZLLL(Aweme aweme) {
        String str;
        Aweme aweme2;
        String str2;
        String str3;
        User sharer;
        int i;
        User sharer2;
        int i2 = 0;
        if (aweme.getSharer() != null) {
            User sharer3 = aweme.getSharer();
            if (sharer3 != null) {
                str3 = sharer3.getUid();
            } else {
                str3 = null;
            }
            String aid = aweme.getAid();
            List<Aweme> list = this.LJLLILLLL;
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (hashSet.add(((Aweme) next).getAid())) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Aweme aweme3 = (Aweme) it2.next();
                if (aweme3 != null && (sharer2 = aweme3.getSharer()) != null && o.LJ(sharer2.getUid(), str3)) {
                    arrayList2.add(aweme3);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Aweme aweme4 = (Aweme) it3.next();
                if (o.LJ(aweme4.getAid(), aid)) {
                    arrayList3.add(aweme4);
                }
            }
            if ((!arrayList3.isEmpty()) && (sharer = aweme.getSharer()) != null) {
                User sharer4 = ((Aweme) ListProtector.get(arrayList3, 0)).getSharer();
                if (sharer4 != null) {
                    i = sharer4.getFollowStatus();
                } else {
                    i = 0;
                }
                sharer.setFollowStatus(i);
            }
        }
        if (!this.LJLJLJ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("first frame not rendered, cache insert aweme: ");
            LIZ.append(aweme.getAid());
            C221018lt.LJFF("@LinkRelation_OldLogic", X1D.LIZIZ(LIZ));
            this.LJLL = aweme;
            return;
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("first frame rendered, insert to list ");
        LIZ2.append(aweme.getAid());
        C221018lt.LJFF("@LinkRelation_OldLogic", X1D.LIZIZ(LIZ2));
        Aweme currentAweme = this.LJLIL.getCurrentAweme();
        if (currentAweme != null) {
            str = currentAweme.getAid();
        } else {
            str = null;
        }
        if (o.LJ(str, aweme.getAid())) {
            User sharer5 = aweme.getSharer();
            if (sharer5 != null) {
                if (currentAweme != null) {
                    currentAweme.setSharer(sharer5);
                }
                LJI(this.LJLIL.getCurFeedViewHolder());
            }
            C221018lt.LJFF("@LinkRelation_OldLogic", "current aweme is target, might refresh vh!");
            return;
        }
        List LLJI = ORZ.LLJI(this.LJLIL.getAdapter().Q8());
        int size = LLJI.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (ListProtector.get(LLJI, i3) != null && (aweme2 = (Aweme) ListProtector.get(LLJI, i3)) != null && aweme2.getAid() != null) {
                Aweme aweme5 = (Aweme) ListProtector.get(LLJI, i3);
                if (aweme5 != null) {
                    str2 = aweme5.getAid();
                } else {
                    str2 = null;
                }
                if (o.LJ(str2, aweme.getAid())) {
                    if (i3 != -1) {
                        this.LJLIL.getAdapter().LJ(i3);
                    }
                }
            }
            i3++;
        }
        String requestId = aweme.getRequestId();
        if (requestId == null) {
            requestId = "";
        }
        int curIndex = this.LJLIL.getCurIndex() + 1;
        FW5.LJIIJJI(0, requestId, C47261Igj.LJJIJIL(aweme));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("curIndex: ");
        LIZ3.append(this.LJLIL.getCurIndex());
        LIZ3.append(", insert aweme(");
        LIZ3.append(aweme.getAid());
        LIZ3.append(") to ");
        LIZ3.append(curIndex);
        C221018lt.LIZ("@LinkRelation_OldLogic", X1D.LIZIZ(LIZ3));
        try {
            this.LJLIL.insertItemList(new C2KB<>(curIndex, "shared_video", Collections.singletonList(aweme)));
            Iterator<Aweme> it4 = this.LJLIL.getAdapter().Q8().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                if (!o.LJ(it4.next().getAid(), aweme.getAid())) {
                    i2++;
                } else if (i2 != -1) {
                    this.LJLIL.setCurrentItem(i2, true);
                }
            }
            C221018lt.LIZIZ("@LinkRelation", "Error case found that no desired aweme found in panel.");
        } catch (Exception e) {
            C221018lt.LIZJ("@LinkRelation_OldLogic", "insert aweme error", e);
        }
        LJI(this.LJLIL.getCurFeedViewHolder());
    }

    public final boolean LJFF(Aweme aweme) {
        if (aweme != null && TextUtils.equals(aweme.getAid(), this.LJLJJLL)) {
            return true;
        }
        return false;
    }

    public final void LJIIIZ(boolean z) {
        LJIIIIZZ();
        InterfaceC55759LuV interfaceC55759LuV = this.LJLLJ;
        if (interfaceC55759LuV != null) {
            interfaceC55759LuV.LIZ(C55761LuX.LIZ);
        }
        InterfaceC55759LuV LJFF = C57135Mbb.LIZIZ.LJFF();
        C40883G2t c40883G2t = new C40883G2t();
        c40883G2t.LIZLLL("enter_from", this.LJLIL.getEventType());
        Bundle extra = (Bundle) c40883G2t.LIZ;
        LJFF.LIZJ(new C55758LuU(this, z));
        ActivityC45651qj requireActivity = this.LJLIL.getFragment().requireActivity();
        o.LJIIIIZZ(requireActivity, "panel.fragment.requireActivity()");
        o.LJIIIIZZ(extra, "extra");
        LJFF.LIZIZ(extra, requireActivity);
        this.LJLLJ = LJFF;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onFeedRefreshEvent(LJK ljk) {
        if (ljk != null) {
            onDestroy();
        }
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onFollowStatusEvent(FollowStatusEvent followStatusEvent) {
        FollowStatus followStatus;
        if (followStatusEvent == null || (followStatus = followStatusEvent.status) == null) {
            return;
        }
        String str = followStatus.userId;
        o.LJIIIIZZ(str, "followStatus.userId");
        LJIIJ(followStatus.followStatus, followStatus.followerStatus, str);
    }

    public final void LJII(C55773Luj c55773Luj, String str) {
        String str2;
        if (c55773Luj.LJI && !this.LJLILLLLZI) {
            if ((c55773Luj.LJIIL != 0 || str == null || str.length() == 0) && (c55773Luj.LJIIL != 1 || (str2 = c55773Luj.LJIIJJI) == null || str2.length() == 0)) {
                return;
            }
            if (c55773Luj.LJIIL != 1 && o.LJ(this.LJLJJLL, str)) {
                return;
            }
            this.LJLJJLL = str;
            this.LJLILLLLZI = true;
            this.LJLJJL = false;
            InviteFriendsApiService inviteFriendsApiService = InviteFriendsApiService.LIZIZ;
            String str3 = c55773Luj.LIZLLL;
            EnumC57171McB enumC57171McB = c55773Luj.LIZ;
            if (enumC57171McB == null) {
                enumC57171McB = EnumC57171McB.DEFAULT;
            }
            int rawValue = enumC57171McB.getRawValue();
            String str4 = c55773Luj.LIZJ;
            String str5 = c55773Luj.LJ;
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            String str7 = c55773Luj.LJFF;
            if (str7 != null) {
                str6 = str7;
            }
            C78999UzT.LJFF(inviteFriendsApiService.getSharerInfo(str3, rawValue, str4, str5, str6, str, c55773Luj.LJII, c55773Luj.LJIIIIZZ, c55773Luj.LJIIIZ, c55773Luj.LJIIJJI, c55773Luj.LJIIL).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLL(new AfS18S1200000_9(c55773Luj, str, this, 1), new AfS61S0100000_9(this, 88), new IDaS219S0100000_9(this, 7)), this.LJLJJI);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    public final void LJIIJ(int i, int i2, String str) {
        List<Aweme> list;
        User sharer;
        User sharer2;
        InterfaceC55062LjG adapter = this.LJLIL.getAdapter();
        if (adapter == null || (list = adapter.Q8()) == null) {
            list = C61878OQg.INSTANCE;
        }
        List LLIIIZ = ORZ.LLIIIZ(this.LJLLI, list);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LLIIIZ).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(((Aweme) next).getAid())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Aweme aweme = (Aweme) it2.next();
            if (aweme != null && (sharer2 = aweme.getSharer()) != null && o.LJ(sharer2.getUid(), str) && sharer2.getFollowStatus() != i) {
                arrayList2.add(aweme);
            }
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Aweme aweme2 = (Aweme) it3.next();
            User sharer3 = aweme2.getSharer();
            if (sharer3 != null) {
                sharer3.setFollowStatus(i);
            }
            if (i2 != -1 && (sharer = aweme2.getSharer()) != null) {
                sharer.setFollowerStatus(i2);
            }
        }
        C221018lt.LJFF("@LinkRelation_OldLogic", "need update aweme size: " + arrayList2.size());
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            this.LJLLILLLL = arrayList3;
            arrayList3.addAll(arrayList2);
            XKX.LIZLLL(C48841JEv.LIZ(EXV.LIZ), null, null, new C76302z4(arrayList2, this, i, null), 3);
        }
    }
}
