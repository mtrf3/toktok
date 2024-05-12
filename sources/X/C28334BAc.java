package X;

import Y.ARunnableS41S0100000_5;
import Y.IDObjectS178S0100000_5;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStartFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BAc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C28334BAc extends TBS implements InterfaceC88472Yns<Long, C76800UCe> {
    public C28334BAc(Object obj) {
        super(1, obj, DrawGuessStartFragment.class, "initView", "initView(J)V", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(Long l) {
        String str;
        long longValue = l.longValue();
        DrawGuessStartFragment drawGuessStartFragment = (DrawGuessStartFragment) this.receiver;
        if (!drawGuessStartFragment.LJLILLLLZI) {
            drawGuessStartFragment.LJLILLLLZI = true;
            int i = (int) (longValue / 60);
            ((TextView) drawGuessStartFragment._$_findCachedViewById(R.id.e0o)).setText(C15380j0.LJIIIIZZ(R.plurals.kr, i, Integer.valueOf(i)));
            DrawGuessWord drawGuessWord = BFI.LJ;
            if (drawGuessWord == null) {
                drawGuessWord = BFI.LIZ();
            }
            if (drawGuessWord != null) {
                drawGuessStartFragment.LJLIL = drawGuessWord;
                ((TextView) drawGuessStartFragment._$_findCachedViewById(R.id.cos)).setText(drawGuessWord.word);
            }
            DataChannel LJIILIIL = C51029K0z.LJIILIIL(drawGuessStartFragment);
            DrawGuessWord drawGuessWord2 = drawGuessStartFragment.LJLIL;
            if (drawGuessWord2 == null || (str = drawGuessWord2.word) == null) {
                str = "";
            }
            String enterFrom = drawGuessStartFragment.LJLJL;
            o.LJIIIZ(enterFrom, "enterFrom");
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_pictionary_customize_panel_show");
            BAI.LIZIZ(LIZ, LJIILIIL);
            BAI.LIZ(LIZ);
            LIZ.LJIJJ(str, "word");
            LIZ.LJIJJ(enterFrom, "enter_from");
            LIZ.LJJIIJZLJL();
            View change_btn = drawGuessStartFragment._$_findCachedViewById(R.id.b91);
            o.LJIIIIZZ(change_btn, "change_btn");
            C29306Beo.LJJJLL(change_btn, 500L, new AqS171S0100000_5(drawGuessStartFragment, 562));
            View start_draw_button = drawGuessStartFragment._$_findCachedViewById(R.id.kcs);
            o.LJIIIIZZ(start_draw_button, "start_draw_button");
            C29306Beo.LJJJLL(start_draw_button, 500L, new AqS171S0100000_5(drawGuessStartFragment, 563));
            C1Q4 LIZLLL = C259910h.LIZLLL(R.attr.atb, drawGuessStartFragment.getContext());
            if (LIZLLL != null) {
                LIZLLL.setBounds(0, 0, C15380j0.LIZ(14.0f), C15380j0.LIZ(14.0f));
                LIZLLL.setTint(C15380j0.LIZIZ(R.color.a5q));
            } else {
                LIZLLL = null;
            }
            ((AppCompatTextView) drawGuessStartFragment._$_findCachedViewById(R.id.a_h)).setCompoundDrawablesRelative(LIZLLL, null, null, null);
            ((TextView) drawGuessStartFragment._$_findCachedViewById(R.id.cos)).addTextChangedListener(new IDObjectS178S0100000_5(drawGuessStartFragment, 7));
            if (drawGuessStartFragment.LJLJJLL) {
                drawGuessStartFragment._$_findCachedViewById(R.id.cos).postDelayed(new ARunnableS41S0100000_5(drawGuessStartFragment, 217), 200L);
            }
            View edit_clickable_area = drawGuessStartFragment._$_findCachedViewById(R.id.coc);
            o.LJIIIIZZ(edit_clickable_area, "edit_clickable_area");
            C29306Beo.LJJJLL(edit_clickable_area, 500L, new AqS171S0100000_5(drawGuessStartFragment, 564));
            Boolean LIZJ = InterfaceC30442Bx8.LJJJJLI.LIZJ();
            o.LJIIIIZZ(LIZJ, "SHOW_DRAW_GUESS_EDIT_ANIM.value");
            if (LIZJ.booleanValue()) {
                drawGuessStartFragment._$_findCachedViewById(R.id.a56).postDelayed(new ARunnableS41S0100000_5(drawGuessStartFragment, 218), 200L);
            }
        }
        return C76800UCe.LIZ;
    }
}
