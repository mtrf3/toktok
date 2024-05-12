package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.HIj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43837HIj implements InterfaceC45954I1u {
    public final /* synthetic */ C43833HIf LIZ;
    public final /* synthetic */ File LIZIZ;

    @Override // X.InterfaceC45954I1u
    public final void LIZ() {
        this.LIZ.LJLJJI.nr0(true, true);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LIZ.LJLJLJ.LJI());
        c145995oB.LJI("shoot_way", this.LIZ.LJLJLJ.shootWay);
        c145995oB.LJI("enter_from", "ugc_shoot_page");
        FMX.LJIIL("click_back_template", c145995oB.LIZ);
    }

    @Override // X.InterfaceC45954I1u
    public final void LIZIZ() {
        this.LIZ.LJLJJI.nr0(true, true);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LIZ.LJLJLJ.LJI());
        c145995oB.LJI("shoot_way", this.LIZ.LJLJLJ.shootWay);
        c145995oB.LJI("enter_from", "ugc_shoot_page");
        FMX.LJIIL("click_reshoot_template", c145995oB.LIZ);
    }

    @Override // X.InterfaceC45954I1u
    public final void confirm() {
        this.LIZ.LJLJJI.Ti0(false);
        String absolutePath = this.LIZIZ.getAbsolutePath();
        o.LJIIIIZZ(absolutePath, "destFile.absolutePath");
        C2U8.LIZ(new C43845HIr(absolutePath));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", this.LIZ.LJLJLJ.LJI());
        c145995oB.LJI("shoot_way", this.LIZ.LJLJLJ.shootWay);
        c145995oB.LJI("enter_from", "ugc_shoot_page");
        FMX.LJIIL("click_confirm_template", c145995oB.LIZ);
    }

    public C43837HIj(C43833HIf c43833HIf, File file) {
        this.LIZ = c43833HIf;
        this.LIZIZ = file;
    }
}
