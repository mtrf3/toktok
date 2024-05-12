package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ugc.android.editor.base.viewmodel.FunctionBarViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.525, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass525 implements AnonymousClass527 {
    public final FunctionBarViewModel LIZ;
    public final AnonymousClass526 LIZIZ;

    @Override // X.AnonymousClass527
    public final AnonymousClass523 LIZIZ() {
        AnonymousClass526 anonymousClass526 = this.LIZIZ;
        anonymousClass526.getClass();
        AnonymousClass523 LIZ = anonymousClass526.LIZ("bottom_item_root_edit");
        if (LIZ == null) {
            return null;
        }
        return anonymousClass526.LIZIZ(LIZ);
    }

    @Override // X.AnonymousClass527
    public final int LIZ(AnonymousClass523 funcItem) {
        o.LJIIIZ(funcItem, "funcItem");
        AnonymousClass526 anonymousClass526 = this.LIZIZ;
        anonymousClass526.getClass();
        anonymousClass526.LIZJ = 0;
        return anonymousClass526.LIZLLL(funcItem);
    }

    public final void LJFF(String str) {
        LJI(new String[]{str});
    }

    public final void LJI(String[] funcTypesArray) {
        o.LJIIIZ(funcTypesArray, "funcTypesArray");
        for (String str : funcTypesArray) {
            LJIIIIZZ(str, true);
        }
    }

    public final void LJII(String str) {
        AnonymousClass523 LIZ = this.LIZIZ.LIZ(str);
        if (LIZ != null) {
            this.LIZ.showChildList(LIZ, LIZ(LIZ));
        }
    }

    public final void LJIIJ(ArrayList arrayList) {
        AnonymousClass523 LIZ = this.LIZIZ.LIZ("bottom_item_root_sound");
        if (LIZ != null) {
            ((ArrayList) LIZ.LIZ).clear();
            ((ArrayList) LIZ.LIZ).addAll(arrayList);
            if (o.LJ(this.LIZ.getCurrentFuncType(), "bottom_item_root_sound")) {
                AnonymousClass526 anonymousClass526 = this.LIZIZ;
                anonymousClass526.getClass();
                anonymousClass526.LIZJ = 0;
                this.LIZ.showChildList(LIZ, anonymousClass526.LIZLLL(LIZ));
            }
        }
    }

    public final void LJIIJJI(AnonymousClass523 anonymousClass523) {
        AnonymousClass523 LIZ = this.LIZIZ.LIZ("bottom_item_root_magic");
        if (LIZ != null) {
            AnonymousClass526 anonymousClass526 = this.LIZIZ;
            anonymousClass526.getClass();
            AnonymousClass523 LIZIZ = anonymousClass526.LIZIZ(LIZ);
            if (LIZIZ == null) {
                return;
            }
            boolean remove = LIZIZ.LIZIZ().remove(LIZ);
            if (remove) {
                remove = LIZIZ.LIZIZ().add(anonymousClass523);
            }
            if (anonymousClass526.LIZ.contains(LIZ)) {
                int indexOf = anonymousClass526.LIZ.indexOf(LIZ);
                anonymousClass526.LIZ.remove(LIZ);
                ListProtector.add(anonymousClass526.LIZ, indexOf, anonymousClass523);
                anonymousClass526.LIZIZ.LIZJ(anonymousClass526.LIZ);
            }
            if (!remove) {
                return;
            }
            this.LIZ.replaceItem("bottom_item_root_magic", anonymousClass523, false);
        }
    }

    public final void LJIIL(Drawable drawable) {
        AnonymousClass523 LIZ = this.LIZIZ.LIZ("bottom_item_root_sound_sync");
        if (LIZ != null) {
            LIZ.LIZLLL = drawable;
            this.LIZ.updateItem(LIZ);
        }
    }

    public final void LJIILIIL(AnonymousClass523 funcItem) {
        o.LJIIIZ(funcItem, "funcItem");
        this.LIZ.updateItem(funcItem);
    }

    @Override // X.AnonymousClass527
    public final void LIZJ(String str, String str2) {
        AnonymousClass523 LIZ;
        AnonymousClass523 LIZ2 = this.LIZIZ.LIZ(str);
        if (LIZ2 != null && (LIZ = this.LIZIZ.LIZ(str2)) != null && ((ArrayList) LIZ2.LIZ).contains(LIZ)) {
            ((ArrayList) LIZ2.LIZ).remove(LIZ);
        }
    }

    @Override // X.AnonymousClass527
    public final void LIZLLL(AnonymousClass523 anonymousClass523, int i) {
        AnonymousClass523 LIZ = this.LIZIZ.LIZ("bottom_item_root_edit");
        if (LIZ != null && !LIZ.LIZ(anonymousClass523)) {
            this.LIZIZ.getClass();
            ArrayList<AnonymousClass523> LIZIZ = LIZ.LIZIZ();
            if (!LIZIZ.isEmpty()) {
                if (i >= 0 && i <= LIZIZ.size()) {
                    ListProtector.add(LIZIZ, i, anonymousClass523);
                } else {
                    return;
                }
            } else if (i < 0 || i > LIZIZ.size()) {
                return;
            } else {
                ListProtector.add(LIZIZ, i, anonymousClass523);
            }
            this.LIZ.setRootFunctionList(this.LIZIZ.LIZ);
        }
    }

    public final void LJ(int i, AnonymousClass523 anonymousClass523) {
        AnonymousClass526 anonymousClass526 = this.LIZIZ;
        anonymousClass526.getClass();
        if (!anonymousClass526.LIZ.isEmpty()) {
            Iterator<AnonymousClass523> it = anonymousClass526.LIZ.iterator();
            while (it.hasNext()) {
                if (TextUtils.equals(it.next().LJ, anonymousClass523.LJ)) {
                    return;
                }
            }
        }
        AnonymousClass526 anonymousClass5262 = this.LIZIZ;
        anonymousClass5262.getClass();
        if (i >= 0 && i <= anonymousClass5262.LIZ.size()) {
            ListProtector.add(anonymousClass5262.LIZ, i, anonymousClass523);
            anonymousClass5262.LIZIZ.LIZJ(anonymousClass5262.LIZ);
            if (o.LJ(this.LIZ.getCurrentFuncType(), "root_item")) {
                this.LIZ.insertItem(i, anonymousClass523);
            }
        }
    }

    public final void LJIIIIZZ(String str, boolean z) {
        boolean z2;
        AnonymousClass523 LIZ = this.LIZIZ.LIZ(str);
        if (LIZ != null) {
            if (LIZ.LJFF != z) {
                LIZ.LJFF = z;
                z2 = true;
            } else {
                z2 = false;
                if (LIZ == null) {
                    return;
                }
            }
            ArrayList LJII = C47261Igj.LJII(LIZ);
            ArrayList arrayList = new ArrayList();
            Iterator it = LJII.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            AnonymousClass523 anonymousClass523 = (AnonymousClass523) ORZ.LJLLLL(arrayList);
            if (anonymousClass523 != null && z2) {
                this.LIZ.updateItem(anonymousClass523);
            }
        }
    }

    public final int LJIIIZ(String str, String str2) {
        AnonymousClass523 LIZ;
        AnonymousClass523 LIZ2 = this.LIZIZ.LIZ(str);
        if (LIZ2 != null && (LIZ = this.LIZIZ.LIZ(str2)) != null) {
            return ((ArrayList) LIZ2.LIZ).indexOf(LIZ);
        }
        return -1;
    }

    public AnonymousClass525(FunctionBarViewModel functionBarViewModel, AnonymousClass526 anonymousClass526, AnonymousClass534 functionHandlerRegister) {
        o.LJIIIZ(functionBarViewModel, "functionBarViewModel");
        o.LJIIIZ(functionHandlerRegister, "functionHandlerRegister");
        this.LIZ = functionBarViewModel;
        this.LIZIZ = anonymousClass526;
    }
}
