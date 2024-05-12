package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.sticker.model.CommerceSticker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.SiY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72854SiY {
    public final LinearLayout LIZ;
    public final InterfaceC72852SiW LIZIZ;
    public final List<InterfaceC72860Sie> LIZJ;
    public final Context LIZLLL;
    public final W5G LJ;
    public final TextView LJFF;
    public final TextView LJI;
    public final java.util.Map<String, CommerceSticker> LJII;
    public Effect LJIIIIZZ;

    public final boolean LIZIZ(int i, Effect effect) {
        if (C44172HVg.LJIJ.isChildrenMode()) {
            this.LIZ.setVisibility(8);
            return false;
        }
        if (V3N.LJIILLIIL(effect)) {
            return false;
        }
        if (effect == null || i == 0 || !effect.isBusiness()) {
            this.LIZ.setVisibility(8);
            return false;
        }
        if (((HashMap) this.LJII).containsKey(effect.getEffectId())) {
            return LIZ((CommerceSticker) ((HashMap) this.LJII).get(effect.getEffectId()), V3N.LJIILJJIL(effect), false);
        }
        this.LJIIIIZZ = effect;
        String effectId = effect.getEffectId();
        C10K.LIZJ(new CallableC74182T9m(effectId)).LJ(new C72855SiZ(this, effectId, effect), C10K.LJIIIIZZ, null);
        return false;
    }

    public final boolean LIZ(CommerceSticker commerceSticker, boolean z, boolean z2) {
        if (commerceSticker == null) {
            this.LIZ.setVisibility(8);
            return false;
        }
        if (z2) {
            Iterator<InterfaceC72860Sie> it = this.LIZJ.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
        }
        InterfaceC72852SiW interfaceC72852SiW = this.LIZIZ;
        String id = commerceSticker.getId();
        o.LJIIIIZZ(id, "commerceSticker.id");
        interfaceC72852SiW.LIZIZ(id);
        this.LIZ.setVisibility(0);
        UrlModel screenIcon = commerceSticker.getScreenIcon();
        if (screenIcon != null) {
            this.LJ.setVisibility(0);
            W5G w5g = this.LJ;
            C78764Uvg.LJII(w5g, screenIcon, Bitmap.Config.RGB_565, false, new W4X(null, new C51545KKv(w5g)));
        } else {
            this.LJ.setVisibility(8);
        }
        this.LJFF.setText(commerceSticker.getScreenDesc());
        long expireTime = commerceSticker.getExpireTime();
        String format = new SimpleDateFormat("yyyy.MM.dd", Locale.getDefault()).format(new Date(1000 * expireTime));
        if (expireTime != 0 && !TextUtils.isEmpty(format) && z) {
            this.LJI.setVisibility(0);
            this.LJI.setText(this.LIZLLL.getString(R.string.jdw, format));
        } else {
            this.LJI.setVisibility(8);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C72854SiY(LinearLayout linearLayout, InterfaceC72852SiW mobHelper, List<? extends InterfaceC72860Sie> allStickerInfoHandlers, Context context) {
        o.LJIIIZ(mobHelper, "mobHelper");
        o.LJIIIZ(allStickerInfoHandlers, "allStickerInfoHandlers");
        this.LIZ = linearLayout;
        this.LIZIZ = mobHelper;
        this.LIZJ = allStickerInfoHandlers;
        this.LIZLLL = context;
        this.LJII = new HashMap();
        View findViewById = linearLayout.findViewById(R.id.bob);
        o.LJIIIIZZ(findViewById, "mCommerceStickerBrandLay…mmerce_sticker_brand_img)");
        this.LJ = (W5G) findViewById;
        View findViewById2 = linearLayout.findViewById(R.id.boa);
        o.LJIIIIZZ(findViewById2, "mCommerceStickerBrandLay…merce_sticker_brand_desc)");
        this.LJFF = (TextView) findViewById2;
        View findViewById3 = linearLayout.findViewById(R.id.bod);
        o.LJIIIIZZ(findViewById3, "mCommerceStickerBrandLay…merce_sticker_brand_time)");
        this.LJI = (TextView) findViewById3;
    }
}
