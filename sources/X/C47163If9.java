package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.If9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47163If9 {
    public EnumC47176IfM[] LIZIZ;
    public String[] LJ;
    public String LJIJI;
    public String LJIJJ;
    public String LJIJJLI;
    public String LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public String LJJIFFI;
    public int LJJII;
    public List<C47160If6> LJJIII;
    public List<C47160If6> LJJIIJ;
    public List<C47160If6> LJJIIJZLJL;
    public List<C47160If6> LJJIIZ;
    public String LJJIIZI;
    public String LJJIJ;
    public String[] LJJIJIIJI;
    public int LJJIJIIJIL;
    public int LJJIJIL;
    public C46931IbP LJJIJL;
    public List<C47140Iem> LJJIJLIJ;
    public List<C47170IfG> LJJIL;
    public String LJJJIL;
    public String LJJJJ;
    public String LJJJJI;
    public JSONObject LJJJJLI;
    public long LJJJJLL;
    public String LJJJJZ;
    public String LJJLIIIJILLIZJL;
    public int[] LJJLIIIJJI;
    public C47172IfI LJJLIIIJJIZ;
    public String LJJLIIIJL;
    public String LJJLJ;
    public int LJJLL;
    public int LJJZ;
    public String LJJZZI;
    public String LJJZZIII;
    public C47171IfH LJLI;
    public List<C47140Iem> LJLIIIL;
    public int LJLIIL;
    public String LJLIL;
    public String LJLILLLLZI;
    public String LJLJJI;
    public int LJLJJL;
    public String LJLJL;
    public int LJLJLJ;
    public C47171IfH LJLJLLL;
    public int LIZ = 1;
    public final ArrayList<EnumC47176IfM> LIZJ = new ArrayList<>();
    public final ArrayList<String> LIZLLL = new ArrayList<>();
    public String[] LJFF = null;
    public String LJI = "";
    public String LJII = "mp4";
    public String LJIIIIZZ = "";
    public boolean LJIIIZ = false;
    public boolean LJIIJ = false;
    public boolean LJIIJJI = false;
    public boolean LJIIL = false;
    public boolean LJIILIIL = false;
    public boolean LJIILJJIL = false;
    public boolean LJIILL = false;
    public boolean LJIILLIIL = false;
    public final int[] LJIIZILJ = {-1, -1};
    public boolean LJIJ = false;
    public float LJJIZ = 0.0f;
    public float LJJJ = 0.0f;
    public float LJJJI = 0.0f;
    public boolean LJJJJIZL = false;
    public HashMap<String, EnumC47176IfM> LJJJJJ = new C47175IfL();
    public HashMap<String, EnumC47176IfM> LJJJJJL = new C47174IfK();
    public int LJJJJL = 0;
    public float LJJJJZI = 0.0f;
    public float LJJJLIIL = 0.0f;
    public float LJJJLL = 0.0f;
    public float LJJJLZIJ = 0.0f;
    public float LJJJZ = 0.0f;
    public float LJJL = 0.0f;
    public float LJJLI = 0.0f;
    public int LJJLIIIIJ = 0;
    public String LJJLIIIJ = "";
    public String LJJLIIIJLJLI = "";
    public String LJJLIIIJLLLLLLLZ = "";
    public String LJJLIIJ = "";
    public int LJJLIL = 0;
    public List<C47160If6> LJJLJLI = null;
    public int LJL = 0;
    public long LJLJI = 0;
    public long LJLJJLL = 0;

    public final List LJFF() {
        if (this.LIZ == 2) {
            return null;
        }
        return this.LJJIIZ;
    }

    public final List<C47160If6> LJIIIIZZ() {
        List<C47160If6> list;
        if (this.LIZ == 2) {
            return this.LJJLJLI;
        }
        List<C47160If6> list2 = this.LJJIII;
        if (list2 != null && list2.size() > 0) {
            list = this.LJJIII;
        } else {
            list = null;
        }
        List<C47160If6> list3 = this.LJJIIJ;
        if (list3 != null && list3.size() > 0) {
            return this.LJJIIJ;
        }
        return list;
    }

    public final String LJIIIZ() {
        return LIZ(LJIIIIZZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0069 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.util.List<X.C47160If6> r6) {
        /*
            if (r6 == 0) goto L61
            int r0 = r6.size()     // Catch: java.lang.Exception -> L5d
            if (r0 > 0) goto L9
            goto L61
        L9:
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Exception -> L5d
            r5.<init>()     // Catch: java.lang.Exception -> L5d
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: java.lang.Exception -> L5d
            r4.<init>()     // Catch: java.lang.Exception -> L5d
            java.util.Iterator r3 = r6.iterator()     // Catch: java.lang.Exception -> L5d
        L17:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Exception -> L5d
            if (r0 == 0) goto L41
            java.lang.Object r1 = r3.next()     // Catch: java.lang.Exception -> L5d
            X.If6 r1 = (X.C47160If6) r1     // Catch: java.lang.Exception -> L5d
            if (r1 == 0) goto L17
            org.json.JSONObject r2 = r1.LJIIJJI()     // Catch: java.lang.Exception -> L5d
            if (r2 != 0) goto L2c
            goto L17
        L2c:
            int r0 = r1.LIZ()     // Catch: java.lang.Exception -> L5d
            if (r0 != 0) goto L36
            r5.put(r2)     // Catch: java.lang.Exception -> L5d
            goto L17
        L36:
            int r1 = r1.LIZ()     // Catch: java.lang.Exception -> L5d
            r0 = 1
            if (r1 != r0) goto L17
            r4.put(r2)     // Catch: java.lang.Exception -> L5d
            goto L17
        L41:
            int r0 = r5.length()     // Catch: java.lang.Exception -> L5d
            if (r0 > 0) goto L4d
            int r0 = r4.length()     // Catch: java.lang.Exception -> L5d
            if (r0 <= 0) goto L61
        L4d:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L5d
            r1.<init>()     // Catch: java.lang.Exception -> L5d
            java.lang.String r0 = "dynamic_video_list"
            r1.put(r0, r5)     // Catch: java.lang.Exception -> L5d
            java.lang.String r0 = "dynamic_audio_list"
            r1.put(r0, r4)     // Catch: java.lang.Exception -> L5d
            goto L62
        L5d:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L61:
            r1 = 0
        L62:
            if (r1 == 0) goto L69
            java.lang.String r0 = r1.toString()
        L68:
            return r0
        L69:
            java.lang.String r0 = ""
            goto L68
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47163If9.LIZ(java.util.List):java.lang.String");
    }

    public final void LIZJ(JSONObject jSONObject) {
        String str;
        int i;
        String str2;
        JSONObject optJSONObject;
        JSONArray optJSONArray;
        String str3;
        boolean z;
        String str4;
        int i2;
        int i3;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        JSONArray optJSONArray2;
        JSONArray optJSONArray3;
        String str10;
        String str11;
        JSONArray optJSONArray4;
        JSONArray optJSONArray5;
        JSONObject optJSONObject2;
        String str12;
        JSONObject optJSONObject3;
        String str13;
        JSONArray optJSONArray6;
        JSONArray optJSONArray7;
        if (jSONObject == null) {
            return;
        }
        JSONArray optJSONArray8 = jSONObject.optJSONArray("PlayInfoList");
        if ((optJSONArray8 != null && optJSONArray8.length() > 0) || !TextUtils.isEmpty(jSONObject.optString("VideoID")) || !TextUtils.isEmpty(jSONObject.optString("Vid"))) {
            if (jSONObject.optInt("Version") == 4) {
                this.LIZ = 4;
            } else {
                this.LIZ = 2;
            }
        } else if (!TextUtils.isEmpty(jSONObject.optString("video_id"))) {
            if (jSONObject.optInt("version") == 3) {
                this.LIZ = 3;
            } else {
                this.LIZ = 1;
            }
        }
        int i4 = this.LIZ;
        if (i4 == 1 || i4 == 3) {
            if (i4 == 1) {
                this.LJJJJI = jSONObject.optString("fallback_api");
                String optString = jSONObject.optString("key_seed");
                if (!TextUtils.isEmpty(optString)) {
                    this.LJJJJ = optString;
                }
            } else {
                JSONObject optJSONObject4 = jSONObject.optJSONObject("fallback_api");
                if (optJSONObject4 != null) {
                    this.LJJJJI = optJSONObject4.optString("fallback_api");
                    String optString2 = optJSONObject4.optString("key_seed");
                    if (!TextUtils.isEmpty(optString2)) {
                        this.LJJJJ = optString2;
                    }
                }
            }
            this.LJJIJIL = jSONObject.optInt("video_duration");
            this.LJJIJIIJIL = jSONObject.optInt("status");
            this.LJJ = jSONObject.optBoolean("enable_ssl");
            this.LJJI = jSONObject.optBoolean("enable_adaptive");
            this.LJIJJ = jSONObject.optString("video_id");
            this.LJJII = jSONObject.optInt("popularity_level");
            this.LJJJIL = jSONObject.optString("media_type");
            this.LJJJJZ = jSONObject.optString("optimal_decoding_mode");
            this.LJLJI = jSONObject.optLong("url_expire");
            this.LJIJJLI = jSONObject.optString("validate");
            this.LJIL = jSONObject.optString("auto_definition");
            this.LJJIFFI = jSONObject.optString("video_name");
            this.LJIJI = jSONObject.optString("user_id");
            this.LJIJ = jSONObject.optBoolean("mb_refactor", false);
            if (this.LIZ == 1) {
                String optString3 = jSONObject.optString("barrage_mask_url");
                if (!TextUtils.isEmpty(optString3)) {
                    if (this.LJJJJIZL) {
                        str11 = this.LJJJJ;
                    } else {
                        str11 = null;
                    }
                    this.LJLIL = C47756Ioi.LIZIZ(optString3, str11);
                }
                String optString4 = jSONObject.optString("effect_barrage_url");
                if (!TextUtils.isEmpty(optString4)) {
                    if (this.LJJJJIZL) {
                        str10 = this.LJJJJ;
                    } else {
                        str10 = null;
                    }
                    this.LJLILLLLZI = C47756Ioi.LIZIZ(optString4, str10);
                }
            } else {
                this.LJLIL = jSONObject.optString("barrage_mask_url");
                this.LJLILLLLZI = jSONObject.optString("effect_barrage_url");
            }
            String optString5 = jSONObject.optString("video_meta");
            if (!TextUtils.isEmpty(optString5)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(optString5);
                    this.LJJ = jSONObject2.optBoolean("enable_ssl");
                    this.LJJI = jSONObject2.optBoolean("enable_adaptive");
                    JSONObject optJSONObject5 = jSONObject2.optJSONObject("barrage_mask_info");
                    if (optJSONObject5 != null) {
                        C46931IbP c46931IbP = new C46931IbP();
                        this.LJJIJL = c46931IbP;
                        c46931IbP.LIZ(optJSONObject5);
                        if (this.LIZ == 1) {
                            String LJ = this.LJJIJL.LJ(1);
                            if (!TextUtils.isEmpty(LJ)) {
                                if (this.LJJJJIZL) {
                                    str = this.LJJJJ;
                                } else {
                                    str = null;
                                }
                                this.LJLIL = C47756Ioi.LIZIZ(LJ, str);
                            }
                        } else {
                            this.LJLIL = this.LJJIJL.LJ(1);
                        }
                        this.LJLJJL = this.LJJIJL.LIZLLL(7);
                        this.LJLJJI = this.LJJIJL.LJ(3);
                        this.LJLJJLL = this.LJJIJL.LJ;
                    }
                    JSONObject optJSONObject6 = jSONObject2.optJSONObject("volume");
                    if (optJSONObject6 != null) {
                        if (optJSONObject6.has("loudness") || optJSONObject6.has("peak")) {
                            this.LJJJJZI = (float) optJSONObject6.optDouble("loudness");
                            this.LJJJLIIL = (float) optJSONObject6.optDouble("peak");
                        }
                        if (optJSONObject6.has("version")) {
                            this.LJJLIIIIJ = optJSONObject6.optInt("version");
                        }
                        if (optJSONObject6.has("loudness_range")) {
                            this.LJJJLL = (float) optJSONObject6.optDouble("loudness_range");
                        }
                        if (optJSONObject6.has("loudness_range_start")) {
                            this.LJJJLZIJ = (float) optJSONObject6.optDouble("loudness_range_start");
                        }
                        if (optJSONObject6.has("loudness_range_end")) {
                            this.LJJJZ = (float) optJSONObject6.optDouble("loudness_range_end");
                        }
                        if (optJSONObject6.has("maximum_momentary_loudness")) {
                            this.LJJL = (float) optJSONObject6.optDouble("maximum_momentary_loudness");
                        }
                        if (optJSONObject6.has("maximum_short_term_loudness")) {
                            this.LJJLI = (float) optJSONObject6.optDouble("maximum_short_term_loudness");
                        }
                        if (optJSONObject6.has("volume_info_json")) {
                            this.LJJLIIIJ = optJSONObject6.optString("volume_info_json");
                        }
                    }
                    if (jSONObject2.has("seek_ts")) {
                        C62819Ol5.LJIIJJI(JSONObjectProtectorUtils.getJSONObject(jSONObject2, "seek_ts"));
                    }
                } catch (Throwable unused) {
                    C78253UnR.LIZLLL("VideoRef", "parse video meta error");
                }
            }
            if (this.LJJJIL.equals("video")) {
                this.LJJJJL = 0;
            } else if (this.LJJJIL.equals("audio")) {
                this.LJJJJL = 1;
            }
            if (jSONObject.has("subtitle_langs") && (optJSONArray3 = jSONObject.optJSONArray("subtitle_langs")) != null && optJSONArray3.length() > 0) {
                this.LJJLIIIJJI = new int[optJSONArray3.length()];
                for (int i5 = 0; i5 < optJSONArray3.length(); i5++) {
                    this.LJJLIIIJJI[i5] = optJSONArray3.optInt(i5);
                }
            }
            if (jSONObject.has("subtitle_infos") && (optJSONArray2 = jSONObject.optJSONArray("subtitle_infos")) != null && optJSONArray2.length() > 0) {
                this.LJJIL = new ArrayList();
                for (int i6 = 0; i6 < optJSONArray2.length(); i6++) {
                    C47170IfG c47170IfG = new C47170IfG();
                    c47170IfG.LIZ(JSONArrayProtectorUtils.getJSONObject(optJSONArray2, i6));
                    ((ArrayList) this.LJJIL).add(c47170IfG);
                }
            }
            this.LJIILLIIL = jSONObject.optBoolean("has_embedded_subtitle");
            JSONObject optJSONObject7 = jSONObject.optJSONObject("depth_estimation");
            if (optJSONObject7 != null) {
                this.LJJIZ = (float) optJSONObject7.optDouble("const_depth");
            }
            JSONObject optJSONObject8 = jSONObject.optJSONObject("subtitle_position");
            if (optJSONObject8 != null) {
                this.LJJJ = (float) optJSONObject8.optDouble("x");
                this.LJJJI = (float) optJSONObject8.optDouble("y");
            }
            if (this.LIZ == 1) {
                JSONObject optJSONObject9 = jSONObject.optJSONObject("video_list");
                if (optJSONObject9 != null) {
                    this.LJJIII = new ArrayList();
                    String[] strArr = {"video_1", "video_2", "video_3", "video_4", "video_5", "video_6", "video_7", "video_8"};
                    int i7 = 0;
                    i = 0;
                    do {
                        String str14 = strArr[i7];
                        if (optJSONObject9.has(str14)) {
                            JSONObject jSONObject3 = JSONObjectProtectorUtils.getJSONObject(optJSONObject9, str14);
                            int i8 = this.LJJJJL;
                            if (this.LJJJJIZL) {
                                str9 = this.LJJJJ;
                            } else {
                                str9 = null;
                            }
                            C47160If6 LIZIZ = LIZIZ(i8, str9, jSONObject3);
                            LIZIZ.LJJIII = this.LJJIJIL;
                            LIZIZ.LJJJJI = i;
                            ((ArrayList) this.LJJIII).add(LIZIZ);
                            i++;
                        }
                        i7++;
                    } while (i7 < 8);
                } else {
                    i = 0;
                }
            } else {
                this.LJJIII = new ArrayList();
                JSONArray optJSONArray9 = jSONObject.optJSONArray("video_list");
                if (optJSONArray9 != null && optJSONArray9.length() > 0) {
                    int i9 = 0;
                    i = 0;
                    while (i9 < optJSONArray9.length()) {
                        JSONObject jSONObject4 = JSONArrayProtectorUtils.getJSONObject(optJSONArray9, i9);
                        int i10 = this.LJJJJL;
                        if (this.LJJJJIZL) {
                            str2 = this.LJJJJ;
                        } else {
                            str2 = null;
                        }
                        C47160If6 LIZIZ2 = LIZIZ(i10, str2, jSONObject4);
                        LIZIZ2.LJJJJI = i;
                        ((ArrayList) this.LJJIII).add(LIZIZ2);
                        i9++;
                        i++;
                    }
                } else {
                    i = 0;
                }
            }
            this.LJJJJLI = jSONObject.optJSONObject("dns_info");
            this.LJJJJLL = jSONObject.optLong("dns_time");
            JSONObject optJSONObject10 = jSONObject.optJSONObject("dynamic_video");
            if (optJSONObject10 != null) {
                if (this.LIZ == 1) {
                    String optString6 = optJSONObject10.optString("main_url");
                    if (!TextUtils.isEmpty(optString6)) {
                        if (this.LJJJJIZL) {
                            str8 = this.LJJJJ;
                        } else {
                            str8 = null;
                        }
                        this.LJJIIZI = C47756Ioi.LIZIZ(optString6, str8);
                    }
                    String optString7 = optJSONObject10.optString("backup_url_1");
                    if (!TextUtils.isEmpty(optString7)) {
                        if (this.LJJJJIZL) {
                            str7 = this.LJJJJ;
                        } else {
                            str7 = null;
                        }
                        this.LJJIJ = C47756Ioi.LIZIZ(optString7, str7);
                    }
                } else {
                    this.LJJIIZI = optJSONObject10.optString("main_url");
                    this.LJJIJ = optJSONObject10.optString("backup_url");
                }
                this.LJI = optJSONObject10.optString("dynamic_type");
                this.LJJIIJ = new ArrayList();
                JSONArray optJSONArray10 = optJSONObject10.optJSONArray("dynamic_video_list");
                if (optJSONArray10 != null && optJSONArray10.length() > 0) {
                    int i11 = 0;
                    while (i11 < optJSONArray10.length()) {
                        JSONObject jSONObject5 = JSONArrayProtectorUtils.getJSONObject(optJSONArray10, i11);
                        if (this.LJJJJIZL) {
                            str6 = this.LJJJJ;
                        } else {
                            str6 = null;
                        }
                        C47160If6 LIZIZ3 = LIZIZ(0, str6, jSONObject5);
                        LIZIZ3.LJJJJI = i;
                        ((ArrayList) this.LJJIIJ).add(LIZIZ3);
                        i11++;
                        i++;
                    }
                }
                JSONArray optJSONArray11 = optJSONObject10.optJSONArray("dynamic_dubbed_audios");
                if (optJSONArray11 != null && optJSONArray11.length() > 0) {
                    this.LJJIIJZLJL = new ArrayList();
                    int i12 = 0;
                    z = false;
                    while (i12 < optJSONArray11.length()) {
                        JSONObject jSONObject6 = JSONArrayProtectorUtils.getJSONObject(optJSONArray11, i12);
                        if (this.LJJJJIZL) {
                            str5 = this.LJJJJ;
                            i3 = 1;
                        } else {
                            i3 = 1;
                            str5 = null;
                        }
                        C47160If6 LIZIZ4 = LIZIZ(i3, str5, jSONObject6);
                        LIZIZ4.LJJJJI = i;
                        ((ArrayList) this.LJJIIJ).add(LIZIZ4);
                        ((ArrayList) this.LJJIIJZLJL).add(LIZIZ4);
                        i12++;
                        i++;
                        z = true;
                    }
                } else {
                    z = false;
                }
                JSONArray optJSONArray12 = optJSONObject10.optJSONArray("dynamic_audio_list");
                if (optJSONArray12 != null && optJSONArray12.length() > 0) {
                    this.LJJIIZ = new ArrayList();
                    int i13 = 0;
                    int i14 = Integer.MAX_VALUE;
                    while (i13 < optJSONArray12.length()) {
                        JSONObject jSONObject7 = JSONArrayProtectorUtils.getJSONObject(optJSONArray12, i13);
                        if (this.LJJJJIZL) {
                            str4 = this.LJJJJ;
                        } else {
                            str4 = null;
                        }
                        C47160If6 LIZIZ5 = LIZIZ(1, str4, jSONObject7);
                        int i15 = i + 1;
                        LIZIZ5.LJJJJI = i;
                        if (z && i14 > (i2 = LIZIZ5.LJIILL)) {
                            this.LJIIZILJ[1] = i;
                            i14 = i2;
                        }
                        ((ArrayList) this.LJJIIJ).add(LIZIZ5);
                        ((ArrayList) this.LJJIIZ).add(LIZIZ5);
                        i13++;
                        i = i15;
                    }
                }
                if (((ArrayList) this.LJJIIJ).size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    if (!TextUtils.isEmpty(this.LJJIIZI)) {
                        arrayList.add(this.LJJIIZI);
                    }
                    if (!TextUtils.isEmpty(this.LJJIJ)) {
                        arrayList.add(this.LJJIJ);
                    }
                    String[] strArr2 = new String[arrayList.size()];
                    this.LJJIJIIJI = strArr2;
                    arrayList.toArray(strArr2);
                }
            }
            if (jSONObject.has("barrage_mask_info")) {
                C46931IbP c46931IbP2 = new C46931IbP();
                this.LJJIJL = c46931IbP2;
                c46931IbP2.LIZ(JSONObjectProtectorUtils.getJSONObject(jSONObject, "barrage_mask_info"));
                if (this.LIZ == 1) {
                    String LJ2 = this.LJJIJL.LJ(1);
                    if (!TextUtils.isEmpty(LJ2)) {
                        if (this.LJJJJIZL) {
                            str3 = this.LJJJJ;
                        } else {
                            str3 = null;
                        }
                        this.LJLIL = C47756Ioi.LIZIZ(LJ2, str3);
                    }
                } else {
                    this.LJLIL = this.LJJIJL.LJ(1);
                }
                this.LJLJJL = this.LJJIJL.LIZLLL(7);
                this.LJLJJI = this.LJJIJL.LJ(3);
                this.LJLJJLL = this.LJJIJL.LJ;
            }
            if (jSONObject.has("seek_ts")) {
                C62819Ol5.LJIIJJI(JSONObjectProtectorUtils.getJSONObject(jSONObject, "seek_ts"));
            }
            if (jSONObject.has("big_thumbs") && (optJSONArray = jSONObject.optJSONArray("big_thumbs")) != null && optJSONArray.length() > 0) {
                this.LJJIJLIJ = new ArrayList();
                for (int i16 = 0; i16 < optJSONArray.length(); i16++) {
                    C47140Iem c47140Iem = new C47140Iem();
                    c47140Iem.LIZLLL = this.LIZ;
                    c47140Iem.LIZ(JSONArrayProtectorUtils.getJSONObject(optJSONArray, i16));
                    ((ArrayList) this.LJJIJLIJ).add(c47140Iem);
                }
            }
            if (jSONObject.has("volume") && (optJSONObject = jSONObject.optJSONObject("volume")) != null) {
                if (optJSONObject.has("loudness") || optJSONObject.has("peak")) {
                    this.LJJJJZI = (float) optJSONObject.optDouble("loudness");
                    this.LJJJLIIL = (float) optJSONObject.optDouble("peak");
                }
                if (optJSONObject.has("version")) {
                    this.LJJLIIIIJ = optJSONObject.optInt("version");
                }
                if (optJSONObject.has("loudness_range")) {
                    this.LJJJLL = (float) optJSONObject.optDouble("loudness_range");
                }
                if (optJSONObject.has("loudness_range_start")) {
                    this.LJJJLZIJ = (float) optJSONObject.optDouble("loudness_range_start");
                }
                if (optJSONObject.has("loudness_range_end")) {
                    this.LJJJZ = (float) optJSONObject.optDouble("loudness_range_end");
                }
                if (optJSONObject.has("maximum_momentary_loudness")) {
                    this.LJJL = (float) optJSONObject.optDouble("maximum_momentary_loudness");
                }
                if (optJSONObject.has("maximum_short_term_loudness")) {
                    this.LJJLI = (float) optJSONObject.optDouble("maximum_short_term_loudness");
                }
                if (optJSONObject.has("volume_info_json")) {
                    this.LJJLIIIJ = optJSONObject.optString("volume_info_json");
                }
            }
            this.LJJLIIIJILLIZJL = jSONObject.optString("full_screen_strategy");
            if (jSONObject.has("video_style")) {
                C47172IfI c47172IfI = new C47172IfI();
                this.LJJLIIIJJIZ = c47172IfI;
                c47172IfI.LIZ(jSONObject.optJSONObject("video_style"));
            }
            if (jSONObject.has("pallas_vid_labels")) {
                this.LJJLIIIJLJLI = jSONObject.optString("pallas_vid_labels");
            }
            if (jSONObject.has("pallas_did_labels")) {
                this.LJJLIIIJLLLLLLLZ = jSONObject.optString("pallas_did_labels");
            }
        } else if (i4 == 2) {
            this.LJJLL = jSONObject.optInt("Status");
            this.LJJLJ = jSONObject.optString("VideoID");
            this.LJJZZI = jSONObject.optString("CoverUrl");
            this.LJJZ = jSONObject.optInt("Duration");
            this.LJJZZIII = jSONObject.optString("MediaType");
            this.LJLIIL = jSONObject.optInt("TotalCount");
            this.LJJ = jSONObject.optBoolean("EnableSSL");
            this.LJJI = jSONObject.optBoolean("EnableAdaptive");
            if (this.LJJZZIII.equals("video")) {
                this.LJL = 0;
            } else if (this.LJJZZIII.equals("audio")) {
                this.LJL = 1;
            }
            if (jSONObject.has("Seekts")) {
                C62819Ol5.LJIIJJI(JSONObjectProtectorUtils.getJSONObject(jSONObject, "Seekts"));
            }
            if (jSONObject.has("BigThumbs") && (optJSONArray7 = jSONObject.optJSONArray("BigThumbs")) != null && optJSONArray7.length() > 0) {
                this.LJLIIIL = new ArrayList();
                for (int i17 = 0; i17 < optJSONArray7.length(); i17++) {
                    try {
                        C47140Iem c47140Iem2 = new C47140Iem();
                        c47140Iem2.LIZLLL = this.LIZ;
                        c47140Iem2.LIZ(JSONArrayProtectorUtils.getJSONObject(optJSONArray7, i17));
                        ((ArrayList) this.LJLIIIL).add(c47140Iem2);
                    } catch (JSONException unused2) {
                    }
                }
            }
            if (jSONObject.has("SubtitleInfoList") && (optJSONArray6 = jSONObject.optJSONArray("SubtitleInfoList")) != null && optJSONArray6.length() > 0) {
                this.LJJIL = new ArrayList();
                for (int i18 = 0; i18 < optJSONArray6.length(); i18++) {
                    C47170IfG c47170IfG2 = new C47170IfG();
                    c47170IfG2.LIZ(JSONArrayProtectorUtils.getJSONObject(optJSONArray6, i18));
                    ((ArrayList) this.LJJIL).add(c47170IfG2);
                }
            }
            if (optJSONArray8 != null && optJSONArray8.length() > 0) {
                this.LJJLJLI = new ArrayList();
                int i19 = 0;
                int i20 = 0;
                while (i19 < optJSONArray8.length()) {
                    JSONObject jSONObject8 = JSONArrayProtectorUtils.getJSONObject(optJSONArray8, i19);
                    int i21 = this.LJL;
                    if (this.LJJJJIZL) {
                        str13 = this.LJJJJ;
                    } else {
                        str13 = null;
                    }
                    C47160If6 LIZIZ6 = LIZIZ(i21, str13, jSONObject8);
                    LIZIZ6.LJJJJI = i20;
                    ((ArrayList) this.LJJLJLI).add(LIZIZ6);
                    i19++;
                    i20++;
                }
            }
            if (jSONObject.has("AdaptiveInfo") && (optJSONObject3 = jSONObject.optJSONObject("AdaptiveInfo")) != null) {
                C47171IfH c47171IfH = new C47171IfH();
                this.LJLI = c47171IfH;
                c47171IfH.LIZ = optJSONObject3.optString("AdaptiveType");
                c47171IfH.LIZIZ = optJSONObject3.optString("MainPlayUrl");
                c47171IfH.LIZJ = optJSONObject3.optString("BackupPlayUrl");
                this.LJI = this.LJLI.LIZ(215);
                this.LJJIIZI = this.LJLI.LIZ(108);
                this.LJJIJ = this.LJLI.LIZ(109);
                ArrayList arrayList2 = new ArrayList();
                if (!TextUtils.isEmpty(this.LJJIIZI)) {
                    arrayList2.add(this.LJJIIZI);
                }
                if (!TextUtils.isEmpty(this.LJJIJ)) {
                    arrayList2.add(this.LJJIJ);
                }
                String[] strArr3 = new String[arrayList2.size()];
                this.LJJIJIIJI = strArr3;
                arrayList2.toArray(strArr3);
            }
        } else if (i4 == 4) {
            this.LJJIJIIJIL = jSONObject.optInt("Status");
            this.LJIJJ = jSONObject.optString("Vid");
            this.LJLJL = jSONObject.optString("PosterUrl");
            this.LJJIJIL = jSONObject.optInt("Duration");
            this.LJJJIL = jSONObject.optString("FileType");
            this.LJLJLJ = jSONObject.optInt("TotalCount");
            this.LJJ = jSONObject.optBoolean("EnableSSL");
            this.LJJI = jSONObject.optBoolean("EnableAdaptive");
            this.LJLIL = jSONObject.optString("BarrageMaskUrl");
            if (jSONObject.has("BarrageMaskInfo")) {
                C46931IbP c46931IbP3 = new C46931IbP();
                this.LJJIJL = c46931IbP3;
                c46931IbP3.LIZIZ(jSONObject.optJSONObject("BarrageMaskInfo"));
                this.LJLIL = this.LJJIJL.LJ(1);
                this.LJLJJL = this.LJJIJL.LIZLLL(7);
                this.LJLJJI = this.LJJIJL.LJ(3);
                this.LJLJJLL = this.LJJIJL.LJ;
            }
            if (this.LJJJIL.equals("video")) {
                this.LJJJJL = 0;
            } else if (this.LJJJIL.equals("audio")) {
                this.LJJJJL = 1;
            }
            if (optJSONArray8 != null && optJSONArray8.length() > 0) {
                this.LJJIII = new ArrayList();
                int i22 = 0;
                int i23 = 0;
                while (i22 < optJSONArray8.length()) {
                    JSONObject jSONObject9 = JSONArrayProtectorUtils.getJSONObject(optJSONArray8, i22);
                    int i24 = this.LJJJJL;
                    if (this.LJJJJIZL) {
                        str12 = this.LJJJJ;
                    } else {
                        str12 = null;
                    }
                    C47160If6 LIZIZ7 = LIZIZ(i24, str12, jSONObject9);
                    LIZIZ7.LJJJJI = i23;
                    ((ArrayList) this.LJJIII).add(LIZIZ7);
                    i22++;
                    i23++;
                }
                this.LJJJJZI = ((C47160If6) ListProtector.get(this.LJJIII, 0)).LJJJ;
                this.LJJJLIIL = ((C47160If6) ListProtector.get(this.LJJIII, 0)).LJJJI;
            }
            if (jSONObject.has("AdaptiveInfo") && (optJSONObject2 = jSONObject.optJSONObject("AdaptiveInfo")) != null) {
                C47171IfH c47171IfH2 = new C47171IfH();
                this.LJLJLLL = c47171IfH2;
                c47171IfH2.LIZ = optJSONObject2.optString("AdaptiveType");
                c47171IfH2.LIZIZ = optJSONObject2.optString("MainPlayUrl");
                c47171IfH2.LIZJ = optJSONObject2.optString("BackupPlayUrl");
                this.LJI = this.LJLJLLL.LIZ(215);
                this.LJJIIZI = this.LJLJLLL.LIZ(108);
                this.LJJIJ = this.LJLJLLL.LIZ(109);
                ArrayList arrayList3 = new ArrayList();
                if (!TextUtils.isEmpty(this.LJJIIZI)) {
                    arrayList3.add(this.LJJIIZI);
                }
                if (!TextUtils.isEmpty(this.LJJIJ)) {
                    arrayList3.add(this.LJJIJ);
                }
                String[] strArr4 = new String[arrayList3.size()];
                this.LJJIJIIJI = strArr4;
                arrayList3.toArray(strArr4);
            }
            if (jSONObject.has("SubtitleInfoList") && (optJSONArray5 = jSONObject.optJSONArray("SubtitleInfoList")) != null && optJSONArray5.length() > 0) {
                this.LJJIL = new ArrayList();
                for (int i25 = 0; i25 < optJSONArray5.length(); i25++) {
                    C47170IfG c47170IfG3 = new C47170IfG();
                    c47170IfG3.LIZ(JSONArrayProtectorUtils.getJSONObject(optJSONArray5, i25));
                    ((ArrayList) this.LJJIL).add(c47170IfG3);
                }
            }
            if (jSONObject.has("ThumbInfoList") && (optJSONArray4 = jSONObject.optJSONArray("ThumbInfoList")) != null && optJSONArray4.length() > 0) {
                this.LJJIJLIJ = new ArrayList();
                for (int i26 = 0; i26 < optJSONArray4.length(); i26++) {
                    C47140Iem c47140Iem3 = new C47140Iem();
                    c47140Iem3.LIZLLL = this.LIZ;
                    c47140Iem3.LIZ(JSONArrayProtectorUtils.getJSONObject(optJSONArray4, i26));
                    ((ArrayList) this.LJJIJLIJ).add(c47140Iem3);
                }
            }
        }
        List<C47160If6> LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null && LJIIIIZZ.size() > 0) {
            Iterator<C47160If6> it = LJIIIIZZ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C47160If6 next = it.next();
                if (next.LIZ() == 0) {
                    this.LJL = 0;
                    this.LJJJJL = 0;
                    break;
                } else if (next.LIZ() == 1) {
                    this.LJL = 1;
                    this.LJJJJL = 1;
                }
            }
        }
        this.LJIIIIZZ = LJIIIZ();
        EnumC47176IfM[] enumC47176IfMArr = new EnumC47176IfM[this.LIZJ.size()];
        this.LIZIZ = enumC47176IfMArr;
        this.LIZJ.toArray(enumC47176IfMArr);
        String[] strArr5 = new String[this.LIZLLL.size()];
        this.LJ = strArr5;
        this.LIZLLL.toArray(strArr5);
        if (TextUtils.isEmpty(this.LJJLIIJ)) {
            this.LJJLIIJ = LJI(2);
        }
    }

    public final Boolean LIZLLL(int i) {
        if (i != 106) {
            if (i != 222) {
                if (i != 253) {
                    if (i != 228) {
                        if (i != 229) {
                            switch (i) {
                                case 203:
                                    return Boolean.valueOf(this.LJIIJJI);
                                case 204:
                                    return Boolean.valueOf(this.LJIIIZ);
                                case 205:
                                    return Boolean.valueOf(this.LJIIL);
                                case 206:
                                    return Boolean.valueOf(this.LJIILJJIL);
                                case 207:
                                    return Boolean.valueOf(this.LJIILIIL);
                                case 208:
                                    return Boolean.valueOf(this.LJIILL);
                                default:
                                    return Boolean.FALSE;
                            }
                        }
                        return Boolean.valueOf(this.LJIILLIIL);
                    }
                    return Boolean.valueOf(this.LJIIJ);
                }
                return Boolean.valueOf(this.LJIJ);
            }
            return Boolean.valueOf(this.LJJI);
        }
        return Boolean.valueOf(this.LJJ);
    }

    public final int LJ(int i) {
        int i2 = this.LIZ;
        if (i2 == 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 7) {
                        if (i != 209) {
                            if (i != 230) {
                                if (i != 232) {
                                    if (i != 242) {
                                        if (i != 251) {
                                            return 0;
                                        }
                                        return this.LJJLIIIIJ;
                                    }
                                    return this.LJLJJL;
                                }
                                return this.LJJLIL;
                            }
                            return this.LJIIZILJ[1];
                        }
                        return this.LJLIIL;
                    }
                    return this.LJL;
                }
                return this.LJJLL;
            }
            return this.LJJZ;
        }
        if (i != 3) {
            if (i != 4) {
                if (i != 7) {
                    if (i != 9) {
                        if (i != 209) {
                            if (i != 227) {
                                if (i != 230) {
                                    if (i != 232) {
                                        if (i != 242) {
                                            if (i != 251) {
                                                return 0;
                                            }
                                            return this.LJJLIIIIJ;
                                        }
                                        return this.LJLJJL;
                                    }
                                    return this.LJJLIL;
                                }
                                return this.LJIIZILJ[1];
                            }
                            return this.LJJII;
                        }
                        return this.LJLJLJ;
                    }
                    return i2;
                }
                return this.LJJJJL;
            }
            return this.LJJIJIIJIL;
        }
        return this.LJJIJIL;
    }

    public final String LJI(int i) {
        if (i == 211) {
            return this.LJII;
        }
        if (i == 215) {
            return this.LJI;
        }
        if (i == 8) {
            return this.LJIIIIZZ;
        }
        if (i == 233) {
            return null;
        }
        if (i == 237) {
            return this.LJJLIIIJLJLI;
        }
        if (i == 244) {
            return this.LJJLIIIJLLLLLLLZ;
        }
        if (i == 245) {
            return this.LJJLIIIJL;
        }
        if (i == 260) {
            return this.LJJLIIIJ;
        }
        if (this.LIZ == 2) {
            if (i != 2) {
                if (i != 7) {
                    if (i != 201) {
                        return "";
                    }
                    return this.LJJZZI;
                }
                return this.LJJZZIII;
            }
            return this.LJJLJ;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 7) {
                    if (i != 201) {
                        if (i != 221) {
                            if (i != 223) {
                                if (i != 226) {
                                    if (i != 235) {
                                        if (i != 241) {
                                            if (i != 246) {
                                                if (i != 104) {
                                                    if (i != 105) {
                                                        if (i != 217) {
                                                            if (i != 218) {
                                                                switch (i) {
                                                                    case 107:
                                                                        return this.LJIL;
                                                                    case 108:
                                                                        return this.LJJIIZI;
                                                                    case 109:
                                                                        return this.LJJIJ;
                                                                    default:
                                                                        return "";
                                                                }
                                                            }
                                                            return this.LJJJJ;
                                                        }
                                                        return this.LJJJJI;
                                                    }
                                                    return this.LJIJJLI;
                                                }
                                                return this.LJJIFFI;
                                            }
                                            return this.LJJLIIJ;
                                        }
                                        return this.LJLJJI;
                                    }
                                    return this.LJLILLLLZI;
                                }
                                return this.LJJLIIIJILLIZJL;
                            }
                            return this.LJJJJZ;
                        }
                        return this.LJLIL;
                    }
                    return this.LJLJL;
                }
                return this.LJJJIL;
            }
            return this.LJIJJ;
        }
        return this.LJIJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0235, code lost:
    
        if (r5.equals(r2.toString(r6)) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47160If6 LIZIZ(int r8, java.lang.String r9, org.json.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 581
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47163If9.LIZIZ(int, java.lang.String, org.json.JSONObject):X.If6");
    }

    public final C47160If6 LJII(EnumC47176IfM enumC47176IfM, int i, java.util.Map<Integer, String> map) {
        List<C47160If6> LJIIIIZZ = LJIIIIZZ();
        if (LJIIIIZZ != null && LJIIIIZZ.size() != 0) {
            for (C47160If6 c47160If6 : LJIIIIZZ) {
                if (c47160If6 != null && i == c47160If6.LIZ()) {
                    if (map != null) {
                        if (map.containsKey(32)) {
                            String str = map.get(32);
                            if (!TextUtils.isEmpty(c47160If6.LIZIZ(32)) && c47160If6.LIZIZ(32).equals(str)) {
                                return c47160If6;
                            }
                        }
                        if (map.containsKey(18)) {
                            String str2 = map.get(18);
                            if (!TextUtils.isEmpty(c47160If6.LIZIZ(18)) && c47160If6.LIZIZ(18).equals(str2)) {
                                return c47160If6;
                            }
                        }
                    }
                    if (enumC47176IfM == c47160If6.getResolution()) {
                        if (map != null && map.size() != 0) {
                            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                                int intValue = entry.getKey().intValue();
                                String value = entry.getValue();
                                if (TextUtils.isEmpty(value) || value.equals(c47160If6.LIZIZ(intValue))) {
                                }
                            }
                        }
                        return c47160If6;
                    }
                    continue;
                }
            }
        }
        return null;
    }
}
