package com.ss.android.ugc.aweme.nows.feed.ui.userrow;

import X.AbstractC193947jK;
import X.C16880lQ;
import X.C181847Bs;
import X.C193687iu;
import X.C194437k7;
import X.C195937mX;
import X.C196367nE;
import X.C198177q9;
import X.C198227qE;
import X.C19N;
import X.C200007t6;
import X.C2068389v;
import X.C210188Ms;
import X.C32151Nz;
import X.C37179EiV;
import X.C3C8;
import X.C47704Ins;
import X.C54218LPq;
import X.C55749LuL;
import X.C56331M8x;
import X.C57362MfG;
import X.C57364MfI;
import X.C71799SFv;
import X.C77117UOj;
import X.C78847Ux1;
import X.C79045V0n;
import X.C7MK;
import X.C7MY;
import X.C80S;
import X.C8FR;
import X.C8XO;
import X.C90193gN;
import X.EnumC198137q5;
import X.EnumC199997t5;
import X.EnumC57365MfJ;
import X.EnumC57366MfK;
import X.HG3;
import X.InterfaceC1798974f;
import X.InterfaceC194257jp;
import X.InterfaceC194547kI;
import X.InterfaceC65784Pro;
import X.O6R;
import X.QZZ;
import X.RBX;
import X.SY9;
import X.W5F;
import X.W5U;
import X.X1D;
import Y.ACListenerS29S0300000_3;
import Y.ARunnableS39S0100000_3;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import defpackage.e1;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS28S1300000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class AbsNowPostUserRowAssem<T, RECEIVER extends C3C8> extends ReusedUIContentAssem<RECEIVER> implements C8XO<T>, InterfaceC194257jp {
    public final C55749LuL LJZL;
    public C71799SFv LL;
    public TuxTextView LLD;
    public TuxTextView LLF;
    public SmartImageView LLFF;

    @Override // X.C8XO
    public final void LLLZIIL() {
    }

    public abstract AbstractC193947jK b4();

    @Override // X.C8XO
    public final boolean c2(T t) {
        return true;
    }

    public abstract InterfaceC194547kI c4();

    public abstract boolean l4();

    @Override // X.C8XO
    public final void n3(T t) {
    }

    @Override // X.C8XO
    public final void unBind() {
    }

    public AbsNowPostUserRowAssem() {
        new LinkedHashMap();
        this.LJZL = new C55749LuL(C47704Ins.LIZJ(this, C181847Bs.class, "now_feed_hierarchy_data_key"), checkSupervisorPrepared());
    }

    public final C181847Bs e4() {
        return (C181847Bs) this.LJZL.getValue();
    }

    public final boolean a4() {
        if (!o.LJ(c4().LLJJJ(), Boolean.TRUE)) {
            C196367nE c196367nE = C196367nE.LIZ;
            Aweme aweme = c4().getAweme();
            c196367nE.getClass();
            if (C196367nE.LJFF(aweme)) {
                return true;
            }
        }
        return false;
    }

    public final String getEnterFrom() {
        return C7MK.LIZLLL(e4().LJLILLLLZI, c4());
    }

    public static User g4(InterfaceC194547kI interfaceC194547kI) {
        if (o.LJ(interfaceC194547kI.LLJJJ(), Boolean.TRUE)) {
            User curUser = ((RBX) HG3.LJIILL()).getCurUser();
            o.LJIIIIZZ(curUser, "{\n            AccountPro…rvice().curUser\n        }");
            return curUser;
        }
        User author = interfaceC194547kI.getAweme().getAuthor();
        o.LJIIIIZZ(author, "{\n            item.aweme.author\n        }");
        return author;
    }

    public final void Z3(InterfaceC194547kI item) {
        float f;
        o.LJIIIZ(item, "item");
        if (o.LJ(item.LLJJJ(), Boolean.TRUE) || l4()) {
            getContainerView().setVisibility(8);
            return;
        }
        User g4 = g4(item);
        UrlModel avatarThumb = g4.getAvatarThumb();
        if (avatarThumb != null) {
            AqS150S0200000_3 aqS150S0200000_3 = new AqS150S0200000_3((AbsNowPostUserRowAssem) this, (AbsNowPostUserRowAssem<Object, C3C8>) avatarThumb, (UrlModel) 107);
            if (C210188Ms.LIZLLL()) {
                C37179EiV.LJFF.post(new ARunnableS39S0100000_3((InterfaceC65784Pro) aqS150S0200000_3, 209));
            } else {
                aqS150S0200000_3.invoke();
            }
        }
        String LIZIZ = C56331M8x.LIZIZ(g4, true, true);
        TuxTextView tuxTextView = this.LLD;
        if (tuxTextView != null) {
            tuxTextView.setText(LIZIZ, TextView.BufferType.SPANNABLE);
            if (C195937mX.LJIIL(g4, item.z())) {
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_color_verified_badge;
                c2068389v.LIZIZ = C7MY.LIZIZ(12);
                c2068389v.LIZJ = C7MY.LIZIZ(12);
                TuxTextView tuxTextView2 = this.LLD;
                if (tuxTextView2 != null) {
                    Context context = tuxTextView2.getContext();
                    o.LJIIIIZZ(context, "userNameView.context");
                    SY9 LIZ = c2068389v.LIZ(context);
                    LIZ.setBounds(0, 0, LIZ.LIZIZ(), LIZ.LIZ());
                    TuxTextView tuxTextView3 = this.LLD;
                    if (tuxTextView3 != null) {
                        tuxTextView3.setCompoundDrawablePadding(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
                        TuxTextView tuxTextView4 = this.LLD;
                        if (tuxTextView4 != null) {
                            tuxTextView4.setCompoundDrawablesRelative(null, null, LIZ, null);
                        } else {
                            o.LJIJI("userNameView");
                            throw null;
                        }
                    } else {
                        o.LJIJI("userNameView");
                        throw null;
                    }
                } else {
                    o.LJIJI("userNameView");
                    throw null;
                }
            } else {
                TuxTextView tuxTextView5 = this.LLD;
                if (tuxTextView5 != null) {
                    tuxTextView5.setCompoundDrawablesRelative(null, null, null, null);
                } else {
                    o.LJIJI("userNameView");
                    throw null;
                }
            }
            C71799SFv c71799SFv = this.LL;
            if (c71799SFv != null) {
                C16880lQ.LJJIL(c71799SFv, new ACListenerS29S0300000_3(item, this, g4, 17));
                TuxTextView tuxTextView6 = this.LLD;
                if (tuxTextView6 != null) {
                    C16880lQ.LJJJJI(tuxTextView6, new ACListenerS29S0300000_3(item, this, g4, 18));
                    C198177q9.LIZ.getClass();
                    EnumC198137q5 LIZIZ2 = C198177q9.LIZIZ();
                    if (LIZIZ2 == EnumC198137q5.NO_EVENT) {
                        SmartImageView smartImageView = this.LLFF;
                        if (smartImageView != null) {
                            smartImageView.setVisibility(8);
                        } else {
                            o.LJIJI("avatarBadge");
                            throw null;
                        }
                    } else {
                        SmartImageView smartImageView2 = this.LLFF;
                        if (smartImageView2 != null) {
                            smartImageView2.setVisibility(0);
                            SmartImageView smartImageView3 = this.LLFF;
                            if (smartImageView3 != null) {
                                if (C90193gN.LIZ()) {
                                    f = -1.0f;
                                } else {
                                    f = 1.0f;
                                }
                                smartImageView3.setScaleX(f);
                                W5F LJI = W5U.LJI(C198227qE.LIZ(C77117UOj.LJJI(LIZIZ2, "avatar_badge", null, false, 20)));
                                SmartImageView smartImageView4 = this.LLFF;
                                if (smartImageView4 != null) {
                                    LJI.LJJIIJ = smartImageView4;
                                    C210188Ms.LIZ(LJI);
                                } else {
                                    o.LJIJI("avatarBadge");
                                    throw null;
                                }
                            } else {
                                o.LJIJI("avatarBadge");
                                throw null;
                            }
                        } else {
                            o.LJIJI("avatarBadge");
                            throw null;
                        }
                    }
                    n4(item);
                    if (a4()) {
                        m4(EnumC57365MfJ.SHOW, item);
                        return;
                    }
                    return;
                }
                o.LJIJI("userNameView");
                throw null;
            }
            o.LJIJI("avatarView");
            throw null;
        }
        o.LJIJI("userNameView");
        throw null;
    }

    public final void n4(InterfaceC194547kI item) {
        long j;
        boolean z;
        String str;
        boolean z2;
        String str2;
        int i;
        String LIZLLL;
        int i2;
        int i3;
        Integer valueOf;
        String string;
        Long lastPushedAtSec;
        o.LJIIIZ(item, "item");
        long createTime = item.getAweme().getCreateTime();
        NowPostInfo nowPostInfo = item.getAweme().nowPostInfo;
        if (nowPostInfo != null && (lastPushedAtSec = nowPostInfo.getLastPushedAtSec()) != null) {
            j = lastPushedAtSec.longValue();
        } else {
            j = 0;
        }
        Boolean LLJJJ = item.LLJJJ();
        Boolean bool = Boolean.TRUE;
        if (!o.LJ(LLJJJ, bool) && !o.LJ(item.d(), bool) && createTime > 0 && j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = this.LLF;
            if (tuxTextView != null) {
                long j2 = createTime - j;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                long seconds = j2 / timeUnit.toSeconds(1L);
                Context context = tuxTextView.getContext();
                o.LJIIIIZZ(context, "context");
                long seconds2 = j2 / timeUnit.toSeconds(1L);
                if (seconds2 < 20) {
                    str = context.getResources().getString(R.string.j48);
                } else {
                    C54218LPq c54218LPq = C54218LPq.LJLIL;
                    if (c54218LPq.LIZ() && e1.LIZ(31744, "enable_now_late_timestamp", true, true) && seconds2 <= 59) {
                        str = context.getResources().getString(R.string.j47, String.valueOf(seconds2));
                    } else if (c54218LPq.LIZ() && e1.LIZ(31744, "enable_now_late_timestamp", true, true)) {
                        str = context.getResources().getString(R.string.j46, String.valueOf(seconds2 / TimeUnit.HOURS.toMinutes(1L)));
                    } else {
                        str = null;
                    }
                }
                C54218LPq c54218LPq2 = C54218LPq.LJLIL;
                if (c54218LPq2.LIZ() && e1.LIZ(31744, "strengthen_now_on_time_style", true, false) && seconds < 20) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (str != null) {
                    if (z2) {
                        str2 = QZZ.LIZIZ(' ', str);
                    } else {
                        str2 = str;
                    }
                } else {
                    str2 = "";
                }
                if (item.z() == 1) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(' ');
                    LIZ.append(tuxTextView.getResources().getString(R.string.pif));
                    String LIZIZ = X1D.LIZIZ(LIZ);
                    if (c54218LPq2.LIZ() && e1.LIZ(31744, "strengthen_now_on_time_style", true, false) && str != null) {
                        if (z2) {
                            i = str.length() + 3;
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append(' ');
                            LIZ2.append(str);
                            LIZ2.append(",  ");
                            LIZ2.append(LIZIZ);
                            str2 = X1D.LIZIZ(LIZ2);
                        } else {
                            i = str.length() + 2;
                            str2 = a1.LJ(str, ",  ", LIZIZ);
                        }
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(' ');
                        LIZ3.append(LIZIZ);
                        if (str != null) {
                            LIZ3.append(", ");
                            LIZ3.append(str);
                        }
                        str2 = X1D.LIZIZ(LIZ3);
                        i = 0;
                    }
                } else {
                    i = -1;
                }
                Context context2 = tuxTextView.getContext();
                o.LJIIIIZZ(context2, "context");
                if (item.z() == 2) {
                    if (C80S.LIZLLL(item.getAweme())) {
                        valueOf = Integer.valueOf(R.string.gnr);
                    } else if (C80S.LIZIZ(item.getAweme())) {
                        valueOf = Integer.valueOf(R.string.gkk);
                    }
                    if (valueOf != null && (string = context2.getString(valueOf.intValue())) != null) {
                        if (str2.length() != 0) {
                            string = a1.LJ(str2, ", ", string);
                        }
                        str2 = string;
                    }
                }
                NowPostInfo nowPostInfo2 = item.getAweme().nowPostInfo;
                if (nowPostInfo2 == null || (LIZLLL = nowPostInfo2.getCreateTimeInAuthorTimeZone()) == null || LIZLLL.length() <= 0) {
                    LIZLLL = C195937mX.LIZLLL(createTime);
                }
                if (str2.length() != 0) {
                    LIZLLL = a1.LJ(str2, ", ", LIZLLL);
                }
                Context context3 = tuxTextView.getContext();
                o.LJIIIIZZ(context3, "context");
                SpannableString spannableString = new SpannableString(LIZLLL);
                if (z2) {
                    SY9 sy9 = new SY9(context3, R.raw.icon_now_lightening);
                    sy9.LJFF(R.attr.eg, context3);
                    sy9.setBounds(C7MY.LIZIZ(-1), 0, C7MY.LIZIZ(13), O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
                    spannableString.setSpan(new C8FR(sy9, 2), 0, 1, 33);
                    Integer LJI = C79045V0n.LJI(R.attr.eg, context3);
                    if (LJI != null) {
                        i2 = LJI.intValue();
                    } else {
                        i2 = 0;
                    }
                    ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i2);
                    if (str != null) {
                        i3 = str.length() + 1;
                    } else {
                        i3 = 1;
                    }
                    spannableString.setSpan(foregroundColorSpan, 1, i3, 18);
                }
                if (i > -1) {
                    SY9 sy92 = new SY9(context3, R.raw.icon_earth_w);
                    sy92.LJFF(R.attr.dm, context3);
                    sy92.setBounds(0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)), O6R.LJJIIZ(C32151Nz.LJIIZILJ(14)));
                    spannableString.setSpan(new C8FR(sy92, 2), i, i + 1, 33);
                }
                tuxTextView.setText(spannableString);
                tuxTextView.setVisibility(0);
                return;
            }
            o.LJIJI("statusView");
            throw null;
        }
        TuxTextView tuxTextView2 = this.LLF;
        if (tuxTextView2 != null) {
            tuxTextView2.setVisibility(8);
        } else {
            o.LJIJI("statusView");
            throw null;
        }
    }

    @Override // com.bytedance.assem.arch.reused.ReusedUIAssem
    public void onViewCreated(View view) {
        this.LL = (C71799SFv) C7MY.LIZLLL(view, "view", R.id.my0, "view.findViewById(R.id.user_avatar)");
        View findViewById = view.findViewById(R.id.mzt);
        o.LJIIIIZZ(findViewById, "view.findViewById(R.id.user_name)");
        this.LLD = (TuxTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.kf5);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.status_span)");
        this.LLF = (TuxTextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.my5);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.user_avatar_badge)");
        this.LLFF = (SmartImageView) findViewById3;
    }

    @Override // X.InterfaceC194257jp
    public void LLIIJLIL(AbstractC193947jK cellState, C194437k7 nowPostCellState) {
        o.LJIIIZ(cellState, "cellState");
        o.LJIIIZ(nowPostCellState, "nowPostCellState");
        if (C193687iu.LIZLLL(c4(), nowPostCellState, l4(), true)) {
            getContainerView().setVisibility(8);
        } else {
            getContainerView().setVisibility(0);
        }
    }

    public final void m4(EnumC57365MfJ enumC57365MfJ, InterfaceC194547kI interfaceC194547kI) {
        String nowMediaType;
        int i;
        C57362MfG c57362MfG = new C57362MfG();
        c57362MfG.LJJLIIIIJ = enumC57365MfJ;
        c57362MfG.LJJIIZI(getEnterFrom());
        c57362MfG.LJJLI = EnumC57366MfK.ITEM;
        c57362MfG.LJJJJI();
        c57362MfG.LJJJJIZL(g4(interfaceC194547kI));
        C196367nE c196367nE = C196367nE.LIZ;
        Aweme aweme = interfaceC194547kI.getAweme();
        c196367nE.getClass();
        String str = "";
        if (C196367nE.LJFF(aweme)) {
            c57362MfG.LJJJ(interfaceC194547kI.LJLIL());
            String valueOf = String.valueOf(C7MK.LIZJ(b4(), c4().getAweme()));
            if (valueOf == null) {
                valueOf = "";
            }
            c57362MfG.LJLJJLL = valueOf;
            Integer valueOf2 = Integer.valueOf(C78847Ux1.LJJIJIL(interfaceC194547kI));
            if (valueOf2 != null) {
                i = valueOf2.intValue();
            } else {
                i = 1;
            }
            c57362MfG.LJLJL = i;
        }
        NowPostInfo nowPostInfo = c4().getAweme().nowPostInfo;
        if (nowPostInfo != null && (nowMediaType = nowPostInfo.getNowMediaType()) != null) {
            str = nowMediaType;
        }
        c57362MfG.LJ("now_type", str, InterfaceC1798974f.LIZ);
        c57362MfG.LJIILIIL();
    }

    public final void k4(User user, String str, InterfaceC194547kI interfaceC194547kI) {
        String str2;
        String nowMediaType;
        if (c4().z() == 1 && !C19N.LJ("enable_tt_now_explore_enter_others_profile", true)) {
            return;
        }
        Context context = getContext();
        if (context != null) {
            boolean a4 = a4();
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "//user/profile");
            buildRoute.withParam("uid", user.getUid());
            buildRoute.withParam("sec_user_id", user.getSecUid());
            buildRoute.withParam("extra_mutual_relation", user.getMutualStruct());
            buildRoute.withParam("extra_from_mutual", true);
            buildRoute.withParam("enter_from", getEnterFrom());
            buildRoute.withParam("enter_from_request_id", user.getRequestId());
            buildRoute.withParam("source_page", C7MK.LJFF(getEnterFrom(), e4().LJLIL));
            buildRoute.withParam("now_card_type", C7MK.LIZIZ(c4().getAweme()));
            buildRoute.withParam("is_now_clear", String.valueOf(C7MK.LIZJ(b4(), c4().getAweme())));
            NowPostInfo nowPostInfo = c4().getAweme().nowPostInfo;
            if (nowPostInfo != null) {
                str2 = nowPostInfo.getNowMediaType();
            } else {
                str2 = null;
            }
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            buildRoute.withParam("now_type", str2);
            buildRoute.withParam("has_small_window", C78847Ux1.LJJIJIL(c4()));
            if (a4) {
                String enterFrom = getEnterFrom();
                EnumC57366MfK enumC57366MfK = EnumC57366MfK.ITEM;
                String accurateRecType = user.getAccurateRecType();
                C57364MfI.Companion.getClass();
                EnumC199997t5 LIZ = C200007t6.LIZ(user);
                String uid = user.getUid();
                String groupId = c4().getAweme().getGroupId();
                String authorUid = c4().getAweme().getAuthorUid();
                String requestId = user.getRequestId();
                String friendTypeStr = user.getFriendTypeStr();
                if (friendTypeStr == null) {
                    MatchedFriendStruct matchedFriendStruct = user.getMatchedFriendStruct();
                    if (matchedFriendStruct != null) {
                        friendTypeStr = matchedFriendStruct.getRelationType();
                    } else {
                        friendTypeStr = null;
                    }
                }
                String socialInfo = user.getSocialInfo();
                String LJLIL = c4().LJLIL();
                NowPostInfo nowPostInfo2 = c4().getAweme().nowPostInfo;
                if (nowPostInfo2 != null && (nowMediaType = nowPostInfo2.getNowMediaType()) != null) {
                    str3 = nowMediaType;
                }
                buildRoute.withParam("recommend_enter_profile_params", new C57364MfI(enterFrom, "", enumC57366MfK, accurateRecType, LIZ, uid, groupId, authorUid, requestId, null, friendTypeStr, socialInfo, null, null, null, null, false, null, LJLIL, str3, String.valueOf(C7MK.LIZJ(b4(), c4().getAweme())), false, null, false, 14938112, null));
                m4(EnumC57365MfJ.ENTER_PROFILE, interfaceC194547kI);
            }
            buildRoute.open();
        }
        C7MK.LJI("enter_personal_detail", new AqS28S1300000_3((AbsNowPostUserRowAssem) this, str, (String) user, (User) interfaceC194547kI, (InterfaceC194547kI) 1));
    }
}
