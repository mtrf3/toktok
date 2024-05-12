package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.05Y, reason: invalid class name */
/* loaded from: classes.dex */
public class C05Y {
    public int LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public String LJFF;
    public int LJI;
    public int LJII;
    public float LJIIIIZZ;
    public final C05Z LJIIIZ;
    public final ArrayList<C13Y> LJIIJ;
    public C017405a LJIIJJI;
    public final ArrayList<C05X> LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;

    public C05Y(C05Z c05z, C05Y c05y) {
        this.LIZ = -1;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJI = -1;
        this.LJII = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        this.LJIIJ = new ArrayList<>();
        this.LJIIJJI = null;
        this.LJIIL = new ArrayList<>();
        this.LJIILIIL = 0;
        this.LJIILJJIL = false;
        this.LJIILL = -1;
        this.LJIILLIIL = 0;
        this.LJIIZILJ = 0;
        this.LJIIIZ = c05z;
        if (c05y != null) {
            this.LJIILL = c05y.LJIILL;
            this.LJ = c05y.LJ;
            this.LJFF = c05y.LJFF;
            this.LJI = c05y.LJI;
            this.LJII = c05y.LJII;
            this.LJIIJ = c05y.LJIIJ;
            this.LJIIIIZZ = c05y.LJIIIIZZ;
            this.LJIILLIIL = c05y.LJIILLIIL;
        }
    }

    public C05Y(C05Z c05z, Context context, XmlPullParser xmlPullParser) {
        this.LIZ = -1;
        this.LIZJ = -1;
        this.LIZLLL = -1;
        this.LJI = -1;
        this.LJII = LiveChatShowDelayForHotLiveSetting.DEFAULT;
        this.LJIIJ = new ArrayList<>();
        this.LJIIJJI = null;
        this.LJIIL = new ArrayList<>();
        this.LJIILIIL = 0;
        this.LJIILJJIL = false;
        this.LJIILL = -1;
        this.LJIILLIIL = 0;
        this.LJIIZILJ = 0;
        this.LJII = c05z.LJIIIZ;
        this.LJIILLIIL = c05z.LJIIJ;
        this.LJIIIZ = c05z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.util.Xml.asAttributeSet(xmlPullParser), new int[]{R.attr.id, com.zhiliaoapp.musically.R.attr.wl, com.zhiliaoapp.musically.R.attr.a6t, com.zhiliaoapp.musically.R.attr.a6u, com.zhiliaoapp.musically.R.attr.aaj, com.zhiliaoapp.musically.R.attr.akx, com.zhiliaoapp.musically.R.attr.b1b, com.zhiliaoapp.musically.R.attr.b44, com.zhiliaoapp.musically.R.attr.be4, com.zhiliaoapp.musically.R.attr.bkx, com.zhiliaoapp.musically.R.attr.bkz});
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 2) {
                this.LIZJ = obtainStyledAttributes.getResourceId(index, this.LIZJ);
                if ("layout".equals(context.getResources().getResourceTypeName(this.LIZJ))) {
                    AnonymousClass064 anonymousClass064 = new AnonymousClass064();
                    anonymousClass064.LJIILLIIL(this.LIZJ, context);
                    c05z.LJI.append(this.LIZJ, anonymousClass064);
                }
            } else if (index == 3) {
                this.LIZLLL = obtainStyledAttributes.getResourceId(index, this.LIZLLL);
                if ("layout".equals(context.getResources().getResourceTypeName(this.LIZLLL))) {
                    AnonymousClass064 anonymousClass0642 = new AnonymousClass064();
                    anonymousClass0642.LJIILLIIL(this.LIZLLL, context);
                    c05z.LJI.append(this.LIZLLL, anonymousClass0642);
                }
            } else if (index == 6) {
                int i2 = obtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                    this.LJI = resourceId;
                    if (resourceId != -1) {
                        this.LJ = -2;
                    }
                } else if (i2 == 3) {
                    String LLLZLZ = C16880lQ.LLLZLZ(obtainStyledAttributes, index);
                    this.LJFF = LLLZLZ;
                    if (LLLZLZ.indexOf("/") > 0) {
                        this.LJI = obtainStyledAttributes.getResourceId(index, -1);
                        this.LJ = -2;
                    } else {
                        this.LJ = -1;
                    }
                } else {
                    this.LJ = obtainStyledAttributes.getInteger(index, this.LJ);
                }
            } else if (index == 4) {
                this.LJII = obtainStyledAttributes.getInt(index, this.LJII);
            } else if (index == 8) {
                this.LJIIIIZZ = obtainStyledAttributes.getFloat(index, this.LJIIIIZZ);
            } else if (index == 1) {
                this.LJIILIIL = obtainStyledAttributes.getInteger(index, this.LJIILIIL);
            } else if (index == 0) {
                this.LIZ = obtainStyledAttributes.getResourceId(index, this.LIZ);
            } else if (index == 9) {
                this.LJIILJJIL = obtainStyledAttributes.getBoolean(index, this.LJIILJJIL);
            } else if (index == 7) {
                this.LJIILL = obtainStyledAttributes.getInteger(index, -1);
            } else if (index == 5) {
                this.LJIILLIIL = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == 10) {
                this.LJIIZILJ = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        if (this.LIZLLL == -1) {
            this.LIZIZ = true;
        }
        obtainStyledAttributes.recycle();
    }
}
