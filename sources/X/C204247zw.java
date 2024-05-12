package X;

import android.text.TextPaint;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.feed.platform.cell.interact.InteractAreaCommonAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7zw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C204247zw extends AbstractC65781Prl implements InterfaceC88473Ynt<VideoShareAssem, AnonymousClass801, C204277zz, C76800UCe> {
    public static final C204247zw LJLIL = new C204247zw();

    public C204247zw() {
        super(3);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(VideoShareAssem videoShareAssem, AnonymousClass801 anonymousClass801, C204277zz c204277zz) {
        int i;
        float LJIIZILJ;
        int LIZIZ;
        float LJIIZILJ2;
        InteractAreaCommonAbility interactAreaCommonAbility;
        VideoShareAssem selectSubscribe = videoShareAssem;
        AnonymousClass801 anonymousClass8012 = anonymousClass801;
        C204277zz c204277zz2 = c204277zz;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        int i2 = 8;
        if (anonymousClass8012 != null) {
            View findViewById = selectSubscribe.Y3().findViewById(R.id.jt3);
            if (anonymousClass8012.LIZ) {
                i = 0;
            } else {
                i = 8;
            }
            findViewById.setVisibility(i);
            Float f = anonymousClass8012.LIZIZ;
            if (f != null) {
                findViewById.setAlpha(f.floatValue());
            }
            findViewById.setEnabled(anonymousClass8012.LIZJ);
        }
        if (c204277zz2 != null) {
            TuxTextView tuxTextView = (TuxTextView) selectSubscribe.Y3().findViewById(R.id.jt6);
            if (c204277zz2.LIZ) {
                i2 = 0;
            }
            tuxTextView.setVisibility(i2);
            Float f2 = c204277zz2.LIZIZ;
            if (f2 != null && f2.floatValue() > 0.0f) {
                tuxTextView.setTextSize(1, f2.floatValue());
            }
            String str = c204277zz2.LIZJ;
            if (str != null && str.length() > 0) {
                if (!C202677xP.LIZ() && !C204257zx.LJFF()) {
                    C204257zx.LJI("adjustLongTextSize");
                    boolean LIZJ = C8D3.LIZJ();
                    boolean matches = new OJD(".*\\d+.*").matches(str);
                    C26338AVi.LJIIIZ(tuxTextView, C1FJ.LIZIZ(0), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(0))), null, 26);
                    if (!matches) {
                        TextPaint paint = tuxTextView.getPaint();
                        if (paint != null) {
                            LJIIZILJ = paint.measureText(str);
                        } else {
                            LJIIZILJ = C32151Nz.LJIIZILJ(38);
                        }
                        if (LIZJ) {
                            LIZIZ = C7MY.LIZIZ(58);
                        } else {
                            LIZIZ = C7MY.LIZIZ(62);
                        }
                        float LIZIZ2 = ((LIZIZ / 2.0f) - C7MY.LIZIZ(6)) * 2;
                        if (LIZIZ2 <= LJIIZILJ) {
                            if (LIZJ) {
                                tuxTextView.setTuxFont(92);
                            } else {
                                tuxTextView.setTuxFont(72);
                            }
                            TextPaint paint2 = tuxTextView.getPaint();
                            if (paint2 != null) {
                                LJIIZILJ2 = paint2.measureText(str);
                            } else {
                                LJIIZILJ2 = C32151Nz.LJIIZILJ(38);
                            }
                            if (LIZIZ2 <= LJIIZILJ2 && C202677xP.LIZIZ()) {
                                C26338AVi.LJIIIZ(tuxTextView, C1FJ.LIZIZ(0), null, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(6))), null, 26);
                            }
                        } else if (LIZJ) {
                            tuxTextView.setTuxFont(82);
                        } else if (!C204257zx.LJFF()) {
                            tuxTextView.setTuxFont(72);
                        } else {
                            tuxTextView.setTuxFont(62);
                        }
                    }
                }
                tuxTextView.setText(str);
            }
            View findViewById2 = selectSubscribe.Y3().findViewById(R.id.c_x);
            String LJFF = C86V.LJFF(R.string.acf);
            o.LJIIIIZZ(LJFF, "getString(R.string.acces…yLabels_forYou_btn_share)");
            findViewById2.setContentDescription(C208078Ep.LIZ(LJFF, C51029K0z.LJJIIZI(new OSZ("number", ((AppCompatTextView) selectSubscribe.Y3().findViewById(R.id.jt6)).getText().toString()))));
        }
        if (anonymousClass8012 != null && anonymousClass8012.LIZ && c204277zz2 != null && c204277zz2.LIZ && (interactAreaCommonAbility = (InteractAreaCommonAbility) selectSubscribe.LLI.getValue()) != null) {
            interactAreaCommonAbility.U00(selectSubscribe, null, null);
        }
        return C76800UCe.LIZ;
    }
}
