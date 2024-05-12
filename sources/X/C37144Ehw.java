package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS48S1200000_6;
import kotlin.jvm.internal.o;

/* renamed from: X.Ehw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37144Ehw implements TJD {
    public final C73849Syb<List<EO7>> LIZ;
    public final List<EO7> LIZIZ;
    public final C5H3<InterfaceC74429TIz> LIZJ;

    @Override // X.TJD
    public final C73426Srm LIZ() {
        C73849Syb<List<EO7>> c73849Syb = this.LIZ;
        return C42193GhB.LIZJ(c73849Syb, c73849Syb);
    }

    @Override // X.InterfaceC44447HcR
    public final C37143Ehv LIZIZ() {
        return new C37143Ehv(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37144Ehw(C5H3<? extends InterfaceC74429TIz> categoryProcessor) {
        o.LJIIIZ(categoryProcessor, "categoryProcessor");
        this.LIZJ = categoryProcessor;
        this.LIZ = new C73849Syb<>();
        this.LIZIZ = new ArrayList();
    }

    @Override // X.InterfaceC44447HcR
    public final void LIZJ(String str, List<Effect> list) {
        String str2;
        if (str != null) {
            str2 = str;
        } else {
            str2 = "";
        }
        List<EO7> list2 = this.LIZIZ;
        TI9 ti9 = this.LIZJ.getValue().LIZLLL().get(str);
        if (ti9 != null) {
            ti9.getFilters();
        }
        ORS.LJJLIL(new AqS48S1200000_6(this, str2, ORZ.LLIIIZ(C61878OQg.INSTANCE, list2), 4), list);
    }
}
