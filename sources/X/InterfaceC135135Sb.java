package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* renamed from: X.5Sb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC135135Sb {
    List<TextStickerData> LJZL();

    void LL();

    EnumC123864ta LLD();

    void LLF(VideoPublishEditModel videoPublishEditModel, NLEModel nLEModel, List<TextStickerData> list, int i);

    void LLFF(NLEEditor nLEEditor);

    boolean LLFFF();

    boolean LLFII();

    void LLFZ(InterfaceC88472Yns<? super StickerItemModel, C76800UCe> interfaceC88472Yns);

    boolean LLI();

    void LLIFFJFJJ(InterfaceC88472Yns<? super TextStickerData, C76800UCe> interfaceC88472Yns);

    void LLII(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel);

    void LLIIII(InterfaceC88472Yns<? super List<? extends EffectPointModel>, C76800UCe> interfaceC88472Yns);

    void LLIIIILZ(int i, VideoPublishEditModel videoPublishEditModel);
}
