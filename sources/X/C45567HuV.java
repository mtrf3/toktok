package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame.CutSameVideoImageExtraData;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.HuV, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45567HuV extends AbstractC65781Prl implements InterfaceC88472Yns<ChooseMediaState, ChooseMediaState> {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ ArrayList<CutSameVideoImageExtraData> LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ boolean LJLJJL;
    public final /* synthetic */ boolean LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45567HuV(int i, ArrayList<CutSameVideoImageExtraData> arrayList, boolean z, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.LJLIL = i;
        this.LJLILLLLZI = arrayList;
        this.LJLJI = z;
        this.LJLJJI = z2;
        this.LJLJJL = z3;
        this.LJLJJLL = z4;
    }

    @Override // X.InterfaceC88472Yns
    public final ChooseMediaState invoke(ChooseMediaState chooseMediaState) {
        ChooseMediaState setState = chooseMediaState;
        o.LJIIIZ(setState, "$this$setState");
        return ChooseMediaState.copy$default(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, false, setState.getPreviewDockerState().copy(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL), null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, -16385, 7, null);
    }
}
