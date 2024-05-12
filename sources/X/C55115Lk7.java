package X;

import android.os.Bundle;
import com.bytedance.android.widget.NextLiveData;
import com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Lk7, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55115Lk7 implements InterfaceC53896LDg {
    public final /* synthetic */ ListLiveCircleItemVM LJLIL;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    public C55115Lk7(ListLiveCircleItemVM listLiveCircleItemVM) {
        this.LJLIL = listLiveCircleItemVM;
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        this.LJLIL.LJLJI.setValue(Boolean.FALSE);
        this.LJLIL.hv0();
        C0NB.LIZIZ("LYP_LOG", "ListLiveCircleItemVM onNodeHide()");
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        NextLiveData nextLiveData = this.LJLIL.LJLJI;
        Boolean bool = Boolean.TRUE;
        nextLiveData.setValue(bool);
        this.LJLIL.LJLILLLLZI.postValue(bool);
        C0NB.LIZIZ("LYP_LOG", "ListLiveCircleItemVM onNodeShow()");
    }
}
