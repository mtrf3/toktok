package X;

import Y.IDObjectS0S0101000;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.model.RoomCreateInfo;
import com.bytedance.android.livesdk.dataChannel.RoomCreateInfoChannel;
import com.bytedance.android.livesdk.model.GameTag;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.emojichoose.model.Resources;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.bytex.pthread.base.IRunnableMonitor;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.UyQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78934UyQ implements QNJ, InterfaceC73033SlR, C68K, IRunnableMonitor, InterfaceC49868Jhg {
    public static volatile InterfaceC43724HEa LJLIL;

    @Override // X.C68K
    public boolean LIZ() {
        return false;
    }

    @Override // X.QNJ
    public void LJII() {
    }

    @Override // X.QNJ
    public void LJIIIIZZ() {
    }

    @Override // X.QNJ
    public void url() {
    }

    @Override // X.QNJ
    public String LJIIIZ() {
        String API_URL_PREFIX_SI = EFJ.LIZJ;
        o.LJIIIIZZ(API_URL_PREFIX_SI, "API_URL_PREFIX_SI");
        return API_URL_PREFIX_SI;
    }

    public static InterfaceC43724HEa LJIIJ() {
        return LJLIL;
    }

    public static String LJ(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        String str2 = File.separator;
        if (str.endsWith(str2)) {
            return str;
        }
        return i0.LJFF(str, str2);
    }

    public static final Bundle LJFF(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        o.LJIIIIZZ(obtain, "obtain()");
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(C42326GjK.class.getClassLoader());
        obtain.recycle();
        if (readBundle == null) {
            return new Bundle();
        }
        return readBundle;
    }

    public static String LJIIJJI(Resources resources) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIILLIIL(resources.getType()));
        LIZ.append(LJIJ(resources.getId(), resources.getVersion()));
        LIZ.append(".zip");
        return X1D.LIZIZ(LIZ);
    }

    public static final long LJIILJJIL(User user) {
        Long LJJIZ;
        if (((Number) C52660Klc.LIZ.getValue()).intValue() != 1) {
            return user.roomId;
        }
        String str = user.roomIdStr;
        if (str != null && (LJJIZ = C38350F3i.LJJIZ(str)) != null) {
            return LJJIZ.longValue();
        }
        return user.roomId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIILLIIL(java.lang.String r5) {
        /*
            java.lang.StringBuilder r2 = X.X1D.LIZ()
            java.lang.StringBuilder r4 = X.X1D.LIZ()
            android.content.Context r3 = X.EF7.LIZIZ()
            java.io.File r0 = X.C16880lQ.LLIIJLIL(r3)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L1b
            java.io.File r0 = X.C16880lQ.LLIIJLIL(r3)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = r0.getPath()     // Catch: java.lang.Throwable -> L40
            goto L41
        L1b:
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = "/data/data/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = r3.getPackageName()     // Catch: java.lang.Throwable -> L40
            r1.append(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = "/files/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L40
            r0 = 0
            java.io.File r0 = r3.getDir(r1, r0)     // Catch: java.lang.Throwable -> L40
            if (r0 == 0) goto L40
            java.lang.String r1 = r0.getPath()     // Catch: java.lang.Throwable -> L40
            goto L41
        L40:
            r1 = 0
        L41:
            boolean r0 = X.C38354F3m.LJ(r1)
            if (r0 != 0) goto L63
            r4.append(r1)
            java.lang.String r0 = "/im_resources/"
            r4.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r4)
            r2.append(r0)
            r2.append(r5)
            java.lang.String r0 = "/"
            r2.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r2)
            return r0
        L63:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "Cannot Create Files Dir"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78934UyQ.LJIILLIIL(java.lang.String):java.lang.String");
    }

    public static File LJIJI(String str) {
        if (str != null) {
            return new File(i0.LJFF(str, ".tmp"));
        }
        throw new IllegalArgumentException("file is null");
    }

    public static boolean LJIJJ(List list) {
        if (list == null || list.isEmpty()) {
            return true;
        }
        return false;
    }

    public static final boolean LJIJJLI(List list) {
        int size = list.size();
        if (size != 1) {
            if (size == 2 && ((GameTag) ListProtector.get(list, 0)).isNonGameOrOtherGameItem() && ((GameTag) ListProtector.get(list, 1)).isNonGameOrOtherGameItem()) {
                return true;
            }
            return false;
        }
        return ((GameTag) ListProtector.get(list, 0)).isNonGameOrOtherGameItem();
    }

    public static final LiveMode LJIL(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (LiveMode) dataChannel.kv0(BCX.class);
        }
        return null;
    }

    public static boolean LJJ(String str) {
        if (!str.equals("GET") && !str.equals("HEAD")) {
            return true;
        }
        return false;
    }

    public static boolean LJJI(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || listFiles.length == 0) {
                return C16880lQ.LLLZZIL(file);
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    LJJI(file2);
                } else {
                    C16880lQ.LLLZZIL(file2);
                }
            }
        }
        return C16880lQ.LLLZZIL(file);
    }

    public static final boolean LJJIFFI(DataChannel dataChannel) {
        RoomCreateInfo roomCreateInfo;
        boolean z;
        if (dataChannel != null) {
            roomCreateInfo = (RoomCreateInfo) dataChannel.kv0(RoomCreateInfoChannel.class);
        } else {
            roomCreateInfo = null;
        }
        boolean z2 = false;
        if (roomCreateInfo != null) {
            z = roomCreateInfo.showGameTags;
        } else {
            z = false;
        }
        StringBuilder LJI = JBR.LJI("shouldShowGameCategoryEntry. result=", z, ". dataChannelNull=");
        if (dataChannel == null) {
            z2 = true;
        }
        FT5.LJ(LJI, z2, LJI, "GameCategoryExt");
        return z;
    }

    public static final int LJJII(Bundle bundle) {
        o.LJIIIZ(bundle, "<this>");
        try {
            Parcel obtain = Parcel.obtain();
            o.LJIIIIZZ(obtain, "obtain()");
            obtain.writeBundle(bundle);
            int dataSize = obtain.dataSize();
            obtain.recycle();
            return dataSize;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return 0;
        }
    }

    public static final byte[] LJJIII(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        o.LJIIIIZZ(obtain, "obtain()");
        obtain.writeBundle(bundle);
        byte[] bytes = obtain.marshall();
        obtain.recycle();
        o.LJIIIIZZ(bytes, "bytes");
        return bytes;
    }

    public static final UrlModel LJJIIJ(List list) {
        o.LJIIIZ(list, "<this>");
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(list);
        return urlModel;
    }

    public static final IDObjectS0S0101000 LJJIIZ(C0MB receiver$0) {
        o.LJIIJ(receiver$0, "receiver$0");
        return new IDObjectS0S0101000(receiver$0, 0);
    }

    public static final String LJJIIZI(InterfaceC71708SCi interfaceC71708SCi) {
        String[] strArr;
        o.LJIIIZ(interfaceC71708SCi, "<this>");
        String str = interfaceC71708SCi.getElementDTO().id;
        if (str == null) {
            return "";
        }
        InterfaceC71722SCw interfaceC71722SCw = interfaceC71708SCi.LLJLLL().LIZ;
        if (interfaceC71722SCw == null || (strArr = interfaceC71722SCw.LJ()) == null) {
            strArr = new String[]{""};
        }
        String LIZ = SEY.LIZ.LJ(str, (String[]) Arrays.copyOf(strArr, strArr.length)).LIZ();
        if (LIZ == null) {
            return "";
        }
        return LIZ;
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.IRunnableMonitor
    public void afterExecuteRunnable(Runnable runnable) {
        FT6 ft6;
        C2322399n c2322399n;
        if (runnable != null) {
            C36211EJb.LJIIJ.getClass();
            ConcurrentHashMap<Integer, FT6> concurrentHashMap = C36211EJb.LJFF;
            if (concurrentHashMap.containsKey(Integer.valueOf(runnable.hashCode())) && (ft6 = concurrentHashMap.get(Integer.valueOf(runnable.hashCode()))) != null) {
                C232649Bc c232649Bc = C36211EJb.LJIIIIZZ;
                if (c232649Bc != null) {
                    int i = C2322599p.LIZ[c232649Bc.LIZ.ordinal()];
                    if (i != 1) {
                        if (i == 2 && (c2322399n = C36211EJb.LIZJ.get(ft6.LIZ)) != null) {
                            int i2 = C2322599p.LIZIZ[c2322399n.LIZIZ.ordinal()];
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    C36529EVh.LIZ(Process.myTid());
                                } else {
                                    throw new C162476Zf();
                                }
                            } else {
                                String str = C36211EJb.LIZIZ.get(ft6.LIZ);
                                if (str != null && o.LJ(str, ft6.LIZJ)) {
                                    C36529EVh.LIZ(Process.myTid());
                                }
                            }
                        }
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        ft6.LJIIIIZZ = currentTimeMillis;
                        ft6.LJIIJJI = currentTimeMillis - ft6.LJII;
                        long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
                        ft6.LJIIJ = currentThreadTimeMillis;
                        ft6.LJIIL = currentThreadTimeMillis - ft6.LJIIIZ;
                        String name = C16880lQ.LLLLIIIILLL().getName();
                        o.LJIIIIZZ(name, "currentThread().name");
                        ft6.LJ = name;
                        C36211EJb.LJI.remove(C16880lQ.LLLLIIIILLL().getName());
                    }
                    String blood = ft6.LIZ;
                    o.LJIIIZ(blood, "blood");
                    if (!C36211EJb.LJIIIZ.get()) {
                        return;
                    }
                    C36211EJb.LIZ.remove(C16880lQ.LLLLIIIILLL().getName());
                    return;
                }
                o.LJIJI("builder");
                throw null;
            }
        }
    }

    @Override // com.ss.android.ugc.bytex.pthread.base.IRunnableMonitor
    public void beforeExecuteRunnable(Runnable runnable) {
        FT6 ft6;
        if (runnable != null) {
            C36211EJb.LJIIJ.getClass();
            ConcurrentHashMap<Integer, FT6> concurrentHashMap = C36211EJb.LJFF;
            if (concurrentHashMap.containsKey(Integer.valueOf(runnable.hashCode())) && (ft6 = concurrentHashMap.get(Integer.valueOf(runnable.hashCode()))) != null) {
                C232649Bc c232649Bc = C36211EJb.LJIIIIZZ;
                if (c232649Bc != null) {
                    int i = C2322599p.LIZ[c232649Bc.LIZ.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            C2322399n c2322399n = C36211EJb.LIZJ.get(ft6.LIZ);
                            if (c2322399n != null) {
                                int i2 = C2322599p.LIZIZ[c2322399n.LIZIZ.ordinal()];
                                if (i2 != 1) {
                                    if (i2 == 2) {
                                        C36529EVh.LIZIZ(Process.myTid(), c2322399n.LIZ);
                                    } else {
                                        throw new C162476Zf();
                                    }
                                } else {
                                    String str = C36211EJb.LIZIZ.get(ft6.LIZ);
                                    if (str != null && o.LJ(str, ft6.LIZJ)) {
                                        C36529EVh.LIZIZ(Process.myTid(), c2322399n.LIZ);
                                    }
                                }
                            }
                            if (C36211EJb.LIZLLL.get(ft6.LIZ) != null) {
                                throw null;
                            }
                        }
                    } else {
                        String name = C16880lQ.LLLLIIIILLL().getName();
                        o.LJIIIIZZ(name, "currentThread().name");
                        ft6.LJ = name;
                        ft6.LJII = System.currentTimeMillis();
                        ft6.LJIIIZ = SystemClock.currentThreadTimeMillis();
                        HashMap<String, FT6> hashMap = C36211EJb.LJI;
                        String name2 = C16880lQ.LLLLIIIILLL().getName();
                        o.LJIIIIZZ(name2, "currentThread().name");
                        hashMap.put(name2, ft6);
                    }
                    C36211EJb.LIZ(ft6.LIZ);
                    return;
                }
                o.LJIJI("builder");
                throw null;
            }
        }
    }

    public static final void LJI(FragmentManager fragmentManager, String str) {
        Fragment fragment;
        if (fragmentManager != null) {
            fragment = fragmentManager.LJJJIL(str);
        } else {
            fragment = null;
        }
        if (fragment instanceof DialogFragment) {
            ((DialogFragment) fragment).dismiss();
        }
    }

    public static Field LJIIL(Class cls, String str) {
        if (EW9.LIZ()) {
            try {
                Field field = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(cls, str);
                field.setAccessible(true);
                return field;
            } catch (Throwable unused) {
                return null;
            }
        }
        return EWA.LIZ(cls, str);
    }

    public static final int LJIILL(long j, RankTypeV2 rankTypeV2) {
        Integer LJI;
        Integer LJI2;
        Integer LJI3;
        o.LJIIIZ(rankTypeV2, "rankTypeV2");
        int i = rankTypeV2.style;
        if (i == 1) {
            if (j == 1) {
                return C15380j0.LIZIZ(R.color.ab9);
            }
            if (j == 2) {
                return C15380j0.LIZIZ(R.color.ab_);
            }
            if (j == 3) {
                return C15380j0.LIZIZ(R.color.aba);
            }
            Context LIZLLL = C15380j0.LIZLLL();
            if (LIZLLL == null || (LJI3 = C79045V0n.LJI(R.attr.gp, LIZLLL)) == null) {
                return 0;
            }
            return LJI3.intValue();
        }
        if (i == 2) {
            if (j == 1) {
                return C15380j0.LIZIZ(R.color.a_h);
            }
            if (j == 2) {
                return C15380j0.LIZIZ(R.color.a_i);
            }
            if (j == 3) {
                return C15380j0.LIZIZ(R.color.a_j);
            }
            Context LIZLLL2 = C15380j0.LIZLLL();
            if (LIZLLL2 == null || (LJI2 = C79045V0n.LJI(R.attr.gp, LIZLLL2)) == null) {
                return 0;
            }
            return LJI2.intValue();
        }
        if (j == 1) {
            return C15380j0.LIZIZ(R.color.a4t);
        }
        if (j == 2) {
            return C15380j0.LIZIZ(R.color.a4u);
        }
        if (j == 3) {
            return C15380j0.LIZIZ(R.color.a4v);
        }
        Context LIZLLL3 = C15380j0.LIZLLL();
        if (LIZLLL3 == null || (LJI = C79045V0n.LJI(R.attr.gp, LIZLLL3)) == null) {
            return 0;
        }
        return LJI.intValue();
    }

    public static String LJIJ(long j, String str) {
        String replace;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(j);
        LIZ.append("_");
        if (str == null) {
            replace = "";
        } else {
            replace = str.replace(".", "_");
        }
        LIZ.append(replace);
        return X1D.LIZIZ(LIZ);
    }

    public static XK4 LIZJ(int i, XKI xki, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            xki = XKI.SUSPEND;
        }
        int i3 = 1;
        if (i != -2) {
            if (i != -1) {
                if (i != 0) {
                    if (i != Integer.MAX_VALUE) {
                        if (i == 1 && xki == XKI.DROP_OLDEST) {
                            return new XK7(null);
                        }
                        return new XK5(i, xki, null);
                    }
                    return new XKC(null);
                }
                if (xki == XKI.SUSPEND) {
                    return new C78938UyU(null);
                }
                return new XK5(1, xki, null);
            }
            if (xki == XKI.SUSPEND) {
                return new XK7(null);
            }
            "CONFLATED capacity cannot be used with non-default onBufferOverflow".toString();
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (xki == XKI.SUSPEND) {
            InterfaceC78936UyS.LIZ.getClass();
            i3 = C78935UyR.LIZIZ;
        }
        return new XK5(i3, xki, null);
    }

    public static Method LJIILIIL(Class cls, String str, Class... clsArr) {
        if (EW9.LIZ()) {
            try {
                Method method = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class).invoke(cls, str, clsArr);
                method.setAccessible(true);
                return method;
            } catch (Throwable unused) {
                return null;
            }
        }
        return EW7.LIZ(cls, str, clsArr);
    }

    public static String LJIIZILJ(long j, String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(LJIILLIIL(str));
        LIZ2.append(LJIJ(j, str2));
        LIZ.append(X1D.LIZIZ(LIZ2));
        LIZ.append("/");
        LIZ.append(j);
        return X1D.LIZIZ(LIZ);
    }

    public static final void LJJIIJZLJL(TextView textView, String str, boolean z) {
        if (textView != null) {
            CharSequence text = textView.getText();
            if (!z || !TextUtils.equals(text, str)) {
                textView.setText(str);
            }
        }
    }

    public static C1N9 LIZLLL(String text, C08370Un style, long j, InterfaceC23370vt density, InterfaceC13480fw fontFamilyResolver, C61878OQg spanStyles, int i, boolean z) {
        C61878OQg placeholders = C61878OQg.INSTANCE;
        o.LJIIIZ(text, "text");
        o.LJIIIZ(style, "style");
        o.LJIIIZ(density, "density");
        o.LJIIIZ(fontFamilyResolver, "fontFamilyResolver");
        o.LJIIIZ(spanStyles, "spanStyles");
        o.LJIIIZ(placeholders, "placeholders");
        return new C1N9(new C34361Wm(style, fontFamilyResolver, density, text, spanStyles, placeholders), i, z, j);
    }
}
