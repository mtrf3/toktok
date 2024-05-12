package X;

import Y.AfS44S0300000_5;
import Y.AfS57S0100000_5;
import Y.AfS9S0310000_5;
import android.os.CountDownTimer;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessApi;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessCanvasWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BA9 extends CountDownTimer {
    public final /* synthetic */ DrawGuessCanvasWidget LIZ;

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Boolean, O] */
    @Override // android.os.CountDownTimer
    public final void onFinish() {
        boolean z;
        long j;
        boolean z2;
        long j2;
        boolean z3;
        Long l;
        DrawGuessCanvasWidget drawGuessCanvasWidget = this.LIZ;
        if (!drawGuessCanvasWidget.LJLJL) {
            return;
        }
        if (drawGuessCanvasWidget.LJLJLLL != null && !drawGuessCanvasWidget.LJLL) {
            drawGuessCanvasWidget.LJLL = true;
            Boolean bool = (Boolean) drawGuessCanvasWidget.dataChannel.kv0(C28399BCp.class);
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = false;
            }
            DataChannel dataChannel = drawGuessCanvasWidget.dataChannel;
            ?? r5 = Boolean.FALSE;
            ((C32537Cpp) dataChannel.gv0(BCZ.class)).LIZ = r5;
            Long LJJ = BAF.LJJ(drawGuessCanvasWidget.dataChannel);
            if (LJJ != null) {
                j = LJJ.longValue();
            } else {
                j = 0;
            }
            if (j > 0) {
                Fragment fragment = drawGuessCanvasWidget.widgetCallback.getFragment();
                o.LJIIIIZZ(fragment, "widgetCallback.fragment");
                DataChannel dataChannel2 = drawGuessCanvasWidget.dataChannel;
                DrawGuessWord drawGuessWord = drawGuessCanvasWidget.LJLJLLL;
                o.LJI(drawGuessWord);
                AqS171S0100000_5 aqS171S0100000_5 = new AqS171S0100000_5(drawGuessCanvasWidget, 559);
                if (dataChannel2 != null && (l = (Long) dataChannel2.kv0(DrawGuessSessionIdChannel.class)) != null) {
                    j2 = l.longValue();
                } else {
                    j2 = 0;
                }
                DrawGuessApi drawGuessApi = (DrawGuessApi) C1A.LIZJ(DrawGuessApi.class);
                long LJJIZ = C29306Beo.LJJIZ(dataChannel2);
                long j3 = drawGuessWord.id;
                String str = drawGuessWord.word;
                if (j3 == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                C1EW.LIZ(drawGuessApi.startDrawGuess(LJJIZ, j2, j3, str, C29306Beo.LJJIFFI(Boolean.valueOf(z3)) ? 1 : 0)).LJII(BTJ.LIZIZ(fragment)).LJJJLIIL(new AfS44S0300000_5(drawGuessWord, aqS171S0100000_5, dataChannel2, 5), new AfS57S0100000_5(aqS171S0100000_5, 205));
            } else {
                Fragment fragment2 = drawGuessCanvasWidget.widgetCallback.getFragment();
                o.LJIIIIZZ(fragment2, "widgetCallback.fragment");
                DataChannel dataChannel3 = drawGuessCanvasWidget.dataChannel;
                DrawGuessWord drawGuessWord2 = drawGuessCanvasWidget.LJLJLLL;
                o.LJI(drawGuessWord2);
                AqS171S0100000_5 aqS171S0100000_52 = new AqS171S0100000_5(drawGuessCanvasWidget, 560);
                DrawGuessApi drawGuessApi2 = (DrawGuessApi) C1A.LIZJ(DrawGuessApi.class);
                long LJJIZ2 = C29306Beo.LJJIZ(dataChannel3);
                long j4 = drawGuessWord2.id;
                String str2 = drawGuessWord2.word;
                if (j4 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C1EW.LIZ(drawGuessApi2.startDrawGuess(LJJIZ2, 0L, j4, str2, C29306Beo.LJJIFFI(Boolean.valueOf(z2)) ? 1 : 0)).LJII(BTJ.LIZIZ(fragment2)).LJJJLIIL(new AfS9S0310000_5(aqS171S0100000_52, dataChannel3, z, drawGuessWord2, 0), new AfS57S0100000_5(aqS171S0100000_52, 206));
                if (dataChannel3 != null) {
                    ((C32537Cpp) dataChannel3.gv0(C28399BCp.class)).LIZ = r5;
                }
            }
        }
        View[] viewArr = new View[2];
        C47121t6 c47121t6 = drawGuessCanvasWidget.LJLILLLLZI;
        if (c47121t6 != null) {
            viewArr[0] = c47121t6;
            C47121t6 c47121t62 = drawGuessCanvasWidget.LJLIL;
            if (c47121t62 != null) {
                viewArr[1] = c47121t62;
                DrawGuessCanvasWidget.LJZ(0L, viewArr);
                BA9 ba9 = drawGuessCanvasWidget.LJLJJL;
                if (ba9 != null) {
                    ba9.cancel();
                }
                drawGuessCanvasWidget.LJLJL = false;
                if (!C29306Beo.LJIIL(drawGuessCanvasWidget.dataChannel)) {
                    return;
                }
                drawGuessCanvasWidget.dataChannel.rv0(DrawGuessIsCountingDownRoundStart.class, Boolean.FALSE);
                return;
            }
            o.LJIJI("drawWordTextView");
            throw null;
        }
        o.LJIJI("countdownTextView");
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BA9(DrawGuessCanvasWidget drawGuessCanvasWidget) {
        super(3500L, 1000L);
        this.LIZ = drawGuessCanvasWidget;
    }

    @Override // android.os.CountDownTimer
    public final void onTick(long j) {
        DrawGuessCanvasWidget drawGuessCanvasWidget = this.LIZ;
        drawGuessCanvasWidget.LJLJL = true;
        long j2 = j / 1000;
        if (j2 <= 0) {
            BA9 ba9 = drawGuessCanvasWidget.LJLJJL;
            if (ba9 != null) {
                ba9.onFinish();
                return;
            }
            return;
        }
        C47121t6 c47121t6 = drawGuessCanvasWidget.LJLILLLLZI;
        if (c47121t6 != null) {
            c47121t6.setText(String.valueOf(j2));
        } else {
            o.LJIJI("countdownTextView");
            throw null;
        }
    }
}
