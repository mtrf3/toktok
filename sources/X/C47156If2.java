package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.If2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47156If2 implements InterfaceC47616ImS {
    public String LIZ;
    public long LIZIZ;
    public List<C47160If6> LIZJ;
    public int LIZLLL;
    public String LJ = "";

    @Override // X.InterfaceC47616ImS
    public final String LIZIZ() {
        return "mp4";
    }

    @Override // X.InterfaceC47616ImS
    public final long LIZJ(int i) {
        return 0L;
    }

    @Override // X.InterfaceC47616ImS
    public final String LJ() {
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final C47160If6 LJIIIZ(int i) {
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final C47172IfI LJIIJ() {
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final JSONObject LJIIJJI() {
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final float LJIIL(int i) {
        return 0.0f;
    }

    @Override // X.InterfaceC47616ImS
    public final void LJIJ(HashMap<String, EnumC47176IfM> hashMap) {
    }

    @Override // X.InterfaceC47616ImS
    public final boolean LJIL(int i) {
        return false;
    }

    @Override // X.InterfaceC47616ImS
    public final boolean LJJIFFI() {
        return false;
    }

    @Override // X.InterfaceC47616ImS
    public final List<C47170IfG> LJJII() {
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final boolean LIZ() {
        List<C47160If6> list = this.LIZJ;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC47616ImS
    public final String[] LJI() {
        HashSet hashSet = new HashSet();
        Iterator<C47160If6> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            String LIZIZ = it.next().LIZIZ(32);
            if (!TextUtils.isEmpty(LIZIZ)) {
                hashSet.add(LIZIZ);
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    @Override // X.InterfaceC47616ImS
    public final String LJIILIIL() {
        Iterator<C47160If6> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            String LIZIZ = it.next().LIZIZ(5);
            if (!TextUtils.isEmpty(LIZIZ)) {
                return LIZIZ;
            }
        }
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final String[] LJIJJ() {
        HashSet hashSet = new HashSet();
        Iterator<C47160If6> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            String LIZIZ = it.next().LIZIZ(8);
            if (!TextUtils.isEmpty(LIZIZ)) {
                hashSet.add(LIZIZ);
            }
        }
        return (String[]) hashSet.toArray(new String[0]);
    }

    @Override // X.InterfaceC47616ImS
    public final boolean LJJIII() {
        if (TextUtils.isEmpty(LJJI(8))) {
            return false;
        }
        if (LJFF(EnumC47157If3.DASH)) {
            if (!TextUtils.isEmpty(null)) {
                throw null;
            }
        } else {
            LJFF(EnumC47157If3.MP4);
        }
        return false;
    }

    @Override // X.InterfaceC47616ImS
    public final EnumC47176IfM[] LJJIIJ() {
        HashSet hashSet = new HashSet();
        Iterator<C47160If6> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getResolution());
        }
        return (EnumC47176IfM[]) hashSet.toArray(new EnumC47176IfM[0]);
    }

    public final java.util.Set<EnumC47157If3> LJJIIZ() {
        String LIZIZ;
        HashSet hashSet = new HashSet();
        List<C47160If6> list = this.LIZJ;
        if (list != null) {
            for (C47160If6 c47160If6 : list) {
                if (c47160If6 != null && (LIZIZ = c47160If6.LIZIZ(6)) != null) {
                    if (LIZIZ.equals("mp3")) {
                        hashSet.add(EnumC47157If3.MP3);
                    } else if (LIZIZ.equals("dash")) {
                        hashSet.add(EnumC47157If3.DASH);
                    } else if (LIZIZ.equals("hls")) {
                        hashSet.add(EnumC47157If3.HLS);
                    } else {
                        LIZIZ.equals("mp4");
                    }
                }
            }
        }
        hashSet.add(EnumC47157If3.MP4);
        return hashSet;
    }

    @Override // X.InterfaceC47616ImS
    public final String LJIIIIZZ() {
        JSONObject LJIILL = LJIILL();
        if (LJIILL != null) {
            return LJIILL.toString();
        }
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final JSONObject LJIILL() {
        String str;
        HashSet hashSet = (HashSet) LJJIIZ();
        if (hashSet.contains(EnumC47157If3.MP3)) {
            str = "mp3";
        } else if (hashSet.contains(EnumC47157If3.DASH)) {
            str = "dash";
        } else if (hashSet.contains(EnumC47157If3.HLS)) {
            str = "hls";
        } else if (hashSet.contains(EnumC47157If3.MP4)) {
            str = "mp4";
        } else {
            str = "";
        }
        String LJJI = LJJI(2);
        long j = this.LIZIZ;
        List<C47160If6> list = this.LIZJ;
        try {
            HashMap hashMap = new HashMap();
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<C47160If6> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().LJIIL());
                }
                hashMap.put("infos", arrayList);
            }
            hashMap.put("format", str);
            hashMap.put("vid", LJJI);
            hashMap.put("bid", this.LJ);
            hashMap.put("category", Integer.valueOf(LJII(232)));
            hashMap.put("placeholder", Integer.valueOf(LJII(254)));
            hashMap.put("duration", Long.valueOf(j));
            return new JSONObject(hashMap);
        } catch (Throwable th) {
            TTVideoEngineLog.d(th);
            return null;
        }
    }

    @Override // X.InterfaceC47616ImS
    public final List<C47160If6> LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC47616ImS
    public final boolean LJFF(EnumC47157If3 enumC47157If3) {
        return ((HashSet) LJJIIZ()).contains(enumC47157If3);
    }

    @Override // X.InterfaceC47616ImS
    public final int LJII(int i) {
        if (i != 3) {
            if (i == 7 || i != 232) {
                return 0;
            }
            return this.LIZLLL;
        }
        return (int) this.LIZIZ;
    }

    @Override // X.InterfaceC47616ImS
    public final String LJIILJJIL(EnumC47176IfM enumC47176IfM) {
        return enumC47176IfM.toString(0);
    }

    @Override // X.InterfaceC47616ImS
    public final String LJJI(int i) {
        if (i != 2) {
            if (i != 246) {
                return null;
            }
            return this.LJ;
        }
        return this.LIZ;
    }

    public final int LJJIIJZLJL(JSONObject jSONObject) {
        try {
            this.LIZ = jSONObject.optString("vid");
            String optString = jSONObject.optString("bid");
            this.LJ = optString;
            if (TextUtils.isEmpty(optString)) {
                this.LJ = this.LIZ;
            }
            this.LIZLLL = jSONObject.optInt("category");
            this.LIZIZ = jSONObject.optLong("duration");
            JSONArray jSONArray = JSONObjectProtectorUtils.getJSONArray(jSONObject, "infos");
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    C47159If5 LIZ = new C47161If7().LIZ();
                    LIZ.LJIILIIL(JSONArrayProtectorUtils.getJSONObject(jSONArray, i));
                    if (this.LIZJ == null) {
                        this.LIZJ = new ArrayList();
                    }
                    this.LIZJ.add(LIZ);
                }
            }
            return 0;
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[GearStrategy]fromMediaInfoJsonObject exception=");
            LIZ2.append(e);
            C78253UnR.LJI("TTVideoEngine.BareVideoModel", X1D.LIZIZ(LIZ2));
            return -1;
        }
    }

    @Override // X.InterfaceC47616ImS
    public final C47160If6 LJIIZILJ(EnumC47176IfM enumC47176IfM, java.util.Map<Integer, String> map) {
        return LJIJI(enumC47176IfM, LJII(7), map);
    }

    @Override // X.InterfaceC47616ImS
    public final String[] LJJ(EnumC47176IfM enumC47176IfM, java.util.Map<Integer, String> map) {
        C47160If6 LJIIZILJ = LJIIZILJ(enumC47176IfM, map);
        if (LJIIZILJ == null) {
            return new String[0];
        }
        return LJIIZILJ.LJIIIZ();
    }

    @Override // X.InterfaceC47616ImS
    public final C47160If6 LJIJI(EnumC47176IfM enumC47176IfM, int i, java.util.Map<Integer, String> map) {
        Iterator<C47160If6> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            C47160If6 next = it.next();
            if (next != null && enumC47176IfM == next.getResolution() && i == next.LIZ()) {
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry<Integer, String> entry : map.entrySet()) {
                        int intValue = entry.getKey().intValue();
                        String value = entry.getValue();
                        if (TextUtils.isEmpty(value) || value.equals(next.LIZIZ(intValue))) {
                        }
                    }
                    return next;
                }
                return next;
            }
        }
        return null;
    }

    @Override // X.InterfaceC47616ImS
    public final C47160If6 LJIJJLI(EnumC47176IfM enumC47176IfM, java.util.Map<Integer, String> map, boolean z) {
        return LJIILLIIL(enumC47176IfM, LJII(7), map, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0026, code lost:
    
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0028, code lost:
    
        r5 = LJIJI(r4[r2], r8, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002f, code lost:
    
        if (r5 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
    
        r2 = ((r2 + r4.length) - 1) % r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
    
        if (r2 != r3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0031, code lost:
    
        return r5;
     */
    @Override // X.InterfaceC47616ImS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47160If6 LJIILLIIL(X.EnumC47176IfM r7, int r8, java.util.Map<java.lang.Integer, java.lang.String> r9, boolean r10) {
        /*
            r6 = this;
            X.If6 r5 = r6.LJIJI(r7, r8, r9)
            if (r10 != 0) goto L7
            return r5
        L7:
            X.IfM[] r4 = X.EnumC47176IfM.getAllResolutions()
            int r0 = r4.length
            if (r0 > 0) goto Lf
            return r5
        Lf:
            int r0 = r4.length
            int r3 = r0 + (-1)
            if (r7 == 0) goto L25
            r2 = 0
        L15:
            int r0 = r4.length
            if (r2 >= r0) goto L25
            r0 = r4[r2]
            int r1 = r0.getIndex()
            int r0 = r7.getIndex()
            if (r1 != r0) goto L3b
            r3 = r2
        L25:
            r2 = r3
            if (r5 != 0) goto L31
        L28:
            r1 = r4[r2]
            r0 = 0
            X.If6 r5 = r6.LJIJI(r1, r8, r0)
            if (r5 == 0) goto L32
        L31:
            return r5
        L32:
            int r0 = r4.length
            int r2 = r2 + r0
            int r2 = r2 + (-1)
            int r0 = r4.length
            int r2 = r2 % r0
            if (r2 != r3) goto L28
            goto L31
        L3b:
            int r2 = r2 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47156If2.LJIILLIIL(X.IfM, int, java.util.Map, boolean):X.If6");
    }
}
