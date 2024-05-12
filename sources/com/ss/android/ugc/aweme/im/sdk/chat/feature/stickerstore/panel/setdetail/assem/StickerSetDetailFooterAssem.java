package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.assem;

import X.AbstractC26257ASf;
import X.C16880lQ;
import X.C214298b3;
import X.C221108m2;
import X.C26338AVi;
import X.C45621qg;
import X.C47704Ins;
import X.C55749LuL;
import X.C62822Ol8;
import X.C63081OpJ;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C7MY;
import X.C88023cs;
import X.C88053cv;
import X.C8YN;
import X.C9BE;
import X.EF7;
import X.InterfaceC65350Pko;
import X.InterfaceC90983he;
import X.SY4;
import X.TBT;
import Y.ACListenerS21S0100000_1;
import Y.ACListenerS36S0200000_1;
import Y.ARunnableS20S0200000_1;
import android.view.View;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.assem.StickerSetDetailFooterAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.fragment.StickerSetDetailFragment;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerSetDetailFooterAssem extends UIContentAssem implements InterfaceC90983he {
    public int LJLIL;
    public final int LJLILLLLZI;
    public final C214298b3 LJLJI;
    public final C55749LuL LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;

    public StickerSetDetailFooterAssem() {
        new LinkedHashMap();
        this.LJLIL = -1;
        this.LJLILLLLZI = C63081OpJ.LJJJJJL(EF7.LIZIZ());
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StickerSetDetailViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 244), C88053cv.INSTANCE, null);
        this.LJLJJI = new C55749LuL(C47704Ins.LIZJ(this, C88023cs.class, "sticker_set_detail_config"), checkSupervisorPrepared());
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 240));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 241));
        this.LJLJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 243));
    }

    public final SY4 v3() {
        Object value = this.LJLJJL.getValue();
        o.LJIIIIZZ(value, "<get-addBtn>(...)");
        return (SY4) value;
    }

    public final C88023cs x3() {
        return (C88023cs) this.LJLJJI.getValue();
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.C8W0
    public final void onDestroy() {
        super.onDestroy();
        StickerSetDetailFragment stickerSetDetailFragment = (StickerSetDetailFragment) this.LJLJL.getValue();
        if (stickerSetDetailFragment != null) {
            ((ArrayList) stickerSetDetailFragment.LJLIL).remove(this);
        }
    }

    @Override // X.InterfaceC90983he
    public final void D2(float f) {
        if (f >= 0.0f || this.LJLIL == 2) {
            getContainerView().setTranslationY(((f - 1) * 0.22f * this.LJLILLLLZI) + C7MY.LIZIZ(1));
        }
    }

    @Override // X.InterfaceC90983he
    public final void LJJJLZIJ(int i) {
        this.LJLIL = i;
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        View view2;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C16880lQ.LJJIZ(v3(), new ACListenerS36S0200000_1(view, this, 4));
        if (x3().LJLJJI) {
            Object value = this.LJLJJLL.getValue();
            o.LJIIIIZZ(value, "<get-moreBtn>(...)");
            C16880lQ.LJJIZ((SY4) value, new ACListenerS21S0100000_1(this, 59));
        } else {
            Object value2 = this.LJLJJLL.getValue();
            o.LJIIIIZZ(value2, "<get-moreBtn>(...)");
            ((View) value2).setVisibility(8);
            v3().setWidth(-1);
            C26338AVi.LJI(v3(), 0, 0, 0, 0, false, 16);
        }
        C8YN.LJII(this, (AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.3cM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C87463by) obj).LJLILLLLZI;
            }
        }, null, new AqS183S0100000_1(this, 12), 6);
        AssemViewModel.asyncSubscribe$default((AssemViewModel) this.LJLJI.getValue(), new TBT() { // from class: X.3cP
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C87463by c87463by = (C87463by) obj;
                c87463by.getClass();
                return C208708Ha.LIZLLL(c87463by);
            }
        }, null, new AqS167S0100000_1(this, 98), new AqS151S0100000_1(this, 242), new AqS167S0100000_1(this, 99), 2, null);
        getContainerView().setTranslationY((this.LJLILLLLZI * (-0.22f)) + C7MY.LIZIZ(1));
        if (x3().LJLJJI || x3().LJLJI != null) {
            StickerSetDetailFragment stickerSetDetailFragment = (StickerSetDetailFragment) this.LJLJL.getValue();
            if (stickerSetDetailFragment != null) {
                ((ArrayList) stickerSetDetailFragment.LJLIL).add(this);
                return;
            }
            return;
        }
        View view3 = view;
        do {
            Object parent = view3.getParent();
            if (parent instanceof C45621qg) {
                BottomSheetBehavior from = BottomSheetBehavior.from(view3);
                o.LJIIIIZZ(from, "from(it)");
                from.addBottomSheetCallback(new AbstractC26257ASf() { // from class: X.3cw
                    @Override // X.AbstractC26257ASf
                    public final void LIZ(View bottomSheet, float f) {
                        o.LJIIIZ(bottomSheet, "bottomSheet");
                        StickerSetDetailFooterAssem.this.D2(f);
                    }

                    @Override // X.AbstractC26257ASf
                    public final void LIZIZ(int i, View bottomSheet) {
                        o.LJIIIZ(bottomSheet, "bottomSheet");
                        StickerSetDetailFooterAssem.this.LJLIL = i;
                    }
                });
                break;
            } else {
                if (!(parent instanceof View)) {
                    break;
                }
                view2 = (View) parent;
                view3 = view2;
            }
        } while (view2 != null);
        view3 = null;
        view.post(new ARunnableS20S0200000_1(view3, this, 13));
    }
}
