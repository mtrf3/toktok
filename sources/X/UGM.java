package X;

import android.graphics.Bitmap;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.EditImageForSubMethod;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UGM extends AbstractC38911fr {
    public final EditImageForSubMethod.Result LJLILLLLZI = new EditImageForSubMethod.Result();
    public final /* synthetic */ EditImageForSubMethod LJLJI;

    @Override // X.AbstractC38911fr
    public final void LJJIII() {
        this.LJLILLLLZI.editStatus = 1;
        this.LJLJI.LJJI(this.LJLILLLLZI, null, null);
    }

    @Override // X.AbstractC38911fr
    public final void LJJIIJZLJL() {
        this.LJLILLLLZI.editStatus = 2;
        this.LJLJI.LJJI(this.LJLILLLLZI, null, null);
    }

    public UGM(EditImageForSubMethod editImageForSubMethod) {
        this.LJLJI = editImageForSubMethod;
    }

    @Override // X.AbstractC38911fr
    public final void LJJIIZ(C76881UFh emoteEditFinishParams) {
        Integer num;
        o.LJIIIZ(emoteEditFinishParams, "emoteEditFinishParams");
        this.LJLILLLLZI.editStatus = 0;
        EditImageForSubMethod editImageForSubMethod = this.LJLJI;
        EditImageForSubMethod.Result result = this.LJLILLLLZI;
        Bitmap bitmap = emoteEditFinishParams.LIZIZ;
        LiveSubMediaModel liveSubMediaModel = emoteEditFinishParams.LIZ;
        if (liveSubMediaModel != null) {
            num = Integer.valueOf(liveSubMediaModel.getWithTextSticker());
        } else {
            num = null;
        }
        editImageForSubMethod.LJJI(result, bitmap, num);
    }
}
