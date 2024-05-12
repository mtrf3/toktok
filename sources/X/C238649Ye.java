package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.9Ye, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C238649Ye extends C96X {
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final TuxIconView LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C238649Ye(Context context) {
        super(context);
        new LinkedHashMap();
        this.LJLILLLLZI = R.raw.icon_color_create_light;
        this.LJLJI = R.raw.icon_color_create_dark;
        View.inflate(context, R.layout.bfx, this);
        View findViewById = findViewById(R.id.e6g);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.home_tab_icon_img)");
        TuxIconView tuxIconView = (TuxIconView) findViewById;
        this.LJLJJI = tuxIconView;
        tuxIconView.setIconRes(R.raw.icon_color_create_light);
        tuxIconView.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    public final void LIZ(boolean z) {
        if (z) {
            this.LJLJJI.setIconRes(this.LJLILLLLZI);
        } else {
            this.LJLJJI.setIconRes(this.LJLJI);
        }
    }
}
