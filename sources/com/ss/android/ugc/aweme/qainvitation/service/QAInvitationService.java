package com.ss.android.ugc.aweme.qainvitation.service;

import X.ASL;
import X.ActivityC45651qj;
import X.C234529Ii;
import X.C235119Kp;
import X.C249109q6;
import X.C4LD;
import X.C58096Mr6;
import X.C61878OQg;
import X.C62387Oe7;
import X.C62415OeZ;
import X.C76800UCe;
import X.C90013g5;
import X.C90023g6;
import X.C90173gL;
import X.C90253gT;
import X.C9KF;
import X.EnumC90333gb;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.O6R;
import Y.ACListenerS36S0200000_1;
import Y.IDDListenerS141S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qainvitation.model.QAInvitationSettingsData;
import com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.ss.android.ugc.aweme.qna.model.Qna;
import com.ss.android.ugc.aweme.share.ShareService;
import com.ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import com.zhiliaoapp.musically.R;
import defpackage.s1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class QAInvitationService implements IQAInvitationService {
    public static IQAInvitationService LJI() {
        Object LIZ = C58096Mr6.LIZ(IQAInvitationService.class, false);
        if (LIZ != null) {
            return (IQAInvitationService) LIZ;
        }
        if (C58096Mr6.k4 == null) {
            synchronized (IQAInvitationService.class) {
                if (C58096Mr6.k4 == null) {
                    C58096Mr6.k4 = new QAInvitationService();
                }
            }
        }
        return C58096Mr6.k4;
    }

    @Override // com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService
    public final QAInvitationSettingsData LIZLLL() {
        QAInvitationSettingsData qAInvitationSettingsData = new QAInvitationSettingsData(30);
        try {
            SettingsManager.LIZLLL().getClass();
            QAInvitationSettingsData qAInvitationSettingsData2 = (QAInvitationSettingsData) SettingsManager.LJII("qa_invitation_settings", QAInvitationSettingsData.class);
            if (qAInvitationSettingsData2 != null) {
                return qAInvitationSettingsData2;
            }
            return qAInvitationSettingsData;
        } catch (Exception unused) {
            return qAInvitationSettingsData;
        }
    }

    @Override // com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService
    public final List<User> LIZIZ(List<? extends IMUser> imUserList) {
        o.LJIIIZ(imUserList, "imUserList");
        return C90173gL.LIZIZ(imUserList);
    }

    @Override // com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService
    public final List<IMUser> LJ(List<? extends User> userList) {
        o.LJIIIZ(userList, "userList");
        return C90173gL.LIZJ(userList);
    }

    @Override // com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService
    public final void LIZ(Activity activity, String str, String str2, long j, long j2, List<? extends User> list, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        List<? extends User> list2 = list;
        o.LJIIIZ(activity, "activity");
        if (list2 == null) {
            list2 = C61878OQg.INSTANCE;
        }
        C90013g5 c90013g5 = new C90013g5(str, str2, j, j2, list2, activity);
        ASL LIZ = C249109q6.LIZ(2);
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LJZL = true;
        tuxSheet.LJZI = false;
        tuxSheet.LJLLI = c90013g5;
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = activity.getString(R.string.por);
        o.LJIIIIZZ(string, "activity\n               …                        )");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS151S0100000_1(c90013g5, 692));
        c235119Kp.LIZIZ(LIZJ);
        TuxSheet tuxSheet2 = LIZ.LIZ;
        tuxSheet2.LJLLL = c235119Kp;
        tuxSheet2.LJLILLLLZI = new IDDListenerS141S0100000_1(interfaceC65784Pro, 8);
        int LJFF = (int) (C90173gL.LJFF(activity) * 0.8f);
        LIZ.LIZJ(LJFF, LJFF);
        TuxSheet tuxSheet3 = LIZ.LIZ;
        FragmentManager supportFragmentManager = ((ActivityC45651qj) activity).getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity as AppCompatAct…y).supportFragmentManager");
        tuxSheet3.show(supportFragmentManager, "InvitedUsersView");
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [X.3g6, android.view.View] */
    @Override // com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService
    public final void LJFF(final Activity activity, final String enterMethod, final String enterFrom, Long l, Long l2, List<? extends User> list, Boolean bool, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        int i;
        final long j;
        final List<? extends User> list2;
        Object obj;
        int LJFF;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(enterFrom, "enterFrom");
        Integer num = LIZLLL().invitationLimit;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        final long j2 = 0;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        if (l2 != null) {
            j2 = l2.longValue();
        }
        if (list == null) {
            list2 = C61878OQg.INSTANCE;
        } else {
            list2 = list;
        }
        ?? r10 = new ConstraintLayout(enterMethod, enterFrom, j, j2, list2, activity) { // from class: X.3g6
            public String LJLIL;
            public String LJLILLLLZI;
            public long LJLJI;
            public long LJLJJI;
            public List<? extends User> LJLJJL;
            public final IQAInvitationService LJLJJLL;

            @Override // android.view.ViewGroup, android.view.View
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                if (getParent().getParent() == null) {
                    return;
                }
                Object parent = getParent().getParent();
                o.LJII(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                View findViewById = ((View) parent).findViewById(R.id.jw1);
                if (findViewById != null) {
                    findViewById.setVisibility(8);
                }
            }

            public final String getEnterFrom() {
                return this.LJLILLLLZI;
            }

            public final String getEnterMethod() {
                return this.LJLIL;
            }

            public final IQAInvitationService getQaInviteService() {
                return this.LJLJJLL;
            }

            public final long getQuestionId() {
                return this.LJLJI;
            }

            public final long getQuestionUserId() {
                return this.LJLJJI;
            }

            public final List<User> getUsers() {
                return this.LJLJJL;
            }

            public final void setEnterFrom(String str) {
                o.LJIIIZ(str, "<set-?>");
                this.LJLILLLLZI = str;
            }

            public final void setEnterMethod(String str) {
                o.LJIIIZ(str, "<set-?>");
                this.LJLIL = str;
            }

            public final void setQuestionId(long j3) {
                this.LJLJI = j3;
            }

            public final void setQuestionUserId(long j3) {
                this.LJLJJI = j3;
            }

            public final void setUsers(List<? extends User> list3) {
                o.LJIIIZ(list3, "<set-?>");
                this.LJLJJL = list3;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(activity, null, 0);
                o.LJIIIZ(enterMethod, "enterMethod");
                o.LJIIIZ(enterFrom, "enterFrom");
                o.LJIIIZ(list2, "users");
                o.LJIIIZ(activity, "context");
                new LinkedHashMap();
                this.LJLIL = enterMethod;
                this.LJLILLLLZI = enterFrom;
                this.LJLJI = j;
                this.LJLJJI = j2;
                this.LJLJJL = list2;
                IQAInvitationService LJI = QAInvitationService.LJI();
                o.LJIIIIZZ(LJI, "get().getService(IQAInvitationService::class.java)");
                this.LJLJJLL = LJI;
                View LLLZIIL = C16880lQ.LLLZIIL(R.layout.c_n, C16880lQ.LLZIL(activity), this);
                o.LJIIIIZZ(LLLZIIL, "from(context)\n          …vited_users_dialog, this)");
                List<IMUser> LJ = LJI.LJ(this.LJLJJL);
                getContext();
                ((RecyclerView) LLLZIIL.findViewById(R.id.isf)).setLayoutManager(new LinearLayoutManager());
                ((RecyclerView) LLLZIIL.findViewById(R.id.isf)).setHasFixedSize(true);
                ((RecyclerView) LLLZIIL.findViewById(R.id.isf)).setAdapter(new AbstractC029409q<C89843fo<IMUser>>(LJ) { // from class: X.3Xe
                    public final List<? extends IMUser> LJLIL;

                    @Override // X.AbstractC029409q
                    public final int getItemCount() {
                        return this.LJLIL.size();
                    }

                    {
                        o.LJIIIZ(LJ, "data");
                        this.LJLIL = LJ;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // X.AbstractC029409q
                    public final void onBindViewHolder(C89843fo<IMUser> c89843fo, int i2) {
                        C89843fo<IMUser> holder = c89843fo;
                        o.LJIIIZ(holder, "holder");
                        holder.bind(ListProtector.get(this.LJLIL, i2), i2);
                    }

                    @Override // X.AbstractC029409q
                    public final C89843fo<IMUser> onCreateViewHolder(ViewGroup parent, int i2) {
                        o.LJIIIZ(parent, "parent");
                        final View LIZIZ = C1FL.LIZIZ(parent, R.layout.c_m, parent, false, "from(parent.context)\n   …user_item, parent, false)");
                        C89843fo<IMUser> c89843fo = new C89843fo<IMUser>(LIZIZ, this) { // from class: X.3fw
                            public final View LJLIL;
                            public final AP9 LJLILLLLZI;
                            public final TextView LJLJI;
                            public final TextView LJLJJI;
                            public final TextView LJLJJL;

                            @Override // X.C89843fo
                            public final void M() {
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(LIZIZ);
                                o.LJIIIZ(this, "adapter");
                                this.LJLIL = LIZIZ;
                                View findViewById = LIZIZ.findViewById(R.id.abh);
                                o.LJIIIIZZ(findViewById, "container.findViewById(R.id.avatar)");
                                this.LJLILLLLZI = (AP9) findViewById;
                                View findViewById2 = LIZIZ.findViewById(R.id.gvs);
                                o.LJIIIIZZ(findViewById2, "container.findViewById(R.id.name)");
                                this.LJLJI = (TextView) findViewById2;
                                View findViewById3 = LIZIZ.findViewById(R.id.desc);
                                o.LJIIIIZZ(findViewById3, "container.findViewById(R.id.desc)");
                                this.LJLJJI = (TextView) findViewById3;
                                View findViewById4 = LIZIZ.findViewById(R.id.mxw);
                                o.LJIIIIZZ(findViewById4, "container.findViewById(R.id.userRelation)");
                                this.LJLJJL = (TextView) findViewById4;
                            }

                            @Override // X.C89843fo
                            public final void bind(IMUser iMUser, int i3) {
                                IMUser user = iMUser;
                                o.LJIIIZ(user, "user");
                                View view = this.itemView;
                                view.setBackground(C89953fz.LIZ(view.getContext()));
                                User LIZ = C90173gL.LIZ(user);
                                this.LJLILLLLZI.setUserData(new UserVerify(LIZ.getAvatarThumb(), LIZ.getCustomVerify(), LIZ.getEnterpriseVerifyReason(), Integer.valueOf(LIZ.getVerificationType())));
                                AP9 avatar = this.LJLILLLLZI;
                                Context context = this.itemView.getContext();
                                String customVerify = user.getCustomVerify();
                                String enterpriseVerifyReason = user.getEnterpriseVerifyReason();
                                TextView textView = this.LJLJI;
                                o.LJIIIZ(avatar, "avatar");
                                avatar.LIZ();
                                AJ9.LJ(context, customVerify, enterpriseVerifyReason, textView);
                                C90173gL.LJII(user, this.LJLJI, this.LJLJJI);
                                if (user.getFollowStatus() == 2) {
                                    this.LJLJJL.setVisibility(0);
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append(" · ");
                                    LIZ2.append(this.itemView.getContext().getString(R.string.l_c));
                                    this.LJLJJL.setText(X1D.LIZIZ(LIZ2));
                                } else {
                                    this.LJLJJL.setVisibility(4);
                                }
                                C16880lQ.LJIIJ(new ACListenerS36S0200000_1(user, this, 49), this.LJLIL);
                            }
                        };
                        C0AX.LIZ(parent, c89843fo.itemView, R.id.lj7);
                        View view = c89843fo.itemView;
                        if (view != null) {
                            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
                        }
                        try {
                            if (c89843fo.itemView.getParent() != null) {
                                boolean z = true;
                                try {
                                    SettingsManager.LIZLLL().getClass();
                                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                                } catch (Exception unused) {
                                }
                                if (z) {
                                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                                    stringBuffer.append(C89923fw.class.getName());
                                    stringBuffer.append(" parent ");
                                    stringBuffer.append(parent.getClass().getName());
                                    stringBuffer.append(" viewType ");
                                    stringBuffer.append(i2);
                                    C78983UzD.LJIILL(stringBuffer.toString());
                                    ViewGroup viewGroup = (ViewGroup) c89843fo.itemView.getParent();
                                    if (viewGroup != null) {
                                        C16880lQ.LJLLL(c89843fo.itemView, viewGroup);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            C78946Uyc.LIZIZ(e);
                            C36922EeM.LIZ(e);
                        }
                        C29127Bbv.LIZ = C89923fw.class.getName();
                        return c89843fo;
                    }
                });
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
                c188727au.LJIIIZ("enter_method", this.LJLIL);
                c188727au.LJ(this.LJLJI, "question_id");
                c188727au.LJ(this.LJLJJI, "question_user_id");
                c188727au.LIZLLL(LJ.size(), "invitee_count");
                FMX.LJIIL("enter_qa_invited_users_panel", c188727au.LIZ);
            }
        };
        C235119Kp c235119Kp = new C235119Kp();
        if (o.LJ(bool, Boolean.TRUE)) {
            C234529Ii LIZJ = s1.LIZJ();
            LIZJ.LIZJ = R.raw.icon_arrow_left_ltr;
            LIZJ.LIZLLL = true;
            LIZJ.LIZIZ(new AqS151S0100000_1((C90023g6) r10, 690));
            c235119Kp.LIZLLL(LIZJ);
        }
        ASL LIZ = C249109q6.LIZ(2);
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LJZL = true;
        tuxSheet.LJZI = false;
        tuxSheet.LJLLI = r10;
        C9KF c9kf = new C9KF();
        Object[] objArr = new Object[2];
        if (list != null) {
            obj = Integer.valueOf(list.size());
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        objArr[0] = obj;
        objArr[1] = String.valueOf(i);
        String string = activity.getString(R.string.pof, objArr);
        o.LJIIIIZZ(string, "activity\n               …                        )");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ2 = s1.LIZJ();
        LIZJ2.LIZJ = R.raw.icon_x_mark_small;
        LIZJ2.LIZLLL = true;
        LIZJ2.LIZIZ(new AqS151S0100000_1((C90023g6) r10, 691));
        c235119Kp.LIZIZ(LIZJ2);
        TuxSheet tuxSheet2 = LIZ.LIZ;
        tuxSheet2.LJLLL = c235119Kp;
        tuxSheet2.LJLILLLLZI = new IDDListenerS141S0100000_1(interfaceC65784Pro, 7);
        if (o.LJ(enterMethod, "post_qa_video")) {
            LJFF = O6R.LJJIIJZLJL(C90173gL.LJFF(activity) * 0.99d);
        } else {
            LJFF = C90173gL.LJFF(activity);
        }
        LIZ.LIZJ(LJFF, LJFF);
        TuxSheet tuxSheet3 = LIZ.LIZ;
        FragmentManager supportFragmentManager = ((ActivityC45651qj) activity).getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity as AppCompatAct…y).supportFragmentManager");
        tuxSheet3.show(supportFragmentManager, "InvitedUsersView");
    }

    @Override // com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService
    public final void LIZJ(Activity activity, String str, String str2, EnumC90333gb requestType, Long l, Long l2, List<? extends IMUser> list, Qna qna, InterfaceC88472Yns<? super List<? extends IMUser>, C76800UCe> interfaceC88472Yns) {
        C62387Oe7 c62387Oe7;
        int LJFF;
        o.LJIIIZ(requestType, "requestType");
        if (qna != null) {
            ShareService shareService = C4LD.LIZ;
            o.LJIIIIZZ(shareService, "shareService()");
            c62387Oe7 = shareService.LJJIIJ(activity, qna, new C62415OeZ(), "", str2);
        } else {
            c62387Oe7 = null;
        }
        C90253gT c90253gT = new C90253gT(activity, str, str2, requestType, l, l2, list, interfaceC88472Yns, activity, c62387Oe7);
        ASL LIZ = C249109q6.LIZ(2);
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LJZL = true;
        tuxSheet.LJZI = false;
        tuxSheet.LJLLI = c90253gT;
        tuxSheet.LJLILLLLZI = new DialogInterface.OnDismissListener() { // from class: X.3hc
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
                if (LJIIZILJ != null) {
                    LJIIZILJ.LJIIJJI(false);
                }
            }
        };
        C235119Kp c235119Kp = new C235119Kp();
        C9KF c9kf = new C9KF();
        String string = activity.getString(R.string.poz);
        o.LJIIIIZZ(string, "activity\n               …                        )");
        c9kf.LIZJ = string;
        c235119Kp.LIZJ = c9kf;
        C234529Ii LIZJ = s1.LIZJ();
        LIZJ.LIZJ = R.raw.icon_x_mark_small;
        LIZJ.LIZLLL = true;
        LIZJ.LIZIZ(new AqS151S0100000_1(c90253gT, 689));
        c235119Kp.LIZIZ(LIZJ);
        LIZ.LIZ.LJLLL = c235119Kp;
        if (o.LJ(str, "post_qa_video")) {
            LJFF = O6R.LJJIIJZLJL(C90173gL.LJFF(activity) * 0.99d);
        } else {
            LJFF = C90173gL.LJFF(activity);
        }
        LIZ.LIZJ(LJFF, LJFF);
        TuxSheet tuxSheet2 = LIZ.LIZ;
        FragmentManager supportFragmentManager = ((ActivityC45651qj) activity).getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity as AppCompatAct…y).supportFragmentManager");
        tuxSheet2.show(supportFragmentManager, "InvitedUsersView");
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJIIJJI(true);
        }
    }
}
