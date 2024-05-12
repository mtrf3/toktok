package Y;

import X.C10I;
import X.C10K;
import X.C16880lQ;
import X.C268613q;
import X.C44426Hc6;
import X.C5S1;
import X.C64698PaI;
import X.C76800UCe;
import X.C78688UuS;
import X.C82544WaS;
import X.C85136XbA;
import X.C85144XbI;
import X.C86253XtB;
import X.EnumC85151XbP;
import X.V16;
import X.XRT;
import X.XVW;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationActivityViewModel;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.fe.method.upload.config.I18nUploadAuthConfig;
import com.ss.android.ugc.aweme.fe.method.upload.config.UploadConfig;
import com.ss.android.ugc.aweme.music.model.MusicList;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS181S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public class AgS50S1100000_15 implements C10I {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.C10I
    public final Object then(C10K<AddVerificationResponse> c10k) {
        switch (this.$t) {
            case 0:
                return then$0(this, c10k);
            case 1:
                return then$1(this, c10k);
            case 2:
                return then$2(this, c10k);
            case 3:
                return then$3(this, c10k);
            default:
                return null;
        }
    }

    public static final Object then$0(AgS50S1100000_15 agS50S1100000_15, C10K c10k) {
        Integer num;
        String str;
        C85136XbA c85136XbA;
        if (!C82544WaS.LJ(c10k)) {
            TwoStepVerificationActivityViewModel.hv0((TwoStepVerificationActivityViewModel) agS50S1100000_15.l1, null, null, 7);
            if (c10k.LJIIJ() instanceof C64698PaI) {
                TwoStepVerificationActivityViewModel twoStepVerificationActivityViewModel = (TwoStepVerificationActivityViewModel) agS50S1100000_15.l1;
                Exception LJIIJ = c10k.LJIIJ();
                o.LJIIIIZZ(LJIIJ, "it.error");
                TwoStepVerificationActivityViewModel.hv0(twoStepVerificationActivityViewModel, Integer.valueOf(C78688UuS.LJJIIZ(LJIIJ)), null, 6);
            } else {
                TwoStepVerificationActivityViewModel.hv0((TwoStepVerificationActivityViewModel) agS50S1100000_15.l1, null, null, 7);
            }
            return null;
        }
        AddVerificationResponse addVerificationResponse = (AddVerificationResponse) c10k.LJIIJJI();
        if (!ujb.o.LJJJJIZL("success", addVerificationResponse.getMessage(), true) || addVerificationResponse.getData() == null) {
            AddVerificationResponse.Data data = addVerificationResponse.getData();
            if (data != null) {
                num = data.getErrorCode();
            } else {
                num = null;
            }
            AddVerificationResponse.Data data2 = addVerificationResponse.getData();
            if (data2 != null) {
                str = data2.getErrorDescription();
            } else {
                str = null;
            }
            if (num == null || num.intValue() != 1356) {
                TwoStepVerificationActivityViewModel.hv0((TwoStepVerificationActivityViewModel) agS50S1100000_15.l1, num, str, 4);
            } else {
                ((TwoStepVerificationActivityViewModel) agS50S1100000_15.l1).Hv0("", new AqS181S0100000_15((TwoStepVerificationActivityViewModel) agS50S1100000_15.l1, 40));
            }
            return null;
        }
        ((TwoStepVerificationActivityViewModel) agS50S1100000_15.l1).LJLJJI.setAuthDeviceListStatus(null);
        C85144XbI.LJIILIIL("turn_off", ((TwoStepVerificationActivityViewModel) agS50S1100000_15.l1).getEnterFrom(), agS50S1100000_15.s0, true, true, true, true);
        Map<EnumC85151XbP, C85136XbA> map = ((TwoStepVerificationActivityViewModel) agS50S1100000_15.l1).LJLJJL;
        EnumC85151XbP enumC85151XbP = EnumC85151XbP.TOTP;
        C85136XbA c85136XbA2 = (C85136XbA) ((LinkedHashMap) map).get(enumC85151XbP);
        if (c85136XbA2 != null) {
            c85136XbA = C85136XbA.LIZ(c85136XbA2, false, false, null, false, false, 62);
        } else {
            c85136XbA = new C85136XbA(false, false, enumC85151XbP, null, false, false, 58);
        }
        map.put(enumC85151XbP, c85136XbA);
        ((TwoStepVerificationActivityViewModel) agS50S1100000_15.l1).zv0(addVerificationResponse);
        return C76800UCe.LIZ;
    }

    public static final Object then$1(AgS50S1100000_15 agS50S1100000_15, C10K c10k) {
        try {
            if (c10k != null) {
                if (!c10k.LJIILJJIL() && ((BaseResponse) c10k.LJIIJJI()).status_code == 0) {
                    UploadConfig uploadConfig = ((I18nUploadAuthConfig) c10k.LJIIJJI()).getUploadConfig();
                    if (uploadConfig != null) {
                        C86253XtB c86253XtB = (C86253XtB) agS50S1100000_15.l1;
                        String str = agS50S1100000_15.s0;
                        UploadConfig uploadConfig2 = c86253XtB.LJLJLLL;
                        if (uploadConfig2 != null) {
                            uploadConfig2.setVideoHostName(uploadConfig.getVideoHostName());
                            c86253XtB.LJFF(str);
                            return null;
                        }
                        long LJIIIZ = C268613q.LJIIIZ(c86253XtB.LJLJJLL.get(), UriProtector.parse(str));
                        if (LJIIIZ > uploadConfig.getMaxFileSize()) {
                            C5S1 c5s1 = new C5S1(c86253XtB.LJLJJLL.get());
                            c5s1.LIZJ(R.string.tn4);
                            c5s1.LJ();
                            c86253XtB.LIZJ(0, "uploadFailed");
                            return null;
                        }
                        c86253XtB.LJI(str, LJIIIZ, uploadConfig);
                        c86253XtB.LJLJL.LIZLLL(c86253XtB.LJLJJLL.get(), c86253XtB);
                        return null;
                    }
                    return null;
                }
                if (!c10k.LJIILJJIL()) {
                    if (((BaseResponse) c10k.LJIIJJI()).status_code != 0) {
                        C86253XtB c86253XtB2 = (C86253XtB) agS50S1100000_15.l1;
                        int i = ((BaseResponse) c10k.LJIIJJI()).status_code;
                        String str2 = ((BaseResponse) c10k.LJIIJJI()).message;
                        o.LJIIIIZZ(str2, "task.result.message");
                        c86253XtB2.LIZJ(i, str2);
                    }
                    ((C86253XtB) agS50S1100000_15.l1).LIZIZ().close();
                    return null;
                }
            }
            ((C86253XtB) agS50S1100000_15.l1).LIZIZ().close();
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
        ((C86253XtB) agS50S1100000_15.l1).LIZJ(0, "uploadFailed");
    }

    public static final Object then$2(AgS50S1100000_15 agS50S1100000_15, C10K c10k) {
        XVW xvw = (XVW) agS50S1100000_15.l1;
        String str = agS50S1100000_15.s0;
        xvw.LJIILIIL = false;
        if (c10k.LJIILJJIL()) {
            xvw.LIZIZ.jv0(1, "refresh_status_music_list");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        xvw.LIZIZ.jv0(0, "refresh_status_music_list");
        MusicList musicList = (MusicList) c10k.LJIIJJI();
        XRT xrt = new XRT();
        xrt.LIZ.put("list_cursor", Integer.valueOf(musicList.getCursor()));
        xrt.LIZ.put("list_hasmore", Integer.valueOf(musicList.hasMore));
        xrt.LIZ.put("action_type", 1);
        xrt.LIZ.put("suggestion_id", musicList.suggestionId);
        xrt.LIZIZ("vertical_playlist", musicList.getIsVerticalPlaylist());
        List<MusicModel> LIZIZ = C44426Hc6.LIZIZ(musicList.items, musicList.extra);
        if (LIZIZ != null) {
            Iterator it = ((ArrayList) LIZIZ).iterator();
            while (it.hasNext()) {
                MusicModel musicModel = (MusicModel) it.next();
                if (musicModel != null) {
                    musicModel.setCategoryID(str);
                }
            }
        }
        V16.LJJJLZIJ(xrt, LIZIZ);
        xvw.LIZIZ.jv0(xrt, "music_list");
        xvw.LIZIZ.jv0(musicList.mcInfo.shareInfo, "data_share_info");
        return null;
    }

    public static final Object then$3(AgS50S1100000_15 agS50S1100000_15, C10K c10k) {
        XVW xvw = (XVW) agS50S1100000_15.l1;
        String str = agS50S1100000_15.s0;
        xvw.LJIILIIL = false;
        if (c10k.LJIILJJIL()) {
            xvw.LIZIZ.jv0(1, "loadmore_status_music_list");
            return null;
        }
        if (!c10k.LJIILIIL()) {
            return null;
        }
        xvw.LIZIZ.jv0(0, "loadmore_status_music_list");
        MusicList musicList = (MusicList) c10k.LJIIJJI();
        List LJIL = V16.LJIL((XRT) xvw.LIZIZ.get("music_list"));
        List<MusicModel> LIZIZ = C44426Hc6.LIZIZ(musicList.items, musicList.extra);
        if (LIZIZ != null) {
            Iterator it = ((ArrayList) LIZIZ).iterator();
            while (it.hasNext()) {
                MusicModel musicModel = (MusicModel) it.next();
                if (musicModel != null) {
                    musicModel.setCategoryID(str);
                }
            }
        }
        LJIL.addAll(LIZIZ);
        XRT xrt = new XRT();
        xrt.LIZ.put("list_cursor", Integer.valueOf(musicList.getCursor()));
        xrt.LIZ.put("list_hasmore", Integer.valueOf(musicList.hasMore));
        xrt.LIZIZ("action_type", 2);
        V16.LJJJLZIJ(xrt, LJIL);
        xvw.LIZIZ.jv0(xrt, "music_list");
        return null;
    }

    public AgS50S1100000_15(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
