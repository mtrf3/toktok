package com.ss.android.ugc.aweme.video.preload.enginepreloader;

import X.AbstractC46738IVy;
import X.C16880lQ;
import X.C26206AQg;
import X.C26208AQi;
import X.C26210AQk;
import X.C46556IOy;
import X.C46644ISi;
import X.C46664ITc;
import X.C46729IVp;
import X.C46734IVu;
import X.C46739IVz;
import X.C46865IaL;
import X.C46872IaS;
import X.C46877IaX;
import X.C46898Ias;
import X.C46900Iau;
import X.C46907Ib1;
import X.C46915Ib9;
import X.C46917IbB;
import X.C46982IcE;
import X.C47069Idd;
import X.C47071Idf;
import X.C47075Idj;
import X.C47076Idk;
import X.C47079Idn;
import X.C47080Ido;
import X.C47081Idp;
import X.C47083Idr;
import X.C47090Idy;
import X.C47091Idz;
import X.C47107IeF;
import X.C47111IeJ;
import X.C47116IeO;
import X.C47118IeQ;
import X.C47135Ieh;
import X.C47147Iet;
import X.C47148Ieu;
import X.C47160If6;
import X.C47164IfA;
import X.C47169IfF;
import X.C47188IfY;
import X.C47335Ihv;
import X.C47421IjJ;
import X.C47462Ijy;
import X.C47752Ioe;
import X.C47821Ipl;
import X.C47959Irz;
import X.C56662Kg;
import X.C64504PTg;
import X.C73343SqR;
import X.C77119UOl;
import X.C77413UZt;
import X.C78253UnR;
import X.C78966Uyw;
import X.C78983UzD;
import X.C87748YcC;
import X.EnumC46736IVw;
import X.EnumC47176IfM;
import X.EnumC47317Ihd;
import X.IFW;
import X.IXB;
import X.IXN;
import X.IXT;
import X.IXW;
import X.IY1;
import X.IY2;
import X.IZ8;
import X.InterfaceC47078Idm;
import X.InterfaceC47084Ids;
import X.InterfaceC47101Ie9;
import X.InterfaceC47122IeU;
import X.InterfaceC47125IeX;
import X.InterfaceC47342Ii2;
import X.JBR;
import X.X1D;
import Y.ARunnableS19S0300000_8;
import Y.ARunnableS1S1220000_8;
import android.app.Application;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.vcloud.networkpredictor.DefaultSpeedPredictor;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader;
import com.ss.android.ugc.playerkit.exp.model.ExtCacheRootPathConfigExp;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.mediakit.medialoader.AVMDLCopyOperation;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.LoaderEventInfo;
import com.ss.mediakit.net.AVMDLDNSParser;
import com.ss.ttvideoengine.DataLoaderHelper;
import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS190S0100000_8;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public class EnginePreloader implements InterfaceC47342Ii2 {
    public static int LJJIIZ = -1;
    public static final String LJJIIZI = EnumC47317Ihd.MediaLoader.getCacheDirName();
    public final boolean LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public boolean LIZLLL;
    public final List<WeakReference<InterfaceC47101Ie9>> LJ;
    public C47111IeJ LJFF;
    public File LJI;
    public C47107IeF LJII;
    public final Handler LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public final Map<String, List<C87748YcC>> LJIIJ;
    public final ConcurrentHashMap<String, String> LJIIJJI;
    public final ConcurrentLinkedQueue<String> LJIIL;
    public Map<String, String> LJIILIIL;
    public final List<IFW> LJIILJJIL;
    public volatile String LJIILL;
    public final Map<String, Integer> LJIILLIIL;
    public final Map<String, C47076Idk> LJIIZILJ;
    public final Map<String, SimVideoUrlModel> LJIJ;
    public final Set<String> LJIJI;
    public final Map<String, List<C47075Idj>> LJIJJ;
    public final C47421IjJ LJIJJLI;
    public final boolean LJIL;
    public String LJJ;
    public String LJJI;
    public final C47116IeO LJJIFFI;
    public final CountDownLatch LJJII;
    public final ConcurrentHashMap<String, IY1> LJJIII;
    public final ConcurrentHashMap<String, IXW> LJJIIJ;
    public boolean LJJIIJZLJL;

    @Override // X.InterfaceC47342Ii2
    public final boolean checkInit() {
        if (C56662Kg.LIZ().LIZLLL && C47821Ipl.LJII) {
            C56662Kg.LIZ().LJFF("player_init_build_to_enginepreloader", false);
            C56662Kg.LIZ().LIZJ("player_init_enginepreloader_checkinit_duration", false);
        }
        boolean LIZJ = LIZJ();
        if (C56662Kg.LIZ().LIZLLL && C47821Ipl.LJII) {
            C56662Kg.LIZ().LJFF("player_init_enginepreloader_checkinit_duration", false);
            C47821Ipl.LJII = false;
        }
        return LIZJ;
    }

    @Override // X.InterfaceC47342Ii2
    public final String getNetworkLibName() {
        return "engine";
    }

    @Override // X.InterfaceC47342Ii2
    public final List<C47462Ijy> getSingleTimeDownloadList(SimVideoUrlModel simVideoUrlModel) {
        return null;
    }

    @Override // X.InterfaceC47342Ii2
    public final /* synthetic */ boolean preload(SimVideoUrlModel simVideoUrlModel, int i) {
        throw null;
    }

    @Override // X.InterfaceC47342Ii2
    public final boolean preload(String str, String str2, int i, long j, AbstractC46738IVy abstractC46738IVy, C46729IVp c46729IVp) {
        throw null;
    }

    @Override // X.InterfaceC47342Ii2
    public final boolean preload(String str, String str2, int i, AbstractC46738IVy abstractC46738IVy, C46729IVp c46729IVp) {
        throw null;
    }

    @Override // X.InterfaceC47342Ii2
    public final C46556IOy readTimeInfo(SimVideoUrlModel simVideoUrlModel) {
        return null;
    }

    @Override // X.InterfaceC47342Ii2
    public final boolean supportPreloadObservable() {
        return true;
    }

    public static void LJIJI() {
        Object value = IZ8.LLJJJJ.getValue();
        o.LJIIIIZZ(value, "<get-isUseQuickQueryCache>(...)");
        if (((Boolean) value).booleanValue()) {
            C46900Iau.LIZIZ = new AqS190S0100000_8(new C47135Ieh(), (InterfaceC47125IeX<String, C46907Ib1>) 76);
        } else {
            C46900Iau.LIZIZ = new AqS190S0100000_8(new C47959Irz(), (InterfaceC47125IeX<String, C46907Ib1>) 76);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(71:10|11|13|14|(3:16|17|18)|24|(64:29|30|(1:33)|34|(2:36|37)|38|(1:40)(1:167)|41|(2:43|44)|45|(1:47)|48|(1:50)|51|(2:53|54)|55|(1:57)|58|(1:60)|61|(1:63)|64|(1:66)|67|(1:69)|70|(1:72)|73|(2:75|(1:77))(2:165|166)|78|(1:80)|81|(6:83|(1:87)|88|(1:92)|93|(1:95))|96|97|98|99|(1:101)|(1:103)|104|(1:106)(1:162)|107|(1:109)(1:161)|110|(1:112)|113|(1:115)|116|(2:118|119)|120|121|122|(2:124|125)|126|(2:128|129)|131|(3:133|(3:135|(3:139|(1:141)(1:143)|142)|144)|145)|146|(3:148|(1:151)|152)|153|(1:155)|156|(1:158)|159)|168|30|(1:33)|34|(0)|38|(0)(0)|41|(0)|45|(0)|48|(0)|51|(0)|55|(0)|58|(0)|61|(0)|64|(0)|67|(0)|70|(0)|73|(0)(0)|78|(0)|81|(0)|96|97|98|99|(0)|(0)|104|(0)(0)|107|(0)(0)|110|(0)|113|(0)|116|(0)|120|121|122|(0)|126|(0)|131|(0)|146|(0)|153|(0)|156|(0)|159) */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x06f5, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0704 A[Catch: all -> 0x0960, TRY_ENTER, TryCatch #0 {all -> 0x0960, blocks: (B:18:0x0087, B:26:0x009a, B:33:0x00c2, B:37:0x00ec, B:44:0x02c6, B:47:0x02d8, B:50:0x02e7, B:54:0x02fc, B:57:0x0310, B:60:0x032f, B:63:0x034e, B:66:0x036d, B:69:0x038c, B:72:0x03ab, B:75:0x03e6, B:77:0x03ed, B:80:0x0505, B:83:0x0653, B:85:0x065b, B:87:0x0667, B:88:0x0672, B:90:0x067a, B:92:0x0686, B:93:0x0691, B:95:0x0699, B:101:0x0704, B:103:0x070f, B:112:0x07c3, B:115:0x07e1, B:119:0x0805, B:121:0x082b, B:125:0x0846, B:129:0x085b), top: B:17:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x070f A[Catch: all -> 0x0960, TRY_LEAVE, TryCatch #0 {all -> 0x0960, blocks: (B:18:0x0087, B:26:0x009a, B:33:0x00c2, B:37:0x00ec, B:44:0x02c6, B:47:0x02d8, B:50:0x02e7, B:54:0x02fc, B:57:0x0310, B:60:0x032f, B:63:0x034e, B:66:0x036d, B:69:0x038c, B:72:0x03ab, B:75:0x03e6, B:77:0x03ed, B:80:0x0505, B:83:0x0653, B:85:0x065b, B:87:0x0667, B:88:0x0672, B:90:0x067a, B:92:0x0686, B:93:0x0691, B:95:0x0699, B:101:0x0704, B:103:0x070f, B:112:0x07c3, B:115:0x07e1, B:119:0x0805, B:121:0x082b, B:125:0x0846, B:129:0x085b), top: B:17:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x074f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x07c3 A[Catch: all -> 0x0960, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0960, blocks: (B:18:0x0087, B:26:0x009a, B:33:0x00c2, B:37:0x00ec, B:44:0x02c6, B:47:0x02d8, B:50:0x02e7, B:54:0x02fc, B:57:0x0310, B:60:0x032f, B:63:0x034e, B:66:0x036d, B:69:0x038c, B:72:0x03ab, B:75:0x03e6, B:77:0x03ed, B:80:0x0505, B:83:0x0653, B:85:0x065b, B:87:0x0667, B:88:0x0672, B:90:0x067a, B:92:0x0686, B:93:0x0691, B:95:0x0699, B:101:0x0704, B:103:0x070f, B:112:0x07c3, B:115:0x07e1, B:119:0x0805, B:121:0x082b, B:125:0x0846, B:129:0x085b), top: B:17:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x07e1 A[Catch: all -> 0x0960, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0960, blocks: (B:18:0x0087, B:26:0x009a, B:33:0x00c2, B:37:0x00ec, B:44:0x02c6, B:47:0x02d8, B:50:0x02e7, B:54:0x02fc, B:57:0x0310, B:60:0x032f, B:63:0x034e, B:66:0x036d, B:69:0x038c, B:72:0x03ab, B:75:0x03e6, B:77:0x03ed, B:80:0x0505, B:83:0x0653, B:85:0x065b, B:87:0x0667, B:88:0x0672, B:90:0x067a, B:92:0x0686, B:93:0x0691, B:95:0x0699, B:101:0x0704, B:103:0x070f, B:112:0x07c3, B:115:0x07e1, B:119:0x0805, B:121:0x082b, B:125:0x0846, B:129:0x085b), top: B:17:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0844  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0873 A[Catch: all -> 0x0964, TryCatch #2 {all -> 0x0964, blocks: (B:14:0x006d, B:24:0x008a, B:30:0x00a8, B:34:0x00d4, B:38:0x00f6, B:40:0x0102, B:41:0x0106, B:45:0x02c9, B:48:0x02e1, B:51:0x02f0, B:55:0x02ff, B:58:0x031e, B:61:0x033d, B:64:0x035c, B:67:0x037b, B:70:0x039a, B:73:0x03b9, B:78:0x03f5, B:81:0x050e, B:96:0x06a8, B:99:0x06f6, B:104:0x0714, B:107:0x073e, B:110:0x0752, B:113:0x07d0, B:116:0x07ef, B:120:0x0816, B:122:0x0834, B:126:0x0849, B:131:0x0863, B:133:0x0873, B:135:0x089b, B:137:0x08a8, B:139:0x08ae, B:142:0x08b7, B:144:0x08bc, B:145:0x08c1, B:146:0x08d4, B:148:0x08e4, B:151:0x08f3, B:152:0x08f8, B:153:0x0901, B:155:0x0914, B:156:0x091c, B:158:0x0951, B:159:0x0956, B:166:0x03f2), top: B:13:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x08e4 A[Catch: all -> 0x0964, TryCatch #2 {all -> 0x0964, blocks: (B:14:0x006d, B:24:0x008a, B:30:0x00a8, B:34:0x00d4, B:38:0x00f6, B:40:0x0102, B:41:0x0106, B:45:0x02c9, B:48:0x02e1, B:51:0x02f0, B:55:0x02ff, B:58:0x031e, B:61:0x033d, B:64:0x035c, B:67:0x037b, B:70:0x039a, B:73:0x03b9, B:78:0x03f5, B:81:0x050e, B:96:0x06a8, B:99:0x06f6, B:104:0x0714, B:107:0x073e, B:110:0x0752, B:113:0x07d0, B:116:0x07ef, B:120:0x0816, B:122:0x0834, B:126:0x0849, B:131:0x0863, B:133:0x0873, B:135:0x089b, B:137:0x08a8, B:139:0x08ae, B:142:0x08b7, B:144:0x08bc, B:145:0x08c1, B:146:0x08d4, B:148:0x08e4, B:151:0x08f3, B:152:0x08f8, B:153:0x0901, B:155:0x0914, B:156:0x091c, B:158:0x0951, B:159:0x0956, B:166:0x03f2), top: B:13:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0914 A[Catch: all -> 0x0964, TryCatch #2 {all -> 0x0964, blocks: (B:14:0x006d, B:24:0x008a, B:30:0x00a8, B:34:0x00d4, B:38:0x00f6, B:40:0x0102, B:41:0x0106, B:45:0x02c9, B:48:0x02e1, B:51:0x02f0, B:55:0x02ff, B:58:0x031e, B:61:0x033d, B:64:0x035c, B:67:0x037b, B:70:0x039a, B:73:0x03b9, B:78:0x03f5, B:81:0x050e, B:96:0x06a8, B:99:0x06f6, B:104:0x0714, B:107:0x073e, B:110:0x0752, B:113:0x07d0, B:116:0x07ef, B:120:0x0816, B:122:0x0834, B:126:0x0849, B:131:0x0863, B:133:0x0873, B:135:0x089b, B:137:0x08a8, B:139:0x08ae, B:142:0x08b7, B:144:0x08bc, B:145:0x08c1, B:146:0x08d4, B:148:0x08e4, B:151:0x08f3, B:152:0x08f8, B:153:0x0901, B:155:0x0914, B:156:0x091c, B:158:0x0951, B:159:0x0956, B:166:0x03f2), top: B:13:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0951 A[Catch: all -> 0x0964, TryCatch #2 {all -> 0x0964, blocks: (B:14:0x006d, B:24:0x008a, B:30:0x00a8, B:34:0x00d4, B:38:0x00f6, B:40:0x0102, B:41:0x0106, B:45:0x02c9, B:48:0x02e1, B:51:0x02f0, B:55:0x02ff, B:58:0x031e, B:61:0x033d, B:64:0x035c, B:67:0x037b, B:70:0x039a, B:73:0x03b9, B:78:0x03f5, B:81:0x050e, B:96:0x06a8, B:99:0x06f6, B:104:0x0714, B:107:0x073e, B:110:0x0752, B:113:0x07d0, B:116:0x07ef, B:120:0x0816, B:122:0x0834, B:126:0x0849, B:131:0x0863, B:133:0x0873, B:135:0x089b, B:137:0x08a8, B:139:0x08ae, B:142:0x08b7, B:144:0x08bc, B:145:0x08c1, B:146:0x08d4, B:148:0x08e4, B:151:0x08f3, B:152:0x08f8, B:153:0x0901, B:155:0x0914, B:156:0x091c, B:158:0x0951, B:159:0x0956, B:166:0x03f2), top: B:13:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0102 A[Catch: all -> 0x0964, TryCatch #2 {all -> 0x0964, blocks: (B:14:0x006d, B:24:0x008a, B:30:0x00a8, B:34:0x00d4, B:38:0x00f6, B:40:0x0102, B:41:0x0106, B:45:0x02c9, B:48:0x02e1, B:51:0x02f0, B:55:0x02ff, B:58:0x031e, B:61:0x033d, B:64:0x035c, B:67:0x037b, B:70:0x039a, B:73:0x03b9, B:78:0x03f5, B:81:0x050e, B:96:0x06a8, B:99:0x06f6, B:104:0x0714, B:107:0x073e, B:110:0x0752, B:113:0x07d0, B:116:0x07ef, B:120:0x0816, B:122:0x0834, B:126:0x0849, B:131:0x0863, B:133:0x0873, B:135:0x089b, B:137:0x08a8, B:139:0x08ae, B:142:0x08b7, B:144:0x08bc, B:145:0x08c1, B:146:0x08d4, B:148:0x08e4, B:151:0x08f3, B:152:0x08f8, B:153:0x0901, B:155:0x0914, B:156:0x091c, B:158:0x0951, B:159:0x0956, B:166:0x03f2), top: B:13:0x006d }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02d8 A[Catch: all -> 0x0960, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0960, blocks: (B:18:0x0087, B:26:0x009a, B:33:0x00c2, B:37:0x00ec, B:44:0x02c6, B:47:0x02d8, B:50:0x02e7, B:54:0x02fc, B:57:0x0310, B:60:0x032f, B:63:0x034e, B:66:0x036d, B:69:0x038c, B:72:0x03ab, B:75:0x03e6, B:77:0x03ed, B:80:0x0505, B:83:0x0653, B:85:0x065b, B:87:0x0667, B:88:0x0672, B:90:0x067a, B:92:0x0686, B:93:0x0691, B:95:0x0699, B:101:0x0704, B:103:0x070f, B:112:0x07c3, B:115:0x07e1, B:119:0x0805, B:121:0x082b, B:125:0x0846, B:129:0x085b), top: B:17:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02e7 A[Catch: all -> 0x0960, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0960, blocks: (B:18:0x0087, B:26:0x009a, B:33:0x00c2, B:37:0x00ec, B:44:0x02c6, B:47:0x02d8, B:50:0x02e7, B:54:0x02fc, B:57:0x0310, B:60:0x032f, B:63:0x034e, B:66:0x036d, B:69:0x038c, B:72:0x03ab, B:75:0x03e6, B:77:0x03ed, B:80:0x0505, B:83:0x0653, B:85:0x065b, B:87:0x0667, B:88:0x0672, B:90:0x067a, B:92:0x0686, B:93:0x0691, B:95:0x0699, B:101:0x0704, B:103:0x070f, B:112:0x07c3, B:115:0x07e1, B:119:0x0805, B:121:0x082b, B:125:0x0846, B:129:0x085b), top: B:17:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0310 A[Catch: all -> 0x0960, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0960, blocks: (B:18:0x0087, B:26:0x009a, B:33:0x00c2, B:37:0x00ec, B:44:0x02c6, B:47:0x02d8, B:50:0x02e7, B:54:0x02fc, B:57:0x0310, B:60:0x032f, B:63:0x034e, B:66:0x036d, B:69:0x038c, B:72:0x03ab, B:75:0x03e6, B:77:0x03ed, B:80:0x0505, B:83:0x0653, B:85:0x065b, B:87:0x0667, B:88:0x0672, B:90:0x067a, B:92:0x0686, B:93:0x0691, B:95:0x0699, B:101:0x0704, B:103:0x070f, B:112:0x07c3, B:115:0x07e1, B:119:0x0805, B:121:0x082b, B:125:0x0846, B:129:0x085b), top: B:17:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x032f A[Catch: all -> 0x0960, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0960, blocks: (B:18:0x0087, B:26:0x009a, B:33:0x00c2, B:37:0x00ec, B:44:0x02c6, B:47:0x02d8, B:50:0x02e7, B:54:0x02fc, B:57:0x0310, B:60:0x032f, B:63:0x034e, B:66:0x036d, B:69:0x038c, B:72:0x03ab, B:75:0x03e6, B:77:0x03ed, B:80:0x0505, B:83:0x0653, B:85:0x065b, B:87:0x0667, B:88:0x0672, B:90:0x067a, B:92:0x0686, B:93:0x0691, B:95:0x0699, B:101:0x0704, B:103:0x070f, B:112:0x07c3, B:115:0x07e1, B:119:0x0805, B:121:0x082b, B:125:0x0846, B:129:0x085b), top: B:17:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x034e A[Catch: all -> 0x0960, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0960, blocks: (B:18:0x0087, B:26:0x009a, B:33:0x00c2, B:37:0x00ec, B:44:0x02c6, B:47:0x02d8, B:50:0x02e7, B:54:0x02fc, B:57:0x0310, B:60:0x032f, B:63:0x034e, B:66:0x036d, B:69:0x038c, B:72:0x03ab, B:75:0x03e6, B:77:0x03ed, B:80:0x0505, B:83:0x0653, B:85:0x065b, B:87:0x0667, B:88:0x0672, B:90:0x067a, B:92:0x0686, B:93:0x0691, B:95:0x0699, B:101:0x0704, B:103:0x070f, B:112:0x07c3, B:115:0x07e1, B:119:0x0805, B:121:0x082b, B:125:0x0846, B:129:0x085b), top: B:17:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x036d A[Catch: all -> 0x0960, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0960, blocks: (B:18:0x0087, B:26:0x009a, B:33:0x00c2, B:37:0x00ec, B:44:0x02c6, B:47:0x02d8, B:50:0x02e7, B:54:0x02fc, B:57:0x0310, B:60:0x032f, B:63:0x034e, B:66:0x036d, B:69:0x038c, B:72:0x03ab, B:75:0x03e6, B:77:0x03ed, B:80:0x0505, B:83:0x0653, B:85:0x065b, B:87:0x0667, B:88:0x0672, B:90:0x067a, B:92:0x0686, B:93:0x0691, B:95:0x0699, B:101:0x0704, B:103:0x070f, B:112:0x07c3, B:115:0x07e1, B:119:0x0805, B:121:0x082b, B:125:0x0846, B:129:0x085b), top: B:17:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x038c A[Catch: all -> 0x0960, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0960, blocks: (B:18:0x0087, B:26:0x009a, B:33:0x00c2, B:37:0x00ec, B:44:0x02c6, B:47:0x02d8, B:50:0x02e7, B:54:0x02fc, B:57:0x0310, B:60:0x032f, B:63:0x034e, B:66:0x036d, B:69:0x038c, B:72:0x03ab, B:75:0x03e6, B:77:0x03ed, B:80:0x0505, B:83:0x0653, B:85:0x065b, B:87:0x0667, B:88:0x0672, B:90:0x067a, B:92:0x0686, B:93:0x0691, B:95:0x0699, B:101:0x0704, B:103:0x070f, B:112:0x07c3, B:115:0x07e1, B:119:0x0805, B:121:0x082b, B:125:0x0846, B:129:0x085b), top: B:17:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03ab A[Catch: all -> 0x0960, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0960, blocks: (B:18:0x0087, B:26:0x009a, B:33:0x00c2, B:37:0x00ec, B:44:0x02c6, B:47:0x02d8, B:50:0x02e7, B:54:0x02fc, B:57:0x0310, B:60:0x032f, B:63:0x034e, B:66:0x036d, B:69:0x038c, B:72:0x03ab, B:75:0x03e6, B:77:0x03ed, B:80:0x0505, B:83:0x0653, B:85:0x065b, B:87:0x0667, B:88:0x0672, B:90:0x067a, B:92:0x0686, B:93:0x0691, B:95:0x0699, B:101:0x0704, B:103:0x070f, B:112:0x07c3, B:115:0x07e1, B:119:0x0805, B:121:0x082b, B:125:0x0846, B:129:0x085b), top: B:17:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03e6 A[Catch: all -> 0x0960, TRY_ENTER, TryCatch #0 {all -> 0x0960, blocks: (B:18:0x0087, B:26:0x009a, B:33:0x00c2, B:37:0x00ec, B:44:0x02c6, B:47:0x02d8, B:50:0x02e7, B:54:0x02fc, B:57:0x0310, B:60:0x032f, B:63:0x034e, B:66:0x036d, B:69:0x038c, B:72:0x03ab, B:75:0x03e6, B:77:0x03ed, B:80:0x0505, B:83:0x0653, B:85:0x065b, B:87:0x0667, B:88:0x0672, B:90:0x067a, B:92:0x0686, B:93:0x0691, B:95:0x0699, B:101:0x0704, B:103:0x070f, B:112:0x07c3, B:115:0x07e1, B:119:0x0805, B:121:0x082b, B:125:0x0846, B:129:0x085b), top: B:17:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0505 A[Catch: all -> 0x0960, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0960, blocks: (B:18:0x0087, B:26:0x009a, B:33:0x00c2, B:37:0x00ec, B:44:0x02c6, B:47:0x02d8, B:50:0x02e7, B:54:0x02fc, B:57:0x0310, B:60:0x032f, B:63:0x034e, B:66:0x036d, B:69:0x038c, B:72:0x03ab, B:75:0x03e6, B:77:0x03ed, B:80:0x0505, B:83:0x0653, B:85:0x065b, B:87:0x0667, B:88:0x0672, B:90:0x067a, B:92:0x0686, B:93:0x0691, B:95:0x0699, B:101:0x0704, B:103:0x070f, B:112:0x07c3, B:115:0x07e1, B:119:0x0805, B:121:0x082b, B:125:0x0846, B:129:0x085b), top: B:17:0x0087 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0653 A[Catch: all -> 0x0960, TRY_ENTER, TryCatch #0 {all -> 0x0960, blocks: (B:18:0x0087, B:26:0x009a, B:33:0x00c2, B:37:0x00ec, B:44:0x02c6, B:47:0x02d8, B:50:0x02e7, B:54:0x02fc, B:57:0x0310, B:60:0x032f, B:63:0x034e, B:66:0x036d, B:69:0x038c, B:72:0x03ab, B:75:0x03e6, B:77:0x03ed, B:80:0x0505, B:83:0x0653, B:85:0x065b, B:87:0x0667, B:88:0x0672, B:90:0x067a, B:92:0x0686, B:93:0x0691, B:95:0x0699, B:101:0x0704, B:103:0x070f, B:112:0x07c3, B:115:0x07e1, B:119:0x0805, B:121:0x082b, B:125:0x0846, B:129:0x085b), top: B:17:0x0087 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ() {
        /*
            Method dump skipped, instructions count: 2481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.LIZJ():boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Pair<String[], long[]> LJII() {
        long j;
        boolean z;
        String LJIIL;
        File[] listFiles;
        HashMap hashMap = new HashMap();
        EnumC46736IVw[] values = EnumC46736IVw.values();
        int length = values.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            String str = null;
            if (i2 >= length) {
                break;
            }
            EnumC46736IVw enumC46736IVw = values[i2];
            if (enumC46736IVw == null || TextUtils.isEmpty(enumC46736IVw.getCacheDir())) {
                j = -1;
            } else {
                Long l = this.LJIJJLI.getExperiment().getExCacheDirSizeConfig().get(enumC46736IVw.getCacheDir());
                if (l != null && l.longValue() > 0) {
                    j = l.longValue();
                } else {
                    j = enumC46736IVw.getSizeMB();
                }
            }
            boolean z2 = !TextUtils.isEmpty(enumC46736IVw.getCacheDir());
            if (j > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z2 && z) {
                String LJIIIIZZ = LJIIIIZZ(enumC46736IVw);
                hashMap.put(LJIIIIZZ, Long.valueOf(j));
                if (!TextUtils.isEmpty(enumC46736IVw.getCacheDir())) {
                    if (C46739IVz.LIZ(enumC46736IVw) == 1) {
                        LJIIL = LJIIJ();
                    } else {
                        LJIIL = LJIIL();
                    }
                    File file = new File(LJIIL, enumC46736IVw.getCacheDir());
                    if (!file.isDirectory()) {
                        C16880lQ.LLLZZIL(file);
                    }
                    if (file.exists()) {
                        str = file.getAbsolutePath();
                    }
                }
                if (!TextUtils.isEmpty(str) && !str.equals(LJIIIIZZ)) {
                    if (!TextUtils.isEmpty(enumC46736IVw.getCacheDir())) {
                        Object value = IZ8.LLJJIJIL.getValue();
                        o.LJIIIIZZ(value, "<get-ExtCacheRootPathConfigExp>(...)");
                        Map<String, Boolean> removeOldRootPath = ((ExtCacheRootPathConfigExp) value).getRemoveOldRootPath();
                        if (removeOldRootPath != null && removeOldRootPath.containsKey(enumC46736IVw.getCacheDir()) && removeOldRootPath.get(enumC46736IVw.getCacheDir()).booleanValue()) {
                            if (!TextUtils.isEmpty(str)) {
                                File file2 = new File(str);
                                if (file2.exists() && file2.isDirectory() && (listFiles = file2.listFiles()) != null) {
                                    for (File file3 : listFiles) {
                                        if (file3.isDirectory()) {
                                            C77413UZt.LJJIFFI(file3);
                                        } else {
                                            C16880lQ.LLLZZIL(file3);
                                        }
                                    }
                                    C16880lQ.LLLZZIL(file2);
                                }
                            }
                        }
                    }
                    hashMap.put(str, Long.valueOf(j));
                }
            }
            i2++;
        }
        if (hashMap.size() <= 0) {
            return null;
        }
        String[] strArr = new String[hashMap.size()];
        long[] jArr = new long[hashMap.size()];
        for (Map.Entry entry : hashMap.entrySet()) {
            strArr[i] = entry.getKey();
            jArr[i] = ((Long) entry.getValue()).longValue() * 1048576;
            i++;
        }
        return new Pair<>(strArr, jArr);
    }

    public final String LJIIJ() {
        if (!TextUtils.isEmpty(this.LJJ)) {
            return this.LJJ;
        }
        Application application = C46982IcE.LIZ;
        if (application == null) {
            return null;
        }
        File LLIIIL = C16880lQ.LLIIIL(application);
        if (IZ8.LJJIJIL()) {
            if (C46982IcE.LIZIZ().isDebug()) {
                LLIIIL = C77413UZt.LJIIL(application);
            }
            if (TextUtils.equals("playback_simulator_test", C46982IcE.LIZIZ().getChannel())) {
                LLIIIL = C77413UZt.LJIIL(application);
            }
        }
        if (LLIIIL == null) {
            return null;
        }
        String absolutePath = LLIIIL.getAbsolutePath();
        this.LJJ = absolutePath;
        return absolutePath;
    }

    public final String LJIIL() {
        if (!TextUtils.isEmpty(this.LJJI)) {
            return this.LJJI;
        }
        Application application = C46982IcE.LIZ;
        if (application == null) {
            return null;
        }
        File LLIIJLIL = C16880lQ.LLIIJLIL(application);
        if (IZ8.LJJIJIL()) {
            if (C46982IcE.LIZIZ().isDebug()) {
                LLIIJLIL = C16880lQ.LLIIJI(application, null);
            }
            if (TextUtils.equals("playback_simulator_test", C46982IcE.LIZIZ().getChannel())) {
                LLIIJLIL = C16880lQ.LLIIJI(application, null);
            }
        }
        if (LLIIJLIL == null && (LLIIJLIL = C16880lQ.LLIIJLIL(application)) == null) {
            return null;
        }
        String absolutePath = LLIIJLIL.getAbsolutePath();
        this.LJJI = absolutePath;
        return absolutePath;
    }

    public final void LJJIFFI() {
        List<C46898Ias> engineStaticOptionList = this.LJIJJLI.getExperiment().engineStaticOptionList();
        if (engineStaticOptionList == null || engineStaticOptionList.size() <= 0) {
            return;
        }
        for (C46898Ias c46898Ias : engineStaticOptionList) {
            Object obj = c46898Ias.LIZIZ;
            if (obj != null) {
                try {
                    int i = c46898Ias.LIZJ;
                    if (i == 1) {
                        TTVideoEngine.LJLLLLLL(c46898Ias.LIZ, ((Integer) obj).intValue());
                    } else if (i == 2) {
                        TTVideoEngine.LLFFF(c46898Ias.LIZ, ((Long) obj).longValue());
                    } else if (i == 4) {
                        TTVideoEngine.LLILLIZIL(c46898Ias.LIZ, (String) obj);
                    } else if (i == 5) {
                        TTVideoEngine.LLILLIZIL(c46898Ias.LIZ, ((JSONObject) obj).toString());
                    } else if (i == 6) {
                        TTVideoEngine.LLILLIZIL(c46898Ias.LIZ, ((JSONArray) obj).toString());
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void LJJII() {
        this.LJIJJLI.getSpeedManager().LIZJ();
        if (this.LJIJJLI.isDashABREnabled()) {
            TTVideoEngine.LJIIIZ = this.LJIJJLI.getExperiment().PlayerAbABRAlgoExp();
            int PlayerAbABRSpeedPredictAlgoExp = this.LJIJJLI.getExperiment().PlayerAbABRSpeedPredictAlgoExp();
            int PlayerAbABRSpeedPredictTimeIntervalExp = this.LJIJJLI.getExperiment().PlayerAbABRSpeedPredictTimeIntervalExp();
            this.LJIJJLI.getExperiment().getPreloaderExpModel().getClass();
            int i = this.LJIJJLI.getExperiment().getPreloaderExpModel().LJIILLIIL;
            if (C78966Uyw.LJLL != null) {
                return;
            }
            TTVideoEngine.LJIIIIZZ = PlayerAbABRSpeedPredictAlgoExp;
            TTVideoEngine.LJI = 0;
            TTVideoEngine.LJII = i;
            if (TTVideoEngine.LJIIJ == 0) {
                TTVideoEngine.LJIIJ = 1;
            }
            if (PlayerAbABRSpeedPredictTimeIntervalExp > 0) {
                TTVideoEngine.LJ = PlayerAbABRSpeedPredictTimeIntervalExp;
                TTVideoEngine.LJFF = PlayerAbABRSpeedPredictTimeIntervalExp;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[ABR] abrSpeedPredictUpdateIntervalMs:");
            LIZ.append(PlayerAbABRSpeedPredictTimeIntervalExp);
            TTVideoEngineLog.d("TTVideoEngine", X1D.LIZIZ(LIZ));
            if (C78966Uyw.LJLL != null) {
                return;
            }
            TTVideoEngineLog.d("TTVideoEngine", C16880lQ.LLLZI(Locale.US, "[ABR] start speed predictor, type:%d，intervalMs:%d", new Object[]{Integer.valueOf(PlayerAbABRSpeedPredictAlgoExp), Integer.valueOf(PlayerAbABRSpeedPredictTimeIntervalExp)}));
            C78966Uyw.LJLL = new DefaultSpeedPredictor(PlayerAbABRSpeedPredictAlgoExp);
        }
    }

    @Override // X.InterfaceC47342Ii2
    public final void clearCache() {
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        if (dataLoaderHelper.LIZJ != 0) {
            return;
        }
        dataLoaderHelper.LJJ.LIZJ(1);
        try {
            AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIZ;
            if (aVMDLDataLoader == null) {
                C78253UnR.LIZLLL("DataLoaderHelper", "mInnerDataLoader == null");
            } else {
                aVMDLDataLoader.clearAllCaches();
            }
        } catch (Throwable unused) {
        }
        dataLoaderHelper.LJJ.LJ(1);
    }

    @Override // X.InterfaceC47342Ii2
    public final void initAppInfo() {
        if (this.LJJIIJZLJL) {
            return;
        }
        HashMap hashMap = new HashMap();
        String serverDeviceId = C47335Ihv.LIZ().getAppLog().getServerDeviceId();
        hashMap.put("deviceid", serverDeviceId);
        hashMap.put("appname", C46982IcE.LIZIZ().getAppName());
        hashMap.put("appid", Integer.valueOf(C46982IcE.LIZIZ().getAppID()));
        hashMap.put("appversion", C46982IcE.LIZIZ().getAppVersion());
        hashMap.put("screen_width", Integer.valueOf(C77119UOl.LJIILJJIL(C46982IcE.LIZ)));
        hashMap.put("screen_height", Integer.valueOf(C77119UOl.LJIILIIL(C46982IcE.LIZ)));
        Object value = IZ8.t1.getValue();
        o.LJIIIIZZ(value, "<get-enableDeviceIdSecret>(...)");
        if (((Boolean) value).booleanValue() && !TextUtils.isEmpty(serverDeviceId)) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(serverDeviceId.getBytes());
                serverDeviceId = new BigInteger(1, messageDigest.digest()).toString(16);
            } catch (Exception unused) {
            }
            if (!TextUtils.isEmpty(serverDeviceId)) {
                hashMap.put("device_id_secret", serverDeviceId);
            }
        }
        TTVideoEngine.LJJLJ(hashMap);
        InterfaceC47078Idm appLog = C47335Ihv.LIZ().getAppLog();
        TextUtils.isEmpty(C47752Ioe.LJLIL);
        appLog.LIZ();
        this.LJJIIJZLJL = true;
    }

    public EnginePreloader() {
        boolean z;
        if (((Boolean) IZ8.LJLJJLL.getValue()).booleanValue() || C47335Ihv.LIZ().getExperiment().enableMDLInitAsync()) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = z;
        this.LJ = new CopyOnWriteArrayList();
        this.LJIIIIZZ = new Handler(C16880lQ.LLJJJJ());
        this.LJIIJ = Collections.synchronizedMap(new C46644ISi());
        this.LJIIJJI = new ConcurrentHashMap<>();
        this.LJIIL = new ConcurrentLinkedQueue<>();
        this.LJIILJJIL = new CopyOnWriteArrayList();
        new HashMap();
        this.LJIILLIIL = new ConcurrentHashMap(200);
        this.LJIIZILJ = new ConcurrentHashMap(200);
        this.LJIJ = new ConcurrentHashMap(200);
        this.LJIJI = new HashSet();
        this.LJIJJ = new HashMap();
        this.LJJ = null;
        this.LJJI = null;
        this.LJJIFFI = new C47116IeO(this);
        this.LJJII = new CountDownLatch(1);
        this.LJJIII = new ConcurrentHashMap<>();
        this.LJJIIJ = new ConcurrentHashMap<>();
        this.LJJIIJZLJL = false;
        this.LJIJJLI = C47335Ihv.LIZ();
        Object value = IZ8.c0.getValue();
        o.LJIIIIZZ(value, "<get-interceptOnTaskProgressCallback>(...)");
        this.LJIL = ((Boolean) value).booleanValue();
        Object value2 = IZ8.LLLLLLLZIL.getValue();
        o.LJIIIIZZ(value2, "<get-SC_PRELOAD_SEQUENCE_SINGLE_THREAD>(...)");
        if (((Boolean) value2).booleanValue()) {
            Object value3 = IZ8.LLLLZ.getValue();
            o.LJIIIIZZ(value3, "<get-SC_PRELOAD_SEQUENCE…GLE_THREAD_PRIORITY>(...)");
            HandlerThread handlerThread = new HandlerThread("SC_Preload_Thread", ((Number) value3).intValue());
            handlerThread.start();
            new Handler(handlerThread.getLooper());
        }
    }

    public static void LJIJJ() {
        C46982IcE.LIZIZ().isDebug();
    }

    public final String LJIIIZ() {
        String LJIIJ = LJIIJ();
        if (LJIIJ == null) {
            return null;
        }
        File file = new File(LJIIJ, LJJIIZI);
        if (!file.exists()) {
            file.mkdirs();
        }
        this.LJI = file;
        return file.getAbsolutePath();
    }

    @Override // X.InterfaceC47342Ii2
    public final void cancelAll() {
        LJIJJ();
        C47148Ieu.LIZ.LJIJJ();
        Map<String, Integer> map = this.LJIILLIIL;
        if (map != null) {
            ((ConcurrentHashMap) map).clear();
        }
        if (this.LJIJ != null) {
            ArrayList arrayList = new ArrayList(((ConcurrentHashMap) this.LJIJ).values());
            ((ConcurrentHashMap) this.LJIJ).clear();
            Iterator it = ((CopyOnWriteArrayList) this.LJIILJJIL).iterator();
            while (it.hasNext()) {
                ((IFW) it.next()).LIZJ(arrayList);
            }
        }
    }

    @Override // X.InterfaceC47342Ii2
    public final String getCacheTopDirPath() {
        return LJIIJ();
    }

    @Override // X.InterfaceC47342Ii2
    public final int startMethodHook() {
        AVMDLDataLoader aVMDLDataLoader = AVMDLDataLoader.getInstance();
        Class<?> cls = aVMDLDataLoader.getClass();
        try {
            Field declaredField = cls.getDeclaredField("mState");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVMDLDataLoader);
            if ((obj instanceof Integer) && ((Integer) obj).intValue() == 1) {
                return 0;
            }
            Method declaredMethod = cls.getDeclaredMethod("initNativeHandle", new Class[0]);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(aVMDLDataLoader, new Object[0]);
            Method declaredMethod2 = cls.getDeclaredMethod("startInternal", new Class[0]);
            declaredMethod2.setAccessible(true);
            declaredMethod2.invoke(aVMDLDataLoader, new Object[0]);
            return 0;
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchFieldException | NoSuchMethodException | SecurityException | InvocationTargetException e) {
            C16880lQ.LLLLIIL(e);
            if (IXB.LIZIZ != null) {
                C78983UzD.LJIJ(e, "lazy_init_mdl AVMDLDataLoaderHooker startMethodHook exception");
            }
            if (!C46982IcE.LIZIZ().isDebug()) {
                return -1;
            }
            throw new RuntimeException(e);
        }
    }

    @Override // X.InterfaceC47342Ii2
    public final File getCacheFile() {
        return this.LJI;
    }

    @Override // X.InterfaceC47342Ii2
    public final boolean isInited() {
        return this.LIZIZ;
    }

    public final boolean LJ(String str) {
        boolean z;
        if (IZ8.LJJIJLIJ()) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Object value = IZ8.LJIIZILJ.getValue();
        o.LJIIIIZZ(value, "<get-fixFeedPreloadSrConfig>(...)");
        if (((Boolean) value).booleanValue() && (str.contains("feed") || str.contains("scene_home_page"))) {
            z = true;
        } else {
            z = false;
        }
        if ((str.contains("feed") || z) && this.LJIJJLI.getExperiment().enableSuperResolution()) {
            return true;
        }
        return false;
    }

    public final String LJIIIIZZ(EnumC46736IVw enumC46736IVw) {
        String LJIIJ;
        if (enumC46736IVw == null || TextUtils.isEmpty(enumC46736IVw.getCacheDir())) {
            return null;
        }
        if (C46739IVz.LIZ(enumC46736IVw) == 1) {
            LJIIJ = LJIIL();
        } else {
            LJIIJ = LJIIJ();
        }
        File file = new File(LJIIJ, enumC46736IVw.getCacheDir());
        if (!file.isDirectory()) {
            C16880lQ.LLLZZIL(file);
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    public final IXW LJIIJJI(SimVideoUrlModel simVideoUrlModel) {
        IXW ixw;
        if (this.LJIJJLI == null || simVideoUrlModel == null) {
            return null;
        }
        if (!TextUtils.isEmpty(simVideoUrlModel.getSourceId()) && (ixw = this.LJJIIJ.get(simVideoUrlModel.getSourceId())) != null) {
            return ixw;
        }
        IY2 createVideoUrlProcessor = this.LJIJJLI.createVideoUrlProcessor();
        if (TextUtils.isEmpty(simVideoUrlModel.getDashVideoModelStr())) {
            return null;
        }
        IXT ixt = new IXT();
        ixt.LIZ = simVideoUrlModel;
        ixt.LJ = new C46915Ib9(C46917IbB.LIZ(simVideoUrlModel.getDashVideoModelStr()));
        ixt.LIZIZ = false;
        ixt.LIZJ = IZ8.LJJIJLIJ();
        IXW LIZIZ = createVideoUrlProcessor.LIZIZ(ixt);
        if (LIZIZ == null) {
            return null;
        }
        if (!TextUtils.isEmpty(simVideoUrlModel.getSourceId())) {
            this.LJJIIJ.put(simVideoUrlModel.getSourceId(), LIZIZ);
        }
        return LIZIZ;
    }

    public final long LJIILIIL(String str) {
        C47083Idr LJIJ;
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        if (IZ8.LJJJJLL() || this.LJIJJLI.getExperiment().getUSE_CALLBACK_CACHE_SIZE()) {
            C47076Idk c47076Idk = (C47076Idk) ((ConcurrentHashMap) this.LJIIZILJ).get(str);
            if (c47076Idk != null) {
                return c47076Idk.LJLILLLLZI;
            }
            if (IZ8.LJJJJZ()) {
                return 0L;
            }
        }
        Object value = IZ8.i.getValue();
        o.LJIIIIZZ(value, "<get-enableUseNewGetCacheMethod>(...)");
        if (((Boolean) value).booleanValue() || this.LJIJJLI.getExperiment().enableUseNewGetCacheMethod()) {
            return C47148Ieu.LIZ.LJJJJI(str);
        }
        Object value2 = IZ8.N.getValue();
        o.LJIIIIZZ(value2, "<get-isUseTryLockForCacheInfo>(...)");
        if (((Boolean) value2).booleanValue() && Looper.myLooper() == C16880lQ.LLJJJJ()) {
            DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
            Object value3 = IZ8.O.getValue();
            o.LJIIIIZZ(value3, "<get-tryLockTimeoutForCacheInfo>(...)");
            LJIJ = dataLoaderHelper.LJIJI(str, ((Number) value3).longValue(), TimeUnit.MILLISECONDS);
        } else {
            LJIJ = C47148Ieu.LIZ.LJIJ(str);
        }
        if (LJIJ != null) {
            j = LJIJ.LIZIZ;
        }
        return (int) j;
    }

    public final long LJIILJJIL(SimVideoUrlModel simVideoUrlModel) {
        String str;
        if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4()) {
            SimBitRate hitDashVideoBitrate = simVideoUrlModel.getHitDashVideoBitrate();
            SimAudioBitrate hitDashAudioBitrate = simVideoUrlModel.getHitDashAudioBitrate();
            String str2 = "";
            if (hitDashVideoBitrate == null) {
                str = "";
            } else {
                str = hitDashVideoBitrate.getPlayAddr().getFileHash();
            }
            if (hitDashAudioBitrate != null && hitDashAudioBitrate.getAudioMeta() != null) {
                str2 = hitDashAudioBitrate.getAudioMeta().LJIILL;
            }
            if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                return (int) (LJIILL(str2) + LJIILL(str));
            }
        }
        String videoId = simVideoUrlModel.getDashVideoId();
        o.LJIIIZ(videoId, "videoId");
        C47164IfA c47164IfA = C46917IbB.LIZIZ.get((Object) videoId);
        long j = 0;
        if (IZ8.LJJIJIIJI()) {
            if (c47164IfA == null) {
                return 0L;
            }
            if (c47164IfA.LIZJ != null) {
                C47160If6 LJIIL = TTVideoEngine.LJIIL(c47164IfA, 0);
                if (LJIIL != null) {
                    j = 0 + TTVideoEngine.LJIILJJIL(LJIIL.LIZIZ(15));
                }
                C47160If6 LJIIL2 = TTVideoEngine.LJIIL(c47164IfA, 1);
                if (LJIIL2 != null) {
                    j += TTVideoEngine.LJIILJJIL(LJIIL2.LIZIZ(15));
                }
            }
            return (int) j;
        }
        if (c47164IfA == null) {
            return 0L;
        }
        if (c47164IfA.LIZJ != null) {
            j = TTVideoEngine.LJIILL(c47164IfA, TTVideoEngine.LJIIJJI(c47164IfA, C46917IbB.LIZ, 1));
        }
        return (int) j;
    }

    public final long LJIILL(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        if (IZ8.LJJJJLL() || this.LJIJJLI.getExperiment().getUSE_CALLBACK_CACHE_SIZE()) {
            C47076Idk c47076Idk = (C47076Idk) ((ConcurrentHashMap) this.LJIIZILJ).get(str);
            if (c47076Idk != null) {
                return c47076Idk.LJLILLLLZI;
            }
            if (IZ8.LJJJJZ()) {
                return 0L;
            }
        }
        return C47148Ieu.LIZ.LJJIII(str);
    }

    public final IY1 LJIJ(SimVideoUrlModel simVideoUrlModel) {
        IY1 iy1;
        if (this.LJIJJLI == null || simVideoUrlModel == null) {
            return null;
        }
        if (!TextUtils.isEmpty(simVideoUrlModel.getSourceId()) && (iy1 = this.LJJIII.get(simVideoUrlModel.getSourceId())) != null) {
            return iy1;
        }
        IY1 LIZ = this.LJIJJLI.createVideoUrlProcessor().LIZ(simVideoUrlModel, IXN.LIZJ.getPlayerType());
        if (LIZ == null || TextUtils.isEmpty(simVideoUrlModel.getSourceId())) {
            return null;
        }
        this.LJJIII.put(simVideoUrlModel.getSourceId(), LIZ);
        return LIZ;
    }

    public final void LJIL(String str) {
        if (!TextUtils.isEmpty(str) && this.LJIJJLI.getExperiment().EnablePreloaderPreConnect().booleanValue()) {
            DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
            if (dataLoaderHelper.LIZJ != 0 || TextUtils.isEmpty(str)) {
                return;
            }
            dataLoaderHelper.LJJ.LIZJ(1);
            try {
                Uri parse = Uri.parse(str);
                int port = parse.getPort();
                if (port == -1) {
                    if (str.startsWith("https")) {
                        port = 443;
                    } else {
                        port = 80;
                    }
                }
                AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIZ;
                if (aVMDLDataLoader != null) {
                    aVMDLDataLoader.preConnectByHost(parse.getHost(), port);
                }
            } finally {
                dataLoaderHelper.LJJ.LJ(1);
            }
        }
    }

    public final void LJJI(Map<String, String> map) {
        if (this.LJIJJLI.getExperiment().PlayerAbMedialoaderEnableBackupDnsIPExp() == 1 && map != null) {
            try {
                if (map.size() > 0) {
                    for (String str : map.keySet()) {
                        String str2 = map.get(str);
                        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
                        dataLoaderHelper.getClass();
                        AVMDLDNSParser.getInstance().setBackUpIP(str, str2);
                        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                            dataLoaderHelper.LJJIIZI = 1;
                        }
                    }
                }
            } catch (Throwable th) {
                C46982IcE.LJI().ensureNotReachHere(th, "setDnsBackupIpMap fail.");
            }
        }
    }

    @Override // X.InterfaceC47342Ii2
    public final void addDownloadProgressListener(InterfaceC47101Ie9 interfaceC47101Ie9) {
        Iterator it = ((CopyOnWriteArrayList) this.LJ).iterator();
        while (it.hasNext()) {
            if (((Reference) it.next()).get() == interfaceC47101Ie9) {
                return;
            }
        }
        ((CopyOnWriteArrayList) this.LJ).add(new WeakReference(interfaceC47101Ie9));
    }

    @Override // X.InterfaceC47342Ii2
    public final void addPreloadCallback(IFW ifw) {
        if (!((CopyOnWriteArrayList) this.LJIILJJIL).contains(ifw)) {
            ((CopyOnWriteArrayList) this.LJIILJJIL).add(ifw);
        }
    }

    @Override // X.InterfaceC47342Ii2
    public final int cacheSize(SimVideoUrlModel simVideoUrlModel) {
        long LJIILIIL;
        if (simVideoUrlModel == null) {
            return 0;
        }
        String bitRatedRatioUri = simVideoUrlModel.getBitRatedRatioUri();
        if (!TextUtils.isEmpty(simVideoUrlModel.getDashVideoId())) {
            LJIILIIL = LJIILJJIL(simVideoUrlModel);
        } else {
            LJIILIIL = LJIILIIL(bitRatedRatioUri);
        }
        return (int) LJIILIIL;
    }

    @Override // X.InterfaceC47342Ii2
    public final void cancelPreload(SimVideoUrlModel simVideoUrlModel) {
        String dashVideoId;
        if (simVideoUrlModel != null) {
            if (TextUtils.isEmpty(simVideoUrlModel.getDashVideoId())) {
                dashVideoId = simVideoUrlModel.getBitRatedRatioUri();
            } else {
                dashVideoId = simVideoUrlModel.getDashVideoId();
            }
            C47148Ieu.LIZ.LJIL(dashVideoId);
            ((ConcurrentHashMap) this.LJIILLIIL).remove(dashVideoId);
            Object remove = ((ConcurrentHashMap) this.LJIJ).remove(dashVideoId);
            if (remove != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(remove);
                Iterator it = ((CopyOnWriteArrayList) this.LJIILJJIL).iterator();
                while (it.hasNext()) {
                    ((IFW) it.next()).LIZJ(arrayList);
                }
            }
        }
    }

    @Override // X.InterfaceC47342Ii2
    public final void destroyScene(String str) {
        if (IZ8.LJJIJIIJIL()) {
            ((HashSet) this.LJIJI).remove(str);
        }
        if (IZ8.LJJIIZI()) {
            ((HashMap) this.LJIJJ).remove(str);
        }
        C46865IaL c46865IaL = C46877IaX.LIZ;
        c46865IaL.getClass();
        if (!TextUtils.isEmpty(str)) {
            ((ConcurrentHashMap) c46865IaL.LIZ).remove(str);
            if (str.equals(c46865IaL.LIZJ)) {
                c46865IaL.LIZJ = "";
            }
        }
        C47090Idy c47090Idy = C47091Idz.LIZ;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("destroy scene ");
        LIZ.append(str);
        C78253UnR.LJI("PreloadConfig", X1D.LIZIZ(LIZ));
        C47148Ieu.LIZ.getClass();
        C47147Iet.LIZ.LJ().destroyScene(str);
        String str2 = c47090Idy.LIZ;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        c47090Idy.LIZ = null;
    }

    @Override // X.InterfaceC47342Ii2
    public final long getDashSize(SimVideoUrlModel simVideoUrlModel) {
        String str;
        if (simVideoUrlModel.hasDashBitrateAndSelectAsMp4()) {
            SimBitRate hitDashVideoBitrate = simVideoUrlModel.getHitDashVideoBitrate();
            SimAudioBitrate hitDashAudioBitrate = simVideoUrlModel.getHitDashAudioBitrate();
            String str2 = "";
            if (hitDashVideoBitrate == null || hitDashVideoBitrate.getPlayAddr() == null) {
                str = "";
            } else {
                str = hitDashVideoBitrate.getPlayAddr().getFileHash();
            }
            if (hitDashAudioBitrate != null && hitDashAudioBitrate.getAudioMeta() != null) {
                str2 = hitDashAudioBitrate.getAudioMeta().LJIILL;
            }
            if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
                C47083Idr LJIJ = dataLoaderHelper.LJIJ(str);
                C47083Idr LJIJ2 = dataLoaderHelper.LJIJ(str2);
                if (LJIJ != null && LJIJ2 != null) {
                    return LJIJ.LIZ + LJIJ2.LIZ;
                }
            }
        }
        return -1L;
    }

    @Override // X.InterfaceC47342Ii2
    public final long getPreloadedSize(String str) {
        if (C47148Ieu.LIZ != null) {
            return LJIILIIL(str);
        }
        return 0L;
    }

    @Override // X.InterfaceC47342Ii2
    public final C87748YcC getRequestInfo(SimVideoUrlModel simVideoUrlModel) {
        String dashVideoId;
        List<C87748YcC> list;
        if (TextUtils.isEmpty(simVideoUrlModel.getDashVideoId())) {
            dashVideoId = simVideoUrlModel.getBitRatedRatioUri();
        } else {
            dashVideoId = simVideoUrlModel.getDashVideoId();
        }
        if (!TextUtils.isEmpty(dashVideoId) && this.LJIIJ.containsKey(dashVideoId) && (list = this.LJIIJ.get(dashVideoId)) != null && list.size() > 0) {
            return (C87748YcC) C64504PTg.LIZIZ(list, -1, list);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7 A[EDGE_INSN: B:40:0x00e7->B:11:0x00e7 BREAK  A[LOOP:0: B:14:0x0030->B:36:0x0030], SYNTHETIC] */
    @Override // X.InterfaceC47342Ii2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C87748YcC> getRequestInfoList(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getDashVideoId()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lda
            java.lang.String r5 = r10.getBitRatedRatioUri()
        Le:
            java.util.Map<java.lang.String, java.util.List<X.YcC>> r0 = r9.LJIIJ
            java.lang.Object r0 = r0.get(r5)
            java.util.Collection r0 = (java.util.Collection) r0
            r8 = 0
            if (r0 != 0) goto Ld3
            r4 = r8
        L1a:
            com.ss.android.ugc.playerkit.simapicommon.IAppConfig r0 = X.C46982IcE.LIZIZ()
            boolean r0 = r0.isDebug()
            if (r0 != 0) goto L30
            X.IjJ r0 = r9.LJIJJLI
            com.ss.android.ugc.aweme.video.preload.api.IPreloaderExperiment r0 = r0.getExperiment()
            boolean r0 = r0.EnableGetCDNLogExperiment()
            if (r0 == 0) goto Le7
        L30:
            com.ss.ttvideoengine.DataLoaderHelper r6 = X.C47148Ieu.LIZ
            java.lang.String r7 = "DataLoaderHelper"
            int r0 = r6.LIZJ
            r3 = 1
            if (r0 != 0) goto L3f
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L83
        L3f:
            r2 = r8
        L40:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "getRequestInfoList getCDNLog loop :"
            r1.append(r0)
            r1.append(r2)
            X.X1D.LIZIZ(r1)
            LJIJJ()
            if (r2 == 0) goto Le7
            java.lang.String r2 = r2.toString()
            java.lang.Class<com.ss.android.ugc.playerkit.model.CDNLog> r1 = com.ss.android.ugc.playerkit.model.CDNLog.class
            com.google.gson.Gson r0 = X.C78866UxK.LJLILLLLZI
            if (r0 != 0) goto L65
            com.google.gson.Gson r0 = new com.google.gson.Gson
            r0.<init>()
            X.C78866UxK.LJLILLLLZI = r0
        L65:
            com.google.gson.Gson r0 = X.C78866UxK.LJLILLLLZI
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r0, r2, r1)
            com.ss.android.ugc.playerkit.model.CDNLog r1 = (com.ss.android.ugc.playerkit.model.CDNLog) r1
            r1.LIZ = r3
            X.YcC r0 = new X.YcC
            r0.<init>(r1)
            if (r4 == 0) goto L7a
            r4.add(r0)
            goto L30
        L7a:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r0)
            goto L30
        L83:
            X.Io8 r0 = r6.LJJ
            r0.LIZJ(r3)
            com.ss.mediakit.medialoader.AVMDLDataLoader r0 = r6.LJIIIZ     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Le0
            if (r0 == 0) goto Lcc
            java.lang.String r0 = r0.getCDNLog(r5)     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Le0
            if (r0 == 0) goto Lcc
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Le0
            r2.<init>(r0)     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Le0
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Le0
            java.lang.String r0 = "get cdn log suc"
            r1.append(r0)     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Le0
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Le0
            r1.append(r0)     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Le0
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Le0
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r7, r0)     // Catch: java.lang.Exception -> Lb4 java.lang.Throwable -> Le0
            X.Io8 r0 = r6.LJJ
            r0.LJ(r3)
            goto L40
        Lb4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Le0
            java.lang.String r0 = "get log exception"
            r1.append(r0)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Le0
            r1.append(r0)     // Catch: java.lang.Throwable -> Le0
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> Le0
            com.ss.ttvideoengine.utils.TTVideoEngineLog.d(r7, r0)     // Catch: java.lang.Throwable -> Le0
        Lcc:
            X.Io8 r0 = r6.LJJ
            r0.LJ(r3)
            goto L3f
        Ld3:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            goto L1a
        Lda:
            java.lang.String r5 = r10.getDashVideoId()
            goto Le
        Le0:
            r1 = move-exception
            X.Io8 r0 = r6.LJJ
            r0.LJ(r3)
            throw r1
        Le7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.getRequestInfoList(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel):java.util.List");
    }

    @Override // X.InterfaceC47342Ii2
    public final long getVideoSize(String str) {
        C47083Idr LJIJ = C47148Ieu.LIZ.LJIJ(str);
        if (LJIJ != null) {
            return LJIJ.LIZ;
        }
        return 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (((java.lang.Boolean) r1).booleanValue() == false) goto L13;
     */
    @Override // X.InterfaceC47342Ii2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isCache(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r9) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.isCache(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (((java.lang.Boolean) r1).booleanValue() == false) goto L13;
     */
    @Override // X.InterfaceC47342Ii2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isCacheCompleted(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r9) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.isCacheCompleted(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel):boolean");
    }

    @Override // X.InterfaceC47342Ii2
    public final boolean isCachePure(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel == null) {
            return false;
        }
        C47083Idr LJIJ = C47148Ieu.LIZ.LJIJ(simVideoUrlModel.getBitRatedRatioUri());
        if (LJIJ == null || LJIJ.LIZIZ <= 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC47342Ii2
    public final void makeCurrentScene(String str) {
        C46865IaL c46865IaL = C46877IaX.LIZ;
        c46865IaL.getClass();
        if (!TextUtils.isEmpty(str)) {
            c46865IaL.LIZJ = str;
            if (c46865IaL.LIZIZ == null) {
                c46865IaL.LIZIZ = str;
            }
        }
        if (IZ8.LJJIJIIJIL() && !((HashSet) this.LJIJI).contains(str)) {
            return;
        }
        C47090Idy c47090Idy = C47091Idz.LIZ;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("move to scene ");
            LIZ.append(str);
            C78253UnR.LJI("PreloadConfig", X1D.LIZIZ(LIZ));
            String str2 = c47090Idy.LIZ;
            if (str2 == null || !str2.equals(str)) {
                c47090Idy.LIZ = str;
                C47148Ieu.LIZ.getClass();
                C47147Iet.LIZ.LJ().switchToScene(str);
            }
        }
        if (IZ8.LJJIIZI() && ((HashMap) this.LJIJJ).get(str) != null) {
            TTVideoEngine.LIZ(str, (List) ((HashMap) this.LJIJJ).get(str));
            ((HashMap) this.LJIJJ).remove(str);
        }
    }

    @Override // X.InterfaceC47342Ii2
    public final void removeDownloadProgressListener(InterfaceC47101Ie9 interfaceC47101Ie9) {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) this.LJ).iterator();
        while (it.hasNext()) {
            Reference reference = (Reference) it.next();
            if (reference.get() == interfaceC47101Ie9) {
                arrayList.add(reference);
            }
        }
        ((CopyOnWriteArrayList) this.LJ).removeAll(arrayList);
    }

    @Override // X.InterfaceC47342Ii2
    public final void removePriorityTaskByContextKey(String str) {
        if (TextUtils.isEmpty(str) || !this.LJIIIZ) {
            return;
        }
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        if (str != null) {
            if (dataLoaderHelper.LJJIJLIJ != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(dataLoaderHelper);
                arrayList.add(str);
                dataLoaderHelper.LJJIJLIJ.LIZ(116, arrayList);
                return;
            }
            C47147Iet.LIZ.LJ().removePriorityTask(str);
            return;
        }
        dataLoaderHelper.getClass();
    }

    @Override // X.InterfaceC47342Ii2
    public final void setSmartPreloadAlgorithmJson(String str) {
        TTVideoEngine.LJJLIL(31002, str);
    }

    @Override // X.InterfaceC47342Ii2
    public final void setSmartPreloadPlayTaskAlgorithmJson(String str) {
        TTVideoEngine.LJJLIL(StrategyCenter.ALGO_CONFIG_STRING_SMART_RANGE_REQUEST, str);
    }

    @Override // X.InterfaceC47342Ii2
    public final void setTimelinessAlgorithmJson(String str) {
        TTVideoEngine.LJJLIL(31003, str);
    }

    @Override // X.InterfaceC47342Ii2
    public final void smartPreloadBusinessEvent(String str) {
        C47147Iet.LIZ.LJ().businessEvent(31201, str);
    }

    @Override // X.InterfaceC47342Ii2
    public final void smartPreloadPlayTaskBusinessEvent(String str) {
        C47147Iet.LIZ.LJ().businessEvent(StrategyCenter.SMART_RANGE_REQUEST_LABEL, str);
    }

    @Override // X.InterfaceC47342Ii2
    public final void smartPreloadWeakNetBusinessEvent(String str) {
        C47147Iet.LIZ.LJ().businessEvent(31221, str);
    }

    @Override // X.InterfaceC47342Ii2
    public final void smartTimelinessPreloadBusinessEvent(String str) {
        C47147Iet.LIZ.LJ().businessEvent(31202, str);
    }

    @Override // X.InterfaceC47342Ii2
    public final void updateAppState(boolean z) {
        int i;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        C47147Iet.LIZ.LJ().businessEvent(1001, i);
    }

    @Override // X.InterfaceC47342Ii2
    public final void updateDnsBackupIpMap(Map<String, String> map) {
        if (this.LIZIZ) {
            LJJI(map);
        } else {
            this.LJIILIIL = map;
        }
    }

    public final C47069Idd LJIILLIIL(SimVideoUrlModel simVideoUrlModel, C26206AQg c26206AQg) {
        int i;
        String LJIIIIZZ;
        if (simVideoUrlModel == null) {
            return null;
        }
        C47069Idd LJI = LJI(simVideoUrlModel, this.LJIJJLI.createVideoUrlProcessor(), "");
        if (c26206AQg != null && LJI != null) {
            int i2 = c26206AQg.LIZ;
            if (i2 > 0) {
                LJI.LIZ = i2;
            }
            int i3 = C26208AQi.LIZ[c26206AQg.LIZIZ.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    i = 0;
                } else {
                    i = 10;
                }
            } else {
                i = 100;
            }
            LJI.LJI = i;
            C26210AQk c26210AQk = c26206AQg.LIZJ;
            if (c26210AQk != null) {
                if (!TextUtils.isEmpty(c26210AQk.LIZ)) {
                    LJIIIIZZ = c26210AQk.LIZ;
                } else {
                    LJIIIIZZ = LJIIIIZZ(null);
                }
                LJI.LJII = LJIIIIZZ;
                LJI.LJIIIIZZ = c26210AQk.LIZIZ;
            }
            LJI.LIZJ = new C47118IeQ(c26206AQg);
        }
        return LJI;
    }

    public final void LJJ(String str, String str2) {
        if (this.LJIIL.size() > 50) {
            this.LJIIJJI.remove(this.LJIIL.poll());
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.LJIIL.add(str);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("put key:");
            LIZ.append(str);
            LIZ.append(", sourceId:");
            LIZ.append(str2);
            X1D.LIZIZ(LIZ);
            LJIJJ();
            this.LJIIJJI.put(str, str2);
        }
    }

    @Override // X.InterfaceC47342Ii2
    public final void addPreloadItem(SimVideoUrlModel simVideoUrlModel, C26206AQg c26206AQg) {
        if (simVideoUrlModel == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VIDEO@");
        LIZ.append(simVideoUrlModel.getSourceId());
        SimRadar.traceGroup(X1D.LIZIZ(LIZ)).LIZIZ("addPreloadItem");
        if (this.LJIIIZ) {
            if (this.LIZ) {
                TTVideoEngine.LIZIZ(LJIILLIIL(simVideoUrlModel, c26206AQg));
            } else {
                C46982IcE.LIZLLL.execute(new ARunnableS19S0300000_8(c26206AQg, simVideoUrlModel, this, 1));
            }
        }
    }

    @Override // X.InterfaceC47342Ii2
    public final void createScene(String str, String str2) {
        if (IZ8.LJJIJIIJIL()) {
            ((HashSet) this.LJIJI).add(str);
        }
        C47188IfY c47188IfY = new C47188IfY(str);
        c47188IfY.LJ = str2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONObjectProtectorUtils.getString(JSONObjectProtectorUtils.getJSONObject(new JSONObject(str2), "preload_strategy"), "name");
            } catch (JSONException e) {
                C78253UnR.LJI("Scene", e.toString());
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("create scene ");
        JBR.LJIIIZ(LIZ, c47188IfY.LIZ, LIZ, "PreloadConfig");
        if (TextUtils.isEmpty(c47188IfY.LIZ)) {
            return;
        }
        C47148Ieu.LIZ.getClass();
        C47147Iet.LIZ.LJ().createScene(c47188IfY.LIZ());
    }

    @Override // X.InterfaceC47342Ii2
    public final long getCacheSizeByCustomPath(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return -1L;
        }
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        long j = 0;
        if (dataLoaderHelper.LIZJ == 0) {
            dataLoaderHelper.LJJ.LIZJ(1);
            try {
                AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIZ;
                if (aVMDLDataLoader != null) {
                    long cacheSizeByKeyAndDirPath = aVMDLDataLoader.getCacheSizeByKeyAndDirPath(str, str2);
                    if (cacheSizeByKeyAndDirPath > 0) {
                        j = cacheSizeByKeyAndDirPath;
                    }
                }
            } catch (Throwable unused) {
            }
            dataLoaderHelper.LJJ.LJ(1);
        }
        return j;
    }

    @Override // X.InterfaceC47342Ii2
    public final long getPreloadedSize(SimBitRate simBitRate, boolean z) {
        if (simBitRate == null) {
            return 0L;
        }
        if (z) {
            if (simBitRate.getPlayAddr() == null || TextUtils.isEmpty(simBitRate.getPlayAddr().getFileHash())) {
                return 0L;
            }
            return LJIILL(simBitRate.getPlayAddr().getFileHash());
        }
        return getPreloadedSize(simBitRate.getUrlKey());
    }

    @Override // X.InterfaceC47342Ii2
    public final long getVideoSize(SimBitRate simBitRate, boolean z) {
        C47083Idr LJIJ;
        if (z) {
            if (simBitRate.getPlayAddr() != null && !TextUtils.isEmpty(simBitRate.getPlayAddr().getFileHash()) && (LJIJ = C47148Ieu.LIZ.LJIJ(simBitRate.getPlayAddr().getFileHash())) != null) {
                return LJIJ.LIZ;
            }
            return 0L;
        }
        return getVideoSize(simBitRate.getUrlKey());
    }

    @Override // X.InterfaceC47342Ii2
    public final boolean preloadAudio(List<SimVideoUrlModel> list, int i) {
        boolean z = false;
        if (this.LJIJJLI.isPlayerPreferchTtsAudio() && list != null && !list.isEmpty()) {
            if (this.LJIJJLI.playerPreferchTtsAudioSize() > 0.0f) {
                i = (int) (this.LJIJJLI.playerPreferchTtsAudioSize() * 1024.0f);
            }
            for (SimVideoUrlModel simVideoUrlModel : list) {
                if (simVideoUrlModel != null && !simVideoUrlModel.getUrlList().isEmpty()) {
                    String sourceId = simVideoUrlModel.getSourceId();
                    TTVideoEngine.LIZLLL(i, sourceId, sourceId, (String[]) simVideoUrlModel.getUrlList().toArray(new String[simVideoUrlModel.getUrlList().size()]));
                    LIZIZ(simVideoUrlModel, i, sourceId);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // X.InterfaceC47342Ii2
    public final boolean preloadSub(List<SimVideoUrlModel> list, int i) {
        boolean z = false;
        if (this.LJIJJLI.isPlayerPreferchCaption() && list != null && !list.isEmpty()) {
            if (i > 0 && this.LJIJJLI.playerPreferchCaptionSize() > 0.0f) {
                i = (int) (this.LJIJJLI.playerPreferchCaptionSize() * 1024.0f);
            }
            for (SimVideoUrlModel simVideoUrlModel : list) {
                if (simVideoUrlModel != null && !simVideoUrlModel.getUrlList().isEmpty()) {
                    String sourceId = simVideoUrlModel.getSourceId();
                    TTVideoEngine.LIZLLL(i, sourceId, sourceId, (String[]) simVideoUrlModel.getUrlList().toArray(new String[simVideoUrlModel.getUrlList().size()]));
                    LIZIZ(simVideoUrlModel, i, sourceId);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // X.InterfaceC47342Ii2
    public final long tryToClearAndGetCachesByUsedTime(long j, boolean z) {
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        if (dataLoaderHelper == null) {
            return -1L;
        }
        dataLoaderHelper.LJJ.LIZJ(1);
        try {
            AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIZ;
            if (aVMDLDataLoader == null) {
                return -1L;
            }
            return aVMDLDataLoader.tryToClearAndGetCachesByUsedTime(j, z);
        } catch (Throwable th) {
            try {
                TTVideoEngineLog.d(th);
                dataLoaderHelper.LJJ.LJ(1);
                return 0L;
            } finally {
                dataLoaderHelper.LJJ.LJ(1);
            }
        }
    }

    public static EnumC47176IfM LJFF(C47164IfA c47164IfA, EnumC47176IfM enumC47176IfM, Map map) {
        String LIZIZ;
        if (!IZ8.LJIILL() || enumC47176IfM == null) {
            if (IZ8.LJJIJIIJI()) {
                if (enumC47176IfM == null || enumC47176IfM == EnumC47176IfM.Undefine) {
                    C47160If6 LJIIL = TTVideoEngine.LJIIL(c47164IfA, 0);
                    if (LJIIL != null && LJIIL.getResolution() != null) {
                        enumC47176IfM = LJIIL.getResolution();
                    }
                    if (LJIIL == null) {
                        LIZIZ = null;
                    } else {
                        LIZIZ = LJIIL.LIZIZ(18);
                    }
                    if (!TextUtils.isEmpty(LIZIZ)) {
                        map.put(18, LIZIZ);
                        return enumC47176IfM;
                    }
                    return enumC47176IfM;
                }
                return enumC47176IfM;
            }
            if (enumC47176IfM != null && enumC47176IfM != EnumC47176IfM.Undefine) {
                return enumC47176IfM;
            }
            return TTVideoEngine.LJIIJJI(c47164IfA, C46917IbB.LIZ, 1);
        }
        return enumC47176IfM;
    }

    public static void LJIJJLI(InterfaceC47101Ie9 interfaceC47101Ie9, int i, LoaderEventInfo loaderEventInfo) {
        if (interfaceC47101Ie9 != null) {
            C47071Idf c47071Idf = new C47071Idf();
            c47071Idf.LIZ = i;
            c47071Idf.LIZIZ = loaderEventInfo.fileHash;
            c47071Idf.LIZJ = loaderEventInfo.taskType;
            c47071Idf.LIZLLL = loaderEventInfo.bytesLoaded;
            c47071Idf.LJFF = loaderEventInfo.off;
            c47071Idf.LJI = loaderEventInfo.endOff;
            c47071Idf.LJ = loaderEventInfo.loadDurationMs;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("wrg_test_task , notifyMdlInternalEvent mdlEventInfo = ");
            LIZ.append(c47071Idf);
            X1D.LIZIZ(LIZ);
            LJIJJ();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("key", c47071Idf.LIZIZ);
                jSONObject.put("action", c47071Idf.LIZ);
                jSONObject.put("task_type", c47071Idf.LIZJ);
                jSONObject.put("bytes_loaded", c47071Idf.LIZLLL);
                jSONObject.put("off", c47071Idf.LJFF);
                jSONObject.put("end_off", c47071Idf.LJI);
                jSONObject.put("load_cost", c47071Idf.LJ);
            } catch (Exception unused) {
            }
            interfaceC47101Ie9.j1();
        }
    }

    public final void LIZIZ(SimVideoUrlModel simVideoUrlModel, int i, String str) {
        if (str != null && simVideoUrlModel != null) {
            ((ConcurrentHashMap) this.LJIILLIIL).put(str, Integer.valueOf(i));
            ((ConcurrentHashMap) this.LJIJ).put(str, simVideoUrlModel);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C47069Idd LJI(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r24, X.IY2 r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 1096
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.LJI(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, X.IY2, java.lang.String):X.Idd");
    }

    public final List LJIIZILJ(List list, boolean z, String str) {
        int size;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getPreloadMedias:");
        if (list == null) {
            size = -1;
        } else {
            size = list.size();
        }
        LIZ.append(size);
        LIZ.append(", scene:");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            IY2 createVideoUrlProcessor = this.LJIJJLI.createVideoUrlProcessor();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final C47069Idd LJI = LJI((SimVideoUrlModel) it.next(), createVideoUrlProcessor, str);
                if (LJI != null) {
                    Object value = IZ8.LJLLLL.getValue();
                    o.LJIIIIZZ(value, "<get-SC_PRELOAD_MODEL_SET_CALLBACK>(...)");
                    if (((Boolean) value).booleanValue()) {
                        LJI.LIZJ = new InterfaceC47122IeU() { // from class: X.Idi
                            @Override // X.InterfaceC47122IeU
                            public final void LIZ(C47121IeT c47121IeT) {
                                EnginePreloader enginePreloader = EnginePreloader.this;
                                C47069Idd c47069Idd = LJI;
                                enginePreloader.getClass();
                                C46982IcE.LJ.post(new RunnableC47621ImX(2, enginePreloader, c47121IeT, c47069Idd));
                            }
                        };
                    }
                    arrayList.add(LJI);
                }
            }
        }
        C46865IaL c46865IaL = C46877IaX.LIZ;
        c46865IaL.getClass();
        if (!TextUtils.isEmpty(str)) {
            if (list == null || list.isEmpty()) {
                list = new ArrayList();
            }
            C46872IaS c46872IaS = (C46872IaS) ((ConcurrentHashMap) c46865IaL.LIZ).get(str);
            if (c46872IaS == null) {
                c46872IaS = new C46872IaS();
                ((ConcurrentHashMap) c46865IaL.LIZ).put(str, c46872IaS);
            }
            if (z) {
                ((ConcurrentHashMap) c46872IaS.LIZIZ).clear();
                ((ConcurrentHashMap) c46872IaS.LIZJ).clear();
                ((CopyOnWriteArrayList) c46872IaS.LIZ).clear();
            }
            for (SimVideoUrlModel simVideoUrlModel : list) {
                if (simVideoUrlModel != null) {
                    ((CopyOnWriteArrayList) c46872IaS.LIZ).add(simVideoUrlModel);
                    if (!TextUtils.isEmpty(simVideoUrlModel.getSourceId())) {
                        ((ConcurrentHashMap) c46872IaS.LIZIZ).put(simVideoUrlModel.getSourceId(), simVideoUrlModel);
                    }
                    if (!TextUtils.isEmpty(simVideoUrlModel.getDashVideoModelStr())) {
                        String LJI2 = C46664ITc.LJIJ.LJI(simVideoUrlModel.getSourceId());
                        if (TextUtils.isEmpty(LJI2)) {
                            LJI2 = simVideoUrlModel.getOriginUri();
                        }
                        if (!TextUtils.isEmpty(LJI2)) {
                            ((ConcurrentHashMap) c46872IaS.LIZIZ).put(LJI2, simVideoUrlModel);
                        }
                    }
                    if (!TextUtils.isEmpty(simVideoUrlModel.getOriginUri())) {
                        ((ConcurrentHashMap) c46872IaS.LIZJ).put(simVideoUrlModel.getOriginUri(), simVideoUrlModel);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC47342Ii2
    public final String proxyUrl(SimVideoUrlModel simVideoUrlModel, String str, String[] strArr) {
        Object value = IZ8.LLJJIJIIJIL.getValue();
        o.LJIIIIZZ(value, "<get-EnablePlayCustomCacheDir>(...)");
        if (((Boolean) value).booleanValue() && !TextUtils.isEmpty(simVideoUrlModel.getSubTag())) {
            C46734IVu.LIZLLL();
            EnumC46736IVw LIZJ = C46734IVu.LIZJ(simVideoUrlModel.getSubTag());
            if (LIZJ != null) {
                String LJIIIIZZ = LJIIIIZZ(LIZJ);
                if (!TextUtils.isEmpty(LJIIIIZZ)) {
                    return C47148Ieu.LIZ.LJIIJJI(str, simVideoUrlModel.getSourceId(), 0L, strArr, null, null, null, LJIIIIZZ, null, false, false, null);
                }
            }
        }
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        String sourceId = simVideoUrlModel.getSourceId();
        dataLoaderHelper.getClass();
        C73343SqR.LIZIZ();
        return dataLoaderHelper.LJIIJJI(str, sourceId, 0L, strArr, null, null, null, null, null, false, false, null);
    }

    public final void LIZ(List<C47075Idj> list, boolean z, boolean z2, String str) {
        int size;
        String str2;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addMediasOpt:");
        if (list == null) {
            size = -1;
        } else {
            size = list.size();
        }
        LIZ.append(size);
        LIZ.append(", scene:");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (list == null || list.size() == 0) {
            return;
        }
        if (z) {
            DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
            if (dataLoaderHelper.LJJIJLIJ != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(dataLoaderHelper);
                arrayList.add(str);
                arrayList.add(Integer.valueOf(z2 ? 1 : 0));
                dataLoaderHelper.LJJIJLIJ.LIZ(113, arrayList);
            } else {
                C47147Iet.LIZ.LJ().removeAllMedia(str, z2 ? 1 : 0);
            }
        }
        if (IZ8.LJJIIZI() && ((str2 = C47091Idz.LIZ.LIZ) == null || !str2.equals(str))) {
            ((HashMap) this.LJIJJ).put(str, list);
        } else {
            TTVideoEngine.LIZ(str, list);
        }
    }

    public final EnumC47176IfM LIZLLL(SimVideoUrlModel simVideoUrlModel, C46915Ib9 c46915Ib9, boolean z, Map<Integer, String> map) {
        if (IZ8.LJJIJIIJI()) {
            IXW properBitrateForDash = this.LJIJJLI.getProperBitrateForDash(simVideoUrlModel, c46915Ib9, z);
            if (properBitrateForDash == null) {
                return null;
            }
            EnumC47176IfM LIZ = C47169IfF.LIZ(properBitrateForDash.LIZJ);
            if (!TextUtils.isEmpty(properBitrateForDash.LIZLLL)) {
                map.put(18, properBitrateForDash.LIZLLL);
                return LIZ;
            }
            return LIZ;
        }
        return C47169IfF.LIZ(this.LJIJJLI.getProperResolution(simVideoUrlModel.getSourceId(), c46915Ib9));
    }

    @Override // X.InterfaceC47342Ii2
    public final void addMedias(List<SimVideoUrlModel> list, boolean z, boolean z2, String str) {
        int size;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("addMedias:");
        if (list == null) {
            size = -1;
        } else {
            size = list.size();
        }
        LIZ.append(size);
        LIZ.append(", scene:");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        if (this.LJIIIZ) {
            if (this.LIZ) {
                LIZ(LJIIZILJ(list, z, str), z, z2, str);
            } else {
                C46982IcE.LIZLLL.execute(new ARunnableS1S1220000_8(list, this, z, z2, str, 1));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0123  */
    @Override // X.InterfaceC47342Ii2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean preload(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel r24, int r25, X.AbstractC46738IVy r26, X.C46729IVp r27) {
        /*
            Method dump skipped, instructions count: 1083
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader.preload(com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel, int, X.IVy, X.IVp):boolean");
    }

    @Override // X.InterfaceC47342Ii2
    public final void copyCache(String str, String str2, boolean z, boolean z2, InterfaceC47084Ids interfaceC47084Ids) {
        if (TextUtils.isEmpty(str)) {
            if (interfaceC47084Ids != null) {
                interfaceC47084Ids.LJIILJJIL(2);
                return;
            }
            return;
        }
        C47080Ido c47080Ido = new C47080Ido(str, str2, z, z2, new C47079Idn(interfaceC47084Ids));
        DataLoaderHelper dataLoaderHelper = C47148Ieu.LIZ;
        dataLoaderHelper.getClass();
        AVMDLCopyOperation aVMDLCopyOperation = new AVMDLCopyOperation(str, str2, z2, c47080Ido.LIZ, new C47081Idp(dataLoaderHelper, c47080Ido));
        aVMDLCopyOperation.mCustomDir = null;
        if (dataLoaderHelper.LIZJ != 0) {
            return;
        }
        dataLoaderHelper.LJJ.LIZJ(1);
        try {
            AVMDLDataLoader aVMDLDataLoader = dataLoaderHelper.LJIIIZ;
            if (aVMDLDataLoader != null) {
                aVMDLDataLoader.asyncCopyOperation(aVMDLCopyOperation);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // X.InterfaceC47342Ii2
    public final void copyCache(SimVideoUrlModel simVideoUrlModel, String str, boolean z, boolean z2, InterfaceC47084Ids interfaceC47084Ids) {
        if (simVideoUrlModel == null) {
            if (interfaceC47084Ids != null) {
                interfaceC47084Ids.LJIILJJIL(2);
            }
        } else if (!TextUtils.isEmpty(simVideoUrlModel.getDashVideoModelStr())) {
            if (interfaceC47084Ids != null) {
                interfaceC47084Ids.LJIILJJIL(3);
            }
        } else {
            this.LJIJJLI.createVideoUrlProcessor();
            copyCache(this.LJIJJLI.createVideoUrlProcessor().LIZ(simVideoUrlModel, IXN.LIZJ.getPlayerType()).LIZJ, str, z, z2, interfaceC47084Ids);
        }
    }
}
