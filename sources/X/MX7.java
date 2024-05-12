package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.fragment.NavigationUtils;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.notification.LikeListDetailFragment;
import com.ss.android.ugc.aweme.notification.UserListActivity;
import com.ss.android.ugc.aweme.notification.bean.DiggInfo;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.AqS10S0401000_9;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS148S0200000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MX7 extends C8HS<DiggInfo> {
    public final InterfaceC107704Ko LJLIL;
    public int LJLILLLLZI;
    public UrlModel LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public InterfaceC65784Pro<C76800UCe> LJLJJLL;
    public boolean LJLJL;
    public final java.util.Map<String, ActivityStatus> LJLJLJ;
    public final java.util.Set<String> LJLJLLL;
    public final C62822Ol8 LJLL;

    public MX7() {
        this(null, 3);
    }

    public final void LJLZ(FollowStatus followStatus) {
        String str;
        User user;
        o.LJIIIZ(followStatus, "followStatus");
        List<DiggInfo> data = getData();
        if (data == null) {
            return;
        }
        Iterator<DiggInfo> it = data.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            DiggInfo next = it.next();
            if (next != null && (user = next.user) != null) {
                str = user.getUid();
            } else {
                str = null;
            }
            if (o.LJ(str, followStatus.userId)) {
                if (i >= 0) {
                    User user2 = ((DiggInfo) ListProtector.get(data, i)).user;
                    if (user2 != null) {
                        user2.setFollowStatus(followStatus.followStatus);
                    }
                    notifyItemChanged(i);
                }
            } else {
                i++;
            }
        }
        IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService().LJI(followStatus);
    }

    @Override // X.C8HS
    public final void addData(List<? extends DiggInfo> list) {
        List<DiggInfo> list2;
        if (list != null) {
            list2 = ORZ.LLJILJILJ(list);
        } else {
            list2 = null;
        }
        super.addData(LJLLLLLL(list2, true));
    }

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        User user;
        DiggInfo diggInfo;
        DiggInfo diggInfo2;
        List<DiggInfo> data = getData();
        User user2 = null;
        if (data != null && (diggInfo2 = (DiggInfo) ListProtector.get(data, i)) != null) {
            user = diggInfo2.user;
        } else {
            user = null;
        }
        if (user instanceof MXE) {
            return 15;
        }
        List<DiggInfo> data2 = getData();
        if (data2 != null && (diggInfo = (DiggInfo) ListProtector.get(data2, i)) != null) {
            user2 = diggInfo.user;
        }
        if (user2 instanceof MXC) {
            return 14;
        }
        return super.getBasicItemViewType(i);
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        MX8 mx8;
        UserListActivity userListActivity;
        User user;
        String str;
        User user2;
        User user3;
        LikeListDetailFragment likeListDetailFragment;
        User user4;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        C107724Kq c107724Kq = null;
        if ((holder instanceof MX8) && (mx8 = (MX8) holder) != null) {
            if (C53355Kwp.LIZ()) {
                C188787b0 c188787b0 = com.bytedance.hox.Hox.LJLLI;
                ActivityC45651qj LJ = C1DG.LJ(mx8.itemView, "itemView.context");
                if (LJ != null) {
                    Fragment findTopFragment = NavigationUtils.findTopFragment(c188787b0.LIZ(LJ).Ja("NOTIFICATION"));
                    if ((findTopFragment instanceof LikeListDetailFragment) && (likeListDetailFragment = (LikeListDetailFragment) findTopFragment) != null) {
                        int adapterPosition = mx8.getAdapterPosition();
                        DiggInfo diggInfo = mx8.LJLJLJ;
                        if (diggInfo != null) {
                            user4 = diggInfo.user;
                        } else {
                            user4 = null;
                        }
                        likeListDetailFragment.Il(user4, adapterPosition, "show");
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                Context context = mx8.itemView.getContext();
                if ((context instanceof UserListActivity) && (userListActivity = (UserListActivity) context) != null) {
                    int adapterPosition2 = mx8.getAdapterPosition();
                    DiggInfo diggInfo2 = mx8.LJLJLJ;
                    if (diggInfo2 != null) {
                        user = diggInfo2.user;
                    } else {
                        user = null;
                    }
                    userListActivity.LLIIIZ(user, adapterPosition2, "show");
                }
            }
            DiggInfo diggInfo3 = mx8.LJLJLJ;
            if (diggInfo3 != null && (user3 = diggInfo3.user) != null && !this.LJLJLLL.contains(user3.getUid()) && C7ZI.LIZJ() && user3.getFollowStatus() == EnumC57435MgR.FOLLOW_MUTUAL.getValue()) {
                java.util.Set<String> set = this.LJLJLLL;
                String uid = user3.getUid();
                o.LJIIIIZZ(uid, "user.uid");
                set.add(uid);
                IMService.createIIMServicebyMonsterPlugin(false).getImNudgeAnalytics().LIZJ(EnumC112404b6.LIKE_NOTIFICATION_SUBPAGE.getValue(), EnumC112374b3.LIKE_NOTIFICATION_SUBPAGE.getValue(), EnumC112754bf.SHOW.getValue(), IMService.createIIMServicebyMonsterPlugin(false).getImNudgeAnalytics().LIZIZ(mx8.LJLJLLL), user3.getUid());
            }
            MX8 mx82 = (MX8) holder;
            DiggInfo diggInfo4 = mx82.LJLJLJ;
            if (diggInfo4 != null && (user2 = diggInfo4.user) != null) {
                str = user2.getUid();
            } else {
                str = null;
            }
            if (!AV1.LJIJI(str)) {
                C107724Kq c107724Kq2 = mx82.LJLLI;
                if (c107724Kq2 != null) {
                    c107724Kq2.LJFF = Integer.valueOf(mx82.getBindingAdapterPosition() - 1);
                    c107724Kq = c107724Kq2;
                }
                C78946Uyc.LJJIJL(c107724Kq);
            }
        }
        C57052MaG c57052MaG = C57052MaG.LJLIL;
        C57051MaF c57051MaF = C57053MaH.LIZ;
        if (c57051MaF != null) {
            c57052MaG.invoke(c57051MaF);
        }
    }

    @Override // X.C8HS
    public final void setData(List<DiggInfo> list) {
        List<DiggInfo> LJLLLLLL = LJLLLLLL(list, false);
        if (this.LJLJL) {
            DiggInfo diggInfo = new DiggInfo();
            diggInfo.user = new MXE();
            ListProtector.add(LJLLLLLL, 0, diggInfo);
        }
        super.setData(LJLLLLLL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MX7(UserListActivity userListActivity, int i) {
        super(false, 1, null);
        userListActivity = (i & 1) != 0 ? null : userListActivity;
        this.LJLIL = userListActivity;
        this.LJLILLLLZI = 0;
        setLoadEmptyText(R.string.h7m);
        this.LJLJJLL = MXG.LJLIL;
        this.LJLJL = true;
        this.LJLJLJ = new LinkedHashMap();
        this.LJLJLLL = new LinkedHashSet();
        this.LJLL = C221108m2.LIZIZ(L68.LJLIL);
    }

    public final List<DiggInfo> LJLLLLLL(List<DiggInfo> list, boolean z) {
        int i;
        boolean z2;
        User user;
        MXC mxc;
        User user2;
        MXC mxc2;
        if (this.LJLILLLLZI == 0) {
            if (list != null) {
                return list;
            }
            return new ArrayList();
        }
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        List data = getData();
        if (data == null) {
            data = new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = ORZ.LJLIIIL(data).iterator();
        while (true) {
            if (it.hasNext()) {
                DiggInfo diggInfo = (DiggInfo) it.next();
                if (diggInfo != null) {
                    user2 = diggInfo.user;
                } else {
                    user2 = null;
                }
                if ((user2 instanceof MXC) && (mxc2 = (MXC) user2) != null && mxc2.getType() == 0) {
                    i = 1;
                    break;
                }
            } else {
                i = 0;
                break;
            }
        }
        Iterator<Object> it2 = ORZ.LJLIIIL(data).iterator();
        while (true) {
            if (it2.hasNext()) {
                DiggInfo diggInfo2 = (DiggInfo) it2.next();
                if (diggInfo2 != null) {
                    user = diggInfo2.user;
                } else {
                    user = null;
                }
                if ((user instanceof MXC) && (mxc = (MXC) user) != null && mxc.getType() == 1) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        AqS10S0401000_9 aqS10S0401000_9 = new AqS10S0401000_9(data, (List<DiggInfo>) this, (MX7) i, (int) list, (List<DiggInfo>) arrayList, (List<DiggInfo>) 1);
        if (z) {
            if (i != 0) {
                if (!z2) {
                    if (list.size() + data.size() >= this.LJLILLLLZI + 1) {
                        aqS10S0401000_9.invoke();
                    }
                }
                arrayList.addAll(list);
                return arrayList;
            }
        } else {
            if (i == 0) {
                MXC mxc3 = new MXC(0);
                DiggInfo diggInfo3 = new DiggInfo();
                diggInfo3.user = mxc3;
                arrayList.add(diggInfo3);
            }
            aqS10S0401000_9.invoke();
        }
        return arrayList;
    }

    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        MXC mxc;
        DiggInfo diggInfo;
        List<DiggInfo> data;
        DiggInfo diggInfo2;
        ActivityStatus activityStatus;
        C107724Kq c107724Kq;
        boolean z;
        UrlModel urlModel;
        Video video;
        boolean z2;
        String str;
        String uid;
        int basicItemViewType = getBasicItemViewType(i);
        boolean z3 = true;
        User user = null;
        if (basicItemViewType != 14) {
            if (basicItemViewType != 15 && (data = getData()) != null && (diggInfo2 = (DiggInfo) ORZ.LJLLLLLL(i, data)) != null) {
                User user2 = diggInfo2.user;
                if (user2 != null && (uid = user2.getUid()) != null) {
                    activityStatus = (ActivityStatus) ((LinkedHashMap) this.LJLJLJ).get(uid);
                } else {
                    activityStatus = null;
                }
                o.LJII(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.LikeListHolder");
                MX8 mx8 = (MX8) viewHolder;
                InterfaceC107704Ko interfaceC107704Ko = this.LJLIL;
                if (interfaceC107704Ko != null) {
                    c107724Kq = interfaceC107704Ko.getActivityStatusParams();
                } else {
                    c107724Kq = null;
                }
                mx8.LJLJLJ = diggInfo2;
                User user3 = diggInfo2.user;
                if (user3 != null) {
                    mx8.LJLJLLL = activityStatus;
                    if (c107724Kq != null) {
                        c107724Kq.LIZJ = user3.getUid();
                        if (activityStatus != null) {
                            z2 = OUP.LJJII(activityStatus, null, null, 3);
                        } else {
                            z2 = false;
                        }
                        c107724Kq.LJI = Boolean.valueOf(z2);
                    } else {
                        c107724Kq = null;
                    }
                    mx8.LJLLI = c107724Kq;
                    ((TextView) mx8.LJLJI.getValue()).setText(MVR.LIZIZ(user3, true));
                    ((TextView) mx8.LJLJJI.getValue()).setText(C56331M8x.LIZ(user3, true, true));
                    ((AP9) mx8.LJLIL.getValue()).setUserData(new UserVerify(user3.getAvatarThumb(), user3.getCustomVerify(), user3.getEnterpriseVerifyReason(), Integer.valueOf(user3.getVerificationType())));
                    if (activityStatus != null && OUP.LJJII(activityStatus, null, null, 3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        ((View) mx8.LJLILLLLZI.getValue()).setVisibility(0);
                        ((C119354mJ) mx8.LJLILLLLZI.getValue()).setActive(true);
                    } else {
                        ((View) mx8.LJLILLLLZI.getValue()).setVisibility(8);
                    }
                    if (C3U6.LIZ && user3.getFollowStatus() == 2) {
                        InterfaceC57106Mb8 imSayHiService = IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService();
                        String uid2 = user3.getUid();
                        o.LJIIIIZZ(uid2, "user.uid");
                        if (imSayHiService.LJII(uid2)) {
                            InterfaceC57106Mb8 imSayHiService2 = IMService.createIIMServicebyMonsterPlugin(false).getImSayHiService();
                            String uid3 = user3.getUid();
                            o.LJIIIIZZ(uid3, "user.uid");
                            imSayHiService2.LJ(user3.getFollowerStatus(), uid3, true);
                        }
                    }
                    if (diggInfo2.aweme != null) {
                        View relationBtn = (View) mx8.LJLJJLL.getValue();
                        o.LJIIIIZZ(relationBtn, "relationBtn");
                        relationBtn.setVisibility(8);
                        ImageView videoCover = (ImageView) mx8.LJLJL.getValue();
                        o.LJIIIIZZ(videoCover, "videoCover");
                        videoCover.setVisibility(0);
                        Aweme aweme = diggInfo2.aweme;
                        if (aweme != null && (video = aweme.getVideo()) != null) {
                            urlModel = video.getOriginCover();
                        } else {
                            urlModel = null;
                        }
                        W5F LJII = W5U.LJII(C78939UyV.LJ(urlModel));
                        LJII.LJJIIJ = (SmartImageView) mx8.LJLJL.getValue();
                        LJII.LJ();
                    } else {
                        ImageView videoCover2 = (ImageView) mx8.LJLJL.getValue();
                        o.LJIIIIZZ(videoCover2, "videoCover");
                        videoCover2.setVisibility(8);
                        ((View) mx8.LJLJJLL.getValue()).setVisibility(0);
                        if (C7ZI.LIZJ()) {
                            RelationButton relationButton = (RelationButton) mx8.LJLJJLL.getValue();
                            C226668v0 c226668v0 = new C226668v0();
                            c226668v0.LIZ = user3;
                            c226668v0.LIZIZ(EnumC112694bZ.MESSAGE_NUDGE);
                            EnumC57435MgR enumC57435MgR = EnumC57435MgR.FOLLOW_MUTUAL;
                            c226668v0.LJI.putAll(C51029K0z.LJJIIZI(new OSZ(enumC57435MgR, IMService.createIIMServicebyMonsterPlugin(false).getImNudgeService().LIZJ())));
                            c226668v0.LJII.putAll(C51029K0z.LJJIIZI(new OSZ(enumC57435MgR, Boolean.TRUE)));
                            if (mx8.L().getVisibility() != 0) {
                                z3 = false;
                            }
                            c226668v0.LJIIIIZZ = z3;
                            relationButton.LLIIIJ.LJJJJJL(c226668v0.LIZ());
                            relationButton.setTracker(new AqS148S0200000_1(activityStatus, user3, 17));
                        } else {
                            RelationButton relationButton2 = (RelationButton) mx8.LJLJJLL.getValue();
                            C226668v0 c226668v02 = new C226668v0();
                            c226668v02.LIZ = user3;
                            c226668v02.LIZIZ(EnumC112694bZ.MESSAGE_ICE_BREAKING);
                            if (mx8.L().getVisibility() != 0) {
                                z3 = false;
                            }
                            c226668v02.LJIIIIZZ = z3;
                            relationButton2.LLIIIJ.LJJJJJL(c226668v02.LIZ());
                            relationButton2.setTracker(C90103gE.LJLIL);
                        }
                    }
                    if (user3.getMatchedFriendStruct() == null) {
                        C188627ak mRelationLabel = mx8.L();
                        o.LJIIIIZZ(mRelationLabel, "mRelationLabel");
                        V1B.LJLLLLLL(mRelationLabel);
                    } else {
                        C56760MPk.LJIIL("show", "", "like_list", user3, null);
                        SFS.LJJIL(mx8.L(), user3.getMatchedFriendStruct(), 0, null);
                    }
                    ((AP9) mx8.LJLIL.getValue()).LIZ();
                    AJ9.LJ(mx8.itemView.getContext(), user3.getCustomVerify(), user3.getEnterpriseVerifyReason(), (TextView) mx8.LJLJI.getValue());
                    ((View) mx8.LJLLILLLL.getValue()).setVisibility(8);
                    C57446Mgc M = mx8.M();
                    C7YW c7yw = new C7YW();
                    c7yw.LIZ = user3;
                    c7yw.LIZIZ(EnumC57119MbL.NORMAL);
                    M.LJLILLLLZI.LJJJJJL(c7yw.LIZ());
                    mx8.M().setDataChangeListener(new AqS140S0200000_9(user3, mx8, 18));
                    C57434MgQ.LIZIZ.contains(Integer.valueOf(user3.getFollowStatus()));
                    C57446Mgc nameAppendFollowText = mx8.M();
                    o.LJIIIIZZ(nameAppendFollowText, "nameAppendFollowText");
                    C26338AVi.LJI(nameAppendFollowText, AnonymousClass391.LIZJ(4), null, null, null, false, 30);
                    C56923MVr c56923MVr = C56923MVr.LIZ;
                    C57446Mgc nameAppendFollowText2 = mx8.M();
                    o.LJIIIIZZ(nameAppendFollowText2, "nameAppendFollowText");
                    c56923MVr.LIZJ(nameAppendFollowText2, "", C47261Igj.LJJIJ(user3), false, null);
                }
                if (activityStatus == null || (str = activityStatus.userID) == null) {
                    return;
                }
                ((java.util.Map) this.LJLL.getValue()).get(activityStatus.userID);
                ((java.util.Map) this.LJLL.getValue()).put(str, activityStatus);
                return;
            }
            return;
        }
        List<DiggInfo> data2 = getData();
        if (data2 != null && (diggInfo = (DiggInfo) ORZ.LJLLLLLL(i, data2)) != null) {
            user = diggInfo.user;
        }
        if (!(user instanceof MXC) || (mxc = (MXC) user) == null) {
            return;
        }
        o.LJII(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.vh.MTTimestampTitleHolder");
        MXB mxb = (MXB) viewHolder;
        int type = mxc.getType();
        if (type != 0) {
            if (type != 1) {
                return;
            }
            C1DG.LJI(mxb.itemView, R.string.ixq, (TuxTextView) mxb.LJLIL.getValue());
            return;
        }
        C1DG.LJI(mxb.itemView, R.string.ixp, (TuxTextView) mxb.LJLIL.getValue());
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        if (i != 14) {
            if (i != 15) {
                View view = C28289B8j.LIZ(parent, R.layout.t3, parent, false);
                o.LJIIIIZZ(view, "view");
                return new MX8(view);
            }
            View view2 = C28289B8j.LIZ(parent, R.layout.se, parent, false);
            o.LJIIIIZZ(view2, "view");
            return new MX9(view2, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL);
        }
        View view3 = C28289B8j.LIZ(parent, R.layout.tq, parent, false);
        o.LJIIIIZZ(view3, "view");
        return new MXB(view3);
    }
}
