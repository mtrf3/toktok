package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.XSn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84869XSn {
    public static XTC LIZ(MusicModel musicModel, InterfaceC84870XSo interfaceC84870XSo, String str, String str2) {
        String str3;
        o.LJIIIZ(musicModel, "musicModel");
        String musicId = musicModel.getMusicId();
        o.LJIIIIZZ(musicId, "musicModel.musicId");
        String uri = musicModel.getUri();
        if (uri == null || (str3 = (String) ORZ.LJLLLLLL(2, s.LJLJJL(uri, new String[]{"/"}, 0, 6))) == null) {
            str3 = "";
        }
        return new XTC(musicId, str3, interfaceC84870XSo, str, str2);
    }
}
