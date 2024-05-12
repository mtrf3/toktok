package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5Hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C132445Hs {
    public final VideoPublishEditModel LIZ;
    public long LIZIZ;
    public final List<EnumC123864ta> LIZJ;
    public final List<String> LIZLLL;
    public final List<String> LJ;
    public final VecString LJFF;

    public C132445Hs(VideoPublishEditModel model) {
        o.LJIIIZ(model, "model");
        this.LIZ = model;
        this.LIZJ = C47261Igj.LJJIJIIJI(EnumC123864ta.AUDIO, EnumC123864ta.VIDEO, EnumC123864ta.STICKER, EnumC123864ta.EFFECT, EnumC123864ta.FILTER);
        this.LIZLLL = C47261Igj.LJJIJIIJI("bgm", "dub", "text_read", "normal_effect", "sound_effect");
        String NLEFilterName_getAUDIO_COMMON_FILTER = NLEEditorJniJNI.NLEFilterName_getAUDIO_COMMON_FILTER();
        o.LJIIIIZZ(NLEFilterName_getAUDIO_COMMON_FILTER, "getAUDIO_COMMON_FILTER()");
        this.LJ = C47261Igj.LJJIJ(NLEFilterName_getAUDIO_COMMON_FILTER);
        this.LJFF = new VecString(new String[]{"biz_extra_type", "biz_data", "biz_res_id", "biz_inline_text_style"});
    }
}
