package X;

import android.graphics.Path;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* renamed from: X.1Yg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34821Yg implements SJG, VGD {
    public Object LIZ;

    public /* synthetic */ C34821Yg(int i) {
    }

    @Override // X.VGD
    public final int LIZIZ() {
        return ((AtomicInteger) this.LIZ).getAndIncrement();
    }

    @Override // X.VGD
    public final int LIZJ() {
        return ((AtomicInteger) this.LIZ).getAndDecrement();
    }

    public final List LJFF() {
        java.util.Map map = (java.util.Map) this.LIZ;
        ArrayList arrayList = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ORS.LJJLIIIJILLIZJL((Iterable) ((Map.Entry) it.next()).getValue(), arrayList);
        }
        return arrayList;
    }

    public /* synthetic */ C34821Yg() {
        this.LIZ = new AtomicInteger(0);
    }

    public C34821Yg(List originHeaders) {
        o.LJIIIZ(originHeaders, "originHeaders");
        this.LIZ = new LinkedHashMap();
        Iterator it = originHeaders.iterator();
        while (it.hasNext()) {
            EJ6 ej6 = (EJ6) it.next();
            String str = ej6.LIZ;
            o.LJIIIIZZ(str, "header.name");
            java.util.Map map = (java.util.Map) this.LIZ;
            String LJII = LJII(str);
            Object obj = map.get(LJII);
            if (obj == null) {
                obj = new ArrayList();
                map.put(LJII, obj);
            }
            ((List) obj).add(ej6);
        }
    }

    public static String LJII(String str) {
        Locale locale = Locale.getDefault();
        o.LJIIIIZZ(locale, "Locale.getDefault()");
        if (str != null) {
            String lowerCase = str.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return lowerCase;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final void LJ(Path path) {
        for (int size = ((List) this.LIZ).size() - 1; size >= 0; size--) {
            C06310Mp.LIZIZ(path, (C34861Yk) ListProtector.get((List) this.LIZ, size));
        }
    }

    public final String LJI(String str) {
        Object obj;
        List list = (List) ((java.util.Map) this.LIZ).get(LJII(str));
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((EJ6) obj).LIZIZ != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        EJ6 ej6 = (EJ6) obj;
        if (ej6 == null) {
            return null;
        }
        return ej6.LIZIZ;
    }

    public final float LJIIIIZZ(float f) {
        Object obj = this.LIZ;
        SJ6 sj6 = (SJ6) obj;
        float f2 = sj6.LJLJJLL;
        if (f2 == 0.0f) {
            f2 = sj6.LJLJL;
        }
        obj.getClass();
        if (f < (f2 + 1.0f) / 2) {
            return f2;
        }
        return 1.0f;
    }

    public /* synthetic */ C34821Yg(AbstractC84920XUm baseMusicAndEffectDownloadHelper) {
        o.LJIIIZ(baseMusicAndEffectDownloadHelper, "baseMusicAndEffectDownloadHelper");
        this.LIZ = baseMusicAndEffectDownloadHelper;
    }

    public /* synthetic */ C34821Yg(SJ3 sj3) {
        this.LIZ = sj3;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C34821Yg(int i, int i2) {
        this();
        if (i != 5) {
            this.LIZ = new ArrayList();
        }
    }

    public final void LIZLLL(String str, String str2) {
        EJ6 ej6 = new EJ6(str, str2);
        java.util.Map map = (java.util.Map) this.LIZ;
        String LJII = LJII(str);
        Object obj = map.get(LJII);
        if (obj == null) {
            obj = new ArrayList();
            map.put(LJII, obj);
        }
        ((List) obj).add(ej6);
    }

    public final void LJIIIZ(java.util.Map map, InterfaceC84926XUs interfaceC84926XUs, boolean z, String str, boolean z2) {
        Effect effect;
        String str2 = str;
        if (interfaceC84926XUs == null || !z) {
            ((AbstractC84920XUm) this.LIZ).LJII(map, interfaceC84926XUs, z, str2, z2);
            return;
        }
        Effect effect2 = null;
        if (o.LJ(str2, ((AbstractC84920XUm) this.LIZ).LIZIZ)) {
            AbstractC84920XUm abstractC84920XUm = (AbstractC84920XUm) this.LIZ;
            C84919XUl c84919XUl = abstractC84920XUm.LJII;
            if (c84919XUl != null) {
                if (c84919XUl.LJ) {
                    c84919XUl.LJFF(interfaceC84926XUs);
                    return;
                } else if (c84919XUl.LJI) {
                    AbstractC84920XUm.LJIIIIZZ(abstractC84920XUm, map, str2);
                } else {
                    c84919XUl.LJFF(null);
                }
            }
            C84919XUl c84919XUl2 = ((AbstractC84920XUm) this.LIZ).LJII;
            if (c84919XUl2 != null) {
                effect = c84919XUl2.LIZIZ;
            } else {
                effect = null;
            }
            interfaceC84926XUs.onStart(effect);
            C84919XUl c84919XUl3 = ((AbstractC84920XUm) this.LIZ).LJII;
            if (c84919XUl3 != null) {
                String str3 = c84919XUl3.LJIIL;
                if (str3 != null) {
                    str2 = str3;
                }
                effect2 = c84919XUl3.LJIILIIL;
            }
            interfaceC84926XUs.LIZ(effect2, str2);
            return;
        }
        AbstractC84920XUm.LJIIIIZZ((AbstractC84920XUm) this.LIZ, map, str2);
        interfaceC84926XUs.onStart(null);
        interfaceC84926XUs.LIZ(null, str2);
    }
}
