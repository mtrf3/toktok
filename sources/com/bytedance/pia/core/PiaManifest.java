package com.bytedance.pia.core;

import X.InterfaceC65349Pkn;
import X.X1D;
import android.net.Uri;
import com.google.gson.Gson;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PiaManifest {
    public static final Gson LJI = new Gson();
    public final Uri LIZ;
    public final String LIZIZ;
    public final Uri LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;

    /* loaded from: classes7.dex */
    public static final class InlineManifest {

        @InterfaceC65349Pkn("nsr")
        public Boolean nsr;

        @InterfaceC65349Pkn("page_name")
        public String pageName;

        @InterfaceC65349Pkn("public_path")
        public String publicPath;

        @InterfaceC65349Pkn("snapshot")
        public Boolean snapshot;

        @InterfaceC65349Pkn("worker")
        public Boolean worker;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InlineManifest)) {
                return false;
            }
            InlineManifest inlineManifest = (InlineManifest) obj;
            return o.LJ(this.worker, inlineManifest.worker) && o.LJ(this.publicPath, inlineManifest.publicPath) && o.LJ(this.pageName, inlineManifest.pageName) && o.LJ(this.snapshot, inlineManifest.snapshot) && o.LJ(this.nsr, inlineManifest.nsr);
        }

        public final int hashCode() {
            Boolean bool = this.worker;
            int hashCode = (bool != null ? bool.hashCode() : 0) * 31;
            String str = this.publicPath;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.pageName;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Boolean bool2 = this.snapshot;
            int hashCode4 = (hashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            Boolean bool3 = this.nsr;
            return hashCode4 + (bool3 != null ? bool3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("InlineManifest(worker=");
            LIZ.append(this.worker);
            LIZ.append(", publicPath=");
            LIZ.append(this.publicPath);
            LIZ.append(", pageName=");
            LIZ.append(this.pageName);
            LIZ.append(", snapshot=");
            LIZ.append(this.snapshot);
            LIZ.append(", nsr=");
            LIZ.append(this.nsr);
            LIZ.append(")");
            return X1D.LIZIZ(LIZ);
        }

        public InlineManifest(Boolean bool, String str, String str2, Boolean bool2, Boolean bool3) {
            this.worker = bool;
            this.publicPath = str;
            this.pageName = str2;
            this.snapshot = bool2;
            this.nsr = bool3;
        }
    }

    public PiaManifest(Uri uri, String str, Uri uri2, boolean z, boolean z2, boolean z3) {
        this.LIZ = uri;
        this.LIZIZ = str;
        this.LIZJ = uri2;
        this.LIZLLL = z;
        this.LJ = z2;
        this.LJFF = z3;
    }
}
