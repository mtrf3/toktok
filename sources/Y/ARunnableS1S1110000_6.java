package Y;

import X.C16880lQ;
import X.C38074Eww;
import X.C38185Eyj;
import X.C38692FGm;
import X.C38694FGo;
import X.C38696FGq;
import X.C38995FSd;
import X.C65087PgZ;
import X.C77800Ug8;
import X.C78983UzD;
import X.EJ6;
import X.InterfaceC38071Ewt;
import X.X1D;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.newmedia.ad.WebAdUserAgentServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.ISimpleNetworkApi;
import com.ss.android.ugc.aweme.multi.maker.GamingAnchorMaker;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class ARunnableS1S1110000_6 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (((C38074Eww) this.l1).LIZ != null) {
            C38185Eyj c38185Eyj = new C38185Eyj();
            c38185Eyj.LIZJ(Boolean.valueOf(!TextUtils.isEmpty(this.s0)), "value");
            c38185Eyj.LIZ("label_permission_storage", ((C38074Eww) this.l1).LIZ);
        }
        if (!TextUtils.isEmpty(this.s0)) {
            try {
                JSONObject jSONObject = new JSONObject(this.s0);
                C38074Eww c38074Eww = (C38074Eww) this.l1;
                c38074Eww.LJ.LIZLLL(c38074Eww.LIZ, jSONObject);
                if (this.z2 && ((C38074Eww) this.l1).LIZIZ.LIZ() != null) {
                    ((InterfaceC38071Ewt) ((C38074Eww) this.l1).LIZIZ.LIZ()).LIZ(((C38074Eww) this.l1).LIZJ, jSONObject);
                }
            } catch (JSONException unused) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Parse configurations failed, local storage content: ");
                LIZ.append(this.s0);
                X1D.LIZIZ(LIZ);
            }
        }
    }

    public final void LIZ$2() {
        C38694FGo c38694FGo = ((C38692FGm) this.l1).LJII;
        String str = this.s0;
        boolean z = this.z2;
        if (c38694FGo.LJIIIIZZ.containsKey(str)) {
            if (z && TextUtils.isEmpty(c38694FGo.LJI)) {
                return;
            }
            String str2 = c38694FGo.LJIIIIZZ.get(str);
            if (TextUtils.isEmpty(str2) || ((ConcurrentSkipListSet) c38694FGo.LIZJ).contains(str2) || ((ConcurrentSkipListSet) c38694FGo.LJ).contains(str2)) {
                return;
            }
            if (z) {
                ((ConcurrentSkipListSet) c38694FGo.LJ).add(str2);
                Context context = c38694FGo.LIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("SP_EXPERIMENT_EXPOSURE_CACHE_");
                LIZ.append(c38694FGo.LJI);
                C38696FGq.LIZ(new ARunnableS6S2200000_6(context, X1D.LIZIZ(LIZ), c38694FGo.LJ, 1));
            } else {
                ((ConcurrentSkipListSet) c38694FGo.LIZJ).add(str2);
                C38696FGq.LIZ(new ARunnableS6S2200000_6(c38694FGo.LIZ, "SP_EXPERIMENT_EXPOSURE_CACHE", c38694FGo.LIZJ, 1));
            }
            c38694FGo.LIZJ();
        }
    }

    public final void LIZ$3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new EJ6("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9"));
        arrayList.add(new EJ6("referer", "https://www.tiktok.com/"));
        for (Map.Entry<String, String> entry : WebAdUserAgentServiceImpl.LIZIZ().LIZ((WebView) this.l1, this.s0, this.z2).entrySet()) {
            C77800Ug8.LJFF(entry.getKey(), entry.getValue(), arrayList);
        }
        C65087PgZ LIZ = RetrofitFactory.LIZLLL().LIZ(this.s0);
        LIZ.LIZIZ = true;
        LIZ.LIZJ = true;
        try {
            ((ISimpleNetworkApi) LIZ.LJFF().LIZ.LIZ(ISimpleNetworkApi.class)).doGetForString(false, -1, "", null, arrayList, null).execute();
        } catch (Exception e) {
            C78983UzD.LJIJ(e, "send preload h5 network failed");
        }
    }

    public final void LIZ$1() {
        try {
            C65087PgZ LIZ = RetrofitFactory.LIZLLL().LIZ("https://view.adjust.com");
            LIZ.LIZJ = true;
            GamingAnchorMaker.AttributionUtil.AttributionApi attributionApi = (GamingAnchorMaker.AttributionUtil.AttributionApi) LIZ.LJFF().LIZ.LIZ(GamingAnchorMaker.AttributionUtil.AttributionApi.class);
            if (this.z2) {
                String str = this.s0;
                ((GamingAnchorMaker.AttributionUtil) this.l1).getClass();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Mozilla/5.0 (Linux; Android ");
                LIZ2.append(Build.VERSION.RELEASE);
                LIZ2.append("; ");
                LIZ2.append(Build.MODEL);
                LIZ2.append(')');
                attributionApi.monitorWithHeader(str, X1D.LIZIZ(LIZ2)).execute();
            } else {
                attributionApi.monitor(this.s0).execute();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final void run$0(ARunnableS1S1110000_6 aRunnableS1S1110000_6) {
        boolean LIZ;
        try {
            aRunnableS1S1110000_6.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S1110000_6 aRunnableS1S1110000_6) {
        boolean LIZ;
        try {
            GamingAnchorMaker.AttributionUtil attributionUtil = (GamingAnchorMaker.AttributionUtil) aRunnableS1S1110000_6.l1;
            String str = aRunnableS1S1110000_6.s0;
            boolean z = aRunnableS1S1110000_6.z2;
            if (!attributionUtil.LIZ) {
                attributionUtil.LIZ = true;
                if (str != null && str.length() != 0) {
                    C38995FSd.LIZLLL().submit(new ARunnableS1S1110000_6(attributionUtil, str, z, 2));
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS1S1110000_6 aRunnableS1S1110000_6) {
        boolean LIZ;
        try {
            aRunnableS1S1110000_6.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS1S1110000_6 aRunnableS1S1110000_6) {
        boolean LIZ;
        try {
            aRunnableS1S1110000_6.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS1S1110000_6 aRunnableS1S1110000_6) {
        boolean LIZ;
        try {
            aRunnableS1S1110000_6.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS1S1110000_6(C38692FGm c38692FGm, String str, int i) {
        this.$t = i;
        this.l1 = c38692FGm;
        this.s0 = str;
        this.z2 = false;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS1S1110000_6(com.ss.android.ugc.aweme.multi.maker.GamingAnchorMaker.AttributionUtil r2, java.lang.String r3, boolean r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 1: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.z2 = r4
            r0.s0 = r3
            r0.l1 = r2
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l1 = r2
            r0.s0 = r3
            r0.z2 = r4
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS1S1110000_6.<init>(com.ss.android.ugc.aweme.multi.maker.GamingAnchorMaker$AttributionUtil, java.lang.String, boolean, int):void");
    }

    public ARunnableS1S1110000_6(Object obj, String str, boolean z, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.z2 = z;
    }
}
