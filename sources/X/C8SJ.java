package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.8SJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8SJ extends FrameLayout implements InterfaceC76931UHf {
    @Override // X.InterfaceC76931UHf
    public final boolean LJIL(int i) {
        return false;
    }

    @Override // X.InterfaceC76931UHf
    public final boolean LJJLIL() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8SJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        FrameLayout.inflate(context, R.layout.d69, this);
        View findViewById = findViewById(R.id.dsn);
        ((TextView) findViewById).setTypeface(C49616Jdc.LIZIZ().LIZLLL("medium"));
        o.LJIIIIZZ(findViewById, "findViewById<LiveTextVie…ontName.MEDIUM)\n        }");
    }
}
