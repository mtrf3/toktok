package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.05w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C019605w {
    public final int LIZ;
    public final ArrayList<C019705x> LIZIZ = new ArrayList<>();
    public final int LIZJ;
    public final AnonymousClass064 LIZLLL;

    public C019605w(Context context, XmlPullParser xmlPullParser) {
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
                if ("layout".equals(resourceTypeName)) {
                    AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                    this.LIZLLL = anonymousClass064;
                    anonymousClass064.LJII((ConstraintLayout) C16880lQ.LLLZIIL(resourceId, C16880lQ.LLZIL(context), null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final int LIZ(float f, float f2) {
        for (int i = 0; i < this.LIZIZ.size(); i++) {
            if (((C019705x) ListProtector.get(this.LIZIZ, i)).LIZ(f, f2)) {
                return i;
            }
        }
        return -1;
    }
}
