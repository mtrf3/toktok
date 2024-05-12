package X;

import com.ss.android.ugc.aweme.kids.choosemusic.fragment.BaseNewMusicTabFragment;

/* renamed from: X.XWi, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84968XWi implements InterfaceC80680VlU {
    public final /* synthetic */ BaseNewMusicTabFragment LIZ;

    @Override // X.InterfaceC80680VlU
    public final void LIZ(C80674VlO c80674VlO) {
    }

    @Override // X.InterfaceC80680VlU
    public final void LIZIZ(C80674VlO c80674VlO) {
    }

    public C84968XWi(BaseNewMusicTabFragment baseNewMusicTabFragment) {
        this.LIZ = baseNewMusicTabFragment;
    }

    @Override // X.InterfaceC80680VlU
    public final void LIZJ(C80674VlO c80674VlO) {
        InterfaceC82683Wch interfaceC82683Wch;
        int i = c80674VlO.LJ;
        if (i == 1 && (interfaceC82683Wch = this.LIZ.LJLIL) != null) {
            interfaceC82683Wch.dismiss();
        }
        AbstractC029409q vl = this.LIZ.vl();
        if (vl != null) {
            if (vl instanceof XX9) {
                ((XX9) vl).LJLLLLLL();
            } else if (vl instanceof XXC) {
                XXC xxc = (XXC) vl;
                if (((Integer) xxc.LJLILLLLZI.get("music_position", -1)).intValue() != -1) {
                    XY6 xy6 = xxc.LJLJJI;
                    if (xy6 != null) {
                        xy6.k2(null);
                    }
                    xxc.LJLILLLLZI.jv0(-1, "music_position");
                    xxc.LJLILLLLZI.jv0(-1, "music_index");
                }
            }
        }
        this.LIZ.Hl(i);
    }
}
