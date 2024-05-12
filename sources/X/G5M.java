package X;

import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import com.ss.android.ugc.aweme.topic.TopicCommonService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* loaded from: classes8.dex */
public final class G5M implements InterfaceC187177Wf {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ HashMap LJLILLLLZI;
    public final /* synthetic */ VideoPublishContainerScene LJLJI;

    @Override // X.InterfaceC187177Wf
    public final void LLLLLILLIL() {
    }

    @Override // X.InterfaceC187177Wf
    public final void S2() {
        View findViewById;
        View findViewById2;
        View findViewById3 = this.LJLIL.findViewById(R.id.d2d);
        if (findViewById3 != null && (findViewById = findViewById3.findViewById(R.id.i57)) != null && (findViewById2 = findViewById.findViewById(R.id.lao)) != null && this.LJLJI.LLILIL.getText() != null && !this.LJLILLLLZI.isEmpty()) {
            TopicCommonService.LIZJ().LIZIZ(this.LJLJI.LLILIL.getText().toString(), findViewById2, this.LJLILLLLZI);
        }
    }

    public G5M(VideoPublishContainerScene videoPublishContainerScene, View view, HashMap hashMap) {
        this.LJLJI = videoPublishContainerScene;
        this.LJLIL = view;
        this.LJLILLLLZI = hashMap;
    }
}
