package X;

import android.view.View;
import com.bytedance.android.live.effect.music.LiveBGMMiniWidget;
import fjb.a;
import kotlin.jvm.internal.o;
import webcast.data.MusicSong;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.music.LiveBGMMiniWidget$observeViewModel$1$1$1", f = "LiveBGMMiniWidget.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2Er, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55212Er extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ LiveBGMMiniWidget LJLIL;
    public final /* synthetic */ AbstractC17370mD LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55212Er(LiveBGMMiniWidget liveBGMMiniWidget, AbstractC17370mD abstractC17370mD, InterfaceC67352kd<? super C55212Er> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = liveBGMMiniWidget;
        this.LJLILLLLZI = abstractC17370mD;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55212Er(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C141335gf.LIZJ(obj);
        LiveBGMMiniWidget liveBGMMiniWidget = this.LJLIL;
        liveBGMMiniWidget.LJLLL = ((C34181Vu) this.LJLILLLLZI).LIZ;
        String str3 = null;
        liveBGMMiniWidget.LJZI(null);
        BQO LIZ = C15650jR.LIZ();
        MusicSong musicSong = this.LJLIL.LJLLL;
        if (musicSong != null) {
            str = musicSong.coverUrl;
        } else {
            str = null;
        }
        C78720Uuy url = LIZ.setUrl(str);
        View view = this.LJLIL.LJLLILLLL;
        if (view != null) {
            url.LJIIJJI(view);
            CL0 cl0 = this.LJLIL.LJLLJ;
            if (cl0 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                MusicSong musicSong2 = this.LJLIL.LJLLL;
                if (musicSong2 != null) {
                    str2 = musicSong2.title;
                } else {
                    str2 = null;
                }
                LIZ2.append(str2);
                LIZ2.append('-');
                MusicSong musicSong3 = this.LJLIL.LJLLL;
                if (musicSong3 != null) {
                    str3 = musicSong3.author;
                }
                LIZ2.append(str3);
                cl0.setText(X1D.LIZIZ(LIZ2));
                this.LJLIL.LL(C14260hC.LJIIJJI);
                return C76800UCe.LIZ;
            }
            o.LJIJI("bgmTitle");
            throw null;
        }
        o.LJIJI("bgmCover");
        throw null;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
