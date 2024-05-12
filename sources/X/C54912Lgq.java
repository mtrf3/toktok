package X;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.popularfeed.settings.WelcomePopup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("popular_feed_desc_pop")
/* renamed from: X.Lgq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54912Lgq extends AbstractC56327M8t<DialogFragment> {
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
        WelcomePopup welcomePopup = C54890LgU.LIZ().welcomePopup;
        String title = welcomePopup.title;
        if (title.length() == 0) {
            title = C86V.LJFF(R.string.p4m);
        }
        String desc = welcomePopup.desc;
        if (desc.length() == 0) {
            desc = C86V.LJFF(R.string.p4l);
        }
        String str = welcomePopup.button;
        if (str.length() == 0) {
            str = C86V.LJFF(R.string.p4k);
        }
        o.LJIIIIZZ(title, "title");
        c26224AQy.LJ = title;
        C33381Ss c33381Ss = new C33381Ss();
        c33381Ss.LJLIL = R.drawable.bel;
        c26224AQy.LIZ = c33381Ss.LIZ(context.LIZ);
        c26224AQy.LIZLLL = 2;
        o.LJIIIIZZ(desc, "desc");
        c26224AQy.LIZIZ(desc);
        C54915Lgt c54915Lgt = C54915Lgt.LJLIL;
        c26224AQy.LJII = str;
        c26224AQy.LJIIIZ = c54915Lgt;
        TuxSheet tuxSheet = c26224AQy.LIZ().LIZ;
        FragmentManager fragmentManager = this.LJLILLLLZI;
        if (fragmentManager != null) {
            tuxSheet.show(fragmentManager, "popular_feed_popup_intro_guide");
        }
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        ((Keva) value).storeBoolean("intro_guide_show", true);
        return tuxSheet;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54912Lgq(InterfaceC56322M8o pagePopupScene, FragmentManager fragmentManager) {
        super(pagePopupScene);
        o.LJIIIZ(pagePopupScene, "pagePopupScene");
        this.LJLIL = pagePopupScene;
        this.LJLILLLLZI = fragmentManager;
        this.LJLJI = C221108m2.LIZIZ(LTW.LJLIL);
    }
}
