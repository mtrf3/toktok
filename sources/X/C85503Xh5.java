package X;

import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditActivity;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditItem;
import com.ss.android.ugc.playerkit.videoview.VideoViewComponent;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Xh5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85503Xh5 extends C0A6 {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public final /* synthetic */ CreatorCaptionEditActivity LJLJI;

    public C85503Xh5(CreatorCaptionEditActivity creatorCaptionEditActivity) {
        this.LJLJI = creatorCaptionEditActivity;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        int i2;
        List<CreatorCaptionEditData> transSubtitleItem;
        CreatorCaptionEditData creatorCaptionEditData;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (!((Boolean) this.LJLJI.LLII().LJLJI.getValue()).booleanValue()) {
            if (i != 0) {
                if (i != 1) {
                    return;
                }
                if (this.LJLJI.LLILIL().LJFF()) {
                    this.LJLIL = true;
                }
                this.LJLJI.LLIIJI().removeCallbacksAndMessages(null);
                this.LJLJI.LLILIL().pause();
                this.LJLILLLLZI = true;
                ((Handler) this.LJLJI.LJZL.getValue()).post((RunnableC85501Xh3) this.LJLJI.LLD.getValue());
                return;
            }
            if (!this.LJLILLLLZI) {
                return;
            }
            this.LJLILLLLZI = false;
            ((Handler) this.LJLJI.LJZL.getValue()).removeCallbacksAndMessages(null);
            CreatorCaptionEditActivity creatorCaptionEditActivity = this.LJLJI;
            C85511XhD c85511XhD = creatorCaptionEditActivity.LJLILLLLZI;
            if (c85511XhD != null) {
                int i3 = c85511XhD.LJLJJI;
                if (i3 != -1) {
                    CreatorCaptionEditActivity.HighLightLayoutManager highLightLayoutManager = creatorCaptionEditActivity.LJLIL;
                    if (highLightLayoutManager != null) {
                        highLightLayoutManager.LLIIII(recyclerView, new C0AC(), i3);
                        VideoViewComponent LLILIL = this.LJLJI.LLILIL();
                        C85511XhD c85511XhD2 = this.LJLJI.LJLILLLLZI;
                        if (c85511XhD2 != null) {
                            CreatorCaptionEditItem creatorCaptionEditItem = c85511XhD2.LJLIL.LJLJJLL;
                            if (creatorCaptionEditItem != null && (transSubtitleItem = creatorCaptionEditItem.getTransSubtitleItem()) != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(transSubtitleItem, i3)) != null) {
                                i2 = creatorCaptionEditData.getStartTime();
                            } else {
                                i2 = 0;
                            }
                            LLILIL.LJIIJ((i2 * 100.0f) / ((float) this.LJLJI.LLILIL().LJ()));
                        } else {
                            o.LJIJI("creatorCaptionEditAdapter");
                            throw null;
                        }
                    } else {
                        o.LJIJI("highLightLayoutManager");
                        throw null;
                    }
                }
                if (this.LJLIL) {
                    this.LJLIL = false;
                    this.LJLJI.LLILIL().resume();
                }
                this.LJLJI.LLIIJI().post((RunnableC85504Xh6) this.LJLJI.LLF.getValue());
                return;
            }
            o.LJIJI("creatorCaptionEditAdapter");
            throw null;
        }
    }
}
