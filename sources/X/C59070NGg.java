package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NGg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59070NGg extends C9U4 {
    public C59070NGg() {
        super(0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // X.C9U4
    public final Object LIZLLL(String key) {
        o.LJIIIZ(key, "key");
        switch (key.hashCode()) {
            case -1903312068:
                if (key.equals("show_type")) {
                    Object obj = LJ().get(C59071NGh.class);
                    if (obj != null) {
                        return ((C59071NGh) obj).LJIIIIZZ;
                    }
                    throw new C9U2(C59071NGh.class);
                }
                return "";
            case -1867169789:
                if (key.equals("success")) {
                    Object obj2 = LJ().get(C59071NGh.class);
                    if (obj2 != null) {
                        return ((C59071NGh) obj2).LJFF;
                    }
                    throw new C9U2(C59071NGh.class);
                }
                return "";
            case -1321694675:
                if (key.equals("gecko_channel")) {
                    Object obj3 = LJ().get(C59071NGh.class);
                    if (obj3 != null) {
                        return ((C59071NGh) obj3).LIZ;
                    }
                    throw new C9U2(C59071NGh.class);
                }
                return "";
            case -1289358244:
                if (key.equals("exists")) {
                    Object obj4 = LJ().get(C59071NGh.class);
                    if (obj4 != null) {
                        return ((C59071NGh) obj4).LJ;
                    }
                    throw new C9U2(C59071NGh.class);
                }
                return "";
            case -934964668:
                if (key.equals("reason")) {
                    Object obj5 = LJ().get(C59071NGh.class);
                    if (obj5 != null) {
                        return ((C59071NGh) obj5).LIZLLL;
                    }
                    throw new C9U2(C59071NGh.class);
                }
                return "";
            case -892481550:
                if (key.equals("status")) {
                    Object obj6 = LJ().get(C59071NGh.class);
                    if (obj6 != null) {
                        return Integer.valueOf(((C59071NGh) obj6).LJI);
                    }
                    throw new C9U2(C59071NGh.class);
                }
                return "";
            case -273081723:
                if (key.equals("fail_reason")) {
                    Object obj7 = LJ().get(C59071NGh.class);
                    if (obj7 != null) {
                        return ((C59071NGh) obj7).LJIIIZ;
                    }
                    throw new C9U2(C59071NGh.class);
                }
                return "";
            case 29331380:
                if (key.equals("package_id")) {
                    Object obj8 = LJ().get(C59071NGh.class);
                    if (obj8 != null) {
                        return ((C59071NGh) obj8).LJIIL;
                    }
                    throw new C9U2(C59071NGh.class);
                }
                return "";
            case 31843672:
                if (key.equals("download_size")) {
                    Object obj9 = LJ().get(C59071NGh.class);
                    if (obj9 != null) {
                        return ((C59071NGh) obj9).LJIILIIL;
                    }
                    throw new C9U2(C59071NGh.class);
                }
                return "";
            case 109254796:
                if (key.equals(WM7.SCENE_SERVICE)) {
                    Object obj10 = LJ().get(C59071NGh.class);
                    if (obj10 != null) {
                        return ((C59071NGh) obj10).LIZIZ;
                    }
                    throw new C9U2(C59071NGh.class);
                }
                return "";
            case 109757182:
                if (key.equals("stage")) {
                    Object obj11 = LJ().get(C59071NGh.class);
                    if (obj11 != null) {
                        return ((C59071NGh) obj11).LJIIJJI;
                    }
                    throw new C9U2(C59071NGh.class);
                }
                return "";
            case 727042826:
                if (key.equals("preload_duration")) {
                    Object obj12 = LJ().get(C59071NGh.class);
                    if (obj12 != null) {
                        return ((C59071NGh) obj12).LIZJ;
                    }
                    throw new C9U2(C59071NGh.class);
                }
                return "";
            case 1635686852:
                if (key.equals("error_code")) {
                    Object obj13 = LJ().get(C59071NGh.class);
                    if (obj13 != null) {
                        return ((C59071NGh) obj13).LJIIJ;
                    }
                    throw new C9U2(C59071NGh.class);
                }
                return "";
            case 1787798387:
                if (key.equals("strategy")) {
                    Object obj14 = LJ().get(C59071NGh.class);
                    if (obj14 != null) {
                        return ((C59071NGh) obj14).LJII;
                    }
                    throw new C9U2(C59071NGh.class);
                }
                return "";
            default:
                return "";
        }
    }
}
