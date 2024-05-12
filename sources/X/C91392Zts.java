package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.dsp.playpage.favpage.FavPlayerFragment;
import kotlin.jvm.internal.IDqS421S0100000_29;
import kotlin.jvm.internal.o;

/* renamed from: X.Zts, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91392Zts implements InterfaceC91177ZqP {
    public final Context LIZ;
    public final C62822Ol8 LIZIZ;

    @Override // X.InterfaceC91177ZqP
    public final Class<? extends Fragment> LIZJ() {
        return FavPlayerFragment.class;
    }

    @Override // X.InterfaceC91177ZqP
    public final String LJ() {
        return "my_playlist";
    }

    @Override // X.InterfaceC91177ZqP
    public final String LIZ() {
        return ((LCP) this.LIZIZ.getValue()).LIZJ;
    }

    @Override // X.InterfaceC91177ZqP
    public final Bundle LIZLLL() {
        return new Bundle();
    }

    @Override // X.InterfaceC91177ZqP
    public final String tag() {
        return ((LCP) this.LIZIZ.getValue()).LIZIZ;
    }

    public C91392Zts(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        this.LIZIZ = C221108m2.LIZIZ(new IDqS421S0100000_29(this, 63));
    }

    @Override // X.InterfaceC91177ZqP
    public final View LIZIZ(InterfaceC91178ZqQ iIconFactory) {
        o.LJIIIZ(iIconFactory, "iIconFactory");
        return iIconFactory.LIZ((LCP) this.LIZIZ.getValue());
    }
}
