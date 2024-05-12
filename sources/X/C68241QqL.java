package X;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzq;
import com.google.android.play.core.appupdate.u;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.QqL, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68241QqL implements InterfaceC68124QoS {
    public static volatile C68241QqL LJJIIZI;
    public final C68244QqO LIZ;
    public final C68186QpS LIZIZ;
    public C68242QqM LIZJ;
    public C68240QqK LIZLLL;
    public C68151Qot LJ;
    public C68279Qqx LJFF;
    public final C68243QqN LJI;
    public C68317QrZ LJII;
    public C67275Qal LJIIIIZZ;
    public C67604Qg4 LJIIJ;
    public final C68033Qmz LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public long LJIILJJIL;
    public List LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public FileLock LJIJJLI;
    public FileChannel LJIL;
    public List LJJ;
    public List LJJI;
    public final java.util.Map LJJII;
    public final java.util.Map LJJIII;
    public C68132Qoa LJJIIJ;
    public String LJJIIJZLJL;
    public final C68148Qoq LJJIIZ = new C68148Qoq(this);
    public long LJJIFFI = -1;
    public final C68188QpU LJIIIZ = new C68188QpU(this);

    @Override // X.InterfaceC68124QoS
    public final C17J LJ() {
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:1115:0x1074, code lost:
    
        if (r6 == null) goto L627;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1237:0x0799, code lost:
    
        if (r0.LJLJI == false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1238:0x079b, code lost:
    
        r0.LJIIJ();
        r0.LJLJI = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1239:0x07a3, code lost:
    
        r6 = (X.C68246QqQ) r0.LJLILLLLZI;
        r5 = r6.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1240:0x07af, code lost:
    
        if (r5.LIZIZ() != false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1241:0x07b1, code lost:
    
        r6.zzj = X.YIN.LJIILJJIL(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1242:0x07b7, code lost:
    
        r6.zzj.set(r3, r2);
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1244:0x07bd, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1249:0x07c7, code lost:
    
        if (r0.LJLJI == false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1250:0x07c9, code lost:
    
        r0.LJIIJ();
        r0.LJLJI = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1251:0x07d1, code lost:
    
        r5 = (X.C68246QqQ) r0.LJLILLLLZI;
        r3 = r5.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1252:0x07dd, code lost:
    
        if (r3.LIZIZ() != false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1253:0x07df, code lost:
    
        r5.zzj = X.YIN.LJIILJJIL(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:1254:0x07e5, code lost:
    
        r5.zzj.add(r2);
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:1269:0x073a, code lost:
    
        if (r0.booleanValue() != false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x1a18, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x0c87, code lost:
    
        if (r13 == null) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x0f30, code lost:
    
        if (r13 == null) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:973:0x128a, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:974:0x128b, code lost:
    
        r3 = r11.zze;
     */
    /* JADX WARN: Code restructure failed: missing block: B:975:0x1294, code lost:
    
        if (r14 >= (((X.C84686XLm) r3).LJLJI * 64)) goto L1341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:977:0x129a, code lost:
    
        if (X.C68243QqN.LJJIIZI(r14, r3) == false) goto L719;
     */
    /* JADX WARN: Code restructure failed: missing block: B:978:0x129c, code lost:
    
        r0.LIZ.LIZJ().LJIILIIL.LIZJ(java.lang.Integer.valueOf(r28), java.lang.Integer.valueOf(r14), "Filter already evaluated. audience ID, filter ID");
        r9.set(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:979:0x12ba, code lost:
    
        if (X.C68243QqN.LJJIIZI(r14, r11.zzf) == false) goto L719;
     */
    /* JADX WARN: Code restructure failed: missing block: B:980:0x12bc, code lost:
    
        r10.set(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:982:0x12c7, code lost:
    
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:983:0x12c0, code lost:
    
        r8.remove(java.lang.Integer.valueOf(r14));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04b0 A[Catch: all -> 0x08a2, TryCatch #55 {all -> 0x08a2, blocks: (B:16:0x0079, B:19:0x00a2, B:23:0x00d6, B:36:0x00ed, B:38:0x00f7, B:46:0x0117, B:49:0x0123, B:51:0x0129, B:57:0x0157, B:59:0x0167, B:61:0x0175, B:63:0x0185, B:65:0x0190, B:72:0x0193, B:75:0x01a8, B:82:0x0416, B:84:0x0420, B:88:0x047b, B:90:0x048c, B:92:0x049a, B:95:0x0505, B:102:0x04b0, B:104:0x04bc, B:107:0x04d1, B:109:0x04e2, B:111:0x04f0, B:125:0x01f7, B:127:0x0205, B:129:0x024f, B:130:0x0224, B:132:0x0232, B:138:0x0256, B:140:0x0280, B:141:0x02a8, B:143:0x02d6, B:144:0x02db, B:148:0x02eb, B:150:0x0319, B:154:0x033e, B:156:0x034c, B:158:0x035d, B:159:0x0354, B:168:0x0398, B:169:0x0381, B:171:0x0367, B:174:0x039d, B:177:0x03ab, B:178:0x03b1, B:181:0x03bc, B:185:0x03db, B:186:0x03cc, B:195:0x03e2, B:197:0x03ee, B:199:0x03fa, B:203:0x045c, B:204:0x0436, B:207:0x0446, B:209:0x044c, B:211:0x0456, B:229:0x0562, B:231:0x056a, B:233:0x0575, B:234:0x05a6, B:236:0x05aa, B:237:0x057b, B:239:0x0588, B:241:0x058e, B:243:0x0596, B:245:0x05a0, B:262:0x05d0, B:265:0x05de, B:269:0x05f5, B:284:0x0849, B:288:0x086e, B:1199:0x0670, B:1204:0x068e, B:1224:0x073c, B:1230:0x0787, B:1232:0x0792, B:1285:0x062a), top: B:15:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:1036:0x1087  */
    /* JADX WARN: Removed duplicated region for block: B:1037:0x1089 A[Catch: all -> 0x1a18, TryCatch #103 {all -> 0x1a18, blocks: (B:369:0x0a22, B:419:0x0b36, B:421:0x0b84, B:424:0x0b8c, B:429:0x0b94, B:434:0x0ba9, B:738:0x0bcb, B:740:0x0bdb, B:757:0x0c8d, B:758:0x0c90, B:764:0x0c89, B:775:0x1a02, B:776:0x1a05, B:783:0x0c93, B:784:0x0c9b, B:786:0x0ca1, B:823:0x0cb9, B:788:0x0cc8, B:789:0x0cd2, B:791:0x0cd8, B:793:0x0cef, B:795:0x0d01, B:796:0x0d07, B:798:0x0d2d, B:800:0x0d33, B:802:0x0d6b, B:805:0x0d8d, B:807:0x0d93, B:809:0x0da0, B:810:0x0d5c, B:813:0x0d87, B:815:0x0d39, B:817:0x0d4d, B:818:0x0d53, B:837:0x0e2a, B:838:0x0e64, B:840:0x0e7b, B:859:0x0f36, B:860:0x0f39, B:866:0x0f32, B:888:0x1a0b, B:889:0x1a0e, B:896:0x0f3c, B:897:0x0f44, B:899:0x0f4a, B:920:0x0f62, B:902:0x0f70, B:903:0x0f7a, B:905:0x0f80, B:908:0x0fab, B:910:0x0fc1, B:912:0x0fcf, B:916:0x0fa5, B:924:0x0de4, B:1033:0x1076, B:1034:0x1079, B:937:0x1213, B:938:0x1219, B:940:0x121f, B:943:0x122b, B:945:0x1237, B:946:0x123d, B:954:0x1245, B:957:0x124e, B:958:0x1254, B:960:0x125a, B:963:0x1266, B:966:0x126e, B:974:0x128b, B:976:0x1296, B:978:0x129c, B:980:0x12bc, B:982:0x12c7, B:983:0x12c0, B:986:0x12ca, B:989:0x12d8, B:991:0x12e0, B:993:0x12e4, B:995:0x130a, B:996:0x130e, B:998:0x1314, B:1000:0x1328, B:1001:0x1330, B:1003:0x133a, B:1004:0x1341, B:1007:0x1347, B:1012:0x12e8, B:1037:0x1089, B:1038:0x1091, B:1040:0x1097, B:1042:0x10b3, B:1049:0x10bd, B:1052:0x10cf, B:1054:0x10fd, B:1055:0x1108, B:1057:0x110e, B:1060:0x1120, B:1065:0x1124, B:1067:0x112b, B:1068:0x1131, B:1069:0x1148, B:1071:0x114e, B:1074:0x1160, B:1079:0x11a2, B:1081:0x11a9, B:1082:0x11af, B:1084:0x11bb, B:1085:0x11c1, B:1086:0x11c6, B:1089:0x1165, B:1091:0x116d, B:1093:0x117d, B:1095:0x1180, B:1099:0x1184, B:1101:0x118c, B:1103:0x119c, B:1105:0x119f, B:1045:0x10b9, B:1123:0x1a14, B:1124:0x1a17, B:1137:0x0ad2, B:744:0x0c19, B:746:0x0c1f, B:748:0x0c24, B:749:0x0c32, B:751:0x0c42, B:752:0x0c4a, B:753:0x0c60, B:767:0x0c4f, B:769:0x0c59, B:762:0x0c72, B:770:0x0c67, B:844:0x0eb9, B:849:0x0ec6, B:851:0x0eca, B:852:0x0ed8, B:870:0x0ee8, B:854:0x0ef0, B:855:0x0f06, B:864:0x0f1b, B:875:0x0ef5, B:877:0x0f01, B:883:0x0ec0, B:1024:0x1024, B:1026:0x102a, B:1028:0x103b, B:1029:0x1043, B:1112:0x1056, B:1114:0x105f), top: B:368:0x0a22, inners: #96, #99, #102 }] */
    /* JADX WARN: Removed duplicated region for block: B:1127:0x0a92 A[Catch: SQLiteException -> 0x0ada, all -> 0x1a1a, TryCatch #104 {all -> 0x1a1a, blocks: (B:404:0x0a87, B:406:0x0a8d, B:1127:0x0a92, B:1128:0x0a97, B:1130:0x0a9d, B:1132:0x0aa1, B:1133:0x0aae, B:1134:0x0acc, B:1147:0x0ab7, B:1149:0x0ac1, B:1141:0x0ae1), top: B:403:0x0a87, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03bc A[Catch: all -> 0x08a2, TRY_ENTER, TryCatch #55 {all -> 0x08a2, blocks: (B:16:0x0079, B:19:0x00a2, B:23:0x00d6, B:36:0x00ed, B:38:0x00f7, B:46:0x0117, B:49:0x0123, B:51:0x0129, B:57:0x0157, B:59:0x0167, B:61:0x0175, B:63:0x0185, B:65:0x0190, B:72:0x0193, B:75:0x01a8, B:82:0x0416, B:84:0x0420, B:88:0x047b, B:90:0x048c, B:92:0x049a, B:95:0x0505, B:102:0x04b0, B:104:0x04bc, B:107:0x04d1, B:109:0x04e2, B:111:0x04f0, B:125:0x01f7, B:127:0x0205, B:129:0x024f, B:130:0x0224, B:132:0x0232, B:138:0x0256, B:140:0x0280, B:141:0x02a8, B:143:0x02d6, B:144:0x02db, B:148:0x02eb, B:150:0x0319, B:154:0x033e, B:156:0x034c, B:158:0x035d, B:159:0x0354, B:168:0x0398, B:169:0x0381, B:171:0x0367, B:174:0x039d, B:177:0x03ab, B:178:0x03b1, B:181:0x03bc, B:185:0x03db, B:186:0x03cc, B:195:0x03e2, B:197:0x03ee, B:199:0x03fa, B:203:0x045c, B:204:0x0436, B:207:0x0446, B:209:0x044c, B:211:0x0456, B:229:0x0562, B:231:0x056a, B:233:0x0575, B:234:0x05a6, B:236:0x05aa, B:237:0x057b, B:239:0x0588, B:241:0x058e, B:243:0x0596, B:245:0x05a0, B:262:0x05d0, B:265:0x05de, B:269:0x05f5, B:284:0x0849, B:288:0x086e, B:1199:0x0670, B:1204:0x068e, B:1224:0x073c, B:1230:0x0787, B:1232:0x0792, B:1285:0x062a), top: B:15:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03de A[EDGE_INSN: B:191:0x03de->B:192:0x03de BREAK  A[LOOP:4: B:178:0x03b1->B:185:0x03db], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03e2 A[Catch: all -> 0x08a2, TryCatch #55 {all -> 0x08a2, blocks: (B:16:0x0079, B:19:0x00a2, B:23:0x00d6, B:36:0x00ed, B:38:0x00f7, B:46:0x0117, B:49:0x0123, B:51:0x0129, B:57:0x0157, B:59:0x0167, B:61:0x0175, B:63:0x0185, B:65:0x0190, B:72:0x0193, B:75:0x01a8, B:82:0x0416, B:84:0x0420, B:88:0x047b, B:90:0x048c, B:92:0x049a, B:95:0x0505, B:102:0x04b0, B:104:0x04bc, B:107:0x04d1, B:109:0x04e2, B:111:0x04f0, B:125:0x01f7, B:127:0x0205, B:129:0x024f, B:130:0x0224, B:132:0x0232, B:138:0x0256, B:140:0x0280, B:141:0x02a8, B:143:0x02d6, B:144:0x02db, B:148:0x02eb, B:150:0x0319, B:154:0x033e, B:156:0x034c, B:158:0x035d, B:159:0x0354, B:168:0x0398, B:169:0x0381, B:171:0x0367, B:174:0x039d, B:177:0x03ab, B:178:0x03b1, B:181:0x03bc, B:185:0x03db, B:186:0x03cc, B:195:0x03e2, B:197:0x03ee, B:199:0x03fa, B:203:0x045c, B:204:0x0436, B:207:0x0446, B:209:0x044c, B:211:0x0456, B:229:0x0562, B:231:0x056a, B:233:0x0575, B:234:0x05a6, B:236:0x05aa, B:237:0x057b, B:239:0x0588, B:241:0x058e, B:243:0x0596, B:245:0x05a0, B:262:0x05d0, B:265:0x05de, B:269:0x05f5, B:284:0x0849, B:288:0x086e, B:1199:0x0670, B:1204:0x068e, B:1224:0x073c, B:1230:0x0787, B:1232:0x0792, B:1285:0x062a), top: B:15:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:357:0x09ce  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0a49  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x09cf A[Catch: SQLiteException -> 0x0a26, all -> 0x0a4a, TRY_ENTER, TryCatch #34 {all -> 0x0a4a, blocks: (B:353:0x09c8, B:360:0x09d5, B:362:0x09d9, B:363:0x09e6, B:366:0x0a1c, B:372:0x09ed, B:374:0x09fe, B:375:0x0a06, B:378:0x0a0b, B:381:0x0a32, B:385:0x09cf), top: B:344:0x0996, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0a8d A[Catch: SQLiteException -> 0x0ada, all -> 0x1a1a, TryCatch #104 {all -> 0x1a1a, blocks: (B:404:0x0a87, B:406:0x0a8d, B:1127:0x0a92, B:1128:0x0a97, B:1130:0x0a9d, B:1132:0x0aa1, B:1133:0x0aae, B:1134:0x0acc, B:1147:0x0ab7, B:1149:0x0ac1, B:1141:0x0ae1), top: B:403:0x0a87, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0b36 A[Catch: all -> 0x1a18, TRY_ENTER, TRY_LEAVE, TryCatch #103 {all -> 0x1a18, blocks: (B:369:0x0a22, B:419:0x0b36, B:421:0x0b84, B:424:0x0b8c, B:429:0x0b94, B:434:0x0ba9, B:738:0x0bcb, B:740:0x0bdb, B:757:0x0c8d, B:758:0x0c90, B:764:0x0c89, B:775:0x1a02, B:776:0x1a05, B:783:0x0c93, B:784:0x0c9b, B:786:0x0ca1, B:823:0x0cb9, B:788:0x0cc8, B:789:0x0cd2, B:791:0x0cd8, B:793:0x0cef, B:795:0x0d01, B:796:0x0d07, B:798:0x0d2d, B:800:0x0d33, B:802:0x0d6b, B:805:0x0d8d, B:807:0x0d93, B:809:0x0da0, B:810:0x0d5c, B:813:0x0d87, B:815:0x0d39, B:817:0x0d4d, B:818:0x0d53, B:837:0x0e2a, B:838:0x0e64, B:840:0x0e7b, B:859:0x0f36, B:860:0x0f39, B:866:0x0f32, B:888:0x1a0b, B:889:0x1a0e, B:896:0x0f3c, B:897:0x0f44, B:899:0x0f4a, B:920:0x0f62, B:902:0x0f70, B:903:0x0f7a, B:905:0x0f80, B:908:0x0fab, B:910:0x0fc1, B:912:0x0fcf, B:916:0x0fa5, B:924:0x0de4, B:1033:0x1076, B:1034:0x1079, B:937:0x1213, B:938:0x1219, B:940:0x121f, B:943:0x122b, B:945:0x1237, B:946:0x123d, B:954:0x1245, B:957:0x124e, B:958:0x1254, B:960:0x125a, B:963:0x1266, B:966:0x126e, B:974:0x128b, B:976:0x1296, B:978:0x129c, B:980:0x12bc, B:982:0x12c7, B:983:0x12c0, B:986:0x12ca, B:989:0x12d8, B:991:0x12e0, B:993:0x12e4, B:995:0x130a, B:996:0x130e, B:998:0x1314, B:1000:0x1328, B:1001:0x1330, B:1003:0x133a, B:1004:0x1341, B:1007:0x1347, B:1012:0x12e8, B:1037:0x1089, B:1038:0x1091, B:1040:0x1097, B:1042:0x10b3, B:1049:0x10bd, B:1052:0x10cf, B:1054:0x10fd, B:1055:0x1108, B:1057:0x110e, B:1060:0x1120, B:1065:0x1124, B:1067:0x112b, B:1068:0x1131, B:1069:0x1148, B:1071:0x114e, B:1074:0x1160, B:1079:0x11a2, B:1081:0x11a9, B:1082:0x11af, B:1084:0x11bb, B:1085:0x11c1, B:1086:0x11c6, B:1089:0x1165, B:1091:0x116d, B:1093:0x117d, B:1095:0x1180, B:1099:0x1184, B:1101:0x118c, B:1103:0x119c, B:1105:0x119f, B:1045:0x10b9, B:1123:0x1a14, B:1124:0x1a17, B:1137:0x0ad2, B:744:0x0c19, B:746:0x0c1f, B:748:0x0c24, B:749:0x0c32, B:751:0x0c42, B:752:0x0c4a, B:753:0x0c60, B:767:0x0c4f, B:769:0x0c59, B:762:0x0c72, B:770:0x0c67, B:844:0x0eb9, B:849:0x0ec6, B:851:0x0eca, B:852:0x0ed8, B:870:0x0ee8, B:854:0x0ef0, B:855:0x0f06, B:864:0x0f1b, B:875:0x0ef5, B:877:0x0f01, B:883:0x0ec0, B:1024:0x1024, B:1026:0x102a, B:1028:0x103b, B:1029:0x1043, B:1112:0x1056, B:1114:0x105f), top: B:368:0x0a22, inners: #96, #99, #102 }] */
    /* JADX WARN: Removed duplicated region for block: B:437:0x134f A[EDGE_INSN: B:437:0x134f->B:438:0x134f BREAK  A[LOOP:11: B:416:0x0b29->B:431:0x0b29], EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x1388 A[Catch: all -> 0x19fb, TryCatch #93 {all -> 0x19fb, blocks: (B:438:0x134f, B:443:0x137a, B:445:0x1388, B:446:0x139b, B:452:0x13af, B:494:0x1645, B:455:0x1439, B:458:0x1467, B:461:0x147d, B:473:0x14f0, B:478:0x1547, B:481:0x155f, B:495:0x1594, B:502:0x1640, B:504:0x159d, B:509:0x15bc, B:511:0x15e6, B:512:0x15ed, B:513:0x162e, B:515:0x1634, B:516:0x15a6, B:524:0x14ba, B:562:0x1655, B:567:0x167e, B:573:0x1683, B:574:0x168b, B:576:0x1691), top: B:437:0x134f }] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x1491 A[Catch: all -> 0x164c, TRY_ENTER, TryCatch #35 {all -> 0x164c, blocks: (B:537:0x13c5, B:539:0x13e0, B:541:0x13f2, B:542:0x1432, B:544:0x13f5, B:546:0x13f9, B:548:0x13fd, B:550:0x1407, B:551:0x1411, B:553:0x1415, B:555:0x141b, B:556:0x1429, B:531:0x144e, B:463:0x1491, B:464:0x1497, B:466:0x149d, B:469:0x14ab, B:475:0x14fc, B:477:0x150f, B:483:0x1566, B:485:0x1575, B:487:0x1579, B:489:0x157d, B:491:0x1581, B:492:0x158d, B:498:0x15fd, B:500:0x1619, B:501:0x161e, B:506:0x15a1, B:526:0x14cd, B:534:0x1454), top: B:536:0x13c5, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:475:0x14fc A[Catch: all -> 0x164c, TRY_ENTER, TryCatch #35 {all -> 0x164c, blocks: (B:537:0x13c5, B:539:0x13e0, B:541:0x13f2, B:542:0x1432, B:544:0x13f5, B:546:0x13f9, B:548:0x13fd, B:550:0x1407, B:551:0x1411, B:553:0x1415, B:555:0x141b, B:556:0x1429, B:531:0x144e, B:463:0x1491, B:464:0x1497, B:466:0x149d, B:469:0x14ab, B:475:0x14fc, B:477:0x150f, B:483:0x1566, B:485:0x1575, B:487:0x1579, B:489:0x157d, B:491:0x1581, B:492:0x158d, B:498:0x15fd, B:500:0x1619, B:501:0x161e, B:506:0x15a1, B:526:0x14cd, B:534:0x1454), top: B:536:0x13c5, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:480:0x155c  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x1566 A[Catch: all -> 0x164c, TRY_ENTER, TryCatch #35 {all -> 0x164c, blocks: (B:537:0x13c5, B:539:0x13e0, B:541:0x13f2, B:542:0x1432, B:544:0x13f5, B:546:0x13f9, B:548:0x13fd, B:550:0x1407, B:551:0x1411, B:553:0x1415, B:555:0x141b, B:556:0x1429, B:531:0x144e, B:463:0x1491, B:464:0x1497, B:466:0x149d, B:469:0x14ab, B:475:0x14fc, B:477:0x150f, B:483:0x1566, B:485:0x1575, B:487:0x1579, B:489:0x157d, B:491:0x1581, B:492:0x158d, B:498:0x15fd, B:500:0x1619, B:501:0x161e, B:506:0x15a1, B:526:0x14cd, B:534:0x1454), top: B:536:0x13c5, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:495:0x1594 A[Catch: all -> 0x19fb, TRY_ENTER, TryCatch #93 {all -> 0x19fb, blocks: (B:438:0x134f, B:443:0x137a, B:445:0x1388, B:446:0x139b, B:452:0x13af, B:494:0x1645, B:455:0x1439, B:458:0x1467, B:461:0x147d, B:473:0x14f0, B:478:0x1547, B:481:0x155f, B:495:0x1594, B:502:0x1640, B:504:0x159d, B:509:0x15bc, B:511:0x15e6, B:512:0x15ed, B:513:0x162e, B:515:0x1634, B:516:0x15a6, B:524:0x14ba, B:562:0x1655, B:567:0x167e, B:573:0x1683, B:574:0x168b, B:576:0x1691), top: B:437:0x134f }] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x155e  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x14cd A[Catch: all -> 0x164c, TRY_ENTER, TRY_LEAVE, TryCatch #35 {all -> 0x164c, blocks: (B:537:0x13c5, B:539:0x13e0, B:541:0x13f2, B:542:0x1432, B:544:0x13f5, B:546:0x13f9, B:548:0x13fd, B:550:0x1407, B:551:0x1411, B:553:0x1415, B:555:0x141b, B:556:0x1429, B:531:0x144e, B:463:0x1491, B:464:0x1497, B:466:0x149d, B:469:0x14ab, B:475:0x14fc, B:477:0x150f, B:483:0x1566, B:485:0x1575, B:487:0x1579, B:489:0x157d, B:491:0x1581, B:492:0x158d, B:498:0x15fd, B:500:0x1619, B:501:0x161e, B:506:0x15a1, B:526:0x14cd, B:534:0x1454), top: B:536:0x13c5, inners: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:582:0x16b5 A[Catch: all -> 0x1a44, TryCatch #27 {all -> 0x1a44, blocks: (B:577:0x1697, B:580:0x16a6, B:582:0x16b5, B:583:0x16c8, B:585:0x16ce, B:587:0x16e2, B:589:0x17f6, B:592:0x1823, B:596:0x1864, B:601:0x1897, B:603:0x189b, B:604:0x18a6, B:606:0x18e1, B:608:0x18ec, B:610:0x18fd, B:613:0x1912, B:616:0x192d, B:619:0x187a, B:626:0x16e8, B:628:0x16f2, B:635:0x1810, B:636:0x1940, B:637:0x1958, B:640:0x1963, B:642:0x1968, B:645:0x1978, B:647:0x1992, B:648:0x19ab, B:650:0x19b5, B:651:0x19d5, B:656:0x19c4, B:657:0x16f8, B:659:0x16fe, B:663:0x170f, B:666:0x172a, B:673:0x1741, B:676:0x175c, B:682:0x178b, B:685:0x1797, B:688:0x17ae, B:691:0x17b6, B:694:0x17c1, B:696:0x17ca, B:697:0x17cf, B:698:0x17d9, B:715:0x1759, B:723:0x1727, B:1296:0x1a33), top: B:4:0x0027, inners: #48, #66, #80 }] */
    /* JADX WARN: Removed duplicated region for block: B:585:0x16ce A[Catch: all -> 0x1a44, TryCatch #27 {all -> 0x1a44, blocks: (B:577:0x1697, B:580:0x16a6, B:582:0x16b5, B:583:0x16c8, B:585:0x16ce, B:587:0x16e2, B:589:0x17f6, B:592:0x1823, B:596:0x1864, B:601:0x1897, B:603:0x189b, B:604:0x18a6, B:606:0x18e1, B:608:0x18ec, B:610:0x18fd, B:613:0x1912, B:616:0x192d, B:619:0x187a, B:626:0x16e8, B:628:0x16f2, B:635:0x1810, B:636:0x1940, B:637:0x1958, B:640:0x1963, B:642:0x1968, B:645:0x1978, B:647:0x1992, B:648:0x19ab, B:650:0x19b5, B:651:0x19d5, B:656:0x19c4, B:657:0x16f8, B:659:0x16fe, B:663:0x170f, B:666:0x172a, B:673:0x1741, B:676:0x175c, B:682:0x178b, B:685:0x1797, B:688:0x17ae, B:691:0x17b6, B:694:0x17c1, B:696:0x17ca, B:697:0x17cf, B:698:0x17d9, B:715:0x1759, B:723:0x1727, B:1296:0x1a33), top: B:4:0x0027, inners: #48, #66, #80 }] */
    /* JADX WARN: Removed duplicated region for block: B:606:0x18e1 A[Catch: all -> 0x1a44, TRY_LEAVE, TryCatch #27 {all -> 0x1a44, blocks: (B:577:0x1697, B:580:0x16a6, B:582:0x16b5, B:583:0x16c8, B:585:0x16ce, B:587:0x16e2, B:589:0x17f6, B:592:0x1823, B:596:0x1864, B:601:0x1897, B:603:0x189b, B:604:0x18a6, B:606:0x18e1, B:608:0x18ec, B:610:0x18fd, B:613:0x1912, B:616:0x192d, B:619:0x187a, B:626:0x16e8, B:628:0x16f2, B:635:0x1810, B:636:0x1940, B:637:0x1958, B:640:0x1963, B:642:0x1968, B:645:0x1978, B:647:0x1992, B:648:0x19ab, B:650:0x19b5, B:651:0x19d5, B:656:0x19c4, B:657:0x16f8, B:659:0x16fe, B:663:0x170f, B:666:0x172a, B:673:0x1741, B:676:0x175c, B:682:0x178b, B:685:0x1797, B:688:0x17ae, B:691:0x17b6, B:694:0x17c1, B:696:0x17ca, B:697:0x17cf, B:698:0x17d9, B:715:0x1759, B:723:0x1727, B:1296:0x1a33), top: B:4:0x0027, inners: #48, #66, #80 }] */
    /* JADX WARN: Removed duplicated region for block: B:610:0x18fd A[Catch: SQLiteException -> 0x1911, all -> 0x1a44, TRY_LEAVE, TryCatch #66 {SQLiteException -> 0x1911, blocks: (B:608:0x18ec, B:610:0x18fd), top: B:607:0x18ec, outer: #27 }] */
    /* JADX WARN: Removed duplicated region for block: B:639:0x1961  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x1978 A[EDGE_INSN: B:644:0x1978->B:645:0x1978 BREAK  A[LOOP:15: B:637:0x1958->B:642:0x1968], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:647:0x1992 A[Catch: all -> 0x1a44, TryCatch #27 {all -> 0x1a44, blocks: (B:577:0x1697, B:580:0x16a6, B:582:0x16b5, B:583:0x16c8, B:585:0x16ce, B:587:0x16e2, B:589:0x17f6, B:592:0x1823, B:596:0x1864, B:601:0x1897, B:603:0x189b, B:604:0x18a6, B:606:0x18e1, B:608:0x18ec, B:610:0x18fd, B:613:0x1912, B:616:0x192d, B:619:0x187a, B:626:0x16e8, B:628:0x16f2, B:635:0x1810, B:636:0x1940, B:637:0x1958, B:640:0x1963, B:642:0x1968, B:645:0x1978, B:647:0x1992, B:648:0x19ab, B:650:0x19b5, B:651:0x19d5, B:656:0x19c4, B:657:0x16f8, B:659:0x16fe, B:663:0x170f, B:666:0x172a, B:673:0x1741, B:676:0x175c, B:682:0x178b, B:685:0x1797, B:688:0x17ae, B:691:0x17b6, B:694:0x17c1, B:696:0x17ca, B:697:0x17cf, B:698:0x17d9, B:715:0x1759, B:723:0x1727, B:1296:0x1a33), top: B:4:0x0027, inners: #48, #66, #80 }] */
    /* JADX WARN: Removed duplicated region for block: B:657:0x16f8 A[Catch: all -> 0x1a44, TryCatch #27 {all -> 0x1a44, blocks: (B:577:0x1697, B:580:0x16a6, B:582:0x16b5, B:583:0x16c8, B:585:0x16ce, B:587:0x16e2, B:589:0x17f6, B:592:0x1823, B:596:0x1864, B:601:0x1897, B:603:0x189b, B:604:0x18a6, B:606:0x18e1, B:608:0x18ec, B:610:0x18fd, B:613:0x1912, B:616:0x192d, B:619:0x187a, B:626:0x16e8, B:628:0x16f2, B:635:0x1810, B:636:0x1940, B:637:0x1958, B:640:0x1963, B:642:0x1968, B:645:0x1978, B:647:0x1992, B:648:0x19ab, B:650:0x19b5, B:651:0x19d5, B:656:0x19c4, B:657:0x16f8, B:659:0x16fe, B:663:0x170f, B:666:0x172a, B:673:0x1741, B:676:0x175c, B:682:0x178b, B:685:0x1797, B:688:0x17ae, B:691:0x17b6, B:694:0x17c1, B:696:0x17ca, B:697:0x17cf, B:698:0x17d9, B:715:0x1759, B:723:0x1727, B:1296:0x1a33), top: B:4:0x0027, inners: #48, #66, #80 }] */
    /* JADX WARN: Removed duplicated region for block: B:728:0x136b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:732:0x1355 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:735:0x0bbc A[Catch: all -> 0x1a23, TRY_ENTER, TryCatch #1 {all -> 0x1a23, blocks: (B:1165:0x0941, B:1167:0x0961, B:1169:0x0966, B:1172:0x0975, B:340:0x0986, B:345:0x0996, B:384:0x0a51, B:395:0x0a4d, B:396:0x0a50, B:400:0x0a54, B:407:0x0afc, B:409:0x0aff, B:411:0x0b05, B:413:0x0b0d, B:415:0x0b13, B:416:0x0b29, B:735:0x0bbc, B:736:0x0bc5, B:828:0x0daf, B:829:0x0dbd, B:831:0x0dc3, B:834:0x0dd1, B:927:0x0fee, B:1020:0x0ff9, B:930:0x11d6, B:931:0x11da, B:933:0x11e0, B:935:0x1205, B:952:0x120d, B:1143:0x0af8, B:353:0x09c8, B:360:0x09d5, B:362:0x09d9, B:363:0x09e6, B:366:0x0a1c, B:372:0x09ed, B:374:0x09fe, B:375:0x0a06, B:378:0x0a0b, B:381:0x0a32, B:385:0x09cf), top: B:1164:0x0941, inners: #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:828:0x0daf A[Catch: all -> 0x1a23, TRY_ENTER, TryCatch #1 {all -> 0x1a23, blocks: (B:1165:0x0941, B:1167:0x0961, B:1169:0x0966, B:1172:0x0975, B:340:0x0986, B:345:0x0996, B:384:0x0a51, B:395:0x0a4d, B:396:0x0a50, B:400:0x0a54, B:407:0x0afc, B:409:0x0aff, B:411:0x0b05, B:413:0x0b0d, B:415:0x0b13, B:416:0x0b29, B:735:0x0bbc, B:736:0x0bc5, B:828:0x0daf, B:829:0x0dbd, B:831:0x0dc3, B:834:0x0dd1, B:927:0x0fee, B:1020:0x0ff9, B:930:0x11d6, B:931:0x11da, B:933:0x11e0, B:935:0x1205, B:952:0x120d, B:1143:0x0af8, B:353:0x09c8, B:360:0x09d5, B:362:0x09d9, B:363:0x09e6, B:366:0x0a1c, B:372:0x09ed, B:374:0x09fe, B:375:0x0a06, B:378:0x0a0b, B:381:0x0a32, B:385:0x09cf), top: B:1164:0x0941, inners: #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0420 A[Catch: all -> 0x08a2, TryCatch #55 {all -> 0x08a2, blocks: (B:16:0x0079, B:19:0x00a2, B:23:0x00d6, B:36:0x00ed, B:38:0x00f7, B:46:0x0117, B:49:0x0123, B:51:0x0129, B:57:0x0157, B:59:0x0167, B:61:0x0175, B:63:0x0185, B:65:0x0190, B:72:0x0193, B:75:0x01a8, B:82:0x0416, B:84:0x0420, B:88:0x047b, B:90:0x048c, B:92:0x049a, B:95:0x0505, B:102:0x04b0, B:104:0x04bc, B:107:0x04d1, B:109:0x04e2, B:111:0x04f0, B:125:0x01f7, B:127:0x0205, B:129:0x024f, B:130:0x0224, B:132:0x0232, B:138:0x0256, B:140:0x0280, B:141:0x02a8, B:143:0x02d6, B:144:0x02db, B:148:0x02eb, B:150:0x0319, B:154:0x033e, B:156:0x034c, B:158:0x035d, B:159:0x0354, B:168:0x0398, B:169:0x0381, B:171:0x0367, B:174:0x039d, B:177:0x03ab, B:178:0x03b1, B:181:0x03bc, B:185:0x03db, B:186:0x03cc, B:195:0x03e2, B:197:0x03ee, B:199:0x03fa, B:203:0x045c, B:204:0x0436, B:207:0x0446, B:209:0x044c, B:211:0x0456, B:229:0x0562, B:231:0x056a, B:233:0x0575, B:234:0x05a6, B:236:0x05aa, B:237:0x057b, B:239:0x0588, B:241:0x058e, B:243:0x0596, B:245:0x05a0, B:262:0x05d0, B:265:0x05de, B:269:0x05f5, B:284:0x0849, B:288:0x086e, B:1199:0x0670, B:1204:0x068e, B:1224:0x073c, B:1230:0x0787, B:1232:0x0792, B:1285:0x062a), top: B:15:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:927:0x0fee A[Catch: all -> 0x1a23, TRY_ENTER, TryCatch #1 {all -> 0x1a23, blocks: (B:1165:0x0941, B:1167:0x0961, B:1169:0x0966, B:1172:0x0975, B:340:0x0986, B:345:0x0996, B:384:0x0a51, B:395:0x0a4d, B:396:0x0a50, B:400:0x0a54, B:407:0x0afc, B:409:0x0aff, B:411:0x0b05, B:413:0x0b0d, B:415:0x0b13, B:416:0x0b29, B:735:0x0bbc, B:736:0x0bc5, B:828:0x0daf, B:829:0x0dbd, B:831:0x0dc3, B:834:0x0dd1, B:927:0x0fee, B:1020:0x0ff9, B:930:0x11d6, B:931:0x11da, B:933:0x11e0, B:935:0x1205, B:952:0x120d, B:1143:0x0af8, B:353:0x09c8, B:360:0x09d5, B:362:0x09d9, B:363:0x09e6, B:366:0x0a1c, B:372:0x09ed, B:374:0x09fe, B:375:0x0a06, B:378:0x0a0b, B:381:0x0a32, B:385:0x09cf), top: B:1164:0x0941, inners: #34 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x051a A[Catch: all -> 0x0549, TryCatch #33 {all -> 0x0549, blocks: (B:29:0x0536, B:97:0x0514, B:99:0x051a, B:100:0x0522), top: B:96:0x0514 }] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.QpT, X.QqM] */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.Qqm] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37, types: [int] */
    /* JADX WARN: Type inference failed for: r10v38 */
    /* JADX WARN: Type inference failed for: r10v39 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v40 */
    /* JADX WARN: Type inference failed for: r10v41 */
    /* JADX WARN: Type inference failed for: r10v42 */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r10v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v53 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v2, types: [X.0MA, X.1HQ] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r45v0, types: [X.QqL] */
    /* JADX WARN: Type inference failed for: r6v7, types: [X.QpT, X.QqM, X.QnE] */
    /* JADX WARN: Type inference failed for: r6v8, types: [X.Qar] */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIIJZLJL(long r46) {
        /*
            Method dump skipped, instructions count: 6738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68241QqL.LJJIIJZLJL(long):boolean");
    }

    @Override // X.InterfaceC68124QoS
    public final Context LIZ() {
        return this.LJIIJJI.LIZ;
    }

    @Override // X.InterfaceC68124QoS
    public final C67284Qau LIZIZ() {
        C68033Qmz c68033Qmz = this.LJIIJJI;
        QH7.LJIIIIZZ(c68033Qmz);
        return c68033Qmz.LIZIZ();
    }

    @Override // X.InterfaceC68124QoS
    public final C67280Qaq LIZJ() {
        C68033Qmz c68033Qmz = this.LJIIJJI;
        QH7.LJIIIIZZ(c68033Qmz);
        return c68033Qmz.LIZJ();
    }

    @Override // X.InterfaceC68124QoS
    public final InterfaceC67689QhR LIZLLL() {
        C68033Qmz c68033Qmz = this.LJIIJJI;
        QH7.LJIIIIZZ(c68033Qmz);
        return c68033Qmz.LJIILIIL;
    }

    public final void LJI() {
        if (this.LJIIL) {
        } else {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x04c5, code lost:
    
        if (r2 < android.os.SystemClock.elapsedRealtime()) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x06e2, code lost:
    
        if (r7 == null) goto L284;
     */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0275 A[Catch: all -> 0x070e, TRY_ENTER, TryCatch #13 {all -> 0x070e, blocks: (B:28:0x008b, B:76:0x027c, B:78:0x0282, B:80:0x028e, B:81:0x0292, B:83:0x0298, B:86:0x02aa, B:89:0x02f1, B:91:0x02f7, B:93:0x02b0, B:96:0x02b8, B:98:0x02ef, B:104:0x02bd, B:106:0x02e2, B:110:0x030f, B:112:0x0334, B:114:0x035c, B:115:0x0362, B:117:0x036d, B:118:0x0373, B:120:0x0383, B:121:0x0389, B:123:0x0392, B:125:0x0396, B:126:0x039c, B:128:0x03a5, B:130:0x03ad, B:132:0x03b1, B:133:0x03b7, B:134:0x03be, B:136:0x03cd, B:138:0x03d8, B:139:0x03db, B:141:0x03e7, B:143:0x03f2, B:144:0x03f5, B:146:0x0400, B:147:0x0403, B:149:0x040f, B:151:0x041a, B:153:0x0423, B:155:0x0427, B:156:0x042d, B:158:0x0439, B:159:0x043f, B:160:0x0444, B:162:0x0450, B:164:0x045b, B:166:0x045f, B:167:0x0465, B:168:0x046c, B:170:0x0478, B:172:0x0483, B:174:0x0487, B:175:0x048d, B:177:0x04a0, B:179:0x04ac, B:181:0x04d3, B:182:0x04c7, B:183:0x04d8, B:185:0x04e4, B:187:0x04ef, B:189:0x04f3, B:190:0x04f9, B:192:0x0502, B:194:0x0506, B:195:0x050c, B:196:0x0513, B:198:0x051f, B:199:0x0535, B:201:0x0539, B:202:0x053f, B:204:0x0551, B:206:0x0557, B:209:0x0560, B:211:0x056f, B:212:0x057e, B:214:0x059e, B:216:0x05af, B:218:0x05f9, B:220:0x060b, B:221:0x0616, B:224:0x062e, B:225:0x0630, B:227:0x0620, B:228:0x066a, B:229:0x05e6, B:230:0x05f0, B:75:0x0279, B:254:0x0275, B:274:0x067e, B:275:0x0681, B:312:0x0682, B:319:0x06e4, B:320:0x06e7, B:322:0x06ed, B:324:0x06f8, B:326:0x06cc, B:336:0x0708, B:337:0x070b, B:223:0x062a, B:316:0x06b4, B:318:0x06ba, B:325:0x06c8, B:328:0x06d5, B:52:0x018a, B:267:0x0190, B:54:0x019c, B:55:0x01a2, B:57:0x01a6, B:60:0x01b1, B:63:0x01c2, B:64:0x01c4, B:68:0x01ca, B:69:0x01da, B:71:0x01e0, B:235:0x01e6, B:236:0x0228, B:238:0x022e, B:239:0x0235, B:240:0x0248, B:249:0x01f0, B:66:0x01d5, B:258:0x0205, B:259:0x0212, B:263:0x0216, B:252:0x025e), top: B:27:0x008b, inners: #1, #6, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x06ed A[Catch: all -> 0x070e, TryCatch #13 {all -> 0x070e, blocks: (B:28:0x008b, B:76:0x027c, B:78:0x0282, B:80:0x028e, B:81:0x0292, B:83:0x0298, B:86:0x02aa, B:89:0x02f1, B:91:0x02f7, B:93:0x02b0, B:96:0x02b8, B:98:0x02ef, B:104:0x02bd, B:106:0x02e2, B:110:0x030f, B:112:0x0334, B:114:0x035c, B:115:0x0362, B:117:0x036d, B:118:0x0373, B:120:0x0383, B:121:0x0389, B:123:0x0392, B:125:0x0396, B:126:0x039c, B:128:0x03a5, B:130:0x03ad, B:132:0x03b1, B:133:0x03b7, B:134:0x03be, B:136:0x03cd, B:138:0x03d8, B:139:0x03db, B:141:0x03e7, B:143:0x03f2, B:144:0x03f5, B:146:0x0400, B:147:0x0403, B:149:0x040f, B:151:0x041a, B:153:0x0423, B:155:0x0427, B:156:0x042d, B:158:0x0439, B:159:0x043f, B:160:0x0444, B:162:0x0450, B:164:0x045b, B:166:0x045f, B:167:0x0465, B:168:0x046c, B:170:0x0478, B:172:0x0483, B:174:0x0487, B:175:0x048d, B:177:0x04a0, B:179:0x04ac, B:181:0x04d3, B:182:0x04c7, B:183:0x04d8, B:185:0x04e4, B:187:0x04ef, B:189:0x04f3, B:190:0x04f9, B:192:0x0502, B:194:0x0506, B:195:0x050c, B:196:0x0513, B:198:0x051f, B:199:0x0535, B:201:0x0539, B:202:0x053f, B:204:0x0551, B:206:0x0557, B:209:0x0560, B:211:0x056f, B:212:0x057e, B:214:0x059e, B:216:0x05af, B:218:0x05f9, B:220:0x060b, B:221:0x0616, B:224:0x062e, B:225:0x0630, B:227:0x0620, B:228:0x066a, B:229:0x05e6, B:230:0x05f0, B:75:0x0279, B:254:0x0275, B:274:0x067e, B:275:0x0681, B:312:0x0682, B:319:0x06e4, B:320:0x06e7, B:322:0x06ed, B:324:0x06f8, B:326:0x06cc, B:336:0x0708, B:337:0x070b, B:223:0x062a, B:316:0x06b4, B:318:0x06ba, B:325:0x06c8, B:328:0x06d5, B:52:0x018a, B:267:0x0190, B:54:0x019c, B:55:0x01a2, B:57:0x01a6, B:60:0x01b1, B:63:0x01c2, B:64:0x01c4, B:68:0x01ca, B:69:0x01da, B:71:0x01e0, B:235:0x01e6, B:236:0x0228, B:238:0x022e, B:239:0x0235, B:240:0x0248, B:249:0x01f0, B:66:0x01d5, B:258:0x0205, B:259:0x0212, B:263:0x0216, B:252:0x025e), top: B:27:0x008b, inners: #1, #6, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019c A[Catch: SQLiteException -> 0x0257, all -> 0x067b, TRY_ENTER, TryCatch #0 {SQLiteException -> 0x0257, blocks: (B:52:0x018a, B:54:0x019c, B:55:0x01a2, B:57:0x01a6, B:60:0x01b1), top: B:51:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0282 A[Catch: all -> 0x070e, TryCatch #13 {all -> 0x070e, blocks: (B:28:0x008b, B:76:0x027c, B:78:0x0282, B:80:0x028e, B:81:0x0292, B:83:0x0298, B:86:0x02aa, B:89:0x02f1, B:91:0x02f7, B:93:0x02b0, B:96:0x02b8, B:98:0x02ef, B:104:0x02bd, B:106:0x02e2, B:110:0x030f, B:112:0x0334, B:114:0x035c, B:115:0x0362, B:117:0x036d, B:118:0x0373, B:120:0x0383, B:121:0x0389, B:123:0x0392, B:125:0x0396, B:126:0x039c, B:128:0x03a5, B:130:0x03ad, B:132:0x03b1, B:133:0x03b7, B:134:0x03be, B:136:0x03cd, B:138:0x03d8, B:139:0x03db, B:141:0x03e7, B:143:0x03f2, B:144:0x03f5, B:146:0x0400, B:147:0x0403, B:149:0x040f, B:151:0x041a, B:153:0x0423, B:155:0x0427, B:156:0x042d, B:158:0x0439, B:159:0x043f, B:160:0x0444, B:162:0x0450, B:164:0x045b, B:166:0x045f, B:167:0x0465, B:168:0x046c, B:170:0x0478, B:172:0x0483, B:174:0x0487, B:175:0x048d, B:177:0x04a0, B:179:0x04ac, B:181:0x04d3, B:182:0x04c7, B:183:0x04d8, B:185:0x04e4, B:187:0x04ef, B:189:0x04f3, B:190:0x04f9, B:192:0x0502, B:194:0x0506, B:195:0x050c, B:196:0x0513, B:198:0x051f, B:199:0x0535, B:201:0x0539, B:202:0x053f, B:204:0x0551, B:206:0x0557, B:209:0x0560, B:211:0x056f, B:212:0x057e, B:214:0x059e, B:216:0x05af, B:218:0x05f9, B:220:0x060b, B:221:0x0616, B:224:0x062e, B:225:0x0630, B:227:0x0620, B:228:0x066a, B:229:0x05e6, B:230:0x05f0, B:75:0x0279, B:254:0x0275, B:274:0x067e, B:275:0x0681, B:312:0x0682, B:319:0x06e4, B:320:0x06e7, B:322:0x06ed, B:324:0x06f8, B:326:0x06cc, B:336:0x0708, B:337:0x070b, B:223:0x062a, B:316:0x06b4, B:318:0x06ba, B:325:0x06c8, B:328:0x06d5, B:52:0x018a, B:267:0x0190, B:54:0x019c, B:55:0x01a2, B:57:0x01a6, B:60:0x01b1, B:63:0x01c2, B:64:0x01c4, B:68:0x01ca, B:69:0x01da, B:71:0x01e0, B:235:0x01e6, B:236:0x0228, B:238:0x022e, B:239:0x0235, B:240:0x0248, B:249:0x01f0, B:66:0x01d5, B:258:0x0205, B:259:0x0212, B:263:0x0216, B:252:0x025e), top: B:27:0x008b, inners: #1, #6, #20 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI() {
        /*
            Method dump skipped, instructions count: 1814
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68241QqL.LJIJI():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0303  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJ() {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68241QqL.LJJIIJ():void");
    }

    public final C68034Qn0 LJJIJIL() {
        C68033Qmz c68033Qmz = this.LJIIJJI;
        QH7.LJIIIIZZ(c68033Qmz);
        return c68033Qmz.LJI;
    }

    public final C68242QqM LJJIJLIJ() {
        C68242QqM c68242QqM = this.LIZJ;
        LJJIJIIJI(c68242QqM);
        return c68242QqM;
    }

    public final C68240QqK LJJIL() {
        C68240QqK c68240QqK = this.LIZLLL;
        if (c68240QqK != null) {
            return c68240QqK;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final C68243QqN LJJJ() {
        C68243QqN c68243QqN = this.LJI;
        LJJIJIIJI(c68243QqN);
        return c68243QqN;
    }

    public final C68083Qnn LJJJI() {
        C68033Qmz c68033Qmz = this.LJIIJJI;
        QH7.LJIIIIZZ(c68033Qmz);
        return c68033Qmz.LJIL();
    }

    public final void LJFF() {
        LIZIZ().LJFF();
        LJI();
        if (!this.LJIILIIL) {
            this.LJIILIIL = true;
            LIZIZ().LJFF();
            FileLock fileLock = this.LJIJJLI;
            int i = 0;
            if (fileLock == null || !fileLock.isValid()) {
                try {
                    FileChannel channel = new RandomAccessFile(new File(C16880lQ.LLIIJLIL(this.LJIIJJI.LIZ), "google_app_measurement.db"), "rw").getChannel();
                    this.LJIL = channel;
                    FileLock tryLock = channel.tryLock();
                    this.LJIJJLI = tryLock;
                    if (tryLock != null) {
                        LIZJ().LJIILIIL.LIZ("Storage concurrent access okay");
                    } else {
                        LIZJ().LJFF.LIZ("Storage concurrent data access panic");
                        return;
                    }
                } catch (FileNotFoundException e) {
                    LIZJ().LJFF.LIZIZ(e, "Failed to acquire storage lock");
                    return;
                } catch (IOException e2) {
                    LIZJ().LJFF.LIZIZ(e2, "Failed to access storage lock file");
                    return;
                } catch (OverlappingFileLockException e3) {
                    LIZJ().LJIIIIZZ.LIZIZ(e3, "Storage lock already acquired");
                    return;
                }
            } else {
                LIZJ().LJIILIIL.LIZ("Storage concurrent access okay");
            }
            FileChannel fileChannel = this.LJIL;
            LIZIZ().LJFF();
            if (fileChannel == null || !fileChannel.isOpen()) {
                LIZJ().LJFF.LIZ("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read != 4) {
                        if (read != -1) {
                            LIZJ().LJIIIIZZ.LIZIZ(Integer.valueOf(read), "Unexpected data length. Bytes read");
                        }
                    } else {
                        allocate.flip();
                        i = allocate.getInt();
                    }
                } catch (IOException e4) {
                    LIZJ().LJFF.LIZIZ(e4, "Failed to read from channel");
                }
            }
            C68031Qmx LJIILJJIL = this.LJIIJJI.LJIILJJIL();
            LJIILJJIL.LJI();
            int i2 = LJIILJJIL.LJ;
            LIZIZ().LJFF();
            if (i > i2) {
                LIZJ().LJFF.LIZJ(Integer.valueOf(i), Integer.valueOf(i2), "Panic: can't downgrade version. Previous, current version");
                return;
            }
            if (i < i2) {
                FileChannel fileChannel2 = this.LJIL;
                LIZIZ().LJFF();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    LIZJ().LJFF.LIZ("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(i2);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            LIZJ().LJFF.LIZIZ(Long.valueOf(fileChannel2.size()), "Error writing to channel. Bytes written");
                        }
                        LIZJ().LJIILIIL.LIZJ(Integer.valueOf(i), Integer.valueOf(i2), "Storage version upgraded. Previous, current version");
                        return;
                    } catch (IOException e5) {
                        LIZJ().LJFF.LIZIZ(e5, "Failed to write to channel");
                    }
                }
                LIZJ().LJFF.LIZJ(Integer.valueOf(i), Integer.valueOf(i2), "Storage version upgrade failed. Previous, current version");
            }
        }
    }

    public final long LJIL() {
        LIZLLL().getClass();
        long currentTimeMillis = System.currentTimeMillis();
        C67275Qal c67275Qal = this.LJIIIIZZ;
        c67275Qal.LJI();
        c67275Qal.LJFF();
        long LIZ = c67275Qal.LJIIJJI.LIZ();
        if (LIZ == 0) {
            LIZ = c67275Qal.LIZ.LJIL().LJIILJJIL().nextInt(86400000) + 1;
            c67275Qal.LJIIJJI.LIZIZ(LIZ);
        }
        return ((((currentTimeMillis + LIZ) / 1000) / 60) / 60) / 24;
    }

    public final void LJJII() {
        LIZIZ().LJFF();
        if (this.LJIJ || this.LJIJI || this.LJIJJ) {
            LIZJ().LJIILIIL.LIZLLL(Boolean.valueOf(this.LJIJ), Boolean.valueOf(this.LJIJI), Boolean.valueOf(this.LJIJJ), "Not stopping services. fetch, network, upload");
            return;
        }
        LIZJ().LJIILIIL.LIZ("Stopping uploading service(s)");
        List list = this.LJIILL;
        if (list == null) {
            return;
        }
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        List list2 = this.LJIILL;
        QH7.LJIIIIZZ(list2);
        list2.clear();
    }

    public final boolean LJJIIZ() {
        LIZIZ().LJFF();
        LJI();
        C68242QqM c68242QqM = this.LIZJ;
        LJJIJIIJI(c68242QqM);
        if (c68242QqM.LJIJI("select count(1) > 0 from raw_events", null) == 0) {
            C68242QqM c68242QqM2 = this.LIZJ;
            LJJIJIIJI(c68242QqM2);
            if (TextUtils.isEmpty(c68242QqM2.LJJIJIIJI())) {
                return false;
            }
        }
        return true;
    }

    public C68241QqL(C68312QrU c68312QrU) {
        this.LJIIJJI = C68033Qmz.LJIIZILJ(c68312QrU.LIZ, null, null);
        C68243QqN c68243QqN = new C68243QqN(this);
        c68243QqN.LJII();
        this.LJI = c68243QqN;
        C68186QpS c68186QpS = new C68186QpS(this);
        c68186QpS.LJII();
        this.LIZIZ = c68186QpS;
        C68244QqO c68244QqO = new C68244QqO(this);
        c68244QqO.LJII();
        this.LIZ = c68244QqO;
        this.LJJII = new HashMap();
        this.LJJIII = new HashMap();
        LIZIZ().LJIILIIL(new RunnableC68238QqI(1, this, c68312QrU));
    }

    public static final boolean LJJIJ(zzq zzqVar) {
        if (!TextUtils.isEmpty(zzqVar.zzb) || !TextUtils.isEmpty(zzqVar.zzq)) {
            return true;
        }
        return false;
    }

    public static final void LJJIJIIJI(AbstractC68187QpT abstractC68187QpT) {
        if (abstractC68187QpT != null) {
            if (abstractC68187QpT.LIZJ) {
                return;
            } else {
                throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC68187QpT.getClass())));
            }
        }
        throw new IllegalStateException("Upload Component not created");
    }

    public static C68241QqL LJJIZ(Context context) {
        QH7.LJIIIIZZ(context);
        QH7.LJIIIIZZ(C16880lQ.LLLLL(context));
        if (LJJIIZI == null) {
            synchronized (C68241QqL.class) {
                if (LJJIIZI == null) {
                    LJJIIZI = new C68241QqL(new C68312QrU(context));
                }
            }
        }
        return LJJIIZI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJII(C68252QqW c68252QqW) {
        C1HQ c1hq;
        LIZIZ().LJFF();
        if (!TextUtils.isEmpty(c68252QqW.LJJII()) || !TextUtils.isEmpty(c68252QqW.LJIJJ())) {
            C68188QpU c68188QpU = this.LJIIIZ;
            Uri.Builder builder = new Uri.Builder();
            String LJJII = c68252QqW.LJJII();
            if (TextUtils.isEmpty(LJJII)) {
                LJJII = c68252QqW.LJIJJ();
            }
            C1HQ c1hq2 = null;
            Uri.Builder appendQueryParameter = builder.scheme((String) C68555QvP.LJFF.LIZ(null)).encodedAuthority((String) C68555QvP.LJI.LIZ(null)).path("config/app/".concat(String.valueOf(LJJII))).appendQueryParameter("platform", "android");
            c68188QpU.LIZ.LJI.LJIIJ();
            appendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(64000L)).appendQueryParameter("runtime_version", CardStruct.IStatusCode.DEFAULT);
            C68580Qvo.LIZIZ();
            if (!c68188QpU.LIZ.LJI.LJIILJJIL(c68252QqW.LJIL(), C68555QvP.LJJZZIII)) {
                builder.appendQueryParameter("app_instance_id", c68252QqW.LJJ());
            }
            String uri = builder.build().toString();
            try {
                String LJIL = c68252QqW.LJIL();
                QH7.LJIIIIZZ(LJIL);
                java.net.URL url = new java.net.URL(uri);
                LIZJ().LJIILIIL.LIZIZ(LJIL, "Fetching remote configuration");
                C68244QqO c68244QqO = this.LIZ;
                LJJIJIIJI(c68244QqO);
                C68256Qqa LJIILL = c68244QqO.LJIILL(LJIL);
                C68244QqO c68244QqO2 = this.LIZ;
                LJJIJIIJI(c68244QqO2);
                c68244QqO2.LJFF();
                String str = (String) c68244QqO2.LJIIL.getOrDefault(LJIL, null);
                if (LJIILL != null) {
                    if (!TextUtils.isEmpty(str)) {
                        c1hq = new C1HQ();
                        c1hq.put("If-Modified-Since", str);
                    } else {
                        c1hq = null;
                    }
                    C68580Qvo.LIZIZ();
                    if (LJJIJIL().LJIILJJIL(null, C68555QvP.LJLJLJ)) {
                        C68244QqO c68244QqO3 = this.LIZ;
                        LJJIJIIJI(c68244QqO3);
                        c68244QqO3.LJFF();
                        String str2 = (String) c68244QqO3.LJIILIIL.getOrDefault(LJIL, null);
                        if (!TextUtils.isEmpty(str2)) {
                            if (c1hq == null) {
                                c1hq = new C1HQ();
                            }
                            c1hq2 = c1hq;
                            c1hq2.put("If-None-Match", str2);
                        }
                    }
                    this.LJIJ = true;
                    C68186QpS c68186QpS = this.LIZIZ;
                    LJJIJIIJI(c68186QpS);
                    C50765Jw9 c50765Jw9 = new C50765Jw9(this);
                    c68186QpS.LJFF();
                    c68186QpS.LJI();
                    c68186QpS.LIZ.LIZIZ().LJIIL(new PDG(c68186QpS, LJIL, url, null, c1hq, c50765Jw9));
                    return;
                }
                c1hq = c1hq2;
                this.LJIJ = true;
                C68186QpS c68186QpS2 = this.LIZIZ;
                LJJIJIIJI(c68186QpS2);
                C50765Jw9 c50765Jw92 = new C50765Jw9(this);
                c68186QpS2.LJFF();
                c68186QpS2.LJI();
                c68186QpS2.LIZ.LIZIZ().LJIIL(new PDG(c68186QpS2, LJIL, url, null, c1hq, c50765Jw92));
                return;
            } catch (MalformedURLException unused) {
                LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(c68252QqW.LJIL()), uri, "Failed to parse config URL. Not fetching. appId");
                return;
            }
        }
        String LJIL2 = c68252QqW.LJIL();
        QH7.LJIIIIZZ(LJIL2);
        LJIIJJI(LJIL2, 204, null, null, null);
    }

    public final void LJIIL(zzq zzqVar) {
        int i;
        long j;
        C68277Qqv LJJIIJZLJL;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        boolean z4;
        LIZIZ().LJFF();
        LJI();
        QH7.LJIIIIZZ(zzqVar);
        QH7.LJI(zzqVar.zza);
        if (LJJIJ(zzqVar)) {
            C68242QqM c68242QqM = this.LIZJ;
            LJJIJIIJI(c68242QqM);
            C68252QqW LJJIFFI = c68242QqM.LJJIFFI(zzqVar.zza);
            if (LJJIFFI != null && TextUtils.isEmpty(LJJIFFI.LJJII()) && !TextUtils.isEmpty(zzqVar.zzb)) {
                LJJIFFI.LJI(0L);
                C68242QqM c68242QqM2 = this.LIZJ;
                LJJIJIIJI(c68242QqM2);
                c68242QqM2.LJIIJJI(LJJIFFI);
                C68244QqO c68244QqO = this.LIZ;
                LJJIJIIJI(c68244QqO);
                String str = zzqVar.zza;
                c68244QqO.LJFF();
                c68244QqO.LJII.remove(str);
            }
            if (!zzqVar.zzh) {
                LJJIJIIJIL(zzqVar);
                return;
            }
            long j3 = zzqVar.zzm;
            if (j3 == 0) {
                LIZLLL().getClass();
                j3 = System.currentTimeMillis();
            }
            C67287Qax LJIILIIL = this.LJIIJJI.LJIILIIL();
            LJIILIIL.LJFF();
            LJIILIIL.LJFF = null;
            LJIILIIL.LJI = 0L;
            int i2 = zzqVar.zzn;
            if (i2 != 0 && i2 != 1) {
                LIZJ().LJIIIIZZ.LIZJ(C67280Qaq.LJIIIZ(zzqVar.zza), Integer.valueOf(i2), "Incorrect app type, assuming installed app. appId, appType");
                i2 = 0;
            }
            C68242QqM c68242QqM3 = this.LIZJ;
            LJJIJIIJI(c68242QqM3);
            c68242QqM3.LJJIL();
            try {
                C68242QqM c68242QqM4 = this.LIZJ;
                LJJIJIIJI(c68242QqM4);
                C68135Qod LJJIIZI2 = c68242QqM4.LJJIIZI(zzqVar.zza, "_npa");
                if (LJJIIZI2 == null || "auto".equals(LJJIIZI2.LIZIZ)) {
                    if (zzqVar.zzr != null) {
                        if (true != zzqVar.zzr.booleanValue()) {
                            j = 0;
                        } else {
                            j = 1;
                        }
                        i = 1;
                        zzlo zzloVar = new zzlo(j3, Long.valueOf(j), "_npa", "auto");
                        if (LJJIIZI2 == null || !LJJIIZI2.LJ.equals(zzloVar.zzd)) {
                            LJIJ(zzloVar, zzqVar);
                        }
                    } else {
                        i = 1;
                        if (LJJIIZI2 != null) {
                            LJIILJJIL(new zzlo(j3, null, "_npa", "auto"), zzqVar);
                        }
                    }
                } else {
                    i = 1;
                }
                C68242QqM c68242QqM5 = this.LIZJ;
                LJJIJIIJI(c68242QqM5);
                String str2 = zzqVar.zza;
                QH7.LJIIIIZZ(str2);
                C68252QqW LJJIFFI2 = c68242QqM5.LJJIFFI(str2);
                if (LJJIFFI2 != null) {
                    C68083Qnn LJJJI = LJJJI();
                    String str3 = zzqVar.zzb;
                    String LJJII = LJJIFFI2.LJJII();
                    String str4 = zzqVar.zzq;
                    String LJIJJ = LJJIFFI2.LJIJJ();
                    LJJJI.getClass();
                    if (C68083Qnn.LJJJJJL(str3, LJJII, str4, LJIJJ)) {
                        LIZJ().LJIIIIZZ.LIZIZ(C67280Qaq.LJIIIZ(LJJIFFI2.LJIL()), "New GMP App Id passed in. Removing cached database data. appId");
                        C68242QqM c68242QqM6 = this.LIZJ;
                        LJJIJIIJI(c68242QqM6);
                        String LJIL = LJJIFFI2.LJIL();
                        c68242QqM6.LJI();
                        c68242QqM6.LJFF();
                        QH7.LJI(LJIL);
                        try {
                            SQLiteDatabase LJJI = c68242QqM6.LJJI();
                            String[] strArr = new String[i];
                            strArr[0] = LJIL;
                            int delete = LJJI.delete("events", "app_id=?", strArr) + LJJI.delete("user_attributes", "app_id=?", strArr) + LJJI.delete("conditional_properties", "app_id=?", strArr) + LJJI.delete("apps", "app_id=?", strArr) + LJJI.delete("raw_events", "app_id=?", strArr) + LJJI.delete("raw_events_metadata", "app_id=?", strArr) + LJJI.delete("event_filters", "app_id=?", strArr) + LJJI.delete("property_filters", "app_id=?", strArr) + LJJI.delete("audience_filter_values", "app_id=?", strArr) + LJJI.delete("consent_settings", "app_id=?", strArr);
                            if (delete > 0) {
                                c68242QqM6.LIZ.LIZJ().LJIILIIL.LIZJ(LJIL, Integer.valueOf(delete), "Deleted application data. app, records");
                            }
                        } catch (SQLiteException e) {
                            c68242QqM6.LIZ.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(LJIL), e, "Error deleting application data. appId, error");
                        }
                    } else {
                        if (LJJIFFI2.LJIJI() != -2147483648L && LJJIFFI2.LJIJI() != zzqVar.zzj) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        String LJJI2 = LJJIFFI2.LJJI();
                        if (LJJIFFI2.LJIJI() != -2147483648L || LJJI2 == null || LJJI2.equals(zzqVar.zzc)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (z3 | z4) {
                            Bundle bundle = new Bundle();
                            bundle.putString("_pv", LJJI2);
                            LJIIIIZZ(new zzaw("_au", new zzau(bundle), "auto", j3), zzqVar);
                        }
                    }
                }
                LJJIJIIJIL(zzqVar);
                if (i2 == 0) {
                    C68242QqM c68242QqM7 = this.LIZJ;
                    LJJIJIIJI(c68242QqM7);
                    LJJIIJZLJL = c68242QqM7.LJJIIJZLJL(zzqVar.zza, "_f");
                    z = false;
                } else {
                    C68242QqM c68242QqM8 = this.LIZJ;
                    LJJIJIIJI(c68242QqM8);
                    LJJIIJZLJL = c68242QqM8.LJJIIJZLJL(zzqVar.zza, "_v");
                    z = true;
                }
                if (LJJIIJZLJL == null) {
                    long j4 = ((j3 / 3600000) + 1) * 3600000;
                    if (!z) {
                        LJIJ(new zzlo(j3, Long.valueOf(j4), "_fot", "auto"), zzqVar);
                        LIZIZ().LJFF();
                        C67604Qg4 c67604Qg4 = this.LJIIJ;
                        QH7.LJIIIIZZ(c67604Qg4);
                        String str5 = zzqVar.zza;
                        if (str5 == null || str5.isEmpty()) {
                            c67604Qg4.LIZ.LIZJ().LJIIIZ.LIZ("Install Referrer Reporter was called with invalid app package name");
                        } else {
                            c67604Qg4.LIZ.LIZIZ().LJFF();
                            if (!c67604Qg4.LIZ()) {
                                c67604Qg4.LIZ.LIZJ().LJIIJJI.LIZ("Install Referrer Reporter is not available");
                            } else {
                                ServiceConnectionC67601Qg1 serviceConnectionC67601Qg1 = new ServiceConnectionC67601Qg1(c67604Qg4, str5);
                                c67604Qg4.LIZ.LIZIZ().LJFF();
                                Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                PackageManager packageManager = c67604Qg4.LIZ.LIZ.getPackageManager();
                                if (packageManager == null) {
                                    c67604Qg4.LIZ.LIZJ().LJIIIZ.LIZ("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                } else {
                                    List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                    if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                                        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                        if (serviceInfo != null) {
                                            String str6 = serviceInfo.packageName;
                                            if (serviceInfo.name != null && "com.android.vending".equals(str6) && c67604Qg4.LIZ()) {
                                                try {
                                                    boolean LIZ = QCV.LIZIZ().LIZ(c67604Qg4.LIZ.LIZ, new Intent(intent), serviceConnectionC67601Qg1, 1);
                                                    C67281Qar c67281Qar = c67604Qg4.LIZ.LIZJ().LJIILIIL;
                                                    String str7 = "not available";
                                                    if (true == LIZ) {
                                                        str7 = "available";
                                                    }
                                                    c67281Qar.LIZIZ(str7, "Install Referrer Service is");
                                                } catch (RuntimeException e2) {
                                                    c67604Qg4.LIZ.LIZJ().LJFF.LIZIZ(e2.getMessage(), "Exception occurred while binding to Install Referrer Service");
                                                }
                                            } else {
                                                c67604Qg4.LIZ.LIZJ().LJIIIIZZ.LIZ("Play Store version 8.3.73 or higher required for Install Referrer");
                                            }
                                        }
                                    } else {
                                        c67604Qg4.LIZ.LIZJ().LJIIJJI.LIZ("Play Service for fetching Install Referrer is unavailable on device");
                                    }
                                }
                            }
                        }
                        LIZIZ().LJFF();
                        LJI();
                        Bundle bundle2 = new Bundle();
                        bundle2.putLong("_c", 1L);
                        bundle2.putLong("_r", 1L);
                        bundle2.putLong("_uwa", 0L);
                        bundle2.putLong("_pfo", 0L);
                        bundle2.putLong("_sys", 0L);
                        bundle2.putLong("_sysu", 0L);
                        bundle2.putLong("_et", 1L);
                        if (zzqVar.zzp) {
                            bundle2.putLong("_dac", 1L);
                        }
                        String str8 = zzqVar.zza;
                        QH7.LJIIIIZZ(str8);
                        C68242QqM c68242QqM9 = this.LIZJ;
                        LJJIJIIJI(c68242QqM9);
                        QH7.LJI(str8);
                        c68242QqM9.LJFF();
                        c68242QqM9.LJI();
                        long LJIL2 = c68242QqM9.LJIL(str8);
                        if (this.LJIIJJI.LIZ.getPackageManager() == null) {
                            LIZJ().LJFF.LIZIZ(C67280Qaq.LJIIIZ(str8), "PackageManager is null, first open report might be inaccurate. appId");
                        } else {
                            try {
                                PackageInfo LIZIZ = QCX.LIZ(this.LJIIJJI.LIZ).LIZIZ(0, str8);
                                if (LIZIZ != null) {
                                    long j5 = LIZIZ.firstInstallTime;
                                    if (j5 != 0) {
                                        if (j5 != LIZIZ.lastUpdateTime) {
                                            if (LJJIJIL().LJIILJJIL(null, C68555QvP.LJJJLZIJ)) {
                                                if (LJIL2 == 0) {
                                                    bundle2.putLong("_uwa", 1L);
                                                    LJIL2 = 0;
                                                }
                                            } else {
                                                bundle2.putLong("_uwa", 1L);
                                            }
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        if (true != z2) {
                                            j2 = 0;
                                        } else {
                                            j2 = 1;
                                        }
                                        LJIJ(new zzlo(j3, Long.valueOf(j2), "_fi", "auto"), zzqVar);
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException e3) {
                                LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(str8), e3, "Package info is null, first open report might be inaccurate. appId");
                            }
                            try {
                                ApplicationInfo LIZ2 = QCX.LIZ(this.LJIIJJI.LIZ).LIZ(0, str8);
                                if (LIZ2 != null) {
                                    if ((LIZ2.flags & 1) != 0) {
                                        bundle2.putLong("_sys", 1L);
                                    }
                                    if ((LIZ2.flags & 128) != 0) {
                                        bundle2.putLong("_sysu", 1L);
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException e4) {
                                LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(str8), e4, "Application info is null, first open report might be inaccurate. appId");
                            }
                        }
                        if (LJIL2 >= 0) {
                            bundle2.putLong("_pfo", LJIL2);
                        }
                        LJIIJ(new zzaw("_f", new zzau(bundle2), "auto", j3), zzqVar);
                    } else {
                        LJIJ(new zzlo(j3, Long.valueOf(j4), "_fvt", "auto"), zzqVar);
                        LIZIZ().LJFF();
                        LJI();
                        Bundle bundle3 = new Bundle();
                        bundle3.putLong("_c", 1L);
                        bundle3.putLong("_r", 1L);
                        bundle3.putLong("_et", 1L);
                        if (zzqVar.zzp) {
                            bundle3.putLong("_dac", 1L);
                        }
                        LJIIJ(new zzaw("_v", new zzau(bundle3), "auto", j3), zzqVar);
                    }
                } else if (zzqVar.zzi) {
                    LJIIJ(new zzaw("_cd", new zzau(new Bundle()), "auto", j3), zzqVar);
                }
                C68242QqM c68242QqM10 = this.LIZJ;
                LJJIJIIJI(c68242QqM10);
                c68242QqM10.LJIIJ();
            } finally {
                C68242QqM c68242QqM11 = this.LIZJ;
                LJJIJIIJI(c68242QqM11);
                c68242QqM11.LJJIZ();
            }
        }
    }

    public final void LJIILL(zzq zzqVar) {
        if (this.LJJ != null) {
            ArrayList arrayList = new ArrayList();
            this.LJJI = arrayList;
            arrayList.addAll(this.LJJ);
        }
        C68242QqM c68242QqM = this.LIZJ;
        LJJIJIIJI(c68242QqM);
        String str = zzqVar.zza;
        QH7.LJIIIIZZ(str);
        QH7.LJI(str);
        c68242QqM.LJFF();
        c68242QqM.LJI();
        try {
            SQLiteDatabase LJJI = c68242QqM.LJJI();
            String[] strArr = {str};
            int delete = LJJI.delete("apps", "app_id=?", strArr) + LJJI.delete("events", "app_id=?", strArr) + LJJI.delete("user_attributes", "app_id=?", strArr) + LJJI.delete("conditional_properties", "app_id=?", strArr) + LJJI.delete("raw_events", "app_id=?", strArr) + LJJI.delete("raw_events_metadata", "app_id=?", strArr) + LJJI.delete("queue", "app_id=?", strArr) + LJJI.delete("audience_filter_values", "app_id=?", strArr) + LJJI.delete("main_event_params", "app_id=?", strArr) + LJJI.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                c68242QqM.LIZ.LIZJ().LJIILIIL.LIZJ(str, Integer.valueOf(delete), "Reset analytics data. app, records");
            }
        } catch (SQLiteException e) {
            c68242QqM.LIZ.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(str), e, "Error resetting analytics data. appId, error");
        }
        if (zzqVar.zzh) {
            LJIIL(zzqVar);
        }
    }

    public final zzq LJJI(String str) {
        C68242QqM c68242QqM = this.LIZJ;
        LJJIJIIJI(c68242QqM);
        C68252QqW LJJIFFI = c68242QqM.LJJIFFI(str);
        if (LJJIFFI == null || TextUtils.isEmpty(LJJIFFI.LJJI())) {
            LIZJ().LJIIL.LIZIZ(str, "No app data available; dropping");
            return null;
        }
        Boolean LJJIFFI2 = LJJIFFI(LJJIFFI);
        if (LJJIFFI2 != null && !LJJIFFI2.booleanValue()) {
            LIZJ().LJFF.LIZIZ(C67280Qaq.LJIIIZ(str), "App version does not match; dropping. appId");
            return null;
        }
        String LJJII = LJJIFFI.LJJII();
        String LJJI = LJJIFFI.LJJI();
        long LJIJI = LJJIFFI.LJIJI();
        LJJIFFI.LIZ.LIZIZ().LJFF();
        String str2 = LJJIFFI.LJIIJJI;
        LJJIFFI.LIZ.LIZIZ().LJFF();
        long j = LJJIFFI.LJIIL;
        LJJIFFI.LIZ.LIZIZ().LJFF();
        long j2 = LJJIFFI.LJIILIIL;
        LJJIFFI.LIZ.LIZIZ().LJFF();
        boolean z = LJJIFFI.LJIILJJIL;
        String LJJIFFI3 = LJJIFFI.LJJIFFI();
        LJJIFFI.LIZ.LIZIZ().LJFF();
        long j3 = LJJIFFI.LJIILL;
        LJJIFFI.LIZ.LIZIZ().LJFF();
        boolean z2 = LJJIFFI.LJIILLIIL;
        String LJIJJ = LJJIFFI.LJIJJ();
        LJJIFFI.LIZ.LIZIZ().LJFF();
        Boolean bool = LJJIFFI.LJIJ;
        LJJIFFI.LIZ.LIZIZ().LJFF();
        long j4 = LJJIFFI.LJIJI;
        LJJIFFI.LIZ.LIZIZ().LJFF();
        return new zzq(str, LJJII, LJJI, LJIJI, str2, j, j2, null, z, false, LJJIFFI3, j3, 0L, 0, z2, false, LJIJJ, bool, j4, LJJIFFI.LJIJJ, LJJIJL(str).LJ(), "", null);
    }

    public final Boolean LJJIFFI(C68252QqW c68252QqW) {
        try {
            if (c68252QqW.LJIJI() != -2147483648L) {
                if (c68252QqW.LJIJI() == QCX.LIZ(this.LJIIJJI.LIZ).LIZIZ(0, c68252QqW.LJIL()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = QCX.LIZ(this.LJIIJJI.LIZ).LIZIZ(0, c68252QqW.LJIL()).versionName;
                String LJJI = c68252QqW.LJJI();
                if (LJJI != null && LJJI.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final C68252QqW LJJIJIIJIL(zzq zzqVar) {
        String str;
        boolean z;
        LIZIZ().LJFF();
        LJI();
        QH7.LJIIIIZZ(zzqVar);
        QH7.LJI(zzqVar.zza);
        C68580Qvo.LIZIZ();
        if (LJJIJIL().LJIILJJIL(zzqVar.zza, C68555QvP.LJLJJL) && !zzqVar.zzw.isEmpty()) {
            ((HashMap) this.LJJIII).put(zzqVar.zza, new C68285Qr3(this, zzqVar.zzw));
        }
        C68242QqM c68242QqM = this.LIZJ;
        LJJIJIIJI(c68242QqM);
        C68252QqW LJJIFFI = c68242QqM.LJJIFFI(zzqVar.zza);
        C68090Qnu LIZJ = LJJIJL(zzqVar.zza).LIZJ(C68090Qnu.LIZIZ(zzqVar.zzv));
        EnumC68125QoT enumC68125QoT = EnumC68125QoT.AD_STORAGE;
        if (LIZJ.LJFF(enumC68125QoT)) {
            str = this.LJIIIIZZ.LJIIL(zzqVar.zza);
        } else {
            str = "";
        }
        if (LJJIFFI == null) {
            LJJIFFI = new C68252QqW(this.LJIIJJI, zzqVar.zza);
            if (LIZJ.LJFF(EnumC68125QoT.ANALYTICS_STORAGE)) {
                LJJIFFI.LIZJ(LJJJIL(LIZJ));
            }
            if (LIZJ.LJFF(enumC68125QoT)) {
                LJJIFFI.LJIIZILJ(str);
            }
        } else {
            if (LIZJ.LJFF(enumC68125QoT) && str != null) {
                LJJIFFI.LIZ.LIZIZ().LJFF();
                if (!str.equals(LJJIFFI.LJ)) {
                    LJJIFFI.LJIIZILJ(str);
                    C68575Qvj.LIZIZ();
                    C68034Qn0 LJJIJIL = LJJIJIL();
                    C68067QnX c68067QnX = C68555QvP.LJJLIIIJJIZ;
                    if (LJJIJIL.LJIILJJIL(null, c68067QnX) && LJJIJIL().LJIILJJIL(null, C68555QvP.LJJLIL)) {
                        if (!"00000000-0000-0000-0000-000000000000".equals(this.LJIIIIZZ.LJIIJJI(zzqVar.zza, LIZJ).first)) {
                            LJJIFFI.LIZJ(LJJJIL(LIZJ));
                        }
                    } else {
                        LJJIFFI.LIZJ(LJJJIL(LIZJ));
                    }
                    C68575Qvj.LIZIZ();
                    if (LJJIJIL().LJIILJJIL(null, c68067QnX) && !"00000000-0000-0000-0000-000000000000".equals(this.LJIIIIZZ.LJIIJJI(zzqVar.zza, LIZJ).first)) {
                        C68242QqM c68242QqM2 = this.LIZJ;
                        LJJIJIIJI(c68242QqM2);
                        if (c68242QqM2.LJJIIZI(zzqVar.zza, "_id") != null) {
                            C68242QqM c68242QqM3 = this.LIZJ;
                            LJJIJIIJI(c68242QqM3);
                            if (c68242QqM3.LJJIIZI(zzqVar.zza, "_lair") == null) {
                                LIZLLL().getClass();
                                C68135Qod c68135Qod = new C68135Qod(System.currentTimeMillis(), 1L, zzqVar.zza, "auto", "_lair");
                                C68242QqM c68242QqM4 = this.LIZJ;
                                LJJIJIIJI(c68242QqM4);
                                c68242QqM4.LJIILLIIL(c68135Qod);
                            }
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(LJJIFFI.LJJ()) && LIZJ.LJFF(EnumC68125QoT.ANALYTICS_STORAGE)) {
                LJJIFFI.LIZJ(LJJJIL(LIZJ));
            }
        }
        LJJIFFI.LJIIJ(zzqVar.zzb);
        LJJIFFI.LIZ(zzqVar.zzq);
        if (!TextUtils.isEmpty(zzqVar.zzk)) {
            LJJIFFI.LJIIIZ(zzqVar.zzk);
        }
        long j = zzqVar.zze;
        if (j != 0) {
            LJJIFFI.LJIIJJI(j);
        }
        if (!TextUtils.isEmpty(zzqVar.zzc)) {
            LJJIFFI.LJ(zzqVar.zzc);
        }
        LJJIFFI.LJFF(zzqVar.zzj);
        String str2 = zzqVar.zzd;
        if (str2 != null) {
            LJJIFFI.LIZLLL(str2);
        }
        LJJIFFI.LJII(zzqVar.zzf);
        LJJIFFI.LJIILLIIL(zzqVar.zzh);
        if (!TextUtils.isEmpty(zzqVar.zzg)) {
            LJJIFFI.LJIIL(zzqVar.zzg);
        }
        if (!LJJIJIL().LJIILJJIL(null, C68555QvP.LJJLIIIIJ)) {
            LJJIFFI.LIZIZ(zzqVar.zzl);
        }
        boolean z2 = zzqVar.zzo;
        LJJIFFI.LIZ.LIZIZ().LJFF();
        boolean z3 = LJJIFFI.LJJIIJZLJL;
        if (LJJIFFI.LJIILLIIL != z2) {
            z = true;
        } else {
            z = false;
        }
        LJJIFFI.LJJIIJZLJL = z3 | z;
        LJJIFFI.LJIILLIIL = z2;
        Boolean bool = zzqVar.zzr;
        LJJIFFI.LIZ.LIZIZ().LJFF();
        LJJIFFI.LJJIIJZLJL |= !u.LJJJIL(LJJIFFI.LJIJ, bool);
        LJJIFFI.LJIJ = bool;
        LJJIFFI.LJIIIIZZ(zzqVar.zzs);
        C68572Qvg.LIZ();
        if (LJJIJIL().LJIILJJIL(null, C68555QvP.LJLJI)) {
            String str3 = zzqVar.zzx;
            LJJIFFI.LIZ.LIZIZ().LJFF();
            LJJIFFI.LJJIIJZLJL |= !u.LJJJIL(LJJIFFI.LJIJJLI, str3);
            LJJIFFI.LJIJJLI = str3;
        }
        C68328Qrk c68328Qrk = C68328Qrk.LJLILLLLZI;
        ((InterfaceC68325Qrh) c68328Qrk.LJLIL.zza()).zza();
        if (LJJIJIL().LJIILJJIL(null, C68555QvP.LJJZZI)) {
            LJJIFFI.LJIJ(zzqVar.zzt);
        } else {
            ((InterfaceC68325Qrh) c68328Qrk.LJLIL.zza()).zza();
            if (LJJIJIL().LJIILJJIL(null, C68555QvP.LJJZ)) {
                LJJIFFI.LJIJ(null);
            }
        }
        LJJIFFI.LIZ.LIZIZ().LJFF();
        if (LJJIFFI.LJJIIJZLJL) {
            C68242QqM c68242QqM5 = this.LIZJ;
            LJJIJIIJI(c68242QqM5);
            c68242QqM5.LJIIJJI(LJJIFFI);
        }
        return LJJIFFI;
    }

    public final C68090Qnu LJJIJL(String str) {
        String str2;
        LIZIZ().LJFF();
        LJI();
        C68090Qnu c68090Qnu = (C68090Qnu) ((HashMap) this.LJJII).get(str);
        if (c68090Qnu == null) {
            C68242QqM c68242QqM = this.LIZJ;
            LJJIJIIJI(c68242QqM);
            QH7.LJIIIIZZ(str);
            c68242QqM.LJFF();
            c68242QqM.LJI();
            Cursor cursor = null;
            try {
                try {
                    cursor = c68242QqM.LJJI().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                    if (cursor.moveToFirst()) {
                        str2 = cursor.getString(0);
                        cursor.close();
                    } else {
                        cursor.close();
                        str2 = "G1";
                    }
                    C68090Qnu LIZIZ = C68090Qnu.LIZIZ(str2);
                    LJIIZILJ(str, LIZIZ);
                    return LIZIZ;
                } catch (SQLiteException e) {
                    c68242QqM.LIZ.LIZJ().LJFF.LIZJ("select consent_state from consent_settings where app_id=? limit 1;", e, "Database error");
                    throw e;
                }
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        }
        return c68090Qnu;
    }

    public final String LJJJIL(C68090Qnu c68090Qnu) {
        if (c68090Qnu.LJFF(EnumC68125QoT.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            LJJJI().LJIILJJIL().nextBytes(bArr);
            return C16880lQ.LLLZI(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
        }
        return null;
    }

    public static final void LJJ(C68264Qqi c68264Qqi, String str) {
        List unmodifiableList = Collections.unmodifiableList(((C68260Qqe) c68264Qqi.LJLILLLLZI).zzf);
        for (int i = 0; i < unmodifiableList.size(); i++) {
            if (str.equals(((C68257Qqb) ListProtector.get(unmodifiableList, i)).zzf)) {
                c68264Qqi.LJIILJJIL(i);
                return;
            }
        }
    }

    public final void LJIIIIZZ(zzaw zzawVar, zzq zzqVar) {
        zzaw zzawVar2;
        List<zzac> LJJIJIL;
        List<zzac> LJJIJIL2;
        List<zzac> LJJIJIL3;
        String str;
        zzaw zzawVar3 = zzawVar;
        QH7.LJIIIIZZ(zzqVar);
        QH7.LJI(zzqVar.zza);
        LIZIZ().LJFF();
        LJI();
        String str2 = zzqVar.zza;
        long j = zzawVar3.zzd;
        ((InterfaceC68146Qoo) C68177QpJ.LJLILLLLZI.LJLIL.zza()).zza();
        C68132Qoa c68132Qoa = null;
        if (LJJIJIL().LJIILJJIL(null, C68555QvP.LJJLJ)) {
            C68111QoF LIZIZ = C68111QoF.LIZIZ(zzawVar3);
            LIZIZ().LJFF();
            if (this.LJJIIJ != null && (str = this.LJJIIJZLJL) != null && str.equals(str2)) {
                c68132Qoa = this.LJJIIJ;
            }
            C68083Qnn.LJIJ(c68132Qoa, LIZIZ.LIZLLL, false);
            zzawVar3 = LIZIZ.LIZ();
        }
        LJJIJIIJI(this.LJI);
        if (TextUtils.isEmpty(zzqVar.zzb) && TextUtils.isEmpty(zzqVar.zzq)) {
            return;
        }
        if (!zzqVar.zzh) {
            LJJIJIIJIL(zzqVar);
            return;
        }
        List list = zzqVar.zzt;
        if (list != null) {
            if (list.contains(zzawVar3.zza)) {
                Bundle LJJJJZI = zzawVar3.zzb.LJJJJZI();
                LJJJJZI.putLong("ga_safelisted", 1L);
                zzawVar2 = new zzaw(zzawVar3.zza, new zzau(LJJJJZI), zzawVar3.zzc, zzawVar3.zzd);
            } else {
                LIZJ().LJIIL.LIZLLL(str2, zzawVar3.zza, zzawVar3.zzc, "Dropping non-safelisted event. appId, event name, origin");
                return;
            }
        } else {
            zzawVar2 = zzawVar3;
        }
        C68242QqM c68242QqM = this.LIZJ;
        LJJIJIIJI(c68242QqM);
        c68242QqM.LJJIL();
        try {
            C68242QqM c68242QqM2 = this.LIZJ;
            LJJIJIIJI(c68242QqM2);
            QH7.LJI(str2);
            c68242QqM2.LJFF();
            c68242QqM2.LJI();
            if (j >= 0) {
                LJJIJIL = c68242QqM2.LJJIJIL("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
            } else {
                c68242QqM2.LIZ.LIZJ().LJIIIIZZ.LIZJ(C67280Qaq.LJIIIZ(str2), Long.valueOf(j), "Invalid time querying timed out conditional properties");
                LJJIJIL = Collections.emptyList();
            }
            for (zzac zzacVar : LJJIJIL) {
                if (zzacVar != null) {
                    LIZJ().LJIILIIL.LIZLLL(zzacVar.zza, this.LJIIJJI.LJIIL.LJFF(zzacVar.zzc.zzb), zzacVar.zzc.LJJJJL(), "User property timed out");
                    zzaw zzawVar4 = zzacVar.zzg;
                    if (zzawVar4 != null) {
                        LJIJJ(new zzaw(zzawVar4, j), zzqVar);
                    }
                    C68242QqM c68242QqM3 = this.LIZJ;
                    LJJIJIIJI(c68242QqM3);
                    c68242QqM3.LJIJJ(str2, zzacVar.zzc.zzb);
                }
            }
            C68242QqM c68242QqM4 = this.LIZJ;
            LJJIJIIJI(c68242QqM4);
            QH7.LJI(str2);
            c68242QqM4.LJFF();
            c68242QqM4.LJI();
            if (j >= 0) {
                LJJIJIL2 = c68242QqM4.LJJIJIL("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
            } else {
                c68242QqM4.LIZ.LIZJ().LJIIIIZZ.LIZJ(C67280Qaq.LJIIIZ(str2), Long.valueOf(j), "Invalid time querying expired conditional properties");
                LJJIJIL2 = Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(LJJIJIL2.size());
            for (zzac zzacVar2 : LJJIJIL2) {
                if (zzacVar2 != null) {
                    LIZJ().LJIILIIL.LIZLLL(zzacVar2.zza, this.LJIIJJI.LJIIL.LJFF(zzacVar2.zzc.zzb), zzacVar2.zzc.LJJJJL(), "User property expired");
                    C68242QqM c68242QqM5 = this.LIZJ;
                    LJJIJIIJI(c68242QqM5);
                    c68242QqM5.LJIIIZ(str2, zzacVar2.zzc.zzb);
                    zzaw zzawVar5 = zzacVar2.zzk;
                    if (zzawVar5 != null) {
                        arrayList.add(zzawVar5);
                    }
                    C68242QqM c68242QqM6 = this.LIZJ;
                    LJJIJIIJI(c68242QqM6);
                    c68242QqM6.LJIJJ(str2, zzacVar2.zzc.zzb);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LJIJJ(new zzaw((zzaw) it.next(), j), zzqVar);
            }
            C68242QqM c68242QqM7 = this.LIZJ;
            LJJIJIIJI(c68242QqM7);
            String str3 = zzawVar2.zza;
            QH7.LJI(str2);
            QH7.LJI(str3);
            c68242QqM7.LJFF();
            c68242QqM7.LJI();
            if (j >= 0) {
                LJJIJIL3 = c68242QqM7.LJJIJIL("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
            } else {
                c68242QqM7.LIZ.LIZJ().LJIIIIZZ.LIZLLL(C67280Qaq.LJIIIZ(str2), c68242QqM7.LIZ.LJIIL.LIZLLL(str3), Long.valueOf(j), "Invalid time querying triggered conditional properties");
                LJJIJIL3 = Collections.emptyList();
            }
            ArrayList arrayList2 = new ArrayList(LJJIJIL3.size());
            for (zzac zzacVar3 : LJJIJIL3) {
                if (zzacVar3 != null) {
                    zzlo zzloVar = zzacVar3.zzc;
                    String str4 = zzacVar3.zza;
                    QH7.LJIIIIZZ(str4);
                    String str5 = zzacVar3.zzb;
                    String str6 = zzloVar.zzb;
                    Object LJJJJL = zzloVar.LJJJJL();
                    QH7.LJIIIIZZ(LJJJJL);
                    C68135Qod c68135Qod = new C68135Qod(j, LJJJJL, str4, str5, str6);
                    C68242QqM c68242QqM8 = this.LIZJ;
                    LJJIJIIJI(c68242QqM8);
                    if (c68242QqM8.LJIILLIIL(c68135Qod)) {
                        LIZJ().LJIILIIL.LIZLLL(zzacVar3.zza, this.LJIIJJI.LJIIL.LJFF(c68135Qod.LIZJ), c68135Qod.LJ, "User property triggered");
                    } else {
                        LIZJ().LJFF.LIZLLL(C67280Qaq.LJIIIZ(zzacVar3.zza), this.LJIIJJI.LJIIL.LJFF(c68135Qod.LIZJ), c68135Qod.LJ, "Too many active user properties, ignoring");
                    }
                    zzaw zzawVar6 = zzacVar3.zzi;
                    if (zzawVar6 != null) {
                        arrayList2.add(zzawVar6);
                    }
                    zzacVar3.zzc = new zzlo(c68135Qod);
                    zzacVar3.zze = true;
                    C68242QqM c68242QqM9 = this.LIZJ;
                    LJJIJIIJI(c68242QqM9);
                    c68242QqM9.LJIILL(zzacVar3);
                }
            }
            LJIJJ(zzawVar2, zzqVar);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                LJIJJ(new zzaw((zzaw) it2.next(), j), zzqVar);
            }
            C68242QqM c68242QqM10 = this.LIZJ;
            LJJIJIIJI(c68242QqM10);
            c68242QqM10.LJIIJ();
        } finally {
            C68242QqM c68242QqM11 = this.LIZJ;
            LJJIJIIJI(c68242QqM11);
            c68242QqM11.LJJIZ();
        }
    }

    public final void LJIIIZ(zzaw zzawVar, String str) {
        C68242QqM c68242QqM = this.LIZJ;
        LJJIJIIJI(c68242QqM);
        C68252QqW LJJIFFI = c68242QqM.LJJIFFI(str);
        if (LJJIFFI == null || TextUtils.isEmpty(LJJIFFI.LJJI())) {
            LIZJ().LJIIL.LIZIZ(str, "No app data available; dropping event");
            return;
        }
        Boolean LJJIFFI2 = LJJIFFI(LJJIFFI);
        if (LJJIFFI2 == null) {
            if (!"_ui".equals(zzawVar.zza)) {
                LIZJ().LJIIIIZZ.LIZIZ(C67280Qaq.LJIIIZ(str), "Could not find package. appId");
            }
        } else if (!LJJIFFI2.booleanValue()) {
            LIZJ().LJFF.LIZIZ(C67280Qaq.LJIIIZ(str), "App version does not match; dropping event. appId");
            return;
        }
        String LJJII = LJJIFFI.LJJII();
        String LJJI = LJJIFFI.LJJI();
        long LJIJI = LJJIFFI.LJIJI();
        LJJIFFI.LIZ.LIZIZ().LJFF();
        String str2 = LJJIFFI.LJIIJJI;
        LJJIFFI.LIZ.LIZIZ().LJFF();
        long j = LJJIFFI.LJIIL;
        LJJIFFI.LIZ.LIZIZ().LJFF();
        long j2 = LJJIFFI.LJIILIIL;
        LJJIFFI.LIZ.LIZIZ().LJFF();
        boolean z = LJJIFFI.LJIILJJIL;
        String LJJIFFI3 = LJJIFFI.LJJIFFI();
        LJJIFFI.LIZ.LIZIZ().LJFF();
        long j3 = LJJIFFI.LJIILL;
        LJJIFFI.LIZ.LIZIZ().LJFF();
        boolean z2 = LJJIFFI.LJIILLIIL;
        String LJIJJ = LJJIFFI.LJIJJ();
        LJJIFFI.LIZ.LIZIZ().LJFF();
        Boolean bool = LJJIFFI.LJIJ;
        LJJIFFI.LIZ.LIZIZ().LJFF();
        long j4 = LJJIFFI.LJIJI;
        LJJIFFI.LIZ.LIZIZ().LJFF();
        LJIIJ(zzawVar, new zzq(str, LJJII, LJJI, LJIJI, str2, j, j2, null, z, false, LJJIFFI3, j3, 0L, 0, z2, false, LJIJJ, bool, j4, LJJIFFI.LJIJJ, LJJIJL(str).LJ(), "", null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c5, code lost:
    
        if (r3 == null) goto L34;
     */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0134: IF  (r3 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:63:? (LINE:33554740), block:B:60:0x0134 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.google.android.gms.measurement.internal.zzaw r12, com.google.android.gms.measurement.internal.zzq r13) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68241QqL.LJIIJ(com.google.android.gms.measurement.internal.zzaw, com.google.android.gms.measurement.internal.zzq):void");
    }

    public final void LJIILIIL(zzac zzacVar, zzq zzqVar) {
        Bundle bundle;
        QH7.LJIIIIZZ(zzacVar);
        QH7.LJI(zzacVar.zza);
        QH7.LJIIIIZZ(zzacVar.zzc);
        QH7.LJI(zzacVar.zzc.zzb);
        LIZIZ().LJFF();
        LJI();
        if (!LJJIJ(zzqVar)) {
            return;
        }
        if (zzqVar.zzh) {
            C68242QqM c68242QqM = this.LIZJ;
            LJJIJIIJI(c68242QqM);
            c68242QqM.LJJIL();
            try {
                LJJIJIIJIL(zzqVar);
                String str = zzacVar.zza;
                QH7.LJIIIIZZ(str);
                C68242QqM c68242QqM2 = this.LIZJ;
                LJJIJIIJI(c68242QqM2);
                zzac LJJII = c68242QqM2.LJJII(str, zzacVar.zzc.zzb);
                if (LJJII != null) {
                    LIZJ().LJIIL.LIZJ(zzacVar.zza, this.LJIIJJI.LJIIL.LJFF(zzacVar.zzc.zzb), "Removing conditional user property");
                    C68242QqM c68242QqM3 = this.LIZJ;
                    LJJIJIIJI(c68242QqM3);
                    c68242QqM3.LJIJJ(str, zzacVar.zzc.zzb);
                    if (LJJII.zze) {
                        C68242QqM c68242QqM4 = this.LIZJ;
                        LJJIJIIJI(c68242QqM4);
                        c68242QqM4.LJIIIZ(str, zzacVar.zzc.zzb);
                    }
                    zzaw zzawVar = zzacVar.zzk;
                    if (zzawVar != null) {
                        zzau zzauVar = zzawVar.zzb;
                        if (zzauVar != null) {
                            bundle = zzauVar.LJJJJZI();
                        } else {
                            bundle = null;
                        }
                        C68083Qnn LJJJI = LJJJI();
                        zzaw zzawVar2 = zzacVar.zzk;
                        QH7.LJIIIIZZ(zzawVar2);
                        zzaw LJJLIIIJL = LJJJI.LJJLIIIJL(str, zzawVar2.zza, bundle, LJJII.zzb, zzacVar.zzk.zzd, true);
                        QH7.LJIIIIZZ(LJJLIIIJL);
                        LJIJJ(LJJLIIIJL, zzqVar);
                    }
                } else {
                    LIZJ().LJIIIIZZ.LIZJ(C67280Qaq.LJIIIZ(zzacVar.zza), this.LJIIJJI.LJIIL.LJFF(zzacVar.zzc.zzb), "Conditional user property doesn't exist");
                }
                C68242QqM c68242QqM5 = this.LIZJ;
                LJJIJIIJI(c68242QqM5);
                c68242QqM5.LJIIJ();
                return;
            } finally {
                C68242QqM c68242QqM6 = this.LIZJ;
                LJJIJIIJI(c68242QqM6);
                c68242QqM6.LJJIZ();
            }
        }
        LJJIJIIJIL(zzqVar);
    }

    public final void LJIILJJIL(zzlo zzloVar, zzq zzqVar) {
        long j;
        LIZIZ().LJFF();
        LJI();
        if (!LJJIJ(zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            LJJIJIIJIL(zzqVar);
            return;
        }
        if ("_npa".equals(zzloVar.zzb) && zzqVar.zzr != null) {
            LIZJ().LJIIL.LIZ("Falling back to manifest metadata value for ad personalization");
            LIZLLL().getClass();
            long currentTimeMillis = System.currentTimeMillis();
            if (true != zzqVar.zzr.booleanValue()) {
                j = 0;
            } else {
                j = 1;
            }
            LJIJ(new zzlo(currentTimeMillis, Long.valueOf(j), "_npa", "auto"), zzqVar);
            return;
        }
        LIZJ().LJIIL.LIZIZ(this.LJIIJJI.LJIIL.LJFF(zzloVar.zzb), "Removing user property");
        C68242QqM c68242QqM = this.LIZJ;
        LJJIJIIJI(c68242QqM);
        c68242QqM.LJJIL();
        try {
            LJJIJIIJIL(zzqVar);
            C68575Qvj.LIZIZ();
            if (this.LJIIJJI.LJI.LJIILJJIL(null, C68555QvP.LJJLIIIJJIZ) && this.LJIIJJI.LJI.LJIILJJIL(null, C68555QvP.LJJLIIIJLJLI) && "_id".equals(zzloVar.zzb)) {
                C68242QqM c68242QqM2 = this.LIZJ;
                LJJIJIIJI(c68242QqM2);
                String str = zzqVar.zza;
                QH7.LJIIIIZZ(str);
                c68242QqM2.LJIIIZ(str, "_lair");
            }
            C68242QqM c68242QqM3 = this.LIZJ;
            LJJIJIIJI(c68242QqM3);
            String str2 = zzqVar.zza;
            QH7.LJIIIIZZ(str2);
            c68242QqM3.LJIIIZ(str2, zzloVar.zzb);
            C68242QqM c68242QqM4 = this.LIZJ;
            LJJIJIIJI(c68242QqM4);
            c68242QqM4.LJIIJ();
            LIZJ().LJIIL.LIZIZ(this.LJIIJJI.LJIIL.LJFF(zzloVar.zzb), "User property removed");
        } finally {
            C68242QqM c68242QqM5 = this.LIZJ;
            LJJIJIIJI(c68242QqM5);
            c68242QqM5.LJJIZ();
        }
    }

    public final void LJIILLIIL(zzac zzacVar, zzq zzqVar) {
        QH7.LJIIIIZZ(zzacVar);
        QH7.LJI(zzacVar.zza);
        QH7.LJIIIIZZ(zzacVar.zzb);
        QH7.LJIIIIZZ(zzacVar.zzc);
        QH7.LJI(zzacVar.zzc.zzb);
        LIZIZ().LJFF();
        LJI();
        if (!LJJIJ(zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            LJJIJIIJIL(zzqVar);
            return;
        }
        zzac zzacVar2 = new zzac(zzacVar);
        boolean z = false;
        zzacVar2.zze = false;
        C68242QqM c68242QqM = this.LIZJ;
        LJJIJIIJI(c68242QqM);
        c68242QqM.LJJIL();
        try {
            C68242QqM c68242QqM2 = this.LIZJ;
            LJJIJIIJI(c68242QqM2);
            String str = zzacVar2.zza;
            QH7.LJIIIIZZ(str);
            zzac LJJII = c68242QqM2.LJJII(str, zzacVar2.zzc.zzb);
            if (LJJII != null && !LJJII.zzb.equals(zzacVar2.zzb)) {
                LIZJ().LJIIIIZZ.LIZLLL(this.LJIIJJI.LJIIL.LJFF(zzacVar2.zzc.zzb), zzacVar2.zzb, LJJII.zzb, "Updating a conditional user property with different origin. name, origin, origin (from DB)");
            }
            if (LJJII == null || !LJJII.zze) {
                if (TextUtils.isEmpty(zzacVar2.zzf)) {
                    zzlo zzloVar = zzacVar2.zzc;
                    zzacVar2.zzc = new zzlo(zzacVar2.zzd, zzloVar.LJJJJL(), zzloVar.zzb, zzacVar2.zzc.zzf);
                    zzacVar2.zze = true;
                    z = true;
                }
            } else {
                zzacVar2.zzb = LJJII.zzb;
                zzacVar2.zzd = LJJII.zzd;
                zzacVar2.zzh = LJJII.zzh;
                zzacVar2.zzf = LJJII.zzf;
                zzacVar2.zzi = LJJII.zzi;
                zzacVar2.zze = true;
                zzlo zzloVar2 = zzacVar2.zzc;
                zzacVar2.zzc = new zzlo(LJJII.zzc.zzc, zzloVar2.LJJJJL(), zzloVar2.zzb, LJJII.zzc.zzf);
            }
            if (zzacVar2.zze) {
                zzlo zzloVar3 = zzacVar2.zzc;
                String str2 = zzacVar2.zza;
                QH7.LJIIIIZZ(str2);
                String str3 = zzacVar2.zzb;
                String str4 = zzloVar3.zzb;
                long j = zzloVar3.zzc;
                Object LJJJJL = zzloVar3.LJJJJL();
                QH7.LJIIIIZZ(LJJJJL);
                C68135Qod c68135Qod = new C68135Qod(j, LJJJJL, str2, str3, str4);
                C68242QqM c68242QqM3 = this.LIZJ;
                LJJIJIIJI(c68242QqM3);
                if (c68242QqM3.LJIILLIIL(c68135Qod)) {
                    LIZJ().LJIIL.LIZLLL(zzacVar2.zza, this.LJIIJJI.LJIIL.LJFF(c68135Qod.LIZJ), c68135Qod.LJ, "User property updated immediately");
                } else {
                    LIZJ().LJFF.LIZLLL(C67280Qaq.LJIIIZ(zzacVar2.zza), this.LJIIJJI.LJIIL.LJFF(c68135Qod.LIZJ), c68135Qod.LJ, "(2)Too many active user properties, ignoring");
                }
                if (z && zzacVar2.zzi != null) {
                    LJIJJ(new zzaw(zzacVar2.zzi, zzacVar2.zzd), zzqVar);
                }
            }
            C68242QqM c68242QqM4 = this.LIZJ;
            LJJIJIIJI(c68242QqM4);
            if (c68242QqM4.LJIILL(zzacVar2)) {
                LIZJ().LJIIL.LIZLLL(zzacVar2.zza, this.LJIIJJI.LJIIL.LJFF(zzacVar2.zzc.zzb), zzacVar2.zzc.LJJJJL(), "Conditional property added");
            } else {
                LIZJ().LJFF.LIZLLL(C67280Qaq.LJIIIZ(zzacVar2.zza), this.LJIIJJI.LJIIL.LJFF(zzacVar2.zzc.zzb), zzacVar2.zzc.LJJJJL(), "Too many conditional properties, ignoring");
            }
            C68242QqM c68242QqM5 = this.LIZJ;
            LJJIJIIJI(c68242QqM5);
            c68242QqM5.LJIIJ();
        } finally {
            C68242QqM c68242QqM6 = this.LIZJ;
            LJJIJIIJI(c68242QqM6);
            c68242QqM6.LJJIZ();
        }
    }

    public final void LJIIZILJ(String str, C68090Qnu c68090Qnu) {
        LIZIZ().LJFF();
        LJI();
        ((HashMap) this.LJJII).put(str, c68090Qnu);
        C68242QqM c68242QqM = this.LIZJ;
        LJJIJIIJI(c68242QqM);
        QH7.LJIIIIZZ(str);
        c68242QqM.LJFF();
        c68242QqM.LJI();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", c68090Qnu.LJ());
        try {
            if (c68242QqM.LJJI().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                c68242QqM.LIZ.LIZJ().LJFF.LIZIZ(C67280Qaq.LJIIIZ(str), "Failed to insert/update consent setting (got -1). appId");
            }
        } catch (SQLiteException e) {
            c68242QqM.LIZ.LIZJ().LJFF.LIZJ(C67280Qaq.LJIIIZ(str), e, "Error storing consent setting. appId, error");
        }
    }

    public final void LJIJ(zzlo zzloVar, zzq zzqVar) {
        long j;
        int i;
        int i2;
        LIZIZ().LJFF();
        LJI();
        if (!LJJIJ(zzqVar)) {
            return;
        }
        if (!zzqVar.zzh) {
            LJJIJIIJIL(zzqVar);
            return;
        }
        int LJJL = LJJJI().LJJL(zzloVar.zzb);
        if (LJJL != 0) {
            C68083Qnn LJJJI = LJJJI();
            String str = zzloVar.zzb;
            LJJIJIL();
            LJJJI.getClass();
            String LJIIL = C68083Qnn.LJIIL(24, str, true);
            String str2 = zzloVar.zzb;
            if (str2 != null) {
                i2 = str2.length();
            } else {
                i2 = 0;
            }
            C68083Qnn LJJJI2 = LJJJI();
            C68148Qoq c68148Qoq = this.LJJIIZ;
            String str3 = zzqVar.zza;
            LJJJI2.getClass();
            C68083Qnn.LJIJJLI(c68148Qoq, str3, LJJL, "_ev", LJIIL, i2);
            return;
        }
        int LJJJLIIL = LJJJI().LJJJLIIL(zzloVar.LJJJJL(), zzloVar.zzb);
        if (LJJJLIIL != 0) {
            C68083Qnn LJJJI3 = LJJJI();
            String str4 = zzloVar.zzb;
            LJJIJIL();
            LJJJI3.getClass();
            String LJIIL2 = C68083Qnn.LJIIL(24, str4, true);
            Object LJJJJL = zzloVar.LJJJJL();
            if (LJJJJL != null && ((LJJJJL instanceof String) || (LJJJJL instanceof CharSequence))) {
                i = LJJJJL.toString().length();
            } else {
                i = 0;
            }
            C68083Qnn LJJJI4 = LJJJI();
            C68148Qoq c68148Qoq2 = this.LJJIIZ;
            String str5 = zzqVar.zza;
            LJJJI4.getClass();
            C68083Qnn.LJIJJLI(c68148Qoq2, str5, LJJJLIIL, "_ev", LJIIL2, i);
            return;
        }
        Object LJIIJ = LJJJI().LJIIJ(zzloVar.LJJJJL(), zzloVar.zzb);
        if (LJIIJ == null) {
            return;
        }
        if ("_sid".equals(zzloVar.zzb)) {
            long j2 = zzloVar.zzc;
            String str6 = zzloVar.zzf;
            String str7 = zzqVar.zza;
            QH7.LJIIIIZZ(str7);
            C68242QqM c68242QqM = this.LIZJ;
            LJJIJIIJI(c68242QqM);
            C68135Qod LJJIIZI2 = c68242QqM.LJJIIZI(str7, "_sno");
            if (LJJIIZI2 != null) {
                Object obj = LJJIIZI2.LJ;
                if (obj instanceof Long) {
                    j = ((Long) obj).longValue();
                    LJIJ(new zzlo(j2, Long.valueOf(j + 1), "_sno", str6), zzqVar);
                } else {
                    LIZJ().LJIIIIZZ.LIZIZ(LJJIIZI2.LJ, "Retrieved last session number from database does not contain a valid (long) value");
                }
            }
            C68242QqM c68242QqM2 = this.LIZJ;
            LJJIJIIJI(c68242QqM2);
            C68277Qqv LJJIIJZLJL = c68242QqM2.LJJIIJZLJL(str7, "_s");
            if (LJJIIJZLJL != null) {
                j = LJJIIJZLJL.LIZJ;
                LIZJ().LJIILIIL.LIZIZ(Long.valueOf(j), "Backfill the session number. Last used session number");
            } else {
                j = 0;
            }
            LJIJ(new zzlo(j2, Long.valueOf(j + 1), "_sno", str6), zzqVar);
        }
        String str8 = zzqVar.zza;
        QH7.LJIIIIZZ(str8);
        String str9 = zzloVar.zzf;
        QH7.LJIIIIZZ(str9);
        C68135Qod c68135Qod = new C68135Qod(zzloVar.zzc, LJIIJ, str8, str9, zzloVar.zzb);
        LIZJ().LJIILIIL.LIZJ(this.LJIIJJI.LJIIL.LJFF(c68135Qod.LIZJ), LJIIJ, "Setting user property");
        C68242QqM c68242QqM3 = this.LIZJ;
        LJJIJIIJI(c68242QqM3);
        c68242QqM3.LJJIL();
        try {
            C68575Qvj.LIZIZ();
            if (this.LJIIJJI.LJI.LJIILJJIL(null, C68555QvP.LJJLIIIJJIZ) && "_id".equals(c68135Qod.LIZJ)) {
                if (!this.LJIIJJI.LJI.LJIILJJIL(null, C68555QvP.LJJLIIIJLLLLLLLZ)) {
                    C68242QqM c68242QqM4 = this.LIZJ;
                    LJJIJIIJI(c68242QqM4);
                    c68242QqM4.LJIIIZ(zzqVar.zza, "_lair");
                } else {
                    C68242QqM c68242QqM5 = this.LIZJ;
                    LJJIJIIJI(c68242QqM5);
                    C68135Qod LJJIIZI3 = c68242QqM5.LJJIIZI(zzqVar.zza, "_id");
                    if (LJJIIZI3 != null && !c68135Qod.LJ.equals(LJJIIZI3.LJ)) {
                        C68242QqM c68242QqM6 = this.LIZJ;
                        LJJIJIIJI(c68242QqM6);
                        c68242QqM6.LJIIIZ(zzqVar.zza, "_lair");
                    }
                }
            }
            LJJIJIIJIL(zzqVar);
            C68242QqM c68242QqM7 = this.LIZJ;
            LJJIJIIJI(c68242QqM7);
            boolean LJIILLIIL = c68242QqM7.LJIILLIIL(c68135Qod);
            C68242QqM c68242QqM8 = this.LIZJ;
            LJJIJIIJI(c68242QqM8);
            c68242QqM8.LJIIJ();
            if (!LJIILLIIL) {
                LIZJ().LJFF.LIZJ(this.LJIIJJI.LJIIL.LJFF(c68135Qod.LIZJ), c68135Qod.LJ, "Too many unique user properties are set. Ignoring user property");
                C68083Qnn LJJJI5 = LJJJI();
                C68148Qoq c68148Qoq3 = this.LJJIIZ;
                String str10 = zzqVar.zza;
                LJJJI5.getClass();
                C68083Qnn.LJIJJLI(c68148Qoq3, str10, 9, null, null, 0);
            }
        } finally {
            C68242QqM c68242QqM9 = this.LIZJ;
            LJJIJIIJI(c68242QqM9);
            c68242QqM9.LJJIZ();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:372|(2:374|(3:376|377|(1:379)))|380|381|382|384|385|386|377|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x027e, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x02a7, code lost:
    
        r11.LIZ.LIZJ().LJFF.LIZJ(X.C67280Qaq.LJIIIZ(r5), r12, "Error pruning currencies. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x0280, code lost:
    
        r12 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0329 A[Catch: all -> 0x0c76, TryCatch #2 {all -> 0x0c76, blocks: (B:33:0x0153, B:35:0x0165, B:37:0x0171, B:38:0x017d, B:41:0x0189, B:43:0x0193, B:47:0x019f, B:51:0x0313, B:54:0x034d, B:56:0x0383, B:58:0x0388, B:59:0x039d, B:63:0x03b0, B:65:0x03c8, B:67:0x03cf, B:68:0x03e4, B:73:0x0410, B:77:0x0432, B:78:0x0447, B:81:0x0458, B:87:0x0490, B:88:0x04a6, B:90:0x04b0, B:92:0x04bd, B:94:0x04c3, B:95:0x04cc, B:97:0x04da, B:99:0x050a, B:100:0x0530, B:102:0x0558, B:105:0x0581, B:108:0x05cd, B:109:0x0632, B:111:0x065c, B:112:0x0662, B:114:0x066d, B:115:0x0673, B:117:0x0682, B:119:0x0688, B:120:0x068e, B:121:0x0695, B:123:0x069d, B:125:0x06a3, B:126:0x06a9, B:127:0x06b0, B:129:0x06b8, B:131:0x06be, B:132:0x06c4, B:133:0x06cb, B:135:0x06db, B:137:0x06e3, B:139:0x06e9, B:140:0x06ef, B:141:0x06f6, B:143:0x06ff, B:145:0x0704, B:146:0x070a, B:147:0x0711, B:149:0x0717, B:150:0x071d, B:152:0x072c, B:154:0x0732, B:155:0x0738, B:156:0x073f, B:158:0x075a, B:159:0x0760, B:161:0x0771, B:163:0x0779, B:165:0x077f, B:166:0x0785, B:167:0x078c, B:169:0x0794, B:171:0x0798, B:172:0x079e, B:173:0x07a5, B:175:0x07ab, B:176:0x07b1, B:178:0x07cb, B:180:0x0a53, B:181:0x0a6d, B:183:0x0a73, B:186:0x0a87, B:189:0x0a93, B:192:0x0aa0, B:203:0x0ab7, B:195:0x0ac5, B:198:0x0acd, B:207:0x07d1, B:209:0x07ec, B:211:0x07fe, B:213:0x0802, B:215:0x080a, B:216:0x0810, B:218:0x081b, B:220:0x0825, B:221:0x082b, B:222:0x0832, B:224:0x0841, B:225:0x0847, B:227:0x085d, B:228:0x0863, B:230:0x0879, B:231:0x087f, B:233:0x0894, B:234:0x089a, B:236:0x08ae, B:237:0x08b3, B:239:0x08bb, B:241:0x0c66, B:243:0x0c6a, B:244:0x0c6e, B:245:0x0c6f, B:246:0x08c5, B:248:0x08d2, B:250:0x08f2, B:251:0x08fd, B:253:0x0931, B:254:0x0936, B:255:0x0943, B:257:0x094b, B:259:0x0955, B:261:0x0960, B:262:0x0966, B:263:0x096d, B:265:0x0977, B:267:0x0982, B:268:0x0988, B:269:0x098f, B:270:0x099b, B:272:0x09a1, B:274:0x09cf, B:275:0x09d5, B:277:0x09e0, B:278:0x09e6, B:280:0x09f1, B:281:0x09f7, B:283:0x0a02, B:285:0x0a08, B:286:0x0a0e, B:288:0x0a15, B:289:0x0a1b, B:291:0x0a1f, B:293:0x0a29, B:295:0x0a2d, B:297:0x0a37, B:298:0x0a3d, B:300:0x0a45, B:303:0x0ad2, B:305:0x0b11, B:306:0x0b1c, B:307:0x0b28, B:309:0x0b2e, B:312:0x0b3e, B:314:0x0bcd, B:316:0x0bde, B:317:0x0c35, B:322:0x0bf4, B:324:0x0c22, B:327:0x0b8e, B:329:0x0bb4, B:335:0x0bf8, B:336:0x0c0b, B:339:0x0c0d, B:340:0x05ef, B:343:0x051f, B:344:0x0477, B:345:0x0329, B:346:0x0330, B:348:0x0336, B:351:0x0346, B:356:0x01ac, B:358:0x01b6, B:360:0x01cc, B:365:0x01e4, B:368:0x0220, B:370:0x0226, B:372:0x0234, B:374:0x0245, B:376:0x0282, B:377:0x02d5, B:379:0x02e0, B:380:0x024b, B:382:0x0266, B:385:0x0276, B:386:0x02b8, B:389:0x02a7, B:391:0x01f2, B:394:0x0216), top: B:32:0x0153, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:358:0x01b6 A[Catch: all -> 0x0c76, TryCatch #2 {all -> 0x0c76, blocks: (B:33:0x0153, B:35:0x0165, B:37:0x0171, B:38:0x017d, B:41:0x0189, B:43:0x0193, B:47:0x019f, B:51:0x0313, B:54:0x034d, B:56:0x0383, B:58:0x0388, B:59:0x039d, B:63:0x03b0, B:65:0x03c8, B:67:0x03cf, B:68:0x03e4, B:73:0x0410, B:77:0x0432, B:78:0x0447, B:81:0x0458, B:87:0x0490, B:88:0x04a6, B:90:0x04b0, B:92:0x04bd, B:94:0x04c3, B:95:0x04cc, B:97:0x04da, B:99:0x050a, B:100:0x0530, B:102:0x0558, B:105:0x0581, B:108:0x05cd, B:109:0x0632, B:111:0x065c, B:112:0x0662, B:114:0x066d, B:115:0x0673, B:117:0x0682, B:119:0x0688, B:120:0x068e, B:121:0x0695, B:123:0x069d, B:125:0x06a3, B:126:0x06a9, B:127:0x06b0, B:129:0x06b8, B:131:0x06be, B:132:0x06c4, B:133:0x06cb, B:135:0x06db, B:137:0x06e3, B:139:0x06e9, B:140:0x06ef, B:141:0x06f6, B:143:0x06ff, B:145:0x0704, B:146:0x070a, B:147:0x0711, B:149:0x0717, B:150:0x071d, B:152:0x072c, B:154:0x0732, B:155:0x0738, B:156:0x073f, B:158:0x075a, B:159:0x0760, B:161:0x0771, B:163:0x0779, B:165:0x077f, B:166:0x0785, B:167:0x078c, B:169:0x0794, B:171:0x0798, B:172:0x079e, B:173:0x07a5, B:175:0x07ab, B:176:0x07b1, B:178:0x07cb, B:180:0x0a53, B:181:0x0a6d, B:183:0x0a73, B:186:0x0a87, B:189:0x0a93, B:192:0x0aa0, B:203:0x0ab7, B:195:0x0ac5, B:198:0x0acd, B:207:0x07d1, B:209:0x07ec, B:211:0x07fe, B:213:0x0802, B:215:0x080a, B:216:0x0810, B:218:0x081b, B:220:0x0825, B:221:0x082b, B:222:0x0832, B:224:0x0841, B:225:0x0847, B:227:0x085d, B:228:0x0863, B:230:0x0879, B:231:0x087f, B:233:0x0894, B:234:0x089a, B:236:0x08ae, B:237:0x08b3, B:239:0x08bb, B:241:0x0c66, B:243:0x0c6a, B:244:0x0c6e, B:245:0x0c6f, B:246:0x08c5, B:248:0x08d2, B:250:0x08f2, B:251:0x08fd, B:253:0x0931, B:254:0x0936, B:255:0x0943, B:257:0x094b, B:259:0x0955, B:261:0x0960, B:262:0x0966, B:263:0x096d, B:265:0x0977, B:267:0x0982, B:268:0x0988, B:269:0x098f, B:270:0x099b, B:272:0x09a1, B:274:0x09cf, B:275:0x09d5, B:277:0x09e0, B:278:0x09e6, B:280:0x09f1, B:281:0x09f7, B:283:0x0a02, B:285:0x0a08, B:286:0x0a0e, B:288:0x0a15, B:289:0x0a1b, B:291:0x0a1f, B:293:0x0a29, B:295:0x0a2d, B:297:0x0a37, B:298:0x0a3d, B:300:0x0a45, B:303:0x0ad2, B:305:0x0b11, B:306:0x0b1c, B:307:0x0b28, B:309:0x0b2e, B:312:0x0b3e, B:314:0x0bcd, B:316:0x0bde, B:317:0x0c35, B:322:0x0bf4, B:324:0x0c22, B:327:0x0b8e, B:329:0x0bb4, B:335:0x0bf8, B:336:0x0c0b, B:339:0x0c0d, B:340:0x05ef, B:343:0x051f, B:344:0x0477, B:345:0x0329, B:346:0x0330, B:348:0x0336, B:351:0x0346, B:356:0x01ac, B:358:0x01b6, B:360:0x01cc, B:365:0x01e4, B:368:0x0220, B:370:0x0226, B:372:0x0234, B:374:0x0245, B:376:0x0282, B:377:0x02d5, B:379:0x02e0, B:380:0x024b, B:382:0x0266, B:385:0x0276, B:386:0x02b8, B:389:0x02a7, B:391:0x01f2, B:394:0x0216), top: B:32:0x0153, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0226 A[Catch: all -> 0x0c76, TryCatch #2 {all -> 0x0c76, blocks: (B:33:0x0153, B:35:0x0165, B:37:0x0171, B:38:0x017d, B:41:0x0189, B:43:0x0193, B:47:0x019f, B:51:0x0313, B:54:0x034d, B:56:0x0383, B:58:0x0388, B:59:0x039d, B:63:0x03b0, B:65:0x03c8, B:67:0x03cf, B:68:0x03e4, B:73:0x0410, B:77:0x0432, B:78:0x0447, B:81:0x0458, B:87:0x0490, B:88:0x04a6, B:90:0x04b0, B:92:0x04bd, B:94:0x04c3, B:95:0x04cc, B:97:0x04da, B:99:0x050a, B:100:0x0530, B:102:0x0558, B:105:0x0581, B:108:0x05cd, B:109:0x0632, B:111:0x065c, B:112:0x0662, B:114:0x066d, B:115:0x0673, B:117:0x0682, B:119:0x0688, B:120:0x068e, B:121:0x0695, B:123:0x069d, B:125:0x06a3, B:126:0x06a9, B:127:0x06b0, B:129:0x06b8, B:131:0x06be, B:132:0x06c4, B:133:0x06cb, B:135:0x06db, B:137:0x06e3, B:139:0x06e9, B:140:0x06ef, B:141:0x06f6, B:143:0x06ff, B:145:0x0704, B:146:0x070a, B:147:0x0711, B:149:0x0717, B:150:0x071d, B:152:0x072c, B:154:0x0732, B:155:0x0738, B:156:0x073f, B:158:0x075a, B:159:0x0760, B:161:0x0771, B:163:0x0779, B:165:0x077f, B:166:0x0785, B:167:0x078c, B:169:0x0794, B:171:0x0798, B:172:0x079e, B:173:0x07a5, B:175:0x07ab, B:176:0x07b1, B:178:0x07cb, B:180:0x0a53, B:181:0x0a6d, B:183:0x0a73, B:186:0x0a87, B:189:0x0a93, B:192:0x0aa0, B:203:0x0ab7, B:195:0x0ac5, B:198:0x0acd, B:207:0x07d1, B:209:0x07ec, B:211:0x07fe, B:213:0x0802, B:215:0x080a, B:216:0x0810, B:218:0x081b, B:220:0x0825, B:221:0x082b, B:222:0x0832, B:224:0x0841, B:225:0x0847, B:227:0x085d, B:228:0x0863, B:230:0x0879, B:231:0x087f, B:233:0x0894, B:234:0x089a, B:236:0x08ae, B:237:0x08b3, B:239:0x08bb, B:241:0x0c66, B:243:0x0c6a, B:244:0x0c6e, B:245:0x0c6f, B:246:0x08c5, B:248:0x08d2, B:250:0x08f2, B:251:0x08fd, B:253:0x0931, B:254:0x0936, B:255:0x0943, B:257:0x094b, B:259:0x0955, B:261:0x0960, B:262:0x0966, B:263:0x096d, B:265:0x0977, B:267:0x0982, B:268:0x0988, B:269:0x098f, B:270:0x099b, B:272:0x09a1, B:274:0x09cf, B:275:0x09d5, B:277:0x09e0, B:278:0x09e6, B:280:0x09f1, B:281:0x09f7, B:283:0x0a02, B:285:0x0a08, B:286:0x0a0e, B:288:0x0a15, B:289:0x0a1b, B:291:0x0a1f, B:293:0x0a29, B:295:0x0a2d, B:297:0x0a37, B:298:0x0a3d, B:300:0x0a45, B:303:0x0ad2, B:305:0x0b11, B:306:0x0b1c, B:307:0x0b28, B:309:0x0b2e, B:312:0x0b3e, B:314:0x0bcd, B:316:0x0bde, B:317:0x0c35, B:322:0x0bf4, B:324:0x0c22, B:327:0x0b8e, B:329:0x0bb4, B:335:0x0bf8, B:336:0x0c0b, B:339:0x0c0d, B:340:0x05ef, B:343:0x051f, B:344:0x0477, B:345:0x0329, B:346:0x0330, B:348:0x0336, B:351:0x0346, B:356:0x01ac, B:358:0x01b6, B:360:0x01cc, B:365:0x01e4, B:368:0x0220, B:370:0x0226, B:372:0x0234, B:374:0x0245, B:376:0x0282, B:377:0x02d5, B:379:0x02e0, B:380:0x024b, B:382:0x0266, B:385:0x0276, B:386:0x02b8, B:389:0x02a7, B:391:0x01f2, B:394:0x0216), top: B:32:0x0153, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x02e0 A[Catch: all -> 0x0c76, TryCatch #2 {all -> 0x0c76, blocks: (B:33:0x0153, B:35:0x0165, B:37:0x0171, B:38:0x017d, B:41:0x0189, B:43:0x0193, B:47:0x019f, B:51:0x0313, B:54:0x034d, B:56:0x0383, B:58:0x0388, B:59:0x039d, B:63:0x03b0, B:65:0x03c8, B:67:0x03cf, B:68:0x03e4, B:73:0x0410, B:77:0x0432, B:78:0x0447, B:81:0x0458, B:87:0x0490, B:88:0x04a6, B:90:0x04b0, B:92:0x04bd, B:94:0x04c3, B:95:0x04cc, B:97:0x04da, B:99:0x050a, B:100:0x0530, B:102:0x0558, B:105:0x0581, B:108:0x05cd, B:109:0x0632, B:111:0x065c, B:112:0x0662, B:114:0x066d, B:115:0x0673, B:117:0x0682, B:119:0x0688, B:120:0x068e, B:121:0x0695, B:123:0x069d, B:125:0x06a3, B:126:0x06a9, B:127:0x06b0, B:129:0x06b8, B:131:0x06be, B:132:0x06c4, B:133:0x06cb, B:135:0x06db, B:137:0x06e3, B:139:0x06e9, B:140:0x06ef, B:141:0x06f6, B:143:0x06ff, B:145:0x0704, B:146:0x070a, B:147:0x0711, B:149:0x0717, B:150:0x071d, B:152:0x072c, B:154:0x0732, B:155:0x0738, B:156:0x073f, B:158:0x075a, B:159:0x0760, B:161:0x0771, B:163:0x0779, B:165:0x077f, B:166:0x0785, B:167:0x078c, B:169:0x0794, B:171:0x0798, B:172:0x079e, B:173:0x07a5, B:175:0x07ab, B:176:0x07b1, B:178:0x07cb, B:180:0x0a53, B:181:0x0a6d, B:183:0x0a73, B:186:0x0a87, B:189:0x0a93, B:192:0x0aa0, B:203:0x0ab7, B:195:0x0ac5, B:198:0x0acd, B:207:0x07d1, B:209:0x07ec, B:211:0x07fe, B:213:0x0802, B:215:0x080a, B:216:0x0810, B:218:0x081b, B:220:0x0825, B:221:0x082b, B:222:0x0832, B:224:0x0841, B:225:0x0847, B:227:0x085d, B:228:0x0863, B:230:0x0879, B:231:0x087f, B:233:0x0894, B:234:0x089a, B:236:0x08ae, B:237:0x08b3, B:239:0x08bb, B:241:0x0c66, B:243:0x0c6a, B:244:0x0c6e, B:245:0x0c6f, B:246:0x08c5, B:248:0x08d2, B:250:0x08f2, B:251:0x08fd, B:253:0x0931, B:254:0x0936, B:255:0x0943, B:257:0x094b, B:259:0x0955, B:261:0x0960, B:262:0x0966, B:263:0x096d, B:265:0x0977, B:267:0x0982, B:268:0x0988, B:269:0x098f, B:270:0x099b, B:272:0x09a1, B:274:0x09cf, B:275:0x09d5, B:277:0x09e0, B:278:0x09e6, B:280:0x09f1, B:281:0x09f7, B:283:0x0a02, B:285:0x0a08, B:286:0x0a0e, B:288:0x0a15, B:289:0x0a1b, B:291:0x0a1f, B:293:0x0a29, B:295:0x0a2d, B:297:0x0a37, B:298:0x0a3d, B:300:0x0a45, B:303:0x0ad2, B:305:0x0b11, B:306:0x0b1c, B:307:0x0b28, B:309:0x0b2e, B:312:0x0b3e, B:314:0x0bcd, B:316:0x0bde, B:317:0x0c35, B:322:0x0bf4, B:324:0x0c22, B:327:0x0b8e, B:329:0x0bb4, B:335:0x0bf8, B:336:0x0c0b, B:339:0x0c0d, B:340:0x05ef, B:343:0x051f, B:344:0x0477, B:345:0x0329, B:346:0x0330, B:348:0x0336, B:351:0x0346, B:356:0x01ac, B:358:0x01b6, B:360:0x01cc, B:365:0x01e4, B:368:0x0220, B:370:0x0226, B:372:0x0234, B:374:0x0245, B:376:0x0282, B:377:0x02d5, B:379:0x02e0, B:380:0x024b, B:382:0x0266, B:385:0x0276, B:386:0x02b8, B:389:0x02a7, B:391:0x01f2, B:394:0x0216), top: B:32:0x0153, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0216 A[Catch: all -> 0x0c76, TRY_ENTER, TryCatch #2 {all -> 0x0c76, blocks: (B:33:0x0153, B:35:0x0165, B:37:0x0171, B:38:0x017d, B:41:0x0189, B:43:0x0193, B:47:0x019f, B:51:0x0313, B:54:0x034d, B:56:0x0383, B:58:0x0388, B:59:0x039d, B:63:0x03b0, B:65:0x03c8, B:67:0x03cf, B:68:0x03e4, B:73:0x0410, B:77:0x0432, B:78:0x0447, B:81:0x0458, B:87:0x0490, B:88:0x04a6, B:90:0x04b0, B:92:0x04bd, B:94:0x04c3, B:95:0x04cc, B:97:0x04da, B:99:0x050a, B:100:0x0530, B:102:0x0558, B:105:0x0581, B:108:0x05cd, B:109:0x0632, B:111:0x065c, B:112:0x0662, B:114:0x066d, B:115:0x0673, B:117:0x0682, B:119:0x0688, B:120:0x068e, B:121:0x0695, B:123:0x069d, B:125:0x06a3, B:126:0x06a9, B:127:0x06b0, B:129:0x06b8, B:131:0x06be, B:132:0x06c4, B:133:0x06cb, B:135:0x06db, B:137:0x06e3, B:139:0x06e9, B:140:0x06ef, B:141:0x06f6, B:143:0x06ff, B:145:0x0704, B:146:0x070a, B:147:0x0711, B:149:0x0717, B:150:0x071d, B:152:0x072c, B:154:0x0732, B:155:0x0738, B:156:0x073f, B:158:0x075a, B:159:0x0760, B:161:0x0771, B:163:0x0779, B:165:0x077f, B:166:0x0785, B:167:0x078c, B:169:0x0794, B:171:0x0798, B:172:0x079e, B:173:0x07a5, B:175:0x07ab, B:176:0x07b1, B:178:0x07cb, B:180:0x0a53, B:181:0x0a6d, B:183:0x0a73, B:186:0x0a87, B:189:0x0a93, B:192:0x0aa0, B:203:0x0ab7, B:195:0x0ac5, B:198:0x0acd, B:207:0x07d1, B:209:0x07ec, B:211:0x07fe, B:213:0x0802, B:215:0x080a, B:216:0x0810, B:218:0x081b, B:220:0x0825, B:221:0x082b, B:222:0x0832, B:224:0x0841, B:225:0x0847, B:227:0x085d, B:228:0x0863, B:230:0x0879, B:231:0x087f, B:233:0x0894, B:234:0x089a, B:236:0x08ae, B:237:0x08b3, B:239:0x08bb, B:241:0x0c66, B:243:0x0c6a, B:244:0x0c6e, B:245:0x0c6f, B:246:0x08c5, B:248:0x08d2, B:250:0x08f2, B:251:0x08fd, B:253:0x0931, B:254:0x0936, B:255:0x0943, B:257:0x094b, B:259:0x0955, B:261:0x0960, B:262:0x0966, B:263:0x096d, B:265:0x0977, B:267:0x0982, B:268:0x0988, B:269:0x098f, B:270:0x099b, B:272:0x09a1, B:274:0x09cf, B:275:0x09d5, B:277:0x09e0, B:278:0x09e6, B:280:0x09f1, B:281:0x09f7, B:283:0x0a02, B:285:0x0a08, B:286:0x0a0e, B:288:0x0a15, B:289:0x0a1b, B:291:0x0a1f, B:293:0x0a29, B:295:0x0a2d, B:297:0x0a37, B:298:0x0a3d, B:300:0x0a45, B:303:0x0ad2, B:305:0x0b11, B:306:0x0b1c, B:307:0x0b28, B:309:0x0b2e, B:312:0x0b3e, B:314:0x0bcd, B:316:0x0bde, B:317:0x0c35, B:322:0x0bf4, B:324:0x0c22, B:327:0x0b8e, B:329:0x0bb4, B:335:0x0bf8, B:336:0x0c0b, B:339:0x0c0d, B:340:0x05ef, B:343:0x051f, B:344:0x0477, B:345:0x0329, B:346:0x0330, B:348:0x0336, B:351:0x0346, B:356:0x01ac, B:358:0x01b6, B:360:0x01cc, B:365:0x01e4, B:368:0x0220, B:370:0x0226, B:372:0x0234, B:374:0x0245, B:376:0x0282, B:377:0x02d5, B:379:0x02e0, B:380:0x024b, B:382:0x0266, B:385:0x0276, B:386:0x02b8, B:389:0x02a7, B:391:0x01f2, B:394:0x0216), top: B:32:0x0153, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0383 A[Catch: all -> 0x0c76, TryCatch #2 {all -> 0x0c76, blocks: (B:33:0x0153, B:35:0x0165, B:37:0x0171, B:38:0x017d, B:41:0x0189, B:43:0x0193, B:47:0x019f, B:51:0x0313, B:54:0x034d, B:56:0x0383, B:58:0x0388, B:59:0x039d, B:63:0x03b0, B:65:0x03c8, B:67:0x03cf, B:68:0x03e4, B:73:0x0410, B:77:0x0432, B:78:0x0447, B:81:0x0458, B:87:0x0490, B:88:0x04a6, B:90:0x04b0, B:92:0x04bd, B:94:0x04c3, B:95:0x04cc, B:97:0x04da, B:99:0x050a, B:100:0x0530, B:102:0x0558, B:105:0x0581, B:108:0x05cd, B:109:0x0632, B:111:0x065c, B:112:0x0662, B:114:0x066d, B:115:0x0673, B:117:0x0682, B:119:0x0688, B:120:0x068e, B:121:0x0695, B:123:0x069d, B:125:0x06a3, B:126:0x06a9, B:127:0x06b0, B:129:0x06b8, B:131:0x06be, B:132:0x06c4, B:133:0x06cb, B:135:0x06db, B:137:0x06e3, B:139:0x06e9, B:140:0x06ef, B:141:0x06f6, B:143:0x06ff, B:145:0x0704, B:146:0x070a, B:147:0x0711, B:149:0x0717, B:150:0x071d, B:152:0x072c, B:154:0x0732, B:155:0x0738, B:156:0x073f, B:158:0x075a, B:159:0x0760, B:161:0x0771, B:163:0x0779, B:165:0x077f, B:166:0x0785, B:167:0x078c, B:169:0x0794, B:171:0x0798, B:172:0x079e, B:173:0x07a5, B:175:0x07ab, B:176:0x07b1, B:178:0x07cb, B:180:0x0a53, B:181:0x0a6d, B:183:0x0a73, B:186:0x0a87, B:189:0x0a93, B:192:0x0aa0, B:203:0x0ab7, B:195:0x0ac5, B:198:0x0acd, B:207:0x07d1, B:209:0x07ec, B:211:0x07fe, B:213:0x0802, B:215:0x080a, B:216:0x0810, B:218:0x081b, B:220:0x0825, B:221:0x082b, B:222:0x0832, B:224:0x0841, B:225:0x0847, B:227:0x085d, B:228:0x0863, B:230:0x0879, B:231:0x087f, B:233:0x0894, B:234:0x089a, B:236:0x08ae, B:237:0x08b3, B:239:0x08bb, B:241:0x0c66, B:243:0x0c6a, B:244:0x0c6e, B:245:0x0c6f, B:246:0x08c5, B:248:0x08d2, B:250:0x08f2, B:251:0x08fd, B:253:0x0931, B:254:0x0936, B:255:0x0943, B:257:0x094b, B:259:0x0955, B:261:0x0960, B:262:0x0966, B:263:0x096d, B:265:0x0977, B:267:0x0982, B:268:0x0988, B:269:0x098f, B:270:0x099b, B:272:0x09a1, B:274:0x09cf, B:275:0x09d5, B:277:0x09e0, B:278:0x09e6, B:280:0x09f1, B:281:0x09f7, B:283:0x0a02, B:285:0x0a08, B:286:0x0a0e, B:288:0x0a15, B:289:0x0a1b, B:291:0x0a1f, B:293:0x0a29, B:295:0x0a2d, B:297:0x0a37, B:298:0x0a3d, B:300:0x0a45, B:303:0x0ad2, B:305:0x0b11, B:306:0x0b1c, B:307:0x0b28, B:309:0x0b2e, B:312:0x0b3e, B:314:0x0bcd, B:316:0x0bde, B:317:0x0c35, B:322:0x0bf4, B:324:0x0c22, B:327:0x0b8e, B:329:0x0bb4, B:335:0x0bf8, B:336:0x0c0b, B:339:0x0c0d, B:340:0x05ef, B:343:0x051f, B:344:0x0477, B:345:0x0329, B:346:0x0330, B:348:0x0336, B:351:0x0346, B:356:0x01ac, B:358:0x01b6, B:360:0x01cc, B:365:0x01e4, B:368:0x0220, B:370:0x0226, B:372:0x0234, B:374:0x0245, B:376:0x0282, B:377:0x02d5, B:379:0x02e0, B:380:0x024b, B:382:0x0266, B:385:0x0276, B:386:0x02b8, B:389:0x02a7, B:391:0x01f2, B:394:0x0216), top: B:32:0x0153, inners: #1, #4, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03ae  */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.QpT, X.QqM, X.QnE] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.QnE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJ(com.google.android.gms.measurement.internal.zzaw r45, com.google.android.gms.measurement.internal.zzq r46) {
        /*
            Method dump skipped, instructions count: 3204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68241QqL.LJIJJ(com.google.android.gms.measurement.internal.zzaw, com.google.android.gms.measurement.internal.zzq):void");
    }

    public final boolean LJJIIZI(C68264Qqi c68264Qqi, C68264Qqi c68264Qqi2) {
        String str;
        QH7.LIZIZ("_e".equals(c68264Qqi.LJIJ()));
        LJJIJIIJI(this.LJI);
        C68257Qqb LJIIIZ = C68243QqN.LJIIIZ((C68260Qqe) c68264Qqi.LJIIIIZZ(), "_sc");
        String str2 = null;
        if (LJIIIZ != null) {
            str2 = LJIIIZ.zzg;
        }
        LJJIJIIJI(this.LJI);
        C68257Qqb LJIIIZ2 = C68243QqN.LJIIIZ((C68260Qqe) c68264Qqi2.LJIIIIZZ(), "_pc");
        if (LJIIIZ2 == null || (str = LJIIIZ2.zzg) == null || !str.equals(str2)) {
            return false;
        }
        QH7.LIZIZ("_e".equals(c68264Qqi.LJIJ()));
        LJJIJIIJI(this.LJI);
        C68257Qqb LJIIIZ3 = C68243QqN.LJIIIZ((C68260Qqe) c68264Qqi.LJIIIIZZ(), "_et");
        if (LJIIIZ3 != null && LJIIIZ3.LJJIIJZLJL()) {
            long j = LJIIIZ3.zzh;
            if (j <= 0) {
                return true;
            }
            LJJIJIIJI(this.LJI);
            C68257Qqb LJIIIZ4 = C68243QqN.LJIIIZ((C68260Qqe) c68264Qqi2.LJIIIIZZ(), "_et");
            if (LJIIIZ4 != null) {
                long j2 = LJIIIZ4.zzh;
                if (j2 > 0) {
                    j += j2;
                }
            }
            LJJIJIIJI(this.LJI);
            C68243QqN.LJJIJIL(c68264Qqi2, "_et", Long.valueOf(j));
            LJJIJIIJI(this.LJI);
            C68243QqN.LJJIJIL(c68264Qqi, "_fr", 1L);
            return true;
        }
        return true;
    }

    public static final void LJIJJLI(C68264Qqi c68264Qqi, int i, String str) {
        List unmodifiableList = Collections.unmodifiableList(((C68260Qqe) c68264Qqi.LJLILLLLZI).zzf);
        for (int i2 = 0; i2 < unmodifiableList.size(); i2++) {
            if ("_err".equals(((C68257Qqb) ListProtector.get(unmodifiableList, i2)).zzf)) {
                return;
            }
        }
        C68281Qqz LJIJ = C68257Qqb.LJIJ();
        LJIJ.LJIIL("_err");
        LJIJ.LJIIJJI(Long.valueOf(i).longValue());
        YIN LJIIIIZZ = LJIJ.LJIIIIZZ();
        C68281Qqz LJIJ2 = C68257Qqb.LJIJ();
        LJIJ2.LJIIL("_ev");
        LJIJ2.LJIILIIL(str);
        YIN LJIIIIZZ2 = LJIJ2.LJIIIIZZ();
        if (c68264Qqi.LJLJI) {
            c68264Qqi.LJIIJ();
            c68264Qqi.LJLJI = false;
        }
        C68260Qqe c68260Qqe = (C68260Qqe) c68264Qqi.LJLILLLLZI;
        c68260Qqe.LJJII();
        c68260Qqe.zzf.add(LJIIIIZZ);
        if (c68264Qqi.LJLJI) {
            c68264Qqi.LJIIJ();
            c68264Qqi.LJLJI = false;
        }
        C68260Qqe c68260Qqe2 = (C68260Qqe) c68264Qqi.LJLILLLLZI;
        c68260Qqe2.LJJII();
        c68260Qqe2.zzf.add(LJIIIIZZ2);
    }

    public final void LJJIII(C68253QqX c68253QqX, long j, boolean z) {
        String str;
        C68135Qod c68135Qod;
        String str2;
        if (true != z) {
            str = "_lte";
        } else {
            str = "_se";
        }
        C68242QqM c68242QqM = this.LIZJ;
        LJJIJIIJI(c68242QqM);
        C68135Qod LJJIIZI2 = c68242QqM.LJJIIZI(c68253QqX.LJIJI(), str);
        if (LJJIIZI2 == null || LJJIIZI2.LJ == null) {
            String LJIJI = c68253QqX.LJIJI();
            LIZLLL().getClass();
            c68135Qod = new C68135Qod(System.currentTimeMillis(), Long.valueOf(j), LJIJI, "auto", str);
        } else {
            String LJIJI2 = c68253QqX.LJIJI();
            LIZLLL().getClass();
            c68135Qod = new C68135Qod(System.currentTimeMillis(), Long.valueOf(((Long) LJJIIZI2.LJ).longValue() + j), LJIJI2, "auto", str);
        }
        C68282Qr0 LJIJ = C68259Qqd.LJIJ();
        LJIJ.LJIIL(str);
        LIZLLL().getClass();
        LJIJ.LJIILIIL(System.currentTimeMillis());
        LJIJ.LJIIJJI(((Long) c68135Qod.LJ).longValue());
        YIN LJIIIIZZ = LJIJ.LJIIIIZZ();
        int LJIJ2 = C68243QqN.LJIJ(c68253QqX, str);
        if (LJIJ2 >= 0) {
            if (c68253QqX.LJLJI) {
                c68253QqX.LJIIJ();
                c68253QqX.LJLJI = false;
            }
            C68246QqQ c68246QqQ = (C68246QqQ) c68253QqX.LJLILLLLZI;
            XM7 xm7 = c68246QqQ.zzj;
            if (!xm7.LIZIZ()) {
                c68246QqQ.zzj = YIN.LJIILJJIL(xm7);
            }
            c68246QqQ.zzj.set(LJIJ2, LJIIIIZZ);
        } else {
            if (c68253QqX.LJLJI) {
                c68253QqX.LJIIJ();
                c68253QqX.LJLJI = false;
            }
            C68246QqQ c68246QqQ2 = (C68246QqQ) c68253QqX.LJLILLLLZI;
            XM7 xm72 = c68246QqQ2.zzj;
            if (!xm72.LIZIZ()) {
                c68246QqQ2.zzj = YIN.LJIILJJIL(xm72);
            }
            c68246QqQ2.zzj.add(LJIIIIZZ);
        }
        if (j > 0) {
            C68242QqM c68242QqM2 = this.LIZJ;
            LJJIJIIJI(c68242QqM2);
            c68242QqM2.LJIILLIIL(c68135Qod);
            if (true != z) {
                str2 = "lifetime";
            } else {
                str2 = "session-scoped";
            }
            LIZJ().LJIILIIL.LIZJ(str2, c68135Qod.LJ, "Updated engagement user property. scope, value");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.lang.String r11, int r12, java.lang.Throwable r13, byte[] r14, java.util.Map r15) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68241QqL.LJIIJJI(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }
}
