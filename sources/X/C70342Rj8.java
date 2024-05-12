package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import java.util.List;

/* renamed from: X.Rj8, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C70342Rj8 implements InterfaceC27538ArO {
    public String LJLIL;
    public C70858RrS LJLILLLLZI;

    @Override // X.InterfaceC37828Esy
    public final String getPageNameKey() {
        return "page_name";
    }

    @Override // X.InterfaceC37828Esy
    public String getPageName() {
        String str = this.LJLIL;
        if (str == null) {
            return "fe_page";
        }
        return str;
    }

    @Override // X.InterfaceC71003Rtn
    public final InterfaceC71003Rtn preTrackNode() {
        return C79234V7u.LJIILL(this);
    }

    @Override // X.InterfaceC37828Esy
    public final java.util.Map<String, String> getMapRule() {
        return C70567Rml.LIZIZ;
    }

    @Override // X.InterfaceC71003Rtn
    public final List<String> getRegisteredLane() {
        return C70567Rml.LIZ;
    }

    @Override // X.InterfaceC71003Rtn, X.InterfaceC70849RrJ
    public final void fillNodeParams(C70858RrS c70858RrS) {
        C70858RrS c70858RrS2 = this.LJLILLLLZI;
        if (c70858RrS2 != null) {
            c70858RrS.LIZJ(c70858RrS2);
        }
    }

    @Override // X.InterfaceC27538ArO
    public final void setupTrack(View view, LifecycleOwner lifecycleOwner) {
        C70853RrN.LIZ(this, view, lifecycleOwner);
    }
}
