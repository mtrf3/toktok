package com.ss.android.ttve.nativePort;

import X.C16880lQ;
import X.C19U;
import X.C38926FPm;
import X.C39803Fjj;
import X.C39804Fjk;
import X.EnumC39801Fjh;
import X.InterfaceC38927FPn;
import X.InterfaceC39805Fjl;
import X.JBR;
import X.X1D;
import android.content.Context;
import com.bef.effectsdk.EffectSDKBuildConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttffmpeg.FFmpegLibLoaderWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes7.dex */
public class TENativeLibsLoader {
    public static Context sContext;
    public static boolean sIsSegmentalLoad;
    public static volatile EnumC39801Fjh sLibraryLoadStatus = EnumC39801Fjh.NOT_LOAD;
    public static final String TAG = C16880lQ.LJLLJ(TENativeLibsLoader.class);
    public static InterfaceC38927FPn mLibraryLoader = null;
    public static InterfaceC39805Fjl mLibraryHooker = null;
    public static InterfaceC38927FPn sDefaultLibraryLoader = new C38926FPm();
    public static InterfaceC39805Fjl sDefaultLibraryHooker = new C39803Fjj();
    public static ArrayList<C39804Fjk> sLibraryReferenceList = new ArrayList<>();
    public static List<String> sEffectLibs = EffectSDKBuildConfig.getEffectLibs();
    public static boolean isLibraryLoadedOpt = false;
    public static boolean sLoadOptLibrary = false;

    public static List<String> getAllLibsList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("c++_shared");
        arrayList.add("iesapplogger");
        arrayList.add("bytevc0");
        arrayList.add("ByteVC1_dec");
        arrayList.add("bvcparser");
        arrayList.add("fdk-aac");
        arrayList.add("sscronet");
        arrayList.addAll(FFmpegLibLoaderWrapper.LIZIZ());
        arrayList.add("yuv");
        arrayList.add("bytenn");
        arrayList.add("audioeffect");
        for (String str : sEffectLibs) {
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        C19U.LIZLLL(arrayList, "fastcv", "lens", "ttvesdk", "bytebench");
        return arrayList;
    }

    public static int getLibraryLoadedVersion() {
        if (sLibraryLoadStatus != EnumC39801Fjh.LOADED) {
            return -1;
        }
        if (isLibraryLoadedOpt) {
            return 1;
        }
        return 0;
    }

    public static void loadAllLibs() {
        if (sLibraryLoadStatus == EnumC39801Fjh.LOADED) {
            return;
        }
        List<String> allLibsList = getAllLibsList();
        String[] strArr = new String[allLibsList.size()];
        for (int i = 0; i < allLibsList.size(); i++) {
            if (!((String) ListProtector.get(allLibsList, i)).contentEquals("c++_shared") && !((String) ListProtector.get(allLibsList, i)).contentEquals("ttboringssl") && !((String) ListProtector.get(allLibsList, i)).contentEquals("ttcrypto")) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("lib");
                strArr[i] = JBR.LJFF(LIZ, (String) ListProtector.get(allLibsList, i), ".so", LIZ);
            }
        }
        sLibraryLoadStatus = EnumC39801Fjh.LOADING;
        InterfaceC38927FPn interfaceC38927FPn = mLibraryLoader;
        if (interfaceC38927FPn != null) {
            if (!interfaceC38927FPn.LIZ(allLibsList)) {
                sLibraryLoadStatus = EnumC39801Fjh.NOT_LOAD;
                return;
            }
        } else if (!sDefaultLibraryLoader.LIZ(allLibsList)) {
            sLibraryLoadStatus = EnumC39801Fjh.NOT_LOAD;
            return;
        }
        sLibraryLoadStatus = EnumC39801Fjh.LOADED;
        InterfaceC39805Fjl interfaceC39805Fjl = mLibraryHooker;
        if (interfaceC39805Fjl != null) {
            interfaceC39805Fjl.LIZIZ(strArr);
        }
    }

    public static synchronized void loadBase() {
        synchronized (TENativeLibsLoader.class) {
            loadLibrary();
        }
    }

    public static synchronized void loadByteBench() {
        synchronized (TENativeLibsLoader.class) {
            if (!sIsSegmentalLoad) {
                loadAllLibs();
            } else {
                segmentalLoad("bytebench");
            }
        }
    }

    public static synchronized void loadEditor() {
        synchronized (TENativeLibsLoader.class) {
            loadLibrary();
        }
    }

    public static synchronized void loadEffectSDK() {
        synchronized (TENativeLibsLoader.class) {
            ArrayList arrayList = new ArrayList();
            arrayList.add("bytenn");
            for (String str : sEffectLibs) {
                if (!arrayList.contains(str)) {
                    arrayList.add(str);
                }
            }
            sDefaultLibraryLoader.LIZ(arrayList);
        }
    }

    public static synchronized void loadImage() {
        synchronized (TENativeLibsLoader.class) {
            loadLibrary();
        }
    }

    public static synchronized void loadLibrary() {
        synchronized (TENativeLibsLoader.class) {
            if (!sIsSegmentalLoad) {
                loadAllLibs();
            } else {
                segmentalLoad("ttvesdk");
            }
        }
    }

    public static synchronized void loadOldEditor() {
        synchronized (TENativeLibsLoader.class) {
            loadLibrary();
        }
    }

    public static synchronized void loadRecorder() {
        synchronized (TENativeLibsLoader.class) {
            loadLibrary();
        }
    }

    public static void initLibReferenceList() {
        List<String> allLibsList = getAllLibsList();
        Collections.reverse(allLibsList);
        Iterator<String> it = allLibsList.iterator();
        while (it.hasNext()) {
            sLibraryReferenceList.add(new C39804Fjk(it.next()));
        }
    }

    public static EnumC39801Fjh getLibraryLoadStatus() {
        return sLibraryLoadStatus;
    }

    public static boolean isSegmentalLoadEnable() {
        return sIsSegmentalLoad;
    }

    public static void enableLoadOptLibrary(boolean z) {
        sLoadOptLibrary = z;
    }

    public static void enableSegmentalLoading(boolean z) {
        sIsSegmentalLoad = z;
    }

    public static void segmentalLoad(String str) {
        if (sLibraryReferenceList.size() <= 0) {
            initLibReferenceList();
        }
        LinkedList linkedList = new LinkedList();
        Iterator<C39804Fjk> it = sLibraryReferenceList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C39804Fjk next = it.next();
            if (str == next.LIZ) {
                if (next.LIZIZ) {
                    return;
                }
                next.LIZIZ = true;
                linkedList.add(next.LIZ);
            }
        }
        while (it.hasNext()) {
            C39804Fjk next2 = it.next();
            if (next2.LIZIZ) {
                break;
            }
            next2.LIZIZ = true;
            linkedList.add(next2.LIZ);
        }
        Collections.reverse(linkedList);
        String[] strArr = new String[linkedList.size()];
        for (int i = 0; i < linkedList.size(); i++) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("lib");
            strArr[i] = JBR.LJFF(LIZ, (String) linkedList.get(i), ".so", LIZ);
        }
        sLibraryLoadStatus = EnumC39801Fjh.LOADING;
        InterfaceC38927FPn interfaceC38927FPn = mLibraryLoader;
        if (interfaceC38927FPn != null) {
            if (!interfaceC38927FPn.LIZ(linkedList)) {
                sLibraryLoadStatus = EnumC39801Fjh.NOT_LOAD;
                return;
            }
        } else if (!sDefaultLibraryLoader.LIZ(linkedList)) {
            sLibraryLoadStatus = EnumC39801Fjh.NOT_LOAD;
            return;
        }
        sLibraryLoadStatus = EnumC39801Fjh.LOADED;
        InterfaceC39805Fjl interfaceC39805Fjl = mLibraryHooker;
        if (interfaceC39805Fjl != null) {
            interfaceC39805Fjl.LIZIZ(strArr);
        }
    }

    public static synchronized void setContext(Context context) {
        synchronized (TENativeLibsLoader.class) {
            sContext = context;
        }
    }

    public static void setLibraryHooker(InterfaceC39805Fjl interfaceC39805Fjl) {
        mLibraryHooker = interfaceC39805Fjl;
    }

    public static void setLibraryLoad(InterfaceC38927FPn interfaceC38927FPn) {
        mLibraryLoader = interfaceC38927FPn;
    }
}
