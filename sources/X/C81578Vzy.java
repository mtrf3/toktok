package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.Vzy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81578Vzy {
    public final ShortVideoContext LIZ;
    public final boolean LIZIZ;
    public final C08630Vn<VJ6> LIZJ;
    public final C08630Vn<View> LIZLLL;
    public final C81576Vzw LJ;
    public final C08630Vn<Integer> LJFF;
    public final C08630Vn<Boolean> LJI;
    public final C08630Vn<Boolean> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C81578Vzy)) {
            return false;
        }
        C81578Vzy c81578Vzy = (C81578Vzy) obj;
        return o.LJ(this.LIZ, c81578Vzy.LIZ) && this.LIZIZ == c81578Vzy.LIZIZ && o.LJ(this.LIZJ, c81578Vzy.LIZJ) && o.LJ(this.LIZLLL, c81578Vzy.LIZLLL) && o.LJ(this.LJ, c81578Vzy.LJ) && o.LJ(this.LJFF, c81578Vzy.LJFF) && o.LJ(this.LJI, c81578Vzy.LJI) && o.LJ(this.LJII, c81578Vzy.LJII);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        C08630Vn<VJ6> c08630Vn = this.LIZJ;
        int hashCode2 = (i2 + (c08630Vn == null ? 0 : c08630Vn.hashCode())) * 31;
        C08630Vn<View> c08630Vn2 = this.LIZLLL;
        int hashCode3 = (hashCode2 + (c08630Vn2 == null ? 0 : c08630Vn2.hashCode())) * 31;
        C81576Vzw c81576Vzw = this.LJ;
        return this.LJII.hashCode() + ((this.LJI.hashCode() + ((this.LJFF.hashCode() + ((hashCode3 + (c81576Vzw != null ? c81576Vzw.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FrontSlotSceneStates(shortVideoContext=");
        LIZ.append(this.LIZ);
        LIZ.append(", controlOverlayFlash=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", openEdgeLightEvent=");
        LIZ.append(this.LIZJ);
        LIZ.append(", showPanelEvent=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", scaleEdgeLightEvent=");
        LIZ.append(this.LJ);
        LIZ.append(", changeColorEvent=");
        LIZ.append(this.LJFF);
        LIZ.append(", needDuet=");
        LIZ.append(this.LJI);
        LIZ.append(", closeFlashNeedAnim=");
        LIZ.append(this.LJII);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C81578Vzy(ShortVideoContext shortVideoContext, boolean z, C08630Vn<VJ6> c08630Vn, C08630Vn<View> c08630Vn2, C81576Vzw c81576Vzw, C08630Vn<Integer> changeColorEvent, C08630Vn<Boolean> needDuet, C08630Vn<Boolean> closeFlashNeedAnim) {
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(changeColorEvent, "changeColorEvent");
        o.LJIIIZ(needDuet, "needDuet");
        o.LJIIIZ(closeFlashNeedAnim, "closeFlashNeedAnim");
        this.LIZ = shortVideoContext;
        this.LIZIZ = z;
        this.LIZJ = c08630Vn;
        this.LIZLLL = c08630Vn2;
        this.LJ = c81576Vzw;
        this.LJFF = changeColorEvent;
        this.LJI = needDuet;
        this.LJII = closeFlashNeedAnim;
    }

    public static C81578Vzy LIZ(C81578Vzy c81578Vzy, boolean z, C08630Vn c08630Vn, C08630Vn c08630Vn2, C81576Vzw c81576Vzw, C08630Vn c08630Vn3, C08630Vn c08630Vn4, C08630Vn c08630Vn5, int i) {
        ShortVideoContext shortVideoContext;
        C08630Vn closeFlashNeedAnim = c08630Vn5;
        C08630Vn c08630Vn6 = c08630Vn;
        boolean z2 = z;
        C08630Vn c08630Vn7 = c08630Vn2;
        C81576Vzw c81576Vzw2 = c81576Vzw;
        C08630Vn changeColorEvent = c08630Vn3;
        C08630Vn needDuet = c08630Vn4;
        if ((i & 1) != 0) {
            shortVideoContext = c81578Vzy.LIZ;
        } else {
            shortVideoContext = null;
        }
        if ((i & 2) != 0) {
            z2 = c81578Vzy.LIZIZ;
        }
        if ((i & 4) != 0) {
            c08630Vn6 = c81578Vzy.LIZJ;
        }
        if ((i & 8) != 0) {
            c08630Vn7 = c81578Vzy.LIZLLL;
        }
        if ((i & 16) != 0) {
            c81576Vzw2 = c81578Vzy.LJ;
        }
        if ((i & 32) != 0) {
            changeColorEvent = c81578Vzy.LJFF;
        }
        if ((i & 64) != 0) {
            needDuet = c81578Vzy.LJI;
        }
        if ((i & 128) != 0) {
            closeFlashNeedAnim = c81578Vzy.LJII;
        }
        c81578Vzy.getClass();
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        o.LJIIIZ(changeColorEvent, "changeColorEvent");
        o.LJIIIZ(needDuet, "needDuet");
        o.LJIIIZ(closeFlashNeedAnim, "closeFlashNeedAnim");
        return new C81578Vzy(shortVideoContext, z2, c08630Vn6, c08630Vn7, c81576Vzw2, changeColorEvent, needDuet, closeFlashNeedAnim);
    }
}
