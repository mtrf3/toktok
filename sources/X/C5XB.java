package X;

import Y.ACallableS54S0300000_2;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.LoudnessDetectResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5XB, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5XB {
    public List LIZ;

    public abstract Image LIZ();

    public abstract boolean LIZLLL();

    public abstract List LJ();

    public abstract void LJFF(InterfaceC153045zY interfaceC153045zY, LoudnessDetectResult[] loudnessDetectResultArr, C5XE[] c5xeArr, C5P7 c5p7);

    public List LIZIZ() {
        ArrayList arrayList = new ArrayList();
        for (C5XC c5xc : this.LIZ) {
            List<C5XE> LIZ = c5xc.LIZ();
            Iterator<C5XE> it = LIZ.iterator();
            while (it.hasNext()) {
                it.next().LJII = c5xc;
            }
            arrayList.addAll(LIZ);
        }
        return arrayList;
    }

    public /* synthetic */ C5XB(List details) {
        o.LJIIIZ(details, "details");
        this.LIZ = details;
    }

    public void LIZJ(VideoPublishEditModel editModel, final InterfaceC153045zY interfaceC153045zY, final C5P7 c5p7) {
        o.LJIIIZ(editModel, "editModel");
        final List LIZIZ = LIZIZ();
        if (((ArrayList) LIZIZ).isEmpty()) {
            return;
        }
        final C5P6 c5p6 = (C5P6) this;
        C10K.LIZJ(new ACallableS54S0300000_2(LIZIZ, editModel, c5p6, 0)).LJ(new C10I() { // from class: X.5UE
            @Override // X.C10I
            public final Object then(C10K c10k) {
                C5XB c5xb = c5p6;
                InterfaceC153045zY interfaceC153045zY2 = interfaceC153045zY;
                Object LJIIJJI = c10k.LJIIJJI();
                o.LJIIIIZZ(LJIIJJI, "it.result");
                c5xb.LJFF(interfaceC153045zY2, (LoudnessDetectResult[]) LJIIJJI, (C5XE[]) LIZIZ.toArray(new C5XE[0]), c5p7);
                return C76800UCe.LIZ;
            }
        }, C10K.LJIIIIZZ, null);
    }
}
