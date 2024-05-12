package X;

import Y.ARunnableS49S0100000_13;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.effect.api.FaceDetectEvent;
import com.bytedance.android.livesdk.dataChannel.BeforeStickerSelectedEvent;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.dataChannel.PauseLiveChannel;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.AqS179S0100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Uo2, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78290Uo2 {
    public final DataChannel LIZ;
    public final LiveWidget LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public C15600jM LJ;
    public final C5H3 LJFF;
    public final C5H3 LJI;
    public final C5H3 LJII;
    public final C5H3 LJIIIIZZ;
    public final C5H3 LJIIIZ;
    public final C5H3 LJIIJ;
    public final C5H3 LJIIJJI;
    public final ARunnableS49S0100000_13 LJIIL;

    public final View LIZ() {
        Object value = this.LJIIIIZZ.getValue();
        o.LJIIIIZZ(value, "<get-faceDetectView>(...)");
        return (View) value;
    }

    public final C47061t0 LIZIZ() {
        Object value = this.LJI.getValue();
        o.LJIIIIZZ(value, "<get-stickerGuideImage>(...)");
        return (C47061t0) value;
    }

    public final TextView LIZJ() {
        Object value = this.LJFF.getValue();
        o.LJIIIIZZ(value, "<get-stickerGuideText>(...)");
        return (TextView) value;
    }

    public final void LJ() {
        Object value = this.LJII.getValue();
        o.LJIIIIZZ(value, "<get-stickerGuideContainer>(...)");
        C29306Beo.LJI((View) value);
        C29306Beo.LJI(LIZJ());
        C29306Beo.LJI(LIZIZ());
        Object value2 = this.LJIIJ.getValue();
        o.LJIIIIZZ(value2, "<get-topOverlay>(...)");
        C29306Beo.LJI((View) value2);
        Object value3 = this.LJIIJJI.getValue();
        o.LJIIIIZZ(value3, "<get-bottomOverlay>(...)");
        C29306Beo.LJI((View) value3);
        LIZJ().setText("");
        LIZIZ().setImageDrawable(null);
        C15600jM c15600jM = this.LJ;
        if (c15600jM != null) {
            c15600jM.LIZ();
        }
        this.LJ = null;
        this.LIZLLL = false;
        if (this.LIZJ) {
            C29306Beo.LJJLJLI(LIZ());
        }
    }

    public final void LIZLLL() {
        int LIZ;
        if (C29306Beo.LJIILJJIL()) {
            LIZ = C15380j0.LIZ(167.0f) - C15380j0.LJIILIIL();
        } else {
            LIZ = C15380j0.LIZ(167.0f);
        }
        Object value = this.LJIIJ.getValue();
        o.LJIIIIZZ(value, "<get-topOverlay>(...)");
        C29306Beo.LJJJJLI(LIZ, (View) value);
        DataChannel dataChannel = this.LIZ;
        dataChannel.lv0(this.LIZIZ, BeforeStickerSelectedEvent.class, new AqS179S0100000_13(this, 0));
        dataChannel.lv0(this.LIZIZ, StickerCancelChannel.class, new AqS179S0100000_13(this, 1));
        dataChannel.lv0(this.LIZIZ, FaceDetectEvent.class, new AqS179S0100000_13(this, 2));
        dataChannel.lv0(this.LIZIZ, PauseLiveChannel.class, new AqS179S0100000_13(this, 3));
        dataChannel.lv0(this.LIZIZ, LiveDialogStatusChannel.class, new AqS171S0100000_5(this, 0));
    }

    public C78290Uo2(View view, DataChannel dataChannel, LiveWidget liveWidget) {
        o.LJIIIZ(liveWidget, "liveWidget");
        this.LIZ = dataChannel;
        this.LIZIZ = liveWidget;
        this.LJFF = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 5));
        this.LJI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 4));
        this.LJII = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 3));
        this.LJIIIIZZ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 1));
        this.LJIIIZ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 2));
        this.LJIIJ = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 6));
        this.LJIIJJI = C78996UzQ.LJJIJIIJI(new AqS163S0100000_13(view, 0));
        this.LJIIL = new ARunnableS49S0100000_13(this, 0);
    }
}
