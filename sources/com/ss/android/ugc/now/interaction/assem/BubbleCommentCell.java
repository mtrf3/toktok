package com.ss.android.ugc.now.interaction.assem;

import X.ActivityC45651qj;
import X.AnonymousClass729;
import X.C110614Vt;
import X.C116724i4;
import X.C120974ov;
import X.C16880lQ;
import X.C178406zM;
import X.C1794072i;
import X.C1799274i;
import X.C1806977h;
import X.C210228Mw;
import X.C32151Nz;
import X.C47135Ieh;
import X.C62562cu;
import X.C71799SFv;
import X.C71Y;
import X.C78847Ux1;
import X.C7MY;
import X.C90193gN;
import X.EnumC1806777f;
import X.O6R;
import Y.ACListenerS38S0200000_3;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
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
public final class BubbleCommentCell extends PowerCell<CommentItem> {
    public C71799SFv LJLIL;
    public TuxTextView LJLILLLLZI;
    public TuxTextView LJLJI;
    public TuxIconView LJLJJI;
    public TuxTextView LJLJJL;

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
        CommentItem item = getItem();
        String str2 = null;
        if (item != null) {
            aweme = item.getAweme();
        } else {
            aweme = null;
        }
        int LJFF = LJJIIJ.LJFF(activityC45651qj, aweme);
        C71Y.LIZ("wuyuqiu", "comment bubble show");
        CommentItem item2 = getItem();
        if (item2 != null) {
            Comment comment = item2.getComment();
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
            o.LJIIIZ(comment, "<this>");
            if (comment.getCid() == null) {
                return;
            }
            Map<String, Set<String>> map = C120974ov.LIZ;
            Set set = (Set) ((LinkedHashMap) map).get(str);
            if (set != null && set.contains(comment.getCid())) {
                return;
            }
            if (!map.containsKey(str)) {
                map.put(str, new LinkedHashSet());
            }
            Set set2 = (Set) ((LinkedHashMap) map).get(str);
            C1794072i.LJIIIIZZ(str3, "comment", LJFF, i, comment.getUser().getUid(), str2);
            if (set2 == null) {
                return;
            }
            String cid = comment.getCid();
            o.LJIIIIZZ(cid, "cid");
            set2.add(cid);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        super.unBind();
        C71Y.LIZ("interactionBubble", "comment bubble unbind");
        this.itemView.setAlpha(1.0f);
        this.itemView.setVisibility(0);
    }

    public final void L(boolean z) {
        int i;
        float f;
        TextPaint paint;
        TextPaint paint2;
        CharSequence charSequence;
        TuxTextView tuxTextView = this.LJLJI;
        if (tuxTextView != null) {
            i = tuxTextView.getMaxWidth();
        } else {
            i = 0;
        }
        if (z) {
            TuxTextView tuxTextView2 = this.LJLILLLLZI;
            CharSequence charSequence2 = null;
            float f2 = 0.0f;
            if (tuxTextView2 != null && (paint2 = tuxTextView2.getPaint()) != null) {
                TuxTextView tuxTextView3 = this.LJLILLLLZI;
                if (tuxTextView3 != null) {
                    charSequence = tuxTextView3.getText();
                } else {
                    charSequence = null;
                }
                f = paint2.measureText(String.valueOf(charSequence));
            } else {
                f = 0.0f;
            }
            TuxTextView tuxTextView4 = this.LJLJJL;
            if (tuxTextView4 != null && (paint = tuxTextView4.getPaint()) != null) {
                TuxTextView tuxTextView5 = this.LJLJJL;
                if (tuxTextView5 != null) {
                    charSequence2 = tuxTextView5.getText();
                }
                f2 = paint.measureText(String.valueOf(charSequence2));
            }
            float f3 = i;
            if (f + f2 > f3) {
                if (f2 <= C7MY.LIZIZ(60)) {
                    TuxTextView tuxTextView6 = this.LJLILLLLZI;
                    if (tuxTextView6 == null) {
                        return;
                    }
                    tuxTextView6.setMaxWidth((int) ((f3 - f2) - C7MY.LIZIZ(12)));
                    return;
                }
                TuxTextView tuxTextView7 = this.LJLILLLLZI;
                if (tuxTextView7 != null) {
                    tuxTextView7.setMaxWidth(C47135Ieh.LIZ(60, i) - O6R.LJJIIZ(C32151Nz.LJIIZILJ(12)));
                }
                TuxTextView tuxTextView8 = this.LJLJJL;
                if (tuxTextView8 == null) {
                    return;
                }
                tuxTextView8.setMaxWidth(O6R.LJJIIZ(C32151Nz.LJIIZILJ(60)));
                return;
            }
            return;
        }
        TuxTextView tuxTextView9 = this.LJLILLLLZI;
        if (tuxTextView9 == null) {
            return;
        }
        tuxTextView9.setMaxWidth(i);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(CommentItem commentItem) {
        int LIZIZ;
        TuxTextView tuxTextView;
        String str;
        C71799SFv c71799SFv;
        CommentItem t = commentItem;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        Comment comment = t.getComment();
        NowFeedMobHierarchyData interactionHierarchyData = t.getInteractionHierarchyData();
        User user = comment.getUser();
        String str2 = null;
        if (user != null) {
            C62562cu LIZ = AnonymousClass729.LIZ(user);
            if (LIZ != null && (c71799SFv = this.LJLIL) != null) {
                C71799SFv.LJIIJ(c71799SFv, LIZ, null, false, null, 110);
            }
            TuxTextView tuxTextView2 = this.LJLILLLLZI;
            if (tuxTextView2 != null) {
                if (interactionHierarchyData != null) {
                    str = interactionHierarchyData.getEnterFrom();
                } else {
                    str = null;
                }
                tuxTextView2.setText(C1799274i.LJ(user, str));
            }
        }
        TuxTextView tuxTextView3 = this.LJLJI;
        if (tuxTextView3 != null) {
            C16880lQ.LJJJJI(tuxTextView3, new ACListenerS38S0200000_3(this, t, 72));
        }
        TuxTextView tuxTextView4 = this.LJLILLLLZI;
        if (tuxTextView4 != null) {
            C16880lQ.LJJJJI(tuxTextView4, new ACListenerS38S0200000_3(this, t, 73));
        }
        TuxIconView tuxIconView = this.LJLJJI;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS38S0200000_3(this, t, 74));
        }
        TuxTextView tuxTextView5 = this.LJLJJL;
        if (tuxTextView5 != null) {
            C16880lQ.LJJJJI(tuxTextView5, new ACListenerS38S0200000_3(this, t, 76));
        }
        C71799SFv c71799SFv2 = this.LJLIL;
        if (c71799SFv2 != null) {
            C16880lQ.LJJIL(c71799SFv2, new ACListenerS38S0200000_3(this, t, 77));
        }
        C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, t, 78), this.itemView);
        String text = comment.getText();
        if (text != null && (tuxTextView = this.LJLJI) != null) {
            C116724i4 c116724i4 = new C116724i4();
            c116724i4.LIZIZ(text);
            tuxTextView.setText(c116724i4.LIZ);
        }
        String replyToNickName = comment.getReplyToNickName();
        String replyToUserName = comment.getReplyToUserName();
        if (interactionHierarchyData != null) {
            str2 = interactionHierarchyData.getEnterFrom();
        }
        String LJIIIIZZ = C178406zM.LJIIIIZZ(replyToNickName, replyToUserName, str2);
        TuxTextView tuxTextView6 = this.LJLJI;
        if (tuxTextView6 != null) {
            if (C90193gN.LIZIZ(this.itemView.getContext())) {
                LIZIZ = C7MY.LIZIZ(212);
            } else {
                LIZIZ = C7MY.LIZIZ(220);
            }
            tuxTextView6.setMaxWidth(LIZIZ);
        }
        if (TextUtils.isEmpty(LJIIIIZZ)) {
            TuxIconView tuxIconView2 = this.LJLJJI;
            if (tuxIconView2 != null) {
                tuxIconView2.setVisibility(8);
            }
            TuxTextView tuxTextView7 = this.LJLJJL;
            if (tuxTextView7 != null) {
                tuxTextView7.setVisibility(8);
            }
            L(false);
            return;
        }
        TuxIconView tuxIconView3 = this.LJLJJI;
        if (tuxIconView3 != null) {
            tuxIconView3.setVisibility(0);
        }
        TuxTextView tuxTextView8 = this.LJLJJL;
        if (tuxTextView8 != null) {
            tuxTextView8.setVisibility(0);
        }
        TuxTextView tuxTextView9 = this.LJLJJL;
        if (tuxTextView9 != null) {
            tuxTextView9.setText(LJIIIIZZ);
        }
        L(true);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        C210228Mw c210228Mw = C210228Mw.LIZIZ;
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        View LIZIZ = c210228Mw.LIZIZ(context, R.layout.bai, parent, null);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.d8);
        c110614Vt.LIZJ = Float.valueOf(C7MY.LIZIZ(24));
        Context context2 = parent.getContext();
        o.LJIIIIZZ(context2, "parent.context");
        LIZIZ.setBackground(c110614Vt.LIZ(context2));
        this.LJLIL = (C71799SFv) LIZIZ.findViewById(R.id.abk);
        this.LJLILLLLZI = (TuxTextView) LIZIZ.findViewById(R.id.gvu);
        this.LJLJI = (TuxTextView) LIZIZ.findViewById(R.id.c6z);
        this.LJLJJI = (TuxIconView) LIZIZ.findViewById(R.id.ivw);
        this.LJLJJL = (TuxTextView) LIZIZ.findViewById(R.id.ivx);
        if (C1806977h.LIZ()) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(LIZIZ, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(100L);
            ofFloat.start();
        }
        return LIZIZ;
    }

    public final void M(CommentItem commentItem, boolean z) {
        String str;
        String str2;
        String str3;
        int i;
        NowPostInfo nowPostInfo;
        NowFeedMobHierarchyData interactionHierarchyData = commentItem.getInteractionHierarchyData();
        Comment comment = commentItem.getComment();
        int LJIIJ = NowsTabServiceImpl.LJJIIJ().LJIIJ((ActivityC45651qj) this.itemView.getContext(), commentItem.getAweme(), interactionHierarchyData, EnumC1806777f.COMMENT, comment);
        String str4 = null;
        if (interactionHierarchyData != null) {
            str = interactionHierarchyData.getEnterFrom();
        } else {
            str = null;
        }
        User user = comment.getUser();
        if (user != null) {
            str2 = user.getUid();
        } else {
            str2 = null;
        }
        Aweme aweme = commentItem.getAweme();
        if (aweme != null && (nowPostInfo = aweme.nowPostInfo) != null) {
            str4 = nowPostInfo.getNowMediaType();
        }
        if (z) {
            str3 = "click_head";
        } else {
            str3 = "click_text";
        }
        Aweme aweme2 = commentItem.getAweme();
        if (aweme2 != null) {
            i = C78847Ux1.LJJIJIIJI(aweme2);
        } else {
            i = 1;
        }
        C1794072i.LIZ(LJIIJ, i, str, str2, str4, str3, "comment");
    }
}
