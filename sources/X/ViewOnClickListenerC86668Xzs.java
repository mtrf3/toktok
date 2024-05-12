package X;

import android.view.View;
import com.ss.android.ugc.aweme.autocaption.VideoCLACaptionViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* renamed from: X.Xzs, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ViewOnClickListenerC86668Xzs implements View.OnClickListener {
    public final /* synthetic */ VideoCLACaptionViewModel LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;

    public ViewOnClickListenerC86668Xzs(VideoCLACaptionViewModel videoCLACaptionViewModel, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3) {
        this.LJLIL = videoCLACaptionViewModel;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = interfaceC65784Pro2;
        this.LJLJJI = interfaceC65784Pro3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Aweme aweme;
        VideoCLACaptionViewModel videoCLACaptionViewModel = this.LJLIL;
        if (videoCLACaptionViewModel.LJLLILLLL) {
            VideoItemParams gv0 = videoCLACaptionViewModel.gv0();
            if (gv0 != null) {
                aweme = gv0.getAweme();
            } else {
                aweme = null;
            }
            if (Y04.LIZIZ(aweme)) {
                this.LJLILLLLZI.invoke();
                return;
            } else {
                this.LJLJI.invoke();
                return;
            }
        }
        this.LJLJJI.invoke();
    }
}
