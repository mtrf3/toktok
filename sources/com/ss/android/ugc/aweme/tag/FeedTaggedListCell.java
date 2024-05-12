package com.ss.android.ugc.aweme.tag;

import X.AJ9;
import X.AV1;
import X.C116724i4;
import X.C16880lQ;
import X.C184397Ln;
import X.C184407Lo;
import X.C184417Lp;
import X.C184427Lq;
import X.C184437Lr;
import X.C184447Ls;
import X.C184457Lt;
import X.C1DI;
import X.C214298b3;
import X.C220488l2;
import X.C221108m2;
import X.C226668v0;
import X.C32151Nz;
import X.C56331M8x;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78939UyV;
import X.C7BP;
import X.C7BQ;
import X.C7ZV;
import X.C86V;
import X.C90193gN;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.JHM;
import X.O6R;
import X.S3I;
import X.S3L;
import X.SY4;
import X.W5F;
import X.W5U;
import X.X1D;
import X.YE1;
import Y.ACListenerS23S0100000_3;
import Y.ACListenerS38S0200000_3;
import Y.IDCListenerS114S0200000_3;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.ui.RelationButton;
import com.ss.android.ugc.aweme.tag.viewmodel.FeedTaggedListViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class FeedTaggedListCell extends PowerCell<C7BQ> {
    public final C214298b3 LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public SmartAvatarImageView LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;
    public TuxTextView LJLJJLL;
    public RelationButton LJLJL;
    public SY4 LJLJLJ;
    public TuxTag LJLJLLL;

    public final FeedTaggedListViewModel M() {
        return (FeedTaggedListViewModel) this.LJLIL.getValue();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        int i;
        SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) this.itemView.findViewById(R.id.abk);
        o.LJIIIIZZ(smartAvatarImageView, "itemView.avatarIv");
        this.LJLJI = smartAvatarImageView;
        TuxTextView tuxTextView = (TuxTextView) this.itemView.findViewById(R.id.mxx);
        o.LJIIIIZZ(tuxTextView, "itemView.userTv");
        this.LJLJJI = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) this.itemView.findViewById(R.id.iub);
        o.LJIIIIZZ(tuxTextView2, "itemView.relationTv");
        this.LJLJJL = tuxTextView2;
        TuxTextView tuxTextView3 = (TuxTextView) this.itemView.findViewById(R.id.c6z);
        o.LJIIIIZZ(tuxTextView3, "itemView.descTv");
        this.LJLJJLL = tuxTextView3;
        RelationButton relationButton = (RelationButton) this.itemView.findViewById(R.id.iu_);
        o.LJIIIIZZ(relationButton, "itemView.relationBtn");
        this.LJLJL = relationButton;
        TuxTag tuxTag = (TuxTag) this.itemView.findViewById(R.id.ae3);
        o.LJIIIIZZ(tuxTag, "itemView.baPendingTag");
        this.LJLJLLL = tuxTag;
        SY4 sy4 = (SY4) this.itemView.findViewById(R.id.ivh);
        o.LJIIIIZZ(sy4, "itemView.removeBtn");
        this.LJLJLJ = sy4;
        C16880lQ.LJJIZ(sy4, new ACListenerS23S0100000_3(this, 158));
        TuxTextView tuxTextView4 = this.LJLJJLL;
        if (tuxTextView4 != null) {
            if (!C90193gN.LIZ()) {
                i = 3;
            } else {
                i = 5;
            }
            tuxTextView4.setGravity(i);
            return;
        }
        o.LJIJI("descTv");
        throw null;
    }

    public FeedTaggedListCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(FeedTaggedListViewModel.class);
        AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(LIZ, 1024);
        C184427Lq c184427Lq = C184427Lq.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C184407Lo.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1025), new AqS153S0100000_3((InterfaceC93923mO) this, 1026), C184457Lt.INSTANCE, c184427Lq, new AqS153S0100000_3((InterfaceC93923mO) this, 1027), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C184417Lp.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1028), new AqS153S0100000_3((InterfaceC93923mO) this, 1019), C184447Ls.INSTANCE, c184427Lq, new AqS153S0100000_3((InterfaceC93923mO) this, 1020), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS153S0100000_3, C184397Ln.INSTANCE, new AqS153S0100000_3((InterfaceC93923mO) this, 1021), new AqS153S0100000_3((InterfaceC93923mO) this, 1022), new AqS153S0100000_3((InterfaceC93923mO) this, 1023), c184427Lq, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
        this.LJLILLLLZI = C221108m2.LIZIZ(C184437Lr.LJLIL);
    }

    public final void L(User user) {
        C7BP c7bp;
        C7BQ item = getItem();
        if (item != null && (c7bp = item.LJLILLLLZI) != null) {
            C220488l2 c220488l2 = C220488l2.LIZIZ;
            C7ZV c7zv = new C7ZV();
            c7zv.LJJIJ(c7bp.LIZ);
            String str = c7bp.LIZIZ;
            if (str == null) {
                str = "";
            }
            c7zv.LIZLLL = str;
            c7zv.LJJLI = "tag";
            ((JHM) c220488l2.LJII(c7bp.LIZ, c7zv)).LJIILIIL();
        }
        Context context = this.itemView.getContext();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("aweme://user/profile/");
        LIZ.append(user.getUid());
        SmartRoute buildRoute = SmartRouter.buildRoute(context, X1D.LIZIZ(LIZ));
        buildRoute.withParam("sec_user_id", user.getSecUid());
        buildRoute.open();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C7BQ c7bq) {
        boolean z;
        String str;
        int i;
        Aweme aweme;
        Aweme aweme2;
        AwemeCommerceStruct commerceVideoAuthInfo;
        C7BQ item = c7bq;
        o.LJIIIZ(item, "item");
        User user = item.LJLIL;
        W5F LJII = W5U.LJII(C78939UyV.LJ(user.getAvatarThumb()));
        LJII.LIZIZ("FeedTaggedListCell");
        SmartAvatarImageView smartAvatarImageView = this.LJLJI;
        if (smartAvatarImageView != null) {
            LJII.LJJIIJ = smartAvatarImageView;
            S3I s3i = new S3I();
            s3i.LIZ = true;
            LJII.LJIJJLI = new S3L(s3i);
            LJII.LIZLLL = true;
            C16880lQ.LLJJJ(LJII);
            SmartAvatarImageView smartAvatarImageView2 = this.LJLJI;
            if (smartAvatarImageView2 != null) {
                C16880lQ.LJJIJLIJ(smartAvatarImageView2, new ACListenerS38S0200000_3(this, user, 54));
                C16880lQ.LJIIJ(new ACListenerS38S0200000_3(this, user, 55), this.itemView);
                TuxTextView tuxTextView = this.LJLJJLL;
                if (tuxTextView != null) {
                    tuxTextView.setVisibility(0);
                    TuxTextView tuxTextView2 = this.LJLJJLL;
                    if (tuxTextView2 != null) {
                        C116724i4 c116724i4 = new C116724i4();
                        M().getClass();
                        c116724i4.LIZIZ(C56331M8x.LIZ(user, false, false));
                        tuxTextView2.setText(c116724i4.LIZ);
                        TuxTextView tuxTextView3 = this.LJLJJI;
                        if (tuxTextView3 != null) {
                            C116724i4 c116724i42 = new C116724i4();
                            M().getClass();
                            c116724i42.LIZIZ(C56331M8x.LIZIZ(user, false, false));
                            tuxTextView3.setText(c116724i42.LIZ);
                            Context context = this.itemView.getContext();
                            String customVerify = user.getCustomVerify();
                            String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
                            TuxTextView tuxTextView4 = this.LJLJJI;
                            if (tuxTextView4 != null) {
                                AJ9.LJ(context, customVerify, enterpriseVerifyReason, tuxTextView4);
                                C7BP c7bp = item.LJLILLLLZI;
                                if (c7bp != null && (aweme2 = c7bp.LIZ) != null && (commerceVideoAuthInfo = aweme2.getCommerceVideoAuthInfo()) != null && commerceVideoAuthInfo.isBrandedContent()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                TuxTextView tuxTextView5 = this.LJLJJL;
                                if (tuxTextView5 != null) {
                                    if (user.getTaggedIsBA() && z) {
                                        tuxTextView5.setText(C86V.LJFF(R.string.s1g));
                                        tuxTextView5.setVisibility(0);
                                    } else if (user.getFollowStatus() == 2) {
                                        tuxTextView5.setText(C86V.LJFF(R.string.rsl));
                                        tuxTextView5.setVisibility(0);
                                    } else {
                                        tuxTextView5.setVisibility(8);
                                    }
                                    C7BP c7bp2 = item.LJLILLLLZI;
                                    if (c7bp2 != null && (aweme = c7bp2.LIZ) != null) {
                                        str = aweme.getAuthorUid();
                                    } else {
                                        str = null;
                                    }
                                    if (AV1.LJIJI(str)) {
                                        TuxTag tuxTag = this.LJLJLLL;
                                        if (tuxTag != null) {
                                            if (user.showBAPendingTag() && z) {
                                                TuxTag tuxTag2 = this.LJLJLLL;
                                                if (tuxTag2 != null) {
                                                    int paddingRight = tuxTag2.getPaddingRight();
                                                    TuxTag tuxTag3 = this.LJLJLLL;
                                                    if (tuxTag3 != null) {
                                                        int paddingTop = tuxTag3.getPaddingTop();
                                                        TuxTag tuxTag4 = this.LJLJLLL;
                                                        if (tuxTag4 != null) {
                                                            tuxTag2.setPadding(paddingRight, paddingTop, tuxTag4.getPaddingLeft(), O6R.LJJIIZ(C32151Nz.LJIIZILJ(1)));
                                                            i = 0;
                                                        } else {
                                                            o.LJIJI("baPendingTag");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("baPendingTag");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("baPendingTag");
                                                    throw null;
                                                }
                                            } else {
                                                i = 8;
                                            }
                                            tuxTag.setVisibility(i);
                                        } else {
                                            o.LJIJI("baPendingTag");
                                            throw null;
                                        }
                                    }
                                    if (AV1.LJIJ(user)) {
                                        SY4 sy4 = this.LJLJLJ;
                                        if (sy4 != null) {
                                            sy4.setVisibility(0);
                                            RelationButton relationButton = this.LJLJL;
                                            if (relationButton != null) {
                                                relationButton.setVisibility(4);
                                            } else {
                                                o.LJIJI("relationBtn");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("removeBtn");
                                            throw null;
                                        }
                                    } else if (user.getFollowStatus() == -1 || user.getFollowerStatus() == -1) {
                                        RelationButton relationButton2 = this.LJLJL;
                                        if (relationButton2 != null) {
                                            relationButton2.setVisibility(8);
                                            SY4 sy42 = this.LJLJLJ;
                                            if (sy42 != null) {
                                                sy42.setVisibility(8);
                                            } else {
                                                o.LJIJI("removeBtn");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("relationBtn");
                                            throw null;
                                        }
                                    } else {
                                        RelationButton relationButton3 = this.LJLJL;
                                        if (relationButton3 != null) {
                                            relationButton3.setVisibility(0);
                                            SY4 sy43 = this.LJLJLJ;
                                            if (sy43 != null) {
                                                sy43.setVisibility(8);
                                                RelationButton relationButton4 = this.LJLJL;
                                                if (relationButton4 != null) {
                                                    C226668v0 c226668v0 = new C226668v0();
                                                    c226668v0.LIZ = user;
                                                    c226668v0.LJIIIIZZ = true;
                                                    relationButton4.LLIIIJ.LJJJJJL(c226668v0.LIZ());
                                                    RelationButton relationButton5 = this.LJLJL;
                                                    if (relationButton5 != null) {
                                                        relationButton5.setFollowClickListener(new AqS185S0100000_3(this, 151));
                                                        RelationButton relationButton6 = this.LJLJL;
                                                        if (relationButton6 != null) {
                                                            relationButton6.setDataChangeListener(new AqS169S0100000_3(item, 642));
                                                            RelationButton relationButton7 = this.LJLJL;
                                                            if (relationButton7 != null) {
                                                                relationButton7.setTracker(new AqS153S0100000_3(item, 1459));
                                                            } else {
                                                                o.LJIJI("relationBtn");
                                                                throw null;
                                                            }
                                                        } else {
                                                            o.LJIJI("relationBtn");
                                                            throw null;
                                                        }
                                                    } else {
                                                        o.LJIJI("relationBtn");
                                                        throw null;
                                                    }
                                                } else {
                                                    o.LJIJI("relationBtn");
                                                    throw null;
                                                }
                                            } else {
                                                o.LJIJI("removeBtn");
                                                throw null;
                                            }
                                        } else {
                                            o.LJIJI("relationBtn");
                                            throw null;
                                        }
                                    }
                                    this.itemView.addOnAttachStateChangeListener(new IDCListenerS114S0200000_3(this, item, 0));
                                    return;
                                }
                                o.LJIJI("relationTv");
                                throw null;
                            }
                            o.LJIJI("userTv");
                            throw null;
                        }
                        o.LJIJI("userTv");
                        throw null;
                    }
                    o.LJIJI("descTv");
                    throw null;
                }
                o.LJIJI("descTv");
                throw null;
            }
            o.LJIJI("avatarIv");
            throw null;
        }
        o.LJIJI("avatarIv");
        throw null;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.bs_, viewGroup, false, "from(parent.context)\n   …list_cell, parent, false)");
    }
}
