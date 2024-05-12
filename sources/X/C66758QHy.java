package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.CursorWindow;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import defpackage.i0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QHy, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66758QHy {
    public final QI4 LIZ;
    public final C66759QHz LIZIZ;
    public final HashMap<String, QI2> LIZJ;
    public final QI2[] LIZLLL;
    public String LJ;
    public final QI1[] LJFF;

    public final QIX LJI() {
        return this.LIZ.LJLJI.LJJIZ;
    }

    public static boolean LJII(long[] jArr) {
        if (jArr[0] <= 0 && jArr[1] <= 0 && jArr[2] <= 0) {
            return false;
        }
        return true;
    }

    public final void LIZ(HashMap<String, JSONObject> hashMap) {
        int i;
        JSONArray optJSONArray;
        if (!hashMap.isEmpty()) {
            for (Map.Entry<String, JSONObject> entry : hashMap.entrySet()) {
                JSONObject value = entry.getValue();
                if (value != null && (optJSONArray = value.optJSONArray("item_impression")) != null && optJSONArray.length() > 0) {
                    i = optJSONArray.length();
                } else {
                    i = 0;
                }
                QIX LJI = LJI();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("lost impression for launch: ");
                LJI.LJIJI(5, null, C40084FoG.LIZ(LIZ, entry.getKey(), ", count: ", i, LIZ), new Object[0]);
                this.LIZ.LJLJI.LIZLLL.LJI(QIQ.pack, QIK.f_lost_impression, i);
            }
        }
    }

    public final void LJIIJ(List<QI2> list) {
        if (this.LIZ.LJLJI.LIZIZ.LIZ(0)) {
            return;
        }
        for (QI2 qi2 : list) {
            try {
                if ("event".equals(qi2.LJIIIZ())) {
                    QIA qia = (QIA) qi2;
                    this.LIZ.LJLJI.LIZIZ.LIZIZ(0, qia.LL, qia.LLFFF, qia.LLD, qia.LLF, qia.LLFII, qia.LLFF);
                } else {
                    JSONObject jSONObject = null;
                    if ("eventv3".equals(qi2.LJIIIZ())) {
                        QIC qic = (QIC) qi2;
                        QIY qiy = this.LIZ.LJLJI.LIZIZ;
                        String str = qic.LLF;
                        if (qic.LL != null) {
                            jSONObject = new JSONObject(qic.LL);
                        }
                        qiy.LIZJ(0, str, jSONObject);
                    } else if ("event_misc".equals(qi2.LJIIIZ())) {
                        QIG qig = (QIG) qi2;
                        QIY qiy2 = this.LIZ.LJLJI.LIZIZ;
                        String str2 = qig.LLD;
                        if (qig.LL != null) {
                            jSONObject = new JSONObject(qig.LL);
                        }
                        qiy2.LIZLLL(0, str2, jSONObject);
                    }
                }
            } catch (Throwable th) {
                LJI().LIZJ(5, "notify event observer before store failed", th, new Object[0]);
            }
        }
    }

    public final void LJIILLIIL(Throwable th) {
        if (th instanceof SQLiteException) {
            this.LIZ.LJLJI.LIZLLL.LJ(QIQ.database, QIK.f_exception);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        if (r15 != false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012a A[Catch: all -> 0x0160, LOOP:2: B:58:0x0124->B:60:0x012a, LOOP_END, TryCatch #0 {all -> 0x0160, blocks: (B:57:0x0120, B:58:0x0124, B:60:0x012a, B:62:0x013e, B:63:0x0142, B:65:0x0148), top: B:56:0x0120 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0148 A[Catch: all -> 0x0160, LOOP:3: B:63:0x0142->B:65:0x0148, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0160, blocks: (B:57:0x0120, B:58:0x0124, B:60:0x012a, B:62:0x013e, B:63:0x0142, B:65:0x0148), top: B:56:0x0120 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(java.util.ArrayList<X.QI2> r20) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66758QHy.LJIIZILJ(java.util.ArrayList):void");
    }

    public final List<C66750QHq> LJIJJLI(C66750QHq c66750QHq) {
        long j;
        long j2;
        String valueOf;
        ArrayList arrayList = new ArrayList();
        if (this.LIZ.LJLJI.LJJIJL && this.LIZ.LJLJI.LJJIJLIJ != null) {
            EnumC66752QHs enumC66752QHs = this.LIZ.LJLJI.LJJIJLIJ;
            c66750QHq.getClass();
            HashMap hashMap = new HashMap();
            for (int i = 0; !QB0.LIZ(c66750QHq.LLFF) && i < c66750QHq.LLFF.length(); i++) {
                JSONObject optJSONObject = c66750QHq.LLFF.optJSONObject(i);
                String LJIIJJI = C78929UyL.LJIIJJI(enumC66752QHs, optJSONObject);
                if (!hashMap.containsKey(LJIIJJI)) {
                    hashMap.put(LJIIJJI, c66750QHq.LJIIZILJ(enumC66752QHs, LJIIJJI));
                }
                ((C66750QHq) hashMap.get(LJIIJJI)).LLFF.put(optJSONObject);
            }
            for (int i2 = 0; !QB0.LIZ(c66750QHq.LLFII) && i2 < c66750QHq.LLFII.length(); i2++) {
                JSONObject optJSONObject2 = c66750QHq.LLFII.optJSONObject(i2);
                String LJIIJJI2 = C78929UyL.LJIIJJI(enumC66752QHs, optJSONObject2);
                if (!hashMap.containsKey(LJIIJJI2)) {
                    hashMap.put(LJIIJJI2, c66750QHq.LJIIZILJ(enumC66752QHs, LJIIJJI2));
                }
                ((C66750QHq) hashMap.get(LJIIJJI2)).LLFII.put(optJSONObject2);
            }
            for (int i3 = 0; !QB0.LIZ(c66750QHq.LLIIIJ) && i3 < c66750QHq.LLIIIJ.length(); i3++) {
                JSONObject optJSONObject3 = c66750QHq.LLIIIJ.optJSONObject(i3);
                String LJIIJJI3 = C78929UyL.LJIIJJI(enumC66752QHs, optJSONObject3);
                if (!hashMap.containsKey(LJIIJJI3)) {
                    hashMap.put(LJIIJJI3, c66750QHq.LJIIZILJ(enumC66752QHs, LJIIJJI3));
                }
                ((C66750QHq) hashMap.get(LJIIJJI3)).LLIIIJ.put(optJSONObject3);
            }
            QIH qih = c66750QHq.LLI;
            String str = "";
            if (qih != null) {
                if (enumC66752QHs == null || enumC66752QHs != EnumC66752QHs.USER_ID) {
                    valueOf = "";
                } else {
                    valueOf = String.valueOf(qih.LJLJJL);
                }
                if (!hashMap.containsKey(valueOf)) {
                    hashMap.put(valueOf, c66750QHq.LJIIZILJ(enumC66752QHs, valueOf));
                }
                ((C66750QHq) hashMap.get(valueOf)).LLI = c66750QHq.LLI;
            }
            if (c66750QHq.LLII != null) {
                if (hashMap.isEmpty()) {
                    QIM qim = c66750QHq.LLII;
                    if (qim != null && enumC66752QHs != null && enumC66752QHs == EnumC66752QHs.USER_ID) {
                        str = String.valueOf(qim.LJLJJL);
                    }
                    hashMap.put(str, c66750QHq.LJIIZILJ(enumC66752QHs, str));
                }
                Iterator it = hashMap.keySet().iterator();
                if (it.hasNext()) {
                    Object next = it.next();
                    ((C66750QHq) hashMap.get(next)).LLII = c66750QHq.LLII;
                    if (!QB0.LIZ(c66750QHq.LLIFFJFJJ)) {
                        ((C66750QHq) hashMap.get(next)).LLIFFJFJJ = c66750QHq.LLIFFJFJJ;
                    }
                }
            }
            if (!hashMap.isEmpty()) {
                if (hashMap.size() == 1) {
                    c66750QHq.LLILL = enumC66752QHs.getKey();
                    c66750QHq.LLILLIZIL = ((String[]) hashMap.keySet().toArray(new String[0]))[0];
                } else {
                    Collection values = hashMap.values();
                    if (values != null) {
                        LJI().LJIJI(5, null, "Pack split to {} packs for data isolate: {}", Integer.valueOf(values.size()), this.LIZ.LJLJI.LJJIJLIJ);
                        arrayList.addAll(values);
                    }
                }
            }
            arrayList.add(c66750QHq);
        } else {
            arrayList.add(c66750QHq);
        }
        long j3 = 0;
        if (this.LIZ.LJLJJI.LJ.getLong("max_pack_size", 0L) > 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C66750QHq c66750QHq2 = (C66750QHq) it2.next();
                long j4 = this.LIZ.LJLJJI.LJ.getLong("max_pack_size", j3);
                c66750QHq2.getClass();
                ArrayList arrayList3 = new ArrayList();
                if (c66750QHq2.LJIILIIL().toString().length() < j4) {
                    arrayList3.add(c66750QHq2);
                } else {
                    JSONObject jSONObject = c66750QHq2.LLIIIILZ;
                    if (jSONObject != null) {
                        j = jSONObject.toString().length();
                    } else {
                        j = 0;
                    }
                    C66750QHq c66750QHq3 = new C66750QHq();
                    c66750QHq3.LJIJJLI(c66750QHq2.LJLLJ, c66750QHq2.LLIIIILZ, c66750QHq2.LLI, c66750QHq2.LLII, c66750QHq2.LLIFFJFJJ, new JSONArray[]{null, null, null}, new long[]{c66750QHq2.LLFFF, c66750QHq2.LLFZ, c66750QHq2.LLIIIL}, c66750QHq2.LLIIIZ, c66750QHq2.LLIL, c66750QHq2.LLILLJJLI);
                    c66750QHq3.LJLJJI = c66750QHq2.LJLJJI;
                    c66750QHq3.LLILL = c66750QHq2.LLILL;
                    c66750QHq3.LLILLIZIL = c66750QHq2.LLILLIZIL;
                    arrayList3.add(c66750QHq3);
                    long j5 = j4 - j;
                    if (c66750QHq2.LLI != null) {
                        j2 = j5 - r0.LJIILIIL().toString().length();
                    } else {
                        j2 = j5;
                    }
                    if (c66750QHq2.LLII != null) {
                        j2 -= r0.LJIILIIL().toString().length();
                    }
                    if (c66750QHq2.LLIIIZ != null) {
                        j2 -= r0.toString().length();
                    }
                    for (int i4 = 0; !QB0.LIZ(c66750QHq2.LLFF) && i4 < c66750QHq2.LLFF.length(); i4++) {
                        JSONObject optJSONObject4 = c66750QHq2.LLFF.optJSONObject(i4);
                        if (optJSONObject4 != null) {
                            long length = optJSONObject4.toString().length();
                            j2 -= length;
                            if (j2 > 0) {
                                if (c66750QHq3.LLFF == null) {
                                    c66750QHq3.LLFF = new JSONArray();
                                }
                                c66750QHq3.LLFF.put(optJSONObject4);
                            } else {
                                c66750QHq3 = c66750QHq2.LJIJI();
                                arrayList3.add(c66750QHq3);
                                JSONArray jSONArray = new JSONArray();
                                c66750QHq3.LLFF = jSONArray;
                                jSONArray.put(optJSONObject4);
                                j2 = j5 - length;
                            }
                        }
                    }
                    for (int i5 = 0; !QB0.LIZ(c66750QHq2.LLFII) && i5 < c66750QHq2.LLFII.length(); i5++) {
                        JSONObject optJSONObject5 = c66750QHq2.LLFII.optJSONObject(i5);
                        if (optJSONObject5 != null) {
                            long length2 = optJSONObject5.toString().length();
                            j2 -= length2;
                            if (j2 > 0) {
                                if (c66750QHq3.LLFII == null) {
                                    c66750QHq3.LLFII = new JSONArray();
                                }
                                c66750QHq3.LLFII.put(optJSONObject5);
                            } else {
                                c66750QHq3 = c66750QHq2.LJIJI();
                                arrayList3.add(c66750QHq3);
                                JSONArray jSONArray2 = new JSONArray();
                                c66750QHq3.LLFII = jSONArray2;
                                jSONArray2.put(optJSONObject5);
                                j2 = j5 - length2;
                            }
                        }
                    }
                    for (int i6 = 0; !QB0.LIZ(c66750QHq2.LLIIIJ) && i6 < c66750QHq2.LLIIIJ.length(); i6++) {
                        JSONObject optJSONObject6 = c66750QHq2.LLIIIJ.optJSONObject(i6);
                        if (optJSONObject6 != null) {
                            long length3 = optJSONObject6.toString().length();
                            j2 -= length3;
                            if (j2 > 0) {
                                if (c66750QHq3.LLIIIJ == null) {
                                    c66750QHq3.LLIIIJ = new JSONArray();
                                }
                                c66750QHq3.LLIIIJ.put(optJSONObject6);
                            } else {
                                c66750QHq3 = c66750QHq2.LJIJI();
                                arrayList3.add(c66750QHq3);
                                JSONArray jSONArray3 = new JSONArray();
                                c66750QHq3.LLIIIJ = jSONArray3;
                                jSONArray3.put(optJSONObject6);
                                j2 = j5 - length3;
                            }
                        }
                    }
                }
                arrayList2.addAll(arrayList3);
                j3 = 0;
            }
            return arrayList2;
        }
        return arrayList;
    }

    public final void LJIL(QIQ qiq) {
        try {
            Field declaredField = CursorWindow.class.getDeclaredField("sCursorWindowSize");
            declaredField.setAccessible(true);
            int i = declaredField.getInt(null);
            if (i > 0 && i <= 8388608) {
                declaredField.setInt(null, i * 2);
                this.LIZ.LJLJI.LIZLLL.LJ(qiq, QIK.increase_cursor_window_size);
            } else {
                this.LIZ.LJLJI.LIZLLL.LJ(qiq, QIK.cursor_window_size_overflow);
            }
        } catch (Throwable th) {
            LJI().LIZJ(5, "tryIncreaseCursorWindowSize", th, new Object[0]);
        }
    }

    public C66758QHy(QI4 qi4, String str) {
        HashMap<String, QI2> hashMap = new HashMap<>();
        this.LIZJ = hashMap;
        QI2[] LJ = QI2.LJ();
        this.LIZLLL = LJ;
        this.LIZIZ = new C66759QHz(this, qi4.LJLJI.LJIIJ, str);
        this.LIZ = qi4;
        hashMap.put("page", new QID());
        hashMap.put("launch", new QIH());
        hashMap.put("terminate", new QIM());
        hashMap.put("pack", new C66750QHq());
        int i = 0;
        do {
            QI2 qi2 = LJ[i];
            this.LIZJ.put(qi2.LJIIIZ(), qi2);
            i++;
        } while (i < 3);
        this.LJFF = new QI1[]{new QI1(this), new QI1(this), new QI1(this)};
    }

    public static String LJIJI(int i, QHC qhc) {
        StringBuilder sb = new StringBuilder("SELECT * FROM pack");
        if (qhc != null) {
            int i2 = qhc.LIZ;
            if (-1 == i2) {
                StringBuilder LIZ = C06830Op.LIZ(" WHERE priority=", i2, " OR ", "priority", ">");
                LIZ.append(qhc.LIZIZ);
                sb.append(X1D.LIZIZ(LIZ));
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" WHERE priority=");
                LIZ2.append(i2);
                sb.append(X1D.LIZIZ(LIZ2));
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(" ORDER BY _id DESC LIMIT ");
        LIZ3.append(i);
        sb.append(X1D.LIZIZ(LIZ3));
        return sb.toString();
    }

    public static String LJIJJ(String str, boolean z) {
        String str2;
        String str3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SELECT * FROM page WHERE session_id");
        if (z) {
            str2 = "='";
        } else {
            str2 = "!='";
        }
        C1DI.LIZIZ(LIZ, str2, str, "' ORDER BY ");
        if (z) {
            str3 = "session_id,";
        } else {
            str3 = "";
        }
        return C025908h.LIZIZ(LIZ, str3, "duration", " DESC LIMIT 1000", LIZ);
    }

    public final JSONObject LIZIZ(QIH qih, JSONObject jSONObject) {
        String str;
        long j;
        String str2 = qih.LLD;
        QIF qif = ((C66760QIa) this.LIZ.LJLJLJ.LIZ).LIZIZ;
        if (qif != null) {
            str = qif.LJ();
        } else {
            str = "";
        }
        if (TextUtils.equals(str2, str)) {
            long j2 = qih.LL;
            QIF qif2 = ((C66760QIa) this.LIZ.LJLJLJ.LIZ).LIZIZ;
            if (qif2 != null) {
                j = qif2.LJFF();
            } else {
                j = 0;
            }
            if (j2 == j) {
                return jSONObject;
            }
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            C66735QHb.LIZJ(jSONObject2, jSONObject);
            jSONObject2.put("app_version", qih.LLD);
            jSONObject2.put("version_code", qih.LL);
            jSONObject = jSONObject2;
            return jSONObject;
        } catch (JSONException e) {
            LJI().LIZJ(5, "check version failed", e, new Object[0]);
            return jSONObject;
        }
    }

    public final void LIZJ(SQLiteDatabase sQLiteDatabase, HashMap<String, JSONObject> hashMap, QHC qhc) {
        QI2 qi2;
        Cursor cursor;
        if ((qhc != null && qhc.LIZ != -1) || (qi2 = this.LIZJ.get("launch")) == null) {
            return;
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SELECT * FROM launch ORDER BY _id DESC LIMIT ");
            LIZ.append(3);
            cursor = sQLiteDatabase.rawQuery(X1D.LIZIZ(LIZ), null);
            try {
                for (boolean moveToLast = cursor.moveToLast(); moveToLast; moveToLast = cursor.moveToPrevious()) {
                    qi2.LJIIJ(cursor);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        this.LIZ.LJLJI.LIZ.LIZIZ(qi2.LJLJJI, qi2.LJLIL, jSONObject);
                    } catch (Throwable th) {
                        LJI().LJIJI(5, null, "onSessionBatchEvent failed", th);
                    }
                    hashMap.put(qi2.LJLJJI, jSONObject);
                }
                try {
                    cursor.close();
                } catch (Throwable th2) {
                    LJI().LJIJI(5, null, "close cursor failed", th2);
                }
            } catch (Throwable th3) {
                th = th3;
                try {
                    LJI().LJIJI(5, null, "collect impression failed", th);
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Throwable th4) {
                            LJI().LJIJI(5, null, "close cursor failed", th4);
                        }
                    }
                } catch (Throwable th5) {
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (Throwable th6) {
                            LJI().LJIJI(5, null, "close cursor failed", th6);
                        }
                    }
                    throw th5;
                }
            }
        } catch (Throwable th7) {
            th = th7;
            cursor = null;
        }
    }

    public final JSONArray LJFF(String str, HashMap<String, JSONObject> hashMap, QHC qhc) {
        JSONArray optJSONArray;
        JSONArray jSONArray = null;
        if (qhc != null && qhc.LIZ != -1) {
            return null;
        }
        JSONObject remove = hashMap.remove(str);
        if (remove != null && ((optJSONArray = remove.optJSONArray("item_impression")) == null || optJSONArray.length() != 0)) {
            jSONArray = optJSONArray;
            if (optJSONArray != null && optJSONArray.length() != 0) {
                this.LIZ.LJLJI.LIZLLL.LJI(QIQ.item_impression, QIK.init, jSONArray.length());
            }
        }
        if (C66741QHh.LIZIZ(this.LIZ.LJLJI.LJIIIZ) && jSONArray != null) {
            C66741QHh.LIZJ(this.LIZ.LJLJI.LJIIIZ, "item_impression", jSONArray);
        }
        return jSONArray;
    }

    public final boolean LJIIIZ(String str, QHC qhc, boolean z) {
        Object obj;
        int i;
        QIX LJI = LJI();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("needLaunch, ");
        YE1.LIZLLL(LIZ, this.LJ, ", ", str, ", ");
        LIZ.append(z);
        LIZ.append(", ");
        if (qhc != null) {
            obj = Integer.valueOf(qhc.LIZ);
        } else {
            obj = "null";
        }
        LIZ.append(obj);
        LJI.LJIJI(5, null, X1D.LIZIZ(LIZ), new Object[0]);
        if ((qhc != null && ((i = qhc.LIZ) == 0 || (-1 != i && !z))) || TextUtils.equals(str, this.LJ)) {
            return false;
        }
        this.LJ = str;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C66750QHq r15, boolean r16, android.database.sqlite.SQLiteDatabase r17, X.QHC r18) {
        /*
            r14 = this;
            r0 = r17
            r1 = 1
            r7 = 0
            if (r0 != 0) goto L11
            X.QHz r2 = r14.LIZIZ     // Catch: java.lang.Throwable -> Le
            android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> Le
            r6 = 1
            goto L13
        Le:
            r2 = move-exception
            r6 = 0
            goto L70
        L11:
            r6 = 0
            goto L16
        L13:
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L6f
        L16:
            java.util.List r2 = r14.LJIJJLI(r15)     // Catch: java.lang.Throwable -> L6f
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L6f
            java.util.Iterator r3 = r2.iterator()     // Catch: java.lang.Throwable -> L6f
        L20:
            boolean r2 = r3.hasNext()     // Catch: java.lang.Throwable -> L6f
            r10 = r16
            r13 = r18
            if (r2 == 0) goto L34
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L6f
            X.QHq r2 = (X.C66750QHq) r2     // Catch: java.lang.Throwable -> L6f
            r14.LJIIIIZZ(r0, r13, r2, r10)     // Catch: java.lang.Throwable -> L6f
            goto L20
        L34:
            long r11 = r15.LLFFF     // Catch: java.lang.Throwable -> L6f
            r3 = 0
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 <= 0) goto L47
            java.lang.String r8 = "event"
            java.lang.String r9 = r15.LJLJJI     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = LIZLLL(r8, r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L6f
            r0.execSQL(r2)     // Catch: java.lang.Throwable -> L6f
        L47:
            long r11 = r15.LLFZ     // Catch: java.lang.Throwable -> L6f
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 <= 0) goto L58
            java.lang.String r8 = "eventv3"
            java.lang.String r9 = r15.LJLJJI     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = LIZLLL(r8, r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L6f
            r0.execSQL(r2)     // Catch: java.lang.Throwable -> L6f
        L58:
            long r11 = r15.LLIIIL     // Catch: java.lang.Throwable -> L6f
            int r2 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r2 <= 0) goto L69
            java.lang.String r8 = "event_misc"
            java.lang.String r9 = r15.LJLJJI     // Catch: java.lang.Throwable -> L6f
            java.lang.String r2 = LIZLLL(r8, r9, r10, r11, r13)     // Catch: java.lang.Throwable -> L6f
            r0.execSQL(r2)     // Catch: java.lang.Throwable -> L6f
        L69:
            if (r6 == 0) goto L87
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L6f
            goto L84
        L6f:
            r2 = move-exception
        L70:
            r14.LJIILLIIL(r2)     // Catch: java.lang.Throwable -> L88
            X.QIX r5 = r14.LJI()     // Catch: java.lang.Throwable -> L88
            java.lang.String r4 = "delete pack data failed"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L88
            r3[r7] = r2     // Catch: java.lang.Throwable -> L88
            r2 = 0
            r1 = 5
            r5.LJIJI(r1, r2, r4, r3)     // Catch: java.lang.Throwable -> L88
            if (r6 == 0) goto L87
        L84:
            X.C66735QHb.LJ(r0)
        L87:
            return
        L88:
            r1 = move-exception
            if (r6 == 0) goto L8e
            X.C66735QHb.LJ(r0)
        L8e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66758QHy.LJ(X.QHq, boolean, android.database.sqlite.SQLiteDatabase, X.QHC):void");
    }

    public final void LJIIIIZZ(SQLiteDatabase sQLiteDatabase, QHC qhc, C66750QHq c66750QHq, boolean z) {
        JSONArray jSONArray;
        String str;
        JSONArray jSONArray2;
        QIB qib = this.LIZ.LJLJI.LIZLLL;
        QIQ qiq = QIQ.pack;
        qib.LJ(qiq, QIK.init);
        c66750QHq.getClass();
        ContentValues contentValues = new ContentValues();
        c66750QHq.LJIILJJIL(contentValues);
        long insert = sQLiteDatabase.insert("pack", null, contentValues);
        if (insert < 0) {
            if (c66750QHq.LLI != null) {
                LJIIIZ(null, qhc, true);
                if (!c66750QHq.LLI.LLF) {
                    this.LIZ.LJLJI.LIZLLL.LJ(QIQ.launch, QIK.f_db_insert);
                }
            }
            if (c66750QHq.LLII != null && (jSONArray2 = c66750QHq.LLIFFJFJJ) != null && jSONArray2.length() > 0) {
                this.LIZ.LJLJI.LIZLLL.LJ(QIQ.terminate, QIK.f_db_insert);
            }
            this.LIZ.LJLJI.LIZLLL.LJ(qiq, QIK.f_db_insert);
            c66750QHq.LJIJJ(QIQ.f_db_insert_event);
            QIX LJI = LJI();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("insert to db failed, pack: ");
            LIZ.append(c66750QHq);
            LIZ.append(", result: ");
            LIZ.append(insert);
            LJI.LIZLLL(5, null, X1D.LIZIZ(LIZ), new Object[0]);
            throw new SQLiteException("insert pack to db failed for result id < 0.");
        }
        if (c66750QHq.LLII != null && (jSONArray = c66750QHq.LLIFFJFJJ) != null && jSONArray.length() > 0) {
            String str2 = c66750QHq.LJLJJI;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("DELETE FROM page WHERE session_id");
            if (z) {
                str = "='";
            } else {
                str = "!='";
            }
            LIZ2.append(str);
            LIZ2.append(str2);
            LIZ2.append("'");
            sQLiteDatabase.execSQL(X1D.LIZIZ(LIZ2));
        }
    }

    public static String LIZLLL(String str, String str2, boolean z, long j, QHC qhc) {
        StringBuilder sb = new StringBuilder(C0ON.LIZJ("DELETE FROM ", str, " WHERE ", "session_id"));
        if (z) {
            sb.append("='");
        } else {
            sb.append("!='");
        }
        StringBuilder LIZLLL = C1FL.LIZLLL(str2, "' AND ", "_id", "<=");
        LIZLLL.append(j);
        sb.append(X1D.LIZIZ(LIZLLL));
        if (qhc != null) {
            int i = qhc.LIZ;
            if (-1 == i) {
                StringBuilder LIZ = C06830Op.LIZ(" AND (priority=", i, " OR ", "priority", ">");
                LIZ.append(qhc.LIZIZ);
                LIZ.append(")");
                sb.append(X1D.LIZIZ(LIZ));
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(" AND priority=");
                LIZ2.append(i);
                sb.append(X1D.LIZIZ(LIZ2));
            }
        }
        return sb.toString();
    }

    public static String LJIJ(QI2 qi2, String str, boolean z, int i, QHC qhc) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SELECT * FROM ");
        LIZ.append(qi2.LJIIIZ());
        LIZ.append(" WHERE ");
        LIZ.append("session_id");
        StringBuilder sb = new StringBuilder(X1D.LIZIZ(LIZ));
        if (z) {
            sb.append("='");
        } else {
            sb.append("!='");
        }
        sb.append(str);
        if (qhc != null) {
            int i2 = qhc.LIZ;
            if (-1 == i2) {
                StringBuilder LIZ2 = C06830Op.LIZ("' AND (priority=", i2, " OR ", "priority", ">");
                LIZ2.append(qhc.LIZIZ);
                LIZ2.append(")");
                sb.append(X1D.LIZIZ(LIZ2));
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("' AND priority=");
                LIZ3.append(i2);
                sb.append(X1D.LIZIZ(LIZ3));
            }
        } else {
            sb.append("'");
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(" ORDER BY _id LIMIT ");
        LIZ4.append(i);
        sb.append(X1D.LIZIZ(LIZ4));
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIILJJIL(int r14, android.database.sqlite.SQLiteDatabase r15, java.lang.String r16, boolean r17, org.json.JSONArray[] r18, long[] r19, X.QHC r20) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66758QHy.LJIILJJIL(int, android.database.sqlite.SQLiteDatabase, java.lang.String, boolean, org.json.JSONArray[], long[], X.QHC):int");
    }

    public final JSONArray LJIILL(QIH qih, boolean z, QIM qim, QID qid, SQLiteDatabase sQLiteDatabase, QHC qhc, boolean z2) {
        Cursor cursor;
        String str;
        String str2;
        long j;
        boolean z3;
        int i;
        JSONArray jSONArray = new JSONArray();
        if (qhc != null && ((i = qhc.LIZ) == 0 || (-1 != i && !z2))) {
            return jSONArray;
        }
        try {
            cursor = sQLiteDatabase.rawQuery(LJIJJ(qih.LJLJJI, z), null);
            try {
                HashMap hashMap = new HashMap(8);
                str = null;
                str2 = null;
                j = 0;
                while (cursor.moveToNext()) {
                    try {
                        qid.LJIIJ(cursor);
                        QIX LJI = LJI();
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("queryPage, ");
                        LIZ.append(qid);
                        LJI.LJIJI(5, null, X1D.LIZIZ(LIZ), new Object[0]);
                        Integer num = (Integer) hashMap.get(qid.LLF);
                        int i2 = 1;
                        if (qid.LL == -1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            String str3 = qid.LLF;
                            if (num != null) {
                                i2 = 1 + num.intValue();
                            }
                            hashMap.put(str3, Integer.valueOf(i2));
                            long j2 = qid.LL;
                            if (j2 >= 1000) {
                                j += j2;
                            } else {
                                j += 1000;
                            }
                            jSONArray.put(qid.LJIILIIL());
                            if (!TextUtils.isEmpty(qid.LLFFF)) {
                                str = qid.LLFFF;
                                str2 = qid.LJLJL;
                            }
                        } else if (num != null) {
                            Integer valueOf = Integer.valueOf(num.intValue() - 1);
                            if (valueOf.intValue() > 0) {
                                hashMap.put(qid.LLF, valueOf);
                            } else {
                                hashMap.remove(qid.LLF);
                            }
                        } else {
                            qid.LL = 1000L;
                            j += 1000;
                            jSONArray.put(qid.LJIILIIL());
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            LJI().LIZJ(5, "query page failed", th, new Object[0]);
                        } finally {
                            if (cursor != null) {
                                cursor.close();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                str = null;
                str2 = null;
                j = 0;
                LJI().LIZJ(5, "query page failed", th, new Object[0]);
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (jSONArray.length() > 0) {
            if (j <= 1000) {
                j = 1000;
            }
            qim.LJLZ = C66735QHb.LJFF();
            qim.LJLLJ = this.LIZ.LJLJI.LJIIIZ;
            qim.LL = j;
            if (z) {
                qim.LJLJJI = qih.LJLJJI;
                qim.LJIIL(qih.LJLILLLLZI);
            } else {
                qim.LJLJJI = UUID.randomUUID().toString();
                qim.LJIIL(0L);
            }
            this.LIZ.LJLLI.LIZIZ(qim, qih.LJLJJL);
            qim.LJLJL = qih.LJLJL;
            qim.LLD = qim.LJLILLLLZI + j;
            qim.LJLJI = this.LIZ.LJLLI.LJFF.incrementAndGet();
            qim.LLF = null;
            if (!TextUtils.isEmpty(qih.LLFF)) {
                qim.LLF = qih.LLFF;
            } else if (!TextUtils.isEmpty(str)) {
                qim.LLF = str;
                qim.LJLJL = str2;
            }
            try {
                this.LIZ.LJLJI.LIZ.LIZJ(qim.LJLJJI, -1L, qim.LJIILIIL());
            } catch (Throwable th4) {
                LJI().LIZJ(5, "notify session terminate failed", th4, new Object[0]);
            }
            QI0.LIZJ(qim, "event_receive");
        }
        return jSONArray;
    }

    public final void LJIIJJI(JSONObject jSONObject, QIH qih, C66750QHq c66750QHq, SQLiteDatabase sQLiteDatabase, JSONArray[] jSONArrayArr, long[] jArr, HashMap<String, JSONObject> hashMap, QHC qhc, int i) {
        QIH qih2;
        QIH qih3;
        QIX LJI = LJI();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("packCurrentData, ");
        LIZ.append(qih.LJLJJI);
        LJI.LJIJI(5, null, X1D.LIZIZ(LIZ), new Object[0]);
        JSONArray[] jSONArrayArr2 = jSONArrayArr;
        long[] jArr2 = jArr;
        int LJIILJJIL = LJIILJJIL(0, sQLiteDatabase, qih.LJLJJI, true, jSONArrayArr2, jArr2, qhc);
        boolean LJIIIZ = LJIIIZ(qih.LJLJJI, qhc, LJII(jArr2));
        JSONArray LJFF = LJFF(qih.LJLJJI, hashMap, qhc);
        C66750QHq c66750QHq2 = c66750QHq;
        JSONObject jSONObject2 = jSONObject;
        int i2 = i;
        if (LJIIIZ || LJII(jArr2) || LJFF != null) {
            String str = this.LIZ.LJLJI.LJIIIZ;
            if (LJIIIZ) {
                qih2 = qih;
            } else {
                qih2 = null;
            }
            c66750QHq2.LJIJJLI(str, jSONObject2, qih2, null, null, jSONArrayArr2, jArr2, LJFF, qhc, i2);
            LJ(c66750QHq2, true, sQLiteDatabase, qhc);
        }
        while (LJIILJJIL < this.LIZLLL.length) {
            LJIILJJIL = LJIILJJIL(LJIILJJIL, sQLiteDatabase, qih.LJLJJI, true, jSONArrayArr2, jArr2, qhc);
            if (LJII(jArr2)) {
                boolean LJIIIZ2 = LJIIIZ(qih.LJLJJI, qhc, true);
                String str2 = this.LIZ.LJLJI.LJIIIZ;
                if (LJIIIZ2) {
                    qih3 = qih;
                } else {
                    qih3 = null;
                }
                c66750QHq2 = c66750QHq2;
                jSONObject2 = jSONObject2;
                jSONArrayArr2 = jSONArrayArr2;
                jArr2 = jArr2;
                i2 = i2;
                c66750QHq2.LJIJJLI(str2, jSONObject2, qih3, null, null, jSONArrayArr2, jArr2, null, qhc, i2);
                LJ(c66750QHq2, true, sQLiteDatabase, qhc);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(org.json.JSONObject r29, X.QIH r30, X.C66750QHq r31, X.QID r32, X.QIM r33, android.database.sqlite.SQLiteDatabase r34, org.json.JSONArray[] r35, long[] r36, java.util.HashMap<java.lang.String, org.json.JSONObject> r37, X.QHC r38, int r39) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66758QHy.LJIIL(org.json.JSONObject, X.QIH, X.QHq, X.QID, X.QIM, android.database.sqlite.SQLiteDatabase, org.json.JSONArray[], long[], java.util.HashMap, X.QHC, int):void");
    }

    public final void LJIILIIL(JSONObject jSONObject, QIH qih, QIM qim, QID qid, C66750QHq c66750QHq, SQLiteDatabase sQLiteDatabase, String str, JSONArray[] jSONArrayArr, long[] jArr, QHC qhc, int i) {
        boolean z;
        QIM qim2 = qim;
        LJI().LJIJI(5, null, i0.LJFF("packLostData, ", str), new Object[0]);
        qih.LJLJJI = str;
        c66750QHq.LJLJJI = str;
        int LJIILJJIL = LJIILJJIL(0, sQLiteDatabase, str, false, jSONArrayArr, jArr, qhc);
        JSONArray LJIILL = LJIILL(qih, false, qim2, qid, sQLiteDatabase, qhc, LJII(jArr));
        if (LJIILL.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        qih.LLF = z;
        if (LJII(jArr) || !qih.LLF) {
            String str2 = this.LIZ.LJLJI.LJIIIZ;
            if (qih.LLF) {
                qim2 = null;
                LJIILL = null;
            }
            c66750QHq.LJIJJLI(str2, jSONObject, null, qim2, LJIILL, jSONArrayArr, jArr, null, qhc, i);
            LJ(c66750QHq, false, sQLiteDatabase, qhc);
        }
        while (LJIILJJIL < this.LIZLLL.length) {
            LJIILJJIL = LJIILJJIL(LJIILJJIL, sQLiteDatabase, str, false, jSONArrayArr, jArr, qhc);
            if (LJII(jArr)) {
                c66750QHq.LJIJJLI(this.LIZ.LJLJI.LJIIIZ, jSONObject, null, null, null, jSONArrayArr, jArr, null, qhc, i);
                LJ(c66750QHq, false, sQLiteDatabase, qhc);
            }
        }
    }
}
