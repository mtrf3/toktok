package com.ss.android.ugc.aweme.tag.service;

import X.ASL;
import X.AV1;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C186957Vj;
import X.C186977Vl;
import X.C186997Vn;
import X.C1DG;
import X.C249109q6;
import X.C32I;
import X.C47261Igj;
import X.C61878OQg;
import X.C76800UCe;
import X.C7DS;
import X.C7F0;
import X.C7FK;
import X.InterfaceC65784Pro;
import X.InterfaceC88473Ynt;
import X.KL2;
import X.SY4;
import Y.ACListenerS38S0200000_3;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.keva.Keva;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.FypAutoScrollService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfo;
import com.ss.android.ugc.aweme.feed.model.InteractionTagInfoKt;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.tag.FeedTaggedListFragment;
import com.ss.android.ugc.aweme.tag.VideoTagPanel;
import com.ss.android.ugc.aweme.tag.viewmodel.SocialVideoTagShareVM;
import com.ss.android.ugc.feed.platform.panel.autoscroll.FypAutoScrollServiceImpl;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS46S0110000_3;
import kotlin.jvm.internal.AqS8S0010000_3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TagServiceImpl implements ITagService {
    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LIZ() {
        C186977Vl.LIZ = C61878OQg.INSTANCE;
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final int LIZIZ() {
        return C186997Vn.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final LiveData LJI(LifecycleRegistry lifecycle) {
        o.LJIIIZ(lifecycle, "lifecycle");
        if (C16880lQ.LLJJIJIL(lifecycle.getCurrentState(), Lifecycle.State.INITIALIZED) <= 0) {
            return null;
        }
        return ((SocialVideoTagShareVM) new SharedViewModelProvider((ViewModelProvider.Factory) null, 1, (DefaultConstructorMarker) null).get(lifecycle, SocialVideoTagShareVM.class)).LJLIL;
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LIZJ(ActivityC45651qj activityC45651qj, final boolean z, final InterfaceC65784Pro<C76800UCe> onDismiss) {
        o.LJIIIZ(onDismiss, "onDismiss");
        if (activityC45651qj != null) {
            Keva repo = Keva.getRepo("repo_video_tag");
            int LIZIZ = C7F0.LIZIZ();
            if (LIZIZ == 0 || repo.getBoolean("key_intro_has_shown", false)) {
                return;
            }
            if ((!C47261Igj.LJII(1, 2, 5).contains(Integer.valueOf(C7F0.LIZIZ())) || !z) && (LIZIZ != 3 || z)) {
                return;
            }
            repo.storeBoolean("key_intro_has_shown", true);
            final C186957Vj c186957Vj = new C186957Vj(activityC45651qj, null, 0);
            AqS153S0100000_3 aqS153S0100000_3 = new AqS153S0100000_3(c186957Vj, 1043);
            C16880lQ.LJJJ((TuxIconView) c186957Vj._$_findCachedViewById(R.id.n8r), new ACListenerS38S0200000_3(c186957Vj, aqS153S0100000_3, 56));
            C16880lQ.LJJIZ((SY4) c186957Vj._$_findCachedViewById(R.id.n8s), new ACListenerS38S0200000_3(c186957Vj, aqS153S0100000_3, 57));
            ASL asl = new ASL();
            asl.LJI(0);
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLI = c186957Vj;
            tuxSheet.LJLILLLLZI = new DialogInterface.OnDismissListener() { // from class: X.7Vh
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    onDismiss.invoke();
                    C7DS.LIZ("close_tag_introduce_bottom_sheet", new AqS46S0110000_3(z, c186957Vj, 7));
                }
            };
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            tuxSheet.show(supportFragmentManager, "VideoTagIntroView");
            C7DS.LIZ("show_tag_introduce_bottom_sheet", new AqS8S0010000_3(z, 15));
        }
    }

    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LJ(ActivityC45651qj activityC45651qj, Aweme aweme, String str, String anchorType) {
        int i;
        List<InteractionTagUserInfo> taggedUsers;
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(anchorType, "anchorType");
        float LJIIIZ = KL2.LJIIIZ(activityC45651qj) * 0.5f;
        Bundle bundle = new Bundle();
        bundle.putSerializable("aweme", aweme);
        if ((C7F0.LIZ() || C186997Vn.LIZIZ()) && AV1.LJIJI(aweme.getAuthorUid())) {
            i = 1;
        } else {
            i = 0;
        }
        InteractionTagInfo interactionTagInfo = aweme.getInteractionTagInfo();
        if (interactionTagInfo != null && (taggedUsers = interactionTagInfo.getTaggedUsers()) != null && (!taggedUsers.isEmpty())) {
            ArrayList arrayList = new ArrayList(C32I.LJJL(taggedUsers, 10));
            Iterator<InteractionTagUserInfo> it = taggedUsers.iterator();
            while (it.hasNext()) {
                arrayList.add(InteractionTagInfoKt.toUser(it.next()));
            }
            bundle.putSerializable("tagged_users", arrayList);
            i += taggedUsers.size();
        }
        if (str == null) {
            str = "";
        }
        bundle.putString("enter_from", str);
        bundle.putString("anchor_type", anchorType);
        float f = (i * 64.0f) + 60.0f;
        if (i == 1) {
            f += 36.0f;
        }
        float LIZJ = KL2.LIZJ(activityC45651qj, f);
        if (LIZJ <= LJIIIZ) {
            LJIIIZ = LIZJ;
        }
        FeedTaggedListFragment feedTaggedListFragment = new FeedTaggedListFragment();
        feedTaggedListFragment.setArguments(bundle);
        feedTaggedListFragment.LJLJJL = new AqS153S0100000_3(feedTaggedListFragment, 1042);
        FypAutoScrollService LJIIZILJ = FypAutoScrollServiceImpl.LJIIZILJ();
        if (LJIIZILJ != null) {
            LJIIZILJ.LJIIJJI(true);
        }
        int i2 = (int) LJIIIZ;
        TuxSheet tuxSheet = C249109q6.LIZ(1).LIZ;
        tuxSheet.LJLLLLLL = i2;
        tuxSheet.LJZI = false;
        tuxSheet.LJLLILLLL = feedTaggedListFragment;
        tuxSheet.LJLILLLLZI = new DialogInterface.OnDismissListener() { // from class: X.7Vi
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                FypAutoScrollService LJIIZILJ2 = FypAutoScrollServiceImpl.LJIIZILJ();
                if (LJIIZILJ2 != null) {
                    LJIIZILJ2.LJIIJJI(false);
                }
            }
        };
        C1DG.LJII(activityC45651qj, "activity.supportFragmentManager", tuxSheet, "FeedTaggedListFragment");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LIZLLL(ActivityC45651qj activityC45651qj, String enterFrom, Aweme aweme, int i, List<InteractionTagUserInfo> list, InterfaceC88473Ynt<? super List<InteractionTagUserInfo>, ? super Boolean, ? super Boolean, C76800UCe> interfaceC88473Ynt) {
        ?? r8;
        o.LJIIIZ(enterFrom, "enterFrom");
        if (activityC45651qj == null) {
            return;
        }
        VideoTagPanel videoTagPanel = new VideoTagPanel();
        if (list != null) {
            r8 = new ArrayList(C32I.LJJL(list, 10));
            Iterator<InteractionTagUserInfo> it = list.iterator();
            while (it.hasNext()) {
                r8.add(IMUser.fromInteractionTagUser(it.next()));
            }
        } else {
            r8 = C61878OQg.INSTANCE;
        }
        videoTagPanel.LJLIL = new C7FK(enterFrom, aweme, i, r8, interfaceC88473Ynt);
        TuxSheet tuxSheet = C249109q6.LIZ(1).LIZ;
        tuxSheet.LJZI = false;
        tuxSheet.LJLLILLLL = videoTagPanel;
        tuxSheet.LJLILLLLZI = new DialogInterface.OnDismissListener() { // from class: X.7Vk
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
            }
        };
        C1DG.LJII(activityC45651qj, "activity.supportFragmentManager", tuxSheet, "VideoTagPanel");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    @Override // com.ss.android.ugc.aweme.tag.service.ITagService
    public final void LJFF(Context context, String enterFrom, Aweme aweme, int i, List<InteractionTagUserInfo> list, OnActivityResultCallback onActivityResultCallback) {
        ?? r7;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterFrom, "enterFrom");
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//social/taglist");
        if (list != null) {
            r7 = new ArrayList(C32I.LJJL(list, 10));
            Iterator<InteractionTagUserInfo> it = list.iterator();
            while (it.hasNext()) {
                r7.add(IMUser.fromInteractionTagUser(it.next()));
            }
        } else {
            r7 = C61878OQg.INSTANCE;
        }
        buildRoute.withParam("init_config", new C7FK(enterFrom, aweme, i, r7, null, 16, null));
        buildRoute.open(111, onActivityResultCallback);
    }
}
