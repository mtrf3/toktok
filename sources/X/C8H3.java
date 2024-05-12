package X;

import Y.AfS52S0200000_3;
import Y.IDhS102S0100000_9;
import android.graphics.Bitmap;
import android.view.View;
import com.ss.android.ugc.aweme.music.v2.assem.MusicHeaderBackgroundAssem;

/* renamed from: X.8H3, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8H3 implements InterfaceC78660Uu0 {
    public final /* synthetic */ MusicHeaderBackgroundAssem LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    @Override // X.InterfaceC78660Uu0
    public final void LIZ() {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onFailed(Throwable th) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void onProgress(float f) {
    }

    @Override // X.InterfaceC78660Uu0
    public final void LIZIZ(Bitmap bitmap) {
        if (bitmap == null) {
            return;
        }
        MusicHeaderBackgroundAssem musicHeaderBackgroundAssem = this.LJLIL;
        View view = this.LJLILLLLZI;
        musicHeaderBackgroundAssem.getClass();
        AbstractC73672Svk.LJJIJIL(0).LJJJ(T16.LIZIZ).LJJIJL(new IDhS102S0100000_9(bitmap, 18)).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS52S0200000_3(musicHeaderBackgroundAssem, view, 22), new InterfaceC64592gB() { // from class: X.8H4
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    public C8H3(View view, MusicHeaderBackgroundAssem musicHeaderBackgroundAssem) {
        this.LJLIL = musicHeaderBackgroundAssem;
        this.LJLILLLLZI = view;
    }
}
