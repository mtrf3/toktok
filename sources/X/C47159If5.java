package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.If5, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47159If5 extends C47160If6 {
    public int LJJLJ;
    public int LJJLJLI;
    public int LJJLL;
    public long LJJZ;
    public long LJJZZI;
    public long LJJZZIII;
    public String LJL;
    public String LJLI;
    public String LJLIIIL;
    public String LJLIIL;
    public String LJLIL;
    public EnumC47176IfM LJLILLLLZI;
    public String LJLJI;
    public String LJLJJI;
    public String LJLJJL;
    public String LJLJJLL;
    public List<String> LJLJL;
    public List<C47082Idq> LJLJLJ;

    public C47159If5() {
        super(null);
        this.LJJLJ = -1;
        this.LJJZZIII = -1L;
    }

    @Override // X.C47160If6, X.InterfaceC47618ImU
    public final C47162If8 LIZJ() {
        return null;
    }

    @Override // X.C47160If6
    public final C47160If6 LJ() {
        C47159If5 c47159If5 = new C47159If5();
        c47159If5.LJLJL = new ArrayList(this.LJLJL);
        c47159If5.LJIIIZ = this.LJIIIZ;
        c47159If5.LJIIJ = this.LJIIJ;
        c47159If5.LJIIJJI = this.LJIIJJI;
        c47159If5.LJIIL = this.LJIIL;
        c47159If5.LJJLJLI = this.LJJLJLI;
        c47159If5.LJJLL = this.LJJLL;
        c47159If5.LJLJJL = this.LJLJJL;
        c47159If5.LJIILLIIL = this.LJIILLIIL;
        c47159If5.LJIJ = this.LJIJ;
        c47159If5.LJIJI = this.LJIJI;
        c47159If5.LJLIIIL = this.LJLIIIL;
        c47159If5.LJL = this.LJL;
        c47159If5.LJIL = this.LJIL;
        c47159If5.LJJ = this.LJJ;
        c47159If5.LJJI = this.LJJI;
        c47159If5.LJJIFFI = this.LJJIFFI;
        c47159If5.LJJZZI = this.LJJZZI;
        c47159If5.LJJIII = this.LJJIII;
        c47159If5.LJJIIJ = this.LJJIIJ;
        c47159If5.LJJIIJZLJL = this.LJJIIJZLJL;
        c47159If5.LJLJI = this.LJLJI;
        c47159If5.LJLIL = this.LJLIL;
        c47159If5.LJLI = this.LJLI;
        c47159If5.LJJLJ = this.LJJLJ;
        c47159If5.LJJJJIZL = this.LJJJJIZL;
        c47159If5.LJJJJI = this.LJJJJI;
        c47159If5.LJJZ = this.LJJZ;
        return c47159If5;
    }

    @Override // X.C47160If6
    public final String[] LJIIIZ() {
        List<String> list = this.LJLJL;
        if (list != null) {
            return (String[]) list.toArray(new String[0]);
        }
        return new String[0];
    }

    @Override // X.C47160If6
    public final java.util.Map<String, Object> LJIIL() {
        String str;
        int i;
        HashMap hashMap = new HashMap();
        hashMap.put("file_id", LIZIZ(28));
        if (this.LJJLJ == 0) {
            str = "video";
        } else {
            str = "audio";
        }
        hashMap.put("media_type", str);
        hashMap.put("file_size", Long.valueOf(LJIIIIZZ(12)));
        hashMap.put("bitrate", Integer.valueOf(LIZLLL(3)));
        hashMap.put("quality", LIZIZ(18));
        hashMap.put("definition", LIZIZ(7));
        EnumC47176IfM enumC47176IfM = this.LJLILLLLZI;
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
        JSONObject jSONObject = this.LJJIZ;
        if (jSONObject != null) {
            hashMap.put("preload_gear_data", jSONObject);
        }
        if (this.LJLJLJ != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                Iterator it = ((ArrayList) this.LJLJLJ).iterator();
                while (it.hasNext()) {
                    C47082Idq c47082Idq = (C47082Idq) it.next();
                    EnumC47073Idh enumC47073Idh = c47082Idq.LIZ;
                    if (enumC47073Idh == EnumC47073Idh.Frame) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("g_");
                        LIZ.append(c47082Idq.LIZIZ);
                        jSONObject2.put(X1D.LIZIZ(LIZ), c47082Idq.LIZJ);
                    } else if (enumC47073Idh == EnumC47073Idh.TimeInSecond) {
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("t_");
                        LIZ2.append(c47082Idq.LIZIZ);
                        jSONObject2.put(X1D.LIZIZ(LIZ2), c47082Idq.LIZJ);
                    }
                }
                hashMap.put("preload_gear_data", jSONObject2);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return hashMap;
    }

    @Override // X.C47160If6
    public final JSONObject LJIIJJI() {
        return super.LJIIJJI();
    }

    @Override // X.C47160If6, X.InterfaceC47618ImU
    public final int LIZ() {
        return this.LJJLJ;
    }

    @Override // X.C47160If6, X.InterfaceC47618ImU
    public final EnumC47176IfM getResolution() {
        return this.LJLILLLLZI;
    }

    @Override // X.C47160If6, X.InterfaceC47618ImU
    public final String LIZIZ(int i) {
        if (i != 5) {
            if (i != 6) {
                if (i != 7) {
                    if (i != 8) {
                        if (i != 15) {
                            if (i != 18) {
                                if (i != 28) {
                                    if (i != 31) {
                                        if (i != 32) {
                                            return null;
                                        }
                                        return this.LJLJJLL;
                                    }
                                    return this.LJLIL;
                                }
                                return this.LJLI;
                            }
                            return this.LJLJI;
                        }
                        return this.LJL;
                    }
                    return this.LJLIIIL;
                }
                return this.LJLJJI;
            }
            return this.LJLIIL;
        }
        return this.LJLJJL;
    }

    @Override // X.C47160If6, X.InterfaceC47618ImU
    public final int LIZLLL(int i) {
        long j;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 27) {
                        return 0;
                    }
                    j = 0;
                } else {
                    j = this.LJJZ;
                }
                return (int) j;
            }
            return this.LJJLL;
        }
        return this.LJJLJLI;
    }

    @Override // X.C47160If6
    public final long LJIIIIZZ(int i) {
        if (i != 12) {
            if (i != 30) {
                return 0L;
            }
            return this.LJJZZIII;
        }
        return this.LJJZZI;
    }

    @Override // X.C47160If6
    public final void LJIIJ(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        this.LJLJL = arrayList;
        Collections.addAll(arrayList, strArr);
    }

    public final void LJIILIIL(JSONObject jSONObject) {
        int i;
        try {
            this.LJLI = jSONObject.optString("file_id");
            if (jSONObject.optString("media_type").compareTo("audio") == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.LJJLJ = i;
            this.LJJZZI = jSONObject.optLong("file_size");
            this.LJJZ = jSONObject.optInt("bitrate");
            this.LJLJI = jSONObject.optString("quality");
            this.LJIL = jSONObject.optString("definition");
            this.LJLILLLLZI = EnumC47176IfM.valueOf(jSONObject.optInt("resolution", 0));
            this.LJJLJLI = jSONObject.optInt("width");
            this.LJJLL = jSONObject.optInt("height");
            this.LJLIIIL = jSONObject.optString("codec");
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "urls");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String string = JSONArrayProtectorUtils.getString(jSONArray, i2);
                if (!TextUtils.isEmpty(string)) {
                    if (this.LJLJL == null) {
                        this.LJLJL = new ArrayList();
                    }
                    this.LJLJL.add(string);
                }
            }
            this.LJL = jSONObject.optString("file_hash");
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[GearStrategy]fromMediaInfoJsonObject exception=");
            LIZ.append(e);
            C78253UnR.LJI("TTVideoEngine.BareVideoInfo", X1D.LIZIZ(LIZ));
        }
    }
}
