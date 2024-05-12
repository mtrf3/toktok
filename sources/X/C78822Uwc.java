package X;

import android.graphics.Bitmap;
import com.bytedance.ies.effecteditor.swig.UIAnnotationErrorCode;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.o;

/* renamed from: X.Uwc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78822Uwc implements C2V {
    public final /* synthetic */ C78820Uwa LJLIL;
    public final /* synthetic */ C78826Uwg LJLILLLLZI;
    public final /* synthetic */ C68322mC<Bitmap[]> LJLJI;
    public final /* synthetic */ InterfaceC78830Uwk LJLJJI;

    @Override // X.InterfaceC30685C2n
    public final void onSuccess() {
        String str;
        int i = this.LJLIL.LIZLLL;
        for (C78801UwH c78801UwH : this.LJLILLLLZI.LJFF) {
            if (o.LJ(c78801UwH.LIZ, "Green Screen")) {
                List<C78789Uw5> list = c78801UwH.LJ;
                int size = list.size();
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    String str2 = ((C78789Uw5) ListProtector.get(list, i2)).LIZJ;
                    C78789Uw5 c78789Uw5 = this.LJLIL.LJ;
                    if (c78789Uw5 != null) {
                        str = c78789Uw5.LIZJ;
                    } else {
                        str = null;
                    }
                    if (o.LJ(str2, str)) {
                        i = i2;
                    } else {
                        ((C78789Uw5) ListProtector.get(list, i2)).LJIIJ = false;
                    }
                }
                C78789Uw5 c78789Uw52 = (C78789Uw5) ListProtector.get(list, i);
                if (this.LJLJI.element.length == 0) {
                    z = true;
                }
                c78789Uw52.LJIIJ = !z;
                InterfaceC78830Uwk interfaceC78830Uwk = this.LJLJJI;
                if (interfaceC78830Uwk != null) {
                    interfaceC78830Uwk.LIZIZ(new OSZ<>(Integer.valueOf(this.LJLIL.LIZIZ), Integer.valueOf(i)));
                    return;
                }
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

    public C78822Uwc(C78820Uwa c78820Uwa, C78826Uwg c78826Uwg, C68322mC c68322mC, C78813UwT c78813UwT) {
        this.LJLIL = c78820Uwa;
        this.LJLILLLLZI = c78826Uwg;
        this.LJLJI = c68322mC;
        this.LJLJJI = c78813UwT;
    }
}
