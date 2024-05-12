package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WUZ implements InterfaceC43847HIt {
    public final /* synthetic */ WUU LIZ;

    public WUZ(WUU wuu) {
        this.LIZ = wuu;
    }

    @Override // X.InterfaceC43847HIt
    public final boolean LIZ(C46156I9o event) {
        o.LJIIIZ(event, "event");
        if (this.LIZ.getCameraApiComponent().zZ().LIZLLL() >= this.LIZ.getCameraApiComponent().zZ().LJ()) {
            I0N stickerApiComponent = this.LIZ.getStickerApiComponent();
            if (stickerApiComponent != null) {
                stickerApiComponent.W90(false, "");
            }
            this.LIZ.getRecordControlApi().JE(new C46156I9o("record_full"));
        }
        return false;
    }
}
