package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.Uwe, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78824Uwe implements C2V {
    public final /* synthetic */ C78826Uwg LJLIL;
    public final /* synthetic */ InterfaceC78830Uwk LJLILLLLZI;
    public final /* synthetic */ C78820Uwa LJLJI;

    @Override // X.InterfaceC30685C2n
    public final void onSuccess() {
        C15280iq.LJ("OptionCategoryPanelViewModel", "Updated view with clear selection successfully.");
        List<C78801UwH> list = this.LJLIL.LJFF;
        C78820Uwa c78820Uwa = this.LJLJI;
        for (C78801UwH c78801UwH : list) {
            if (o.LJ(c78801UwH.LIZ, c78820Uwa.LIZ)) {
                Iterator<C78789Uw5> it = c78801UwH.LJ.iterator();
                while (it.hasNext()) {
                    it.next().LJIIJ = false;
                }
                this.LJLILLLLZI.LIZIZ(new OSZ<>(Integer.valueOf(this.LJLJI.LIZIZ), -1));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // X.C2V
    public final void LIZIZ(UIAnnotationErrorCode uIAnnotationErrorCode) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Updating view with clear selection failed, errorCode:");
        LIZ.append(uIAnnotationErrorCode);
        C15280iq.LJ("OptionCategoryPanelViewModel", X1D.LIZIZ(LIZ));
    }

    public C78824Uwe(C78826Uwg c78826Uwg, C78817UwX c78817UwX, C78820Uwa c78820Uwa) {
        this.LJLIL = c78826Uwg;
        this.LJLILLLLZI = c78817UwX;
        this.LJLJI = c78820Uwa;
    }
}
