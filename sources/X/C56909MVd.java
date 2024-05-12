package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.fragment.FragmentRoute;
import com.bytedance.router.fragment.NavigationUtils;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* renamed from: X.MVd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56909MVd extends MVY {
    public final View LJLIL;
    public final View LJLILLLLZI;
    public final AP9 LJLJI;
    public final C119624mk LJLJJI;
    public final C119624mk LJLJJL;
    public final View LJLJJLL;
    public final TuxTextView LJLJL;
    public final TextView LJLJLJ;
    public final C62354Oda LJLJLLL;
    public final C188627ak LJLL;
    public final View LJLLI;
    public final TextView LJLLILLLL;
    public final TuxIconView LJLLJ;
    public final ViewStub LJLLL;
    public DiggNotice LJLLLL;
    public boolean LJLLLLLL;
    public BaseNotice LJLZ;
    public String LJZ;
    public String LJZI;
    public final C51698KQs LJZL;
    public final C62822Ol8 LL;
    public final C62822Ol8 LLD;
    public User LLF;

    @Override // X.MVY
    public final boolean isFromAggregatedAvatar() {
        List<User> users;
        Integer valueOf;
        DiggNotice diggNotice = this.LJLLLL;
        if (diggNotice != null && (users = diggNotice.getUsers()) != null && (valueOf = Integer.valueOf(users.size())) != null && valueOf.intValue() > 1) {
            return true;
        }
        return false;
    }

    @Override // X.ViewOnClickListenerC56908MVc
    public final void onLifecycleSet() {
        C51698KQs c51698KQs = this.LJZL;
        if (c51698KQs != null) {
            c51698KQs.LJLLI = requireLifeCycleOwner();
        }
    }

    @Override // X.MVY
    public final User getUserFromNotice() {
        List<User> users;
        List<User> users2;
        if (C53357Kwr.LIZJ()) {
            DiggNotice diggNotice = this.LJLLLL;
            if (diggNotice == null || (users2 = diggNotice.getUsers()) == null || !(true ^ users2.isEmpty())) {
                return null;
            }
            return (User) ListProtector.get(users2, 0);
        }
        DiggNotice diggNotice2 = this.LJLLLL;
        if (diggNotice2 == null || (users = diggNotice2.getUsers()) == null || users.size() != 1) {
            return null;
        }
        return (User) ListProtector.get(users, 0);
    }

    @Override // X.MVV
    public final void reportShowEvent() {
        super.reportShowEvent();
        InterfaceC56771MPv interfaceC56771MPv = this.vm;
        if (interfaceC56771MPv != null) {
            interfaceC56771MPv.vP(this.mMTBaseNotice, new AqS159S0100000_9(this, 430));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56909MVd(View itemView) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.h5p);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.notification_root)");
        this.LJLIL = findViewById;
        View findViewById2 = itemView.findViewById(R.id.h4x);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.….notification_head_multi)");
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = itemView.findViewById(R.id.h4v);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.notification_head)");
        AP9 ap9 = (AP9) findViewById3;
        this.LJLJI = ap9;
        View findViewById4 = itemView.findViewById(R.id.h50);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.….notification_head_user1)");
        C119624mk c119624mk = (C119624mk) findViewById4;
        this.LJLJJI = c119624mk;
        View findViewById5 = itemView.findViewById(R.id.h51);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.….notification_head_user2)");
        C119624mk c119624mk2 = (C119624mk) findViewById5;
        this.LJLJJL = c119624mk2;
        View findViewById6 = itemView.findViewById(R.id.iw7);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.reply_divider)");
        this.LJLJJLL = findViewById6;
        View findViewById7 = itemView.findViewById(R.id.h5f);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.notification_name)");
        TuxTextView tuxTextView = (TuxTextView) findViewById7;
        this.LJLJL = tuxTextView;
        View findViewById8 = itemView.findViewById(R.id.h4l);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.notification_content)");
        this.LJLJLJ = (TextView) findViewById8;
        View findViewById9 = itemView.findViewById(R.id.h4p);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.…notification_cover_right)");
        C62354Oda c62354Oda = (C62354Oda) findViewById9;
        this.LJLJLLL = c62354Oda;
        View findViewById10 = itemView.findViewById(R.id.gv3);
        o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.mutual_relation_view)");
        this.LJLL = (C188627ak) findViewById10;
        View findViewById11 = itemView.findViewById(R.id.h5l);
        o.LJIIIIZZ(findViewById11, "itemView.findViewById(R.…fication_reply_container)");
        this.LJLLI = findViewById11;
        View findViewById12 = itemView.findViewById(R.id.h5m);
        o.LJIIIIZZ(findViewById12, "itemView.findViewById(R.…tification_reply_content)");
        this.LJLLILLLL = (TextView) findViewById12;
        View findViewById13 = itemView.findViewById(R.id.h5a);
        o.LJIIIIZZ(findViewById13, "itemView.findViewById(R.id.notification_mark)");
        this.LJLLJ = (TuxIconView) findViewById13;
        View findViewById14 = itemView.findViewById(R.id.km3);
        o.LJIIIIZZ(findViewById14, "itemView.findViewById(R.id.stub_avatar_expand)");
        this.LJLLL = (ViewStub) findViewById14;
        this.LJLLLLLL = true;
        this.LL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 428));
        this.LLD = C221108m2.LIZIZ(new AqS159S0100000_9(this, 429));
        if (C53341Kwb.LIZ()) {
            MVR.LIZ(findViewById, MVP.CELL, 0.0f);
            SmartAvatarImageView avatarImageView = ap9.getAvatarImageView();
            MVP mvp = MVP.AVATAR;
            MVR.LIZ(avatarImageView, mvp, 0.0f);
            findViewById2.setOnTouchListener(new MV8(findViewById2, c119624mk, c119624mk2));
            MVR.LIZ(c62354Oda, mvp, C32151Nz.LJIIZILJ(2));
            MVR.LIZ(tuxTextView, MVP.USERNAME, 0.0f);
        } else {
            MVR.LJ(findViewById);
            C7FA.LIZIZ(findViewById2);
            C7FA.LIZIZ(c62354Oda);
        }
        C16880lQ.LJIIJ(this, findViewById);
        C16880lQ.LJIIJ(this, findViewById2);
        C16880lQ.LJJJLL(this.mTvNameAppendFollow, this);
        C16880lQ.LJJJJJ(ap9, this);
        ap9.setRequestImgSize(J7H.LIZ(101));
        C16880lQ.LJJJJLI(c62354Oda, this);
        if (C99W.LIZ) {
            c62354Oda.setCornerRadius(C32151Nz.LJIIZILJ(4));
        }
        this.LJZL = new C51698KQs(this.mTvNameAppendFollow, new MW8(this));
        V92 hierarchy = c62354Oda.getHierarchy();
        Context context = this.mContext;
        o.LJIIIIZZ(context, "context");
        hierarchy.LJIILL(C79045V0n.LJIIIIZZ(R.attr.cf, context), 1);
    }

    @Override // X.MVV
    public final void applyNewCover(int i) {
        super.applyNewCover(i);
        applyCoverSize(i, this.LJLJLLL);
    }

    @Override // X.MVY, X.MVV
    public final void applyNewStyle(C96533qb c96533qb) {
        super.applyNewStyle(c96533qb);
        applyHead(c96533qb, this.LJLJI);
        applyAggregatedHead(c96533qb, this.LJLILLLLZI, this.LJLJJI, this.LJLJJL);
        applyTitleSize(c96533qb, this.LJLJL);
        applyContentColor(c96533qb, this.LJLJLJ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (X.C2NU.LIZ.LIZIZ() == false) goto L8;
     */
    @Override // X.ViewOnClickListenerC56908MVc, android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onClick(android.view.View r25) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56909MVd.onClick(android.view.View):void");
    }

    @Override // X.C56906MVa
    public final void setNotificationGuideBundle(int i) {
        int mergeCount;
        String string;
        Integer valueOf;
        Bundle bundle = new Bundle();
        BaseNotice baseNotice = this.LJLZ;
        if (baseNotice != null) {
            bundle.putInt("from_where", baseNotice.type);
        }
        DiggNotice diggNotice = this.LJLLLL;
        UrlModel urlModel = null;
        if (diggNotice != null && (mergeCount = diggNotice.getMergeCount()) > 0) {
            bundle.putString("username", MVR.LIZIZ((User) ListProtector.get(diggNotice.getUsers(), 0), true));
            urlModel = ((User) ListProtector.get(diggNotice.getUsers(), 0)).getAvatarThumb();
            if (mergeCount >= 2) {
                if (diggNotice.getDiggType() == 1 && (valueOf = Integer.valueOf(R.string.ixe)) != null) {
                    valueOf.intValue();
                    String string2 = this.mContext.getResources().getString(valueOf.intValue(), Integer.valueOf(mergeCount - 1));
                    o.LJIIIIZZ(string2, "context\n                …ring(multiText, size - 1)");
                    bundle.putString("content", string2);
                } else {
                    return;
                }
            } else if (diggNotice.getDiggType() == 1) {
                Aweme aweme = diggNotice.getAweme();
                if (aweme != null && aweme.isPhotoMode() && C8SG.LIZIZ.LJJIFFI()) {
                    string = this.mContext.getString(R.string.ix2);
                } else {
                    string = this.mContext.getString(R.string.ix1);
                }
                if (string == null) {
                    return;
                } else {
                    bundle.putString("content", string);
                }
            } else {
                return;
            }
        }
        bundle.putSerializable("avatar_thumb", urlModel);
        this.mNotificationGuideBundle = bundle;
        this.isRecordNotificationGuideInto = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0132, code lost:
    
        if (r2 > 1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02e0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice r24, boolean r25, java.lang.String r26, java.lang.String r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56909MVd.M(com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice, boolean, java.lang.String, java.lang.String, boolean):void");
    }

    public final void N(Context context, String str, Aweme aweme, Comment comment, int i, long j) {
        String aid;
        String str2;
        UrlModel urlModel;
        Video video;
        String str3;
        UrlModel urlModel2;
        MWH mwh;
        Video video2;
        MOX.LIZ.getClass();
        MWH mwh2 = null;
        if (i == 3) {
            if (comment != null) {
                aid = comment.getCid();
            }
            aid = null;
        } else {
            if (aweme != null) {
                aid = aweme.getAid();
            }
            aid = null;
        }
        if (C53355Kwp.LIZ()) {
            LifecycleOwner requireLifeCycleOwner = requireLifeCycleOwner();
            o.LJIIIIZZ(requireLifeCycleOwner, "requireLifeCycleOwner()");
            if (NavigationUtils.findNavigationContainer(C212428Vi.LIZLLL(requireLifeCycleOwner)) != null) {
                LifecycleOwner requireLifeCycleOwner2 = requireLifeCycleOwner();
                o.LJIIIIZZ(requireLifeCycleOwner2, "requireLifeCycleOwner()");
                Fragment LIZLLL = C212428Vi.LIZLLL(requireLifeCycleOwner2);
                if (aweme != null) {
                    str3 = aweme.getAid();
                } else {
                    str3 = null;
                }
                boolean z = this.LJLLLLLL;
                String LJIIIZ = V3N.LJIIIZ(comment);
                if (aweme != null && (video2 = aweme.getVideo()) != null) {
                    urlModel2 = video2.getOriginCover();
                } else {
                    urlModel2 = null;
                }
                boolean LJIIZILJ = C54838Lfe.LJIIZILJ(aweme);
                InterfaceC56771MPv interfaceC56771MPv = this.vm;
                if (interfaceC56771MPv != null) {
                    mwh = interfaceC56771MPv.Kg0();
                } else {
                    mwh = null;
                }
                if (str3 == null || str3.length() == 0 || aid == null || aid.length() == 0) {
                    return;
                }
                FragmentRoute fragmentNavigation = SmartRouter.fragmentNavigation(LIZLLL);
                o.LJIIIIZZ(fragmentNavigation, "fragmentNavigation(fragment)");
                FragmentRoute.push$default(fragmentNavigation, "//notice/like_list_fragment", null, null, 6, null);
                fragmentNavigation.withParam("nid", str);
                fragmentNavigation.withParam("aweme_id", str3);
                fragmentNavigation.withParam("ref_id", aid);
                fragmentNavigation.withParam("is_new", z);
                fragmentNavigation.withParam("digg_type", i);
                fragmentNavigation.withParam("last_read_time", j);
                fragmentNavigation.withParam("second_title", LJIIIZ);
                fragmentNavigation.withParam("is_story", LJIIZILJ);
                if (urlModel2 != null) {
                    fragmentNavigation.withParam("cover", urlModel2);
                }
                if (mwh != null) {
                    if (C78685UuP.LJJJZ(mwh.LIZ)) {
                        fragmentNavigation.withParam("sort_option_name", mwh.LIZ);
                    }
                    if (C78685UuP.LJJJZ(mwh.LIZIZ)) {
                        fragmentNavigation.withParam("notification_tab_name", mwh.LIZIZ);
                    }
                }
                FragmentRoute.commit$default(fragmentNavigation, null, 1, null);
                return;
            }
        }
        if (aweme != null) {
            str2 = aweme.getAid();
        } else {
            str2 = null;
        }
        boolean z2 = this.LJLLLLLL;
        String LJIIIZ2 = V3N.LJIIIZ(comment);
        if (aweme != null && (video = aweme.getVideo()) != null) {
            urlModel = video.getOriginCover();
        } else {
            urlModel = null;
        }
        String str4 = this.LJZ;
        boolean LJIIZILJ2 = C54838Lfe.LJIIZILJ(aweme);
        InterfaceC56771MPv interfaceC56771MPv2 = this.vm;
        if (interfaceC56771MPv2 != null) {
            mwh2 = interfaceC56771MPv2.Kg0();
        }
        C56931MVz.LIZ(context, str, str2, aid, z2, i, j, LJIIIZ2, urlModel, str4, LJIIZILJ2, mwh2);
    }
}
