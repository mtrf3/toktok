package X;

import android.view.View;
import com.ss.android.ugc.aweme.topic.ITopicCommonService;
import com.ss.android.ugc.aweme.topic.TopicCommonService;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G8S implements InterfaceC187177Wf {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ C41051G9f LJLILLLLZI;

    @Override // X.InterfaceC187177Wf
    public final void LLLLLILLIL() {
    }

    @Override // X.InterfaceC187177Wf
    public final void S2() {
        View findViewById;
        View findViewById2;
        HashMap<Integer, Boolean> hashMap;
        View findViewById3 = this.LJLIL.findViewById(R.id.d2d);
        if (findViewById3 != null && (findViewById = findViewById3.findViewById(R.id.i57)) != null && (findViewById2 = findViewById.findViewById(R.id.ebu)) != null) {
            GSR gsr = this.LJLILLLLZI.LJLLILLLL;
            if (gsr != null) {
                if (gsr.getText() != null && (hashMap = this.LJLILLLLZI.LLI) != null && (!hashMap.isEmpty())) {
                    ITopicCommonService LIZJ = TopicCommonService.LIZJ();
                    GSR gsr2 = this.LJLILLLLZI.LJLLILLLL;
                    if (gsr2 != null) {
                        String valueOf = String.valueOf(gsr2.getText());
                        HashMap<Integer, Boolean> hashMap2 = this.LJLILLLLZI.LLI;
                        if (hashMap2 != null) {
                            LIZJ.LIZIZ(valueOf, findViewById2, hashMap2);
                            return;
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    o.LJIJI("mentionEditText");
                    throw null;
                }
                return;
            }
            o.LJIJI("mentionEditText");
            throw null;
        }
    }

    public G8S(View view, C41051G9f c41051G9f) {
        this.LJLIL = view;
        this.LJLILLLLZI = c41051G9f;
    }
}
