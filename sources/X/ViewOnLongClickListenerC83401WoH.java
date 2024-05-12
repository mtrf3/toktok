package X;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsOfflineService;

/* renamed from: X.WoH, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewOnLongClickListenerC83401WoH implements View.OnLongClickListener {
    public final /* synthetic */ C83399WoF LJLIL;

    public ViewOnLongClickListenerC83401WoH(C83399WoF c83399WoF) {
        this.LJLIL = c83399WoF;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        FragmentManager supportFragmentManager;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(C78688UuS.LJJIII(this.LJLIL));
        if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
            ((IToolsOfflineService) ServiceManager.get().getService(IToolsOfflineService.class)).LIZ(C78688UuS.LJJIII(this.LJLIL), supportFragmentManager);
            return true;
        }
        return true;
    }
}
