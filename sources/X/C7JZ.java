package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.service.IPhotoViewModel;
import com.ss.android.ugc.aweme.service.PhotoViewModelImpl;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7JZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7JZ implements IPhotoViewModel {
    public static final C7JZ LIZIZ = new C7JZ();
    public final /* synthetic */ IPhotoViewModel LIZ;

    @Override // com.ss.android.ugc.aweme.service.IPhotoViewModel
    public final void LIZ(ReusedUIAssem assem, AqS134S0200000_3 aqS134S0200000_3) {
        o.LJIIIZ(assem, "assem");
        this.LIZ.LIZ(assem, aqS134S0200000_3);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Lcom/bytedance/assem/arch/reused/ReusedUIAssem<*>;:LX/8XO<TITEM;>;ITEM:Ljava/lang/Object;>(TT;LX/Yns<-Ljava/lang/Integer;LX/UCe;>;)V */
    @Override // com.ss.android.ugc.aweme.service.IPhotoViewModel
    public final void LIZIZ(ReusedUIAssem assem, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(assem, "assem");
        this.LIZ.LIZIZ(assem, interfaceC88472Yns);
    }

    public C7JZ() {
        IPhotoViewModel iPhotoViewModel;
        Object LIZ = C58096Mr6.LIZ(IPhotoViewModel.class, false);
        if (LIZ != null) {
            iPhotoViewModel = (IPhotoViewModel) LIZ;
        } else {
            if (C58096Mr6.g5 == null) {
                synchronized (IPhotoViewModel.class) {
                    if (C58096Mr6.g5 == null) {
                        C58096Mr6.g5 = new PhotoViewModelImpl();
                    }
                }
            }
            iPhotoViewModel = C58096Mr6.g5;
        }
        this.LIZ = iPhotoViewModel;
    }
}
