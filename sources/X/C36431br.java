package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.1br, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C36431br implements InterfaceC25570zR {
    public final ActionMode.Callback LIZ;
    public final Context LIZIZ;
    public final ArrayList<C25610zV> LIZJ = new ArrayList<>();
    public final C0MA<Menu, Menu> LIZLLL = new C0MA<>();

    @Override // X.InterfaceC25570zR
    public final void LIZJ(AbstractC25580zS abstractC25580zS) {
        this.LIZ.onDestroyActionMode(LJ(abstractC25580zS));
    }

    public final C25610zV LJ(AbstractC25580zS abstractC25580zS) {
        int size = this.LIZJ.size();
        for (int i = 0; i < size; i++) {
            C25610zV c25610zV = (C25610zV) ListProtector.get(this.LIZJ, i);
            if (c25610zV != null && c25610zV.LIZIZ == abstractC25580zS) {
                return c25610zV;
            }
        }
        C25610zV c25610zV2 = new C25610zV(this.LIZIZ, abstractC25580zS);
        this.LIZJ.add(c25610zV2);
        return c25610zV2;
    }

    public C36431br(Context context, ActionMode.Callback callback) {
        this.LIZIZ = context;
        this.LIZ = callback;
    }

    @Override // X.InterfaceC25570zR
    public final boolean LIZ(AbstractC25580zS abstractC25580zS, C281318n c281318n) {
        ActionMode.Callback callback = this.LIZ;
        C25610zV LJ = LJ(abstractC25580zS);
        Menu orDefault = this.LIZLLL.getOrDefault(c281318n, null);
        if (orDefault == null) {
            orDefault = new MenuC37401dQ(this.LIZIZ, c281318n);
            this.LIZLLL.put(c281318n, orDefault);
        }
        return callback.onCreateActionMode(LJ, orDefault);
    }

    @Override // X.InterfaceC25570zR
    public final boolean LIZIZ(AbstractC25580zS abstractC25580zS, C281318n c281318n) {
        ActionMode.Callback callback = this.LIZ;
        C25610zV LJ = LJ(abstractC25580zS);
        Menu orDefault = this.LIZLLL.getOrDefault(c281318n, null);
        if (orDefault == null) {
            orDefault = new MenuC37401dQ(this.LIZIZ, c281318n);
            this.LIZLLL.put(c281318n, orDefault);
        }
        return callback.onPrepareActionMode(LJ, orDefault);
    }

    @Override // X.InterfaceC25570zR
    public final boolean LIZLLL(AbstractC25580zS abstractC25580zS, MenuItem menuItem) {
        return this.LIZ.onActionItemClicked(LJ(abstractC25580zS), new MenuItemC37381dO(this.LIZIZ, (C0XU) menuItem));
    }
}
