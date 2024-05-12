package X;

import android.content.Context;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDetailNavBarAssem;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.Oe1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62381Oe1 extends C62415OeZ {
    public final /* synthetic */ Music LIZ;
    public final /* synthetic */ MusicDetailNavBarAssem LIZIZ;

    public C62381Oe1(Music music, MusicDetailNavBarAssem musicDetailNavBarAssem) {
        this.LIZ = music;
        this.LIZIZ = musicDetailNavBarAssem;
    }

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LIZIZ(Context context, BaseSharePackage sharePackage, InterfaceC62486Ofi action) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        if (C62379Odz.LIZ(action)) {
            String mid = this.LIZ.getMid();
            o.LJIIIIZZ(mid, "music.mid");
            C62395OeF.LJFF(mid, action.key(), this.LIZIZ.N3());
            String mid2 = this.LIZ.getMid();
            o.LJIIIIZZ(mid2, "music.mid");
            C62395OeF.LJI(mid2, action.key(), true);
        }
    }

    @Override // X.C62415OeZ, X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        String mid = this.LIZ.getMid();
        o.LJIIIIZZ(mid, "music.mid");
        C62395OeF.LJFF(mid, channel.key(), this.LIZIZ.N3());
        String mid2 = this.LIZ.getMid();
        o.LJIIIIZZ(mid2, "music.mid");
        C62395OeF.LJI(mid2, channel.key(), z);
    }
}
