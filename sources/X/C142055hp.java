package X;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.gamora.editorpro.audio.BeatInfo;
import defpackage.a1;
import fjb.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.audio.MusicBeatGenerate$getBeatsFromLocalCache$2", f = "MusicBeatGenerate.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5hp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142055hp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super List<? extends BeatInfo>>, Object> {
    public final /* synthetic */ AVMusic LJLIL;
    public final /* synthetic */ C141945he LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C142055hp(AVMusic aVMusic, C141945he c141945he, InterfaceC67352kd<? super C142055hp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = aVMusic;
        this.LJLILLLLZI = c141945he;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C142055hp(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL.getMusicId());
        LIZ.append(".json");
        String LIZIZ = C43073GvN.LIZIZ(C62850Ola.LJ(), HB7.LIZ, EnumC43650HBe.MUSIC_BEATS, X1D.LIZIZ(LIZ), 8);
        if (!F9B.LIZ(LIZIZ)) {
            H7C.LJI(3, "music", null, a1.LJ("getBeatsFromLocalCache fail: cache file", LIZIZ, " is not exist"));
            return C61878OQg.INSTANCE;
        }
        Collection collection = C61878OQg.INSTANCE;
        try {
            collection = (List) ((Gson) this.LJLILLLLZI.LIZLLL.getValue()).LJII(F9B.LIZIZ(LIZIZ), new TypeToken<ArrayList<BeatInfo>>() { // from class: X.5hq
            }.getType());
        } catch (Exception e) {
            C5HV c5hv = C5HV.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            H7C.LIZLLL(c5hv, KMP.LJFF(LIZ2, "getBeatsFromLocalCache:error  ", e, LIZ2), null, null, 12);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("getBeatsFromLocalCache: cache Path: ");
        LIZ3.append(LIZIZ);
        H7C.LJI(3, "music", null, X1D.LIZIZ(LIZ3));
        if (collection == null) {
            return C61878OQg.INSTANCE;
        }
        return collection;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super List<? extends BeatInfo>> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
