package com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel;

import X.A2F;
import X.A2G;
import X.C33Q;
import X.C47704Ins;
import X.C55749LuL;
import X.C61878OQg;
import X.C67412kj;
import X.C71572rR;
import X.C72052sD;
import X.C78613UtF;
import X.C86793at;
import X.C87013bF;
import X.C87463by;
import X.C88023cs;
import X.C8HZ;
import X.EnumC71652rZ;
import X.InterfaceC57784Mm4;
import X.InterfaceC67352kd;
import X.InterfaceC71602rU;
import X.XKX;
import android.view.View;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class StickerSetDetailViewModel extends AssemListViewModel<C87463by, C72052sD, Long> implements InterfaceC71602rU {
    public final C55749LuL LJLIL = new C55749LuL(C47704Ins.LJFF(this, C88023cs.class, "sticker_set_detail_config"), true);

    @Override // X.InterfaceC71602rU
    public final void Ge() {
    }

    @Override // X.InterfaceC71602rU
    public final void hi(List<StickerSetInfo> list) {
    }

    @Override // X.InterfaceC71602rU
    public final void kI(StickerSetInfo stickerSetInfo) {
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C87463by(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        C71572rR.LJII.LIZ(this);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C71572rR.LJII.LJIJ(this);
    }

    @Override // X.InterfaceC71602rU
    public final void Cs0(StickerSetInfo info) {
        o.LJIIIZ(info, "info");
        Long setId = info.getSetId();
        if (setId != null) {
            long longValue = setId.longValue();
            if (C87013bF.LIZ()) {
                C86793at.LIZ(EnumC71652rZ.STORE.getScene(), Long.valueOf(longValue));
            }
            C88023cs c88023cs = (C88023cs) this.LJLIL.getValue();
            if (c88023cs != null && c88023cs.LJLIL == longValue) {
                setState(new AqS167S0100000_1(info, 108));
            }
        }
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<C72052sD> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS167S0100000_1(newListState, (C8HZ<InterfaceC57784Mm4>) 107));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<java.lang.Long>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C86823aw
            if (r0 == 0) goto L4b
            r5 = r7
            X.3aw r5 = (X.C86823aw) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4b
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r1 = r5.LJLIL
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJI
            r3 = 1
            if (r0 == 0) goto L2c
            if (r0 != r3) goto L82
            X.C141335gf.LIZJ(r1)
        L20:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L78
            X.EF7.LIZIZ()
            goto L51
        L2c:
            X.C141335gf.LIZJ(r1)
            X.LuL r0 = r6.LJLIL
            java.lang.Object r0 = r0.getValue()
            X.3cs r0 = (X.C88023cs) r0
            if (r0 == 0) goto L49
            long r1 = r0.LJLIL
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
        L40:
            r5.LJLJI = r3
            java.lang.Object r1 = r6.hv0(r0, r5)
            if (r1 != r4) goto L20
            return r4
        L49:
            r0 = 0
            goto L40
        L4b:
            X.3aw r5 = new X.3aw
            r5.<init>(r6, r7)
            goto L12
        L51:
            X.Ivu r0 = X.C2NU.LIZ     // Catch: java.lang.Exception -> L69
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L69
            if (r0 != 0) goto L5a
            goto L69
        L5a:
            X.A2F r1 = X.A2G.LIZ
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            r1.getClass()
            X.A2I r0 = X.A2F.LIZJ(r0)
            goto L77
        L69:
            X.A2F r1 = X.A2G.LIZ
            X.PaI r0 = new X.PaI
            r0.<init>()
            r1.getClass()
            X.A2I r0 = X.A2F.LIZJ(r0)
        L77:
            return r0
        L78:
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2H r0 = X.A2F.LIZ(r1)
            return r0
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel.onRefresh(X.2kd):java.lang.Object");
    }

    public final void gv0(StickerSetInfo stickerSetInfo, View context) {
        Long setId;
        o.LJIIIZ(context, "context");
        if (stickerSetInfo != null && (setId = stickerSetInfo.getSetId()) != null) {
            long longValue = setId.longValue();
            setState(new AqS167S0100000_1(stickerSetInfo, 105));
            XKX.LIZLLL(getAssemVMScope(), C78613UtF.LIZJ, null, new C67412kj(longValue, stickerSetInfo, context, this, null), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(java.lang.Long r6, X.InterfaceC67352kd<? super java.util.List<X.C72052sD>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C86813av
            if (r0 == 0) goto L8a
            r4 = r7
            X.3av r4 = (X.C86813av) r4
            int r2 = r4.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8a
            int r2 = r2 - r1
            r4.LJLJJL = r2
        L12:
            java.lang.Object r1 = r4.LJLJI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJL
            r2 = 1
            if (r0 == 0) goto L6d
            if (r0 != r2) goto L93
            java.lang.Object r6 = r4.LJLILLLLZI
            com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel r4 = r4.LJLIL
            X.C141335gf.LIZJ(r1)
        L24:
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r3 = r1.get(r6)
            com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSet r3 = (com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSet) r3
            if (r3 == 0) goto L6b
            com.ss.android.ugc.aweme.emoji.stickerstore.model.StickerSetInfo r2 = r3.getInfo()
        L32:
            r4.getClass()
            kotlin.jvm.internal.AqS167S0100000_1 r1 = new kotlin.jvm.internal.AqS167S0100000_1
            r0 = 378(0x17a, float:5.3E-43)
            r1.<init>(r2, r0)
            r4.setState(r1)
            if (r3 == 0) goto L90
            java.util.List r1 = r3.getStickers()
            if (r1 == 0) goto L90
            java.util.ArrayList r3 = new java.util.ArrayList
            r0 = 10
            int r0 = X.C32I.LJJL(r1, r0)
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L56:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r1 = r2.next()
            com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker r1 = (com.ss.android.ugc.aweme.emoji.stickerstore.model.SetSticker) r1
            X.2sD r0 = new X.2sD
            r0.<init>(r1)
            r3.add(r0)
            goto L56
        L6b:
            r2 = 0
            goto L32
        L6d:
            X.C141335gf.LIZJ(r1)
            if (r6 == 0) goto L9b
            r6.longValue()
            X.2rE r1 = X.C71442rE.LJII
            java.util.List r0 = X.C47261Igj.LJJIJ(r6)
            r4.LJLIL = r5
            r4.LJLILLLLZI = r6
            r4.LJLJJL = r2
            java.lang.Object r1 = r1.LJIJI(r0, r4)
            if (r1 != r3) goto L88
            return r3
        L88:
            r4 = r5
            goto L24
        L8a:
            X.3av r4 = new X.3av
            r4.<init>(r5, r7)
            goto L12
        L90:
            X.OQg r3 = X.C61878OQg.INSTANCE
        L92:
            return r3
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L9b:
            X.OQg r0 = X.C61878OQg.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.feature.stickerstore.panel.setdetail.viewmodel.StickerSetDetailViewModel.hv0(java.lang.Long, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(Long l, InterfaceC67352kd<? super A2G<Long>> interfaceC67352kd) {
        l.longValue();
        A2F a2f = A2G.LIZ;
        C61878OQg c61878OQg = C61878OQg.INSTANCE;
        a2f.getClass();
        return A2F.LIZ(c61878OQg);
    }
}
