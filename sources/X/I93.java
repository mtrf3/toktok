package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* loaded from: classes8.dex */
public final class I93 implements XUH {
    public final /* synthetic */ I92 LIZ;

    @Override // X.XUH
    public final void LJJIIZI() {
    }

    @Override // X.XUH
    public final void LIZLLL() {
        this.LIZ.getClass();
    }

    @Override // X.XUH
    public final ActivityC45651qj LJJIZ() {
        return this.LIZ.LIZ;
    }

    @Override // X.XUH
    public final void LLIZLLLIL() {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZ.LJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    public I93(I92 i92) {
        this.LIZ = i92;
    }

    @Override // X.XUH
    public final void LJJJJIZL(MusicModel musicModel, Exception exc) {
        InterfaceC88471Ynr<MusicModel, Exception, C76800UCe> interfaceC88471Ynr = this.LIZ.LIZLLL;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(musicModel, exc);
        }
    }

    @Override // X.XUH
    public final void LLLL(MusicModel musicModel, long j) {
        InterfaceC88471Ynr<MusicModel, Long, C76800UCe> interfaceC88471Ynr = this.LIZ.LIZIZ;
        if (interfaceC88471Ynr != null) {
            interfaceC88471Ynr.invoke(musicModel, Long.valueOf(j));
        }
    }

    @Override // X.XUH
    public final void LJJII(MusicModel musicModel, String str, String str2) {
        InterfaceC88473Ynt<String, MusicModel, String, C76800UCe> interfaceC88473Ynt = this.LIZ.LIZJ;
        if (interfaceC88473Ynt != null) {
            interfaceC88473Ynt.invoke(str, musicModel, str2);
        }
    }
}
