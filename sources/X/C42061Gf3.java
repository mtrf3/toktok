package X;

import Y.ACallableS83S0200000_6;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gf3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42061Gf3 implements InterfaceC62486Ofi {
    public final String LJLIL;
    public final List<String> LJLILLLLZI;

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
    public final boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        return R.string.q8h;
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
        return "image_save";
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

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, android.net.Uri] */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, android.net.Uri] */
    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        String str = this.LJLIL;
        if (str != null) {
            boolean z = false;
            try {
                SettingsManager.LIZLLL().getClass();
                z = SettingsManager.LIZ("web_image_downloader_switch", false);
            } catch (Throwable unused) {
            }
            if (z) {
                C43245Gy9 c43245Gy9 = new C43245Gy9(new WeakReference(context));
                Activity LJJLIIIJ = C78609UtB.LJJLIIIJ(context);
                o.LJI(LJJLIIIJ);
                c43245Gy9.LIZ(str, new GJL(LJJLIIIJ, context));
                return;
            }
            Activity LJJLIIIJ2 = C78609UtB.LJJLIIIJ(context);
            if (LJJLIIIJ2 == null) {
                return;
            }
            new C42059Gf1(new WeakReference(context)).LIZ(str, new GJM(LJJLIIIJ2));
            return;
        }
        List<String> list = this.LJLILLLLZI;
        if (list != null) {
            if (C78609UtB.LJJJJ(context)) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    File file = new File(it.next());
                    C68322mC c68322mC = new C68322mC();
                    ?? LJIIIIZZ = C268613q.LJIIIIZZ(context, file.getName(), null);
                    c68322mC.element = LJIIIIZZ;
                    if (LJIIIIZZ == 0) {
                        c68322mC.element = C268613q.LIZJ(context, file.getName());
                    }
                    C10K.LIZJ(new ACallableS83S0200000_6(c68322mC, file, 11));
                }
                C5S1 c5s1 = new C5S1(context);
                c5s1.LIZJ(R.string.rrp);
                c5s1.LIZ(R.raw.icon_tick_fill_small);
                c5s1.LIZIZ(R.attr.e8);
                c5s1.LJ();
                return;
            }
            OYF.LJII(context, TokenCert.Companion.with("bpea-share_jsb_save_local_image_permission"), null);
        }
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    public C42061Gf3(String str, List list, int i) {
        str = (i & 1) != 0 ? null : str;
        list = (i & 2) != 0 ? null : list;
        this.LJLIL = str;
        this.LJLILLLLZI = list;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}
