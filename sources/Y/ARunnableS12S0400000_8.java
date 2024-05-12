package Y;

import X.AbstractC48521J2n;
import X.AnonymousClass391;
import X.C09900aA;
import X.C165256e9;
import X.C16880lQ;
import X.C2MA;
import X.C2NU;
import X.C32151Nz;
import X.C39579Fg7;
import X.C47135Ieh;
import X.C47322Ihi;
import X.C47333Iht;
import X.C47483IkJ;
import X.C48135Iup;
import X.C48136Iuq;
import X.C48387Iyt;
import X.C48522J2o;
import X.C48523J2p;
import X.C48662J7y;
import X.C50469JrN;
import X.C50650JuI;
import X.C50651JuJ;
import X.C50652JuK;
import X.C51163K6d;
import X.C58704N2e;
import X.C63081OpJ;
import X.C72083SQt;
import X.C73340SqO;
import X.C78847Ux1;
import X.C78934UyQ;
import X.C7MY;
import X.C8HX;
import X.FMX;
import X.IPG;
import X.InterfaceC48516J2i;
import X.J3Y;
import X.JKG;
import X.JN8;
import X.JND;
import X.JQA;
import X.K94;
import X.K95;
import X.NN1;
import X.O6R;
import X.OJY;
import X.X1D;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.ss.android.ugc.aweme.video.VideoBitRateABManager;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class ARunnableS12S0400000_8 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

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
        String str;
        Long l;
        String str2;
        C50469JrN searchVideoModel;
        JN8 LIZIZ = JND.LIZIZ((JQA) this.l0);
        LIZIZ.LJIJ("search_result_id", ((JQA) this.l0).LJIILJJIL);
        LIZIZ.LJIIZILJ("token_type", ((JQA) this.l0).LJIJJLI);
        User user = (User) this.l1;
        String str3 = null;
        if (user != null) {
            str = user.getRoomTitle();
        } else {
            str = null;
        }
        LIZIZ.LIZLLL("aladdin_words", str);
        LIZIZ.LJJIII(Integer.valueOf(((JKG) this.l2).getLayoutPosition()));
        LIZIZ.LJIIZILJ("list_result_type", "live");
        User user2 = (User) this.l1;
        if (user2 != null) {
            l = Long.valueOf(C78934UyQ.LJIILJJIL(user2));
        } else {
            l = null;
        }
        LIZIZ.LJIIZILJ("list_item_id", String.valueOf(l));
        JKG jkg = (JKG) this.l2;
        if (jkg.LLIIIILZ) {
            str2 = jkg.U();
        } else {
            str2 = "";
        }
        LIZIZ.LJIIZILJ("anchor_info", str2);
        LIZIZ.LJIIZILJ("realtime_watch_user", String.valueOf(((JKG) this.l2).LLIIIJ));
        JKG jkg2 = (JKG) this.l2;
        jkg2.getClass();
        C50651JuJ c50651JuJ = C50652JuK.Companion;
        View view = jkg2.itemView;
        c50651JuJ.getClass();
        C50650JuI LJI = C50651JuJ.LJI(view);
        if (LJI != null && (searchVideoModel = LJI.getSearchVideoModel()) != null) {
            str3 = searchVideoModel.getGroupId();
        }
        LIZIZ.LJIIZILJ("last_from_group_id", str3);
        LIZIZ.LJJIIZ((Aweme) this.l3);
        LIZIZ.LJJIIZI((Aweme) this.l3);
        LIZIZ.LJIILIIL();
    }

    public final void LIZ$1() {
        long j;
        try {
            ((C48523J2p) this.l0).LJIIJ();
            if (!((AbstractC48521J2n) this.l1).LIZLLL()) {
                C48523J2p c48523J2p = (C48523J2p) this.l0;
                c48523J2p.LJII++;
                if (J3Y.LIZ) {
                    String str = c48523J2p.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("runAsyncDelay end, skip, env not ready envNotReadyTimes:");
                    LIZ.append(((C48523J2p) this.l0).LJII);
                    J3Y.LIZJ(str, X1D.LIZIZ(LIZ), null);
                }
                InterfaceC48516J2i interfaceC48516J2i = (InterfaceC48516J2i) this.l2;
                if (interfaceC48516J2i != null) {
                    interfaceC48516J2i.LIZ(new C47333Iht(-2));
                    return;
                }
                return;
            }
            ((C48523J2p) this.l0).LJIIIZ((C47322Ihi) this.l3);
            if (J3Y.LIZ) {
                j = System.currentTimeMillis();
            } else {
                j = 0;
            }
            AbstractC48521J2n abstractC48521J2n = (AbstractC48521J2n) this.l1;
            C47322Ihi c47322Ihi = (C47322Ihi) this.l3;
            abstractC48521J2n.LJFF(c47322Ihi, new C48522J2o((C48523J2p) this.l0, c47322Ihi, abstractC48521J2n, (InterfaceC48516J2i) this.l2, j));
        } catch (Throwable unused) {
            J3Y.LIZIZ().LIZIZ(((C48523J2p) this.l0).LIZIZ, "runAsyncDelay error:");
            InterfaceC48516J2i interfaceC48516J2i2 = (InterfaceC48516J2i) this.l2;
            if (interfaceC48516J2i2 != null) {
                interfaceC48516J2i2.LIZ(new C47333Iht(-6));
            }
        }
    }

    public final void LIZ$2() {
        int measureText = (int) ((TextView) this.l0).getPaint().measureText(((TextView) this.l0).getHint().toString());
        int measuredWidth = ((TextView) this.l0).getMeasuredWidth() - measureText;
        int paddingEnd = ((ViewGroup) this.l2).getPaddingEnd() + O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)) + ((K95) this.l1).LIZIZ;
        if (paddingEnd > measuredWidth) {
            C51163K6d c51163K6d = (C51163K6d) this.l3;
            c51163K6d.LIZJ = true;
            c51163K6d.LIZLLL = C7MY.LIZIZ(0);
            ((C51163K6d) this.l3).LJ = paddingEnd;
        } else {
            ((ViewGroup) this.l2).setPaddingRelative(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), (((TextView) this.l0).getMeasuredWidth() - measureText) - paddingEnd, 0);
        }
        K94.LIZLLL((C51163K6d) this.l3, (ViewGroup) this.l2, (TextView) this.l0);
    }

    public final void LIZ$3() {
        int measureText = (int) ((TextView) this.l0).getPaint().measureText(((TextView) this.l0).getHint().toString());
        if (((K95) this.l1).LIZIZ > ((((TextView) this.l0).getMeasuredWidth() - ((TextView) this.l0).getPaddingStart()) - ((TextView) this.l0).getPaddingEnd()) - measureText) {
            C51163K6d c51163K6d = (C51163K6d) this.l2;
            c51163K6d.LIZJ = true;
            c51163K6d.LIZLLL = AnonymousClass391.LIZ(32.5d);
            ((C51163K6d) this.l2).LJ = ((ViewGroup) this.l3).getPaddingEnd() + ((ViewGroup) this.l3).getPaddingStart() + ((K95) this.l1).LIZIZ;
        } else {
            ((ViewGroup) this.l3).setPaddingRelative(0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)), C47135Ieh.LIZ(2, ((((TextView) this.l0).getMeasuredWidth() - ((TextView) this.l0).getPaddingStart()) - measureText) - ((K95) this.l1).LIZIZ), 0);
        }
        K94.LIZLLL((C51163K6d) this.l2, (ViewGroup) this.l3, (TextView) this.l0);
    }

    public static final void run$0(ARunnableS12S0400000_8 aRunnableS12S0400000_8) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        String str;
        String c165256e9;
        C48662J7y c48662J7y = (C48662J7y) aRunnableS12S0400000_8.l0;
        IPG ipg = (IPG) aRunnableS12S0400000_8.l1;
        Video video = (Video) aRunnableS12S0400000_8.l2;
        C2MA c2ma = (C2MA) aRunnableS12S0400000_8.l3;
        c48662J7y.getClass();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sourceId", ipg.LIZ);
            jSONObject3.put("errorCode", ipg.LJ);
            jSONObject3.put("errorExtra", ipg.LJFF);
            C48387Iyt c48387Iyt = C48136Iuq.LIZ;
            jSONObject3.put("netWorkQuality", c48387Iyt.LIZIZ().toString());
            jSONObject3.put("netWorkSpeed", (int) c48387Iyt.LIZJ());
            jSONObject3.put("playUrl", JsonParseUtils.LIZLLL(video.getProperPlayAddr()));
            jSONObject3.put("playUrlIsLowBr", video.isLowBr());
            jSONObject3.put("video_duration", video.getDuration());
            C47483IkJ.LIZIZ(jSONObject3);
            Object obj = ipg.LJI;
            if (obj != null) {
                jSONObject3.put("extraInfo", obj.toString());
            }
            File LJIIIZ = C39579Fg7.LJIIIZ(C39579Fg7.LJIIL());
            video.getProperPlayAddr();
            if (LJIIIZ == null) {
                c165256e9 = "";
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LJIIIZ.getPath());
                LIZ.append("/");
                C48135Iup c48135Iup = C48135Iup.LIZ;
                String bitRatedRatioUri = video.getPlayAddr().getBitRatedRatioUri();
                c48135Iup.getClass();
                LIZ.append(C48135Iup.LIZ(bitRatedRatioUri));
                c165256e9 = new C165256e9(X1D.LIZIZ(LIZ)).toString();
            }
            jSONObject3.put("file", c165256e9);
            jSONObject = new JSONObject(jSONObject3.toString());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            jSONObject = null;
        }
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("play_error");
        obtain.setLabelName("perf_monitor");
        obtain.setJsonObject(jSONObject);
        FMX.onEvent(obtain);
        boolean z = false;
        if (C72083SQt.LJJLIIIJLLLLLLLZ(c2ma)) {
            try {
                jSONObject2 = new JSONObject(jSONObject3.toString());
                jSONObject2.put("aweme_id", c2ma.getCurrentAweme().getAid());
                jSONObject2.put("creative_id", c2ma.getCurrentAweme().getAwemeRawAd().getCreativeId());
                if (C63081OpJ.LLIIII(c2ma.getCurrentAweme())) {
                    jSONObject2.put("is_topview", true);
                }
            } catch (Exception unused) {
                jSONObject2 = new JSONObject();
            }
            C09900aA.LJIIJJI("aweme_ad_media_play_error_rate", 1, jSONObject2);
            C09900aA.LJIIJJI("aweme_ad_media_play_error", 1, jSONObject2);
            Aweme currentAweme = c2ma.getCurrentAweme();
            if (currentAweme != null && currentAweme.isAd()) {
                OJY LJIL = C73340SqO.LJIL();
                Context LJJIIZ = c48662J7y.LJJIIZ();
                LJIL.getClass();
                NN1.LJJJJI(LJJIIZ, "play_failed", currentAweme, NN1.LJIIL(LJJIIZ, currentAweme, false, null));
                C58704N2e.LIZLLL("draw_ad", "play_failed", currentAweme.getAwemeRawAd()).LJII();
            }
        }
        c48662J7y.LJJIIZ();
        try {
            z = C2NU.LIZ.LIZIZ();
        } catch (Exception unused2) {
        }
        if (z) {
            C09900aA.LJIIJJI("aweme_media_error_rate", 1, jSONObject3);
            if (C72083SQt.LJJLL(c2ma)) {
                C78847Ux1.LJJJJLI(1, 1, c2ma.getCurrentAweme());
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("alarm_reason", "fail_to_play");
                    if (c2ma.getCurrentAweme() != null) {
                        jSONObject4.put("group_id", c2ma.getCurrentAweme().getAid());
                    }
                } catch (Exception e2) {
                    C16880lQ.LLLLIIL(e2);
                }
                MobClick obtain2 = MobClick.obtain();
                obtain2.setEventName("ad_alarm");
                obtain2.setLabelName("homepage_hot");
                obtain2.setJsonObject(jSONObject4);
                FMX.onEvent(obtain2);
            }
            if (VideoBitRateABManager.LJFF.LJ()) {
                str = "aweme_media_bitrated_error_rate";
            } else {
                str = "aweme_media_original_error_rate";
            }
            C09900aA.LJIIJJI(str, 1, jSONObject3);
        }
        C8HX.LIZIZ("aweme_media_play_error_log", "play_error", jSONObject3);
    }

    public static final void run$1(ARunnableS12S0400000_8 aRunnableS12S0400000_8) {
        boolean LIZ;
        try {
            aRunnableS12S0400000_8.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS12S0400000_8 aRunnableS12S0400000_8) {
        boolean LIZ;
        try {
            aRunnableS12S0400000_8.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS12S0400000_8 aRunnableS12S0400000_8) {
        boolean LIZ;
        try {
            aRunnableS12S0400000_8.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS12S0400000_8 aRunnableS12S0400000_8) {
        boolean LIZ;
        try {
            aRunnableS12S0400000_8.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS12S0400000_8(android.view.ViewGroup r2, android.widget.TextView r3, X.K95 r4, X.C51163K6d r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 3: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r5
            r0.l3 = r2
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l0 = r3
            r0.l1 = r4
            r0.l2 = r2
            r0.l3 = r5
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS12S0400000_8.<init>(android.view.ViewGroup, android.widget.TextView, X.K95, X.K6d, int):void");
    }

    public ARunnableS12S0400000_8(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
