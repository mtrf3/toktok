package X;

import Y.ARunnableS22S0200000_3;
import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NatureClassificationStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NatureClassificationStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import kotlin.jvm.internal.AqS63S0400000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8qS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223848qS extends AbstractC224038ql {
    public final C223878qV LJLLI;
    public C6D5 LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C223858qT LJLLL;

    @Override // X.AbstractC224038ql
    public final void LJIJI() {
    }

    @Override // X.AbstractC224038ql
    public final void LJIJJ() {
    }

    @Override // X.Y1E
    public final int getStickerType() {
        return 23;
    }

    @Override // X.AbstractC224038ql
    public final View LJIILLIIL() {
        return new View(this.LJLILLLLZI);
    }

    public final C223838qR LJJ() {
        return (C223838qR) this.LJLLJ.getValue();
    }

    @Override // X.Y1I
    public final void LJJII() {
        this.LJLLI.LIZ(this.LJLLL);
    }

    @Override // X.Y1I
    public final void LJJIIZ() {
        C223878qV c223878qV = this.LJLLI;
        C223858qT targetCallback = this.LJLLL;
        c223878qV.getClass();
        o.LJIIIZ(targetCallback, "targetCallback");
        c223878qV.LIZ.remove(Integer.valueOf(targetCallback.hashCode()));
    }

    @Override // X.AbstractC224038ql, X.Y1I
    public final void onResume() {
        this.LJLLI.LIZ(this.LJLLL);
    }

    @Override // X.Y1I
    public final View LIZ(int i) {
        C6D5 c6d5;
        View natureStickerLayoutView;
        View natureStickerLayoutView2;
        if (this.LJLLILLLL == null) {
            this.LJLLILLLL = new C6D5(this.LJLILLLLZI);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            C6D5 c6d52 = this.LJLLILLLL;
            if (c6d52 != null) {
                c6d52.setLayoutParams(layoutParams);
            }
            C6D5 c6d53 = this.LJLLILLLL;
            if (c6d53 != null && (natureStickerLayoutView2 = c6d53.getNatureStickerLayoutView()) != null) {
                natureStickerLayoutView2.setVisibility(4);
            }
            C6D5 c6d54 = this.LJLLILLLL;
            if (c6d54 != null && (natureStickerLayoutView = c6d54.getNatureStickerLayoutView()) != null) {
                LJJ().LJIIIZ(natureStickerLayoutView);
            }
        }
        if (!LJJI(this.LJLLILLLL, this.LJLJLLL) && (c6d5 = this.LJLLILLLL) != null) {
            c6d5.setVisibility(4);
        }
        return this.LJLLILLLL;
    }

    @Override // X.AbstractC224038ql, X.Y1E
    public final void LIZLLL(InteractStickerStruct interactStickerStruct) {
        this.LJLJLLL = interactStickerStruct;
        LIZ(23);
    }

    @Override // X.AbstractC224038ql, X.Y1P
    public final void LJII(C245649kW interactStickerParams) {
        o.LJIIIZ(interactStickerParams, "interactStickerParams");
        this.LJLJJI = interactStickerParams;
        C223838qR LJJ = LJJ();
        LJJ.getClass();
        LJJ.LJLJJI = interactStickerParams;
        View LIZ = LIZ(23);
        o.LJII(LIZ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.FeedNatureStickerView");
        C6D5 c6d5 = (C6D5) LIZ;
        if (LJJI(c6d5, this.LJLJLLL)) {
            c6d5.post(new ARunnableS22S0200000_3(c6d5, this, 1));
        }
    }

    @Override // X.AbstractC224038ql, X.Y1I
    public final void LJIIIIZZ(int i) {
        super.LJIIIIZZ(i);
        C223878qV c223878qV = this.LJLLI;
        c223878qV.LIZ.clear();
        C16880lQ.LLIIIJ().removeFrameCallback((ChoreographerFrameCallbackC223868qU) c223878qV.LIZIZ.getValue());
    }

    public static boolean LJJI(C6D5 c6d5, InteractStickerStruct interactStickerStruct) {
        String str;
        NatureClassificationStruct natureClassificationStruct;
        if (c6d5 != null && interactStickerStruct != null) {
            NatureClassificationStickerStruct natureClassificationStickerStruct = interactStickerStruct.getNatureClassificationStickerStruct();
            if (natureClassificationStickerStruct != null && (natureClassificationStruct = natureClassificationStickerStruct.getNatureClassificationStruct()) != null) {
                str = natureClassificationStruct.getSpeciesName();
            } else {
                str = null;
            }
            if (!C2060386t.LIZ(str)) {
                c6d5.setSpeciesName(str);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.Y1P
    public final boolean LJIIJJI(long j, float f, float f2, int i) {
        return LJJ().LJIIJJI(j, f, f2, i);
    }

    @Override // X.Y1P
    public final boolean LJIILIIL(long j, int i, float f, float f2, InterfaceC221818nB popListener) {
        o.LJIIIZ(popListener, "popListener");
        return LJJ().LJIILIIL(j, i, f, f2, popListener);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.8qT] */
    public C223848qS(int i, Context context, C224048qm c224048qm, InteractStickerStruct interactStickerStruct, C245649kW c245649kW, C223878qV c223878qV) {
        super(i, context, c224048qm, interactStickerStruct, c245649kW);
        this.LJLLI = c223878qV;
        this.LJLLJ = C221108m2.LIZIZ(new AqS63S0400000_3(context, this, interactStickerStruct, c245649kW, 0));
        this.LJLLL = new InterfaceC223888qW() { // from class: X.8qT
            @Override // X.InterfaceC223888qW
            public final void LIZ(Long l) {
                View natureStickerLayoutView;
                C223848qS c223848qS = C223848qS.this;
                c223848qS.getClass();
                if (l != null) {
                    l.longValue();
                    InteractStickerStruct interactStickerStruct2 = c223848qS.LJLJLLL;
                    if (interactStickerStruct2 != null) {
                        List<NormalTrackTimeStamp> LIZJ = C223998qh.LIZJ(l.longValue(), interactStickerStruct2);
                        if (LIZJ == null || LIZJ.isEmpty()) {
                            C6D5 c6d5 = c223848qS.LJLLILLLL;
                            if (c6d5 == null) {
                                return;
                            }
                            c6d5.setVisibility(8);
                            return;
                        }
                        C6D5 c6d52 = c223848qS.LJLLILLLL;
                        if (c6d52 != null && c6d52.getVisibility() == 0) {
                            return;
                        }
                        if (!C223848qS.LJJI(c223848qS.LJLLILLLL, c223848qS.LJLJLLL)) {
                            C6D5 c6d53 = c223848qS.LJLLILLLL;
                            if (c6d53 == null) {
                                return;
                            }
                            c6d53.setVisibility(4);
                            return;
                        }
                        C6D5 c6d54 = c223848qS.LJLLILLLL;
                        if (c6d54 != null && (natureStickerLayoutView = c6d54.getNatureStickerLayoutView()) != null) {
                            c223848qS.LJJ().LJIIIZ(natureStickerLayoutView);
                        }
                        C6D5 c6d55 = c223848qS.LJLLILLLL;
                        if (c6d55 == null) {
                            return;
                        }
                        c6d55.setVisibility(0);
                    }
                }
            }
        };
    }
}
