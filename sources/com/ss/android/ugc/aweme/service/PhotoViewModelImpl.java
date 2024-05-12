package com.ss.android.ugc.aweme.service;

import X.C183847Jk;
import X.C183867Jm;
import X.C214348b8;
import X.C65352Pkq;
import X.C76800UCe;
import X.C8YN;
import X.InterfaceC88472Yns;
import X.TBT;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ui.feed.photos.PhotoViewModelV2;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS185S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PhotoViewModelImpl implements IPhotoViewModel {
    @Override // com.ss.android.ugc.aweme.service.IPhotoViewModel
    public final void LIZ(ReusedUIAssem assem, AqS134S0200000_3 aqS134S0200000_3) {
        String str;
        o.LJIIIZ(assem, "assem");
        Aweme aweme = ((PhotoViewModelV2) C214348b8.LIZIZ(assem, C65352Pkq.LIZ(PhotoViewModelV2.class), C183867Jm.INSTANCE).getValue()).LL;
        if (aweme == null || (str = aweme.getAid()) == null) {
            str = "";
        }
        aqS134S0200000_3.invoke(str);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Lcom/bytedance/assem/arch/reused/ReusedUIAssem<*>;:LX/8XO<TITEM;>;ITEM:Ljava/lang/Object;>(TT;LX/Yns<-Ljava/lang/Integer;LX/UCe;>;)V */
    @Override // com.ss.android.ugc.aweme.service.IPhotoViewModel
    public final void LIZIZ(ReusedUIAssem assem, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(assem, "assem");
        C8YN.LJII(assem, (AssemViewModel) C214348b8.LIZIZ(assem, C65352Pkq.LIZ(PhotoViewModelV2.class), C183847Jk.INSTANCE).getValue(), new TBT() { // from class: X.7Jl
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C203127y8) obj).LJLLI);
            }
        }, null, new AqS185S0100000_3(interfaceC88472Yns, (InterfaceC88472Yns<? super Integer, C76800UCe>) 76), 6);
    }
}
