package com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices;

import X.AbstractC65781Prl;
import X.C3SB;
import X.InterfaceC109664Sc;
import X.InterfaceC65784Pro;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.ui.FocusedSessionListWidget;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.ui.InvitationCardInboxWidget;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.maf.ui.MafChatListWidget;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.sessionrefactor.InboxSessionDataProvider;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.ui.inboxwidget.TopNoticeInboxWidget;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.SessionListTopNoticeViewModel;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListGroupChatVH;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListMessageRequestCellVH;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListSingleChatVH;
import com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListTakoChatVH;
import com.ss.android.ugc.aweme.im.service.experiment.EducateUserMessageSetting;
import com.ss.android.ugc.aweme.inbox.InboxFragment;
import com.ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class IMServiceProvider$inboxAdapterService$2 extends AbstractC65781Prl implements InterfaceC65784Pro<C3SB> {
    public static final IMServiceProvider$inboxAdapterService$2 INSTANCE = new IMServiceProvider$inboxAdapterService$2();

    public IMServiceProvider$inboxAdapterService$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.3SB] */
    @Override // X.InterfaceC65784Pro
    public final C3SB invoke() {
        return new InterfaceC109664Sc() { // from class: X.3SB
            @Override // X.InterfaceC109664Sc
            public final void LJFF() {
                Object obj;
                C3S8.LIZJ = true;
                if (C3SE.LIZ() == 0 || (!C3S8.LIZ && !C3S8.LIZIZ)) {
                    C114304eA.LIZIZ.putAll(C51029K0z.LJJIIZI(new OSZ(Integer.valueOf(R.layout.b5v), "im_item_session_inbox_widget")));
                    Object LJIIIIZZ = C84763XOl.LJIIIIZZ();
                    ActivityC45651qj activityC45651qj = null;
                    if (LJIIIIZZ instanceof InterfaceC55058LjC) {
                        obj = (InterfaceC55058LjC) LJIIIIZZ;
                    } else {
                        obj = null;
                    }
                    if (obj instanceof ActivityC45651qj) {
                        activityC45651qj = (ActivityC45651qj) obj;
                    }
                    C114304eA.LJ(activityC45651qj, R.layout.b5v, R.layout.b5v, R.layout.b5v, R.layout.b5v);
                }
            }

            @Override // X.InterfaceC109664Sc
            public final boolean LIZIZ() {
                return C3TX.LIZIZ();
            }

            @Override // X.InterfaceC109664Sc
            public final boolean LJ() {
                return C3KQ.LIZ().useRecyclerViewPool;
            }

            @Override // X.InterfaceC109664Sc
            public final void LJIIL() {
                if (C114304eA.LIZLLL()) {
                    LJIILIIL(SessionListTopNoticeViewModel.LL);
                    LJIILIIL(C3X0.LJLJL);
                    LJIILIIL(C81463Hq.LJI);
                    LJIILIIL(C30U.LIZ());
                    LJIILIIL(Boolean.valueOf(C52454KiI.LIZ()));
                    C76662ze.LJLIL.getClass();
                    C76662ze.LJIIIZ().hashCode();
                }
                if ((C3SE.LIZ() & 32) == 0 || C3S8.LIZIZ || C3S8.LIZ || C3S8.LIZJ) {
                    return;
                }
                C3S8.LIZ = true;
                synchronized (C3K5.LJLIL) {
                    C3K5.LJLJL = 1;
                }
                C3S8.LIZ();
            }

            public static void LJIILIIL(Object obj) {
                if (obj != null) {
                    obj.hashCode();
                }
            }

            @Override // X.InterfaceC109664Sc
            public final int LJI(C65776Prg c65776Prg) {
                int i;
                if (o.LJ(c65776Prg, C65352Pkq.LIZ(SessionListSingleChatVH.class))) {
                    i = C3KQ.LIZ().dmViewHolderCacheSize;
                } else if (o.LJ(c65776Prg, C65352Pkq.LIZ(SessionListGroupChatVH.class))) {
                    i = C3KQ.LIZ().dmViewHolderCacheSize;
                } else if (o.LJ(c65776Prg, C65352Pkq.LIZ(SessionListMessageRequestCellVH.class)) || o.LJ(c65776Prg, C65352Pkq.LIZ(SessionListTakoChatVH.class))) {
                    i = 1;
                } else if (o.LJ(c65776Prg, C65352Pkq.LIZ(SessionListViewHolder.class))) {
                    i = C3KQ.LIZ().dmViewHolderCacheSize;
                } else {
                    i = 5;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("class: ");
                LIZ.append(c65776Prg.LIZLLL());
                LIZ.append("  cache size: ");
                LIZ.append(i);
                C81843Jc.LIZIZ("InboxAdapterServiceImpl", X1D.LIZIZ(LIZ));
                return i;
            }

            @Override // X.InterfaceC109664Sc
            public final MafChatListWidget LJII(InboxFragment fragment, LiveData parentWidgetState) {
                int i;
                o.LJIIIZ(fragment, "fragment");
                o.LJIIIZ(parentWidgetState, "parentWidgetState");
                if (C52454KiI.LIZ() && !C78966Uyw.LJJIJ().LIZIZ()) {
                    User curUser = ((RBX) HG3.LJIILL()).getCurUser();
                    if (curUser != null) {
                        i = curUser.getFollowerCount();
                    } else {
                        i = 0;
                    }
                    SettingsManager LIZLLL = SettingsManager.LIZLLL();
                    EducateUserMessageSetting.EducateUserMessageConfig educateUserMessageConfig = EducateUserMessageSetting.LIZ;
                    EducateUserMessageSetting.EducateUserMessageConfig educateUserMessageConfig2 = (EducateUserMessageSetting.EducateUserMessageConfig) LIZLLL.LJIIIIZZ("tt_dm_educate_muf_user_to_message_config", EducateUserMessageSetting.EducateUserMessageConfig.class, educateUserMessageConfig);
                    if (educateUserMessageConfig2 != null) {
                        educateUserMessageConfig = educateUserMessageConfig2;
                    }
                    o.LJIIIIZZ(educateUserMessageConfig, "SettingsManager.getInsta….java)\n        ?: DEFAULT");
                    if (i <= educateUserMessageConfig.maxFollowerCount) {
                        return new MafChatListWidget(fragment, parentWidgetState);
                    }
                }
                return null;
            }

            @Override // X.InterfaceC109664Sc
            public final InvitationCardInboxWidget LJIIIIZZ(InboxFragment fragment, LiveData parentWidgetState) {
                o.LJIIIZ(fragment, "fragment");
                o.LJIIIZ(parentWidgetState, "parentWidgetState");
                if (((Boolean) C45V.LIZ.getValue()).booleanValue()) {
                    Keva LJFF = C92353jr.LIZ.LJFF();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("key_maf_invitation_card_not_show");
                    LIZ.append(C92353jr.LIZJ());
                    if (!LJFF.getBoolean(X1D.LIZIZ(LIZ), false)) {
                        return new InvitationCardInboxWidget(fragment, parentWidgetState);
                    }
                }
                return null;
            }

            @Override // X.InterfaceC109664Sc
            public final boolean LJIIJ(String str, Lifecycle.State state) {
                if (o.LJ(str, "chatReportSubmit") && state.isAtLeast(Lifecycle.State.STARTED)) {
                    return true;
                }
                return false;
            }

            @Override // X.InterfaceC109664Sc
            public final SQR LIZ(Context context, LifecycleOwner lifecycleOwner, FragmentManager fragmentManager) {
                o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
                return new SQR(context, lifecycleOwner, fragmentManager);
            }

            @Override // X.InterfaceC109664Sc
            public final void LIZJ(FragmentManager fragmentManager, C36W enterMethod, String str) {
                C31J c31j;
                o.LJIIIZ(enterMethod, "enterMethod");
                int i = C36X.LIZ[enterMethod.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        c31j = C31J.REPORT;
                    } else {
                        throw new C162476Zf();
                    }
                } else {
                    c31j = C31J.BLOCK;
                }
                SQK.LIZIZ(fragmentManager, c31j, str);
            }

            @Override // X.InterfaceC109664Sc
            public final TopNoticeInboxWidget LIZLLL(InboxFragment fragment, LiveData parentWidgetState, AqS151S0100000_1 aqS151S0100000_1) {
                o.LJIIIZ(fragment, "fragment");
                o.LJIIIZ(parentWidgetState, "parentWidgetState");
                return new TopNoticeInboxWidget(fragment, parentWidgetState, aqS151S0100000_1);
            }

            @Override // X.InterfaceC109664Sc
            public final InboxAdapterWidget LJIIIZ(InboxFragment fragment, LiveData parentWidgetState, boolean z) {
                o.LJIIIZ(fragment, "fragment");
                o.LJIIIZ(parentWidgetState, "parentWidgetState");
                if (C3TX.LIZIZ() && z) {
                    return new InboxSessionDataProvider(fragment, parentWidgetState);
                }
                return new FocusedSessionListWidget(fragment, parentWidgetState, z);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x00b6  */
            @Override // X.InterfaceC109664Sc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C96803r2 LJIIJJI(X.ActivityC45651qj r6, android.view.ViewGroup r7, int r8) {
                /*
                    r5 = this;
                    java.lang.String r0 = "parent"
                    kotlin.jvm.internal.o.LJIIIZ(r7, r0)
                    int r0 = X.C3SE.LIZ()
                    r0 = r0 & 4
                    r3 = 0
                    if (r0 == 0) goto L23
                Lf:
                    boolean r0 = X.C3TX.LIZIZ()
                    if (r0 == 0) goto L9d
                    java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.concurrent.CopyOnWriteArrayList<X.3r2>> r1 = X.C3S8.LJ
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
                    java.lang.Object r1 = r1.get(r0)
                    java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1
                    if (r1 != 0) goto L96
                L23:
                    r4 = 24
                    switch(r8) {
                        case 104: goto L42;
                        case 105: goto L57;
                        case 106: goto L28;
                        case 107: goto L6c;
                        case 108: goto L81;
                        default: goto L28;
                    }
                L28:
                    com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder r2 = new com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder
                    android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r6)
                    r0 = 2131560886(0x7f0d09b6, float:1.8747157E38)
                    android.view.View r4 = X.C114304eA.LIZ(r1, r0, r7, r3, r4)
                    X.3OA r3 = new X.3OA
                    java.lang.String r1 = "notification_page"
                    java.lang.String r0 = "cell"
                    r3.<init>(r6, r1, r0)
                    r2.<init>(r4, r3)
                L41:
                    return r2
                L42:
                    com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListSingleChatVH r2 = new com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListSingleChatVH
                    android.content.Context r0 = r7.getContext()
                    android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r0)
                    r0 = 2131560885(0x7f0d09b5, float:1.8747155E38)
                    android.view.View r0 = X.C114304eA.LIZ(r1, r0, r7, r3, r4)
                    r2.<init>(r0)
                    goto L41
                L57:
                    com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListGroupChatVH r2 = new com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListGroupChatVH
                    android.content.Context r0 = r7.getContext()
                    android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r0)
                    r0 = 2131560883(0x7f0d09b3, float:1.874715E38)
                    android.view.View r0 = X.C114304eA.LIZ(r1, r0, r7, r3, r4)
                    r2.<init>(r0)
                    goto L41
                L6c:
                    com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListMessageRequestCellVH r2 = new com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListMessageRequestCellVH
                    android.content.Context r0 = r7.getContext()
                    android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r0)
                    r0 = 2131560884(0x7f0d09b4, float:1.8747153E38)
                    android.view.View r0 = X.C114304eA.LIZ(r1, r0, r7, r3, r4)
                    r2.<init>(r0)
                    goto L41
                L81:
                    com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListTakoChatVH r2 = new com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.v2.SessionListTakoChatVH
                    android.content.Context r0 = r7.getContext()
                    android.view.LayoutInflater r1 = X.C16880lQ.LLZIL(r0)
                    r0 = 2131560887(0x7f0d09b7, float:1.8747159E38)
                    android.view.View r0 = X.C114304eA.LIZ(r1, r0, r7, r3, r4)
                    r2.<init>(r0)
                    goto L41
                L96:
                    boolean r0 = r1.isEmpty()
                    if (r0 == 0) goto Lae
                    goto L23
                L9d:
                    java.util.concurrent.CopyOnWriteArrayList<com.ss.android.ugc.aweme.im.sdk.chatlist.ui.viewholder.SessionListViewHolder> r1 = X.C3S8.LIZLLL
                    boolean r0 = r1.isEmpty()
                    if (r0 == 0) goto La7
                    goto L23
                La7:
                    java.lang.Object r2 = r1.remove(r3)
                    X.3r2 r2 = (X.C96803r2) r2
                    goto Lb4
                Lae:
                    java.lang.Object r2 = r1.remove(r3)
                    X.3r2 r2 = (X.C96803r2) r2
                Lb4:
                    if (r2 == 0) goto L23
                    java.lang.String r1 = "InboxAdapterServiceImpl"
                    java.lang.String r0 = "find cache"
                    X.C34B.LIZIZ(r1, r0)
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C3SB.LJIIJJI(X.1qj, android.view.ViewGroup, int):X.3r2");
            }
        };
    }
}
