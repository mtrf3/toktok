package com.bytedance.ies.safemode.SmartProtected.state;

import X.C0EH;
import X.C16880lQ;
import X.C66458Q6k;
import X.C66465Q6r;
import X.C66468Q6u;
import X.PP9;
import X.PSY;
import X.Q7B;
import X.Q7C;
import X.Q7D;
import X.Q7G;
import X.Q89;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.safemode.SafeModeReporter;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.o;
import defpackage.q;
import java.io.File;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class ExceptionManager {
    public static volatile ExceptionManager LJIILL;
    public final Q7B LIZ = new Q7B(this);
    public final Q7C LIZIZ = new Q7C(this);
    public final Q7D LIZJ = new Q7D(this);
    public final C66468Q6u LIZLLL = new C66468Q6u(this);
    public final List<CloudException> LJ = new ArrayList();
    public final List<CloudException> LJFF = new ArrayList();
    public final List<CloudException> LJI = new ArrayList();
    public final File LJII;
    public final File LJIIIIZZ;
    public final File LJIIIZ;
    public final File LJIIJ;
    public boolean LJIIJJI;
    public final File LJIIL;
    public final File LJIILIIL;
    public final Gson LJIILJJIL;

    /* loaded from: classes12.dex */
    public static class CloudException implements Q7G {
        public int configType;
        public String[] crashFeatures;
        public String crashType;

        public int getCrashCode() {
            if (this.crashType.equals("java")) {
                return 1;
            }
            return 2;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("CloudException{crashType='");
            Q89.LIZIZ(LIZ, this.crashType, '\'', ", crashFeatures=");
            return q.LIZIZ(LIZ, Arrays.toString(this.crashFeatures), '}', LIZ);
        }

        public String getCrashType() {
            return this.crashType;
        }

        @Override // X.Q7G
        public boolean isSameException(ExceptionRecord exceptionRecord) {
            if (exceptionRecord == null) {
                return false;
            }
            return isSameException(exceptionRecord.crashType, exceptionRecord.crashReason);
        }

        @Override // X.Q7G
        public boolean isSameException(String str, String str2) {
            if (!TextUtils.equals(this.crashType, str)) {
                return false;
            }
            String[] split = str2.split("\n");
            if (this.crashFeatures == null) {
                return false;
            }
            int i = 0;
            int i2 = 0;
            while (i < split.length && i2 < this.crashFeatures.length) {
                if (TextUtils.isEmpty(split[i])) {
                    i++;
                } else {
                    int i3 = i + 1;
                    if (split[i].trim().contains(this.crashFeatures[i2].trim())) {
                        i2++;
                    }
                    i = i3;
                }
            }
            if (i2 != this.crashFeatures.length) {
                return false;
            }
            return true;
        }

        public CloudException(int i, String str, String str2) {
            this.configType = i;
            this.crashType = str;
            this.crashFeatures = str2.split("\n");
        }
    }

    /* loaded from: classes12.dex */
    public static class ExceptionRecord implements Q7G {
        public String crashReason;
        public long crashTimeStamp;
        public String crashType;
        public String uuid;
        public boolean white;

        public int getCrashCode() {
            if (this.crashType.equals("java")) {
                return 1;
            }
            return 2;
        }

        public String getCrashReason() {
            return this.crashReason;
        }

        public String getCrashType() {
            return this.crashType;
        }

        public String getUUID() {
            return this.uuid;
        }

        public static String disposeJavaExceptionStack(String str) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            StringBuilder sb = new StringBuilder(str.length());
            String[] split = str.split("\n");
            int length = split.length;
            if (length > 0) {
                String[] split2 = split[0].split(":");
                if (split2.length > 0) {
                    sb.append(split2[0]);
                    sb.append("\n");
                }
                for (int i = 1; i < length; i = C0EH.LIZIZ(sb, split[i], "\n", i, 1)) {
                }
            }
            return sb.toString();
        }

        public static String disposeNativeExceptionStack(String str) {
            if (TextUtils.isEmpty(str)) {
                return "";
            }
            int indexOf = str.indexOf("#00");
            if (indexOf != -1) {
                return formatNativeCrashReason(str.substring(indexOf));
            }
            return formatNativeCrashReason(str);
        }

        public static String formatNativeCrashReason(String str) {
            return str.replaceAll("#\\d*\\spc\\s\\S{16}\\s{2}", "").replaceAll("#\\d*\\spc\\s\\S{8}\\s{2}", "");
        }

        @Override // X.Q7G
        public boolean isSameException(ExceptionRecord exceptionRecord) {
            if (exceptionRecord == null) {
                return false;
            }
            if (exceptionRecord == this) {
                return true;
            }
            return isSameException(exceptionRecord.crashType, exceptionRecord.crashReason);
        }

        private float calculateSimilarity(List list, List list2) {
            int size = list.size();
            int size2 = list2.size();
            LinkedList linkedList = new LinkedList(list);
            LinkedList linkedList2 = new LinkedList(list2);
            int[] findLongestSublist = findLongestSublist(linkedList, linkedList2);
            int i = findLongestSublist[0];
            int i2 = findLongestSublist[1];
            int i3 = findLongestSublist[2];
            int i4 = 0;
            while (i > 0) {
                i4 += i;
                int i5 = 0;
                do {
                    linkedList.remove(i2);
                    i5++;
                } while (i5 < i);
                int i6 = 0;
                do {
                    linkedList2.remove(i3);
                    i6++;
                } while (i6 < i);
                int[] findLongestSublist2 = findLongestSublist(linkedList, linkedList2);
                i = findLongestSublist2[0];
                i2 = findLongestSublist2[1];
                i3 = findLongestSublist2[2];
            }
            float f = (float) ((i4 * 2.0d) / (size + size2));
            PSY.LJFF("ExceptionManager", C16880lQ.LLLZ("score %f same_length %d,a_length %d b_length %d", new Object[]{Float.valueOf(f), Integer.valueOf(i4), Integer.valueOf(size), Integer.valueOf(size2)}));
            return f;
        }

        private int[] findLongestSublist(List<String> list, List<String> list2) {
            int i;
            int[] iArr = {-1, -1, -1};
            int size = list.size();
            int size2 = list2.size();
            int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, size + 1, size2 + 1);
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = size - 1; i5 >= 0; i5--) {
                for (int i6 = size2 - 1; i6 >= 0; i6--) {
                    int[] iArr3 = iArr2[i5];
                    if (TextUtils.equals((CharSequence) ListProtector.get(list, i5), (CharSequence) ListProtector.get(list2, i6))) {
                        i = iArr2[i5 + 1][i6 + 1] + 1;
                    } else {
                        i = 0;
                    }
                    iArr3[i6] = i;
                    int i7 = iArr2[i5][i6];
                    if (i7 >= i2) {
                        i3 = i5;
                        i4 = i6;
                        i2 = i7;
                    }
                }
            }
            iArr[0] = i2;
            iArr[1] = i3;
            iArr[2] = i4;
            return iArr;
        }

        private boolean isSameStack(String str, String str2) {
            boolean z;
            float calculateSimilarity;
            try {
                long currentTimeMillis = System.currentTimeMillis();
                float floatValue = C66465Q6r.LJIILLIIL.LJIILL.LIZ().floatValue();
                try {
                    if (floatValue < 0.0f) {
                        z = TextUtils.equals(str, str2);
                        try {
                            PSY.LIZIZ("ExceptionManager", C16880lQ.LLLZ("same equals threshold %f use time %dms", new Object[]{Float.valueOf(floatValue), Long.valueOf(System.currentTimeMillis() - currentTimeMillis)}));
                        } catch (Exception e) {
                            e = e;
                            PSY.LIZJ("isSameStack", e);
                            String th = e.toString();
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put("exception", th);
                                jSONObject.put("stack1", str);
                                jSONObject.put("stack2", str2);
                            } catch (JSONException e2) {
                                C16880lQ.LLLLIIL(e2);
                            }
                            SafeModeReporter.LIZJ("safemode_stack_calc_exception", jSONObject);
                            PSY.LIZ(C16880lQ.LLLZ("reportStackCalcException exception:%s", new Object[]{th}));
                            return z;
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (String str3 : str.split("[\\s\\n./():#.+~#$-]")) {
                            if (str3.matches("[a-zA-Z_]+[a-zA-Z_0-9]+")) {
                                arrayList.add(str3);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str4 : str2.split("[\\s\\n./():#.+~#$-]")) {
                            if (str4.matches("[a-zA-Z_]+[a-zA-Z_0-9]+")) {
                                arrayList2.add(str4);
                            }
                        }
                        try {
                            calculateSimilarity = calculateSimilarity(arrayList, arrayList2);
                            if (calculateSimilarity > floatValue) {
                                z = true;
                            } else {
                                z = false;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            z = false;
                            PSY.LIZJ("isSameStack", e);
                            String th2 = e.toString();
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("exception", th2);
                            jSONObject2.put("stack1", str);
                            jSONObject2.put("stack2", str2);
                            SafeModeReporter.LIZJ("safemode_stack_calc_exception", jSONObject2);
                            PSY.LIZ(C16880lQ.LLLZ("reportStackCalcException exception:%s", new Object[]{th2}));
                            return z;
                        }
                        try {
                            PSY.LJFF("ExceptionManager", C16880lQ.LLLZ("calculateSimilarity score %f threshold %f use time %dms", new Object[]{Float.valueOf(calculateSimilarity), Float.valueOf(floatValue), Long.valueOf(System.currentTimeMillis() - currentTimeMillis)}));
                        } catch (Exception e4) {
                            e = e4;
                            PSY.LIZJ("isSameStack", e);
                            String th22 = e.toString();
                            JSONObject jSONObject22 = new JSONObject();
                            jSONObject22.put("exception", th22);
                            jSONObject22.put("stack1", str);
                            jSONObject22.put("stack2", str2);
                            SafeModeReporter.LIZJ("safemode_stack_calc_exception", jSONObject22);
                            PSY.LIZ(C16880lQ.LLLZ("reportStackCalcException exception:%s", new Object[]{th22}));
                            return z;
                        }
                    }
                } catch (Exception e5) {
                    e = e5;
                    z = false;
                }
            } catch (Exception e6) {
                e = e6;
            }
            return z;
        }

        @Override // X.Q7G
        public boolean isSameException(String str, String str2) {
            if (TextUtils.equals(this.crashType, str)) {
                if ("java".equals(str)) {
                    return isSameStack(disposeJavaExceptionStack(this.crashReason), disposeJavaExceptionStack(str2));
                }
                return isSameStack(disposeNativeExceptionStack(this.crashReason), disposeNativeExceptionStack(str2));
            }
            return false;
        }

        public ExceptionRecord(String str, String str2, long j, String str3) {
            this.crashType = str;
            this.crashReason = str2;
            this.crashTimeStamp = j;
            this.uuid = str3;
        }
    }

    public final void LIZIZ() {
        boolean z;
        synchronized (C66458Q6k.class) {
            z = C66458Q6k.LIZ.LIZ.getBoolean("last_operator_is_clean", false);
        }
        if (z) {
            PSY.LJFF("ExceptionManager", "last operator is clear,now clear history crash data");
            this.LIZ.LIZ().clear();
            LJII(this.LIZ.LIZ(), this.LJII);
            C66458Q6k.LIZIZ(false);
        }
    }

    public final ExceptionRecord LIZLLL() {
        if (!this.LJIIL.exists()) {
            return null;
        }
        try {
            return (ExceptionRecord) this.LJIILJJIL.LJI(FileUtils.readFileToString(this.LJIIL, Charset.forName("UTF-8")), ExceptionRecord.class);
        } catch (Exception e) {
            PP9.LIZJ(12, e);
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public final void LJFF() {
        String str;
        PSY.LIZIZ("ExceptionManager", "----------Exception Manager----------");
        for (ExceptionRecord exceptionRecord : this.LIZ.LIZ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(exceptionRecord.crashType);
            LIZ.append(exceptionRecord.crashReason);
            PSY.LIZIZ("ExceptionManager", C16880lQ.LLLZ("exception in checking crash type: %s %s", new Object[]{exceptionRecord.crashType, PP9.LIZIZ(X1D.LIZIZ(LIZ))}));
        }
        for (ExceptionRecord exceptionRecord2 : this.LIZJ.LIZ()) {
            Object[] objArr = new Object[3];
            if (this.LJIIJJI) {
                str = "smart";
            } else {
                str = "boot";
            }
            objArr[0] = str;
            objArr[1] = exceptionRecord2.crashType;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(exceptionRecord2.crashType);
            LIZ2.append(exceptionRecord2.crashReason);
            objArr[2] = PP9.LIZIZ(X1D.LIZIZ(LIZ2));
            PSY.LIZIZ("ExceptionManager", C16880lQ.LLLZ("exception in %s quiet type: %s %s", objArr));
        }
        for (ExceptionRecord exceptionRecord3 : this.LIZIZ.LIZ()) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(exceptionRecord3.crashType);
            LIZ3.append(exceptionRecord3.crashReason);
            PSY.LIZIZ("ExceptionManager", C16880lQ.LLLZ("exception in type: %s %s white", new Object[]{exceptionRecord3.crashType, PP9.LIZIZ(X1D.LIZIZ(LIZ3))}));
        }
        Iterator<String> it = this.LIZLLL.LIZ().iterator();
        while (it.hasNext()) {
            PSY.LIZIZ("ExceptionManager", C16880lQ.LLLZ("uuid record: %s", new Object[]{it.next()}));
        }
        PSY.LIZIZ("ExceptionManager", "-------------------------------------");
    }

    public final int LJIIIIZZ() {
        synchronized (ExceptionManager.class) {
            C66465Q6r c66465Q6r = C66465Q6r.LJIILLIIL;
            long longValue = c66465Q6r.LJIILIIL.LIZ().longValue();
            long longValue2 = c66465Q6r.LJIIL.LIZ().longValue();
            if (!this.LJIIJJI) {
                longValue = c66465Q6r.LJIIJ.LIZ().longValue();
                longValue2 = c66465Q6r.LJIIIZ.LIZ().longValue();
            }
            if (this.LIZJ.LIZ().size() == longValue) {
                return 2;
            }
            int size = this.LIZJ.LIZ().size();
            for (int i = 0; i < size; i++) {
                ExceptionRecord exceptionRecord = this.LIZJ.LIZ().get(i);
                int i2 = 0;
                for (int i3 = i; i3 < size; i3++) {
                    if (this.LIZJ.LIZ().get(i3).isSameException(exceptionRecord)) {
                        i2++;
                    }
                }
                if (i2 == longValue2) {
                    return 1;
                }
            }
            return 0;
        }
    }

    public ExceptionManager(Context context) {
        File file = new File(C16880lQ.LLIIJLIL(context).getAbsolutePath(), "ExceptionManager");
        this.LJII = new File(file, "record.json");
        this.LJIIIIZZ = new File(file, "whitelist.json");
        this.LJIIIZ = new File(file, "quiet.json");
        this.LJIIJ = new File(file, "bootQuiet.json");
        this.LJIIL = new File(file, "last.json");
        new File(file, "rollbackResult.json");
        this.LJIILIIL = new File(file, "nativeUUIDs.json");
        e eVar = new e();
        eVar.LJIILL = true;
        this.LJIILJJIL = eVar.LIZ();
    }

    public static ExceptionManager LIZJ(Context context) {
        if (LJIILL == null) {
            synchronized (ExceptionManager.class) {
                if (LJIILL == null) {
                    LJIILL = new ExceptionManager(context);
                    LJIILL.LJIIJJI = true;
                }
            }
        }
        return LJIILL;
    }

    public final void LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            PSY.LIZLLL("ExceptionManager", "buildCloudList conf is empty");
            return;
        }
        PSY.LJFF("ExceptionManager", C16880lQ.LLLZ("buildCloudList conf is %s", new Object[]{str}));
        Iterator<j> it = GsonProtectorUtils.parse(new o(), str).LJIILLIIL().iterator();
        while (it.hasNext()) {
            j next = it.next();
            if (next != null) {
                try {
                    m LJIIZILJ = next.LJIIZILJ();
                    int LJIILJJIL = LJIIZILJ.LJJIJ("type").LJIILJJIL();
                    if (LJIILJJIL != 1 && LJIILJJIL != 2 && LJIILJJIL != 4 && LJIILJJIL != 6) {
                        PSY.LIZLLL("ExceptionManager", C16880lQ.LLLZ("invalid type %d", new Object[]{Integer.valueOf(LJIILJJIL)}));
                    } else {
                        String LJJIFFI = LJIIZILJ.LJJIJ("crashType").LJJIFFI();
                        String LJJIFFI2 = LJIIZILJ.LJJIJ("stack").LJJIFFI();
                        if (TextUtils.isEmpty(LJJIFFI2)) {
                            PSY.LIZLLL("ExceptionManager", "createCloudConfItem stack is null");
                        } else {
                            PSY.LIZIZ("ExceptionManager", C16880lQ.LLLZ("cloudExceptionConf type %d", new Object[]{Integer.valueOf(LJIILJJIL)}));
                            PSY.LIZIZ("ExceptionManager", C16880lQ.LLLZ("cloudExceptionConf crashType %s", new Object[]{LJJIFFI}));
                            PSY.LIZIZ("ExceptionManager", C16880lQ.LLLZ("cloudExceptionConf stack %s", new Object[]{LJJIFFI2}));
                            CloudException cloudException = new CloudException(LJIILJJIL, LJJIFFI, LJJIFFI2);
                            int i = cloudException.configType;
                            if ((i & 1) == 1) {
                                ((ArrayList) this.LJ).add(cloudException);
                                PSY.LIZIZ("ExceptionManager", C16880lQ.LLLZ("add conf %s to immediatelyRollBackList", new Object[]{cloudException.toString()}));
                            }
                            if ((i & 2) == 2) {
                                ((ArrayList) this.LJFF).add(cloudException);
                                PSY.LIZIZ("ExceptionManager", C16880lQ.LLLZ("add conf %s to whiteSmartP", new Object[]{cloudException.toString()}));
                            }
                            if ((i & 4) == 4) {
                                ((ArrayList) this.LJI).add(cloudException);
                                PSY.LIZIZ("ExceptionManager", C16880lQ.LLLZ("add conf %s to whiteBootP", new Object[]{cloudException.toString()}));
                            }
                        }
                    }
                } catch (Exception e) {
                    PSY.LIZLLL("ExceptionManager", C16880lQ.LLLZ("gen cloudConf failed error %s", new Object[]{e.toString()}));
                }
            }
        }
    }

    public final List<ExceptionRecord> LJ(File file) {
        if (file != null && file.exists()) {
            try {
                ExceptionRecord[] exceptionRecordArr = (ExceptionRecord[]) this.LJIILJJIL.LJI(FileUtils.readFileToString(file, Charset.forName("UTF-8")), ExceptionRecord[].class);
                if (exceptionRecordArr != null) {
                    return new ArrayList(Arrays.asList(exceptionRecordArr));
                }
            } catch (Exception e) {
                PP9.LIZJ(10, e);
                C16880lQ.LLLLIIL(e);
            }
        }
        return new ArrayList();
    }

    public final void LJII(Object obj, File file) {
        try {
            FileUtils.writeStringToFile(file, GsonProtectorUtils.toJson(this.LJIILJJIL, obj), Charset.forName("UTF-8"));
        } catch (Exception e) {
            PP9.LIZJ(11, e);
            C16880lQ.LLLLIIL(e);
        }
    }

    public final ExceptionRecord LJI(String str, String str2, long j, List list, File file, long j2) {
        ExceptionRecord exceptionRecord = new ExceptionRecord(str, str2, j, "");
        list.add(exceptionRecord);
        while (list.size() > j2) {
            ListProtector.remove(list, 0);
        }
        LJII(list, file);
        return exceptionRecord;
    }
}
