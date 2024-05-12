package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CZo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31544CZo extends RecyclerView.ViewHolder {
    public abstract void L(C31540CZk c31540CZk, List<? extends Object> list);

    public AbstractC31544CZo(View view) {
        super(view);
    }

    public static final void M(TextView textView) {
        o.LJIIIZ(textView, "textView");
        textView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, textView.getText().length() * textView.getPaint().getTextSize(), 0.0f, ColorProtector.parseColor("#F2EAFD"), ColorProtector.parseColor("#D4FAFF"), Shader.TileMode.CLAMP));
        textView.invalidate();
    }
}
