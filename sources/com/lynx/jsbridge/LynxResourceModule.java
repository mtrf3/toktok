package com.lynx.jsbridge;

import X.AbstractC39537FfR;
import X.C03880Dg;
import X.C65300Pk0;
import X.C78983UzD;
import X.InterfaceC37728ErM;
import X.VNU;
import X.X1D;
import android.util.Pair;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;

/* loaded from: classes7.dex */
public class LynxResourceModule extends LynxContextModule {
    public static final String NAME = "LynxResourceModule";
    public AbstractC39537FfR sImagePrefetchHelper;

    public LynxResourceModule(VNU vnu) {
        super(vnu);
        AbstractC39537FfR abstractC39537FfR = C78983UzD.LJLLLLLL;
        if (abstractC39537FfR == null) {
            try {
                C78983UzD.LJLLLLLL = (AbstractC39537FfR) Class.forName("com.lynx.fresco.FrescoImagePrefetchHelper").newInstance();
            } catch (Exception e) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("get FrescoImagePrefetchHelper failed, ");
                LIZ.append(e.getMessage());
                LLog.LIZLLL(3, "Image", X1D.LIZIZ(LIZ));
            }
            abstractC39537FfR = C78983UzD.LJLLLLLL;
        }
        this.sImagePrefetchHelper = abstractC39537FfR;
    }

    @InterfaceC37728ErM
    public void cancelResourcePrefetch(ReadableMap readableMap, Callback callback) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {readableMap, callback};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", "-516381797541492700");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxResourceModule", "cancelResourcePrefetch", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxResourceModule", "cancelResourcePrefetch", null, objArr, this, c65300Pk0, false);
            return;
        }
        TraceEvent.LIZIZ("cancelResourcePrefetch");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Pair<Integer, String> resourcePrefetch = resourcePrefetch(readableMap, true, javaOnlyMap);
        Integer num = (Integer) resourcePrefetch.first;
        String str = (String) resourcePrefetch.second;
        TraceEvent.LJ("cancelResourcePrefetch");
        javaOnlyMap.putInt("code", num.intValue());
        javaOnlyMap.putString("msg", str);
        callback.invoke(javaOnlyMap);
        c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxResourceModule", "cancelResourcePrefetch", null, objArr, this, c65300Pk0, true);
    }

    @InterfaceC37728ErM
    public void requestResourcePrefetch(ReadableMap readableMap, Callback callback) {
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {readableMap, callback};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(Lcom/lynx/react/bridge/ReadableMap;Lcom/lynx/react/bridge/Callback;)V", "-516381797541492700");
        if (c03880Dg.LIZJ(300002, "com/lynx/jsbridge/LynxResourceModule", "requestResourcePrefetch", this, objArr, "void", c65300Pk0).LIZ) {
            c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxResourceModule", "requestResourcePrefetch", null, objArr, this, c65300Pk0, false);
            return;
        }
        TraceEvent.LIZIZ("requestResourcePrefetch");
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        Pair<Integer, String> resourcePrefetch = resourcePrefetch(readableMap, false, javaOnlyMap);
        Integer num = (Integer) resourcePrefetch.first;
        String str = (String) resourcePrefetch.second;
        TraceEvent.LJ("requestResourcePrefetch");
        javaOnlyMap.putInt("code", num.intValue());
        javaOnlyMap.putString("msg", str);
        callback.invoke(javaOnlyMap);
        c03880Dg.LIZIZ(300002, "com/lynx/jsbridge/LynxResourceModule", "requestResourcePrefetch", null, objArr, this, c65300Pk0, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a9, code lost:
    
        if (r11.equals("audio") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Pair<java.lang.Integer, java.lang.String> cancelResourcePrefetchInternal(java.lang.String r10, java.lang.String r11, com.lynx.react.bridge.ReadableMap r12) {
        /*
            r9 = this;
            r1 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r11.getClass()
            int r0 = r11.hashCode()
            r3 = 2
            switch(r0) {
                case 93166550: goto La3;
                case 100313435: goto L96;
                case 112202875: goto L89;
                default: goto L10;
            }
        L10:
            r1 = -1
        L11:
            r8 = 11001(0x2af9, float:1.5416E-41)
            java.lang.String r7 = ""
            switch(r1) {
                case 0: goto L50;
                case 1: goto L43;
                case 2: goto L50;
                default: goto L18;
            }
        L18:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.String r0 = "Parameters error! Unknown type :"
            java.lang.String r7 = defpackage.i0.LJFF(r0, r11)
        L22:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "requestResourcePrefetch uri: "
            r1.<init>(r0)
            r1.append(r10)
            java.lang.String r0 = " type: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "LynxResourceModule"
            com.lynx.tasm.base.LLog.LIZLLL(r3, r0, r1)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r4, r7)
            return r0
        L43:
            X.FfR r0 = r9.sImagePrefetchHelper
            if (r0 != 0) goto L22
            r0 = 11002(0x2afa, float:1.5417E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = "Image prefetch helper do not exist!"
            goto L22
        L50:
            java.lang.String r6 = "missing preloadKey!"
            if (r12 != 0) goto L5a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
        L58:
            r7 = r6
            goto L22
        L5a:
            java.lang.String r0 = "preloadKey"
            r1 = 0
            java.lang.String r5 = r12.getString(r0, r1)
            java.lang.String r0 = "videoID"
            java.lang.String r2 = r12.getString(r0, r1)
            X.VEZ r1 = X.VEZ.LIZIZ()
            java.lang.Class<X.VA4> r0 = X.VA4.class
            X.FfS r0 = r1.LIZ(r0)
            X.VA4 r0 = (X.VA4) r0
            if (r0 != 0) goto L7e
            r0 = 11003(0x2afb, float:1.5418E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = "Resource service do not exist!"
            goto L22
        L7e:
            if (r5 != 0) goto L85
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            goto L58
        L85:
            r0.cancelPreloadMedia(r5, r2)
            goto L22
        L89:
            java.lang.String r0 = "video"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L93
            goto L10
        L93:
            r1 = 2
            goto L11
        L96:
            java.lang.String r0 = "image"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto La0
            goto L10
        La0:
            r1 = 1
            goto L11
        La3:
            java.lang.String r0 = "audio"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L11
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.jsbridge.LynxResourceModule.cancelResourcePrefetchInternal(java.lang.String, java.lang.String, com.lynx.react.bridge.ReadableMap):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c3, code lost:
    
        if (r18.equals("audio") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Pair<java.lang.Integer, java.lang.String> requestResourcePrefetchInternal(java.lang.String r17, java.lang.String r18, com.lynx.react.bridge.ReadableMap r19) {
        /*
            r16 = this;
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r4 = r18
            r4.getClass()
            int r0 = r4.hashCode()
            r3 = 2
            switch(r0) {
                case 93166550: goto Lbd;
                case 100313435: goto Lb0;
                case 112202875: goto La3;
                default: goto L12;
            }
        L12:
            r1 = -1
        L13:
            r5 = 0
            r9 = 11001(0x2af9, float:1.5416E-41)
            java.lang.String r6 = ""
            r8 = r19
            r11 = r17
            switch(r1) {
                case 0: goto L62;
                case 1: goto L4a;
                case 2: goto L62;
                default: goto L1f;
            }
        L1f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            java.lang.String r0 = "Parameters error! Unknown type :"
            java.lang.String r6 = defpackage.i0.LJFF(r0, r4)
        L29:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "requestResourcePrefetch uri: "
            r1.<init>(r0)
            r1.append(r11)
            java.lang.String r0 = " type: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "LynxResourceModule"
            com.lynx.tasm.base.LLog.LIZLLL(r3, r0, r1)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r6)
            return r0
        L4a:
            r0 = r16
            X.FfR r1 = r0.sImagePrefetchHelper
            if (r1 != 0) goto L59
            r0 = 11002(0x2afa, float:1.5417E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r6 = "Image prefetch helper do not exist!"
            goto L29
        L59:
            X.VNU r0 = r0.mLynxContext
            r0.getClass()
            r1.prefetchImage(r11, r5, r8)
            goto L29
        L62:
            java.lang.String r7 = "missing preloadKey!"
            if (r8 != 0) goto L6c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
        L6a:
            r6 = r7
            goto L29
        L6c:
            java.lang.String r0 = "preloadKey"
            java.lang.String r12 = r8.getString(r0, r5)
            java.lang.String r0 = "videoID"
            java.lang.String r13 = r8.getString(r0, r5)
            java.lang.String r5 = "size"
            r0 = 512000(0x7d000, double:2.529616E-318)
            long r14 = r8.getLong(r5, r0)
            X.VEZ r1 = X.VEZ.LIZIZ()
            java.lang.Class<X.VA4> r0 = X.VA4.class
            X.FfS r10 = r1.LIZ(r0)
            X.VA4 r10 = (X.VA4) r10
            if (r10 != 0) goto L98
            r0 = 11003(0x2afb, float:1.5418E-41)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r6 = "Resource service do not exist!"
            goto L29
        L98:
            if (r12 != 0) goto L9f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            goto L6a
        L9f:
            r10.preloadMedia(r11, r12, r13, r14)
            goto L29
        La3:
            java.lang.String r0 = "video"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto Lad
            goto L12
        Lad:
            r1 = 2
            goto L13
        Lb0:
            java.lang.String r0 = "image"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto Lba
            goto L12
        Lba:
            r1 = 1
            goto L13
        Lbd:
            java.lang.String r0 = "audio"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L13
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.jsbridge.LynxResourceModule.requestResourcePrefetchInternal(java.lang.String, java.lang.String, com.lynx.react.bridge.ReadableMap):android.util.Pair");
    }

    private Pair<Integer, String> resourcePrefetch(ReadableMap readableMap, boolean z, JavaOnlyMap javaOnlyMap) {
        String str;
        String str2;
        Pair<Integer, String> requestResourcePrefetchInternal;
        Integer num;
        Integer num2 = 0;
        ReadableArray array = readableMap.getArray("data", null);
        if (array == null) {
            str = "Parameters error! Value of 'data' should be an array.";
            num2 = 11001;
        } else {
            JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
            for (int i = 0; i < array.size(); i++) {
                JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
                if (array.getType(i) != ReadableType.Map) {
                    str2 = "Parameters error! The prefetch data should be a map.";
                } else {
                    ReadableMap map = array.getMap(i);
                    String string = map.getString("uri", null);
                    String string2 = map.getString("type", null);
                    ReadableMap map2 = map.getMap("params", null);
                    if (string == null || string2 == null) {
                        str2 = "Parameters error! 'uri' or 'type' is null.";
                    } else {
                        if (z) {
                            requestResourcePrefetchInternal = cancelResourcePrefetchInternal(string, string2, map2);
                        } else {
                            requestResourcePrefetchInternal = requestResourcePrefetchInternal(string, string2, map2);
                        }
                        num = (Integer) requestResourcePrefetchInternal.first;
                        str2 = (String) requestResourcePrefetchInternal.second;
                        javaOnlyMap2.putString("uri", string);
                        javaOnlyMap2.putString("type", string2);
                        javaOnlyMap2.putInt("code", num.intValue());
                        javaOnlyMap2.putString("msg", str2);
                        javaOnlyArray.pushMap(javaOnlyMap2);
                    }
                }
                num = 11001;
                javaOnlyMap2.putInt("code", num.intValue());
                javaOnlyMap2.putString("msg", str2);
                javaOnlyArray.pushMap(javaOnlyMap2);
            }
            javaOnlyMap.putArray("details", javaOnlyArray);
            str = "";
        }
        return new Pair<>(num2, str);
    }
}
