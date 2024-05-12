package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8we, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C227688we implements InterfaceC62486Ofi {
    public final String LJLIL;
    public final Aweme LJLILLLLZI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_template_fill_slash;
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
        return R.raw.icon_template_fill_slash;
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
        return R.string.a1s;
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
        return "remove_ugc_template";
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

    public final void LIZJ(String str) {
        String str2;
        String str3;
        String str4 = "";
        if (TCM.LJIIJ(this.LJLILLLLZI)) {
            List<AnchorCommonStruct> anchors = this.LJLILLLLZI.getAnchors();
            o.LJIIIIZZ(anchors, "awesome.anchors");
            for (AnchorCommonStruct anchorCommonStruct : anchors) {
                if (anchorCommonStruct.getType() == EnumC42934Gt8.ANCHOR_UGC_TEMPLATE.getTYPE()) {
                    str2 = anchorCommonStruct.getId();
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        if (!TCM.LJIIIZ(this.LJLILLLLZI)) {
            str2 = "";
        } else {
            List<AnchorCommonStruct> anchors2 = this.LJLILLLLZI.getAnchors();
            o.LJIIIIZZ(anchors2, "awesome.anchors");
            for (AnchorCommonStruct anchorCommonStruct2 : anchors2) {
                if (anchorCommonStruct2.getType() == EnumC42934Gt8.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                    str2 = anchorCommonStruct2.getId();
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        C188727au c188727au = new C188727au();
        String aid = this.LJLILLLLZI.getAid();
        if (aid != null) {
            str4 = aid;
        }
        c188727au.LJIIIZ("group_id", str4);
        c188727au.LJIIIZ("enter_from", this.LJLIL);
        String str5 = "1";
        if (TCM.LJIIIZ(this.LJLILLLLZI)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_allow_pugc_template", str3);
        if (!TCM.LJIIJ(this.LJLILLLLZI)) {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        c188727au.LJIIIZ("is_allow_ugc_template", str5);
        c188727au.LJIIIZ("template_id", str2);
        FMX.LJIIL(str, c188727au.LIZ);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    public C227688we(String enterFrom, Aweme awesome) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(awesome, "awesome");
        this.LJLIL = enterFrom;
        this.LJLILLLLZI = awesome;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        LIZJ("click_remove_template_entrance");
        C26227ARb c26227ARb = new C26227ARb(context);
        c26227ARb.LJFF(context.getString(R.string.pv));
        c26227ARb.LIZIZ(context.getString(R.string.ps));
        UC0.LIZJ(c26227ARb, new AqS134S0200000_3(context, this, 201));
        c26227ARb.LJI().LIZLLL();
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
