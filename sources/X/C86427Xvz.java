package X;

import Y.ARunnableS34S0200000_15;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xvz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86427Xvz extends AbstractC221838nD {
    public final void LJIIIIZZ(View view) {
        o.LJIIIZ(view, "view");
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            view.post(new ARunnableS34S0200000_15(this, view, 55));
        } else {
            LJIIIZ(view);
        }
    }

    public final void LJIIIZ(View view) {
        List<NormalTrackTimeStamp> LIZIZ;
        NormalTrackTimeStamp normalTrackTimeStamp;
        if (view.getWidth() == 0 || view.getHeight() == 0 || (LIZIZ = C223998qh.LIZIZ(this.LJLJI)) == null || (normalTrackTimeStamp = (NormalTrackTimeStamp) ListProtector.get(LIZIZ, 0)) == null) {
            return;
        }
        RectF LIZ = LIZ(normalTrackTimeStamp);
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        view.setTranslationX(((LIZ.width() - view.getWidth()) / 2.0f) + LIZ.left);
        view.setTranslationY(((LIZ.height() - view.getHeight()) / 2.0f) + LIZ.top);
        view.setScaleX(LIZ.width() / view.getWidth());
        view.setScaleY(LIZ.width() / view.getWidth());
        view.setRotation(normalTrackTimeStamp.getRotation());
        view.setVisibility(0);
        view.invalidate();
    }

    @Override // X.AbstractC221838nD
    public final List<NormalTrackTimeStamp> LIZIZ(long j, InteractStickerStruct stickerStruct) {
        o.LJIIIZ(stickerStruct, "stickerStruct");
        return C223998qh.LIZJ(j, stickerStruct);
    }

    @Override // X.AbstractC221838nD
    public final void LIZJ(float f, float f2, InterfaceC221818nB popListener) {
        String str;
        C223778qL c223778qL;
        o.LJIIIZ(popListener, "popListener");
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            Activity LJIILL = C78949Uyf.LJIILL(this.LJLIL);
            if (LJIILL != null) {
                C78450Uqc c78450Uqc = new C78450Uqc();
                c78450Uqc.LIZ = LJIILL;
                C245649kW c245649kW = this.LJLJJI;
                if (c245649kW != null && (c223778qL = c245649kW.LJIIZILJ) != null) {
                    str = c223778qL.LIZ;
                } else {
                    str = null;
                }
                c78450Uqc.LIZIZ = str;
                c78450Uqc.LIZJ = "click";
                HG3.LJIIIIZZ().showLoginAndRegisterView(new C78451Uqd(c78450Uqc));
                return;
            }
            return;
        }
        AbstractC224038ql abstractC224038ql = this.LJLILLLLZI;
        o.LJII(abstractC224038ql, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.CountDownStickerInteractView");
        ((C86425Xvx) abstractC224038ql).LJJI();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86427Xvz(Context context, C86425Xvx view, InteractStickerStruct interactStickerStruct, C245649kW c245649kW) {
        super(context, view, interactStickerStruct, c245649kW);
        o.LJIIIZ(view, "view");
    }
}
