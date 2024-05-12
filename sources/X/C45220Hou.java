package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import java.util.List;
import kotlin.jvm.internal.AqS107S0101000_7;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hou, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45220Hou implements InterfaceC45227Hp1 {
    public final C82622Wbi LIZ;
    public final C45205Hof LIZIZ;
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

    @Override // X.InterfaceC45209Hoj
    public final void LJIILLIIL() {
        C6QQ.LIZ(new AqS157S0100000_7(this, 566));
    }

    public final InterfaceC45213Hon LJIJJ() {
        return (InterfaceC45213Hon) this.LIZJ.getValue();
    }

    @Override // X.InterfaceC45227Hp1
    public final void LJJJLL() {
        C6QQ.LIZ(new AqS157S0100000_7(this, 564));
    }

    @Override // X.InterfaceC45227Hp1
    public final void LJI() {
        InterfaceC45213Hon LJIJJ = LJIJJ();
        if (LJIJJ != null) {
            LJIJJ.Sr0(this.LIZIZ);
        }
    }

    @Override // X.InterfaceC45227Hp1
    public final void LLLZIL() {
        InterfaceC45213Hon LJIJJ = LJIJJ();
        if (LJIJJ != null) {
            LJIJJ.LLLZIL();
        }
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIIZ(EnumC45211Hol status) {
        o.LJIIIZ(status, "status");
        C6QQ.LIZ(new AqS154S0200000_7(this, status, 110));
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIZILJ(C44716Hgm c44716Hgm) {
        C6QQ.LIZ(new AqS157S0100000_7(this, 565));
    }

    @Override // X.InterfaceC45209Hoj
    public final void onProgress(int i) {
        C6QQ.LIZ(new AqS107S0101000_7(this, i, 10));
    }

    public C45220Hou(C82622Wbi c82622Wbi, C45205Hof config) {
        o.LJIIIZ(config, "config");
        this.LIZ = c82622Wbi;
        this.LIZIZ = config;
        this.LIZJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 563));
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIILJJIL(String taskId, List musicList) {
        o.LJIIIZ(musicList, "musicList");
        o.LJIIIZ(taskId, "taskId");
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIILL(int i, Integer num, String str, EnumC45211Hol errStatus) {
        o.LJIIIZ(errStatus, "errStatus");
        C6QQ.LIZ(new AqS154S0200000_7(this, errStatus, 109));
    }
}
