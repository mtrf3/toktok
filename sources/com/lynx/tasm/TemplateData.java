package com.lynx.tasm;

import X.C36017EBp;
import X.C40053Fnl;
import android.text.TextUtils;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.base.TraceEvent;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class TemplateData {
    public long LIZ;
    public Map<String, Object> LIZIZ;
    public Map<String, Object> LIZJ;
    public String LIZLLL;
    public volatile boolean LJ;
    public boolean LJFF;

    public static native long nativeClone(long j);

    public static native Object nativeGetData(long j);

    public static native void nativeMergeTemplateData(long j, long j2);

    public static native long nativeParseData(ByteBuffer byteBuffer, int i);

    public static native long nativeParseStringData(String str);

    public static native void nativeReleaseData(long j);

    public static native void nativeUpdateData(long j, ByteBuffer byteBuffer, int i);

    public static TemplateData LIZIZ() {
        return new TemplateData(0L, null);
    }

    public final void LIZJ() {
        Map<String, Object> hashMap;
        Map<String, Object> hashMap2;
        if (this.LIZIZ == null) {
            if (this.LJ) {
                hashMap2 = new C36017EBp<>();
            } else {
                hashMap2 = new HashMap<>();
            }
            this.LIZIZ = hashMap2;
        }
        if (this.LIZJ == null) {
            if (this.LJ) {
                hashMap = new C36017EBp<>();
            } else {
                hashMap = new HashMap<>();
            }
            this.LIZJ = hashMap;
        }
    }

    public final void LIZLLL() {
        if (this.LIZ == 0) {
            C40053Fnl c40053Fnl = C40053Fnl.LIZ;
            Map<String, Object> map = this.LIZIZ;
            c40053Fnl.getClass();
            ByteBuffer LIZIZ = C40053Fnl.LIZIZ(map);
            if (LIZIZ != null && LIZIZ.position() > 0) {
                this.LIZ = nativeParseData(LIZIZ, LIZIZ.position());
                return;
            }
            return;
        }
        Map<String, Object> map2 = this.LIZJ;
        if (map2 == null || map2.size() == 0 || this.LIZIZ == null) {
            return;
        }
        C40053Fnl c40053Fnl2 = C40053Fnl.LIZ;
        Map<String, Object> map3 = this.LIZJ;
        c40053Fnl2.getClass();
        ByteBuffer LIZIZ2 = C40053Fnl.LIZIZ(map3);
        this.LIZIZ.putAll(this.LIZJ);
        this.LIZJ.clear();
        long j = this.LIZ;
        if (j == 0) {
            LLog.LIZLLL(4, "TemplateData", "mNative Data is null");
        } else {
            if (LIZIZ2 == null) {
                return;
            }
            nativeUpdateData(j, LIZIZ2, LIZIZ2.position());
        }
    }

    public final TemplateData LIZ() {
        LIZLLL();
        long j = this.LIZ;
        if (j != 0) {
            TemplateData templateData = new TemplateData(nativeClone(j), null);
            templateData.LIZLLL = this.LIZLLL;
            templateData.LJFF = this.LJFF;
            templateData.LJ = this.LJ;
            return templateData;
        }
        return LIZIZ();
    }

    public final void LJII() {
        LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
        LJIIIZ.LJIIL();
        if (LJIIIZ.LJIILIIL) {
            long j = this.LIZ;
            if (j != 0) {
                nativeReleaseData(j);
                this.LIZ = 0L;
            }
        }
    }

    public final Map<Object, Object> LJIIIIZZ() {
        LIZLLL();
        long j = this.LIZ;
        if (j == 0) {
            return null;
        }
        Object nativeGetData = nativeGetData(j);
        HashMap hashMap = new HashMap();
        if (nativeGetData instanceof Map) {
            hashMap.putAll((Map) nativeGetData);
        }
        return hashMap;
    }

    public final void finalize() {
        LJII();
        super.finalize();
    }

    public static TemplateData LJ(Map<String, Object> map) {
        TraceEvent.LIZIZ("TemplateRender.FromMap");
        LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
        LJIIIZ.LJIIL();
        if (LJIIIZ.LJIILIIL && map != null) {
            C40053Fnl.LIZ.getClass();
            ByteBuffer LIZIZ = C40053Fnl.LIZIZ(map);
            if (LIZIZ != null && LIZIZ.position() > 0) {
                long nativeParseData = nativeParseData(LIZIZ, LIZIZ.position());
                TraceEvent.LJ("TemplateRender.FromMap");
                return new TemplateData(nativeParseData, map);
            }
        }
        TraceEvent.LJ("TemplateRender.FromMap");
        return new TemplateData(0L, null);
    }

    public static TemplateData LJFF(String str) {
        TemplateData templateData;
        TraceEvent.LIZIZ("TemplateRender.FromString");
        LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
        LJIIIZ.LJIIL();
        if (LJIIIZ.LJIILIIL && !TextUtils.isEmpty(str)) {
            templateData = new TemplateData(nativeParseStringData(str), null);
        } else {
            templateData = new TemplateData(0L, null);
        }
        TraceEvent.LJ("TemplateRender.FromString");
        return templateData;
    }

    public static Object decodeByteBuffer(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            C40053Fnl.LIZ.getClass();
            return C40053Fnl.LIZ(byteBuffer);
        }
        return null;
    }

    public final void LJIIIZ(TemplateData templateData) {
        if (templateData == null) {
            return;
        }
        if (this.LJFF) {
            LLog.LIZLLL(3, "Lynx", "can not update readOnly TemplateData");
            return;
        }
        LIZJ();
        templateData.LIZLLL();
        long j = this.LIZ;
        if (j != 0) {
            long j2 = templateData.LIZ;
            if (j2 != 0) {
                nativeMergeTemplateData(j, j2);
            }
        }
    }

    public TemplateData(long j, Map<String, Object> map) {
        LynxEnv.LJIIIZ();
        this.LIZ = j;
        this.LIZLLL = null;
        if (j != 0) {
            this.LIZIZ = map;
        }
    }

    public final void LJI(String str, Object obj) {
        if (this.LJFF) {
            LLog.LIZLLL(3, "Lynx", "can not update readOnly TemplateData");
            return;
        }
        LIZJ();
        if (this.LIZ == 0) {
            this.LIZIZ.put(str, obj);
            return;
        }
        Object obj2 = this.LIZJ.get(str);
        if (obj2 == null) {
            obj2 = this.LIZIZ.get(str);
        }
        if (obj == null) {
            if (obj2 == null) {
                return;
            }
            this.LIZJ.put(str, null);
            return;
        }
        if (obj == obj2) {
            return;
        }
        if ((obj instanceof Map) && (obj2 instanceof Map)) {
            Map map = (Map) obj2;
            Map map2 = (Map) obj;
            HashMap hashMap = new HashMap();
            for (Object obj3 : map2.keySet()) {
                Object obj4 = map.get(obj3);
                Object obj5 = map2.get(obj3);
                if (obj4 != obj5) {
                    hashMap.put(obj3, obj5);
                }
            }
            this.LIZJ.put(str, hashMap);
            return;
        }
        this.LIZJ.put(str, obj);
    }
}
