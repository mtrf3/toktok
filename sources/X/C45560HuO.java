package X;

import android.app.Activity;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.HuO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45560HuO implements InterfaceC45547HuB {
    public final View.OnClickListener LJLIL;

    @Override // X.InterfaceC45547HuB
    public int layoutRes() {
        return R.layout.ca5;
    }

    @Override // X.InterfaceC45547HuB
    public void setAlbumActivity(Activity activity) {
        o.LJIIIZ(activity, "activity");
    }

    @Override // X.InterfaceC45547HuB
    public View.OnClickListener getClickListener() {
        return this.LJLIL;
    }

    public final View.OnClickListener getOnClickListener() {
        return this.LJLIL;
    }

    public C45560HuO(View.OnClickListener onClickListener) {
        o.LJIIIZ(onClickListener, "onClickListener");
        this.LJLIL = onClickListener;
    }
}
