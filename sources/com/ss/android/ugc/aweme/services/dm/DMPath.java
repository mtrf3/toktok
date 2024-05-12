package com.ss.android.ugc.aweme.services.dm;

import X.C0EH;
import X.C221108m2;
import X.C5H3;
import X.JBR;
import X.V0N;
import X.X1D;
import java.io.File;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class DMPath {
    public static final Companion Companion = new Companion();
    public static final C5H3<String> ROOT$delegate = C221108m2.LIZIZ(DMPath$Companion$ROOT$2.INSTANCE);
    public final String id;

    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getUid() {
            return DMPublishService.INSTANCE.getCurrentUid();
        }

        public final String getROOT() {
            return DMPath.ROOT$delegate.getValue();
        }

        public final String getCACHE_ROOT() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(getROOT());
            LIZ.append("cache");
            String str = File.separator;
            LIZ.append(str);
            return JBR.LJFF(LIZ, getUid(), str, LIZ);
        }

        public final String getCREATIVE_ROOT() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(getROOT());
            LIZ.append("creative");
            String str = File.separator;
            LIZ.append(str);
            return JBR.LJFF(LIZ, getUid(), str, LIZ);
        }

        public Companion() {
        }
    }

    public final String getImageSynthesiseOutputPath() {
        String str = getCacheResourceDirPath(true) + File.separator + DMPathType.SYNTHESISE.getSpaceName();
        o.LJIIIIZZ(str, "StringBuilder(getCacheRe…)\n            .toString()");
        return str;
    }

    public final String getOriginFilePath() {
        String str = getCacheResourceDirPath(true) + File.separator + DMPathType.ORIGIN.getSpaceName();
        o.LJIIIIZZ(str, "StringBuilder(getCacheRe…)\n            .toString()");
        return str;
    }

    public final String getParallelUploadOutputPath() {
        String str = getCacheResourceDirPath(true) + File.separator + DMPathType.PARALLELUPLOAD.getSpaceName();
        o.LJIIIIZZ(str, "StringBuilder(getCacheRe…)\n            .toString()");
        return str;
    }

    public final String getVideoSynthesiseOutputPath() {
        String str = getCacheResourceDirPath(true) + File.separator + DMPathType.SYNTHESISE.getSpaceName() + ".mp4";
        o.LJIIIIZZ(str, "StringBuilder(getCacheRe…)\n            .toString()");
        return str;
    }

    /* loaded from: classes2.dex */
    public enum DMPathType {
        SYNTHESISE("synthesise"),
        ORIGIN("origin"),
        PARALLELUPLOAD("parallel_upload");

        public final String spaceName;

        public static DMPathType valueOf(String str) {
            return (DMPathType) V0N.LJJJ(DMPathType.class, str);
        }

        public final String getSpaceName() {
            return this.spaceName;
        }

        DMPathType(String str) {
            this.spaceName = str;
        }
    }

    public final String getId() {
        return this.id;
    }

    public DMPath(String id) {
        o.LJIIIZ(id, "id");
        this.id = id;
    }

    public final String genCreativeResourceDirPath(boolean z) {
        String LIZJ = C0EH.LIZJ(new StringBuilder(Companion.getCREATIVE_ROOT()), this.id, "StringBuilder(CREATIVE_ROOT).append(id).toString()");
        if (z) {
            DMPathKt.smartCreateNewDir(new File(LIZJ));
        }
        return LIZJ;
    }

    public final String getCacheResourceDirPath(boolean z) {
        String LIZJ = C0EH.LIZJ(new StringBuilder(Companion.getCACHE_ROOT()), this.id, "StringBuilder(CACHE_ROOT).append(id).toString()");
        if (z) {
            DMPathKt.smartCreateNewDir(new File(LIZJ));
        }
        return LIZJ;
    }

    public final String genCreativeMsgResourceDirPath(String msgUUID, boolean z) {
        o.LJIIIZ(msgUUID, "msgUUID");
        String str = genCreativeResourceDirPath(true) + File.separator + DMPathType.PARALLELUPLOAD.getSpaceName();
        o.LJIIIIZZ(str, "StringBuilder(genCreativ…)\n            .toString()");
        if (z) {
            DMPathKt.smartCreateNewDir(new File(str));
        }
        return str;
    }

    public static /* synthetic */ String genCreativeResourceDirPath$default(DMPath dMPath, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return dMPath.genCreativeResourceDirPath(z);
    }

    public static /* synthetic */ String getCacheResourceDirPath$default(DMPath dMPath, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return dMPath.getCacheResourceDirPath(z);
    }

    public static /* synthetic */ String genCreativeMsgResourceDirPath$default(DMPath dMPath, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return dMPath.genCreativeMsgResourceDirPath(str, z);
    }
}
