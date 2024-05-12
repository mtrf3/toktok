package X;

import Y.ACListenerS16S1300000_9;
import Y.ACListenerS44S0200000_9;
import Y.AObserverS51S1100000_9;
import Y.ARunnableS28S0200000_9;
import Y.ARunnableS39S0100000_3;
import Y.IDgS349S0100000_9;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.poplayer.core.PopupManager;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.follow.logic.RelationViewVM;
import com.ss.android.ugc.aweme.relation.link.feed.SharedInviteDialogVM;
import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS156S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS21S0310000_9;
import kotlin.jvm.internal.AqS98S0300000_9;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Lut, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55783Lut implements InterfaceC55759LuV {
    public ActivityC45651qj LIZ;
    public Bundle LIZIZ;
    public C26231ARf LIZJ;
    public SharedInviteDialogVM LIZLLL;
    public RelationViewVM LJ;
    public C55773Luj LJFF;
    public C221128m4 LJI;
    public InterfaceC55778Luo LJII;
    public final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C53539Kzn.LJLIL);

    public final C221128m4 LJFF() {
        C221128m4 c221128m4 = this.LJI;
        if (c221128m4 == null) {
            SharedInviteDialogVM sharedInviteDialogVM = this.LIZLLL;
            if (sharedInviteDialogVM != null) {
                return sharedInviteDialogVM.LJLILLLLZI;
            }
            o.LJIJI("sharedInviteVM");
            throw null;
        }
        return c221128m4;
    }

    public final LJJ LJI() {
        return (LJJ) this.LJIIIIZZ.getValue();
    }

    public final void LJIILIIL() {
        C26231ARf c26231ARf = this.LIZJ;
        if (c26231ARf != null && !c26231ARf.LJII()) {
            C26231ARf c26231ARf2 = this.LIZJ;
            if (c26231ARf2 != null) {
                c26231ARf2.LIZLLL();
            } else {
                o.LJIJI("dialog");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC55759LuV
    public final void LIZ(AbstractC55764Lua reason) {
        o.LJIIIZ(reason, "reason");
        C26231ARf c26231ARf = this.LIZJ;
        if (c26231ARf != null && c26231ARf.LJII()) {
            C26231ARf c26231ARf2 = this.LIZJ;
            if (c26231ARf2 != null) {
                c26231ARf2.LIZIZ(reason);
            } else {
                o.LJIJI("dialog");
                throw null;
            }
        }
    }

    @Override // X.InterfaceC55759LuV
    public final void LIZJ(InterfaceC55778Luo interfaceC55778Luo) {
        this.LJII = interfaceC55778Luo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        if (r8 == (-1)) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(com.ss.android.ugc.aweme.profile.model.User r10) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55783Lut.LJ(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    public final void LJIIJ(Aweme aweme) {
        C221128m4 LJFF = LJFF();
        if (LJFF != null) {
            LJFF.LIZ(EnumC57365MfJ.SHOW);
            LJFF.LIZIZ("show");
        }
        InterfaceC55778Luo interfaceC55778Luo = this.LJII;
        if (interfaceC55778Luo != null) {
            interfaceC55778Luo.LIZ(aweme);
        }
        C221018lt.LJFF("@LinkRelation_VideoDialog", "shared dialog show!");
    }

    @Override // X.InterfaceC55759LuV
    public final void LIZIZ(Bundle bundle, ActivityC45651qj activityC45651qj) {
        C221018lt.LIZ("@LinkRelation_VideoDialog", "async show dialog!");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(activityC45651qj);
        if (LJJIFFI == null) {
            return;
        }
        this.LIZ = LJJIFFI;
        this.LIZIZ = bundle;
        this.LIZLLL = new SharedInviteDialogVM(0);
        ActivityC45651qj activityC45651qj2 = this.LIZ;
        if (activityC45651qj2 != null) {
            this.LJ = (RelationViewVM) ViewModelProviders.of(activityC45651qj2).get(RelationViewVM.class);
            ActivityC45651qj activityC45651qj3 = this.LIZ;
            if (activityC45651qj3 != null) {
                Intent intent = activityC45651qj3.getIntent();
                o.LJIIIIZZ(intent, "context.intent");
                C55773Luj LIZLLL = C55786Luw.LIZLLL(intent);
                this.LJFF = LIZLLL;
                ActivityC45651qj activityC45651qj4 = this.LIZ;
                if (activityC45651qj4 != null) {
                    String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(activityC45651qj4.getIntent(), "gids");
                    ActivityC45651qj activityC45651qj5 = this.LIZ;
                    if (activityC45651qj5 != null) {
                        String LLJJIJIIJIL2 = C16880lQ.LLJJIJIIJIL(activityC45651qj5.getIntent(), "aweme_id");
                        SharedInviteDialogVM sharedInviteDialogVM = this.LIZLLL;
                        if (sharedInviteDialogVM != null) {
                            if (LLJJIJIIJIL == null) {
                                LLJJIJIIJIL = LLJJIJIIJIL2;
                            }
                            Bundle bundle2 = this.LIZIZ;
                            if (bundle2 != null) {
                                sharedInviteDialogVM.LJLJJL = bundle2;
                                XKX.LIZLLL(sharedInviteDialogVM.LJLIL, C78613UtF.LIZJ, null, new C55771Luh(sharedInviteDialogVM, LIZLLL, LLJJIJIIJIL, null), 2);
                                Bundle bundle3 = this.LIZIZ;
                                if (bundle3 != null) {
                                    String string = bundle3.getString("enter_from", "");
                                    SharedInviteDialogVM sharedInviteDialogVM2 = this.LIZLLL;
                                    if (sharedInviteDialogVM2 != null) {
                                        MutableLiveData mutableLiveData = sharedInviteDialogVM2.LJLJJI;
                                        ActivityC45651qj activityC45651qj6 = this.LIZ;
                                        if (activityC45651qj6 != null) {
                                            mutableLiveData.observe(activityC45651qj6, new AObserverS51S1100000_9(this, string, 1));
                                            return;
                                        } else {
                                            o.LJIJI("context");
                                            throw null;
                                        }
                                    }
                                    o.LJIJI("sharedInviteVM");
                                    throw null;
                                }
                                o.LJIJI("extra");
                                throw null;
                            }
                            o.LJIJI("extra");
                            throw null;
                        }
                        o.LJIJI("sharedInviteVM");
                        throw null;
                    }
                    o.LJIJI("context");
                    throw null;
                }
                o.LJIJI("context");
                throw null;
            }
            o.LJIJI("context");
            throw null;
        }
        o.LJIJI("context");
        throw null;
    }

    public final void LJIIIZ(Aweme aweme, Object obj) {
        AbstractC55764Lua abstractC55764Lua;
        C221128m4 LJFF;
        if (!(obj instanceof AbstractC55764Lua) || (abstractC55764Lua = (AbstractC55764Lua) obj) == null) {
            abstractC55764Lua = C55765Lub.LIZ;
        }
        if (o.LJ(obj, "button_close")) {
            C26231ARf c26231ARf = this.LIZJ;
            if (c26231ARf != null) {
                c26231ARf.LIZIZ(new C55762LuY(aweme));
                C221128m4 LJFF2 = LJFF();
                if (LJFF2 != null) {
                    LJFF2.LIZ(EnumC57365MfJ.CLOSE);
                    LJFF2.LIZIZ("close");
                }
                abstractC55764Lua = new C55762LuY(aweme);
            } else {
                o.LJIJI("dialog");
                throw null;
            }
        }
        if ((abstractC55764Lua instanceof C55765Lub) && (LJFF = LJFF()) != null) {
            LJFF.LIZ(EnumC57365MfJ.CLOSE);
            LJFF.LIZIZ("close");
        }
        InterfaceC55778Luo interfaceC55778Luo = this.LJII;
        if (interfaceC55778Luo != null) {
            interfaceC55778Luo.LIZJ(abstractC55764Lua);
        }
        SharedInviteDialogVM sharedInviteDialogVM = this.LIZLLL;
        if (sharedInviteDialogVM != null) {
            sharedInviteDialogVM.onCleared();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("shared dialog dismiss! reason:");
            LIZ.append(abstractC55764Lua);
            C221018lt.LJFF("@LinkRelation_VideoDialog", X1D.LIZIZ(LIZ));
            return;
        }
        o.LJIJI("sharedInviteVM");
        throw null;
    }

    public final void LJII(Aweme aweme, String str, boolean z) {
        C221128m4 LJFF = LJFF();
        if (LJFF != null) {
            LJFF.LIZIZ(str);
        }
        User sharer = aweme.getSharer();
        if (sharer == null) {
            return;
        }
        if (!z) {
            LIZ(new C55762LuY(aweme));
            return;
        }
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "sharedAweme.aid");
            String authorUid = aweme.getAuthorUid();
            AqS98S0300000_9 aqS98S0300000_9 = new AqS98S0300000_9(this, sharer, aweme, 17);
            ActivityC45651qj activityC45651qj = this.LIZ;
            if (activityC45651qj != null) {
                Bundle bundle = this.LIZIZ;
                if (bundle != null) {
                    String string = bundle.getString("enter_from");
                    if (string == null) {
                        string = "";
                    }
                    C40883G2t c40883G2t = new C40883G2t();
                    c40883G2t.LIZLLL("group_id", aid);
                    c40883G2t.LIZLLL("author_id", authorUid);
                    c40883G2t.LIZLLL("log_pb", C227768wm.LJIIIZ(aid));
                    J9P.LIZIZ(activityC45651qj, string, "click_follow", (Bundle) c40883G2t.LIZ, new IDgS349S0100000_9(aqS98S0300000_9, 6));
                    return;
                }
                o.LJIJI("extra");
                throw null;
            }
            o.LJIJI("context");
            throw null;
        }
        LJ(sharer);
        LIZ(new C55763LuZ(aweme));
    }

    public final void LJIIIIZZ(Context context, User user, String str) {
        AbstractC57378MfW abstractC57378MfW;
        boolean z;
        RecUser recUser;
        RecUser recUser2;
        C221128m4 LJFF = LJFF();
        if (LJFF != null) {
            LJFF.LIZ(EnumC57365MfJ.ENTER_PROFILE);
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://user/profile/");
        buildRoute.withParam("uid", user.getUid());
        buildRoute.withParam("sec_user_id", user.getSecUid());
        buildRoute.withParam("enter_from", str);
        buildRoute.withParam("enter_method", "share_link");
        buildRoute.withParam("enter_from_request_id", user.getRequestId());
        buildRoute.withParam("extra_from_pre_page", "share_user_info_popup");
        buildRoute.withParam("extra_previous_page", "share_user_info_popup");
        buildRoute.withParam("extra_previous_page_position", "card_head");
        buildRoute.withParam("need_track_compare_recommend_reason", 1);
        String recommendReason = user.getRecommendReason();
        if (recommendReason == null) {
            MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
            if (matchedFriendStruct != null) {
                recommendReason = matchedFriendStruct.getRecommendReason();
            } else {
                recommendReason = null;
            }
        }
        buildRoute.withParam("previous_recommend_reason", recommendReason);
        buildRoute.withParam("recommend_from_type", "card");
        EnumC57366MfK enumC57366MfK = EnumC57366MfK.CARD;
        String recType = user.getRecType();
        if (recType == null) {
            MatchedFriendStruct matchedFriendStruct2 = user.getMatchedFriendStruct();
            if (matchedFriendStruct2 != null) {
                recType = matchedFriendStruct2.getRecType();
            } else {
                recType = null;
            }
        }
        C57364MfI.Companion.getClass();
        EnumC199997t5 LIZ = C200007t6.LIZ(user);
        String uid = user.getUid();
        String requestId = user.getRequestId();
        String friendTypeStr = user.getFriendTypeStr();
        if (friendTypeStr == null) {
            MatchedFriendStruct matchedFriendStruct3 = user.getMatchedFriendStruct();
            if (matchedFriendStruct3 != null) {
                friendTypeStr = matchedFriendStruct3.getRelationType();
            } else {
                friendTypeStr = null;
            }
        }
        String socialInfo = user.getSocialInfo();
        if (socialInfo == null) {
            MatchedFriendStruct matchedFriendStruct4 = user.getMatchedFriendStruct();
            if (matchedFriendStruct4 != null) {
                socialInfo = matchedFriendStruct4.getSocialInfo();
            } else {
                socialInfo = null;
            }
        }
        MatchedFriendStruct matchedFriendStruct5 = user.getMatchedFriendStruct();
        boolean z2 = user instanceof RecUser;
        if (z2 && (recUser2 = (RecUser) user) != null) {
            abstractC57378MfW = recUser2.getFrom();
        } else {
            abstractC57378MfW = null;
        }
        if (z2 && (recUser = (RecUser) user) != null) {
            z = recUser.isRelatedRec();
        } else {
            z = false;
        }
        buildRoute.withParam("recommend_enter_profile_params", new C57364MfI(str, "share_user_info_popup", enumC57366MfK, recType, LIZ, uid, null, null, requestId, "", friendTypeStr, socialInfo, matchedFriendStruct5, null, null, abstractC57378MfW, z, "share_link", null, null, null, false, null, false, 9961472, null));
        buildRoute.withParam("source_page", "");
        buildRoute.open();
    }

    public final void LJIIJJI(Aweme aweme, String str, boolean z) {
        boolean z2;
        User sharer;
        int i;
        LinearLayout linearLayout;
        C62822Ol8 c62822Ol8 = C52778KnW.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            User sharer2 = aweme.getSharer();
            if (sharer2 == null) {
                return;
            }
            ActivityC45651qj activityC45651qj = this.LIZ;
            if (activityC45651qj != null) {
                C26227ARb LIZIZ = C77413UZt.LIZIZ(activityC45651qj);
                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(LIZIZ.LIZ), R.layout.ayj, null, false);
                View findViewById = LLLLIILL.findViewById(R.id.hrr);
                o.LJIIIIZZ(findViewById, "layout.findViewById(R.id.play_icon_view)");
                TuxIconView tuxIconView = (TuxIconView) findViewById;
                View findViewById2 = LLLLIILL.findViewById(R.id.jvn);
                o.LJIIIIZZ(findViewById2, "layout.findViewById(R.id.shared_video_cover)");
                SmartImageView smartImageView = (SmartImageView) findViewById2;
                Context context = smartImageView.getContext();
                o.LJIIIIZZ(context, "context");
                Integer LJI = C79045V0n.LJI(R.attr.ef, context);
                if (LJI != null) {
                    smartImageView.setColorFilter(LJI.intValue());
                }
                ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = LJI().LIZ.getFirst().intValue();
                    layoutParams.height = LJI().LIZ.getSecond().intValue();
                    smartImageView.setLayoutParams(layoutParams);
                    W5F LJII = W5U.LJII(C78939UyV.LJ(aweme.getVideo().getCover()));
                    LJII.LJJIIJ = smartImageView;
                    LJII.LIZIZ("@LinkRelation_VideoDialog");
                    Float f = LJI().LJIIL;
                    if (f != null) {
                        float floatValue = f.floatValue();
                        S3I s3i = new S3I();
                        s3i.LIZLLL = floatValue;
                        LJII.LJIJJLI = new S3L(s3i);
                    }
                    C16880lQ.LLJJJ(LJII);
                    C16880lQ.LJJIJLIJ(smartImageView, new ACListenerS44S0200000_9(aweme, this, 23));
                    C2068389v c2068389v = new C2068389v();
                    c2068389v.LIZIZ = LJI().LIZIZ;
                    c2068389v.LIZJ = LJI().LIZIZ;
                    c2068389v.LIZ = R.raw.icon_play_fill;
                    c2068389v.LJ = Integer.valueOf(R.attr.dj);
                    tuxIconView.setTuxIcon(c2068389v);
                    C78685UuP.LJIJI(LIZIZ, LLLLIILL, 0, LJI().LJIIJ);
                    if (LJI().LJIIJJI > 0) {
                        LLLLIILL.post(new ARunnableS28S0200000_9(this, LLLLIILL, 41));
                    }
                    View LLLLIILL2 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(LIZIZ.LIZ), R.layout.aym, null, false);
                    View findViewById3 = LLLLIILL2.findViewById(R.id.jvs);
                    o.LJIIIIZZ(findViewById3, "layout.findViewById(R.id.sharer_avatar_view)");
                    View findViewById4 = LLLLIILL2.findViewById(R.id.gi4);
                    o.LJIIIIZZ(findViewById4, "layout.findViewById(R.id.message_text_view)");
                    TuxTextView tuxTextView = (TuxTextView) findViewById4;
                    W5F LJII2 = W5U.LJII(C78939UyV.LJ(sharer2.getAvatarThumb()));
                    LJII2.LIZIZ("@LinkRelation_VideoDialog");
                    LJII2.LJJIIJ = (SmartImageView) findViewById3;
                    C16880lQ.LLJJJ(LJII2);
                    if (LJI().LIZJ) {
                        tuxTextView.setTextAlignment(4);
                        if ((LLLLIILL2 instanceof LinearLayout) && (linearLayout = (LinearLayout) LLLLIILL2) != null) {
                            linearLayout.setGravity(1);
                        }
                    }
                    tuxTextView.post(new ARunnableS39S0100000_3(tuxTextView, 134));
                    Context context2 = LIZIZ.LIZ;
                    LJJ LJI2 = LJI();
                    LJI2.getClass();
                    if (sharer2.getFollowerStatus() == 1) {
                        i = LJI2.LJFF;
                    } else {
                        i = LJI2.LJ;
                    }
                    CharSequence text = context2.getText(i);
                    o.LJIIIIZZ(text, "context.getText(experime…le.getMessageRes(sharer))");
                    AqS156S0200000_9 aqS156S0200000_9 = new AqS156S0200000_9(tuxTextView, text, 51);
                    int LJJLIIIJL = s.LJJLIIIJL(text, "%s", 0, false, 6);
                    if (LJJLIIIJL == -1) {
                        aqS156S0200000_9.invoke();
                    } else {
                        int length = sharer2.getNickname().length();
                        if (length < LJJLIIIJL) {
                            aqS156S0200000_9.invoke();
                        } else {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Q8U.LIZIZ(new Object[]{sharer2.getNickname()}, 1, text.toString(), "format(this, *args)"));
                            spannableStringBuilder.setSpan(new T5U(42, false), LJJLIIIJL, length, 33);
                            tuxTextView.setText(spannableStringBuilder);
                        }
                    }
                    LIZIZ.LJIIJ = new ARU(LLLLIILL2);
                    C77123UOp.LJIILL(LIZIZ, new AqS21S0310000_9(this, sharer2, z, aweme, 1));
                    LIZIZ.LJIIIIZZ = true;
                    LIZIZ.LJII = true;
                    LIZIZ.LIZLLL(new AqS140S0200000_9(this, aweme, 40));
                    LIZIZ.LIZJ(new AqS140S0200000_9(this, aweme, 41));
                    this.LIZJ = LIZIZ.LJI();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            o.LJIJI("context");
            throw null;
        }
        if (((Number) c62822Ol8.getValue()).intValue() == 1) {
            User sharer3 = aweme.getSharer();
            if (sharer3 == null) {
                return;
            }
            ActivityC45651qj activityC45651qj2 = this.LIZ;
            if (activityC45651qj2 != null) {
                C26227ARb LIZIZ2 = C77413UZt.LIZIZ(activityC45651qj2);
                View LLLLIILL3 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(LIZIZ2.LIZ), R.layout.ayk, null, false);
                View findViewById5 = LLLLIILL3.findViewById(R.id.jvo);
                o.LJIIIIZZ(findViewById5, "layout.findViewById(R.id…_video_cover_version_one)");
                SmartImageView smartImageView2 = (SmartImageView) findViewById5;
                Context context3 = smartImageView2.getContext();
                o.LJIIIIZZ(context3, "context");
                Integer LJI3 = C79045V0n.LJI(R.attr.ef, context3);
                if (LJI3 != null) {
                    smartImageView2.setColorFilter(LJI3.intValue());
                }
                ViewGroup.LayoutParams layoutParams2 = smartImageView2.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.width = LJI().LIZ.getFirst().intValue();
                    layoutParams2.height = LJI().LIZ.getSecond().intValue();
                    smartImageView2.setLayoutParams(layoutParams2);
                    UrlModel cover = aweme.getVideo().getCover();
                    if (cover != null) {
                        W5F LJII3 = W5U.LJII(C78939UyV.LJ(cover));
                        LJII3.LJJIIJ = smartImageView2;
                        LJII3.LIZIZ("@LinkRelation_VideoDialog");
                        Float f2 = LJI().LJIIL;
                        if (f2 != null) {
                            float floatValue2 = f2.floatValue();
                            S3I s3i2 = new S3I();
                            s3i2.LIZLLL = floatValue2;
                            LJII3.LJIJJLI = new S3L(s3i2);
                        }
                        C16880lQ.LLJJJ(LJII3);
                    }
                    View findViewById6 = LLLLIILL3.findViewById(R.id.jvt);
                    o.LJIIIIZZ(findViewById6, "layout.findViewById(R.id…_avatar_view_version_one)");
                    SmartAvatarImageView smartAvatarImageView = (SmartAvatarImageView) findViewById6;
                    W5F LJII4 = W5U.LJII(C78939UyV.LJ(sharer3.getAvatarThumb()));
                    LJII4.LIZIZ("@LinkRelation_VideoDialog");
                    LJII4.LJJIIJ = smartAvatarImageView;
                    C16880lQ.LLJJJ(LJII4);
                    C16880lQ.LJJJJL(smartAvatarImageView, new ACListenerS16S1300000_9(this, sharer3, smartAvatarImageView, str, 0));
                    C78685UuP.LJIJI(LIZIZ2, LLLLIILL3, 0, LJI().LJIIJ);
                    if (LJI().LJIIJJI > 0) {
                        LLLLIILL3.post(new ARunnableS28S0200000_9(this, LLLLIILL3, 42));
                    }
                    LJIIL(LIZIZ2, sharer3, str);
                    C77123UOp.LJIILL(LIZIZ2, new AqS21S0310000_9(this, sharer3, z, aweme, 1));
                    LIZIZ2.LJIIIIZZ = true;
                    LIZIZ2.LJII = true;
                    LIZIZ2.LIZLLL(new AqS140S0200000_9(this, aweme, 42));
                    LIZIZ2.LIZJ(new AqS140S0200000_9(this, aweme, 43));
                    this.LIZJ = LIZIZ2.LJI();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            o.LJIJI("context");
            throw null;
        }
        if (((Number) c62822Ol8.getValue()).intValue() != 2 || (sharer = aweme.getSharer()) == null) {
            return;
        }
        ActivityC45651qj activityC45651qj3 = this.LIZ;
        if (activityC45651qj3 != null) {
            C26227ARb LIZIZ3 = C77413UZt.LIZIZ(activityC45651qj3);
            View LLLLIILL4 = C16880lQ.LLLLIILL(C16880lQ.LLZIL(LIZIZ3.LIZ), R.layout.ayl, null, false);
            View findViewById7 = LLLLIILL4.findViewById(R.id.jvq);
            o.LJIIIIZZ(findViewById7, "layout.findViewById(R.id…avatar_cover_version_two)");
            SmartAvatarImageView smartAvatarImageView2 = (SmartAvatarImageView) findViewById7;
            Context context4 = smartAvatarImageView2.getContext();
            o.LJIIIIZZ(context4, "context");
            Integer LJI4 = C79045V0n.LJI(R.attr.ef, context4);
            if (LJI4 != null) {
                smartAvatarImageView2.setColorFilter(LJI4.intValue());
            }
            W5F LJI5 = C1JX.LJI(sharer);
            LJI5.LJJIIJ = smartAvatarImageView2;
            LJI5.LIZIZ("@LinkRelation_VideoDialog");
            C16880lQ.LLJJJ(LJI5);
            C16880lQ.LJJJJL(smartAvatarImageView2, new ACListenerS16S1300000_9(this, sharer, smartAvatarImageView2, str, 1));
            C78685UuP.LJIJI(LIZIZ3, LLLLIILL4, 0, LJI().LJIIJ);
            if (LJI().LJIIJJI > 0) {
                LLLLIILL4.post(new ARunnableS28S0200000_9(this, LLLLIILL4, 43));
            }
            LJIIL(LIZIZ3, sharer, str);
            C77123UOp.LJIILL(LIZIZ3, new AqS21S0310000_9(this, sharer, z, aweme, 1));
            LIZIZ3.LJIIIIZZ = true;
            LIZIZ3.LJII = true;
            LIZIZ3.LIZLLL(new AqS140S0200000_9(this, aweme, 44));
            LIZIZ3.LIZJ(new AqS140S0200000_9(this, aweme, 45));
            this.LIZJ = LIZIZ3.LJI();
            return;
        }
        o.LJIJI("context");
        throw null;
    }

    public final void LJIIL(C26227ARb c26227ARb, User user, String str) {
        int i;
        LinearLayout linearLayout;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c26227ARb.LIZ), R.layout.ayn, null, false);
        View findViewById = LLLLIILL.findViewById(R.id.gi5);
        o.LJIIIIZZ(findViewById, "layout.findViewById(R.id…ge_text_view_version_one)");
        TuxTextView tuxTextView = (TuxTextView) findViewById;
        if (LJI().LIZJ) {
            tuxTextView.setTextAlignment(4);
            if ((LLLLIILL instanceof LinearLayout) && (linearLayout = (LinearLayout) LLLLIILL) != null) {
                linearLayout.setGravity(1);
            }
        }
        tuxTextView.post(new ARunnableS39S0100000_3(tuxTextView, 135));
        Context context = c26227ARb.LIZ;
        LJJ LJI = LJI();
        LJI.getClass();
        if (user.getFollowerStatus() == 1) {
            i = LJI.LJFF;
        } else {
            i = LJI.LJ;
        }
        CharSequence text = context.getText(i);
        o.LJIIIIZZ(text, "context.getText(experime…le.getMessageRes(sharer))");
        AqS156S0200000_9 aqS156S0200000_9 = new AqS156S0200000_9(tuxTextView, text, 52);
        int LJJLIIIJL = s.LJJLIIIJL(text, "%s", 0, false, 6);
        if (LJJLIIIJL == -1) {
            aqS156S0200000_9.invoke();
        } else {
            int length = user.getNickname().length();
            if (length < LJJLIIIJL) {
                aqS156S0200000_9.invoke();
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Q8U.LIZIZ(new Object[]{user.getNickname()}, 1, text.toString(), "format(this, *args)"));
                spannableStringBuilder.setSpan(new C55785Luv(this, user, c26227ARb, str), LJJLIIIJL, length, 33);
                tuxTextView.setMovementMethod(LinkMovementMethod.getInstance());
                tuxTextView.setHighlightColor(0);
                tuxTextView.setText(spannableStringBuilder);
            }
        }
        c26227ARb.LJIIJ = new ARU(LLLLIILL);
    }

    @Override // X.InterfaceC55759LuV
    public final void LIZLLL(ActivityC45651qj activityC45651qj, C238479Xn linkParams, Aweme shareAweme, Bundle bundle) {
        o.LJIIIZ(linkParams, "linkParams");
        o.LJIIIZ(shareAweme, "shareAweme");
        this.LIZ = activityC45651qj;
        this.LIZIZ = bundle;
        String string = bundle.getString("enter_from", "");
        o.LJIIIIZZ(string, "extra.getString(Mob.Key.ENTER_FROM, \"\")");
        User sharer = shareAweme.getSharer();
        if (sharer == null) {
            return;
        }
        this.LJI = new C221128m4(string, sharer, shareAweme);
        String enterFromStr = bundle.getString("enter_from", "");
        this.LIZLLL = new SharedInviteDialogVM(0);
        this.LJ = (RelationViewVM) ViewModelProviders.of(activityC45651qj).get(RelationViewVM.class);
        boolean LJJJZ = C78685UuP.LJJJZ(linkParams.LJIIIIZZ);
        o.LJIIIIZZ(enterFromStr, "enterFromStr");
        LJIIJJI(shareAweme, enterFromStr, LJJJZ);
        C26231ARf c26231ARf = this.LIZJ;
        if (c26231ARf != null) {
            PopupManager.LJIIL(new C246479lr(activityC45651qj, c26231ARf, new AqS159S0100000_9(this, 758)));
        } else {
            o.LJIJI("dialog");
            throw null;
        }
    }
}
