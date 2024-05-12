package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.scene.navigation.NavigationScene;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.google.android.gms.common.api.Status;
import com.ss.android.ugc.aweme.models.NowDiversionLimitInfo;
import com.ss.android.ugc.aweme.scope.MainActivityScope;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UyF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78923UyF implements InterfaceC48038ItG, InterfaceC80039Vb9 {
    public static final C78923UyF LJLIL = new C78923UyF();

    public static final boolean LJIILIIL() {
        if (!C1B8.LIZJ() || C1DG.LJIIIIZZ() || !new C158416Jp().LIZ.getBoolean("is_has_live_cd_permission", false)) {
            return false;
        }
        return true;
    }

    public static final JSONObject LJIIIIZZ(C66300Q0i getCertConfig) {
        o.LJIIJ(getCertConfig, "$this$getCertConfig");
        Object obj = ((LinkedHashMap) getCertConfig.LIZJ).get("certConfig");
        if (!(obj instanceof JSONObject)) {
            obj = null;
        }
        return (JSONObject) obj;
    }

    public static final String LJIIIZ(C109544Rq c109544Rq) {
        C117824jq c117824jq;
        String localPath;
        o.LJIIIZ(c109544Rq, "<this>");
        List<C117824jq> attachments = c109544Rq.getAttachments();
        if (attachments != null && (c117824jq = (C117824jq) ORZ.LJLLLLLL(0, attachments)) != null && (localPath = c117824jq.getLocalPath()) != null) {
            return LJIJI(localPath);
        }
        return null;
    }

    public static final String LJIIJ(C109544Rq c109544Rq) {
        C117824jq c117824jq;
        String localPath;
        o.LJIIIZ(c109544Rq, "<this>");
        List<C117824jq> attachments = c109544Rq.getAttachments();
        if (attachments != null && (c117824jq = (C117824jq) ORZ.LJLLLLLL(1, attachments)) != null && (localPath = c117824jq.getLocalPath()) != null) {
            return LJIJI(localPath);
        }
        return null;
    }

    public static NavigationScene LJIIJJI(WM7 wm7) {
        C1JI.LJII();
        while (wm7 != null) {
            wm7 = wm7.mParentScene;
            if (wm7 instanceof NavigationScene) {
                return (NavigationScene) wm7;
            }
        }
        return null;
    }

    public static final InterfaceC194077jX LJIIL(NowDiversionLimitInfo nowDiversionLimitInfo) {
        Integer trialDaysRemaining;
        if (nowDiversionLimitInfo != null && (trialDaysRemaining = nowDiversionLimitInfo.getTrialDaysRemaining()) != null) {
            final int intValue = trialDaysRemaining.intValue();
            Integer LIZJ = C2WW.LIZJ();
            if (LIZJ == null || LIZJ.intValue() <= 0) {
                return new InterfaceC194077jX() { // from class: X.7jv
                    @Override // X.InterfaceC194077jX
                    public final int LIZ() {
                        Integer LIZJ2 = C2WW.LIZJ();
                        if (LIZJ2 != null) {
                            return LIZJ2.intValue();
                        }
                        return 0;
                    }
                };
            }
            if (intValue == -2) {
                return C194097jZ.LIZ;
            }
            if (intValue == -1) {
                return C194107ja.LIZ;
            }
            if (intValue < 0) {
                return new InterfaceC194077jX() { // from class: X.7jv
                    @Override // X.InterfaceC194077jX
                    public final int LIZ() {
                        Integer LIZJ2 = C2WW.LIZJ();
                        if (LIZJ2 != null) {
                            return LIZJ2.intValue();
                        }
                        return 0;
                    }
                };
            }
            return new InterfaceC194077jX(intValue) { // from class: X.7jY
                public final int LIZ;

                @Override // X.InterfaceC194077jX
                public final int LIZ() {
                    return this.LIZ;
                }

                {
                    this.LIZ = intValue;
                }
            };
        }
        return new InterfaceC194077jX() { // from class: X.7jv
            @Override // X.InterfaceC194077jX
            public final int LIZ() {
                Integer LIZJ2 = C2WW.LIZJ();
                if (LIZJ2 != null) {
                    return LIZJ2.intValue();
                }
                return 0;
            }
        };
    }

    public static final boolean LJIILJJIL(long j) {
        float LIZLLL = C10370av.LIZLLL(j);
        if (!Float.isInfinite(LIZLLL) && !Float.isNaN(LIZLLL)) {
            float LJ = C10370av.LJ(j);
            if (!Float.isInfinite(LJ) && !Float.isNaN(LJ)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJIILL(long j) {
        if (j != C10370av.LIZLLL) {
            return true;
        }
        return false;
    }

    public static NavigationScene LJIILLIIL(WM7 wm7) {
        C1JI.LJII();
        NavigationScene LJIIJJI = LJIIJJI(wm7);
        if (LJIIJJI == null) {
            if (wm7.getApplicationContext() != null) {
                if (wm7 instanceof NavigationScene) {
                    throw new IllegalStateException(C279217s.LIZ("Scene ", wm7, " is root Scene"));
                }
                throw new IllegalStateException("The root of the Scene hierarchy is not NavigationScene");
            }
            throw new IllegalStateException(C279217s.LIZ("Scene ", wm7, " is not attached to any Scene"));
        }
        return LJIIJJI;
    }

    public static final String LJIJI(String str) {
        FZC fzc = FZC.LIZ;
        if (fzc.LIZLLL(str)) {
            str = android.net.Uri.fromFile(new File(str)).toString();
        }
        o.LJIIIIZZ(str, "if (DMFileUtils.isPath(t…else {\n        this\n    }");
        if (fzc.LIZJ(str)) {
            return str;
        }
        return null;
    }

    public static final IMFToolBarAbility LJIJJ(MainActivityScope mainActivityScope) {
        InterfaceC55235Lm3 interfaceC55235Lm3 = mainActivityScope.LJLIL;
        if (interfaceC55235Lm3 == null) {
            return null;
        }
        return (IMFToolBarAbility) C55096Ljo.LIZ(interfaceC55235Lm3, IMFToolBarAbility.class, null);
    }

    @Override // X.InterfaceC80039Vb9
    public V1L LJ(InterfaceC79968Va0 interfaceC79968Va0) {
        List<V1L> LIZIZ;
        if (interfaceC79968Va0 != null && (LIZIZ = interfaceC79968Va0.LIZIZ()) != null) {
            return (V1L) ORZ.LJLLLLLL(interfaceC79968Va0.getCurrentIndex() + 1, LIZIZ);
        }
        return null;
    }

    @Override // X.InterfaceC80039Vb9
    public V1L LJI(InterfaceC79968Va0 interfaceC79968Va0) {
        List<V1L> LIZIZ;
        if (interfaceC79968Va0 != null && (LIZIZ = interfaceC79968Va0.LIZIZ()) != null) {
            return (V1L) ORZ.LJLLLLLL(interfaceC79968Va0.getCurrentIndex() - 1, LIZIZ);
        }
        return null;
    }

    @Override // X.InterfaceC80039Vb9
    public V1L LJII(InterfaceC79968Va0 interfaceC79968Va0) {
        List<V1L> LIZIZ;
        if (interfaceC79968Va0 != null && (LIZIZ = interfaceC79968Va0.LIZIZ()) != null) {
            return (V1L) ORZ.LJLLLLLL(interfaceC79968Va0.getCurrentIndex(), LIZIZ);
        }
        return null;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        AbstractC57306MeM it = (AbstractC57306MeM) obj;
        o.LJIIIZ(it, "it");
        if (it instanceof C57305MeL) {
            return ((C57305MeL) it).LIZIZ;
        }
        if (it instanceof C57304MeK) {
            throw ((C57304MeK) it).LIZIZ;
        }
        throw new RuntimeException("error ");
    }

    public static final long LIZ(float f, float f2) {
        return (Float.floatToIntBits(f2) & 4294967295L) | (Float.floatToIntBits(f) << 32);
    }

    public static final void LIZIZ(C66300Q0i c66300Q0i, JSONObject config) {
        o.LJIIJ(config, "config");
        Object obj = ((LinkedHashMap) c66300Q0i.LIZJ).get("certConfig");
        if (!(obj instanceof JSONObject)) {
            obj = null;
        }
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null) {
            c66300Q0i.LIZJ.put("certConfig", config);
            return;
        }
        Iterator<String> keys = config.keys();
        o.LJFF(keys, "config.keys()");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, config.get(next));
        }
    }

    public static final void LJIJ(MutableLiveData mutableLiveData, Object obj) {
        if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
            mutableLiveData.setValue(obj);
        } else {
            mutableLiveData.postValue(obj);
        }
    }

    public static void LIZJ(Context context, String str, java.util.Map map) {
        boolean z;
        try {
            java.net.URL url = new java.net.URL(str);
            int i = 0;
            if (!TextUtils.isEmpty(url.getPath()) && url.getPath().contains("vc/setting")) {
                z = !F9J.LIZIZ(context, 0, "bd_turning_settings_init").getBoolean("inited", false);
            } else {
                z = true;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("");
            LIZ.append("n=");
            if (z) {
                i = 1;
            }
            LIZ.append(i);
            LIZ.append(";");
            String LIZIZ = X1D.LIZIZ(LIZ);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LIZIZ);
            LIZ2.append("t=0");
            map.put("x-tt-request-tag", X1D.LIZIZ(LIZ2));
        } catch (Exception unused) {
        }
    }

    public static final void LIZLLL(C66300Q0i c66300Q0i, String str, Object obj) {
        Object obj2 = ((LinkedHashMap) c66300Q0i.LIZJ).get("extraInfo");
        if (!C65777Prh.LJII(obj2)) {
            obj2 = null;
        }
        java.util.Map map = (java.util.Map) obj2;
        if (map == null) {
            map = new LinkedHashMap();
            c66300Q0i.LIZJ.put("extraInfo", map);
        }
        map.put(str, obj);
    }

    public static void LJIIZILJ(Status status, Object obj, C67649Qgn c67649Qgn) {
        if (status.LJJJJL()) {
            c67649Qgn.LIZIZ(obj);
        } else {
            c67649Qgn.LIZ(new ETK(status));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0094. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3 A[Catch: Exception -> 0x02d8, TRY_LEAVE, TryCatch #2 {Exception -> 0x02d8, blocks: (B:3:0x000c, B:4:0x002e, B:6:0x0034, B:9:0x003d, B:12:0x0044, B:20:0x0048, B:22:0x0061, B:25:0x006b, B:27:0x007a, B:29:0x008a, B:31:0x0090, B:32:0x0094, B:35:0x0099, B:40:0x00af, B:44:0x00cf, B:45:0x00b7, B:47:0x00c3, B:51:0x00d2, B:52:0x00b5, B:53:0x00a3, B:57:0x00d5, B:62:0x00e1, B:64:0x00fe, B:65:0x00e9, B:67:0x00f5, B:70:0x00e7, B:71:0x0101, B:76:0x010d, B:80:0x012d, B:81:0x0115, B:83:0x0121, B:87:0x0130, B:88:0x0113, B:89:0x0133, B:94:0x013f, B:98:0x015f, B:99:0x0147, B:101:0x0153, B:105:0x0162, B:106:0x0145, B:107:0x0165, B:111:0x016f, B:113:0x017f, B:116:0x0188, B:121:0x0194, B:125:0x01b4, B:126:0x019c, B:128:0x01a8, B:132:0x01b7, B:133:0x019a, B:134:0x01ba, B:138:0x01c4, B:140:0x01c9, B:144:0x01d3, B:146:0x01d9, B:148:0x01e7, B:149:0x01ef, B:151:0x01f9, B:153:0x01ff, B:154:0x0203, B:156:0x0209, B:171:0x024b, B:174:0x0251, B:175:0x0269, B:177:0x026f, B:180:0x0278, B:183:0x027f, B:191:0x0283, B:193:0x02a2, B:195:0x02af, B:196:0x02b3, B:198:0x02b9, B:206:0x0080, B:79:0x012a, B:158:0x0217, B:162:0x0236, B:163:0x023a, B:166:0x0241, B:124:0x01b1, B:97:0x015c, B:43:0x00cc), top: B:2:0x000c, inners: #0, #1, #3, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJFF(com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaPatternKey r16, X.E92 r17, X.EDP r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78923UyF.LJFF(com.ss.android.ugc.aweme.ecommerce.smartcheck.core.roma.RomaPatternKey, X.E92, X.EDP, java.lang.String, java.lang.String):void");
    }
}
