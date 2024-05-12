package Y;

import X.C141335gf;
import X.C16880lQ;
import X.C1A7;
import X.C34K;
import X.C3C5;
import X.C76800UCe;
import X.C84378X9q;
import X.C84382X9u;
import X.C85813Xm5;
import X.C85814Xm6;
import X.C87030YDq;
import X.FMX;
import X.InterfaceC65784Pro;
import X.InterfaceC84368X9g;
import X.M5G;
import X.X1D;
import X.X4A;
import X.X4P;
import X.X4Q;
import X.XOY;
import X.XTH;
import X.XTK;
import X.YAM;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity;
import com.ss.android.ugc.aweme.audiomode.fullepisodev2.FullEpisodeDetailsViewModel;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseDiscoverMusicFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PodcastInfo;
import com.ss.android.ugc.aweme.inbox.monitor.InboxSampleRate;
import com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.antiaddiction.ContinuousTimeCalculator;
import com.ss.android.ugc.aweme.profile.presenter.UserIdResponse;
import com.ss.android.ugc.aweme.profile.ui.CropActivity;
import com.ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.ss.android.ugc.aweme.shortvideo.ui.AudioFocusManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public class ACallableS118S0100000_15 implements Callable {
    public final int $t;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            case 6:
                return call$6(this);
            case 7:
                return call$7(this);
            case 8:
                return call$8(this);
            case 9:
                return call$9(this);
            case 10:
                return call$10(this);
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return call$11(this);
            case 12:
                return call$12(this);
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                return call$13(this);
            case 14:
                return call$14(this);
            case 15:
                return call$15(this);
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                return call$16(this);
            case 17:
                return call$17(this);
            case 18:
                return call$18(this);
            case 19:
                return call$19(this);
            case 20:
                return call$20(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        String str;
        PodcastInfo podcastInfo;
        long playBackTime = ((FullEpisodeDetailsViewModel) aCallableS118S0100000_15.l0).getPlayBackTime();
        if (playBackTime >= ((FullEpisodeDetailsViewModel) aCallableS118S0100000_15.l0).getPlayerDuration()) {
            playBackTime = 0;
        }
        Keva repo = Keva.getRepo("FullEpisodeDetailFragment");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("full_episode_progress");
        Aweme aweme = ((FullEpisodeDetailsViewModel) aCallableS118S0100000_15.l0).aweme;
        if (aweme != null && (podcastInfo = aweme.getPodcastInfo()) != null) {
            str = podcastInfo.getEpisodeItemId();
        } else {
            str = null;
        }
        LIZ.append(str);
        repo.storeLong(X1D.LIZIZ(LIZ), playBackTime);
        return C76800UCe.LIZ;
    }

    public static final Object call$1(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        System.currentTimeMillis();
        Iterator<InterfaceC84368X9g> it = ((ContinuousTimeCalculator) aCallableS118S0100000_15.l0).observers.iterator();
        while (it.hasNext()) {
            it.next().LIZ();
        }
        return null;
    }

    public static final Object call$10(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        synchronized (((C84378X9q) aCallableS118S0100000_15.l0)) {
            C84378X9q c84378X9q = (C84378X9q) aCallableS118S0100000_15.l0;
            if (c84378X9q.LJLJLLL != null) {
                c84378X9q.LJIILL();
                if (((C84378X9q) aCallableS118S0100000_15.l0).LJ()) {
                    ((C84378X9q) aCallableS118S0100000_15.l0).LJIIL();
                    ((C84378X9q) aCallableS118S0100000_15.l0).LJLLI = 0;
                }
                return null;
            }
            return null;
        }
    }

    public static final Object call$11(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        ((BaseDiscoverMusicFragment) aCallableS118S0100000_15.l0).LJIIJJI();
        return C76800UCe.LIZ;
    }

    public static final Object call$12(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        ((XTK) aCallableS118S0100000_15.l0).LIZ.onCancel();
        return C76800UCe.LIZ;
    }

    public static final Object call$13(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        ((XTK) aCallableS118S0100000_15.l0).LIZ.onStart();
        return C76800UCe.LIZ;
    }

    public static final Object call$14(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        ((XTH) aCallableS118S0100000_15.l0).LIZ.onCancel();
        return C76800UCe.LIZ;
    }

    public static final Object call$15(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        ((XTH) aCallableS118S0100000_15.l0).LIZ.onStart();
        return C76800UCe.LIZ;
    }

    public static final Object call$16(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        ((M5G) aCallableS118S0100000_15.l0).onFailed(new Exception());
        return null;
    }

    public static final Object call$17(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        if (InboxSampleRate.LIZ(1.0f, "notice_enter_video_perf")) {
            C34K c34k = new C34K();
            JSONObject jSONObject = new JSONObject();
            YAM yam = (YAM) aCallableS118S0100000_15.l0;
            try {
                jSONObject.put("aid", yam.LIZ);
                jSONObject.put("type", yam.LIZIZ);
                jSONObject.put("nid", yam.LIZJ);
                long j = yam.LJFF - yam.LJ;
                LIZ$0(j, c34k);
                jSONObject.put("api_aweme_cost", j);
                jSONObject.put("api_aweme_status", yam.LJII);
                String str = yam.LJIIIIZZ;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                jSONObject.put("api_aweme_error", str);
                String str3 = yam.LJI;
                if (str3 != null) {
                    str2 = str3;
                }
                jSONObject.put("api_aweme_log_id", str2);
                if (yam.LJII != 0) {
                    long j2 = yam.LJFF - yam.LJ;
                    LIZ$0(j2, c34k);
                    jSONObject.put("cost", j2);
                    jSONObject.put("video_cost", 0);
                } else {
                    long j3 = yam.LJIIIZ - yam.LJ;
                    LIZ$0(j3, c34k);
                    jSONObject.put("cost", j3);
                    long j4 = yam.LJIIIZ - yam.LJFF;
                    LIZ$0(j4, c34k);
                    jSONObject.put("video_cost", j4);
                }
                jSONObject.put("invalid_metrics", c34k.element ? 1 : 0);
                C3C5.m7constructorimpl(jSONObject.put("dup_metrics", yam.LIZLLL ? 1 : 0));
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
            FMX.LJIILJJIL("notice_enter_video_perf", jSONObject);
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$18(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = ((C85813Xm5) aCallableS118S0100000_15.l0).LJLJJI;
        if (jSONObject2 != null) {
            jSONObject = JSONObjectProtectorUtils.getJSONObject(jSONObject2, "data");
        } else {
            jSONObject = null;
        }
        return C1A7.LJJIJ("description", jSONObject);
    }

    public static final Object call$19(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        JSONObject jSONObject;
        boolean z;
        String str = null;
        try {
            jSONObject = new JSONObject(((TwoStepAuthActivity) aCallableS118S0100000_15.l0).LJLJJL);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            TwoStepAuthActivity twoStepAuthActivity = (TwoStepAuthActivity) aCallableS118S0100000_15.l0;
            C85814Xm6 c85814Xm6 = twoStepAuthActivity.LJLILLLLZI;
            if (c85814Xm6 != null) {
                c85814Xm6.LJLJJI = jSONObject;
            }
            JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "data");
            if (jSONObject2 != null) {
                str = jSONObject2.optString("profile_key");
            }
            twoStepAuthActivity.LJLJJLL = str;
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object call$2(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        return C87030YDq.LIZIZ.apiExecuteGetJSONObject(((Uri.Builder) aCallableS118S0100000_15.l0).toString(), UserIdResponse.class, "", true, null, null);
    }

    public static final Object call$20(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        ((X4A) aCallableS118S0100000_15.l0).B0();
        ArrayList arrayList = new ArrayList();
        if (X4A.LJLJJLL != null) {
            Cursor cursor = null;
            try {
                cursor = X4A.LJLJJLL.rawQuery(C16880lQ.LLLZ("SELECT * FROM %s", new Object[]{"downloader"}), null);
                while (cursor.moveToNext()) {
                    arrayList.add(X4P.LJIJJ(cursor));
                }
                X4Q.LJJIII(cursor);
            } catch (Throwable unused) {
                X4Q.LJJIII(cursor);
            }
        }
        return arrayList;
    }

    public static final Object call$3(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        return ((CropActivity) aCallableS118S0100000_15.l0).LLIZLLLIL();
    }

    public static final Object call$4(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        XOY xoy = ((AudioFocusManager) aCallableS118S0100000_15.l0).LJLJI;
        xoy.getClass();
        int i = XOY.LIZJ + 1;
        XOY.LIZJ = i;
        if (i == 1 && (interfaceC65784Pro = xoy.LIZ) != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$5(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
        XOY xoy = ((AudioFocusManager) aCallableS118S0100000_15.l0).LJLJI;
        xoy.getClass();
        int i = XOY.LIZJ - 1;
        XOY.LIZJ = i;
        if (i == 0 && (interfaceC65784Pro = xoy.LIZIZ) != null) {
            interfaceC65784Pro.invoke();
        }
        return C76800UCe.LIZ;
    }

    public static final Object call$6(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        synchronized (((C84382X9u) aCallableS118S0100000_15.l0)) {
            C84382X9u c84382X9u = (C84382X9u) aCallableS118S0100000_15.l0;
            if (c84382X9u.LJLJLJ != null) {
                c84382X9u.LJIJI();
                if (((C84382X9u) aCallableS118S0100000_15.l0).LJFF()) {
                    ((C84382X9u) aCallableS118S0100000_15.l0).LJIILL();
                    ((C84382X9u) aCallableS118S0100000_15.l0).LJLL = 0;
                }
                return null;
            }
            return null;
        }
    }

    public static final Object call$7(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        Object obj = ((Object[]) aCallableS118S0100000_15.l0)[0];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Int");
        return PushSettingsApiManager.LJII(((Integer) obj).intValue());
    }

    public static final Object call$8(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        Object obj = ((Object[]) aCallableS118S0100000_15.l0)[0];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.String");
        Object obj2 = ((Object[]) aCallableS118S0100000_15.l0)[1];
        o.LJII(obj2, "null cannot be cast to non-null type kotlin.Int");
        return PushSettingsApiManager.LJIIL(((Integer) obj2).intValue(), (String) obj);
    }

    public static final Object call$9(ACallableS118S0100000_15 aCallableS118S0100000_15) {
        ((Runnable) aCallableS118S0100000_15.l0).run();
        return C76800UCe.LIZ;
    }

    public ACallableS118S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(long j, C34K c34k) {
        if (j < 0 || j > 600000) {
            c34k.element = true;
        }
    }

    public ACallableS118S0100000_15(ContinuousTimeCalculator continuousTimeCalculator, long j, int i) {
        this.$t = i;
        this.l0 = continuousTimeCalculator;
    }
}
