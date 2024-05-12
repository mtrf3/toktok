package X;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bhd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29481Bhd {
    public final List<AbstractC29482Bhe<?>> LIZ;
    public final AbstractC29482Bhe<?> LIZIZ;
    public final C29484Bhg LIZJ;
    public final C1HQ<AbstractC29482Bhe<?>, View> LIZLLL = new C1HQ<>();

    public final List<AbstractC29482Bhe<?>> LIZ() {
        List<AbstractC29482Bhe<?>> list;
        AbstractC29482Bhe<?> abstractC29482Bhe = this.LIZIZ;
        if (abstractC29482Bhe != null) {
            list = ORZ.LLIIJI(abstractC29482Bhe, this.LIZ);
        } else {
            list = this.LIZ;
        }
        ArrayList arrayList = new ArrayList();
        for (AbstractC29482Bhe<?> abstractC29482Bhe2 : list) {
            if (abstractC29482Bhe2.LJ()) {
                arrayList.add(abstractC29482Bhe2);
            }
        }
        return arrayList;
    }

    public final void LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        if (this.LIZLLL.isEmpty()) {
            for (AbstractC29482Bhe<?> abstractC29482Bhe : this.LIZ) {
                this.LIZLLL.put(abstractC29482Bhe, abstractC29482Bhe.LIZLLL(context));
            }
            AbstractC29482Bhe<?> abstractC29482Bhe2 = this.LIZIZ;
            if (abstractC29482Bhe2 != null) {
                this.LIZLLL.put(abstractC29482Bhe2, abstractC29482Bhe2.LIZLLL(context));
            }
        }
    }

    public final View LIZIZ(Context context, AbstractC29482Bhe<?> cell) {
        o.LJIIIZ(cell, "cell");
        View orDefault = this.LIZLLL.getOrDefault(cell, null);
        if (orDefault == null) {
            View LIZLLL = cell.LIZLLL(context);
            this.LIZLLL.put(cell, LIZLLL);
            return LIZLLL;
        }
        return orDefault;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C29481Bhd(List<? extends AbstractC29482Bhe<?>> list, AbstractC29482Bhe<?> abstractC29482Bhe, C29484Bhg c29484Bhg) {
        this.LIZ = list;
        this.LIZIZ = abstractC29482Bhe;
        this.LIZJ = c29484Bhg;
    }
}
