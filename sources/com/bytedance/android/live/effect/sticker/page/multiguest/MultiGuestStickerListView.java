package com.bytedance.android.live.effect.sticker.page.multiguest;

import X.C0TY;
import X.C16880lQ;
import X.C32031Nn;
import X.C41191jX;
import X.C48971w5;
import X.C76104Tts;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class MultiGuestStickerListView extends BaseMultiGuestStickerView {
    public static final /* synthetic */ int LJZ = 0;
    public final RecyclerView LJLLJ;
    public final View LJLLL;
    public final View LJLLLL;
    public final C48971w5 LJLLLLLL;
    public final C76104Tts LJLZ;

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final String LIZLLL() {
        return "shortcut";
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        }
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final View LIZJ() {
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.d31, C16880lQ.LLZIL(this.LJLIL.getContext()), null);
        o.LJIIIIZZ(LLLZIIL, "from(fragment.context)\n …ticker_dialog_page, null)");
        return LLLZIIL;
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final void LJI() {
        C76104Tts c76104Tts = this.LJLZ;
        if (c76104Tts != null) {
            c76104Tts.LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final void LJII() {
        C76104Tts c76104Tts;
        if (!BaseMultiGuestStickerView.LJLLILLLL && (c76104Tts = this.LJLZ) != null) {
            c76104Tts.LIZJ(true);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        this.LJLLLLLL.LLJI();
        C76104Tts c76104Tts = this.LJLZ;
        if (c76104Tts != null) {
            c76104Tts.LIZJ(true);
        }
        this.LJLJL = this.LJLJL;
        C41191jX c41191jX = this.LJLL;
        String STICKER_INTERACT = C0TY.LIZJ;
        o.LJIIIIZZ(STICKER_INTERACT, "STICKER_INTERACT");
        c41191jX.LIZJ(STICKER_INTERACT);
        this.LJLL.LJ(this.LJLJJI);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        this.LJLLLLLL.LLJ();
        C76104Tts c76104Tts = this.LJLZ;
        if (c76104Tts != null) {
            c76104Tts.LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.effect.sticker.page.multiguest.BaseMultiGuestStickerView
    public final void onDestroy() {
        super.onDestroy();
        C32031Nn.LIZJ = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiGuestStickerListView(androidx.fragment.app.Fragment r17, android.view.ViewGroup r18, int r19, com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager r20, X.C0WF r21, X.C11070c3 r22) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.sticker.page.multiguest.MultiGuestStickerListView.<init>(androidx.fragment.app.Fragment, android.view.ViewGroup, int, com.ss.ttlivestreamer.livestreamv2.filter.IFilterManager, X.0WF, X.0c3):void");
    }
}
