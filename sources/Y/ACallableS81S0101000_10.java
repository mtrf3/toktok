package Y;

import X.AbstractC37134Ehm;
import X.AbstractC62156OaO;
import X.C09970aH;
import X.C16880lQ;
import X.C61360O6i;
import X.C62159OaR;
import X.C62869Olt;
import X.C63081OpJ;
import X.C75792yF;
import X.C76L;
import X.C79004UzY;
import X.C80036Vb6;
import X.F5V;
import X.F9U;
import X.InterfaceC62173Oaf;
import X.NMA;
import X.NPQ;
import X.O76;
import X.O77;
import X.O7E;
import X.O7I;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.commercialize.splash.report.TopViewAdEventLogger;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager;
import com.ss.android.ugc.aweme.donation.DonateApi;
import com.ss.android.ugc.aweme.donation.DonateResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.i0;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class ACallableS81S0101000_10 implements Callable {
    public final int $t;
    public int i1;
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
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS81S0101000_10 aCallableS81S0101000_10) {
        boolean z;
        boolean z2;
        SharedPreferences sharedPreferences;
        File file;
        switch (aCallableS81S0101000_10.i1) {
            case 0:
                TopViewJsonManager topViewJsonManager = (TopViewJsonManager) aCallableS81S0101000_10.l0;
                if (topViewJsonManager.LJFF == 0 && (sharedPreferences = topViewJsonManager.LIZJ) != null) {
                    topViewJsonManager.LJFF = sharedPreferences.getLong("awesome_splash_last_clean_time", 0L);
                }
                long j = topViewJsonManager.LJFF;
                if (j == 0 || System.currentTimeMillis() - j >= TopViewJsonManager.LJI) {
                    SharedPreferences sharedPreferences2 = topViewJsonManager.LIZJ;
                    if (sharedPreferences2 != null) {
                        sharedPreferences2.edit().putLong("awesome_splash_last_clean_time", System.currentTimeMillis()).apply();
                    }
                    File[] listFiles = new File(TopViewJsonManager.LJIIIIZZ).listFiles();
                    if (listFiles != null) {
                        for (File file2 : listFiles) {
                            if (file2.exists() && file2.isFile() && System.currentTimeMillis() - file2.lastModified() >= TopViewJsonManager.LJII) {
                                String name = file2.getName();
                                Iterator<Map.Entry<String, Aweme>> it = topViewJsonManager.LJ(null).entrySet().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        Aweme value = it.next().getValue();
                                        if (value != null && TextUtils.equals(value.getAid(), name)) {
                                            z = true;
                                        }
                                    } else {
                                        z = false;
                                    }
                                }
                                if (!z) {
                                    C16880lQ.LLLZZIL(file2);
                                }
                            }
                        }
                    }
                }
                if (topViewJsonManager.LJ(null) == null || topViewJsonManager.LJ(null).size() == 0) {
                    topViewJsonManager.LJIIIIZZ();
                } else {
                    HashMap hashMap = new HashMap();
                    boolean z3 = false;
                    for (String str : topViewJsonManager.LJ(null).keySet()) {
                        Aweme aweme = topViewJsonManager.LJ(null).get(str);
                        if (aweme != null) {
                            if (C63081OpJ.LLIIIZ(aweme)) {
                                String aid = aweme.getAid();
                                Iterator<String> it2 = topViewJsonManager.LJ(null).keySet().iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        Aweme aweme2 = topViewJsonManager.LJ(null).get(it2.next());
                                        if (aweme2 != null && TextUtils.equals(aid, aweme2.getAid()) && !C63081OpJ.LLIIIZ(aweme2)) {
                                            z2 = false;
                                        }
                                    } else {
                                        z2 = true;
                                    }
                                }
                                if (z2) {
                                    File file3 = new File(i0.LJFF(TopViewJsonManager.LJIIIIZZ, aweme.getAid()));
                                    if (file3.exists() && file3.isFile()) {
                                        C16880lQ.LLLZZIL(file3);
                                    }
                                }
                            } else {
                                hashMap.put(str, aweme);
                            }
                        }
                        z3 = true;
                    }
                    if (z3) {
                        topViewJsonManager.LJ(null).clear();
                        topViewJsonManager.LJ(null).putAll(hashMap);
                        topViewJsonManager.LJIIIIZZ();
                    }
                }
                return null;
            case 1:
                AbstractC62156OaO abstractC62156OaO = (AbstractC62156OaO) aCallableS81S0101000_10.l0;
                abstractC62156OaO.getClass();
                try {
                    if (!abstractC62156OaO.LJLIL.LIZ()) {
                        return null;
                    }
                    Resources resources = abstractC62156OaO.getResources();
                    Object obj = abstractC62156OaO.LJLIL.LJLILLLLZI;
                    if (((InterfaceC62173Oaf) obj) != null) {
                        file = ((C62159OaR) ((InterfaceC62173Oaf) obj)).LIZ();
                    } else {
                        file = null;
                    }
                    return new BitmapDrawable(resources, file.getAbsolutePath());
                } catch (Exception unused) {
                    return null;
                }
            default:
                String LJLLJ = C16880lQ.LJLLJ(aCallableS81S0101000_10.l0.getClass());
                if (C09970aH.LIZ != null) {
                    F9U.LIZ.LIZJ(new IDRunnableS6S1000000(LJLLJ, 1));
                } else {
                    C80036Vb6.LJIIIIZZ("apm_debug", "ApmAgent#startCollectCurrent  apm do not be init");
                }
                return null;
        }
    }

    public static final Object call$1(ACallableS81S0101000_10 aCallableS81S0101000_10) {
        Map<String, Aweme> LJ;
        String str;
        Aweme aweme;
        AbstractC37134Ehm poll;
        switch (aCallableS81S0101000_10.i1) {
            case 0:
                try {
                    Map map = (Map) C75792yF.LIZIZ().LJI((String) aCallableS81S0101000_10.l0, Map.class);
                    if (map != null && map.size() > 0) {
                        C61360O6i.LIZJ().getClass();
                        List<O7E> list = O7I.LIZIZ().LIZ;
                        if (!C79004UzY.LJJIFFI(list) && (LJ = NPQ.LIZIZ.LJ(null)) != null && !LJ.isEmpty()) {
                            boolean z = false;
                            for (Map.Entry entry : map.entrySet()) {
                                String str2 = (String) entry.getKey();
                                Boolean bool = (Boolean) entry.getValue();
                                if (bool != null) {
                                    for (O7E o7e : list) {
                                        if (str2.equals(o7e.LLIILII)) {
                                            if (bool.booleanValue() && !o7e.LLJJIJIIJIL) {
                                                if (!o7e.LLJJIJIL) {
                                                    o7e.LLJJIJIIJIL = true;
                                                    JSONObject jSONObject = o7e.LLIIJLIL;
                                                    if (jSONObject != null) {
                                                        try {
                                                            jSONObject.put("is_stop_splash", true);
                                                        } catch (JSONException unused) {
                                                        }
                                                    }
                                                }
                                            } else if (!bool.booleanValue() && o7e.LLJJIJIIJIL) {
                                                o7e.LLJJIJIIJIL = false;
                                                JSONObject jSONObject2 = o7e.LLIIJLIL;
                                                if (jSONObject2 != null) {
                                                    jSONObject2.put("is_stop_splash", false);
                                                }
                                            } else if (z) {
                                                if (o7e.LLJJIJIIJIL && (str = o7e.LLIILII) != null && (aweme = LJ.get(str)) != null && aweme.getAwemeRawAd() != null) {
                                                    TopViewAdEventLogger.LJJIJ().LJIIIZ(NMA.LJIIZILJ, aweme.getAwemeRawAd(), new AObjectS42S0101000_5(2, str2, 3));
                                                }
                                            }
                                            z = true;
                                            if (o7e.LLJJIJIIJIL) {
                                                TopViewAdEventLogger.LJJIJ().LJIIIZ(NMA.LJIIZILJ, aweme.getAwemeRawAd(), new AObjectS42S0101000_5(2, str2, 3));
                                            }
                                        }
                                    }
                                }
                            }
                            if (z) {
                                C61360O6i.LIZJ().getClass();
                                O7I.LIZIZ().LIZ = list;
                                O76 LJI = O76.LJI();
                                LJI.LJIILIIL(O77.LJIILJJIL(list).toString());
                                LJI.LIZJ();
                            }
                        }
                    }
                } catch (Exception unused2) {
                }
                return null;
            default:
                F5V f5v = (F5V) aCallableS81S0101000_10.l0;
                AbstractC37134Ehm abstractC37134Ehm = f5v.LJLJJLL;
                if ((abstractC37134Ehm == null || abstractC37134Ehm.LJIIIZ.isFinished()) && (poll = f5v.LJLILLLLZI.poll()) != null) {
                    f5v.LIZJ(poll);
                }
                return null;
        }
    }

    public static final Object call$2(ACallableS81S0101000_10 aCallableS81S0101000_10) {
        C76L donateDetail;
        if (TextUtils.equals(((C62869Olt) aCallableS81S0101000_10.l0).LJLJJI, "PERCENT")) {
            C62869Olt c62869Olt = (C62869Olt) aCallableS81S0101000_10.l0;
            DonateApi donateApi = c62869Olt.LJLL;
            String str = c62869Olt.LJLIL;
            Integer valueOf = Integer.valueOf(aCallableS81S0101000_10.i1);
            C62869Olt c62869Olt2 = (C62869Olt) aCallableS81S0101000_10.l0;
            DonateResponse donateResponse = donateApi.getDonateDetailPercent(str, valueOf, c62869Olt2.LJLJI, c62869Olt2.LJLJJL, c62869Olt2.LJLJJLL, c62869Olt2.LJLJL, c62869Olt2.LJLJLJ, true).get();
            o.LJIIIIZZ(donateResponse, "apiPercent.getDonateDeta…d, itemType, extra).get()");
            return donateResponse;
        }
        C62869Olt c62869Olt3 = (C62869Olt) aCallableS81S0101000_10.l0;
        DonateApi donateApi2 = c62869Olt3.LJLJLLL;
        String str2 = c62869Olt3.LJLIL;
        Integer valueOf2 = Integer.valueOf(aCallableS81S0101000_10.i1);
        C62869Olt c62869Olt4 = (C62869Olt) aCallableS81S0101000_10.l0;
        donateDetail = donateApi2.getDonateDetail(str2, valueOf2, c62869Olt4.LJLILLLLZI, c62869Olt4.LJLJJL, c62869Olt4.LJLJJLL, c62869Olt4.LJLJL, c62869Olt4.LJLJLJ, true);
        V v = donateDetail.get();
        o.LJIIIIZZ(v, "api.getDonateDetail(aid,…d, itemType, extra).get()");
        return v;
    }

    public ACallableS81S0101000_10(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
