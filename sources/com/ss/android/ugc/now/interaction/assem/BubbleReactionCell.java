package com.ss.android.ugc.now.interaction.assem;

import X.ActivityC45651qj;
import X.AnonymousClass729;
import X.C110614Vt;
import X.C120974ov;
import X.C16880lQ;
import X.C1794072i;
import X.C1806977h;
import X.C2068389v;
import X.C210228Mw;
import X.C62562cu;
import X.C71799SFv;
import X.C71Y;
import X.C78847Ux1;
import X.C7MY;
import Y.ACListenerS27S0400000_3;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.nows.service.NowsTabServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.INowsTabService;
import com.ss.android.ugc.now.interaction.NowFeedMobHierarchyData;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class BubbleReactionCell extends PowerCell<LikeItem> {
    public C71799SFv LJLIL;
    public TuxIconView LJLILLLLZI;

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        Aweme aweme;
        String str;
        int i;
        NowPostInfo nowPostInfo;
        String enterFrom;
        super.onViewAttachedToWindow();
        INowsTabService LJJIIJ = NowsTabServiceImpl.LJJIIJ();
        ActivityC45651qj activityC45651qj = (ActivityC45651qj) this.itemView.getContext();
        LikeItem item = getItem();
        String str2 = null;
        if (item != null) {
            aweme = item.getAweme();
        } else {
            aweme = null;
        }
        int LJFF = LJJIIJ.LJFF(activityC45651qj, aweme);
        C71Y.LIZ("wuyuqiu", "reaction bubble show");
        LikeItem item2 = getItem();
        if (item2 != null) {
            User user = item2.getUser();
            Aweme aweme2 = item2.getAweme();
            if (aweme2 != null) {
                str = aweme2.getAid();
            } else {
                str = null;
            }
            String str3 = "";
            if (str == null) {
                str = "";
            }
            NowFeedMobHierarchyData interactionHierarchyData = item2.getInteractionHierarchyData();
            if (interactionHierarchyData != null && (enterFrom = interactionHierarchyData.getEnterFrom()) != null) {
                str3 = enterFrom;
            }
            Aweme aweme3 = item2.getAweme();
            if (aweme3 != null && (nowPostInfo = aweme3.nowPostInfo) != null) {
                str2 = nowPostInfo.getNowMediaType();
            }
            Aweme aweme4 = item2.getAweme();
            if (aweme4 != null) {
                i = C78847Ux1.LJJIJIIJI(aweme4);
            } else {
                i = 1;
            }
            o.LJIIIZ(user, "<this>");
            if (user.getUid() == null) {
                return;
            }
            Map<String, Set<String>> map = C120974ov.LIZ;
            Set set = (Set) ((LinkedHashMap) map).get(str);
            if (set != null && set.contains(user.getUid())) {
                return;
            }
            if (!map.containsKey(str)) {
                map.put(str, new LinkedHashSet());
            }
            Set set2 = (Set) ((LinkedHashMap) map).get(str);
            C1794072i.LJIIIIZZ(str3, "reaction", LJFF, i, user.getUid(), str2);
            if (set2 == null) {
                return;
            }
            String uid = user.getUid();
            o.LJIIIIZZ(uid, "uid");
            set2.add(uid);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        C71Y.LIZ("interactionBubble", "reaction bubble unbind");
        this.itemView.setAlpha(1.0f);
        this.itemView.setVisibility(0);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(LikeItem likeItem) {
        LikeItem t = likeItem;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        User user = t.getUser();
        NowFeedMobHierarchyData interactionHierarchyData = t.getInteractionHierarchyData();
        C71799SFv c71799SFv = this.LJLIL;
        if (c71799SFv != null) {
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZIZ = Integer.valueOf(R.attr.d8);
            c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(24));
            Context context = c71799SFv.getContext();
            o.LJIIIIZZ(context, "it.context");
            c71799SFv.setBackground(c110614Vt.LIZ(context));
            C62562cu LIZ = AnonymousClass729.LIZ(user);
            if (LIZ != null) {
                C71799SFv c71799SFv2 = this.LJLIL;
                if (c71799SFv2 != null) {
                    C71799SFv.LJIIJ(c71799SFv2, LIZ, null, false, null, 110);
                } else {
                    o.LJIJI("avatarIv");
                    throw null;
                }
            }
            C71799SFv c71799SFv3 = this.LJLIL;
            if (c71799SFv3 != null) {
                C16880lQ.LJJIL(c71799SFv3, new ACListenerS27S0400000_3(this, t, interactionHierarchyData, user, 2));
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_color_n_thumbup;
                c2068389v.LJ = Integer.valueOf(R.attr.dj);
                c2068389v.LIZJ = C7MY.LIZIZ(14);
                c2068389v.LIZIZ = C7MY.LIZIZ(14);
                TuxIconView tuxIconView = this.LJLILLLLZI;
                if (tuxIconView != null) {
                    tuxIconView.setTuxIcon(c2068389v);
                    TuxIconView tuxIconView2 = this.LJLILLLLZI;
                    if (tuxIconView2 != null) {
                        C110614Vt c110614Vt2 = new C110614Vt();
                        c110614Vt2.LIZIZ = Integer.valueOf(R.attr.eg);
                        c110614Vt2.LIZJ = Float.valueOf(C7MY.LIZIZ(20));
                        Context context2 = this.itemView.getContext();
                        o.LJIIIIZZ(context2, "itemView.context");
                        tuxIconView2.setBackground(c110614Vt2.LIZ(context2));
                        return;
                    }
                    o.LJIJI("iconIv");
                    throw null;
                }
                o.LJIJI("iconIv");
                throw null;
            }
            o.LJIJI("avatarIv");
            throw null;
        }
        o.LJIJI("avatarIv");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        C210228Mw c210228Mw = C210228Mw.LIZIZ;
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        View LIZIZ = c210228Mw.LIZIZ(context, R.layout.bal, null, null);
        View findViewById = LIZIZ.findViewById(R.id.abk);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.avatarIv)");
        this.LJLIL = (C71799SFv) findViewById;
        View findViewById2 = LIZIZ.findViewById(R.id.ea_);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.iconIv)");
        this.LJLILLLLZI = (TuxIconView) findViewById2;
        if (C1806977h.LIZ()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(LIZIZ, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(100L);
            ofFloat.start();
        }
        return LIZIZ;
    }
}
