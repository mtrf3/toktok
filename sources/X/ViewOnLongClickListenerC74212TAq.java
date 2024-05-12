package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IAssistantService;
import kotlin.jvm.internal.o;

/* renamed from: X.TAq, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnLongClickListenerC74212TAq implements View.OnLongClickListener {
    public final /* synthetic */ C74211TAp LJLIL;

    public ViewOnLongClickListenerC74212TAq(C74211TAp c74211TAp) {
        this.LJLIL = c74211TAp;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        IAssistantService iAssistantService = (IAssistantService) ServiceManager.get().getService(IAssistantService.class);
        if (iAssistantService != null) {
            Context context = this.LJLIL.LJLIL.getContext();
            o.LJIIIIZZ(context, "item.context");
            iAssistantService.openPage(context);
            return true;
        }
        return true;
    }
}
