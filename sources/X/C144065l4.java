package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.creative.model.video2sticker.Video2StickerModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5l4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C144065l4 {
    public final Activity LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final java.util.Map<Integer, String> LIZJ;
    public final List<TextStickerModel> LIZLLL;
    public final C62822Ol8 LJ;
    public final C62822Ol8 LJFF;

    public final OSZ<Integer, Integer> LIZ() {
        return (OSZ) this.LJFF.getValue();
    }

    public final Video2StickerModel LIZIZ() {
        return (Video2StickerModel) this.LJ.getValue();
    }

    public C144065l4(Activity activity, VideoPublishEditModel model, java.util.Map<Integer, String> textStickerPath, List<TextStickerModel> textStickers) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(model, "model");
        o.LJIIIZ(textStickerPath, "textStickerPath");
        o.LJIIIZ(textStickers, "textStickers");
        this.LIZ = activity;
        this.LIZIZ = model;
        this.LIZJ = textStickerPath;
        this.LIZLLL = textStickers;
        this.LJ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 648));
        this.LJFF = C221108m2.LIZIZ(new AqS152S0100000_2(this, 647));
    }
}
