package X;

import android.app.Activity;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import java.util.List;
import kotlin.jvm.internal.AqS107S0101000_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HpB, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45237HpB implements InterfaceC45227Hp1 {
    public final Activity LIZ;
    public final InterfaceC45240HpE LIZIZ;
    public final C62822Ol8 LIZJ;

    @Override // X.InterfaceC45209Hoj
    public final void LIZ(NLEModel nLEModel) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LIZLLL(String str) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJ(String str, String str2, int i, int i2, String str3, String str4) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJFF(String str) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJII() {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIIIZZ(String str) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIIZ(EnumC45211Hol status) {
        o.LJIIIZ(status, "status");
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIJ(String str) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIJJI(List<AutoCutMediaModel> list) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIL(int i, int i2, String str, String str2, String str3) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIILIIL(int i, String str, String str2, String str3, String str4, String str5) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIJ(int i) {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIJI(int i, String str) {
    }

    @Override // X.InterfaceC45227Hp1
    public final void LLLZIL() {
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIILLIIL() {
        C6QQ.LIZ(new AqS157S0100000_7(this, 557));
    }

    public final AlertDialogC45239HpD LJIJJ() {
        return (AlertDialogC45239HpD) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC45227Hp1
    public final void LJJJLL() {
        C6QQ.LIZ(new AqS157S0100000_7(this, 554));
    }

    @Override // X.InterfaceC45227Hp1
    public final void LJI() {
        AlertDialogC45239HpD LJIJJ = LJIJJ();
        if (LJIJJ != null && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/aweme/autocut/util/AutoCutLoadingDialog", "show", LJIJJ, new Object[0], "void", new C65300Pk0(false, "()V", "-3914117970337253485")).LIZ) {
            LJIJJ.show();
        }
        AlertDialogC45239HpD LJIJJ2 = LJIJJ();
        if (LJIJJ2 != null) {
            LJIJJ2.LIZIZ();
        }
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIZILJ(C44716Hgm c44716Hgm) {
        C6QQ.LIZ(new AqS157S0100000_7(this, 556));
    }

    @Override // X.InterfaceC45209Hoj
    public final void onProgress(int i) {
        C6QQ.LIZ(new AqS107S0101000_7(this, i, 8));
    }

    public C45237HpB(Activity activity, InterfaceC45240HpE listener) {
        o.LJIIIZ(listener, "listener");
        this.LIZ = activity;
        this.LIZIZ = listener;
        this.LIZJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 555));
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIILJJIL(String taskId, List musicList) {
        o.LJIIIZ(musicList, "musicList");
        o.LJIIIZ(taskId, "taskId");
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIILL(int i, Integer num, String str, EnumC45211Hol errStatus) {
        o.LJIIIZ(errStatus, "errStatus");
        C6QQ.LIZ(new AqS154S0200000_7(errStatus, this, 107));
    }
}
