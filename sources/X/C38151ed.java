package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.1ed, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38151ed extends C13R {
    public String LJ;
    public String LJI;
    public String LJII;
    public View LJIIJ;
    public Method LJIILLIIL;
    public Method LJIIZILJ;
    public Method LJIJ;
    public float LJIJI;
    public boolean LJIJJ;
    public int LJFF = -1;
    public int LJIIIIZZ = -1;
    public int LJIIIZ = -1;
    public float LJIIJJI = 0.1f;
    public boolean LJIIL = true;
    public boolean LJIILIIL = true;
    public boolean LJIILJJIL = true;
    public float LJIILL = Float.NaN;
    public final RectF LJIJJLI = new RectF();
    public final RectF LJIL = new RectF();

    @Override // X.C13R
    public final void LIZ(HashMap<String, AbstractC267613g> hashMap) {
    }

    @Override // X.C13R
    public final void LIZIZ(HashSet<String> hashSet) {
    }

    public C38151ed() {
        this.LIZLLL = new HashMap<>();
    }

    @Override // X.C13R
    public final void LIZJ(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aeu, R.attr.b1f, R.attr.b1g, R.attr.b1h, R.attr.b37, R.attr.b39, R.attr.b3_, R.attr.bl8, R.attr.bl9, R.attr.bl_});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (C267113b.LIZ.get(index)) {
                case 1:
                    this.LJI = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                    break;
                case 2:
                    this.LJII = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                    break;
                case 4:
                    this.LJ = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                    break;
                case 5:
                    this.LJIIJJI = obtainStyledAttributes.getFloat(index, this.LJIIJJI);
                    break;
                case 6:
                    this.LJIIIIZZ = obtainStyledAttributes.getResourceId(index, this.LJIIIIZZ);
                    break;
                case 7:
                    if (C45601qe.LLJILLL) {
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.LIZIZ);
                        this.LIZIZ = resourceId;
                        if (resourceId == -1) {
                            this.LIZJ = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                            break;
                        } else {
                            break;
                        }
                    } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                        this.LIZJ = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                        break;
                    } else {
                        this.LIZIZ = obtainStyledAttributes.getResourceId(index, this.LIZIZ);
                        break;
                    }
                case 8:
                    int integer = obtainStyledAttributes.getInteger(index, this.LIZ);
                    this.LIZ = integer;
                    this.LJIILL = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    this.LJIIIZ = obtainStyledAttributes.getResourceId(index, this.LJIIIZ);
                    break;
                case 10:
                    this.LJIJJ = obtainStyledAttributes.getBoolean(index, this.LJIJJ);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                    this.LJFF = obtainStyledAttributes.getResourceId(index, this.LJFF);
                    break;
            }
        }
    }

    public static void LJ(RectF rectF, View view, boolean z) {
        rectF.top = view.getTop();
        rectF.bottom = view.getBottom();
        rectF.left = view.getLeft();
        rectF.right = view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }
}
