package Y;

import X.AV1;
import X.C16880lQ;
import X.C188727au;
import X.C19N;
import X.C1B8;
import X.C25848ACm;
import X.C26335AVf;
import X.C40322Fs6;
import X.C53215KuZ;
import X.C68322mC;
import X.C6DL;
import X.C6ZT;
import X.C73893SzJ;
import X.C73969T1h;
import X.C78598Ut0;
import X.C79004UzY;
import X.C80698Vlm;
import X.C84763XOl;
import X.C85531XhX;
import X.C85533XhZ;
import X.C85926Xnu;
import X.C85938Xo6;
import X.C85940Xo8;
import X.C85946XoE;
import X.C85948XoG;
import X.C85962XoU;
import X.C86661Xzl;
import X.EF7;
import X.EnumC86777Y3x;
import X.F9J;
import X.FMX;
import X.InterfaceC65784Pro;
import X.InterfaceC82683Wch;
import X.InterfaceC88471Ynr;
import X.J9P;
import X.RBY;
import X.V16;
import X.X1D;
import X.XW2;
import X.XZH;
import X.Y4A;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.BaseI18nLoginFragment;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.im.sdk.notification.NotificationManagerServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.search.ui.cell.IMSearchCommonCell;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.widgets.awemepager.AwemePagerVM;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragment;
import com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerFragmentSecondVersion;
import com.ss.android.ugc.aweme.tools.music.music.vertical.VerticalMusicView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS39S0001000_15;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class ACListenerS40S0300000_15 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            case 8:
                onClick$8(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(ACListenerS40S0300000_15 aCListenerS40S0300000_15, View view) {
        if (C6ZT.LIZ((View) aCListenerS40S0300000_15.l0) || !((BaseI18nLoginFragment) aCListenerS40S0300000_15.l1).Ll()) {
            return;
        }
        if (C84763XOl.LJIIIIZZ() == null) {
            C84763XOl.LJIIJ(((BaseI18nLoginFragment) aCListenerS40S0300000_15.l1).mo49getActivity());
        }
        ((View.OnClickListener) aCListenerS40S0300000_15.l2).onClick(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$1(ACListenerS40S0300000_15 aCListenerS40S0300000_15, View view) {
        String str;
        String curUserId;
        String str2;
        Object[] objArr;
        if (!((PushSettingManagerFragment) aCListenerS40S0300000_15.l2).isViewValid() || ((PushSettingManagerFragment) aCListenerS40S0300000_15.l2).getContext() == null) {
            return;
        }
        String str3 = (String) ((C25848ACm) ((C85938Xo6) aCListenerS40S0300000_15.l1).LJLIL).LLFF;
        String str4 = "off";
        if (TextUtils.equals(str3, "live_inner_push")) {
            if (((C25848ACm) ((C85938Xo6) aCListenerS40S0300000_15.l1).LJLIL).LJZI) {
                objArr = "off";
            } else {
                objArr = "on";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("to_status", objArr);
            FMX.LJIIL("live_inner_push_setting", hashMap);
            NotificationManagerServiceImpl.LJIIIZ().LJ(Integer.valueOf(!((C25848ACm) ((C85938Xo6) aCListenerS40S0300000_15.l1).LJLIL).LJZI ? 1 : 0));
        } else if (TextUtils.equals(str3, "im_inner_push")) {
            if (((C25848ACm) ((C85938Xo6) aCListenerS40S0300000_15.l1).LJLIL).LJZI) {
                str2 = "off";
            } else {
                str2 = "on";
            }
            V16.LJJJJJ(str2);
            NotificationManagerServiceImpl.LJIIIZ().LJFF(Integer.valueOf(!((C25848ACm) ((C85938Xo6) aCListenerS40S0300000_15.l1).LJLIL).LJZI ? 1 : 0));
        } else if (TextUtils.equals(str3, "im_push")) {
            if (((C25848ACm) ((C85938Xo6) aCListenerS40S0300000_15.l1).LJLIL).LJZI) {
                str = "off";
            } else {
                str = "on";
            }
            V16.LJJJJJ(str);
            NotificationManagerServiceImpl.LJIIIZ().LIZJ(Integer.valueOf(!((C25848ACm) ((C85938Xo6) aCListenerS40S0300000_15.l1).LJLIL).LJZI ? 1 : 0));
            PushSettingManagerFragment pushSettingManagerFragment = (PushSettingManagerFragment) aCListenerS40S0300000_15.l2;
            Boolean valueOf = Boolean.valueOf(((C25848ACm) ((C85938Xo6) aCListenerS40S0300000_15.l1).LJLIL).LJZI);
            pushSettingManagerFragment.getClass();
            RBY LJFF = AccountService.LJIJ().LJFF();
            if (AccountService.LJIJ().LJFF() == null) {
                curUserId = "-1";
            } else {
                curUserId = LJFF.getCurUserId();
            }
            long parseLong = CastLongProtector.parseLong(curUserId);
            Context LIZIZ = EF7.LIZIZ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("imbase_");
            LIZ.append(parseLong);
            SharedPreferences LIZIZ2 = F9J.LIZIZ(LIZIZ, 0, X1D.LIZIZ(LIZ));
            if (valueOf.booleanValue()) {
                LIZIZ2.edit().putBoolean("key_mt_inner_push_switch_on", false).commit();
            } else {
                LIZIZ2.edit().putBoolean("key_mt_inner_push_switch_on", true).commit();
            }
        } else {
            Context context = ((PushSettingManagerFragment) aCListenerS40S0300000_15.l2).getContext();
            if (!C40322Fs6.LIZJ(context)) {
                C85962XoU.LJII(context, true, null, true);
                return;
            }
        }
        if (((C73893SzJ) aCListenerS40S0300000_15.l0) == null) {
            C73893SzJ c73893SzJ = new C73893SzJ();
            aCListenerS40S0300000_15.l0 = c73893SzJ;
            c73893SzJ.LJIIJJI(400L, TimeUnit.MILLISECONDS).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS36S0101000_5(4, aCListenerS40S0300000_15, 42));
        }
        C85938Xo6 c85938Xo6 = (C85938Xo6) aCListenerS40S0300000_15.l1;
        c85938Xo6.LJIILIIL(true ^ ((C25848ACm) c85938Xo6.LJLIL).LJZI);
        C85940Xo8.LIZIZ.LIZ(((C25848ACm) ((C85938Xo6) aCListenerS40S0300000_15.l1).LJLIL).LJZI ? 1 : 0, str3);
        ((C73893SzJ) aCListenerS40S0300000_15.l0).onNext((C85938Xo6) aCListenerS40S0300000_15.l1);
        PushSettingManagerFragment pushSettingManagerFragment2 = (PushSettingManagerFragment) aCListenerS40S0300000_15.l2;
        boolean z = ((C25848ACm) ((C85938Xo6) aCListenerS40S0300000_15.l1).LJLIL).LJZI;
        pushSettingManagerFragment2.getClass();
        if (z) {
            str4 = "on";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("label", str3);
        c188727au.LJIIIZ("to_status", str4);
        FMX.LJIIL("notification_switch", c188727au.LIZ);
    }

    public static final void onClick$2(ACListenerS40S0300000_15 aCListenerS40S0300000_15, View view) {
        if (!C1B8.LIZJ()) {
            J9P.LIZIZ(((XZH) aCListenerS40S0300000_15.l0).LIZLLL, "video_edit_page", "edit_xpage_recommend_favourite", null, null);
            return;
        }
        C80698Vlm c80698Vlm = (C80698Vlm) aCListenerS40S0300000_15.l1;
        c80698Vlm.LJIILLIIL(c80698Vlm.LJIIJJI(1));
        ((VerticalMusicView) aCListenerS40S0300000_15.l2).LJIIJ(XW2.TAB_COLLECT);
    }

    public static final void onClick$3(ACListenerS40S0300000_15 aCListenerS40S0300000_15, View view) {
        if (C6ZT.LIZ(view)) {
            return;
        }
        InterfaceC88471Ynr interfaceC88471Ynr = (InterfaceC88471Ynr) aCListenerS40S0300000_15.l0;
        View message_btn = ((View) aCListenerS40S0300000_15.l1).findViewById(R.id.ghi);
        o.LJIIIIZZ(message_btn, "message_btn");
        interfaceC88471Ynr.invoke(message_btn, ((IMSearchCommonCell) aCListenerS40S0300000_15.l2).LJLIL.getValue());
    }

    public static final void onClick$4(ACListenerS40S0300000_15 aCListenerS40S0300000_15, View view) {
        Aweme aweme;
        VideoCLACaptionViewModel videoCLACaptionViewModel = (VideoCLACaptionViewModel) aCListenerS40S0300000_15.l0;
        videoCLACaptionViewModel.LJLLLLLL = true;
        videoCLACaptionViewModel.LJLLLL = false;
        ((InterfaceC65784Pro) aCListenerS40S0300000_15.l1).invoke();
        C86661Xzl nv0 = ((VideoCLACaptionViewModel) aCListenerS40S0300000_15.l0).nv0();
        VideoCLACaptionViewModel videoCLACaptionViewModel2 = (VideoCLACaptionViewModel) aCListenerS40S0300000_15.l0;
        boolean z = videoCLACaptionViewModel2.LJLLILLLL;
        EnumC86777Y3x enumC86777Y3x = EnumC86777Y3x.CLICK_SUBTITLE;
        Context context = ((C6DL) aCListenerS40S0300000_15.l2).LIZ;
        VideoItemParams gv0 = videoCLACaptionViewModel2.gv0();
        if (gv0 != null) {
            aweme = gv0.getAweme();
        } else {
            aweme = null;
        }
        int LJJJIL = C79004UzY.LJJJIL(context, aweme);
        VideoCLACaptionViewModel videoCLACaptionViewModel3 = (VideoCLACaptionViewModel) aCListenerS40S0300000_15.l0;
        nv0.LJIILLIIL(z, enumC86777Y3x, LJJJIL, videoCLACaptionViewModel3.LLI, videoCLACaptionViewModel3.LLIFFJFJJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$5(ACListenerS40S0300000_15 aCListenerS40S0300000_15, View view) {
        String str;
        String curUserId;
        String str2;
        String str3;
        Object[] objArr;
        PushSettingManagerFragmentSecondVersion pushSettingManagerFragmentSecondVersion = (PushSettingManagerFragmentSecondVersion) aCListenerS40S0300000_15.l0;
        C85938Xo6 c85938Xo6 = (C85938Xo6) aCListenerS40S0300000_15.l1;
        C85946XoE c85946XoE = (C85946XoE) aCListenerS40S0300000_15.l2;
        if (!pushSettingManagerFragmentSecondVersion.isViewValid() || pushSettingManagerFragmentSecondVersion.getContext() == null) {
            return;
        }
        C85946XoE c85946XoE2 = (C85946XoE) ((C25848ACm) c85938Xo6.LJLIL).LLFF;
        pushSettingManagerFragmentSecondVersion.LLJ = c85946XoE2.LIZ;
        if (!PushSettingManagerFragmentSecondVersion.wl(pushSettingManagerFragmentSecondVersion.getContext())) {
            return;
        }
        String str4 = "off";
        if (TextUtils.equals(pushSettingManagerFragmentSecondVersion.LLJ, "live_inner_push")) {
            if (((C25848ACm) c85938Xo6.LJLIL).LJZI) {
                objArr = "off";
            } else {
                objArr = "on";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("to_status", objArr);
            FMX.LJIIL("live_inner_push_setting", hashMap);
            NotificationManagerServiceImpl.LJIIIZ().LJ(Integer.valueOf(!((C25848ACm) c85938Xo6.LJLIL).LJZI ? 1 : 0));
        } else if (TextUtils.equals(pushSettingManagerFragmentSecondVersion.LLJ, "im_inner_push")) {
            if (((C25848ACm) c85938Xo6.LJLIL).LJZI) {
                str3 = "off";
            } else {
                str3 = "on";
            }
            V16.LJJJJJ(str3);
            NotificationManagerServiceImpl.LJIIIZ().LJFF(Integer.valueOf(!((C25848ACm) c85938Xo6.LJLIL).LJZI ? 1 : 0));
        } else if (TextUtils.equals(pushSettingManagerFragmentSecondVersion.LLJ, "im_push_preview_v2")) {
            if (((C25848ACm) c85938Xo6.LJLIL).LJZI) {
                str2 = "off";
            } else {
                str2 = "on";
            }
            V16.LJJJJJ(str2);
            NotificationManagerServiceImpl.LJIIIZ().LJIIIIZZ(Integer.valueOf(!((C25848ACm) c85938Xo6.LJLIL).LJZI ? 1 : 0));
        } else if (TextUtils.equals(pushSettingManagerFragmentSecondVersion.LLJ, "friends_only_push")) {
            pushSettingManagerFragmentSecondVersion.Dl(!((C25848ACm) c85938Xo6.LJLIL).LJZI);
        } else if (TextUtils.equals(pushSettingManagerFragmentSecondVersion.LLJ, "im_push")) {
            if (((C25848ACm) c85938Xo6.LJLIL).LJZI) {
                str = "off";
            } else {
                str = "on";
            }
            V16.LJJJJJ(str);
            NotificationManagerServiceImpl.LJIIIZ().LIZJ(Integer.valueOf(!((C25848ACm) c85938Xo6.LJLIL).LJZI ? 1 : 0));
            if (!C53215KuZ.LIZ()) {
                Boolean valueOf = Boolean.valueOf(((C25848ACm) c85938Xo6.LJLIL).LJZI);
                RBY LJFF = AccountService.LJIJ().LJFF();
                if (AccountService.LJIJ().LJFF() == null) {
                    curUserId = "-1";
                } else {
                    curUserId = LJFF.getCurUserId();
                }
                long parseLong = CastLongProtector.parseLong(curUserId);
                Context LIZIZ = EF7.LIZIZ();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("imbase_");
                LIZ.append(parseLong);
                SharedPreferences LIZIZ2 = F9J.LIZIZ(LIZIZ, 0, X1D.LIZIZ(LIZ));
                if (valueOf.booleanValue()) {
                    LIZIZ2.edit().putBoolean("key_mt_inner_push_switch_on", false).commit();
                } else {
                    LIZIZ2.edit().putBoolean("key_mt_inner_push_switch_on", true).commit();
                }
            }
        } else if (!PushSettingManagerFragmentSecondVersion.wl(pushSettingManagerFragmentSecondVersion.getContext())) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26 && !pushSettingManagerFragmentSecondVersion.vl(pushSettingManagerFragmentSecondVersion.LLJ)) {
            if (!c85946XoE2.LIZIZ && !c85946XoE2.LIZJ) {
                if (pushSettingManagerFragmentSecondVersion.LLIZLLLIL == null) {
                    pushSettingManagerFragmentSecondVersion.LLIZLLLIL = Keva.getRepo("need_sync");
                }
                pushSettingManagerFragmentSecondVersion.LLIZLLLIL.storeString("need_sync_channel_name", pushSettingManagerFragmentSecondVersion.LLJ);
            }
            String LIZJ = C85926Xnu.LIZJ(pushSettingManagerFragmentSecondVersion.LLJ);
            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.setFlags(268435456);
            intent.putExtra("android.provider.extra.APP_PACKAGE", EF7.LIZIZ().getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", LIZJ);
            if (pushSettingManagerFragmentSecondVersion.LLILZLL == null) {
                pushSettingManagerFragmentSecondVersion.LLILZLL = EF7.LIZIZ().getPackageManager();
            }
            if (pushSettingManagerFragmentSecondVersion.LLILZLL.resolveActivity(intent, 65536) == null) {
                return;
            }
            C78598Ut0.LJIJJ(intent, pushSettingManagerFragmentSecondVersion);
            pushSettingManagerFragmentSecondVersion.startActivity(intent);
            return;
        }
        boolean z = !((C25848ACm) c85938Xo6.LJLIL).LJZI;
        c85938Xo6.LJIILIIL(z);
        c85946XoE2.LIZIZ = z;
        C85940Xo8.LIZIZ.LIZ(z ? 1 : 0, pushSettingManagerFragmentSecondVersion.LLJ);
        pushSettingManagerFragmentSecondVersion.LLILLJJLI.LJIILL(c85946XoE2.LIZ, Integer.valueOf(c85946XoE2.LIZIZ ? 1 : 0));
        if (!z && !AV1.LJIILLIIL() && C19N.LJ("show_feedback_dlg_4_push_off_reasons", false)) {
            C85948XoG c85948XoG = pushSettingManagerFragmentSecondVersion.LLILZIL;
            c85948XoG.getClass();
            if (System.currentTimeMillis() >= c85948XoG.LIZ.getLong("key_next_push_off_dialog_showtime", 0L)) {
                pushSettingManagerFragmentSecondVersion.LLILLL = pushSettingManagerFragmentSecondVersion.LLJ;
                pushSettingManagerFragmentSecondVersion.LLILZ.LJIILL(new Object[0]);
            }
        }
        try {
            JSONObject jSONObject = pushSettingManagerFragmentSecondVersion.LLJI;
            if (jSONObject != null) {
                jSONObject.put(c85946XoE.LIZ, c85946XoE.LIZIZ ? 1 : 0);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        String str5 = pushSettingManagerFragmentSecondVersion.LLJ;
        if (z) {
            str4 = "on";
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("label", str5);
        c188727au.LJIIIZ("to_status", str4);
        FMX.LJIIL("notification_switch", c188727au.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$6(ACListenerS40S0300000_15 aCListenerS40S0300000_15, View view) {
        String aid;
        AwemePagerVM awemePagerVM = (AwemePagerVM) aCListenerS40S0300000_15.l0;
        awemePagerVM.getClass();
        awemePagerVM.setState(new AqS39S0001000_15(0, 2));
        InterfaceC82683Wch interfaceC82683Wch = ((Y4A) aCListenerS40S0300000_15.l1).LJI;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
        Y4A y4a = (Y4A) aCListenerS40S0300000_15.l1;
        String str = y4a.LIZLLL;
        User user = y4a.LJ;
        String str2 = null;
        if (user != null) {
            str2 = user.getUid();
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        Aweme aweme = ((Y4A) aCListenerS40S0300000_15.l1).LJFF;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str3 = aid;
        }
        C26335AVf.LJJIII(str, str2, str3, "upload_date", (String) ((C68322mC) aCListenerS40S0300000_15.l2).element);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$7(ACListenerS40S0300000_15 aCListenerS40S0300000_15, View view) {
        String aid;
        AwemePagerVM awemePagerVM = (AwemePagerVM) aCListenerS40S0300000_15.l0;
        awemePagerVM.getClass();
        awemePagerVM.setState(new AqS39S0001000_15(1, 2));
        InterfaceC82683Wch interfaceC82683Wch = ((Y4A) aCListenerS40S0300000_15.l1).LJI;
        if (interfaceC82683Wch != null) {
            interfaceC82683Wch.dismiss();
        }
        Y4A y4a = (Y4A) aCListenerS40S0300000_15.l1;
        String str = y4a.LIZLLL;
        User user = y4a.LJ;
        String str2 = null;
        if (user != null) {
            str2 = user.getUid();
        }
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        Aweme aweme = ((Y4A) aCListenerS40S0300000_15.l1).LJFF;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            str3 = aid;
        }
        C26335AVf.LJJIII(str, str2, str3, "most_watched", (String) ((C68322mC) aCListenerS40S0300000_15.l2).element);
    }

    public static final void onClick$8(ACListenerS40S0300000_15 aCListenerS40S0300000_15, View view) {
        ((C85531XhX) aCListenerS40S0300000_15.l0).LJLILLLLZI.LIZIZ((BaseLoginMethod) aCListenerS40S0300000_15.l1, ((C85533XhZ) aCListenerS40S0300000_15.l2).getAdapterPosition());
    }

    public ACListenerS40S0300000_15(PushSettingManagerFragment pushSettingManagerFragment, C85938Xo6 c85938Xo6, int i) {
        this.$t = i;
        this.l2 = pushSettingManagerFragment;
        this.l1 = c85938Xo6;
    }

    public ACListenerS40S0300000_15(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
