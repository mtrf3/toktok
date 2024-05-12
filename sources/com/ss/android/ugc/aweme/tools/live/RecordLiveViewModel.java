package com.ss.android.ugc.aweme.tools.live;

import X.InterfaceC82086WJm;
import X.InterfaceC83865Wvl;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class RecordLiveViewModel extends ViewModel {
    public IRecordingOperationPanel LJLIL;
    public InterfaceC82086WJm LJLILLLLZI;
    public InterfaceC83865Wvl LJLJI;
    public ShortVideoContext LJLJJI;

    public final InterfaceC82086WJm gv0() {
        InterfaceC82086WJm interfaceC82086WJm = this.LJLILLLLZI;
        if (interfaceC82086WJm != null) {
            return interfaceC82086WJm;
        }
        o.LJIJI("cameraApiComponent");
        throw null;
    }
}
