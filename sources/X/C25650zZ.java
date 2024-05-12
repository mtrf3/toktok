package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import defpackage.i0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.0zZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25650zZ extends MenuInflater {
    public static final Class<?>[] LJ;
    public static final Class<?>[] LJFF;
    public final Object[] LIZ;
    public final Object[] LIZIZ;
    public final Context LIZJ;
    public Object LIZLLL;

    static {
        Class<?>[] clsArr = {Context.class};
        LJ = clsArr;
        LJFF = clsArr;
    }

    public C25650zZ(Context context) {
        super(context);
        this.LIZJ = context;
        Object[] objArr = {context};
        this.LIZ = objArr;
        this.LIZIZ = objArr;
    }

    public static Object LIZ(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            return LIZ(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof C0XT)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                xmlResourceParser = this.LIZJ.getResources().getLayout(i);
                LIZIZ(xmlResourceParser, android.util.Xml.asAttributeSet(xmlResourceParser), menu);
                xmlResourceParser.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    public final void LIZIZ(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        char charAt;
        char charAt2;
        ColorStateList colorStateList;
        Object obj;
        C25640zY c25640zY = new C25640zY(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            int i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    int next = xmlPullParser.next();
                    boolean z = false;
                    boolean z2 = false;
                    String str = null;
                    while (next != 1) {
                        if (next != i) {
                            if (next == 3) {
                                String name2 = xmlPullParser.getName();
                                if (z2 && name2.equals(str)) {
                                    z2 = false;
                                    str = null;
                                } else if (name2.equals("group")) {
                                    c25640zY.LIZIZ = 0;
                                    c25640zY.LIZJ = 0;
                                    c25640zY.LIZLLL = 0;
                                    c25640zY.LJ = 0;
                                    c25640zY.LJFF = true;
                                    c25640zY.LJI = true;
                                } else if (name2.equals("item")) {
                                    if (!c25640zY.LJII) {
                                        AbstractC16150kF abstractC16150kF = c25640zY.LJJIFFI;
                                        if (abstractC16150kF != null && abstractC16150kF.LIZ()) {
                                            c25640zY.LJII = true;
                                            c25640zY.LIZ(c25640zY.LIZ.addSubMenu(c25640zY.LIZIZ, c25640zY.LJIIIIZZ, c25640zY.LJIIIZ, c25640zY.LJIIJ).getItem());
                                        } else {
                                            c25640zY.LJII = true;
                                            c25640zY.LIZ(c25640zY.LIZ.add(c25640zY.LIZIZ, c25640zY.LJIIIIZZ, c25640zY.LJIIIZ, c25640zY.LJIIJ));
                                        }
                                    }
                                } else if (name2.equals("menu")) {
                                    z = true;
                                }
                            }
                        } else if (!z2) {
                            String name3 = xmlPullParser.getName();
                            if (name3.equals("group")) {
                                TypedArray obtainStyledAttributes = c25640zY.LJJIIZ.LIZJ.obtainStyledAttributes(attributeSet, new int[]{R.attr.enabled, R.attr.id, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.checkableBehavior});
                                c25640zY.LIZIZ = obtainStyledAttributes.getResourceId(1, 0);
                                c25640zY.LIZJ = obtainStyledAttributes.getInt(3, 0);
                                c25640zY.LIZLLL = obtainStyledAttributes.getInt(4, 0);
                                c25640zY.LJ = obtainStyledAttributes.getInt(5, 0);
                                c25640zY.LJFF = obtainStyledAttributes.getBoolean(2, true);
                                c25640zY.LJI = obtainStyledAttributes.getBoolean(0, true);
                                obtainStyledAttributes.recycle();
                            } else if (name3.equals("item")) {
                                AnonymousClass033 LJIIL = AnonymousClass033.LJIIL(c25640zY.LJJIIZ.LIZJ, attributeSet, new int[]{R.attr.icon, R.attr.enabled, R.attr.id, R.attr.checked, R.attr.visible, R.attr.menuCategory, R.attr.orderInCategory, R.attr.title, R.attr.titleCondensed, R.attr.alphabeticShortcut, R.attr.numericShortcut, R.attr.checkable, R.attr.onClick, com.zhiliaoapp.musically.R.attr.ub, com.zhiliaoapp.musically.R.attr.uv, com.zhiliaoapp.musically.R.attr.ux, com.zhiliaoapp.musically.R.attr.vm, com.zhiliaoapp.musically.R.attr.a6z, com.zhiliaoapp.musically.R.attr.ago, com.zhiliaoapp.musically.R.attr.agp, com.zhiliaoapp.musically.R.attr.b32, com.zhiliaoapp.musically.R.attr.bae, com.zhiliaoapp.musically.R.attr.bk_});
                                c25640zY.LJIIIIZZ = LJIIL.LJIIIIZZ(2, 0);
                                c25640zY.LJIIIZ = (LJIIL.LJII(5, c25640zY.LIZJ) & (-65536)) | (LJIIL.LJII(6, c25640zY.LIZLLL) & 65535);
                                c25640zY.LJIIJ = LJIIL.LJIIJ(7);
                                c25640zY.LJIIJJI = LJIIL.LJIIJ(8);
                                c25640zY.LJIIL = LJIIL.LJIIIIZZ(0, 0);
                                String LJIIIZ = LJIIL.LJIIIZ(9);
                                if (LJIIIZ == null) {
                                    charAt = 0;
                                } else {
                                    charAt = LJIIIZ.charAt(0);
                                }
                                c25640zY.LJIILIIL = charAt;
                                c25640zY.LJIILJJIL = LJIIL.LJII(16, 4096);
                                String LJIIIZ2 = LJIIL.LJIIIZ(10);
                                if (LJIIIZ2 == null) {
                                    charAt2 = 0;
                                } else {
                                    charAt2 = LJIIIZ2.charAt(0);
                                }
                                c25640zY.LJIILL = charAt2;
                                c25640zY.LJIILLIIL = LJIIL.LJII(20, 4096);
                                if (LJIIL.LJIIJJI(11)) {
                                    c25640zY.LJIIZILJ = LJIIL.LIZ(11, false) ? 1 : 0;
                                } else {
                                    c25640zY.LJIIZILJ = c25640zY.LJ;
                                }
                                c25640zY.LJIJ = LJIIL.LIZ(3, false);
                                c25640zY.LJIJI = LJIIL.LIZ(4, c25640zY.LJFF);
                                c25640zY.LJIJJ = LJIIL.LIZ(1, c25640zY.LJI);
                                c25640zY.LJIJJLI = LJIIL.LJII(21, -1);
                                c25640zY.LJJI = LJIIL.LJIIIZ(12);
                                c25640zY.LJIL = LJIIL.LJIIIIZZ(13, 0);
                                c25640zY.LJJ = LJIIL.LJIIIZ(15);
                                String LJIIIZ3 = LJIIL.LJIIIZ(14);
                                if (LJIIIZ3 != null && c25640zY.LJIL == 0 && c25640zY.LJJ == null) {
                                    Class<?>[] clsArr = LJFF;
                                    C25650zZ c25650zZ = c25640zY.LJJIIZ;
                                    Object[] objArr = c25650zZ.LIZIZ;
                                    try {
                                        Constructor<?> constructor = Class.forName(LJIIIZ3, false, c25650zZ.LIZJ.getClassLoader()).getConstructor(clsArr);
                                        constructor.setAccessible(true);
                                        obj = constructor.newInstance(objArr);
                                    } catch (Exception unused) {
                                        obj = null;
                                    }
                                    c25640zY.LJJIFFI = (AbstractC16150kF) obj;
                                } else {
                                    c25640zY.LJJIFFI = null;
                                }
                                c25640zY.LJJII = LJIIL.LJIIJ(17);
                                c25640zY.LJJIII = LJIIL.LJIIJ(22);
                                if (LJIIL.LJIIJJI(19)) {
                                    c25640zY.LJJIIJZLJL = C03D.LIZLLL(LJIIL.LJII(19, -1), c25640zY.LJJIIJZLJL);
                                    colorStateList = null;
                                } else {
                                    colorStateList = null;
                                    c25640zY.LJJIIJZLJL = null;
                                }
                                if (LJIIL.LJIIJJI(18)) {
                                    c25640zY.LJJIIJ = LJIIL.LIZIZ(18);
                                } else {
                                    c25640zY.LJJIIJ = colorStateList;
                                }
                                LJIIL.LJIILJJIL();
                                c25640zY.LJII = false;
                            } else if (name3.equals("menu")) {
                                c25640zY.LJII = true;
                                SubMenu addSubMenu = c25640zY.LIZ.addSubMenu(c25640zY.LIZIZ, c25640zY.LJIIIIZZ, c25640zY.LJIIIZ, c25640zY.LJIIJ);
                                c25640zY.LIZ(addSubMenu.getItem());
                                LIZIZ(xmlPullParser, attributeSet, addSubMenu);
                            } else {
                                z2 = true;
                                str = name3;
                            }
                        }
                        next = xmlPullParser.next();
                        i = 2;
                        if (z) {
                            return;
                        }
                    }
                } else {
                    throw new RuntimeException(i0.LJFF("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        throw new RuntimeException("Unexpected end of document");
    }
}
