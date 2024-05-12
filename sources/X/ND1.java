package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentSizeModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.component.nativecardcomponent.AnoleNativeDisplayCardModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.LinkedHashMap;
import ujb.o;

/* loaded from: classes11.dex */
public final class ND1 extends AbstractC58982NCw implements View.OnClickListener {
    public C62354Oda LJLLLL;
    public TuxIconView LJLLLLLL;
    public C59948Nfs LJLZ;
    public boolean LJZ;
    public Bitmap LJZI;
    public String LJZL;
    public String LL;
    public final C62822Ol8 LLD;
    public final C62822Ol8 LLF;
    public final C62822Ol8 LLFF;

    public final void LJIIL() {
        String str;
        String str2;
        Integer num;
        String cardImageUrl;
        Bitmap bitmap = this.LJZI;
        boolean z = true;
        if (bitmap != null) {
            this.LJZ = true;
            C62354Oda c62354Oda = this.LJLLLL;
            if (c62354Oda != null) {
                c62354Oda.setImageBitmap(bitmap);
            }
            C242549fW.LIZ("loadCardImage bitmap is exist , return");
            return;
        }
        if (this.LJLLLL == null) {
            this.LJZL = "card_ImageView_empty";
            C242549fW.LIZ("loadCardImage cardImage is null");
            return;
        }
        AnoleNativeDisplayCardModel LJIIJJI = LJIIJJI();
        Integer num2 = null;
        if (LJIIJJI != null && (cardImageUrl = LJIIJJI.getCardImageUrl()) != null && !o.LJJJJJL(cardImageUrl)) {
            z = false;
        }
        if (z) {
            if (LJIIJJI() == null) {
                this.LJZL = "native_card_data_empty";
            } else {
                this.LJZL = "url_empty";
            }
            C242549fW.LIZ("loadCardImage iconUrl is null");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadCardImage iconUrl = ");
        AnoleNativeDisplayCardModel LJIIJJI2 = LJIIJJI();
        if (LJIIJJI2 != null) {
            str = LJIIJJI2.getCardImageUrl();
        } else {
            str = null;
        }
        LIZ.append(str);
        C242549fW.LIZ(X1D.LIZIZ(LIZ));
        Context context = this.LJLJJI;
        AnoleNativeDisplayCardModel LJIIJJI3 = LJIIJJI();
        if (LJIIJJI3 != null) {
            str2 = LJIIJJI3.getCardImageUrl();
        } else {
            str2 = null;
        }
        AnoleComponentSizeModel size = this.LJLIL.getSize();
        if (size != null) {
            num = Integer.valueOf((int) size.getWidth());
        } else {
            num = null;
        }
        AnoleComponentSizeModel size2 = this.LJLIL.getSize();
        if (size2 != null) {
            num2 = Integer.valueOf((int) size2.getHeight());
        }
        ND3 nd3 = new ND3(this);
        if (str2 == null) {
            this.LJZL = "url_empty";
            C242549fW.LIZ("loadImageWithUrl iconUrl is null");
            return;
        }
        if (context == null) {
            this.LJZL = "context_empty";
            C242549fW.LIZ("loadImageWithUrl context is null");
            return;
        }
        if (num != null) {
            num.intValue();
            if (num2 != null) {
                num2.intValue();
                C38995FSd.LIZLLL().execute(new NDB(context, this, nd3, num, num2, str2));
                return;
            } else {
                this.LJZL = "height_empty";
                C242549fW.LIZ("loadImageWithUrl height is null");
                return;
            }
        }
        this.LJZL = "width_empty";
        C242549fW.LIZ("loadImageWithUrl width is null");
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final void LIZ() {
        C242549fW.LIZ("prerender");
        LJIIL();
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final void LJFF() {
        C242549fW.LIZ("hostWillAppear()");
        LJIIL();
    }

    public final AnoleNativeDisplayCardModel LJIIJJI() {
        return (AnoleNativeDisplayCardModel) this.LLFF.getValue();
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final C58983NCx isReady() {
        return new C58983NCx(this.LJZ, "image_load_failed");
    }

    @Override // X.AbstractC58982NCw, X.NC9
    public final void LIZJ() {
        super.LIZJ();
        C242549fW.LIZ("unmount");
        this.LJZI = null;
        C62354Oda c62354Oda = this.LJLLLL;
        if (c62354Oda != null) {
            c62354Oda.setImageBitmap(null);
        }
    }

    @Override // X.AbstractC58982NCw
    public final void LIZLLL(AnoleComponentAppearModel appearModel) {
        String str;
        kotlin.jvm.internal.o.LJIIIZ(appearModel, "appearModel");
        super.LIZLLL(appearModel);
        AnoleNativeDisplayCardModel LJIIJJI = LJIIJJI();
        if (LJIIJJI == null || (str = LJIIJJI.getCardImageUrl()) == null) {
            str = "";
        }
        this.LL = str;
        ND2.LIZLLL(this, true);
    }

    @Override // X.AbstractC58982NCw
    public final void LJ(String str) {
        String str2;
        super.LJ(str);
        AnoleNativeDisplayCardModel LJIIJJI = LJIIJJI();
        if (LJIIJJI == null || (str2 = LJIIJJI.getCardImageUrl()) == null) {
            str2 = "";
        }
        this.LL = str2;
        ND2.LIZLLL(this, false);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        AnoleModel anoleModel;
        AnoleModel anoleModel2;
        Long l = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        TuxIconView tuxIconView = this.LJLLLLLL;
        if (tuxIconView != null) {
            num2 = Integer.valueOf(tuxIconView.getId());
        } else {
            num2 = null;
        }
        if (kotlin.jvm.internal.o.LJ(num, num2)) {
            this.LJLJI.LJIIIIZZ(new NC1(this.LJLIL.getType()), this);
            C58655N0h LIZLLL = C58704N2e.LIZLLL((String) this.LLD.getValue(), "close", this.LJLILLLLZI.getAwemeRawAd());
            LIZLLL.LIZJ(this.LLF.getValue(), "refer");
            LIZLLL.LIZIZ(Long.valueOf(this.LJLIL.getID()), "component_id");
            AwemeRawAd awemeRawAd = this.LJLILLLLZI.getAwemeRawAd();
            if (awemeRawAd != null && (anoleModel2 = awemeRawAd.getAnoleModel()) != null) {
                l = Long.valueOf(anoleModel2.getTemplateID());
            }
            LIZLLL.LIZIZ(l, "template_id");
            LIZLLL.LIZIZ(this.LJLIL.getType(), "component_type");
            LIZLLL.LJI();
            return;
        }
        C59948Nfs c59948Nfs = this.LJLZ;
        if (c59948Nfs != null) {
            num3 = Integer.valueOf(c59948Nfs.getId());
        } else {
            num3 = null;
        }
        if (!kotlin.jvm.internal.o.LJ(num, num3)) {
            C62354Oda c62354Oda = this.LJLLLL;
            if (c62354Oda != null) {
                num4 = Integer.valueOf(c62354Oda.getId());
            } else {
                num4 = null;
            }
            if (!kotlin.jvm.internal.o.LJ(num, num4)) {
                return;
            }
        }
        InterfaceC58979NCt interfaceC58979NCt = this.LJLJI;
        java.util.Map LJJLIIIIJ = C113554cx.LJJLIIIIJ(new OSZ(EnumC58952NBs.ENTER_FROM.getRName(), 71));
        LJJLIIIIJ.put(EnumC58952NBs.REFER.getRName(), this.LLF.getValue());
        LJJLIIIIJ.put(EnumC58952NBs.TAG.getRName(), this.LLD.getValue());
        String rName = EnumC58952NBs.AD_EXTRA_DATA.getRName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("component_id", Long.valueOf(this.LJLIL.getID()));
        AwemeRawAd awemeRawAd2 = this.LJLILLLLZI.getAwemeRawAd();
        if (awemeRawAd2 != null && (anoleModel = awemeRawAd2.getAnoleModel()) != null) {
            l = Long.valueOf(anoleModel.getTemplateID());
        }
        linkedHashMap.put("template_id", l);
        linkedHashMap.put("component_type", this.LJLIL.getType());
        LJJLIIIIJ.put(rName, linkedHashMap);
        interfaceC58979NCt.LJIIIIZZ(new C58955NBv(LJJLIIIIJ), this);
        C242549fW.LIZ("perform click event");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0190, code lost:
    
        if (r3 != null) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ND1(com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r8, com.ss.android.ugc.aweme.feed.model.Aweme r9, X.InterfaceC58979NCt r10, android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ND1.<init>(com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel, com.ss.android.ugc.aweme.feed.model.Aweme, X.NCt, android.content.Context):void");
    }
}
