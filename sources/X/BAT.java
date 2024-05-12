package X;

import android.view.View;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BAT implements Runnable {
    public final /* synthetic */ Long LJLIL;
    public final /* synthetic */ DrawGuessStatusWidget LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    public BAT(Long l, DrawGuessStatusWidget drawGuessStatusWidget, boolean z) {
        this.LJLIL = l;
        this.LJLILLLLZI = drawGuessStatusWidget;
        this.LJLJI = z;
    }

    public final void LIZ() {
        if (o.LJ(this.LJLIL, BAF.LJIJJ(this.LJLILLLLZI.dataChannel))) {
            DrawGuessStatusWidget drawGuessStatusWidget = this.LJLILLLLZI;
            if (drawGuessStatusWidget.LJLL) {
                C47121t6 c47121t6 = drawGuessStatusWidget.LJLJJL;
                if (c47121t6 != null) {
                    c47121t6.setText(drawGuessStatusWidget.LLFF(R.string.ktb));
                    DrawGuessStatusWidget drawGuessStatusWidget2 = this.LJLILLLLZI;
                    C47121t6 c47121t62 = drawGuessStatusWidget2.LJLJJL;
                    if (c47121t62 != null) {
                        drawGuessStatusWidget2.LJZI(c47121t62);
                        View view = this.LJLILLLLZI.LJLILLLLZI;
                        if (view != null) {
                            C29306Beo.LJJLJLI(view);
                            C47121t6 c47121t63 = this.LJLILLLLZI.LJLJJI;
                            if (c47121t63 != null) {
                                C29306Beo.LJI(c47121t63);
                                DrawGuessStatusWidget drawGuessStatusWidget3 = this.LJLILLLLZI;
                                View view2 = drawGuessStatusWidget3.LJLIL;
                                if (view2 != null) {
                                    C47121t6 c47121t64 = drawGuessStatusWidget3.LJLJJLL;
                                    if (c47121t64 != null) {
                                        drawGuessStatusWidget3.LJZL(view2, c47121t64, this.LJLJI);
                                        return;
                                    } else {
                                        o.LJIJI("gameResultTextView");
                                        throw null;
                                    }
                                }
                                o.LJIJI("duringGameStatusContainer");
                                throw null;
                            }
                            o.LJIJI("messageContentTextView");
                            throw null;
                        }
                        o.LJIJI("hasCorrectGuessesContainer");
                        throw null;
                    }
                    o.LJIJI("hasCorrectGuessesTextView");
                    throw null;
                }
                o.LJIJI("hasCorrectGuessesTextView");
                throw null;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
