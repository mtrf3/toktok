package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.viewpager.OptionCategoryViewModel;

/* renamed from: X.UwT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78813UwT implements InterfaceC78830Uwk {
    public final /* synthetic */ OptionCategoryViewModel LIZ;
    public final /* synthetic */ C78820Uwa LIZIZ;

    @Override // X.InterfaceC78830Uwk
    public final void LIZ(UIAnnotationErrorCode uIAnnotationErrorCode) {
        String str;
        this.LIZ.LJLJLJ.setValue(C78798UwE.LIZ);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Failed to select Green Screen data {");
        LIZ.append(this.LIZIZ);
        LIZ.append(".optionName} with ");
        if (uIAnnotationErrorCode != null) {
            str = uIAnnotationErrorCode.name();
        } else {
            str = null;
        }
        LIZ.append(str);
        C15280iq.LIZJ("OptionCategoryPanelViewModel", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC78830Uwk
    public final void LIZIZ(OSZ<Integer, Integer> osz) {
        this.LIZ.LJLJLJ.setValue(new C78796UwC(osz));
    }

    public C78813UwT(OptionCategoryViewModel optionCategoryViewModel, C78820Uwa c78820Uwa) {
        this.LIZ = optionCategoryViewModel;
        this.LIZIZ = c78820Uwa;
    }
}
