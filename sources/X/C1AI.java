package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: X.1AI, reason: invalid class name */
/* loaded from: classes.dex */
public class C1AI extends C018905p {
    public final float LIZ;
    public final boolean LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final float LJI;
    public final float LJII;
    public final float LJIIIIZZ;
    public final float LJIIIZ;
    public final float LJIIJ;
    public final float LJIIJJI;
    public final float LJIIL;

    public C1AI() {
        super(-2, -2);
        this.LIZ = 1.0f;
        this.LJI = 1.0f;
        this.LJII = 1.0f;
    }

    public C1AI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = 1.0f;
        this.LJI = 1.0f;
        this.LJII = 1.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.orientation, R.attr.id, R.attr.visibility, R.attr.layout_width, R.attr.layout_height, R.attr.layout_marginLeft, R.attr.layout_marginTop, R.attr.layout_marginRight, R.attr.layout_marginBottom, R.attr.maxWidth, R.attr.maxHeight, R.attr.minWidth, R.attr.minHeight, R.attr.pivotX, R.attr.pivotY, R.attr.alpha, R.attr.transformPivotX, R.attr.transformPivotY, R.attr.translationX, R.attr.translationY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.rotationX, R.attr.rotationY, R.attr.layout_marginStart, R.attr.layout_marginEnd, R.attr.translationZ, R.attr.elevation, com.zhiliaoapp.musically.R.attr.w1, com.zhiliaoapp.musically.R.attr.xw, com.zhiliaoapp.musically.R.attr.xx, com.zhiliaoapp.musically.R.attr.xy, com.zhiliaoapp.musically.R.attr.a1p, com.zhiliaoapp.musically.R.attr.a6v, com.zhiliaoapp.musically.R.attr.a6w, com.zhiliaoapp.musically.R.attr.a9v, com.zhiliaoapp.musically.R.attr.aa1, com.zhiliaoapp.musically.R.attr.adm, com.zhiliaoapp.musically.R.attr.adn, com.zhiliaoapp.musically.R.attr.ado, com.zhiliaoapp.musically.R.attr.adp, com.zhiliaoapp.musically.R.attr.adq, com.zhiliaoapp.musically.R.attr.adr, com.zhiliaoapp.musically.R.attr.ads, com.zhiliaoapp.musically.R.attr.adt, com.zhiliaoapp.musically.R.attr.adu, com.zhiliaoapp.musically.R.attr.adv, com.zhiliaoapp.musically.R.attr.adw, com.zhiliaoapp.musically.R.attr.adx, com.zhiliaoapp.musically.R.attr.ady, com.zhiliaoapp.musically.R.attr.ae0, com.zhiliaoapp.musically.R.attr.ae1, com.zhiliaoapp.musically.R.attr.ae2, com.zhiliaoapp.musically.R.attr.ae3, com.zhiliaoapp.musically.R.attr.ae4, com.zhiliaoapp.musically.R.attr.alr, com.zhiliaoapp.musically.R.attr.als, com.zhiliaoapp.musically.R.attr.alt, com.zhiliaoapp.musically.R.attr.alu, com.zhiliaoapp.musically.R.attr.alv, com.zhiliaoapp.musically.R.attr.alw, com.zhiliaoapp.musically.R.attr.alx, com.zhiliaoapp.musically.R.attr.aly, com.zhiliaoapp.musically.R.attr.alz, com.zhiliaoapp.musically.R.attr.am0, com.zhiliaoapp.musically.R.attr.am1, com.zhiliaoapp.musically.R.attr.am2, com.zhiliaoapp.musically.R.attr.am3, com.zhiliaoapp.musically.R.attr.am4, com.zhiliaoapp.musically.R.attr.am5, com.zhiliaoapp.musically.R.attr.am6, com.zhiliaoapp.musically.R.attr.am7, com.zhiliaoapp.musically.R.attr.am8, com.zhiliaoapp.musically.R.attr.am9, com.zhiliaoapp.musically.R.attr.am_, com.zhiliaoapp.musically.R.attr.ama, com.zhiliaoapp.musically.R.attr.amb, com.zhiliaoapp.musically.R.attr.amc, com.zhiliaoapp.musically.R.attr.amd, com.zhiliaoapp.musically.R.attr.ame, com.zhiliaoapp.musically.R.attr.amf, com.zhiliaoapp.musically.R.attr.amg, com.zhiliaoapp.musically.R.attr.amh, com.zhiliaoapp.musically.R.attr.ami, com.zhiliaoapp.musically.R.attr.amj, com.zhiliaoapp.musically.R.attr.amk, com.zhiliaoapp.musically.R.attr.aml, com.zhiliaoapp.musically.R.attr.amm, com.zhiliaoapp.musically.R.attr.amn, com.zhiliaoapp.musically.R.attr.amo, com.zhiliaoapp.musically.R.attr.amp, com.zhiliaoapp.musically.R.attr.amq, com.zhiliaoapp.musically.R.attr.amr, com.zhiliaoapp.musically.R.attr.ams, com.zhiliaoapp.musically.R.attr.amt, com.zhiliaoapp.musically.R.attr.amu, com.zhiliaoapp.musically.R.attr.amv, com.zhiliaoapp.musically.R.attr.amx, com.zhiliaoapp.musically.R.attr.amy, com.zhiliaoapp.musically.R.attr.an2, com.zhiliaoapp.musically.R.attr.an3, com.zhiliaoapp.musically.R.attr.an4, com.zhiliaoapp.musically.R.attr.an5, com.zhiliaoapp.musically.R.attr.an6, com.zhiliaoapp.musically.R.attr.an7, com.zhiliaoapp.musically.R.attr.b1d, com.zhiliaoapp.musically.R.attr.b1e, com.zhiliaoapp.musically.R.attr.b44, com.zhiliaoapp.musically.R.attr.b4o, com.zhiliaoapp.musically.R.attr.bky, com.zhiliaoapp.musically.R.attr.bl0});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 15) {
                this.LIZ = obtainStyledAttributes.getFloat(index, this.LIZ);
            } else if (index == 28) {
                this.LIZJ = obtainStyledAttributes.getFloat(index, this.LIZJ);
                this.LIZIZ = true;
            } else if (index == 23) {
                this.LJ = obtainStyledAttributes.getFloat(index, this.LJ);
            } else if (index == 24) {
                this.LJFF = obtainStyledAttributes.getFloat(index, this.LJFF);
            } else if (index == 22) {
                this.LIZLLL = obtainStyledAttributes.getFloat(index, this.LIZLLL);
            } else if (index == 20) {
                this.LJI = obtainStyledAttributes.getFloat(index, this.LJI);
            } else if (index == 21) {
                this.LJII = obtainStyledAttributes.getFloat(index, this.LJII);
            } else if (index == 16) {
                this.LJIIIIZZ = obtainStyledAttributes.getFloat(index, this.LJIIIIZZ);
            } else if (index == 17) {
                this.LJIIIZ = obtainStyledAttributes.getFloat(index, this.LJIIIZ);
            } else if (index == 18) {
                this.LJIIJ = obtainStyledAttributes.getFloat(index, this.LJIIJ);
            } else if (index == 19) {
                this.LJIIJJI = obtainStyledAttributes.getFloat(index, this.LJIIJJI);
            } else if (index == 27) {
                this.LJIIL = obtainStyledAttributes.getFloat(index, this.LJIIL);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
