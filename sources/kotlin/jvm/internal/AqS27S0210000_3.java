package kotlin.jvm.internal;

import X.ARI;
import X.AbstractC177926ya;
import X.AbstractC65781Prl;
import X.ActivityC45651qj;
import X.AnonymousClass852;
import X.C0H1;
import X.C175276uJ;
import X.C177256xV;
import X.C177276xX;
import X.C177316xb;
import X.C177616y5;
import X.C177826yQ;
import X.C177846yS;
import X.C177856yT;
import X.C177876yV;
import X.C177886yW;
import X.C177896yX;
import X.C177906yY;
import X.C177916yZ;
import X.C181847Bs;
import X.C186577Tx;
import X.C187127Wa;
import X.C192947hi;
import X.C197827pa;
import X.C218868iQ;
import X.C2U8;
import X.C34K;
import X.C43I;
import X.C45804HyK;
import X.C51029K0z;
import X.C71Y;
import X.C76800UCe;
import X.C77H;
import X.C7MK;
import X.C7ML;
import X.C84763XOl;
import X.C85M;
import X.InterfaceC194547kI;
import X.InterfaceC57784Mm4;
import X.InterfaceC88472Yns;
import X.ORZ;
import X.X1D;
import X.Z89;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.addyours.model.UserInvitee;
import com.ss.android.ugc.aweme.comment.commentpage.ui.CommentListPageFragment;
import com.ss.android.ugc.aweme.comment.experiment.PersonalizedEmojiExperiment;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.KeyboardVMV2;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.favorites.business.collection.ChooseCollectionSheetFragment;
import com.ss.android.ugc.aweme.now.NowPostInfo;
import com.ss.android.ugc.aweme.poi.detail.container.PoiDetailFragment;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListAssem;
import com.ss.android.ugc.now.interaction.assem.InteractionBubbleListVM;
import com.ss.android.ugc.now.interaction.assem.LikeItem;
import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursInviteFriendsViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class AqS27S0210000_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS27S0210000_3 aqS27S0210000_3, Object obj) {
        C218868iQ it = (C218868iQ) obj;
        o.LJIIIZ(it, "it");
        List LLJILJILJ = ORZ.LLJILJILJ(it.LJLIL);
        if (aqS27S0210000_3.z2) {
            ArrayList arrayList = (ArrayList) LLJILJILJ;
            if (!arrayList.contains((UserInvitee) aqS27S0210000_3.l0)) {
                arrayList.add((UserInvitee) aqS27S0210000_3.l0);
                ((AddYoursInviteFriendsViewModel) aqS27S0210000_3.l1).setState(new AqS169S0100000_3(LLJILJILJ, (List<AnonymousClass852<C85M>>) 42));
                return C76800UCe.LIZ;
            }
        }
        if (!aqS27S0210000_3.z2) {
            ((ArrayList) LLJILJILJ).remove((UserInvitee) aqS27S0210000_3.l0);
        }
        ((AddYoursInviteFriendsViewModel) aqS27S0210000_3.l1).setState(new AqS169S0100000_3(LLJILJILJ, (List<AnonymousClass852<C85M>>) 42));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS27S0210000_3 aqS27S0210000_3, Object obj) {
        boolean z;
        String str;
        Fragment fragment;
        CommentListPageFragment commentListPageFragment;
        ViewGroup viewGroup;
        boolean z2;
        ViewGroup viewGroup2;
        ActivityC45651qj LJJIFFI;
        FragmentManager supportFragmentManager;
        C177616y5 it = (C177616y5) obj;
        o.LJIIIZ(it, "it");
        C71Y.LIZLLL("xjccccccc", "switchPanel current:" + it.LJLJJI + "  to:" + ((AbstractC177926ya) aqS27S0210000_3.l0) + " ");
        KeyboardVMV2 keyboardVMV2 = (KeyboardVMV2) aqS27S0210000_3.l1;
        AbstractC177926ya abstractC177926ya = (AbstractC177926ya) aqS27S0210000_3.l0;
        keyboardVMV2.getClass();
        boolean z3 = false;
        if (!o.LJ(abstractC177926ya, it.LJLJJI)) {
            C34K c34k = new C34K();
            if (o.LJ(abstractC177926ya, C177906yY.LIZ) || o.LJ(abstractC177926ya, C177916yZ.LIZ) || o.LJ(abstractC177926ya, C177896yX.LIZ) || o.LJ(abstractC177926ya, C177876yV.LIZ)) {
                z = true;
            } else {
                z = false;
            }
            c34k.element = z;
            if (PersonalizedEmojiExperiment.LIZ() && o.LJ(abstractC177926ya, C177916yZ.LIZ)) {
                c34k.element = false;
            }
            C34K c34k2 = new C34K();
            c34k2.element = true;
            if (o.LJ(it.LJLJJI, C177916yZ.LIZ) && o.LJ(abstractC177926ya, C177886yW.LIZ)) {
                c34k2.element = false;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("updateHorizontalEmojiPanel  showPanel:");
            LIZ.append(c34k.element);
            LIZ.append("  animation:");
            LIZ.append(c34k2.element);
            C71Y.LIZ("xjcccccc", X1D.LIZIZ(LIZ));
            keyboardVMV2.setState(new AqS134S0200000_3(c34k, c34k2, 186));
        }
        if (PersonalizedEmojiExperiment.LIZIZ() && o.LJ(it.LJLJJI, C177916yZ.LIZ)) {
            ((KeyboardVMV2) aqS27S0210000_3.l1).setState(C177826yQ.LJLIL);
        }
        AbstractC177926ya abstractC177926ya2 = (AbstractC177926ya) aqS27S0210000_3.l0;
        C177916yZ c177916yZ = C177916yZ.LIZ;
        if (o.LJ(abstractC177926ya2, c177916yZ)) {
            ((KeyboardVMV2) aqS27S0210000_3.l1).setState(C177846yS.LJLIL);
        } else {
            AbstractC177926ya abstractC177926ya3 = (AbstractC177926ya) aqS27S0210000_3.l0;
            if (o.LJ(abstractC177926ya3, C177906yY.LIZ)) {
                str = "input";
            } else if (o.LJ(abstractC177926ya3, C177886yW.LIZ)) {
                str = "emoji";
            } else if (!o.LJ(abstractC177926ya3, C177896yX.LIZ)) {
                str = "";
            } else {
                str = "gift";
            }
            C186577Tx.LIZIZ(str, "");
            ((KeyboardVMV2) aqS27S0210000_3.l1).setState(C177856yT.LJLIL);
        }
        Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
        if (LJIIIIZZ != null && (LJJIFFI = C45804HyK.LJJIFFI(LJIIIIZZ)) != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            fragment = supportFragmentManager.LJJJIL("comment_page");
        } else {
            fragment = null;
        }
        if (fragment instanceof CommentListPageFragment) {
            commentListPageFragment = (CommentListPageFragment) fragment;
        } else {
            commentListPageFragment = null;
        }
        if (o.LJ((AbstractC177926ya) aqS27S0210000_3.l0, c177916yZ)) {
            if (commentListPageFragment != null && (viewGroup2 = commentListPageFragment.LJLJLLL) != null) {
                viewGroup2.setImportantForAccessibility(1);
            }
        } else if (commentListPageFragment != null && (viewGroup = commentListPageFragment.LJLJLLL) != null) {
            viewGroup.setImportantForAccessibility(4);
        }
        AbstractC177926ya abstractC177926ya4 = it.LJLJJI;
        C177896yX c177896yX = C177896yX.LIZ;
        if ((o.LJ(abstractC177926ya4, c177896yX) && o.LJ((AbstractC177926ya) aqS27S0210000_3.l0, c177916yZ)) || (o.LJ((AbstractC177926ya) aqS27S0210000_3.l0, c177896yX) && o.LJ(it.LJLJJI, c177916yZ))) {
            ((KeyboardVMV2) aqS27S0210000_3.l1).setState(C177316xb.LJLIL);
        }
        if (o.LJ((AbstractC177926ya) aqS27S0210000_3.l0, c177916yZ)) {
            KeyboardVMV2 keyboardVMV22 = (KeyboardVMV2) aqS27S0210000_3.l1;
            keyboardVMV22.getClass();
            C177256xV c177256xV = it.LJLJLLL;
            if (c177256xV == null || (!it.LJLLJ && !it.LLI)) {
                keyboardVMV22.setState(C177276xX.LJLIL);
            } else {
                keyboardVMV22.setState(new AqS169S0100000_3(c177256xV, 639));
            }
        }
        KeyboardVMV2 keyboardVMV23 = (KeyboardVMV2) aqS27S0210000_3.l1;
        AbstractC177926ya abstractC177926ya5 = (AbstractC177926ya) aqS27S0210000_3.l0;
        keyboardVMV23.getClass();
        C177256xV c177256xV2 = it.LJLJLLL;
        if (c177256xV2 != null && c177256xV2.LIZ != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean LIZ2 = C175276uJ.LIZ();
        if (o.LJ(abstractC177926ya5, C177906yY.LIZ) || o.LJ(abstractC177926ya5, C177876yV.LIZ) || (LIZ2 && !o.LJ(abstractC177926ya5, c177916yZ))) {
            z3 = true;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("updateSingleRepostViewStatus ");
        LIZ3.append(z2);
        LIZ3.append(' ');
        LIZ3.append(z3);
        C71Y.LIZLLL("KeyboardVM", X1D.LIZIZ(LIZ3));
        keyboardVMV23.setState(new AqS1S0020000_3(z2, z3, 1));
        if (aqS27S0210000_3.z2) {
            ((KeyboardVMV2) aqS27S0210000_3.l1).setState(new AqS169S0100000_3((AbstractC177926ya) aqS27S0210000_3.l0, 96));
        } else {
            ((KeyboardVMV2) aqS27S0210000_3.l1).setState(new AqS169S0100000_3((AbstractC177926ya) aqS27S0210000_3.l0, 97));
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS27S0210000_3 aqS27S0210000_3, Object obj) {
        Assembler assemble = (Assembler) obj;
        o.LJIIIZ(assemble, "$this$assemble");
        ChooseCollectionSheetFragment chooseCollectionSheetFragment = (ChooseCollectionSheetFragment) aqS27S0210000_3.l0;
        assemble.mv0(chooseCollectionSheetFragment, new C192947hi(aqS27S0210000_3.z2, chooseCollectionSheetFragment));
        assemble.wv0((ChooseCollectionSheetFragment) aqS27S0210000_3.l0, new AqS169S0100000_3((View) aqS27S0210000_3.l1, 136));
        assemble.wv0((ChooseCollectionSheetFragment) aqS27S0210000_3.l0, new AqS169S0100000_3((View) aqS27S0210000_3.l1, 137));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS27S0210000_3 aqS27S0210000_3, Object obj) {
        ((Boolean) obj).booleanValue();
        boolean z = aqS27S0210000_3.z2;
        String G20 = ((PoiDetailFragment) aqS27S0210000_3.l0).G20();
        PoiListApi.PoiDetailResponse poiDetailResponse = (PoiListApi.PoiDetailResponse) aqS27S0210000_3.l1;
        C2U8.LIZ(new C187127Wa(z, G20, poiDetailResponse.name, poiDetailResponse.address, String.valueOf(((PoiDetailFragment) aqS27S0210000_3.l0).hashCode())));
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$4(AqS27S0210000_3 aqS27S0210000_3, Object obj) {
        C43I<Long> c43i;
        int i;
        C77H state = (C77H) obj;
        o.LJIIIZ(state, "state");
        List<InterfaceC57784Mm4> list = state.getListState().LJLJJI;
        InterfaceC57784Mm4 interfaceC57784Mm4 = null;
        if (list != null) {
            InteractionBubbleListAssem interactionBubbleListAssem = (InteractionBubbleListAssem) aqS27S0210000_3.l1;
            Iterator<InterfaceC57784Mm4> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC57784Mm4 next = it.next();
                InterfaceC57784Mm4 interfaceC57784Mm42 = next;
                if (interfaceC57784Mm42 instanceof LikeItem) {
                    String uid = ((LikeItem) interfaceC57784Mm42).getUser().getUid();
                    interactionBubbleListAssem.getClass();
                    User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
                    o.LJIIIIZZ(currentUser, "get().getService(IUserSe…::class.java).currentUser");
                    if (o.LJ(uid, currentUser.getUid())) {
                        interfaceC57784Mm4 = next;
                        break;
                    }
                }
            }
            interfaceC57784Mm4 = interfaceC57784Mm4;
        }
        Boolean bool = (Boolean) aqS27S0210000_3.l0;
        Boolean bool2 = Boolean.TRUE;
        if (o.LJ(bool, bool2) && interfaceC57784Mm4 == null) {
            InteractionBubbleListVM r4 = ((InteractionBubbleListAssem) aqS27S0210000_3.l1).r4();
            int LJIIIIZZ = ((InteractionBubbleListAssem) aqS27S0210000_3.l1).p4().getState().LJIIIIZZ();
            InteractionBubbleListAssem interactionBubbleListAssem2 = (InteractionBubbleListAssem) aqS27S0210000_3.l1;
            if (interactionBubbleListAssem2.LLIFFJFJJ) {
                i = interactionBubbleListAssem2.m4();
            } else {
                i = state.LJLJL;
            }
            if (LJIIIIZZ > i) {
                LJIIIIZZ = i;
            }
            ((InteractionBubbleListAssem) aqS27S0210000_3.l1).getClass();
            User currentUser2 = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
            o.LJIIIIZZ(currentUser2, "get().getService(IUserSe…::class.java).currentUser");
            r4.listAddItemAt(LJIIIIZZ, (int) new LikeItem(currentUser2, ((C7ML) C51029K0z.LJIILLIIL((InteractionBubbleListAssem) aqS27S0210000_3.l1)).getAweme(), ((InteractionBubbleListAssem) aqS27S0210000_3.l1).n4()));
            C71Y.LIZ("interactionBubble", "add user");
            ((InteractionBubbleListAssem) aqS27S0210000_3.l1).z4();
        } else if (!o.LJ((Boolean) aqS27S0210000_3.l0, bool2) && interfaceC57784Mm4 != null) {
            InteractionBubbleListAssem interactionBubbleListAssem3 = (InteractionBubbleListAssem) aqS27S0210000_3.l1;
            boolean z = aqS27S0210000_3.z2;
            interactionBubbleListAssem3.r4().listRemoveItem((InteractionBubbleListVM) interfaceC57784Mm4);
            if (z && (c43i = ((C77H) interactionBubbleListAssem3.r4().getState()).LJLJJLL) != null) {
                long longValue = c43i.LIZ.longValue() - 1;
                if (longValue < 0) {
                    longValue = 0;
                }
                InteractionBubbleListVM r42 = interactionBubbleListAssem3.r4();
                r42.getClass();
                r42.setState(new AqS15S0000100_3(longValue, 4));
            }
            C71Y.LIZ("interactionBubble", "remove user");
            if (((InteractionBubbleListAssem) aqS27S0210000_3.l1).p4().getState().LJIIIIZZ() == 0) {
                ((InteractionBubbleListAssem) aqS27S0210000_3.l1).p4().LJLLL();
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$5(AqS27S0210000_3 aqS27S0210000_3, Object it) {
        o.LJIIIZ(it, "it");
        ((KeyboardVMV2) aqS27S0210000_3.l0).setState(new AqS46S0110000_3((Comment) aqS27S0210000_3.l1, aqS27S0210000_3.z2, 10));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS27S0210000_3 aqS27S0210000_3, Object it) {
        o.LJIIIZ(it, "it");
        Z89.LIZIZ.LJIIIZ((ActivityC45651qj) aqS27S0210000_3.l0, C0H1.LIZ("c", "tt_to_ttn"), null);
        C7MK.LJII("now_button_action", new AqS46S0110000_3((C197827pa) aqS27S0210000_3.l1, aqS27S0210000_3.z2, 14));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS27S0210000_3 aqS27S0210000_3, Object obj) {
        int i;
        ARI actionGroup = (ARI) obj;
        o.LJIIIZ(actionGroup, "$this$actionGroup");
        boolean z = aqS27S0210000_3.z2;
        if (z) {
            i = R.string.t3a;
        } else {
            i = R.string.t4a;
        }
        actionGroup.LJI(i, new AqS27S0210000_3((ActivityC45651qj) aqS27S0210000_3.l0, (C197827pa) aqS27S0210000_3.l1, z, 6));
        actionGroup.LJIIIIZZ(R.string.t4b, new AqS46S0110000_3((C197827pa) aqS27S0210000_3.l1, aqS27S0210000_3.z2, 16));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS27S0210000_3 aqS27S0210000_3, Object obj) {
        String str;
        String str2;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("enter_from", C7MK.LIZLLL(((C181847Bs) aqS27S0210000_3.l0).LJLILLLLZI, (InterfaceC194547kI) aqS27S0210000_3.l1));
        if (aqS27S0210000_3.z2) {
            str = "mute";
        } else {
            str = "unmute";
        }
        sendEventTrackingAsync.put("to_status", str);
        NowPostInfo nowPostInfo = ((InterfaceC194547kI) aqS27S0210000_3.l1).getAweme().nowPostInfo;
        if (nowPostInfo != null) {
            str2 = nowPostInfo.getNowMediaType();
        } else {
            str2 = null;
        }
        sendEventTrackingAsync.put("now_type", str2);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS27S0210000_3 aqS27S0210000_3, Object obj) {
        String str;
        JSONObject sendEventTrackingAsync = (JSONObject) obj;
        o.LJIIIZ(sendEventTrackingAsync, "$this$sendEventTrackingAsync");
        sendEventTrackingAsync.put("enter_from", C7MK.LIZLLL(((C181847Bs) aqS27S0210000_3.l0).LJLILLLLZI, (InterfaceC194547kI) aqS27S0210000_3.l1));
        sendEventTrackingAsync.put("group_id", ((InterfaceC194547kI) aqS27S0210000_3.l1).getAweme().getAid());
        sendEventTrackingAsync.put("author_id", ((InterfaceC194547kI) aqS27S0210000_3.l1).getAweme().getAuthorUid());
        NowPostInfo nowPostInfo = ((InterfaceC194547kI) aqS27S0210000_3.l1).getAweme().nowPostInfo;
        if (nowPostInfo == null || (str = nowPostInfo.getNowMediaType()) == null) {
            str = "post";
        }
        sendEventTrackingAsync.put("now_type", str);
        sendEventTrackingAsync.put("follow_status", ((InterfaceC194547kI) aqS27S0210000_3.l1).getAweme().getFollowStatus());
        sendEventTrackingAsync.put("retry_success", aqS27S0210000_3.z2);
        return C76800UCe.LIZ;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AqS27S0210000_3(X.ActivityC45651qj r3, X.C197827pa r4, boolean r5, int r6) {
        /*
            r2 = this;
            r2.$t = r6
            switch(r6) {
                case 6: goto L11;
                default: goto L5;
            }
        L5:
            r1 = r2
            r1.z2 = r5
            r1.l0 = r3
            r1.l1 = r4
            r0 = 1
        Ld:
            r1.<init>(r0)
            return
        L11:
            r1 = r2
            r1.l0 = r3
            r1.l1 = r4
            r1.z2 = r5
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.AqS27S0210000_3.<init>(X.1qj, X.7pa, boolean, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS27S0210000_3(AbstractC177926ya abstractC177926ya, KeyboardVMV2 keyboardVMV2, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = abstractC177926ya;
        this.l1 = keyboardVMV2;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS27S0210000_3(InterfaceC194547kI interfaceC194547kI, C181847Bs c181847Bs, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = c181847Bs;
        this.l1 = interfaceC194547kI;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS27S0210000_3(KeyboardVMV2 keyboardVMV2, Comment comment, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = keyboardVMV2;
        this.l1 = comment;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS27S0210000_3(ChooseCollectionSheetFragment chooseCollectionSheetFragment, boolean z, View view, int i) {
        super(1);
        this.$t = i;
        this.l0 = chooseCollectionSheetFragment;
        this.z2 = z;
        this.l1 = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS27S0210000_3(Boolean bool, InteractionBubbleListAssem interactionBubbleListAssem, boolean z, int i) {
        super(1);
        this.$t = i;
        this.l0 = bool;
        this.l1 = interactionBubbleListAssem;
        this.z2 = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS27S0210000_3(boolean z, UserInvitee userInvitee, AddYoursInviteFriendsViewModel addYoursInviteFriendsViewModel, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = userInvitee;
        this.l1 = addYoursInviteFriendsViewModel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS27S0210000_3(boolean z, PoiDetailFragment poiDetailFragment, PoiListApi.PoiDetailResponse poiDetailResponse, int i) {
        super(1);
        this.$t = i;
        this.z2 = z;
        this.l0 = poiDetailFragment;
        this.l1 = poiDetailResponse;
    }
}
