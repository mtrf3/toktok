package com.ss.android.ugc.aweme.friendstab.service;

import X.ASL;
import X.AbstractC73672Svk;
import X.ActivityC45651qj;
import X.AnonymousClass028;
import X.C00F;
import X.C16880lQ;
import X.C16970lZ;
import X.C1DG;
import X.C206928Ae;
import X.C210268Na;
import X.C224588re;
import X.C36922EeM;
import X.C38619FDr;
import X.C53295Kvr;
import X.C53414Kxm;
import X.C54014LHu;
import X.C54028LIi;
import X.C54374LVq;
import X.C54838Lfe;
import X.C54851Lfr;
import X.C57763Mlj;
import X.C58096Mr6;
import X.C73411SrX;
import X.DR0;
import X.HG3;
import X.InterfaceC36571c5;
import X.L78;
import X.LHM;
import X.LIA;
import X.LIB;
import X.LII;
import X.LIJ;
import X.LIL;
import X.LIN;
import X.LIO;
import X.LTD;
import X.OSJ;
import X.RBX;
import X.SY4;
import X.X1D;
import Y.ACListenerS29S0100000_9;
import Y.IDCSpanS29S0100000_3;
import Y.IDDListenerS148S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.hox.Hox;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedInsertRelationManager;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPerfOptPhase2;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import com.ss.android.ugc.aweme.friendstab.preload.FriendsFeedPreloadPolling;
import com.ss.android.ugc.aweme.friendstab.tab.StateOwner;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public final class FriendsFeedServiceImpl implements IFriendsFeedService {
    public LIN LIZ;

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJIILJJIL() {
    }

    public static IFriendsFeedService LJJJIL() {
        Object LIZ = C58096Mr6.LIZ(IFriendsFeedService.class, false);
        if (LIZ != null) {
            return (IFriendsFeedService) LIZ;
        }
        if (C58096Mr6.Z0 == null) {
            synchronized (IFriendsFeedService.class) {
                if (C58096Mr6.Z0 == null) {
                    C58096Mr6.Z0 = new FriendsFeedServiceImpl();
                }
            }
        }
        return C58096Mr6.Z0;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean LIZJ() {
        return !LIO.LIZ.isEmpty();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final String LJ() {
        String str = LIL.LIZ;
        if (str == null) {
            return "";
        }
        return str;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJII() {
        LTD.LJLILLLLZI = 0L;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final int LJIILIIL() {
        int i;
        Set<String> set = C54014LHu.LIZ;
        if (set != null) {
            i = set.size();
        } else {
            i = 0;
        }
        Set<String> set2 = C54014LHu.LIZ;
        if (set2 != null) {
            set2.clear();
        }
        return i;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final long LJIILL() {
        return C53414Kxm.LJLJI.getLong("client_read_gids_report_time", 0L);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJIJJLI() {
        StateOwner.LJLIL.getClass();
        StateOwner.LJLLL = true;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJIL() {
        StateOwner.LJLIL.getClass();
        StateOwner.LJLLLL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJI() {
        /*
            r8 = this;
            X.LHM r0 = X.LHM.LIZIZ
            com.ss.android.ugc.aweme.friendstab.service.ISocial2TabDelegateService r0 = r0.LIZ()
            boolean r0 = r0.shouldShowFriendsTab()
            r7 = 0
            if (r0 != 0) goto Le
            return r7
        Le:
            com.ss.android.ugc.aweme.friendstab.tab.StateOwner r0 = com.ss.android.ugc.aweme.friendstab.tab.StateOwner.LJLIL
            X.1qj r2 = r0.LIZLLL()
            if (r2 != 0) goto L17
            return r7
        L17:
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = X.C116694i1.LIZ(r2)
            java.lang.String r6 = r0.nv0()
            X.7b0 r0 = com.bytedance.hox.Hox.LJLLI
            com.bytedance.hox.Hox r0 = r0.LIZ(r2)
            java.lang.String r5 = "HOME"
            androidx.fragment.app.Fragment r1 = r0.Ja(r5)
            boolean r0 = r1 instanceof X.InterfaceC54054LJi
            if (r0 == 0) goto L38
            X.LJi r1 = (X.InterfaceC54054LJi) r1
            if (r1 == 0) goto L38
            boolean r4 = r1.K2()     // Catch: java.lang.Exception -> L38
            goto L39
        L38:
            r4 = 0
        L39:
            com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabLayoutAbility r1 = X.C53976LGi.LIZJ(r2)
            if (r1 == 0) goto L67
            java.lang.String r0 = "FRIENDS_FEED"
            boolean r3 = r1.ma(r0)
        L45:
            com.ss.android.ugc.aweme.friendstab.interfaces.ISocial2TabProtocolAbility r0 = X.C53976LGi.LJFF(r2)
            if (r0 == 0) goto L51
            java.util.List r2 = r0.L2()
            if (r2 != 0) goto L56
        L51:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L56:
            X.LIj r1 = X.C54029LIj.LIZIZ
            boolean r0 = r1.LJJIJL()
            if (r0 == 0) goto L69
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L69
            return r4
        L67:
            r3 = 0
            goto L45
        L69:
            boolean r0 = r1.LJJIJL()
            if (r0 == 0) goto L79
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r5)
            if (r0 == 0) goto L78
            if (r4 == 0) goto L78
        L77:
            r7 = 1
        L78:
            return r7
        L79:
            java.lang.String r0 = "FRIENDS_TAB"
            boolean r0 = kotlin.jvm.internal.o.LJ(r6, r0)
            if (r0 == 0) goto L78
            if (r3 == 0) goto L78
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.service.FriendsFeedServiceImpl.LJJI():boolean");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJJIII() {
        LIL.LIZ = "";
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJJIIJ() {
        StateOwner.LJLIL.getClass();
        StateOwner.LJLZ = true;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final OSJ LJJIIJZLJL() {
        return C54028LIi.LIZ("new_content_notification");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean LJJIIZ() {
        boolean z;
        if (C00F.LIZ(31744, 1, "tt_publish_landing_to_friends", true) == 1 && ((DR0.LIZ() || FriendsTabTopExperiment.LIZIZ()) && (!C206928Ae.LIZ() || LJJIJL()))) {
            z = true;
        } else {
            z = false;
        }
        int followerCount = AccountService.LJIJ().LJFF().getCurUser().getFollowerCount();
        IAVPublishService publishService = AVExternalServiceImpl.LIZ().publishService();
        PublishModel publishModel = publishService.getPublishModel(publishService.getCurrentPublishTaskId());
        boolean LIZ = C53295Kvr.LIZ();
        StateOwner.LJLIL.getClass();
        if (StateOwner.LJLLL && !LIZ && LHM.LIZIZ.LIZ().shouldShowFriendsTab() && z && followerCount <= 5000 && !C54838Lfe.LJJIJ(publishModel)) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean LJJIJL() {
        if (((Number) FriendsTabTopExperiment.LIZJ.getValue()).intValue() >= 0) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean LJJIZ() {
        return LHM.LIZIZ.LIZ().shouldShowFriendsTab();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJJJ() {
        LIJ lij;
        try {
            ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
            if (LIZLLL == null) {
                return;
            }
            InterfaceC36571c5 Ja = Hox.LJLLI.LIZ(LIZLLL).Ja("FRIENDS_FEED");
            if ((Ja instanceof LIJ) && (lij = (LIJ) Ja) != null) {
                lij.S7();
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean LJJLIIIJLJLI() {
        LIJ lij;
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        if (LIZLLL == null) {
            return false;
        }
        InterfaceC36571c5 Ja = Hox.LJLLI.LIZ(LIZLLL).Ja("FRIENDS_FEED");
        if (!(Ja instanceof LIJ) || (lij = (LIJ) Ja) == null) {
            return false;
        }
        return lij.LJJLIIIJLJLI();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.LIZ() == true) goto L6;
     */
    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.service.INearbyFeedService r0 = com.ss.android.ugc.aweme.service.NearbyFeedServiceImpl.LJJI()
            X.LJd r0 = r0.LJIJ()
            r2 = 0
            if (r0 == 0) goto L22
            boolean r0 = r0.LIZ()
            r1 = 1
            if (r0 != r1) goto L22
        L12:
            X.LJb r0 = X.C54047LJb.LIZIZ
            boolean r0 = r0.LIZ()
            if (r1 != 0) goto L1c
            if (r0 == 0) goto L1d
        L1c:
            return r2
        L1d:
            boolean r2 = r3.LJJIIZ()
            goto L1c
        L22:
            r1 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.friendstab.service.FriendsFeedServiceImpl.LIZ():boolean");
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean LJFF() {
        return !L78.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final boolean LJIIZILJ() {
        boolean LIZIZ = FriendsTabTopExperiment.LIZIZ();
        if (DR0.LIZ() || LIZIZ) {
            return !L78.LIZ();
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJJIL() {
        ((RBX) HG3.LJIILL()).addUserChangeListener(C53414Kxm.LJLIL);
        if (FriendsTabPerfOptPhase2.LIZ().fetchFeedOpt) {
            ((RBX) HG3.LJIILL()).addUserChangeListener(LTD.LJLIL);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final LIN LIZLLL() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LIZIZ(ArrayList<String> arrayList) {
        LIO.LIZ.addAll(0, arrayList);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJI(String str) {
        LIA.LIZ = str;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJIIIIZZ(long j) {
        C53414Kxm.LJLJI.storeLong("client_read_gids_report_time", j);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJIIJ(int i) {
        LIA.LIZLLL = i;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJIIJJI(Context context) {
        if (LJJIJL()) {
            C16970lZ.LJ(R.layout.ayv, context);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJIIL(boolean z) {
        LIO.LIZIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJIILLIIL(ActivityC45651qj activityC45651qj) {
        C16970lZ.LJ(R.layout.ayu, activityC45651qj);
        int i = 0;
        Integer[] numArr = {Integer.valueOf(R.layout.ayt), Integer.valueOf(R.layout.ays)};
        do {
            C16970lZ.LJ(numArr[i].intValue(), activityC45651qj);
            i++;
        } while (i < 2);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJIJ(ActivityC45651qj activityC45651qj) {
        C16970lZ.LJ(R.layout.ab4, activityC45651qj);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJIJJ(Context context) {
        C38619FDr.LIZLLL(R.layout.ab3, context);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJJIFFI(int i) {
        LIA.LIZIZ = i;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJJIJ(int i) {
        LIA.LIZJ = i;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final View LJJIJIIJI(Context context) {
        o.LJIIIZ(context, "context");
        return new C57763Mlj(context);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJJIJIIJIL(boolean z) {
        FriendsFeedPreloadPolling friendsFeedPreloadPolling = FriendsFeedPreloadPolling.LJLIL;
        friendsFeedPreloadPolling.getClass();
        if (C00F.LIZ(31744, 1, "tt_friends_feed_preload_reverse", true) == 1) {
            long j = LTD.LJLILLLLZI;
            long j2 = 0;
            if (j != 0) {
                if (friendsFeedPreloadPolling.LIZ()) {
                    j2 = (friendsFeedPreloadPolling.LIZIZ() + j) - System.currentTimeMillis();
                } else {
                    System.currentTimeMillis();
                    friendsFeedPreloadPolling.LIZIZ();
                }
            }
            C73411SrX c73411SrX = FriendsFeedPreloadPolling.LJLILLLLZI;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            FriendsFeedPreloadPolling.LJLILLLLZI = (C73411SrX) AbstractC73672Svk.LJJIIZI(j2, friendsFeedPreloadPolling.LIZIZ(), TimeUnit.MILLISECONDS).LJJJJZI(new LIB(z));
            ProcessLifecycleOwner.get().getLifecycle().addObserver(friendsFeedPreloadPolling);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJJJI(C224588re c224588re) {
        this.LIZ = c224588re;
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final String LJIIIZ(Activity activity, Aweme aweme) {
        LIJ lij;
        o.LJIIIZ(activity, "activity");
        try {
            InterfaceC36571c5 Ja = Hox.LJLLI.LIZ((ActivityC45651qj) activity).Ja("FRIENDS_FEED");
            Integer num = null;
            if ((Ja instanceof LIJ) && (lij = (LIJ) Ja) != null) {
                num = Integer.valueOf(lij.Bc(aweme));
            }
            int dataLevel = LII.SORT.getDataLevel();
            if (num == null || num.intValue() != dataLevel) {
                int dataLevel2 = LII.HISTORY_UNVIEWED.getDataLevel();
                if (num == null || num.intValue() != dataLevel2) {
                    int dataLevel3 = LII.HISTORY_VIEWED.getDataLevel();
                    if (num == null) {
                        return "";
                    }
                    if (num.intValue() != dataLevel3) {
                        return "";
                    }
                    return "historical_read";
                }
                return "historical_unread";
            }
            return "new";
        } catch (Throwable th) {
            Throwable LJFF = AnonymousClass028.LJFF(th);
            if (LJFF != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("getFeedSourceType error ");
                LIZ.append(LJFF);
                C36922EeM.LJ(X1D.LIZIZ(LIZ));
            }
            return "";
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJIJI(String str, ArrayList arrayList) {
        FeedInsertRelationManager.INSTANCE.put((ArrayList<String>) arrayList, str);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.8Na, android.view.View, java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJJ(final ActivityC45651qj activityC45651qj, AqS159S0100000_9 aqS159S0100000_9) {
        if (activityC45651qj != null) {
            final AttributeSet attributeSet = null;
            final int i = 0;
            ?? r4 = new ConstraintLayout(activityC45651qj, attributeSet, i) { // from class: X.8Na
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(activityC45651qj, attributeSet, i);
                    a1.LJFF(activityC45651qj, "context");
                    if (FriendsTabPerfOptPhase2.LIZ().viewInflateOpt) {
                        C16970lZ.LIZJ(R.layout.ayt, C45804HyK.LJIJJ(activityC45651qj), this, true);
                    } else {
                        View.inflate(activityC45651qj, R.layout.ayt, this);
                    }
                }
            };
            AqS159S0100000_9 aqS159S0100000_92 = new AqS159S0100000_9((C210268Na) r4, 797);
            View findViewById = r4.findViewById(R.id.dol);
            o.LJIIIIZZ(findViewById, "findViewById(R.id.friends_tab_intro_desc2)");
            TextView textView = (TextView) findViewById;
            View findViewById2 = r4.findViewById(R.id.doi);
            o.LJIIIIZZ(findViewById2, "findViewById(R.id.friends_tab_intro_close_button)");
            TuxIconView tuxIconView = (TuxIconView) findViewById2;
            View findViewById3 = r4.findViewById(R.id.doj);
            o.LJIIIIZZ(findViewById3, "findViewById(R.id.friends_tab_intro_cta)");
            SY4 sy4 = (SY4) findViewById3;
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            String string = r4.getContext().getResources().getString(R.string.go0);
            o.LJIIIIZZ(string, "context.resources.getStr…_banner_desc_placeholder)");
            String string2 = r4.getContext().getResources().getString(R.string.gnz, string);
            o.LJIIIIZZ(string2, "context.resources.getStr…banner_desc, suggestLink)");
            int LJJLIIIJL = s.LJJLIIIJL(string2, string, 0, false, 6);
            int length = string.length() + LJJLIIIJL;
            SpannableString spannableString = new SpannableString(string2);
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string) && LJJLIIIJL >= 0) {
                spannableString.setSpan(new IDCSpanS29S0100000_3(r4, 4), LJJLIIIJL, length, 34);
            }
            textView.setText(spannableString);
            C16880lQ.LJJJ(tuxIconView, new ACListenerS29S0100000_9(aqS159S0100000_92, 106));
            C16880lQ.LJJIZ(sy4, new ACListenerS29S0100000_9(aqS159S0100000_92, 107));
            ASL asl = new ASL();
            asl.LJI(1);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLI = r4;
            tuxSheet.LJLILLLLZI = new IDDListenerS148S0100000_9(aqS159S0100000_9, 3);
            C1DG.LJII(activityC45651qj, "it.supportFragmentManager", tuxSheet, "FriendsTabIntroPanel");
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final Object LJJII(View view, Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        o.LJIIIZ(view, "view");
        return new C54851Lfr(view, fragment);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJJIIZI(String scene, String awemeIds) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(awemeIds, "awemeIds");
        if (C00F.LIZ(31744, 1, "tt_friends_feed_preload_reverse", true) == 1) {
            C54374LVq.LIZLLL(scene, awemeIds);
        }
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJJIJIL(int i, String str) {
        ActivityC45651qj LIZLLL = StateOwner.LJLIL.LIZLLL();
        Bundle bundle = new Bundle();
        bundle.putString("enter_method", str);
        bundle.putInt("last_position", i);
        LIA.LIZ(bundle, LIZLLL);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void LJJIJLIJ(String scene, String awemeIds) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(awemeIds, "awemeIds");
        C54374LVq.LJ(scene);
        C54374LVq.LIZLLL(scene, awemeIds);
    }

    @Override // com.ss.android.ugc.aweme.friendstab.service.IFriendsFeedService
    public final void onAwemeRead(int i, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        LHM.LIZIZ.LIZIZ().onAwemeRead(i, aweme);
    }
}
