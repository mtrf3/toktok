package com.ss.android.ugc.aweme.favorites.business.playlist;

import X.AnonymousClass886;
import X.C04Q;
import X.C12460eI;
import X.C1DJ;
import X.C214298b3;
import X.C283619k;
import X.C35931b3;
import X.C35991b9;
import X.C65352Pkq;
import X.C65776Prg;
import X.C79239V7z;
import X.C9BD;
import X.C9BE;
import X.C9XN;
import X.InterfaceC24520xk;
import X.InterfaceC65784Pro;
import X.V67;
import X.V7M;
import X.V80;
import X.V81;
import X.V82;
import X.V83;
import X.YE1;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.favorites.business.playlist.model.MixInfo;
import kotlin.jvm.internal.AqS129S0300000_13;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS175S0200000_13;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.AqS75S0201000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class PlaylistCollectionCell extends PowerCell<AnonymousClass886> {
    public final C214298b3 LJLIL;

    public PlaylistCollectionCell() {
        C214298b3 c214298b3;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(PlaylistCollectionVM.class);
        AqS163S0100000_13 aqS163S0100000_13 = new AqS163S0100000_13(LIZ, 244);
        V7M v7m = V7M.INSTANCE;
        if (o.LJ(c9be, C9BD.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS163S0100000_13, V80.INSTANCE, new AqS163S0100000_13(this, 245), new AqS163S0100000_13(this, 246), V83.INSTANCE, v7m, new AqS163S0100000_13(this, 247), 256);
        } else if (o.LJ(c9be, c9be)) {
            c214298b3 = new C214298b3(LIZ, aqS163S0100000_13, V81.INSTANCE, new AqS163S0100000_13(this, 248), new AqS163S0100000_13(this, 239), V82.INSTANCE, v7m, new AqS163S0100000_13(this, 240), 256);
        } else if (c9be == null || o.LJ(c9be, C9XN.LIZ)) {
            c214298b3 = new C214298b3(LIZ, aqS163S0100000_13, C79239V7z.INSTANCE, new AqS163S0100000_13(this, 241), new AqS163S0100000_13(this, 242), new AqS163S0100000_13(this, 243), v7m, (InterfaceC65784Pro) null, 384);
        } else {
            throw new IllegalArgumentException(YE1.LIZJ("Don't support this VMScope: ", c9be, " there"));
        }
        this.LJLIL = c214298b3;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onItemViewCreated() {
        super.onItemViewCreated();
        View itemView = this.itemView;
        o.LJIIIIZZ(itemView, "itemView");
        C12460eI.LJ(itemView, new AqS176S0100000_10(this, 48));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void onBindItemView(AnonymousClass886 anonymousClass886) {
        AnonymousClass886 t = anonymousClass886;
        o.LJIIIZ(t, "t");
        super.onBindItemView(t);
        View view = this.itemView;
        o.LJII(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
        ((ComposeView) view).setContent(C1DJ.LJFF(new AqS175S0200000_13(this, t, 10), -699395260, true));
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public final View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        o.LJIIIIZZ(context, "parent.context");
        ComposeView composeView = new ComposeView(context, null, 6);
        composeView.setViewCompositionStrategy(C283619k.LIZIZ);
        return composeView;
    }

    public final void L(MixInfo mixInfo, InterfaceC24520xk interfaceC24520xk, int i) {
        C35931b3 LJIL = interfaceC24520xk.LJIL(908263135);
        V67.LIZ(null, null, null, null, null, null, C1DJ.LJ(LJIL, 2138884772, new AqS129S0300000_13((Context) LJIL.LJIILLIIL(C04Q.LIZJ), mixInfo, this, 1)), LJIL, 1572864, 63);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new AqS75S0201000_13(this, mixInfo, i, 0);
    }
}
