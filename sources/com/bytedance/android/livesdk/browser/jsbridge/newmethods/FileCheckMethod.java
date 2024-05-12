package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38127Exn;
import X.ActivityC45651qj;
import X.C16880lQ;
import X.C29306Beo;
import X.C38131Exr;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.android.livesdk.TTLiveFileProvider;
import defpackage.b0;
import defpackage.q;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class FileCheckMethod extends AbstractC38127Exn<Params, Result> {

    /* loaded from: classes6.dex */
    public static final class Params {

        @InterfaceC65349Pkn("path")
        public final String path;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && o.LJ(this.path, ((Params) obj).path);
        }

        public final int hashCode() {
            return this.path.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Params(path=");
            return q.LIZIZ(LIZ, this.path, ')', LIZ);
        }

        public Params(String path) {
            o.LJIIIZ(path, "path");
            this.path = path;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Result {

        @InterfaceC65349Pkn("type")
        public final int type;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && this.type == ((Result) obj).type;
        }

        public final int hashCode() {
            return this.type;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Result(type=");
            return b0.LIZJ(LIZ, this.type, ')', LIZ);
        }

        public Result(int i) {
            this.type = i;
        }
    }

    @Override // X.AbstractC38127Exn
    public final Result invoke(Params params, C38131Exr context) {
        Result result;
        Params params2 = params;
        o.LJIIIZ(params2, "params");
        o.LJIIIZ(context, "context");
        File file = new File(params2.path);
        if (!file.exists()) {
            return new Result(0);
        }
        Intent intent = new Intent();
        Context context2 = context.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(context.LIZ.getPackageName());
        LIZ.append(TTLiveFileProvider.NAME);
        Uri uriForDifVersion = TTLiveFileProvider.getUriForDifVersion(context2, X1D.LIZIZ(LIZ), file);
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.STREAM", uriForDifVersion);
        intent.setType("application/pdf");
        intent.addFlags(268435456);
        intent.addFlags(1);
        ActivityC45651qj LIZIZ = C29306Beo.LIZIZ(context.LIZ);
        if (LIZIZ != null) {
            try {
                if (LIZIZ.getPackageManager() != null && intent.resolveActivity(LIZIZ.getPackageManager()) != null) {
                    Intent createChooser = Intent.createChooser(intent, "share");
                    createChooser.putExtra("pns.sandbox.dataflow_id", 1207964160);
                    C16880lQ.LIZIZ(LIZIZ, createChooser);
                    result = new Result(1);
                    return result;
                }
            } catch (Exception unused) {
                return new Result(0);
            }
        }
        result = new Result(0);
        return result;
    }
}
