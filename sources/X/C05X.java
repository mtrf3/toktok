package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.zhiliaoapp.musically.R;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.05X, reason: invalid class name */
/* loaded from: classes.dex */
public class C05X implements View.OnClickListener {
    public final C05Y LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        C05Y c05y = this.LJLIL;
        C05Z c05z = c05y.LJIIIZ;
        C45601qe c45601qe = c05z.LIZ;
        if (!c45601qe.LJLJLLL) {
            return;
        }
        if (c05y.LIZLLL == -1) {
            int currentState = c45601qe.getCurrentState();
            if (currentState == -1) {
                c45601qe.LJLJJL(this.LJLIL.LIZJ);
                return;
            }
            C05Y c05y2 = this.LJLIL;
            C05Y c05y3 = new C05Y(c05y2.LJIIIZ, c05y2);
            c05y3.LIZLLL = currentState;
            c05y3.LIZJ = this.LJLIL.LIZJ;
            c45601qe.setTransition(c05y3);
            c45601qe.LJJLJLI(1.0f);
            return;
        }
        C05Y c05y4 = c05z.LIZJ;
        int i = this.LJLJI;
        if ((i & 1) != 0 || (i & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 16) != 0 || (i & 4096) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            if (c05y4 != c05y) {
                c45601qe.setTransition(c05y);
            }
            if (c45601qe.getCurrentState() == c45601qe.getEndState() || c45601qe.getProgress() > 0.5f) {
                z = false;
            } else {
                z2 = false;
            }
        }
        C05Y c05y5 = this.LJLIL;
        if (c05y5 != c05y4) {
            int i2 = c05y5.LIZJ;
            int i3 = c05y5.LIZLLL;
            if (i3 == -1) {
                if (c45601qe.LJLJJL == i2) {
                    return;
                }
            } else {
                int i4 = c45601qe.LJLJJL;
                if (i4 != i3 && i4 != i2) {
                    return;
                }
            }
        }
        if (z && (this.LJLJI & 1) != 0) {
            c45601qe.setTransition(c05y5);
            c45601qe.LJJLJLI(1.0f);
            return;
        }
        if (z2 && (this.LJLJI & 16) != 0) {
            c45601qe.setTransition(c05y5);
            c45601qe.LJJLJLI(0.0f);
        } else if (z && (this.LJLJI & 256) != 0) {
            c45601qe.setTransition(c05y5);
            c45601qe.setProgress(1.0f);
        } else {
            if (!z2 || (this.LJLJI & 4096) == 0) {
                return;
            }
            c45601qe.setTransition(c05y5);
            c45601qe.setProgress(0.0f);
        }
    }

    public C05X(Context context, C05Y c05y, XmlPullParser xmlPullParser) {
        this.LJLILLLLZI = -1;
        this.LJLJI = 17;
        this.LJLIL = c05y;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.a3m, R.attr.bhg});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.LJLILLLLZI = obtainStyledAttributes.getResourceId(index, this.LJLILLLLZI);
            } else if (index == 0) {
                this.LJLJI = obtainStyledAttributes.getInt(index, this.LJLJI);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.view.View] */
    public final void LIZ(C45601qe c45601qe, int i, C05Y c05y) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = this.LJLILLLLZI;
        C45601qe c45601qe2 = c45601qe;
        if (i2 != -1) {
            c45601qe2 = c45601qe.findViewById(i2);
        }
        if (c45601qe2 == null) {
            return;
        }
        int i3 = c05y.LIZLLL;
        int i4 = c05y.LIZJ;
        if (i3 == -1) {
            C16880lQ.LJIIJ(this, c45601qe2);
            return;
        }
        int i5 = this.LJLJI;
        int i6 = i5 & 1;
        boolean z5 = false;
        if (i6 != 0 && i == i3) {
            z = true;
        } else {
            z = false;
        }
        if ((i5 & 256) != 0 && i == i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = z | z2;
        if (i6 != 0 && i == i3) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z7 = z3 | z6;
        if ((i5 & 16) != 0 && i == i4) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z8 = z7 | z4;
        if ((i5 & 4096) != 0 && i == i4) {
            z5 = true;
        }
        if (z8 | z5) {
            C16880lQ.LJIIJ(this, c45601qe2);
        }
    }
}
