package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;

/* renamed from: X.afD, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94327afD implements InterfaceC57326Meg {
    @Override // X.InterfaceC57326Meg
    public final <T> T create(Class<T> cls) {
        C65087PgZ LIZ = RetrofitFactory.LIZLLL().LIZ("https://api.music.apple.com");
        LIZ.LIZJ = true;
        return (T) LIZ.LJFF().LIZ.LIZ(cls);
    }
}
