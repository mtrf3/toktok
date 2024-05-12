package X;

import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TF5 {
    public final TEZ LIZ;
    public final InterfaceC46204IBk LIZIZ;
    public final InterfaceC74343TFr LIZJ;
    public final InterfaceC74359TGh LIZLLL;
    public final TEF LJ;
    public final TE0 LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TF5)) {
            return false;
        }
        TF5 tf5 = (TF5) obj;
        return o.LJ(this.LIZ, tf5.LIZ) && o.LJ(this.LIZIZ, tf5.LIZIZ) && o.LJ(this.LIZJ, tf5.LIZJ) && o.LJ(this.LIZLLL, tf5.LIZLLL) && o.LJ(this.LJ, tf5.LJ) && o.LJ(this.LJFF, tf5.LJFF);
    }

    public final int hashCode() {
        TEZ tez = this.LIZ;
        int hashCode = (tez != null ? tez.hashCode() : 0) * 31;
        InterfaceC46204IBk interfaceC46204IBk = this.LIZIZ;
        int hashCode2 = (hashCode + (interfaceC46204IBk != null ? interfaceC46204IBk.hashCode() : 0)) * 31;
        InterfaceC74343TFr interfaceC74343TFr = this.LIZJ;
        int hashCode3 = (hashCode2 + (interfaceC74343TFr != null ? interfaceC74343TFr.hashCode() : 0)) * 31;
        InterfaceC74359TGh interfaceC74359TGh = this.LIZLLL;
        int hashCode4 = (hashCode3 + (interfaceC74359TGh != null ? interfaceC74359TGh.hashCode() : 0)) * 31;
        TEF tef = this.LJ;
        int hashCode5 = (hashCode4 + (tef != null ? tef.hashCode() : 0)) * 31;
        TE0 te0 = this.LJFF;
        return hashCode5 + (te0 != null ? te0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Required(stickerDataManager=");
        LIZ.append(this.LIZ);
        LIZ.append(", clickController=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", stickerMobHelper=");
        LIZ.append(this.LIZJ);
        LIZ.append(", stickerMonitor=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", tagHandler=");
        LIZ.append(this.LJ);
        LIZ.append(", stickerViewConfigure=");
        LIZ.append(this.LJFF);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public TF5(TEZ stickerDataManager, InterfaceC46204IBk clickController, InterfaceC74343TFr stickerMobHelper, InterfaceC74359TGh stickerMonitor, TEF tagHandler, TE0 stickerViewConfigure) {
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        o.LJIIIZ(clickController, "clickController");
        o.LJIIIZ(stickerMobHelper, "stickerMobHelper");
        o.LJIIIZ(stickerMonitor, "stickerMonitor");
        o.LJIIIZ(tagHandler, "tagHandler");
        o.LJIIIZ(stickerViewConfigure, "stickerViewConfigure");
        this.LIZ = stickerDataManager;
        this.LIZIZ = clickController;
        this.LIZJ = stickerMobHelper;
        this.LIZLLL = stickerMonitor;
        this.LJ = tagHandler;
        this.LJFF = stickerViewConfigure;
    }
}
