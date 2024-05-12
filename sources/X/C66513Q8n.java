package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.Q8n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66513Q8n {
    public static final Logger LJII = Logger.getLogger(C66513Q8n.class.getName());
    public static final java.util.Map<Integer, String> LJIIIIZZ;
    public static final java.util.Set<Integer> LJIIIZ;
    public static final java.util.Set<Integer> LJIIJ;
    public static final java.util.Map<Character, Character> LJIIJJI;
    public static final java.util.Map<Character, Character> LJIIL;
    public static final java.util.Map<Character, Character> LJIILIIL;
    public static final java.util.Map<Character, Character> LJIILJJIL;
    public static final Pattern LJIILL;
    public static final Pattern LJIILLIIL;
    public static final Pattern LJIIZILJ;
    public static final Pattern LJIJ;
    public static final Pattern LJIJI;
    public static final Pattern LJIJJ;
    public static final Pattern LJIJJLI;
    public static final Pattern LJIL;
    public static final Pattern LJJ;
    public static final Pattern LJJI;
    public static C66513Q8n LJJIFFI;
    public final C42082GfO LIZ;
    public final java.util.Map<Integer, List<String>> LIZIZ;
    public final C0T2 LIZJ = new C0T2(1);
    public final java.util.Set<String> LIZLLL = new HashSet(35);
    public final E10 LJ = new E10();
    public final java.util.Set<String> LJFF = new HashSet(320);
    public final java.util.Set<Integer> LJI = new HashSet();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(52, "1");
        hashMap.put(54, "9");
        LJIIIIZZ = Collections.unmodifiableMap(hashMap);
        HashSet hashSet = new HashSet();
        hashSet.add(86);
        LJIIIZ = Collections.unmodifiableSet(hashSet);
        HashSet hashSet2 = new HashSet();
        hashSet2.add(52);
        hashSet2.add(54);
        hashSet2.add(55);
        hashSet2.add(62);
        hashSet2.addAll(hashSet);
        LJIIJ = Collections.unmodifiableSet(hashSet2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put('0', '0');
        hashMap2.put('1', '1');
        hashMap2.put('2', '2');
        hashMap2.put('3', '3');
        hashMap2.put('4', '4');
        hashMap2.put('5', '5');
        hashMap2.put('6', '6');
        hashMap2.put('7', '7');
        hashMap2.put('8', '8');
        hashMap2.put('9', '9');
        HashMap hashMap3 = new HashMap(40);
        hashMap3.put('A', '2');
        hashMap3.put('B', '2');
        hashMap3.put('C', '2');
        hashMap3.put('D', '3');
        hashMap3.put('E', '3');
        hashMap3.put('F', '3');
        hashMap3.put('G', '4');
        hashMap3.put('H', '4');
        hashMap3.put('I', '4');
        hashMap3.put('J', '5');
        hashMap3.put('K', '5');
        hashMap3.put('L', '5');
        hashMap3.put('M', '6');
        hashMap3.put('N', '6');
        hashMap3.put('O', '6');
        hashMap3.put('P', '7');
        hashMap3.put('Q', '7');
        hashMap3.put('R', '7');
        hashMap3.put('S', '7');
        hashMap3.put('T', '8');
        hashMap3.put('U', '8');
        hashMap3.put('V', '8');
        hashMap3.put('W', '9');
        hashMap3.put('X', '9');
        hashMap3.put('Y', '9');
        hashMap3.put('Z', '9');
        java.util.Map<Character, Character> unmodifiableMap = Collections.unmodifiableMap(hashMap3);
        LJIIL = unmodifiableMap;
        HashMap hashMap4 = new HashMap(100);
        hashMap4.putAll(unmodifiableMap);
        hashMap4.putAll(hashMap2);
        LJIILIIL = Collections.unmodifiableMap(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.putAll(hashMap2);
        hashMap5.put('+', '+');
        hashMap5.put('*', '*');
        hashMap5.put('#', '#');
        LJIIJJI = Collections.unmodifiableMap(hashMap5);
        HashMap hashMap6 = new HashMap();
        Iterator<Character> it = unmodifiableMap.keySet().iterator();
        while (it.hasNext()) {
            char charValue = it.next().charValue();
            hashMap6.put(Character.valueOf(Character.toLowerCase(charValue)), Character.valueOf(charValue));
            hashMap6.put(Character.valueOf(charValue), Character.valueOf(charValue));
        }
        hashMap6.putAll(hashMap2);
        hashMap6.put('-', '-');
        hashMap6.put((char) 65293, '-');
        hashMap6.put((char) 8208, '-');
        hashMap6.put((char) 8209, '-');
        hashMap6.put((char) 8210, '-');
        hashMap6.put((char) 8211, '-');
        hashMap6.put((char) 8212, '-');
        hashMap6.put((char) 8213, '-');
        hashMap6.put((char) 8722, '-');
        hashMap6.put('/', '/');
        hashMap6.put((char) 65295, '/');
        hashMap6.put(' ', ' ');
        hashMap6.put((char) 12288, ' ');
        hashMap6.put((char) 8288, ' ');
        hashMap6.put('.', '.');
        hashMap6.put((char) 65294, '.');
        LJIILJJIL = Collections.unmodifiableMap(hashMap6);
        PatternProtector.compile("[\\d]+(?:[~⁓∼～][\\d]+)?");
        StringBuilder LIZ = X1D.LIZ();
        java.util.Map<Character, Character> map = LJIIL;
        LIZ.append(Arrays.toString(map.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        LIZ.append(Arrays.toString(map.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String LIZIZ = X1D.LIZIZ(LIZ);
        LJIILL = PatternProtector.compile("[+＋]+");
        LJIILLIIL = PatternProtector.compile("[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～]+");
        LJIIZILJ = PatternProtector.compile("(\\p{Nd})");
        LJIJ = PatternProtector.compile("[+＋\\p{Nd}]");
        LJIJI = PatternProtector.compile("[\\\\/] *x");
        LJIJJ = PatternProtector.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
        LJIJJLI = PatternProtector.compile("(?:.*?[A-Za-z]){3}.*");
        String LIZJ = C0ON.LIZJ("\\p{Nd}{2}|[+＋]*+(?:[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*]*\\p{Nd}){3,}[-x‐-―−ー－-／  \u00ad\u200b\u2060\u3000()（）［］.\\[\\]/~⁓∼～*", LIZIZ, "\\p{Nd}", "]*");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(",;");
        LIZ2.append("xｘ#＃~～");
        String LIZ3 = LIZ(X1D.LIZIZ(LIZ2));
        LIZ("xｘ#＃~～");
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("(?:");
        LIZ4.append(LIZ3);
        LIZ4.append(")$");
        LJIL = PatternProtector.compile(X1D.LIZIZ(LIZ4), 66);
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append(LIZJ);
        LIZ5.append("(?:");
        LIZ5.append(LIZ3);
        LIZ5.append(")?");
        LJJ = PatternProtector.compile(X1D.LIZIZ(LIZ5), 66);
        PatternProtector.compile("(\\D+)");
        LJJI = PatternProtector.compile("(\\$\\d)");
        PatternProtector.compile("\\(?\\$1\\)?");
        LJJIFFI = null;
    }

    public static synchronized C66513Q8n LIZJ() {
        C66513Q8n c66513Q8n;
        synchronized (C66513Q8n.class) {
            if (LJJIFFI == null) {
                LJIILJJIL(new C66513Q8n(new C42082GfO(), C86793Y4n.LJIJI()));
            }
            c66513Q8n = LJJIFFI;
        }
        return c66513Q8n;
    }

    public static String LIZ(String str) {
        StringBuilder LIZLLL = C06540Nm.LIZLLL(";ext=(\\p{Nd}{1,7})|[  \\t,]*(?:e?xt(?:ensi(?:ó?|ó))?n?|ｅ?ｘｔｎ?|доб|[", str, "]|int|anexo|ｉｎｔ)[:\\.．]?[  \\t,-]*", "(\\p{Nd}{1,7})", "#?|[- ]+(");
        return JBR.LJFF(LIZLLL, "\\p{Nd}", "{1,5})#", LIZLLL);
    }

    public static String LJ(C66516Q8q c66516Q8q) {
        StringBuilder sb = new StringBuilder();
        if (c66516Q8q.isItalianLeadingZero() && c66516Q8q.getNumberOfLeadingZeros() > 0) {
            char[] cArr = new char[c66516Q8q.getNumberOfLeadingZeros()];
            Arrays.fill(cArr, '0');
            sb.append(new String(cArr));
        }
        sb.append(c66516Q8q.getNationalNumber());
        return sb.toString();
    }

    public static void LJIIJ(StringBuilder sb) {
        if (LJIJJLI.matcher(sb).matches()) {
            int length = sb.length();
            java.util.Map<Character, Character> map = LJIILIIL;
            StringBuilder sb2 = new StringBuilder(sb.length());
            for (int i = 0; i < sb.length(); i++) {
                Character ch = map.get(Character.valueOf(Character.toUpperCase(sb.charAt(i))));
                if (ch != null) {
                    sb2.append(ch);
                }
            }
            sb.replace(0, length, sb2.toString());
            return;
        }
        sb.replace(0, sb.length(), LJIIJJI(sb));
    }

    public static String LJIIJJI(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            int digit = Character.digit(charSequence.charAt(i), 10);
            if (digit != -1) {
                sb.append(digit);
            }
        }
        return sb.toString();
    }

    public static synchronized void LJIILJJIL(C66513Q8n c66513Q8n) {
        synchronized (C66513Q8n.class) {
            LJJIFFI = c66513Q8n;
        }
    }

    public final String LJI(int i) {
        List<String> list = this.LIZIZ.get(Integer.valueOf(i));
        if (list == null) {
            return "ZZ";
        }
        return (String) ListProtector.get(list, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r1 == X.P5S.IS_POSSIBLE_LOCAL_ONLY) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJII(java.lang.CharSequence r6) {
        /*
            r5 = this;
            r0 = 0
            X.Q8q r0 = r5.LJIIL(r6, r0)     // Catch: X.C63860P4m -> L35
            X.Q8x r4 = X.EnumC66523Q8x.UNKNOWN     // Catch: X.C63860P4m -> L35
            java.lang.String r3 = LJ(r0)     // Catch: X.C63860P4m -> L35
            int r2 = r0.getCountryCode()     // Catch: X.C63860P4m -> L35
            java.util.Map<java.lang.Integer, java.util.List<java.lang.String>> r1 = r5.LIZIZ     // Catch: X.C63860P4m -> L35
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: X.C63860P4m -> L35
            boolean r0 = r1.containsKey(r0)     // Catch: X.C63860P4m -> L35
            if (r0 != 0) goto L24
            X.P5S r1 = X.P5S.INVALID_COUNTRY_CODE     // Catch: X.C63860P4m -> L35
        L1d:
            X.P5S r0 = X.P5S.IS_POSSIBLE     // Catch: X.C63860P4m -> L35
            if (r1 == r0) goto L33
            X.P5S r0 = X.P5S.IS_POSSIBLE_LOCAL_ONLY     // Catch: X.C63860P4m -> L35
            goto L31
        L24:
            java.lang.String r0 = r5.LJI(r2)     // Catch: X.C63860P4m -> L35
            X.Q8o r0 = r5.LIZLLL(r2, r0)     // Catch: X.C63860P4m -> L35
            X.P5S r1 = LJIILL(r3, r0, r4)     // Catch: X.C63860P4m -> L35
            goto L1d
        L31:
            if (r1 != r0) goto L35
        L33:
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66513Q8n.LJII(java.lang.CharSequence):boolean");
    }

    public C66513Q8n(C42082GfO c42082GfO, java.util.Map<Integer, List<String>> map) {
        this.LIZ = c42082GfO;
        this.LIZIZ = map;
        HashMap hashMap = (HashMap) map;
        for (Map.Entry entry : hashMap.entrySet()) {
            List list = (List) entry.getValue();
            if (list.size() == 1 && "001".equals(ListProtector.get(list, 0))) {
                ((HashSet) this.LJI).add(entry.getKey());
            } else {
                this.LJFF.addAll(list);
            }
        }
        if (((HashSet) this.LJFF).remove("001")) {
            LJII.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        this.LIZLLL.addAll((Collection) hashMap.get(1));
    }

    public static C66515Q8p LJFF(C66514Q8o c66514Q8o, EnumC66523Q8x enumC66523Q8x) {
        switch (C66522Q8w.LIZJ[enumC66523Q8x.ordinal()]) {
            case 1:
                return c66514Q8o.getPremiumRate();
            case 2:
                return c66514Q8o.getTollFree();
            case 3:
                return c66514Q8o.getMobile();
            case 4:
            case 5:
                return c66514Q8o.getFixedLine();
            case 6:
                return c66514Q8o.getSharedCost();
            case 7:
                return c66514Q8o.getVoip();
            case 8:
                return c66514Q8o.getPersonalNumber();
            case 9:
                return c66514Q8o.getPager();
            case 10:
                return c66514Q8o.getUan();
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return c66514Q8o.getVoicemail();
            default:
                return c66514Q8o.getGeneralDesc();
        }
    }

    public final String LIZIZ(C66516Q8q c66516Q8q, EnumC66524Q8y enumC66524Q8y) {
        List<C66517Q8r> numberFormats;
        if (c66516Q8q.getNationalNumber() == 0 && c66516Q8q.hasRawInput()) {
            String rawInput = c66516Q8q.getRawInput();
            if (rawInput.length() > 0) {
                return rawInput;
            }
        }
        StringBuilder sb = new StringBuilder(20);
        sb.setLength(0);
        int countryCode = c66516Q8q.getCountryCode();
        String LJ = LJ(c66516Q8q);
        EnumC66524Q8y enumC66524Q8y2 = EnumC66524Q8y.E164;
        if (enumC66524Q8y == enumC66524Q8y2) {
            sb.append(LJ);
            LJIILIIL(countryCode, enumC66524Q8y2, sb);
        } else if (!this.LIZIZ.containsKey(Integer.valueOf(countryCode))) {
            sb.append(LJ);
        } else {
            C66514Q8o LIZLLL = LIZLLL(countryCode, LJI(countryCode));
            if (LIZLLL.intlNumberFormats().size() == 0 || enumC66524Q8y == EnumC66524Q8y.NATIONAL) {
                numberFormats = LIZLLL.numberFormats();
            } else {
                numberFormats = LIZLLL.intlNumberFormats();
            }
            Iterator<C66517Q8r> it = numberFormats.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C66517Q8r next = it.next();
                int leadingDigitsPatternSize = next.leadingDigitsPatternSize();
                if (leadingDigitsPatternSize == 0 || this.LJ.LIZ(next.getLeadingDigitsPattern(leadingDigitsPatternSize - 1)).matcher(LJ).lookingAt()) {
                    if (this.LJ.LIZ(next.getPattern()).matcher(LJ).matches()) {
                        String format = next.getFormat();
                        Matcher matcher = this.LJ.LIZ(next.getPattern()).matcher(LJ);
                        EnumC66524Q8y enumC66524Q8y3 = EnumC66524Q8y.NATIONAL;
                        String nationalPrefixFormattingRule = next.getNationalPrefixFormattingRule();
                        if (enumC66524Q8y == enumC66524Q8y3 && nationalPrefixFormattingRule != null && nationalPrefixFormattingRule.length() > 0) {
                            LJ = matcher.replaceAll(LJJI.matcher(format).replaceFirst(nationalPrefixFormattingRule));
                        } else {
                            LJ = matcher.replaceAll(format);
                        }
                        if (enumC66524Q8y == EnumC66524Q8y.RFC3966) {
                            Matcher matcher2 = LJIILLIIL.matcher(LJ);
                            if (matcher2.lookingAt()) {
                                LJ = matcher2.replaceFirst("");
                            }
                            LJ = matcher2.reset(LJ).replaceAll("-");
                        }
                    }
                }
            }
            sb.append(LJ);
            if (c66516Q8q.hasExtension() && c66516Q8q.getExtension().length() > 0) {
                if (enumC66524Q8y == EnumC66524Q8y.RFC3966) {
                    sb.append(";ext=");
                    sb.append(c66516Q8q.getExtension());
                } else if (LIZLLL.hasPreferredExtnPrefix()) {
                    sb.append(LIZLLL.getPreferredExtnPrefix());
                    sb.append(c66516Q8q.getExtension());
                } else {
                    sb.append(" ext. ");
                    sb.append(c66516Q8q.getExtension());
                }
            }
            LJIILIIL(countryCode, enumC66524Q8y, sb);
        }
        return sb.toString();
    }

    public final C66514Q8o LIZLLL(int i, String str) {
        if ("001".equals(str)) {
            if (!this.LIZIZ.containsKey(Integer.valueOf(i))) {
                return null;
            }
            C42082GfO c42082GfO = this.LIZ;
            c42082GfO.getClass();
            List list = (List) ((HashMap) C86793Y4n.LJIJI()).get(Integer.valueOf(i));
            if (list.size() != 1 || !"001".equals(ListProtector.get(list, 0))) {
                return null;
            }
            return C86794Y4o.LIZ(Integer.valueOf(i), (ConcurrentHashMap) c42082GfO.LIZLLL, (String) c42082GfO.LIZ, (Q92) c42082GfO.LIZIZ);
        }
        if (str == null || !((HashSet) this.LJFF).contains(str)) {
            return null;
        }
        C42082GfO c42082GfO2 = this.LIZ;
        return C86794Y4o.LIZ(str, (ConcurrentHashMap) c42082GfO2.LIZJ, (String) c42082GfO2.LIZ, (Q92) c42082GfO2.LIZIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0234  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C66516Q8q LJIIL(java.lang.CharSequence r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66513Q8n.LJIIL(java.lang.CharSequence, java.lang.String):X.Q8q");
    }

    public static void LJIILIIL(int i, EnumC66524Q8y enumC66524Q8y, StringBuilder sb) {
        int i2 = C66522Q8w.LIZIZ[enumC66524Q8y.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    return;
                }
                sb.insert(0, "-");
                sb.insert(0, i);
                sb.insert(0, '+');
                sb.insert(0, "tel:");
                return;
            }
            sb.insert(0, " ");
            sb.insert(0, i);
            sb.insert(0, '+');
            return;
        }
        sb.insert(0, i);
        sb.insert(0, '+');
    }

    public static P5S LJIILL(CharSequence charSequence, C66514Q8o c66514Q8o, EnumC66523Q8x enumC66523Q8x) {
        List<Integer> possibleLengthList;
        List<Integer> possibleLengthList2;
        List<Integer> list;
        C66515Q8p LJFF = LJFF(c66514Q8o, enumC66523Q8x);
        if (LJFF.getPossibleLengthList().isEmpty()) {
            possibleLengthList = c66514Q8o.getGeneralDesc().getPossibleLengthList();
        } else {
            possibleLengthList = LJFF.getPossibleLengthList();
        }
        List<Integer> possibleLengthLocalOnlyList = LJFF.getPossibleLengthLocalOnlyList();
        if (enumC66523Q8x == EnumC66523Q8x.FIXED_LINE_OR_MOBILE) {
            C66515Q8p LJFF2 = LJFF(c66514Q8o, EnumC66523Q8x.FIXED_LINE);
            if (LJFF2.getPossibleLengthCount() != 1 || LJFF2.getPossibleLength(0) != -1) {
                C66515Q8p LJFF3 = LJFF(c66514Q8o, EnumC66523Q8x.MOBILE);
                if (LJFF3.getPossibleLengthCount() != 1 || LJFF3.getPossibleLength(0) != -1) {
                    ArrayList arrayList = new ArrayList(possibleLengthList);
                    if (LJFF3.getPossibleLengthList().size() == 0) {
                        possibleLengthList2 = c66514Q8o.getGeneralDesc().getPossibleLengthList();
                    } else {
                        possibleLengthList2 = LJFF3.getPossibleLengthList();
                    }
                    arrayList.addAll(possibleLengthList2);
                    Collections.sort(arrayList);
                    if (possibleLengthLocalOnlyList.isEmpty()) {
                        list = LJFF3.getPossibleLengthLocalOnlyList();
                    } else {
                        ArrayList arrayList2 = new ArrayList(possibleLengthLocalOnlyList);
                        arrayList2.addAll(LJFF3.getPossibleLengthLocalOnlyList());
                        Collections.sort(arrayList2);
                        list = arrayList2;
                    }
                    possibleLengthLocalOnlyList = list;
                    possibleLengthList = arrayList;
                }
            } else {
                return LJIILL(charSequence, c66514Q8o, EnumC66523Q8x.MOBILE);
            }
        }
        if (((Integer) ListProtector.get(possibleLengthList, 0)).intValue() == -1) {
            return P5S.INVALID_LENGTH;
        }
        int length = charSequence.length();
        if (possibleLengthLocalOnlyList.contains(Integer.valueOf(length))) {
            return P5S.IS_POSSIBLE_LOCAL_ONLY;
        }
        int intValue = ((Integer) ListProtector.get(possibleLengthList, 0)).intValue();
        if (intValue == length) {
            return P5S.IS_POSSIBLE;
        }
        if (intValue > length) {
            return P5S.TOO_SHORT;
        }
        if (((Integer) DIX.LIZJ(possibleLengthList, 1, possibleLengthList)).intValue() < length) {
            return P5S.TOO_LONG;
        }
        if (possibleLengthList.subList(1, possibleLengthList.size()).contains(Integer.valueOf(length))) {
            return P5S.IS_POSSIBLE;
        }
        return P5S.INVALID_LENGTH;
    }

    public final void LJIIIZ(StringBuilder sb, C66514Q8o c66514Q8o, StringBuilder sb2) {
        int length = sb.length();
        String nationalPrefixForParsing = c66514Q8o.getNationalPrefixForParsing();
        if (length == 0 || nationalPrefixForParsing.length() == 0) {
            return;
        }
        Matcher matcher = this.LJ.LIZ(nationalPrefixForParsing).matcher(sb);
        if (!matcher.lookingAt()) {
            return;
        }
        C66515Q8p generalDesc = c66514Q8o.getGeneralDesc();
        boolean LIZIZ = this.LIZJ.LIZIZ(sb, generalDesc);
        int groupCount = matcher.groupCount();
        String nationalPrefixTransformRule = c66514Q8o.getNationalPrefixTransformRule();
        if (nationalPrefixTransformRule == null || nationalPrefixTransformRule.length() == 0 || matcher.group(groupCount) == null) {
            if (LIZIZ && !this.LIZJ.LIZIZ(sb.substring(matcher.end()), generalDesc)) {
                return;
            }
            if (sb2 != null && groupCount > 0 && matcher.group(groupCount) != null) {
                sb2.append(matcher.group(1));
            }
            sb.delete(0, matcher.end());
            return;
        }
        StringBuilder sb3 = new StringBuilder(sb);
        sb3.replace(0, length, matcher.replaceFirst(nationalPrefixTransformRule));
        if (LIZIZ && !this.LIZJ.LIZIZ(sb3.toString(), generalDesc)) {
            return;
        }
        if (sb2 != null && groupCount > 1) {
            sb2.append(matcher.group(1));
        }
        sb.replace(0, sb.length(), sb3.toString());
    }

    public final int LJIIIIZZ(CharSequence charSequence, C66514Q8o c66514Q8o, StringBuilder sb, C66516Q8q c66516Q8q) {
        String str;
        EnumC66521Q8v enumC66521Q8v;
        if (charSequence.length() == 0) {
            return 0;
        }
        StringBuilder sb2 = new StringBuilder(charSequence);
        if (c66514Q8o != null) {
            str = c66514Q8o.getInternationalPrefix();
        } else {
            str = "NonMatch";
        }
        int i = 1;
        if (sb2.length() == 0) {
            enumC66521Q8v = EnumC66521Q8v.FROM_DEFAULT_COUNTRY;
        } else {
            Matcher matcher = LJIILL.matcher(sb2);
            if (matcher.lookingAt()) {
                sb2.delete(0, matcher.end());
                LJIIJ(sb2);
                enumC66521Q8v = EnumC66521Q8v.FROM_NUMBER_WITH_PLUS_SIGN;
            } else {
                Pattern LIZ = this.LJ.LIZ(str);
                LJIIJ(sb2);
                Matcher matcher2 = LIZ.matcher(sb2);
                if (matcher2.lookingAt()) {
                    int end = matcher2.end();
                    Matcher matcher3 = LJIIZILJ.matcher(sb2.substring(end));
                    if (!matcher3.find() || !LJIIJJI(matcher3.group(1)).equals(CardStruct.IStatusCode.DEFAULT)) {
                        sb2.delete(0, end);
                        enumC66521Q8v = EnumC66521Q8v.FROM_NUMBER_WITH_IDD;
                    }
                }
                enumC66521Q8v = EnumC66521Q8v.FROM_DEFAULT_COUNTRY;
            }
        }
        if (enumC66521Q8v != EnumC66521Q8v.FROM_DEFAULT_COUNTRY) {
            if (sb2.length() > 2) {
                if (sb2.length() != 0 && sb2.charAt(0) != '0') {
                    int length = sb2.length();
                    while (true) {
                        if (i > length) {
                            break;
                        }
                        int parseInt = CastIntegerProtector.parseInt(sb2.substring(0, i));
                        if (this.LIZIZ.containsKey(Integer.valueOf(parseInt))) {
                            sb.append(sb2.substring(i));
                            if (parseInt != 0) {
                                c66516Q8q.setCountryCode(parseInt);
                                return parseInt;
                            }
                        } else {
                            i++;
                            if (i > 3) {
                                break;
                            }
                        }
                    }
                }
                throw new C63860P4m(EnumC63871P4x.INVALID_COUNTRY_CODE, "Country calling code supplied was not recognised.");
            }
            throw new C63860P4m(EnumC63871P4x.TOO_SHORT_AFTER_IDD, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
        }
        if (c66514Q8o != null) {
            int countryCode = c66514Q8o.getCountryCode();
            String valueOf = String.valueOf(countryCode);
            String sb3 = sb2.toString();
            if (sb3.startsWith(valueOf)) {
                StringBuilder sb4 = new StringBuilder(sb3.substring(valueOf.length()));
                C66515Q8p generalDesc = c66514Q8o.getGeneralDesc();
                LJIIIZ(sb4, c66514Q8o, null);
                if ((!this.LIZJ.LIZIZ(sb2, generalDesc) && this.LIZJ.LIZIZ(sb4, generalDesc)) || LJIILL(sb2, c66514Q8o, EnumC66523Q8x.UNKNOWN) == P5S.TOO_LONG) {
                    sb.append((CharSequence) sb4);
                    c66516Q8q.setCountryCode(countryCode);
                    return countryCode;
                }
            }
        }
        c66516Q8q.setCountryCode(0);
        return 0;
    }
}
