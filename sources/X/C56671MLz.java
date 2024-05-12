package X;

import Y.ACListenerS29S0100000_9;
import Y.AObserverS77S0100000_9;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.homepage.api.data.InboxFollowGuideViewModel;
import com.ss.android.ugc.aweme.inbox.widget.multi.SkylightLiveGuidePod;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.MLz, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56671MLz extends MMX<SkylightLiveGuidePod> {
    public final View LJLJLLL;
    public final TuxTextView LJLL;
    public final C72433Sbl LJLLI;
    public final C72433Sbl LJLLILLLL;
    public final C72433Sbl LJLLJ;
    public final C119514mZ LJLLL;
    public final C119514mZ LJLLLL;
    public final C119514mZ LJLLLLLL;
    public List<CombineLiveNotice> LJLZ;
    public final InboxFollowGuideViewModel LJZ;
    public boolean LJZI;
    public final MM0 LJZL;

    public static void g0() {
        String currentUserID = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUserID();
        LiveOuterService.LJJJLL().LJIIJJI();
        HashSet<String> LJIILL = C55661Lsv.LJIILL();
        LJIILL.add(currentUserID);
        InterfaceC30442Bx8.w3.LIZ(LJIILL);
    }

    public final void f0() {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkylightLiveGuideVH#reportShow anchor_num = ");
        List<CombineLiveNotice> list = this.LJLZ;
        Integer num2 = null;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        List<CombineLiveNotice> list2 = this.LJLZ;
        if (list2 != null) {
            num2 = Integer.valueOf(list2.size());
        }
        FMX.LJIIL("livesdk_inbox_notice_board_show", C51029K0z.LJJIIZI(new OSZ("anchor_num", String.valueOf(num2))));
    }

    @Override // X.MMX
    public final void U(boolean z) {
        MainActivityScope LJJLIIIJJI;
        HomeTabAbility LJIL;
        MutableLiveData<Boolean> mutableLiveData;
        super.U(z);
        InboxFollowGuideViewModel inboxFollowGuideViewModel = this.LJZ;
        if (inboxFollowGuideViewModel != null && (mutableLiveData = inboxFollowGuideViewModel.LJLIL) != null) {
            mutableLiveData.setValue(Boolean.TRUE);
        }
        ActivityC45651qj mo49getActivity = getFragment().mo49getActivity();
        if (mo49getActivity != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(mo49getActivity)) != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) != null) {
            LJIL.b3(this.LJZL);
        }
    }

    @Override // X.MMX
    public final void V(SkylightLiveGuidePod skylightLiveGuidePod) {
        int i;
        int i2;
        User user;
        User user2;
        User user3;
        Integer LJI;
        Integer LJI2;
        SkylightLiveGuidePod skylightLiveGuidePod2 = skylightLiveGuidePod;
        super.V(skylightLiveGuidePod2);
        List<CombineLiveNotice> list = skylightLiveGuidePod2.liveNotices;
        this.LJLZ = list;
        ArrayList arrayList = new ArrayList();
        for (CombineLiveNotice combineLiveNotice : list) {
            User user4 = combineLiveNotice.getUser();
            if (user4 == null || user4.getFollowStatus() != 2) {
                arrayList.add(combineLiveNotice);
            }
        }
        this.LJLL.setVisibility(8);
        this.LJLLI.setVisibility(8);
        this.LJLLILLLL.setVisibility(8);
        this.LJLLJ.setVisibility(8);
        this.LJLLL.setVisibility(8);
        this.LJLLLL.setVisibility(8);
        this.LJLLLLLL.setVisibility(8);
        if (arrayList.isEmpty()) {
            this.LJLL.setVisibility(0);
        }
        ActivityC45651qj M = M();
        if (M != null && (LJI2 = C79045V0n.LJI(R.attr.e6, M)) != null) {
            i = LJI2.intValue();
        } else {
            i = -1;
        }
        ActivityC45651qj M2 = M();
        if (M2 != null && (LJI = C79045V0n.LJI(R.attr.e5, M2)) != null) {
            i2 = LJI.intValue();
        } else {
            i2 = -1;
        }
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 100.0f, 100.0f, i, i2, Shader.TileMode.MIRROR);
        if ((!arrayList.isEmpty()) && (user3 = ((CombineLiveNotice) ListProtector.get(arrayList, 0)).getUser()) != null) {
            C72433Sbl userAvatar1 = this.LJLLI;
            o.LJIIIIZZ(userAvatar1, "userAvatar1");
            C119514mZ userAvatarRing1 = this.LJLLL;
            o.LJIIIIZZ(userAvatarRing1, "userAvatarRing1");
            h0(linearGradient, userAvatar1, userAvatarRing1, user3);
        }
        if (arrayList.size() > 1 && (user2 = ((CombineLiveNotice) ListProtector.get(arrayList, 1)).getUser()) != null) {
            C72433Sbl userAvatar2 = this.LJLLILLLL;
            o.LJIIIIZZ(userAvatar2, "userAvatar2");
            C119514mZ userAvatarRing2 = this.LJLLLL;
            o.LJIIIIZZ(userAvatarRing2, "userAvatarRing2");
            h0(linearGradient, userAvatar2, userAvatarRing2, user2);
        }
        if (arrayList.size() > 2 && (user = ((CombineLiveNotice) ListProtector.get(arrayList, 2)).getUser()) != null) {
            C72433Sbl userAvatar3 = this.LJLLJ;
            o.LJIIIIZZ(userAvatar3, "userAvatar3");
            C119514mZ userAvatarRing3 = this.LJLLLLLL;
            o.LJIIIIZZ(userAvatarRing3, "userAvatarRing3");
            h0(linearGradient, userAvatar3, userAvatarRing3, user);
        }
        f0();
    }

    @Override // X.MMX
    public final void Y(boolean z) {
        MainActivityScope LJJLIIIJJI;
        HomeTabAbility LJIL;
        super.Y(z);
        ActivityC45651qj mo49getActivity = getFragment().mo49getActivity();
        if (mo49getActivity != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(mo49getActivity)) != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) != null) {
            LJIL.Q6(this.LJZL);
        }
    }

    public final void c0(String str) {
        Integer num;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkylightLiveGuideVH#reportClick anchor_num = ");
        List<CombineLiveNotice> list = this.LJLZ;
        Integer num2 = null;
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        LIZ.append(", click_module = ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        OSZ[] oszArr = new OSZ[2];
        List<CombineLiveNotice> list2 = this.LJLZ;
        if (list2 != null) {
            num2 = Integer.valueOf(list2.size());
        }
        oszArr[0] = new OSZ("anchor_num", String.valueOf(num2));
        oszArr[1] = new OSZ("click_module", str);
        FMX.LJIIL("livesdk_inbox_notice_board_click", C113554cx.LJJL(oszArr));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56671MLz(View view, Fragment fragment) {
        super(view);
        MutableLiveData<Boolean> mutableLiveData;
        o.LJIIIZ(fragment, "fragment");
        this.LJLJLLL = view;
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.e0l);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.ed1);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.gck);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.h21);
        this.LJLL = tuxTextView2;
        this.LJLLI = (C72433Sbl) view.findViewById(R.id.my1);
        this.LJLLILLLL = (C72433Sbl) view.findViewById(R.id.my2);
        this.LJLLJ = (C72433Sbl) view.findViewById(R.id.my3);
        this.LJLLL = (C119514mZ) view.findViewById(R.id.myd);
        this.LJLLLL = (C119514mZ) view.findViewById(R.id.mye);
        this.LJLLLLLL = (C119514mZ) view.findViewById(R.id.myf);
        this.LJZL = new MM0(this);
        ActivityC45651qj LIZ = C212428Vi.LIZ(fragment);
        if (LIZ != null) {
            InboxFollowGuideViewModel LIZ2 = LYC.LIZ(LIZ);
            this.LJZ = LIZ2;
            if (LIZ2 != null && (mutableLiveData = LIZ2.LJLILLLLZI) != null) {
                mutableLiveData.observe(fragment, new AObserverS77S0100000_9(this, 86));
            }
        }
        C16880lQ.LJJJ(tuxIconView, new ACListenerS29S0100000_9(this, 133));
        ViewOnClickListenerC56670MLy viewOnClickListenerC56670MLy = new ViewOnClickListenerC56670MLy(this, fragment);
        C16880lQ.LJIJ(relativeLayout, viewOnClickListenerC56670MLy);
        C16880lQ.LJJJJI(tuxTextView, viewOnClickListenerC56670MLy);
        C16880lQ.LJJJJI(tuxTextView2, viewOnClickListenerC56670MLy);
        C56204M4a.LJIIIZ(view, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))));
    }

    public final void h0(LinearGradient linearGradient, C72433Sbl c72433Sbl, C119514mZ c119514mZ, User user) {
        int i;
        Integer LJI;
        c72433Sbl.setVisibility(0);
        c119514mZ.setVisibility(0);
        c119514mZ.LJLIL.add(new OSZ<>(linearGradient, 0));
        ActivityC45651qj M = M();
        if (M != null && (LJI = C79045V0n.LJI(R.attr.cl, M)) != null) {
            i = LJI.intValue();
        } else {
            i = -1;
        }
        c119514mZ.LJLIL.add(new OSZ<>(Integer.valueOf(i), 1));
        C78765Uvh.LJFF(c72433Sbl, user.getAvatarThumb());
    }
}
