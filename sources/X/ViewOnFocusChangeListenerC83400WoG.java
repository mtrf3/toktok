package X;

import android.view.View;
import com.ss.android.ugc.aweme.actionai.sdk.ActionAISDKAgent;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.o;

/* renamed from: X.WoG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnFocusChangeListenerC83400WoG implements View.OnFocusChangeListener {
    public final /* synthetic */ C83399WoF LJLIL;

    public ViewOnFocusChangeListenerC83400WoG(C83399WoF c83399WoF) {
        this.LJLIL = c83399WoF;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            C83399WoF c83399WoF = this.LJLIL;
            if (c83399WoF.LJLJLJ) {
                VideoPublishEditModel model = c83399WoF.LLLLIL();
                String str = ActionAISDKAgent.LJLJJLL;
                o.LJIIIZ(model, "model");
                C188727au c188727au = new C188727au();
                C83348WnQ.LIZLLL(model, c188727au);
                c188727au.LJIIIZ("enter_from", "video_edit_page_tikbot");
                c188727au.LJIIIZ("enter_method", "click_icon");
                c188727au.LJIIIZ("process_id", str);
                c188727au.LJI("button_type", "input");
                FMX.LJIIL("tikbot_input_button_click", c188727au.LIZ);
                this.LJLIL.LJLJLJ = false;
            }
        }
    }
}
