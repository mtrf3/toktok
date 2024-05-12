package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.Bhe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC29482Bhe<T> {
    public static final int LJLJJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(8));
    public final C29484Bhg LJLIL;
    public final DataChannel LJLILLLLZI;
    public final int LJLJI = LJLJJI;

    public int LIZJ() {
        return 0;
    }

    public abstract View LIZLLL(Context context);

    public boolean LJ() {
        return false;
    }

    public abstract boolean LJFF();

    public abstract void LJII(User user, boolean z, boolean z2, T t);

    public Object LJIIIZ(InterfaceC67352kd<? super T> interfaceC67352kd) {
        return null;
    }

    public int LJI() {
        return this.LJLJI;
    }

    public AbstractC29482Bhe(C29484Bhg c29484Bhg) {
        this.LJLIL = c29484Bhg;
        this.LJLILLLLZI = c29484Bhg.LJIIIIZZ;
    }

    public C29463BhL LJIIIIZZ(User user) {
        return new C29463BhL(false, null);
    }
}
