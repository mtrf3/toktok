package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Lsx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55663Lsx implements InterfaceC62486Ofi {
    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_pen;
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
        return R.raw.icon_pen_fill;
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
        return R.string.p0b;
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
        return "suggest_an_edit";
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

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            InterfaceC65895Ptb LJIIIIZZ = HG3.LJIIIIZZ();
            C78450Uqc c78450Uqc = new C78450Uqc();
            c78450Uqc.LIZ = (Activity) context;
            c78450Uqc.LIZIZ = "poi_suggest_edit";
            C40925G4j.LIZ(c78450Uqc, LJIIIIZZ);
            return;
        }
        Bundle bundle = sharePackage.extras;
        String str = (String) C16880lQ.LLJJIII(bundle, "poi_id");
        Object LLJJIII = C16880lQ.LLJJIII(bundle, "enter_from");
        String LJIJJLI = PoiServiceImpl.LIZIZ().LJIJJLI("poi_sug_edit_ugc");
        C40342FsQ c40342FsQ = C40343FsR.LJIILJJIL;
        SparkContext sparkContext = new SparkContext();
        String str2 = "";
        if (LJIJJLI == null) {
            LJIJJLI = "";
        }
        sparkContext.LJJIJLIJ(LJIJJLI);
        if (str != null) {
            str2 = str;
        }
        sparkContext.LJJIIJ("poi_id", str2);
        sparkContext.LJII(M2K.class, new C55664Lsy(context));
        sparkContext.LJJIJIIJI(new C58904N9w());
        c40342FsQ.getClass();
        C40342FsQ.LIZ(context, sparkContext).LIZIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", LLJJIII);
        linkedHashMap.put("poi_id", str);
        FMX.LJIIL("enter_suggest_edit", linkedHashMap);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}
