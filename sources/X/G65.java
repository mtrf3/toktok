package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G65 {
    public final AbstractC42651GoZ LIZ;
    public final LifecycleOwner LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final ActivityC45651qj LIZLLL;
    public final AbstractC42152GgW<?> LJ;
    public final WM7 LJFF;
    public final WMH LJI;
    public final InterfaceC65784Pro<C76800UCe> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G65)) {
            return false;
        }
        G65 g65 = (G65) obj;
        return o.LJ(this.LIZ, g65.LIZ) && o.LJ(this.LIZIZ, g65.LIZIZ) && o.LJ(this.LIZJ, g65.LIZJ) && o.LJ(this.LIZLLL, g65.LIZLLL) && o.LJ(this.LJ, g65.LJ) && o.LJ(this.LJFF, g65.LJFF) && o.LJ(this.LJI, g65.LJI) && o.LJ(this.LJII, g65.LJII);
    }

    public final int hashCode() {
        int hashCode = (this.LIZLLL.hashCode() + ((this.LIZJ.hashCode() + ((this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31)) * 31)) * 31)) * 31;
        AbstractC42152GgW<?> abstractC42152GgW = this.LJ;
        return this.LJII.hashCode() + ((this.LJI.hashCode() + ((this.LJFF.hashCode() + ((hashCode + (abstractC42152GgW == null ? 0 : abstractC42152GgW.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuickPostOnEditPageCheckModel(rootScene=");
        LIZ.append(this.LIZ);
        LIZ.append(", lifecycleOwner=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", editModel=");
        LIZ.append(this.LIZJ);
        LIZ.append(", activity=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", permissionCheck=");
        LIZ.append(this.LJ);
        LIZ.append(", editBottomScene=");
        LIZ.append(this.LJFF);
        LIZ.append(", editBottomParentScene=");
        LIZ.append(this.LJI);
        LIZ.append(", finallyDo=");
        return C06540Nm.LIZJ(LIZ, this.LJII, ')', LIZ);
    }

    public G65(AbstractC42651GoZ rootScene, LifecycleOwner lifecycleOwner, VideoPublishEditModel editModel, ActivityC45651qj activity, AbstractC42152GgW abstractC42152GgW, WM7 editBottomScene, WMH editBottomParentScene, AqS157S0100000_7 aqS157S0100000_7) {
        o.LJIIIZ(rootScene, "rootScene");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(editModel, "editModel");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(editBottomScene, "editBottomScene");
        o.LJIIIZ(editBottomParentScene, "editBottomParentScene");
        this.LIZ = rootScene;
        this.LIZIZ = lifecycleOwner;
        this.LIZJ = editModel;
        this.LIZLLL = activity;
        this.LJ = abstractC42152GgW;
        this.LJFF = editBottomScene;
        this.LJI = editBottomParentScene;
        this.LJII = aqS157S0100000_7;
    }
}
