package X;

import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.GhR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42209GhR extends AbstractC65781Prl implements InterfaceC88471Ynr<TextView, TextView, C76800UCe> {
    public static final C42209GhR LJLIL = new C42209GhR();

    public C42209GhR() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(TextView textView, TextView textView2) {
        TextView title = textView;
        TextView desc = textView2;
        o.LJIIIZ(title, "title");
        o.LJIIIZ(desc, "desc");
        title.setText(R.string.ht9);
        desc.setText(R.string.tc7);
        return C76800UCe.LIZ;
    }
}
