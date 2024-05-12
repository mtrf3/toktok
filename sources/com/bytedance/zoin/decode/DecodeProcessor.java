package com.bytedance.zoin.decode;

import X.C06830Op;
import X.C0F0;
import X.C39629Fgv;
import X.C39636Fh2;
import X.C39639Fh5;
import X.C39642Fh8;
import X.C39724FiS;
import X.C39725FiT;
import X.C39727FiV;
import X.C39734Fic;
import X.C78929UyL;
import X.C79061V1d;
import X.CallableC39730FiY;
import X.EWI;
import X.JBR;
import X.X1D;
import Y.IDComparatorS34S0000000_6;
import android.app.Application;
import android.text.TextUtils;
import com.bytedance.zoin.ZoinNative;
import com.bytedance.zoin.model.AbstractModule;
import com.bytedance.zoin.model.ZoinBlockInfo;
import com.bytedance.zoin.model.ZoinBuildFileInfo;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import dalvik.system.BaseDexClassLoader;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class DecodeProcessor {
    public static void monitorDecompressEnd(String str) {
        C39734Fic.LIZJ().LIZ(str);
    }

    public static void monitorDecompressStart(String str) {
        C39734Fic.LIZJ().LIZIZ(str);
    }

    public static int decodeLib(String str, boolean z) {
        C39734Fic LIZJ = C39734Fic.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("zoin dlopen decode lib ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        LIZJ.getClass();
        C39725FiT c39725FiT = C39642Fh8.LIZ;
        AbstractModule LIZIZ = c39725FiT.LIZIZ(str);
        if (LIZIZ == null) {
            C39734Fic LIZJ2 = C39734Fic.LIZJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("find module failed when dlopen ");
            LIZ2.append(str);
            X1D.LIZIZ(LIZ2);
            LIZJ2.getClass();
            return -1;
        }
        LIZIZ.getRecordMap().put("lib_from_dlopen", Boolean.TRUE);
        LIZIZ.getRecordMap().put("lib_name_from_dlopen", str);
        C39724FiS LIZ3 = c39725FiT.LIZ(LIZIZ.moduleName, z);
        if (LIZ3.LIZ()) {
            return LIZ3.LIZ;
        }
        C39734Fic LIZJ3 = C39734Fic.LIZJ();
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("zoin dlopen start decode lib failed ");
        LIZ4.append(LIZ3.LIZ);
        X1D.LIZIZ(LIZ4);
        LIZJ3.getClass();
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("dlopen decode failed ");
        LIZ5.append(LIZ3.LIZ);
        throw new C39727FiV(X1D.LIZIZ(LIZ5), LIZ3.LIZIZ);
    }

    public static /* synthetic */ int lambda$decodeAndVerify$0(ZoinBlockInfo zoinBlockInfo, ZoinBlockInfo zoinBlockInfo2) {
        return (int) ((zoinBlockInfo2.blockEndOffset - zoinBlockInfo2.blockBeginOffset) - (zoinBlockInfo.blockEndOffset - zoinBlockInfo.blockBeginOffset));
    }

    public static void renameTempFiles(File file, List<ZoinBuildFileInfo> list) {
        for (ZoinBuildFileInfo zoinBuildFileInfo : list) {
            StringBuilder LIZ = X1D.LIZ();
            File file2 = new File(file, JBR.LJFF(LIZ, zoinBuildFileInfo.name, ".temp", LIZ));
            if (file2.exists()) {
                File file3 = new File(file, zoinBuildFileInfo.name);
                if (!file2.renameTo(file3)) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("rename files failed ");
                    LIZ2.append(file2.getPath());
                    LIZ2.append(" ");
                    LIZ2.append(file3.getPath());
                    throw new C39727FiV(X1D.LIZIZ(LIZ2));
                }
            }
        }
    }

    public static int decodeAndVerify(File file, List<ZoinBuildFileInfo> list, List<ZoinBlockInfo> list2, boolean z) {
        String str;
        int i;
        File[] listFiles;
        HashMap hashMap = new HashMap();
        Collections.sort(list2, new IDComparatorS34S0000000_6(4));
        for (ZoinBlockInfo zoinBlockInfo : list2) {
            ArrayList arrayList = new ArrayList();
            int i2 = zoinBlockInfo.totalDecompressedLength;
            for (ZoinBuildFileInfo zoinBuildFileInfo : list) {
                if (zoinBuildFileInfo.compressedName.equals(zoinBlockInfo.blockCompressedName)) {
                    arrayList.add(zoinBuildFileInfo);
                }
            }
            if (arrayList.size() == 0) {
                C39734Fic.LIZJ().getClass();
                for (ZoinBuildFileInfo zoinBuildFileInfo2 : list) {
                    C39734Fic LIZJ = C39734Fic.LIZJ();
                    zoinBuildFileInfo2.toString();
                    LIZJ.getClass();
                }
                for (ZoinBlockInfo zoinBlockInfo2 : list2) {
                    C39734Fic LIZJ2 = C39734Fic.LIZJ();
                    zoinBlockInfo2.toString();
                    LIZJ2.getClass();
                }
            } else {
                if (zoinBlockInfo.blockName.endsWith(".so")) {
                    File file2 = new File(C78929UyL.LJLIL.getApplicationInfo().nativeLibraryDir);
                    File file3 = new File(file2, zoinBlockInfo.blockName);
                    List<String> list3 = C39639Fh5.LIZJ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("compressedDataPath:");
                    LIZ.append(file3.getPath());
                    CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list3;
                    copyOnWriteArrayList.add(X1D.LIZIZ(LIZ));
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("compressedData exist:");
                    LIZ2.append(file3.exists());
                    copyOnWriteArrayList.add(X1D.LIZIZ(LIZ2));
                    i = 2;
                    if (file3.exists()) {
                        str = file3.getPath();
                    } else {
                        if (file2.exists() && (listFiles = file2.listFiles()) != null && listFiles.length > 0) {
                            for (File file4 : listFiles) {
                                List<String> list4 = C39639Fh5.LIZJ;
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append("nativeLibraryDir files:");
                                LIZ3.append(file4.getName());
                                ((CopyOnWriteArrayList) list4).add(X1D.LIZIZ(LIZ3));
                            }
                        }
                        File parentFile = file2.getParentFile();
                        if (parentFile != null) {
                            ((CopyOnWriteArrayList) C39639Fh5.LIZJ).add(C0F0.LIZJ("nativeLibraryDir parent file:", parentFile));
                            File[] listFiles2 = parentFile.listFiles();
                            if (listFiles2 != null && listFiles2.length > 0) {
                                for (File file5 : listFiles2) {
                                    List<String> list5 = C39639Fh5.LIZJ;
                                    StringBuilder LIZ4 = X1D.LIZ();
                                    LIZ4.append(parentFile);
                                    LIZ4.append(" dir:");
                                    LIZ4.append(file5.getPath());
                                    ((CopyOnWriteArrayList) list5).add(X1D.LIZIZ(LIZ4));
                                }
                            }
                        }
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append("lib/");
                        LIZ5.append(C39629Fgv.LIZJ(C78929UyL.LJLIL));
                        LIZ5.append("/");
                        LIZ5.append(zoinBlockInfo.blockName);
                        String LIZIZ = X1D.LIZIZ(LIZ5);
                        CopyOnWriteArrayList copyOnWriteArrayList2 = (CopyOnWriteArrayList) C39639Fh5.LIZJ;
                        copyOnWriteArrayList2.add(i0.LJFF("get input stream fail, metadataPath:", LIZIZ));
                        File LIZ6 = C39636Fh2.LIZ(C78929UyL.LJLIL, LIZIZ);
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append("get input stream, splitApk:");
                        LIZ7.append(LIZ6);
                        copyOnWriteArrayList2.add(X1D.LIZIZ(LIZ7));
                        if (LIZ6 != null) {
                            str = LIZ6.getPath();
                            i = 1;
                        } else {
                            BaseDexClassLoader baseDexClassLoader = (BaseDexClassLoader) C78929UyL.LJLIL.getClassLoader();
                            boolean isIsLoaded = ZoinNative.isIsLoaded();
                            StringBuilder LIZ8 = X1D.LIZ();
                            LIZ8.append("load zoin.so: ");
                            LIZ8.append(isIsLoaded);
                            copyOnWriteArrayList2.add(X1D.LIZIZ(LIZ8));
                            if (!isIsLoaded) {
                                StringBuilder LIZ9 = X1D.LIZ();
                                LIZ9.append("current libc: ");
                                LIZ9.append(baseDexClassLoader.findLibrary("c"));
                                copyOnWriteArrayList2.add(X1D.LIZIZ(LIZ9));
                                StringBuilder LIZ10 = X1D.LIZ();
                                LIZ10.append("current abi: ");
                                LIZ10.append(C39629Fgv.LIZJ(C78929UyL.LJLIL));
                                copyOnWriteArrayList2.add(X1D.LIZIZ(LIZ10));
                                StringBuilder LIZ11 = X1D.LIZ();
                                LIZ11.append("current test64 abi: ");
                                Application application = C78929UyL.LJLIL;
                                StringBuilder LIZ12 = X1D.LIZ();
                                LIZ12.append("lib/arm64-v8a/");
                                LIZ12.append(zoinBlockInfo.blockName);
                                LIZ11.append(C39636Fh2.LIZ(application, X1D.LIZIZ(LIZ12)));
                                copyOnWriteArrayList2.add(X1D.LIZIZ(LIZ11));
                                StringBuilder LIZ13 = X1D.LIZ();
                                LIZ13.append("current test32 abi: ");
                                Application application2 = C78929UyL.LJLIL;
                                StringBuilder LIZ14 = X1D.LIZ();
                                LIZ14.append("lib/armeabi-v7a/");
                                LIZ14.append(zoinBlockInfo.blockName);
                                LIZ13.append(C39636Fh2.LIZ(application2, X1D.LIZIZ(LIZ14)));
                                copyOnWriteArrayList2.add(X1D.LIZIZ(LIZ13));
                            }
                            String LJ = C79061V1d.LJ(zoinBlockInfo.blockName, 3, 3);
                            str = baseDexClassLoader.findLibrary(LJ);
                            StringBuilder LIZ15 = X1D.LIZ();
                            LIZ15.append("compressedDataPath classLoader:");
                            LIZ15.append(str);
                            LIZ15.append(" , metadataPath:");
                            LIZ15.append(LJ);
                            copyOnWriteArrayList2.add(X1D.LIZIZ(LIZ15));
                            if (str == null) {
                                i = 0;
                            }
                        }
                    }
                } else {
                    str = zoinBlockInfo.blockName;
                    i = 0;
                }
                if (!TextUtils.isEmpty(str)) {
                    C39734Fic LIZJ3 = C39734Fic.LIZJ();
                    StringBuilder LIZ16 = C06830Op.LIZ("compressed info:", i, " ", str, " ");
                    LIZ16.append(zoinBlockInfo.blockCompressedName);
                    X1D.LIZIZ(LIZ16);
                    LIZJ3.getClass();
                    String str2 = zoinBlockInfo.blockName;
                    C39734Fic LIZJ4 = C39734Fic.LIZJ();
                    if (LIZJ4.LIZIZ == null) {
                        LIZJ4.LIZIZ = new PThreadPoolExecutor(0, Integer.MAX_VALUE, 100L, TimeUnit.MILLISECONDS, new SynchronousQueue(), new EWI());
                    }
                    hashMap.put(zoinBlockInfo, LIZJ4.LIZIZ.submit(new CallableC39730FiY(zoinBlockInfo, str, str2, i2, i, arrayList, z, file)));
                } else {
                    throw new C39727FiV("compressed so not found");
                }
            }
        }
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) ((Future) ((Map.Entry) it.next()).getValue()).get()).intValue();
            if (intValue != 0) {
                return intValue;
            }
        }
        return 0;
    }
}
