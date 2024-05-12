package X;

import Y.ACListenerS29S0100000_9;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.inbox.widget.multi.ActivityIcon;
import com.ss.android.ugc.aweme.inbox.widget.multi.InboxEntrancePod;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CheckProfileNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DonationNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DuetNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowApproveNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCellUIInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceExposedInfo;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.PostNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.VoteNotice;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate;
import com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MNx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56721MNx extends MMX<InboxEntrancePod> {
    public final C62822Ol8 LJLJLLL;
    public final C62822Ol8 LJLL;
    public final C62822Ol8 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C62822Ol8 LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public final C56700MNc LL;
    public final Integer[] LLD;

    public final C119624mk c0() {
        return (C119624mk) this.LJLLLLLL.getValue();
    }

    public final LinearLayout f0() {
        return (LinearLayout) this.LJLLL.getValue();
    }

    public final LinearLayout g0() {
        return (LinearLayout) this.LJLLLL.getValue();
    }

    @Override // X.MMX
    public final void reportShowEvent() {
        P();
        MultiViewModel.xv0("show", N(), null, null);
        Iterator it = ((ArrayList) this.LL.LJLJL).iterator();
        while (it.hasNext()) {
            ((MVV) ((OSZ) it.next()).getSecond()).performShowEvent();
        }
    }

    @Override // X.MMX
    public final Integer[] Q() {
        return this.LLD;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56721MNx(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 866));
        this.LJLJLLL = LIZIZ;
        this.LJLL = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 875));
        this.LJLLI = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 872));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 864));
        this.LJLLJ = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 865));
        this.LJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 870));
        this.LJLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 873));
        this.LJLLLLLL = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 868));
        this.LJLZ = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 874));
        this.LJZ = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 867));
        this.LJZI = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 876));
        this.LJZL = C221108m2.LIZIZ(new AqS159S0100000_9(itemView, 869));
        this.LL = new C56700MNc((View.OnClickListener) C221108m2.LIZIZ(new AqS159S0100000_9(this, 871)).getValue(), new MNW(this));
        ACListenerS29S0100000_9 aCListenerS29S0100000_9 = new ACListenerS29S0100000_9(this, 127);
        this.LLD = new Integer[]{Integer.valueOf(R.id.h47)};
        C16880lQ.LJIL((ConstraintLayout) LIZIZ.getValue(), aCListenerS29S0100000_9);
        C16880lQ.LJIIZILJ(g0(), aCListenerS29S0100000_9);
        if (C53341Kwb.LIZ()) {
            MVR.LIZ((View) LIZIZ.getValue(), MVP.CELL, 0.0f);
        }
    }

    @Override // X.MMX
    public final void V(InboxEntrancePod inboxEntrancePod) {
        List<MusNotice> list;
        int i;
        boolean z;
        MusNotice nextUnreadNotice;
        UrlModel urlModel;
        ActivityIcon activityIcon;
        String str;
        TitleTemplate titleTemplate;
        List<User> list2;
        User user;
        User user2;
        User author;
        User author2;
        User user3;
        Comment comment;
        User user4;
        User user5;
        RecyclerView.ViewHolder LJII;
        InboxEntranceExposedInfo exposedInfo;
        NoticeItems notices;
        InboxEntrancePod inboxEntrancePod2 = inboxEntrancePod;
        SystemClock.uptimeMillis();
        super.V(inboxEntrancePod2);
        InboxEntranceCell inboxEntranceCell = inboxEntrancePod2.entranceCell;
        String str2 = null;
        UrlModel urlModel2 = null;
        r1 = null;
        UrlModel urlModel3 = null;
        r1 = null;
        r1 = null;
        UrlModel urlModel4 = null;
        UrlModel urlModel5 = null;
        UrlModel urlModel6 = null;
        r1 = null;
        UrlModel urlModel7 = null;
        r1 = null;
        UrlModel urlModel8 = null;
        UrlModel urlModel9 = null;
        r1 = null;
        UrlModel urlModel10 = null;
        r1 = null;
        UrlModel urlModel11 = null;
        UrlModel urlModel12 = null;
        if (inboxEntranceCell != null && (exposedInfo = inboxEntranceCell.getExposedInfo()) != null && (notices = exposedInfo.getNotices()) != null) {
            list = notices.getItems();
        } else {
            list = null;
        }
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        Resources resources = this.itemView.getContext().getResources();
        EnumC56697MMz enumC56697MMz = EnumC56697MMz.NONE;
        InboxEntranceExposedInfo exposedInfo2 = inboxEntrancePod2.entranceCell.getExposedInfo();
        if (exposedInfo2 != null && exposedInfo2.getNextUnreadNotice() != null) {
            enumC56697MMz = exposedInfo2.getNextUnreadNoticePriority() > 1 ? EnumC56697MMz.ACTIVITY : EnumC56697MMz.SYSTEM;
        }
        int LIZLLL = MLS.LIZLLL(inboxEntrancePod2.entranceCell);
        i0(inboxEntrancePod2);
        h0(inboxEntrancePod2);
        if (list == null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((View) this.LJLLILLLL.getValue()).setVisibility(0);
            ((View) this.LJLLJ.getValue()).setVisibility(8);
            ((View) this.LJZ.getValue()).setVisibility(8);
        } else {
            ((View) this.LJLLJ.getValue()).setVisibility(0);
            ((View) this.LJZ.getValue()).setVisibility(0);
            ((View) this.LJLLILLLL.getValue()).setVisibility(8);
        }
        if (C114304eA.LIZLLL()) {
            f0().removeAllViews();
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                int i2 = 0;
                for (MusNotice musNotice : list) {
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        int LJJIIZ = C78966Uyw.LJJIIZ(musNotice);
                        Iterator it = ((ArrayList) this.LL.LJLJL).iterator();
                        int i4 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((Number) ((OSZ) it.next()).getFirst()).intValue() == LJJIIZ) {
                                if (i4 >= 0) {
                                    LJII = (RecyclerView.ViewHolder) ((OSZ) ListProtector.remove(this.LL.LJLJL, i4)).getSecond();
                                }
                            } else {
                                i4++;
                            }
                        }
                        C56700MNc c56700MNc = this.LL;
                        LinearLayout noticeLayout = f0();
                        o.LJIIIIZZ(noticeLayout, "noticeLayout");
                        LJII = c56700MNc.LJII(noticeLayout, LJJIIZ);
                        f0().addView(LJII.itemView);
                        this.LL.LJI(LJII, i2);
                        arrayList.add(new OSZ(Integer.valueOf(LJJIIZ), LJII));
                        C16880lQ.LLLZIIL(R.layout.s2, (LayoutInflater) this.LJZL.getValue(), f0());
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
            ((ArrayList) this.LL.LJLJL).clear();
            ((ArrayList) this.LL.LJLJL).addAll(arrayList);
        } else {
            f0().removeAllViews();
            ((ArrayList) this.LL.LJLJL).clear();
            if (list != null) {
                int i5 = 0;
                for (MusNotice musNotice2 : list) {
                    int i6 = i5 + 1;
                    if (i5 >= 0) {
                        MusNotice musNotice3 = musNotice2;
                        C56700MNc c56700MNc2 = this.LL;
                        LinearLayout noticeLayout2 = f0();
                        o.LJIIIIZZ(noticeLayout2, "noticeLayout");
                        RecyclerView.ViewHolder LJII2 = c56700MNc2.LJII(noticeLayout2, C78966Uyw.LJJIIZ(musNotice3));
                        f0().addView(LJII2.itemView);
                        this.LL.LJI(LJII2, i5);
                        ((ArrayList) this.LL.LJLJL).add(new OSZ(Integer.valueOf(C78966Uyw.LJJIIZ(musNotice3)), LJII2));
                        C16880lQ.LLLZIIL(R.layout.s2, (LayoutInflater) this.LJZL.getValue(), f0());
                        i5 = i6;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
            }
        }
        if (i == 0 || ((Boolean) DXN.LIZIZ.getValue()).booleanValue()) {
            g0().setVisibility(8);
            return;
        }
        int i7 = MN0.LIZ[enumC56697MMz.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 == 4) {
                        g0().setVisibility(0);
                        c0().setVisibility(8);
                        ((ImageView) this.LJLZ.getValue()).setVisibility(0);
                        ((TextView) this.LJZI.getValue()).setText(resources.getString(R.string.he1));
                    }
                } else {
                    g0().setVisibility(0);
                    c0().setVisibility(8);
                    ((ImageView) this.LJLZ.getValue()).setVisibility(0);
                    ((TextView) this.LJZI.getValue()).setText(resources.getString(R.string.hf1, Integer.valueOf(LIZLLL)));
                }
            } else {
                g0().setVisibility(0);
                c0().setVisibility(0);
                ((ImageView) this.LJLZ.getValue()).setVisibility(8);
                ((TextView) this.LJZI.getValue()).setText(resources.getString(R.string.hf1, Integer.valueOf(LIZLLL)));
                InboxEntranceExposedInfo exposedInfo3 = inboxEntrancePod2.entranceCell.getExposedInfo();
                if (exposedInfo3 != null && (nextUnreadNotice = exposedInfo3.getNextUnreadNotice()) != null) {
                    FollowNotice followNotice = nextUnreadNotice.followNotice;
                    if (followNotice != null) {
                        User user6 = followNotice.getUser();
                        if (user6 != null) {
                            urlModel2 = user6.getAvatarThumb();
                        }
                        activityIcon = new ActivityIcon(urlModel2, 0, null, 6, null);
                    } else {
                        DiggNotice diggNotice = nextUnreadNotice.diggNotice;
                        if (diggNotice != null) {
                            List<User> users = diggNotice.getUsers();
                            if (users != null && (user5 = (User) ORZ.LJLLLL(users)) != null) {
                                urlModel3 = user5.getAvatarThumb();
                            }
                            activityIcon = new ActivityIcon(urlModel3, 0, null, 6, null);
                        } else {
                            CommentNotice commentNotice = nextUnreadNotice.commentNotice;
                            if (commentNotice != null && commentNotice.getComment() != null) {
                                CommentNotice commentNotice2 = nextUnreadNotice.commentNotice;
                                if (commentNotice2 != null && (comment = commentNotice2.getComment()) != null && (user4 = comment.getUser()) != null) {
                                    urlModel4 = user4.getAvatarThumb();
                                }
                                activityIcon = new ActivityIcon(urlModel4, 0, null, 6, null);
                            } else {
                                AtMe atMe = nextUnreadNotice.atMe;
                                if (atMe != null) {
                                    User user7 = atMe.getUser();
                                    if (user7 != null) {
                                        urlModel5 = user7.getAvatarThumb();
                                    }
                                    activityIcon = new ActivityIcon(urlModel5, 0, null, 6, null);
                                } else if (nextUnreadNotice.announcement != null) {
                                    activityIcon = new ActivityIcon(null, R.drawable.zf, null, 5, null);
                                } else if (nextUnreadNotice.textNotice != null) {
                                    activityIcon = new ActivityIcon(null, R.drawable.z6, null, 5, null);
                                } else if (nextUnreadNotice.tcmNotice != null) {
                                    activityIcon = new ActivityIcon(null, R.drawable.z_, null, 5, null);
                                } else if (nextUnreadNotice.promoteNotice != null) {
                                    activityIcon = new ActivityIcon(null, R.drawable.z5, null, 5, null);
                                } else {
                                    FollowApproveNotice followApproveNotice = nextUnreadNotice.followApproveNotice;
                                    if (followApproveNotice != null) {
                                        User user8 = followApproveNotice.getUser();
                                        if (user8 != null) {
                                            urlModel6 = user8.getAvatarThumb();
                                        }
                                        activityIcon = new ActivityIcon(urlModel6, 0, null, 6, null);
                                    } else {
                                        CheckProfileNotice checkProfileNotice = nextUnreadNotice.checkProfileNotice;
                                        if (checkProfileNotice != null) {
                                            List<User> users2 = checkProfileNotice.getUsers();
                                            if (users2 != null && (user3 = (User) ORZ.LJLLLL(users2)) != null) {
                                                urlModel7 = user3.getAvatarThumb();
                                            }
                                            activityIcon = new ActivityIcon(urlModel7, 0, null, 6, null);
                                        } else {
                                            DuetNotice duetNotice = nextUnreadNotice.duetNotice;
                                            if (duetNotice != null) {
                                                Aweme aweme = duetNotice.getAweme();
                                                if (aweme != null && (author2 = aweme.getAuthor()) != null) {
                                                    urlModel8 = author2.getAvatarThumb();
                                                }
                                                activityIcon = new ActivityIcon(urlModel8, 0, null, 6, null);
                                            } else if (nextUnreadNotice.adHelperNotice != null) {
                                                activityIcon = new ActivityIcon(null, R.drawable.zj, null, 5, null);
                                            } else {
                                                FriendNotice friendNotice = nextUnreadNotice.friendNotice;
                                                if (friendNotice != null) {
                                                    User user9 = friendNotice.getUser();
                                                    if (user9 != null) {
                                                        urlModel9 = user9.getAvatarThumb();
                                                    }
                                                    activityIcon = new ActivityIcon(urlModel9, 0, null, 6, null);
                                                } else {
                                                    PostNotice postNotice = nextUnreadNotice.postNotice;
                                                    if (postNotice != null) {
                                                        Aweme aweme2 = postNotice.getAweme();
                                                        if (aweme2 != null && (author = aweme2.getAuthor()) != null) {
                                                            urlModel10 = author.getAvatarThumb();
                                                        }
                                                        activityIcon = new ActivityIcon(urlModel10, 0, null, 6, null);
                                                    } else {
                                                        VoteNotice voteNotice = nextUnreadNotice.voteNotice;
                                                        if (voteNotice != null) {
                                                            List<? extends User> list3 = voteNotice.userList;
                                                            if (list3 != null && (user2 = (User) ORZ.LJLLLL(list3)) != null) {
                                                                urlModel11 = user2.getAvatarThumb();
                                                            }
                                                            activityIcon = new ActivityIcon(urlModel11, 0, null, 6, null);
                                                        } else if (nextUnreadNotice.businessAccountNotice != null) {
                                                            activityIcon = new ActivityIcon(null, R.drawable.za, null, 5, null);
                                                        } else {
                                                            DonationNotice donationNotice = nextUnreadNotice.donationNotice;
                                                            if (donationNotice != null) {
                                                                User user10 = donationNotice.user;
                                                                if (user10 != null) {
                                                                    urlModel12 = user10.getAvatarThumb();
                                                                }
                                                                activityIcon = new ActivityIcon(urlModel12, 0, null, 6, null);
                                                            } else {
                                                                GeneralTemplateNotice generalTemplateNotice = nextUnreadNotice.templateNotice;
                                                                if (generalTemplateNotice != null) {
                                                                    NoticeUITemplate noticeUITemplate = generalTemplateNotice.uiTemplate;
                                                                    if (noticeUITemplate != null) {
                                                                        urlModel = noticeUITemplate.avatarImageUrl;
                                                                        if (urlModel == null) {
                                                                            if (noticeUITemplate != null && (titleTemplate = noticeUITemplate.titleTemplate) != null && (list2 = titleTemplate.fromUsers) != null && (user = (User) ORZ.LJLLLL(list2)) != null) {
                                                                                urlModel = user.getAvatarThumb();
                                                                            }
                                                                        }
                                                                        if (urlModel != null && (str = nextUnreadNotice.templateId) != null && str.length() != 0) {
                                                                            List<String> urlList = urlModel.getUrlList();
                                                                            if (urlList != null) {
                                                                                str2 = (String) ORZ.LJLLLL(urlList);
                                                                            }
                                                                            activityIcon = new ActivityIcon(null, 0, str2, 3, null);
                                                                        }
                                                                        activityIcon = new ActivityIcon(urlModel, 0, null, 6, null);
                                                                    }
                                                                    urlModel = null;
                                                                    activityIcon = new ActivityIcon(urlModel, 0, null, 6, null);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (activityIcon.urlModel != null) {
                        C78765Uvh.LJFF(c0(), activityIcon.urlModel);
                    } else if (activityIcon.resId != -1) {
                        c0().setImageURI(C78964Uyu.LIZJ(activityIcon.resId));
                    } else if (C78685UuP.LJJJZ(activityIcon.url)) {
                        C78765Uvh.LJIIIZ(c0(), activityIcon.url, -1, -1);
                    }
                }
            }
        } else {
            g0().setVisibility(8);
        }
        SystemClock.uptimeMillis();
    }

    @Override // X.MMX
    public final void X(InboxEntrancePod inboxEntrancePod) {
        InboxEntrancePod inboxEntrancePod2 = inboxEntrancePod;
        super.X(inboxEntrancePod2);
        View onBindSkeleton$lambda$1 = this.itemView.findViewById(R.id.h45);
        o.LJIIIIZZ(onBindSkeleton$lambda$1, "onBindSkeleton$lambda$1");
        C26338AVi.LJIIIZ(onBindSkeleton$lambda$1, null, C1FJ.LIZIZ(10), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10))), 21);
        ((AbstractC72775ShH) onBindSkeleton$lambda$1.findViewById(R.id.j2i)).setLoading(true);
        View onBindSkeleton$lambda$2 = this.itemView.findViewById(R.id.h46);
        o.LJIIIIZZ(onBindSkeleton$lambda$2, "onBindSkeleton$lambda$2");
        C26338AVi.LJIIIZ(onBindSkeleton$lambda$2, null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10))), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(10))), 21);
        ((AbstractC72775ShH) onBindSkeleton$lambda$2.findViewById(R.id.j2i)).setLoading(true);
        TuxTextView tuxTextView = (TuxTextView) this.LJLL.getValue();
        tuxTextView.LJJJ(16.0f);
        tuxTextView.setText(tuxTextView.getContext().getResources().getQuantityText(R.plurals.gr, 2));
        i0(inboxEntrancePod2);
        h0(inboxEntrancePod2);
        ((View) this.LJLLJ.getValue()).setVisibility(0);
        ((View) this.LJZ.getValue()).setVisibility(0);
    }

    public final void h0(InboxEntrancePod inboxEntrancePod) {
        int LIZLLL = MLS.LIZLLL(inboxEntrancePod.entranceCell);
        if (LIZLLL > 0) {
            InboxEntranceCellUIInfo LIZIZ = MLS.LIZIZ(inboxEntrancePod);
            if (LIZIZ != null && LIZIZ.getUnreadType() == 2) {
                AVS avs = (AVS) this.LJLLI.getValue();
                avs.setVariant(1);
                avs.setCount(LIZLLL);
                avs.setVisibility(0);
                return;
            }
            AVS avs2 = (AVS) this.LJLLI.getValue();
            avs2.setVariant(0);
            avs2.setVisibility(0);
            return;
        }
        ((View) this.LJLLI.getValue()).setVisibility(8);
    }

    public final void i0(InboxEntrancePod inboxEntrancePod) {
        String str;
        ((TuxTextView) this.LJLL.getValue()).LJJJ(16.0f);
        TextView textView = (TextView) this.LJLL.getValue();
        InboxEntranceCellUIInfo LIZIZ = MLS.LIZIZ(inboxEntrancePod);
        if (LIZIZ == null || (str = LIZIZ.getTitle()) == null) {
            str = "";
        }
        textView.setText(str);
    }
}
