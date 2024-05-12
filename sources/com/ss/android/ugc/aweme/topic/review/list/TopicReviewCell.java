package com.ss.android.ugc.aweme.topic.review.list;

import X.AJ9;
import X.AnonymousClass391;
import X.C06530Nl;
import X.C16880lQ;
import X.C185967Ro;
import X.C186177Sj;
import X.C186607Ua;
import X.C186617Ub;
import X.C186637Ud;
import X.C186647Ue;
import X.C186657Uf;
import X.C186667Ug;
import X.C1DI;
import X.C2068389v;
import X.C208278Fj;
import X.C214298b3;
import X.C245319jz;
import X.C252669vq;
import X.C26338AVi;
import X.C30901Je;
import X.C32151Nz;
import X.C62562cu;
import X.C65352Pkq;
import X.C65776Prg;
import X.C71799SFv;
import X.C76800UCe;
import X.C77339UWx;
import X.C79234V7u;
import X.C7R7;
import X.C7UO;
import X.C7UU;
import X.C7UV;
import X.C7UW;
import X.C7UX;
import X.C7UY;
import X.C7UZ;
import X.C84G;
import X.C86036Xpg;
import X.C88913eJ;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.HG3;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC93923mO;
import X.O6R;
import X.RBX;
import X.ViewOnClickListenerC13880ga;
import X.YE1;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS38S0200000_3;
import Y.ALAdapterS2S0100000_3;
import Y.AUListenerS92S0100000_3;
import Y.IDCListenerS296S0100000_3;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.topic.review.model.TopicReview;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewListVM;
import com.ss.android.ugc.aweme.topic.review.vm.TopicReviewVM;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AqS107S0300000_3;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TopicReviewCell extends PowerCell<C186177Sj> {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public C71799SFv LJLJI;
    public TuxTextView LJLJJI;
    public C84G LJLJJL;
    public C208278Fj LJLJJLL;
    public TuxTextView LJLJL;
    public TuxTextView LJLJLJ;
    public TuxTextView LJLJLLL;
    public TuxTextView LJLL;
    public TuxIconView LJLLI;

    public final TopicReviewVM L() {
        return (TopicReviewVM) this.LJLILLLLZI.getValue();
    }

    public final TopicReviewListVM M() {
        return (TopicReviewListVM) this.LJLIL.getValue();
    }

    public final void N() {
        FragmentManager fragmentManager;
        C186177Sj item;
        TopicReview topicReview;
        Fragment LJIIIZ = C79234V7u.LJIIIZ(this.itemView);
        if (LJIIIZ == null || (fragmentManager = LJIIIZ.getFragmentManager()) == null || (item = getItem()) == null || (topicReview = item.LJLIL) == null) {
            return;
        }
        C7UO.LIZ(fragmentManager, null, topicReview, true, null, 18);
    }

    public final void P() {
        FragmentManager fragmentManager;
        C186177Sj item;
        TopicReview topicReview;
        Fragment LJIIIZ = C79234V7u.LJIIIZ(this.itemView);
        if (LJIIIZ == null || (fragmentManager = LJIIIZ.getFragmentManager()) == null || (item = getItem()) == null || (topicReview = item.LJLIL) == null) {
            return;
        }
        C245319jz c245319jz = new C245319jz();
        if (o.LJ(topicReview.getUser().getUid(), ((RBX) HG3.LJIILL()).getCurUserId())) {
            C252669vq LIZIZ = C06530Nl.LIZIZ(R.string.cdc);
            LIZIZ.LJ = new ACListenerS21S0100000_1(new AqS107S0300000_3(this, fragmentManager, topicReview, 21), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            C252669vq LIZIZ2 = C06530Nl.LIZIZ(R.string.cdb);
            LIZIZ2.LIZJ = 1;
            LIZIZ2.LJ = new ACListenerS21S0100000_1(new AqS134S0200000_3(this, topicReview, 160), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            c245319jz.LIZIZ(LIZIZ, LIZIZ2);
        } else {
            String LLLZ = C16880lQ.LLLZ(C88913eJ.LIZ(this.itemView, R.string.cdk, "itemView.context.getStri…views_reportpopup_header)"), Arrays.copyOf(new Object[]{topicReview.getUser().getNickname()}, 1));
            o.LJIIIIZZ(LLLZ, "format(format, *args)");
            c245319jz.LJII(LLLZ);
            C252669vq LIZIZ3 = C06530Nl.LIZIZ(R.string.cdj);
            LIZIZ3.LJ = new ACListenerS21S0100000_1(new AqS134S0200000_3(this, topicReview, 161), (InterfaceC88472Yns<? super View, C76800UCe>) 27);
            c245319jz.LIZIZ(LIZIZ3);
        }
        c245319jz.LIZLLL(R.string.cdi);
        c245319jz.LIZJ().show(fragmentManager, "TopicReviewMenuPanel");
    }

    public TopicReviewCell() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(TopicReviewListVM.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1100);
        C186617Ub c186617Ub = C186617Ub.INSTANCE;
        C9BD c9bd = C9BD.LIZ;
        if (o.LJ(c9be, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C7UU.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1090), new AqS153S0100000_3((InterfaceC93923mO) this, 1092), C186647Ue.INSTANCE, c186617Ub, new AqS153S0100000_3((InterfaceC93923mO) this, 1094), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C7UW.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1096), new AqS153S0100000_3((InterfaceC93923mO) this, 1091), C186637Ud.INSTANCE, c186617Ub, new AqS153S0100000_3((InterfaceC93923mO) this, 1093), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C7UV.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1095), new AqS153S0100000_3((InterfaceC93923mO) this, 1097), new AqS153S0100000_3((InterfaceC93923mO) this, 1098), c186617Ub, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(TopicReviewVM.class);
        AqS153S0100000_3 aqS153S0100000_32 = new AqS153S0100000_3(LIZ2, 1099);
        C186607Ua c186607Ua = C186607Ua.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b32 = new C214298b3(LIZ2, aqS153S0100000_32, C7UX.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1101), new AqS153S0100000_3((InterfaceC93923mO) this, 1102), C186657Uf.INSTANCE, c186607Ua, new AqS153S0100000_3((InterfaceC93923mO) this, 1103), 256);
        } else if (o.LJ(c9bd, c9be)) {
            c214298b32 = new C214298b3(LIZ2, aqS153S0100000_32, C7UY.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1104), new AqS153S0100000_3((InterfaceC93923mO) this, 1105), C186667Ug.INSTANCE, c186607Ua, new AqS153S0100000_3((InterfaceC93923mO) this, 1106), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b32 = new C214298b3(LIZ2, aqS153S0100000_32, C7UZ.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1107), new AqS153S0100000_3((InterfaceC93923mO) this, 1088), new AqS153S0100000_3((InterfaceC93923mO) this, 1089), c186607Ua, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLILLLLZI = c214298b32;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View findViewById = this.itemView.findViewById(R.id.abh);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.avatar)");
        this.LJLJI = (C71799SFv) findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.gvs);
        o.LJIIIIZZ(findViewById2, "itemView.findViewById(R.id.name)");
        this.LJLJJI = (TuxTextView) findViewById2;
        View findViewById3 = this.itemView.findViewById(R.id.in_);
        o.LJIIIIZZ(findViewById3, "itemView.findViewById(R.id.rating_bar)");
        this.LJLJJL = (C84G) findViewById3;
        View findViewById4 = this.itemView.findViewById(R.id.text);
        o.LJIIIIZZ(findViewById4, "itemView.findViewById(R.id.text)");
        this.LJLJJLL = (C208278Fj) findViewById4;
        View findViewById5 = this.itemView.findViewById(R.id.n_);
        o.LJIIIIZZ(findViewById5, "itemView.findViewById(R.id.action)");
        this.LJLJL = (TuxTextView) findViewById5;
        View findViewById6 = this.itemView.findViewById(R.id.c3l);
        o.LJIIIIZZ(findViewById6, "itemView.findViewById(R.id.date)");
        this.LJLJLJ = (TuxTextView) findViewById6;
        View findViewById7 = this.itemView.findViewById(R.id.cn7);
        o.LJIIIIZZ(findViewById7, "itemView.findViewById(R.id.edit)");
        this.LJLJLLL = (TuxTextView) findViewById7;
        View findViewById8 = this.itemView.findViewById(R.id.frf);
        o.LJIIIIZZ(findViewById8, "itemView.findViewById(R.id.like_text)");
        this.LJLL = (TuxTextView) findViewById8;
        View findViewById9 = this.itemView.findViewById(R.id.fr9);
        o.LJIIIIZZ(findViewById9, "itemView.findViewById(R.id.like_icon)");
        this.LJLLI = (TuxIconView) findViewById9;
        if (C7R7.LIZ()) {
            View findViewById10 = this.itemView.findViewById(R.id.fg4);
            o.LJIIIIZZ(findViewById10, "itemView.findViewById(R.id.layout)");
            C26338AVi.LJIIIZ(findViewById10, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), AnonymousClass391.LIZJ(8), AnonymousClass391.LIZJ(16), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(8))), 16);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        TopicReview topicReview;
        super.onViewAttachedToWindow();
        C186177Sj item = getItem();
        if (item != null && (topicReview = item.LJLIL) != null) {
            C185967Ro c185967Ro = M().LJLJJI;
            c185967Ro.getClass();
            c185967Ro.LIZ.put(topicReview.getReviewId(), Long.valueOf(System.currentTimeMillis()));
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewDetachedFromWindow() {
        TopicReview topicReview;
        super.onViewDetachedFromWindow();
        C186177Sj item = getItem();
        if (item != null && (topicReview = item.LJLIL) != null) {
            C185967Ro c185967Ro = M().LJLJJI;
            c185967Ro.getClass();
            Long remove = c185967Ro.LIZ.remove(topicReview.getReviewId());
            if (remove != null) {
                long currentTimeMillis = System.currentTimeMillis() - remove.longValue();
                HashMap<String, Long> hashMap = c185967Ro.LIZIZ;
                String reviewId = topicReview.getReviewId();
                Long l = c185967Ro.LIZIZ.get(topicReview.getReviewId());
                if (l == null) {
                    l = 0L;
                }
                hashMap.put(reviewId, Long.valueOf(l.longValue() + currentTimeMillis));
            }
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.csq, viewGroup, false, "from(parent.context).inf…view_cell, parent, false)");
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C186177Sj c186177Sj, List payloads) {
        UrlModel avatarLarger;
        List<String> list;
        int i;
        int i2;
        String text;
        CharSequence charSequence;
        String text2;
        C186177Sj t = c186177Sj;
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
        this.itemView.setOnLongClickListener(new IDCListenerS296S0100000_3(this, 0));
        C71799SFv c71799SFv = this.LJLJI;
        if (c71799SFv != null) {
            User user = t.LJLIL.getUser();
            UrlModel avatarMedium = user.getAvatarMedium();
            if ((avatarMedium == null || (list = avatarMedium.getUrlList()) == null) && ((avatarLarger = user.getAvatarLarger()) == null || (list = avatarLarger.getUrlList()) == null)) {
                UrlModel avatarThumb = user.getAvatarThumb();
                if (avatarThumb != null) {
                    list = avatarThumb.getUrlList();
                } else {
                    list = null;
                }
            }
            C71799SFv.LJIIJ(c71799SFv, new C62562cu(list), null, false, null, 126);
            C16880lQ.LJJIL(c71799SFv, new ACListenerS23S0100000_3(this, 11));
            TuxTextView tuxTextView = this.LJLJJI;
            if (tuxTextView != null) {
                tuxTextView.setText(t.LJLIL.getUser().getNickname());
                Context context = this.itemView.getContext();
                String customVerify = t.LJLIL.getUser().getCustomVerify();
                String enterpriseVerifyReason = t.LJLIL.getUser().getEnterpriseVerifyReason();
                TuxTextView tuxTextView2 = this.LJLJJI;
                if (tuxTextView2 != null) {
                    AJ9.LJ(context, customVerify, enterpriseVerifyReason, tuxTextView2);
                    C84G c84g = this.LJLJJL;
                    if (c84g != null) {
                        c84g.setRatingValue(t.LJLIL.getTopicRating());
                        C84G c84g2 = this.LJLJJL;
                        if (c84g2 != null) {
                            c84g2.setRatingSize(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)));
                            C84G c84g3 = this.LJLJJL;
                            if (c84g3 != null) {
                                c84g3.setRatingSpacing(O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)));
                                C84G c84g4 = this.LJLJJL;
                                if (c84g4 != null) {
                                    c84g4.setRatingEnableTouch(false);
                                    TuxTextView tuxTextView3 = this.LJLJLJ;
                                    if (tuxTextView3 != null) {
                                        tuxTextView3.setText(C86036Xpg.LIZIZ(t.LJLIL.getUpdateTime() * 1000));
                                        if (!o.LJ(t.LJLIL.getUser().getUid(), ((RBX) HG3.LJIILL()).getCurUserId()) || (text2 = t.LJLIL.getText()) == null || text2.length() == 0) {
                                            TuxTextView tuxTextView4 = this.LJLJLLL;
                                            if (tuxTextView4 != null) {
                                                tuxTextView4.setVisibility(8);
                                            } else {
                                                o.LJIJI("editView");
                                                throw null;
                                            }
                                        } else {
                                            TuxTextView tuxTextView5 = this.LJLJLLL;
                                            if (tuxTextView5 != null) {
                                                tuxTextView5.setVisibility(0);
                                                TuxTextView tuxTextView6 = this.LJLJLLL;
                                                if (tuxTextView6 != null) {
                                                    C16880lQ.LJJJJI(tuxTextView6, new ACListenerS23S0100000_3(this, 12));
                                                } else {
                                                    o.LJIJI("editView");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("editView");
                                                throw null;
                                            }
                                        }
                                        TuxTextView tuxTextView7 = this.LJLL;
                                        if (tuxTextView7 != null) {
                                            if (t.LJLIL.getDiggCount() > 0) {
                                                i = 0;
                                            } else {
                                                i = 8;
                                            }
                                            tuxTextView7.setVisibility(i);
                                            TuxTextView tuxTextView8 = this.LJLL;
                                            if (tuxTextView8 != null) {
                                                tuxTextView8.setText(String.valueOf(t.LJLIL.getDiggCount()));
                                                TuxTextView tuxTextView9 = this.LJLL;
                                                if (tuxTextView9 != null) {
                                                    C16880lQ.LJJJJI(tuxTextView9, new ACListenerS38S0200000_3(this, t, 11));
                                                    TuxIconView tuxIconView = this.LJLLI;
                                                    if (tuxIconView != null) {
                                                        C16880lQ.LJJJ(tuxIconView, new ACListenerS38S0200000_3(this, t, 12));
                                                        if (t.LJLIL.getUserDigged()) {
                                                            TuxTextView tuxTextView10 = this.LJLL;
                                                            if (tuxTextView10 != null) {
                                                                tuxTextView10.setTextColorRes(R.attr.eb);
                                                                TuxIconView tuxIconView2 = this.LJLLI;
                                                                if (tuxIconView2 != null) {
                                                                    C2068389v c2068389v = new C2068389v();
                                                                    c2068389v.LIZ = R.raw.icon_heart_fill;
                                                                    tuxIconView2.setTuxIcon(c2068389v);
                                                                    TuxIconView tuxIconView3 = this.LJLLI;
                                                                    if (tuxIconView3 != null) {
                                                                        tuxIconView3.setTintColorRes(R.attr.eb);
                                                                    } else {
                                                                        o.LJIJI("likeIconView");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("likeIconView");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("likeTextView");
                                                                throw null;
                                                            }
                                                        } else {
                                                            TuxTextView tuxTextView11 = this.LJLL;
                                                            if (tuxTextView11 != null) {
                                                                tuxTextView11.setTextColorRes(R.attr.gp);
                                                                TuxIconView tuxIconView4 = this.LJLLI;
                                                                if (tuxIconView4 != null) {
                                                                    C2068389v c2068389v2 = new C2068389v();
                                                                    c2068389v2.LIZ = R.raw.icon_heart;
                                                                    tuxIconView4.setTuxIcon(c2068389v2);
                                                                    TuxIconView tuxIconView5 = this.LJLLI;
                                                                    if (tuxIconView5 != null) {
                                                                        tuxIconView5.setTintColorRes(R.attr.gx);
                                                                    } else {
                                                                        o.LJIJI("likeIconView");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    o.LJIJI("likeIconView");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                o.LJIJI("likeTextView");
                                                                throw null;
                                                            }
                                                        }
                                                        C208278Fj c208278Fj = this.LJLJJLL;
                                                        if (c208278Fj != null) {
                                                            String text3 = t.LJLIL.getText();
                                                            if (text3 == null || text3.length() == 0) {
                                                                i2 = 8;
                                                            } else {
                                                                i2 = 0;
                                                            }
                                                            c208278Fj.setVisibility(i2);
                                                            String text4 = t.LJLIL.getText();
                                                            if (text4 == null) {
                                                                text4 = "";
                                                            }
                                                            c208278Fj.setOriginalText(text4);
                                                            c208278Fj.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS38S0200000_3(this, t, 13)));
                                                            c208278Fj.setOnLongClickListener(new IDCListenerS296S0100000_3(this, 1));
                                                            if (t.LJLILLLLZI) {
                                                                TuxTextView tuxTextView12 = this.LJLJL;
                                                                if (tuxTextView12 != null) {
                                                                    tuxTextView12.setVisibility(0);
                                                                    tuxTextView12.setText(tuxTextView12.getContext().getText(R.string.cdg));
                                                                    tuxTextView12.setTuxFont(42);
                                                                    tuxTextView12.setTextColorRes(R.attr.gp);
                                                                    C16880lQ.LJJJJI(tuxTextView12, new ACListenerS38S0200000_3(this, t, 14));
                                                                } else {
                                                                    o.LJIJI("actionView");
                                                                    throw null;
                                                                }
                                                            } else if (o.LJ(t.LJLIL.getUser().getUid(), ((RBX) HG3.LJIILL()).getCurUserId()) && ((text = t.LJLIL.getText()) == null || text.length() == 0)) {
                                                                TuxTextView tuxTextView13 = this.LJLJL;
                                                                if (tuxTextView13 != null) {
                                                                    tuxTextView13.setVisibility(0);
                                                                    tuxTextView13.setText(tuxTextView13.getContext().getText(R.string.cdl));
                                                                    tuxTextView13.setTuxFont(52);
                                                                    tuxTextView13.setTextColorRes(R.attr.eb);
                                                                    C16880lQ.LJJJJI(tuxTextView13, new ACListenerS23S0100000_3(this, 10));
                                                                } else {
                                                                    o.LJIJI("actionView");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                TuxTextView tuxTextView14 = this.LJLJL;
                                                                if (tuxTextView14 != null) {
                                                                    tuxTextView14.setVisibility(8);
                                                                    tuxTextView14.setText("");
                                                                } else {
                                                                    o.LJIJI("actionView");
                                                                    throw null;
                                                                }
                                                            }
                                                            if (payloads.isEmpty()) {
                                                                C208278Fj c208278Fj2 = this.LJLJJLL;
                                                                if (c208278Fj2 != null) {
                                                                    c208278Fj2.setExpanded$topic_release(t.LJLILLLLZI);
                                                                } else {
                                                                    o.LJIJI("textView");
                                                                    throw null;
                                                                }
                                                            }
                                                            for (Object obj : payloads) {
                                                                if ((obj instanceof Integer) && (((Number) obj).intValue() & 1) != 0) {
                                                                    C208278Fj c208278Fj3 = this.LJLJJLL;
                                                                    if (c208278Fj3 != null) {
                                                                        if (o.LJ(c208278Fj3.LJLLLL, c208278Fj3.LLFFF)) {
                                                                            c208278Fj3.LJZI = !c208278Fj3.LJZI;
                                                                        } else {
                                                                            int height = c208278Fj3.getHeight();
                                                                            if (c208278Fj3.LJZI) {
                                                                                charSequence = c208278Fj3.LJLLLL;
                                                                            } else {
                                                                                charSequence = c208278Fj3.LLFFF;
                                                                            }
                                                                            c208278Fj3.setText(charSequence);
                                                                            c208278Fj3.measure(View.MeasureSpec.makeMeasureSpec(c208278Fj3.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(c208278Fj3.getHeight(), 0));
                                                                            int measuredHeight = c208278Fj3.getMeasuredHeight();
                                                                            Animator animator = c208278Fj3.LLD;
                                                                            if (animator != null) {
                                                                                animator.cancel();
                                                                            }
                                                                            long abs = Math.abs(measuredHeight - height) * 2;
                                                                            if (abs > 300) {
                                                                                abs = 300;
                                                                            }
                                                                            ValueAnimator ofInt = ValueAnimator.ofInt(height, measuredHeight);
                                                                            ofInt.setInterpolator(new C30901Je());
                                                                            ofInt.setDuration(abs);
                                                                            ofInt.addUpdateListener(new AUListenerS92S0100000_3(c208278Fj3, 30));
                                                                            ofInt.addListener(new ALAdapterS2S0100000_3(c208278Fj3, 5));
                                                                            ofInt.start();
                                                                            c208278Fj3.LLD = ofInt;
                                                                        }
                                                                    } else {
                                                                        o.LJIJI("textView");
                                                                        throw null;
                                                                    }
                                                                }
                                                            }
                                                            return;
                                                        }
                                                        o.LJIJI("textView");
                                                        throw null;
                                                    }
                                                    o.LJIJI("likeIconView");
                                                    throw null;
                                                }
                                                o.LJIJI("likeTextView");
                                                throw null;
                                            }
                                            o.LJIJI("likeTextView");
                                            throw null;
                                        }
                                        o.LJIJI("likeTextView");
                                        throw null;
                                    }
                                    o.LJIJI("dateView");
                                    throw null;
                                }
                                o.LJIJI("ratingBar");
                                throw null;
                            }
                            o.LJIJI("ratingBar");
                            throw null;
                        }
                        o.LJIJI("ratingBar");
                        throw null;
                    }
                    o.LJIJI("ratingBar");
                    throw null;
                }
                o.LJIJI("nameView");
                throw null;
            }
            o.LJIJI("nameView");
            throw null;
        }
        o.LJIJI("avatarView");
        throw null;
    }
}
