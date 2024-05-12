package X;

import android.graphics.Rect;
import android.os.Build;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.19m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C283819m implements C04C {
    public final View LIZ;
    public ActionMode LIZIZ;
    public final C0MP LIZJ;
    public C04J LIZLLL;

    @Override // X.C04C
    public final void hide() {
        this.LIZLLL = C04J.Hidden;
        ActionMode actionMode = this.LIZIZ;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.LIZIZ = null;
    }

    @Override // X.C04C
    public final C04J getStatus() {
        return this.LIZLLL;
    }

    public C283819m(View view) {
        o.LJIIIZ(view, "view");
        this.LIZ = view;
        this.LIZJ = new C0MP(new IDqS420S0100000(this, 4));
        this.LIZLLL = C04J.Hidden;
    }

    @Override // X.C04C
    public final void LIZ(C10390ax c10390ax, IDqS420S0100000 iDqS420S0100000, IDqS420S0100000 iDqS420S01000002, IDqS420S0100000 iDqS420S01000003, IDqS420S0100000 iDqS420S01000004) {
        ActionMode startActionMode;
        C0MP c0mp = this.LIZJ;
        c0mp.getClass();
        c0mp.LIZIZ = c10390ax;
        final C0MP c0mp2 = this.LIZJ;
        c0mp2.LIZJ = iDqS420S0100000;
        c0mp2.LJ = iDqS420S01000003;
        c0mp2.LIZLLL = iDqS420S01000002;
        c0mp2.LJFF = iDqS420S01000004;
        ActionMode actionMode = this.LIZIZ;
        if (actionMode == null) {
            this.LIZLLL = C04J.Shown;
            if (Build.VERSION.SDK_INT >= 23) {
                View view = this.LIZ;
                final C0MP c0mp3 = this.LIZJ;
                startActionMode = C04F.LIZIZ(view, new ActionMode.Callback2(c0mp3) { // from class: X.0ML
                    public final C0MP LJLIL;

                    {
                        o.LJIIIZ(c0mp3, "callback");
                        this.LJLIL = c0mp3;
                    }

                    @Override // android.view.ActionMode.Callback
                    public final void onDestroyActionMode(ActionMode actionMode2) {
                        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL.LIZ;
                        if (interfaceC65784Pro != null) {
                            interfaceC65784Pro.invoke();
                        }
                    }

                    @Override // android.view.ActionMode.Callback
                    public final boolean onActionItemClicked(ActionMode actionMode2, MenuItem menuItem) {
                        return this.LJLIL.LIZJ(actionMode2, menuItem);
                    }

                    @Override // android.view.ActionMode.Callback
                    public final boolean onCreateActionMode(ActionMode actionMode2, Menu menu) {
                        this.LJLIL.LIZLLL(actionMode2, menu);
                        return true;
                    }

                    @Override // android.view.ActionMode.Callback
                    public final boolean onPrepareActionMode(ActionMode actionMode2, Menu menu) {
                        return this.LJLIL.LJ(actionMode2, menu);
                    }

                    @Override // android.view.ActionMode.Callback2
                    public final void onGetContentRect(ActionMode actionMode2, View view2, Rect rect) {
                        C10390ax c10390ax2 = this.LJLIL.LIZIZ;
                        if (rect != null) {
                            rect.set((int) c10390ax2.LIZ, (int) c10390ax2.LIZIZ, (int) c10390ax2.LIZJ, (int) c10390ax2.LIZLLL);
                        }
                    }
                }, 1);
            } else {
                startActionMode = this.LIZ.startActionMode(new ActionMode.Callback(c0mp2) { // from class: X.0MO
                    public final C0MP LJLIL;

                    {
                        o.LJIIIZ(c0mp2, "callback");
                        this.LJLIL = c0mp2;
                    }

                    @Override // android.view.ActionMode.Callback
                    public final void onDestroyActionMode(ActionMode actionMode2) {
                        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL.LIZ;
                        if (interfaceC65784Pro != null) {
                            interfaceC65784Pro.invoke();
                        }
                    }

                    @Override // android.view.ActionMode.Callback
                    public final boolean onActionItemClicked(ActionMode actionMode2, MenuItem menuItem) {
                        return this.LJLIL.LIZJ(actionMode2, menuItem);
                    }

                    @Override // android.view.ActionMode.Callback
                    public final boolean onCreateActionMode(ActionMode actionMode2, Menu menu) {
                        this.LJLIL.LIZLLL(actionMode2, menu);
                        return true;
                    }

                    @Override // android.view.ActionMode.Callback
                    public final boolean onPrepareActionMode(ActionMode actionMode2, Menu menu) {
                        return this.LJLIL.LJ(actionMode2, menu);
                    }
                });
            }
            this.LIZIZ = startActionMode;
            return;
        }
        actionMode.invalidate();
    }
}
