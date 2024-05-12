package Y;

import X.ActivityC45651qj;
import X.C16650l3;
import X.C16880lQ;
import X.C188727au;
import X.C36922EeM;
import X.C38583FCh;
import X.C42193GhB;
import X.C54149LMz;
import X.C54764LeS;
import X.C54765LeT;
import X.C54767LeV;
import X.C54771LeZ;
import X.C54772Lea;
import X.C54789Ler;
import X.C54808LfA;
import X.C55096Ljo;
import X.C55714Ltm;
import X.C56374MAo;
import X.C65352Pkq;
import X.C65776Prg;
import X.C73849Syb;
import X.C73969T1h;
import X.C77266UUc;
import X.C78866UxK;
import X.C87277YNd;
import X.ED2;
import X.EnumC53761L8b;
import X.FMX;
import X.InterfaceC88472Yns;
import X.LGX;
import X.LPO;
import X.LPX;
import X.T16;
import X.TBW;
import X.UQF;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.keva.Keva;
import com.bytedance.tiktok.homepage.mainfragment.BottomTabProtocol;
import com.bytedance.tiktok.homepage.mainfragment.HomeTabAbility;
import com.ss.android.ugc.aweme.detail.panel.DetailFragmentPanel;
import com.ss.android.ugc.aweme.ecommerce.ug.common.assem.EcUgMainAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import com.ss.android.ugc.aweme.story.base.distribution.dispatcher.StoryReceiver;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import o3.h0;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class ARunnableS8S1200000_9 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

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
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        MainActivityScope LJJLIIIJJI;
        HomeTabAbility LJIL;
        String str;
        BottomTabProtocol bottomTabProtocol;
        try {
            String str2 = "";
            ActivityC45651qj LJIIIIZZ = C55096Ljo.LJIIIIZZ((EcUgMainAssem) this.l1);
            int i = 0;
            if (LJIIIIZZ != null && (LJJLIIIJJI = C78866UxK.LJJLIIIJJI(LJIIIIZZ)) != null && (LJIL = C87277YNd.LJIL(LJJLIIIJJI)) != null) {
                String LIZ = ED2.LIZ(C16880lQ.LLJJIJIIJIL((Intent) this.l2, "extra_position_type"));
                if (o.LJ(CardStruct.IStatusCode.DEFAULT, LIZ)) {
                    if (LJIL.jc()) {
                        i = 1;
                    } else {
                        Iterator<BottomTabProtocol> it = LJIL.ed().iterator();
                        while (true) {
                            str = null;
                            if (it.hasNext()) {
                                bottomTabProtocol = it.next();
                                if (bottomTabProtocol.LIZLLL() == EnumC53761L8b.TAB_2) {
                                    break;
                                }
                            } else {
                                bottomTabProtocol = null;
                                break;
                            }
                        }
                        BottomTabProtocol bottomTabProtocol2 = bottomTabProtocol;
                        if (bottomTabProtocol2 != null) {
                            str = bottomTabProtocol2.getTag();
                        }
                        str2 = ED2.LIZ(str);
                    }
                } else if (o.LJ("1", LIZ) && LJIL.is("Shop")) {
                    i = 2;
                }
            }
            C38583FCh.LIZIZ(i, this.s0, str2, ED2.LIZ(C16880lQ.LLJJIJIIJIL((Intent) this.l2, "extra_route_schema")));
        } catch (Throwable unused) {
        }
    }

    public final void LIZ$1() {
        JSONObject jSONObject;
        int doubleValue;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        Object obj;
        String str;
        Aweme aweme;
        Aweme aweme2;
        int i6;
        String groupId;
        try {
            if (LPO.LIZ() && (jSONObject = (JSONObject) this.l1) != null) {
                if (!jSONObject.has("downX")) {
                    doubleValue = 0;
                } else {
                    Object obj2 = ((JSONObject) this.l1).get("downX");
                    o.LJII(obj2, "null cannot be cast to non-null type kotlin.Double");
                    doubleValue = (int) ((Double) obj2).doubleValue();
                }
                if (((JSONObject) this.l1).has("downY")) {
                    Object obj3 = ((JSONObject) this.l1).get("downY");
                    o.LJII(obj3, "null cannot be cast to non-null type kotlin.Double");
                    i = (int) ((Double) obj3).doubleValue();
                } else {
                    i = 0;
                }
                if (((JSONObject) this.l1).has("upX")) {
                    Object obj4 = ((JSONObject) this.l1).get("upX");
                    o.LJII(obj4, "null cannot be cast to non-null type kotlin.Double");
                    i2 = (int) ((Double) obj4).doubleValue();
                } else {
                    i2 = 0;
                }
                if (((JSONObject) this.l1).has("downY")) {
                    Object obj5 = ((JSONObject) this.l1).get("upY");
                    o.LJII(obj5, "null cannot be cast to non-null type kotlin.Double");
                    i3 = (int) ((Double) obj5).doubleValue();
                } else {
                    i3 = 0;
                }
                if (doubleValue == 0 && i == 0 && i2 == 0 && i3 == 0) {
                    return;
                }
                int i7 = LPX.LIZIZ;
                int i8 = 2;
                if (doubleValue > i7 / 2) {
                    i4 = 2;
                } else {
                    i4 = 1;
                }
                if (i2 <= i7 / 2) {
                    i8 = 1;
                }
                if (i4 == i8) {
                    z = true;
                } else {
                    z = false;
                }
                if (LPX.LIZ()) {
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("type", "scroll_feed");
                    c188727au.LIZLLL((doubleValue * 100) / i7, "x");
                    int i9 = LPX.LIZJ;
                    c188727au.LIZLLL((i * 100) / i9, "y");
                    c188727au.LIZLLL(((i2 - doubleValue) * 100) / i7, "dx");
                    c188727au.LIZLLL(((i3 - i) * 100) / i9, "dy");
                    if (!z) {
                        i8 = 0;
                    }
                    c188727au.LIZLLL(i8, "side");
                    if (LPX.LIZIZ()) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                    c188727au.LIZLLL(i5, "rtl");
                    String str2 = this.s0;
                    String str3 = "";
                    if (str2 == null) {
                        str2 = "";
                    }
                    c188727au.LJIIIZ("enter_from", str2);
                    Aweme aweme3 = (Aweme) this.l2;
                    if (aweme3 == null) {
                        obj = "";
                    } else {
                        obj = Integer.valueOf(aweme3.getAwemeType());
                    }
                    c188727au.LJFF(obj, "aweme_type");
                    Aweme aweme4 = (Aweme) this.l2;
                    if (aweme4 != null) {
                        str = aweme4.getAuthorUid();
                        if (str == null) {
                        }
                        c188727au.LJIIIZ("author_id", str);
                        aweme = (Aweme) this.l2;
                        if (aweme != null && (groupId = aweme.getGroupId()) != null) {
                            str3 = groupId;
                        }
                        c188727au.LJIIIZ("group_id", str3);
                        aweme2 = (Aweme) this.l2;
                        if (aweme2 == null && aweme2.isAd()) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        c188727au.LIZLLL(i6, "is_ads");
                        FMX.LJIIL("event_hot_area", c188727au.LIZ);
                    }
                    str = "";
                    c188727au.LJIIIZ("author_id", str);
                    aweme = (Aweme) this.l2;
                    if (aweme != null) {
                        str3 = groupId;
                    }
                    c188727au.LJIIIZ("group_id", str3);
                    aweme2 = (Aweme) this.l2;
                    if (aweme2 == null) {
                    }
                    i6 = 0;
                    c188727au.LIZLLL(i6, "is_ads");
                    FMX.LJIIL("event_hot_area", c188727au.LIZ);
                }
                Keva keva = LPX.LIZ;
                keva.storeInt("scroll_feed", keva.getInt("scroll_feed", 0) + 1);
                keva.storeLong("scroll_feed_time", System.currentTimeMillis());
            }
        } catch (Exception e) {
            C36922EeM.LIZ(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$2() {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS8S1200000_9.LIZ$2():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$3() {
        /*
            r8 = this;
            java.lang.Object r1 = r8.l1
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            r4 = 0
            if (r1 == 0) goto L76
            java.lang.String r0 = "isSuccess"
            boolean r7 = r1.optBoolean(r0)
        Ld:
            java.lang.Object r1 = r8.l1
            org.json.JSONObject r1 = (org.json.JSONObject) r1
            if (r1 == 0) goto L73
            java.lang.String r0 = "from"
            int r6 = r1.optInt(r0)
            r0 = -1
            if (r6 != r0) goto L74
            r3 = 1
        L1d:
            java.lang.Object r0 = r8.l2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            boolean r0 = X.C54944LhM.LIZLLL(r0)
            if (r0 == 0) goto L35
            java.lang.String r5 = r8.s0
            java.lang.Object r0 = r8.l2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 == 0) goto L35
            java.lang.String r0 = r0.getAid()
            if (r0 != 0) goto L4c
        L35:
            java.lang.String r1 = r8.s0
            if (r7 == 0) goto L44
            java.lang.Object r0 = r8.l2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            boolean r0 = X.C54944LhM.LIZLLL(r0)
            if (r0 == 0) goto L44
            r4 = 1
        L44:
            java.lang.Object r0 = r8.l2
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.ss.android.ugc.aweme.feed.model.Aweme) r0
            X.C54944LhM.LJ(r0, r1, r4, r3)
            return
        L4c:
            boolean r1 = X.C48236IwS.LJIIL(r0)
            X.7au r2 = new X.7au
            r2.<init>()
            java.lang.String r0 = "enter_from"
            r2.LJIIIZ(r0, r5)
            java.lang.String r0 = "cache"
            r2.LIZLLL(r1, r0)
            r1 = r7 ^ 1
            java.lang.String r0 = "is_success"
            r2.LIZLLL(r1, r0)
            java.lang.String r0 = "image_cdn_hit"
            r2.LIZLLL(r6, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r2.LIZ
            java.lang.String r0 = "music_turntable_image_download_status"
            X.FMX.LJIIL(r0, r1)
            goto L35
        L73:
            r6 = 0
        L74:
            r3 = 0
            goto L1d
        L76:
            r7 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS8S1200000_9.LIZ$3():void");
    }

    public final void LIZ$4() {
        Class cls;
        C54764LeS c54764LeS = (C54764LeS) this.l1;
        String uid = this.s0;
        o.LJIIIIZZ(uid, "uid");
        TBW[] tbwArr = new TBW[0];
        InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) this.l2;
        C54808LfA c54808LfA = C54808LfA.LIZLLL;
        if (o.LJ(C65352Pkq.LIZ(C54772Lea.class), C65352Pkq.LIZ(C54772Lea.class))) {
            cls = C54772Lea.class;
        } else {
            cls = C54771LeZ.class;
        }
        C65776Prg LIZ = C65352Pkq.LIZ(cls);
        StoryReceiver storyReceiver = new StoryReceiver(uid, c54764LeS, c54808LfA);
        if (o.LJ(LIZ, C65352Pkq.LIZ(C54772Lea.class))) {
            c54808LfA.LIZIZ(c54764LeS, storyReceiver);
        }
        C73849Syb<C54789Ler<SUBSCRIBE_DATA, OUTPUT_DATA>> c73849Syb = c54808LfA.LIZIZ;
        storyReceiver.LJLJJI = C42193GhB.LIZJ(c73849Syb, c73849Syb).LJJIFFI(new C54765LeT(c54808LfA, uid)).LJJIJL(new IDhS102S0100000_9(tbwArr, 25)).LJIILJJIL(c54808LfA.LIZJ).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(interfaceC88472Yns, 86), C54767LeV.LJLIL);
    }

    public static final void run$0(ARunnableS8S1200000_9 aRunnableS8S1200000_9) {
        ((DetailFragmentPanel) aRunnableS8S1200000_9.l1).LLII((Aweme) aRunnableS8S1200000_9.l2, aRunnableS8S1200000_9.s0);
    }

    public static final void run$1(ARunnableS8S1200000_9 aRunnableS8S1200000_9) {
        boolean LIZ;
        try {
            ((TextView) aRunnableS8S1200000_9.l1).setText(aRunnableS8S1200000_9.s0);
            C16650l3 LIZ2 = h0.LIZ((View) aRunnableS8S1200000_9.l2);
            LIZ2.LIZ(1.0f);
            LIZ2.LIZJ(100L);
            LIZ2.LJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS8S1200000_9 aRunnableS8S1200000_9) {
        boolean LIZ;
        try {
            aRunnableS8S1200000_9.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS8S1200000_9 aRunnableS8S1200000_9) {
        boolean LIZ;
        try {
            C56374MAo.LJII((Context) aRunnableS8S1200000_9.l1, new Intent(aRunnableS8S1200000_9.s0), (List) aRunnableS8S1200000_9.l2);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS8S1200000_9 aRunnableS8S1200000_9) {
        boolean LIZ;
        try {
            aRunnableS8S1200000_9.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS8S1200000_9 aRunnableS8S1200000_9) {
        boolean LIZ;
        try {
            ((LGX) aRunnableS8S1200000_9.l1).LJJI((Bundle) aRunnableS8S1200000_9.l2, aRunnableS8S1200000_9.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS8S1200000_9 aRunnableS8S1200000_9) {
        boolean LIZ;
        try {
            aRunnableS8S1200000_9.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS8S1200000_9 aRunnableS8S1200000_9) {
        boolean LIZ;
        try {
            aRunnableS8S1200000_9.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS8S1200000_9 aRunnableS8S1200000_9) {
        boolean LIZ;
        try {
            aRunnableS8S1200000_9.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS8S1200000_9 aRunnableS8S1200000_9) {
        boolean LIZ;
        try {
            UQF uqf = (UQF) aRunnableS8S1200000_9.l1;
            if (uqf.LJLIL || uqf.LJLILLLLZI) {
                String str = aRunnableS8S1200000_9.s0;
                ActivityC45651qj activityC45651qj = (ActivityC45651qj) aRunnableS8S1200000_9.l2;
                if (str != null) {
                    C54149LMz.LIZ(C77266UUc.LIZIZ, uqf, C55714Ltm.LIZLLL(str), activityC45651qj, null, 48);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS8S1200000_9(com.ss.android.ugc.aweme.feed.model.Aweme r2, java.lang.String r3, org.json.JSONObject r4, int r5) {
        /*
            r1 = this;
            r1.$t = r5
            switch(r5) {
                case 4: goto L10;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l1 = r4
            r0.l2 = r2
            r0.s0 = r3
        Lc:
            r0.<init>()
            return
        L10:
            r0 = r1
            r0.l1 = r4
            r0.s0 = r3
            r0.l2 = r2
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS8S1200000_9.<init>(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String, org.json.JSONObject, int):void");
    }

    public ARunnableS8S1200000_9(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = obj;
        this.l2 = obj2;
    }
}
