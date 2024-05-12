package X;

import com.ss.android.ugc.aweme.paidcontent.manageseries.viewmodel.ManageSeriesViewModel;
import kotlin.jvm.internal.AqS13S0102000_4;

/* renamed from: X.A0f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25529A0f<T> implements InterfaceC64592gB {
    public final /* synthetic */ ManageSeriesViewModel LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    public C25529A0f(ManageSeriesViewModel manageSeriesViewModel, int i, int i2) {
        this.LJLIL = manageSeriesViewModel;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        this.LJLIL.setState(new AqS13S0102000_4((Throwable) obj, this.LJLILLLLZI, this.LJLJI, 3));
    }
}
