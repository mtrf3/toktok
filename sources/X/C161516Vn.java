package X;

import Y.ACallableS105S0100000_2;
import Y.ARunnableS8S0110000_2;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.vesdk.VEEditor;
import kotlin.jvm.internal.o;

/* renamed from: X.6Vn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C161516Vn {
    public final CreativeInfo LIZ;
    public final InterfaceC153045zY LIZIZ;
    public final InterfaceC143655kP LIZJ;
    public String LIZLLL;
    public String LJ;
    public C6W7 LJFF;
    public boolean LJI;
    public int LJII;
    public C5V3 LJIIIIZZ;
    public final C161556Vr LJIIIZ;

    public final void LIZ() {
        C122034qd LJJI = C17N.LJJI(this.LIZIZ);
        if (LJJI != null) {
            LJJI.LJIIIIZZ().LIZ().LJII(this.LIZLLL);
            this.LIZIZ.LLJJJJJIL(this.LJII, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, new InterfaceC133865Ne() { // from class: X.6Vq
                @Override // X.InterfaceC133865Ne
                public final void LIZ(int i) {
                    C161516Vn.this.LIZIZ.play();
                    C6W7 c6w7 = C161516Vn.this.LJFF;
                    if (c6w7 != null) {
                        c6w7.LIZ.LJLJI.post(new ARunnableS8S0110000_2(c6w7, 9));
                    }
                }
            });
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.6Vr] */
    public C161516Vn(CreativeInfo creativeInfo, InterfaceC153045zY veEditor, ActivityC45651qj context, InterfaceC143655kP editPreviewApi) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(veEditor, "veEditor");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        this.LIZ = creativeInfo;
        this.LIZIZ = veEditor;
        this.LIZJ = editPreviewApi;
        this.LIZLLL = "";
        this.LJIIIZ = new InterfaceC133905Ni() { // from class: X.6Vr
            @Override // X.InterfaceC133905Ni
            public final void LIZ(int i, int i2, float f, String str) {
                if (i != 4098) {
                    if (i != 4132) {
                        return;
                    }
                    C161516Vn c161516Vn = C161516Vn.this;
                    c161516Vn.LJI = false;
                    c161516Vn.LIZ();
                    return;
                }
                C161516Vn c161516Vn2 = C161516Vn.this;
                if (!c161516Vn2.LJI) {
                    return;
                }
                C10K.LIZIZ(new ACallableS105S0100000_2(c161516Vn2, 40), C10K.LJIIIIZZ, null);
            }
        };
    }
}
