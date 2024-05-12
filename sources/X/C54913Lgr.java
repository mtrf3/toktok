package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.stemfeed.settings.WelcomePopup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("stem_feed_desc_pop")
/* renamed from: X.Lgr, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54913Lgr extends AbstractC56327M8t<DialogFragment> {
    public final InterfaceC56322M8o LJLIL;
    public final FragmentManager LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 10;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C54082LKk context) {
        o.LJIIIZ(context, "context");
        C26224AQy c26224AQy = new C26224AQy();
        WelcomePopup welcomePopup = C54896Lga.LIZ().welcomePopup;
        String title = welcomePopup.title;
        if (title.length() == 0) {
            title = C86V.LJFF(R.string.rm9);
        }
        String desc = welcomePopup.desc;
        if (desc.length() == 0) {
            desc = C86V.LJFF(R.string.rm7);
        }
        String str = welcomePopup.button;
        if (str.length() == 0) {
            str = C86V.LJFF(R.string.rm8);
        }
        o.LJIIIIZZ(title, "title");
        c26224AQy.LJ = title;
        C33381Ss c33381Ss = new C33381Ss();
        c33381Ss.LJLIL = R.drawable.bec;
        c26224AQy.LIZ = c33381Ss.LIZ(context.LIZ);
        c26224AQy.LIZLLL = 2;
        o.LJIIIIZZ(desc, "desc");
        c26224AQy.LIZIZ(desc);
        C54916Lgu c54916Lgu = C54916Lgu.LJLIL;
        c26224AQy.LJII = str;
        c26224AQy.LJIIIZ = c54916Lgu;
        ASL LIZ = c26224AQy.LIZ();
        DialogInterfaceOnDismissListenerC54914Lgs dialogInterfaceOnDismissListenerC54914Lgs = DialogInterfaceOnDismissListenerC54914Lgs.LJLIL;
        TuxSheet tuxSheet = LIZ.LIZ;
        tuxSheet.LJLILLLLZI = dialogInterfaceOnDismissListenerC54914Lgs;
        FragmentManager fragmentManager = this.LJLILLLLZI;
        if (fragmentManager != null) {
            tuxSheet.show(fragmentManager, "stem_feed_popup_intro_guide");
        }
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        ((Keva) value).storeBoolean("intro_guide_show", true);
        FMX.onEventV3("show_first_stem_feed_prompt");
        return tuxSheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54913Lgr(InterfaceC56322M8o pagePopupScene, FragmentManager fragmentManager) {
        super(pagePopupScene);
        o.LJIIIZ(pagePopupScene, "pagePopupScene");
        this.LJLIL = pagePopupScene;
        this.LJLILLLLZI = fragmentManager;
        this.LJLJI = C221108m2.LIZIZ(C54306LTa.LJLIL);
    }
}
