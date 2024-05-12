package X;

import Y.ARunnableS2S1300000_2;
import android.os.Handler;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5GP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GP extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C5LN LJLIL;
    public final /* synthetic */ EffectModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5GP(C5LN c5ln, EffectModel effectModel, String str, int i, long j) {
        super(0);
        this.LJLIL = c5ln;
        this.LJLILLLLZI = effectModel;
        this.LJLJI = str;
        this.LJLJJI = i;
        this.LJLJJL = j;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        List<NLETrackSlot> LJIIJ = this.LJLIL.Qt().LJIIJ();
        C5LN c5ln = this.LJLIL;
        EffectModel effectModel = this.LJLILLLLZI;
        String str = this.LJLJI;
        if (!LJIIJ.isEmpty()) {
            NLEFilter nLEFilter = (NLEFilter) ORZ.LJLLLL(((NLETrackSlot) ListProtector.get(LJIIJ, 0)).LJ());
            if (nLEFilter == null || nLEFilter.LIZIZ() == null) {
                c5ln.Q9();
            }
            c5ln.LJJZZI(new AqS168S0100000_2(LJIIJ, (List<C1536461g>) 179));
            new Handler().postDelayed(new ARunnableS2S1300000_2(effectModel, c5ln, LJIIJ, str, 1), 500L);
        }
        VideoPublishEditModel LLJ = this.LJLIL.LLJ();
        String str2 = this.LJLILLLLZI.key;
        o.LJIIIIZZ(str2, "effectModel.key");
        C135005Ro.LIZJ(LLJ, str2, this.LJLJI, this.LJLJJI, "success", System.currentTimeMillis() - this.LJLJJL, Integer.valueOf(this.LJLILLLLZI.source), this.LJLILLLLZI.designerId);
        return C76800UCe.LIZ;
    }
}
