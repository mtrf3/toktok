package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.share.ShareFlavorService;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.IAn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C46181IAn implements InterfaceC62486Ofi {
    public final boolean LJLIL;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_link;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        return R.raw.icon_link_fill;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        return R.string.r43;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public boolean enable() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "copy";
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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C46181IAn(java.lang.String r2, int r3) {
        /*
            r1 = this;
            r0 = r3 & 1
            if (r0 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r0 = r3 & 4
            if (r0 == 0) goto Lf
            r0 = 1
        Lb:
            r1.<init>(r2, r0)
            return
        Lf:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46181IAn.<init>(java.lang.String, int):void");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        ShareFlavorService.LIZ.getClass();
        C2062987t.LIZ().LIZIZ();
        String string = sharePackage.extras.getString("share_aweme_id");
        if (string == null) {
            string = "";
        }
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS157S0100000_7(context, 501));
        V1B.LJLJJL((Dialog) LIZIZ.getValue());
        AbstractC73638SvC.LJIILLIIL(new CallableC62067OXn(sharePackage, "copy_link")).LJIJJ(C73969T1h.LIZIZ()).LJJIIJ(T16.LIZ()).LJIIIIZZ(new C46180IAm(sharePackage, this, context, string, LIZIZ)).LJJI();
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    public C46181IAn(String enterFrom, boolean z) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = z;
    }

    public final void LIZJ(Context context, Cert cert, String content) {
        o.LJIIIZ(content, "content");
        o.LJIIIZ(context, "context");
        Object LLILL = C16880lQ.LLILL(context, "clipboard");
        o.LJII(LLILL, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) LLILL;
        ClipData clipData = ClipData.newPlainText(content, content);
        try {
            OHS ohs = C252609vk.LIZ;
            o.LJIIIIZZ(clipData, "clipData");
            ohs.getClass();
            OHS.LIZIZ(clipboardManager, clipData, cert);
            if (this.LJLIL) {
                if (C53274KvW.LIZ() && IMService.createIIMServicebyMonsterPlugin(false).getAutoMessageTooltipHelper().LIZIZ()) {
                    C53275KvX.LIZ();
                    Activity LJIJJ = C45804HyK.LJIJJ(context);
                    if (LJIJJ != null) {
                        C26045AKb c26045AKb = new C26045AKb(LJIJJ);
                        c26045AKb.LJFF(R.raw.icon_tick_fill_small);
                        c26045AKb.LJII(R.attr.e8);
                        c26045AKb.LJIIIIZZ(R.string.em9);
                        c26045AKb.LJIIJ();
                        return;
                    }
                    return;
                }
                C05L.LIZLLL(context, R.string.dwb);
            }
        } catch (Q0C e) {
            C36922EeM.LIZ(e);
        }
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}
