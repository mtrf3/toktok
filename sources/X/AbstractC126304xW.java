package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4xW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC126304xW implements InterfaceC126544xu {
    public final VideoPublishEditModel LIZ;
    public final InterfaceC153045zY LIZIZ;
    public String LIZJ;

    public abstract String LIZLLL();

    public abstract String LJ();

    public AbstractC126304xW(C126314xX params) {
        o.LJIIIZ(params, "params");
        this.LIZ = params.LIZ;
        this.LIZIZ = params.LIZIZ;
        this.LIZJ = "";
    }

    @Override // X.InterfaceC126544xu
    public final void LIZIZ(final InterfaceC126334xZ interfaceC126334xZ) {
        String path = this.LIZJ;
        o.LJIIIZ(path, "path");
        if (C44687HgJ.LIZIZ(path)) {
            C43045Guv.LIZLLL(new AqS152S0100000_2(this, 937), 0L);
            if (interfaceC126334xZ != null) {
                interfaceC126334xZ.onSuccess();
                return;
            }
            return;
        }
        C140485fI.LIZ(LJ(), LIZLLL(), new InterfaceC126374xd() { // from class: X.4xY
            @Override // X.InterfaceC126374xd
            public final void onFailure() {
                InterfaceC126334xZ interfaceC126334xZ2 = interfaceC126334xZ;
                if (interfaceC126334xZ2 != null) {
                    interfaceC126334xZ2.onFailure();
                }
            }

            @Override // X.InterfaceC126374xd
            public final void onSuccess(String str) {
                AbstractC126304xW abstractC126304xW = AbstractC126304xW.this;
                abstractC126304xW.getClass();
                abstractC126304xW.LIZJ = str;
                C43045Guv.LIZLLL(new AqS152S0100000_2(AbstractC126304xW.this, 938), 0L);
                InterfaceC126334xZ interfaceC126334xZ2 = interfaceC126334xZ;
                if (interfaceC126334xZ2 != null) {
                    interfaceC126334xZ2.onSuccess();
                }
            }
        });
    }
}
