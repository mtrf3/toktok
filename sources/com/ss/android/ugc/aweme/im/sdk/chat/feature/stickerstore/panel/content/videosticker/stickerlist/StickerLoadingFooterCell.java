package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.stickerlist;

import X.C1BZ;
import X.C1DI;
import X.C214298b3;
import X.C223338pd;
import X.C32151Nz;
import X.C65352Pkq;
import X.C65776Prg;
import X.C87034YDu;
import X.C87035YDv;
import X.C87036YDw;
import X.C87037YDx;
import X.C87038YDy;
import X.C87039YDz;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC65784Pro;
import X.O6R;
import X.YE1;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.powerlist.footer.PowerLoadingCell;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.videosticker.viewmodel.VideoStickerContentViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class StickerLoadingFooterCell extends PowerLoadingCell {
    public static final int LJLILLLLZI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(36));
    public final C214298b3 LJLIL;

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void M() {
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJIIIIZZ(layoutParams, "layoutParams");
        layoutParams.height = 0;
        view.setLayoutParams(layoutParams);
        ((C223338pd) view.findViewById(R.id.chz)).LIZJ();
        view.setVisibility(8);
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void P() {
        if (!((VideoStickerContentViewModel) this.LJLIL.getValue()).LJLILLLLZI) {
            return;
        }
        View view = this.itemView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        o.LJIIIIZZ(layoutParams, "layoutParams");
        layoutParams.height = LJLILLLLZI;
        view.setLayoutParams(layoutParams);
        view.setVisibility(0);
        ((C223338pd) view.findViewById(R.id.chz)).LIZIZ();
    }

    public StickerLoadingFooterCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(VideoStickerContentViewModel.class);
        AqS165S0100000_15 aqS165S0100000_15 = new AqS165S0100000_15(LIZ, 382);
        C87037YDx c87037YDx = C87037YDx.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C87035YDv.INSTANCE, new AqS165S0100000_15(this, 383), new AqS165S0100000_15(this, 384), C87039YDz.INSTANCE, c87037YDx, new AqS165S0100000_15(this, 385), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C87036YDw.INSTANCE, new AqS165S0100000_15(this, 386), new AqS165S0100000_15(this, 377), C87038YDy.INSTANCE, c87037YDx, new AqS165S0100000_15(this, 378), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS165S0100000_15, C87034YDu.INSTANCE, new AqS165S0100000_15(this, 379), new AqS165S0100000_15(this, 380), new AqS165S0100000_15(this, 381), c87037YDx, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onViewAttachedToWindow() {
        super.onViewAttachedToWindow();
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams instanceof C1BZ) {
            ((C1BZ) layoutParams).LJLILLLLZI = true;
        }
    }

    @Override // com.bytedance.ies.powerlist.footer.PowerLoadingCell
    public final void N() {
        M();
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup viewGroup) {
        return C1DI.LIZ(viewGroup, "parent", R.layout.b5e, viewGroup, false, "from(parent.context)\n   …r_loading, parent, false)");
    }
}
