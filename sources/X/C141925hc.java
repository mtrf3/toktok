package X;

import com.ss.android.ugc.aweme.creative.model.music.StickPointMusicAlg;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.audio.MusicBeatGenerate$getMusicAVModel$2", f = "MusicBeatGenerate.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5hc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C141925hc extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super AVMusic>, Object> {
    public final /* synthetic */ C141945he LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C141925hc(C141945he c141945he, InterfaceC67352kd<? super C141925hc> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c141945he;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C141925hc(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        String str;
        String str2;
        StickPointMusicAlg stickPointMusicAlg;
        String str3;
        String str4;
        C141335gf.LIZJ(obj);
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LJLIL.LIZJ.creativeModel.musicBuzModel);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MusicBeatGenerate getMusicBeatsFromMusicInfo is null: ");
        if (extractAVMusic == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        H7C.LJI(3, "music", null, X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("MusicBeatGenerate getMusicBeatsFromMusicInfo name: ");
        if (extractAVMusic != null) {
            str = extractAVMusic.musicName;
        } else {
            str = null;
        }
        LIZ2.append(str);
        H7C.LJI(3, "music", null, X1D.LIZIZ(LIZ2));
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("MusicBeatGenerate getMusicBeatsFromMusicInfo extra: ");
        if (extractAVMusic != null) {
            str2 = extractAVMusic.extra;
        } else {
            str2 = null;
        }
        LIZ3.append(str2);
        H7C.LJI(3, "music", null, X1D.LIZIZ(LIZ3));
        C45771Hxn.LJII(extractAVMusic);
        if (extractAVMusic != null) {
            stickPointMusicAlg = extractAVMusic.getStickPointMusicAlg();
        } else {
            stickPointMusicAlg = null;
        }
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append("MusicBeatGenerate getMusicBeatsFromMusicInfo beats_tracker path ");
        if (stickPointMusicAlg != null) {
            str3 = stickPointMusicAlg.getNoStrengthBeatsPath();
        } else {
            str3 = null;
        }
        LIZ4.append(str3);
        H7C.LJI(3, "music", null, X1D.LIZIZ(LIZ4));
        StringBuilder LIZ5 = X1D.LIZ();
        LIZ5.append("MusicBeatGenerate getMusicBeatsFromMusicInfo merged_beats path ");
        if (stickPointMusicAlg != null) {
            str4 = stickPointMusicAlg.getDownBeatsPath();
        } else {
            str4 = null;
        }
        LIZ5.append(str4);
        H7C.LJI(3, "music", null, X1D.LIZIZ(LIZ5));
        return extractAVMusic;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super AVMusic> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
