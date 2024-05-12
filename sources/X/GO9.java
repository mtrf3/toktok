package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GO9 implements InterfaceC41416GNg {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(GO1.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(GOG.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(GOE.LJLIL);
    public final C62822Ol8 LIZLLL = C221108m2.LIZIZ(GOF.LJLIL);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(GOC.LJLIL);
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(GOD.LJLIL);
    public boolean LJI;

    @Override // X.InterfaceC41416GNg
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC41416GNg
    public final GNI LIZ() {
        return (GNI) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC41416GNg
    public final boolean LIZIZ() {
        GO2.LIZ.getClass();
        return GO2.LIZJ.getBoolean("posted_draft_show_guide", true);
    }

    @Override // X.InterfaceC41416GNg
    public final InterfaceC41417GNh LIZJ() {
        return (InterfaceC41417GNh) this.LIZIZ.getValue();
    }

    @Override // X.InterfaceC41416GNg
    public final InterfaceC41418GNi LIZLLL() {
        return (InterfaceC41418GNi) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC41416GNg
    public final boolean LJ() {
        GO2.LIZ.getClass();
        return GO2.LIZJ.getBoolean("posted_draft_status", true);
    }

    @Override // X.InterfaceC41416GNg
    public final InterfaceC41392GMi LJFF() {
        return (InterfaceC41392GMi) this.LIZ.getValue();
    }

    @Override // X.InterfaceC41416GNg
    public final GPT LJI() {
        return (GPT) this.LJ.getValue();
    }

    @Override // X.InterfaceC41416GNg
    public final InterfaceC41420GNk LJIIJ() {
        return (InterfaceC41420GNk) this.LJFF.getValue();
    }

    @Override // X.InterfaceC41416GNg
    public final void LJIIJJI() {
        GO2.LIZ.getClass();
        GO2.LIZJ.storeBoolean("posted_draft_show_guide", false);
    }

    @Override // X.InterfaceC41416GNg
    public final List<String> genCreationIdsOfVisibleDraft() {
        return ORZ.LLJI(((Keva) ETA.LIZ.getValue()).getAll().keySet());
    }

    @Override // X.InterfaceC41416GNg
    public final boolean enableAddDraftLossMonitor() {
        return GOA.LIZ();
    }

    @Override // X.InterfaceC41416GNg
    public final boolean LJIILIIL() {
        return this.LJI;
    }

    @Override // X.InterfaceC41416GNg
    public final void LJIIIZ(boolean z) {
        this.LJI = z;
    }

    @Override // X.InterfaceC41416GNg
    public final void LJIIL(List<String> list) {
        o.LJIIIZ(list, "list");
        String str = "";
        for (String str2 : list) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(((Keva) ETA.LIZ.getValue()).getString(str2, ""));
            LIZ.append(';');
            str = X1D.LIZIZ(LIZ);
        }
        C78983UzD.LJIIZILJ(new GOB(str));
    }

    @Override // X.InterfaceC41416GNg
    public final void LJII(ActivityC45651qj activityC45651qj, AwemeDraft awemeDraft, GMH gmh) {
        C41663GWt.LIZJ(activityC45651qj, awemeDraft, 1000, System.currentTimeMillis(), null, gmh);
    }
}
