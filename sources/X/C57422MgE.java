package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.bullet.BulletContainerActivity;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.MgE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57422MgE {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r0 != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
    
        if (r0 == false) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ca A[Catch: Exception -> 0x02e9, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01db A[Catch: Exception -> 0x02e9, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x022b A[Catch: Exception -> 0x02e9, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0233 A[Catch: Exception -> 0x02e9, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023a A[Catch: Exception -> 0x02e9, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0241 A[Catch: Exception -> 0x02e9, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0250 A[Catch: Exception -> 0x02e9, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x026d A[Catch: Exception -> 0x02e9, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x028d A[Catch: Exception -> 0x02e9, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029e A[Catch: Exception -> 0x02e9, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02af A[Catch: Exception -> 0x02e9, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c0 A[Catch: Exception -> 0x02e9, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0274 A[Catch: Exception -> 0x02e9, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0210 A[Catch: Exception -> 0x02e9, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[Catch: Exception -> 0x02e9, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095 A[Catch: Exception -> 0x02e9, TRY_ENTER, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011c A[Catch: Exception -> 0x02e9, TryCatch #0 {Exception -> 0x02e9, blocks: (B:6:0x001b, B:10:0x0033, B:15:0x0040, B:20:0x004b, B:22:0x0051, B:27:0x005d, B:29:0x0067, B:31:0x0071, B:37:0x0081, B:40:0x0095, B:42:0x00a1, B:43:0x00b7, B:45:0x00bd, B:48:0x00c9, B:51:0x00cf, B:54:0x00d5, B:55:0x00dd, B:57:0x00e3, B:64:0x00ed, B:67:0x0104, B:69:0x0100, B:70:0x0109, B:73:0x011c, B:97:0x01a3, B:99:0x01a9, B:100:0x01ac, B:108:0x01c4, B:110:0x01ca, B:115:0x01db, B:116:0x01de, B:119:0x01e6, B:121:0x01f8, B:124:0x0216, B:126:0x022b, B:128:0x0233, B:130:0x023a, B:132:0x0241, B:133:0x0244, B:135:0x0250, B:136:0x025a, B:139:0x0267, B:141:0x026d, B:142:0x0281, B:144:0x028d, B:145:0x0292, B:147:0x029e, B:148:0x02a3, B:150:0x02af, B:151:0x02b4, B:153:0x02c0, B:154:0x02c5, B:156:0x02e2, B:159:0x0274, B:160:0x01ff, B:162:0x0210, B:168:0x01f5, B:169:0x01d3, B:173:0x019f, B:174:0x0190, B:175:0x0156, B:176:0x015f, B:177:0x0168, B:178:0x0171, B:179:0x017c, B:180:0x0185, B:181:0x0129, B:165:0x01ec), top: B:5:0x001b, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent LIZ(android.content.Context r29, android.net.Uri r30, boolean r31, boolean r32) {
        /*
            Method dump skipped, instructions count: 747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57422MgE.LIZ(android.content.Context, android.net.Uri, boolean, boolean):android.content.Intent");
    }

    public static boolean LIZIZ(Context context, String str, String str2, boolean z) {
        String str3;
        try {
            new JSONObject().put("url", str);
        } catch (Throwable unused) {
        }
        boolean z2 = false;
        if (context == null) {
            return false;
        }
        try {
        } catch (Exception e) {
            e = e;
        }
        try {
            if (!C38354F3m.LJ(str)) {
                if (context instanceof BulletContainerActivity) {
                    if (C40680Fxs.LIZIZ(str)) {
                        str = C38956FQq.LIZ(str);
                    } else {
                        android.net.Uri parse = UriProtector.parse(str);
                        String queryParameter = UriProtector.getQueryParameter(parse, "url");
                        if (queryParameter != null) {
                            str3 = C38956FQq.LIZ(queryParameter);
                        } else {
                            str3 = null;
                        }
                        str = String.valueOf(C38956FQq.LJFF(parse, str3));
                    }
                }
                android.net.Uri parse2 = UriProtector.parse(str);
                if (C40680Fxs.LIZIZ(str)) {
                    Intent intent = new Intent(context, (Class<?>) CrossPlatformActivity.class);
                    intent.setData(parse2);
                    intent.putExtra("swipe_mode", 2);
                    C16880lQ.LIZJ(context, intent);
                    return true;
                }
                String scheme = parse2.getScheme();
                if (scheme == null) {
                    scheme = "";
                }
                M66 m66 = M66.LIZIZ;
                boolean LIZJ = m66.LIZJ(scheme) | o.LJ(scheme, "aweme");
                String host = parse2.getHost();
                if (LIZJ) {
                    if (o.LJ("webview", host)) {
                        Intent LIZ = C57423MgF.LIZ(context, parse2);
                        if (LIZ != null) {
                            LIZ.putExtra("swipe_mode", 2);
                            if (!(context instanceof Activity)) {
                                LIZ.addFlags(268435456);
                            }
                            C16880lQ.LIZJ(context, LIZ);
                        }
                        return true;
                    }
                    C44106HSs.LIZ(parse2);
                    o.LJII(FJU.LIZIZ(), "null cannot be cast to non-null type com.ss.android.ugc.aweme.app.AwemeAppData");
                    Class<? extends Activity> LJIIZILJ = DeepLinkServiceImpl.LIZ().LJIIZILJ();
                    if (LJIIZILJ != null) {
                        Intent intent2 = new Intent(context, LJIIZILJ);
                        intent2.setData(parse2);
                        intent2.putExtra("is_from_self", true);
                        C16880lQ.LIZJ(context, intent2);
                    }
                    return true;
                }
                Intent intent3 = new Intent("android.intent.action.VIEW");
                intent3.setData(parse2);
                if (FCD.LJ(context, intent3)) {
                    intent3.putExtra("open_url", str);
                    if (z) {
                        intent3.addFlags(268435456);
                    }
                    C16880lQ.LIZJ(context, intent3);
                    return true;
                }
                if (ujb.o.LJJJLIIL(scheme, m66.LJIILLIIL(), false)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("com.ss.android.sdk.");
                    LIZ2.append(scheme);
                    Intent intent4 = new Intent(X1D.LIZIZ(LIZ2));
                    if (FCD.LJ(context, intent4)) {
                        intent4.putExtra("open_url", str);
                        C16880lQ.LIZJ(context, intent4);
                        return true;
                    }
                }
            }
            if (!C38354F3m.LJ(str2) && FCD.LJFF(context, str2)) {
                C16880lQ.LIZJ(context, FCD.LIZIZ(context, str2));
                return true;
            }
        } catch (Exception e2) {
            e = e2;
            z2 = true;
            C16880lQ.LLLLIIL(e);
            return z2;
        }
        return z2;
    }
}
