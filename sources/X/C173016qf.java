package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.VecUInt32;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import defpackage.e1;
import java.util.ArrayList;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.6qf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C173016qf implements InterfaceC163636bX {
    @Override // X.InterfaceC163636bX
    public final boolean LJ() {
        if (e1.LIZ(31744, "support_multiple_selection_of_the_same_material", true, false) && !C1DG.LJIIIIZZ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163636bX
    public final boolean LJI() {
        if (C43118Gw6.LIZ() && !C1DG.LJIIIIZZ()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC163636bX
    public final String LIZ() {
        return C173026qg.LIZ;
    }

    @Override // X.InterfaceC163636bX
    public final void LIZIZ(CutsameDataItem cutsameDataItem) {
        C172976qb.LIZ.LIZ();
        com.bytedance.ies.nleeditor.NLE.INSTANCE.loadNLELibrary(true);
        C45244HpI.LIZ.LIZIZ(new AqS157S0100000_7(cutsameDataItem, 600));
    }

    @Override // X.InterfaceC163636bX
    public final Intent LIZJ(CutSameEditData cutSameEditData) {
        return new Intent();
    }

    @Override // X.InterfaceC163636bX
    public final boolean LIZLLL(ArrayList<Long> featureBits) {
        o.LJIIIZ(featureBits, "featureBits");
        com.bytedance.ies.nleeditor.NLE.INSTANCE.loadNLELibrary(true);
        VecUInt32 vecUInt32 = new VecUInt32();
        vecUInt32.addAll(featureBits);
        return NLETemplateModel.canSupportFeatureBits(vecUInt32);
    }

    @Override // X.InterfaceC163636bX
    public final void LJFF(Activity activity, CutsameDataItem cutSameItem, ShortVideoContext shortVideoContext) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(cutSameItem, "cutSameItem");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        new C172826qM(activity, cutSameItem, shortVideoContext).LIZ();
    }
}
