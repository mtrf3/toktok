package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.TaW, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74904TaW extends AbstractC76214Tve<C74879Ta7> {
    public final C47121t6 LJLIL;

    public C74904TaW(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.las);
        o.LJIIIIZZ(findViewById, "itemView.findViewById(R.id.title_view)");
        this.LJLIL = (C47121t6) findViewById;
    }

    @Override // X.AbstractC76214Tve
    public final void L(int i, Object obj) {
        C74879Ta7 data = (C74879Ta7) obj;
        o.LJIIIZ(data, "data");
        C47121t6 c47121t6 = this.LJLIL;
        Locale locale = Locale.US;
        String LJIILJJIL = C15380j0.LJIILJJIL(R.string.lt0);
        o.LJIIIIZZ(LJIILJJIL, "getString(R.string.pm_guest_applicant_number)");
        String LLLZI = C16880lQ.LLLZI(locale, LJIILJJIL, Arrays.copyOf(new Object[]{Integer.valueOf(data.LJLIL)}, 1));
        o.LJIIIIZZ(LLLZI, "format(locale, format, *args)");
        c47121t6.setText(LLLZI);
    }
}
