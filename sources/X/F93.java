package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public final class F93 {
    public static final Pattern LJ = PatternProtector.compile("[\\w!#$&.+\\-\\^_]+|[*]");
    public static final Pattern LJFF = PatternProtector.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
    public static final Pattern LJI;
    public static final Pattern LJII;
    public String LIZ;
    public String LIZIZ;
    public final SortedMap<String, String> LIZJ = new TreeMap();
    public String LIZLLL;

    static {
        StringBuilder sb = new StringBuilder(";.*".length() + "[^\\s/=;\"]+".length() + "[^\\s/=;\"]+".length() + 14);
        sb.append("\\s*([^\\s/=;\"]+)/([^\\s/=;\"]+)\\s*(;.*)?");
        LJI = PatternProtector.compile(sb.toString(), 32);
        StringBuilder sb2 = new StringBuilder("[^\\s;\"]*".length() + "\"([^\"]*)\"".length() + 1);
        sb2.append("\"([^\"]*)\"|[^\\s;\"]*");
        String valueOf = String.valueOf(sb2.toString());
        StringBuilder sb3 = new StringBuilder(valueOf.length() + "[^\\s/=;\"]+".length() + 12);
        sb3.append("\\s*;\\s*([^\\s/=;\"]+)=(");
        sb3.append(valueOf);
        sb3.append(")");
        LJII = PatternProtector.compile(sb3.toString());
    }

    public final String LIZ() {
        String str = this.LIZLLL;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZ);
        sb.append('/');
        sb.append(this.LIZIZ);
        SortedMap<String, String> sortedMap = this.LIZJ;
        if (sortedMap != null) {
            for (Map.Entry entry : ((TreeMap) sortedMap).entrySet()) {
                String str2 = (String) entry.getValue();
                sb.append("; ");
                sb.append((String) entry.getKey());
                sb.append("=");
                if (!LJFF.matcher(str2).matches()) {
                    String valueOf = String.valueOf(str2.replace("\\", "\\\\").replace("\"", "\\\""));
                    str2 = FP1.LIZLLL(new StringBuilder(valueOf.length() + 2), "\"", valueOf, "\"");
                }
                sb.append(str2);
            }
        }
        String sb2 = sb.toString();
        this.LIZLLL = sb2;
        return sb2;
    }

    public final int hashCode() {
        return LIZ().hashCode();
    }

    public final String toString() {
        return LIZ();
    }

    public F93(String str) {
        this.LIZ = "application";
        this.LIZIZ = "octet-stream";
        Matcher matcher = LJI.matcher(str);
        C77357UXp.LIZLLL("Type must be in the 'maintype/subtype; parameter=value' format", matcher.matches());
        String group = matcher.group(1);
        Pattern pattern = LJ;
        C77357UXp.LIZLLL("Type contains reserved characters", pattern.matcher(group).matches());
        this.LIZ = group;
        this.LIZLLL = null;
        String group2 = matcher.group(2);
        C77357UXp.LIZLLL("Subtype contains reserved characters", pattern.matcher(group2).matches());
        this.LIZIZ = group2;
        this.LIZLLL = null;
        String group3 = matcher.group(3);
        if (group3 != null) {
            Matcher matcher2 = LJII.matcher(group3);
            while (matcher2.find()) {
                String group4 = matcher2.group(1);
                String group5 = matcher2.group(3);
                if (group5 == null) {
                    group5 = matcher2.group(2);
                }
                LIZIZ(group4, group5);
            }
        }
    }

    public final boolean equals(Object obj) {
        F93 f93;
        if (!(obj instanceof F93) || (f93 = (F93) obj) == null || !this.LIZ.equalsIgnoreCase(f93.LIZ) || !this.LIZIZ.equalsIgnoreCase(f93.LIZIZ) || !this.LIZJ.equals(f93.LIZJ)) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(String str, String str2) {
        if (str2 == null) {
            this.LIZLLL = null;
            ((TreeMap) this.LIZJ).remove(str.toLowerCase());
            return;
        }
        C77357UXp.LIZLLL("Name contains reserved characters", LJFF.matcher(str).matches());
        this.LIZLLL = null;
        ((TreeMap) this.LIZJ).put(str.toLowerCase(), str2);
    }
}
