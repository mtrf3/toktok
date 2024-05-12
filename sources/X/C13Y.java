package X;

import android.content.Context;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: X.13Y, reason: invalid class name */
/* loaded from: classes.dex */
public final class C13Y {
    public static final HashMap<String, Constructor<? extends C13R>> LIZIZ;
    public final HashMap<Integer, ArrayList<C13R>> LIZ = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends C13R>> hashMap = new HashMap<>();
        LIZIZ = hashMap;
        try {
            hashMap.put("KeyAttribute", C37981eM.class.getConstructor(new Class[0]));
            hashMap.put("KeyPosition", C44421ok.class.getConstructor(new Class[0]));
            hashMap.put("KeyCycle", C37991eN.class.getConstructor(new Class[0]));
            hashMap.put("KeyTimeCycle", C38141ec.class.getConstructor(new Class[0]));
            hashMap.put("KeyTrigger", C38151ed.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public final void LIZ(C267313d c267313d) {
        ArrayList<C13R> arrayList = this.LIZ.get(Integer.valueOf(c267313d.LIZIZ));
        if (arrayList != null) {
            c267313d.LJIJJ.addAll(arrayList);
        }
        ArrayList<C13R> arrayList2 = this.LIZ.get(-1);
        if (arrayList2 != null) {
            Iterator<C13R> it = arrayList2.iterator();
            while (it.hasNext()) {
                C13R next = it.next();
                String str = ((C018905p) c267313d.LIZ.getLayoutParams()).constraintTag;
                String str2 = next.LIZJ;
                if (str2 != null && str != null && str.matches(str2)) {
                    c267313d.LJIJJ.add(next);
                }
            }
        }
    }

    public final void LIZIZ(C13R c13r) {
        if (!this.LIZ.containsKey(Integer.valueOf(c13r.LIZIZ))) {
            this.LIZ.put(Integer.valueOf(c13r.LIZIZ), new ArrayList<>());
        }
        this.LIZ.get(Integer.valueOf(c13r.LIZIZ)).add(c13r);
    }

    public C13Y(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, C019405u> hashMap;
        try {
            int eventType = xmlPullParser.getEventType();
            C13R c13r = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    HashMap<String, Constructor<? extends C13R>> hashMap2 = LIZIZ;
                    if (hashMap2.containsKey(name)) {
                        try {
                            C13R newInstance = hashMap2.get(name).newInstance(new Object[0]);
                            try {
                                newInstance.LIZJ(context, android.util.Xml.asAttributeSet(xmlPullParser));
                                LIZIZ(newInstance);
                            } catch (Exception unused) {
                            }
                            c13r = newInstance;
                        } catch (Exception unused2) {
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute") && c13r != null && (hashMap = c13r.LIZLLL) != null) {
                        C019405u.LJ(context, xmlPullParser, hashMap);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
        } catch (XmlPullParserException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }
}
