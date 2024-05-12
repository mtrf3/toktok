package X;

import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.Uwd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78823Uwd implements C2V {
    public final /* synthetic */ C78826Uwg LJLIL;
    public final /* synthetic */ InterfaceC78830Uwk LJLILLLLZI;
    public final /* synthetic */ C78820Uwa LJLJI;

    @Override // X.InterfaceC30685C2n
    public final void onSuccess() {
        for (C78801UwH c78801UwH : this.LJLIL.LJFF) {
            if (o.LJ(c78801UwH.LIZ, "Green Screen")) {
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
        if (uIAnnotationErrorCode != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("lalaland - green screen error: ");
            LIZ.append(uIAnnotationErrorCode);
            C15280iq.LIZJ("OptionCategoryPanelViewModel", X1D.LIZIZ(LIZ));
        }
    }

    public C78823Uwd(C78826Uwg c78826Uwg, C78815UwV c78815UwV, C78820Uwa c78820Uwa) {
        this.LJLIL = c78826Uwg;
        this.LJLILLLLZI = c78815UwV;
        this.LJLJI = c78820Uwa;
    }
}
