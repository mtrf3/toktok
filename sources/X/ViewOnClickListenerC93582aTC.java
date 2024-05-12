package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.search.core.communicate.SearchDynamicServiceImpl;
import java.util.HashMap;

/* renamed from: X.aTC, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnClickListenerC93582aTC implements View.OnClickListener {
    public final /* synthetic */ TuxIconView LJLIL;
    public final /* synthetic */ HashMap<String, String> LJLILLLLZI;
    public final /* synthetic */ SearchDynamicServiceImpl LJLJI;
    public final /* synthetic */ Fragment LJLJJI;
    public final /* synthetic */ K55 LJLJJL;

    public ViewOnClickListenerC93582aTC(TuxIconView tuxIconView, HashMap<String, String> hashMap, SearchDynamicServiceImpl searchDynamicServiceImpl, Fragment fragment, K55 k55) {
        this.LJLIL = tuxIconView;
        this.LJLILLLLZI = hashMap;
        this.LJLJI = searchDynamicServiceImpl;
        this.LJLJJI = fragment;
        this.LJLJJL = k55;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C6ZT.LIZ(this.LJLIL)) {
            return;
        }
        KeyboardUtils.LIZIZ(view);
        C188727au c188727au = new C188727au();
        c188727au.LJII(this.LJLILLLLZI);
        c188727au.LJIIIZ("is_song_recog", "1");
        FMX.LJIIL("click_voice_button", c188727au.LIZ);
        this.LJLJI.startVoiceSearch(this.LJLJJI.mo49getActivity(), this.LJLILLLLZI, false, this.LJLJJL, "choose_music", 2);
    }
}
