package X;

import Y.ARunnableS8S0101000_4;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.ARb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26227ARb extends AbstractC26238ARm<C26227ARb, C26231ARf> {
    public boolean LJIIIIZZ;
    public AbstractC244669iw LJIIIZ;
    public ART LJIIJ;
    public AbstractC242999gF LJIIJJI;
    public AbstractC243009gG LJIIL;
    public int LJIILIIL;

    public final C26231ARf LJI() {
        List list;
        C26231ARf c26231ARf = new C26231ARf(this);
        int hashCode = c26231ARf.hashCode();
        if (AX9.LIZIZ()) {
            ART art = c26231ARf.LJLJLJ.LJIIJ;
            if (art == null) {
                list = C61878OQg.INSTANCE;
            } else {
                ArrayList arrayList = new ArrayList();
                CharSequence LIZLLL = art.LIZLLL();
                if (LIZLLL != null && LIZLLL.length() > 0) {
                    arrayList.add(LIZLLL);
                }
                CharSequence LIZJ = art.LIZJ();
                list = arrayList;
                if (LIZJ != null) {
                    list = arrayList;
                    if (LIZJ.length() > 0) {
                        arrayList.add(LIZJ);
                        list = arrayList;
                    }
                }
            }
            String LLD = ORZ.LLD(list, "", null, null, C58472Rf.LJLIL, 30);
            if (LLD.length() == 0) {
                Exception exc = new Exception();
                if (exc.getStackTrace().length < 14) {
                    LLD = "null";
                } else {
                    LLD = Arrays.toString(Arrays.copyOfRange(exc.getStackTrace(), 6, 14));
                }
            }
            C26240ARo c26240ARo = new C26240ARo(AX9.LIZ(), "TuxDialog", LLD);
            c26231ARf.LJLLL.setOnDismissListener(new DialogInterfaceOnDismissListenerC26230ARe(c26231ARf.LJLJJI, c26231ARf, hashCode));
            C37179EiV.LIZ().postDelayed(new ARunnableS8S0101000_4(hashCode, c26240ARo, 3), 200L);
        }
        return c26231ARf;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26227ARb(Context context) {
        super(context);
        o.LJIIIZ(context, "context");
    }

    @Override // X.AbstractC26238ARm
    /* renamed from: LJII, reason: merged with bridge method [inline-methods] */
    public final void LIZIZ(CharSequence charSequence) {
        ART art = this.LJIIJ;
        if (art == null) {
            art = new ARK(this.LIZ);
            this.LJIIJ = art;
        }
        art.LJ(charSequence);
    }

    @Override // X.AbstractC26238ARm
    /* renamed from: LJIIIIZZ, reason: merged with bridge method [inline-methods] */
    public final void LJFF(CharSequence charSequence) {
        ART art = this.LJIIJ;
        if (art == null) {
            art = new ARK(this.LIZ);
            this.LJIIJ = art;
        }
        art.LJFF(charSequence);
    }
}
