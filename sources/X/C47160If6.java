package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3MaskAvatarSizeTestSetting;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.If6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47160If6 implements InterfaceC47618ImU {
    public int LIZ = 1;
    public EnumC47176IfM LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public long LJI;
    public final String LJII;
    public String[] LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public long LJJII;
    public int LJJIII;
    public int LJJIIJ;
    public int LJJIIJZLJL;
    public int LJJIIZ;
    public String LJJIIZI;
    public String LJJIJ;
    public int LJJIJIIJI;
    public String LJJIJIIJIL;
    public String LJJIJIL;
    public String LJJIJL;
    public String LJJIJLIJ;
    public String LJJIL;
    public JSONObject LJJIZ;
    public float LJJJ;
    public float LJJJI;
    public int LJJJIL;
    public HashMap<Double, Long> LJJJJ;
    public int LJJJJI;
    public int LJJJJIZL;
    public String[] LJJJJJ;
    public String LJJJJJL;
    public String LJJJJL;
    public int LJJJJLI;
    public int LJJJJLL;
    public int LJJJJZ;
    public String LJJJJZI;
    public String LJJJLIIL;
    public String LJJJLL;
    public String LJJJLZIJ;
    public int LJJJZ;
    public int LJJL;
    public int LJJLI;
    public int LJJLIIIIJ;
    public long LJJLIIIJ;
    public String LJJLIIIJILLIZJL;
    public String LJJLIIIJJI;
    public String LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLIIIJLJLI;
    public C47162If8 LJJLIIIJLLLLLLLZ;
    public String LJJLIIJ;
    public String LJJLIL;

    public JSONObject LJIIJJI() {
        String str;
        int LIZLLL;
        try {
            JSONObject jSONObject = new JSONObject();
            String[] LJIIIZ = LJIIIZ();
            if (LJIIIZ != null && LJIIIZ.length > 0) {
                String LIZIZ = LIZIZ(34);
                String LIZIZ2 = LIZIZ(6);
                if (!TextUtils.isEmpty(LIZIZ2) && LIZIZ2.equals("mp4") && (LIZLLL = LIZLLL(38)) > 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("0-");
                    LIZ.append(LIZLLL - 1);
                    LIZIZ = X1D.LIZIZ(LIZ);
                }
                jSONObject.put("main_url", LJIIIZ[0]);
                if (LJIIIZ.length > 1) {
                    str = LJIIIZ[1];
                } else {
                    str = "";
                }
                jSONObject.put("backup_url_1", str);
                jSONObject.put("bitrate", LIZLLL(3));
                jSONObject.put("vwidth", LIZLLL(1));
                jSONObject.put("vheight", LIZLLL(2));
                jSONObject.put("init_range", LIZIZ);
                jSONObject.put("index_range", LIZIZ(35));
                jSONObject.put("first_moof_range", LIZIZ(47));
                jSONObject.put("check_info", LIZIZ(31));
                jSONObject.put("kid", LIZIZ(36));
                jSONObject.put("file_hash", C47756Ioi.LJ(LIZIZ(15)));
                jSONObject.put("loudness", LJII(39));
                jSONObject.put("peak", LJII(40));
                jSONObject.put("info_id", LIZLLL(42));
                return jSONObject;
            }
            return null;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public C47160If6 LJ() {
        C47160If6 c47160If6 = new C47160If6(this.LJII);
        c47160If6.LIZ = this.LIZ;
        c47160If6.LJIIIIZZ = this.LJIIIIZZ;
        c47160If6.LJIIIZ = this.LJIIIZ;
        c47160If6.LJIIJ = this.LJIIJ;
        c47160If6.LJIIJJI = this.LJIIJJI;
        c47160If6.LJIIL = this.LJIIL;
        c47160If6.LJIILIIL = this.LJIILIIL;
        c47160If6.LJIILJJIL = this.LJIILJJIL;
        c47160If6.LJIIZILJ = this.LJIIZILJ;
        c47160If6.LJIILLIIL = this.LJIILLIIL;
        c47160If6.LJIJ = this.LJIJ;
        c47160If6.LJIJI = this.LJIJI;
        c47160If6.LJIJJ = this.LJIJJ;
        c47160If6.LJIJJLI = this.LJIJJLI;
        c47160If6.LJIL = this.LJIL;
        c47160If6.LJJ = this.LJJ;
        c47160If6.LJJI = this.LJJI;
        c47160If6.LJJIFFI = this.LJJIFFI;
        c47160If6.LJJII = this.LJJII;
        c47160If6.LJJIII = this.LJJIII;
        c47160If6.LJJIIJ = this.LJJIIJ;
        c47160If6.LJJIIJZLJL = this.LJJIIJZLJL;
        c47160If6.LJJIIZ = this.LJJIIZ;
        c47160If6.LJJIIZI = this.LJJIIZI;
        c47160If6.LJJIJ = this.LJJIJ;
        c47160If6.LJIJJLI = this.LJIJJLI;
        c47160If6.LJJIJIIJIL = this.LJJIJIIJIL;
        c47160If6.LJJIJIL = this.LJJIJIL;
        c47160If6.LJJIJL = this.LJJIJL;
        c47160If6.LJJIJLIJ = this.LJJIJLIJ;
        c47160If6.LJJIL = this.LJJIL;
        c47160If6.LJJJIL = this.LJJJIL;
        c47160If6.LJJLIIIJLLLLLLLZ = this.LJJLIIIJLLLLLLLZ;
        c47160If6.LJJJJJ = this.LJJJJJ;
        c47160If6.LJJJJJL = this.LJJJJJL;
        c47160If6.LJJJJLI = this.LJJJJLI;
        c47160If6.LJJJJLL = this.LJJJJLL;
        c47160If6.LJJJJZI = this.LJJJJZI;
        c47160If6.LJJJLIIL = this.LJJJLIIL;
        c47160If6.LJJJLL = this.LJJJLL;
        c47160If6.LJJJLZIJ = this.LJJJLZIJ;
        c47160If6.LJJJZ = this.LJJJZ;
        c47160If6.LJJL = this.LJJL;
        c47160If6.LJJLI = this.LJJLI;
        c47160If6.LJJLIIIJ = this.LJJLIIIJ;
        c47160If6.LJJLIIIIJ = this.LJJLIIIIJ;
        c47160If6.LJJLIIIJILLIZJL = this.LJJLIIIJILLIZJL;
        c47160If6.LIZLLL = this.LIZLLL;
        c47160If6.LJFF = this.LJFF;
        c47160If6.LJ = this.LJ;
        c47160If6.LJJIJIIJI = this.LJJIJIIJI;
        c47160If6.LJJJJL = this.LJJJJL;
        c47160If6.LJJJJIZL = this.LJJJJIZL;
        c47160If6.LJJJJI = this.LJJJJI;
        c47160If6.LJIILL = this.LJIILL;
        c47160If6.LJJLIIIJJI = this.LJJLIIIJJI;
        c47160If6.LJJLIIIJJIZ = this.LJJLIIIJJIZ;
        c47160If6.LJJJJZ = this.LJJJJZ;
        return c47160If6;
    }

    public String[] LJIIIZ() {
        if (this.LIZ == 2) {
            return this.LJJJJJ;
        }
        return this.LJIIIIZZ;
    }

    public java.util.Map<String, Object> LJIIL() {
        String str;
        int i;
        HashMap hashMap = new HashMap();
        hashMap.put("file_id", LIZIZ(28));
        if (LIZ() == 0) {
            str = "video";
        } else {
            str = "audio";
        }
        hashMap.put("media_type", str);
        hashMap.put("file_size", Long.valueOf(LJIIIIZZ(12)));
        if (1 == C47149Iev.LIZ.LJI) {
            if (LIZLLL(44) > 0) {
                hashMap.put("bitrate", Integer.valueOf(LIZLLL(44)));
            } else {
                hashMap.put("bitrate", Integer.valueOf(LIZLLL(3)));
            }
        } else {
            hashMap.put("bitrate", Integer.valueOf(LIZLLL(3)));
        }
        hashMap.put("real_bitrate", Integer.valueOf(LIZLLL(44)));
        hashMap.put("quality", LIZIZ(18));
        hashMap.put("definition", LIZIZ(7));
        hashMap.put("video_resolution", LIZIZ(48));
        EnumC47176IfM enumC47176IfM = this.LIZIZ;
        if (enumC47176IfM != null) {
            i = enumC47176IfM.getIndex();
        } else {
            i = 0;
        }
        hashMap.put("resolution", Integer.valueOf(i));
        hashMap.put("width", Integer.valueOf(LIZLLL(1)));
        hashMap.put("height", Integer.valueOf(LIZLLL(2)));
        hashMap.put("codec", LIZIZ(8));
        hashMap.put("urls", LJIIIZ());
        hashMap.put("file_hash", LIZIZ(15));
        hashMap.put("header_size", Integer.valueOf(LIZLLL(38)));
        hashMap.put("quality_desc", LIZIZ(32));
        hashMap.put("first_moof_range", LIZIZ(47));
        JSONObject jSONObject = this.LJJIZ;
        if (jSONObject != null) {
            hashMap.put("preload_gear_data", jSONObject);
        }
        String LIZIZ = LIZIZ(29);
        if (LIZIZ == null) {
            LIZIZ = "";
        }
        hashMap.put("p2p_crc", C47756Ioi.LJ(LIZIZ));
        return hashMap;
    }

    @Override // X.InterfaceC47618ImU
    public int LIZ() {
        return this.LJJIJIIJI;
    }

    @Override // X.InterfaceC47618ImU
    public C47162If8 LIZJ() {
        return this.LJJLIIIJLLLLLLLZ;
    }

    @Override // X.InterfaceC47618ImU
    public EnumC47176IfM getResolution() {
        return this.LIZIZ;
    }

    public C47160If6(String str) {
        EnumC47176IfM enumC47176IfM = EnumC47176IfM.Standard;
        this.LIZIZ = enumC47176IfM;
        this.LIZJ = enumC47176IfM.toString(0);
        this.LIZLLL = null;
        this.LJ = null;
        this.LJI = 0L;
        this.LJII = null;
        this.LJIIZILJ = null;
        this.LJJII = 0L;
        this.LJJIII = 0;
        this.LJJIIJ = 0;
        this.LJJIIJZLJL = 1;
        this.LJJIIZ = 0;
        this.LJJIJIIJI = 0;
        this.LJJIZ = null;
        this.LJJJ = 0.0f;
        this.LJJJI = 0.0f;
        this.LJJJIL = 0;
        this.LJJJJI = -1;
        this.LJJJJJ = null;
        this.LJJJJZI = null;
        this.LJJJLL = null;
        this.LJJLIIIIJ = 0;
        this.LJJLIIIJ = 0L;
        this.LJJLIIIJILLIZJL = null;
        this.LJJLIIIJJI = null;
        this.LJJLIIIJJIZ = null;
        this.LJJLIIIJL = null;
        this.LJJLIIIJLJLI = null;
        this.LJJLIIIJLLLLLLLZ = null;
        this.LJII = str;
    }

    @Override // X.InterfaceC47618ImU
    public String LIZIZ(int i) {
        if (i != 26) {
            if (i != 31) {
                if (i != 28) {
                    if (i != 29) {
                        switch (i) {
                            case 34:
                                return this.LJJIJIL;
                            case 35:
                                return this.LJJIJL;
                            case 36:
                                return this.LJJIL;
                            default:
                                switch (i) {
                                    case 47:
                                        return this.LJJIJLIJ;
                                    case LinkMicMultiGuestV3MaskAvatarSizeTestSetting.SIZE_48 /* 48 */:
                                        return this.LIZIZ.toString(0);
                                    case C61447O9r.LJIIJ:
                                        return this.LJFF;
                                    default:
                                        if (this.LIZ == 2) {
                                            if (i != 0) {
                                                if (i != 15) {
                                                    if (i != 5) {
                                                        if (i != 6) {
                                                            if (i != 7) {
                                                                if (i != 8) {
                                                                    switch (i) {
                                                                        case 17:
                                                                            return this.LJJLIIIJJIZ;
                                                                        case 18:
                                                                            return this.LJJLIIIJJI;
                                                                        case 19:
                                                                            return this.LJJLIIIJILLIZJL;
                                                                        default:
                                                                            return "";
                                                                    }
                                                                }
                                                                return this.LJJJLL;
                                                            }
                                                            return this.LJJJLZIJ;
                                                        }
                                                        return this.LJJJLIIL;
                                                    }
                                                    return this.LJJJJZI;
                                                }
                                                return this.LJJJJL;
                                            }
                                            return this.LJJJJJL;
                                        }
                                        if (i != 0) {
                                            if (i != 15) {
                                                if (i != 37) {
                                                    if (i != 43) {
                                                        if (i != 5) {
                                                            if (i != 6) {
                                                                if (i != 7) {
                                                                    if (i != 8) {
                                                                        if (i != 32) {
                                                                            if (i != 33) {
                                                                                switch (i) {
                                                                                    case 17:
                                                                                        return this.LJIIJ;
                                                                                    case 18:
                                                                                        return this.LJJIIZI;
                                                                                    case 19:
                                                                                        return this.LJJIJ;
                                                                                    default:
                                                                                        switch (i) {
                                                                                            case 23:
                                                                                                return this.LJIIJJI;
                                                                                            case 24:
                                                                                                return this.LJIIL;
                                                                                            case 25:
                                                                                                return this.LJIJ;
                                                                                            default:
                                                                                                return "";
                                                                                        }
                                                                                }
                                                                            }
                                                                            return this.LJJLIIIJLJLI;
                                                                        }
                                                                        return this.LJJLIIIJL;
                                                                    }
                                                                    return this.LJIJJ;
                                                                }
                                                                return this.LJIL;
                                                            }
                                                            return this.LJIJI;
                                                        }
                                                        return this.LJIIZILJ;
                                                    }
                                                    return this.LJJLIL;
                                                }
                                                return this.LJJLIIJ;
                                            }
                                            return this.LJIJJLI;
                                        }
                                        return this.LJIIIZ;
                                }
                        }
                    }
                    return this.LJ;
                }
                return this.LIZLLL;
            }
            return this.LJJIJIIJIL;
        }
        return this.LIZJ;
    }

    @Override // X.InterfaceC47618ImU
    public int LIZLLL(int i) {
        if (i == 38) {
            C47162If8 c47162If8 = this.LJJLIIIJLLLLLLLZ;
            if (c47162If8 != null) {
                return c47162If8.LIZIZ;
            }
            return 0;
        }
        if (this.LIZ == 2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 13) {
                            if (i != 44) {
                                if (i != 41) {
                                    if (i != 42) {
                                        switch (i) {
                                            case 9:
                                                return this.LJJJZ;
                                            case 10:
                                                return this.LJJL;
                                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                                return this.LJJLI;
                                            default:
                                                return -1;
                                        }
                                    }
                                    return this.LJJJJI;
                                }
                                return this.LJJJIL;
                            }
                            return this.LJJJJIZL;
                        }
                        return this.LJJLIIIIJ;
                    }
                    return this.LJJJJZ;
                }
                return this.LJJJJLL;
            }
            return this.LJJJJLI;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 13) {
                        if (i != 27) {
                            if (i != 44) {
                                if (i != 41) {
                                    if (i != 42) {
                                        switch (i) {
                                            case 9:
                                                return this.LJJ;
                                            case 10:
                                                return this.LJJI;
                                            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                                                return this.LJJIFFI;
                                            default:
                                                switch (i) {
                                                    case 20:
                                                        return this.LJIILLIIL;
                                                    case 21:
                                                        return this.LJJIIJZLJL;
                                                    case 22:
                                                        return this.LJJIIZ;
                                                    default:
                                                        return -1;
                                                }
                                        }
                                    }
                                    return this.LJJJJI;
                                }
                                return this.LJJJIL;
                            }
                            return this.LJJJJIZL;
                        }
                        return this.LJJIII;
                    }
                    return this.LJJIIJ;
                }
                return this.LJIILL;
            }
            return this.LJIILJJIL;
        }
        return this.LJIILIIL;
    }

    public final void LJFF(String str) {
        String optString;
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("preloadsize") || (optString = jSONObject.optString("preloadsize")) == null || TextUtils.isEmpty(optString)) {
                return;
            }
            this.LJJIZ = new JSONObject(optString);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0329 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(org.json.JSONObject r37) {
        /*
            Method dump skipped, instructions count: 2517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47160If6.LJI(org.json.JSONObject):void");
    }

    public final float LJII(int i) {
        if (i != 39) {
            if (i != 40) {
                return 0.0f;
            }
            return this.LJJJI;
        }
        return this.LJJJ;
    }

    public long LJIIIIZZ(int i) {
        if (this.LIZ == 2) {
            if (i != 12) {
                return -1L;
            }
            return this.LJJLIIIJ;
        }
        if (i != 12) {
            if (i != 30) {
                return -1L;
            }
            return this.LJI;
        }
        return this.LJJII;
    }

    public void LJIIJ(String[] strArr) {
        this.LJIIIIZZ = strArr;
        this.LJJJJJ = strArr;
    }
}
