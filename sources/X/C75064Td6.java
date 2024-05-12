package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Td6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75064Td6 extends AbstractC76218Tvi<C74900TaS> {
    public final C47121t6 LJLIL;

    public C75064Td6(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.m9d);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.tv_invite_list_title)");
        this.LJLIL = (C47121t6) findViewById;
    }

    @Override // X.AbstractC76218Tvi
    public final void L(int i, Object obj) {
        C74900TaS data = (C74900TaS) obj;
        o.LJIIIZ(data, "data");
        this.LJLIL.setText(data.LJLIL);
    }
}
