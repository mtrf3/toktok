package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Field;

/* loaded from: classes13.dex */
public final class T61 {
    public static T62 LIZ;

    public static RecyclerView.ViewHolder LIZ() {
        if (LIZ == null) {
            LIZ = new T62(new View(EF7.LIZIZ()));
            Field declaredField = RecyclerView.ViewHolder.class.getDeclaredField("itemView");
            declaredField.setAccessible(true);
            Field declaredField2 = Field.class.getDeclaredField("accessFlags");
            declaredField2.setAccessible(true);
            declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            declaredField.set(LIZ, null);
        }
        return LIZ;
    }
}
