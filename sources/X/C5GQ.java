package X;

import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.5GQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5GQ extends AbstractC65781Prl implements InterfaceC88472Yns<String, C76800UCe> {
    public final /* synthetic */ C5LN LJLIL;
    public final /* synthetic */ EffectModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5GQ(C5LN c5ln, EffectModel effectModel, String str, int i, long j) {
        super(1);
        this.LJLIL = c5ln;
        this.LJLILLLLZI = effectModel;
        this.LJLJI = str;
        this.LJLJJI = i;
        this.LJLJJL = j;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(String str) {
        String it = str;
        o.LJIIIZ(it, "it");
        this.LJLIL.LJJZZI(C5GR.LJLIL);
        VideoPublishEditModel LLJ = this.LJLIL.LLJ();
        String str2 = this.LJLILLLLZI.key;
        o.LJIIIIZZ(str2, "effectModel.key");
        C135005Ro.LIZJ(LLJ, str2, this.LJLJI, this.LJLJJI, it, System.currentTimeMillis() - this.LJLJJL, Integer.valueOf(this.LJLILLLLZI.source), this.LJLILLLLZI.designerId);
        return C76800UCe.LIZ;
    }
}
