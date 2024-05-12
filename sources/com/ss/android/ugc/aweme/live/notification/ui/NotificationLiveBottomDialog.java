package com.ss.android.ugc.aweme.live.notification.ui;

import X.AEY;
import X.AI8;
import X.AI9;
import X.AJ9;
import X.ALQ;
import X.ALS;
import X.ALT;
import X.ALV;
import X.ALX;
import X.ALY;
import X.AMD;
import X.AML;
import X.ASQ;
import X.ASX;
import X.AYW;
import X.AbstractC26082ALm;
import X.ActivityC45651qj;
import X.C03880Dg;
import X.C10A;
import X.C141335gf;
import X.C157166Eu;
import X.C16880lQ;
import X.C188577af;
import X.C188727au;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C25903AEp;
import X.C26045AKb;
import X.C26073ALd;
import X.C29S;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C40322Fs6;
import X.C55688LtM;
import X.C56412MCa;
import X.C57285Me1;
import X.C58655N0h;
import X.C58704N2e;
import X.C5S1;
import X.C63044Ooi;
import X.C65300Pk0;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73140SnA;
import X.C73157SnR;
import X.C73165SnZ;
import X.C73318Sq2;
import X.C73969T1h;
import X.C76800UCe;
import X.C78866UxK;
import X.C85990Xow;
import X.C8YZ;
import X.C90193gN;
import X.C90903hW;
import X.DialogC25754A8w;
import X.FMX;
import X.InterfaceC151715xP;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC26071ALb;
import X.InterfaceC61312at;
import X.InterfaceC64592gB;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.InterfaceC92693kP;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.SY4;
import X.T16;
import X.T5U;
import X.TBW;
import X.TMG;
import X.W1T;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS24S0100000_4;
import Y.ACListenerS31S0110000_4;
import Y.ARunnableS40S0100000_4;
import Y.AfS53S0100000_1;
import Y.AfS56S0100000_4;
import Y.IDCListenerS280S0100000_4;
import Y.IDDListenerS144S0100000_4;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.design.app.LiveControllableDialogFragment;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.LivePlayActivity;
import com.ss.android.ugc.aweme.live.notification.NotificationLiveViewModel;
import com.ss.android.ugc.aweme.live.notification.repository.NotificationNudgeApi;
import com.ss.android.ugc.aweme.live.notification.repository.NudgeInfo;
import com.ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.repository.UserViewModel;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS167S0200000_4;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.AqS186S0100000_4;
import kotlin.jvm.internal.AqS64S0400000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes5.dex */
public class NotificationLiveBottomDialog extends LiveControllableDialogFragment implements InterfaceC151715xP, KPL, AMD<C25903AEp> {
    public final User LJLIL;
    public final InterfaceC26071ALb LJLILLLLZI;
    public final boolean LJLJI;
    public final String LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final String LJLJL;
    public final AwemeRawAd LJLJLJ;
    public final boolean LJLJLLL;
    public final ALS LJLL;
    public final C25903AEp LJLLI;
    public final DialogC25754A8w LJLLILLLL;
    public final C73318Sq2 LJLLJ;
    public NudgeInfo LJLLL;
    public final lifecycleAwareLazy LJLLLL;
    public final lifecycleAwareLazy LJLLLLLL;
    public final IDDListenerS144S0100000_4 LJLZ;
    public final IDCListenerS280S0100000_4 LJZ;
    public final Map<Integer, View> LJZI;

    public NotificationLiveBottomDialog() {
        this(null, null, false, null, null, null, null, null, 1023);
    }

    public static void Al(DialogC25754A8w dialogC25754A8w) {
        if (new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/live/notification/ui/LoadingDialog", "show", dialogC25754A8w, new Object[0], "void", new C65300Pk0(false, "()V", "-5120455846152736899")).LIZ) {
            return;
        }
        dialogC25754A8w.show();
    }

    public void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJZI).clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJZI;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        ASQ.LJ(this, ASX.LIZ);
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final void Dl() {
        C5S1 c5s1 = new C5S1(getContext());
        c5s1.LIZJ(R.string.rf3);
        c5s1.LJ();
    }

    public final void Gl() {
        int i;
        String str;
        String str2;
        int i2;
        String str3;
        String str4;
        int i3;
        int i4;
        User user = this.LJLIL;
        int i5 = 1;
        if (user != null && user.getFollowStatus() == 0) {
            i = 1;
        } else {
            i = 0;
        }
        UserViewModel userViewModel = (UserViewModel) this.LJLLLLLL.getValue();
        ALX alx = new ALX();
        User user2 = this.LJLIL;
        String str5 = null;
        if (user2 != null) {
            str = user2.getUid();
        } else {
            str = null;
        }
        alx.LIZJ(str);
        User user3 = this.LJLIL;
        if (user3 != null) {
            str2 = user3.getSecUid();
        } else {
            str2 = null;
        }
        alx.LIZIZ(str2);
        C57285Me1 c57285Me1 = alx.LIZ;
        c57285Me1.LIZJ = i;
        String str6 = "other_places";
        c57285Me1.LJFF = "other_places";
        c57285Me1.LIZLLL = 0;
        User user4 = this.LJLIL;
        if (user4 != null) {
            i2 = user4.getFollowerStatus();
        } else {
            i2 = 0;
        }
        alx.LIZ.LJIIJ = i2;
        C57285Me1 param = alx.LIZ();
        userViewModel.getClass();
        o.LJIIIZ(param, "param");
        userViewModel.execute(UserService.LIZ().LJI(param.LIZJ, C55688LtM.LIZ(param.LJFF), param.LIZLLL, param.LJ, param.LIZ, param.LIZIZ, param.LJI, param.LJIILL), new AqS167S0200000_4(param, userViewModel, 30));
        User user5 = this.LJLIL;
        if (user5 != null && user5.getFollowerStatus() == 1) {
            str3 = "mutual";
        } else {
            str3 = "single";
        }
        C188577af c188577af = new C188577af();
        User user6 = this.LJLIL;
        if (user6 != null) {
            str4 = user6.getUid();
        } else {
            str4 = null;
        }
        c188577af.LJJLIIIJ = str4;
        c188577af.LIZLLL = this.LJLJJI;
        c188577af.LJJLIIIJL = "notification_bell";
        c188577af.LJJL = this.LJLJJL;
        if (!o.LJ(this.LJLJJLL, "")) {
            str6 = this.LJLJJLL;
        }
        c188577af.LJJLI = str6;
        c188577af.LJJLJ = str3;
        User user7 = this.LJLIL;
        if (user7 != null && user7.isSecret()) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c188577af.LJJZZIII = i3;
        C78866UxK.LJIIZILJ(c188577af, this.LJLIL);
        c188577af.LJIILIIL();
        User user8 = this.LJLIL;
        if (user8 != null) {
            str5 = user8.getUid();
        }
        User user9 = this.LJLIL;
        if (user9 != null) {
            i4 = user9.getFollowStatus();
        } else {
            i4 = 0;
        }
        User user10 = this.LJLIL;
        if (user10 == null || user10.getAccountType() != 3) {
            i5 = 0;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "others_homepage");
        c188727au.LJIIIZ("user_id", str5);
        c188727au.LIZLLL(i4, "follow_status");
        c188727au.LJIIIZ("enter_method", "button");
        c188727au.LIZLLL(i5, "is_enterprise");
        FMX.LJIIL("show_message_button", c188727au.LIZ);
    }

    public final void Il() {
        String uniqueId;
        String str;
        String str2;
        int i;
        String str3;
        boolean z;
        String str4;
        Integer valueOf;
        boolean z2;
        boolean z3;
        boolean z4;
        String uid;
        Resources resources;
        NudgeInfo nudgeInfo = this.LJLLL;
        if (nudgeInfo == null || !nudgeInfo.showNudge || (getContext() instanceof LivePlayActivity)) {
            return;
        }
        ((ImageView) _$_findCachedViewById(R.id.igg)).setVisibility(8);
        ((ImageView) _$_findCachedViewById(R.id.igo)).setVisibility(0);
        _$_findCachedViewById(R.id.igf).setVisibility(0);
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.igo), new ACListenerS21S0100000_1(this, 108));
        TextView textView = (TextView) _$_findCachedViewById(R.id.h8s);
        List list = null;
        if (C85990Xow.LJIIIZ()) {
            User user = this.LJLIL;
            if (user != null) {
                uniqueId = user.getNickname();
            }
            uniqueId = null;
        } else {
            User user2 = this.LJLIL;
            if (user2 != null) {
                uniqueId = user2.getUniqueId();
            }
            uniqueId = null;
        }
        textView.setText(uniqueId);
        User user3 = this.LJLIL;
        if (user3 != null) {
            str = user3.getCustomVerify();
        } else {
            str = null;
        }
        User user4 = this.LJLIL;
        if (user4 != null) {
            str2 = user4.getEnterpriseVerifyReason();
        } else {
            str2 = null;
        }
        boolean LIZJ = AJ9.LIZJ(str, str2);
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.h8t);
        if (LIZJ) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        Context context = getContext();
        if (context != null && (resources = context.getResources()) != null) {
            str3 = resources.getString(R.string.nir);
        } else {
            str3 = null;
        }
        if (str3 != null && (list = s.LJLJJL(str3, new String[]{"%s"}, 0, 6)) != null && list.size() == 2) {
            z = true;
        } else {
            z = false;
        }
        String str5 = "";
        if (z) {
            str3 = (String) ListProtector.get(list, 0);
            str4 = (String) ListProtector.get(list, 1);
        } else {
            if (list != null && list.size() == 1) {
                if (str3 == null || (valueOf = Integer.valueOf(s.LJJLIIIJL(str3, "%s", 0, false, 6))) == null || valueOf.intValue() != 0) {
                    str3 = (String) ListProtector.get(list, 0);
                } else {
                    str4 = (String) ListProtector.get(list, 0);
                    str3 = "";
                }
            } else if (str3 == null) {
                str3 = "";
            }
            str4 = "";
        }
        if (str3.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            _$_findCachedViewById(R.id.h8u).setVisibility(8);
        } else {
            _$_findCachedViewById(R.id.h8u).setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.h8u)).setText(s.LJZI(str3).toString());
        }
        if (str4.length() == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            _$_findCachedViewById(R.id.h8v).setVisibility(8);
        } else {
            _$_findCachedViewById(R.id.h8v).setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.h8v)).setText(s.LJZI(str4).toString());
        }
        if (C90193gN.LIZIZ(getContext())) {
            _$_findCachedViewById(R.id.h8p).setScaleX(-1.0f);
            _$_findCachedViewById(R.id.h8q).setScaleX(-1.0f);
        }
        if (this.LJLJLLL) {
            _$_findCachedViewById(R.id.h8q).postDelayed(new ARunnableS40S0100000_4(this, 62), 1000L);
        }
        NudgeInfo nudgeInfo2 = this.LJLLL;
        if (nudgeInfo2 != null && nudgeInfo2.canNudge) {
            z4 = true;
        } else {
            z4 = false;
        }
        Kl(z4);
        String str6 = this.LJLJJI;
        String str7 = this.LJLJJL;
        User user5 = this.LJLIL;
        if (user5 != null && (uid = user5.getUid()) != null) {
            str5 = uid;
        }
        ALQ.LIZIZ("show", str6, str7, str5);
        Keva repo = KevaImpl.getRepo("nudge_guide_show", 0);
        o.LJIIIIZZ(repo, "getRepo(NUDGE_GUIDE_SHOW…ants.MODE_SINGLE_PROCESS)");
        repo.storeBoolean("shown", true);
    }

    public final void Jl() {
        int i;
        boolean z;
        String str;
        CommerceUserInfo commerceUserInfo;
        Resources resources;
        ALY LIZIZ;
        String LIZLLL;
        ALS als = this.LJLL;
        boolean z2 = false;
        if (als != null && (LIZLLL = als.LIZLLL()) != null && LIZLLL.length() != 0) {
            _$_findCachedViewById(R.id.igt).setVisibility(0);
            ((TextView) _$_findCachedViewById(R.id.igt)).setText(als.LIZLLL());
        }
        ((TextView) _$_findCachedViewById(R.id.a0p)).setText(R.string.mjy);
        ((TextView) _$_findCachedViewById(R.id.iqw)).setText(R.string.mk0);
        ((TextView) _$_findCachedViewById(R.id.h9i)).setText(R.string.mjz);
        _$_findCachedViewById(R.id.igt).setVisibility(8);
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.ige), new ACListenerS24S0100000_4(this, 65));
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.igq), new ACListenerS24S0100000_4(this, 66));
        C16880lQ.LJIL((ConstraintLayout) _$_findCachedViewById(R.id.igp), new ACListenerS24S0100000_4(this, 67));
        C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.igg), new ACListenerS24S0100000_4(this, 68));
        User user = this.LJLIL;
        if (user != null) {
            i = user.getLivePushNotificationStatus();
        } else {
            i = 1;
        }
        vl(i);
        ALS als2 = this.LJLL;
        if (als2 != null && (LIZIZ = als2.LIZIZ()) != null) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from_merge", LIZIZ.LIZJ);
            c188727au.LJIIIZ("enter_method", LIZIZ.LIZLLL);
            c188727au.LJIIIZ("room_id", LIZIZ.LIZ);
            c188727au.LJIIIZ("anchor_id", LIZIZ.LIZIZ);
            c188727au.LJIIIIZZ(LIZIZ.LJ);
            FMX.LJIIL("livesdk_live_notification_show", c188727au.LIZ);
        }
        AwemeRawAd awemeRawAd = this.LJLJLJ;
        if (awemeRawAd != null && awemeRawAd.getNotificationConfig() == 1) {
            z = true;
        } else {
            z = false;
        }
        String str2 = null;
        if (z) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.igr);
            Context context = getContext();
            if (context != null && (resources = context.getResources()) != null) {
                str2 = resources.getString(R.string.gq8);
            }
            textView.setText(str2);
            _$_findCachedViewById(R.id.igd).setVisibility(0);
            ViewGroup.LayoutParams layoutParams = _$_findCachedViewById(R.id.ige).getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = 0;
            _$_findCachedViewById(R.id.ige).setLayoutParams(marginLayoutParams);
            ((AI8) _$_findCachedViewById(R.id.igl)).setOnClickListener(new AqS170S0100000_4(this, 1528));
            AI9 accessory = ((AI8) _$_findCachedViewById(R.id.igl)).getAccessory();
            o.LJII(accessory, "null cannot be cast to non-null type com.bytedance.tux.table.cell.TuxCellAccessory.Switch");
            AEY aey = (AEY) accessory;
            User user2 = this.LJLIL;
            if (user2 != null && (commerceUserInfo = user2.getCommerceUserInfo()) != null && commerceUserInfo.getNotificationConfig() == 1) {
                z2 = true;
            }
            aey.LJIILIIL(z2);
            C58655N0h LIZLLL2 = C58704N2e.LIZLLL("homepage_ad", "othershow", this.LJLJLJ);
            LIZLLL2.LIZJ("manage_page", "refer");
            LIZLLL2.LIZIZ(this.LJLJL, "enter_from");
            LIZLLL2.LJI();
        } else {
            _$_findCachedViewById(R.id.igd).setVisibility(8);
        }
        if (this.LJLLL != null) {
            Il();
            return;
        }
        C73318Sq2 c73318Sq2 = this.LJLLJ;
        User user3 = this.LJLIL;
        if (user3 == null || (str = user3.getUid()) == null) {
            str = "";
        }
        c73318Sq2.LIZ(NotificationNudgeApi.LIZ().getNudgeInfo(str).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS53S0100000_1(this, 93), new InterfaceC64592gB() { // from class: X.9FE
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }));
    }

    public final void wl() {
        C58655N0h LIZLLL = C58704N2e.LIZLLL("homepage_ad", "save", this.LJLJLJ);
        LIZLLL.LIZJ("manage_page", "refer");
        LIZLLL.LIZIZ(this.LJLJL, "enter_from");
        LIZLLL.LIZIZ(1, "success");
        LIZLLL.LJI();
        C5S1 c5s1 = new C5S1(getContext());
        c5s1.LIZJ(R.string.gq5);
        c5s1.LJ();
    }

    public final void xl() {
        C5S1 c5s1 = new C5S1(getContext());
        c5s1.LIZJ(R.string.ixm);
        c5s1.LJ();
    }

    @Override // com.bytedance.android.live.design.app.LiveControllableDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.LJLLJ.LIZLLL();
        _$_clearFindViewByIdCache();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!C40322Fs6.LIZJ(getContext()) || !C26073ALd.LIZ()) {
            dismiss();
        }
    }

    @Override // X.AMD
    public final /* bridge */ /* synthetic */ C25903AEp getViewModelFactory() {
        return this.LJLLI;
    }

    public final void Kl(boolean z) {
        int i;
        ((SY4) _$_findCachedViewById(R.id.h8n)).setEnabled(z);
        ((SY4) _$_findCachedViewById(R.id.h8n)).setSupportClickWhenDisable(true);
        TextView textView = (TextView) _$_findCachedViewById(R.id.h8n);
        String str = null;
        Context context = getContext();
        if (z) {
            if (context != null) {
                i = R.string.nij;
                str = context.getString(i);
            }
        } else if (context != null) {
            i = R.string.nis;
            str = context.getString(i);
        }
        textView.setText(str);
        C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.h8n), new ACListenerS31S0110000_4(this, z, 0));
    }

    public final void Ll(int i) {
        String str;
        ALY LIZIZ;
        DialogC25754A8w dialogC25754A8w = this.LJLLILLLL;
        if (dialogC25754A8w != null) {
            Al(dialogC25754A8w);
        }
        NotificationLiveViewModel notificationLiveViewModel = (NotificationLiveViewModel) this.LJLLLL.getValue();
        User user = this.LJLIL;
        if (user != null) {
            str = user.getSecUid();
        } else {
            str = null;
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        notificationLiveViewModel.getClass();
        LiveOuterService.LJJJLL().LJJIZ().LJJJZ().getClass();
        AYW.LJLILLLLZI.getClass();
        notificationLiveViewModel.disposeOnClear(AYW.LJLJI.LIZ(new ALT(str, i)).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS56S0100000_4(notificationLiveViewModel, 132), new InterfaceC64592gB() { // from class: X.9FA
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        }));
        ALS als = this.LJLL;
        if (als != null && (LIZIZ = als.LIZIZ()) != null) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str2 = "off";
                    }
                } else {
                    str2 = "personalized";
                }
            } else {
                str2 = "all";
            }
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from_merge", LIZIZ.LIZJ);
            c188727au.LJIIIZ("enter_method", LIZIZ.LIZLLL);
            c188727au.LJIIIZ("room_id", LIZIZ.LIZ);
            c188727au.LJIIIZ("anchor_id", LIZIZ.LIZIZ);
            c188727au.LJIIIZ("setting_type", str2);
            c188727au.LJIIIIZZ(LIZIZ.LJ);
            FMX.LJIIL("livesdk_live_notification_choose", c188727au.LIZ);
        }
    }

    public final void vl(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                ((C63044Ooi) _$_findCachedViewById(R.id.a0q)).setChecked(false);
                ((C63044Ooi) _$_findCachedViewById(R.id.iqx)).setChecked(false);
                ((C63044Ooi) _$_findCachedViewById(R.id.h9j)).setChecked(true);
                return;
            }
            ((C63044Ooi) _$_findCachedViewById(R.id.a0q)).setChecked(false);
            ((C63044Ooi) _$_findCachedViewById(R.id.iqx)).setChecked(true);
            ((C63044Ooi) _$_findCachedViewById(R.id.h9j)).setChecked(false);
            return;
        }
        ((C63044Ooi) _$_findCachedViewById(R.id.a0q)).setChecked(true);
        ((C63044Ooi) _$_findCachedViewById(R.id.iqx)).setChecked(false);
        ((C63044Ooi) _$_findCachedViewById(R.id.h9j)).setChecked(false);
    }

    public static SpannableString Hl(String str, String str2) {
        SpannableString spannableString = new SpannableString(i0.LJFF(str, str2));
        spannableString.setSpan(new T5U(62, false), 0, str.length(), 33);
        spannableString.setSpan(new T5U(61, false), str.length(), str2.length() + str.length(), 33);
        return spannableString;
    }

    public static /* synthetic */ void Nl(NotificationLiveBottomDialog notificationLiveBottomDialog, int i) {
        notificationLiveBottomDialog.Ml(i, 3000L);
    }

    public final void Ml(int i, long j) {
        if (getParentFragment() instanceof TuxSheet) {
            Fragment parentFragment = getParentFragment();
            o.LJII(parentFragment, "null cannot be cast to non-null type com.bytedance.tux.sheet.sheet.TuxSheet");
            Dialog dialog = ((DialogFragment) parentFragment).getDialog();
            if (dialog != null) {
                C26045AKb c26045AKb = new C26045AKb(dialog);
                c26045AKb.LJIIIIZZ(i);
                c26045AKb.LIZLLL(j);
                c26045AKb.LJIIJ();
                return;
            }
        }
        C26045AKb c26045AKb2 = new C26045AKb(this);
        c26045AKb2.LJIIIIZZ(i);
        c26045AKb2.LJIIJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f8  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.bp7, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    public /* synthetic */ NotificationLiveBottomDialog(User user, InterfaceC26071ALb interfaceC26071ALb, boolean z, String str, String str2, String str3, String str4, AwemeRawAd awemeRawAd, int i) {
        this((i & 1) != 0 ? null : user, (i & 2) != 0 ? null : interfaceC26071ALb, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "" : str3, (i & 64) == 0 ? str4 : "", (i & 128) != 0 ? null : awemeRawAd, false, null);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }

    public NotificationLiveBottomDialog(User user, InterfaceC26071ALb interfaceC26071ALb, boolean z, String enterFrom, String previousPage, String previousPagePosition, String str, AwemeRawAd awemeRawAd, boolean z2, ALS als) {
        DialogC25754A8w dialogC25754A8w;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(previousPage, "previousPage");
        o.LJIIIZ(previousPagePosition, "previousPagePosition");
        this.LJZI = new LinkedHashMap();
        this.LJLIL = user;
        this.LJLILLLLZI = interfaceC26071ALb;
        this.LJLJI = z;
        this.LJLJJI = enterFrom;
        this.LJLJJL = previousPage;
        this.LJLJJLL = previousPagePosition;
        this.LJLJL = str;
        this.LJLJLJ = awemeRawAd;
        this.LJLJLLL = z2;
        this.LJLL = als;
        this.LJLLI = new C25903AEp();
        Context context = getContext();
        if (context != null) {
            dialogC25754A8w = new DialogC25754A8w(context);
        } else {
            dialogC25754A8w = null;
        }
        this.LJLLILLLL = dialogC25754A8w;
        this.LJLLJ = new C73318Sq2();
        ALV alv = ALV.LJLIL;
        C65776Prg LIZ = C65352Pkq.LIZ(NotificationLiveViewModel.class);
        AqS154S0100000_4 aqS154S0100000_4 = new AqS154S0100000_4(LIZ, 381);
        this.LJLLLL = new lifecycleAwareLazy(this, aqS154S0100000_4, new AqS64S0400000_4(this, aqS154S0100000_4, LIZ, alv, 12));
        AqS186S0100000_4 aqS186S0100000_4 = new AqS186S0100000_4(this, 103);
        C65776Prg LIZ2 = C65352Pkq.LIZ(UserViewModel.class);
        AqS154S0100000_4 aqS154S0100000_42 = new AqS154S0100000_4(LIZ2, 382);
        this.LJLLLLLL = new lifecycleAwareLazy(this, aqS154S0100000_42, new AqS64S0400000_4(this, aqS154S0100000_42, LIZ2, aqS186S0100000_4, 13));
        this.LJLZ = new IDDListenerS144S0100000_4(this, 4);
        this.LJZ = new IDCListenerS280S0100000_4(this, 3);
    }
}
