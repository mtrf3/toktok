package com.bytedance.zoin.model;

import X.C39629Fgv;
import X.C39734Fic;
import X.C78929UyL;
import X.X1D;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.zoin.model.LibModuleInfo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes7.dex */
public class ModuleManager {
    public static volatile Set<String> compressedLib;
    public static List<LibDependency> dependencyList;
    public static final List<AbstractModuleInfo> moduleInfos = new ArrayList();
    public static String sMetaMd5 = "defaultmd5";
    public static volatile boolean isReadMetadataSuccess = false;

    /* loaded from: classes7.dex */
    public interface ParserState {
        public static final String TYPE = "moduleType:";
    }

    public static void initModuleInfos() {
        LibModuleInfo libModuleInfo = new LibModuleInfo();
        libModuleInfo.moduleName = "media";
        libModuleInfo.moduleType = 0;
        LibModuleInfo.AbiLibInfo abiLibInfo = new LibModuleInfo.AbiLibInfo();
        abiLibInfo.abiName = "armeabi-v7a";
        ZoinBuildFileInfo zoinBuildFileInfo = new ZoinBuildFileInfo();
        zoinBuildFileInfo.name = "libeffect.so";
        zoinBuildFileInfo.beginOffset = 0;
        zoinBuildFileInfo.endOffset = 15192772;
        zoinBuildFileInfo.offsetInFile = 0;
        zoinBuildFileInfo.fileLength = 15192772;
        zoinBuildFileInfo.checkNumber = 493087284L;
        zoinBuildFileInfo.compressedName = "libmedia_1.so";
        zoinBuildFileInfo.relativePath = "libeffect.so";
        abiLibInfo.libFileInfoList.add(zoinBuildFileInfo);
        ZoinBlockInfo zoinBlockInfo = new ZoinBlockInfo();
        zoinBlockInfo.blockName = "libmedia.so";
        zoinBlockInfo.blockCompressedName = "libmedia_1.so";
        zoinBlockInfo.blockBeginOffset = 0L;
        zoinBlockInfo.blockEndOffset = 5132088L;
        zoinBlockInfo.totalDecompressedLength = 15192772;
        abiLibInfo.blockInfoList.add(zoinBlockInfo);
        LibDependency libDependency = new LibDependency();
        libDependency.libName = "libttlivestreamercore.so";
        libDependency.depsList.add("libeffect.so");
        abiLibInfo.libDependencyList.add(libDependency);
        LibDependency libDependency2 = new LibDependency();
        libDependency2.libName = "libEffectEditorJni.so";
        libDependency2.depsList.add("libeffect.so");
        abiLibInfo.libDependencyList.add(libDependency2);
        LibDependency libDependency3 = new LibDependency();
        libDependency3.libName = "libeffect.so";
        abiLibInfo.libDependencyList.add(libDependency3);
        LibDependency libDependency4 = new LibDependency();
        libDependency4.libName = "libSmartMovieJni.so";
        libDependency4.depsList.add("libeffect.so");
        abiLibInfo.libDependencyList.add(libDependency4);
        LibDependency libDependency5 = new LibDependency();
        libDependency5.libName = "libttvesdk.so";
        libDependency5.depsList.add("libeffect.so");
        abiLibInfo.libDependencyList.add(libDependency5);
        libModuleInfo.abiLibInfoList.add(abiLibInfo);
        LibModuleInfo.AbiLibInfo abiLibInfo2 = new LibModuleInfo.AbiLibInfo();
        abiLibInfo2.abiName = "arm64-v8a";
        ZoinBuildFileInfo zoinBuildFileInfo2 = new ZoinBuildFileInfo();
        zoinBuildFileInfo2.name = "libeffect.so";
        zoinBuildFileInfo2.beginOffset = 0;
        zoinBuildFileInfo2.endOffset = 22130640;
        zoinBuildFileInfo2.offsetInFile = 0;
        zoinBuildFileInfo2.fileLength = 22130640;
        zoinBuildFileInfo2.checkNumber = 758947637L;
        zoinBuildFileInfo2.compressedName = "libmedia_1.so";
        zoinBuildFileInfo2.relativePath = "libeffect.so";
        abiLibInfo2.libFileInfoList.add(zoinBuildFileInfo2);
        ZoinBlockInfo zoinBlockInfo2 = new ZoinBlockInfo();
        zoinBlockInfo2.blockName = "libmedia.so";
        zoinBlockInfo2.blockCompressedName = "libmedia_1.so";
        zoinBlockInfo2.blockBeginOffset = 0L;
        zoinBlockInfo2.blockEndOffset = 5303506L;
        zoinBlockInfo2.totalDecompressedLength = 22130640;
        abiLibInfo2.blockInfoList.add(zoinBlockInfo2);
        LibDependency libDependency6 = new LibDependency();
        libDependency6.libName = "libttlivestreamercore.so";
        libDependency6.depsList.add("libeffect.so");
        abiLibInfo2.libDependencyList.add(libDependency6);
        LibDependency libDependency7 = new LibDependency();
        libDependency7.libName = "libEffectEditorJni.so";
        libDependency7.depsList.add("libeffect.so");
        abiLibInfo2.libDependencyList.add(libDependency7);
        LibDependency libDependency8 = new LibDependency();
        libDependency8.libName = "libeffect.so";
        abiLibInfo2.libDependencyList.add(libDependency8);
        LibDependency libDependency9 = new LibDependency();
        libDependency9.libName = "libSmartMovieJni.so";
        libDependency9.depsList.add("libeffect.so");
        abiLibInfo2.libDependencyList.add(libDependency9);
        LibDependency libDependency10 = new LibDependency();
        libDependency10.libName = "libttvesdk.so";
        libDependency10.depsList.add("libeffect.so");
        abiLibInfo2.libDependencyList.add(libDependency10);
        libModuleInfo.abiLibInfoList.add(abiLibInfo2);
        moduleInfos.add(libModuleInfo);
        sMetaMd5 = "145b3176a0e4ebe9";
    }

    static {
        initModuleInfos();
        dependencyList = new ArrayList();
        compressedLib = new HashSet();
    }

    public static String debugMetadata() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getMetadataStream(C78929UyL.LJLIL)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine.trim());
                sb.append("$$");
            }
        } catch (Throwable th) {
            sb.append("debug metaData");
            sb.append(th);
        }
        return sb.toString();
    }

    public static List<LibModuleInfo> getTotalLibModuleInfos() {
        ArrayList arrayList = new ArrayList();
        for (AbstractModuleInfo abstractModuleInfo : moduleInfos) {
            if (abstractModuleInfo.moduleType == 0) {
                arrayList.add(abstractModuleInfo);
            }
        }
        return arrayList;
    }

    public static void logModules() {
        for (AbstractModuleInfo abstractModuleInfo : moduleInfos) {
            C39734Fic LIZJ = C39734Fic.LIZJ();
            abstractModuleInfo.toString();
            LIZJ.getClass();
        }
    }

    public static List<LibDependency> getDependencyList() {
        return dependencyList;
    }

    public static String prepareDeps() {
        return "";
    }

    public static AbstractModuleInfo findModuleByName(String str) {
        for (AbstractModuleInfo abstractModuleInfo : moduleInfos) {
            if (abstractModuleInfo.moduleName.equals(str)) {
                return abstractModuleInfo;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        r6 = r3.getInputStream(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.io.InputStream getMetadataStream(android.content.Context r7) {
        /*
            java.lang.String r1 = "zoin/metadata.txt"
            r6 = 0
            android.content.res.Resources r0 = r7.getResources()     // Catch: java.io.IOException -> L10
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.io.IOException -> L10
            java.io.InputStream r5 = r0.open(r1)     // Catch: java.io.IOException -> L10
            goto L25
        L10:
            android.content.res.Resources r0 = r7.getResources()     // Catch: java.io.IOException -> L1d
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.io.IOException -> L1d
            java.io.InputStream r5 = r0.open(r1)     // Catch: java.io.IOException -> L1d
            goto L25
        L1d:
            X.Fic r0 = X.C39734Fic.LIZJ()
            r0.getClass()
            r5 = r6
        L25:
            if (r5 != 0) goto L68
            java.lang.String r4 = "assets/zoin/metadata.txt"
            if (r7 != 0) goto L2c
            goto L5b
        L2c:
            java.lang.String r1 = r7.getPackageResourcePath()     // Catch: java.io.IOException -> L5d
            if (r1 != 0) goto L33
            goto L5b
        L33:
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L5d
            r0.<init>(r1)     // Catch: java.io.IOException -> L5d
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch: java.io.IOException -> L5d
            r3.<init>(r0)     // Catch: java.io.IOException -> L5d
            java.util.Enumeration r2 = r3.entries()     // Catch: java.io.IOException -> L5d
        L41:
            boolean r0 = r2.hasMoreElements()     // Catch: java.io.IOException -> L5d
            if (r0 == 0) goto L5b
            java.lang.Object r1 = r2.nextElement()     // Catch: java.io.IOException -> L5d
            java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1     // Catch: java.io.IOException -> L5d
            java.lang.String r0 = r1.getName()     // Catch: java.io.IOException -> L5d
            boolean r0 = r4.equals(r0)     // Catch: java.io.IOException -> L5d
            if (r0 == 0) goto L41
            java.io.InputStream r6 = r3.getInputStream(r1)     // Catch: java.io.IOException -> L5d
        L5b:
            r5 = r6
            goto L68
        L5d:
            r1 = move-exception
            X.Fic r0 = X.C39734Fic.LIZJ()
            r0.getClass()
            X.C16880lQ.LLLLIIL(r1)
        L68:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.zoin.model.ModuleManager.getMetadataStream(android.content.Context):java.io.InputStream");
    }

    public static boolean init(Context context) {
        if (isReadMetadataSuccess) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C39734Fic LIZJ = C39734Fic.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Zoin runtime for initModuleInfos: ");
        LIZ.append(System.currentTimeMillis() - currentTimeMillis);
        LIZ.append(" ms");
        X1D.LIZIZ(LIZ);
        LIZJ.getClass();
        String LIZJ2 = C39629Fgv.LIZJ(context);
        for (LibModuleInfo libModuleInfo : getTotalLibModuleInfos()) {
            Iterator<LibModuleInfo.AbiLibInfo> it = libModuleInfo.abiLibInfoList.iterator();
            while (true) {
                if (it.hasNext()) {
                    LibModuleInfo.AbiLibInfo next = it.next();
                    if (next.abiName.equals(LIZJ2)) {
                        libModuleInfo.curAbiInfo = next;
                        break;
                    }
                }
            }
        }
        String str = sMetaMd5;
        if (!TextUtils.isEmpty(str)) {
            C78929UyL.LJLILLLLZI = str;
        }
        isReadMetadataSuccess = true;
        return isReadMetadataSuccess;
    }

    public static boolean isCompressed(String str) {
        if (compressedLib.isEmpty()) {
            for (AbstractModuleInfo abstractModuleInfo : moduleInfos) {
                if (abstractModuleInfo.moduleType == 0) {
                    Iterator<LibModuleInfo.AbiLibInfo> it = ((LibModuleInfo) abstractModuleInfo).abiLibInfoList.iterator();
                    while (it.hasNext()) {
                        Iterator<LibDependency> it2 = it.next().libDependencyList.iterator();
                        while (it2.hasNext()) {
                            compressedLib.add(it2.next().libName);
                        }
                    }
                }
            }
        }
        Set<String> set = compressedLib;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lib");
        LIZ.append(str);
        LIZ.append(".so");
        return set.contains(X1D.LIZIZ(LIZ));
    }

    public static void setDependencyList(List<LibDependency> list) {
        C39734Fic LIZJ = C39734Fic.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("set deps ");
        LIZ.append(list);
        X1D.LIZIZ(LIZ);
        LIZJ.getClass();
        dependencyList.addAll(list);
    }

    public static boolean waitToBeDecompressed(Context context) {
        if (moduleInfos.size() > 0) {
            return true;
        }
        return false;
    }
}
