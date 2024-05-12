package X;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.4aZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C112074aZ extends C105364Bo<C112124ae> {
    public final ImageView LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    public C112074aZ(View view) {
        super(view);
        Resources resources = view.getResources();
        this.LJLIL = (ImageView) view.findViewById(R.id.f5d);
        this.LJLILLLLZI = resources.getDimensionPixelSize(R.dimen.r1);
        this.LJLJI = resources.getDimensionPixelSize(R.dimen.r2);
    }
}
