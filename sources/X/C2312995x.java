package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.95x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2312995x extends RelativeLayout {
    public final TuxTextView LJLIL;
    public final TuxIconView LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2312995x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        View.inflate(getContext(), R.layout.abp, this);
        int LIZJ = (int) KL2.LIZJ(getContext(), 16.0f);
        int LIZJ2 = (int) KL2.LIZJ(getContext(), 14.0f);
        setPadding(LIZJ, LIZJ2, LIZJ, LIZJ2);
        setGravity(16);
        this.LJLIL = (TuxTextView) findViewById(R.id.desc);
        findViewById(R.id.exx);
        this.LJLILLLLZI = (TuxIconView) findViewById(R.id.e_q);
    }
}
