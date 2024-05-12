package X;

import android.content.DialogInterface;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.music.model.DspPlatform;

/* renamed from: X.aTA, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class DialogInterfaceOnCancelListenerC93580aTA implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DspPlatform LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public DialogInterfaceOnCancelListenerC93580aTA(DspPlatform dspPlatform, boolean z) {
        this.LJLIL = dspPlatform;
        this.LJLILLLLZI = z;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        C94302aeo c94302aeo = C94302aeo.LJLIL;
        DspPlatform dspPlatform = this.LJLIL;
        Long l = C94302aeo.LJLL;
        C94302aeo.LJLL = null;
        C94302aeo.LJJIII(c94302aeo, CardStruct.IStatusCode.DEFAULT, "cancel", dspPlatform, l, Boolean.TRUE, this.LJLILLLLZI, "link", "music_setting", "null");
    }
}
