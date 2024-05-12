package X;

import kotlin.jvm.internal.o;

/* renamed from: X.WUa, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82360WUa implements InterfaceC43847HIt {
    public final /* synthetic */ WUV LIZ;

    public C82360WUa(WUV wuv) {
        this.LIZ = wuv;
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
