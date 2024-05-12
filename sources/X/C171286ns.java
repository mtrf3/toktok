package X;

import Y.ACListenerS21S0101000_2;
import android.animation.ObjectAnimator;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6ns, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C171286ns extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LJLJL = 0;
    public final C81232VuO LJLIL;
    public final C158186Is LJLILLLLZI;
    public ObjectAnimator LJLJI;
    public final ImageView LJLJJI;
    public int LJLJJL;
    public final /* synthetic */ C171256np LJLJJLL;

    public final void L() {
        ObjectAnimator objectAnimator = this.LJLJI;
        if (objectAnimator != null && objectAnimator.isRunning()) {
            this.LJLJI.cancel();
        }
        this.LJLILLLLZI.setRotation(0.0f);
        this.LJLILLLLZI.setImageResource(R.drawable.tf);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C171286ns(C171256np c171256np, View view) {
        super(view);
        this.LJLJJLL = c171256np;
        this.LJLJJL = 1;
        C81232VuO c81232VuO = (C81232VuO) view.findViewById(R.id.ki1);
        this.LJLIL = c81232VuO;
        this.LJLILLLLZI = (C158186Is) view.findViewById(R.id.f2f);
        this.LJLJJI = (ImageView) view.findViewById(R.id.f28);
        c81232VuO.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS21S0101000_2(1, this, 10)));
        c81232VuO.setOnTouchListener(new ViewOnTouchListenerC170476mZ(1.1f, 100L, c81232VuO));
    }
}
