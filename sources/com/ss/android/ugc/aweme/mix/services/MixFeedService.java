package com.ss.android.ugc.aweme.mix.services;

import X.ASL;
import X.AbstractC73638SvC;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C184077Kh;
import X.C188727au;
import X.C1B3;
import X.C1DG;
import X.C207798Dn;
import X.C214378bB;
import X.C214528bQ;
import X.C228098xJ;
import X.C228888ya;
import X.C229108yw;
import X.C229198z5;
import X.C229238z9;
import X.C229568zg;
import X.C26227ARb;
import X.C28289B8j;
import X.C33808DOq;
import X.C48203Ivv;
import X.C49398Ja6;
import X.C52292Kfg;
import X.C56300M7s;
import X.C56301M7t;
import X.C56302M7u;
import X.C56306M7y;
import X.C58096Mr6;
import X.C65352Pkq;
import X.C68322mC;
import X.C73969T1h;
import X.C78926UyI;
import X.C90193gN;
import X.FMX;
import X.FRW;
import X.GTJ;
import X.HG3;
import X.InterfaceC229218z7;
import X.InterfaceC48038ItG;
import X.InterfaceC56305M7x;
import X.InterfaceC65784Pro;
import X.KL2;
import X.M7D;
import X.M7T;
import X.MG8;
import X.Q7K;
import X.RBX;
import X.T16;
import X.UC0;
import X.X1D;
import X.Z9N;
import Y.AfS23S1100000_9;
import Y.AfS61S0100000_9;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.playservices.HiddenActivity$$ExternalSyntheticOutline0;
import androidx.fragment.app.FragmentManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.mix.addfeed.AddFeedToMixFragment;
import com.ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.ss.android.ugc.aweme.mix.bottom.MixBottomBarVM;
import com.ss.android.ugc.aweme.mix.mixdetail.viewmodel.MixVideosViewModel;
import com.ss.android.ugc.aweme.mix.model.MixListResponse;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl$showAddToMixInPublishPage$1;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.bar.InteractPlayListBottomBarAssem;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AqS0S2400000_3;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MixFeedService implements IMixFeedService {
    public boolean LIZ;

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIIIZ() {
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIJJLI() {
    }

    public static IMixFeedService LJJIJIIJIL() {
        Object LIZ = C58096Mr6.LIZ(IMixFeedService.class, false);
        if (LIZ != null) {
            return (IMixFeedService) LIZ;
        }
        if (C58096Mr6.M2 == null) {
            synchronized (IMixFeedService.class) {
                if (C58096Mr6.M2 == null) {
                    C58096Mr6.M2 = new MixFeedService();
                }
            }
        }
        return C58096Mr6.M2;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean LIZIZ() {
        if (Q7K.LIZIZ("can_exp_playlist", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIIL() {
        C228888ya.LIZLLL(1, "", "video_post_page", "split_longvideo");
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final GTJ LJIJ() {
        return new GTJ();
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean needCreateFirstMix() {
        Keva repo = Keva.getRepo("keva_mixlist_repo_name");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("keva_mixlist_num_key");
        LIZ.append(((RBX) HG3.LJIILL()).getCurUserId());
        if (repo.getInt(X1D.LIZIZ(LIZ), 0) > 0) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean needShowAddOrRemoveButton() {
        if (Q7K.LIZIZ("can_exp_playlist", 0) != 1) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LIZJ() {
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("play_list_");
        LIZ.append(curUser.getUid());
        Keva repo = KevaImpl.getRepo(X1D.LIZIZ(LIZ), 0);
        o.LJIIIIZZ(repo, "getRepo(PLAY_LIST + user…ants.MODE_SINGLE_PROCESS)");
        repo.storeBoolean("show_profile_empty_flag", false);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final Integer LJIJI() {
        return Integer.valueOf(R.layout.bth);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean getPushLiveState() {
        User curUser = HG3.LJIILL().getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("play_list_");
        LIZ.append(curUser.getUid());
        Keva repo = KevaImpl.getRepo(X1D.LIZIZ(LIZ), 0);
        o.LJIIIIZZ(repo, "getRepo(PLAY_LIST + user…ants.MODE_SINGLE_PROCESS)");
        return repo.getBoolean("show_profile_empty_flag", true);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean LJJIIJ() {
        return this.LIZ;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean LIZ(Aweme aweme) {
        PlayListInfo playListInfo;
        if (!LJIIZILJ(aweme) || C228098xJ.LIZ() != 4 || aweme == null || (playListInfo = aweme.playlist_info) == null || playListInfo.getIndex() == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final MixBottomBarVM LJ(InteractPlayListBottomBarAssem lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        C56301M7t c56301M7t = C56301M7t.LJLIL;
        return (MixBottomBarVM) new C214378bB(C65352Pkq.LIZ(MixBottomBarVM.class), c56301M7t, C214528bQ.LJLIL, C78926UyI.LJJII(lifecycleOwner, false), C184077Kh.LJLIL, C56300M7s.INSTANCE, null, null).getValue();
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJFF(boolean z) {
        User curUser = ((RBX) HG3.LJIILL()).getCurUser();
        o.LJIIIIZZ(curUser, "userService().curUser");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("play_list_");
        LIZ.append(curUser.getUid());
        Keva repo = KevaImpl.getRepo(X1D.LIZIZ(LIZ), 0);
        o.LJIIIIZZ(repo, "getRepo(PLAY_LIST + user…ants.MODE_SINGLE_PROCESS)");
        repo.storeBoolean("show_personal_account_tis_flag", z);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJI(boolean z) {
        this.LIZ = z;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIIIIZZ(InterfaceC56305M7x interfaceC56305M7x) {
        HG3.LJIIL();
        String curUserId = HG3.LJLJL.LJFF().getCurUserId();
        HG3.LJIIL();
        String secUid = HG3.LJLJL.LJFF().getCurSecUserId();
        MixFeedApi.LIZ.getClass();
        MixFeedApi LIZ = C229108yw.LIZ();
        o.LJIIIIZZ(secUid, "secUid");
        LIZ.getUserMixList(curUserId, 0L, secUid).LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS23S1100000_9(interfaceC56305M7x, curUserId, 2), new AfS61S0100000_9(interfaceC56305M7x, 82));
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean LJIIZILJ(Aweme aweme) {
        PlayListInfo playListInfo;
        if (aweme != null && (playListInfo = aweme.playlist_info) != null && playListInfo.getMixId() != null) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIJJ(Context context) {
        o.LJIIIZ(context, "context");
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LIZ(R.string.se1);
        UC0.LIZJ(c26227ARb, new AqS175S0100000_9(context, 139));
        c26227ARb.LJII = false;
        c26227ARb.LJI().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final C229568zg LJJIFFI(AssemViewModel vm) {
        o.LJIIIZ(vm, "vm");
        return new C229568zg((MixVideosViewModel) vm);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final boolean LJJIIZI(Aweme aweme) {
        PlayListInfo playListInfo;
        if (aweme != null && (playListInfo = aweme.playlist_info) != null && !TextUtils.isEmpty(playListInfo.getMixId())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJIJIIJI(Context context, Bundle bundle) {
        Intent buildIntent = SmartRouter.buildRoute(context, "//mix/feed_manage").buildIntent();
        buildIntent.putExtras(bundle);
        C16880lQ.LIZJ(context, buildIntent);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJII(CreatorToolsActivity context, String str, String str2) {
        o.LJIIIZ(context, "context");
        LJJIJIIJIL().LJIILJJIL(context, new Bundle(), 1, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJ(final String str, final String str2, C56306M7y c56306M7y) {
        AbstractC73638SvC<MixListResponse> userMixList;
        if (str == null || str2 == null) {
            return;
        }
        AtomicBoolean atomicBoolean = C229198z5.LIZIZ;
        if (!atomicBoolean.get() && o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ()) && C33808DOq.LIZ()) {
            userMixList = AbstractC73638SvC.LJIJ(1).LJIILL(new InterfaceC48038ItG() { // from class: X.8z8
                @Override // X.InterfaceC48038ItG
                public final Object apply(Object it) {
                    o.LJIIIZ(it, "it");
                    MixFeedApi.LIZ.getClass();
                    AbstractC73638SvC<MixListResponse> userMixList2 = C229108yw.LIZ().getUserMixList(str, 0L, str2);
                    C229198z5.LIZIZ.set(true);
                    return userMixList2;
                }
            });
        } else {
            MixFeedApi.LIZ.getClass();
            userMixList = C229108yw.LIZ().getUserMixList(str, 0L, str2);
            atomicBoolean.set(true);
        }
        userMixList.LJJIIJ(T16.LIZ()).LJIJJ(C73969T1h.LIZIZ()).LJJII(new AfS23S1100000_9(c56306M7y, str, 3), new AfS61S0100000_9(c56306M7y, 83));
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIILJJIL(Context context, Bundle bundle, int i, String enterFrom, String enterMethod) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        Intent buildIntent = SmartRouter.buildRoute(context, "//mix/create_page").buildIntent();
        bundle.putInt("open_fragment_type", i);
        bundle.putString("enter_from", enterFrom);
        bundle.putString("enter_method", enterMethod);
        buildIntent.putExtras(bundle);
        C16880lQ.LIZJ(context, buildIntent);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final MG8 LJJII(ViewGroup view, boolean z, boolean z2, String str, C49398Ja6 c49398Ja6) {
        View layout;
        o.LJIIIZ(view, "view");
        if (z2) {
            Z9N z9n = Z9N.LIZIZ;
            if (z9n.LJJJJI()) {
                layout = z9n.LJJJJ(R.layout.bth, view);
                o.LJIIIIZZ(layout, "layout");
                return new MG8(layout, z, z2, str, c49398Ja6);
            }
        }
        layout = C28289B8j.LIZ(view, R.layout.bth, view, false);
        o.LJIIIIZZ(layout, "layout");
        return new MG8(layout, z, z2, str, c49398Ja6);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.String] */
    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJIIZ(Activity activity, Aweme aweme, InterfaceC229218z7 interfaceC229218z7, String enterFrom, String enterMethod) {
        PlayListInfo playListInfo;
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        C68322mC c68322mC = new C68322mC();
        String str = "";
        c68322mC.element = "";
        if (aweme != null && (playListInfo = aweme.playlist_info) != null) {
            String mixName = playListInfo.getMixName();
            if (mixName != null) {
                str = mixName;
            }
            ?? mixId = playListInfo.getMixId();
            if (mixId != 0) {
                c68322mC.element = mixId;
            }
        }
        C26227ARb c26227ARb = new C26227ARb(activity);
        String LLLZ = C16880lQ.LLLZ(C207798Dn.LIZIZ(activity, R.string.q1h, "activity.resources.getSt…ve_from_playlist_confirm)"), Arrays.copyOf(new Object[]{str}, 1));
        o.LJIIIIZZ(LLLZ, "format(format, *args)");
        c26227ARb.LJFF(LLLZ);
        c26227ARb.LIZ(R.string.q1i);
        UC0.LIZJ(c26227ARb, new AqS0S2400000_3(activity, aweme, c68322mC, interfaceC229218z7, enterFrom, enterMethod, 0));
        c26227ARb.LJI().LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LIZLLL(Activity activity, Aweme aweme, String mixId, String mixName, String enterFrom, String enterMethod) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(mixId, "mixId");
        o.LJIIIZ(mixName, "mixName");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        Bundle bundle = new Bundle();
        bundle.putSerializable("key_add_mix_aweme", aweme);
        bundle.putString("key_choosed_mix_id", mixId);
        bundle.putString("key_choosed_mix_name", mixName);
        bundle.putString("enter_from", enterFrom);
        bundle.putString("enter_method", enterMethod);
        AddFeedToMixFragment addFeedToMixFragment = new AddFeedToMixFragment();
        addFeedToMixFragment.setArguments(bundle);
        ASL asl = new ASL();
        TuxSheet tuxSheet = asl.LIZ;
        tuxSheet.LJLLILLLL = addFeedToMixFragment;
        tuxSheet.LJZI = false;
        asl.LJI(1);
        TuxSheet tuxSheet2 = asl.LIZ;
        tuxSheet2.LJLLLLLL = (int) (KL2.LJIIIZ(activity) * 0.7d);
        tuxSheet2.LJLJI = true;
        tuxSheet2.LL = true;
        if (activity instanceof ActivityC45651qj) {
            C1DG.LJII((ActivityC45651qj) activity, "activity.supportFragmentManager", tuxSheet2, "Add_video_to_mix");
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIIJJI(String str, String str2, String str3, String str4, C229238z9 c229238z9, Integer num) {
        String str5 = str3;
        String str6 = str;
        String str7 = str2;
        String str8 = "";
        if (str6 == null) {
            str6 = "";
        }
        if (str7 == null) {
            str7 = "";
        }
        if (str5 == null) {
            str5 = "";
        }
        if (str4 != null) {
            str8 = str4;
        }
        C228888ya.LJIIJJI(str6, str7, str5, str8, null, null, null, c229238z9, num, 112);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIILL(Activity activity, IAVMixFeedServiceImpl$showAddToMixInPublishPage$1 iAVMixFeedServiceImpl$showAddToMixInPublishPage$1, String enterFrom, String enterMethod, String mixId, String mixName) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(mixId, "mixId");
        o.LJIIIZ(mixName, "mixName");
        Bundle m = HiddenActivity$$ExternalSyntheticOutline0.m("key_full_scrren", true, "key_choosed_mix_id", mixId);
        m.putString("key_choosed_mix_name", mixName);
        m.putString("enter_from", enterFrom);
        m.putString("enter_method", enterMethod);
        AddFeedToMixFragment addFeedToMixFragment = new AddFeedToMixFragment();
        addFeedToMixFragment.setArguments(m);
        addFeedToMixFragment.LJLJJLL = iAVMixFeedServiceImpl$showAddToMixInPublishPage$1;
        if (AVExternalServiceImpl.LIZ().publishService().shouldShowAddToMixWithinSheet() && (activity instanceof ActivityC45651qj)) {
            ASL asl = new ASL();
            TuxSheet tuxSheet = asl.LIZ;
            tuxSheet.LJLLILLLL = addFeedToMixFragment;
            tuxSheet.LJZI = false;
            asl.LJI(1);
            TuxSheet tuxSheet2 = asl.LIZ;
            tuxSheet2.LJLLLLLL = (int) (KL2.LJIIIZ(activity) * 0.9d);
            tuxSheet2.LJLJI = true;
            tuxSheet2.LL = true;
            C1DG.LJII((ActivityC45651qj) activity, "activity.supportFragmentManager", tuxSheet2, "Add_video_to_mix");
            return;
        }
        if (!(activity instanceof ActivityC45651qj)) {
            return;
        }
        FragmentManager supportFragmentManager = ((ActivityC45651qj) activity).getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        try {
            C1B3 c1b3 = new C1B3(supportFragmentManager);
            c1b3.LJIIJJI(R.anim.fv, R.anim.g2, 0, 0);
            c1b3.LJIIIIZZ(R.id.j7n, 1, addFeedToMixFragment, "Add_video_to_mix");
            c1b3.LJIILLIIL();
        } catch (IllegalStateException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJIJ(Context context, Bundle bundle, String name, String mixID, Long l, String enterFrom) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(mixID, "mixID");
        o.LJIIIZ(enterFrom, "enterFrom");
        Intent buildIntent = SmartRouter.buildRoute(context, "//mix/chang_play_list_name").buildIntent();
        bundle.putString("user_last_name", name);
        bundle.putString("mix_id", mixID);
        bundle.putString("enter_from", enterFrom);
        if (l != null) {
            l.longValue();
            bundle.putLong("moderated_rename_timestamp", l.longValue());
        }
        buildIntent.putExtras(bundle);
        C16880lQ.LIZJ(context, buildIntent);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIIJ(int i, int i2, String str, String str2, String str3, String str4, String str5) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("previous_page", str2);
        c188727au.LJIIIZ("playlist_id", str3);
        c188727au.LJIIIZ("group_id", str4);
        c188727au.LJIIIZ("author_id", str5);
        c188727au.LIZLLL(i, "playlist_num");
        c188727au.LIZLLL(i2, "panel_click");
        FMX.LJIIL("start_playlist_autoplay", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIILLIIL(String str, String str2, String str3, String str4, String str5, C229238z9 c229238z9, Integer num) {
        String str6 = str4;
        String str7 = str;
        String str8 = str2;
        String str9 = "";
        if (str7 == null) {
            str7 = "";
        }
        if (str8 == null) {
            str8 = "";
        }
        if (str6 == null) {
            str6 = "";
        }
        if (str3 != null) {
            str9 = str3;
        }
        C228888ya.LJII(str7, str8, str6, str9, 0, str5, null, null, null, c229238z9, num, 448);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final TuxSheet LJJIII(Context context, String str, String str2, Aweme aweme, String str3, C229238z9 c229238z9, InterfaceC65784Pro interfaceC65784Pro) {
        return C56302M7u.LIZ(context, str, str2, aweme, "", "", str3, c229238z9, interfaceC65784Pro);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJIL(String str, String str2, String str3, String str4, float f, String str5, C229238z9 c229238z9, Integer num) {
        String str6 = str3;
        String str7 = str;
        String str8 = str2;
        String str9 = "";
        if (str7 == null) {
            str7 = "";
        }
        if (str8 == null) {
            str8 = "";
        }
        if (str6 == null) {
            str6 = "";
        }
        if (str4 != null) {
            str9 = str4;
        }
        C228888ya.LJI(str7, str8, str6, str9, Float.valueOf(f), str5, c229238z9, num);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJI(int i, String str, String str2, String str3, String str4, long j, String str5, String str6) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", str);
        c188727au.LJIIIZ("previous_page", str2);
        c188727au.LJIIIZ("playlist_id", str3);
        c188727au.LJIIIZ("group_id", str4);
        c188727au.LJIIIZ("author_id", str5);
        c188727au.LJ(j, "autoplay_duration");
        c188727au.LIZLLL(i, "playlist_num");
        c188727au.LJIIIZ("end_type", str6);
        FMX.LJIIL("end_playlist_autoplay", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    public final void LJJIIJZLJL(Context context, Aweme aweme, C229238z9 c229238z9, Float f, String str, String str2, String str3, boolean z, boolean z2) {
        String str4;
        String str5;
        String str6;
        Video video;
        String str7;
        String str8;
        String str9;
        Video video2;
        String str10;
        String str11 = "click_banner_playnext";
        Integer num = null;
        if (e1.LIZ(31744, "reverse_search_playlist_flow", true, false)) {
            if (c229238z9 != null && !TextUtils.isEmpty(c229238z9.getSearchId())) {
                IMixFeedService LJJIJIIJIL = LJJIJIIJIL();
                o.LJIIIIZZ(LJJIJIIJIL, "get().getService(IMixFeedService::class.java)");
                if (str3 == null) {
                    str10 = "";
                } else {
                    str10 = str3;
                }
                LJJIJIIJIL.LJJIII(context, str10, str, aweme, "from_mix_detail_item", c229238z9, null);
                C228888ya.LJFF(aweme, str, str3, c229238z9);
                return;
            }
            if (z) {
                str7 = "click_banner_playnext";
            } else {
                str7 = "click_banner";
            }
            LJJIJL(context, aweme, c229238z9, f, str2, str7, str, str3, z, z2);
            if (aweme != null) {
                str8 = aweme.getGroupId();
                str9 = aweme.getAuthorUid();
            } else {
                str8 = null;
                str9 = null;
            }
            if (!z) {
                str11 = "click_banner";
            }
            if (aweme != null && (video2 = aweme.getVideo()) != null) {
                num = Integer.valueOf(video2.getDuration());
            }
            LJIILLIIL(str3, str, str8, str9, str11, c229238z9, num);
            return;
        }
        if (z) {
            str4 = "click_banner_playnext";
        } else {
            str4 = "click_banner";
        }
        LJJIJL(context, aweme, c229238z9, f, str2, str4, str, str3, z, z2);
        if (aweme != null) {
            str5 = aweme.getGroupId();
            str6 = aweme.getAuthorUid();
        } else {
            str5 = null;
            str6 = null;
        }
        if (!z) {
            str11 = "click_banner";
        }
        if (aweme != null && (video = aweme.getVideo()) != null) {
            num = Integer.valueOf(video.getDuration());
        }
        LJIILLIIL(str3, str, str5, str6, str11, c229238z9, num);
    }

    public static void LJJIJL(Context context, Aweme aweme, C229238z9 c229238z9, Float f, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        String str5;
        Integer num;
        int i;
        int i2;
        String str6;
        Integer num2;
        if (C48203Ivv.LJ(context)) {
            M7D LJJIJIL = LJJIJIL(str, aweme, "from_mix_detail_item", str2, str3, "", "", true, c229238z9, f, str4, false);
            LJJIJIL.setPlayNext(z);
            String str7 = null;
            if (C52292Kfg.LIZ() == 0) {
                SmartRouter.buildRoute(context, "aweme://mix/detail").buildIntent();
                if (C90193gN.LIZIZ(context)) {
                    i = R.anim.g2;
                } else {
                    i = R.anim.g0;
                }
                if (C90193gN.LIZIZ(context)) {
                    i2 = R.anim.ft;
                } else {
                    i2 = R.anim.fv;
                }
                FRW.LIZLLL("playlist_first_render_cost_time");
                FRW.LIZLLL("playlist_first_open_dialog_cost_time");
                SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://mix/detail");
                buildRoute.withParam("video_from", LJJIJIL.getMVideoFrom());
                buildRoute.withParam("enter_from", LJJIJIL.getMEventType());
                buildRoute.withParam("mix_video_list_params", LJJIJIL);
                C229238z9 searchParam = LJJIJIL.getSearchParam();
                if (searchParam != null) {
                    str6 = searchParam.getSearchId();
                } else {
                    str6 = null;
                }
                buildRoute.withParam("playlist_search_id", str6);
                C229238z9 searchParam2 = LJJIJIL.getSearchParam();
                if (searchParam2 != null) {
                    num2 = searchParam2.isFromVideo();
                } else {
                    num2 = null;
                }
                buildRoute.withParam("is_from_video", num2);
                C229238z9 searchParam3 = LJJIJIL.getSearchParam();
                if (searchParam3 != null) {
                    str7 = searchParam3.getSearchType();
                }
                buildRoute.withParam("key_search_type", str7);
                buildRoute.withParam("key_playlist_previous_page", LJJIJIL.getPreviousPage());
                buildRoute.withParam("key_playlist_from_group_id", LJJIJIL.getEnterGroupId());
                buildRoute.withParam("key_play_next", z);
                buildRoute.withParam("key_need_preload", z2);
                if (c229238z9 != null) {
                    buildRoute.withParam("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 75);
                }
                buildRoute.withAnimation(i2, i);
                buildRoute.open();
                return;
            }
            FRW.LIZLLL("playlist_first_render_cost_time");
            FRW.LIZLLL("playlist_first_open_dialog_cost_time");
            SmartRoute buildRoute2 = SmartRouter.buildRoute(context, "aweme://mix/detail");
            buildRoute2.withParam("video_from", LJJIJIL.getMVideoFrom());
            buildRoute2.withParam("enter_from", LJJIJIL.getMEventType());
            buildRoute2.withParam("mix_video_list_params", LJJIJIL);
            C229238z9 searchParam4 = LJJIJIL.getSearchParam();
            if (searchParam4 != null) {
                str5 = searchParam4.getSearchId();
            } else {
                str5 = null;
            }
            buildRoute2.withParam("playlist_search_id", str5);
            C229238z9 searchParam5 = LJJIJIL.getSearchParam();
            if (searchParam5 != null) {
                num = searchParam5.isFromVideo();
            } else {
                num = null;
            }
            buildRoute2.withParam("is_from_video", num);
            C229238z9 searchParam6 = LJJIJIL.getSearchParam();
            if (searchParam6 != null) {
                str7 = searchParam6.getSearchType();
            }
            buildRoute2.withParam("key_search_type", str7);
            buildRoute2.withParam("key_playlist_previous_page", LJJIJIL.getPreviousPage());
            buildRoute2.withParam("key_playlist_from_group_id", LJJIJIL.getEnterGroupId());
            buildRoute2.withParam("key_play_next", z);
            buildRoute2.withParam("key_need_preload", z2);
            if (c229238z9 != null) {
                buildRoute2.withParam("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 75);
            }
            buildRoute2.open();
        }
    }

    public static M7D LJJIJIL(String str, Aweme aweme, String str2, String str3, String str4, String str5, String str6, boolean z, C229238z9 c229238z9, Float f, String str7, boolean z2) {
        M7D m7d = new M7D();
        m7d.setMVideoFrom(str2);
        m7d.setEnterMethod(str3);
        m7d.setMNeedShowDialog(z);
        m7d.setEnterGroupId(str);
        m7d.setVideoPlayedPercentage(f);
        m7d.setFromShare(z2);
        if (aweme != null) {
            m7d.setMSecUid(aweme.getSecAuthorUid());
            m7d.setMUsrId(aweme.getAuthorUid());
            if (C52292Kfg.LIZ() == 0) {
                m7d.setAweme(aweme);
            } else {
                M7T.LIZ = aweme;
            }
            m7d.setMAid(aweme.getAid());
        }
        if (!TextUtils.isEmpty(str5)) {
            m7d.setMUsrId(str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            m7d.setMSecUid(str6);
        }
        m7d.setSearchParam(c229238z9);
        m7d.setMEventType("playlist");
        m7d.setMixId(str4);
        m7d.setPreviousPage(str7);
        m7d.setPageStartTime(SystemClock.elapsedRealtime());
        return m7d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b1, code lost:
    
        if (r22 != null) goto L18;
     */
    @Override // com.ss.android.ugc.aweme.mix.services.IMixFeedService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(android.content.Context r13, java.lang.String r14, com.ss.android.ugc.aweme.feed.model.Aweme r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, X.C229238z9 r22, java.lang.String r23, java.lang.Boolean r24) {
        /*
            r12 = this;
            java.lang.String r0 = "enterMethod"
            r3 = r17
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.lang.String r0 = "mixID"
            r4 = r18
            kotlin.jvm.internal.o.LJIIIZ(r4, r0)
            r9 = 0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1 = r24
            boolean r11 = kotlin.jvm.internal.o.LJ(r1, r0)
            r5 = r19
            r2 = r16
            r0 = r14
            r10 = r23
            r8 = r22
            r1 = r15
            r7 = r21
            r6 = r20
            X.M7D r3 = LJJIJIL(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto Lb0
            java.lang.String r0 = "playlist_first_render_cost_time"
            X.FRW.LIZLLL(r0)
            java.lang.String r0 = "playlist_first_open_dialog_cost_time"
            X.FRW.LIZLLL(r0)
            java.lang.String r0 = "aweme://mix/detail"
            com.bytedance.router.SmartRoute r2 = com.bytedance.router.SmartRouter.buildRoute(r13, r0)
            java.lang.String r1 = "video_from"
            java.lang.String r0 = r3.getMVideoFrom()
            r2.withParam(r1, r0)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = r3.getMEventType()
            r2.withParam(r1, r0)
            java.lang.String r0 = "mix_video_list_params"
            r2.withParam(r0, r3)
            X.8z9 r0 = r3.getSearchParam()
            if (r0 == 0) goto Lb6
            java.lang.String r1 = r0.getSearchId()
        L5c:
            java.lang.String r0 = "playlist_search_id"
            r2.withParam(r0, r1)
            X.8z9 r0 = r3.getSearchParam()
            if (r0 == 0) goto Lb4
            java.lang.Integer r1 = r0.isFromVideo()
        L6b:
            java.lang.String r0 = "is_from_video"
            r2.withParam(r0, r1)
            X.8z9 r0 = r3.getSearchParam()
            if (r0 == 0) goto L7a
            java.lang.String r9 = r0.getSearchType()
        L7a:
            java.lang.String r0 = "key_search_type"
            r2.withParam(r0, r9)
            java.lang.String r1 = "key_playlist_previous_page"
            java.lang.String r0 = r3.getPreviousPage()
            r2.withParam(r1, r0)
            java.lang.String r1 = "key_playlist_from_group_id"
            java.lang.String r0 = r3.getEnterGroupId()
            r2.withParam(r1, r0)
            if (r8 == 0) goto Lad
            android.os.Bundle r0 = r8.getBundle()
            if (r0 == 0) goto Lb1
            android.os.Bundle r0 = r8.getBundle()
            r2.withBundleAnimation(r0)
            java.lang.String r1 = "activity_has_activity_options"
            r0 = 1
            r2.withParam(r1, r0)
        La6:
            java.lang.String r1 = "com.ss.android.ugc.aweme.intent.extra.FEED_TYPE"
            r0 = 75
            r2.withParam(r1, r0)
        Lad:
            r2.open()
        Lb0:
            return
        Lb1:
            if (r8 == 0) goto Lad
            goto La6
        Lb4:
            r1 = r9
            goto L6b
        Lb6:
            r1 = r9
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.mix.services.MixFeedService.LJIILIIL(android.content.Context, java.lang.String, com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, X.8z9, java.lang.String, java.lang.Boolean):void");
    }
}
