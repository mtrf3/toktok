package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ASA extends RelativeLayout {
    public final TextView LJLIL;
    public final TuxIconView LJLILLLLZI;
    public final ImageView LJLJI;

    public final void LIZ(AS9 vo) {
        o.LJIIIZ(vo, "vo");
        TuxIconView tuxIconView = this.LJLILLLLZI;
        if (tuxIconView != null) {
            tuxIconView.setTintColorRes(R.attr.go);
        }
        TuxIconView tuxIconView2 = this.LJLILLLLZI;
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(vo.LJLIL);
        }
        TextView textView = this.LJLIL;
        if (textView == null) {
            return;
        }
        textView.setText(getContext().getResources().getText(vo.LJLILLLLZI));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ASA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new LinkedHashMap();
        View.inflate(getContext(), R.layout.abo, this);
        int LIZJ = (int) KL2.LIZJ(getContext(), 16.0f);
        int LIZJ2 = (int) KL2.LIZJ(getContext(), 14.0f);
        setPadding(LIZJ, LIZJ2, LIZJ, LIZJ2);
        setGravity(16);
        this.LJLIL = (TextView) findViewById(R.id.desc);
        this.LJLJI = (ImageView) findViewById(R.id.exx);
        this.LJLILLLLZI = (TuxIconView) findViewById(R.id.e_q);
    }
}
