package X;

import Y.ACListenerS44S0200000_9;
import Y.ACallableS36S1100000_9;
import Y.ARunnableS45S0100000_9;
import Y.IDDListenerS148S0100000_9;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveInsertStickerShowIntervalTimeSetting;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("story2_viewer_list_pop_up")
/* renamed from: X.LhP, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54947LhP extends AbstractC56325M8r<DialogFragment> {
    public static boolean LJLJLJ;
    public final Aweme LJLIL;
    public final String LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public String LJLJJL;
    public boolean LJLJJLL;
    public final int LJLJL;

    @Override // X.InterfaceC55641Lsb
    public final /* bridge */ /* synthetic */ C54082LKk getPopupContext() {
        return null;
    }

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return this.LJLJL;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        boolean z;
        String str;
        String str2;
        o.LJIIIZ(context, "context");
        ActivityC45651qj LIZJ = context.LIZJ();
        if (LIZJ == null) {
            return null;
        }
        if ((System.currentTimeMillis() / 1000) - ((RBX) HG3.LJIILL()).getCurUser().getRegisterTime() < LiveInsertStickerShowIntervalTimeSetting.DEFAULT) {
            z = true;
        } else {
            z = false;
        }
        boolean LJJIIZI = C78996UzQ.LJJIIZI(this.LJLIL);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(LIZJ), R.layout.cp6, null, false);
        TuxIconView tuxIconView = (TuxIconView) LLLLIILL.findViewById(R.id.bfj);
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS44S0200000_9(LLLLIILL, this, 0));
        }
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.erf);
        View findViewById = LLLLIILL.findViewById(R.id.h0i);
        View findViewById2 = LLLLIILL.findViewById(R.id.ha2);
        View findViewById3 = LLLLIILL.findViewById(R.id.ha3);
        View findViewById4 = LLLLIILL.findViewById(R.id.ha4);
        if (z) {
            if (textView != null) {
                textView.setText(LIZJ.getString(R.string.rps));
            }
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
            }
            if (findViewById3 != null) {
                findViewById3.setVisibility(8);
            }
            if (findViewById4 != null) {
                findViewById4.setVisibility(8);
            }
        } else {
            LJIIIIZZ(R.id.eqz, LLLLIILL);
            LJIIIIZZ(R.id.er0, LLLLIILL);
            LJIIIIZZ(R.id.er1, LLLLIILL);
            if (textView != null) {
                textView.setText(LIZJ.getString(R.string.rpz));
            }
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            if (findViewById4 != null) {
                findViewById4.setVisibility(0);
            }
        }
        SY4 sy4 = (SY4) LLLLIILL.findViewById(R.id.nx);
        if (sy4 != null) {
            C16880lQ.LJJIZ(sy4, new ACListenerS44S0200000_9(LLLLIILL, this, 1));
        }
        if (z) {
            str = "new";
        } else {
            str = "old";
        }
        if (LJJIIZI) {
            str2 = "own";
        } else {
            str2 = "others";
        }
        this.LJLJJL = C00F.LIZIZ(str, '_', str2);
        TuxSheet tuxSheet = C249109q6.LIZ(0).LIZ;
        tuxSheet.LJLLI = LLLLIILL;
        tuxSheet.LJLILLLLZI = new IDDListenerS148S0100000_9(this, 0);
        C1DG.LJII(LIZJ, "activity.supportFragmentManager", tuxSheet, "StoryViewerListCompliancePopup");
        LJLJLJ = true;
        Keva.getRepo("tt_story_viewer_list_popup").storeBoolean("key_has_show_viewer_list_popup", true);
        LLLLIILL.postDelayed(new ARunnableS45S0100000_9(this, 6), 20L);
        C10K.LIZJ(new ACallableS36S1100000_9(this, "show", 0));
        return tuxSheet;
    }

    public static void LJIIIIZZ(int i, View view) {
        View findViewById = view.findViewById(i);
        if (findViewById == null) {
            return;
        }
        Context context = view.getContext();
        o.LJIIIIZZ(context, "context");
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = C61328O5c.LIZJ(2);
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.go);
        findViewById.setBackground(c110614Vt.LIZ(context));
    }

    public C54947LhP(Aweme aweme, String enterFrom, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = aweme;
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = interfaceC65784Pro2;
        this.LJLJJL = "";
        this.LJLJJLL = true;
        this.LJLJL = 411;
    }
}
