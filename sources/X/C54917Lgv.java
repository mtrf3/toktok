package X;

import Y.ARunnableS45S0100000_9;
import Y.IDCListenerS284S0100000_9;
import Y.IDDListenerS148S0100000_9;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.panel.NearbyFeedFragmentPanel;
import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("nearby_feed_intro_pop")
/* renamed from: X.Lgv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54917Lgv extends AbstractC56327M8t<DialogFragment> {
    public static final String LJLJJI;
    public static final String LJLJJL;
    public final InterfaceC56322M8o LJLIL;
    public final FragmentManager LJLILLLLZI;
    public final NearbyFeedFragmentPanel LJLJI;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 10;
    }

    static {
        String string = EF7.LIZIZ().getString(R.string.im2);
        o.LJIIIIZZ(string, "AppContextManager.getApp…ng.nearbytab_popup_title)");
        LJLJJI = string;
        LJLJJL = C1DD.LIZLLL(R.string.im1, "AppContextManager.getApp…ing.nearbytab_popup_desc)");
    }

    public static void LJIIIIZZ(String str) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("action", str);
        FMX.LJIIL("watch_content_nearby_popup_click", c188727au.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, com.bytedance.tux.sheet.BaseSheet, com.bytedance.tux.sheet.sheet.TuxSheet] */
    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        String text;
        o.LJIIIZ(context, "context");
        String str = "";
        if (C78685UuP.LJJJZ(NearbyTabConfig.LIZIZ().introPopupTitle)) {
            text = NearbyTabConfig.LIZIZ().introPopupTitle;
            if (text == null) {
                text = "";
            }
        } else {
            text = LJLJJI;
        }
        if (C78685UuP.LJJJZ(NearbyTabConfig.LIZIZ().introPopupText)) {
            String str2 = NearbyTabConfig.LIZIZ().introPopupText;
            if (str2 != null) {
                str = str2;
            }
        } else {
            str = LJLJJL;
        }
        String str3 = NearbyTabConfig.LIZIZ().learnMoreUrlIntro;
        C68322mC c68322mC = new C68322mC();
        C26224AQy c26224AQy = new C26224AQy();
        C33381Ss c33381Ss = new C33381Ss();
        c33381Ss.LJLIL = R.drawable.bar;
        c26224AQy.LIZ = c33381Ss.LIZ(context.LIZ);
        c26224AQy.LIZLLL = 2;
        o.LJIIIZ(text, "text");
        c26224AQy.LJ = text;
        c26224AQy.LIZIZ(str);
        if (str3 != null && C78685UuP.LJJJZ(str3)) {
            View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bw9, C16880lQ.LLZIL(context.LIZ), null);
            TextView textView = (TextView) LLLZIIL.findViewById(R.id.gyg);
            C72062SPy c72062SPy = new C72062SPy();
            c72062SPy.LIZJ(R.string.ilz);
            c72062SPy.LIZIZ(42);
            c72062SPy.LIZ = true;
            c72062SPy.LJ(1);
            c72062SPy.LJ = true;
            c72062SPy.LJFF = new C56205M4b(this, context, str3, c68322mC);
            textView.setText(c72062SPy.LIZ(context.LIZ));
            textView.setMovementMethod(AnonymousClass898.LIZ);
            c26224AQy.LJIIJJI = LLLZIIL;
        }
        c26224AQy.LJIILIIL = true;
        String string = context.LIZ.getString(R.string.im0);
        AqS175S0100000_9 aqS175S0100000_9 = new AqS175S0100000_9(this, 611);
        c26224AQy.LJII = string;
        c26224AQy.LJIIIZ = aqS175S0100000_9;
        ?? r2 = c26224AQy.LIZ().LIZ;
        r2.LJLJI = false;
        r2.LLD = false;
        r2.LL = false;
        r2.LJLIL = new IDCListenerS284S0100000_9(this, 1);
        r2.LJLILLLLZI = new IDDListenerS148S0100000_9(this, 6);
        c68322mC.element = r2;
        NearbyFeedFragmentPanel nearbyFeedFragmentPanel = this.LJLJI;
        if (nearbyFeedFragmentPanel != null) {
            nearbyFeedFragmentPanel.postDelayed(new ARunnableS45S0100000_9(this, 228), 200L);
        }
        DialogFragment dialogFragment = (DialogFragment) c68322mC.element;
        if (dialogFragment != null) {
            dialogFragment.show(this.LJLILLLLZI, "Nearby_Intro");
        }
        return c68322mC.element;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54917Lgv(InterfaceC56322M8o pagePopupScene, FragmentManager fragmentManager, NearbyFeedFragmentPanel nearbyFeedFragmentPanel) {
        super(pagePopupScene);
        o.LJIIIZ(pagePopupScene, "pagePopupScene");
        this.LJLIL = pagePopupScene;
        this.LJLILLLLZI = fragmentManager;
        this.LJLJI = nearbyFeedFragmentPanel;
    }
}
