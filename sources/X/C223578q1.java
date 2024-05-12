package X;

import Y.ARunnableS22S0200000_3;
import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8q1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223578q1 extends AbstractC221838nD {
    public final void LJIIIIZZ(View view) {
        o.LJIIIZ(view, "view");
        if (view.getWidth() == 0 || view.getHeight() == 0) {
            view.post(new ARunnableS22S0200000_3(this, view, 69));
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
        o.LJIIIZ(popListener, "popListener");
        AbstractC224038ql abstractC224038ql = this.LJLILLLLZI;
        o.LJII(abstractC224038ql, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.PollInteractStickerView");
        C86428Xw0 c86428Xw0 = (C86428Xw0) abstractC224038ql;
        Activity LJIJJ = C45804HyK.LJIJJ(c86428Xw0.LJLILLLLZI);
        o.LJI(LJIJJ);
        C6DJ c6dj = new C6DJ(LJIJJ);
        c6dj.LIZ.LJII = -1001L;
        c6dj.LJIIJJI(new AqS169S0100000_3(c86428Xw0, 983));
        c6dj.LJ(C223588q2.LJLIL);
        int[] iArr = new int[2];
        c86428Xw0.LJLJI.getLocationOnScreen(iArr);
        c6dj.LJIIIIZZ(AnonymousClass636.LJIIIIZZ(R.attr.gy, c86428Xw0.LJLILLLLZI));
        c6dj.LJI(WHL.TOP);
        c6dj.LIZ(((int) f) + iArr[0], ((int) f2) + iArr[1]);
        InterfaceC82683Wch LIZJ = c6dj.LIZJ();
        c86428Xw0.LJLJL = LIZJ;
        LIZJ.show();
        popListener.LIZ(true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C223578q1(Context context, C86428Xw0 view, InteractStickerStruct interactStickerStruct, C245649kW c245649kW) {
        super(context, view, interactStickerStruct, c245649kW);
        o.LJIIIZ(view, "view");
    }

    @Override // X.AbstractC221838nD, X.Y1P
    public final boolean LJIIJJI(long j, float f, float f2, int i) {
        User user;
        C245649kW c245649kW = this.LJLJJI;
        if (c245649kW != null) {
            user = c245649kW.LIZJ;
        } else {
            user = null;
        }
        if (!AV1.LJIJ(user)) {
            return false;
        }
        return super.LJIIJJI(j, f, f2, i);
    }
}
