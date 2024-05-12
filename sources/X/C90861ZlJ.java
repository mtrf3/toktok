package X;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.ZlJ, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90861ZlJ extends AbstractC90587Zgt {
    public final TextView LJLJJL;
    public final int LJLJJLL;
    public final /* synthetic */ C90591Zgx LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C90861ZlJ(C90591Zgx c90591Zgx, View view) {
        super(c90591Zgx.LJLL, view, (ImageButton) view.findViewById(R.id.ao), (C90572Zge) view.findViewById(R.id.au));
        this.LJLJL = c90591Zgx;
        this.LJLJJL = (TextView) view.findViewById(R.id.bb);
        Resources resources = c90591Zgx.LJLL.LJLLI.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        TypedValue typedValue = new TypedValue();
        resources.getValue(R.dimen.an, typedValue, true);
        this.LJLJJLL = (int) typedValue.getDimension(displayMetrics);
    }
}
