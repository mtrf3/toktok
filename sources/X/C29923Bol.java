package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Bol, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29923Bol extends C47141t8 {
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

    public C29923Bol(Context context) {
        super(context, null, 0);
        FrameLayout.inflate(context, R.layout.dll, this);
        setBackgroundColor(ColorProtector.parseColor("#33000000"));
    }

    public final void setGiftImage(ImageModel imageModel) {
        C15620jO.LIZIZ(imageModel, (C47061t0) LIZ(R.id.duf));
    }

    public final void setGiftPrice(String string) {
        o.LJIIIZ(string, "string");
        ((TextView) LIZ(R.id.dug)).setText(string);
    }

    public final void setTextSize(float f) {
        ((C47121t6) LIZ(R.id.dug)).setTextSize(1, f);
    }
}
