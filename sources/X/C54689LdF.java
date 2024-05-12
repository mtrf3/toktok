package X;

import Y.ACListenerS20S0301000_9;
import Y.ACListenerS26S0201000_9;
import Y.ACListenerS29S0100000_9;
import Y.ARunnableS45S0100000_9;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.SlimRoom;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.ui.FollowSkyLightHelper;
import com.ss.android.ugc.aweme.feed.ui.ViewWrapper;
import com.ss.android.ugc.aweme.homepage.api.data.InboxFollowGuideViewModel;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.LdF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54689LdF extends C8HS<FollowingInterestUser> {
    public final C62822Ol8 LJLIL;
    public final C53882LCs LJLILLLLZI;
    public ViewWrapper LJLJI;
    public final int LJLJJI;
    public Float LJLJJL;
    public FollowSkyLightHelper LJLJJLL;
    public InboxFollowGuideViewModel LJLJL;

    public C54689LdF() {
        super(false, 1, null);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(AnonymousClass957.LJLIL);
        this.LJLIL = LIZIZ;
        setShowFooter(false);
        if (((Boolean) LIZIZ.getValue()).booleanValue()) {
            C53882LCs c53882LCs = new C53882LCs(EnumC53722L6o.SKYLIGHT);
            this.LJLILLLLZI = c53882LCs;
            c53882LCs.LIZLLL();
        }
        this.LJLJJI = C47135Ieh.LIZ(6, C7MY.LIZIZ(40));
    }

    public final int LJLLLLLL(int i) {
        SlimRoom slimRoom;
        int i2;
        FollowingInterestUser followingInterestUser;
        SlimRoom.LinkMic linkMic;
        List<User> list;
        FollowingInterestUser followingInterestUser2;
        if (i == 0) {
            LiveOuterService.LJJJLL().LJIIJJI();
            if (C55661Lsv.LJIIIZ()) {
                return 6;
            }
        }
        boolean LIZJ = LYU.LIZJ();
        List<T> list2 = this.mmItems;
        if (list2 != 0 && (followingInterestUser2 = (FollowingInterestUser) ListProtector.get(list2, i)) != null) {
            slimRoom = LYU.LJIIIZ(followingInterestUser2);
        } else {
            slimRoom = null;
        }
        Integer num = (Integer) C0F0.LIZIZ().LIZJ(0, "follow_live_skylight_style");
        if (num == null || num.intValue() != 1) {
            if (LIZJ) {
                i2 = 3;
            } else {
                i2 = 1;
            }
        } else {
            i2 = 7;
        }
        if (slimRoom != null && (linkMic = slimRoom.getLinkMic()) != null && (list = linkMic.followedList) != null && list.size() >= 2) {
            if (num == null || num.intValue() != 1) {
                if (LIZJ) {
                    i2 = 4;
                } else {
                    i2 = 2;
                }
            } else {
                i2 = 8;
            }
        }
        List<T> list3 = this.mmItems;
        if (list3 != 0 && (followingInterestUser = (FollowingInterestUser) ListProtector.get(list3, i)) != null && followingInterestUser.getSeeAll()) {
            return 5;
        }
        return i2;
    }

    @Override // X.C4II
    public final int getBasicItemViewType(int i) {
        return LJLLLLLL(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:400:0x04a8, code lost:
    
        if (r5.contains(r3) == true) goto L338;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0516  */
    @Override // X.MK7, X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewAttachedToWindow(androidx.recyclerview.widget.RecyclerView.ViewHolder r39) {
        /*
            Method dump skipped, instructions count: 1471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54689LdF.onViewAttachedToWindow(androidx.recyclerview.widget.RecyclerView$ViewHolder):void");
    }

    @Override // X.MK7, X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (holder instanceof C54694LdK) {
            ((C54694LdK) holder).LJLLI.LJII();
        }
        if (holder instanceof C54693LdJ) {
            C54693LdJ c54693LdJ = (C54693LdJ) holder;
            c54693LdJ.LJLL.LJII();
            c54693LdJ.LJLLI.LJII();
        }
        if (holder instanceof C54691LdH) {
            C54691LdH c54691LdH = (C54691LdH) holder;
            if (c54691LdH.Y()) {
                C53884LCu c53884LCu = c54691LdH.LJZ;
                if (c53884LCu != null) {
                    c53884LCu.LJII();
                }
            } else {
                C53887LCx c53887LCx = c54691LdH.LJLZ;
                if (c53887LCx != null) {
                    c53887LCx.LJII();
                }
            }
        }
        if (holder instanceof C54690LdG) {
            C54690LdG c54690LdG = (C54690LdG) holder;
            if (c54690LdG.a0()) {
                C53884LCu c53884LCu2 = c54690LdG.LL;
                if (c53884LCu2 != null) {
                    c53884LCu2.LJII();
                }
                C53884LCu c53884LCu3 = c54690LdG.LLD;
                if (c53884LCu3 != null) {
                    c53884LCu3.LJII();
                    return;
                }
                return;
            }
            C53887LCx c53887LCx2 = c54690LdG.LJZI;
            if (c53887LCx2 != null) {
                c53887LCx2.LJII();
            }
            C53887LCx c53887LCx3 = c54690LdG.LJZL;
            if (c53887LCx3 == null) {
                return;
            }
            c53887LCx3.LJII();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r1v41, types: [X.2gB, com.ss.android.ugc.aweme.profile.model.User, com.ss.android.ugc.aweme.feed.model.Aweme] */
    /* JADX WARN: Type inference failed for: r1v42 */
    @Override // X.C4II
    public final void onBindBasicViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<FollowingInterestUser> data;
        int i2;
        String str;
        SlimRoom slimRoom;
        com.ss.android.ugc.aweme.profile.model.User user;
        int i3;
        String str2;
        SlimRoom slimRoom2;
        ?? r1;
        List<User> list;
        User user2;
        List<User> list2;
        User user3;
        String str3;
        SlimRoom slimRoom3;
        com.ss.android.ugc.aweme.profile.model.User user4;
        int i4;
        String str4;
        SlimRoom slimRoom4;
        int i5;
        List<User> list3;
        User user5;
        List<User> list4;
        User user6;
        int i6;
        String str5;
        SlimRoom slimRoom5;
        com.ss.android.ugc.aweme.profile.model.User user7;
        List<T> list5 = this.mmItems;
        if (list5 == 0 || (data = getData()) == null) {
            return;
        }
        if (LJLLLLLL(0) == 6) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i7 = i - i2;
        if (viewHolder instanceof C54694LdK) {
            C54694LdK c54694LdK = (C54694LdK) viewHolder;
            FollowingInterestUser interestUser = (FollowingInterestUser) ListProtector.get(list5, i);
            ArrayList arrayList = new ArrayList();
            for (FollowingInterestUser followingInterestUser : data) {
                if (followingInterestUser instanceof FollowingInterestUser) {
                    arrayList.add(followingInterestUser);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                o.LJII(next, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.module.FollowingInterestUser");
                arrayList2.add(next);
            }
            c54694LdK.getClass();
            o.LJIIIZ(interestUser, "interestUser");
            c54694LdK.LJLIL = i7;
            c54694LdK.itemView.setScaleX(1.0f);
            c54694LdK.itemView.setScaleY(1.0f);
            c54694LdK.LJLL = interestUser;
            com.ss.android.ugc.aweme.profile.model.User user8 = interestUser.getUser();
            if (user8 != null) {
                C78765Uvh.LJFF(c54694LdK.LJLJJLL, user8.getAvatarThumb());
                i6 = 0;
                c54694LdK.LJLJL.setText(C56331M8x.LIZIZ(user8, false, true));
            } else {
                i6 = 0;
            }
            c54694LdK.U(c54694LdK.LJLJLJ);
            c54694LdK.LJLJLLL.setVisibility(i6);
            c54694LdK.LJLLI.LJIIIIZZ(null, C54694LdK.class);
            ViewGroup.LayoutParams layoutParams = c54694LdK.LJLJJL.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = i6;
            marginLayoutParams.setMarginStart(i6);
            marginLayoutParams.height = C17N.LJIILL(124);
            if (i7 == 0) {
                marginLayoutParams.width = C17N.LJIILL(84);
                c54694LdK.LJLJJL.setPaddingRelative(C17N.LJIILL(8), 0, C17N.LJIILL(4), 0);
            } else {
                marginLayoutParams.width = C17N.LJIILL(80);
                double d = 4;
                c54694LdK.LJLJJL.setPaddingRelative(C17N.LJIILL(d), i6, C17N.LJIILL(d), i6);
            }
            c54694LdK.LJLJJL.setLayoutParams(marginLayoutParams);
            C16880lQ.LJIIJ(new ACListenerS26S0201000_9(c54694LdK, arrayList2, i7, 4), c54694LdK.LJLJJL);
            FollowingInterestUser followingInterestUser2 = c54694LdK.LJLL;
            if (followingInterestUser2 != null) {
                followingInterestUser2.getUser();
            }
            try {
                if (C30746C4w.LIZ()) {
                    slimRoom5 = LYU.LJIIIZ(c54694LdK.LJLL);
                } else {
                    FollowingInterestUser followingInterestUser3 = c54694LdK.LJLL;
                    if (followingInterestUser3 != null && (user7 = followingInterestUser3.getUser()) != null) {
                        str5 = user7.roomData;
                    } else {
                        str5 = null;
                    }
                    slimRoom5 = (SlimRoom) C75792yF.LIZ(str5, SlimRoom.class);
                }
                LiveOuterService.LJJJLL().LJJIJIL().F2(C30746C4w.LIZIZ("homepage_follow", "live_cover", slimRoom5));
            } catch (Exception e) {
                ALog.e(c54694LdK.LJLJJI, e);
            }
        }
        if (viewHolder instanceof C54693LdJ) {
            C54693LdJ c54693LdJ = (C54693LdJ) viewHolder;
            FollowingInterestUser interestUser2 = (FollowingInterestUser) ListProtector.get(list5, i);
            ArrayList arrayList3 = new ArrayList();
            for (FollowingInterestUser followingInterestUser4 : data) {
                if (followingInterestUser4 instanceof FollowingInterestUser) {
                    arrayList3.add(followingInterestUser4);
                }
            }
            ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                o.LJII(next2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.module.FollowingInterestUser");
                arrayList4.add(next2);
            }
            c54693LdJ.getClass();
            o.LJIIIZ(interestUser2, "interestUser");
            c54693LdJ.LJLIL = i7;
            c54693LdJ.LJLLILLLL = interestUser2;
            SlimRoom LJIIIZ = LYU.LJIIIZ(interestUser2);
            if (LJIIIZ != null) {
                c54693LdJ.itemView.setScaleX(1.0f);
                c54693LdJ.itemView.setScaleY(1.0f);
                if (LJIIIZ.getLinkMic().followedList.size() >= 2) {
                    SlimRoom.LinkMic linkMic = LJIIIZ.getLinkMic();
                    if (linkMic != null && (list4 = linkMic.followedList) != null && (user6 = (User) ListProtector.get(list4, 0)) != null) {
                        TAR.LIZ(c54693LdJ.LJLJJLL, user6.getAvatarThumb());
                        i5 = 1;
                        c54693LdJ.LJLJL.setText(C56331M8x.LIZJ(user6.getUsername(), user6.getNickName(), false, true));
                    } else {
                        i5 = 1;
                    }
                    SlimRoom.LinkMic linkMic2 = LJIIIZ.getLinkMic();
                    if (linkMic2 != null && (list3 = linkMic2.followedList) != null && (user5 = (User) ListProtector.get(list3, i5)) != null) {
                        TAR.LIZ(c54693LdJ.LJLJJL, user5.getAvatarThumb());
                    }
                }
                TextView textView = c54693LdJ.LJLJLLL;
                if (LJIIIZ.getLinkMic().followedCount > 1) {
                    if (C90193gN.LIZ()) {
                        TextView textView2 = c54693LdJ.LJLJLLL;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(LJIIIZ.getLinkMic().followedCount - 1);
                        LIZ.append('+');
                        textView2.setText(X1D.LIZIZ(LIZ));
                    } else {
                        TextView textView3 = c54693LdJ.LJLJLLL;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append('+');
                        LIZ2.append(LJIIIZ.getLinkMic().followedCount - 1);
                        textView3.setText(X1D.LIZIZ(LIZ2));
                    }
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                textView.setVisibility(i4);
                c54693LdJ.U(c54693LdJ.LJLJLJ);
                ViewGroup.LayoutParams layoutParams2 = c54693LdJ.LJLJJI.getLayoutParams();
                o.LJII(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.leftMargin = 0;
                marginLayoutParams2.setMarginStart(0);
                marginLayoutParams2.height = C17N.LJIILL(124);
                if (i7 == 0) {
                    marginLayoutParams2.width = C17N.LJIILL(84);
                    c54693LdJ.LJLJJI.setPaddingRelative(C17N.LJIILL(8), 0, C17N.LJIILL(4), 0);
                } else {
                    marginLayoutParams2.width = C17N.LJIILL(80);
                    double d2 = 4;
                    c54693LdJ.LJLJJI.setPaddingRelative(C17N.LJIILL(d2), 0, C17N.LJIILL(d2), 0);
                }
                c54693LdJ.LJLJJI.setLayoutParams(marginLayoutParams2);
                C16880lQ.LJIIJ(new ACListenerS20S0301000_9((Object) c54693LdJ, (C54690LdG) i7, (int) interestUser2, (FollowingInterestUser) arrayList4, (List<FollowingInterestUser>) 3), c54693LdJ.LJLJJI);
                c54693LdJ.LJLL.LJIIIIZZ(null, C54693LdJ.class);
                c54693LdJ.LJLLI.LJIIIIZZ(null, C54693LdJ.class);
                interestUser2.getUser();
                if (C30746C4w.LIZ()) {
                    slimRoom4 = LYU.LJIIIZ(interestUser2);
                } else {
                    com.ss.android.ugc.aweme.profile.model.User user9 = interestUser2.getUser();
                    if (user9 != null) {
                        str4 = user9.roomData;
                    } else {
                        str4 = null;
                    }
                    slimRoom4 = (SlimRoom) C75792yF.LIZ(str4, SlimRoom.class);
                }
                LiveOuterService.LJJJLL().LJJIJIL().F2(C30746C4w.LIZIZ("homepage_follow", "live_cover", slimRoom4));
            }
        }
        if (viewHolder instanceof C54691LdH) {
            C54691LdH c54691LdH = (C54691LdH) viewHolder;
            FollowingInterestUser interestUser3 = (FollowingInterestUser) ListProtector.get(list5, i);
            ArrayList arrayList5 = new ArrayList();
            for (FollowingInterestUser followingInterestUser5 : data) {
                if (followingInterestUser5 instanceof FollowingInterestUser) {
                    arrayList5.add(followingInterestUser5);
                }
            }
            ArrayList arrayList6 = new ArrayList(C32I.LJJL(arrayList5, 10));
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                Object next3 = it3.next();
                o.LJII(next3, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.module.FollowingInterestUser");
                arrayList6.add(next3);
            }
            c54691LdH.getClass();
            o.LJIIIZ(interestUser3, "interestUser");
            c54691LdH.LJLIL = i7;
            c54691LdH.itemView.setScaleX(1.0f);
            c54691LdH.itemView.setScaleY(1.0f);
            c54691LdH.LJLLL = interestUser3;
            com.ss.android.ugc.aweme.profile.model.User user10 = interestUser3.getUser();
            if (user10 != null) {
                C78765Uvh.LJFF(c54691LdH.LJLL, user10.getAvatarThumb());
                c54691LdH.LJLLI.setText(C56331M8x.LIZIZ(user10, false, true));
                boolean LJ = LYU.LJ();
                ViewGroup.LayoutParams layoutParams3 = c54691LdH.LJLLI.getLayoutParams();
                if (LJ) {
                    layoutParams3.width = C17N.LJIILL(80);
                } else {
                    layoutParams3.width = C17N.LJIILL(72);
                }
                c54691LdH.LJLLI.setLayoutParams(layoutParams3);
                if (LYU.LJFF()) {
                    c54691LdH.LJLLI.setTuxFont(71);
                } else {
                    c54691LdH.LJLLI.setTuxFont(72);
                }
            }
            c54691LdH.U(c54691LdH.LJLLILLLL);
            c54691LdH.LJLLJ.setVisibility(0);
            if (c54691LdH.Y()) {
                C53884LCu c53884LCu = c54691LdH.LJZ;
                if (c53884LCu != null) {
                    c53884LCu.LIZIZ(null, C54691LdH.class, null, null);
                }
            } else {
                C53887LCx c53887LCx = c54691LdH.LJLZ;
                if (c53887LCx != null) {
                    c53887LCx.LJIIIIZZ(null, C54691LdH.class);
                }
            }
            ViewGroup.LayoutParams layoutParams4 = c54691LdH.LJLJLLL.getLayoutParams();
            o.LJII(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams4;
            marginLayoutParams3.leftMargin = 0;
            marginLayoutParams3.setMarginStart(0);
            marginLayoutParams3.height = C17N.LJIILL(130);
            if (i7 == 0) {
                marginLayoutParams3.width = C17N.LJIILL(96);
                c54691LdH.LJLJLLL.setPaddingRelative(C17N.LJIILL(16), 0, C17N.LJIILL(8), 0);
            } else {
                marginLayoutParams3.width = C17N.LJIILL(88);
                double d3 = 8;
                c54691LdH.LJLJLLL.setPaddingRelative(C17N.LJIILL(d3), 0, C17N.LJIILL(d3), 0);
            }
            c54691LdH.LJLJLLL.setLayoutParams(marginLayoutParams3);
            C16880lQ.LJIIJ(new ACListenerS26S0201000_9(c54691LdH, arrayList6, i7, 2), c54691LdH.LJLJLLL);
            FollowingInterestUser followingInterestUser6 = c54691LdH.LJLLL;
            if (followingInterestUser6 != null) {
                followingInterestUser6.getUser();
            }
            try {
                if (C30746C4w.LIZ()) {
                    slimRoom3 = LYU.LJIIIZ(c54691LdH.LJLLL);
                } else {
                    FollowingInterestUser followingInterestUser7 = c54691LdH.LJLLL;
                    if (followingInterestUser7 != null && (user4 = followingInterestUser7.getUser()) != null) {
                        str3 = user4.roomData;
                    } else {
                        str3 = null;
                    }
                    slimRoom3 = (SlimRoom) C75792yF.LIZ(str3, SlimRoom.class);
                }
                LiveOuterService.LJJJLL().LJJIJIL().F2(C30746C4w.LIZIZ("homepage_follow", "live_cover", slimRoom3));
            } catch (Exception e2) {
                ALog.e(c54691LdH.LJLJLJ, e2);
            }
        }
        if (viewHolder instanceof C54690LdG) {
            C54690LdG c54690LdG = (C54690LdG) viewHolder;
            FollowingInterestUser interestUser4 = (FollowingInterestUser) ListProtector.get(list5, i);
            ArrayList arrayList7 = new ArrayList();
            for (FollowingInterestUser followingInterestUser8 : data) {
                if (followingInterestUser8 instanceof FollowingInterestUser) {
                    arrayList7.add(followingInterestUser8);
                }
            }
            ArrayList arrayList8 = new ArrayList(C32I.LJJL(arrayList7, 10));
            Iterator it4 = arrayList7.iterator();
            while (it4.hasNext()) {
                Object next4 = it4.next();
                o.LJII(next4, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.module.FollowingInterestUser");
                arrayList8.add(next4);
            }
            c54690LdG.getClass();
            o.LJIIIZ(interestUser4, "interestUser");
            c54690LdG.LJLIL = i7;
            c54690LdG.LLFF = interestUser4;
            SlimRoom LJIIIZ2 = LYU.LJIIIZ(interestUser4);
            if (LJIIIZ2 != null) {
                c54690LdG.itemView.setScaleX(1.0f);
                c54690LdG.itemView.setScaleY(1.0f);
                if (LJIIIZ2.getLinkMic().followedList.size() >= 2) {
                    SlimRoom.LinkMic linkMic3 = LJIIIZ2.getLinkMic();
                    if (linkMic3 != null && (list2 = linkMic3.followedList) != null && (user3 = (User) ListProtector.get(list2, 0)) != null) {
                        TAR.LIZ(c54690LdG.LJLLI, user3.getAvatarThumb());
                        c54690LdG.LJLLILLLL.setText(C56331M8x.LIZJ(user3.getUsername(), user3.getNickName(), false, true));
                        boolean LJ2 = LYU.LJ();
                        ViewGroup.LayoutParams layoutParams5 = c54690LdG.LJLLJ.getLayoutParams();
                        if (LJ2) {
                            layoutParams5.width = C17N.LJIILL(80);
                        } else {
                            layoutParams5.width = C17N.LJIILL(72);
                        }
                        c54690LdG.LJLLJ.setLayoutParams(layoutParams5);
                        if (LYU.LJFF()) {
                            c54690LdG.LJLLILLLL.setTuxFont(71);
                            c54690LdG.LJLLLL.setTuxFont(71);
                        } else {
                            c54690LdG.LJLLILLLL.setTuxFont(72);
                            c54690LdG.LJLLLL.setTuxFont(72);
                        }
                    }
                    SlimRoom.LinkMic linkMic4 = LJIIIZ2.getLinkMic();
                    if (linkMic4 != null && (list = linkMic4.followedList) != null && (user2 = (User) ListProtector.get(list, 1)) != null) {
                        TAR.LIZ(c54690LdG.LJLL, user2.getAvatarThumb());
                    }
                }
                TuxTextView tuxTextView = c54690LdG.LJLLLL;
                if (LJIIIZ2.getLinkMic().followedCount > 1) {
                    if (C90193gN.LIZ()) {
                        TuxTextView tuxTextView2 = c54690LdG.LJLLLL;
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(LJIIIZ2.getLinkMic().followedCount - 1);
                        LIZ3.append('+');
                        tuxTextView2.setText(X1D.LIZIZ(LIZ3));
                    } else {
                        TuxTextView tuxTextView3 = c54690LdG.LJLLLL;
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append('+');
                        LIZ4.append(LJIIIZ2.getLinkMic().followedCount - 1);
                        tuxTextView3.setText(X1D.LIZIZ(LIZ4));
                    }
                    i3 = 0;
                } else {
                    i3 = 8;
                }
                tuxTextView.setVisibility(i3);
                c54690LdG.U(c54690LdG.LJLLL);
                ViewGroup.LayoutParams layoutParams6 = c54690LdG.LJLJLLL.getLayoutParams();
                o.LJII(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams6;
                marginLayoutParams4.leftMargin = 0;
                marginLayoutParams4.setMarginStart(0);
                marginLayoutParams4.height = C17N.LJIILL(130);
                if (i7 == 0) {
                    marginLayoutParams4.width = C17N.LJIILL(96);
                    c54690LdG.LJLJLLL.setPaddingRelative(C17N.LJIILL(16), 0, C17N.LJIILL(8), 0);
                } else {
                    marginLayoutParams4.width = C17N.LJIILL(88);
                    double d4 = 8;
                    c54690LdG.LJLJLLL.setPaddingRelative(C17N.LJIILL(d4), 0, C17N.LJIILL(d4), 0);
                }
                c54690LdG.LJLJLLL.setLayoutParams(marginLayoutParams4);
                C16880lQ.LJIIJ(new ACListenerS20S0301000_9((Object) c54690LdG, (C54690LdG) i7, (int) interestUser4, (FollowingInterestUser) arrayList8, (List<FollowingInterestUser>) 2), c54690LdG.LJLJLLL);
                if (c54690LdG.a0()) {
                    C53884LCu c53884LCu2 = c54690LdG.LL;
                    if (c53884LCu2 != null) {
                        r1 = 0;
                        c53884LCu2.LIZIZ(null, C54690LdG.class, null, null);
                    } else {
                        r1 = 0;
                    }
                    C53884LCu c53884LCu3 = c54690LdG.LLD;
                    str2 = r1;
                    if (c53884LCu3 != 0) {
                        c53884LCu3.LIZIZ(r1, C54690LdG.class, r1, r1);
                        str2 = r1;
                    }
                } else {
                    str2 = null;
                    str2 = null;
                    C53887LCx c53887LCx2 = c54690LdG.LJZI;
                    if (c53887LCx2 != null) {
                        c53887LCx2.LJIIIIZZ(null, C54690LdG.class);
                    }
                    C53887LCx c53887LCx3 = c54690LdG.LJZL;
                    if (c53887LCx3 != null) {
                        c53887LCx3.LJIIIIZZ(null, C54690LdG.class);
                    }
                }
                FollowingInterestUser followingInterestUser9 = c54690LdG.LLFF;
                if (followingInterestUser9 != null) {
                    followingInterestUser9.getUser();
                }
                try {
                    if (C30746C4w.LIZ()) {
                        slimRoom2 = LYU.LJIIIZ(c54690LdG.LLFF);
                    } else {
                        FollowingInterestUser followingInterestUser10 = c54690LdG.LLFF;
                        String str6 = str2;
                        if (followingInterestUser10 != null) {
                            com.ss.android.ugc.aweme.profile.model.User user11 = followingInterestUser10.getUser();
                            str6 = str2;
                            if (user11 != null) {
                                str6 = user11.roomData;
                            }
                        }
                        slimRoom2 = (SlimRoom) C75792yF.LIZ(str6, SlimRoom.class);
                    }
                    LiveOuterService.LJJJLL().LJJIJIL().F2(C30746C4w.LIZIZ("homepage_follow", "live_cover", slimRoom2));
                } catch (Exception e3) {
                    ALog.e(c54690LdG.LJLJLJ, e3);
                }
            }
        }
        if (viewHolder instanceof C54696LdM) {
            C54696LdM c54696LdM = (C54696LdM) viewHolder;
            Object interestUser5 = ListProtector.get(list5, i);
            ArrayList arrayList9 = new ArrayList();
            for (FollowingInterestUser followingInterestUser11 : data) {
                if (followingInterestUser11 instanceof FollowingInterestUser) {
                    arrayList9.add(followingInterestUser11);
                }
            }
            ArrayList arrayList10 = new ArrayList(C32I.LJJL(arrayList9, 10));
            Iterator it5 = arrayList9.iterator();
            while (it5.hasNext()) {
                Object next5 = it5.next();
                o.LJII(next5, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.module.FollowingInterestUser");
                arrayList10.add(next5);
            }
            c54696LdM.getClass();
            o.LJIIIZ(interestUser5, "interestUser");
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(c54696LdM, 146), c54696LdM.LJLJJI);
            c54696LdM.LJLJJL.setText(C86V.LJFF(R.string.rt9));
            TuxIconView tuxIconView = c54696LdM.LJLJJLL;
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.ch);
            c110614Vt.LIZJ = C61328O5c.LIZJ(35);
            Context context = c54696LdM.itemView.getContext();
            o.LJIIIIZZ(context, "itemView.context");
            tuxIconView.setBackground(c110614Vt.LIZ(context));
            LiveOuterService.LJJJLL().LJIIJJI();
            C55661Lsv.LJIIZILJ();
        }
        if (viewHolder instanceof C54687LdD) {
            C54687LdD c54687LdD = (C54687LdD) viewHolder;
            Object interestUser6 = ListProtector.get(list5, i);
            ArrayList arrayList11 = new ArrayList();
            for (FollowingInterestUser followingInterestUser12 : data) {
                if (followingInterestUser12 instanceof FollowingInterestUser) {
                    arrayList11.add(followingInterestUser12);
                }
            }
            ArrayList arrayList12 = new ArrayList(C32I.LJJL(arrayList11, 10));
            Iterator it6 = arrayList11.iterator();
            while (it6.hasNext()) {
                Object next6 = it6.next();
                o.LJII(next6, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.module.FollowingInterestUser");
                arrayList12.add(next6);
            }
            c54687LdD.getClass();
            o.LJIIIZ(interestUser6, "interestUser");
            C16880lQ.LJIIJ(new ACListenerS29S0100000_9(c54687LdD, 147), c54687LdD.LJLJJI);
        }
        if (viewHolder instanceof C54695LdL) {
            C54695LdL c54695LdL = (C54695LdL) viewHolder;
            FollowingInterestUser interestUser7 = (FollowingInterestUser) ListProtector.get(list5, i);
            ArrayList arrayList13 = new ArrayList();
            for (FollowingInterestUser followingInterestUser13 : data) {
                if (followingInterestUser13 instanceof FollowingInterestUser) {
                    arrayList13.add(followingInterestUser13);
                }
            }
            ArrayList arrayList14 = new ArrayList(C32I.LJJL(arrayList13, 10));
            Iterator it7 = arrayList13.iterator();
            while (it7.hasNext()) {
                Object next7 = it7.next();
                o.LJII(next7, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.module.FollowingInterestUser");
                arrayList14.add(next7);
            }
            c54695LdL.getClass();
            o.LJIIIZ(interestUser7, "interestUser");
            c54695LdL.LJLIL = i7;
            c54695LdL.itemView.setScaleX(1.0f);
            c54695LdL.itemView.setScaleY(1.0f);
            c54695LdL.LJLLI = interestUser7;
            com.ss.android.ugc.aweme.profile.model.User user12 = interestUser7.getUser();
            if (user12 != null) {
                C78765Uvh.LJFF(c54695LdL.LJLJJLL, user12.getAvatarThumb());
                c54695LdL.LJLJL.setText(C56331M8x.LIZIZ(user12, false, true));
                boolean LJ3 = LYU.LJ();
                ViewGroup.LayoutParams layoutParams7 = c54695LdL.LJLJL.getLayoutParams();
                if (LJ3) {
                    layoutParams7.width = C17N.LJIILL(80);
                } else {
                    layoutParams7.width = C17N.LJIILL(72);
                }
                c54695LdL.LJLJL.setLayoutParams(layoutParams7);
                if (LYU.LJFF()) {
                    c54695LdL.LJLJL.setTuxFont(71);
                } else {
                    c54695LdL.LJLJL.setTuxFont(72);
                }
            }
            c54695LdL.LJLJLJ.setVisibility(0);
            ViewGroup.LayoutParams layoutParams8 = c54695LdL.LJLJJL.getLayoutParams();
            o.LJII(layoutParams8, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams8;
            marginLayoutParams5.leftMargin = 0;
            marginLayoutParams5.setMarginStart(0);
            marginLayoutParams5.height = C17N.LJIILL(130);
            if (i7 == 0) {
                marginLayoutParams5.width = C17N.LJIILL(96);
                c54695LdL.LJLJJL.setPaddingRelative(C17N.LJIILL(16), 0, C17N.LJIILL(8), 0);
            } else {
                marginLayoutParams5.width = C17N.LJIILL(88);
                double d5 = 8;
                c54695LdL.LJLJJL.setPaddingRelative(C17N.LJIILL(d5), 0, C17N.LJIILL(d5), 0);
            }
            c54695LdL.LJLJJL.setLayoutParams(marginLayoutParams5);
            C16880lQ.LJIIJ(new ACListenerS26S0201000_9(c54695LdL, arrayList14, i7, 3), c54695LdL.LJLJJL);
            c54695LdL.LJLL.post(new ARunnableS45S0100000_9(c54695LdL, 198));
            FollowingInterestUser followingInterestUser14 = c54695LdL.LJLLI;
            if (followingInterestUser14 != null) {
                followingInterestUser14.getUser();
            }
            try {
                if (C30746C4w.LIZ()) {
                    slimRoom = LYU.LJIIIZ(c54695LdL.LJLLI);
                } else {
                    FollowingInterestUser followingInterestUser15 = c54695LdL.LJLLI;
                    if (followingInterestUser15 != null && (user = followingInterestUser15.getUser()) != null) {
                        str = user.roomData;
                    } else {
                        str = null;
                    }
                    slimRoom = (SlimRoom) C75792yF.LIZ(str, SlimRoom.class);
                }
                LiveOuterService.LJJJLL().LJJIJIL().F2(C30746C4w.LIZIZ("homepage_follow", "live_cover", slimRoom));
            } catch (Exception e4) {
                ALog.e(c54695LdL.LJLJJI, e4);
            }
            c54695LdL.LJLJLLL.LIZ(-16777216, -16777216);
            LiveOuterService.LJJJLL().LJIIJJI();
            C55661Lsv.LJIILIIL(c54695LdL.LJLL, (String) AbstractC54684LdA.LJLJI.getValue());
        }
        if (viewHolder instanceof C54688LdE) {
            C54688LdE c54688LdE = (C54688LdE) viewHolder;
            FollowingInterestUser followingInterestUser16 = (FollowingInterestUser) ListProtector.get(list5, i);
            ArrayList arrayList15 = new ArrayList();
            for (FollowingInterestUser followingInterestUser17 : data) {
                if (followingInterestUser17 instanceof FollowingInterestUser) {
                    arrayList15.add(followingInterestUser17);
                }
            }
            ArrayList arrayList16 = new ArrayList(C32I.LJJL(arrayList15, 10));
            Iterator it8 = arrayList15.iterator();
            while (it8.hasNext()) {
                Object next8 = it8.next();
                o.LJII(next8, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.module.FollowingInterestUser");
                arrayList16.add(next8);
            }
            c54688LdE.X(followingInterestUser16, arrayList16, i7);
        }
    }

    @Override // X.C4II
    public final RecyclerView.ViewHolder onCreateBasicViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        AbstractC54684LdA c54694LdK;
        o.LJI(viewGroup);
        LayoutInflater LLZIL = C16880lQ.LLZIL(viewGroup.getContext());
        Integer num = (Integer) C0F0.LIZIZ().LIZJ(0, "follow_live_skylight_style");
        switch (i) {
            case 2:
                i2 = R.layout.avt;
                break;
            case 3:
                i2 = R.layout.avx;
                break;
            case 4:
                i2 = R.layout.avu;
                break;
            case 5:
                i2 = R.layout.d9i;
                break;
            case 6:
                if (num == null || num.intValue() != 1) {
                    i2 = R.layout.avz;
                    break;
                } else {
                    i2 = R.layout.aw0;
                    break;
                }
                break;
            case 7:
                i2 = R.layout.avy;
                break;
            case 8:
                i2 = R.layout.avv;
                break;
            default:
                i2 = R.layout.avw;
                break;
        }
        View view = C16880lQ.LLLLIILL(LLZIL, i2, viewGroup, false);
        switch (i) {
            case 1:
                o.LJIIIIZZ(view, "view");
                c54694LdK = new C54694LdK(view);
                break;
            case 2:
                o.LJIIIIZZ(view, "view");
                c54694LdK = new C54693LdJ(view);
                break;
            case 3:
                o.LJIIIIZZ(view, "view");
                c54694LdK = new C54691LdH(view);
                break;
            case 4:
                o.LJIIIIZZ(view, "view");
                c54694LdK = new C54690LdG(view);
                break;
            case 5:
                View findViewById = view.findViewById(R.id.bbg);
                o.LJIIIIZZ(findViewById, "view.findViewById(R.id.circle)");
                this.LJLJI = new ViewWrapper(findViewById);
                this.LJLJJL = Float.valueOf(findViewById.getAlpha());
                c54694LdK = new C54687LdD(view);
                break;
            case 6:
                o.LJIIIIZZ(view, "view");
                c54694LdK = new C54696LdM(view);
                break;
            case 7:
                o.LJIIIIZZ(view, "view");
                c54694LdK = new C54695LdL(view);
                break;
            case 8:
                o.LJIIIIZZ(view, "view");
                c54694LdK = new C54688LdE(view);
                break;
            default:
                o.LJIIIIZZ(view, "view");
                c54694LdK = new C54694LdK(view);
                break;
        }
        if (c54694LdK instanceof AbstractC54692LdI) {
            FollowSkyLightHelper followSkyLightHelper = this.LJLJJLL;
            if (followSkyLightHelper != null) {
                followSkyLightHelper.LJIILIIL.add(new AqS175S0100000_9(c54694LdK, 547));
            }
            if (((Boolean) this.LJLIL.getValue()).booleanValue()) {
                AbstractC54692LdI abstractC54692LdI = (AbstractC54692LdI) c54694LdK;
                C53882LCs c53882LCs = this.LJLILLLLZI;
                if (c53882LCs != null) {
                    abstractC54692LdI.X(c53882LCs);
                }
            }
        }
        c54694LdK.LJLILLLLZI = this.LJLJL;
        return c54694LdK;
    }
}
