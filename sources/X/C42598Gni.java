package X;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Gni, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42598Gni implements InterfaceC62486Ofi {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public AbstractC65781Prl LJLJI;
    public boolean LJLJJI = true;
    public Context LJLJJL;
    public View LJLJJLL;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_arrow_to_bottom;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        return R.raw.icon_download_fill;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        return R.string.pyg;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "save_image";
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJI() {
        Context context;
        if (!this.LJLJJI || (context = this.LJLJJL) == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            if (C04330Ez.LIZ(context, "android.permission.READ_MEDIA_IMAGES") != 0) {
                return false;
            }
        } else if (C04330Ez.LIZ(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.ShareButton;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    public C42598Gni(String str, String str2) {
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.Pro, X.Prl] */
    @Override // X.InterfaceC62486Ofi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(android.content.Context r13, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage r14) {
        /*
            r12 = this;
            java.lang.String r0 = "context"
            r10 = r13
            kotlin.jvm.internal.o.LJIIIZ(r10, r0)
            java.lang.String r0 = "sharePackage"
            kotlin.jvm.internal.o.LJIIIZ(r14, r0)
            r12.LJLJJL = r10
            java.lang.String r1 = r12.LJLILLLLZI
            java.lang.String r0 = "data"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            r3 = 0
            r2 = 2
            r5 = 1
            if (r0 == 0) goto L24
            java.lang.String r0 = r12.LJLIL
            if (r0 == 0) goto L24
            int r0 = r0.length()
            if (r0 != 0) goto L87
        L24:
            java.lang.String r1 = r12.LJLILLLLZI
            java.lang.String r0 = "custom"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto L3c
            X.Prl r0 = r12.LJLJI
            if (r0 == 0) goto L3a
            java.lang.Object r9 = r0.invoke()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            if (r9 != 0) goto L5e
        L3a:
            r12.LJLJJI = r3
        L3c:
            boolean r0 = r12.LJLJJI
            if (r0 != 0) goto L56
            r0 = 2131843525(0x7f1159c5, float:1.9320417E38)
            java.lang.String r1 = r10.getString(r0)
        L47:
            java.lang.String r0 = "if (saveResult == STATE_…)\n            }\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            android.app.Activity r0 = X.C84763XOl.LJIIIIZZ()
            if (r0 == 0) goto L55
            X.C31811Ce7.LIZIZ(r0, r1)
        L55:
            return
        L56:
            r0 = 2131843527(0x7f1159c7, float:1.932042E38)
            java.lang.String r1 = r10.getString(r0)
            goto L47
        L5e:
            r12.LJLJJI = r5
            android.view.View r8 = r12.LJLJJLL
            X.2zl r7 = new X.2zl
            r7.<init>()
            r7.element = r2
            android.app.Activity r3 = X.C78609UtB.LJJLIIIJ(r10)
            if (r3 == 0) goto L84
            com.bytedance.bpea.cert.token.TokenCert$Companion r1 = com.bytedance.bpea.cert.token.TokenCert.Companion
            java.lang.String r0 = "bpea-bpea-share_jsb_save_screen_image_permission"
            com.bytedance.bpea.cert.token.TokenCert r0 = r1.with(r0)
            kotlin.jvm.internal.AqS48S0400000_2 r6 = new kotlin.jvm.internal.AqS48S0400000_2
            r11 = 3
            r6.<init>(r7, r8, r9, r10, r11)
            int r0 = X.C42599Gnj.LIZIZ(r3, r0, r6)
        L81:
            if (r0 != r2) goto Lad
            return
        L84:
            int r0 = r7.element
            goto L81
        L87:
            java.lang.String r6 = r12.LJLIL
            java.lang.String r0 = "imageBase64"
            kotlin.jvm.internal.o.LJIIIZ(r6, r0)
            X.2zl r4 = new X.2zl
            r4.<init>()
            r4.element = r2
            android.app.Activity r3 = X.C78609UtB.LJJLIIIJ(r10)
            if (r3 == 0) goto Lb7
            com.bytedance.bpea.cert.token.TokenCert$Companion r1 = com.bytedance.bpea.cert.token.TokenCert.Companion
            java.lang.String r0 = "bpea-check_image_save_download_permission"
            com.bytedance.bpea.cert.token.TokenCert r2 = r1.with(r0)
            kotlin.jvm.internal.AqS45S1200000_2 r1 = new kotlin.jvm.internal.AqS45S1200000_2
            r0 = 2
            r1.<init>(r4, r6, r10, r0)
            int r0 = X.C42599Gnj.LIZIZ(r3, r2, r1)
        Lad:
            if (r0 != r5) goto L3c
            r0 = 2131843528(0x7f1159c8, float:1.9320423E38)
            java.lang.String r1 = r10.getString(r0)
            goto L47
        Lb7:
            int r0 = r4.element
            goto Lad
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42598Gni.LIZLLL(android.content.Context, com.ss.android.ugc.aweme.share.base.model.BaseSharePackage):void");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView iconView, View view, int i) {
        o.LJIIIZ(iconView, "iconView");
        this.LJLJJLL = view;
    }
}
