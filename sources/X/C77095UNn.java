package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.UNn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C77095UNn extends LinearLayout {
    public final C77093UNl LJLIL;
    public C77094UNm LJLILLLLZI;

    public final C77093UNl getConfig() {
        return this.LJLIL;
    }

    public final void LIZ(TypedArray typedArray) {
        this.LJLIL.LIZ = typedArray.getResourceId(11, -1);
        this.LJLIL.LIZIZ = typedArray.getResourceId(3, -1);
        this.LJLIL.LIZJ = typedArray.getResourceId(2, -1);
        this.LJLIL.LIZLLL = typedArray.getResourceId(1, -1);
        this.LJLIL.LJ = typedArray.getBoolean(5, false);
        this.LJLIL.LJFF = typedArray.getResourceId(0, -1);
        this.LJLIL.LJI = typedArray.getBoolean(4, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r1 != 3) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onConfigurationChanged(android.content.res.Configuration r12) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77095UNn.onConfigurationChanged(android.content.res.Configuration):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C77095UNn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        boolean z;
        o.LJIIIZ(context, "context");
        C77093UNl c77093UNl = new C77093UNl(0);
        new LinkedHashMap();
        this.LJLIL = c77093UNl;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setGravity(80);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.aaf, R.attr.aag, R.attr.aah, R.attr.aai, R.attr.ail, R.attr.aim, R.attr.bb3, R.attr.bb4, R.attr.bb5, R.attr.bb6, R.attr.bb7, R.attr.bbj, R.attr.bk1, R.attr.bk2}, 0, 0);
            o.LJIIIIZZ(obtainStyledAttributes, "context.theme.obtainStyl…e.SurfaceDuoLayout, 0, 0)");
            try {
                LIZ(obtainStyledAttributes);
                obtainStyledAttributes.recycle();
                if (isInEditMode()) {
                    Integer valueOf = Integer.valueOf(obtainStyledAttributes.getResourceId(10, -1));
                    if (valueOf.intValue() != -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        c77093UNl.LIZ = valueOf.intValue();
                    }
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getResourceId(9, -1));
                    if (valueOf2.intValue() != -1) {
                        c77093UNl.LIZIZ = valueOf2.intValue();
                    }
                    Integer valueOf3 = Integer.valueOf(obtainStyledAttributes.getResourceId(8, -1));
                    if (valueOf3.intValue() != -1) {
                        c77093UNl.LIZJ = valueOf3.intValue();
                    }
                    Integer valueOf4 = Integer.valueOf(obtainStyledAttributes.getInteger(7, -1));
                    if (valueOf4.intValue() != -1) {
                        c77093UNl.LIZLLL = valueOf4.intValue();
                    }
                    Integer valueOf5 = Integer.valueOf(obtainStyledAttributes.getInteger(6, -1));
                    if (valueOf5.intValue() != -1) {
                        c77093UNl.LJFF = valueOf5.intValue();
                    }
                    C77099UNr c77099UNr = EnumC77098UNq.Companion;
                    int resourceId = obtainStyledAttributes.getResourceId(13, EnumC77098UNq.SINGLE_SCREEN.ordinal());
                    c77099UNr.getClass();
                    for (EnumC77098UNq enumC77098UNq : EnumC77098UNq.values()) {
                        if (enumC77098UNq.getId() == resourceId) {
                            C77100UNs c77100UNs = EnumC77097UNp.Companion;
                            int resourceId2 = obtainStyledAttributes.getResourceId(12, EnumC77097UNp.BLACK.ordinal());
                            c77100UNs.getClass();
                            for (EnumC77097UNp enumC77097UNp : EnumC77097UNp.values()) {
                                if (enumC77097UNp.getId() == resourceId2) {
                                    new C77092UNk(this, c77093UNl, enumC77098UNq, enumC77097UNp);
                                    return;
                                }
                            }
                            throw new IllegalArgumentException("The HingeColor id doesn't exit");
                        }
                    }
                    throw new IllegalArgumentException("The ScreenMode id doesn't exit");
                }
                Context context2 = getContext();
                o.LJIIIIZZ(context2, "this.context");
                this.LJLILLLLZI = new C77094UNm(context2, this, c77093UNl);
                return;
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "this.context");
        this.LJLILLLLZI = new C77094UNm(context3, this, c77093UNl);
    }
}
