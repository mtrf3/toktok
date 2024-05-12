package X;

import android.content.Context;
import com.ss.android.ugc.aweme.choosemusic.fragment.MusicClassDetailFragment;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;

/* renamed from: X.OfE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62456OfE extends C62415OeZ {
    public final /* synthetic */ MusicClassDetailFragment LIZ;

    public C62456OfE(MusicClassDetailFragment musicClassDetailFragment) {
        this.LIZ = musicClassDetailFragment;
    }

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LIZIZ(Context context, BaseSharePackage baseSharePackage, InterfaceC62486Ofi interfaceC62486Ofi) {
        super.LIZIZ(context, baseSharePackage, interfaceC62486Ofi);
        if (C62379Odz.LIZ(interfaceC62486Ofi)) {
            MusicClassDetailFragment musicClassDetailFragment = this.LIZ;
            XVF.LJIILIIL(musicClassDetailFragment.LJLLLLLL, musicClassDetailFragment.LJLLL, musicClassDetailFragment.LJLLLL, interfaceC62486Ofi.key());
        }
    }

    @Override // X.C62415OeZ, X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV interfaceC62225ObV, boolean z, BaseSharePackage baseSharePackage, Context context) {
        super.LIZ(interfaceC62225ObV, z, baseSharePackage, context);
        MusicClassDetailFragment musicClassDetailFragment = this.LIZ;
        XVF.LJIILIIL(musicClassDetailFragment.LJLLLLLL, musicClassDetailFragment.LJLLL, musicClassDetailFragment.LJLLLL, interfaceC62225ObV.key());
    }
}
