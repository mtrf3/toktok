package X;

import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.1j4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40901j4 extends C1TQ {
    public boolean LJLJLJ;
    public final java.util.Map<Integer, View> LJLJLLL;

    @Override // X.C1TQ
    public final View LJFF(int i) {
        java.util.Map<Integer, View> map = this.LJLJLLL;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.C1TQ
    public int getLayoutId$livebroadcast_api_release() {
        return R.layout.cus;
    }

    @Override // X.C1TQ
    public final View LJI() {
        ViewGroup flow_layout = (ViewGroup) LJFF(R.id.dj8);
        o.LJIIIIZZ(flow_layout, "flow_layout");
        return C29306Beo.LJIIIIZZ(R.layout.d6t, flow_layout, false);
    }

    @Override // X.C1TQ
    public final void LJIIIZ() {
        LJFF(R.id.amo).postDelayed(new IDRunnableS85S0100000(this, 44), 100L);
    }

    @Override // X.C1TQ
    public final void LJIIJJI() {
        int i;
        int size = ((C05270Ip) LJFF(R.id.dj8)).getSize();
        final boolean z = false;
        ((TextView) LJFF(R.id.amr)).setText(C15380j0.LJIILL(R.string.mip, Integer.valueOf(size), Long.valueOf(getMaxWordsCount$livebroadcast_api_release())));
        if (size >= getMaxWordsCount$livebroadcast_api_release()) {
            z = true;
        }
        ImageView imageView = (ImageView) LJFF(R.id.amj);
        if (z) {
            i = R.drawable.d1t;
        } else {
            i = R.drawable.d1s;
        }
        imageView.setImageResource(i);
        C16880lQ.LJIILLIIL((ImageView) LJFF(R.id.amj), new View.OnClickListener() { // from class: X.0Ir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (z) {
                    C30868C9o.LIZJ(R.string.mim);
                } else {
                    this.LJIIIZ();
                    C0Y4.LIZ("livesdk_stopword_set");
                }
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40901j4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJLLL = C62850Ola.LJFF(context, "context");
    }
}
