package com.ss.android.ugc.aweme.actionai.action.data;

import com.bytedance.ies.smartmovie.jni.Meta;
import com.bytedance.ies.smartmovie.jni.SmartMovieJniJNI;
import com.bytedance.ies.smartmovie.jni.VecStr;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class ImageInfoListKt {
    public static final MetaCompat convertCompat(Meta meta) {
        o.LJIIIZ(meta, "<this>");
        long LIZIZ = meta.LIZIZ();
        long Meta_getFrameTimeStamp = SmartMovieJniJNI.Meta_getFrameTimeStamp(meta.LIZ, meta);
        boolean Meta_getHasAudio = SmartMovieJniJNI.Meta_getHasAudio(meta.LIZ, meta);
        long LIZJ = meta.LIZJ();
        long LJ = meta.LJ();
        VecStr vecStr = new VecStr(SmartMovieJniJNI.Meta_getIncludes(meta.LIZ, meta));
        boolean LJFF = meta.LJFF();
        String Meta_getName = SmartMovieJniJNI.Meta_getName(meta.LIZ, meta);
        o.LJIIIIZZ(Meta_getName, "meta.name");
        String LIZLLL = meta.LIZLLL();
        o.LJIIIIZZ(LIZLLL, "meta.path");
        return new MetaCompat(LIZIZ, Meta_getFrameTimeStamp, Meta_getHasAudio, LIZJ, LJ, vecStr, LJFF, Meta_getName, LIZLLL, SmartMovieJniJNI.Meta_getRotation(meta.LIZ, meta));
    }
}
