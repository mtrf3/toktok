package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.526, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass526 {
    public ArrayList<AnonymousClass523> LIZ;
    public final AnonymousClass523 LIZIZ;
    public int LIZJ;

    public AnonymousClass526(ArrayList<AnonymousClass523> arrayList) {
        this.LIZ = arrayList;
        AnonymousClass522 anonymousClass522 = new AnonymousClass522();
        anonymousClass522.LIZJ = "root_item";
        anonymousClass522.LIZLLL = this.LIZ;
        this.LIZIZ = anonymousClass522.LIZ();
    }

    public final AnonymousClass523 LIZ(String type) {
        o.LJIIIZ(type, "type");
        LinkedList linkedList = new LinkedList();
        linkedList.offer(this.LIZIZ);
        while (!linkedList.isEmpty()) {
            AnonymousClass523 anonymousClass523 = (AnonymousClass523) linkedList.poll();
            if (TextUtils.equals(type, anonymousClass523.LJ)) {
                return anonymousClass523;
            }
            Iterator<AnonymousClass523> it = anonymousClass523.LIZIZ().iterator();
            while (it.hasNext()) {
                linkedList.offer(it.next());
            }
            Iterator it2 = ((ArrayList) anonymousClass523.LJIIL).iterator();
            while (it2.hasNext()) {
                linkedList.offer(it2.next());
            }
        }
        return null;
    }

    public final AnonymousClass523 LIZIZ(AnonymousClass523 item) {
        o.LJIIIZ(item, "item");
        AnonymousClass523 anonymousClass523 = item.LIZIZ;
        if (!(anonymousClass523 instanceof AnonymousClass523) || anonymousClass523 == null) {
            return LIZJ(this.LIZIZ, item);
        }
        return anonymousClass523;
    }

    public final int LIZLLL(AnonymousClass523 anonymousClass523) {
        if (o.LJ(anonymousClass523, this.LIZIZ)) {
            return this.LIZJ;
        }
        AnonymousClass523 LIZIZ = LIZIZ(anonymousClass523);
        if (LIZIZ != null) {
            this.LIZJ++;
            return LIZLLL(LIZIZ);
        }
        return this.LIZJ;
    }

    public static AnonymousClass523 LIZJ(AnonymousClass523 anonymousClass523, AnonymousClass523 anonymousClass5232) {
        if (anonymousClass523.LIZIZ().contains(anonymousClass5232)) {
            return anonymousClass523;
        }
        Iterator<AnonymousClass523> it = anonymousClass523.LIZIZ().iterator();
        while (it.hasNext()) {
            AnonymousClass523 LIZJ = LIZJ(it.next(), anonymousClass5232);
            if (LIZJ != null) {
                return LIZJ;
            }
        }
        return null;
    }
}
