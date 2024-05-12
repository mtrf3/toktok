package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.ugc.android.editor.core.api.params.EditMedia;
import com.ss.ugc.android.editor.core.api.params.TextStyleInfo;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.4w9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125454w9 implements InterfaceC125004vQ {
    public final InterfaceC124924vI LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public NLEEditor LJLJLJ;

    public final InterfaceC125484wC LIZIZ() {
        return (InterfaceC125484wC) this.LJLJJL.getValue();
    }

    public final InterfaceC125324vw LIZLLL() {
        return (InterfaceC125324vw) this.LJLJJLL.getValue();
    }

    public final InterfaceC125474wB LJIILJJIL() {
        return (InterfaceC125474wB) this.LJLJI.getValue();
    }

    public final InterfaceC125094vZ LJJIJIIJIL() {
        return (InterfaceC125094vZ) this.LJLILLLLZI.getValue();
    }

    public final InterfaceC125464wA LJJJJIZL() {
        return (InterfaceC125464wA) this.LJLJJI.getValue();
    }

    @Override // X.InterfaceC125094vZ
    public final NLETrackSlot LIZ() {
        return LJJIJIIJIL().LIZ();
    }

    @Override // X.InterfaceC125094vZ
    public final NLETrackSlot LJ() {
        return LJJIJIIJIL().LJ();
    }

    @Override // X.InterfaceC125464wA
    public final void LJII() {
        LJJJJIZL().LJII();
    }

    @Override // X.InterfaceC125484wC
    public final boolean LJIILIIL() {
        return LIZIZ().LJIILIIL();
    }

    @Override // X.InterfaceC125464wA
    public final void LJJIJ() {
        LJJJJIZL().LJJIJ();
    }

    @Override // X.InterfaceC125484wC
    public final float LJJIJIL() {
        return LIZIZ().LJJIJIL();
    }

    @Override // X.InterfaceC125464wA
    public final float LJJJJJ() {
        return LJJJJIZL().LJJJJJ();
    }

    @Override // X.InterfaceC125004vQ
    public final NLEModel r9() {
        if (s9().LJ() == null) {
            NLEModel nLEModel = new NLEModel();
            s9().LJII(nLEModel);
            return nLEModel;
        }
        NLEModel LJ = s9().LJ();
        o.LJIIIIZZ(LJ, "{\n            nleEditor.model\n        }");
        return LJ;
    }

    @Override // X.InterfaceC125004vQ
    public final NLEEditor s9() {
        return this.LJLJLJ;
    }

    public C125454w9(InterfaceC124924vI editorContext) {
        o.LJIIIZ(editorContext, "editorContext");
        this.LJLIL = editorContext;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 20));
        C221108m2.LIZIZ(new AqS152S0100000_2(this, 12));
        this.LJLJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 19));
        this.LJLJJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 21));
        this.LJLJJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 13));
        C221108m2.LIZIZ(new AqS152S0100000_2(this, 15));
        this.LJLJJLL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 18));
        C221108m2.LIZIZ(new AqS152S0100000_2(this, 17));
        C221108m2.LIZIZ(new AqS152S0100000_2(this, 11));
        C221108m2.LIZIZ(new AqS152S0100000_2(this, 14));
        this.LJLJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 16));
        this.LJLJLJ = new NLEEditor();
    }

    @Override // X.InterfaceC125464wA
    public final boolean LIZJ(EnumC124724uy enumC124724uy) {
        return LJJJJIZL().LIZJ(enumC124724uy);
    }

    @Override // X.InterfaceC125324vw
    public final boolean LJIIJJI(EnumC124724uy enumC124724uy) {
        return LIZLLL().LJIIJJI(enumC124724uy);
    }

    @Override // X.InterfaceC125464wA
    public final boolean LJIIL(EnumC124724uy enumC124724uy) {
        return LJJJJIZL().LJIIL(enumC124724uy);
    }

    @Override // X.InterfaceC125094vZ
    public final void LJJI(long j) {
        LJJIJIIJIL().LJJI(j);
    }

    @Override // X.InterfaceC125484wC
    public final NLETrackSlot LJJII(C124844vA param) {
        o.LJIIIZ(param, "param");
        return LIZIZ().LJJII(param);
    }

    @Override // X.InterfaceC125464wA
    public final boolean LJJIJL(EnumC124724uy enumC124724uy) {
        return LJJJJIZL().LJJIJL(enumC124724uy);
    }

    @Override // X.InterfaceC125324vw
    public final NLETrackSlot LJJIL(EnumC124724uy enumC124724uy) {
        return LIZLLL().LJJIL(enumC124724uy);
    }

    @Override // X.InterfaceC125464wA
    public final boolean LJJJI(EnumC124724uy enumC124724uy) {
        return LJJJJIZL().LJJJI(enumC124724uy);
    }

    @Override // X.InterfaceC125004vQ
    public final void t9(NLEEditor nLEEditor) {
        this.LJLJLJ = nLEEditor;
    }

    @Override // X.InterfaceC125464wA
    public final void LJFF(C124804v6 c124804v6, EnumC124724uy enumC124724uy) {
        LJJJJIZL().LJFF(c124804v6, enumC124724uy);
    }

    @Override // X.InterfaceC125464wA
    public final void LJI(float f, EnumC124724uy enumC124724uy) {
        LJJJJIZL().LJI(f, enumC124724uy);
    }

    @Override // X.InterfaceC125474wB
    public final NLETrackSlot LJIIJ(EditMedia editMedia, C124884vE c124884vE) {
        return LJIILJJIL().LJIIJ(editMedia, c124884vE);
    }

    @Override // X.InterfaceC125094vZ
    public final void LJIIZILJ(C124984vO c124984vO, EnumC124724uy enumC124724uy) {
        LJJIJIIJIL().LJIIZILJ(c124984vO, EnumC124724uy.COMMIT);
    }

    @Override // X.InterfaceC125474wB
    public final void LJIJ(List<EditMedia> list, C124884vE c124884vE) {
        LJIILJJIL().LJIJ(list, c124884vE);
    }

    @Override // X.InterfaceC125094vZ
    public final void LJIJJ(C124984vO param, EnumC124724uy enumC124724uy) {
        o.LJIIIZ(param, "param");
        LJJIJIIJIL().LJIJJ(param, enumC124724uy);
    }

    @Override // X.InterfaceC125324vw
    public final NLETrackSlot LJIL(C124664us c124664us, EnumC124724uy enumC124724uy) {
        return LIZLLL().LJIL(c124664us, enumC124724uy);
    }

    @Override // X.InterfaceC122854rx
    public final OSZ<NLETrack, NLETrackSlot> LJJIII(NLETrackSlot nLETrackSlot, EnumC124724uy enumC124724uy) {
        return ((InterfaceC122854rx) this.LJLJL.getValue()).LJJIII(nLETrackSlot, enumC124724uy);
    }

    @Override // X.InterfaceC125324vw
    public final NLETrackSlot LJJIIJ(EnumC124724uy enumC124724uy, String utf8Code) {
        o.LJIIIZ(utf8Code, "utf8Code");
        return LIZLLL().LJJIIJ(enumC124724uy, utf8Code);
    }

    @Override // X.InterfaceC125324vw
    public final NLETrackSlot LJJIIJZLJL(C124674ut c124674ut, EnumC124724uy enumC124724uy) {
        return LIZLLL().LJJIIJZLJL(c124674ut, enumC124724uy);
    }

    @Override // X.InterfaceC125324vw
    public final boolean LJJIIZI(Float f, EnumC124724uy enumC124724uy) {
        return LIZLLL().LJJIIZI(f, enumC124724uy);
    }

    @Override // X.InterfaceC125464wA
    public final void LJJIJIIJI(boolean z, EnumC124724uy enumC124724uy) {
        LJJJJIZL().LJJIJIIJI(z, enumC124724uy);
    }

    @Override // X.InterfaceC125324vw
    public final NLETrackSlot LJJIJLIJ(boolean z, EnumC124724uy enumC124724uy) {
        return LIZLLL().LJJIJLIJ(z, enumC124724uy);
    }

    @Override // X.InterfaceC125484wC
    public final OSZ<NLETrack, NLETrackSlot> LJJIZ(NLETrackSlot nLETrackSlot, EnumC124724uy enumC124724uy) {
        return LIZIZ().LJJIZ(nLETrackSlot, enumC124724uy);
    }

    @Override // X.InterfaceC125484wC
    public final void LJJJ(C124824v8 c124824v8, EnumC124724uy enumC124724uy) {
        LIZIZ().LJJJ(c124824v8, enumC124724uy);
    }

    @Override // X.InterfaceC125464wA
    public final OSZ<NLETrack, NLETrackSlot> LJJJJL(NLETrackSlot nLETrackSlot, EnumC124724uy enumC124724uy) {
        return LJJJJIZL().LJJJJL(nLETrackSlot, enumC124724uy);
    }

    @Override // X.InterfaceC125484wC
    public final NLETrackSlot LJJJJLI(C124844vA c124844vA, EnumC124724uy enumC124724uy) {
        return LIZIZ().LJJJJLI(c124844vA, enumC124724uy);
    }

    @Override // X.InterfaceC125324vw
    public final boolean LJJJJZ(Float f, EnumC124724uy enumC124724uy) {
        return LIZLLL().LJJJJZ(f, enumC124724uy);
    }

    @Override // X.InterfaceC125464wA
    public final void LJJJJZI(C124824v8 c124824v8, EnumC124724uy enumC124724uy) {
        LJJJJIZL().LJJJJZI(c124824v8, enumC124724uy);
    }

    @Override // X.InterfaceC125094vZ
    public final void LJJJLL(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2) {
        LJJIJIIJIL().LJJJLL(nLETrackSlot, nLETrackSlot2);
    }

    @Override // X.InterfaceC125474wB
    public final boolean LJIJI(List selectedMedias, Boolean bool, AqS152S0100000_2 aqS152S0100000_2) {
        o.LJIIIZ(selectedMedias, "selectedMedias");
        return LJIILJJIL().LJIJI(selectedMedias, bool, aqS152S0100000_2);
    }

    @Override // X.InterfaceC122854rx
    public final NLETrackSlot LJIJJLI(NLETrack nLETrack, C122834rv c122834rv, EnumC124724uy enumC124724uy) {
        return ((InterfaceC122854rx) this.LJLJL.getValue()).LJIJJLI(nLETrack, c122834rv, enumC124724uy);
    }

    @Override // X.InterfaceC122854rx
    public final NLETrackSlot LJJ(NLETrackSlot nLETrackSlot, C122814rt c122814rt, EnumC124724uy enumC124724uy) {
        return ((InterfaceC122854rx) this.LJLJL.getValue()).LJJ(nLETrackSlot, c122814rt, enumC124724uy);
    }

    @Override // X.InterfaceC125324vw
    public final C125674wV LJJJIL(TextStyleInfo info, String str, EnumC124724uy enumC124724uy) {
        o.LJIIIZ(info, "info");
        return LIZLLL().LJJJIL(info, str, enumC124724uy);
    }

    @Override // X.InterfaceC125324vw
    public final boolean LJJJJ(Float f, Float f2, EnumC124724uy enumC124724uy) {
        return LIZLLL().LJJJJ(f, f2, enumC124724uy);
    }

    @Override // X.InterfaceC125324vw
    public final boolean LJJJJI(Float f, Float f2, EnumC124724uy enumC124724uy) {
        return LIZLLL().LJJJJI(f, f2, enumC124724uy);
    }

    @Override // X.InterfaceC125324vw
    public final boolean LJJJJJL(Boolean bool, boolean z, EnumC124724uy enumC124724uy) {
        return LIZLLL().LJJJJJL(bool, z, enumC124724uy);
    }

    @Override // X.InterfaceC122854rx
    public final NLETrackSlot LJJJLZIJ(NLETrack nLETrack, C122814rt c122814rt, EnumC124724uy enumC124724uy) {
        return ((InterfaceC122854rx) this.LJLJL.getValue()).LJJJLZIJ(nLETrack, c122814rt, enumC124724uy);
    }

    @Override // X.InterfaceC125474wB
    public final void LJIIIIZZ(NLETrack nLETrack, NLETrackSlot nLETrackSlot, boolean z, boolean z2) {
        LJIILJJIL().LJIIIIZZ(nLETrack, nLETrackSlot, z, z2);
    }

    @Override // X.InterfaceC125474wB
    public final void LJIIIZ(NLETrackSlot slot, long j, long j2, EnumC124724uy enumC124724uy) {
        o.LJIIIZ(slot, "slot");
        LJIILJJIL().LJIIIZ(slot, j, j2, enumC124724uy);
    }

    @Override // X.InterfaceC125474wB
    public final void LJJIFFI(NLETrackSlot nleTrackSlot, int i, int i2, EnumC124724uy enumC124724uy) {
        o.LJIIIZ(nleTrackSlot, "nleTrackSlot");
        LJIILJJIL().LJJIFFI(nleTrackSlot, i, i2, enumC124724uy);
    }

    @Override // X.InterfaceC125324vw
    public final boolean LJJIIZ(NLETrackSlot nLETrackSlot, Long l, Long l2, EnumC124724uy enumC124724uy) {
        return LIZLLL().LJJIIZ(nLETrackSlot, l, l2, enumC124724uy);
    }

    @Override // X.InterfaceC125484wC
    public final NLETrackSlot LJJJLIIL(NLETrackSlot nLETrackSlot, C124844vA c124844vA, int i, EnumC124724uy enumC124724uy) {
        return LIZIZ().LJJJLIIL(nLETrackSlot, c124844vA, i, enumC124724uy);
    }

    @Override // X.InterfaceC125474wB
    public final void LJIILLIIL(NLETrackSlot slot, long j, long j2, int i, EnumC124724uy enumC124724uy) {
        o.LJIIIZ(slot, "slot");
        LJIILJJIL().LJIILLIIL(slot, j, j2, i, enumC124724uy);
    }

    @Override // X.InterfaceC125474wB
    public final void LJIILL(int i, int i2, NLETrackSlot slot, long j, long j2, long j3, boolean z, EnumC124724uy enumC124724uy) {
        o.LJIIIZ(slot, "slot");
        LJIILJJIL().LJIILL(i, i2, slot, j, j2, j3, z, enumC124724uy);
    }
}
