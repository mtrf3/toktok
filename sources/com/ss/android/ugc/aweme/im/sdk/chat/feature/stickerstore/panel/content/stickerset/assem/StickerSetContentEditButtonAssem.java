package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.assem;

import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7MY;
import X.C88033ct;
import X.C88193d9;
import X.C8YN;
import X.C99W;
import X.C9BE;
import X.EF7;
import X.EnumC87143bS;
import X.InterfaceC65350Pko;
import X.InterfaceC90983he;
import X.SY4;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.container.fragment.StickerStorePanelFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerSetContentEditButtonAssem extends UIContentAssem implements InterfaceC90983he {
    public int LJLIL;
    public final C214298b3 LJLILLLLZI;
    public final C55749LuL LJLJI;
    public final C62822Ol8 LJLJJI;
    public final int LJLJJL;
    public final C62822Ol8 LJLJJLL;

    public StickerSetContentEditButtonAssem() {
        new LinkedHashMap();
        this.LJLIL = -1;
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StickerSetContentViewModel.class);
        this.LJLILLLLZI = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 175), C88193d9.INSTANCE, null);
        this.LJLJI = new C55749LuL(C47704Ins.LJ(this, C88033ct.class, "sticker_store_sticker_set_content_config"), checkSupervisorPrepared());
        this.LJLJJI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 172));
        this.LJLJJL = C63081OpJ.LJJJJJL(EF7.LIZIZ());
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 174));
    }

    public final StickerSetContentViewModel v3() {
        return (StickerSetContentViewModel) this.LJLILLLLZI.getValue();
    }

    public final SY4 x3() {
        Object value = this.LJLJJI.getValue();
        o.LJIIIIZZ(value, "<get-editBtn>(...)");
        return (SY4) value;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        StickerStorePanelFragment stickerStorePanelFragment = (StickerStorePanelFragment) this.LJLJJLL.getValue();
        if (stickerStorePanelFragment != null) {
            ((ArrayList) stickerStorePanelFragment.LJLIL).remove(this);
        }
    }

    @Override // X.InterfaceC90983he
    public final void D2(float f) {
        if (f >= 0.0f || this.LJLIL == 2) {
            getContainerView().setTranslationY(((f - 1) * 0.22f * this.LJLJJL) + C7MY.LIZIZ(1));
        }
    }

    @Override // X.InterfaceC90983he
    public final void LJJJLZIJ(int i) {
        this.LJLIL = i;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C88033ct c88033ct = (C88033ct) this.LJLJI.getValue();
        if (c88033ct != null && c88033ct.LJLIL == EnumC87143bS.ADDED.getType()) {
            if (C99W.LIZ) {
                x3();
                x3().setButtonVariant(5);
            }
            C16880lQ.LJJIZ(x3(), new ACListenerS21S0100000_1(this, 51));
            C8YN.LJII(this, v3(), new TBT() { // from class: X.3d8
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((C87503c2) obj).LJLILLLLZI;
                }
            }, null, new AqS183S0100000_1(this, 7), 6);
            AssemViewModel.asyncSubscribe$default(v3(), new TBT() { // from class: X.3d6
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    C87503c2 c87503c2 = (C87503c2) obj;
                    c87503c2.getClass();
                    return C208708Ha.LIZLLL(c87503c2);
                }
            }, null, new AqS167S0100000_1(this, 75), new AqS151S0100000_1(this, 173), new AqS167S0100000_1(this, 76), 2, null);
            C8YN.LJII(this, v3(), new TBT() { // from class: X.3d7
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    C87503c2 c87503c2 = (C87503c2) obj;
                    c87503c2.getClass();
                    return C208708Ha.LIZ(c87503c2);
                }
            }, null, new AqS183S0100000_1(this, 8), 6);
            getContainerView().setTranslationY((this.LJLJJL * (-0.22f)) + C7MY.LIZIZ(1));
            StickerStorePanelFragment stickerStorePanelFragment = (StickerStorePanelFragment) this.LJLJJLL.getValue();
            if (stickerStorePanelFragment != null) {
                ((ArrayList) stickerStorePanelFragment.LJLIL).add(this);
                return;
            }
            return;
        }
        getContainerView().setVisibility(8);
    }
}
