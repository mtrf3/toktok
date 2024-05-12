package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.OYj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62089OYj extends LinearLayout {
    public Context LJLIL;
    public String LJLILLLLZI;
    public UrlModel LJLJI;
    public InterfaceC62093OYn LJLJJI;
    public final java.util.Map<Integer, View> LJLJJL = new LinkedHashMap();

    public final View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJJL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Drawable getDefaultDrawable() {
        C2068389v c2068389v = new C2068389v();
        c2068389v.LIZ = R.raw.icon_color_default_avatar;
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        return c2068389v.LIZ(context);
    }

    public final Context getMContext() {
        return this.LJLIL;
    }

    public C62089OYj(Context context) {
        super(context);
        this.LJLIL = context;
        View.inflate(context, R.layout.cmj, this);
    }

    public final void setMContext(Context context) {
        o.LJIIIZ(context, "<set-?>");
        this.LJLIL = context;
    }
}
