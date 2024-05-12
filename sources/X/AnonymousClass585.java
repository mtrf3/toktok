package X;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.585, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass585 extends AnonymousClass503 {
    public final ActivityC45651qj LJLIL;
    public final ViewGroup LJLILLLLZI;
    public final ViewGroup LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final Keva LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;

    public final AnonymousClass522 LJIILJJIL() {
        String string;
        if (e1.LIZ(31744, "studio_editor_pro_add_magicut", true, false)) {
            string = this.LJLIL.getString(R.string.e02);
        } else if (e1.LIZ(31744, "studio_editor_pro_add_magic_kit", true, false)) {
            string = this.LJLIL.getString(R.string.dzz);
        } else {
            string = this.LJLIL.getString(R.string.e03);
        }
        o.LJIIIIZZ(string, "if (EnableMagicCutEditor…c_editorPro_menuBar_body)");
        AnonymousClass522 anonymousClass522 = new AnonymousClass522();
        anonymousClass522.LIZ = string;
        anonymousClass522.LIZJ = "bottom_item_root_magic";
        anonymousClass522.LIZIZ = (Drawable) this.LJLJJLL.getValue();
        return anonymousClass522;
    }

    public final void LJIILL() {
        int LIZ;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        V2B.LJIILL(this.LJLILLLLZI, 0, 0, 0, 0);
        ViewGroup.LayoutParams layoutParams = this.LJLILLLLZI.getLayoutParams();
        if (C5CK.LIZIZ()) {
            LIZ = (int) this.LJLIL.getResources().getDimension(R.dimen.pw);
        } else {
            LIZ = C134855Qz.LIZ(64.0f);
        }
        layoutParams.height = LIZ;
        this.LJLILLLLZI.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.LJLJI.getLayoutParams();
        if ((layoutParams2 instanceof C018905p) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            C018905p c018905p = new C018905p(marginLayoutParams.width, marginLayoutParams.height);
            c018905p.bottomToTop = R.id.cjk;
            ((ViewGroup.MarginLayoutParams) c018905p).bottomMargin = 0;
            this.LJLJI.setLayoutParams(c018905p);
        }
    }

    @Override // X.AnonymousClass503, X.InterfaceC132255Gz
    public final void onExitEditPage(boolean z) {
        this.LJLJLJ = false;
    }

    public AnonymousClass585(C29S activity, ViewGroup viewGroup, ViewGroup viewGroup2) {
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
        this.LJLILLLLZI = viewGroup;
        this.LJLJI = viewGroup2;
        this.LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 878));
        this.LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 876));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 877));
        this.LJLJL = Keva.getRepo("magic_guide_repo");
        C5G5.LIZ(this);
    }
}
