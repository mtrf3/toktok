package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import X.AbstractC38123Exj;
import X.AbstractC73672Svk;
import X.C0EP;
import X.C0MT;
import X.C15380j0;
import X.C29306Beo;
import X.C38131Exr;
import X.C38354F3m;
import X.C73411SrX;
import X.C73969T1h;
import X.C77276UUm;
import X.C79249V8j;
import X.C79251V8l;
import X.C79252V8m;
import X.EnumC31874Cf8;
import X.InterfaceC28947BXr;
import X.InterfaceC65349Pkn;
import X.PVC;
import X.T16;
import X.X1D;
import Y.AfS26S1100000_13;
import android.content.Context;
import android.os.Build;
import com.bytedance.android.livesdk.browser.dialog.DownloadProgressDialog;
import com.bytedance.bpea.cert.token.TokenCert;
import defpackage.q;
import java.io.File;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class DownloadInvoiceMethod extends AbstractC38123Exj<Params, Result> implements InterfaceC28947BXr {
    public DownloadProgressDialog LJLIL;
    public C38131Exr LJLILLLLZI;
    public String LJLJI = "";
    public String LJLJJI;
    public String LJLJJL;
    public C73411SrX LJLJJLL;

    /* loaded from: classes7.dex */
    public static final class Params {

        @InterfaceC65349Pkn("url")
        public final String url;

        /* JADX WARN: Multi-variable type inference failed */
        public Params() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Params) && o.LJ(this.url, ((Params) obj).url);
        }

        public final int hashCode() {
            String str = this.url;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Params(url=");
            return q.LIZIZ(LIZ, this.url, ')', LIZ);
        }

        public Params(String str) {
            this.url = str;
        }

        public /* synthetic */ Params(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    /* loaded from: classes7.dex */
    public static final class Result {

        @InterfaceC65349Pkn("path")
        public final String action;

        @InterfaceC65349Pkn("code")
        public final Integer code;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return o.LJ(this.code, result.code) && o.LJ(this.action, result.action);
        }

        public final int hashCode() {
            Integer num = this.code;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.action;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Result(code=");
            LIZ.append(this.code);
            LIZ.append(", action=");
            return q.LIZIZ(LIZ, this.action, ')', LIZ);
        }

        public Result(Integer num, String str) {
            this.code = num;
            this.action = str;
        }
    }

    @Override // X.InterfaceC28947BXr
    public final void LJIILL() {
        Context context;
        if (Build.VERSION.SDK_INT >= 33) {
            C0EP.LJFF().LIZIZ(1, this.LJLJJL, this.LJLJJI, getName());
        } else {
            C38131Exr c38131Exr = this.LJLILLLLZI;
            if (c38131Exr != null) {
                context = c38131Exr.LIZ;
            } else {
                context = null;
            }
            new C77276UUm(C29306Beo.LIZIZ(context), TokenCert.Companion.with("bpea-live_recharge_invoice_delete_undownload")).LIZ(new C79251V8l(this), "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        finishWithResult(new Result(0, this.LJLJI));
    }

    @Override // X.AbstractC38123Exj
    public final void onTerminate() {
        C0EP.LJFF().LIZIZ.clear();
        C73411SrX c73411SrX = this.LJLJJLL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
    }

    @Override // X.AbstractC38123Exj
    public final void invoke(Params params, C38131Exr context) {
        byte[] bArr;
        long j;
        Params params2 = params;
        o.LJIIIZ(params2, "params");
        o.LJIIIZ(context, "context");
        if (C15380j0.LIZLLL() != null) {
            this.LJLILLLLZI = context;
            DownloadProgressDialog downloadProgressDialog = new DownloadProgressDialog();
            this.LJLIL = downloadProgressDialog;
            downloadProgressDialog.LJLILLLLZI = this;
            String str = params2.url;
            C0EP.LJFF().LJII(str, new C79249V8j(this, str));
            String str2 = params2.url;
            this.LJLJJL = str2;
            if (C38354F3m.LJ(str2) || this.LJLJJL == null) {
                finishWithResult(new Result(0, this.LJLJI));
            }
            StringBuilder LIZ = X1D.LIZ();
            String str3 = this.LJLJJL;
            Context context2 = null;
            if (str3 != null) {
                bArr = str3.getBytes(PVC.LIZ);
                o.LJIIIIZZ(bArr, "this as java.lang.String).getBytes(charset)");
            } else {
                bArr = null;
            }
            LIZ.append(C0EP.LJI(bArr));
            LIZ.append(".pdf");
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (this.LJLILLLLZI != null) {
                this.LJLJJI = EnumC31874Cf8.INVOICE.getFullPathWithoutPostSuffix();
                StringBuilder LIZ2 = X1D.LIZ();
                this.LJLJI = C0MT.LIZ(LIZ2, this.LJLJJI, '/', LIZIZ, LIZ2);
            }
            if (new File(this.LJLJI).exists()) {
                if (Build.VERSION.SDK_INT >= 33) {
                    C0EP.LJFF().LIZIZ(1, this.LJLJJL, this.LJLJJI, LIZIZ);
                } else {
                    C38131Exr c38131Exr = this.LJLILLLLZI;
                    if (c38131Exr != null) {
                        context2 = c38131Exr.LIZ;
                    }
                    new C77276UUm(C29306Beo.LIZIZ(context2), TokenCert.Companion.with("bpea-live_recharge_invoice_download")).LIZ(new C79252V8m(this, LIZIZ), "android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE");
                }
                j = 500;
            } else {
                j = 0;
            }
            try {
                this.LJLJJLL = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(j, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS26S1100000_13(this, LIZIZ, 2));
            } catch (Exception unused) {
                finishWithResult(new Result(0, this.LJLJI));
            }
        }
    }
}
