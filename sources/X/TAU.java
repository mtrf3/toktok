package X;

import android.view.View;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TAU extends C73365Sqn<Effect> {
    public final TEZ LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TAU(View itemView, TDE stickerImageView, TEZ stickerDataManager) {
        super(itemView);
        o.LJIIIZ(itemView, "itemView");
        o.LJIIIZ(stickerImageView, "stickerImageView");
        o.LJIIIZ(stickerDataManager, "stickerDataManager");
        this.LJLJJL = stickerDataManager;
    }
}
