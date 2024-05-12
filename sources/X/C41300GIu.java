package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GIu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41300GIu implements InterfaceC62486Ofi {
    public final Aweme LJLIL;
    public final int LJLILLLLZI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_music_note_switch_fill;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        return R.raw.icon_music_note_switch_fill;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        return R.string.jke;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "replace_sound";
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        if (this.LJLILLLLZI == EnumC41101GBd.SHOW.getValue()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.ShareButton;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        String str;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        boolean z = false;
        if (!enable()) {
            if (LJIJJ != null) {
                int i = this.LJLILLLLZI;
                if (i == EnumC41101GBd.GRAYED_OUT_FOR_FREQ_CONTROL.getValue()) {
                    str = context.getString(R.string.jkf);
                } else if (i == EnumC41101GBd.GRAYED_OUT_FOR_TIME_EXPIRATION.getValue()) {
                    str = context.getString(R.string.jkd);
                } else {
                    str = "";
                }
                o.LJIIIIZZ(str, "when (permission) {\n    … else -> \"\"\n            }");
                if (str.length() > 0) {
                    C31811Ce7.LIZIZ(LJIJJ, str);
                    return;
                }
                return;
            }
        } else if (LJIJJ != null) {
            try {
                z = C2NU.LIZ.LIZIZ();
            } catch (Exception unused) {
            }
            if (!z) {
                AnonymousClass114.LIZ(LJIJJ, R.string.iri);
                return;
            }
        }
        C72602t6.LIZ(context, this.LJLIL, "click_more", "l8_import_music_edit");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    public C41300GIu(int i, String enterFrom, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLIL = aweme;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}
