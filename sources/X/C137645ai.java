package X;

import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectSpeakerExtra;
import com.ss.android.ugc.gamora.editorpro.tts.TTSFragment;
import fjb.a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editorpro.tts.TTSFragment$fetchVoiceEffectList$1$2", f = "TTSFragment.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5ai, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137645ai extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ TTSFragment LJLIL;
    public final /* synthetic */ List<ReadTextEffectBean> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C137645ai(TTSFragment tTSFragment, List<ReadTextEffectBean> list, InterfaceC67352kd<? super C137645ai> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = tTSFragment;
        this.LJLILLLLZI = list;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C137645ai(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C73305Spp c73305Spp = this.LJLIL.LLFII;
        if (c73305Spp != null) {
            C146035oF.LIZIZ(c73305Spp);
        }
        if (this.LJLILLLLZI.isEmpty()) {
            this.LJLIL.nm();
        } else {
            this.LJLIL.LLFZ.clear();
            this.LJLIL.LLFZ.addAll(this.LJLILLLLZI);
            if (this.LJLIL.LLFZ.isEmpty()) {
                this.LJLIL.nm();
            } else {
                boolean U40 = CommerceToolsMusicService.LIZIZ(false).U40();
                Iterator<ReadTextEffectBean> it = this.LJLIL.LLFZ.iterator();
                o.LJIIIIZZ(it, "mVoiceEffectList.iterator()");
                while (it.hasNext()) {
                    ReadTextEffectBean next = it.next();
                    o.LJIIIIZZ(next, "iterator.next()");
                    ReadTextEffectBean readTextEffectBean = next;
                    ReadTextEffectSpeakerExtra readTextEffectSpeakerExtra = readTextEffectBean.mSpeaker;
                    if (readTextEffectSpeakerExtra.lockEasterEgg == 1) {
                        it.remove();
                    } else {
                        if (U40 && readTextEffectSpeakerExtra.voiceUseCommercial == 1) {
                            it.remove();
                        }
                        if (OUP.LJJIIJZLJL(readTextEffectBean.effect)) {
                            Effect effect = readTextEffectBean.effect;
                            o.LJIIIZ(effect, "<this>");
                            try {
                                String extra = effect.getExtra();
                                if (extra != null && new JSONObject(extra).optBoolean("is_publich_for_voice_clone")) {
                                }
                            } catch (Exception unused) {
                            }
                            it.remove();
                        }
                    }
                }
                C55V c55v = this.LJLIL.LL;
                if (c55v != null) {
                    c55v.LIZ.clear();
                    TTSFragment tTSFragment = this.LJLIL;
                    C55V c55v2 = tTSFragment.LL;
                    if (c55v2 != null) {
                        c55v2.LIZ.addAll(tTSFragment.LLFZ);
                        C55V c55v3 = this.LJLIL.LL;
                        if (c55v3 != null) {
                            if (c55v3.LIZ.isEmpty()) {
                                this.LJLIL.nm();
                                return C76800UCe.LIZ;
                            }
                            this.LJLIL.sm();
                        } else {
                            o.LJIJI("ttsDataCenter");
                            throw null;
                        }
                    } else {
                        o.LJIJI("ttsDataCenter");
                        throw null;
                    }
                } else {
                    o.LJIJI("ttsDataCenter");
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
