package X;

import Y.ACallableS105S0100000_2;
import Y.ARunnableS8S0110000_2;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.vesdk.VEEditor;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import kotlin.jvm.internal.o;

/* renamed from: X.66T, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C66T {
    public final CreativeInfo LIZ;
    public final InterfaceC153045zY LIZIZ;
    public final InterfaceC143655kP LIZJ;
    public String LIZLLL;
    public String LJ;
    public C153075zb LJFF;
    public C66I LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public DialogC111064Xm LJIIIZ;
    public final C66X LJIIJ;

    public final void LIZIZ() {
        this.LJII = false;
        C122034qd LJJI = C17N.LJJI(this.LIZIZ);
        if (LJJI != null) {
            LJJI.LJIIIIZZ().LIZ().LJII(this.LIZLLL);
            this.LIZIZ.LLJJJJJIL(this.LJIIIIZZ, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, new InterfaceC133865Ne() { // from class: X.66S
                @Override // X.InterfaceC133865Ne
                public final void LIZ(int i) {
                    C1548265u c1548265u;
                    C66T c66t = C66T.this;
                    VEEditorAutoStartStopArbiter value = c66t.LIZJ.wz().getValue();
                    if (value != null && value.LJLLI) {
                        c66t.LIZIZ.play();
                    }
                    C66I c66i = C66T.this.LJI;
                    if (c66i != null && (c1548265u = c66i.LIZ.LJLJI) != null) {
                        c1548265u.post(new ARunnableS8S0110000_2(c66i, 7));
                    }
                }
            });
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void LIZ(C153075zb item) {
        o.LJIIIZ(item, "item");
        C122034qd LJJI = C17N.LJJI(this.LIZIZ);
        if (LJJI != null) {
            C5WG LJIIIIZZ = LJJI.LJIIIIZZ();
            String str = item.LJLJI.uuid;
            o.LJIIIIZZ(str, "item.stickerItem.uuid");
            C122024qc LJJJJLI = LJIIIIZZ.LJJJJLI(str);
            if (LJJJJLI instanceof C121514pn) {
                ((C121514pn) LJJJJLI).LJIJ = null;
                LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
                return;
            } else {
                if (!(LJJJJLI instanceof C121594pv)) {
                    return;
                }
                ((C121594pv) LJJJJLI).LJIIJJI = null;
                LJJI.LJIIIIZZ().LJIIJ(LJJJJLI);
                return;
            }
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [X.66X] */
    public C66T(CreativeInfo creativeInfo, InterfaceC153045zY veEditor, ActivityC45651qj context, InterfaceC143655kP editPreviewApi) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(veEditor, "veEditor");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(editPreviewApi, "editPreviewApi");
        this.LIZ = creativeInfo;
        this.LIZIZ = veEditor;
        this.LIZJ = editPreviewApi;
        this.LIZLLL = "";
        this.LJIIJ = new InterfaceC133905Ni() { // from class: X.66X
            @Override // X.InterfaceC133905Ni
            public final void LIZ(int i, int i2, float f, String str) {
                if (i != 4098) {
                    if (i != 4132) {
                        return;
                    }
                    C66T.this.LIZIZ();
                } else {
                    C66T c66t = C66T.this;
                    if (!c66t.LJII) {
                        return;
                    }
                    C10K.LIZIZ(new ACallableS105S0100000_2(c66t, 34), C10K.LJIIIIZZ, null);
                }
            }
        };
    }
}
