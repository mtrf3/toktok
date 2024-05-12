package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Zse, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91316Zse {
    public final Pattern LIZ;
    public final Pattern LIZIZ;
    public ArrayList<C91319Zsh> LIZJ;

    public C91316Zse() {
        this(0);
    }

    public C91316Zse(int i) {
        this.LIZ = PatternProtector.compile("\\[\\d{1,2}:\\d{1,2}([\\.:]\\d{1,3})?\\]");
        this.LIZIZ = PatternProtector.compile("\\<\\d*,\\d*,\\d*\\>");
        this.LIZJ = new ArrayList<>();
    }

    public final C91316Zse LIZ(String str) {
        if (str == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
        try {
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                Matcher matcher = PatternProtector.compile("\\[(offset):[^\\]]+\\]").matcher(readLine);
                while (matcher.find()) {
                    String matchStr = matcher.group();
                    o.LJIIIIZZ(matchStr, "matchStr");
                    String substring = matchStr.substring(1, 7);
                    o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    o.LJ(substring, "offset");
                }
                String charSequence = s.LJZI(LJI(readLine)).toString();
                if (charSequence.length() > 0) {
                    LIZIZ(charSequence);
                }
            }
            bufferedReader.close();
            return this;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        throw new java.lang.NumberFormatException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C91316Zse.LIZIZ(java.lang.String):void");
    }

    public final C91316Zse LIZJ(String str) {
        if (str == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
        try {
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                String charSequence = s.LJZI(readLine).toString();
                if (charSequence.length() > 0) {
                    LIZLLL(charSequence);
                }
            }
            bufferedReader.close();
            return this;
        } catch (IOException unused) {
            return null;
        }
    }

    public final void LIZLLL(String str) {
        long j;
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                Object obj = jSONArray.get(i);
                o.LJII(obj, "null cannot be cast to non-null type org.json.JSONObject");
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.has("text") && jSONObject.has("timeId")) {
                    ArrayList<C91319Zsh> arrayList = this.LIZJ;
                    String optString = jSONObject.optString("text");
                    o.LJIIIIZZ(optString, "json.optString(\"text\")");
                    C91319Zsh c91319Zsh = new C91319Zsh(optString);
                    String optString2 = jSONObject.optString("timeId");
                    o.LJIIIIZZ(optString2, "json.optString(\"timeId\")");
                    try {
                        j = CastFloatProtector.parseFloat(s.LJZI(optString2).toString()) * 1000;
                    } catch (Throwable unused) {
                        j = -1;
                    }
                    c91319Zsh.LIZIZ = j;
                    arrayList.add(c91319Zsh);
                }
            }
        } catch (JSONException unused2) {
        }
    }

    public final C91316Zse LJ(String str) {
        if (str == null) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
        try {
            for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                String charSequence = s.LJZI(readLine).toString();
                if (charSequence.length() > 0) {
                    LJFF(charSequence);
                }
            }
            bufferedReader.close();
            return this;
        } catch (IOException unused) {
            return null;
        }
    }

    public final void LJFF(String str) {
        long j = 0;
        if (s.LJJJLZIJ(str, "[", false) && s.LJJJLZIJ(str, "]", false)) {
            String str2 = (String) ListProtector.get(s.LJLJJL(str, new String[]{"]"}, 0, 6), 0);
            if (!TextUtils.isEmpty(str2) && s.LJJJLZIJ(str2, ",", false)) {
                String str3 = (String) ListProtector.get(s.LJLJJL(str2, new String[]{","}, 0, 6), 0);
                if (!TextUtils.isEmpty(str3) && str3.length() > 1) {
                    int length = str3.length();
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (str3.charAt(i) == '[') {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            i = -1;
                            break;
                        }
                    }
                    String substring = str3.substring(i + 1);
                    o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                    Long LJJIZ = C38350F3i.LJJIZ(substring);
                    if (LJJIZ != null) {
                        j = LJJIZ.longValue();
                    }
                }
            }
            str = str.substring(s.LJJLIIIJL(str, "]", 0, false, 6) + 1, str.length());
            o.LJIIIIZZ(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        while (true) {
            Matcher matcher = this.LIZIZ.matcher(str);
            o.LJIIIIZZ(matcher, "this");
            if (matcher.find()) {
                str = s.LJJZ(matcher.start(), matcher.end(), str).toString();
            } else {
                ArrayList<C91319Zsh> arrayList = this.LIZJ;
                C91319Zsh c91319Zsh = new C91319Zsh(str);
                c91319Zsh.LIZIZ = j;
                arrayList.add(c91319Zsh);
                return;
            }
        }
    }

    public final String LJI(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        List LJLJJL = s.LJLJJL(str, new String[]{"]"}, 0, 6);
        int size = LJLJJL.size();
        for (int i = 0; i < size; i++) {
            String str2 = (String) ListProtector.get(LJLJJL, i);
            if (i == LJLJJL.size() - 1) {
                if (ujb.o.LJJJJ(str2, "]", false)) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(str2);
                    LIZ.append(']');
                    str2 = X1D.LIZIZ(LIZ);
                }
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str2);
                LIZ2.append(']');
                str2 = X1D.LIZIZ(LIZ2);
            }
            if (ujb.o.LJJJLIIL(str2, "[", false) && ujb.o.LJJJJ(str2, "]", false)) {
                if (this.LIZ.matcher(str2).find()) {
                    stringBuffer.append(str2);
                } else {
                    return "";
                }
            } else {
                stringBuffer.append(str2);
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        o.LJIIIIZZ(stringBuffer2, "sb.toString()");
        return stringBuffer2;
    }
}
