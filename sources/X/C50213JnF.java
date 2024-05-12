package X;

import Y.ACListenerS43S0200000_8;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.SearchHubPictureComponent;
import kotlin.jvm.internal.AqS78S0400000_8;
import kotlin.jvm.internal.o;
import v82.IDdS501S0100000_8;

/* renamed from: X.JnF, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50213JnF extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, C50214JnG, C76800UCe> {
    public final /* synthetic */ FrameLayout LJLIL;
    public final /* synthetic */ C68322mC<InterfaceC222288nw> LJLILLLLZI;
    public final /* synthetic */ SearchHubPictureComponent LJLJI;
    public final /* synthetic */ C68322mC<String> LJLJJI;
    public final /* synthetic */ ImageView LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C50213JnF(FrameLayout frameLayout, C68322mC<InterfaceC222288nw> c68322mC, SearchHubPictureComponent searchHubPictureComponent, C68322mC<String> c68322mC2, ImageView imageView) {
        super(2);
        this.LJLIL = frameLayout;
        this.LJLILLLLZI = c68322mC;
        this.LJLJI = searchHubPictureComponent;
        this.LJLJJI = c68322mC2;
        this.LJLJJL = imageView;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, X.8nw] */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UIAssem selectSubscribe, C50214JnG c50214JnG) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c50214JnG == null) {
            this.LJLIL.setVisibility(4);
            return;
        }
        this.LJLIL.setVisibility(0);
        C34K c34k = new C34K();
        InterfaceC222288nw interfaceC222288nw = this.LJLILLLLZI.element;
        if (interfaceC222288nw != null) {
            interfaceC222288nw.dispose();
        }
        this.LJLILLLLZI.element = C8YN.LJII(selectSubscribe, (AssemViewModel) this.LJLJI.LJLJLLL.getValue(), new TBT() { // from class: X.JnH
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Integer.valueOf(((C50201Jn3) obj).LJLJJLL);
            }
        }, null, new AqS78S0400000_8(this.LJLIL, c34k, this.LJLJI, c50214JnG, 0), 6);
        C16880lQ.LJIILJJIL(this.LJLIL, new ACListenerS43S0200000_8(this.LJLJI, c50214JnG, 5));
        if (!o.LJ(c50214JnG.LJLJI, this.LJLJJI.element)) {
            W5U.LJIIIIZZ(c50214JnG.LJLJI).LJIIIZ(new IDdS501S0100000_8(this.LJLJJL, 2));
        }
        this.LJLJJI.element = c50214JnG.LJLJI;
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(UIAssem uIAssem, C50214JnG c50214JnG) {
        invoke2(uIAssem, c50214JnG);
        return C76800UCe.LIZ;
    }
}
