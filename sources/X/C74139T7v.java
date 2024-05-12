package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.T7v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74139T7v extends T8F {
    public final Context LJLILLLLZI;

    @Override // X.T8F
    public final void L(C74125T7h c74125T7h) {
        int i;
        C74124T7g c74124T7g = (C74124T7g) c74125T7h;
        ImageView imageView = (ImageView) this.LJLIL.findViewById(R.id.ihg);
        if (imageView != null) {
            if (c74124T7g.LJFF) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
        TextView textView = (TextView) this.LJLIL.findViewById(R.id.ihh);
        if (textView != null) {
            String str = c74124T7g.LJ;
            if (C78685UuP.LJJJZ(str)) {
                textView.setText(this.LJLILLLLZI.getString(c74124T7g.LIZLLL, str));
            } else {
                textView.setText(this.LJLILLLLZI.getString(c74124T7g.LIZLLL));
            }
        }
    }

    public C74139T7v(Context context, View view) {
        super(view);
        this.LJLILLLLZI = context;
    }
}
