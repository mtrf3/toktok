package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tyx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76419Tyx<V extends View, T> implements InterfaceC76501U0r {
    public static final C76419Tyx<V, T> LIZ = new C76419Tyx<>();

    @Override // X.InterfaceC76501U0r
    public final void LIZ(View view, Object obj) {
        C76414Tys view2 = (C76414Tys) view;
        ((Number) obj).longValue();
        o.LJIIIZ(view2, "view");
        view2.LIZ(R.id.fgu).setVisibility(0);
        view2.LIZ(R.id.fgv).setVisibility(8);
        view2.LIZ(R.id.fjd).setVisibility(8);
        view2.LIZ(R.id.me0).setAlpha(1.0f);
        ((TextView) view2.LIZ(R.id.me0)).setText(C15380j0.LJIILJJIL(R.string.spz));
        view2.LIZ(R.id.me1).setAlpha(1.0f);
        view2.LIZ(R.id.fgu).setBackgroundResource(R.drawable.d9q);
        ((ImageView) view2.LIZ(R.id.f8n)).setVisibility(0);
        ImageView imageView = (ImageView) view2.LIZ(R.id.f8k);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        view2.LIZ(R.id.me0).setVisibility(0);
        ((TextView) view2.LIZ(R.id.me0)).setTextColor(C04330Ez.LIZIZ(view2.getContext(), R.color.a16));
        ((C47121t6) view2.LIZ(R.id.me0)).setTextSize(0, C15380j0.LIZ(14.0f));
        ((TextView) view2.LIZ(R.id.me0)).setGravity(17);
    }
}
