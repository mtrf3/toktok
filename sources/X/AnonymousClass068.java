package X;

import android.content.Context;
import android.content.res.TypedArray;
import com.zhiliaoapp.musically.R;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.068, reason: invalid class name */
/* loaded from: classes.dex */
public class AnonymousClass068 {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final int LJ;

    public AnonymousClass068(Context context, XmlPullParser xmlPullParser) {
        this.LIZ = Float.NaN;
        this.LIZIZ = Float.NaN;
        this.LIZJ = Float.NaN;
        this.LIZLLL = Float.NaN;
        this.LJ = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.a6x, R.attr.b7h, R.attr.b7i, R.attr.b7j, R.attr.b7k});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.LJ);
                this.LJ = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == 1) {
                this.LIZLLL = obtainStyledAttributes.getDimension(index, this.LIZLLL);
            } else if (index == 2) {
                this.LIZIZ = obtainStyledAttributes.getDimension(index, this.LIZIZ);
            } else if (index == 3) {
                this.LIZJ = obtainStyledAttributes.getDimension(index, this.LIZJ);
            } else if (index == 4) {
                this.LIZ = obtainStyledAttributes.getDimension(index, this.LIZ);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean LIZ(float f, float f2) {
        if (!Float.isNaN(this.LIZ) && f < this.LIZ) {
            return false;
        }
        if (!Float.isNaN(this.LIZIZ) && f2 < this.LIZIZ) {
            return false;
        }
        if (!Float.isNaN(this.LIZJ) && f > this.LIZJ) {
            return false;
        }
        if (!Float.isNaN(this.LIZLLL) && f2 > this.LIZLLL) {
            return false;
        }
        return true;
    }
}
