package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.search.core.communicate.SearchDynamicServiceImpl;
import java.util.HashMap;

/* renamed from: X.aTB, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class ViewOnClickListenerC93581aTB implements View.OnClickListener {
    public final /* synthetic */ TuxIconView LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<Boolean> LJLILLLLZI;
    public final /* synthetic */ HashMap<String, String> LJLJI;
    public final /* synthetic */ SearchDynamicServiceImpl LJLJJI;
    public final /* synthetic */ Fragment LJLJJL;
    public final /* synthetic */ K55 LJLJJLL;

    public ViewOnClickListenerC93581aTB(TuxIconView tuxIconView, KI2 ki2, HashMap hashMap, SearchDynamicServiceImpl searchDynamicServiceImpl, Fragment fragment, KI3 ki3) {
        this.LJLIL = tuxIconView;
        this.LJLILLLLZI = ki2;
        this.LJLJI = hashMap;
        this.LJLJJI = searchDynamicServiceImpl;
        this.LJLJJL = fragment;
        this.LJLJJLL = ki3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (C6ZT.LIZ(this.LJLIL)) {
            return;
        }
        boolean booleanValue = this.LJLILLLLZI.invoke().booleanValue();
        KeyboardUtils.LIZIZ(view);
        C188727au c188727au = new C188727au();
        c188727au.LJII(this.LJLJI);
        c188727au.LJIIIZ("is_song_recog", "1");
        FMX.LJIIL("click_voice_button", c188727au.LIZ);
        this.LJLJJI.startVoiceSearch(this.LJLJJL.mo49getActivity(), this.LJLJI, booleanValue, this.LJLJJLL, "choose_music", 2);
    }
}
