package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.2w0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74402w0 extends FrameLayout {
    public View LJLIL;
    public C62846OlW LJLILLLLZI;
    public TuxTextView LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74402w0(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.bv7, C16880lQ.LLZIL(context), this);
        this.LJLIL = LLLZIIL.findViewById(R.id.g4k);
        this.LJLILLLLZI = (C62846OlW) LLLZIIL.findViewById(R.id.f51);
        this.LJLJI = (TuxTextView) LLLZIIL.findViewById(R.id.m4n);
    }

    public final void setActionListener(View.OnClickListener listener) {
        o.LJIIIZ(listener, "listener");
        setOnClickListener(new ViewOnClickListenerC13880ga(listener));
    }
}
