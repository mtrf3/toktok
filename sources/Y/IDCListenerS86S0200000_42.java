package Y;

import X.AbstractC94471ahX;
import X.ActivityC45651qj;
import X.C011602u;
import X.C26045AKb;
import X.C48203Ivv;
import X.C76800UCe;
import X.C93748aVs;
import X.C94005aa1;
import X.C94508ai8;
import X.C94855anj;
import X.EF7;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.InterfaceC88474Ynu;
import X.InterfaceC93865aXl;
import android.view.View;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyFragment;
import com.bytedance.effectcreatormobile.assetEditor.liquefy.LiquefyViewModel;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.model.DspPlaylist;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.MusicDspSheetAssem;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.ui.cell.MusicDspPlaylistCell;
import com.ss.android.ugc.aweme.music.app.auth.addtodsp.viewmodel.MusicDspSheetViewModel;
import com.ss.android.ugc.aweme.music.model.TT2DSPSongInfo;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS423S0100000_42;
import kotlin.jvm.internal.o;

/* loaded from: classes34.dex */
public class IDCListenerS86S0200000_42 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                return;
            case 1:
                onClick$1(this, view);
                return;
            case 2:
                onClick$2(this, view);
                return;
            case 3:
                onClick$3(this, view);
                return;
            case 4:
                onClick$4(this, view);
                return;
            case 5:
                onClick$5(this, view);
                return;
            case 6:
                onClick$6(this, view);
                return;
            case 7:
                onClick$7(this, view);
                return;
            default:
                return;
        }
    }

    public static final void onClick$0(IDCListenerS86S0200000_42 iDCListenerS86S0200000_42, View view) {
        MusicDspSheetViewModel A3 = ((MusicDspSheetAssem) iDCListenerS86S0200000_42.l0).A3();
        ActivityC45651qj activity = (ActivityC45651qj) iDCListenerS86S0200000_42.l1;
        A3.getClass();
        o.LJIIIZ(activity, "activity");
        if (!C48203Ivv.LJ(EF7.LIZIZ())) {
            C26045AKb c26045AKb = new C26045AKb(activity);
            c26045AKb.LJIIIIZZ(R.string.img);
            c26045AKb.LJIIJ();
            return;
        }
        A3.manualListRefresh();
    }

    public static final void onClick$1(IDCListenerS86S0200000_42 iDCListenerS86S0200000_42, View it) {
        if (((C93748aVs) iDCListenerS86S0200000_42.l0).LIZ(-1L) && !C93748aVs.LJ) {
            InterfaceC88472Yns interfaceC88472Yns = (InterfaceC88472Yns) iDCListenerS86S0200000_42.l1;
            o.LJIIIIZZ(it, "it");
            interfaceC88472Yns.invoke(it);
        }
    }

    public static final void onClick$2(IDCListenerS86S0200000_42 iDCListenerS86S0200000_42, View view) {
        InterfaceC93865aXl interfaceC93865aXl = ((C94855anj) iDCListenerS86S0200000_42.l0).LJLJLJ;
        if (interfaceC93865aXl != null) {
            interfaceC93865aXl.r3((AbstractC94471ahX) iDCListenerS86S0200000_42.l1);
        }
    }

    public static final void onClick$3(IDCListenerS86S0200000_42 iDCListenerS86S0200000_42, View view) {
        InterfaceC93865aXl interfaceC93865aXl = ((C94855anj) iDCListenerS86S0200000_42.l0).LJLJLJ;
        if (interfaceC93865aXl != null) {
            interfaceC93865aXl.r3((AbstractC94471ahX) iDCListenerS86S0200000_42.l1);
        }
    }

    public static final void onClick$4(IDCListenerS86S0200000_42 iDCListenerS86S0200000_42, View view) {
        C94508ai8 c94508ai8;
        InterfaceC88474Ynu<TT2DSPSongInfo, DspPlaylist, InterfaceC65784Pro<C76800UCe>, InterfaceC65784Pro<C76800UCe>, C76800UCe> interfaceC88474Ynu;
        Object value = ((MusicDspPlaylistCell) iDCListenerS86S0200000_42.l0).LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-loadingCircle>(...)");
        if (((View) value).getVisibility() != 0 && (interfaceC88474Ynu = (c94508ai8 = (C94508ai8) iDCListenerS86S0200000_42.l1).LJLJI) != null) {
            interfaceC88474Ynu.invoke(c94508ai8.LJLILLLLZI, c94508ai8.LJLIL, new IDqS423S0100000_42((MusicDspPlaylistCell) iDCListenerS86S0200000_42.l0, 153), new IDqS423S0100000_42((MusicDspPlaylistCell) iDCListenerS86S0200000_42.l0, 154));
        }
    }

    public static final void onClick$5(IDCListenerS86S0200000_42 iDCListenerS86S0200000_42, View view) {
        ((C94005aa1) iDCListenerS86S0200000_42.l0).LIZ((View) iDCListenerS86S0200000_42.l1);
    }

    public static final void onClick$6(IDCListenerS86S0200000_42 iDCListenerS86S0200000_42, View view) {
        String str;
        LiquefyViewModel Gl = ((LiquefyFragment) iDCListenerS86S0200000_42.l1).Gl();
        if (((C011602u) iDCListenerS86S0200000_42.l0).isChecked()) {
            str = "mirror";
        } else {
            str = "unmirror";
        }
        Gl.lv0(str);
    }

    public static final void onClick$7(IDCListenerS86S0200000_42 iDCListenerS86S0200000_42, View view) {
        String str;
        LiquefyViewModel Gl = ((LiquefyFragment) iDCListenerS86S0200000_42.l1).Gl();
        if (((C011602u) iDCListenerS86S0200000_42.l0).isChecked()) {
            str = "follow_face";
        } else {
            str = "unfollow_face";
        }
        Gl.lv0(str);
    }

    public IDCListenerS86S0200000_42(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
