package X;

import Y.AfS46S0300000_7;
import Y.IDhS100S0100000_7;
import android.content.Context;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Gn3, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42557Gn3 implements InterfaceC42559Gn5 {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final Context LIZ;
    public final boolean LIZIZ;
    public final StickerItemModel LIZJ;
    public final int LIZLLL;
    public final InterfaceC65784Pro<InterfaceC42558Gn4> LJ;
    public float LJFF;
    public float LJI;
    public float LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public final int LJIIJ;
    public String LJIIJJI;
    public C41723GZb LJIIL;
    public OSZ<OSZ<Float, Float>, OSZ<Float, Float>> LJIILIIL;

    @Override // X.InterfaceC42559Gn5
    public final AbstractC73672Svk<StickerItemModel> LIZLLL() {
        C41723GZb c41723GZb = this.LJIIL;
        if (c41723GZb != null) {
            return AbstractC73672Svk.LJJIJIL(LJI(c41723GZb));
        }
        InterfaceC42558Gn4 invoke = this.LJ.invoke();
        if (invoke == null) {
            return AbstractC73672Svk.LJJIJIL(LJI(this.LJIIL));
        }
        return C41722GZa.LIZIZ(this.LIZLLL, this.LIZ, this.LIZJ, invoke.LIZ()).LJJIJL(new IDhS100S0100000_7(this, 10));
    }

    public final void LJIIIIZZ() {
        StickerItemModel stickerItemModel = this.LIZJ;
        stickerItemModel.uuid = this.LJIIJJI;
        stickerItemModel.currentOffsetX = this.LJFF;
        stickerItemModel.currentOffsetY = this.LJI;
        stickerItemModel.scale = this.LJIIIZ;
    }

    public static void LJII(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CanvasEmbeddedSticker->");
        LIZ.append(str);
        H7B.LIZ(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC42559Gn5
    public final void LIZ(OSZ<OSZ<Float, Float>, OSZ<Float, Float>> rect) {
        InterfaceC42558Gn4 invoke;
        o.LJIIIZ(rect, "rect");
        LJII("onDirectorRectBoundUpdate");
        this.LJIILIIL = rect;
        C41723GZb c41723GZb = this.LJIIL;
        if (c41723GZb == null || (invoke = this.LJ.invoke()) == null) {
            return;
        }
        LJFF(c41723GZb, invoke.LIZIZ());
        InterfaceC153045zY editor = invoke.getEditor();
        String str = this.LJIIJJI;
        if (str != null) {
            C122034qd LJJI = C17N.LJJI(editor);
            if (LJJI != null) {
                C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(str);
                if (LJJJJLI != null) {
                    LJJJJLI.LJ = this.LJFF;
                    LJJJJLI.LJFF = this.LJI;
                    C122034qd LJJI2 = C17N.LJJI(editor);
                    if (LJJI2 != null) {
                        LJJI2.LJIIIIZZ().LJIIJ(LJJJJLI);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        LJIIIIZZ();
    }

    @Override // X.InterfaceC42559Gn5
    public final void LIZIZ(float f) {
        if (this.LJIIIIZZ < 0.0f) {
            this.LJIIIIZZ = f;
        }
        float f2 = f / this.LJIIIIZZ;
        this.LJII = f2;
        this.LJIIIZ *= f2;
        this.LJIIIIZZ = f;
        InterfaceC42558Gn4 invoke = this.LJ.invoke();
        if (invoke == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onDirectorScale,scale:");
        LIZ.append(f);
        LIZ.append(",currentScaleFactor:");
        LIZ.append(this.LJII);
        LIZ.append(".index:");
        LIZ.append(this.LJIIJ);
        LIZ.append(",uuid:");
        LIZ.append(this.LJIIJJI);
        LJII(X1D.LIZIZ(LIZ));
        InterfaceC153045zY editor = invoke.getEditor();
        String str = this.LJIIJJI;
        if (str != null) {
            C122034qd LJJI = C17N.LJJI(editor);
            if (LJJI != null) {
                C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(str);
                if (LJJJJLI != null) {
                    LJJJJLI.LJIIIIZZ = this.LJIIIZ;
                    C122034qd LJJI2 = C17N.LJJI(editor);
                    if (LJJI2 != null) {
                        LJJI2.LJIIIIZZ().LJIIJ(LJJJJLI);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (this.LJFF == -1.0f) {
            return;
        }
        LJIIIIZZ();
    }

    @Override // X.InterfaceC42559Gn5
    public final void LJ(AqS157S0100000_7 aqS157S0100000_7) {
        InterfaceC42558Gn4 invoke = this.LJ.invoke();
        if (invoke == null) {
            return;
        }
        C41722GZa.LIZIZ(this.LIZLLL, this.LIZ, this.LIZJ, invoke.LIZ()).LJJL(T16.LIZ()).LJJJLIIL(new AfS46S0300000_7(this, invoke, aqS157S0100000_7, 9), C73674Svm.LIZLLL);
    }

    public final StickerItemModel LJI(C41723GZb c41723GZb) {
        StickerItemModel stickerItemModel = this.LIZJ;
        if (c41723GZb != null) {
            stickerItemModel.path = c41723GZb.LIZ;
            InterfaceC42558Gn4 invoke = this.LJ.invoke();
            if (invoke != null) {
                stickerItemModel.endTime = invoke.getEditor().getDuration();
                stickerItemModel.normalizedWidth = c41723GZb.LIZIZ / invoke.LIZIZ().getFirst().floatValue();
                stickerItemModel.normalizedHeight = c41723GZb.LIZJ / invoke.LIZIZ().getSecond().floatValue();
            }
        }
        return stickerItemModel;
    }

    @Override // X.InterfaceC42559Gn5
    public final void LIZJ(float f, float f2) {
        InterfaceC42558Gn4 invoke = this.LJ.invoke();
        if (invoke == null) {
            return;
        }
        OSZ<Float, Float> LIZIZ = invoke.LIZIZ();
        this.LJFF = (f / LIZIZ.getFirst().floatValue()) + this.LJFF;
        this.LJI = (f2 / LIZIZ.getSecond().floatValue()) + this.LJI;
        InterfaceC153045zY editor = invoke.getEditor();
        String str = this.LJIIJJI;
        if (str != null) {
            C122034qd LJJI = C17N.LJJI(editor);
            if (LJJI != null) {
                C122024qc LJJJJLI = LJJI.LJIIIIZZ().LJJJJLI(str);
                if (LJJJJLI != null) {
                    LJJJJLI.LJ = this.LJFF;
                    LJJJJLI.LJFF = this.LJI;
                    C122034qd LJJI2 = C17N.LJJI(editor);
                    if (LJJI2 != null) {
                        LJJI2.LJIIIIZZ().LJIIJ(LJJJJLI);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        LJIIIIZZ();
    }

    public final void LJFF(C41723GZb c41723GZb, OSZ<Float, Float> osz) {
        OSZ<OSZ<Float, Float>, OSZ<Float, Float>> osz2 = this.LJIILIIL;
        if (osz2 != null) {
            OSZ LIZ = C41722GZa.LIZ(osz2, c41723GZb, osz, this.LJIIIZ, this.LIZLLL);
            float floatValue = ((Number) LIZ.getFirst()).floatValue();
            float floatValue2 = ((Number) LIZ.getSecond()).floatValue();
            StickerItemModel stickerItemModel = this.LIZJ;
            stickerItemModel.currentOffsetX = floatValue;
            stickerItemModel.currentOffsetY = floatValue2;
        }
        StickerItemModel stickerItemModel2 = this.LIZJ;
        this.LJFF = stickerItemModel2.currentOffsetX;
        this.LJI = stickerItemModel2.currentOffsetY;
    }

    public C42557Gn3(Context context, boolean z, StickerItemModel stickerItemModel, int i, AqS157S0100000_7 aqS157S0100000_7) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = z;
        this.LIZJ = stickerItemModel;
        this.LIZLLL = i;
        this.LJ = aqS157S0100000_7;
        this.LJFF = stickerItemModel.currentOffsetX;
        this.LJI = stickerItemModel.currentOffsetY;
        this.LJII = 1.0f;
        this.LJIIIIZZ = -1.0f;
        this.LJIIIZ = stickerItemModel.scale;
        this.LJIIJ = -1;
        this.LJIIJJI = stickerItemModel.uuid;
    }
}
