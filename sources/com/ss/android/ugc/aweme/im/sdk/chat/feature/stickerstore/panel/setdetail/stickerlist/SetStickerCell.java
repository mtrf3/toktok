package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.stickerlist;

import X.C16880lQ;
import X.C1DI;
import X.C214298b3;
import X.C221108m2;
import X.C43659HBn;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72052sD;
import X.C72345SaL;
import X.C72346SaM;
import X.C72347SaN;
import X.C72348SaO;
import X.C72349SaP;
import X.C78939UyV;
import X.C7MY;
import X.C88023cs;
import X.C88963eO;
import X.C94353n5;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC61782be;
import X.EnumC73222u6;
import X.HK5;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC93923mO;
import X.W5F;
import X.W5U;
import X.YE1;
import Y.ACListenerS36S0200000_1;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerUrlStruct;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class SetStickerCell extends PowerCell<C72052sD> {
    public final C62822Ol8 LJLIL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 259));
    public final C214298b3 LJLILLLLZI;
    public Fragment LJLJI;

    public SetStickerCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StickerSetDetailViewModel.class);
        AqS151S0100000_1 aqS151S0100000_1 = new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 264);
        C94353n5 c94353n5 = C94353n5.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72348SaO.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 265), new AqS162S0100000_12(this, 598), C72346SaM.INSTANCE, c94353n5, new AqS162S0100000_12(this, 599), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72349SaP.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 266), new AqS151S0100000_1((InterfaceC93923mO) this, 260), C72345SaL.INSTANCE, c94353n5, new AqS162S0100000_12(this, 597), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS151S0100000_1, C72347SaN.INSTANCE, new AqS151S0100000_1((InterfaceC93923mO) this, 261), new AqS151S0100000_1((InterfaceC93923mO) this, 262), new AqS151S0100000_1((InterfaceC93923mO) this, 263), c94353n5, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLILLLLZI = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        Fragment fragment;
        LifecycleOwner currentLifecycleOwner = getCurrentLifecycleOwner();
        if (currentLifecycleOwner instanceof Fragment) {
            fragment = (Fragment) currentLifecycleOwner;
        } else {
            fragment = null;
        }
        this.LJLJI = fragment;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(C72052sD c72052sD) {
        Integer num;
        UrlModel midResolutionUrl;
        StickerUrlStruct animateUrl;
        C88023cs c88023cs;
        C72052sD t = c72052sD;
        o.LJIIIZ(t, "t");
        if (C88963eO.LJFF() && (c88023cs = (C88023cs) ((StickerSetDetailViewModel) this.LJLILLLLZI.getValue()).LJLIL.getValue()) != null && c88023cs.LJLJJL != null) {
            C16880lQ.LJIIJ(new ACListenerS36S0200000_1(this, t, 51), this.itemView);
        } else {
            C16880lQ.LJIIJ(null, this.itemView);
        }
        SetSticker setSticker = t.LJLIL;
        if (setSticker != null) {
            num = setSticker.getStickerType();
        } else {
            num = null;
        }
        int type = EnumC73222u6.STATIC.getType();
        if (num == null || num.intValue() != type) {
            int type2 = EnumC73222u6.ANIMATED.getType();
            if (num != null && num.intValue() == type2 && (animateUrl = t.LJLIL.getAnimateUrl()) != null) {
                midResolutionUrl = animateUrl.getMidResolutionUrl();
            }
            midResolutionUrl = null;
        } else {
            StickerUrlStruct staticUrl = t.LJLIL.getStaticUrl();
            if (staticUrl != null) {
                midResolutionUrl = staticUrl.getMidResolutionUrl();
            }
            midResolutionUrl = null;
        }
        W5F LJII = W5U.LJII(C78939UyV.LJ(midResolutionUrl));
        int LIZIZ = C7MY.LIZIZ(68);
        int LIZIZ2 = C7MY.LIZIZ(68);
        LJII.LJII = LIZIZ;
        LJII.LJIIIIZZ = LIZIZ2;
        LJII.LIZIZ("SetStickerCell");
        LJII.LIZLLL = true;
        if (HK5.LIZIZ) {
            C43659HBn.LJIILIIL(LJII, EnumC61782be.STORE_STICKER);
        }
        LJII.LJIJI = Bitmap.Config.ARGB_8888;
        Object value = this.LJLIL.getValue();
        o.LJIIIIZZ(value, "<get-emojiIv>(...)");
        LJII.LJJIIJ = (SmartImageView) value;
        C43659HBn.LJIJ(LJII, "sticker_set_detail_sticker", false, null, 6);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b69, viewGroup, false, "from(parent.context)\n   …l_sticker, parent, false)");
    }
}
