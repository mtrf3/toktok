package X;

import com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UwQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78810UwQ implements InterfaceC78811UwR {
    public final /* synthetic */ OptionCategoryPanelViewModel LIZ;

    public C78810UwQ(OptionCategoryPanelViewModel optionCategoryPanelViewModel) {
        this.LIZ = optionCategoryPanelViewModel;
    }

    @Override // X.InterfaceC78811UwR
    public final void LIZ(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Face Filter loaded Failure, msg:");
        LIZ.append(str);
        C15280iq.LJI("OptionCategoryPanelViewModel", X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC78811UwR
    public final void LIZIZ(java.util.Map<C78832Uwm, ? extends List<C78801UwH>> result, C78789Uw5 c78789Uw5) {
        o.LJIIIZ(result, "result");
        this.LIZ.LJLJL.postValue(new OSZ<>(result, null));
    }
}
