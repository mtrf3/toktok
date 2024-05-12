package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.gamora.editorpro.audio.BeatInfo;
import fjb.a;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.audio.MusicBeatGenerate$saveBeatsToLocal$2", f = "MusicBeatGenerate.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5ho, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142045ho extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ List<BeatInfo> LJLIL;
    public final /* synthetic */ C141945he LJLILLLLZI;
    public final /* synthetic */ AVMusic LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C142045ho(List<BeatInfo> list, C141945he c141945he, AVMusic aVMusic, InterfaceC67352kd<? super C142045ho> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = c141945he;
        this.LJLJI = aVMusic;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C142045ho(this.LJLIL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        if (this.LJLIL.isEmpty()) {
            return C76800UCe.LIZ;
        }
        String beatsJson = GsonProtectorUtils.toJson((Gson) this.LJLILLLLZI.LIZLLL.getValue(), this.LJLIL);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLJI.getMusicId());
        LIZ.append(".json");
        File LJIIZILJ = C62850Ola.LJ().LJIIZILJ(HB7.LIZ, EnumC43650HBe.MUSIC_BEATS, X1D.LIZIZ(LIZ), true);
        try {
            o.LJIIIIZZ(beatsJson, "beatsJson");
            C38485F8n.LLLII(LJIIZILJ, beatsJson);
        } catch (IOException e) {
            C5HV c5hv = C5HV.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("saveBeatsToLocal:writeText error ");
            LIZ2.append(e.getMessage());
            H7C.LIZLLL(c5hv, X1D.LIZIZ(LIZ2), null, null, 12);
        }
        H7C.LJI(3, "music", null, "saveBeatsToLocal:cache Path " + LJIIZILJ.getPath());
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
