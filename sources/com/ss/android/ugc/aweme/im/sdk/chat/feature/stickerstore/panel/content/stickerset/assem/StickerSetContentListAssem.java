package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.assem;

import X.AbstractC029409q;
import X.C1C8;
import X.C214298b3;
import X.C221108m2;
import X.C32151Nz;
import X.C47704Ins;
import X.C55749LuL;
import X.C57939MoZ;
import X.C5H3;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72412sn;
import X.C78926UyI;
import X.C7MY;
import X.C88033ct;
import X.C88203dA;
import X.C88963eO;
import X.C8YN;
import X.C9BE;
import X.EnumC87003bE;
import X.InterfaceC111254Yf;
import X.InterfaceC115594gF;
import X.InterfaceC57784Mm4;
import X.InterfaceC65350Pko;
import X.O6R;
import X.SYL;
import X.TBT;
import android.view.View;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.UIListContentAssem;
import com.bytedance.ies.powerlist.PowerCell;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.content.stickerset.viewmodel.StickerSetContentViewModel;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.AqS183S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerSetContentListAssem extends UIListContentAssem<StickerSetContentViewModel> implements InterfaceC111254Yf, InterfaceC115594gF {
    public final C214298b3 LJLJI;
    public boolean LJLJJI;
    public final C5H3 LJLJJL;
    public Map<Integer, View> LJLJJLL = new LinkedHashMap();
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LJ(this, C88033ct.class, "sticker_store_sticker_set_content_config"), checkSupervisorPrepared());
    public final C5H3 LJLILLLLZI = C221108m2.LIZIZ(new AqS151S0100000_1(this, 176));

    public void _$_clearFindViewByIdCache() {
        this.LJLJJLL.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this.LJLJJLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.InterfaceC111254Yf
    public int[] f0() {
        int[] iArr = {0};
        withState(A3(), new AqS167S0100000_1(iArr, 77));
        return iArr;
    }

    @Override // X.InterfaceC115594gF, X.C8V9
    public /* bridge */ /* synthetic */ String serviceKey() {
        return null;
    }

    public StickerSetContentListAssem() {
        C9BE c9be = C9BE.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(StickerSetContentViewModel.class);
        this.LJLJI = C78926UyI.LJ(this, LIZ, c9be, new AqS151S0100000_1((InterfaceC65350Pko) LIZ, 179), C88203dA.INSTANCE, null);
        this.LJLJJI = true;
        this.LJLJJL = C221108m2.LIZIZ(new AqS151S0100000_1(this, 177));
    }

    public final C88033ct C3() {
        return (C88033ct) this.LJLIL.getValue();
    }

    public final C1C8 E3() {
        return (C1C8) this.LJLILLLLZI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    /* renamed from: F3, reason: merged with bridge method [inline-methods] */
    public StickerSetContentViewModel A3() {
        return (StickerSetContentViewModel) this.LJLJI.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public SYL v3() {
        return (SYL) this.LJLJJL.getValue();
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem
    public C57939MoZ x3() {
        C57939MoZ c57939MoZ = new C57939MoZ();
        c57939MoZ.LIZIZ = !C88963eO.LJFF();
        c57939MoZ.LIZ = 3;
        return c57939MoZ;
    }

    @Override // X.C8W0
    public void onResume() {
        super.onResume();
        if (C88963eO.LJFF()) {
            withState(A3(), new AqS167S0100000_1(this, 78));
        }
    }

    @Override // X.InterfaceC115594gF
    public void LJLI(PowerCell<C72412sn> powerCell) {
        o.LJIIIZ(powerCell, "powerCell");
        E3().LJIJI(powerCell);
    }

    @Override // com.bytedance.ext_power_list.UIListContentAssem, com.bytedance.assem.arch.core.UIAssem
    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view);
        C88033ct C3 = C3();
        if (C3 == null || C3.LJLILLLLZI != EnumC87003bE.STICKER_STORE.getType()) {
            if (C88963eO.LJFF()) {
                v3().setPadding(0, C7MY.LIZIZ(18), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(49)));
            } else {
                v3().setPadding(0, 0, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(49)));
            }
        }
        C8YN.LJII(this, A3(), new TBT() { // from class: X.3dW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C87503c2) obj).LJLILLLLZI;
            }
        }, null, new AqS183S0100000_1(this, 9), 6);
        AssemViewModel.asyncSubscribe$default(A3(), new TBT() { // from class: X.3dV
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                C87503c2 c87503c2 = (C87503c2) obj;
                c87503c2.getClass();
                return C208708Ha.LIZLLL(c87503c2);
            }
        }, null, new AqS167S0100000_1(this, 79), new AqS151S0100000_1(this, 178), new AqS167S0100000_1(this, 80), 2, null);
    }

    @Override // X.InterfaceC111254Yf
    public void LLLLIIL(int i, int i2) {
        StickerSetContentViewModel A3 = A3();
        List<InterfaceC57784Mm4> LJII = v3().getState().LJII();
        Collections.swap(LJII, i, i2);
        v3().getState().LJIIJ(LJII);
        AbstractC029409q adapter = v3().getAdapter();
        if (adapter != null) {
            adapter.notifyItemMoved(i, i2);
        }
        A3.LJLILLLLZI = true;
    }
}
