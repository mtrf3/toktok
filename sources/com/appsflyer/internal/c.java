package com.appsflyer.internal;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PixelFormat;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.PhoneNumberUtils;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.URLUtil;
import android.widget.ExpandableListView;
import com.appsflyer.AFLogger;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public final class c {
    public static char[] AFInAppEventParameterName = {24, 28, 'M', 'a', 'J', '4', 'L', 'N', '7', '2', 'J', 'c', 'c', 'c', 'a', 'a', 'I', '1', '0', '1', 'L', 'K', '5', 'N', 'J', '2', 'L', 'L', 'L', 'L', 'M', 'M', '3', 'Z', 187, 189, 191, 196, 192, 186, 157, 162, 197, 164, 140, 165, 190, 200, 192, 191, 201, 183, 171, 187, 187, 184, 186, 191, '@', 133, 128, 'p', 'q', '~', 137, 140, 'p', 'M', 'f', 135, 'd', '_', '|', 130, 134, 129, 127, '}', 26, 'L', '9', 'm', 'f', 'j', 'n', 'p', 'Q', 'N', 'l', 'K', 'G', 'k', 'k', 'e', 206, 208, 137, 216, 221, 137, 205, 206, 213, 210, 202, 175, 137, 163, 215, 216, 210, 221, 217, 206, 204, 225, 206, 137, 209, 221, 210, 224, 137, 209, 221, 202, 217, 137, 206, 209, 204, 202, 204, 137, 221};
    public static long AFInAppEventType = 9088409587802389276L;
    public static int valueOf = 0;
    public static int values = 1;

    /* loaded from: classes.dex */
    public static class d extends HashMap<String, Object> {
        public static int AFVersionDeclaration = 1;
        public static int getLevel;
        public final Context AFKeystoreWrapper;
        public final Map<String, Object> values;
        public static char[] AFInAppEventType = {45871, 57605, 5963, 17853, 64403, 10690, 24101, 35846, 8786, 20666, 34529, 13521, 54318, 34306, 28773, 8869, 40070, 20160, 14624, 60191, 15890, 27697, 39493, 58167, 45333, 18297, 5541, 43921, 31228, 3646, 56351, 29271, 167, 55035, 25850, 14636, 53100, 40258, 38571, 50334, 13043, 24628, 56857, 5831, 17641, 45725, 57415, 24176, 35873, 64411, 10667, 34809, 62720, 8963, 37235, 52360, 14986, 26849, 50742, 13380, 25184, 'b', '&', 21086, '&', 21085};
        public static long valueOf = -6884389957348077011L;
        public static int[] AFInAppEventParameterName = {264022428, -820998946, -1835969172, 545826097, 1791829078, 35725697, -876159950, -884180872, 791409275, -2126541223, 1035454124, -679804399, -620917022, 1978309802, 824869615, -147598075, -461163612, -436180871};

        public static List com_appsflyer_internal_c$d_android_hardware_SensorManager_getSensorList(SensorManager sensorManager, int i) {
            C03880Dg c03880Dg = new C03880Dg(2);
            Object[] objArr = {Integer.valueOf(i)};
            C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Ljava/util/List;", "2309626391053107424");
            C39519Ff9 LIZJ = c03880Dg.LIZJ(100702, "android/hardware/SensorManager", "getSensorList", sensorManager, objArr, "java.util.List", c65300Pk0);
            if (LIZJ.LIZ) {
                c03880Dg.LIZIZ(100702, "android/hardware/SensorManager", "getSensorList", null, objArr, sensorManager, c65300Pk0, false);
                return (List) LIZJ.LIZIZ;
            }
            List<Sensor> sensorList = sensorManager.getSensorList(i);
            c03880Dg.LIZIZ(100702, "android/hardware/SensorManager", "getSensorList", sensorList, objArr, sensorManager, c65300Pk0, true);
            return sensorList;
        }

        private String AFInAppEventParameterName() {
            String sb;
            int i;
            boolean z;
            char c;
            try {
                String AFInAppEventParameterName2 = ah.AFInAppEventParameterName(this.values.get(AFInAppEventParameterName(TextUtils.getTrimmedLength(""), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 45903), 12 - ExpandableListView.getPackedPositionType(0L)).intern()).toString() + this.values.get(AFInAppEventParameterName(24 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (58193 - View.MeasureSpec.makeMeasureSpec(0, 0)), 15 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()).toString() + AFInAppEventParameterName(38 - View.MeasureSpec.getSize(0), (char) (38557 - ExpandableListView.getPackedPositionType(0L)), 5 - ((Process.getThreadPriority(0) + 20) >> 6)).intern().replaceAll(values(new int[]{554720026, 810846395, -1353340409, 1995249900}, TextUtils.indexOf((CharSequence) "", '0', 0) + 6).intern(), ""));
                StringBuilder sb2 = new StringBuilder("");
                sb2.append(AFInAppEventParameterName2.substring(0, 16));
                sb = sb2.toString();
            } catch (Exception e) {
                AFLogger.AFInAppEventParameterName(values(new int[]{640847658, -233831226, 620669702, -1347693514, 1083507952, -1102549683, -450369102, -1732957970, 393969182, 886873569, -1952655995, 1892296752, 1890815725, -1673734706, 1444084348, -987179240, 1094281385, 992383361, 17585538, 973864474, -432527319, -1739858274}, TextUtils.lastIndexOf("", '0') + 45).intern() + e);
                StringBuilder sb3 = new StringBuilder("");
                sb3.append(AFInAppEventParameterName(42 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (5797 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), AndroidCharacter.getMirror('0') + 65506).intern());
                sb = sb3.toString();
            }
            try {
                Intent LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(null, this.AFKeystoreWrapper, new IntentFilter(values(new int[]{-248593871, 418937694, 1034627370, 175927361, -56373222, 1046364932, 687343027, -368521510, 1427030466, 1568180991, -741401460, -1800867994, 1331349556, 1216887738, -1608381182, -1947019990, 948188064, 1315957742, -1365079188, 1790179928}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 37).intern()));
                int i2 = -2700;
                if (LJJLIIIJILLIZJL != null) {
                    i2 = LJJLIIIJILLIZJL.getIntExtra(values(new int[]{998518318, -1660110958, -513052711, 611993354, 508697840, 1938850892}, PhoneNumberUtils.toaFromString("") - 118).intern(), -2700);
                } else {
                    AFVersionDeclaration = (getLevel + 121) % 128;
                }
                String str = this.AFKeystoreWrapper.getApplicationInfo().nativeLibraryDir;
                if (str != null) {
                    if (str.contains(values(new int[]{-1675036583, 1271474483}, 2 - ImageFormat.getBitsPerPixel(0)).intern())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int i3 = getLevel + 61;
                        AFVersionDeclaration = i3 % 128;
                        if (i3 % 2 == 0) {
                            c = 'L';
                        } else {
                            c = 16;
                        }
                        if (c == 16) {
                            i = 1;
                            String str2 = AFInAppEventParameterName(TextUtils.getCapsMode("", 0, 0) + 61, (char) (ViewConfiguration.getTapTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern() + i2 + values(new int[]{1802121942, -851730084}, KeyEvent.getDeadChar(0, 0) + 2).intern() + i + AFInAppEventParameterName((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 61, (char) TextUtils.getCapsMode("", 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1).intern() + com_appsflyer_internal_c$d_android_hardware_SensorManager_getSensorList((SensorManager) C16880lQ.LLILL(this.AFKeystoreWrapper, values(new int[]{-2108098182, 924452591, -880754948, 1430040891}, 6 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()), -1).size() + AFInAppEventParameterName(Color.blue(0) + 64, (char) TextUtils.getCapsMode("", 0, 0), 6 - AndroidCharacter.getEastAsianWidth('0')).intern() + this.values.size();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(sb);
                            byte[] AFInAppEventType2 = b.AFInAppEventType(str2);
                            b.AFInAppEventParameterName(AFInAppEventType2);
                            sb4.append(b.AFInAppEventType(AFInAppEventType2));
                            return sb4.toString();
                        }
                    }
                }
                i = 0;
                String str22 = AFInAppEventParameterName(TextUtils.getCapsMode("", 0, 0) + 61, (char) (ViewConfiguration.getTapTimeout() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1).intern() + i2 + values(new int[]{1802121942, -851730084}, KeyEvent.getDeadChar(0, 0) + 2).intern() + i + AFInAppEventParameterName((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 61, (char) TextUtils.getCapsMode("", 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1).intern() + com_appsflyer_internal_c$d_android_hardware_SensorManager_getSensorList((SensorManager) C16880lQ.LLILL(this.AFKeystoreWrapper, values(new int[]{-2108098182, 924452591, -880754948, 1430040891}, 6 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern()), -1).size() + AFInAppEventParameterName(Color.blue(0) + 64, (char) TextUtils.getCapsMode("", 0, 0), 6 - AndroidCharacter.getEastAsianWidth('0')).intern() + this.values.size();
                StringBuilder sb42 = new StringBuilder();
                sb42.append(sb);
                byte[] AFInAppEventType22 = b.AFInAppEventType(str22);
                b.AFInAppEventParameterName(AFInAppEventType22);
                sb42.append(b.AFInAppEventType(AFInAppEventType22));
                return sb42.toString();
            } catch (Exception e2) {
                AFLogger.AFInAppEventParameterName(values(new int[]{640847658, -233831226, 620669702, -1347693514, 1083507952, -1102549683, -450369102, -1732957970, 393969182, 886873569, -1952655995, 1892296752, 1890815725, -1673734706, 1444084348, -987179240, 1094281385, 992383361, 17585538, 973864474, -432527319, -1739858274}, 44 - (ViewConfiguration.getTapTimeout() >> 16)).intern() + e2);
                return sb + values(new int[]{-828854563, 475996213, 640677171, -1604617094, -1550728992, -1021112346, 2006942107, 297401137}, TextUtils.getCapsMode("", 0, 0) + 16).intern();
            }
        }

        private String AFKeystoreWrapper() {
            char c;
            char c2;
            try {
                String num = Integer.toString(Build.VERSION.SDK_INT);
                String obj = this.values.get(AFInAppEventParameterName((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0) + 45903), 11 - ExpandableListView.getPackedPositionChild(0L)).intern()).toString();
                String obj2 = this.values.get(values(new int[]{-1400612638, 722893263, 1201510708, 1839577259}, Color.red(0) + 5).intern()).toString();
                if (obj2 == null) {
                    AFVersionDeclaration = (getLevel + 111) % 128;
                    obj2 = AFInAppEventParameterName(12 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (54368 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 8 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern();
                }
                StringBuilder sb = new StringBuilder(obj);
                sb.reverse();
                StringBuilder AFInAppEventType2 = AFInAppEventType(num, obj2, sb.toString());
                int length = AFInAppEventType2.length();
                if (length > 4) {
                    c = 31;
                } else {
                    c = 'S';
                }
                if (c != 31) {
                    while (true) {
                        if (length < 4) {
                            c2 = 14;
                        } else {
                            c2 = 25;
                        }
                        if (c2 != 14) {
                            break;
                        }
                        length++;
                        AFInAppEventType2.append('1');
                    }
                } else {
                    int i = getLevel + 63;
                    AFVersionDeclaration = i % 128;
                    if (i % 2 == 0) {
                        AFInAppEventType2.delete(5, length);
                    } else {
                        AFInAppEventType2.delete(4, length);
                    }
                }
                AFInAppEventType2.insert(0, AFInAppEventParameterName((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 19, (char) (TextUtils.indexOf("", "", 0) + 15993), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2).intern());
                return AFInAppEventType2.toString();
            } catch (Exception e) {
                AFLogger.AFInAppEventParameterName(values(new int[]{640847658, -233831226, 620669702, -1347693514, 1083507952, -1102549683, -450369102, -1732957970, 393969182, 886873569, -1907198063, -659358675, -1220524838, -426323891, 726030888, -1625741836, 826016106, -853521743, -1716907684, 603768842, 752977807, -1933892853}, View.getDefaultSize(0, 0) + 42).intern() + e);
                return values(new int[]{180447687, -652056002, 277827748, -169691734}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 7).intern();
            }
        }

        /* loaded from: classes.dex */
        public static class b {
            public final Boolean AFKeystoreWrapper;
            public Boolean valueOf;
            public final String values;

            public b() {
            }

            public static byte[] AFInAppEventParameterName(byte[] bArr) {
                for (int i = 0; i < bArr.length; i++) {
                    bArr[i] = (byte) (bArr[i] ^ ((i % 2) + 42));
                }
                return bArr;
            }

            public static String AFInAppEventType(byte[] bArr) {
                StringBuilder sb = new StringBuilder();
                for (byte b : bArr) {
                    String hexString = Integer.toHexString(b);
                    if (hexString.length() == 1) {
                        hexString = CardStruct.IStatusCode.DEFAULT.concat(hexString);
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            }

            public static byte[] AFInAppEventType(String str) {
                return str.getBytes();
            }

            public b(String str, Boolean bool) {
                this.values = str;
                this.AFKeystoreWrapper = bool;
            }
        }

        public static StringBuilder AFInAppEventType(String... strArr) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            do {
                arrayList.add(Integer.valueOf(strArr[i].length()));
                i++;
            } while (i < 3);
            Collections.sort(arrayList);
            int intValue = ((Integer) ListProtector.get(arrayList, 0)).intValue();
            StringBuilder sb = new StringBuilder();
            AFVersionDeclaration = (getLevel + 9) % 128;
            for (int i2 = 0; i2 < intValue; i2++) {
                getLevel = (AFVersionDeclaration + 75) % 128;
                Integer num = null;
                int i3 = 0;
                do {
                    int charAt = strArr[i3].charAt(i2);
                    if (num == null) {
                        getLevel = (AFVersionDeclaration + 25) % 128;
                    } else {
                        charAt ^= num.intValue();
                    }
                    num = Integer.valueOf(charAt);
                    i3++;
                } while (i3 < 3);
                sb.append(Integer.toHexString(num.intValue()));
            }
            return sb;
        }

        public d(Map<String, Object> map, Context context) {
            this.values = map;
            this.AFKeystoreWrapper = context;
            put(AFKeystoreWrapper(), AFInAppEventParameterName());
        }

        public static String values(int[] iArr, int i) {
            AFVersionDeclaration = (getLevel + 29) % 128;
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) AFInAppEventParameterName.clone();
            getLevel = (AFVersionDeclaration + 1) % 128;
            for (int i2 = 0; i2 < iArr.length; i2 += 2) {
                AFVersionDeclaration = (getLevel + 5) % 128;
                int i3 = iArr[i2];
                cArr[0] = (char) (i3 >> 16);
                cArr[1] = (char) i3;
                int i4 = iArr[i2 + 1];
                cArr[2] = (char) (i4 >> 16);
                cArr[3] = (char) i4;
                cu.values(cArr, iArr2, false);
                int i5 = i2 << 1;
                cArr2[i5] = cArr[0];
                cArr2[i5 + 1] = cArr[1];
                cArr2[i5 + 2] = cArr[2];
                cArr2[i5 + 3] = cArr[3];
            }
            return new String(cArr2, 0, i);
        }

        public static String AFInAppEventParameterName(int i, char c, int i2) {
            int i3 = AFVersionDeclaration + 27;
            getLevel = i3 % 128;
            int i4 = i3 % 2;
            char[] cArr = new char[i2];
            int i5 = 0;
            while (i5 < i2) {
                int i6 = AFVersionDeclaration + 63;
                getLevel = i6 % 128;
                if (i6 % 2 != 0) {
                    cArr[i5] = (char) ((AFInAppEventType[i << i5] ^ (i5 | valueOf)) * c);
                    i5 += 126;
                } else {
                    cArr[i5] = (char) ((AFInAppEventType[i + i5] ^ (i5 * valueOf)) ^ c);
                    i5++;
                }
            }
            return new String(cArr);
        }
    }

    public static String AFInAppEventParameterName(Context context) {
        boolean z;
        PackageInfo LLLLLLZ;
        int i = values + 33;
        valueOf = i % 128;
        if (i % 2 != 0) {
            z = true;
        } else {
            z = false;
        }
        try {
            if (z) {
                LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 1);
            } else {
                LLLLLLZ = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0);
            }
            String str = LLLLLLZ.packageName;
            valueOf = (values + 55) % 128;
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static String AFInAppEventType(Context context) {
        boolean z;
        char c;
        if (System.getProperties().containsKey(valueOf("\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{80, 14, 0, 0}, URLUtil.isJavaScriptUrl("javascript:")).intern())) {
            z = true;
        } else {
            z = false;
        }
        String str = null;
        if (z) {
            try {
                Matcher matcher = PatternProtector.compile(values("獬穏獂䅹镹\ue36e\uef30齁常曟\uf7f9쏒ꮈ劬").intern()).matcher(C16880lQ.LLIIIL(context).getPath().replace(values("潨씤潇﹛煋ܒ헨荟擟\ud9b2").intern(), ""));
                if (!matcher.find()) {
                    c = '9';
                } else {
                    c = 'I';
                }
                if (c != '9') {
                    int i = valueOf + 95;
                    values = i % 128;
                    if (i % 2 == 0) {
                        str = matcher.group(0);
                    } else {
                        str = matcher.group(1);
                    }
                    valueOf = (values + 93) % 128;
                }
            } catch (Exception e) {
                aj.AFInAppEventParameterName().AFInAppEventType(null, values("쭱」쬲\u0b79胩\uf6b4蜒✩㘥Ⲇ\ue234ꮌ᎗\u18fd쾒뱴ฒୡ묈䃮窜").intern(), valueOf(null, new int[]{94, 41, 105, 12}, TextUtils.regionMatches("", 0, "", 0, 0)).intern() + e);
                return null;
            }
        }
        valueOf = (values + 121) % 128;
        return str;
    }

    public static String valueOf(String str) {
        boolean z;
        char c;
        values = (valueOf + 63) % 128;
        if (!str.contains(values("ỢỌ剙뭌\ud949").intern())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            String[] split = str.split(valueOf("\u0001\u0000", new int[]{78, 2, 7, 1}, !URLUtil.isAboutUrl("about:")).intern());
            int length = split.length;
            StringBuilder sb = new StringBuilder();
            int i = length - 1;
            sb.append(split[i]);
            sb.append(values("ỢỌ剙뭌\ud949").intern());
            for (int i2 = 1; i2 < i; i2++) {
                valueOf = (values + 45) % 128;
                sb.append(split[i2]);
                sb.append(values("ỢỌ剙뭌\ud949").intern());
            }
            sb.append(split[0]);
            return sb.toString();
        }
        int i3 = values + 57;
        valueOf = i3 % 128;
        if (i3 % 2 != 0) {
            c = '!';
        } else {
            c = 'D';
        }
        if (c != '!') {
            return str;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3, types: [char[]] */
    public static String values(String str) {
        boolean z;
        char c;
        int i = values + 89;
        valueOf = i % 128;
        if (i % 2 == 0) {
            if (str != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                str = str.toCharArray();
                values = (valueOf + 85) % 128;
            }
            char[] AFKeystoreWrapper = cr.AFKeystoreWrapper(AFInAppEventType, (char[]) str);
            for (int i2 = 4; i2 < AFKeystoreWrapper.length; i2++) {
                AFKeystoreWrapper[i2] = (char) ((AFKeystoreWrapper[i2] ^ AFKeystoreWrapper[i2 % 4]) ^ ((i2 - 4) * AFInAppEventType));
            }
            String str2 = new String(AFKeystoreWrapper, 4, AFKeystoreWrapper.length - 4);
            int i3 = values + 7;
            valueOf = i3 % 128;
            if (i3 % 2 != 0) {
                c = 'M';
            } else {
                c = 5;
            }
            if (c != 'M') {
                return str2;
            }
            throw null;
        }
        throw null;
    }

    public static boolean AFInAppEventParameterName(String str) {
        values = (valueOf + 17) % 128;
        try {
            Class.forName(str);
            int i = valueOf + 53;
            values = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static String AFKeystoreWrapper(Context context, long j) {
        boolean z;
        String values2;
        boolean z2;
        String intern;
        char c;
        String valueOf2;
        String values3;
        String values4;
        String str;
        char c2;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        if (AFInAppEventParameterName(values("㎆䌿㏧硍ᄅ杙ﮄ\udff8䪢徨珉흈\ueb73比幱샳\uf6c7硉⫢㱨艞钿㚩⧓궻ꅤԝՎ뤨붟ᆤ焛䒖쨏ﰬ抡倂\ue6a3").intern())) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            valueOf = (values + 91) % 128;
            values2 = valueOf("\u0001", new int[]{0, 1, 0, 0}, !PhoneNumberUtils.isNonSeparator('0'));
        } else {
            values2 = values("迻迋䟅િꌖ");
        }
        sb2.append(values2.intern());
        StringBuilder sb4 = new StringBuilder();
        String packageName = context.getPackageName();
        String valueOf3 = valueOf(packageName);
        sb2.append(valueOf("\u0001", new int[]{0, 1, 0, 0}, PhoneNumberUtils.isGlobalPhoneNumber("")).intern());
        sb4.append(valueOf3);
        if (AFInAppEventType(context) == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            sb2.append(values("迻迋䟅િꌖ").intern());
            sb4.append(packageName);
        } else {
            sb2.append(valueOf("\u0001", new int[]{0, 1, 0, 0}, !TextUtils.isEmpty("")).intern());
            sb4.append(packageName);
        }
        String AFInAppEventParameterName2 = AFInAppEventParameterName(context);
        if (AFInAppEventParameterName2 == null) {
            int i = values + 31;
            valueOf = i % 128;
            if (i % 2 != 0) {
                sb2.append(values("迻迋䟅િꌖ").intern());
                sb4.append(packageName);
            } else {
                sb2.append(values("迻迋䟅િꌖ").intern());
                sb4.append(packageName);
            }
        } else {
            sb2.append(valueOf("\u0001", new int[]{0, 1, 0, 0}, !URLUtil.isHttpsUrl("https://")).intern());
            sb4.append(AFInAppEventParameterName2);
        }
        sb4.append(Boolean.TRUE.toString());
        sb.append(sb4.toString());
        try {
            sb.append(new SimpleDateFormat(values("ꏄﻂꎽ얧䋱㒰响俠\ue5e0\ue266—砉笹혿බ澜暥얦礔錷ሎ⤡").intern(), Locale.US).format(new Date(C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).firstInstallTime)));
            values = (valueOf + 57) % 128;
            sb.append(j);
            if (AFInAppEventParameterName(valueOf("\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001", new int[]{33, 25, 84, 0}, !TextUtils.isDigitsOnly("")).intern())) {
                valueOf = (values + 5) % 128;
                intern = valueOf("\u0001", new int[]{0, 1, 0, 0}, !PhoneNumberUtils.isDialable('0')).intern();
                valueOf = (values + 1) % 128;
            } else {
                intern = values("迻迋䟅િꌖ").intern();
            }
            sb3.append(intern);
            if (AFInAppEventParameterName(values("ꓽ묋꒜聹욭냱舺䢃㌜Ꞝꑡ껶簔鏤觇륌憻聴ﵗ䗝ᕲ泶\ue130偦㫟奚튷").intern())) {
                c = '0';
            } else {
                c = '/';
            }
            if (c != '0') {
                valueOf2 = values("迻迋䟅િꌖ");
            } else {
                valueOf2 = valueOf("\u0001", new int[]{0, 1, 0, 0}, !PhoneNumberUtils.isDialable('0'));
            }
            sb3.append(valueOf2.intern());
            if (AFInAppEventParameterName(valueOf("\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001", new int[]{58, 20, 22, 0}, URLUtil.isNetworkUrl("http://")).intern())) {
                values3 = valueOf("\u0001", new int[]{0, 1, 0, 0}, PixelFormat.formatHasAlpha(0));
            } else {
                values3 = values("迻迋䟅િꌖ");
            }
            sb3.append(values3.intern());
            if (AFInAppEventParameterName(values("\uf6ee輠\uf68f둒ᨼ池ꘀ᪐ᜦ鎷磰諌⸁\ua7cb啐鴼㎊둌⇝").intern())) {
                int i2 = valueOf + 45;
                values = i2 % 128;
                if (i2 % 2 == 0) {
                    c2 = '=';
                } else {
                    c2 = '2';
                }
                if (c2 != '=') {
                    values4 = valueOf("\u0001", new int[]{0, 1, 0, 0}, true ^ URLUtil.isContentUrl("content:"));
                } else {
                    str = valueOf("\u0001", new int[]{0, 1, 0, 0}, URLUtil.isContentUrl("content:")).intern();
                    sb3.append(str);
                    String AFInAppEventType2 = ah.AFInAppEventType(ah.AFInAppEventParameterName(sb.toString()));
                    String sb5 = sb2.toString();
                    StringBuilder sb6 = new StringBuilder(AFInAppEventType2);
                    sb6.setCharAt(17, Integer.toString(CastIntegerProtector.parseInt(sb5, 2), 16).charAt(0));
                    String sb7 = sb6.toString();
                    String sb8 = sb3.toString();
                    StringBuilder sb9 = new StringBuilder(sb7);
                    sb9.setCharAt(27, Integer.toString(CastIntegerProtector.parseInt(sb8, 2), 16).charAt(0));
                    return valueOf(sb9.toString(), Long.valueOf(j));
                }
            } else {
                values4 = values("迻迋䟅િꌖ");
            }
            str = values4.intern();
            sb3.append(str);
            String AFInAppEventType22 = ah.AFInAppEventType(ah.AFInAppEventParameterName(sb.toString()));
            String sb52 = sb2.toString();
            StringBuilder sb62 = new StringBuilder(AFInAppEventType22);
            sb62.setCharAt(17, Integer.toString(CastIntegerProtector.parseInt(sb52, 2), 16).charAt(0));
            String sb72 = sb62.toString();
            String sb82 = sb3.toString();
            StringBuilder sb92 = new StringBuilder(sb72);
            sb92.setCharAt(27, Integer.toString(CastIntegerProtector.parseInt(sb82, 2), 16).charAt(0));
            return valueOf(sb92.toString(), Long.valueOf(j));
        } catch (PackageManager.NameNotFoundException unused) {
            return valueOf("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{1, 32, 0, 15}, TextUtils.isDigitsOnly("")).intern();
        }
    }

    public static String valueOf(String str, Long l) {
        char c;
        boolean z;
        if (str != null && l != null && str.length() == 32) {
            StringBuilder sb = new StringBuilder(str);
            String l2 = l.toString();
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i < l2.length()) {
                    c = '_';
                } else {
                    c = 'c';
                }
                if (c != '_') {
                    break;
                }
                i2 += Character.getNumericValue(l2.charAt(i));
                i++;
                values = (valueOf + 5) % 128;
            }
            String hexString = Integer.toHexString(i2);
            sb.replace(7, hexString.length() + 7, hexString);
            long j = 0;
            for (int i3 = 0; i3 < sb.length(); i3++) {
                j += Character.getNumericValue(sb.charAt(i3));
            }
            while (true) {
                if (j > 100) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    break;
                }
                int i4 = valueOf + 21;
                values = i4 % 128;
                if (i4 % 2 == 0) {
                    j -= 100;
                } else {
                    j %= 100;
                }
            }
            sb.insert(23, (int) j);
            if (j < 10) {
                sb.insert(23, values("迻迋䟅િꌖ").intern());
            }
            String sb2 = sb.toString();
            int i5 = valueOf + 121;
            values = i5 % 128;
            if (i5 % 2 != 0) {
                return sb2;
            }
            throw null;
        }
        return valueOf("\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{1, 32, 0, 15}, !Gravity.isVertical(0)).intern();
    }

    public static String valueOf(String str, int[] iArr, boolean z) {
        byte[] bArr = str;
        if (str != null) {
            bArr = str.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = new char[i2];
        System.arraycopy(AFInAppEventParameterName, i, cArr, 0, i2);
        if (bArr2 != null) {
            values = (valueOf + 37) % 128;
            char[] cArr2 = new char[i2];
            char c = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                if (bArr2[i5] == 1) {
                    cArr2[i5] = (char) (((cArr[i5] << 1) + 1) - c);
                } else {
                    cArr2[i5] = (char) ((cArr[i5] << 1) - c);
                }
                c = cArr2[i5];
            }
            cArr = cArr2;
        }
        if (i4 > 0) {
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr, 0, cArr3, 0, i2);
            int i6 = i2 - i4;
            System.arraycopy(cArr3, 0, cArr, i6, i4);
            System.arraycopy(cArr3, i4, cArr, 0, i6);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            int i7 = 0;
            while (i7 < i2) {
                int i8 = values + 79;
                valueOf = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr4[i7] = cArr[(i2 % i7) >>> 1];
                    i7 += 5;
                } else {
                    cArr4[i7] = cArr[(i2 - i7) - 1];
                    i7++;
                }
            }
            cArr = cArr4;
        }
        if (i3 > 0) {
            for (int i9 = 0; i9 < i2; i9++) {
                cArr[i9] = (char) (cArr[i9] - iArr[2]);
            }
        }
        return new String(cArr);
    }
}
