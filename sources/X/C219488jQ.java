package X;

import com.ss.android.ugc.tiktok.addyours.ui.vm.AddYoursDetailViewModel;
import kotlin.jvm.internal.AqS1S0000001_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8jQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219488jQ extends AbstractC65781Prl implements InterfaceC88472Yns<C219458jN, C76800UCe> {
    public final /* synthetic */ AddYoursDetailViewModel LJLIL;
    public final /* synthetic */ float LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219488jQ(AddYoursDetailViewModel addYoursDetailViewModel, float f) {
        super(1);
        this.LJLIL = addYoursDetailViewModel;
        this.LJLILLLLZI = f;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C219458jN it) {
        o.LJIIIZ(it, "it");
        this.LJLIL.setState(new AqS1S0000001_3(this.LJLILLLLZI, 0));
        return C76800UCe.LIZ;
    }
}
