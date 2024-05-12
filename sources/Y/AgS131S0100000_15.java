package Y;

import X.ActivityC45651qj;
import X.C10I;
import X.C10K;
import X.C16880lQ;
import X.C221018lt;
import X.C252949wI;
import X.C29S;
import X.C32I;
import X.C36480ETk;
import X.C44172HVg;
import X.C44384HbQ;
import X.C44426Hc6;
import X.C52206KeI;
import X.C57731MlD;
import X.C5S1;
import X.C71897SJp;
import X.C73305Spp;
import X.C74088T5w;
import X.C76800UCe;
import X.C78561UsP;
import X.C78688UuS;
import X.C80498ViY;
import X.C81098VsE;
import X.C82544WaS;
import X.C84488XDw;
import X.C84886XTe;
import X.C84889XTh;
import X.C84939XVf;
import X.C85115Xap;
import X.C85136XbA;
import X.C85144XbI;
import X.C85714XkU;
import X.C85809Xm1;
import X.C85810Xm2;
import X.C85811Xm3;
import X.C85812Xm4;
import X.C85813Xm5;
import X.C85814Xm6;
import X.C86179Xrz;
import X.C86188Xs8;
import X.C86499Xx9;
import X.EnumC85151XbP;
import X.EnumC86168Xro;
import X.EnumC86518XxS;
import X.FFL;
import X.InterfaceC85818XmA;
import X.KJK;
import X.ORZ;
import X.OSZ;
import X.RC0;
import X.SY4;
import X.V16;
import X.X1D;
import X.XAQ;
import X.XFE;
import X.XRT;
import X.XTV;
import X.XVW;
import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.gson.Gson;
import com.google.gson.s;
import com.ss.android.ugc.aweme.account.login.twostep.AddCurrentAuthDeviceFragment;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.AuthDeviceResponse;
import com.ss.android.ugc.aweme.account.login.twostep.AvailableWaysResponse;
import com.ss.android.ugc.aweme.account.login.twostep.BindVerifyResponse;
import com.ss.android.ugc.aweme.account.login.twostep.Device;
import com.ss.android.ugc.aweme.account.login.twostep.RecentDevicesFragmentViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.SendEmailCodeResponse;
import com.ss.android.ugc.aweme.account.login.twostep.SendSmsCodeResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TOTPCodeVerifyFragment;
import com.ss.android.ugc.aweme.account.login.twostep.TrustedDevicesFragmentViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepApiResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity;
import com.ss.android.ugc.aweme.account.login.twostep.TwoSvUserData;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyTOTPResponse;
import com.ss.android.ugc.aweme.account.unbind.UnbindInputCodeFragment;
import com.ss.android.ugc.aweme.choosemusic.api.ChooseMusicApi;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicCollection;
import com.ss.android.ugc.aweme.music.model.MusicList;
import com.ss.android.ugc.aweme.music.model.MusicRecallInfo;
import com.ss.android.ugc.aweme.profile.ui.CropActivity;
import com.ss.android.ugc.aweme.services.ttep.IDownloadCallback;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SuggestMusicList;
import com.ss.android.ugc.aweme.ttep.effectapply.EffectFetchApiResBean;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.ugc.effectplatform.model.Effect;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AqS146S0200000_15;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.AqS55S1200000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class AgS131S0100000_15 implements C10I {
    public final int $t;
    public Object l0;

    public static final Object then$7(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        Object lambda$clearCacheNoDiskManager$16;
        lambda$clearCacheNoDiskManager$16 = ((I18nSettingNewVersionFragment) agS131S0100000_15.l0).lambda$clearCacheNoDiskManager$16(c10k);
        return lambda$clearCacheNoDiskManager$16;
    }

    @Override // X.C10I
    public final Object then(C10K<AuthDeviceResponse> c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            case 4:
                return then$4(this, c10k);
            case 5:
                return then$5(this, c10k);
            case 6:
                return then$6(this, c10k);
            case 7:
                return then$7(this, c10k);
            case 8:
                return then$8(this, c10k);
            case 9:
                return then$9(this, c10k);
            case 10:
                return then$10(this, c10k);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return then$11(this, c10k);
            case 12:
                return then$12(this, c10k);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return then$13(this, c10k);
            case 14:
                return then$14(this, c10k);
            case 15:
                return then$15(this, c10k);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return then$16(this, c10k);
            case 17:
                return then$17(this, c10k);
            case 18:
                return then$18(this, c10k);
            case 19:
                return then$19(this, c10k);
            case 20:
                return then$20(this, c10k);
            case 21:
                return then$21(this, c10k);
            case 22:
                return then$22(this, c10k);
            case 23:
                return then$23(this, c10k);
            case 24:
                return then$24(this, c10k);
            case 25:
                return then$25(this, c10k);
            case 26:
                return then$26(this, c10k);
            case 27:
                return then$27(this, c10k);
            case 28:
                return then$28(this, c10k);
            case 29:
                return then$29(this, c10k);
            case 30:
                return then$30(this, c10k);
            case 31:
                return then$31(this, c10k);
            case 32:
                return then$32(this, c10k);
            case 33:
                return then$33(this, c10k);
            case 34:
                return then$34(this, c10k);
            default:
                return null;
        }
    }

    public AgS131S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object then$0(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        int i;
        AuthDeviceResponse.Data data;
        Integer errorCode;
        String ticket;
        if (!C82544WaS.LJ(c10k)) {
            String enterFrom = ((AddCurrentAuthDeviceFragment) agS131S0100000_15.l0).getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            String str = ((AddCurrentAuthDeviceFragment) agS131S0100000_15.l0).LJZL;
            Exception LJIIJ = c10k.LJIIJ();
            o.LJIIIIZZ(LJIIJ, "it.error");
            C85144XbI.LJJIFFI(enterFrom, str, 0, Integer.valueOf(C78688UuS.LJJIIZ(LJIIJ)));
            ActivityC45651qj mo49getActivity = ((AddCurrentAuthDeviceFragment) agS131S0100000_15.l0).mo49getActivity();
            if (mo49getActivity != null) {
                mo49getActivity.finish();
            }
            return null;
        }
        AuthDeviceResponse authDeviceResponse = (AuthDeviceResponse) c10k.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", authDeviceResponse.getMessage(), true) || authDeviceResponse.getData() == null) {
            String enterFrom2 = ((AddCurrentAuthDeviceFragment) agS131S0100000_15.l0).getEnterFrom();
            o.LJIIIIZZ(enterFrom2, "enterFrom");
            String str2 = ((AddCurrentAuthDeviceFragment) agS131S0100000_15.l0).LJZL;
            AuthDeviceResponse authDeviceResponse2 = (AuthDeviceResponse) c10k.LJIIJJI();
            if (authDeviceResponse2 != null && (data = authDeviceResponse2.getData()) != null && (errorCode = data.getErrorCode()) != null) {
                i = errorCode.intValue();
            } else {
                i = -2;
            }
            C85144XbI.LJJIFFI(enterFrom2, str2, 0, Integer.valueOf(i));
            ActivityC45651qj mo49getActivity2 = ((AddCurrentAuthDeviceFragment) agS131S0100000_15.l0).mo49getActivity();
            if (mo49getActivity2 != null) {
                mo49getActivity2.finish();
            }
            return null;
        }
        String enterFrom3 = ((AddCurrentAuthDeviceFragment) agS131S0100000_15.l0).getEnterFrom();
        o.LJIIIIZZ(enterFrom3, "enterFrom");
        C85144XbI.LJJIFFI(enterFrom3, ((AddCurrentAuthDeviceFragment) agS131S0100000_15.l0).LJZL, 1, null);
        Bundle arguments = ((AddCurrentAuthDeviceFragment) agS131S0100000_15.l0).getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        AddCurrentAuthDeviceFragment addCurrentAuthDeviceFragment = (AddCurrentAuthDeviceFragment) agS131S0100000_15.l0;
        Bundle bundle = new Bundle();
        bundle.putSerializable("auth_device_response", authDeviceResponse);
        AuthDeviceResponse.Data data2 = authDeviceResponse.getData();
        if (data2 != null && (ticket = data2.getTicket()) != null) {
            bundle.putString("ticket", ticket);
        }
        arguments.putBundle("final_data", bundle);
        addCurrentAuthDeviceFragment.Dl(arguments);
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS131S0100000_15 agS131S0100000_15, C10K it) {
        int i;
        Integer errorCode;
        ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).Hl();
        TOTPCodeVerifyFragment tOTPCodeVerifyFragment = (TOTPCodeVerifyFragment) agS131S0100000_15.l0;
        o.LJIIIIZZ(it, "it");
        if (!tOTPCodeVerifyFragment.ym(it, false)) {
            return null;
        }
        BindVerifyResponse bindVerifyResponse = (BindVerifyResponse) it.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", bindVerifyResponse.getMessage(), true)) {
            BindVerifyResponse.BindErrorData data = bindVerifyResponse.getData();
            if (data != null && (errorCode = data.getErrorCode()) != null) {
                i = errorCode.intValue();
            } else {
                i = -2;
            }
            String string = ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).getString(R.string.sg8);
            o.LJIIIIZZ(string, "getString(\n             …App_codePage_serverError)");
            ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).om(i, string);
            return C76800UCe.LIZ;
        }
        String enterFrom = ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        C85144XbI.LJIJ(enterFrom, ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).lm());
        TOTPCodeVerifyFragment tOTPCodeVerifyFragment2 = (TOTPCodeVerifyFragment) agS131S0100000_15.l0;
        RC0.LJI(tOTPCodeVerifyFragment2.LLIIIILZ, tOTPCodeVerifyFragment2.LLIIII);
        Bundle arguments = ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).getArguments();
        if (arguments == null) {
            return null;
        }
        ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).Dl(arguments);
        return C76800UCe.LIZ;
    }

    public static final Object then$10(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        List<Music> list;
        if (!c10k.LJIILJJIL() && c10k.LJIILIIL()) {
            if (c10k.LJIIJJI() != null) {
                ((XTV) agS131S0100000_15.l0).LJFF = ((CollectedMusicList) c10k.LJIIJJI()).cursor;
                ((XTV) agS131S0100000_15.l0).LJI = ((CollectedMusicList) c10k.LJIIJJI()).isHasMore();
                List<Music> list2 = ((CollectedMusicList) c10k.LJIIJJI()).items;
                if (list2 != null && list2.size() > 0) {
                    XTV xtv = (XTV) agS131S0100000_15.l0;
                    Object LJIIJJI = c10k.LJIIJJI();
                    o.LJIIIIZZ(LJIIJJI, "task.result");
                    xtv.getClass();
                    XTV.LIZ((CollectedMusicList) LJIIJJI);
                    XTV xtv2 = (XTV) agS131S0100000_15.l0;
                    ArrayList arrayList = new ArrayList(C32I.LJJL(list2, 10));
                    Iterator<Music> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().convertToMusicModel());
                    }
                    List<MusicModel> LLJILJILJ = ORZ.LLJILJILJ(arrayList);
                    xtv2.getClass();
                    xtv2.LIZJ = LLJILJILJ;
                    XTV xtv3 = (XTV) agS131S0100000_15.l0;
                    C84886XTe c84886XTe = xtv3.LIZ;
                    if (c84886XTe != null) {
                        c84886XTe.LJ(xtv3.LIZJ, xtv3.LJI);
                    }
                    XTV xtv4 = (XTV) agS131S0100000_15.l0;
                    C84886XTe c84886XTe2 = xtv4.LIZ;
                    if (c84886XTe2 != null) {
                        c84886XTe2.LIZ(xtv4.LIZJ);
                    }
                    XTV xtv5 = (XTV) agS131S0100000_15.l0;
                    if (!xtv5.LJI) {
                        xtv5.LIZJ();
                    }
                    return C76800UCe.LIZ;
                }
                ((XTV) agS131S0100000_15.l0).LIZJ.clear();
                C84886XTe c84886XTe3 = ((XTV) agS131S0100000_15.l0).LIZ;
                if (c84886XTe3 == null) {
                    return null;
                }
                c84886XTe3.LIZLLL();
                return C76800UCe.LIZ;
            }
            ((XTV) agS131S0100000_15.l0).LIZJ.clear();
            C84886XTe c84886XTe4 = ((XTV) agS131S0100000_15.l0).LIZ;
            if (c84886XTe4 == null) {
                return null;
            }
            c84886XTe4.LIZLLL();
            return C76800UCe.LIZ;
        }
        ((XTV) agS131S0100000_15.l0).getClass();
        CollectedMusicList LIZIZ = XTV.LIZIZ();
        if (LIZIZ != null && (list = LIZIZ.items) != null) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
            Iterator<Music> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(it2.next().convertToMusicModel());
            }
            if (!arrayList2.isEmpty()) {
                XTV xtv6 = (XTV) agS131S0100000_15.l0;
                List<MusicModel> LLJILJILJ2 = ORZ.LLJILJILJ(arrayList2);
                xtv6.getClass();
                xtv6.LIZJ = LLJILJILJ2;
                XTV xtv7 = (XTV) agS131S0100000_15.l0;
                C84886XTe c84886XTe5 = xtv7.LIZ;
                if (c84886XTe5 == null) {
                    return null;
                }
                c84886XTe5.LJ(xtv7.LIZJ, false);
                return C76800UCe.LIZ;
            }
        }
        C84886XTe c84886XTe6 = ((XTV) agS131S0100000_15.l0).LIZ;
        if (c84886XTe6 == null) {
            return null;
        }
        c84886XTe6.LIZIZ();
        return C76800UCe.LIZ;
    }

    public static final Object then$11(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        Effect effect;
        if (C36480ETk.LIZIZ(c10k)) {
            try {
                if (((EffectFetchApiResBean) c10k.LJIIJJI()).status != 0) {
                    ((IDownloadCallback) agS131S0100000_15.l0).onFail(((EffectFetchApiResBean) c10k.LJIIJJI()).status, ((EffectFetchApiResBean) c10k.LJIIJJI()).message, null);
                } else {
                    if (XAQ.LIZ == null) {
                        Application application = C44172HVg.LIZ;
                        o.LJIIIIZZ(application, "application");
                        C84488XDw.LIZ(application, null);
                    }
                    try {
                        Gson GSON = C44172HVg.LIZIZ;
                        o.LJIIIIZZ(GSON, "GSON");
                        effect = (Effect) GSON.LJI(((EffectFetchApiResBean) c10k.LJIIJJI()).data, Effect.class);
                    } catch (s unused) {
                    }
                    if (effect != null) {
                        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames((String[]) effect.getRequirements().toArray(new String[0]), C36480ETk.LIZ(effect.getModel_names()), new XFE((IDownloadCallback) agS131S0100000_15.l0, effect));
                    } else {
                        ((IDownloadCallback) agS131S0100000_15.l0).onFail(-10, "", null);
                    }
                }
            } catch (Exception e) {
                ((IDownloadCallback) agS131S0100000_15.l0).onFail(-10, "", e);
            }
        } else {
            ((IDownloadCallback) agS131S0100000_15.l0).onFail(-10, "", c10k.LJIIJ());
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$12(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        XVW xvw = (XVW) agS131S0100000_15.l0;
        xvw.LJIILJJIL = false;
        if (c10k.LJIILJJIL()) {
            xvw.LIZIZ.jv0(1, "loadmore_status_user_collected_music");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        CollectedMusicList collectedMusicList = (CollectedMusicList) c10k.LJIIJJI();
        List LJIL = V16.LJIL((XRT) xvw.LIZIZ.get("user_collected_music_list"));
        LJIL.addAll(C44426Hc6.LIZIZ(collectedMusicList.items, collectedMusicList.extra));
        XRT xrt = new XRT();
        xrt.LIZ.put("loadmore_status_user_collected_music", 0);
        xrt.LIZ.put("list_cursor", Integer.valueOf(collectedMusicList.cursor));
        xrt.LIZ.put("list_hasmore", Integer.valueOf(collectedMusicList.hasMore));
        xrt.LIZIZ("action_type", 2);
        V16.LJJJLZIJ(xrt, LJIL);
        xvw.LIZIZ.jv0(xrt, "user_collected_music_list");
        return null;
    }

    public static final Object then$13(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        XVW xvw = (XVW) agS131S0100000_15.l0;
        xvw.getClass();
        if (c10k.LJIILJJIL()) {
            xvw.LIZIZ.jv0(1, "loadmore_status_music_sheet");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        xvw.LIZIZ.jv0(0, "loadmore_status_music_sheet");
        MusicCollection musicCollection = (MusicCollection) c10k.LJIIJJI();
        List list = (List) ((XRT) xvw.LIZIZ.get("music_sheet_list")).LIZ("list_data");
        list.addAll(musicCollection.getItems());
        XRT xrt = new XRT();
        xrt.LIZ.put("list_cursor", Long.valueOf(musicCollection.cursor));
        xrt.LIZ.put("list_hasmore", Boolean.valueOf(musicCollection.hasMore));
        xrt.LIZ.put("action_type", 2);
        xrt.LIZIZ("list_data", list);
        xvw.LIZIZ.jv0(xrt, "music_sheet_list");
        return null;
    }

    public static final Object then$14(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        XVW xvw = (XVW) agS131S0100000_15.l0;
        xvw.LJIILL = false;
        if (c10k.LJIILJJIL()) {
            xvw.LIZIZ.jv0(1, "loadmore_status_hot_music_list");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        MusicList musicList = (MusicList) c10k.LJIIJJI();
        List LJIL = V16.LJIL((XRT) xvw.LIZIZ.get("hot_music_list_data"));
        LJIL.addAll(C44426Hc6.LIZIZ(musicList.items, musicList.extra));
        XRT xrt = new XRT();
        xrt.LIZ.put("loadmore_status_hot_music_list", 0);
        xrt.LIZ.put("list_cursor", Integer.valueOf(musicList.getCursor()));
        xrt.LIZ.put("list_hasmore", Integer.valueOf(musicList.hasMore));
        xrt.LIZIZ("action_type", 2);
        V16.LJJJLZIJ(xrt, LJIL);
        xvw.LIZIZ.jv0(xrt, "hot_music_list_data");
        return null;
    }

    public static final Object then$15(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        Music response;
        Music music = (Music) agS131S0100000_15.l0;
        try {
            FFL.LJIIIZ().getClass();
            if (FFL.LJ(31744, "studio_enable_cache_music_select_page_data", true, false) && !ChooseMusicApi.LIZJ()) {
                String musicId = music.getMid();
                o.LJIIIZ(musicId, "musicId");
                Object LIZ = C84889XTh.LIZ(C52206KeI.LIZ(), musicId);
                if (LIZ instanceof Music) {
                    response = (Music) LIZ;
                } else {
                    response = MusicApi.LIZIZ(musicId).music;
                    o.LJIIIIZZ(response, "response");
                    C84889XTh.LIZIZ(response, musicId);
                }
            } else {
                response = MusicApi.LIZIZ(music.getMid()).music;
            }
            if (response != null) {
                music.setCollectStatus(response.getCollectStatus());
            }
        } catch (Exception unused) {
        }
        return c10k.LJIIJJI();
    }

    public static final Object then$16(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        XVW xvw = (XVW) agS131S0100000_15.l0;
        xvw.LJIILL = false;
        if (c10k.LJIILJJIL()) {
            xvw.LIZIZ.jv0(1, "refresh_status_hot_music_list");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        MusicList musicList = (MusicList) c10k.LJIIJJI();
        XRT xrt = new XRT();
        xrt.LIZ.put("refresh_status_hot_music_list", 0);
        xrt.LIZ.put("list_cursor", Integer.valueOf(musicList.getCursor()));
        xrt.LIZ.put("list_hasmore", Integer.valueOf(musicList.hasMore));
        xrt.LIZIZ("action_type", 1);
        V16.LJJJLZIJ(xrt, C44426Hc6.LIZIZ(musicList.items, musicList.extra));
        xvw.LIZIZ.jv0(xrt, "hot_music_list_data");
        return null;
    }

    public static final Object then$17(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        List<Long> asList;
        if (c10k.LJIILJJIL() || c10k.LJIIL() || c10k.LJIIJJI() == null) {
            if (c10k.LJIIJ() == null) {
                return null;
            }
            throw c10k.LJIIJ();
        }
        SuggestMusicList suggestMusicList = new SuggestMusicList();
        MusicList musicList = (MusicList) c10k.LJIIJJI();
        ArrayMap arrayMap = new ArrayMap();
        List<MusicRecallInfo> list = musicList.recallInfo;
        if (list != null) {
            for (MusicRecallInfo musicRecallInfo : list) {
                if (musicRecallInfo != null && musicRecallInfo.recallReason != null) {
                    arrayMap.put(Long.valueOf(musicRecallInfo.id), musicRecallInfo.recallReason);
                }
            }
        }
        List<Music> list2 = musicList.items;
        String str = "AI";
        if (musicList.mMusicType != 2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AI");
            LIZ.append(musicList.mMusicType);
            str = X1D.LIZIZ(LIZ);
        }
        KJK.LIZIZ(str, list2, arrayMap);
        KJK.LIZ("ai_music", musicList.items);
        List<MusicModel> LIZIZ = C44426Hc6.LIZIZ(musicList.items, musicList.extra);
        suggestMusicList.musicList = LIZIZ;
        List<Long> list3 = musicList.mSimilarSongIDs;
        if (list3 == null) {
            asList = Arrays.asList(new Long[((ArrayList) LIZIZ).size()]);
        } else {
            ((MusicService) agS131S0100000_15.l0).getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<Long> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toString());
            }
            ArrayList arrayList2 = (ArrayList) LIZIZ;
            asList = Arrays.asList(new Long[arrayList2.size()]);
            for (int i = 0; i < arrayList2.size(); i++) {
                ListProtector.set(asList, i, Long.valueOf(arrayList.contains(((MusicModel) ListProtector.get(arrayList2, i)).getMusicId()) ? 1L : 0L));
                if (arrayList.contains(((MusicModel) ListProtector.get(arrayList2, i)).getMusicId())) {
                    ((MusicModel) ListProtector.get(arrayList2, i)).setSimilarTag(1);
                }
            }
        }
        suggestMusicList.musicType = Integer.valueOf(musicList.mMusicType);
        suggestMusicList.similarSongIds = asList;
        suggestMusicList.logPb = musicList.logPb;
        suggestMusicList.hasMore = musicList.isHasMore();
        suggestMusicList.cursor = musicList.getCursor();
        return suggestMusicList;
    }

    public static final Object then$18(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        Integer num;
        String str;
        TwoStepApiResponse.Data data;
        if (!C82544WaS.LJ(c10k)) {
            ((C85809Xm1) agS131S0100000_15.l0).LIZLLL(null, "TwoStepAuthApi.verifyThirdParty bolts Task error");
            return null;
        }
        TwoStepApiResponse twoStepApiResponse = (TwoStepApiResponse) c10k.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", twoStepApiResponse.message, true) || (data = twoStepApiResponse.data) == null || TextUtils.isEmpty(data.ticket)) {
            TwoStepApiResponse.Data data2 = twoStepApiResponse.data;
            if (data2 != null) {
                num = data2.errorCode;
                str = data2.errorDescription;
            } else {
                num = null;
                str = null;
            }
            ((C85809Xm1) agS131S0100000_15.l0).LIZLLL(num, str);
            if (str != null) {
                C5S1 c5s1 = new C5S1(((C85809Xm1) agS131S0100000_15.l0).LIZ());
                c5s1.LIZLLL(str);
                c5s1.LJ();
            }
            return null;
        }
        C85809Xm1 c85809Xm1 = (C85809Xm1) agS131S0100000_15.l0;
        String str2 = twoStepApiResponse.data.ticket;
        C74088T5w c74088T5w = c85809Xm1.LJLJJLL;
        if (c74088T5w != null) {
            c74088T5w.LIZ(true);
            InterfaceC85818XmA interfaceC85818XmA = c85809Xm1.LJLILLLLZI;
            if (interfaceC85818XmA != null) {
                interfaceC85818XmA.onSuccess(str2);
            }
            return C76800UCe.LIZ;
        }
        o.LJIJI("verifyButton");
        throw null;
    }

    public static final Object then$19(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        if (C82544WaS.LJ(c10k) && !TextUtils.isEmpty((CharSequence) c10k.LJIIJJI())) {
            TextView textView = ((C85813Xm5) agS131S0100000_15.l0).LJLJJLL;
            if (textView != null) {
                textView.setText((CharSequence) c10k.LJIIJJI());
            } else {
                o.LJIJI("errorText");
                throw null;
            }
        } else {
            C85813Xm5 c85813Xm5 = (C85813Xm5) agS131S0100000_15.l0;
            TextView textView2 = c85813Xm5.LJLJJLL;
            if (textView2 != null) {
                C29S LIZ = c85813Xm5.LIZ();
                o.LJI(LIZ);
                textView2.setText(LIZ.getString(R.string.drg));
            } else {
                o.LJIJI("errorText");
                throw null;
            }
        }
        return null;
    }

    public static final Object then$2(AgS131S0100000_15 agS131S0100000_15, C10K it) {
        int i;
        Integer errorCode;
        ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).Hl();
        TOTPCodeVerifyFragment tOTPCodeVerifyFragment = (TOTPCodeVerifyFragment) agS131S0100000_15.l0;
        o.LJIIIIZZ(it, "it");
        String str = null;
        if (!tOTPCodeVerifyFragment.ym(it, false)) {
            return null;
        }
        VerifyTOTPResponse verifyTOTPResponse = (VerifyTOTPResponse) it.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", verifyTOTPResponse.getMessage(), true)) {
            VerifyTOTPResponse.VerifyData data = verifyTOTPResponse.getData();
            if (data != null && (errorCode = data.getErrorCode()) != null) {
                i = errorCode.intValue();
            } else {
                i = -2;
            }
            String string = ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).getString(R.string.sg8);
            o.LJIIIIZZ(string, "getString(\n             …App_codePage_serverError)");
            ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).om(i, string);
            return C76800UCe.LIZ;
        }
        String enterFrom = ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).getEnterFrom();
        o.LJIIIIZZ(enterFrom, "enterFrom");
        C85144XbI.LJIJ(enterFrom, ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).lm());
        TOTPCodeVerifyFragment tOTPCodeVerifyFragment2 = (TOTPCodeVerifyFragment) agS131S0100000_15.l0;
        RC0.LJI(tOTPCodeVerifyFragment2.LLIIIILZ, tOTPCodeVerifyFragment2.LLIIII);
        Bundle arguments = ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).getArguments();
        if (arguments == null) {
            return null;
        }
        TOTPCodeVerifyFragment tOTPCodeVerifyFragment3 = (TOTPCodeVerifyFragment) agS131S0100000_15.l0;
        Bundle bundle = new Bundle();
        VerifyTOTPResponse.VerifyData data2 = verifyTOTPResponse.getData();
        if (data2 != null) {
            str = data2.getTicket();
        }
        bundle.putString("ticket", str);
        arguments.putBundle("final_data", bundle);
        tOTPCodeVerifyFragment3.Dl(arguments);
        return C76800UCe.LIZ;
    }

    public static final Object then$20(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        if (!C82544WaS.LJ(c10k)) {
            ((TwoStepVerificationManageActivity) agS131S0100000_15.l0).LLILLL();
            return null;
        }
        AvailableWaysResponse availableWaysResponse = (AvailableWaysResponse) c10k.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", availableWaysResponse.getMessage(), true) || availableWaysResponse.getData() == null) {
            ((TwoStepVerificationManageActivity) agS131S0100000_15.l0).LLILLL();
            return null;
        }
        ((C73305Spp) ((TwoStepVerificationManageActivity) agS131S0100000_15.l0)._$_findCachedViewById(R.id.keh)).setVisibility(8);
        ((TwoStepVerificationManageActivity) agS131S0100000_15.l0)._$_findCachedViewById(R.id.dm7).setVisibility(0);
        ((TwoStepVerificationManageActivity) agS131S0100000_15.l0).LJLL = availableWaysResponse.getData();
        TwoSvUserData twoSvUserData = ((TwoStepVerificationManageActivity) agS131S0100000_15.l0).LJLL;
        o.LJI(twoSvUserData);
        Boolean has_mobile = twoSvUserData.getHas_mobile();
        Boolean bool = Boolean.TRUE;
        C85115Xap.LIZIZ = o.LJ(has_mobile, bool);
        TwoSvUserData twoSvUserData2 = ((TwoStepVerificationManageActivity) agS131S0100000_15.l0).LJLL;
        o.LJI(twoSvUserData2);
        C85115Xap.LIZJ = o.LJ(twoSvUserData2.getHas_email(), bool);
        TwoSvUserData twoSvUserData3 = ((TwoStepVerificationManageActivity) agS131S0100000_15.l0).LJLL;
        o.LJI(twoSvUserData3);
        C85115Xap.LIZ = o.LJ(twoSvUserData3.getHas_pwd(), bool);
        TwoStepVerificationManageActivity twoStepVerificationManageActivity = (TwoStepVerificationManageActivity) agS131S0100000_15.l0;
        AddVerificationResponse addVerificationResponse = twoStepVerificationManageActivity.LJLJL;
        if (addVerificationResponse == null) {
            return null;
        }
        twoStepVerificationManageActivity.LLILIL(addVerificationResponse);
        return C76800UCe.LIZ;
    }

    public static final Object then$21(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        Integer num;
        String str;
        TwoStepApiResponse.Data data;
        if (!C82544WaS.LJ(c10k)) {
            C85811Xm3 c85811Xm3 = (C85811Xm3) agS131S0100000_15.l0;
            c85811Xm3.LJLLJ = true;
            c85811Xm3.LJFF(null, "TwoStepAuthApi.verifyEmailCode bolts Task error");
            return null;
        }
        TwoStepApiResponse twoStepApiResponse = (TwoStepApiResponse) c10k.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", twoStepApiResponse.message, true) || (data = twoStepApiResponse.data) == null || TextUtils.isEmpty(data.ticket)) {
            C85811Xm3 c85811Xm32 = (C85811Xm3) agS131S0100000_15.l0;
            c85811Xm32.LJLLJ = true;
            TwoStepApiResponse.Data data2 = twoStepApiResponse.data;
            if (data2 != null) {
                num = data2.errorCode;
                str = data2.errorDescription;
            } else {
                num = null;
                str = null;
            }
            c85811Xm32.LJFF(num, str);
            return null;
        }
        C85811Xm3 c85811Xm33 = (C85811Xm3) agS131S0100000_15.l0;
        String str2 = twoStepApiResponse.data.ticket;
        c85811Xm33.LJLLL.LIZ(true);
        c85811Xm33.LJ();
        c85811Xm33.LIZLLL();
        InterfaceC85818XmA interfaceC85818XmA = c85811Xm33.LJLILLLLZI;
        if (interfaceC85818XmA != null) {
            interfaceC85818XmA.onSuccess(str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$22(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        Integer num;
        String str;
        if (!C82544WaS.LJ(c10k)) {
            TrustedDevicesFragmentViewModel trustedDevicesFragmentViewModel = (TrustedDevicesFragmentViewModel) agS131S0100000_15.l0;
            TrustedDevicesFragmentViewModel.hv0(trustedDevicesFragmentViewModel, -2, null, 6);
            trustedDevicesFragmentViewModel.setState(new AqS181S0100000_15(trustedDevicesFragmentViewModel, 278));
            return null;
        }
        AuthDeviceResponse authDeviceResponse = (AuthDeviceResponse) c10k.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", authDeviceResponse.getMessage(), true) || authDeviceResponse.getData() == null) {
            AuthDeviceResponse.Data data = authDeviceResponse.getData();
            if (data != null) {
                num = data.getErrorCode();
            } else {
                num = null;
            }
            AuthDeviceResponse.Data data2 = authDeviceResponse.getData();
            if (data2 != null) {
                str = data2.getErrorDescription();
            } else {
                str = null;
            }
            TrustedDevicesFragmentViewModel trustedDevicesFragmentViewModel2 = (TrustedDevicesFragmentViewModel) agS131S0100000_15.l0;
            TrustedDevicesFragmentViewModel.hv0(trustedDevicesFragmentViewModel2, num, str, 4);
            trustedDevicesFragmentViewModel2.setState(new AqS181S0100000_15(trustedDevicesFragmentViewModel2, 278));
            return null;
        }
        List<Device> auth_device = authDeviceResponse.getData().getAuth_device();
        if (auth_device != null) {
            ((TrustedDevicesFragmentViewModel) agS131S0100000_15.l0).LJLIL = auth_device;
        }
        TrustedDevicesFragmentViewModel trustedDevicesFragmentViewModel3 = (TrustedDevicesFragmentViewModel) agS131S0100000_15.l0;
        trustedDevicesFragmentViewModel3.LJLJJL.setAuthDeviceListStatus(authDeviceResponse);
        trustedDevicesFragmentViewModel3.withState(new AqS146S0200000_15(trustedDevicesFragmentViewModel3, authDeviceResponse, 83));
        return C76800UCe.LIZ;
    }

    public static final Object then$23(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        Integer num;
        String str;
        String str2;
        if (!C82544WaS.LJ(c10k) || ujb.o.LJJJJIZL("error", ((SendEmailCodeResponse) c10k.LJIIJJI()).message, true)) {
            C85811Xm3 c85811Xm3 = (C85811Xm3) agS131S0100000_15.l0;
            SendEmailCodeResponse.Data data = ((SendEmailCodeResponse) c10k.LJIIJJI()).data;
            if (data != null) {
                num = data.errorCode;
            } else {
                num = null;
            }
            Exception LJIIJ = c10k.LJIIJ();
            if (LJIIJ == null || (str = LJIIJ.getMessage()) == null) {
                SendEmailCodeResponse.Data data2 = ((SendEmailCodeResponse) c10k.LJIIJJI()).data;
                if (data2 != null) {
                    str = data2.errorDescription;
                } else {
                    str = null;
                }
            }
            c85811Xm3.LJFF(num, str);
            return null;
        }
        TextView textView = ((C85811Xm3) agS131S0100000_15.l0).LJLJLLL;
        if (textView != null) {
            if (TextUtils.isEmpty(textView.getText())) {
                C85811Xm3 c85811Xm32 = (C85811Xm3) agS131S0100000_15.l0;
                TextView textView2 = c85811Xm32.LJLJLLL;
                if (textView2 != null) {
                    Locale locale = Locale.US;
                    C29S LIZ = c85811Xm32.LIZ();
                    o.LJI(LIZ);
                    String string = LIZ.getString(R.string.drf);
                    o.LJIIIIZZ(string, "getActivity()!!.getStrin…common_verify_email_text)");
                    Object[] objArr = new Object[1];
                    SendEmailCodeResponse.Data data3 = ((SendEmailCodeResponse) c10k.LJIIJJI()).data;
                    if (data3 != null) {
                        str2 = data3.email;
                    } else {
                        str2 = null;
                    }
                    objArr[0] = str2;
                    String LLLZI = C16880lQ.LLLZI(locale, string, Arrays.copyOf(objArr, 1));
                    o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
                    textView2.setText(LLLZI);
                } else {
                    o.LJIJI("descriptionText");
                    throw null;
                }
            }
            C80498ViY c80498ViY = ((C85811Xm3) agS131S0100000_15.l0).LJLJL;
            if (c80498ViY != null) {
                c80498ViY.setEnabled(true);
                View view = ((C85811Xm3) agS131S0100000_15.l0).LJLLI;
                if (view != null) {
                    view.setEnabled(false);
                    ((C85811Xm3) agS131S0100000_15.l0).LJ();
                    C85714XkU c85714XkU = ((C85811Xm3) agS131S0100000_15.l0).LJLJJLL;
                    if (c85714XkU != null) {
                        return c85714XkU.LJJJIL();
                    }
                    o.LJIJI("timerText");
                    throw null;
                }
                o.LJIJI("resendCodeBtn");
                throw null;
            }
            o.LJIJI("codeInputView");
            throw null;
        }
        o.LJIJI("descriptionText");
        throw null;
    }

    public static final Object then$24(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        Integer num;
        String str;
        TwoStepApiResponse.Data data;
        if (!C82544WaS.LJ(c10k)) {
            C85810Xm2 c85810Xm2 = (C85810Xm2) agS131S0100000_15.l0;
            c85810Xm2.LJLLJ = true;
            c85810Xm2.LJFF(null, "TwoStepAuthApi.verifySmsCode bolts Task error");
            return null;
        }
        TwoStepApiResponse twoStepApiResponse = (TwoStepApiResponse) c10k.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", twoStepApiResponse.message, true) || (data = twoStepApiResponse.data) == null || TextUtils.isEmpty(data.ticket)) {
            C85810Xm2 c85810Xm22 = (C85810Xm2) agS131S0100000_15.l0;
            c85810Xm22.LJLLJ = true;
            TwoStepApiResponse.Data data2 = twoStepApiResponse.data;
            if (data2 != null) {
                num = data2.errorCode;
                str = data2.errorDescription;
            } else {
                num = null;
                str = null;
            }
            c85810Xm22.LJFF(num, str);
            return null;
        }
        C85810Xm2 c85810Xm23 = (C85810Xm2) agS131S0100000_15.l0;
        String str2 = twoStepApiResponse.data.ticket;
        c85810Xm23.LJLLL.LIZ(true);
        c85810Xm23.LJ();
        c85810Xm23.LIZLLL();
        InterfaceC85818XmA interfaceC85818XmA = c85810Xm23.LJLILLLLZI;
        if (interfaceC85818XmA != null) {
            interfaceC85818XmA.onSuccess(str2);
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$25(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        Integer num;
        String str;
        String str2;
        if (!C82544WaS.LJ(c10k) || ujb.o.LJJJJIZL("error", ((SendSmsCodeResponse) c10k.LJIIJJI()).message, true)) {
            C85810Xm2 c85810Xm2 = (C85810Xm2) agS131S0100000_15.l0;
            SendSmsCodeResponse.Data data = ((SendSmsCodeResponse) c10k.LJIIJJI()).data;
            if (data != null) {
                num = data.errorCode;
            } else {
                num = null;
            }
            Exception LJIIJ = c10k.LJIIJ();
            if (LJIIJ == null || (str = LJIIJ.getMessage()) == null) {
                SendSmsCodeResponse.Data data2 = ((SendSmsCodeResponse) c10k.LJIIJJI()).data;
                if (data2 != null) {
                    str = data2.errorDescription;
                } else {
                    str = null;
                }
            }
            c85810Xm2.LJFF(num, str);
            return null;
        }
        TextView textView = ((C85810Xm2) agS131S0100000_15.l0).LJLJLLL;
        if (textView != null) {
            if (TextUtils.isEmpty(textView.getText())) {
                C85810Xm2 c85810Xm22 = (C85810Xm2) agS131S0100000_15.l0;
                TextView textView2 = c85810Xm22.LJLJLLL;
                if (textView2 != null) {
                    Locale locale = Locale.US;
                    C29S LIZ = c85810Xm22.LIZ();
                    o.LJI(LIZ);
                    String string = LIZ.getString(R.string.drm);
                    o.LJIIIIZZ(string, "getActivity()!!.getStrin…g.common_verify_sms_text)");
                    Object[] objArr = new Object[1];
                    SendSmsCodeResponse.Data data3 = ((SendSmsCodeResponse) c10k.LJIIJJI()).data;
                    if (data3 != null) {
                        str2 = data3.mobile;
                    } else {
                        str2 = null;
                    }
                    objArr[0] = str2;
                    String LLLZI = C16880lQ.LLLZI(locale, string, Arrays.copyOf(objArr, 1));
                    o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
                    textView2.setText(LLLZI);
                } else {
                    o.LJIJI("descriptionText");
                    throw null;
                }
            }
            C80498ViY c80498ViY = ((C85810Xm2) agS131S0100000_15.l0).LJLJL;
            if (c80498ViY != null) {
                c80498ViY.setEnabled(true);
                View view = ((C85810Xm2) agS131S0100000_15.l0).LJLL;
                if (view != null) {
                    view.setEnabled(false);
                    ((C85810Xm2) agS131S0100000_15.l0).LJ();
                    C85714XkU c85714XkU = ((C85810Xm2) agS131S0100000_15.l0).LJLJJLL;
                    if (c85714XkU != null) {
                        return c85714XkU.LJJJIL();
                    }
                    o.LJIJI("timerText");
                    throw null;
                }
                o.LJIJI("resendCodeBtn");
                throw null;
            }
            o.LJIJI("codeInputView");
            throw null;
        }
        o.LJIJI("descriptionText");
        throw null;
    }

    public static final Object then$26(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        Integer num;
        if (!C82544WaS.LJ(c10k)) {
            TwoStepVerificationActivityViewModel.xv0((TwoStepVerificationActivityViewModel) agS131S0100000_15.l0, null, null, 7);
            return null;
        }
        AvailableWaysResponse availableWaysResponse = (AvailableWaysResponse) c10k.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", availableWaysResponse.getMessage(), true) || availableWaysResponse.getData() == null) {
            TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) agS131S0100000_15.l0;
            TwoSvUserData data = availableWaysResponse.getData();
            if (data != null) {
                num = data.getErrorCode();
            } else {
                num = null;
            }
            TwoStepVerificationActivityViewModel.xv0(twoStepVerificationActivityViewModel, num, availableWaysResponse.getMessage(), 4);
            return null;
        }
        TwoSvUserData data2 = availableWaysResponse.getData();
        TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel2 = (TwoStepVerificationActivityViewModel) agS131S0100000_15.l0;
        Map<EnumC85151XbP, C85136XbA> map = twoStepVerificationActivityViewModel2.LJLJJL;
        EnumC85151XbP enumC85151XbP = EnumC85151XbP.SMS;
        Boolean has_mobile = data2.getHas_mobile();
        Boolean bool = Boolean.TRUE;
        map.put(enumC85151XbP, new C85136XbA(o.LJ(has_mobile, bool), false, null, data2.getMobile(), false, false, 54));
        Map<EnumC85151XbP, C85136XbA> map2 = twoStepVerificationActivityViewModel2.LJLJJL;
        EnumC85151XbP enumC85151XbP2 = EnumC85151XbP.EMAIL;
        map2.put(enumC85151XbP2, new C85136XbA(o.LJ(data2.getHas_email(), bool), false, enumC85151XbP2, data2.getEmail(), false, false, 50));
        if (twoStepVerificationActivityViewModel2.tv0()) {
            Map<EnumC85151XbP, C85136XbA> map3 = twoStepVerificationActivityViewModel2.LJLJJL;
            EnumC85151XbP enumC85151XbP3 = EnumC85151XbP.TOTP;
            map3.put(enumC85151XbP3, new C85136XbA(false, false, enumC85151XbP3, null, false, false, 59));
        }
        Map<EnumC85151XbP, C85136XbA> map4 = twoStepVerificationActivityViewModel2.LJLJJL;
        EnumC85151XbP enumC85151XbP4 = EnumC85151XbP.PASSWORD;
        map4.put(enumC85151XbP4, new C85136XbA(o.LJ(data2.getHas_pwd(), bool), false, enumC85151XbP4, null, false, false, 58));
        twoStepVerificationActivityViewModel2.Av0(null);
        return C76800UCe.LIZ;
    }

    public static final Object then$27(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        Integer num;
        String str;
        TwoStepApiResponse.Data data;
        String str2;
        if (!C82544WaS.LJ(c10k)) {
            C85812Xm4 c85812Xm4 = (C85812Xm4) agS131S0100000_15.l0;
            Exception LJIIJ = c10k.LJIIJ();
            if (LJIIJ != null) {
                str2 = LJIIJ.toString();
            } else {
                str2 = null;
            }
            c85812Xm4.LIZLLL(null, str2);
            return null;
        }
        TwoStepApiResponse twoStepApiResponse = (TwoStepApiResponse) c10k.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", twoStepApiResponse.message, true) || (data = twoStepApiResponse.data) == null || TextUtils.isEmpty(data.ticket)) {
            TwoStepApiResponse.Data data2 = twoStepApiResponse.data;
            if (data2 != null) {
                num = data2.errorCode;
                str = data2.errorDescription;
            } else {
                num = null;
                str = null;
            }
            ((C85812Xm4) agS131S0100000_15.l0).LIZLLL(num, str);
            return null;
        }
        C85812Xm4 c85812Xm42 = (C85812Xm4) agS131S0100000_15.l0;
        String str3 = twoStepApiResponse.data.ticket;
        c85812Xm42.LJLJLLL.LIZ(true);
        C252949wI c252949wI = c85812Xm42.LJLJLJ;
        if (c252949wI != null) {
            c252949wI.LIZ();
            C74088T5w c74088T5w = c85812Xm42.LJLJJLL;
            if (c74088T5w != null) {
                c74088T5w.LIZ(true);
                InterfaceC85818XmA interfaceC85818XmA = c85812Xm42.LJLILLLLZI;
                if (interfaceC85818XmA != null) {
                    interfaceC85818XmA.onSuccess(str3);
                }
                return C76800UCe.LIZ;
            }
            o.LJIJI("loadingButton");
            throw null;
        }
        o.LJIJI("passwordInputResult");
        throw null;
    }

    public static final Object then$28(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        if (C82544WaS.LJ(c10k)) {
            C85814Xm6 c85814Xm6 = ((TwoStepAuthActivity) agS131S0100000_15.l0).LJLILLLLZI;
            if (c85814Xm6 != null) {
                return c85814Xm6.LIZJ();
            }
            return null;
        }
        ((TwoStepAuthActivity) agS131S0100000_15.l0).getClass();
        return C76800UCe.LIZ;
    }

    public static final Object then$29(AgS131S0100000_15 agS131S0100000_15, C10K it1) {
        Integer errorCode;
        ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).Hl();
        ((SY4) ((TOTPCodeVerifyFragment) agS131S0100000_15.l0)._$_findCachedViewById(R.id.h0u)).setEnabled(true);
        ((SY4) ((TOTPCodeVerifyFragment) agS131S0100000_15.l0)._$_findCachedViewById(R.id.h0u)).setLoading(false);
        TOTPCodeVerifyFragment tOTPCodeVerifyFragment = (TOTPCodeVerifyFragment) agS131S0100000_15.l0;
        o.LJIIIIZZ(it1, "it1");
        String str = null;
        int i = -2;
        if (!tOTPCodeVerifyFragment.ym(it1, false)) {
            C85144XbI.LJJ(((TOTPCodeVerifyFragment) agS131S0100000_15.l0).nm(), "totp", false);
            String enterFrom = ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).getEnterFrom();
            o.LJIIIIZZ(enterFrom, "enterFrom");
            String enterMethod = ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).getEnterMethod();
            o.LJIIIIZZ(enterMethod, "enterMethod");
            C85144XbI.LJIJI(enterFrom, enterMethod, ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).nm(), "totp", ((CompoundButton) ((TOTPCodeVerifyFragment) agS131S0100000_15.l0)._$_findCachedViewById(R.id.b_d)).isChecked(), 0, -2);
            return null;
        }
        VerifyTOTPResponse verifyTOTPResponse = (VerifyTOTPResponse) it1.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", verifyTOTPResponse.getMessage(), true)) {
            VerifyTOTPResponse.VerifyData data = verifyTOTPResponse.getData();
            if (data != null && (errorCode = data.getErrorCode()) != null) {
                i = errorCode.intValue();
            }
            String string = ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).getString(R.string.sg8);
            o.LJIIIIZZ(string, "getString(\n             …App_codePage_serverError)");
            C85144XbI.LJJ(((TOTPCodeVerifyFragment) agS131S0100000_15.l0).nm(), "totp", false);
            String enterFrom2 = ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).getEnterFrom();
            o.LJIIIIZZ(enterFrom2, "enterFrom");
            String enterMethod2 = ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).getEnterMethod();
            o.LJIIIIZZ(enterMethod2, "enterMethod");
            C85144XbI.LJIJI(enterFrom2, enterMethod2, ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).nm(), "totp", ((CompoundButton) ((TOTPCodeVerifyFragment) agS131S0100000_15.l0)._$_findCachedViewById(R.id.b_d)).isChecked(), 0, Integer.valueOf(i));
            ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).om(i, string);
            return C76800UCe.LIZ;
        }
        C85144XbI.LJJ(((TOTPCodeVerifyFragment) agS131S0100000_15.l0).nm(), "totp", true);
        String enterFrom3 = ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).getEnterFrom();
        o.LJIIIIZZ(enterFrom3, "enterFrom");
        String enterMethod3 = ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).getEnterMethod();
        o.LJIIIIZZ(enterMethod3, "enterMethod");
        C85144XbI.LJIJJ(enterFrom3, enterMethod3, ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).nm(), "totp", ((CompoundButton) ((TOTPCodeVerifyFragment) agS131S0100000_15.l0)._$_findCachedViewById(R.id.b_d)).isChecked());
        TOTPCodeVerifyFragment tOTPCodeVerifyFragment2 = (TOTPCodeVerifyFragment) agS131S0100000_15.l0;
        RC0.LJI(tOTPCodeVerifyFragment2.LLIIIILZ, tOTPCodeVerifyFragment2.LLIIII);
        Bundle arguments = ((TOTPCodeVerifyFragment) agS131S0100000_15.l0).getArguments();
        if (arguments == null) {
            return null;
        }
        TOTPCodeVerifyFragment tOTPCodeVerifyFragment3 = (TOTPCodeVerifyFragment) agS131S0100000_15.l0;
        Bundle bundle = new Bundle();
        VerifyTOTPResponse.VerifyData data2 = verifyTOTPResponse.getData();
        if (data2 != null) {
            str = data2.getTicket();
        }
        bundle.putString("ticket", str);
        arguments.putBundle("final_data", bundle);
        tOTPCodeVerifyFragment3.Dl(arguments);
        return C76800UCe.LIZ;
    }

    public static final Object then$3(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        Integer num;
        if (!C82544WaS.LJ(c10k)) {
            TwoStepVerificationActivityViewModel.xv0((TwoStepVerificationActivityViewModel) agS131S0100000_15.l0, null, null, 7);
            return null;
        }
        AddVerificationResponse addVerificationResponse = (AddVerificationResponse) c10k.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", addVerificationResponse.getMessage(), true) || addVerificationResponse.getData() == null) {
            TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) agS131S0100000_15.l0;
            AddVerificationResponse.Data data = addVerificationResponse.getData();
            if (data != null) {
                num = data.getErrorCode();
            } else {
                num = null;
            }
            String message = addVerificationResponse.getMessage();
            AddVerificationResponse.Data data2 = addVerificationResponse.getData();
            if (data2 != null) {
                data2.getErrorDescription();
            }
            twoStepVerificationActivityViewModel.getClass();
            twoStepVerificationActivityViewModel.setState(new AqS55S1200000_15(twoStepVerificationActivityViewModel, num, message, 3));
            return null;
        }
        ((TwoStepVerificationActivityViewModel) agS131S0100000_15.l0).Av0(addVerificationResponse);
        return C76800UCe.LIZ;
    }

    public static final Object then$30(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        String str;
        Integer errorCode;
        int i = 0;
        int i2 = -2;
        if (!C82544WaS.LJ(c10k)) {
            C85144XbI.LJJII(((RecentDevicesFragmentViewModel) agS131S0100000_15.l0).LJLIL.size(), 0, -2, ((RecentDevicesFragmentViewModel) agS131S0100000_15.l0).getEnterFrom());
            RecentDevicesFragmentViewModel recentDevicesFragmentViewModel = (RecentDevicesFragmentViewModel) agS131S0100000_15.l0;
            RecentDevicesFragmentViewModel.hv0(recentDevicesFragmentViewModel, -2, null, 6);
            recentDevicesFragmentViewModel.kv0();
            return null;
        }
        AuthDeviceResponse authDeviceResponse = (AuthDeviceResponse) c10k.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", authDeviceResponse.getMessage(), true) || authDeviceResponse.getData() == null) {
            AuthDeviceResponse.Data data = authDeviceResponse.getData();
            if (data != null && (errorCode = data.getErrorCode()) != null) {
                i2 = errorCode.intValue();
            }
            AuthDeviceResponse.Data data2 = authDeviceResponse.getData();
            if (data2 != null) {
                str = data2.getErrorDescription();
            } else {
                str = null;
            }
            C85144XbI.LJJII(((RecentDevicesFragmentViewModel) agS131S0100000_15.l0).LJLIL.size(), 0, i2, ((RecentDevicesFragmentViewModel) agS131S0100000_15.l0).getEnterFrom());
            RecentDevicesFragmentViewModel recentDevicesFragmentViewModel2 = (RecentDevicesFragmentViewModel) agS131S0100000_15.l0;
            RecentDevicesFragmentViewModel.hv0(recentDevicesFragmentViewModel2, Integer.valueOf(i2), str, 4);
            recentDevicesFragmentViewModel2.kv0();
            return null;
        }
        String enterFrom = ((RecentDevicesFragmentViewModel) agS131S0100000_15.l0).getEnterFrom();
        List<Device> auth_device = authDeviceResponse.getData().getAuth_device();
        if (auth_device != null) {
            i = auth_device.size();
        }
        C85144XbI.LJJII(i, 1, -2, enterFrom);
        ((RecentDevicesFragmentViewModel) agS131S0100000_15.l0).LJLJJLL.setAuthDeviceListStatus(authDeviceResponse);
        ((RecentDevicesFragmentViewModel) agS131S0100000_15.l0).gv0(true);
        return C76800UCe.LIZ;
    }

    public static final Object then$31(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        C84939XVf c84939XVf = (C84939XVf) agS131S0100000_15.l0;
        c84939XVf.getClass();
        if (c10k.LJIILJJIL()) {
            c84939XVf.LIZIZ.jv0(1, "loadmore_status_music_sheet");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        c84939XVf.LIZIZ.jv0(0, "loadmore_status_music_sheet");
        com.ss.android.ugc.aweme.kids.music.model.MusicCollection musicCollection = (com.ss.android.ugc.aweme.kids.music.model.MusicCollection) c10k.LJIIJJI();
        List list = (List) ((XRT) c84939XVf.LIZIZ.get("music_sheet_list")).LIZ("list_data");
        list.addAll(musicCollection.getItems());
        XRT xrt = new XRT();
        xrt.LIZ.put("list_cursor", Long.valueOf(musicCollection.cursor));
        xrt.LIZ.put("list_hasmore", Boolean.valueOf(musicCollection.hasMore));
        xrt.LIZ.put("action_type", 2);
        xrt.LIZIZ("list_data", list);
        c84939XVf.LIZIZ.jv0(xrt, "music_sheet_list");
        return null;
    }

    public static final Object then$32(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        C84939XVf c84939XVf = (C84939XVf) agS131S0100000_15.l0;
        c84939XVf.LJFF = false;
        if (c10k.LJIILJJIL()) {
            c84939XVf.LIZIZ.jv0(1, "loadmore_status_user_collected_music");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        CollectedMusicList collectedMusicList = (CollectedMusicList) c10k.LJIIJJI();
        List list = (List) ((XRT) c84939XVf.LIZIZ.get("user_collected_music_list")).LIZ("list_data");
        list.addAll(C44384HbQ.LJIJJLI(collectedMusicList.items));
        XRT xrt = new XRT();
        xrt.LIZ.put("loadmore_status_user_collected_music", 0);
        xrt.LIZ.put("list_cursor", Integer.valueOf(collectedMusicList.cursor));
        xrt.LIZ.put("list_hasmore", Integer.valueOf(collectedMusicList.hasMore));
        xrt.LIZ.put("action_type", 2);
        xrt.LIZIZ("list_data", list);
        c84939XVf.LIZIZ.jv0(xrt, "user_collected_music_list");
        return null;
    }

    public static final Object then$33(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        C84939XVf c84939XVf = (C84939XVf) agS131S0100000_15.l0;
        c84939XVf.getClass();
        if (c10k.LJIILJJIL()) {
            c84939XVf.LIZIZ.jv0(1, "refresh_status_music_sheet");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        c84939XVf.LIZIZ.jv0(0, "refresh_status_music_sheet");
        com.ss.android.ugc.aweme.kids.music.model.MusicCollection musicCollection = (com.ss.android.ugc.aweme.kids.music.model.MusicCollection) c10k.LJIIJJI();
        XRT xrt = new XRT();
        xrt.LIZ.put("list_cursor", Long.valueOf(musicCollection.cursor));
        xrt.LIZ.put("list_hasmore", Boolean.valueOf(musicCollection.hasMore));
        xrt.LIZ.put("action_type", 1);
        xrt.LIZIZ("list_data", musicCollection.getItems());
        c84939XVf.LIZIZ.jv0(xrt, "music_sheet_list");
        return null;
    }

    public static final Object then$34(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        ((C86188Xs8) agS131S0100000_15.l0).LJLJLJ.setText((CharSequence) c10k.LJIIJJI());
        return null;
    }

    public static final Object then$4(AgS131S0100000_15 agS131S0100000_15, C10K it) {
        UnbindInputCodeFragment unbindInputCodeFragment = (UnbindInputCodeFragment) agS131S0100000_15.l0;
        o.LJIIIIZZ(it, "it");
        unbindInputCodeFragment.mm(it);
        return null;
    }

    public static final Object then$5(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        CharSequence charSequence;
        EnumC86168Xro enumC86168Xro;
        EnumC86168Xro enumC86168Xro2;
        if (!c10k.LJIILIIL() || (charSequence = (CharSequence) ((OSZ) c10k.LJIIJJI()).getFirst()) == null || charSequence.length() == 0) {
            if (c10k.LJIILIIL()) {
                C5S1 c5s1 = new C5S1((CropActivity) agS131S0100000_15.l0);
                c5s1.LIZJ(((Number) ((OSZ) c10k.LJIIJJI()).getSecond()).intValue());
                c5s1.LJ();
            } else {
                Exception LJIIJ = c10k.LJIIJ();
                o.LJIIIIZZ(LJIIJ, "task.error");
                C221018lt.LIZLLL("CropActivity", LJIIJ);
                C5S1 c5s12 = new C5S1((CropActivity) agS131S0100000_15.l0);
                c5s12.LIZJ(R.string.g5e);
                c5s12.LJ();
            }
        } else {
            CropActivity cropActivity = (CropActivity) agS131S0100000_15.l0;
            Object first = ((OSZ) c10k.LJIIJJI()).getFirst();
            if (first != null) {
                cropActivity.LL = (String) first;
                if (((CropActivity) agS131S0100000_15.l0).LLIIJLIL() == 1101) {
                    CropActivity cropActivity2 = (CropActivity) agS131S0100000_15.l0;
                    C81098VsE c81098VsE = cropActivity2.LJLILLLLZI;
                    if (c81098VsE != null) {
                        Bitmap bitmap = cropActivity2.LLF;
                        if (bitmap != null) {
                            Bitmap first2 = cropActivity2.LLIIJI(c81098VsE, bitmap).getFirst();
                            if (first2 != null) {
                                GradientDrawable LIZ = C57731MlD.LIZ(first2);
                                CropActivity cropActivity3 = (CropActivity) agS131S0100000_15.l0;
                                if (cropActivity3.LLILIL()) {
                                    enumC86168Xro2 = EnumC86168Xro.ROUND_CORNER_RECT;
                                } else {
                                    enumC86168Xro2 = EnumC86168Xro.DEFAULT;
                                }
                                cropActivity3.LLII(first2, LIZ, enumC86168Xro2);
                                if (((CropActivity) agS131S0100000_15.l0).LLD && (!C86179Xrz.LIZ.getBoolean("showPopWindow", false) || (!e1.LIZ(31744, "clear_change_post_crash", true, true)))) {
                                    ((CropActivity) agS131S0100000_15.l0).LLJILLL(LIZ);
                                } else {
                                    CropActivity cropActivity4 = (CropActivity) agS131S0100000_15.l0;
                                    cropActivity4.LLFII(cropActivity4.LL);
                                }
                            }
                        } else {
                            o.LJIJI("originalBitmap");
                            throw null;
                        }
                    } else {
                        o.LJIJI("mCoverImage");
                        throw null;
                    }
                } else {
                    if (!C78561UsP.LIZ((CropActivity) agS131S0100000_15.l0)) {
                        C71897SJp c71897SJp = ((CropActivity) agS131S0100000_15.l0).LJLJLLL;
                        if (c71897SJp != null) {
                            if (c71897SJp.isChecked()) {
                                CropActivity cropActivity5 = (CropActivity) agS131S0100000_15.l0;
                                C81098VsE c81098VsE2 = cropActivity5.LJLILLLLZI;
                                if (c81098VsE2 != null) {
                                    Bitmap bitmap2 = cropActivity5.LLF;
                                    if (bitmap2 != null) {
                                        Bitmap first3 = cropActivity5.LLIIJI(c81098VsE2, bitmap2).getFirst();
                                        if (first3 != null) {
                                            GradientDrawable LIZ2 = C57731MlD.LIZ(first3);
                                            CropActivity cropActivity6 = (CropActivity) agS131S0100000_15.l0;
                                            if (cropActivity6.LLILIL()) {
                                                enumC86168Xro = EnumC86168Xro.ROUND_CORNER_RECT;
                                            } else {
                                                enumC86168Xro = EnumC86168Xro.DEFAULT;
                                            }
                                            cropActivity6.LLII(first3, LIZ2, enumC86168Xro);
                                            if (((CropActivity) agS131S0100000_15.l0).LLD && (!C86179Xrz.LIZ.getBoolean("showPopWindow", false) || (!e1.LIZ(31744, "clear_change_post_crash", true, true)))) {
                                                ((CropActivity) agS131S0100000_15.l0).LLJILLL(LIZ2);
                                            } else {
                                                CropActivity cropActivity7 = (CropActivity) agS131S0100000_15.l0;
                                                cropActivity7.LLFII(cropActivity7.LL);
                                            }
                                        }
                                    } else {
                                        o.LJIJI("originalBitmap");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("mCoverImage");
                                    throw null;
                                }
                            }
                        } else {
                            o.LJIJI("postToStoryCheckBox");
                            throw null;
                        }
                    }
                    CropActivity cropActivity8 = (CropActivity) agS131S0100000_15.l0;
                    cropActivity8.LLFII(cropActivity8.LL);
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return null;
    }

    public static final Object then$6(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        CharSequence charSequence;
        EnumC86168Xro enumC86168Xro;
        if (!c10k.LJIILIIL() || (charSequence = (CharSequence) ((OSZ) c10k.LJIIJJI()).getFirst()) == null || charSequence.length() == 0) {
            if (c10k.LJIILIIL()) {
                C5S1 c5s1 = new C5S1((CropActivity) agS131S0100000_15.l0);
                c5s1.LIZJ(((Number) ((OSZ) c10k.LJIIJJI()).getSecond()).intValue());
                c5s1.LJ();
            } else {
                Exception LJIIJ = c10k.LJIIJ();
                o.LJIIIIZZ(LJIIJ, "task.error");
                C221018lt.LIZLLL("CropActivity", LJIIJ);
                C5S1 c5s12 = new C5S1((CropActivity) agS131S0100000_15.l0);
                c5s12.LIZJ(R.string.g5e);
                c5s12.LJ();
            }
        } else {
            CropActivity cropActivity = (CropActivity) agS131S0100000_15.l0;
            String str = (String) ((OSZ) c10k.LJIIJJI()).getFirst();
            if (str == null) {
                str = "";
            }
            cropActivity.LL = str;
            CropActivity cropActivity2 = (CropActivity) agS131S0100000_15.l0;
            C81098VsE c81098VsE = cropActivity2.LJLILLLLZI;
            if (c81098VsE != null) {
                Bitmap bitmap = cropActivity2.LLF;
                if (bitmap != null) {
                    Bitmap first = cropActivity2.LLIIJI(c81098VsE, bitmap).getFirst();
                    if (first != null) {
                        CropActivity cropActivity3 = (CropActivity) agS131S0100000_15.l0;
                        GradientDrawable LIZ = C57731MlD.LIZ(first);
                        if (cropActivity3.LLILIL()) {
                            enumC86168Xro = EnumC86168Xro.ROUND_CORNER_RECT;
                        } else {
                            enumC86168Xro = EnumC86168Xro.DEFAULT;
                        }
                        cropActivity3.LLII(first, LIZ, enumC86168Xro);
                        cropActivity3.LLILLL(cropActivity3.LJLLLL);
                    }
                } else {
                    o.LJIJI("originalBitmap");
                    throw null;
                }
            } else {
                o.LJIJI("mCoverImage");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }

    public static final Object then$8(AgS131S0100000_15 agS131S0100000_15, C10K it) {
        UnbindInputCodeFragment unbindInputCodeFragment = (UnbindInputCodeFragment) agS131S0100000_15.l0;
        o.LJIIIIZZ(it, "it");
        unbindInputCodeFragment.mm(it);
        return null;
    }

    public static final Object then$9(AgS131S0100000_15 agS131S0100000_15, C10K c10k) {
        C86499Xx9.LIZIZ((EnumC86518XxS) agS131S0100000_15.l0);
        return C76800UCe.LIZ;
    }
}
