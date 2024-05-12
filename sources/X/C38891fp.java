package X;

import Y.IDhS94S0100000_1;
import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.benchmark.IBTCHApplog;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sdk.common.data.api.TikTokImApi;
import defpackage.a1;
import defpackage.b1;
import defpackage.i0;
import defpackage.t1;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.1fp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38891fp implements InterfaceC75414Tik, InterfaceC73592SuS, InterfaceC48038ItG, J3X, InterfaceC76645U6f {
    public static InterfaceC12330e5 LJLIL;
    public static Application LJLILLLLZI;
    public static boolean LJLJI;
    public static final C38891fp LJLJJI = new C38891fp();
    public static final C38891fp LJLJJL = new C38891fp();

    public static void LJFF(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void LJI(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void LJII(C60014Ngw c60014Ngw) {
        if (c60014Ngw.LJI) {
            throw new IllegalStateException("AdSession is finished");
        }
    }

    public static Object LJIIL(Method method, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{null, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "1060360518624343427"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(null, objArr);
    }

    @Override // X.J3X
    public void LIZJ() {
    }

    public static Context LJIJJLI() {
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null) {
            return iHostAppContext.context();
        }
        return null;
    }

    @Override // X.InterfaceC76645U6f
    public UB9 create() {
        InterfaceC06390Mx LIZ = CN1.LIZ(IBroadcastService.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        return ((IBroadcastService) LIZ).createVoiceChatVideoClientFactory();
    }

    @Override // X.J3X
    public ExecutorService LIZ() {
        return F2S.LIZ;
    }

    @Override // X.J3X
    public ScheduledExecutorService LIZIZ() {
        return F2R.LIZ;
    }

    @Override // X.J3X
    public C48535J3b getLogger() {
        return C48542J3i.LIZ;
    }

    public static final long LIZLLL(int i) {
        return (i << 32) | (0 & 4294967295L);
    }

    public static void LJIIIIZZ(C60014Ngw c60014Ngw) {
        if (c60014Ngw.LJFF) {
            LJII(c60014Ngw);
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    public static void LJIIJJI(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public static void LJIILJJIL(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || !file.isFile()) {
            return;
        }
        C16880lQ.LLLZZIL(file);
    }

    public static void LJIILL(String str) {
        String LJ;
        File file = new File(str);
        if (!file.exists()) {
            return;
        }
        if (file.isFile()) {
            C16880lQ.LLLZZIL(file);
            return;
        }
        String[] list = file.list();
        if (list == null) {
            return;
        }
        for (String str2 : list) {
            if (str2 != null) {
                String str3 = File.separator;
                if (str.endsWith(str3)) {
                    LJ = i0.LJFF(str, str2);
                } else {
                    LJ = a1.LJ(str, str3, str2);
                }
                File file2 = new File(LJ);
                if (file2.isFile()) {
                    C16880lQ.LLLZZIL(file2);
                }
                if (file2.isDirectory()) {
                    LJIILL(LJ);
                }
            }
        }
        C16880lQ.LLLZZIL(file);
    }

    public static final List LJIIZILJ(C160056Px c160056Px) {
        o.LJIIIZ(c160056Px, "<this>");
        return C65777Prh.LIZIZ(c160056Px.LIZ("StickerList"));
    }

    public static long LJIJI(String str) {
        try {
            if (!TextUtils.isEmpty(str) && new File(str).exists()) {
                StatFs statFs = new StatFs(str);
                return statFs.getBlockSize() * statFs.getAvailableBlocks();
            }
            return 0L;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return 0L;
        }
    }

    public static final OSZ LJIJJ(String str) {
        OSZ osz;
        boolean z = false;
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (z) {
            return new OSZ(0, 0);
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            C44694HgQ.LIZLLL(str, options);
            int LIZ = C173926s8.LIZ(str);
            if (LIZ != 90 && LIZ != 270) {
                osz = new OSZ(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
            } else {
                osz = new OSZ(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
            }
            return osz;
        } catch (Exception unused) {
            return new OSZ(0, 0);
        }
    }

    public static long LJIL(String str) {
        File[] listFiles;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        File file = new File(str);
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                try {
                    length += LJIL(file2.getAbsolutePath());
                } catch (OutOfMemoryError e) {
                    e.printStackTrace();
                    return 0L;
                } catch (StackOverflowError e2) {
                    e2.printStackTrace();
                    return 0L;
                }
            }
        }
        return length;
    }

    public static Object LJJ(Object[] objArr) {
        try {
            Method LJIILLIIL = LJIILLIIL(Class.forName("android.os.SystemProperties"), objArr);
            LJIILLIIL.setAccessible(true);
            return LJIIL(LJIILLIIL, objArr);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("couldn't invoke ");
            LIZ.append("get");
            LIZ.append(", ");
            LIZ.append(e);
            C63922P6w.LJ("TEReflectUtil", X1D.LIZIZ(LIZ));
            return null;
        }
    }

    public static boolean LJJI(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean LJJIFFI(Collection collection) {
        if (collection != null && collection.size() > 0) {
            return true;
        }
        return false;
    }

    public static final String LJJIIJZLJL(int i) {
        String LJJIJL = LJJIJL(i);
        if (LJJIJL != null) {
            return LJJIJL;
        }
        String LJ = KMP.LJ("Cannot get name of layout : ", i);
        LJ.toString();
        throw new IllegalArgumentException(LJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.OQg] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.ArrayList] */
    public static final void LJJIIZ(NLEModel nLEModel) {
        Object obj;
        ?? r7;
        Object obj2;
        List list;
        NLETrackSlot nLETrackSlot;
        NLESegmentAudio nLESegmentAudio;
        Iterator LIZJ = t1.LIZJ(nLEModel, "copyNLEModel.tracks");
        while (true) {
            if (LIZJ.hasNext()) {
                obj = LIZJ.next();
                if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.ORIGIN_VOICE_CONVERSION.name())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        NLETrack nLETrack = (NLETrack) obj;
        if (nLETrack != null) {
            if (!nLETrack.LJIILL().isEmpty()) {
                NLETrack mainTrack = nLEModel.getMainTrack();
                if (mainTrack != null) {
                    Iterator<NLETrackSlot> it = mainTrack.LJIILL().iterator();
                    while (it.hasNext()) {
                        NLETrackSlot next = it.next();
                        if (next.hasExtra("extra_associated_vc_slot_id") && next.hasExtra("extra_associated_vc_slot_id")) {
                            String extra = next.getExtra("extra_associated_vc_slot_id");
                            Iterator<NLETrackSlot> it2 = nLETrack.LJIILL().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    nLETrackSlot = it2.next();
                                    if (o.LJ(nLETrackSlot.getUUID(), extra)) {
                                        break;
                                    }
                                } else {
                                    nLETrackSlot = null;
                                    break;
                                }
                            }
                            NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                            if (nLETrackSlot2 != null && (nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, nLETrackSlot2.LJI())) != null) {
                                float LJIILJJIL = nLESegmentAudio.LJIILJJIL();
                                NLESegmentAudio nLESegmentAudio2 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, next.LJI());
                                if (nLESegmentAudio2 != null) {
                                    nLESegmentAudio2.LJIL(LJIILJJIL);
                                }
                            }
                        }
                    }
                }
                NLETrack mainTrack2 = nLEModel.getMainTrack();
                if (mainTrack2 != null) {
                    VecNLETrackSlotSPtr LJIILLIIL = mainTrack2.LJIILLIIL();
                    r7 = new ArrayList();
                    Iterator<NLETrackSlot> it3 = LJIILLIIL.iterator();
                    while (it3.hasNext()) {
                        NLETrackSlot next2 = it3.next();
                        String extra2 = next2.getExtra("has_origin_audio_slot");
                        if (extra2 != null && Boolean.parseBoolean(extra2)) {
                            r7.add(next2);
                        }
                    }
                } else {
                    r7 = C61878OQg.INSTANCE;
                }
                Iterator LIZJ2 = t1.LIZJ(nLEModel, "copyNLEModel.tracks");
                while (true) {
                    if (LIZJ2.hasNext()) {
                        obj2 = LIZJ2.next();
                        if (o.LJ(((NLENode) obj2).getExtra("AudioTrackType"), EnumC122254qz.ORIGIN.name())) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                NLETrack nLETrack2 = (NLETrack) obj2;
                if (nLETrack2 == null || (list = nLETrack2.LJIILLIIL()) == null) {
                    list = C61878OQg.INSTANCE;
                }
                if (r7.size() == list.size()) {
                    int size = r7.size();
                    for (int i = 0; i < size; i++) {
                        if (((NLENode) ListProtector.get(r7, i)).hasExtra("extra_associated_vc_slot_id")) {
                            Object obj3 = ListProtector.get(r7, i);
                            o.LJIIIIZZ(obj3, "videoTrackSlots[index]");
                            NLESegmentAudio nLESegmentAudio3 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, ((NLETrackSlot) obj3).LJI());
                            if (nLESegmentAudio3 != null) {
                                float LJIILJJIL2 = nLESegmentAudio3.LJIILJJIL();
                                Object obj4 = ListProtector.get(list, i);
                                o.LJIIIIZZ(obj4, "originAudioSlots[index]");
                                NLESegmentAudio nLESegmentAudio4 = (NLESegmentAudio) NLESegmentAudio.class.getMethod("LIZLLL", NLENode.class).invoke(null, ((NLETrackSlot) obj4).LJI());
                                if (nLESegmentAudio4 != null) {
                                    nLESegmentAudio4.LJIL(LJIILJJIL2);
                                }
                            }
                        }
                    }
                }
            }
            nLEModel.removeTrack(nLETrack);
        }
    }

    public static synchronized void LJJIJIIJI(InterfaceC12330e5 interfaceC12330e5) {
        synchronized (C38891fp.class) {
            LJLIL = interfaceC12330e5;
        }
    }

    public static final FE0 LJJIJIIJIL(int i) {
        Object LIZ;
        try {
            LIZ = C88684YrI.LIZ(i);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        return (FE0) LIZ;
    }

    public static final Integer LJJIJIL(String str) {
        Object LIZ;
        try {
            LIZ = KK9.LIZ(str);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        return (Integer) LIZ;
    }

    public static final String LJJIJL(int i) {
        Object LIZ;
        try {
            LIZ = KK9.LIZIZ(i);
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        return (String) LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r6 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
    
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r2 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        r0 = X.C38350F3i.LJJIJLIJ(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r0 == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        r0 = r0.floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        r5 = java.lang.Float.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        r0 = X.C38350F3i.LJJIJLIJ(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (r0 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        r1 = r0.floatValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
    
        return new X.C70354RjK(r5, r6, java.lang.Float.valueOf(r1), r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r0 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0030, code lost:
    
        r0 = r0.realPrice;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0032, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0034, code lost:
    
        r9 = r0.getCurrency();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0027, code lost:
    
        if (r0 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C70354RjK LJJIL(com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice r0 = r10.price
            r9 = 0
            if (r0 == 0) goto L63
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Price r0 = r0.realPrice
            if (r0 == 0) goto L63
            java.lang.String r3 = r0.getPriceVal()
        L12:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice r0 = r10.price
            if (r0 == 0) goto L61
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Price r0 = r0.realPrice
            if (r0 == 0) goto L61
            java.lang.String r8 = r0.getPriceStr()
        L1e:
            com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice r0 = r10.price
            if (r0 == 0) goto L26
            java.lang.String r2 = r0.originalPriceVal
            if (r2 != 0) goto L29
        L26:
            r2 = r3
            if (r0 == 0) goto L2d
        L29:
            java.lang.String r6 = r0.originalPrice
            if (r6 != 0) goto L30
        L2d:
            r6 = r8
            if (r0 == 0) goto L38
        L30:
            com.ss.android.ugc.aweme.ecommerce.base.common.model.Price r0 = r0.realPrice
            if (r0 == 0) goto L38
            java.lang.String r9 = r0.getCurrency()
        L38:
            X.RjK r4 = new X.RjK
            r1 = 0
            if (r2 == 0) goto L5f
            java.lang.Float r0 = X.C38350F3i.LJJIJLIJ(r2)
            if (r0 == 0) goto L5f
            float r0 = r0.floatValue()
        L47:
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
            if (r3 == 0) goto L57
            java.lang.Float r0 = X.C38350F3i.LJJIJLIJ(r3)
            if (r0 == 0) goto L57
            float r1 = r0.floatValue()
        L57:
            java.lang.Float r7 = java.lang.Float.valueOf(r1)
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        L5f:
            r0 = 0
            goto L47
        L61:
            r8 = r9
            goto L1e
        L63:
            r3 = r9
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38891fp.LJJIL(com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem):X.RjK");
    }

    public static final InterfaceC115514g7 LJJIZ(ReusedAssem reusedAssem) {
        o.LJIIIZ(reusedAssem, "<this>");
        if (C53256KvE.LIZ()) {
            return new C85050XZm(reusedAssem);
        }
        C65776Prg LIZ = C65352Pkq.LIZ(VideoDescVM.class);
        return C214348b8.LIZ(reusedAssem, LIZ, null, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 1013), null, C182947Fy.INSTANCE, null, null);
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        OSZ pair = (OSZ) obj;
        o.LJIIIZ(pair, "pair");
        String commentIds = (String) pair.getSecond();
        o.LJIIIZ(commentIds, "commentIds");
        return ((TikTokImApi) C30U.LIZJ.getValue()).getCommentStatusBatch(commentIds).LJIIJJI(new IDhS94S0100000_1(pair, 8));
    }

    @Override // X.InterfaceC75414Tik
    public void onSuccess(Object value) {
        o.LJIIIZ(value, "value");
    }

    @Override // X.InterfaceC73592SuS
    public boolean test(Object obj) {
        MotionEvent ev = (MotionEvent) obj;
        o.LJIIIZ(ev, "ev");
        if (ev.getActionMasked() == 1) {
            return true;
        }
        return false;
    }

    public static int LJIIJ(Context context, String str) {
        String LIZLLL;
        int LIZJ;
        String[] packagesForUid;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && (LIZLLL = C021206m.LIZLLL(str)) != null) {
            if (packageName == null) {
                PackageManager packageManager = context.getPackageManager();
                C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(101310, "android/content/pm/PackageManager", "getPackagesForUid", packageManager, new Object[]{Integer.valueOf(myUid)}, "java.lang.String[]", new C65300Pk0(false, "(I)[Ljava/lang/String;", "-455589413870928090"));
                if (LIZJ2.LIZ) {
                    packagesForUid = (String[]) LIZJ2.LIZIZ;
                } else {
                    packagesForUid = packageManager.getPackagesForUid(myUid);
                }
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 == myUid && Objects.equals(packageName2, packageName)) {
                if (i >= 29) {
                    AppOpsManager LIZJ3 = C021306n.LIZJ(context);
                    if (C021306n.LIZ(LIZJ3, LIZLLL, Binder.getCallingUid(), packageName) == 0) {
                        LIZJ = C021306n.LIZ(LIZJ3, LIZLLL, myUid, C021306n.LIZIZ(context));
                    }
                    return -2;
                }
                LIZJ = C021206m.LIZJ((AppOpsManager) C021206m.LIZ(context, AppOpsManager.class), LIZLLL, packageName);
            } else {
                LIZJ = C021206m.LIZJ((AppOpsManager) C021206m.LIZ(context, AppOpsManager.class), LIZLLL, packageName);
            }
            if (LIZJ != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static Method LJIILLIIL(Class cls, Object[] objArr) {
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals("get")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes == null || parameterTypes.length == 0) {
                    if (objArr.length == 0) {
                        return method;
                    }
                } else {
                    if (parameterTypes.length == objArr.length) {
                        for (int i = 0; i < parameterTypes.length; i++) {
                            Object obj = objArr[i];
                            if (obj == null || parameterTypes[i].isAssignableFrom(obj.getClass())) {
                            }
                        }
                        return method;
                    }
                    continue;
                }
            }
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null) {
            return LJIILLIIL(superclass, objArr);
        }
        return null;
    }

    public static final String LJIJ(int i, String nodePath) {
        o.LJIIIZ(nodePath, "nodePath");
        List LJLJJL2 = s.LJLJJL(nodePath, new String[]{":"}, 0, 6);
        if (i == 500) {
            if (!LJLJJL2.isEmpty()) {
                return (String) ORZ.LJLLJ(LJLJJL2);
            }
        } else if (LJLJJL2.size() >= 2) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append((String) ListProtector.get(LJLJJL2, 0));
            LIZ.append(':');
            LIZ.append((String) ListProtector.get(LJLJJL2, 1));
            return X1D.LIZIZ(LIZ);
        }
        return nodePath;
    }

    public static void LJJII(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            StringBuilder LIZJ = b1.LIZJ(str, ": ");
            LIZJ.append(jSONObject.toString());
            X1D.LIZIZ(LIZJ);
            C47261Igj.LJIILJJIL("ByteBench AppLogCenter");
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(": param is null");
            X1D.LIZIZ(LIZ);
            C47261Igj.LJJJJZ("ByteBench AppLogCenter");
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("sdk_version", "14.9.13-mt");
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        InterfaceC12330e5 interfaceC12330e5 = LJLIL;
        if (interfaceC12330e5 != null) {
            interfaceC12330e5.onEvent(str, jSONObject);
            return;
        }
        IBTCHApplog iBTCHApplog = (IBTCHApplog) ServiceManager.get().getService(IBTCHApplog.class);
        if (iBTCHApplog == null) {
            return;
        }
        iBTCHApplog.onEvent(str, jSONObject);
    }

    public static void LJJIII(String str, String str2) {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(str2);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            jSONObject = null;
        }
        C47261Igj.LJIILJJIL("ByteBench AppLogCenternot json");
        LJJII(str, jSONObject);
    }

    public static final void LJJIIJ(Object obj, XJL xjl) {
        if (xjl != null && xjl.isActive()) {
            C3C5.m7constructorimpl(obj);
            xjl.resumeWith(obj);
        }
    }

    public static final void LJJIIZI(InterfaceC73573Su9 interfaceC73573Su9, Throwable t) {
        o.LJIIIZ(interfaceC73573Su9, "<this>");
        o.LJIIIZ(t, "t");
        if (!interfaceC73573Su9.isDisposed()) {
            interfaceC73573Su9.onError(t);
        }
    }

    public static final void LJJIJ(InterfaceC73573Su9 interfaceC73573Su9, Object obj) {
        o.LJIIIZ(interfaceC73573Su9, "<this>");
        if (!interfaceC73573Su9.isDisposed()) {
            interfaceC73573Su9.onNext(obj);
        }
        if (!interfaceC73573Su9.isDisposed()) {
            interfaceC73573Su9.onComplete();
        }
    }

    @Override // X.InterfaceC75414Tik
    public void LJ(LinkCoreError error, Throwable th) {
        String str;
        o.LJIIIZ(error, "error");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("auto replyInvite, ");
        LIZ.append("tryRefuseInviteByArcIncompatibleInner");
        LIZ.append(", error = ");
        LIZ.append(error);
        LIZ.append(", throwable.message=");
        if (th != null) {
            str = th.getMessage();
        } else {
            str = null;
        }
        C1EW.LIZLLL(LIZ, str, LIZ, "MultiHostCrossRefuseManager");
    }

    public static final int LJIIIZ(BitmapFactory.Options options, int i, int i2) {
        OSZ osz = new OSZ(Integer.valueOf(options.outHeight), Integer.valueOf(options.outWidth));
        int intValue = ((Number) osz.getFirst()).intValue();
        int intValue2 = ((Number) osz.getSecond()).intValue();
        int i3 = 1;
        if (intValue > i2 || intValue2 > i) {
            int i4 = intValue / 2;
            int i5 = intValue2 / 2;
            while (i4 / i3 >= i2 && i5 / i3 >= i) {
                i3 *= 2;
            }
        }
        return i3;
    }

    public static final Bitmap LJIILIIL(int i, int i2, String path) {
        o.LJIIIZ(path, "path");
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(path, options);
            options.inSampleSize = LJIIIZ(options, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(path, options);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:41|(4:43|(2:44|(2:46|(1:48)(1:111))(2:112|113))|49|(27:51|52|(1:54)|55|(1:110)|57|(1:59)(1:109)|60|(1:62)|(1:65)(1:106)|(1:68)(1:103)|69|70|71|(1:73)|74|(1:76)|(1:78)|79|(1:100)|81|(4:84|(3:86|87|88)(1:90)|89|82)|91|92|(1:96)|97|98))|114|52|(0)|55|(0)|57|(0)(0)|60|(0)|(20:107|65|(18:104|68|69|70|71|(0)|74|(0)|(0)|79|(0)|81|(1:82)|91|92|(2:94|96)|97|98)|68|69|70|71|(0)|74|(0)|(0)|79|(0)|81|(1:82)|91|92|(0)|97|98)|65|(0)|68|69|70|71|(0)|74|(0)|(0)|79|(0)|81|(1:82)|91|92|(0)|97|98) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f0, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0280  */
    /* JADX WARN: Type inference failed for: r21v3, types: [com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight, kotlin.jvm.internal.DefaultConstructorMarker, java.lang.String, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r21v4, types: [kotlin.jvm.internal.DefaultConstructorMarker, com.ss.android.ugc.aweme.ecommerce.base.common.model.Price, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C27941Axt LJJIJLIJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder r32, int r33, java.lang.String r34, java.util.List r35, java.lang.String r36, java.lang.Integer r37, boolean r38, java.lang.String r39, java.lang.String r40) {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38891fp.LJJIJLIJ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddonOrder, int, java.lang.String, java.util.List, java.lang.String, java.lang.Integer, boolean, java.lang.String, java.lang.String):X.Axt");
    }
}
