package X;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Oel, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62427Oel {
    public C45322HqY LIZ;
    public C45322HqY LIZIZ;
    public C45322HqY LIZJ;
    public C45322HqY LIZLLL;
    public C45322HqY LJ;
    public C45322HqY LJFF;
    public C45322HqY LJI;

    public final java.util.Map<String, String> LJFF() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C62428Oem.LIZIZ(linkedHashMap, this.LIZ, "title", "title_args");
        C62428Oem.LIZIZ(linkedHashMap, this.LIZIZ, "subtitle", "subtitle_args");
        C62428Oem.LIZIZ(linkedHashMap, this.LIZJ, "subtitle_plural_count", "");
        C62428Oem.LIZIZ(linkedHashMap, this.LIZLLL, "sender_preview", "sender_preview_args");
        C62428Oem.LIZIZ(linkedHashMap, this.LJ, "receiver_preview", "receiver_preview_args");
        C62428Oem.LIZIZ(linkedHashMap, this.LJFF, "quote_preview", "quote_preview_args");
        C62428Oem.LIZIZ(linkedHashMap, this.LJI, "push_preview", "push_preview_args");
        return linkedHashMap;
    }

    public C62427Oel() {
        C45322HqY c45322HqY = C62428Oem.LIZ;
        this.LIZ = c45322HqY;
        this.LIZIZ = c45322HqY;
        this.LIZJ = c45322HqY;
        this.LIZLLL = c45322HqY;
        this.LJ = c45322HqY;
        this.LJFF = c45322HqY;
        this.LJI = c45322HqY;
    }

    public final void LIZ(String starlingKey, List<? extends Object> arguments) {
        o.LJIIIZ(starlingKey, "starlingKey");
        o.LJIIIZ(arguments, "arguments");
        this.LJFF = new C45322HqY(starlingKey, (List) arguments);
    }

    public final void LIZIZ(String starlingKey, List<? extends Object> arguments) {
        o.LJIIIZ(starlingKey, "starlingKey");
        o.LJIIIZ(arguments, "arguments");
        this.LJ = new C45322HqY(starlingKey, (List) arguments);
    }

    public final void LIZJ(String starlingKey, List<? extends Object> arguments) {
        o.LJIIIZ(starlingKey, "starlingKey");
        o.LJIIIZ(arguments, "arguments");
        this.LIZLLL = new C45322HqY(starlingKey, (List) arguments);
    }

    public final void LIZLLL(String starlingKey, List<? extends Object> arguments) {
        o.LJIIIZ(starlingKey, "starlingKey");
        o.LJIIIZ(arguments, "arguments");
        this.LIZIZ = new C45322HqY(starlingKey, (List) arguments);
    }

    public final void LJ(String starlingKey, List<? extends Object> arguments) {
        o.LJIIIZ(starlingKey, "starlingKey");
        o.LJIIIZ(arguments, "arguments");
        this.LIZ = new C45322HqY(starlingKey, (List) arguments);
    }
}
