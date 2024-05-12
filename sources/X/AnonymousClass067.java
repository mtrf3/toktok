package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.067, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass067 {
    public final int LIZ;
    public final ArrayList<AnonymousClass068> LIZIZ = new ArrayList<>();
    public final int LIZJ;

    public AnonymousClass067(Context context, XmlPullParser xmlPullParser) {
        this.LIZJ = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.id, com.zhiliaoapp.musically.R.attr.a6x});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.LIZ = obtainStyledAttributes.getResourceId(index, this.LIZ);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.LIZJ);
                this.LIZJ = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final int LIZ(float f, float f2) {
        for (int i = 0; i < this.LIZIZ.size(); i++) {
            if (((AnonymousClass068) ListProtector.get(this.LIZIZ, i)).LIZ(f, f2)) {
                return i;
            }
        }
        return -1;
    }
}
