package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.powerlist;

import X.C16880lQ;
import X.C214298b3;
import X.C29701Eo;
import X.C65352Pkq;
import X.C65776Prg;
import X.C70759Rpr;
import X.C77339UWx;
import X.C86V;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.EnumC72807Shn;
import X.InterfaceC65784Pro;
import X.OUP;
import X.S5A;
import X.S5F;
import X.S5H;
import X.S6S;
import X.S73;
import X.S74;
import X.S75;
import X.S76;
import X.S77;
import X.S78;
import X.S79;
import X.S7A;
import X.S7B;
import X.S7C;
import X.S7D;
import X.S7E;
import X.SY4;
import X.W5F;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.powerlist.PowerCell;
import com.bytedance.lighten.loader.SmartImageView;
import com.google.gson.internal.b;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.BillboardGlobalViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel;
import com.ss.android.ugc.aweme.utils.Au2S19S0200000_12;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ImageCell extends PowerCell<ImageItem> {
    public final C214298b3 LJLIL;
    public final C214298b3 LJLILLLLZI;
    public boolean LJLJI;

    public ImageCell() {
        C214298b3 c214298b3;
        C214298b3 c214298b32;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(ImageListViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 686);
        S7A s7a = S7A.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, S78.INSTANCE, new AqS162S0100000_12(this, 676), new AqS162S0100000_12(this, 678), S7C.INSTANCE, s7a, new AqS162S0100000_12(this, 680), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, S74.INSTANCE, new AqS162S0100000_12(this, 682), new AqS162S0100000_12(this, 677), S7B.INSTANCE, s7a, new AqS162S0100000_12(this, 679), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS162S0100000_12, S73.INSTANCE, new AqS162S0100000_12(this, 681), new AqS162S0100000_12(this, 683), new AqS162S0100000_12(this, 684), s7a, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLIL = c214298b3;
        C65776Prg LIZ2 = C65352Pkq.LIZ(BillboardGlobalViewModel.class);
        AqS162S0100000_12 aqS162S0100000_122 = new AqS162S0100000_12(LIZ2, 685);
        S79 s79 = S79.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b32 = new C214298b3(LIZ2, aqS162S0100000_122, S75.INSTANCE, new AqS162S0100000_12(this, 687), new AqS162S0100000_12(this, 688), S7D.INSTANCE, s79, new AqS162S0100000_12(this, 689), 256);
        } else if (o.LJ(c9bd, C9BE.LIZ)) {
            c214298b32 = new C214298b3(LIZ2, aqS162S0100000_122, S76.INSTANCE, new AqS162S0100000_12(this, 690), new AqS162S0100000_12(this, 691), S7E.INSTANCE, s79, new AqS162S0100000_12(this, 692), 256);
        } else if (c9bd == null || o.LJ(c9bd, C9XN.LIZ)) {
            c214298b32 = new C214298b3(LIZ2, aqS162S0100000_122, S77.INSTANCE, new AqS162S0100000_12(this, 693), new AqS162S0100000_12(this, 694), new AqS162S0100000_12(this, 695), s79, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(C77339UWx.LIZLLL("Don't support this VMScope: ", c9bd, " there"));
        }
        this.LJLILLLLZI = c214298b32;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(ImageItem imageItem) {
        ImageItem t = imageItem;
        o.LJIIIZ(t, "t");
        this.itemView.findViewById(R.id.au9).getClass();
        if (t.isUsing) {
            View findViewById = this.itemView.findViewById(R.id.ex6);
            o.LJIIIIZZ(findViewById, "itemView.ivUsingBg");
            OUP.LJJLIIIJ(findViewById);
            this.itemView.findViewById(R.id.ex6).setBackgroundResource(R.drawable.apb);
            View findViewById2 = this.itemView.findViewById(R.id.dbt);
            o.LJIIIIZZ(findViewById2, "itemView.flLottieContainer");
            OUP.LJJLIIIJ(findViewById2);
            View findViewById3 = this.itemView.findViewById(R.id.g_v);
            o.LJIIIIZZ(findViewById3, "itemView.lottieUsing");
            OUP.LJJLIIIJ(findViewById3);
            ((C29701Eo) this.itemView.findViewById(R.id.g_v)).playAnimation();
            ((TextView) this.itemView.findViewById(R.id.au9)).setText(C86V.LJFF(R.string.j1));
            ((SY4) this.itemView.findViewById(R.id.au9)).setButtonVariant(5);
            View findViewById4 = this.itemView.findViewById(R.id.au9);
            o.LJIIIIZZ(findViewById4, "itemView.btnDisplay");
            C16880lQ.LJIIJ(new Au2S19S0200000_12(this, t, 36, 42), findViewById4);
        } else {
            View findViewById5 = this.itemView.findViewById(R.id.ex6);
            o.LJIIIIZZ(findViewById5, "itemView.ivUsingBg");
            OUP.LJIJJLI(findViewById5);
            this.itemView.findViewById(R.id.ex6).setBackgroundResource(0);
            View findViewById6 = this.itemView.findViewById(R.id.dbt);
            o.LJIIIIZZ(findViewById6, "itemView.flLottieContainer");
            OUP.LJIJJLI(findViewById6);
            ((C29701Eo) this.itemView.findViewById(R.id.g_v)).cancelAnimation();
            View findViewById7 = this.itemView.findViewById(R.id.g_v);
            o.LJIIIIZZ(findViewById7, "itemView.lottieUsing");
            OUP.LJIJJLI(findViewById7);
            ((TextView) this.itemView.findViewById(R.id.au9)).setText(C86V.LJFF(R.string.ekz));
            ((SY4) this.itemView.findViewById(R.id.au9)).setButtonVariant(0);
            View findViewById8 = this.itemView.findViewById(R.id.au9);
            o.LJIIIIZZ(findViewById8, "itemView.btnDisplay");
            C16880lQ.LJIIJ(new Au2S19S0200000_12(this, t, 37, 42), findViewById8);
        }
        View findViewById9 = this.itemView.findViewById(R.id.ewr);
        o.LJIIIIZZ(findViewById9, "itemView.ivRemove");
        C16880lQ.LJIIJ(new Au2S19S0200000_12(this, t, 35, 42), findViewById9);
        String str = t.imageUrl;
        SmartImageView smartImageView = (SmartImageView) this.itemView.findViewById(R.id.ewe);
        o.LJIIIIZZ(smartImageView, "itemView.ivImage");
        S5A.LIZ("start", "display_image", null, null, null, 28);
        long currentTimeMillis = System.currentTimeMillis();
        W5F LIZLLL = C70759Rpr.LIZLLL(str);
        LIZLLL.LJJIIJ = smartImageView;
        LIZLLL.LJIJJ = EnumC72807Shn.FIT_CENTER;
        LIZLLL.LIZLLL(new S5H(this, currentTimeMillis));
        RootData rootData = ((S6S) ((AssemViewModel) this.LJLILLLLZI.getValue()).getState()).LJLILLLLZI;
        ImageListViewModel imageListViewModel = (ImageListViewModel) this.LJLIL.getValue();
        String imageId = t.imageId;
        o.LJIIIZ(rootData, "rootData");
        o.LJIIIZ(imageId, "imageId");
        if (!imageListViewModel.LJLJJLL.contains(imageId)) {
            imageListViewModel.LJLJJLL.add(imageId);
            String roomId = rootData.roomId;
            String authorId = rootData.authorId;
            boolean z = rootData.isNewUser;
            String L = rootData.L();
            int i = rootData.templateEntryType;
            o.LJIIIZ(roomId, "roomId");
            o.LJIIIZ(authorId, "authorId");
            Map LIZ = S5F.LIZ(roomId, authorId, Integer.valueOf(i), L, "notice_board_template", z);
            LIZ.put("module_name", "photo_display");
            LIZ.put("photo_id", imageId);
            b.LJJIJIIJI("livesdk_tiktokec_module_show", LIZ);
        }
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return inflateItemView(parent, R.layout.aq8);
    }
}
