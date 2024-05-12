package X;

import Y.IDCListenerS253S0100000_3;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout;
import com.ss.android.ugc.aweme.tablet.impl.settings.TabletCommentSplitSettings;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Vts, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81200Vts extends AbstractC65781Prl implements InterfaceC88472Yns<View, Boolean> {
    public final /* synthetic */ C81202Vtu LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81200Vts(C81202Vtu c81202Vtu, boolean z, boolean z2) {
        super(1);
        this.LJLIL = c81202Vtu;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(View view) {
        float f;
        DrawerLayout drawerLayout;
        C81201Vtt c81201Vtt;
        int LLJJJJLIIL;
        View it = view;
        o.LJIIIZ(it, "it");
        if (!this.LJLIL.LIZLLL("")) {
            return Boolean.TRUE;
        }
        if (this.LJLIL.LJLJL.isEmpty()) {
            return Boolean.TRUE;
        }
        int width = it.getWidth();
        Iterator<Map.Entry<String, C81203Vtv>> it2 = this.LJLIL.LJLJL.entrySet().iterator();
        while (it2.hasNext()) {
            C81203Vtv value = it2.next().getValue();
            value.getClass();
            if (C54964Lhg.LIZ && !C54966Lhi.LIZJ()) {
                LLJJJJLIIL = (int) (value.LIZ.LLJJJJLIIL() * width);
            } else {
                LLJJJJLIIL = (int) (value.LIZ.LLJJJJLIIL() * width);
                int LJIILL = C17N.LJIILL(((TabletCommentSplitSettings.TabletCommentSplitConfig) TabletCommentSplitSettings.LIZIZ.getValue()).panelMinWidth);
                if (LLJJJJLIIL < LJIILL) {
                    LLJJJJLIIL = LJIILL;
                }
            }
            value.LIZJ = LLJJJJLIIL;
        }
        C81202Vtu c81202Vtu = this.LJLIL;
        FrameLayout frameLayout = c81202Vtu.LJLLILLLL;
        if (frameLayout != null) {
            boolean z = this.LJLILLLLZI;
            boolean z2 = this.LJLJI;
            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            int LJIILLIIL = c81202Vtu.LJIILLIIL();
            if (layoutParams.width != LJIILLIIL) {
                layoutParams.width = LJIILLIIL;
            }
            FrameLayout frameLayout2 = c81202Vtu.LJLLILLLL;
            if (frameLayout2 != null) {
                frameLayout2.setLayoutParams(layoutParams);
            }
            if (z) {
                DrawerLayout drawerLayout2 = c81202Vtu.LJLL;
                if (drawerLayout2 != null) {
                    drawerLayout2.addOnLayoutChangeListener(new IDCListenerS253S0100000_3(new AqS180S0100000_14(c81202Vtu, 197), 5));
                }
            } else {
                DrawerLayout drawerLayout3 = c81202Vtu.LJLL;
                if (drawerLayout3 != null && drawerLayout3.LJIIJJI()) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                c81202Vtu.LJIILL(f);
                if (z2 && (drawerLayout = c81202Vtu.LJLL) != null && (c81201Vtt = c81202Vtu.LLD) != null) {
                    c81201Vtt.onDrawerOpened(drawerLayout);
                }
            }
        }
        return Boolean.TRUE;
    }
}
