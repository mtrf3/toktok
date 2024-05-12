package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.edit.audio.enhance.AudioEnhanceParam;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.restore.DraftAlgorithmModelRestoreHandler$isResValid$2", f = "DraftAlgorithmModelRestoreHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.6k2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C168906k2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public final /* synthetic */ C168956k7 LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C168906k2(C168956k7 c168956k7, InterfaceC67352kd<? super C168906k2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c168956k7;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C168906k2(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<StickerItemModel> list;
        C141335gf.LIZJ(obj);
        if (((AwemeDraft) this.LJLIL.LIZ.LIZLLL).LJJJJI.autoEnhanceOn && !C44384HbQ.LJLJLJ("lens_hdr")) {
            ((ArrayList) this.LJLIL.LJ).add("lens_hdr");
        }
        AudioEnhanceParam audioEnhanceParam = ((AwemeDraft) this.LJLIL.LIZ.LIZLLL).LJJJJI.audioEnhanceParam;
        boolean z = false;
        if (audioEnhanceParam != null && C78685UuP.LJJIFFI(audioEnhanceParam) && !C44384HbQ.LJLJLJ("unet_denoise_44k_music_model_v1.0")) {
            this.LJLIL.LJI.getFirst().add("requirement_ftgru");
            this.LJLIL.LJI.getSecond().put("requirement_ftgru", C47261Igj.LJII("unet_denoise_44k_music_model_v1.0"));
        }
        InfoStickerModel LJI = ((AwemeDraft) this.LJLIL.LIZ.LIZLLL).LJI();
        if (LJI != null && (list = LJI.stickers) != null && !list.isEmpty()) {
            Iterator<StickerItemModel> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                StickerItemModel next = it.next();
                String str = next.pinAlgorithmFile;
                if (str != null && str.length() != 0) {
                    if (next != null && (!C44384HbQ.LJLJLJ("objectTracking"))) {
                        ((ArrayList) this.LJLIL.LJFF).add("objectTracking");
                    }
                }
            }
        }
        if (((AwemeDraft) this.LJLIL.LIZ.LIZLLL).LJJJJI.editMusicSyncMode && C45771Hxn.LIZIZ && !C44384HbQ.LJLJLJ("VideoMontage")) {
            ((ArrayList) this.LJLIL.LJFF).add("VideoMontage");
        }
        if (((ArrayList) this.LJLIL.LJ).isEmpty() && ((ArrayList) this.LJLIL.LJFF).isEmpty() && this.LJLIL.LJI.getFirst().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
